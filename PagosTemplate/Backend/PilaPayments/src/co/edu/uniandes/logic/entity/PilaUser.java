package co.edu.uniandes.logic.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entidad que representa un ususario que utiliza la aplicacion
 * @author Jorge Perea
 */
@Entity
public class PilaUser implements Serializable{
	
	/**
	 * id del usuario
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	/**
	 * Nombre del usuario
	 */
	private String nombre;
	
	/**
	 * Username del usuario
	 */
	private String username;
	
	/**
	 * Password del usuario
	 */
	private String password;
	
	/**
	 * Rol que tiene el usuario y le permite realizar ciertas acciones
	 */
	private RolUser rolUser;
	
	/**
	 * Constructor
	 */
	public PilaUser() {
		
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
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the rolUser
	 */
	public RolUser getRolUser() {
		return rolUser;
	}

	/**
	 * @param rolUser the rolUser to set
	 */
	public void setRolUser(RolUser rolUser) {
		this.rolUser = rolUser;
	}	
}
