package co.edu.uniandes.businesslogic;

import co.edu.uniandes.dao.IntermediaryUserDAO;
import co.edu.uniandes.dao.SuperEntityUserDAO;
import co.edu.uniandes.entity.PilaUser;
import co.edu.uniandes.entity.PilaUserIntermediary;
import co.edu.uniandes.entity.PilaUserSuperEntity;
import co.edu.uniandes.to.PilaUserTO;

/**
 * logica de negocio del usuario
 * @author jorge perea
 */
public class UserLogic {
	
	/**
	 * dao de super entidad
	 */
	private SuperEntityUserDAO superDAO;
	
	private IntermediaryUserDAO intermediaryDAO;

	
	/**
	 * Constructor
	 * @param dao
	 */
	public UserLogic(IntermediaryUserDAO intermediaryDAO, SuperEntityUserDAO superDAO) {
		this.superDAO = superDAO;
		this.intermediaryDAO = intermediaryDAO;
	}
	
	/**
	 * Retorna el user con el id especificado
	 * @param userId
	 * @return
	 */
	public PilaUserTO getPilaUser(String userId) {
		
		PilaUserTO resultado = new PilaUserTO();
		
		PilaUserSuperEntity user = superDAO.getUser(userId);
		PilaUserIntermediary user2 = intermediaryDAO.getUser(userId);
		
		if(user != null) {	

			resultado.setIdDb(user.getId().toString());
			resultado.setEmail(user.getEmail());
			resultado.setRolename("SuperEntity");
			resultado.setUserId(userId);
			resultado.setSuperEntityId(user.getSuperEntity().getId().toString());
			resultado.setPassword(user.getPassword());
			
		} else if(user2 != null) {
			
			resultado.setIdDb(user2.getId().toString());
			resultado.setEmail(user2.getEmail());
			resultado.setRolename("Intermediary");
			resultado.setUserId(userId);
			resultado.setSuperEntityId("");
			resultado.setPassword(user2.getPassword());
		}
		
		return resultado;
	}	
}
