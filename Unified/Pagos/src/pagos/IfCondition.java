/**
 */
package pagos;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pagos.IfCondition#getLogExp <em>Log Exp</em>}</li>
 *   <li>{@link pagos.IfCondition#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see pagos.PagosPackage#getIfCondition()
 * @model
 * @generated
 */
public interface IfCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Log Exp</b></em>' containment reference list.
	 * The list contents are of type {@link pagos.ExpresionLogica}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Exp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Exp</em>' containment reference list.
	 * @see pagos.PagosPackage#getIfCondition_LogExp()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpresionLogica> getLogExp();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link pagos.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see pagos.PagosPackage#getIfCondition_Expression()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpression();

} // IfCondition
