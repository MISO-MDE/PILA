package co.edu.uniandes.rest.api;

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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.edu.uniandes.businesslogic.EventLogic;
import co.edu.uniandes.dao.EntityDAOImpl;
import co.edu.uniandes.dao.NovedadDAOImpl;

@Path("/event")
public class EventManager {

	private static final Logger logger = LogManager.getLogger(EventManager.class);
	
	/**
	 * logica de negocio de novedades
	 */
	private EventLogic logic;
	
	/**
	 * Retorna las novedades asociadas con una entidad
	 * @param cedula cedula a buscar
	 * @return
	 */
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getEvent(@PathParam("id") String cedula) {

		ObjectMapper mapper = new ObjectMapper();
		String response = "";
		try {
			response = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(logic.getEventsByCedula(cedula));
		} catch (JsonProcessingException e) {
			response = "No se pudo obtener la lista " + e.getMessage();
		}
		return response;
//		response = "{"
//					 +" \"results\": ["
//					 +"   {"
//					 +"     \"id\": 155,"
//					 +"     \"type\": \"SLN\","
//					 +"     \"fromDate\": \"10/10/16\","
//					 +"     \"toDate\": \"22/10/16\","
//					 +"     \"workingDays\": 10,"
//					 +"     \"status\": \"Procesado\","
//					 +"     \"salary\": 27000000"
//					 +"   },"
//					 +"   {"
//					 +"     \"id\": 152,"
//					 +"     \"type\": \"Otra\","
//					 +"     \"fromDate\": \"11/10/16\","
//					 +"     \"toDate\": \"22/10/16\","
//					 +"     \"workingDays\": 10,"
//					 +"     \"status\": \"Procesado\","
//					 +"     \"salary\": 27000000"
//					 +"   }"
//					 +"]"
//					 +"}";      

	}

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response postEntity(Object theEvent) {

		logger.debug("Start postEvent");
		
		logger.debug("Object " + theEvent.toString());
		
		
		

		String response = "{\"id\":\"123443\"}"; // Debe retornar el id creado la entidad

		logger.debug("result: '"+response+"'");
        logger.debug("End postEvent");

        return Response.status(200).entity(response).build();
	}

	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	public String putSuperEntity(Object theEvent) {
		logger.debug("Start putEvent");
		
		

		String response = null;

		logger.debug("result: '"+response+"'");
        logger.debug("End putEvent");

        return response;	
	}

	@DELETE
	public void deleteSuperEntity(Object theEvent) {
		
		logger.debug("Start deleteEntity");
	}
	
	/**
	 * Retorna instancia inicializada de la logica de negocio
	 * @return
	 */
	public EventLogic getEventLogic() {
		if(logic == null){
			logic = new EventLogic(new NovedadDAOImpl(), new EntityDAOImpl());					
		}
		return logic;
	}
}
