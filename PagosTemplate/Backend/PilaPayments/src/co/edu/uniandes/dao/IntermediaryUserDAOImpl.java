package co.edu.uniandes.dao;

import javax.persistence.Query;

import co.edu.uniandes.entity.PilaUserIntermediary;

/**
 * dao para el usuario intermedio
 * @author jorge perea
 */
public class IntermediaryUserDAOImpl extends DAOBaseImpl<PilaUserIntermediary> implements IntermediaryUserDAO {

	/**
	 * @see co.edu.uniandes.dao.IntermediaryUserDAO#getUser(java.lang.String)
	 */
	@Override
	public PilaUserIntermediary getUser(String userId) {
		Query query = getEntityManager().createQuery("select us from PilaUserIntermediary us where us.userId = :userId");
		query.setParameter("userId", userId);
	    
	    return query.getResultList().isEmpty() ? null : (PilaUserIntermediary)query.getResultList().get(0);
	}

}
