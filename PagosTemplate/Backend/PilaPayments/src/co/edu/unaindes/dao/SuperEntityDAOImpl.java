package co.edu.unaindes.dao;

import java.util.List;

import javax.persistence.Query;

import co.edu.uniandes.entity.PilaSuperEntity;

/**
 * implementacion del dao para super entidad
 * @author jorge perea
 */
public class SuperEntityDAOImpl extends DAOBaseImpl<PilaSuperEntity> implements SuperEntityDAO {

	/**
	 * @see co.edu.unaindes.dao.SuperEntityDAO#findSuperEntity(java.lang.String)
	 */
	@Override
	public PilaSuperEntity findSuperEntity(String nit) {
		Query query = getEntityManager().createQuery("select se from PilaSuperEntity se where se.nit = :nit");
		query.setParameter("nit", nit);
	    
	    return query.getResultList().isEmpty() ? null : (PilaSuperEntity)query.getResultList().get(0);
	}

	/**
	 * @see co.edu.unaindes.dao.SuperEntityDAO#findAllSuperEntity()
	 */
	@Override
	public List<PilaSuperEntity> findAllSuperEntity() {
		Query query = getEntityManager().createQuery("from PilaSuperEntity");
			
		return query.getResultList();
	}
}
