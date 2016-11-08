package co.edu.uniandes.rest.api;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
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

import co.edu.uniandes.businesslogic.SuperEntityLogic;
import co.edu.uniandes.dao.SuperEntityDAOImpl;
import co.edu.uniandes.dao.SuperEntityUserDAOImpl;
import co.edu.uniandes.to.PilaSuperEntityTO;

/**
 * Clase para la definicion de WS de la super entidad
 * @author gabriel zapata
 */
@Path("/superentities")
public class SuperEntityManager {

	private static final Logger logger = LogManager.getLogger(SuperEntityManager.class);
	
	/**
	 * logica de la super entidad
	 */
	private SuperEntityLogic logic;
	
	/**
	 * Retorna los super entities definidos en el
	 * @return super entidades
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getSuperEntities() {
		ObjectMapper mapper = new ObjectMapper();
		String response = "";
		try {
			response = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(getSuperEntityLogic().getSuperEntities());
		} catch (JsonProcessingException e) {
			response = "No se pudo obtener la lista " + e.getMessage();
		}
		return response;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@GET
	@Path("/entity")
	@Produces(MediaType.APPLICATION_JSON)
	public String getSuperEntity(@QueryParam("id") String id) {

		logger.debug("Start getSuperEntity");
		logger.debug("data: '" + id + "'");
		
		String response = null;

		response = 	"{" +
					"\"" + "results\":[" + 
					"{" + 
					"\"" + "id\":" + "1234567," + 
					"\"" + "name\":" + "\"Oracle\"," + 
					"\"" + "nit\":" + "\"800741345\"," + 
					"\"ciiuCode\":" + "\"8080\"," + 
					"\"econActivity\":" + "\"Software\"" + 
					"}," + 
					"{" + 
					"\"" + "id\":" + "90890998," + 
					"\"" + "name\":" + "\"Universidad de los Andes\"," + 
					"\"" + "nit\":" + "\"800741345\"," + 
					"\"ciiuCode\":" + "\"8080\"," + 
					"\"econActivity\":" + "\"Educacion\"" + 
					"}]}";
		
		logger.debug("result: '"+response+"'");
        logger.debug("End getSuperEntity");

        return response;	
	}
	
	/**
	 * WS para la creacion de un super entity
	 * @param theSuperEntity super entity a crear
	 * @return retorna el id de la entidad
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonParseException 
	 */
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response postSuperEntity(String theSuperEntity) throws JsonParseException, JsonMappingException, IOException {

		logger.debug("Start postSuperEntity");
		
		logger.debug("Object " + theSuperEntity.toString());
		
		final ObjectNode node = new ObjectMapper().readValue(theSuperEntity.toString(), ObjectNode.class);

		PilaSuperEntityTO superTO = new PilaSuperEntityTO();
		
		superTO.setNIT(node.get("nit").asText());
		superTO.setNombre(node.get("name").asText());
		superTO.setCIU(node.get("ciiuCode").asText());
		
		String id = getSuperEntityLogic().createSuperEntity(superTO);
		
		String response = "{\"id\":\""+ id +"\"}"; 

		logger.debug("result: '"+response+"'");
        logger.debug("End postSuperEntity");

        return Response.status(200).entity(response).build();
	}

	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	public String putSuperEntity(Object theSuperEntity) {
		logger.debug("Start putSuperEntity");
	
		JSONObject jsonObject = new JSONObject(theSuperEntity);
		PilaSuperEntityTO superTO = new PilaSuperEntityTO();
		
		if(!jsonObject.getString("nit").isEmpty()) {
			superTO.setNIT(jsonObject.getString("nit"));
		}
		
		if(!jsonObject.getString("name").isEmpty()) {
			superTO.setNombre(jsonObject.getString("name"));
		}
		
		if(!jsonObject.getString("ciiuCode").isEmpty()) {
			superTO.setCIU(jsonObject.getString("ciiuCode"));
		}
		
		String response = getSuperEntityLogic().createSuperEntity(superTO);

		logger.debug("result: '"+response+"'");
        logger.debug("End putSuperEntity");

        return response;	
	}

	@DELETE
	public void deleteSuperEntity(Object theSuperEntity) {
		
		logger.debug("Start deleteSuperEntity");
	}
	
	/**
	 * metodo auxiliar para obtener la logica del super entity
	 * @return
	 */
	public SuperEntityLogic getSuperEntityLogic() {
		if(logic == null){
			logic = new SuperEntityLogic(new SuperEntityDAOImpl(), new SuperEntityUserDAOImpl());					
		}
		return logic;
	}
}
