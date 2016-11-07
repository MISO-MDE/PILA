package co.edu.uniandes.rest.payments;

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

import co.edu.uniandes.rest.forms.EventManager;

@Path("/calculation")
public class PaymentsCalculatorManager {

private static final Logger logger = LogManager.getLogger(EventManager.class);
//Devuelve el calculo de los pagos
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getCalculationPayment(@QueryParam("id") String id) {
		
		logger.debug("Start getPayment");
		logger.debug("data: '" + id + "'");
		
		String response = null;
		// Si pasa todas las validaciones devuelve 
		response = 	"{" +  
					"\"" + "id\":" + "7392," +
					"\"" + "supetrEntityId\":" + "1," +
					"\"" + "entityId\":" + "2," +
					"\"" + "subTotal1\":" + "150000," +
					"\"" + "subTotal2\":" + "150000," +
					"\"" + "subTotal3\":" + "450000," +
					"\"" + "amount\":" + "345000" +
					"}";
					;
      
	logger.debug("result: '"+response+"'");
    logger.debug("End getPayments");
      
      //Sino devuelve
      /*
       response = "{" +
					"\"" + "results\":[" + 
					"{" +    
					"\"" + "Validacion\":" + "\"Tipo Pension vs Tipo Pensionado inconsistente\"," +
					"\"" + "valor1\":" + "\"Vejez\"," +
					"\"" + "valor2\":" + "\"Pension Voluntaria\"" +
					"}," + 
					"{" + 
					"\"" + "Validacion\":" + "\"Tipo Pension vs Tipo Pagador inconsistente\"," +
					"\"" + "valor1\":" + "\"Vejez\"," +
					"\"" + "valor2\":" + "\"Empleador\"" +
					"}" +
					"]}";
					;
       */
      
      return response;	
	}
}