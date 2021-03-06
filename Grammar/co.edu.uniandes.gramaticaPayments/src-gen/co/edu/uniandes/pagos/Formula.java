/**
 * generated by Xtext 2.10.0
 */
package co.edu.uniandes.pagos;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.pagos.Formula#getFormulaBody <em>Formula Body</em>}</li>
 *   <li>{@link co.edu.uniandes.pagos.Formula#getFormulaReturn <em>Formula Return</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.pagos.PagosPackage#getFormula()
 * @model
 * @generated
 */
public interface Formula extends EObject
{
  /**
   * Returns the value of the '<em><b>Formula Body</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.uniandes.pagos.IfBlock}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Formula Body</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formula Body</em>' containment reference list.
   * @see co.edu.uniandes.pagos.PagosPackage#getFormula_FormulaBody()
   * @model containment="true"
   * @generated
   */
  EList<IfBlock> getFormulaBody();

  /**
   * Returns the value of the '<em><b>Formula Return</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Formula Return</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formula Return</em>' containment reference.
   * @see #setFormulaReturn(ReturnBlock)
   * @see co.edu.uniandes.pagos.PagosPackage#getFormula_FormulaReturn()
   * @model containment="true"
   * @generated
   */
  ReturnBlock getFormulaReturn();

  /**
   * Sets the value of the '{@link co.edu.uniandes.pagos.Formula#getFormulaReturn <em>Formula Return</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formula Return</em>' containment reference.
   * @see #getFormulaReturn()
   * @generated
   */
  void setFormulaReturn(ReturnBlock value);

} // Formula
