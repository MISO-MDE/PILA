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

@Path("/payment")
public class PaymentManager {

private static final Logger logger = LogManager.getLogger(EventManager.class);
	
	//Consulta pagos de la base de datos
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getPayments(@QueryParam("id") String id) {
		
		logger.debug("Start getPayment");
		logger.debug("data: '" + id + "'");
		
		String response = null;

		response = 	"{" +
					"\"" + "results\":[" + 
					"{" +  
					"\"" + "id\":" + "1234," +
					"\"" + "supetrEntityId\":" + "1," +
					"\"" + "entityId\":" + "1," +
					"\"" + "paymentDate\":" + "\"10/10/16\"," +
					"\"" + "subTotal1\":" + "2000000," +
					"\"" + "subTotal2\":" + "20000000," +
					"\"" + "subTotal3\":" + "5000000," +
					"\"" + "status\":" + "\"Pagado\"," +
					"\"" + "amount\":" + "27000000" +
					"}," +
					"{" +  
					"\"" + "id\":" + "7392," +
					"\"" + "supetrEntityId\":" + "1," +
					"\"" + "entityId\":" + "2," +
					"\"" + "paymentDate\":" + "\"10/10/16\"," +
					"\"" + "subTotal1\":" + "150000," +
					"\"" + "subTotal2\":" + "150000," +
					"\"" + "subTotal3\":" + "450000," +
					"\"" + "status\":" + "\"Pagado\"," +
					"\"" + "amount\":" + "345000" +
					"}]}";
					;
        
		logger.debug("result: '"+response+"'");
        logger.debug("End getPayments");

        return response;	
	}
	
	//Envia pago para guardar en la base de datos
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response postPayment(Object thePayment) {

		logger.debug("Start postEvent");
		
		logger.debug("Object " + thePayment.toString());
		
		
		

		String response = "{\"id\":\"123443\"}"; // Debe retornar el id creado la entidad

		logger.debug("result: '"+response+"'");
        logger.debug("End postPayment");

        return Response.status(200).entity(response).build();
	}
}
