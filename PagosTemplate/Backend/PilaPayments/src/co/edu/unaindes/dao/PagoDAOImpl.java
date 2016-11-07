package co.edu.unaindes.dao;

import java.util.List;

import javax.persistence.Query;

import co.edu.uniandes.entity.PilaEntity;
import co.edu.uniandes.entity.PilaPago;
import co.edu.uniandes.entity.PilaSuperEntity;

/**
 * Implementacion del dao de pago
 * @author jorge perea
 */
public class PagoDAOImpl extends DAOBaseImpl<PilaPago> implements PagoDAO{

	/**
	 * @see co.edu.unaindes.dao.PagoDAO#findPagosEntity(co.edu.uniandes.entity.PilaEntity)
	 */
	@Override
	public List<PilaPago> findPagosEntity(PilaEntity entity) {
		Query query = getEntityManager().createQuery("select pago from PilaPago pago where pago.entity = :entity");
		query.setParameter("entity", entity);
	    
	    return query.getResultList();
	}

	/**
	 * @see co.edu.unaindes.dao.PagoDAO#findPagosSuperEntity(co.edu.uniandes.entity.PilaEntity)
	 */
	@Override
	public List<PilaPago> findPagosSuperEntity(PilaSuperEntity superEntity) {
		Query query = getEntityManager().createQuery("select pago from PilaPago pago where pago.superEntity = :superEntity");
		query.setParameter("superEntity", superEntity);
	    
	    return query.getResultList();
	}

}
