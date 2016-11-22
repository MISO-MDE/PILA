/**
 */
package pagos;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expresion Logica</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pagos.ExpresionLogica#getVariable <em>Variable</em>}</li>
 *   <li>{@link pagos.ExpresionLogica#getLogOper <em>Log Oper</em>}</li>
 *   <li>{@link pagos.ExpresionLogica#getVariable2 <em>Variable2</em>}</li>
 *   <li>{@link pagos.ExpresionLogica#getLiteral <em>Literal</em>}</li>
 *   <li>{@link pagos.ExpresionLogica#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see pagos.PagosPackage#getExpresionLogica()
 * @model
 * @generated
 */
public interface ExpresionLogica extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link pagos.TerminalValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see pagos.PagosPackage#getExpresionLogica_Variable()
	 * @model containment="true"
	 * @generated
	 */
	EList<TerminalValue> getVariable();

	/**
	 * Returns the value of the '<em><b>Log Oper</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Oper</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Oper</em>' attribute list.
	 * @see pagos.PagosPackage#getExpresionLogica_LogOper()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getLogOper();

	/**
	 * Returns the value of the '<em><b>Variable2</b></em>' containment reference list.
	 * The list contents are of type {@link pagos.TerminalValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable2</em>' containment reference list.
	 * @see pagos.PagosPackage#getExpresionLogica_Variable2()
	 * @model containment="true"
	 * @generated
	 */
	EList<TerminalValue> getVariable2();

	/**
	 * Returns the value of the '<em><b>Literal</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' attribute list.
	 * @see pagos.PagosPackage#getExpresionLogica_Literal()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getLiteral();

	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference list.
	 * The list contents are of type {@link pagos.ExpresionLogica}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference list.
	 * @see pagos.PagosPackage#getExpresionLogica_Exp()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpresionLogica> getExp();

} // ExpresionLogica
