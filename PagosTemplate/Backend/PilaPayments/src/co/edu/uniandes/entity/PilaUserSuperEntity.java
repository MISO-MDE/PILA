package co.edu.uniandes.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * Usuario administrador de super entity
 * @author jorge perea
 */
@Entity
public class PilaUserSuperEntity extends PilaUser{
	
	/**
	 * super entidad a la cual esta asociada 
	 */
	private PilaSuperEntity superEntity;
	
	/**
	 *constructor
	 */
	public PilaUserSuperEntity() {
		super();
	}

	/**
	 * @return the superEntity
	 */
	@OneToOne
	@JoinColumn(name="superEntity_id")
	public PilaSuperEntity getSuperEntity() {
		return superEntity;
	}

	/**
	 * @param superEntity the superEntity to set
	 */
	public void setSuperEntity(PilaSuperEntity superEntity) {
		this.superEntity = superEntity;
	}
}
