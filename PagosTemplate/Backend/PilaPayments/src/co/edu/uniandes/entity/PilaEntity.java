package co.edu.uniandes.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import co.edu.uniandes.staticmodel.ActividadEconomica;

/**
 * representa una entidad asociada a una super entidad de PILA
 * @author jorge perea
 */
@Entity
public class PilaEntity {
	
	/**
	 * id de la entidad
	 */
	private Long id;
	
	/**
	 * cedula del entity
	 */
	private int cedula;
	
	/**
	 * nombre
	 */
	private String nombre;
	
	/**
	 * apellido
	 */
	private String apellido;
	
	/**
	 * salario
	 */
	private double salario;
	
	/**
	 * Pais en el que reside
	 */
	private Pais pais;
	
	/**
	 * pais del grup familiar
	 */
	private Pais paisGrupoFamiliar;
	
	/**
	 * actividad economica
	 */
	private ActividadEconomica actividad;
	
	/**
	 * super entidad a la que pertenece
	 */
	private PilaSuperEntity superEntidad;
	
	/**
	 * Constructor
	 */
	public PilaEntity() {
		
	}

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the cedula
	 */
	public int getCedula() {
		return cedula;
	}

	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(int cedula) {
		this.cedula = cedula;
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
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * @return the actividad
	 */
	@Enumerated(EnumType.STRING)
	public ActividadEconomica getActividad() {
		return actividad;
	}

	/**
	 * @param actividad the actividad to set
	 */
	public void setActividad(ActividadEconomica actividad) {
		this.actividad = actividad;
	}

	/**
	 * @return the superEntidad
	 */
	@ManyToOne
	@JoinColumn(name="pilaSuperEntity_id")
	public PilaSuperEntity getSuperEntidad() {
		return superEntidad;
	}

	/**
	 * @param superEntidad the superEntidad to set
	 */
	public void setSuperEntidad(PilaSuperEntity superEntidad) {
		this.superEntidad = superEntidad;
	}

	/**
	 * @return the pais
	 */
	@OneToOne
	@JoinColumn(name="pais_id")
	public Pais getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(Pais pais) {
		this.pais = pais;
	}

	/**
	 * @return the paisGrupoFamiliar
	 */
	@OneToOne
	@JoinColumn(name="pais_idGrupo")
	public Pais getPaisGrupoFamiliar() {
		return paisGrupoFamiliar;
	}

	/**
	 * @param paisGrupoFamiliar the paisGrupoFamiliar to set
	 */
	public void setPaisGrupoFamiliar(Pais paisGrupoFamiliar) {
		this.paisGrupoFamiliar = paisGrupoFamiliar;
	}
}
