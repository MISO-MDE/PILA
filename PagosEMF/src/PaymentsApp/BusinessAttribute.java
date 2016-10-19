/**
 */
package PaymentsApp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.BusinessAttribute#getName <em>Name</em>}</li>
 *   <li>{@link PaymentsApp.BusinessAttribute#getBusinessCategory <em>Business Category</em>}</li>
 *   <li>{@link PaymentsApp.BusinessAttribute#getBusinessRules <em>Business Rules</em>}</li>
 *   <li>{@link PaymentsApp.BusinessAttribute#getBusinessValue <em>Business Value</em>}</li>
 * </ul>
 *
 * @see PaymentsApp.PaymentsAppPackage#getBusinessAttribute()
 * @model
 * @generated
 */
public interface BusinessAttribute extends EObject {
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
	 * @see PaymentsApp.PaymentsAppPackage#getBusinessAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PaymentsApp.BusinessAttribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Business Category</b></em>' attribute.
	 * The literals are from the enumeration {@link PaymentsApp.BusinessCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Category</em>' attribute.
	 * @see PaymentsApp.BusinessCategory
	 * @see #setBusinessCategory(BusinessCategory)
	 * @see PaymentsApp.PaymentsAppPackage#getBusinessAttribute_BusinessCategory()
	 * @model
	 * @generated
	 */
	BusinessCategory getBusinessCategory();

	/**
	 * Sets the value of the '{@link PaymentsApp.BusinessAttribute#getBusinessCategory <em>Business Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Category</em>' attribute.
	 * @see PaymentsApp.BusinessCategory
	 * @see #getBusinessCategory()
	 * @generated
	 */
	void setBusinessCategory(BusinessCategory value);

	/**
	 * Returns the value of the '<em><b>Business Rules</b></em>' containment reference list.
	 * The list contents are of type {@link PaymentsApp.BusinessRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Rules</em>' containment reference list.
	 * @see PaymentsApp.PaymentsAppPackage#getBusinessAttribute_BusinessRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessRule> getBusinessRules();

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
	 * @see PaymentsApp.PaymentsAppPackage#getBusinessAttribute_BusinessValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BusinessValue getBusinessValue();

	/**
	 * Sets the value of the '{@link PaymentsApp.BusinessAttribute#getBusinessValue <em>Business Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Value</em>' containment reference.
	 * @see #getBusinessValue()
	 * @generated
	 */
	void setBusinessValue(BusinessValue value);

} // BusinessAttribute
