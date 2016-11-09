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
import co.edu.uniandes.dao.SuperEntityDAOImpl;
import co.edu.uniandes.dao.SuperEntityUserDAOImpl;
import co.edu.uniandes.staticmodel.ActividadEconomica;
import co.edu.uniandes.staticmodel.TipoPension;
import co.edu.uniandes.staticmodel.TipoPensionado;

import com.fasterxml.jackson.databind.ObjectMapper;


@Path("/entities")
public class EntityManager {

	private static final Logger logger = LogManager.getLogger(EntityManager.class);
	
	private EntityLogic logic;
	
	public String getEntities(){
		ObjectMapper mapper = new ObjectMapper();
		String response = "";
		try {
			response = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(getEntityLogic().getEntities());
		} catch (JsonProcessingException e) {
			response = "No se pudo obtener la lista " + e.getMessage();
		}
		return response;
	}
	
	//Consulta por Cedula o por Id de entidad
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getEntity(@QueryParam("id") String id, @QueryParam("legalId") String legalId) {

		logger.debug("Start getEntity");
		logger.debug("id: '" + id + "'");

		ObjectMapper mapper = new ObjectMapper();
		
		String response = null;

		response = "{" + "\"" + "id\":" + "1," +
					"\"" + "cedula\":" + "79120111," +
					"\"" + "firstName\":" + "\"Pedro\"," +
					"\"" + "lastName\":" + "\"Perez\"," +
					"\"" + "pensionType\":" + "\"Vejez\"," +
					"\"" + "pensionerType\":" + "\"Prima Media\"," +
					"\"" + "residence\":" + "\"Colombia\"," +
					"\"" + "familyResidence\":" + "\"Colombia\"," +
					"\"" + "profession\":" + "\"Congreista\"," +
					"\"" + "salary\":" + "27000000" +
					"}";
        
		logger.debug("result: '"+response+"'");
        logger.debug("End getEntityManager");

        return response;	
	}

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response postEntity(Object theEntity) throws JsonParseException, JsonMappingException, IOException  {

		logger.debug("Start postEntity");
		
		logger.debug("Object " + theEntity.toString());
		
		final ObjectNode node = new ObjectMapper().readValue(theEntity.toString(), ObjectNode.class);
		
		PilaEntityTO entityTO = new PilaEntityTO();
		
		entityTO.setCedula(node.get("cedula").asInt());
		entityTO.setNombre(node.get("firstName").asText());
		entityTO.setApellido(node.get("lastName").asText());
		entityTO.setSalario(node.get("salary").asDouble());
		entityTO.setTipoPension(TipoPension.valueOf(node.get("pensionType").asText()));
		entityTO.setTipoPensionado(TipoPensionado.valueOf(node.get("pensionerType").asText()));
		entityTO.setActividad(ActividadEconomica.valueOf(node.get("profession").asText()));
		

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
	public void deleteEntity(Object theSuperEntity) {
		
		logger.debug("Start deleteEntity");
	}
	
	/**
	 * metodo auxiliar para obtener la logica del entity
	 * @return
	 */
	public EntityLogic getEntityLogic() {
		if(logic == null){
			logic = new EntityLogic(new EntityDAOImpl());					
		}
		return logic;
	}
}
