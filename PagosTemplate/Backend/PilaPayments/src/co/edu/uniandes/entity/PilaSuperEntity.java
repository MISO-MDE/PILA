package co.edu.uniandes.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Super entidad que desea realizar pagos a empleados
 * @author jorge perea
 */
@Entity
public class PilaSuperEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	/**
	 * Nit de la super entidad
	 */
	private String NIT;
	
	/**
	 * nombre de la super entidad
	 */
	private String nombre;
	
	/**
	 * codigo que representa la actividad economica
	 */
	private String CIU;
	
	/**
	 * entities asociados a la super entidad
	 */
	private List<PilaEntity> entities;
	
	/**
	 * constructor
	 */
	public PilaSuperEntity() {
		
	}

	/**
	 * @return the nIT
	 */
	public String getNIT() {
		return NIT;
	}

	/**
	 * @param nIT the nIT to set
	 */
	public void setNIT(String nIT) {
		NIT = nIT;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the cIU
	 */
	public String getCIU() {
		return CIU;
	}

	/**
	 * @param cIU the cIU to set
	 */
	public void setCIU(String cIU) {
		CIU = cIU;
	}

	/**
	 * @return the entities
	 */
	@OneToMany(mappedBy="superEntidad")
	public List<PilaEntity> getEntities() {
		return entities;
	}

	/**
	 * @param entities the entities to set
	 */
	public void setEntities(List<PilaEntity> entities) {
		this.entities = entities;
	}
}
