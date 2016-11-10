package co.edu.uniandes.dao;

import javax.persistence.Query;

import co.edu.uniandes.entity.PilaUserSuperEntity;

/**
 * Implementacion del dao
 * @author jorge perea
 */
public class SuperEntityUserDAOImpl extends DAOBaseImpl<PilaUserSuperEntity> implements SuperEntityUserDAO {

	@Override
	public PilaUserSuperEntity getUser(String userId) {
		Query query = getEntityManager().createQuery("select us from PilaUserSuperEntity us where us.userId = :userId");
		query.setParameter("userId", userId);
	    
	    return query.getResultList().isEmpty() ? null : (PilaUserSuperEntity)query.getResultList().get(0);
	}
	
}
