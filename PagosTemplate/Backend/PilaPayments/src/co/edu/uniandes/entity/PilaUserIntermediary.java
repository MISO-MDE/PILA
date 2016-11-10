package co.edu.uniandes.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * Usuario intermediario
 * @author Jorge Perea
 */
@Entity
@PrimaryKeyJoinColumn(name = "intermediary_id", referencedColumnName = "user_id")
public class PilaUserIntermediary extends PilaUser{

	/**
	 * Constructor
	 */
	public PilaUserIntermediary() {
		super();
	}
	
}
