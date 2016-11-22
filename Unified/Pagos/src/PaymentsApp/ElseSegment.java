/**
 */
package PaymentsApp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Else Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.ElseSegment#getIfSentence <em>If Sentence</em>}</li>
 * </ul>
 *
 * @see PaymentsApp.PaymentsAppPackage#getElseSegment()
 * @model
 * @generated
 */
public interface ElseSegment extends EObject {
	/**
	 * Returns the value of the '<em><b>If Sentence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Sentence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Sentence</em>' containment reference.
	 * @see #setIfSentence(Formula)
	 * @see PaymentsApp.PaymentsAppPackage#getElseSegment_IfSentence()
	 * @model containment="true"
	 * @generated
	 */
	Formula getIfSentence();

	/**
	 * Sets the value of the '{@link PaymentsApp.ElseSegment#getIfSentence <em>If Sentence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Sentence</em>' containment reference.
	 * @see #getIfSentence()
	 * @generated
	 */
	void setIfSentence(Formula value);

} // ElseSegment
