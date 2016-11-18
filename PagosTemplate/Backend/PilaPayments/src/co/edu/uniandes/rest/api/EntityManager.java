package co.edu.uniandes.rest.api;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.FormParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.JSONPObject;

import co.edu.uniandes.to.PilaEntityTO;
import co.edu.uniandes.businesslogic.EntityLogic;
import co.edu.uniandes.businesslogic.SuperEntityLogic;
import co.edu.uniandes.dao.EntityDAOImpl;
import co.edu.uniandes.dao.PaisDAOImpl;
import co.edu.uniandes.dao.SuperEntityDAOImpl;
import co.edu.uniandes.dao.SuperEntityUserDAOImpl;
import co.edu.uniandes.entity.Pais;
import co.edu.uniandes.staticmodel.ActividadEconomica;
import co.edu.uniandes.staticmodel.TipoPension;
import co.edu.uniandes.staticmodel.TipoPensionado;

import com.fasterxml.jackson.databind.ObjectMapper;


@Path("/entities")
public class EntityManager {

    private static final Logger logger = LogManager.getLogger(EntityManager.class);

    private EntityLogic logic;

    /**
     * Retorna los entities definidos en el
     *
     * @return entidades
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String listAll() {
        ObjectMapper mapper = new ObjectMapper();
        logger.debug("Start getEntities");
        String response = "";
        try {
            response = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(getEntityLogic().getEntities());
        } catch (JsonProcessingException e) {
            response = "No se pudo obtener la lista " + e.getMessage();
        }
        logger.debug("end getEntities:" + response);
        return response;
    }

    //Consulta por Id de entidad
    @GET
    @Path("/entity")
    @Produces(MediaType.APPLICATION_JSON)
    public String find(@QueryParam("id") String id) {
        logger.debug("Start find");
        logger.debug("id: '" + id + "'");
        ObjectMapper mapper = new ObjectMapper();
        String response = "";
        try {
            response = mapper.writerWithDefaultPrettyPrinter()
                    .writeValueAsString(getEntityLogic().getEntitiesById(Long.valueOf(id)));
        } catch (Exception ex) {
            response = "No se pudo encontrar el registro. \n" + ex.getMessage();
        }
        logger.debug("result: '" + response + "'");
        return response;
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(String theEntity) throws JsonParseException, JsonMappingException, IOException {
        PilaEntityTO entityTO = this.mapObjectEntity2PilaEntityTO(theEntity);
        String id = getEntityLogic().crearEntity(entityTO);
        String response = "{\"id\":\"" + id + "\"}";
        logger.debug("result: '" + response + "'");
        return Response.status(200).entity(response).build();
    }

    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    public String update(Object theEntity) {
        logger.debug("Start putEntity");

        //String id = getEntityLogic().crearEntity(entityTO);

        String response = null;
        logger.debug("result: '" + response + "'");
        logger.debug("End putEntity");
        return response;
    }

    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") Long id) throws JsonParseException, JsonMappingException, IOException {
        logger.debug("Start delete");
        String idDeleted = getEntityLogic().delete(id); 
        String response = "{\"id\":\"" + idDeleted + "\"}";
        logger.debug("result: '" + response + "'");
        return Response.status(200).entity(response).build();
    }

    /**
     * @return
     */
    @GET
    @Path("/eactivities")
    @Produces(MediaType.APPLICATION_JSON)
    public String getEconomicActivities() {

        ObjectMapper mapper = new ObjectMapper();
        String response = "";
        try {
            response = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(getEntityLogic().getEconActivities());
        } catch (JsonProcessingException e) {
            response = "No se pudo obtener la lista.\n" + e.getMessage();
        }
        return response;
    }

    /**
     * @return
     */
    @GET
    @Path("/epensions")
    @Produces(MediaType.APPLICATION_JSON)
    public String getPensionTypes() {
        logger.debug("Entrando REST GET /epensions");
        ObjectMapper mapper = new ObjectMapper();
        String response = "";
        try {
            response = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(getEntityLogic().getTiposPension());
        } catch (JsonProcessingException e) {
            response = "No se pudo obtener la lista.\n" + e.getMessage();
        }
        logger.debug("resultLOV Tipo Pension: '" + response + "'");
        return response;
    }

    /**
     * @return
     */
    @GET
    @Path("/epensioners")
    @Produces(MediaType.APPLICATION_JSON)
    public String getPensionerTypes() {

        ObjectMapper mapper = new ObjectMapper();
        String response = "";
        try {
            response = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(getEntityLogic().getTiposPensionado());
        } catch (JsonProcessingException e) {
            response = "No se pudo obtener la lista " + e.getMessage();
        }
        return response;
    }

    /**
     * metodo auxiliar para obtener la logica del entity
     *
     * @return
     */
    public EntityLogic getEntityLogic() {
        if (logic == null) {
            logic = new EntityLogic(new EntityDAOImpl(), new SuperEntityDAOImpl(), new PaisDAOImpl());
        }
        return logic;
    }

    private PilaEntityTO mapObjectEntity2PilaEntityTO(Object theEntity) throws JsonParseException, JsonMappingException, IOException {
        final ObjectNode node = new ObjectMapper().readValue(theEntity.toString(), ObjectNode.class);
        logger.debug("Object " + node.asText());
        PilaEntityTO entityTO = new PilaEntityTO();
        entityTO.setCedula(node.get("cedula").asInt());
        entityTO.setNombre(node.get("nombre").asText());
        entityTO.setApellido(node.get("apellido").asText());
        entityTO.setSalario(node.get("salario").asDouble());
        entityTO.setTipoPension(TipoPension.getEnumbyDesc(node.get("tipoPension").asText()));
        entityTO.setTipoPensionado(TipoPensionado.getEnumbyDesc(node.get("tipoPensionado").asText()));
        entityTO.setActividad(ActividadEconomica.getActividadByCIIU(node.get("actividad").asText()));
        entityTO.setPais(Long.valueOf(node.get("pais").asText()));
        entityTO.setPaisGrupoFamiliar(Long.valueOf(node.get("paisGrupoFamiliar").asText()));
        return entityTO;
    }
}
