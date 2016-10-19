/**
 */
package PaymentsApp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.SuperEntity#getSuperEntityAttributes <em>Super Entity Attributes</em>}</li>
 *   <li>{@link PaymentsApp.SuperEntity#getName <em>Name</em>}</li>
 *   <li>{@link PaymentsApp.SuperEntity#getTemplates <em>Templates</em>}</li>
 *   <li>{@link PaymentsApp.SuperEntity#getParticipants <em>Participants</em>}</li>
 * </ul>
 *
 * @see PaymentsApp.PaymentsAppPackage#getSuperEntity()
 * @model
 * @generated
 */
public interface SuperEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Super Entity Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Entity Attributes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Entity Attributes</em>' containment reference.
	 * @see #setSuperEntityAttributes(BusinessAttributeCollection)
	 * @see PaymentsApp.PaymentsAppPackage#getSuperEntity_SuperEntityAttributes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BusinessAttributeCollection getSuperEntityAttributes();

	/**
	 * Sets the value of the '{@link PaymentsApp.SuperEntity#getSuperEntityAttributes <em>Super Entity Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Entity Attributes</em>' containment reference.
	 * @see #getSuperEntityAttributes()
	 * @generated
	 */
	void setSuperEntityAttributes(BusinessAttributeCollection value);

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
	 * @see PaymentsApp.PaymentsAppPackage#getSuperEntity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PaymentsApp.SuperEntity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Templates</b></em>' reference list.
	 * The list contents are of type {@link PaymentsApp.InformationTemplate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Templates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Templates</em>' reference list.
	 * @see PaymentsApp.PaymentsAppPackage#getSuperEntity_Templates()
	 * @model required="true"
	 * @generated
	 */
	EList<InformationTemplate> getTemplates();

	/**
	 * Returns the value of the '<em><b>Participants</b></em>' containment reference list.
	 * The list contents are of type {@link PaymentsApp.Participant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' containment reference list.
	 * @see PaymentsApp.PaymentsAppPackage#getSuperEntity_Participants()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Participant> getParticipants();

} // SuperEntity
