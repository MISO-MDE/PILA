/**
 */
package PaymentsApp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.ParticipantProfile#getName <em>Name</em>}</li>
 *   <li>{@link PaymentsApp.ParticipantProfile#getParticipantAttributes <em>Participant Attributes</em>}</li>
 * </ul>
 *
 * @see PaymentsApp.PaymentsAppPackage#getParticipantProfile()
 * @model
 * @generated
 */
public interface ParticipantProfile extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see PaymentsApp.PaymentsAppPackage#getParticipantProfile_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PaymentsApp.ParticipantProfile#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Participant Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Attributes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Attributes</em>' containment reference.
	 * @see #setParticipantAttributes(BusinessAttributeCollection)
	 * @see PaymentsApp.PaymentsAppPackage#getParticipantProfile_ParticipantAttributes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BusinessAttributeCollection getParticipantAttributes();

	/**
	 * Sets the value of the '{@link PaymentsApp.ParticipantProfile#getParticipantAttributes <em>Participant Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant Attributes</em>' containment reference.
	 * @see #getParticipantAttributes()
	 * @generated
	 */
	void setParticipantAttributes(BusinessAttributeCollection value);

} // ParticipantProfile
