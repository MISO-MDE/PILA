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

import co.edu.uniandes.businesslogic.EntityLogic;
import co.edu.uniandes.businesslogic.ValidacionLogic;
import co.edu.uniandes.dao.EntityDAOImpl;
import co.edu.uniandes.dao.PaisDAOImpl;
import co.edu.uniandes.dao.SuperEntityDAOImpl;
import co.edu.uniandes.dao.ValidacionDAOImpl;
import co.edu.uniandes.entity.PilaEntity;
import co.edu.uniandes.to.PilaEntityTO;
import co.edu.uniandes.businesslogic.BusinessValidations;
import co.edu.uniandes.businesslogic.CalculationFormula1;

@Path("/calculation")
public class PaymentCalculatorManager {
	
	private EntityLogic logic;
	
	private double calculo1 = 0;
	private double calculo2 = 0;
	private double calculo3 = 0;
	private double total = 0;
	
	
	private static final Logger logger = LogManager.getLogger(EventManager.class);
	//Devuelve el calculo de los pagos
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCalculationPayment(@QueryParam("id") String id) {
		
		Response restResponse;
		logger.debug("Start getPayment");
		logger.debug("data: '" + id + "'");
		String errorCondition = "";
		
		PilaEntity theEntity = getEntityLogic().getEntitiesById(Long.valueOf(id));
		
		logger.debug("data:theEntity '" + theEntity.getCedula() + "'");
		
		
		BusinessValidations busVal = new BusinessValidations(theEntity, new ValidacionLogic(new ValidacionDAOImpl()));
		
		String validations = busVal.validations();
		
		if (validations.isEmpty()) {
 		
			CalculationFormula1 formulaCalculation = new CalculationFormula1(theEntity);
			
			calculo1 = formulaCalculation.getFormula1();
			calculo2 = formulaCalculation.getFormula2();
			calculo3 = formulaCalculation.getFormula3();
			total = calculo1 + calculo2 + calculo3;
		}
		else {
			errorCondition = validations;
		}
		
		
		
		
		
		
		
		String response = null;
		// Si pasa todas las validaciones devuelve 
		
		response = 	"{" +  
					"\"" + "id\":" + "7392," +
					"\"" + "supetrEntityId\":" + "1," +
					"\"" + "entityId\":" + "2," +
					"\"" + "subTotal1\":" + calculo1 + "," +
					"\"" + "subTotal2\":" + calculo2 + "," +
					"\"" + "subTotal3\":" + calculo3 + "," +
					"\"" + "amount\":" + total + "" +
					errorCondition +
					"}";
					
	
      
		logger.debug("result: '"+response+"'");
		logger.debug("End getPayments");

		restResponse = Response.status(200).entity(response).build(); //puede realizar el pago retorno 200
		return restResponse; 
	}
	
	/**
	 * metodo auxiliar para obtener la logica del entity
	 * @return
	 */
	public EntityLogic getEntityLogic() {
		if(logic == null){
			logic = new EntityLogic(new EntityDAOImpl(), new SuperEntityDAOImpl(), new PaisDAOImpl());					
		}
		return logic;
	}
}