/**
 */
package PaymentsApp.impl;

import PaymentsApp.Application;
import PaymentsApp.BusinessAttribute;
import PaymentsApp.BusinessAttributeCollection;
import PaymentsApp.BusinessCalculation;
import PaymentsApp.BusinessCategory;
import PaymentsApp.BusinessCondition;
import PaymentsApp.BusinessNumber;
import PaymentsApp.BusinessRule;
import PaymentsApp.BusinessString;
import PaymentsApp.BusinessValue;
import PaymentsApp.Comparisons;
import PaymentsApp.InformationTemplate;
import PaymentsApp.Intermediary;
import PaymentsApp.Operations;
import PaymentsApp.Participant;
import PaymentsApp.ParticipantProfile;
import PaymentsApp.PaymentsAppFactory;
import PaymentsApp.PaymentsAppPackage;
import PaymentsApp.Provider;
import PaymentsApp.SuperEntity;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PaymentsAppPackageImpl extends EPackageImpl implements PaymentsAppPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermediaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessAttributeCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessCalculationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum businessCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparisonsEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see PaymentsApp.PaymentsAppPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PaymentsAppPackageImpl() {
		super(eNS_URI, PaymentsAppFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PaymentsAppPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PaymentsAppPackage init() {
		if (isInited) return (PaymentsAppPackage)EPackage.Registry.INSTANCE.getEPackage(PaymentsAppPackage.eNS_URI);

		// Obtain or create and register package
		PaymentsAppPackageImpl thePaymentsAppPackage = (PaymentsAppPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PaymentsAppPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PaymentsAppPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePaymentsAppPackage.createPackageContents();

		// Initialize created meta-data
		thePaymentsAppPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePaymentsAppPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PaymentsAppPackage.eNS_URI, thePaymentsAppPackage);
		return thePaymentsAppPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntermediary() {
		return intermediaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntermediary_Name() {
		return (EAttribute)intermediaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntermediary_Description() {
		return (EAttribute)intermediaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntermediary_Providers() {
		return (EReference)intermediaryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntermediary_Superentity() {
		return (EReference)intermediaryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntermediary_Templates() {
		return (EReference)intermediaryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntermediary_Participantprofiles() {
		return (EReference)intermediaryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipantProfile() {
		return participantProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParticipantProfile_Name() {
		return (EAttribute)participantProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipantProfile_ParticipantAttributes() {
		return (EReference)participantProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvider() {
		return providerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvider_Name() {
		return (EAttribute)providerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvider_ProviderAttributes() {
		return (EReference)providerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessAttribute() {
		return businessAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessAttribute_Name() {
		return (EAttribute)businessAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessAttribute_BusinessCategory() {
		return (EAttribute)businessAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessAttribute_BusinessRules() {
		return (EReference)businessAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessAttribute_BusinessValue() {
		return (EReference)businessAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessAttribute_Relations() {
		return (EReference)businessAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessValue() {
		return businessValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessRule() {
		return businessRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessRule_Name() {
		return (EAttribute)businessRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessRule_Description() {
		return (EAttribute)businessRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessRule_BusinessConditions() {
		return (EReference)businessRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessString() {
		return businessStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessString_Value() {
		return (EAttribute)businessStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessNumber() {
		return businessNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessNumber_Value() {
		return (EAttribute)businessNumberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessNumber_BusinessCalculations() {
		return (EReference)businessNumberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessCondition() {
		return businessConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessCondition_AdditionalBusinessConditions() {
		return (EReference)businessConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessCondition_Comparison() {
		return (EAttribute)businessConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessCondition_ConditionValues() {
		return (EReference)businessConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessAttributeCollection() {
		return businessAttributeCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessAttributeCollection_BusinessAttributes() {
		return (EReference)businessAttributeCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessAttributeCollection_Name() {
		return (EAttribute)businessAttributeCollectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationTemplate() {
		return informationTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationTemplate_ParticipantsFields() {
		return (EReference)informationTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationTemplate_ProvidersFields() {
		return (EReference)informationTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformationTemplate_Name() {
		return (EAttribute)informationTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformationTemplate_Description() {
		return (EAttribute)informationTemplateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationTemplate_BusinessFields() {
		return (EReference)informationTemplateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessCalculation() {
		return businessCalculationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessCalculation_Operation() {
		return (EAttribute)businessCalculationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessCalculation_CalculationValues() {
		return (EReference)businessCalculationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessCalculation_AdditionalCalculations() {
		return (EReference)businessCalculationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperEntity() {
		return superEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuperEntity_SuperEntityAttributes() {
		return (EReference)superEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuperEntity_Name() {
		return (EAttribute)superEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuperEntity_Templates() {
		return (EReference)superEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuperEntity_Participants() {
		return (EReference)superEntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipant() {
		return participantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_Participantprofile() {
		return (EReference)participantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParticipant_Name() {
		return (EAttribute)participantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_Businessattributecollection() {
		return (EReference)participantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplication() {
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_Intermediary() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBusinessCategory() {
		return businessCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperations() {
		return operationsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparisons() {
		return comparisonsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentsAppFactory getPaymentsAppFactory() {
		return (PaymentsAppFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		intermediaryEClass = createEClass(INTERMEDIARY);
		createEAttribute(intermediaryEClass, INTERMEDIARY__NAME);
		createEAttribute(intermediaryEClass, INTERMEDIARY__DESCRIPTION);
		createEReference(intermediaryEClass, INTERMEDIARY__PROVIDERS);
		createEReference(intermediaryEClass, INTERMEDIARY__SUPERENTITY);
		createEReference(intermediaryEClass, INTERMEDIARY__TEMPLATES);
		createEReference(intermediaryEClass, INTERMEDIARY__PARTICIPANTPROFILES);

		participantProfileEClass = createEClass(PARTICIPANT_PROFILE);
		createEAttribute(participantProfileEClass, PARTICIPANT_PROFILE__NAME);
		createEReference(participantProfileEClass, PARTICIPANT_PROFILE__PARTICIPANT_ATTRIBUTES);

		providerEClass = createEClass(PROVIDER);
		createEAttribute(providerEClass, PROVIDER__NAME);
		createEReference(providerEClass, PROVIDER__PROVIDER_ATTRIBUTES);

		businessAttributeEClass = createEClass(BUSINESS_ATTRIBUTE);
		createEAttribute(businessAttributeEClass, BUSINESS_ATTRIBUTE__NAME);
		createEAttribute(businessAttributeEClass, BUSINESS_ATTRIBUTE__BUSINESS_CATEGORY);
		createEReference(businessAttributeEClass, BUSINESS_ATTRIBUTE__BUSINESS_RULES);
		createEReference(businessAttributeEClass, BUSINESS_ATTRIBUTE__BUSINESS_VALUE);
		createEReference(businessAttributeEClass, BUSINESS_ATTRIBUTE__RELATIONS);

		businessValueEClass = createEClass(BUSINESS_VALUE);

		businessRuleEClass = createEClass(BUSINESS_RULE);
		createEAttribute(businessRuleEClass, BUSINESS_RULE__NAME);
		createEAttribute(businessRuleEClass, BUSINESS_RULE__DESCRIPTION);
		createEReference(businessRuleEClass, BUSINESS_RULE__BUSINESS_CONDITIONS);

		businessStringEClass = createEClass(BUSINESS_STRING);
		createEAttribute(businessStringEClass, BUSINESS_STRING__VALUE);

		businessNumberEClass = createEClass(BUSINESS_NUMBER);
		createEAttribute(businessNumberEClass, BUSINESS_NUMBER__VALUE);
		createEReference(businessNumberEClass, BUSINESS_NUMBER__BUSINESS_CALCULATIONS);

		businessConditionEClass = createEClass(BUSINESS_CONDITION);
		createEReference(businessConditionEClass, BUSINESS_CONDITION__ADDITIONAL_BUSINESS_CONDITIONS);
		createEAttribute(businessConditionEClass, BUSINESS_CONDITION__COMPARISON);
		createEReference(businessConditionEClass, BUSINESS_CONDITION__CONDITION_VALUES);

		businessAttributeCollectionEClass = createEClass(BUSINESS_ATTRIBUTE_COLLECTION);
		createEReference(businessAttributeCollectionEClass, BUSINESS_ATTRIBUTE_COLLECTION__BUSINESS_ATTRIBUTES);
		createEAttribute(businessAttributeCollectionEClass, BUSINESS_ATTRIBUTE_COLLECTION__NAME);

		informationTemplateEClass = createEClass(INFORMATION_TEMPLATE);
		createEReference(informationTemplateEClass, INFORMATION_TEMPLATE__PARTICIPANTS_FIELDS);
		createEReference(informationTemplateEClass, INFORMATION_TEMPLATE__PROVIDERS_FIELDS);
		createEAttribute(informationTemplateEClass, INFORMATION_TEMPLATE__NAME);
		createEAttribute(informationTemplateEClass, INFORMATION_TEMPLATE__DESCRIPTION);
		createEReference(informationTemplateEClass, INFORMATION_TEMPLATE__BUSINESS_FIELDS);

		businessCalculationEClass = createEClass(BUSINESS_CALCULATION);
		createEAttribute(businessCalculationEClass, BUSINESS_CALCULATION__OPERATION);
		createEReference(businessCalculationEClass, BUSINESS_CALCULATION__CALCULATION_VALUES);
		createEReference(businessCalculationEClass, BUSINESS_CALCULATION__ADDITIONAL_CALCULATIONS);

		superEntityEClass = createEClass(SUPER_ENTITY);
		createEReference(superEntityEClass, SUPER_ENTITY__SUPER_ENTITY_ATTRIBUTES);
		createEAttribute(superEntityEClass, SUPER_ENTITY__NAME);
		createEReference(superEntityEClass, SUPER_ENTITY__TEMPLATES);
		createEReference(superEntityEClass, SUPER_ENTITY__PARTICIPANTS);

		participantEClass = createEClass(PARTICIPANT);
		createEReference(participantEClass, PARTICIPANT__PARTICIPANTPROFILE);
		createEAttribute(participantEClass, PARTICIPANT__NAME);
		createEReference(participantEClass, PARTICIPANT__BUSINESSATTRIBUTECOLLECTION);

		applicationEClass = createEClass(APPLICATION);
		createEReference(applicationEClass, APPLICATION__INTERMEDIARY);

		// Create enums
		businessCategoryEEnum = createEEnum(BUSINESS_CATEGORY);
		operationsEEnum = createEEnum(OPERATIONS);
		comparisonsEEnum = createEEnum(COMPARISONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		businessStringEClass.getESuperTypes().add(this.getBusinessValue());
		businessNumberEClass.getESuperTypes().add(this.getBusinessValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(intermediaryEClass, Intermediary.class, "Intermediary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntermediary_Name(), ecorePackage.getEString(), "name", null, 0, 1, Intermediary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntermediary_Description(), ecorePackage.getEString(), "description", null, 0, 1, Intermediary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntermediary_Providers(), this.getProvider(), null, "providers", null, 1, -1, Intermediary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntermediary_Superentity(), this.getSuperEntity(), null, "superentity", null, 1, -1, Intermediary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntermediary_Templates(), this.getInformationTemplate(), null, "templates", null, 1, -1, Intermediary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntermediary_Participantprofiles(), this.getParticipantProfile(), null, "participantprofiles", null, 1, -1, Intermediary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(participantProfileEClass, ParticipantProfile.class, "ParticipantProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParticipantProfile_Name(), ecorePackage.getEString(), "name", null, 0, 1, ParticipantProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParticipantProfile_ParticipantAttributes(), this.getBusinessAttributeCollection(), null, "participantAttributes", null, 1, 1, ParticipantProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providerEClass, Provider.class, "Provider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProvider_Name(), ecorePackage.getEString(), "name", null, 0, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvider_ProviderAttributes(), this.getBusinessAttributeCollection(), null, "providerAttributes", null, 1, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessAttributeEClass, BusinessAttribute.class, "BusinessAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBusinessAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, BusinessAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessAttribute_BusinessCategory(), this.getBusinessCategory(), "businessCategory", null, 0, 1, BusinessAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessAttribute_BusinessRules(), this.getBusinessRule(), null, "businessRules", null, 0, -1, BusinessAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessAttribute_BusinessValue(), this.getBusinessValue(), null, "businessValue", null, 1, 1, BusinessAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessAttribute_Relations(), this.getBusinessAttribute(), null, "relations", null, 0, -1, BusinessAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessValueEClass, BusinessValue.class, "BusinessValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(businessRuleEClass, BusinessRule.class, "BusinessRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBusinessRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, BusinessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessRule_Description(), ecorePackage.getEString(), "description", null, 0, 1, BusinessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessRule_BusinessConditions(), this.getBusinessCondition(), null, "businessConditions", null, 0, -1, BusinessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessStringEClass, BusinessString.class, "BusinessString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBusinessString_Value(), ecorePackage.getEString(), "value", null, 0, 1, BusinessString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessNumberEClass, BusinessNumber.class, "BusinessNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBusinessNumber_Value(), ecorePackage.getEBigDecimal(), "value", null, 0, 1, BusinessNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessNumber_BusinessCalculations(), this.getBusinessCalculation(), null, "businessCalculations", null, 0, -1, BusinessNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessConditionEClass, BusinessCondition.class, "BusinessCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessCondition_AdditionalBusinessConditions(), this.getBusinessCondition(), null, "additionalBusinessConditions", null, 0, -1, BusinessCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessCondition_Comparison(), this.getComparisons(), "comparison", null, 0, 1, BusinessCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessCondition_ConditionValues(), this.getBusinessAttributeCollection(), null, "conditionValues", null, 1, 2, BusinessCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessAttributeCollectionEClass, BusinessAttributeCollection.class, "BusinessAttributeCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessAttributeCollection_BusinessAttributes(), this.getBusinessAttribute(), null, "businessAttributes", null, 1, -1, BusinessAttributeCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessAttributeCollection_Name(), ecorePackage.getEString(), "name", null, 0, 1, BusinessAttributeCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informationTemplateEClass, InformationTemplate.class, "InformationTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInformationTemplate_ParticipantsFields(), this.getParticipantProfile(), null, "participantsFields", null, 1, -1, InformationTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInformationTemplate_ProvidersFields(), this.getProvider(), null, "providersFields", null, 1, -1, InformationTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInformationTemplate_Name(), ecorePackage.getEString(), "name", null, 0, 1, InformationTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInformationTemplate_Description(), ecorePackage.getEString(), "description", null, 0, 1, InformationTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInformationTemplate_BusinessFields(), this.getBusinessAttributeCollection(), null, "businessFields", null, 0, -1, InformationTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessCalculationEClass, BusinessCalculation.class, "BusinessCalculation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBusinessCalculation_Operation(), this.getOperations(), "operation", null, 0, 1, BusinessCalculation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessCalculation_CalculationValues(), this.getBusinessAttributeCollection(), null, "calculationValues", null, 1, 2, BusinessCalculation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessCalculation_AdditionalCalculations(), this.getBusinessCalculation(), null, "additionalCalculations", null, 0, -1, BusinessCalculation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(superEntityEClass, SuperEntity.class, "SuperEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSuperEntity_SuperEntityAttributes(), this.getBusinessAttributeCollection(), null, "superEntityAttributes", null, 1, 1, SuperEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSuperEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, SuperEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSuperEntity_Templates(), this.getInformationTemplate(), null, "templates", null, 1, -1, SuperEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSuperEntity_Participants(), this.getParticipant(), null, "participants", null, 1, -1, SuperEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(participantEClass, Participant.class, "Participant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParticipant_Participantprofile(), this.getParticipantProfile(), null, "participantprofile", null, 1, 1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParticipant_Name(), ecorePackage.getEString(), "name", null, 0, 1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParticipant_Businessattributecollection(), this.getBusinessAttributeCollection(), null, "businessattributecollection", null, 0, -1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplication_Intermediary(), this.getIntermediary(), null, "intermediary", null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(businessCategoryEEnum, BusinessCategory.class, "BusinessCategory");
		addEEnumLiteral(businessCategoryEEnum, BusinessCategory.CATEGORY_1);
		addEEnumLiteral(businessCategoryEEnum, BusinessCategory.CATEGORY_2);

		initEEnum(operationsEEnum, Operations.class, "Operations");
		addEEnumLiteral(operationsEEnum, Operations.NO_OPERAND);
		addEEnumLiteral(operationsEEnum, Operations.PLUS);
		addEEnumLiteral(operationsEEnum, Operations.MINUS);
		addEEnumLiteral(operationsEEnum, Operations.MULTIPLY);
		addEEnumLiteral(operationsEEnum, Operations.DIVIDE);

		initEEnum(comparisonsEEnum, Comparisons.class, "Comparisons");
		addEEnumLiteral(comparisonsEEnum, Comparisons.LESS_THAN);
		addEEnumLiteral(comparisonsEEnum, Comparisons.LESS_THAN_OR_EQUAL_TO);
		addEEnumLiteral(comparisonsEEnum, Comparisons.EQUAL_TO);
		addEEnumLiteral(comparisonsEEnum, Comparisons.GREATER_THAN);
		addEEnumLiteral(comparisonsEEnum, Comparisons.GREATER_OR_EQUAL_TO);
		addEEnumLiteral(comparisonsEEnum, Comparisons.OTHER_THAN);
		addEEnumLiteral(comparisonsEEnum, Comparisons.NO_COMPARISON);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (getBusinessCondition_ConditionValues(), 
		   source, 
		   new String[] {
			 "name", "conditionValues"
		   });
	}

} //PaymentsAppPackageImpl
