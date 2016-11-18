package co.edu.uniandes.businesslogic;

import java.util.Arrays;
import java.util.List;

import co.edu.uniandes.dao.EntityDAO;
import co.edu.uniandes.dao.PaisDAO;
import co.edu.uniandes.dao.SuperEntityDAO;
import co.edu.uniandes.entity.PilaEntity;
import co.edu.uniandes.entity.PilaSuperEntity;
import co.edu.uniandes.rest.api.EntityManager;
import co.edu.uniandes.staticmodel.ActividadEconomica;
import co.edu.uniandes.staticmodel.TipoPension;
import co.edu.uniandes.staticmodel.TipoPensionado;
import co.edu.uniandes.to.PilaEntityTO;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Logica del super entity
 * @author Rafa
 */
public class EntityLogic {

	private EntityDAO entityDAO;
	private SuperEntityDAO superEntityDAO;
	private PaisDAO paisDAO;
	
	private static final Logger logger = LogManager.getLogger(EntityLogic.class);
	
	/**
	 * Constructor
	 * @param dao
	 */
	
	public EntityLogic(EntityDAO entityDAO, SuperEntityDAO superEntityDAO, PaisDAO paisDAO){
		this.entityDAO = entityDAO;
		this.superEntityDAO = superEntityDAO;
		this.paisDAO = paisDAO;
	}
	
	/**
	 * Crear Entidad
	 * @param entityTO
	 */
	public String update(PilaEntityTO entityTO){		
		String response = "";		
		PilaEntity entity = new PilaEntity();
		entity.setCedula(entityTO.getCedula());
		entity.setNombre(entityTO.getNombre());
		entity.setApellido(entityTO.getApellido());
		entity.setSalario(entityTO.getSalario());
		entity.setTipoPension(entityTO.getTipoPension());
		entity.setTipoPensionado(entityTO.getTipoPensionado());
		entity.setActividad(entityTO.getActividad());
		entity.setSuperEntidad(superEntityDAO.findSuperEntityById(entityTO.getSuperEntidad()));
		entity.setPais(entityTO.getPais());
		entity.setPaisGrupoFamiliar(entityTO.getPaisGrupoFamiliar());		
		entity = entityDAO.update(entity);		
		response = entity.getId().toString();		
		return response;
	}
	
	
	/**
	 * Crear Entidad
	 * @param entityTO
	 */
	public String crearEntity(PilaEntityTO entityTO){
		
		String response = "";
		
		PilaEntity entity = new PilaEntity();
		entity.setCedula(entityTO.getCedula());
		entity.setNombre(entityTO.getNombre());
		entity.setApellido(entityTO.getApellido());
		entity.setSalario(entityTO.getSalario());
		entity.setTipoPension(entityTO.getTipoPension());
		entity.setTipoPensionado(entityTO.getTipoPensionado());
		entity.setActividad(entityTO.getActividad());
		entity.setSuperEntidad(superEntityDAO.findSuperEntityById(entityTO.getSuperEntidad()));
		entity.setPais(entityTO.getPais());
		entity.setPaisGrupoFamiliar(entityTO.getPaisGrupoFamiliar());
		
		entity = entityDAO.create(entity);
		
		response = entity.getId().toString();
		
		return response;
	}
	
	public String delete(Long id){		
		String response = "";		
		PilaEntity entity = entityDAO.findEntityById(id);
		if(entity != null){
			entityDAO.deleteEntity(entity);	
			response = id+"";		
		}
		return response;
	}
	
	/**
	 * retorna las entidades del sistema
	 * @return
	 */
	public List<PilaEntity> getEntities() {
		return entityDAO.findAllEntity();
	}
	
	/**
	 * retorna la entidad por id
	 * @return
	 */
	public PilaEntity getEntitiesById(long id) {
		return entityDAO.findEntity(id);
	}	
	
	/**
	 * Retorna las actividades economicas definidas en el sistema
	 * @return actividades economicas
	 */
	public List<ActividadEconomica> getEconActivities() {
		return Arrays.asList(ActividadEconomica.values());
	}
	
	/**
	 * Retorna los tipos de pension definidos en el sistema
	 * @return actividades economicas
	 */
	public List<TipoPension> getTiposPension() {
		return Arrays.asList(TipoPension.values());
	}
	
	/**
	 * Retorna los tipos de pensionado definidos en el sistema
	 * @return actividades economicas
	 */
	public List<TipoPensionado> getTiposPensionado() {
		return Arrays.asList(TipoPensionado.values());
	}
}
