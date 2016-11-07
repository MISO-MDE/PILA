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

@Path("/pensioner")
public class PensionerManager {

private static final Logger logger = LogManager.getLogger(EventManager.class);
	
	//Consulta pagos de la base de datos
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getPensioners(@QueryParam("id") String id) {		
		logger.debug("Start getPensioners");
		logger.debug("data: '" + id + "'");		
		String response = null;
		response = "{"
				   +"\"results\": [{"
				   +"\"id\": 1,"
				   +"\"cedula\": 79120111,"
				   +"\"firstName\": \"Carlos\","
				   +"\"lastName\": \"Valderrama\","
				   +"\"pensionType\": \"Vejez\","
				   +"\"pensionerType\": \"Prima Media\","
				   +"\"residence\": \"Colombia\","
				   +"\"familyResidence\": \"Colombia\","
				   +"\"proffesion\": \"Congreista\","
				   +"\"salary\": 90000000"
				  +"},{"
				   +"\"id\": 1,"
				   +"\"cedula\": 79120111,"
				   +"\"firstName\": \"Pedro\","
				   +"\"lastName\": \"Perez\","
				   +"\"pensionType\": \"Vejez\","
				   +"\"pensionerType\": \"Prima Media\","
				   +"\"residence\": \"Colombia\","
				   +"\"familyResidence\": \"Colombia\","
				   +"\"proffesion\": \"Congreista\","
				   +"\"salary\": 27000000"
				   +"}]"
				   +"}";        
		logger.debug("result: '"+response+"'");
        logger.debug("End getPensioners");
        return response;	
	}	
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createPensioner(Object thePayment) {

		logger.debug("Start postEvent");
		
		logger.debug("Object " + thePayment.toString());
		
		
		

		String response = "{\"id\":\"123443\"}"; // Debe retornar el id creado la entidad

		logger.debug("result: '"+response+"'");
        logger.debug("End postPayment");

        return Response.status(200).entity(response).build();
	}
}
