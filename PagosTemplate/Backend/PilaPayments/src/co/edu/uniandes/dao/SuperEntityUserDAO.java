package co.edu.uniandes.dao;

import co.edu.uniandes.entity.PilaUserSuperEntity;

/**
 * Interfaz de superEntity
 * @author jorge perea
 */
public interface SuperEntityUserDAO extends DAOBase<PilaUserSuperEntity>{
	
	/**
	 * retorna el usuario del super entity
	 * @param id id del super entity
	 * @return
	 */
	public PilaUserSuperEntity getUser(String id);
}
