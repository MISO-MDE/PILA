package co.edu.uniandes.to;

/**
 * To para la entidad
 * @author Rafa
 */
public class EntityTO {

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
	private Long tipoPension;
	
	/**
	 * tipo pensionado
	 */
	private Long tipoPensionado;
	
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
	private Long actividad;
	
	/**
	 * super entidad a la que pertenece
	 */
	private Long superEntidad;
	
	/**
	 * Constructor
	 */
	public EntityTO() {	}
	
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
	public Long getTipoPension(){
		return tipoPension;
	}
	
	/**
	 * @param tipoPension the tipoPension to set
	 */
	public void setTipoPension(Long tipoPension){
		this.tipoPension = tipoPension;
	}
	
	/**
	 * @return el tipo de pensionado
	 */
	public Long getTipoPensionado(){
		return tipoPensionado;
	}
	
	/**
	 * @param tipoPensionado the tipoPensionado to set
	 */
	public void setTipoPensionado(Long tipoPensionado){
		this.tipoPensionado = tipoPensionado;
	}
	
	/**
	 * @return the actividad
	 */
	public Long getActividad() {
		return actividad;
	}

	/**
	 * @param actividad the actividad to set
	 */
	public void setActividad(Long actividad) {
		this.actividad = actividad;
	}

	/**
	 * @return the superEntidad
	 */
	public Long getSuperEntidad() {
		return superEntidad;
	}

	/**
	 * @param superEntidad the superEntidad to set
	 */
	public void setSuperEntidad(Long superEntidad) {
		this.superEntidad = superEntidad;
	}

	/**
	 * @return the pais
	 */
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

