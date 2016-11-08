package co.edu.uniandes.to;

import co.edu.uniandes.entity.Pais;
import co.edu.uniandes.entity.PilaSuperEntity;
import co.edu.uniandes.staticmodel.ActividadEconomica;
import co.edu.uniandes.staticmodel.TipoPension;
import co.edu.uniandes.staticmodel.TipoPensionado;

/**
 * To para la entidad
 * @author Rafa
 */
public class PilaEntityTO {

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
	public PilaEntityTO() {	}
	
	/**
	 * @return the id
	 */
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
	 * @return el tipo de pension
	 */
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

