package co.edu.uniandes.businesslogic;

import java.util.List;

import co.edu.uniandes.dao.EntityDAO;
import co.edu.uniandes.dao.EntityDAOImpl;
import co.edu.uniandes.dao.NovedadDAO;
import co.edu.uniandes.dao.NovedadDAOImpl;
import co.edu.uniandes.entity.Novedad;
import co.edu.uniandes.entity.PilaEntity;
import co.edu.uniandes.staticmodel.EstadoNovedad;
import co.edu.uniandes.staticmodel.TipoNovedad;
import co.edu.uniandes.to.EventTO;

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
	public String create(EventTO novedadTO) {
		
		String response = "";
		
		PilaEntity entity = new PilaEntity();
		Novedad novedad = new Novedad();
		novedad.setEntity(entityDAO.find(novedadTO.getCedulaEntity()));
		novedad.setEstado(EstadoNovedad.PENDIENTE);
		novedad.setFechaCreacion(novedadTO.getFechaCreacion());
		novedad.setFechaInicio(novedadTO.getFechaInicio());
		novedad.setFechaFin(novedadTO.getFechaInicio());
		novedad.setVariacionSalario(novedadTO.getVariacionSalario());
		novedad.setCantidadDiasHabiles(novedadTO.getDiasHabiles());
		
		response = novedadDAO.create(novedad).getId().toString();
		
		return response;
	}
	
	public List<Novedad> findByEntityTipo(Long idEntity, TipoNovedad tipo) {
		return novedadDAO.findByEntityTipo(idEntity, tipo);
	}
	
	public Novedad update(Novedad novedad) {
		return novedadDAO.update(novedad);
	}
	
	/**
	 * @param cedulaEntity
	 * @return
	 */
	public List<Novedad> getEventsByCedula(String cedulaEntity) {
		return novedadDAO.findNovedadesEntityByCedula(cedulaEntity);
	}
	
	public static EventLogic getEventLogic() {
		return new EventLogic(new NovedadDAOImpl(), new EntityDAOImpl());
	}
}
