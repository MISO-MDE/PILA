/**
 */
package pagos;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pagos.PagosFactory
 * @model kind="package"
 * @generated
 */
public interface PagosPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pagos";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.edu.co/uniandes/Pagos";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pagos";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PagosPackage eINSTANCE = pagos.impl.PagosPackageImpl.init();

	/**
	 * The meta object id for the '{@link pagos.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pagos.impl.ApplicationImpl
	 * @see pagos.impl.PagosPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Intermediary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__INTERMEDIARY = 1;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link pagos.impl.IntermediaryImpl <em>Intermediary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pagos.impl.IntermediaryImpl
	 * @see pagos.impl.PagosPackageImpl#getIntermediary()
	 * @generated
	 */
	int INTERMEDIARY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIARY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Superentities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIARY__SUPERENTITIES = 1;

	/**
	 * The feature id for the '<em><b>Intermediary Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIARY__INTERMEDIARY_ATTRIBUTES = 2;

	/**
	 * The number of structural features of the '<em>Intermediary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIARY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link pagos.impl.SuperEntityImpl <em>Super Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pagos.impl.SuperEntityImpl
	 * @see pagos.impl.PagosPackageImpl#getSuperEntity()
	 * @generated
	 */
	int SUPER_ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ENTITY__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Att Lists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ENTITY__ATT_LISTS = 2;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ENTITY__PARTICIPANTS = 3;

	/**
	 * The number of structural features of the '<em>Super Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ENTITY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link pagos.impl.ParticipantImpl <em>Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pagos.impl.ParticipantImpl
	 * @see pagos.impl.PagosPackageImpl#getParticipant()
	 * @generated
	 */
	int PARTICIPANT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Att Lists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__ATT_LISTS = 2;

	/**
	 * The feature id for the '<em><b>Templates Forms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__TEMPLATES_FORMS = 3;

	/**
	 * The number of structural features of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link pagos.impl.ProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pagos.impl.ProviderImpl
	 * @see pagos.impl.PagosPackageImpl#getProvider()
	 * @generated
	 */
	int PROVIDER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Att Lists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__ATT_LISTS = 2;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link pagos.impl.InformationTemplateImpl <em>Information Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pagos.impl.InformationTemplateImpl
	 * @see pagos.impl.PagosPackageImpl#getInformationTemplate()
	 * @generated
	 */
	int INFORMATION_TEMPLATE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TEMPLATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TEMPLATE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Att Lists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TEMPLATE__ATT_LISTS = 2;

	/**
	 * The feature id for the '<em><b>Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TEMPLATE__TEMPLATES = 3;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TEMPLATE__PROVIDERS = 4;

	/**
	 * The number of structural features of the '<em>Information Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TEMPLATE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link pagos.impl.CalculationTemplateImpl <em>Calculation Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pagos.impl.CalculationTemplateImpl
	 * @see pagos.impl.PagosPackageImpl#getCalculationTemplate()
	 * @generated
	 */
	int CALCULATION_TEMPLATE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_TEMPLATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_TEMPLATE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Att Lists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_TEMPLATE__ATT_LISTS = 2;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_TEMPLATE__FORMULAS = 3;

	/**
	 * The number of structural features of the '<em>Calculation Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_TEMPLATE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link pagos.impl.FormulaImpl <em>Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pagos.impl.FormulaImpl
	 * @see pagos.impl.PagosPackageImpl#getFormula()
	 * @generated
	 */
	int FORMULA = 7;

	/**
	 * The feature id for the '<em><b>Formula Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__FORMULA_BODY = 0;

	/**
	 * The feature id for the '<em><b>Formula Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__FORMULA_RETURN = 1;

	/**
	 * The number of structural features of the '<em>Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link pagos.impl.IfBlockImpl <em>If Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pagos.impl.IfBlockImpl
	 * @see pagos.impl.PagosPackageImpl#getIfBlock()
	 * @generated
	 */
	int IF_BLOCK = 8;

	/**
	 * The feature id for the '<em><b>If Sentence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_BLOCK__IF_SENTENCE = 0;

	/**
	 * The feature id for the '<em><b>Else Sentence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_BLOCK__ELSE_SENTENCE = 1;

	/**
	 * The number of structural features of the '<em>If Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_BLOCK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link pagos.impl.IfConditionImpl <em>If Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pagos.impl.IfConditionImpl
	 * @see pagos.impl.PagosPackageImpl#getIfCondition()
	 * @generated
	 */
	int IF_CONDITION = 9;

	/**
	 * The feature id for the '<em><b>Log Exp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_CONDITION__LOG_EXP = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_CONDITION__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>If Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_CONDITION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link pagos.impl.ElseSegmentImpl <em>Else Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pagos.impl.ElseSegmentImpl
	 * @see pagos.impl.PagosPackageImpl#getElseSegment()
	 * @generated
	 */
	int ELSE_SEGMENT = 10;

	/**
	 * The feature id for the '<em><b>If Sentence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_SEGMENT__IF_SENTENCE = 0;

	/**
	 * The number of structural features of the '<em>Else Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_SEGMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link pagos.impl.ReturnBlockImpl <em>Return Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pagos.impl.ReturnBlockImpl
	 * @see pagos.impl.PagosPackageImpl#getReturnBlock()
	 * @generated
	 */
	int RETURN_BLOCK = 11;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_BLOCK__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Return Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_BLOCK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link pagos.impl.ExpresionLogicaImpl <em>Expresion Logica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pagos.impl.ExpresionLogicaImpl
	 * @see pagos.impl.PagosPackageImpl#getExpresionLogica()
	 * @generated
	 */
	int EXPRESION_LOGICA = 12;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_LOGICA__VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Log Oper</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_LOGICA__LOG_OPER = 1;

	/**
	 * The feature id for the '<em><b>Variable2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_LOGICA__VARIABLE2 = 2;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_LOGICA__LITERAL = 3;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_LOGICA__EXP = 4;

	/**
	 * The number of structural features of the '<em>Expresion Logica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_LOGICA_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link pagos.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pagos.impl.ExpressionImpl
	 * @see pagos.impl.PagosPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 13;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link pagos.impl.BusinessAttributeImpl <em>Business Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pagos.impl.BusinessAttributeImpl
	 * @see pagos.impl.PagosPackageImpl#getBusinessAttribute()
	 * @generated
	 */
	int BUSINESS_ATTRIBUTE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE__EXP = 2;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE__RELATIONS = 3;

	/**
	 * The number of structural features of the '<em>Business Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link pagos.impl.TerminalValueImpl <em>Terminal Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pagos.impl.TerminalValueImpl
	 * @see pagos.impl.PagosPackageImpl#getTerminalValue()
	 * @generated
	 */
	int TERMINAL_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_VALUE__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_VALUE__VALOR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Terminal Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_VALUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link pagos.impl.AdicionImpl <em>Adicion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pagos.impl.AdicionImpl
	 * @see pagos.impl.PagosPackageImpl#getAdicion()
	 * @generated
	 */
	int ADICION = 16;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADICION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADICION__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rexp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADICION__REXP = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Adicion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADICION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link pagos.impl.MultiplicacionImpl <em>Multiplicacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pagos.impl.MultiplicacionImpl
	 * @see pagos.impl.PagosPackageImpl#getMultiplicacion()
	 * @generated
	 */
	int MULTIPLICACION = 17;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICACION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICACION__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rexp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICACION__REXP = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Multiplicacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICACION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link pagos.impl.BusinessAttributeCollectionImpl <em>Business Attribute Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pagos.impl.BusinessAttributeCollectionImpl
	 * @see pagos.impl.PagosPackageImpl#getBusinessAttributeCollection()
	 * @generated
	 */
	int BUSINESS_ATTRIBUTE_COLLECTION = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE_COLLECTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Business Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE_COLLECTION__BUSINESS_ATTRIBUTES = 1;

	/**
	 * The number of structural features of the '<em>Business Attribute Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE_COLLECTION_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link pagos.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see pagos.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link pagos.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pagos.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the containment reference '{@link pagos.Application#getIntermediary <em>Intermediary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Intermediary</em>'.
	 * @see pagos.Application#getIntermediary()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Intermediary();

	/**
	 * Returns the meta object for class '{@link pagos.Intermediary <em>Intermediary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediary</em>'.
	 * @see pagos.Intermediary
	 * @generated
	 */
	EClass getIntermediary();

	/**
	 * Returns the meta object for the attribute '{@link pagos.Intermediary#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pagos.Intermediary#getName()
	 * @see #getIntermediary()
	 * @generated
	 */
	EAttribute getIntermediary_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link pagos.Intermediary#getSuperentities <em>Superentities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Superentities</em>'.
	 * @see pagos.Intermediary#getSuperentities()
	 * @see #getIntermediary()
	 * @generated
	 */
	EReference getIntermediary_Superentities();

	/**
	 * Returns the meta object for the containment reference list '{@link pagos.Intermediary#getIntermediaryAttributes <em>Intermediary Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediary Attributes</em>'.
	 * @see pagos.Intermediary#getIntermediaryAttributes()
	 * @see #getIntermediary()
	 * @generated
	 */
	EReference getIntermediary_IntermediaryAttributes();

	/**
	 * Returns the meta object for class '{@link pagos.SuperEntity <em>Super Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Entity</em>'.
	 * @see pagos.SuperEntity
	 * @generated
	 */
	EClass getSuperEntity();

	/**
	 * Returns the meta object for the attribute '{@link pagos.SuperEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pagos.SuperEntity#getName()
	 * @see #getSuperEntity()
	 * @generated
	 */
	EAttribute getSuperEntity_Name();

	/**
	 * Returns the meta object for the attribute '{@link pagos.SuperEntity#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see pagos.SuperEntity#getDescription()
	 * @see #getSuperEntity()
	 * @generated
	 */
	EAttribute getSuperEntity_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link pagos.SuperEntity#getAttLists <em>Att Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Att Lists</em>'.
	 * @see pagos.SuperEntity#getAttLists()
	 * @see #getSuperEntity()
	 * @generated
	 */
	EReference getSuperEntity_AttLists();

	/**
	 * Returns the meta object for the containment reference list '{@link pagos.SuperEntity#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participants</em>'.
	 * @see pagos.SuperEntity#getParticipants()
	 * @see #getSuperEntity()
	 * @generated
	 */
	EReference getSuperEntity_Participants();

	/**
	 * Returns the meta object for class '{@link pagos.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant</em>'.
	 * @see pagos.Participant
	 * @generated
	 */
	EClass getParticipant();

	/**
	 * Returns the meta object for the attribute '{@link pagos.Participant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pagos.Participant#getName()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_Name();

	/**
	 * Returns the meta object for the attribute '{@link pagos.Participant#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see pagos.Participant#getDescription()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link pagos.Participant#getAttLists <em>Att Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Att Lists</em>'.
	 * @see pagos.Participant#getAttLists()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_AttLists();

	/**
	 * Returns the meta object for the containment reference list '{@link pagos.Participant#getTemplatesForms <em>Templates Forms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates Forms</em>'.
	 * @see pagos.Participant#getTemplatesForms()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_TemplatesForms();

	/**
	 * Returns the meta object for class '{@link pagos.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see pagos.Provider
	 * @generated
	 */
	EClass getProvider();

	/**
	 * Returns the meta object for the attribute '{@link pagos.Provider#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pagos.Provider#getName()
	 * @see #getProvider()
	 * @generated
	 */
	EAttribute getProvider_Name();

	/**
	 * Returns the meta object for the attribute '{@link pagos.Provider#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see pagos.Provider#getDescription()
	 * @see #getProvider()
	 * @generated
	 */
	EAttribute getProvider_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link pagos.Provider#getAttLists <em>Att Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Att Lists</em>'.
	 * @see pagos.Provider#getAttLists()
	 * @see #getProvider()
	 * @generated
	 */
	EReference getProvider_AttLists();

	/**
	 * Returns the meta object for class '{@link pagos.InformationTemplate <em>Information Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Template</em>'.
	 * @see pagos.InformationTemplate
	 * @generated
	 */
	EClass getInformationTemplate();

	/**
	 * Returns the meta object for the attribute '{@link pagos.InformationTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pagos.InformationTemplate#getName()
	 * @see #getInformationTemplate()
	 * @generated
	 */
	EAttribute getInformationTemplate_Name();

	/**
	 * Returns the meta object for the attribute '{@link pagos.InformationTemplate#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see pagos.InformationTemplate#getDescription()
	 * @see #getInformationTemplate()
	 * @generated
	 */
	EAttribute getInformationTemplate_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link pagos.InformationTemplate#getAttLists <em>Att Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Att Lists</em>'.
	 * @see pagos.InformationTemplate#getAttLists()
	 * @see #getInformationTemplate()
	 * @generated
	 */
	EReference getInformationTemplate_AttLists();

	/**
	 * Returns the meta object for the containment reference list '{@link pagos.InformationTemplate#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates</em>'.
	 * @see pagos.InformationTemplate#getTemplates()
	 * @see #getInformationTemplate()
	 * @generated
	 */
	EReference getInformationTemplate_Templates();

	/**
	 * Returns the meta object for the containment reference list '{@link pagos.InformationTemplate#getProviders <em>Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Providers</em>'.
	 * @see pagos.InformationTemplate#getProviders()
	 * @see #getInformationTemplate()
	 * @generated
	 */
	EReference getInformationTemplate_Providers();

	/**
	 * Returns the meta object for class '{@link pagos.CalculationTemplate <em>Calculation Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculation Template</em>'.
	 * @see pagos.CalculationTemplate
	 * @generated
	 */
	EClass getCalculationTemplate();

	/**
	 * Returns the meta object for the attribute '{@link pagos.CalculationTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pagos.CalculationTemplate#getName()
	 * @see #getCalculationTemplate()
	 * @generated
	 */
	EAttribute getCalculationTemplate_Name();

	/**
	 * Returns the meta object for the attribute '{@link pagos.CalculationTemplate#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see pagos.CalculationTemplate#getDescription()
	 * @see #getCalculationTemplate()
	 * @generated
	 */
	EAttribute getCalculationTemplate_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link pagos.CalculationTemplate#getAttLists <em>Att Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Att Lists</em>'.
	 * @see pagos.CalculationTemplate#getAttLists()
	 * @see #getCalculationTemplate()
	 * @generated
	 */
	EReference getCalculationTemplate_AttLists();

	/**
	 * Returns the meta object for the containment reference list '{@link pagos.CalculationTemplate#getFormulas <em>Formulas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formulas</em>'.
	 * @see pagos.CalculationTemplate#getFormulas()
	 * @see #getCalculationTemplate()
	 * @generated
	 */
	EReference getCalculationTemplate_Formulas();

	/**
	 * Returns the meta object for class '{@link pagos.Formula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formula</em>'.
	 * @see pagos.Formula
	 * @generated
	 */
	EClass getFormula();

	/**
	 * Returns the meta object for the containment reference list '{@link pagos.Formula#getFormulaBody <em>Formula Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formula Body</em>'.
	 * @see pagos.Formula#getFormulaBody()
	 * @see #getFormula()
	 * @generated
	 */
	EReference getFormula_FormulaBody();

	/**
	 * Returns the meta object for the containment reference '{@link pagos.Formula#getFormulaReturn <em>Formula Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Formula Return</em>'.
	 * @see pagos.Formula#getFormulaReturn()
	 * @see #getFormula()
	 * @generated
	 */
	EReference getFormula_FormulaReturn();

	/**
	 * Returns the meta object for class '{@link pagos.IfBlock <em>If Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Block</em>'.
	 * @see pagos.IfBlock
	 * @generated
	 */
	EClass getIfBlock();

	/**
	 * Returns the meta object for the containment reference '{@link pagos.IfBlock#getIfSentence <em>If Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Sentence</em>'.
	 * @see pagos.IfBlock#getIfSentence()
	 * @see #getIfBlock()
	 * @generated
	 */
	EReference getIfBlock_IfSentence();

	/**
	 * Returns the meta object for the containment reference '{@link pagos.IfBlock#getElseSentence <em>Else Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Sentence</em>'.
	 * @see pagos.IfBlock#getElseSentence()
	 * @see #getIfBlock()
	 * @generated
	 */
	EReference getIfBlock_ElseSentence();

	/**
	 * Returns the meta object for class '{@link pagos.IfCondition <em>If Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Condition</em>'.
	 * @see pagos.IfCondition
	 * @generated
	 */
	EClass getIfCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link pagos.IfCondition#getLogExp <em>Log Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Log Exp</em>'.
	 * @see pagos.IfCondition#getLogExp()
	 * @see #getIfCondition()
	 * @generated
	 */
	EReference getIfCondition_LogExp();

	/**
	 * Returns the meta object for the containment reference list '{@link pagos.IfCondition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see pagos.IfCondition#getExpression()
	 * @see #getIfCondition()
	 * @generated
	 */
	EReference getIfCondition_Expression();

	/**
	 * Returns the meta object for class '{@link pagos.ElseSegment <em>Else Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else Segment</em>'.
	 * @see pagos.ElseSegment
	 * @generated
	 */
	EClass getElseSegment();

	/**
	 * Returns the meta object for the containment reference '{@link pagos.ElseSegment#getIfSentence <em>If Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Sentence</em>'.
	 * @see pagos.ElseSegment#getIfSentence()
	 * @see #getElseSegment()
	 * @generated
	 */
	EReference getElseSegment_IfSentence();

	/**
	 * Returns the meta object for class '{@link pagos.ReturnBlock <em>Return Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Block</em>'.
	 * @see pagos.ReturnBlock
	 * @generated
	 */
	EClass getReturnBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link pagos.ReturnBlock#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see pagos.ReturnBlock#getExpression()
	 * @see #getReturnBlock()
	 * @generated
	 */
	EReference getReturnBlock_Expression();

	/**
	 * Returns the meta object for class '{@link pagos.ExpresionLogica <em>Expresion Logica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expresion Logica</em>'.
	 * @see pagos.ExpresionLogica
	 * @generated
	 */
	EClass getExpresionLogica();

	/**
	 * Returns the meta object for the containment reference list '{@link pagos.ExpresionLogica#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see pagos.ExpresionLogica#getVariable()
	 * @see #getExpresionLogica()
	 * @generated
	 */
	EReference getExpresionLogica_Variable();

	/**
	 * Returns the meta object for the attribute list '{@link pagos.ExpresionLogica#getLogOper <em>Log Oper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Log Oper</em>'.
	 * @see pagos.ExpresionLogica#getLogOper()
	 * @see #getExpresionLogica()
	 * @generated
	 */
	EAttribute getExpresionLogica_LogOper();

	/**
	 * Returns the meta object for the containment reference list '{@link pagos.ExpresionLogica#getVariable2 <em>Variable2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable2</em>'.
	 * @see pagos.ExpresionLogica#getVariable2()
	 * @see #getExpresionLogica()
	 * @generated
	 */
	EReference getExpresionLogica_Variable2();

	/**
	 * Returns the meta object for the attribute list '{@link pagos.ExpresionLogica#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Literal</em>'.
	 * @see pagos.ExpresionLogica#getLiteral()
	 * @see #getExpresionLogica()
	 * @generated
	 */
	EAttribute getExpresionLogica_Literal();

	/**
	 * Returns the meta object for the containment reference list '{@link pagos.ExpresionLogica#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exp</em>'.
	 * @see pagos.ExpresionLogica#getExp()
	 * @see #getExpresionLogica()
	 * @generated
	 */
	EReference getExpresionLogica_Exp();

	/**
	 * Returns the meta object for class '{@link pagos.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see pagos.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link pagos.BusinessAttribute <em>Business Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Attribute</em>'.
	 * @see pagos.BusinessAttribute
	 * @generated
	 */
	EClass getBusinessAttribute();

	/**
	 * Returns the meta object for the attribute '{@link pagos.BusinessAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pagos.BusinessAttribute#getName()
	 * @see #getBusinessAttribute()
	 * @generated
	 */
	EAttribute getBusinessAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link pagos.BusinessAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pagos.BusinessAttribute#getType()
	 * @see #getBusinessAttribute()
	 * @generated
	 */
	EAttribute getBusinessAttribute_Type();

	/**
	 * Returns the meta object for the containment reference '{@link pagos.BusinessAttribute#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see pagos.BusinessAttribute#getExp()
	 * @see #getBusinessAttribute()
	 * @generated
	 */
	EReference getBusinessAttribute_Exp();

	/**
	 * Returns the meta object for the reference '{@link pagos.BusinessAttribute#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relations</em>'.
	 * @see pagos.BusinessAttribute#getRelations()
	 * @see #getBusinessAttribute()
	 * @generated
	 */
	EReference getBusinessAttribute_Relations();

	/**
	 * Returns the meta object for class '{@link pagos.TerminalValue <em>Terminal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal Value</em>'.
	 * @see pagos.TerminalValue
	 * @generated
	 */
	EClass getTerminalValue();

	/**
	 * Returns the meta object for the reference '{@link pagos.TerminalValue#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see pagos.TerminalValue#getVariable()
	 * @see #getTerminalValue()
	 * @generated
	 */
	EReference getTerminalValue_Variable();

	/**
	 * Returns the meta object for the attribute '{@link pagos.TerminalValue#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see pagos.TerminalValue#getValor()
	 * @see #getTerminalValue()
	 * @generated
	 */
	EAttribute getTerminalValue_Valor();

	/**
	 * Returns the meta object for class '{@link pagos.Adicion <em>Adicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adicion</em>'.
	 * @see pagos.Adicion
	 * @generated
	 */
	EClass getAdicion();

	/**
	 * Returns the meta object for the containment reference '{@link pagos.Adicion#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see pagos.Adicion#getLeft()
	 * @see #getAdicion()
	 * @generated
	 */
	EReference getAdicion_Left();

	/**
	 * Returns the meta object for the attribute '{@link pagos.Adicion#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see pagos.Adicion#getOperator()
	 * @see #getAdicion()
	 * @generated
	 */
	EAttribute getAdicion_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link pagos.Adicion#getRexp <em>Rexp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rexp</em>'.
	 * @see pagos.Adicion#getRexp()
	 * @see #getAdicion()
	 * @generated
	 */
	EReference getAdicion_Rexp();

	/**
	 * Returns the meta object for class '{@link pagos.Multiplicacion <em>Multiplicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicacion</em>'.
	 * @see pagos.Multiplicacion
	 * @generated
	 */
	EClass getMultiplicacion();

	/**
	 * Returns the meta object for the containment reference '{@link pagos.Multiplicacion#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see pagos.Multiplicacion#getLeft()
	 * @see #getMultiplicacion()
	 * @generated
	 */
	EReference getMultiplicacion_Left();

	/**
	 * Returns the meta object for the attribute '{@link pagos.Multiplicacion#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see pagos.Multiplicacion#getOperator()
	 * @see #getMultiplicacion()
	 * @generated
	 */
	EAttribute getMultiplicacion_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link pagos.Multiplicacion#getRexp <em>Rexp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rexp</em>'.
	 * @see pagos.Multiplicacion#getRexp()
	 * @see #getMultiplicacion()
	 * @generated
	 */
	EReference getMultiplicacion_Rexp();

	/**
	 * Returns the meta object for class '{@link pagos.BusinessAttributeCollection <em>Business Attribute Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Attribute Collection</em>'.
	 * @see pagos.BusinessAttributeCollection
	 * @generated
	 */
	EClass getBusinessAttributeCollection();

	/**
	 * Returns the meta object for the attribute '{@link pagos.BusinessAttributeCollection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pagos.BusinessAttributeCollection#getName()
	 * @see #getBusinessAttributeCollection()
	 * @generated
	 */
	EAttribute getBusinessAttributeCollection_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link pagos.BusinessAttributeCollection#getBusinessAttributes <em>Business Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Attributes</em>'.
	 * @see pagos.BusinessAttributeCollection#getBusinessAttributes()
	 * @see #getBusinessAttributeCollection()
	 * @generated
	 */
	EReference getBusinessAttributeCollection_BusinessAttributes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PagosFactory getPagosFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pagos.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pagos.impl.ApplicationImpl
		 * @see pagos.impl.PagosPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Intermediary</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__INTERMEDIARY = eINSTANCE.getApplication_Intermediary();

		/**
		 * The meta object literal for the '{@link pagos.impl.IntermediaryImpl <em>Intermediary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pagos.impl.IntermediaryImpl
		 * @see pagos.impl.PagosPackageImpl#getIntermediary()
		 * @generated
		 */
		EClass INTERMEDIARY = eINSTANCE.getIntermediary();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERMEDIARY__NAME = eINSTANCE.getIntermediary_Name();

		/**
		 * The meta object literal for the '<em><b>Superentities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIARY__SUPERENTITIES = eINSTANCE.getIntermediary_Superentities();

		/**
		 * The meta object literal for the '<em><b>Intermediary Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIARY__INTERMEDIARY_ATTRIBUTES = eINSTANCE.getIntermediary_IntermediaryAttributes();

		/**
		 * The meta object literal for the '{@link pagos.impl.SuperEntityImpl <em>Super Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pagos.impl.SuperEntityImpl
		 * @see pagos.impl.PagosPackageImpl#getSuperEntity()
		 * @generated
		 */
		EClass SUPER_ENTITY = eINSTANCE.getSuperEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_ENTITY__NAME = eINSTANCE.getSuperEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_ENTITY__DESCRIPTION = eINSTANCE.getSuperEntity_Description();

		/**
		 * The meta object literal for the '<em><b>Att Lists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_ENTITY__ATT_LISTS = eINSTANCE.getSuperEntity_AttLists();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_ENTITY__PARTICIPANTS = eINSTANCE.getSuperEntity_Participants();

		/**
		 * The meta object literal for the '{@link pagos.impl.ParticipantImpl <em>Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pagos.impl.ParticipantImpl
		 * @see pagos.impl.PagosPackageImpl#getParticipant()
		 * @generated
		 */
		EClass PARTICIPANT = eINSTANCE.getParticipant();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__NAME = eINSTANCE.getParticipant_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__DESCRIPTION = eINSTANCE.getParticipant_Description();

		/**
		 * The meta object literal for the '<em><b>Att Lists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__ATT_LISTS = eINSTANCE.getParticipant_AttLists();

		/**
		 * The meta object literal for the '<em><b>Templates Forms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__TEMPLATES_FORMS = eINSTANCE.getParticipant_TemplatesForms();

		/**
		 * The meta object literal for the '{@link pagos.impl.ProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pagos.impl.ProviderImpl
		 * @see pagos.impl.PagosPackageImpl#getProvider()
		 * @generated
		 */
		EClass PROVIDER = eINSTANCE.getProvider();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER__NAME = eINSTANCE.getProvider_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER__DESCRIPTION = eINSTANCE.getProvider_Description();

		/**
		 * The meta object literal for the '<em><b>Att Lists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDER__ATT_LISTS = eINSTANCE.getProvider_AttLists();

		/**
		 * The meta object literal for the '{@link pagos.impl.InformationTemplateImpl <em>Information Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pagos.impl.InformationTemplateImpl
		 * @see pagos.impl.PagosPackageImpl#getInformationTemplate()
		 * @generated
		 */
		EClass INFORMATION_TEMPLATE = eINSTANCE.getInformationTemplate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_TEMPLATE__NAME = eINSTANCE.getInformationTemplate_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_TEMPLATE__DESCRIPTION = eINSTANCE.getInformationTemplate_Description();

		/**
		 * The meta object literal for the '<em><b>Att Lists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_TEMPLATE__ATT_LISTS = eINSTANCE.getInformationTemplate_AttLists();

		/**
		 * The meta object literal for the '<em><b>Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_TEMPLATE__TEMPLATES = eINSTANCE.getInformationTemplate_Templates();

		/**
		 * The meta object literal for the '<em><b>Providers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_TEMPLATE__PROVIDERS = eINSTANCE.getInformationTemplate_Providers();

		/**
		 * The meta object literal for the '{@link pagos.impl.CalculationTemplateImpl <em>Calculation Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pagos.impl.CalculationTemplateImpl
		 * @see pagos.impl.PagosPackageImpl#getCalculationTemplate()
		 * @generated
		 */
		EClass CALCULATION_TEMPLATE = eINSTANCE.getCalculationTemplate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALCULATION_TEMPLATE__NAME = eINSTANCE.getCalculationTemplate_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALCULATION_TEMPLATE__DESCRIPTION = eINSTANCE.getCalculationTemplate_Description();

		/**
		 * The meta object literal for the '<em><b>Att Lists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALCULATION_TEMPLATE__ATT_LISTS = eINSTANCE.getCalculationTemplate_AttLists();

		/**
		 * The meta object literal for the '<em><b>Formulas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALCULATION_TEMPLATE__FORMULAS = eINSTANCE.getCalculationTemplate_Formulas();

		/**
		 * The meta object literal for the '{@link pagos.impl.FormulaImpl <em>Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pagos.impl.FormulaImpl
		 * @see pagos.impl.PagosPackageImpl#getFormula()
		 * @generated
		 */
		EClass FORMULA = eINSTANCE.getFormula();

		/**
		 * The meta object literal for the '<em><b>Formula Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULA__FORMULA_BODY = eINSTANCE.getFormula_FormulaBody();

		/**
		 * The meta object literal for the '<em><b>Formula Return</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULA__FORMULA_RETURN = eINSTANCE.getFormula_FormulaReturn();

		/**
		 * The meta object literal for the '{@link pagos.impl.IfBlockImpl <em>If Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pagos.impl.IfBlockImpl
		 * @see pagos.impl.PagosPackageImpl#getIfBlock()
		 * @generated
		 */
		EClass IF_BLOCK = eINSTANCE.getIfBlock();

		/**
		 * The meta object literal for the '<em><b>If Sentence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_BLOCK__IF_SENTENCE = eINSTANCE.getIfBlock_IfSentence();

		/**
		 * The meta object literal for the '<em><b>Else Sentence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_BLOCK__ELSE_SENTENCE = eINSTANCE.getIfBlock_ElseSentence();

		/**
		 * The meta object literal for the '{@link pagos.impl.IfConditionImpl <em>If Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pagos.impl.IfConditionImpl
		 * @see pagos.impl.PagosPackageImpl#getIfCondition()
		 * @generated
		 */
		EClass IF_CONDITION = eINSTANCE.getIfCondition();

		/**
		 * The meta object literal for the '<em><b>Log Exp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_CONDITION__LOG_EXP = eINSTANCE.getIfCondition_LogExp();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_CONDITION__EXPRESSION = eINSTANCE.getIfCondition_Expression();

		/**
		 * The meta object literal for the '{@link pagos.impl.ElseSegmentImpl <em>Else Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pagos.impl.ElseSegmentImpl
		 * @see pagos.impl.PagosPackageImpl#getElseSegment()
		 * @generated
		 */
		EClass ELSE_SEGMENT = eINSTANCE.getElseSegment();

		/**
		 * The meta object literal for the '<em><b>If Sentence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSE_SEGMENT__IF_SENTENCE = eINSTANCE.getElseSegment_IfSentence();

		/**
		 * The meta object literal for the '{@link pagos.impl.ReturnBlockImpl <em>Return Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pagos.impl.ReturnBlockImpl
		 * @see pagos.impl.PagosPackageImpl#getReturnBlock()
		 * @generated
		 */
		EClass RETURN_BLOCK = eINSTANCE.getReturnBlock();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_BLOCK__EXPRESSION = eINSTANCE.getReturnBlock_Expression();

		/**
		 * The meta object literal for the '{@link pagos.impl.ExpresionLogicaImpl <em>Expresion Logica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pagos.impl.ExpresionLogicaImpl
		 * @see pagos.impl.PagosPackageImpl#getExpresionLogica()
		 * @generated
		 */
		EClass EXPRESION_LOGICA = eINSTANCE.getExpresionLogica();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESION_LOGICA__VARIABLE = eINSTANCE.getExpresionLogica_Variable();

		/**
		 * The meta object literal for the '<em><b>Log Oper</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESION_LOGICA__LOG_OPER = eINSTANCE.getExpresionLogica_LogOper();

		/**
		 * The meta object literal for the '<em><b>Variable2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESION_LOGICA__VARIABLE2 = eINSTANCE.getExpresionLogica_Variable2();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESION_LOGICA__LITERAL = eINSTANCE.getExpresionLogica_Literal();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESION_LOGICA__EXP = eINSTANCE.getExpresionLogica_Exp();

		/**
		 * The meta object literal for the '{@link pagos.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pagos.impl.ExpressionImpl
		 * @see pagos.impl.PagosPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link pagos.impl.BusinessAttributeImpl <em>Business Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pagos.impl.BusinessAttributeImpl
		 * @see pagos.impl.PagosPackageImpl#getBusinessAttribute()
		 * @generated
		 */
		EClass BUSINESS_ATTRIBUTE = eINSTANCE.getBusinessAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_ATTRIBUTE__NAME = eINSTANCE.getBusinessAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_ATTRIBUTE__TYPE = eINSTANCE.getBusinessAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ATTRIBUTE__EXP = eINSTANCE.getBusinessAttribute_Exp();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ATTRIBUTE__RELATIONS = eINSTANCE.getBusinessAttribute_Relations();

		/**
		 * The meta object literal for the '{@link pagos.impl.TerminalValueImpl <em>Terminal Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pagos.impl.TerminalValueImpl
		 * @see pagos.impl.PagosPackageImpl#getTerminalValue()
		 * @generated
		 */
		EClass TERMINAL_VALUE = eINSTANCE.getTerminalValue();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL_VALUE__VARIABLE = eINSTANCE.getTerminalValue_Variable();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINAL_VALUE__VALOR = eINSTANCE.getTerminalValue_Valor();

		/**
		 * The meta object literal for the '{@link pagos.impl.AdicionImpl <em>Adicion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pagos.impl.AdicionImpl
		 * @see pagos.impl.PagosPackageImpl#getAdicion()
		 * @generated
		 */
		EClass ADICION = eINSTANCE.getAdicion();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADICION__LEFT = eINSTANCE.getAdicion_Left();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADICION__OPERATOR = eINSTANCE.getAdicion_Operator();

		/**
		 * The meta object literal for the '<em><b>Rexp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADICION__REXP = eINSTANCE.getAdicion_Rexp();

		/**
		 * The meta object literal for the '{@link pagos.impl.MultiplicacionImpl <em>Multiplicacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pagos.impl.MultiplicacionImpl
		 * @see pagos.impl.PagosPackageImpl#getMultiplicacion()
		 * @generated
		 */
		EClass MULTIPLICACION = eINSTANCE.getMultiplicacion();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLICACION__LEFT = eINSTANCE.getMultiplicacion_Left();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICACION__OPERATOR = eINSTANCE.getMultiplicacion_Operator();

		/**
		 * The meta object literal for the '<em><b>Rexp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLICACION__REXP = eINSTANCE.getMultiplicacion_Rexp();

		/**
		 * The meta object literal for the '{@link pagos.impl.BusinessAttributeCollectionImpl <em>Business Attribute Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pagos.impl.BusinessAttributeCollectionImpl
		 * @see pagos.impl.PagosPackageImpl#getBusinessAttributeCollection()
		 * @generated
		 */
		EClass BUSINESS_ATTRIBUTE_COLLECTION = eINSTANCE.getBusinessAttributeCollection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_ATTRIBUTE_COLLECTION__NAME = eINSTANCE.getBusinessAttributeCollection_Name();

		/**
		 * The meta object literal for the '<em><b>Business Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ATTRIBUTE_COLLECTION__BUSINESS_ATTRIBUTES = eINSTANCE.getBusinessAttributeCollection_BusinessAttributes();

	}

} //PagosPackage
