package co.edu.uniandes.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entityq ue representa un pais
 * @author jorge perea
 */
@Entity
public class Pais {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
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
