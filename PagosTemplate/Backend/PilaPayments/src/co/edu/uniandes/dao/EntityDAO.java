package co.edu.uniandes.dao;

import java.util.List;

import co.edu.uniandes.entity.PilaEntity;
import co.edu.uniandes.entity.PilaSuperEntity;

/**
 * Dao para la entidad
 * @author jorge perea
 */
public interface EntityDAO {

	/**
	 * encuentra el entity por cedula
	 * @param cedula
	 * @return
	 */
	public PilaEntity findEntity(int cedula);
	
	/**
	 * devuelve todos lo entities relacionados con una super entidad
	 * @param superEntity
	 * @return
	 */
	public List<PilaEntity>findAllEntityBySuperEntity(PilaSuperEntity superEntity);
}
