package co.edu.uniandes.dao;

import co.edu.uniandes.entity.PilaUserIntermediary;

/**
 * Interfaz para el usuario del intermediario
 * @author jorge perea
 */
public interface IntermediaryUserDAO extends DAOBase<PilaUserIntermediary>{
	
	/**
	 * retorna el usuario del super entity
	 * @param id id del super entity
	 * @return
	 */
	public PilaUserIntermediary getUser(String id);
}
