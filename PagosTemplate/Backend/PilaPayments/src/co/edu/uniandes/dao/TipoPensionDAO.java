package co.edu.uniandes.dao;

import java.util.List;

import co.edu.uniandes.entity.TipoPension;

/**
 * interfaz del dao de tipo pension
 * @author jorge perea
 */
public interface TipoPensionDAO extends DAOBase<TipoPension>{
	
	/**
	 * encuentra por id
	 * @param id
	 */
	public TipoPension find(Long id);
	
	/**
	 * retorna todos los tipos de pension
	 * @return
	 */
	public List<TipoPension> findAll();

}
