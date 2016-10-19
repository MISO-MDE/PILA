/**
 */
package PaymentsApp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Attribute Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.BusinessAttributeCollection#getBusinessAttributes <em>Business Attributes</em>}</li>
 * </ul>
 *
 * @see PaymentsApp.PaymentsAppPackage#getBusinessAttributeCollection()
 * @model
 * @generated
 */
public interface BusinessAttributeCollection extends EObject {
	/**
	 * Returns the value of the '<em><b>Business Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link PaymentsApp.BusinessAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Attributes</em>' containment reference list.
	 * @see PaymentsApp.PaymentsAppPackage#getBusinessAttributeCollection_BusinessAttributes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BusinessAttribute> getBusinessAttributes();

} // BusinessAttributeCollection
