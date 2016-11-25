package co.edu.uniandes.businesslogic;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import co.edu.uniandes.dao.ActividadEconomicaDAO;
import co.edu.uniandes.dao.EntityDAO;
import co.edu.uniandes.dao.SuperEntityDAO;
import co.edu.uniandes.dao.TipoPensionDAO;
import co.edu.uniandes.dao.TipoPensionadoDAO;
import co.edu.uniandes.entity.PilaEntity;
import co.edu.uniandes.to.EntityTO;

/**
 * Logica del super entity
 * @author Rafa
 */
public class EntityLogic {

	private EntityDAO entityDAO;
	private SuperEntityDAO superEntityDAO;
	private TipoPensionDAO pensionDAO;
	private TipoPensionadoDAO pensionadoDAO;
	
	private static final Logger logger = LogManager.getLogger(EntityLogic.class);
	
	/**
	 * Constructor
	 * @param dao
	 */
	
	public EntityLogic(EntityDAO entityDAO, SuperEntityDAO superEntityDAO, TipoPensionDAO pensionDAO, TipoPensionadoDAO pensionadoDAO){
		this.entityDAO = entityDAO;
		this.superEntityDAO = superEntityDAO;
		this.pensionDAO = pensionDAO;
		this.pensionadoDAO = pensionadoDAO;
	}
	
	/**
	 * Crear Entidad
	 * @param entityTO
	 */
	public String update(EntityTO entityTO){		
		String response = "";		
		PilaEntity entity = new PilaEntity();
		entity.setCedula(entityTO.getCedula());
		entity.setNombre(entityTO.getNombre());
		entity.setApellido(entityTO.getApellido());
		entity.setSalario(entityTO.getSalario());
		entity.setTipoPension(pensionDAO.find(entityTO.getTipoPension()));
		entity.setTipoPensionado(pensionadoDAO.find(entityTO.getTipoPensionado()));
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
	public String create(EntityTO entityTO){
		
		String response = "";
		
		PilaEntity entity = new PilaEntity();
		entity.setCedula(entityTO.getCedula());
		entity.setNombre(entityTO.getNombre());
		entity.setApellido(entityTO.getApellido());
		entity.setSalario(entityTO.getSalario());
		entity.setTipoPension(pensionDAO.find(entityTO.getTipoPension()));
		entity.setTipoPensionado(pensionadoDAO.find(entityTO.getTipoPensionado()));
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
	public List<PilaEntity> findAll() {
		return entityDAO.findAll();
	}
	
	/**
	 * retorna la entidad por id
	 * @return
	 */
	public PilaEntity find(long id) {
		return entityDAO.find(id);
	}	
}
