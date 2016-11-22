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
 *   <li>{@link PaymentsApp.Intermediary#getSuperentities <em>Superentities</em>}</li>
 *   <li>{@link PaymentsApp.Intermediary#getBusinessValue <em>Business Value</em>}</li>
 *   <li>{@link PaymentsApp.Intermediary#getIntermediaryAttributes <em>Intermediary Attributes</em>}</li>
 *   <li>{@link PaymentsApp.Intermediary#getTemplates <em>Templates</em>}</li>
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
	 * Returns the value of the '<em><b>Superentities</b></em>' containment reference list.
	 * The list contents are of type {@link PaymentsApp.SuperEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superentities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superentities</em>' containment reference list.
	 * @see PaymentsApp.PaymentsAppPackage#getIntermediary_Superentities()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuperEntity> getSuperentities();

	/**
	 * Returns the value of the '<em><b>Business Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Value</em>' containment reference.
	 * @see #setBusinessValue(BusinessValue)
	 * @see PaymentsApp.PaymentsAppPackage#getIntermediary_BusinessValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BusinessValue getBusinessValue();

	/**
	 * Sets the value of the '{@link PaymentsApp.Intermediary#getBusinessValue <em>Business Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Value</em>' containment reference.
	 * @see #getBusinessValue()
	 * @generated
	 */
	void setBusinessValue(BusinessValue value);

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
	 * @model containment="true"
	 * @generated
	 */
	EList<DataForm> getTemplates();

} // Intermediary
