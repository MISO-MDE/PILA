package co.edu.uniandes.rest.api;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import co.edu.uniandes.businesslogic.EntityLogic;
import co.edu.uniandes.dao.EntityDAOImpl;
import co.edu.uniandes.dao.SuperEntityDAOImpl;
import co.edu.uniandes.dao.TipoPensionDAOImpl;
import co.edu.uniandes.dao.TipoPensionadoDAOImpl;
import co.edu.uniandes.to.EntityTO;


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
            response = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(getEntityLogic().findAll());
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
                    .writeValueAsString(getEntityLogic().find(Long.valueOf(id)));
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
        EntityTO entityTO = this.mapObjectEntity2PilaEntityTO(theEntity);
        String id = getEntityLogic().create(entityTO);
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
     * metodo auxiliar para obtener la logica del entity
     *
     * @return
     */
    public EntityLogic getEntityLogic() {
        if (logic == null) {
            logic = new EntityLogic(new EntityDAOImpl(), new SuperEntityDAOImpl(), new TipoPensionDAOImpl(), new TipoPensionadoDAOImpl());
        }
        return logic;
    }

    private EntityTO mapObjectEntity2PilaEntityTO(Object theEntity) throws JsonParseException, JsonMappingException, IOException {
        final ObjectNode node = new ObjectMapper().readValue(theEntity.toString(), ObjectNode.class);
        logger.debug("Object " + node.asText());
        EntityTO entityTO = new EntityTO();
        entityTO.setCedula(node.get("cedula").asInt());
        entityTO.setNombre(node.get("nombre").asText());
        entityTO.setApellido(node.get("apellido").asText());
        entityTO.setSalario(node.get("salario").asDouble());
        entityTO.setTipoPension(node.get("tipoPension").asLong());
        entityTO.setTipoPensionado(node.get("tipoPensionado").asLong());
        entityTO.setActividad(node.get("actividad").asLong());
        entityTO.setPais(Long.valueOf(node.get("pais").asText()));
        entityTO.setPaisGrupoFamiliar(Long.valueOf(node.get("paisGrupoFamiliar").asText()));
        entityTO.setProfesion(node.get("profesion").asText());
        return entityTO;
    }
}
