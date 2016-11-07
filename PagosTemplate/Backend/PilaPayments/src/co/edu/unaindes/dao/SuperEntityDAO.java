package co.edu.unaindes.dao;

import java.util.List;

import co.edu.uniandes.entity.PilaSuperEntity;

/**
 * Interfaz del dao de super entidad
 * @author jorge perea
 */
public interface SuperEntityDAO {
	
	/**
	 * Retorna un super
	 * @param nit nit de la super entity
	 * @return la super entidad con el nit
	 */
	public PilaSuperEntity findSuperEntity(String nit);
	
	/**
	 * Retorna todas las super entidades
	 * @return lista con las super entidades
	 */
	public List<PilaSuperEntity> findAllSuperEntity();
	
	
}
