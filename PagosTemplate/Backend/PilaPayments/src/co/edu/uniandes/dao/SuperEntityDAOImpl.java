package co.edu.uniandes.dao;

import java.util.List;

import javax.persistence.Query;

import co.edu.uniandes.entity.PilaSuperEntity;

/**
 * implementacion del dao para super entidad
 * @author jorge perea
 */
public class SuperEntityDAOImpl extends DAOBaseImpl<PilaSuperEntity> implements SuperEntityDAO {

	/**
	 * @see co.edu.uniandes.dao.SuperEntityDAO#findSuperEntity(java.lang.String)
	 */
	@Override
	public PilaSuperEntity findSuperEntity(String nit) {
		Query query = getEntityManager().createQuery("select se from PilaSuperEntity se where se.nit = :nit");
		query.setParameter("nit", nit);
	    
	    return query.getResultList().isEmpty() ? null : (PilaSuperEntity)query.getResultList().get(0);
	}

	/**
	 * @see co.edu.uniandes.dao.SuperEntityDAO#findAllSuperEntity()
	 */
	@Override
	public List<PilaSuperEntity> findAllSuperEntity() {
		Query query = getEntityManager().createQuery("from PilaSuperEntity");
			
		return query.getResultList();
	}

	/**
	 * @see co.edu.uniandes.dao.SuperEntityDAO#findSuperEntityById(java.lang.Long)
	 */
	@Override
	public PilaSuperEntity findSuperEntityById(Long id) {
		Query query = getEntityManager().createQuery("select se from PilaSuperEntity se where se.id = :id");
		query.setParameter("id", id);
	    
	    return query.getResultList().isEmpty() ? null : (PilaSuperEntity)query.getResultList().get(0);
	}
}
