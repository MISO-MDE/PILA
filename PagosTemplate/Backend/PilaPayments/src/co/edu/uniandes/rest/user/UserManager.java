package co.edu.uniandes.rest.user;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import co.edu.uniandes.logic.entities.User;

@Path("/users")
public class UserManager {
	
	private static final Logger logger = LogManager.getLogger(UserManager.class);
	
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

	@POST
	@Produces(MediaType.APPLICATION_JSON)	
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createUser(Object loggedUser) {
	
		logger.debug("Ingreso Parametros de usuario");
		logger.debug("loggedUser: '" + loggedUser.toString() + "'");
		
		String response = null;
		
		response = "{\"resp\":\"ok\"}";
        
        logger.debug("resultado: '"+response+"'");
        logger.debug("Fin Post");

        return Response.status(200).entity(response).build();
	}
}
