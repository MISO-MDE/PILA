/**
 */
package PaymentsApp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see PaymentsApp.PaymentsAppPackage
 * @generated
 */
public interface PaymentsAppFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PaymentsAppFactory eINSTANCE = PaymentsApp.impl.PaymentsAppFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Intermediary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intermediary</em>'.
	 * @generated
	 */
	Intermediary createIntermediary();

	/**
	 * Returns a new object of class '<em>Participant Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Participant Profile</em>'.
	 * @generated
	 */
	ParticipantProfile createParticipantProfile();

	/**
	 * Returns a new object of class '<em>Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provider</em>'.
	 * @generated
	 */
	Provider createProvider();

	/**
	 * Returns a new object of class '<em>Business Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Attribute</em>'.
	 * @generated
	 */
	BusinessAttribute createBusinessAttribute();

	/**
	 * Returns a new object of class '<em>Business Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Rule</em>'.
	 * @generated
	 */
	BusinessRule createBusinessRule();

	/**
	 * Returns a new object of class '<em>Business String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business String</em>'.
	 * @generated
	 */
	BusinessString createBusinessString();

	/**
	 * Returns a new object of class '<em>Business Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Number</em>'.
	 * @generated
	 */
	BusinessNumber createBusinessNumber();

	/**
	 * Returns a new object of class '<em>Business Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Condition</em>'.
	 * @generated
	 */
	BusinessCondition createBusinessCondition();

	/**
	 * Returns a new object of class '<em>Business Attribute Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Attribute Collection</em>'.
	 * @generated
	 */
	BusinessAttributeCollection createBusinessAttributeCollection();

	/**
	 * Returns a new object of class '<em>Information Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information Template</em>'.
	 * @generated
	 */
	InformationTemplate createInformationTemplate();

	/**
	 * Returns a new object of class '<em>Business Calculation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Calculation</em>'.
	 * @generated
	 */
	BusinessCalculation createBusinessCalculation();

	/**
	 * Returns a new object of class '<em>Super Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super Entity</em>'.
	 * @generated
	 */
	SuperEntity createSuperEntity();

	/**
	 * Returns a new object of class '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Participant</em>'.
	 * @generated
	 */
	Participant createParticipant();

	/**
	 * Returns a new object of class '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application</em>'.
	 * @generated
	 */
	Application createApplication();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PaymentsAppPackage getPaymentsAppPackage();

} //PaymentsAppFactory
