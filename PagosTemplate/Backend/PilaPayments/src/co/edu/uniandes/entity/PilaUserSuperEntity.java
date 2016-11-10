package co.edu.uniandes.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * Usuario administrador de super entity
 * @author jorge perea
 */
@Entity
@PrimaryKeyJoinColumn(name = "super_id", referencedColumnName = "user_id")
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
