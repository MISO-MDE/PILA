package co.edu.uniandes.businesslogic;

import java.util.List;

import co.edu.uniandes.dao.SuperEntityDAO;
import co.edu.uniandes.dao.SuperEntityUserDAO;
import co.edu.uniandes.entity.PilaSuperEntity;
import co.edu.uniandes.entity.PilaUserSuperEntity;
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
		PilaSuperEntity superEntity= new PilaSuperEntity();
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
		PilaUserSuperEntity user = new PilaUserSuperEntity();
		
		PilaSuperEntity superEntity = superDAO.findSuperEntityById(superTO.getIdSuperEntity());
		
		user.setEmail(superTO.getEmail());
		user.setUsername(superTO.getUsername());
		user.setPassword(superTO.getPassword());
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
		
		PilaSuperEntity superEntity = superDAO.findSuperEntityById(superTO.getIdSuperEntity());
		
		return "";
	}
	
	/**
	 * retorna las super entidades del sistema
	 * @return
	 */
	public List<PilaSuperEntity> getSuperEntities() {
		return superDAO.findAllSuperEntity();
	}
}
