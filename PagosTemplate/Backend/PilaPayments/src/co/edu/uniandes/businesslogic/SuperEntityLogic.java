package co.edu.uniandes.businesslogic;

import java.util.Arrays;
import java.util.List;

import co.edu.uniandes.dao.SuperEntityDAO;
import co.edu.uniandes.dao.SuperEntityUserDAO;
import co.edu.uniandes.entity.SuperEntity;
import co.edu.uniandes.entity.UserSuperEntity;
import co.edu.uniandes.staticmodel.ActividadEconomica;
import co.edu.uniandes.to.PilaSuperEntityTO;

/**
 * Logica del super entity
 * @author jorge perea
 */
public class SuperEntityLogic {

	/**
	 * dao de super entidad
	 */
	private SuperEntityDAO superDAO;
	
	/**
	 * dao usuario de super entidad
	 */
	private SuperEntityUserDAO userDAO;
	
	/**
	 * Constructor
	 * @param dao
	 */
	public SuperEntityLogic(SuperEntityDAO superDAO, SuperEntityUserDAO userDAO) {
		this.superDAO = superDAO;
		this.userDAO = userDAO;
	}
	
	/**
	 * crea una super entidad
	 * @param superTO
	 */
	public String createSuperEntity(PilaSuperEntityTO superTO) {
		
		// se crea la super entidad
		SuperEntity superEntity= new SuperEntity();
		superEntity.setNIT(superTO.getNIT());
		superEntity.setNombre(superTO.getNombre());
		superEntity.setActividad(ActividadEconomica.getActividadByCIIU((superTO.getCIU())));
		
		superEntity = superDAO.create(superEntity);	
		
		return superEntity.getId().toString();
	}
	
	/**
	 * crea un usuario para el intermediario
	 * @param superTO
	 * @return
	 */
	public String createSuperEntityUser(PilaSuperEntityTO superTO) {
		
		String respuesta = "";
		
		//se crea el usuario
		UserSuperEntity user = new UserSuperEntity();
		
		SuperEntity superEntity = superDAO.findSuperEntityById(superTO.getIdSuperEntity());
		
		user.setEmail(superTO.getEmail());
		user.setUsername(superTO.getUsername());
		user.setUserId(superTO.getUserId()); // Guarda el id de firebase
		user.setSuperEntity(superEntity);
		
		user = userDAO.create(user);
		
		if(user.getId() != null) {
			respuesta = "ok";
		} else {
			respuesta = "error al crear usuario";
		}
		
		return respuesta;
	}
	
	/**
	 * Actualiza la superEntidad
	 * @return super entidad actualizada
	 */
	public String updateSuperEntityUser(PilaSuperEntityTO superTO) {
		
		SuperEntity superEntity = superDAO.findSuperEntityById(superTO.getIdSuperEntity());
		String response = "SuperEntity not updated";
		if(superEntity != null) {
		
			if(!superTO.getNombre().isEmpty()) {
				superEntity.setNombre(superTO.getNombre());
			} 
			
			if(!superTO.getNIT().isEmpty()) {
				superEntity.setNIT(superTO.getNIT());
			}
			
			if(!superTO.getCIU().isEmpty()) {
				superEntity.setActividad(ActividadEconomica.getActividadByCIIU((superTO.getCIU())));
			}
			
			superDAO.update(superEntity).getId();
			response = "SuperEntity updated";
		}
		
		return response;
	}
	
	/**
	 * elimina un super entity
	 * @param id
	 */
	public void removeSuperEntity(Long id) {
		SuperEntity superEntity = superDAO.findSuperEntityById(id);
		superDAO.deleteEntity(superEntity);
	}
	
	/**
	 * retorna las super entidades del sistema
	 * @return
	 */
	public List<SuperEntity> getSuperEntities() {
		return superDAO.findAllSuperEntity();
	}
	
	/**
	 * retorna las super entidad por id
	 * @return
	 */
	public SuperEntity getSuperEntitiesById(long id) {
		return superDAO.findSuperEntityById(id);
	}
	
	/**
	 * Retorna las actividades economicas definidas en el sistema
	 * @return actividades economicas
	 */
	public List<ActividadEconomica> getEconActivities() {
		return Arrays.asList(ActividadEconomica.values());
	}
}
