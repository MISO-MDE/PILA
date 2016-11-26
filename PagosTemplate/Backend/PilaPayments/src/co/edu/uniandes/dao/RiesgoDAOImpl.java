package co.edu.uniandes.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import co.edu.uniandes.entity.Riesgo;

public class RiesgoDAOImpl extends DAOBaseImpl<Riesgo> implements RiesgoDAO {
	
private static final Logger logger = LogManager.getLogger(EntityDAOImpl.class);
	
	/**
	 * entity manager
	 */
	private static final EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
	
	@Override
	public Riesgo findByActividadEconomica(Long idActividad) {
		Query query = em.createQuery("select r from Riesgo r where r.actividadesEconomicas in (:id)");
		query.setParameter("id", idActividad);
	    
	    return query.getResultList().isEmpty() ? null : (Riesgo)query.getSingleResult();
	}
	
	
}
