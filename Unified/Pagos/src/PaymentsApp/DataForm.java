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
 *   <li>{@link PaymentsApp.DataForm#getName <em>Name</em>}</li>
 *   <li>{@link PaymentsApp.DataForm#getSuperEntityAttributes <em>Super Entity Attributes</em>}</li>
 *   <li>{@link PaymentsApp.DataForm#getBusinessFields <em>Business Fields</em>}</li>
 * </ul>
 *
 * @see PaymentsApp.PaymentsAppPackage#getDataForm()
 * @model
 * @generated
 */
public interface DataForm extends EObject {
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
	 * Returns the value of the '<em><b>Super Entity Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link PaymentsApp.BusinessAttributeCollection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Entity Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Entity Attributes</em>' containment reference list.
	 * @see PaymentsApp.PaymentsAppPackage#getDataForm_SuperEntityAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessAttributeCollection> getSuperEntityAttributes();

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
