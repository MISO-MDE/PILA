/**
 */
package PaymentsApp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intermediary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.Intermediary#getName <em>Name</em>}</li>
 *   <li>{@link PaymentsApp.Intermediary#getDescription <em>Description</em>}</li>
 *   <li>{@link PaymentsApp.Intermediary#getProviders <em>Providers</em>}</li>
 *   <li>{@link PaymentsApp.Intermediary#getSuperentity <em>Superentity</em>}</li>
 *   <li>{@link PaymentsApp.Intermediary#getTemplates <em>Templates</em>}</li>
 *   <li>{@link PaymentsApp.Intermediary#getParticipantProfiles <em>Participant Profiles</em>}</li>
 *   <li>{@link PaymentsApp.Intermediary#getIntermediaryAttributes <em>Intermediary Attributes</em>}</li>
 * </ul>
 *
 * @see PaymentsApp.PaymentsAppPackage#getIntermediary()
 * @model
 * @generated
 */
public interface Intermediary extends EObject {
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
	 * @see PaymentsApp.PaymentsAppPackage#getIntermediary_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PaymentsApp.Intermediary#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see PaymentsApp.PaymentsAppPackage#getIntermediary_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link PaymentsApp.Intermediary#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Providers</b></em>' containment reference list.
	 * The list contents are of type {@link PaymentsApp.Provider}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Providers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providers</em>' containment reference list.
	 * @see PaymentsApp.PaymentsAppPackage#getIntermediary_Providers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Provider> getProviders();

	/**
	 * Returns the value of the '<em><b>Superentity</b></em>' containment reference list.
	 * The list contents are of type {@link PaymentsApp.SuperEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superentity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superentity</em>' containment reference list.
	 * @see PaymentsApp.PaymentsAppPackage#getIntermediary_Superentity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SuperEntity> getSuperentity();

	/**
	 * Returns the value of the '<em><b>Templates</b></em>' containment reference list.
	 * The list contents are of type {@link PaymentsApp.DataForm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Templates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Templates</em>' containment reference list.
	 * @see PaymentsApp.PaymentsAppPackage#getIntermediary_Templates()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DataForm> getTemplates();

	/**
	 * Returns the value of the '<em><b>Participant Profiles</b></em>' containment reference list.
	 * The list contents are of type {@link PaymentsApp.ParticipantProfile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Profiles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Profiles</em>' containment reference list.
	 * @see PaymentsApp.PaymentsAppPackage#getIntermediary_ParticipantProfiles()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ParticipantProfile> getParticipantProfiles();

	/**
	 * Returns the value of the '<em><b>Intermediary Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link PaymentsApp.BusinessAttributeCollection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediary Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediary Attributes</em>' containment reference list.
	 * @see PaymentsApp.PaymentsAppPackage#getIntermediary_IntermediaryAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessAttributeCollection> getIntermediaryAttributes();

} // Intermediary
