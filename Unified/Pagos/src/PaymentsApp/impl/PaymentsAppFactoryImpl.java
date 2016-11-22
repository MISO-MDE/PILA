/**
 */
package PaymentsApp.impl;

import PaymentsApp.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PaymentsAppFactoryImpl extends EFactoryImpl implements PaymentsAppFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PaymentsAppFactory init() {
		try {
			PaymentsAppFactory thePaymentsAppFactory = (PaymentsAppFactory)EPackage.Registry.INSTANCE.getEFactory(PaymentsAppPackage.eNS_URI);
			if (thePaymentsAppFactory != null) {
				return thePaymentsAppFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PaymentsAppFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentsAppFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PaymentsAppPackage.APPLICATION: return createApplication();
			case PaymentsAppPackage.INTERMEDIARY: return createIntermediary();
			case PaymentsAppPackage.SUPER_ENTITY: return createSuperEntity();
			case PaymentsAppPackage.BUSINESS_STRING: return createBusinessString();
			case PaymentsAppPackage.PARTICIPANT: return createParticipant();
			case PaymentsAppPackage.PROVIDER: return createProvider();
			case PaymentsAppPackage.INFORMATION_TEMPLATE: return createInformationTemplate();
			case PaymentsAppPackage.CALCULATION_TEMPLATE: return createCalculationTemplate();
			case PaymentsAppPackage.FORMULA: return createFormula();
			case PaymentsAppPackage.IF_BLOCK: return createIfBlock();
			case PaymentsAppPackage.IF_CONDITION: return createIfCondition();
			case PaymentsAppPackage.ELSE_SEGMENT: return createElseSegment();
			case PaymentsAppPackage.RETURN_BLOCK: return createReturnBlock();
			case PaymentsAppPackage.EXPRESION_LOGICA: return createExpresionLogica();
			case PaymentsAppPackage.EXPRESSION: return createExpression();
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE: return createBusinessAttribute();
			case PaymentsAppPackage.TERMINAL_VALUE: return createTerminalValue();
			case PaymentsAppPackage.ADICION: return createAdicion();
			case PaymentsAppPackage.MULTIPLICACION: return createMultiplicacion();
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE_COLLECTION: return createBusinessAttributeCollection();
			case PaymentsAppPackage.DATA_FORM: return createDataForm();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intermediary createIntermediary() {
		IntermediaryImpl intermediary = new IntermediaryImpl();
		return intermediary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperEntity createSuperEntity() {
		SuperEntityImpl superEntity = new SuperEntityImpl();
		return superEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessString createBusinessString() {
		BusinessStringImpl businessString = new BusinessStringImpl();
		return businessString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant createParticipant() {
		ParticipantImpl participant = new ParticipantImpl();
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provider createProvider() {
		ProviderImpl provider = new ProviderImpl();
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationTemplate createInformationTemplate() {
		InformationTemplateImpl informationTemplate = new InformationTemplateImpl();
		return informationTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculationTemplate createCalculationTemplate() {
		CalculationTemplateImpl calculationTemplate = new CalculationTemplateImpl();
		return calculationTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formula createFormula() {
		FormulaImpl formula = new FormulaImpl();
		return formula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfBlock createIfBlock() {
		IfBlockImpl ifBlock = new IfBlockImpl();
		return ifBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfCondition createIfCondition() {
		IfConditionImpl ifCondition = new IfConditionImpl();
		return ifCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElseSegment createElseSegment() {
		ElseSegmentImpl elseSegment = new ElseSegmentImpl();
		return elseSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnBlock createReturnBlock() {
		ReturnBlockImpl returnBlock = new ReturnBlockImpl();
		return returnBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpresionLogica createExpresionLogica() {
		ExpresionLogicaImpl expresionLogica = new ExpresionLogicaImpl();
		return expresionLogica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessAttribute createBusinessAttribute() {
		BusinessAttributeImpl businessAttribute = new BusinessAttributeImpl();
		return businessAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminalValue createTerminalValue() {
		TerminalValueImpl terminalValue = new TerminalValueImpl();
		return terminalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adicion createAdicion() {
		AdicionImpl adicion = new AdicionImpl();
		return adicion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicacion createMultiplicacion() {
		MultiplicacionImpl multiplicacion = new MultiplicacionImpl();
		return multiplicacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessAttributeCollection createBusinessAttributeCollection() {
		BusinessAttributeCollectionImpl businessAttributeCollection = new BusinessAttributeCollectionImpl();
		return businessAttributeCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataForm createDataForm() {
		DataFormImpl dataForm = new DataFormImpl();
		return dataForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentsAppPackage getPaymentsAppPackage() {
		return (PaymentsAppPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PaymentsAppPackage getPackage() {
		return PaymentsAppPackage.eINSTANCE;
	}

} //PaymentsAppFactoryImpl
