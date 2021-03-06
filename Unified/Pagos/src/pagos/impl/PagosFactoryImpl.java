/**
 */
package pagos.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pagos.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PagosFactoryImpl extends EFactoryImpl implements PagosFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PagosFactory init() {
		try {
			PagosFactory thePagosFactory = (PagosFactory)EPackage.Registry.INSTANCE.getEFactory(PagosPackage.eNS_URI);
			if (thePagosFactory != null) {
				return thePagosFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PagosFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PagosFactoryImpl() {
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
			case PagosPackage.APPLICATION: return createApplication();
			case PagosPackage.INTERMEDIARY: return createIntermediary();
			case PagosPackage.SUPER_ENTITY: return createSuperEntity();
			case PagosPackage.PARTICIPANT: return createParticipant();
			case PagosPackage.PROVIDER: return createProvider();
			case PagosPackage.INFORMATION_TEMPLATE: return createInformationTemplate();
			case PagosPackage.CALCULATION_TEMPLATE: return createCalculationTemplate();
			case PagosPackage.FORMULA: return createFormula();
			case PagosPackage.IF_BLOCK: return createIfBlock();
			case PagosPackage.IF_CONDITION: return createIfCondition();
			case PagosPackage.ELSE_SEGMENT: return createElseSegment();
			case PagosPackage.RETURN_BLOCK: return createReturnBlock();
			case PagosPackage.EXPRESION_LOGICA: return createExpresionLogica();
			case PagosPackage.EXPRESSION: return createExpression();
			case PagosPackage.BUSINESS_ATTRIBUTE: return createBusinessAttribute();
			case PagosPackage.TERMINAL_VALUE: return createTerminalValue();
			case PagosPackage.ADICION: return createAdicion();
			case PagosPackage.MULTIPLICACION: return createMultiplicacion();
			case PagosPackage.BUSINESS_ATTRIBUTE_COLLECTION: return createBusinessAttributeCollection();
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
	public PagosPackage getPagosPackage() {
		return (PagosPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PagosPackage getPackage() {
		return PagosPackage.eINSTANCE;
	}

} //PagosFactoryImpl
