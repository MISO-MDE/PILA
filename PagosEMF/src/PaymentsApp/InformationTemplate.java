/**
 */
package PaymentsApp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.InformationTemplate#getParticipantsFields <em>Participants Fields</em>}</li>
 *   <li>{@link PaymentsApp.InformationTemplate#getProvidersFields <em>Providers Fields</em>}</li>
 *   <li>{@link PaymentsApp.InformationTemplate#getName <em>Name</em>}</li>
 *   <li>{@link PaymentsApp.InformationTemplate#getDescription <em>Description</em>}</li>
 *   <li>{@link PaymentsApp.InformationTemplate#getBusinessFields <em>Business Fields</em>}</li>
 * </ul>
 *
 * @see PaymentsApp.PaymentsAppPackage#getInformationTemplate()
 * @model
 * @generated
 */
public interface InformationTemplate extends EObject {
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
	 * @see PaymentsApp.PaymentsAppPackage#getInformationTemplate_ParticipantsFields()
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
	 * @see PaymentsApp.PaymentsAppPackage#getInformationTemplate_ProvidersFields()
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
	 * @see PaymentsApp.PaymentsAppPackage#getInformationTemplate_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PaymentsApp.InformationTemplate#getName <em>Name</em>}' attribute.
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
	 * @see PaymentsApp.PaymentsAppPackage#getInformationTemplate_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link PaymentsApp.InformationTemplate#getDescription <em>Description</em>}' attribute.
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
	 * @see PaymentsApp.PaymentsAppPackage#getInformationTemplate_BusinessFields()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessAttributeCollection> getBusinessFields();

} // InformationTemplate
