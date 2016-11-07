package co.edu.unaindes.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.uniandes.entity.PilaEntity;
import co.edu.uniandes.entity.PilaSuperEntity;

/**
 * Implementacion del dao de entidad
 * @author jorge perea
 */
public class EntityDAOImpl extends DAOBaseImpl<PilaEntity> implements EntityDAO{
	
	/**
	 * entity manager
	 */
	private static final EntityManager em = PersistenceManager.INSTANCE.getEntityManager();

	/**
	 * @see co.edu.unaindes.dao.EntityDAO#findEntity(int)
	 */
	@Override
	public PilaEntity findEntity(int cedula) {
		Query query = em.createQuery("select en from PilaEntity en where en.cedula = :cedula");
		query.setParameter("cedula", cedula);
	    
	    return query.getResultList().isEmpty() ? null : (PilaEntity)query.getResultList().get(0);
	}

	/**
	 * @see co.edu.unaindes.dao.EntityDAO#findAllEntityBySuperEntity(co.edu.uniandes.entity.PilaSuperEntity)
	 */
	@Override
	public List<PilaEntity> findAllEntityBySuperEntity(PilaSuperEntity superEntity) {
		Query query = em.createQuery("select en from PilaEntity en where en.superEntidad = :superEntidad");
		query.setParameter("superEntidad", superEntity);
		
		return query.getResultList();
	}	
}
