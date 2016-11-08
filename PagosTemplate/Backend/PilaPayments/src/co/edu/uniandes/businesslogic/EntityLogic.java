package co.edu.uniandes.businesslogic;

import co.edu.uniandes.dao.EntityDAO;
import co.edu.uniandes.entity.PilaEntity;
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
		entity.setTipoPension(entity.getTipoPension());
		
		return response;
	}
}