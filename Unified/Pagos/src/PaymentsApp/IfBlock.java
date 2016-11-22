/**
 */
package PaymentsApp;

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
 *   <li>{@link PaymentsApp.IfBlock#getIfSentence <em>If Sentence</em>}</li>
 *   <li>{@link PaymentsApp.IfBlock#getElseSentence <em>Else Sentence</em>}</li>
 * </ul>
 *
 * @see PaymentsApp.PaymentsAppPackage#getIfBlock()
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
	 * @see PaymentsApp.PaymentsAppPackage#getIfBlock_IfSentence()
	 * @model containment="true"
	 * @generated
	 */
	IfCondition getIfSentence();

	/**
	 * Sets the value of the '{@link PaymentsApp.IfBlock#getIfSentence <em>If Sentence</em>}' containment reference.
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
	 * @see PaymentsApp.PaymentsAppPackage#getIfBlock_ElseSentence()
	 * @model containment="true"
	 * @generated
	 */
	ElseSegment getElseSentence();

	/**
	 * Sets the value of the '{@link PaymentsApp.IfBlock#getElseSentence <em>Else Sentence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Sentence</em>' containment reference.
	 * @see #getElseSentence()
	 * @generated
	 */
	void setElseSentence(ElseSegment value);

} // IfBlock
