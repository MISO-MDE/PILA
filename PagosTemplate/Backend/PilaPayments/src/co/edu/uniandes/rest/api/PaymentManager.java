package co.edu.uniandes.rest.api;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import co.edu.uniandes.businesslogic.ValidacionLogic;
import co.edu.uniandes.dao.ValidacionDAOImpl;

@Path("/payment")
public class PaymentManager {

private static final Logger logger = LogManager.getLogger(EventManager.class);
	
	/**
	 * logica de validacion
	 */
	private ValidacionLogic validacionLogic;
	
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
					"\"" + "firstName\":" + "\"Pedro\"," +
					"\"" + "lastName\":" + "\"Perez\"," + 
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
					"\"" + "firstName\":" + "\"Ramon\"," +
					"\"" + "lastName\":" + "\"Diaz\"," + 
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
	
	/**
	 * Valida que exista una relacion entre el tipo de pension y el tipo de pensionado
	 * @param theSuperEntity
	 * @return respuesta indicando si existe la relacion
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@POST
	@Path("/vPensionPensionado")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response validarPensionPensionado(String theSuperEntity) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
		
		final ObjectNode node = mapper.readValue(theSuperEntity.toString(), ObjectNode.class);
		
		String idPension = "";
		String idPensionado = "";
		if(!node.get("idPension").asText().isEmpty()) {
			idPension = node.get("idPension").asText();
		}
		
		if(!node.get("idPensionado").asText().isEmpty()) {
			idPensionado = node.get("idPensionado").asText();
		}
		
		String response = "{\"respuesta\":\"error\"}"; 
		
		if(getValidacionLogic().validarPensionPensionado(idPension, idPensionado) != null){
			response = "{\"respuesta\":\"ok\"}";
		}
		
		return Response.status(200).entity(response).build();
	}
	
	/**
	 * Valida que exista una relacion entre el tipo de pension y el tipo de pagador
	 * @param theSuperEntity
	 * @return respuesta indicando si existe la relacion
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@POST
	@Path("/vPensionPagador")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response validarPensionPagador(String theSuperEntity) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
		
		final ObjectNode node = mapper.readValue(theSuperEntity.toString(), ObjectNode.class);
		
		String idPension = "";
		String idPagador = "";
		if(!node.get("idPension").asText().isEmpty()) {
			idPension = node.get("idPension").asText();
		}
		
		if(!node.get("idPagador").asText().isEmpty()) {
			idPagador = node.get("idPagador").asText();
		}
		
		String response = "{\"respuesta\":\"error\"}"; 
		
		if(getValidacionLogic().validarPensionPagador(idPension, idPagador) != null){
			response = "{\"respuesta\":\"ok\"}";
		}
		
		return Response.status(200).entity(response).build();
		
	}
	
	/**
	 * Valida que exista una relacion entre el tipo de pensionado y el tipo de pagador
	 * @param theSuperEntity
	 * @return respuesta indicando si existe la relacion
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@POST
	@Path("/vPensionadoPagador")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response validarPensionadoPagador(String theSuperEntity) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
		
		final ObjectNode node = mapper.readValue(theSuperEntity.toString(), ObjectNode.class);
		
		String idPensionado = "";
		String idPagador = "";
		if(!node.get("idPensionado").asText().isEmpty()) {
			idPensionado = node.get("idPensionado").asText();
		}
		
		if(!node.get("idPagador").asText().isEmpty()) {
			idPagador = node.get("idPagador").asText();
		}
		
		String response = "{\"respuesta\":\"error\"}"; 
		
		if(getValidacionLogic().validarPensionadoPagador(idPensionado, idPagador) != null){
			response = "{\"respuesta\":\"ok\"}";
		}
		
		return Response.status(200).entity(response).build();
		
	}
	
	/**
	 * metodo auxiliar para obtener la logica del super entity
	 * @return
	 */
	public ValidacionLogic getValidacionLogic() {
		if(validacionLogic == null){
			validacionLogic = new ValidacionLogic(new ValidacionDAOImpl());					
		}
		return validacionLogic;
	}
}
