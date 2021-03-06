/**
 */
package pagos;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pagos.IfBlock#getIfSentence <em>If Sentence</em>}</li>
 *   <li>{@link pagos.IfBlock#getElseSentence <em>Else Sentence</em>}</li>
 * </ul>
 *
 * @see pagos.PagosPackage#getIfBlock()
 * @model
 * @generated
 */
public interface IfBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>If Sentence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Sentence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Sentence</em>' containment reference.
	 * @see #setIfSentence(IfCondition)
	 * @see pagos.PagosPackage#getIfBlock_IfSentence()
	 * @model containment="true"
	 * @generated
	 */
	IfCondition getIfSentence();

	/**
	 * Sets the value of the '{@link pagos.IfBlock#getIfSentence <em>If Sentence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Sentence</em>' containment reference.
	 * @see #getIfSentence()
	 * @generated
	 */
	void setIfSentence(IfCondition value);

	/**
	 * Returns the value of the '<em><b>Else Sentence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Sentence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Sentence</em>' containment reference.
	 * @see #setElseSentence(ElseSegment)
	 * @see pagos.PagosPackage#getIfBlock_ElseSentence()
	 * @model containment="true"
	 * @generated
	 */
	ElseSegment getElseSentence();

	/**
	 * Sets the value of the '{@link pagos.IfBlock#getElseSentence <em>Else Sentence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Sentence</em>' containment reference.
	 * @see #getElseSentence()
	 * @generated
	 */
	void setElseSentence(ElseSegment value);

} // IfBlock
