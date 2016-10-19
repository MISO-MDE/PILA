/**
 */
package PaymentsApp.impl;

import PaymentsApp.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
			case PaymentsAppPackage.INTERMEDIARY: return createIntermediary();
			case PaymentsAppPackage.PARTICIPANT_PROFILE: return createParticipantProfile();
			case PaymentsAppPackage.PROVIDER: return createProvider();
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE: return createBusinessAttribute();
			case PaymentsAppPackage.BUSINESS_RULE: return createBusinessRule();
			case PaymentsAppPackage.BUSINESS_STRING: return createBusinessString();
			case PaymentsAppPackage.BUSINESS_NUMBER: return createBusinessNumber();
			case PaymentsAppPackage.BUSINESS_CONDITION: return createBusinessCondition();
			case PaymentsAppPackage.BUSINESS_ATTRIBUTE_COLLECTION: return createBusinessAttributeCollection();
			case PaymentsAppPackage.INFORMATION_TEMPLATE: return createInformationTemplate();
			case PaymentsAppPackage.BUSINESS_CALCULATION: return createBusinessCalculation();
			case PaymentsAppPackage.SUPER_ENTITY: return createSuperEntity();
			case PaymentsAppPackage.PARTICIPANT: return createParticipant();
			case PaymentsAppPackage.APPLICATION: return createApplication();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PaymentsAppPackage.BUSINESS_CATEGORY:
				return createBusinessCategoryFromString(eDataType, initialValue);
			case PaymentsAppPackage.OPERATIONS:
				return createOperationsFromString(eDataType, initialValue);
			case PaymentsAppPackage.COMPARISONS:
				return createComparisonsFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PaymentsAppPackage.BUSINESS_CATEGORY:
				return convertBusinessCategoryToString(eDataType, instanceValue);
			case PaymentsAppPackage.OPERATIONS:
				return convertOperationsToString(eDataType, instanceValue);
			case PaymentsAppPackage.COMPARISONS:
				return convertComparisonsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	public ParticipantProfile createParticipantProfile() {
		ParticipantProfileImpl participantProfile = new ParticipantProfileImpl();
		return participantProfile;
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
	public BusinessAttribute createBusinessAttribute() {
		BusinessAttributeImpl businessAttribute = new BusinessAttributeImpl();
		return businessAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessRule createBusinessRule() {
		BusinessRuleImpl businessRule = new BusinessRuleImpl();
		return businessRule;
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
	public BusinessNumber createBusinessNumber() {
		BusinessNumberImpl businessNumber = new BusinessNumberImpl();
		return businessNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessCondition createBusinessCondition() {
		BusinessConditionImpl businessCondition = new BusinessConditionImpl();
		return businessCondition;
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
	public InformationTemplate createInformationTemplate() {
		InformationTemplateImpl informationTemplate = new InformationTemplateImpl();
		return informationTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessCalculation createBusinessCalculation() {
		BusinessCalculationImpl businessCalculation = new BusinessCalculationImpl();
		return businessCalculation;
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
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessCategory createBusinessCategoryFromString(EDataType eDataType, String initialValue) {
		BusinessCategory result = BusinessCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBusinessCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operations createOperationsFromString(EDataType eDataType, String initialValue) {
		Operations result = Operations.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparisons createComparisonsFromString(EDataType eDataType, String initialValue) {
		Comparisons result = Comparisons.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparisonsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
