package co.edu.uniandes.dao;

import java.util.List;

import javax.persistence.Query;

import co.edu.uniandes.entity.PilaEntity;
import co.edu.uniandes.entity.Pago;
import co.edu.uniandes.entity.SuperEntity;

/**
 * Implementacion del dao de pago
 * @author jorge perea
 */
public class PagoDAOImpl extends DAOBaseImpl<Pago> implements PagoDAO{

	/**
	 * @see co.edu.uniandes.dao.PagoDAO#findPagosEntity(co.edu.uniandes.entity.PilaEntity)
	 */
	@Override
	public List<Pago> findPagosEntity(PilaEntity entity) {
		Query query = getEntityManager().createQuery("select pago from PilaPago pago where pago.entity = :entity");
		query.setParameter("entity", entity);
	    
	    return query.getResultList();
	}

	/**
	 * @see co.edu.uniandes.dao.PagoDAO#findPagosSuperEntity(co.edu.uniandes.entity.PilaEntity)
	 */
	@Override
	public List<Pago> findPagosSuperEntity(SuperEntity superEntity) {
		Query query = getEntityManager().createQuery("select pago from PilaPago pago where pago.superEntity = :superEntity");
		query.setParameter("superEntity", superEntity);
	    
	    return query.getResultList();
	}

}
