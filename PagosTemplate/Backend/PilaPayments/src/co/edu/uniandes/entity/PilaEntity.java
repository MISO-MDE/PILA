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

import com.fasterxml.jackson.annotation.JsonProperty;

import co.edu.uniandes.staticmodel.ActividadEconomica;
import co.edu.uniandes.staticmodel.TipoPension;
import co.edu.uniandes.staticmodel.TipoPensionado;

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
	private long cedula;
	
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
	 * tipo pension
	 */
	private TipoPension tipoPension;
	
	/**
	 * tipo pensionado
	 */
	private TipoPensionado tipoPensionado;
	
	/**
	 * Pais en el que reside
	 */
	private Long pais;
	
	/**
	 * pais del grup familiar
	 */
	private Long paisGrupoFamiliar;
	
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
	public long getCedula() {
		return cedula;
	}

	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(long cedula) {
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
	 * @return el tipo de pension
	 */	
	@Enumerated(EnumType.STRING)
	public TipoPension getTipoPension(){
		return tipoPension;
	}
	
	/**
	 * @param tipoPension the tipoPension to set
	 */
	public void setTipoPension(TipoPension tipoPension){
		this.tipoPension = tipoPension;
	}
	
	/**
	 * @return el tipo de pensionado
	 */	
	@Enumerated(EnumType.STRING)
	public TipoPensionado getTipoPensionado(){
		return tipoPensionado;
	}
	
	/**
	 * @param tipoPensionado the tipoPensionado to set
	 */
	public void setTipoPensionado(TipoPensionado tipoPensionado){
		this.tipoPensionado = tipoPensionado;
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
	//@OneToOne
	//@JoinColumn(name="pais_id")
	public Long getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(Long pais) {
		this.pais = pais;
	}

	/**
	 * @return the paisGrupoFamiliar
	 */	
	//@OneToOne
	//@JoinColumn(name="pais_idGrupo")
	public Long getPaisGrupoFamiliar() {
		return paisGrupoFamiliar;
	}

	/**
	 * @param paisGrupoFamiliar the paisGrupoFamiliar to set
	 */
	public void setPaisGrupoFamiliar(Long paisGrupoFamiliar) {
		this.paisGrupoFamiliar = paisGrupoFamiliar;
	}
}
