package co.edu.uniandes.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.uniandes.entity.TipoPension;

public class TipoPensionDAOImpl extends DAOBaseImpl<TipoPension> implements TipoPensionDAO {
	
	/**
	 * entity manager
	 */
	private static final EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
	
	@Override
	public TipoPension find(Long id) {
		Query query = em.createQuery("select tp from TipoPension tp where tp.id = :id");
		query.setParameter("id", id);
	    
	    return query.getResultList().isEmpty() ? null : (TipoPension)query.getSingleResult();
	}

	@Override
	public List<TipoPension> findAll() {
		Query query = getEntityManager().createQuery("from TipoPension");
		
		return query.getResultList();
	}
	
	
}
