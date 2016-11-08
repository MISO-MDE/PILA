package co.edu.uniandes.dao;

import co.edu.uniandes.entity.PilaUser;

/**
 * Interfaz de DAO para user de intermediario
 * @author jorge perea
 */
public interface DAOUser {
	
	/**
	 * Retorna el usuario con el username dado
	 * @param username
	 */
	public PilaUser findByUsername(String username);
}
