package co.edu.uniandes.to;

/**
 * TO para el usuario de pila
 * @author jorge perea
 */
public class PilaUserTO {
	
	/**
	 * id del usuario
	 */
	private String idDb;
	
	/*
	 * 
	 */
	private String superEntityId;
	
	/**
	 * 
	 */
	private String userId;
	
	/**
	 * 
	 */
	private String email;
	
	/**
	 * 
	 */
	private String password;
	
	/**
	 * 
	 */
	private String rolename;
	
	/**
	 * constructor
	 */
	public PilaUserTO() {
		
	}

	/**
	 * @return the idDb
	 */
	public String getIdDb() {
		return idDb;
	}

	/**
	 * @param idDb the idDb to set
	 */
	public void setIdDb(String idDb) {
		this.idDb = idDb;
	}

	/**
	 * @return the superEntityId
	 */
	public String getSuperEntityId() {
		return superEntityId;
	}

	/**
	 * @param superEntityId the superEntityId to set
	 */
	public void setSuperEntityId(String superEntityId) {
		this.superEntityId = superEntityId;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
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
	 * @return the rolename
	 */
	public String getRolename() {
		return rolename;
	}

	/**
	 * @param rolename the rolename to set
	 */
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
}
