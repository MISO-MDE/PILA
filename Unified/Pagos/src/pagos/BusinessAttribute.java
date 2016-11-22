/**
 */
package pagos;

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
 *   <li>{@link pagos.BusinessAttribute#getName <em>Name</em>}</li>
 *   <li>{@link pagos.BusinessAttribute#getType <em>Type</em>}</li>
 *   <li>{@link pagos.BusinessAttribute#getExp <em>Exp</em>}</li>
 *   <li>{@link pagos.BusinessAttribute#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @see pagos.PagosPackage#getBusinessAttribute()
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
	 * @see pagos.PagosPackage#getBusinessAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pagos.BusinessAttribute#getName <em>Name</em>}' attribute.
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
	 * @see pagos.PagosPackage#getBusinessAttribute_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link pagos.BusinessAttribute#getType <em>Type</em>}' attribute.
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
	 * @see pagos.PagosPackage#getBusinessAttribute_Exp()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExp();

	/**
	 * Sets the value of the '{@link pagos.BusinessAttribute#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
	void setExp(Expression value);

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' reference.
	 * @see #setRelations(BusinessAttribute)
	 * @see pagos.PagosPackage#getBusinessAttribute_Relations()
	 * @model
	 * @generated
	 */
	BusinessAttribute getRelations();

	/**
	 * Sets the value of the '{@link pagos.BusinessAttribute#getRelations <em>Relations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relations</em>' reference.
	 * @see #getRelations()
	 * @generated
	 */
	void setRelations(BusinessAttribute value);

} // BusinessAttribute
