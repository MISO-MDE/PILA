package co.edu.uniandes.dao;

import co.edu.uniandes.entity.User;

/**
 * Interfaz de DAO para user de intermediario
 * @author jorge perea
 */
public interface DAOUser extends DAOBase<User> {
	
	/**
	 * Retorna el usuario con el username dado
	 * @param username
	 */
	public User findByUsername(String username);
	
	/**
	 * Retorna el usuario con el username dado
	 * @param userId id del usuario buscado
	 * @return
	 */
	public User findByUserId(String userId);
}
