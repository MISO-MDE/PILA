/**
 */
package PaymentsApp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.DataForm#getParticipantsFields <em>Participants Fields</em>}</li>
 *   <li>{@link PaymentsApp.DataForm#getProvidersFields <em>Providers Fields</em>}</li>
 *   <li>{@link PaymentsApp.DataForm#getName <em>Name</em>}</li>
 *   <li>{@link PaymentsApp.DataForm#getDescription <em>Description</em>}</li>
 *   <li>{@link PaymentsApp.DataForm#getBusinessFields <em>Business Fields</em>}</li>
 * </ul>
 *
 * @see PaymentsApp.PaymentsAppPackage#getDataForm()
 * @model
 * @generated
 */
public interface DataForm extends EObject {
	/**
	 * Returns the value of the '<em><b>Participants Fields</b></em>' reference list.
	 * The list contents are of type {@link PaymentsApp.ParticipantProfile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participants Fields</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants Fields</em>' reference list.
	 * @see PaymentsApp.PaymentsAppPackage#getDataForm_ParticipantsFields()
	 * @model required="true"
	 * @generated
	 */
	EList<ParticipantProfile> getParticipantsFields();

	/**
	 * Returns the value of the '<em><b>Providers Fields</b></em>' reference list.
	 * The list contents are of type {@link PaymentsApp.Provider}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Providers Fields</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providers Fields</em>' reference list.
	 * @see PaymentsApp.PaymentsAppPackage#getDataForm_ProvidersFields()
	 * @model required="true"
	 * @generated
	 */
	EList<Provider> getProvidersFields();

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
	 * @see PaymentsApp.PaymentsAppPackage#getDataForm_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PaymentsApp.DataForm#getName <em>Name</em>}' attribute.
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
	 * @see PaymentsApp.PaymentsAppPackage#getDataForm_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link PaymentsApp.DataForm#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Business Fields</b></em>' containment reference list.
	 * The list contents are of type {@link PaymentsApp.BusinessAttributeCollection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Fields</em>' containment reference list.
	 * @see PaymentsApp.PaymentsAppPackage#getDataForm_BusinessFields()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessAttributeCollection> getBusinessFields();

} // DataForm
