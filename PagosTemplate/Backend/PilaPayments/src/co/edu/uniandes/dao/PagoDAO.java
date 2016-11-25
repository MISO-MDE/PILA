package co.edu.uniandes.dao;

import java.util.List;

import co.edu.uniandes.entity.PilaEntity;
import co.edu.uniandes.entity.Pago;
import co.edu.uniandes.entity.SuperEntity;

/**
 * dao para pagos
 * @author jorge perea
 */
public interface PagoDAO {
	
	/**
	 * retorna una lista de pagos realizadas a una entidad
	 * @param entity entidad a la que se le buscan los pagos
	 * @return lista de pagos
	 */
	public List<Pago> findPagosEntity(PilaEntity entity);
	
	/**
	 * retorna una lista de pagos realizadas por una super entity
	 * @param superEntity entidad que realizo los pagos
	 * @return lista de pagos d epagos realizados
	 */
	public List<Pago> findPagosSuperEntity(SuperEntity entity);
}
