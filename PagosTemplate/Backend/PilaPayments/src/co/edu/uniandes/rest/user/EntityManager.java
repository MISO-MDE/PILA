package co.edu.uniandes.rest.user;

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

@Path("/entities")
public class EntityManager {

	private static final Logger logger = LogManager.getLogger(EntityManager.class);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getEntity(@QueryParam("id") String id) {

		logger.debug("Start getEntity");
		logger.debug("data: '" + id + "'");
		
		String response = null;

		response = "{" + "\"" + "id\":" + "1," +
					"\"" + "cedula\":" + "79120111," +
					"\"" + "firstName\":" + "\"Pedro\"," +
					"\"" + "lastName\":" + "\"Perez\"," +
					"\"" + "pensionType\":" + "\"Vejez\"," +
					"\"" + "pensionerType\":" + "\"Prima Media\"," +
					"\"" + "residence\":" + "\"Colombia\"," +
					"\"" + "familyResidence\":" + "\"Colombia\"," +
					"\"" + "proffesion\":" + "\"Congreista\"," +
					"\"" + "salary\":" + "27000000" +
					"}";
        
		logger.debug("result: '"+response+"'");
        logger.debug("End getSomething");

        return response;	
	}

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response postEntity(Object theEntity) {

		logger.debug("Start postEntity");
		
		logger.debug("Object " + theEntity.toString());
		
		
		

		String response = "{\"id\":\"123443\"}"; // Debe retornar el id creado la entidad

		logger.debug("result: '"+response+"'");
        logger.debug("End postEntity");

        return Response.status(200).entity(response).build();
	}

	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	public String putSuperEntity(Object theEntity) {
		logger.debug("Start putEntity");
		
		

		String response = null;

		logger.debug("result: '"+response+"'");
        logger.debug("End putEntity");

        return response;	
	}

	@DELETE
	public void deleteSuperEntity(Object theSuperEntity) {
		
		logger.debug("Start deleteEntity");
	}
}
