package co.edu.uniandes.rest.api;

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
import org.json.JSONObject;

import co.edu.uniandes.businesslogic.SuperEntityLogic;
import co.edu.uniandes.dao.SuperEntityDAOImpl;
import co.edu.uniandes.dao.SuperEntityUserDAOImpl;
import co.edu.uniandes.to.PilaSuperEntityTO;

@Path("/users")
public class UserManager {
	
	private static final Logger logger = LogManager.getLogger(UserManager.class);
	
	/**
	 * logica de la super entidad
	 */
	private SuperEntityLogic logic;
	
	/* Servicio Rest que recibe el id de usuario y devuelve el role del usuario */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUserInfo(@QueryParam("userId") String userId) {

		logger.debug("Obteniendo Usuario");
		logger.debug("userId: '" + userId + "'");
		
		String response = null;
		
		//Consulta con id del usuario userId y devuelve el role de la base de datos Llave primaria=userId
		//Aqui debemos llamar la capa capa de negocio que esta a su vez llama a la capa de persistencia
		
		
		//response = "{" + "\"" + "idDb\":" + "1," + "\"" + "superEntityId\":" + "123443," + "\"" + "userId\":" + "w5iXPZexNQa0Ry91HLPwzHiLO8S2," + "\"" + "email\":" + "\"" + "b@b.com\"," + "\"" + "password\":" + "123456," + "\"" + "roleName\":" + "\"Intermediary\"}";
        
        response = "{" + 
        			"\"" + "idDb\":" + "1," + 
        			"\"" + "superEntityId\":" + "123443," + 
        			"\"" + "userId\":" + "\"w5iXPZexNQa0Ry91HLPwzHiLO8S2\"," + 
        			"\"" + "email\":" + "\"" + "b@b.com\"," + "\"" + 
        			"password\":" + "123456," + 
        			"\"" + "roleName\":" + "\"Intermediary\"}";
        
       logger.debug("resultado: '"+response+"'");
       logger.debug("End Get");
        
        return Response.status(200).entity(response).build();
	}
	
	/**
	 * Crea un usuario para la superentidad
	 * @param loggedUser
	 * @return
	 */
	@POST
	@Path("/superEntity")
	@Produces(MediaType.APPLICATION_JSON)	
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createUser(Object loggedUser) {
	
		logger.debug("Ingreso Parametros de usuario");
		logger.debug("loggedUser: '" + loggedUser.toString() + "'");
		
		JSONObject jsonObject = new JSONObject(loggedUser);
		PilaSuperEntityTO superTO = new PilaSuperEntityTO();
			
		superTO.setEmail(jsonObject.getString("email"));
		superTO.setUsername(jsonObject.getString("name"));
		superTO.setIdSuperEntity(Long.parseLong((jsonObject.getString("superEntityId"))));
		
		String resultado = getSuperEntityLogic().createSuperEntityUser(superTO);
		
		String response = "{\"resp\":\""+ resultado +"\"}";
        
        logger.debug("resultado: '"+response+"'");
        logger.debug("Fin Post");

        return Response.status(200).entity(response).build();
	}
	
	/**
	 * Metodo que retorna la logica
	 * @return
	 */
	public SuperEntityLogic getSuperEntityLogic() {
		if(logic == null){
			logic = new SuperEntityLogic(new SuperEntityDAOImpl(), new SuperEntityUserDAOImpl());
		}
		return logic;
	}
}
