/**
 */
package PaymentsApp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.Participant#getParticipantprofile <em>Participantprofile</em>}</li>
 *   <li>{@link PaymentsApp.Participant#getName <em>Name</em>}</li>
 *   <li>{@link PaymentsApp.Participant#getBusinessattributecollection <em>Businessattributecollection</em>}</li>
 * </ul>
 *
 * @see PaymentsApp.PaymentsAppPackage#getParticipant()
 * @model
 * @generated
 */
public interface Participant extends EObject {
	/**
	 * Returns the value of the '<em><b>Participantprofile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participantprofile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participantprofile</em>' reference.
	 * @see #setParticipantprofile(ParticipantProfile)
	 * @see PaymentsApp.PaymentsAppPackage#getParticipant_Participantprofile()
	 * @model required="true"
	 * @generated
	 */
	ParticipantProfile getParticipantprofile();

	/**
	 * Sets the value of the '{@link PaymentsApp.Participant#getParticipantprofile <em>Participantprofile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participantprofile</em>' reference.
	 * @see #getParticipantprofile()
	 * @generated
	 */
	void setParticipantprofile(ParticipantProfile value);

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
	 * @see PaymentsApp.PaymentsAppPackage#getParticipant_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PaymentsApp.Participant#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Businessattributecollection</b></em>' containment reference list.
	 * The list contents are of type {@link PaymentsApp.BusinessAttributeCollection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Businessattributecollection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Businessattributecollection</em>' containment reference list.
	 * @see PaymentsApp.PaymentsAppPackage#getParticipant_Businessattributecollection()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessAttributeCollection> getBusinessattributecollection();

} // Participant
