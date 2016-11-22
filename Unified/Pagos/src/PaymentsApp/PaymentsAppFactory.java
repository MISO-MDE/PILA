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
	 * Returns a new object of class '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application</em>'.
	 * @generated
	 */
	Application createApplication();

	/**
	 * Returns a new object of class '<em>Intermediary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intermediary</em>'.
	 * @generated
	 */
	Intermediary createIntermediary();

	/**
	 * Returns a new object of class '<em>Super Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super Entity</em>'.
	 * @generated
	 */
	SuperEntity createSuperEntity();

	/**
	 * Returns a new object of class '<em>Business String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business String</em>'.
	 * @generated
	 */
	BusinessString createBusinessString();

	/**
	 * Returns a new object of class '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Participant</em>'.
	 * @generated
	 */
	Participant createParticipant();

	/**
	 * Returns a new object of class '<em>Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provider</em>'.
	 * @generated
	 */
	Provider createProvider();

	/**
	 * Returns a new object of class '<em>Information Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information Template</em>'.
	 * @generated
	 */
	InformationTemplate createInformationTemplate();

	/**
	 * Returns a new object of class '<em>Calculation Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calculation Template</em>'.
	 * @generated
	 */
	CalculationTemplate createCalculationTemplate();

	/**
	 * Returns a new object of class '<em>Formula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formula</em>'.
	 * @generated
	 */
	Formula createFormula();

	/**
	 * Returns a new object of class '<em>If Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Block</em>'.
	 * @generated
	 */
	IfBlock createIfBlock();

	/**
	 * Returns a new object of class '<em>If Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Condition</em>'.
	 * @generated
	 */
	IfCondition createIfCondition();

	/**
	 * Returns a new object of class '<em>Else Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Else Segment</em>'.
	 * @generated
	 */
	ElseSegment createElseSegment();

	/**
	 * Returns a new object of class '<em>Return Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Block</em>'.
	 * @generated
	 */
	ReturnBlock createReturnBlock();

	/**
	 * Returns a new object of class '<em>Expresion Logica</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expresion Logica</em>'.
	 * @generated
	 */
	ExpresionLogica createExpresionLogica();

	/**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
	Expression createExpression();

	/**
	 * Returns a new object of class '<em>Business Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Attribute</em>'.
	 * @generated
	 */
	BusinessAttribute createBusinessAttribute();

	/**
	 * Returns a new object of class '<em>Terminal Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminal Value</em>'.
	 * @generated
	 */
	TerminalValue createTerminalValue();

	/**
	 * Returns a new object of class '<em>Adicion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adicion</em>'.
	 * @generated
	 */
	Adicion createAdicion();

	/**
	 * Returns a new object of class '<em>Multiplicacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplicacion</em>'.
	 * @generated
	 */
	Multiplicacion createMultiplicacion();

	/**
	 * Returns a new object of class '<em>Business Attribute Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Attribute Collection</em>'.
	 * @generated
	 */
	BusinessAttributeCollection createBusinessAttributeCollection();

	/**
	 * Returns a new object of class '<em>Data Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Form</em>'.
	 * @generated
	 */
	DataForm createDataForm();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PaymentsAppPackage getPaymentsAppPackage();

} //PaymentsAppFactory
