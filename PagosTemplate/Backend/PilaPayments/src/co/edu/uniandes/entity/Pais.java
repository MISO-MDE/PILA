package co.edu.uniandes.entity;

import java.util.List;

import javax.persistence.Entity;

/**
 * Entityq ue representa un pais
 * @author jorge perea
 */
@Entity
public class Pais {
	
	/**
	 * Nombre del pais
	 */
	private String nombre;
	
	/**
	 * ciudades que lo conforman
	 */
	private List<String> ciudades;
	
	/**
	 * Constructor
	 */
	public Pais() {
		
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
	 * @return the ciudades
	 */
	public List<String> getCiudades() {
		return ciudades;
	}

	/**
	 * @param ciudades the ciudades to set
	 */
	public void setCiudades(List<String> ciudades) {
		this.ciudades = ciudades;
	}
	
}
