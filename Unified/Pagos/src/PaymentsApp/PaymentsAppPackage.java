/**
 */
package PaymentsApp;

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
 * @see PaymentsApp.PaymentsAppFactory
 * @model kind="package"
 * @generated
 */
public interface PaymentsAppPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "PaymentsApp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.edu.co/uniandes/PaymentsApp";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "PaymentsApp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PaymentsAppPackage eINSTANCE = PaymentsApp.impl.PaymentsAppPackageImpl.init();

	/**
	 * The meta object id for the '{@link PaymentsApp.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.ApplicationImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getApplication()
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
	 * The meta object id for the '{@link PaymentsApp.impl.IntermediaryImpl <em>Intermediary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.IntermediaryImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getIntermediary()
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
	 * The feature id for the '<em><b>Business Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIARY__BUSINESS_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Intermediary Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIARY__INTERMEDIARY_ATTRIBUTES = 3;

	/**
	 * The feature id for the '<em><b>Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIARY__TEMPLATES = 4;

	/**
	 * The number of structural features of the '<em>Intermediary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIARY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link PaymentsApp.impl.BusinessValueImpl <em>Business Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.BusinessValueImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getBusinessValue()
	 * @generated
	 */
	int BUSINESS_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Business Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_VALUE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link PaymentsApp.impl.SuperEntityImpl <em>Super Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.SuperEntityImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getSuperEntity()
	 * @generated
	 */
	int SUPER_ENTITY = 3;

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
	 * The feature id for the '<em><b>Business Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ENTITY__BUSINESS_FIELDS = 4;

	/**
	 * The number of structural features of the '<em>Super Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ENTITY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link PaymentsApp.impl.BusinessStringImpl <em>Business String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.BusinessStringImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getBusinessString()
	 * @generated
	 */
	int BUSINESS_STRING = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_STRING__VALUE = BUSINESS_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Business String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_STRING_FEATURE_COUNT = BUSINESS_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link PaymentsApp.impl.ParticipantImpl <em>Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.ParticipantImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getParticipant()
	 * @generated
	 */
	int PARTICIPANT = 5;

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
	 * The meta object id for the '{@link PaymentsApp.impl.ProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.ProviderImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getProvider()
	 * @generated
	 */
	int PROVIDER = 6;

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
	 * The meta object id for the '{@link PaymentsApp.impl.InformationTemplateImpl <em>Information Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.InformationTemplateImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getInformationTemplate()
	 * @generated
	 */
	int INFORMATION_TEMPLATE = 7;

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
	 * The meta object id for the '{@link PaymentsApp.impl.CalculationTemplateImpl <em>Calculation Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.CalculationTemplateImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getCalculationTemplate()
	 * @generated
	 */
	int CALCULATION_TEMPLATE = 8;

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
	 * The meta object id for the '{@link PaymentsApp.impl.FormulaImpl <em>Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.FormulaImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getFormula()
	 * @generated
	 */
	int FORMULA = 9;

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
	 * The meta object id for the '{@link PaymentsApp.impl.IfBlockImpl <em>If Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.IfBlockImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getIfBlock()
	 * @generated
	 */
	int IF_BLOCK = 10;

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
	 * The meta object id for the '{@link PaymentsApp.impl.IfConditionImpl <em>If Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.IfConditionImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getIfCondition()
	 * @generated
	 */
	int IF_CONDITION = 11;

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
	 * The meta object id for the '{@link PaymentsApp.impl.ElseSegmentImpl <em>Else Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.ElseSegmentImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getElseSegment()
	 * @generated
	 */
	int ELSE_SEGMENT = 12;

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
	 * The meta object id for the '{@link PaymentsApp.impl.ReturnBlockImpl <em>Return Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.ReturnBlockImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getReturnBlock()
	 * @generated
	 */
	int RETURN_BLOCK = 13;

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
	 * The meta object id for the '{@link PaymentsApp.impl.ExpresionLogicaImpl <em>Expresion Logica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.ExpresionLogicaImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getExpresionLogica()
	 * @generated
	 */
	int EXPRESION_LOGICA = 14;

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
	 * The meta object id for the '{@link PaymentsApp.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.ExpressionImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 15;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link PaymentsApp.impl.BusinessAttributeImpl <em>Business Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.BusinessAttributeImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getBusinessAttribute()
	 * @generated
	 */
	int BUSINESS_ATTRIBUTE = 16;

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
	 * The feature id for the '<em><b>Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE__RELATIONS = 3;

	/**
	 * The feature id for the '<em><b>Business Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE__BUSINESS_VALUE = 4;

	/**
	 * The number of structural features of the '<em>Business Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link PaymentsApp.impl.TerminalValueImpl <em>Terminal Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.TerminalValueImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getTerminalValue()
	 * @generated
	 */
	int TERMINAL_VALUE = 17;

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
	 * The meta object id for the '{@link PaymentsApp.impl.AdicionImpl <em>Adicion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.AdicionImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getAdicion()
	 * @generated
	 */
	int ADICION = 18;

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
	 * The meta object id for the '{@link PaymentsApp.impl.MultiplicacionImpl <em>Multiplicacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.MultiplicacionImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getMultiplicacion()
	 * @generated
	 */
	int MULTIPLICACION = 19;

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
	 * The meta object id for the '{@link PaymentsApp.impl.BusinessAttributeCollectionImpl <em>Business Attribute Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.BusinessAttributeCollectionImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getBusinessAttributeCollection()
	 * @generated
	 */
	int BUSINESS_ATTRIBUTE_COLLECTION = 20;

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
	 * The meta object id for the '{@link PaymentsApp.impl.DataFormImpl <em>Data Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.DataFormImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getDataForm()
	 * @generated
	 */
	int DATA_FORM = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Super Entity Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM__SUPER_ENTITY_ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Business Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM__BUSINESS_FIELDS = 2;

	/**
	 * The number of structural features of the '<em>Data Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link PaymentsApp.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see PaymentsApp.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link PaymentsApp.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PaymentsApp.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the containment reference '{@link PaymentsApp.Application#getIntermediary <em>Intermediary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Intermediary</em>'.
	 * @see PaymentsApp.Application#getIntermediary()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Intermediary();

	/**
	 * Returns the meta object for class '{@link PaymentsApp.Intermediary <em>Intermediary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediary</em>'.
	 * @see PaymentsApp.Intermediary
	 * @generated
	 */
	EClass getIntermediary();

	/**
	 * Returns the meta object for the attribute '{@link PaymentsApp.Intermediary#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PaymentsApp.Intermediary#getName()
	 * @see #getIntermediary()
	 * @generated
	 */
	EAttribute getIntermediary_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link PaymentsApp.Intermediary#getSuperentities <em>Superentities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Superentities</em>'.
	 * @see PaymentsApp.Intermediary#getSuperentities()
	 * @see #getIntermediary()
	 * @generated
	 */
	EReference getIntermediary_Superentities();

	/**
	 * Returns the meta object for the containment reference '{@link PaymentsApp.Intermediary#getBusinessValue <em>Business Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Business Value</em>'.
	 * @see PaymentsApp.Intermediary#getBusinessValue()
	 * @see #getIntermediary()
	 * @generated
	 */
	EReference getIntermediary_BusinessValue();

	/**
	 * Returns the meta object for the containment reference list '{@link PaymentsApp.Intermediary#getIntermediaryAttributes <em>Intermediary Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediary Attributes</em>'.
	 * @see PaymentsApp.Intermediary#getIntermediaryAttributes()
	 * @see #getIntermediary()
	 * @generated
	 */
	EReference getIntermediary_IntermediaryAttributes();

	/**
	 * Returns the meta object for the containment reference list '{@link PaymentsApp.Intermediary#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates</em>'.
	 * @see PaymentsApp.Intermediary#getTemplates()
	 * @see #getIntermediary()
	 * @generated
	 */
	EReference getIntermediary_Templates();

	/**
	 * Returns the meta object for class '{@link PaymentsApp.BusinessValue <em>Business Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Value</em>'.
	 * @see PaymentsApp.BusinessValue
	 * @generated
	 */
	EClass getBusinessValue();

	/**
	 * Returns the meta object for class '{@link PaymentsApp.SuperEntity <em>Super Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Entity</em>'.
	 * @see PaymentsApp.SuperEntity
	 * @generated
	 */
	EClass getSuperEntity();

	/**
	 * Returns the meta object for the attribute '{@link PaymentsApp.SuperEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PaymentsApp.SuperEntity#getName()
	 * @see #getSuperEntity()
	 * @generated
	 */
	EAttribute getSuperEntity_Name();

	/**
	 * Returns the meta object for the attribute '{@link PaymentsApp.SuperEntity#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see PaymentsApp.SuperEntity#getDescription()
	 * @see #getSuperEntity()
	 * @generated
	 */
	EAttribute getSuperEntity_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link PaymentsApp.SuperEntity#getAttLists <em>Att Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Att Lists</em>'.
	 * @see PaymentsApp.SuperEntity#getAttLists()
	 * @see #getSuperEntity()
	 * @generated
	 */
	EReference getSuperEntity_AttLists();

	/**
	 * Returns the meta object for the containment reference list '{@link PaymentsApp.SuperEntity#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participants</em>'.
	 * @see PaymentsApp.SuperEntity#getParticipants()
	 * @see #getSuperEntity()
	 * @generated
	 */
	EReference getSuperEntity_Participants();

	/**
	 * Returns the meta object for the containment reference list '{@link PaymentsApp.SuperEntity#getBusinessFields <em>Business Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Fields</em>'.
	 * @see PaymentsApp.SuperEntity#getBusinessFields()
	 * @see #getSuperEntity()
	 * @generated
	 */
	EReference getSuperEntity_BusinessFields();

	/**
	 * Returns the meta object for class '{@link PaymentsApp.BusinessString <em>Business String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business String</em>'.
	 * @see PaymentsApp.BusinessString
	 * @generated
	 */
	EClass getBusinessString();

	/**
	 * Returns the meta object for the attribute '{@link PaymentsApp.BusinessString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see PaymentsApp.BusinessString#getValue()
	 * @see #getBusinessString()
	 * @generated
	 */
	EAttribute getBusinessString_Value();

	/**
	 * Returns the meta object for class '{@link PaymentsApp.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant</em>'.
	 * @see PaymentsApp.Participant
	 * @generated
	 */
	EClass getParticipant();

	/**
	 * Returns the meta object for the attribute '{@link PaymentsApp.Participant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PaymentsApp.Participant#getName()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_Name();

	/**
	 * Returns the meta object for the attribute '{@link PaymentsApp.Participant#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see PaymentsApp.Participant#getDescription()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link PaymentsApp.Participant#getAttLists <em>Att Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Att Lists</em>'.
	 * @see PaymentsApp.Participant#getAttLists()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_AttLists();

	/**
	 * Returns the meta object for the containment reference list '{@link PaymentsApp.Participant#getTemplatesForms <em>Templates Forms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates Forms</em>'.
	 * @see PaymentsApp.Participant#getTemplatesForms()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_TemplatesForms();

	/**
	 * Returns the meta object for class '{@link PaymentsApp.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see PaymentsApp.Provider
	 * @generated
	 */
	EClass getProvider();

	/**
	 * Returns the meta object for the attribute '{@link PaymentsApp.Provider#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PaymentsApp.Provider#getName()
	 * @see #getProvider()
	 * @generated
	 */
	EAttribute getProvider_Name();

	/**
	 * Returns the meta object for the attribute '{@link PaymentsApp.Provider#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see PaymentsApp.Provider#getDescription()
	 * @see #getProvider()
	 * @generated
	 */
	EAttribute getProvider_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link PaymentsApp.Provider#getAttLists <em>Att Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Att Lists</em>'.
	 * @see PaymentsApp.Provider#getAttLists()
	 * @see #getProvider()
	 * @generated
	 */
	EReference getProvider_AttLists();

	/**
	 * Returns the meta object for class '{@link PaymentsApp.InformationTemplate <em>Information Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Template</em>'.
	 * @see PaymentsApp.InformationTemplate
	 * @generated
	 */
	EClass getInformationTemplate();

	/**
	 * Returns the meta object for the attribute '{@link PaymentsApp.InformationTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PaymentsApp.InformationTemplate#getName()
	 * @see #getInformationTemplate()
	 * @generated
	 */
	EAttribute getInformationTemplate_Name();

	/**
	 * Returns the meta object for the attribute '{@link PaymentsApp.InformationTemplate#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see PaymentsApp.InformationTemplate#getDescription()
	 * @see #getInformationTemplate()
	 * @generated
	 */
	EAttribute getInformationTemplate_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link PaymentsApp.InformationTemplate#getAttLists <em>Att Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Att Lists</em>'.
	 * @see PaymentsApp.InformationTemplate#getAttLists()
	 * @see #getInformationTemplate()
	 * @generated
	 */
	EReference getInformationTemplate_AttLists();

	/**
	 * Returns the meta object for the containment reference list '{@link PaymentsApp.InformationTemplate#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates</em>'.
	 * @see PaymentsApp.InformationTemplate#getTemplates()
	 * @see #getInformationTemplate()
	 * @generated
	 */
	EReference getInformationTemplate_Templates();

	/**
	 * Returns the meta object for the containment reference list '{@link PaymentsApp.InformationTemplate#getProviders <em>Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Providers</em>'.
	 * @see PaymentsApp.InformationTemplate#getProviders()
	 * @see #getInformationTemplate()
	 * @generated
	 */
	EReference getInformationTemplate_Providers();

	/**
	 * Returns the meta object for class '{@link PaymentsApp.CalculationTemplate <em>Calculation Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculation Template</em>'.
	 * @see PaymentsApp.CalculationTemplate
	 * @generated
	 */
	EClass getCalculationTemplate();

	/**
	 * Returns the meta object for the attribute '{@link PaymentsApp.CalculationTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PaymentsApp.CalculationTemplate#getName()
	 * @see #getCalculationTemplate()
	 * @generated
	 */
	EAttribute getCalculationTemplate_Name();

	/**
	 * Returns the meta object for the attribute '{@link PaymentsApp.CalculationTemplate#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see PaymentsApp.CalculationTemplate#getDescription()
	 * @see #getCalculationTemplate()
	 * @generated
	 */
	EAttribute getCalculationTemplate_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link PaymentsApp.CalculationTemplate#getAttLists <em>Att Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Att Lists</em>'.
	 * @see PaymentsApp.CalculationTemplate#getAttLists()
	 * @see #getCalculationTemplate()
	 * @generated
	 */
	EReference getCalculationTemplate_AttLists();

	/**
	 * Returns the meta object for the containment reference list '{@link PaymentsApp.CalculationTemplate#getFormulas <em>Formulas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formulas</em>'.
	 * @see PaymentsApp.CalculationTemplate#getFormulas()
	 * @see #getCalculationTemplate()
	 * @generated
	 */
	EReference getCalculationTemplate_Formulas();

	/**
	 * Returns the meta object for class '{@link PaymentsApp.Formula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formula</em>'.
	 * @see PaymentsApp.Formula
	 * @generated
	 */
	EClass getFormula();

	/**
	 * Returns the meta object for the containment reference list '{@link PaymentsApp.Formula#getFormulaBody <em>Formula Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formula Body</em>'.
	 * @see PaymentsApp.Formula#getFormulaBody()
	 * @see #getFormula()
	 * @generated
	 */
	EReference getFormula_FormulaBody();

	/**
	 * Returns the meta object for the containment reference '{@link PaymentsApp.Formula#getFormulaReturn <em>Formula Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Formula Return</em>'.
	 * @see PaymentsApp.Formula#getFormulaReturn()
	 * @see #getFormula()
	 * @generated
	 */
	EReference getFormula_FormulaReturn();

	/**
	 * Returns the meta object for class '{@link PaymentsApp.IfBlock <em>If Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Block</em>'.
	 * @see PaymentsApp.IfBlock
	 * @generated
	 */
	EClass getIfBlock();

	/**
	 * Returns the meta object for the containment reference '{@link PaymentsApp.IfBlock#getIfSentence <em>If Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Sentence</em>'.
	 * @see PaymentsApp.IfBlock#getIfSentence()
	 * @see #getIfBlock()
	 * @generated
	 */
	EReference getIfBlock_IfSentence();

	/**
	 * Returns the meta object for the containment reference '{@link PaymentsApp.IfBlock#getElseSentence <em>Else Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Sentence</em>'.
	 * @see PaymentsApp.IfBlock#getElseSentence()
	 * @see #getIfBlock()
	 * @generated
	 */
	EReference getIfBlock_ElseSentence();

	/**
	 * Returns the meta object for class '{@link PaymentsApp.IfCondition <em>If Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Condition</em>'.
	 * @see PaymentsApp.IfCondition
	 * @generated
	 */
	EClass getIfCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link PaymentsApp.IfCondition#getLogExp <em>Log Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Log Exp</em>'.
	 * @see PaymentsApp.IfCondition#getLogExp()
	 * @see #getIfCondition()
	 * @generated
	 */
	EReference getIfCondition_LogExp();

	/**
	 * Returns the meta object for the containment reference list '{@link PaymentsApp.IfCondition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see PaymentsApp.IfCondition#getExpression()
	 * @see #getIfCondition()
	 * @generated
	 */
	EReference getIfCondition_Expression();

	/**
	 * Returns the meta object for class '{@link PaymentsApp.ElseSegment <em>Else Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else Segment</em>'.
	 * @see PaymentsApp.ElseSegment
	 * @generated
	 */
	EClass getElseSegment();

	/**
	 * Returns the meta object for the containment reference '{@link PaymentsApp.ElseSegment#getIfSentence <em>If Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Sentence</em>'.
	 * @see PaymentsApp.ElseSegment#getIfSentence()
	 * @see #getElseSegment()
	 * @generated
	 */
	EReference getElseSegment_IfSentence();

	/**
	 * Returns the meta object for class '{@link PaymentsApp.ReturnBlock <em>Return Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Block</em>'.
	 * @see PaymentsApp.ReturnBlock
	 * @generated
	 */
	EClass getReturnBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link PaymentsApp.ReturnBlock#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see PaymentsApp.ReturnBlock#getExpression()
	 * @see #getReturnBlock()
	 * @generated
	 */
	EReference getReturnBlock_Expression();

	/**
	 * Returns the meta object for class '{@link PaymentsApp.ExpresionLogica <em>Expresion Logica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expresion Logica</em>'.
	 * @see PaymentsApp.ExpresionLogica
	 * @generated
	 */
	EClass getExpresionLogica();

	/**
	 * Returns the meta object for the containment reference list '{@link PaymentsApp.ExpresionLogica#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see PaymentsApp.ExpresionLogica#getVariable()
	 * @see #getExpresionLogica()
	 * @generated
	 */
	EReference getExpresionLogica_Variable();

	/**
	 * Returns the meta object for the attribute list '{@link PaymentsApp.ExpresionLogica#getLogOper <em>Log Oper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Log Oper</em>'.
	 * @see PaymentsApp.ExpresionLogica#getLogOper()
	 * @see #getExpresionLogica()
	 * @generated
	 */
	EAttribute getExpresionLogica_LogOper();

	/**
	 * Returns the meta object for the containment reference list '{@link PaymentsApp.ExpresionLogica#getVariable2 <em>Variable2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable2</em>'.
	 * @see PaymentsApp.ExpresionLogica#getVariable2()
	 * @see #getExpresionLogica()
	 * @generated
	 */
	EReference getExpresionLogica_Variable2();

	/**
	 * Returns the meta object for the attribute list '{@link PaymentsApp.ExpresionLogica#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Literal</em>'.
	 * @see PaymentsApp.ExpresionLogica#getLiteral()
	 * @see #getExpresionLogica()
	 * @generated
	 */
	EAttribute getExpresionLogica_Literal();

	/**
	 * Returns the meta object for the containment reference list '{@link PaymentsApp.ExpresionLogica#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exp</em>'.
	 * @see PaymentsApp.ExpresionLogica#getExp()
	 * @see #getExpresionLogica()
	 * @generated
	 */
	EReference getExpresionLogica_Exp();

	/**
	 * Returns the meta object for class '{@link PaymentsApp.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see PaymentsApp.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link PaymentsApp.BusinessAttribute <em>Business Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Attribute</em>'.
	 * @see PaymentsApp.BusinessAttribute
	 * @generated
	 */
	EClass getBusinessAttribute();

	/**
	 * Returns the meta object for the attribute '{@link PaymentsApp.BusinessAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PaymentsApp.BusinessAttribute#getName()
	 * @see #getBusinessAttribute()
	 * @generated
	 */
	EAttribute getBusinessAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link PaymentsApp.BusinessAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see PaymentsApp.BusinessAttribute#getType()
	 * @see #getBusinessAttribute()
	 * @generated
	 */
	EAttribute getBusinessAttribute_Type();

	/**
	 * Returns the meta object for the containment reference '{@link PaymentsApp.BusinessAttribute#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see PaymentsApp.BusinessAttribute#getExp()
	 * @see #getBusinessAttribute()
	 * @generated
	 */
	EReference getBusinessAttribute_Exp();

	/**
	 * Returns the meta object for the reference list '{@link PaymentsApp.BusinessAttribute#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relations</em>'.
	 * @see PaymentsApp.BusinessAttribute#getRelations()
	 * @see #getBusinessAttribute()
	 * @generated
	 */
	EReference getBusinessAttribute_Relations();

	/**
	 * Returns the meta object for the reference '{@link PaymentsApp.BusinessAttribute#getBusinessValue <em>Business Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Business Value</em>'.
	 * @see PaymentsApp.BusinessAttribute#getBusinessValue()
	 * @see #getBusinessAttribute()
	 * @generated
	 */
	EReference getBusinessAttribute_BusinessValue();

	/**
	 * Returns the meta object for class '{@link PaymentsApp.TerminalValue <em>Terminal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal Value</em>'.
	 * @see PaymentsApp.TerminalValue
	 * @generated
	 */
	EClass getTerminalValue();

	/**
	 * Returns the meta object for the reference '{@link PaymentsApp.TerminalValue#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see PaymentsApp.TerminalValue#getVariable()
	 * @see #getTerminalValue()
	 * @generated
	 */
	EReference getTerminalValue_Variable();

	/**
	 * Returns the meta object for the attribute '{@link PaymentsApp.TerminalValue#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see PaymentsApp.TerminalValue#getValor()
	 * @see #getTerminalValue()
	 * @generated
	 */
	EAttribute getTerminalValue_Valor();

	/**
	 * Returns the meta object for class '{@link PaymentsApp.Adicion <em>Adicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adicion</em>'.
	 * @see PaymentsApp.Adicion
	 * @generated
	 */
	EClass getAdicion();

	/**
	 * Returns the meta object for the containment reference '{@link PaymentsApp.Adicion#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see PaymentsApp.Adicion#getLeft()
	 * @see #getAdicion()
	 * @generated
	 */
	EReference getAdicion_Left();

	/**
	 * Returns the meta object for the attribute '{@link PaymentsApp.Adicion#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see PaymentsApp.Adicion#getOperator()
	 * @see #getAdicion()
	 * @generated
	 */
	EAttribute getAdicion_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link PaymentsApp.Adicion#getRexp <em>Rexp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rexp</em>'.
	 * @see PaymentsApp.Adicion#getRexp()
	 * @see #getAdicion()
	 * @generated
	 */
	EReference getAdicion_Rexp();

	/**
	 * Returns the meta object for class '{@link PaymentsApp.Multiplicacion <em>Multiplicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicacion</em>'.
	 * @see PaymentsApp.Multiplicacion
	 * @generated
	 */
	EClass getMultiplicacion();

	/**
	 * Returns the meta object for the containment reference '{@link PaymentsApp.Multiplicacion#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see PaymentsApp.Multiplicacion#getLeft()
	 * @see #getMultiplicacion()
	 * @generated
	 */
	EReference getMultiplicacion_Left();

	/**
	 * Returns the meta object for the attribute '{@link PaymentsApp.Multiplicacion#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see PaymentsApp.Multiplicacion#getOperator()
	 * @see #getMultiplicacion()
	 * @generated
	 */
	EAttribute getMultiplicacion_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link PaymentsApp.Multiplicacion#getRexp <em>Rexp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rexp</em>'.
	 * @see PaymentsApp.Multiplicacion#getRexp()
	 * @see #getMultiplicacion()
	 * @generated
	 */
	EReference getMultiplicacion_Rexp();

	/**
	 * Returns the meta object for class '{@link PaymentsApp.BusinessAttributeCollection <em>Business Attribute Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Attribute Collection</em>'.
	 * @see PaymentsApp.BusinessAttributeCollection
	 * @generated
	 */
	EClass getBusinessAttributeCollection();

	/**
	 * Returns the meta object for the attribute '{@link PaymentsApp.BusinessAttributeCollection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PaymentsApp.BusinessAttributeCollection#getName()
	 * @see #getBusinessAttributeCollection()
	 * @generated
	 */
	EAttribute getBusinessAttributeCollection_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link PaymentsApp.BusinessAttributeCollection#getBusinessAttributes <em>Business Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Attributes</em>'.
	 * @see PaymentsApp.BusinessAttributeCollection#getBusinessAttributes()
	 * @see #getBusinessAttributeCollection()
	 * @generated
	 */
	EReference getBusinessAttributeCollection_BusinessAttributes();

	/**
	 * Returns the meta object for class '{@link PaymentsApp.DataForm <em>Data Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Form</em>'.
	 * @see PaymentsApp.DataForm
	 * @generated
	 */
	EClass getDataForm();

	/**
	 * Returns the meta object for the attribute '{@link PaymentsApp.DataForm#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PaymentsApp.DataForm#getName()
	 * @see #getDataForm()
	 * @generated
	 */
	EAttribute getDataForm_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link PaymentsApp.DataForm#getSuperEntityAttributes <em>Super Entity Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Super Entity Attributes</em>'.
	 * @see PaymentsApp.DataForm#getSuperEntityAttributes()
	 * @see #getDataForm()
	 * @generated
	 */
	EReference getDataForm_SuperEntityAttributes();

	/**
	 * Returns the meta object for the containment reference list '{@link PaymentsApp.DataForm#getBusinessFields <em>Business Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Fields</em>'.
	 * @see PaymentsApp.DataForm#getBusinessFields()
	 * @see #getDataForm()
	 * @generated
	 */
	EReference getDataForm_BusinessFields();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PaymentsAppFactory getPaymentsAppFactory();

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
		 * The meta object literal for the '{@link PaymentsApp.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PaymentsApp.impl.ApplicationImpl
		 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getApplication()
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
		 * The meta object literal for the '{@link PaymentsApp.impl.IntermediaryImpl <em>Intermediary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PaymentsApp.impl.IntermediaryImpl
		 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getIntermediary()
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
		 * The meta object literal for the '<em><b>Business Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIARY__BUSINESS_VALUE = eINSTANCE.getIntermediary_BusinessValue();

		/**
		 * The meta object literal for the '<em><b>Intermediary Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIARY__INTERMEDIARY_ATTRIBUTES = eINSTANCE.getIntermediary_IntermediaryAttributes();

		/**
		 * The meta object literal for the '<em><b>Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIARY__TEMPLATES = eINSTANCE.getIntermediary_Templates();

		/**
		 * The meta object literal for the '{@link PaymentsApp.impl.BusinessValueImpl <em>Business Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PaymentsApp.impl.BusinessValueImpl
		 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getBusinessValue()
		 * @generated
		 */
		EClass BUSINESS_VALUE = eINSTANCE.getBusinessValue();

		/**
		 * The meta object literal for the '{@link PaymentsApp.impl.SuperEntityImpl <em>Super Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PaymentsApp.impl.SuperEntityImpl
		 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getSuperEntity()
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
		 * The meta object literal for the '<em><b>Business Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_ENTITY__BUSINESS_FIELDS = eINSTANCE.getSuperEntity_BusinessFields();

		/**
		 * The meta object literal for the '{@link PaymentsApp.impl.BusinessStringImpl <em>Business String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PaymentsApp.impl.BusinessStringImpl
		 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getBusinessString()
		 * @generated
		 */
		EClass BUSINESS_STRING = eINSTANCE.getBusinessString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_STRING__VALUE = eINSTANCE.getBusinessString_Value();

		/**
		 * The meta object literal for the '{@link PaymentsApp.impl.ParticipantImpl <em>Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PaymentsApp.impl.ParticipantImpl
		 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getParticipant()
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
		 * The meta object literal for the '{@link PaymentsApp.impl.ProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PaymentsApp.impl.ProviderImpl
		 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getProvider()
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
		 * The meta object literal for the '{@link PaymentsApp.impl.InformationTemplateImpl <em>Information Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PaymentsApp.impl.InformationTemplateImpl
		 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getInformationTemplate()
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
		 * The meta object literal for the '{@link PaymentsApp.impl.CalculationTemplateImpl <em>Calculation Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PaymentsApp.impl.CalculationTemplateImpl
		 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getCalculationTemplate()
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
		 * The meta object literal for the '{@link PaymentsApp.impl.FormulaImpl <em>Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PaymentsApp.impl.FormulaImpl
		 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getFormula()
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
		 * The meta object literal for the '{@link PaymentsApp.impl.IfBlockImpl <em>If Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PaymentsApp.impl.IfBlockImpl
		 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getIfBlock()
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
		 * The meta object literal for the '{@link PaymentsApp.impl.IfConditionImpl <em>If Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PaymentsApp.impl.IfConditionImpl
		 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getIfCondition()
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
		 * The meta object literal for the '{@link PaymentsApp.impl.ElseSegmentImpl <em>Else Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PaymentsApp.impl.ElseSegmentImpl
		 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getElseSegment()
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
		 * The meta object literal for the '{@link PaymentsApp.impl.ReturnBlockImpl <em>Return Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PaymentsApp.impl.ReturnBlockImpl
		 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getReturnBlock()
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
		 * The meta object literal for the '{@link PaymentsApp.impl.ExpresionLogicaImpl <em>Expresion Logica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PaymentsApp.impl.ExpresionLogicaImpl
		 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getExpresionLogica()
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
		 * The meta object literal for the '{@link PaymentsApp.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PaymentsApp.impl.ExpressionImpl
		 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link PaymentsApp.impl.BusinessAttributeImpl <em>Business Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PaymentsApp.impl.BusinessAttributeImpl
		 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getBusinessAttribute()
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
		 * The meta object literal for the '<em><b>Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ATTRIBUTE__RELATIONS = eINSTANCE.getBusinessAttribute_Relations();

		/**
		 * The meta object literal for the '<em><b>Business Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ATTRIBUTE__BUSINESS_VALUE = eINSTANCE.getBusinessAttribute_BusinessValue();

		/**
		 * The meta object literal for the '{@link PaymentsApp.impl.TerminalValueImpl <em>Terminal Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PaymentsApp.impl.TerminalValueImpl
		 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getTerminalValue()
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
		 * The meta object literal for the '{@link PaymentsApp.impl.AdicionImpl <em>Adicion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PaymentsApp.impl.AdicionImpl
		 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getAdicion()
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
		 * The meta object literal for the '{@link PaymentsApp.impl.MultiplicacionImpl <em>Multiplicacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PaymentsApp.impl.MultiplicacionImpl
		 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getMultiplicacion()
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
		 * The meta object literal for the '{@link PaymentsApp.impl.BusinessAttributeCollectionImpl <em>Business Attribute Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PaymentsApp.impl.BusinessAttributeCollectionImpl
		 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getBusinessAttributeCollection()
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

		/**
		 * The meta object literal for the '{@link PaymentsApp.impl.DataFormImpl <em>Data Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PaymentsApp.impl.DataFormImpl
		 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getDataForm()
		 * @generated
		 */
		EClass DATA_FORM = eINSTANCE.getDataForm();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FORM__NAME = eINSTANCE.getDataForm_Name();

		/**
		 * The meta object literal for the '<em><b>Super Entity Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FORM__SUPER_ENTITY_ATTRIBUTES = eINSTANCE.getDataForm_SuperEntityAttributes();

		/**
		 * The meta object literal for the '<em><b>Business Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FORM__BUSINESS_FIELDS = eINSTANCE.getDataForm_BusinessFields();

	}

} //PaymentsAppPackage
