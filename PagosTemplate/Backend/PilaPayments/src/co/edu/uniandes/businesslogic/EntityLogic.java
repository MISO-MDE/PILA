package co.edu.uniandes.businesslogic;

import java.util.List;

import co.edu.uniandes.dao.EntityDAO;
import co.edu.uniandes.entity.PilaEntity;
import co.edu.uniandes.entity.PilaSuperEntity;
import co.edu.uniandes.to.PilaEntityTO;


/**
 * Logica del super entity
 * @author Rafa
 */
public class EntityLogic {

	private EntityDAO entityDAO;
	
	/**
	 * Constructor
	 * @param dao
	 */
	
	public EntityLogic(EntityDAO entityDAO){
	
		this.entityDAO = entityDAO;
	}
	
	/**
	 * Crear Entidad
	 * @param entityTO
	 */
	public String crearEntity(PilaEntityTO entityTO){
		
		String response = "";
		
		PilaEntity entity = new PilaEntity();
		entity.setCedula(entityTO.getCedula());
		entity.setNombre(entity.getNombre());
		entity.setApellido(entityTO.getApellido());
		entity.setSalario(entityTO.getSalario());
		entity.setTipoPension(entityTO.getTipoPension());
		entity.setTipoPensionado(entityTO.getTipoPensionado());
		entity.setActividad(entityTO.getActividad());
		entity.setSuperEntidad(entityTO.getSuperEntidad());
		entity.setPais(entityTO.getPais());
		entity.setPaisGrupoFamiliar(entityTO.getPaisGrupoFamiliar());
		
		entity = entityDAO.create(entity);
		
		response = entity.getId().toString();
		
		return response;
	}
	
	public String borrarEntity(PilaEntityTO entityTO){
		
		String response = "";
		
		PilaEntity entity = new PilaEntity();
		entity.setCedula(entityTO.getCedula());
		entity.setNombre(entity.getNombre());
		entity.setApellido(entityTO.getApellido());
		entity.setSalario(entityTO.getSalario());
		entity.setTipoPension(entityTO.getTipoPension());
		entity.setTipoPensionado(entityTO.getTipoPensionado());
		entity.setActividad(entityTO.getActividad());
		entity.setSuperEntidad(entityTO.getSuperEntidad());
		entity.setPais(entityTO.getPais());
		entity.setPaisGrupoFamiliar(entityTO.getPaisGrupoFamiliar());
		
		String id = entity.getId().toString();
		
		entityDAO.deleteEntity(entity);
		
		response = id;
		
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
}
