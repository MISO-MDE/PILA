package co.edu.uniandes.to;

/**
 * To para la super entidad
 * @author jorge perea
 */
public class PilaSuperEntityTO {
	
	/**
	 * id del super entity
	 */
	private Long idSuperEntity;
	
	/**
	 * Nit de la super entidad
	 */
	private String NIT;
	
	/**
	 * nombre de la super entidad
	 */
	private String nombre;
	
	/**
	 * CIU de la actividad economica
	 */
	private String CIU;
	
	/**
	 * email del usuario
	 */
	private String email;
	
	/**
	 * password del usuario
	 */
	private String password;
	
	
	/**
	 * firebaseId del usuario
	 */
	private String userId;
	
	
	/**
	 * username del usuario
	 */
	private String username;
	
	/**
	 * Constructor
	 */
	public PilaSuperEntityTO() {
		
	}

	/**
	 * @return the nIT
	 */
	public String getNIT() {
		return NIT;
	}

	/**
	 * @param nIT the nIT to set
	 */
	public void setNIT(String nIT) {
		NIT = nIT;
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
	 * @return the cIU
	 */
	public String getCIU() {
		return CIU;
	}

	/**
	 * @param cIU the cIU to set
	 */
	public void setCIU(String cIU) {
		CIU = cIU;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * @return firebaseid
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param firebaseid to set
	 */
	public void setUserId(String userId) {
		this.password = userId;
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
	 * @return the idSuperEntity
	 */
	public Long getIdSuperEntity() {
		return idSuperEntity;
	}

	/**
	 * @param idSuperEntity the idSuperEntity to set
	 */
	public void setIdSuperEntity(Long idSuperEntity) {
		this.idSuperEntity = idSuperEntity;
	}
}
