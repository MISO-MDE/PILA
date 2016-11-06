package co.edu.uniandes.rest.forms;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
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

@Path("/events")
public class EventManager {

	private static final Logger logger = LogManager.getLogger(EventManager.class);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getEvent(@QueryParam("id") String id) {

		logger.debug("Start getEvent");
		logger.debug("data: '" + id + "'");
		
		String response = null;

		response = "{" + "\"" + "id\":" + "1," +
					"\"" + "type\":" + "\"SLN\"," +
					"\"" + "fromDate\":" + "\"10/10/16\"," +
					"\"" + "toDate\":" + "\"22/10/16\"," +
					"\"" + "workingDays\":" + "10," +
					"\"" + "status\":" + "\"Procesado\"," +
					"\"" + "salary\":" + "27000000" +
					"}";
        
		logger.debug("result: '"+response+"'");
        logger.debug("End getEvent");

        return response;	
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
}
