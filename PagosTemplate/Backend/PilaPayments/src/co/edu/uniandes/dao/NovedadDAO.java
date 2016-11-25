package co.edu.uniandes.dao;

import java.util.List;

import co.edu.uniandes.entity.Novedad;

/**
 * Dao para la novedad
 * @author jorge perea
 */
public interface NovedadDAO {
	
	/**
	 * retorna las novedad de una entidad
	 * @param idEntity id de la entidad
	 * @return lista con todas las novedades de entidad
	 */
	public List<Novedad> findNovedadesEntity(Long idEntity);

	/**
	 * retorna las novedad de una entidad
	 * @param idEntity id de la entidad
	 * @return lista con todas las novedades de entidad
	 */
	public List<Novedad> findNovedadesEntityByCedula(String cedulaEntity);
	
	/**
	 * retorna las novedad de una super entity
	 * @param idEntity id de la super entity
	 * @return lista con todas las novedades de la super entities
	 */
	public List<Novedad> findNovedadesSuperEntity(Long idSuperEntity);
}
