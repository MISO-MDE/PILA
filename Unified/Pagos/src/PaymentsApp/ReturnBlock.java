/**
 */
package PaymentsApp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.ReturnBlock#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see PaymentsApp.PaymentsAppPackage#getReturnBlock()
 * @model
 * @generated
 */
public interface ReturnBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link PaymentsApp.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see PaymentsApp.PaymentsAppPackage#getReturnBlock_Expression()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpression();

} // ReturnBlock
