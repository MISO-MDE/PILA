package co.edu.uniandes.businesslogic;

import java.util.List;

import co.edu.uniandes.dao.EntityDAO;
import co.edu.uniandes.dao.NovedadDAO;
import co.edu.uniandes.entity.PilaNovedad;
import co.edu.uniandes.entity.PilaSuperEntity;
import co.edu.uniandes.to.PilaNovedadTO;

public class EventLogic {
	
	/**
	 * dao de novedad
	 */
	private NovedadDAO novedadDAO;
	
	/**
	 * dao de entidad
	 */
	private EntityDAO entityDAO;
	
	/**
	 * Constructor
	 * @param dao
	 */
	public EventLogic(NovedadDAO novedadDAO, EntityDAO entityDAO) {
		this.novedadDAO = novedadDAO;
		this.entityDAO = entityDAO;
	}
	
	/**
	 * Crea una novedad en el sistema
	 * @param novedadTO to con los valores de novedad
	 * @return retorna valor de novedad
	 */
	public String createEvent(PilaNovedadTO novedadTO) {
		
		
		
		return "";
	}
	
	/**
	 * @param cedulaEntity
	 * @return
	 */
	public List<PilaNovedad> getEventsByCedula(String cedulaEntity) {
		return novedadDAO.findNovedadesEntityByCedula(cedulaEntity);
	}
}
