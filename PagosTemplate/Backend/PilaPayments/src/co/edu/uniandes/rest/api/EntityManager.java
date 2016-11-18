package co.edu.uniandes.rest.api;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

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
	 * @return entidades
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getEntities(){
		ObjectMapper mapper = new ObjectMapper();
		logger.debug("Start getEntities");
		String response = "";
		try {
			response = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(getEntityLogic().getEntities());
		} catch (JsonProcessingException e) {
			response = "No se pudo obtener la lista " + e.getMessage();
		}
		logger.	debug("end getEntities:" + response);
		return response;
	}
	
	//Consulta por Id de entidad
	@GET
	@Path("/entity")
	@Produces(MediaType.APPLICATION_JSON)
	public String getEntity(@QueryParam("id") String id) {

		logger.debug("Start getEntity");
		logger.debug("id: '" + id + "'");
		
		ObjectMapper mapper = new ObjectMapper();
		String response = "";
	
		try{
		response = mapper.writerWithDefaultPrettyPrinter()
				.writeValueAsString(getEntityLogic().getEntitiesById(Long.valueOf(id)));
		}
		catch(Exception ex){
			response = "No se pudo encontrar el registro. \n" + ex.getMessage();
		}
		
		logger.debug("result: '"+ response +"'");
        logger.debug("End getEntityManager");

        return response;	
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response postEntity(String theEntity) throws JsonParseException, JsonMappingException, IOException  {

		logger.debug("Start postEntity");
		
		logger.debug("Object " + theEntity.toString());
		
		final ObjectNode node = new ObjectMapper().readValue(theEntity.toString(), ObjectNode.class);
		
		logger.debug("Object1 " + node.get("cedula").asInt());
		logger.debug("Object2 " + node.get("nombre").asText());
		logger.debug("Object3 " + node.get("apellido").asText());
		logger.debug("Object4 " + node.get("salario").asDouble());
		logger.debug("Object5 " + node.get("tipoPension").asText());
		
		logger.debug("Object6 " + node.get("tipoPensionado").asText());
		//logger.debug("Object7 " + ActividadEconomica.valueOf(node.get("profession").asText()));
		logger.debug("Object8 " + Long.valueOf(node.get("pais").asText()));
		logger.debug("Object9 " + Long.valueOf(node.get("paisGrupoFamiliar").asText()));
		//logger.debug("Object10 " + Long.valueOf(node.get("superEntityId").asText()));
		
		PilaEntityTO entityTO = new PilaEntityTO();
		
		Pais pais = new Pais();
		
		entityTO.setCedula(node.get("cedula").asInt());
		entityTO.setNombre(node.get("nombre").asText());
		entityTO.setApellido(node.get("apellido").asText());
		entityTO.setSalario(node.get("salario").asDouble());
		entityTO.setTipoPension(TipoPension.getEnumbyDesc(node.get("tipoPension").asText()));
		entityTO.setTipoPensionado(TipoPensionado.getEnumbyDesc(node.get("tipoPensionado").asText()));
		entityTO.setActividad(ActividadEconomica.getActividadByCIIU(node.get("actividad").asText()));
		entityTO.setPais(Long.valueOf(node.get("pais").asText()));
		entityTO.setPaisGrupoFamiliar(Long.valueOf(node.get("paisGrupoFamiliar").asText()));
		//entityTO.setSuperEntidad(Long.valueOf(node.get("superEntityId").asText())); //Error super entity id referecia circular
		
		
		

		String id = getEntityLogic().crearEntity(entityTO); // Debe retornar el id creado la entidad

		String response = "{\"id\":\""+ id +"\"}";
		
		logger.debug("result: '" + response + "'");
        logger.debug("End postEntity");

        return Response.status(200).entity(response).build();
	}

	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	public String putEntity(Object theEntity) {
		logger.debug("Start putEntity");
		

		String response = null;

		logger.debug("result: '"+response+"'");
        logger.debug("End putEntity");

        return response;	
	}

	@DELETE
	public Response deleteEntity(Object theEntity) throws JsonParseException, JsonMappingException, IOException {
		
		logger.debug("Start deleteEntity");
		
		final ObjectNode node = new ObjectMapper().readValue(theEntity.toString(), ObjectNode.class);
		
		PilaEntityTO entityTO = mapObjectEntity2PilaEntityTO(theEntity);

		String id = getEntityLogic().borrarEntity(entityTO); // Debe retornar el id creado la entidad

		String response = "{\"id\":\""+ id +"\"}";
		
		logger.debug("result: '" + response + "'");
        logger.debug("End deleteEntity");

        return Response.status(200).entity(response).build();
	}
	
	/**
	 * 
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
	 * 
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
	 * 
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
	 * @return
	 */
	public EntityLogic getEntityLogic() {
		if(logic == null){
			logic = new EntityLogic(new EntityDAOImpl(), new SuperEntityDAOImpl(), new PaisDAOImpl());					
		}
		return logic;
	}
	
	private PilaEntityTO mapObjectEntity2PilaEntityTO(Object theEntity) throws JsonParseException, JsonMappingException, IOException {
		
		final ObjectNode node = new ObjectMapper().readValue(theEntity.toString(), ObjectNode.class);
		
		PilaEntityTO entityTO = new PilaEntityTO();
		
		entityTO.setCedula(node.get("cedula").asInt());
		entityTO.setNombre(node.get("firstName").asText());
		entityTO.setApellido(node.get("lastName").asText());
		entityTO.setSalario(node.get("salary").asDouble());
		entityTO.setTipoPension(TipoPension.valueOf(node.get("pensionType").asText()));
		entityTO.setTipoPensionado(TipoPensionado.valueOf(node.get("pensionerType").asText()));
		entityTO.setActividad(ActividadEconomica.valueOf(node.get("profession").asText()));
		entityTO.setPais(Long.valueOf(node.get("residense").asText()));
		entityTO.setPaisGrupoFamiliar(Long.valueOf(node.get("familiyResidence").asText()));
		entityTO.setSuperEntidad(Long.valueOf(node.get("superEntityId").asText()));
		
		return entityTO;
	}
}
