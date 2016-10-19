/**
 */
package PaymentsApp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
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
	String eNS_URI = "PaymentsApp";

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
	 * The meta object id for the '{@link PaymentsApp.impl.IntermediaryImpl <em>Intermediary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.IntermediaryImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getIntermediary()
	 * @generated
	 */
	int INTERMEDIARY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIARY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIARY__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIARY__PROVIDERS = 2;

	/**
	 * The feature id for the '<em><b>Superentity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIARY__SUPERENTITY = 3;

	/**
	 * The feature id for the '<em><b>Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIARY__TEMPLATES = 4;

	/**
	 * The feature id for the '<em><b>Participantprofiles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIARY__PARTICIPANTPROFILES = 5;

	/**
	 * The number of structural features of the '<em>Intermediary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIARY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Intermediary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PaymentsApp.impl.ParticipantProfileImpl <em>Participant Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.ParticipantProfileImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getParticipantProfile()
	 * @generated
	 */
	int PARTICIPANT_PROFILE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_PROFILE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Participant Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_PROFILE__PARTICIPANT_ATTRIBUTES = 1;

	/**
	 * The number of structural features of the '<em>Participant Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_PROFILE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Participant Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_PROFILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PaymentsApp.impl.ProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.ProviderImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getProvider()
	 * @generated
	 */
	int PROVIDER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Provider Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__PROVIDER_ATTRIBUTES = 1;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PaymentsApp.impl.BusinessAttributeImpl <em>Business Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.BusinessAttributeImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getBusinessAttribute()
	 * @generated
	 */
	int BUSINESS_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Business Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE__BUSINESS_CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Business Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE__BUSINESS_RULES = 2;

	/**
	 * The feature id for the '<em><b>Business Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE__BUSINESS_VALUE = 3;

	/**
	 * The number of structural features of the '<em>Business Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Business Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PaymentsApp.impl.BusinessValueImpl <em>Business Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.BusinessValueImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getBusinessValue()
	 * @generated
	 */
	int BUSINESS_VALUE = 4;

	/**
	 * The number of structural features of the '<em>Business Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Business Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PaymentsApp.impl.BusinessRuleImpl <em>Business Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.BusinessRuleImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getBusinessRule()
	 * @generated
	 */
	int BUSINESS_RULE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Business Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__BUSINESS_CONDITIONS = 2;

	/**
	 * The number of structural features of the '<em>Business Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Business Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PaymentsApp.impl.BusinessStringImpl <em>Business String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.BusinessStringImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getBusinessString()
	 * @generated
	 */
	int BUSINESS_STRING = 6;

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
	 * The number of operations of the '<em>Business String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_STRING_OPERATION_COUNT = BUSINESS_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PaymentsApp.impl.BusinessNumberImpl <em>Business Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.BusinessNumberImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getBusinessNumber()
	 * @generated
	 */
	int BUSINESS_NUMBER = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_NUMBER__VALUE = BUSINESS_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Business Calculations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_NUMBER__BUSINESS_CALCULATIONS = BUSINESS_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Business Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_NUMBER_FEATURE_COUNT = BUSINESS_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Business Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_NUMBER_OPERATION_COUNT = BUSINESS_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PaymentsApp.impl.BusinessConditionImpl <em>Business Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.BusinessConditionImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getBusinessCondition()
	 * @generated
	 */
	int BUSINESS_CONDITION = 8;

	/**
	 * The feature id for the '<em><b>Additional Business Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CONDITION__ADDITIONAL_BUSINESS_CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CONDITION__COMPARISON = 1;

	/**
	 * The feature id for the '<em><b>Condition Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CONDITION__CONDITION_VALUES = 2;

	/**
	 * The number of structural features of the '<em>Business Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CONDITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Business Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PaymentsApp.impl.BusinessAttributeCollectionImpl <em>Business Attribute Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.BusinessAttributeCollectionImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getBusinessAttributeCollection()
	 * @generated
	 */
	int BUSINESS_ATTRIBUTE_COLLECTION = 9;

	/**
	 * The feature id for the '<em><b>Business Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE_COLLECTION__BUSINESS_ATTRIBUTES = 0;

	/**
	 * The number of structural features of the '<em>Business Attribute Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE_COLLECTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Business Attribute Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE_COLLECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PaymentsApp.impl.InformationTemplateImpl <em>Information Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.InformationTemplateImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getInformationTemplate()
	 * @generated
	 */
	int INFORMATION_TEMPLATE = 10;

	/**
	 * The feature id for the '<em><b>Participants Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TEMPLATE__PARTICIPANTS_FIELDS = 0;

	/**
	 * The feature id for the '<em><b>Providers Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TEMPLATE__PROVIDERS_FIELDS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TEMPLATE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TEMPLATE__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Business Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TEMPLATE__BUSINESS_FIELDS = 4;

	/**
	 * The number of structural features of the '<em>Information Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TEMPLATE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Information Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PaymentsApp.impl.BusinessCalculationImpl <em>Business Calculation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.BusinessCalculationImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getBusinessCalculation()
	 * @generated
	 */
	int BUSINESS_CALCULATION = 11;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CALCULATION__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Calculation Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CALCULATION__CALCULATION_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Additional Calculations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CALCULATION__ADDITIONAL_CALCULATIONS = 2;

	/**
	 * The number of structural features of the '<em>Business Calculation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CALCULATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Business Calculation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CALCULATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PaymentsApp.impl.SuperEntityImpl <em>Super Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.SuperEntityImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getSuperEntity()
	 * @generated
	 */
	int SUPER_ENTITY = 12;

	/**
	 * The feature id for the '<em><b>Super Entity Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ENTITY__SUPER_ENTITY_ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ENTITY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Templates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ENTITY__TEMPLATES = 2;

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
	 * The number of operations of the '<em>Super Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PaymentsApp.impl.ParticipantImpl <em>Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.ParticipantImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getParticipant()
	 * @generated
	 */
	int PARTICIPANT = 13;

	/**
	 * The feature id for the '<em><b>Participantprofile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__PARTICIPANTPROFILE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Businessattributecollection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__BUSINESSATTRIBUTECOLLECTION = 2;

	/**
	 * The number of structural features of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PaymentsApp.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.impl.ApplicationImpl
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 14;

	/**
	 * The feature id for the '<em><b>Intermediary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__INTERMEDIARY = 0;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PaymentsApp.BusinessCategory <em>Business Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.BusinessCategory
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getBusinessCategory()
	 * @generated
	 */
	int BUSINESS_CATEGORY = 15;

	/**
	 * The meta object id for the '{@link PaymentsApp.Operations <em>Operations</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.Operations
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getOperations()
	 * @generated
	 */
	int OPERATIONS = 16;

	/**
	 * The meta object id for the '{@link PaymentsApp.Comparisons <em>Comparisons</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PaymentsApp.Comparisons
	 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getComparisons()
	 * @generated
	 */
	int COMPARISONS = 17;


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
	 * Returns the meta object for the attribute '{@link PaymentsApp.Intermediary#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see PaymentsApp.Intermediary#getDescription()
	 * @see #getIntermediary()
	 * @generated
	 */
	EAttribute getIntermediary_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link PaymentsApp.Intermediary#getProviders <em>Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Providers</em>'.
	 * @see PaymentsApp.Intermediary#getProviders()
	 * @see #getIntermediary()
	 * @generated
	 */
	EReference getIntermediary_Providers();

	/**
	 * Returns the meta object for the containment reference list '{@link PaymentsApp.Intermediary#getSuperentity <em>Superentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Superentity</em>'.
	 * @see PaymentsApp.Intermediary#getSuperentity()
	 * @see #getIntermediary()
	 * @generated
	 */
	EReference getIntermediary_Superentity();

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
	 * Returns the meta object for the containment reference list '{@link PaymentsApp.Intermediary#getParticipantprofiles <em>Participantprofiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participantprofiles</em>'.
	 * @see PaymentsApp.Intermediary#getParticipantprofiles()
	 * @see #getIntermediary()
	 * @generated
	 */
	EReference getIntermediary_Participantprofiles();

	/**
	 * Returns the meta object for class '{@link PaymentsApp.ParticipantProfile <em>Participant Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant Profile</em>'.
	 * @see PaymentsApp.ParticipantProfile
	 * @generated
	 */
	EClass getParticipantProfile();

	/**
	 * Returns the meta object for the attribute '{@link PaymentsApp.ParticipantProfile#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PaymentsApp.ParticipantProfile#getName()
	 * @see #getParticipantProfile()
	 * @generated
	 */
	EAttribute getParticipantProfile_Name();

	/**
	 * Returns the meta object for the containment reference '{@link PaymentsApp.ParticipantProfile#getParticipantAttributes <em>Participant Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Participant Attributes</em>'.
	 * @see PaymentsApp.ParticipantProfile#getParticipantAttributes()
	 * @see #getParticipantProfile()
	 * @generated
	 */
	EReference getParticipantProfile_ParticipantAttributes();

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
	 * Returns the meta object for the containment reference '{@link PaymentsApp.Provider#getProviderAttributes <em>Provider Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Provider Attributes</em>'.
	 * @see PaymentsApp.Provider#getProviderAttributes()
	 * @see #getProvider()
	 * @generated
	 */
	EReference getProvider_ProviderAttributes();

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
	 * Returns the meta object for the attribute '{@link PaymentsApp.BusinessAttribute#getBusinessCategory <em>Business Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business Category</em>'.
	 * @see PaymentsApp.BusinessAttribute#getBusinessCategory()
	 * @see #getBusinessAttribute()
	 * @generated
	 */
	EAttribute getBusinessAttribute_BusinessCategory();

	/**
	 * Returns the meta object for the containment reference list '{@link PaymentsApp.BusinessAttribute#getBusinessRules <em>Business Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Rules</em>'.
	 * @see PaymentsApp.BusinessAttribute#getBusinessRules()
	 * @see #getBusinessAttribute()
	 * @generated
	 */
	EReference getBusinessAttribute_BusinessRules();

	/**
	 * Returns the meta object for the containment reference '{@link PaymentsApp.BusinessAttribute#getBusinessValue <em>Business Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Business Value</em>'.
	 * @see PaymentsApp.BusinessAttribute#getBusinessValue()
	 * @see #getBusinessAttribute()
	 * @generated
	 */
	EReference getBusinessAttribute_BusinessValue();

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
	 * Returns the meta object for class '{@link PaymentsApp.BusinessRule <em>Business Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Rule</em>'.
	 * @see PaymentsApp.BusinessRule
	 * @generated
	 */
	EClass getBusinessRule();

	/**
	 * Returns the meta object for the attribute '{@link PaymentsApp.BusinessRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PaymentsApp.BusinessRule#getName()
	 * @see #getBusinessRule()
	 * @generated
	 */
	EAttribute getBusinessRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link PaymentsApp.BusinessRule#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see PaymentsApp.BusinessRule#getDescription()
	 * @see #getBusinessRule()
	 * @generated
	 */
	EAttribute getBusinessRule_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link PaymentsApp.BusinessRule#getBusinessConditions <em>Business Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Conditions</em>'.
	 * @see PaymentsApp.BusinessRule#getBusinessConditions()
	 * @see #getBusinessRule()
	 * @generated
	 */
	EReference getBusinessRule_BusinessConditions();

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
	 * Returns the meta object for class '{@link PaymentsApp.BusinessNumber <em>Business Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Number</em>'.
	 * @see PaymentsApp.BusinessNumber
	 * @generated
	 */
	EClass getBusinessNumber();

	/**
	 * Returns the meta object for the attribute '{@link PaymentsApp.BusinessNumber#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see PaymentsApp.BusinessNumber#getValue()
	 * @see #getBusinessNumber()
	 * @generated
	 */
	EAttribute getBusinessNumber_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link PaymentsApp.BusinessNumber#getBusinessCalculations <em>Business Calculations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Calculations</em>'.
	 * @see PaymentsApp.BusinessNumber#getBusinessCalculations()
	 * @see #getBusinessNumber()
	 * @generated
	 */
	EReference getBusinessNumber_BusinessCalculations();

	/**
	 * Returns the meta object for class '{@link PaymentsApp.BusinessCondition <em>Business Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Condition</em>'.
	 * @see PaymentsApp.BusinessCondition
	 * @generated
	 */
	EClass getBusinessCondition();

	/**
	 * Returns the meta object for the reference list '{@link PaymentsApp.BusinessCondition#getAdditionalBusinessConditions <em>Additional Business Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Additional Business Conditions</em>'.
	 * @see PaymentsApp.BusinessCondition#getAdditionalBusinessConditions()
	 * @see #getBusinessCondition()
	 * @generated
	 */
	EReference getBusinessCondition_AdditionalBusinessConditions();

	/**
	 * Returns the meta object for the attribute '{@link PaymentsApp.BusinessCondition#getComparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison</em>'.
	 * @see PaymentsApp.BusinessCondition#getComparison()
	 * @see #getBusinessCondition()
	 * @generated
	 */
	EAttribute getBusinessCondition_Comparison();

	/**
	 * Returns the meta object for the reference list '{@link PaymentsApp.BusinessCondition#getConditionValues <em>Condition Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Condition Values</em>'.
	 * @see PaymentsApp.BusinessCondition#getConditionValues()
	 * @see #getBusinessCondition()
	 * @generated
	 */
	EReference getBusinessCondition_ConditionValues();

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
	 * Returns the meta object for class '{@link PaymentsApp.InformationTemplate <em>Information Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Template</em>'.
	 * @see PaymentsApp.InformationTemplate
	 * @generated
	 */
	EClass getInformationTemplate();

	/**
	 * Returns the meta object for the reference list '{@link PaymentsApp.InformationTemplate#getParticipantsFields <em>Participants Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participants Fields</em>'.
	 * @see PaymentsApp.InformationTemplate#getParticipantsFields()
	 * @see #getInformationTemplate()
	 * @generated
	 */
	EReference getInformationTemplate_ParticipantsFields();

	/**
	 * Returns the meta object for the reference list '{@link PaymentsApp.InformationTemplate#getProvidersFields <em>Providers Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Providers Fields</em>'.
	 * @see PaymentsApp.InformationTemplate#getProvidersFields()
	 * @see #getInformationTemplate()
	 * @generated
	 */
	EReference getInformationTemplate_ProvidersFields();

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
	 * Returns the meta object for the containment reference list '{@link PaymentsApp.InformationTemplate#getBusinessFields <em>Business Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Fields</em>'.
	 * @see PaymentsApp.InformationTemplate#getBusinessFields()
	 * @see #getInformationTemplate()
	 * @generated
	 */
	EReference getInformationTemplate_BusinessFields();

	/**
	 * Returns the meta object for class '{@link PaymentsApp.BusinessCalculation <em>Business Calculation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Calculation</em>'.
	 * @see PaymentsApp.BusinessCalculation
	 * @generated
	 */
	EClass getBusinessCalculation();

	/**
	 * Returns the meta object for the attribute '{@link PaymentsApp.BusinessCalculation#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see PaymentsApp.BusinessCalculation#getOperation()
	 * @see #getBusinessCalculation()
	 * @generated
	 */
	EAttribute getBusinessCalculation_Operation();

	/**
	 * Returns the meta object for the reference list '{@link PaymentsApp.BusinessCalculation#getCalculationValues <em>Calculation Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Calculation Values</em>'.
	 * @see PaymentsApp.BusinessCalculation#getCalculationValues()
	 * @see #getBusinessCalculation()
	 * @generated
	 */
	EReference getBusinessCalculation_CalculationValues();

	/**
	 * Returns the meta object for the reference list '{@link PaymentsApp.BusinessCalculation#getAdditionalCalculations <em>Additional Calculations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Additional Calculations</em>'.
	 * @see PaymentsApp.BusinessCalculation#getAdditionalCalculations()
	 * @see #getBusinessCalculation()
	 * @generated
	 */
	EReference getBusinessCalculation_AdditionalCalculations();

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
	 * Returns the meta object for the containment reference '{@link PaymentsApp.SuperEntity#getSuperEntityAttributes <em>Super Entity Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Super Entity Attributes</em>'.
	 * @see PaymentsApp.SuperEntity#getSuperEntityAttributes()
	 * @see #getSuperEntity()
	 * @generated
	 */
	EReference getSuperEntity_SuperEntityAttributes();

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
	 * Returns the meta object for the reference list '{@link PaymentsApp.SuperEntity#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Templates</em>'.
	 * @see PaymentsApp.SuperEntity#getTemplates()
	 * @see #getSuperEntity()
	 * @generated
	 */
	EReference getSuperEntity_Templates();

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
	 * Returns the meta object for class '{@link PaymentsApp.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant</em>'.
	 * @see PaymentsApp.Participant
	 * @generated
	 */
	EClass getParticipant();

	/**
	 * Returns the meta object for the reference '{@link PaymentsApp.Participant#getParticipantprofile <em>Participantprofile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Participantprofile</em>'.
	 * @see PaymentsApp.Participant#getParticipantprofile()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Participantprofile();

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
	 * Returns the meta object for the containment reference list '{@link PaymentsApp.Participant#getBusinessattributecollection <em>Businessattributecollection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Businessattributecollection</em>'.
	 * @see PaymentsApp.Participant#getBusinessattributecollection()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Businessattributecollection();

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
	 * Returns the meta object for enum '{@link PaymentsApp.BusinessCategory <em>Business Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Business Category</em>'.
	 * @see PaymentsApp.BusinessCategory
	 * @generated
	 */
	EEnum getBusinessCategory();

	/**
	 * Returns the meta object for enum '{@link PaymentsApp.Operations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operations</em>'.
	 * @see PaymentsApp.Operations
	 * @generated
	 */
	EEnum getOperations();

	/**
	 * Returns the meta object for enum '{@link PaymentsApp.Comparisons <em>Comparisons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparisons</em>'.
	 * @see PaymentsApp.Comparisons
	 * @generated
	 */
	EEnum getComparisons();

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
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
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
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERMEDIARY__DESCRIPTION = eINSTANCE.getIntermediary_Description();

		/**
		 * The meta object literal for the '<em><b>Providers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIARY__PROVIDERS = eINSTANCE.getIntermediary_Providers();

		/**
		 * The meta object literal for the '<em><b>Superentity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIARY__SUPERENTITY = eINSTANCE.getIntermediary_Superentity();

		/**
		 * The meta object literal for the '<em><b>Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIARY__TEMPLATES = eINSTANCE.getIntermediary_Templates();

		/**
		 * The meta object literal for the '<em><b>Participantprofiles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIARY__PARTICIPANTPROFILES = eINSTANCE.getIntermediary_Participantprofiles();

		/**
		 * The meta object literal for the '{@link PaymentsApp.impl.ParticipantProfileImpl <em>Participant Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PaymentsApp.impl.ParticipantProfileImpl
		 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getParticipantProfile()
		 * @generated
		 */
		EClass PARTICIPANT_PROFILE = eINSTANCE.getParticipantProfile();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT_PROFILE__NAME = eINSTANCE.getParticipantProfile_Name();

		/**
		 * The meta object literal for the '<em><b>Participant Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT_PROFILE__PARTICIPANT_ATTRIBUTES = eINSTANCE.getParticipantProfile_ParticipantAttributes();

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
		 * The meta object literal for the '<em><b>Provider Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDER__PROVIDER_ATTRIBUTES = eINSTANCE.getProvider_ProviderAttributes();

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
		 * The meta object literal for the '<em><b>Business Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_ATTRIBUTE__BUSINESS_CATEGORY = eINSTANCE.getBusinessAttribute_BusinessCategory();

		/**
		 * The meta object literal for the '<em><b>Business Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ATTRIBUTE__BUSINESS_RULES = eINSTANCE.getBusinessAttribute_BusinessRules();

		/**
		 * The meta object literal for the '<em><b>Business Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ATTRIBUTE__BUSINESS_VALUE = eINSTANCE.getBusinessAttribute_BusinessValue();

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
		 * The meta object literal for the '{@link PaymentsApp.impl.BusinessRuleImpl <em>Business Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PaymentsApp.impl.BusinessRuleImpl
		 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getBusinessRule()
		 * @generated
		 */
		EClass BUSINESS_RULE = eINSTANCE.getBusinessRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_RULE__NAME = eINSTANCE.getBusinessRule_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_RULE__DESCRIPTION = eINSTANCE.getBusinessRule_Description();

		/**
		 * The meta object literal for the '<em><b>Business Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_RULE__BUSINESS_CONDITIONS = eINSTANCE.getBusinessRule_BusinessConditions();

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
		 * The meta object literal for the '{@link PaymentsApp.impl.BusinessNumberImpl <em>Business Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PaymentsApp.impl.BusinessNumberImpl
		 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getBusinessNumber()
		 * @generated
		 */
		EClass BUSINESS_NUMBER = eINSTANCE.getBusinessNumber();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_NUMBER__VALUE = eINSTANCE.getBusinessNumber_Value();

		/**
		 * The meta object literal for the '<em><b>Business Calculations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_NUMBER__BUSINESS_CALCULATIONS = eINSTANCE.getBusinessNumber_BusinessCalculations();

		/**
		 * The meta object literal for the '{@link PaymentsApp.impl.BusinessConditionImpl <em>Business Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PaymentsApp.impl.BusinessConditionImpl
		 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getBusinessCondition()
		 * @generated
		 */
		EClass BUSINESS_CONDITION = eINSTANCE.getBusinessCondition();

		/**
		 * The meta object literal for the '<em><b>Additional Business Conditions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_CONDITION__ADDITIONAL_BUSINESS_CONDITIONS = eINSTANCE.getBusinessCondition_AdditionalBusinessConditions();

		/**
		 * The meta object literal for the '<em><b>Comparison</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_CONDITION__COMPARISON = eINSTANCE.getBusinessCondition_Comparison();

		/**
		 * The meta object literal for the '<em><b>Condition Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_CONDITION__CONDITION_VALUES = eINSTANCE.getBusinessCondition_ConditionValues();

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
		 * The meta object literal for the '<em><b>Business Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ATTRIBUTE_COLLECTION__BUSINESS_ATTRIBUTES = eINSTANCE.getBusinessAttributeCollection_BusinessAttributes();

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
		 * The meta object literal for the '<em><b>Participants Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_TEMPLATE__PARTICIPANTS_FIELDS = eINSTANCE.getInformationTemplate_ParticipantsFields();

		/**
		 * The meta object literal for the '<em><b>Providers Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_TEMPLATE__PROVIDERS_FIELDS = eINSTANCE.getInformationTemplate_ProvidersFields();

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
		 * The meta object literal for the '<em><b>Business Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_TEMPLATE__BUSINESS_FIELDS = eINSTANCE.getInformationTemplate_BusinessFields();

		/**
		 * The meta object literal for the '{@link PaymentsApp.impl.BusinessCalculationImpl <em>Business Calculation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PaymentsApp.impl.BusinessCalculationImpl
		 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getBusinessCalculation()
		 * @generated
		 */
		EClass BUSINESS_CALCULATION = eINSTANCE.getBusinessCalculation();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_CALCULATION__OPERATION = eINSTANCE.getBusinessCalculation_Operation();

		/**
		 * The meta object literal for the '<em><b>Calculation Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_CALCULATION__CALCULATION_VALUES = eINSTANCE.getBusinessCalculation_CalculationValues();

		/**
		 * The meta object literal for the '<em><b>Additional Calculations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_CALCULATION__ADDITIONAL_CALCULATIONS = eINSTANCE.getBusinessCalculation_AdditionalCalculations();

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
		 * The meta object literal for the '<em><b>Super Entity Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_ENTITY__SUPER_ENTITY_ATTRIBUTES = eINSTANCE.getSuperEntity_SuperEntityAttributes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_ENTITY__NAME = eINSTANCE.getSuperEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Templates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_ENTITY__TEMPLATES = eINSTANCE.getSuperEntity_Templates();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_ENTITY__PARTICIPANTS = eINSTANCE.getSuperEntity_Participants();

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
		 * The meta object literal for the '<em><b>Participantprofile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__PARTICIPANTPROFILE = eINSTANCE.getParticipant_Participantprofile();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__NAME = eINSTANCE.getParticipant_Name();

		/**
		 * The meta object literal for the '<em><b>Businessattributecollection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__BUSINESSATTRIBUTECOLLECTION = eINSTANCE.getParticipant_Businessattributecollection();

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
		 * The meta object literal for the '<em><b>Intermediary</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__INTERMEDIARY = eINSTANCE.getApplication_Intermediary();

		/**
		 * The meta object literal for the '{@link PaymentsApp.BusinessCategory <em>Business Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PaymentsApp.BusinessCategory
		 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getBusinessCategory()
		 * @generated
		 */
		EEnum BUSINESS_CATEGORY = eINSTANCE.getBusinessCategory();

		/**
		 * The meta object literal for the '{@link PaymentsApp.Operations <em>Operations</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PaymentsApp.Operations
		 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getOperations()
		 * @generated
		 */
		EEnum OPERATIONS = eINSTANCE.getOperations();

		/**
		 * The meta object literal for the '{@link PaymentsApp.Comparisons <em>Comparisons</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PaymentsApp.Comparisons
		 * @see PaymentsApp.impl.PaymentsAppPackageImpl#getComparisons()
		 * @generated
		 */
		EEnum COMPARISONS = eINSTANCE.getComparisons();

	}

} //PaymentsAppPackage
