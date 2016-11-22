/**
 */
package PaymentsApp;

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
 *   <li>{@link PaymentsApp.Formula#getFormulaBody <em>Formula Body</em>}</li>
 *   <li>{@link PaymentsApp.Formula#getFormulaReturn <em>Formula Return</em>}</li>
 * </ul>
 *
 * @see PaymentsApp.PaymentsAppPackage#getFormula()
 * @model
 * @generated
 */
public interface Formula extends EObject {
	/**
	 * Returns the value of the '<em><b>Formula Body</b></em>' containment reference list.
	 * The list contents are of type {@link PaymentsApp.IfBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formula Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula Body</em>' containment reference list.
	 * @see PaymentsApp.PaymentsAppPackage#getFormula_FormulaBody()
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
	 * @see PaymentsApp.PaymentsAppPackage#getFormula_FormulaReturn()
	 * @model containment="true"
	 * @generated
	 */
	ReturnBlock getFormulaReturn();

	/**
	 * Sets the value of the '{@link PaymentsApp.Formula#getFormulaReturn <em>Formula Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula Return</em>' containment reference.
	 * @see #getFormulaReturn()
	 * @generated
	 */
	void setFormulaReturn(ReturnBlock value);

} // Formula
