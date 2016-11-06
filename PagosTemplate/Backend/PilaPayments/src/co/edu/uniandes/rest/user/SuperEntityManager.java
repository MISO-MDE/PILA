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

@Path("/superentities")
public class SuperEntityManager {

	private static final Logger logger = LogManager.getLogger(SuperEntityManager.class);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getSuperEntity(@QueryParam("superEntityId") String id,
			 @DefaultValue("1") @QueryParam("version") int version) {

		logger.debug("Start getSuperEntity");
		logger.debug("data: '" + id + "'");
		
		String response = null;

		response = "{" + "\"" + "id\":" + "1," + "\"" + "name\":" + "Colpatria," + "\"" + "nit\":" + "\"123456\"," + "\"ciiuCode\":" + "\"8080\"," + "\"econActivity\":" + "\"8080\" }";
        
		logger.debug("result: '"+response+"'");
        logger.debug("End getSomething");

        return response;	
	}

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response postSuperEntity(Object theSuperEntity) {

		logger.debug("Start postSuperEntity");
		
		logger.debug("Object " + theSuperEntity.toString());
		
		
		

		String response = "Ok";

		logger.debug("result: '"+response+"'");
        logger.debug("End postSomething");

        return Response.status(200).entity(response).build();
	}

	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	public String putSuperEntity(Object theSuperEntity) {
		logger.debug("Start postSuperEntity");
		
		

		String response = null;

		logger.debug("result: '"+response+"'");
        logger.debug("End postSomething");

        return response;	
	}

	@DELETE
	public void deleteSuperEntity(Object theSuperEntity) {
		
		logger.debug("Start postSuperEntity");
	}
}
