package co.edu.uniandes.rest.user;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.FormParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import co.edu.uniandes.logic.user.User;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
		
		
        response = "{" + "\"" + "idDb\":" + "1," + "\"" + "userId\":" + "2121212," + "\"" + "roleName\":" + "\"SuperEntity\"}"; 
        
       logger.debug("resultado: '"+response+"'");
       logger.debug("End Get");
        
        return Response.status(200).entity(response).build();
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)	
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createUser(User loggedUser) {
	
		logger.debug("Ingreso Parametros de usuario");
		logger.debug("loggedUser: '" + loggedUser.toString() + "'");
		logger.debug("userId: '" + loggedUser.getUserId() + "'");
		logger.debug("roleName: '" + loggedUser.getRoleName() + "'");
		
		String response = null;
		
		response = "{\"resp\":\"ok\"}";
        
        logger.debug("resultado: '"+response+"'");
        logger.debug("Fin Post");

        return Response.status(200).entity(response).build();
	}
}
