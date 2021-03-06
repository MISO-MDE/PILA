/**
 * generated by Xtext 2.10.0
 */
package co.edu.uniandes.pagos;

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
 *   <li>{@link co.edu.uniandes.pagos.BusinessAttribute#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.pagos.BusinessAttribute#getType <em>Type</em>}</li>
 *   <li>{@link co.edu.uniandes.pagos.BusinessAttribute#getExp <em>Exp</em>}</li>
 *   <li>{@link co.edu.uniandes.pagos.BusinessAttribute#getIsIndex <em>Is Index</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.pagos.PagosPackage#getBusinessAttribute()
 * @model
 * @generated
 */
public interface BusinessAttribute extends EObject
{
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
	 * @see co.edu.uniandes.pagos.PagosPackage#getBusinessAttribute_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link co.edu.uniandes.pagos.BusinessAttribute#getName <em>Name</em>}' attribute.
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
	 * @see co.edu.uniandes.pagos.PagosPackage#getBusinessAttribute_Type()
	 * @model
	 * @generated
	 */
  String getType();

  /**
	 * Sets the value of the '{@link co.edu.uniandes.pagos.BusinessAttribute#getType <em>Type</em>}' attribute.
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
	 * @see co.edu.uniandes.pagos.PagosPackage#getBusinessAttribute_Exp()
	 * @model containment="true"
	 * @generated
	 */
  Expression getExp();

  /**
	 * Sets the value of the '{@link co.edu.uniandes.pagos.BusinessAttribute#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
  void setExp(Expression value);

  /**
	 * Returns the value of the '<em><b>Is Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Index</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Index</em>' attribute.
	 * @see #setIsIndex(String)
	 * @see co.edu.uniandes.pagos.PagosPackage#getBusinessAttribute_IsIndex()
	 * @model
	 * @generated
	 */
  String getIsIndex();

  /**
	 * Sets the value of the '{@link co.edu.uniandes.pagos.BusinessAttribute#getIsIndex <em>Is Index</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Index</em>' attribute.
	 * @see #getIsIndex()
	 * @generated
	 */
  void setIsIndex(String value);

} // BusinessAttribute
