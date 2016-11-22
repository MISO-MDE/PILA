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
 *   <li>{@link PaymentsApp.BusinessAttribute#getType <em>Type</em>}</li>
 *   <li>{@link PaymentsApp.BusinessAttribute#getExp <em>Exp</em>}</li>
 *   <li>{@link PaymentsApp.BusinessAttribute#getRelations <em>Relations</em>}</li>
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
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see PaymentsApp.PaymentsAppPackage#getBusinessAttribute_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link PaymentsApp.BusinessAttribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference.
	 * @see #setExp(Expression)
	 * @see PaymentsApp.PaymentsAppPackage#getBusinessAttribute_Exp()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExp();

	/**
	 * Sets the value of the '{@link PaymentsApp.BusinessAttribute#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
	void setExp(Expression value);

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' reference list.
	 * The list contents are of type {@link PaymentsApp.BusinessAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' reference list.
	 * @see PaymentsApp.PaymentsAppPackage#getBusinessAttribute_Relations()
	 * @model
	 * @generated
	 */
	EList<BusinessAttribute> getRelations();

	/**
	 * Returns the value of the '<em><b>Business Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Value</em>' reference.
	 * @see #setBusinessValue(BusinessValue)
	 * @see PaymentsApp.PaymentsAppPackage#getBusinessAttribute_BusinessValue()
	 * @model
	 * @generated
	 */
	BusinessValue getBusinessValue();

	/**
	 * Sets the value of the '{@link PaymentsApp.BusinessAttribute#getBusinessValue <em>Business Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Value</em>' reference.
	 * @see #getBusinessValue()
	 * @generated
	 */
	void setBusinessValue(BusinessValue value);

} // BusinessAttribute
