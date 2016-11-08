package co.edu.uniandes.dao;

import java.util.List;

import co.edu.uniandes.entity.PilaSuperEntity;

/**
 * Interfaz del dao de super entidad
 * @author jorge perea
 */
public interface SuperEntityDAO extends DAOBase<PilaSuperEntity>{
	
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
	
	/**
	 * Retorna la super entidad con el id especificado
	 * @param id de la super entidad
	 * @return super entidad
	 */
	public PilaSuperEntity findSuperEntityById(Long id);
	
}
