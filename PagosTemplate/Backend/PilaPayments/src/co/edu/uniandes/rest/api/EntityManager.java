package co.edu.uniandes.rest.api;

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

import com.fasterxml.jackson.databind.ObjectMapper;

@Path("/entities")
public class EntityManager {

	private static final Logger logger = LogManager.getLogger(EntityManager.class);
		
	//Consulta por Cedula o por Id de entidad
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getEntityManager(@QueryParam("id") String id, @QueryParam("legalIdCard") String legalIdCard) {

		logger.debug("Start getEntityManager");
		logger.debug("id: '" + id + "'");
		logger.debug("cedula: '" + legalIdCard + "'");
		
		ObjectMapper mapper = new ObjectMapper();
		
		String response = null;

		response = "{" + "\"" + "id\":" + "1," +
					"\"" + "legalIdCard\":" + "79120111," +
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
        logger.debug("End getEntityManager");

        return response;	
	}

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response postEntityManager(Object theEntity) {

		logger.debug("Start postEntity");
		
		logger.debug("Object " + theEntity.toString());
		
		
		

		String response = "{\"id\":\"123443\"}"; // Debe retornar el id creado la entidad

		logger.debug("result: '"+response+"'");
        logger.debug("End postEntity");

        return Response.status(200).entity(response).build();
	}

	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	public String putEntityManager(Object theEntity) {
		logger.debug("Start putEntityManager");
		
		

		String response = null;

		logger.debug("result: '"+response+"'");
        logger.debug("End putEntityManager");

        return response;	
	}

	@DELETE
	public void deleteEntityManager(Object theEntity) {
		
		logger.debug("Start deleteEntityManager");
	}
}
