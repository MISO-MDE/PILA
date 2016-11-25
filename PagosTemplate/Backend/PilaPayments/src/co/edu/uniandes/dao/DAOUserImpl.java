package co.edu.uniandes.dao;

import javax.persistence.Query;

import co.edu.uniandes.entity.User;

/**
 * implementacion del dao de usuario
 * @author jorge perea
 */
public class DAOUserImpl extends DAOBaseImpl<User> implements DAOUser{

	/**
	 * @see co.edu.uniandes.dao.DAOUser#findByUsername(java.lang.String)
	 */
	@Override
	public User findByUsername(String username) {
		return null;
	}

	/**
	 * @see co.edu.uniandes.dao.DAOUser#findByUserId(java.lang.String)
	 */
	@Override
	public User findByUserId(String userId) {
		Query query = getEntityManager().createQuery("select us from PilaUser us where us.userId = :userId");
		query.setParameter("userId", userId);
	    
	    return query.getResultList().isEmpty() ? null : (User)query.getResultList().get(0);
	}
}
