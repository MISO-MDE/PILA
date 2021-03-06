/**
 */
package pagos.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pagos.BusinessAttribute;
import pagos.CalculationTemplate;
import pagos.InformationTemplate;
import pagos.PagosPackage;
import pagos.Provider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pagos.impl.InformationTemplateImpl#getName <em>Name</em>}</li>
 *   <li>{@link pagos.impl.InformationTemplateImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link pagos.impl.InformationTemplateImpl#getAttLists <em>Att Lists</em>}</li>
 *   <li>{@link pagos.impl.InformationTemplateImpl#getTemplates <em>Templates</em>}</li>
 *   <li>{@link pagos.impl.InformationTemplateImpl#getProviders <em>Providers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InformationTemplateImpl extends EObjectImpl implements InformationTemplate {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttLists() <em>Att Lists</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttLists()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessAttribute> attLists;

	/**
	 * The cached value of the '{@link #getTemplates() <em>Templates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<CalculationTemplate> templates;

	/**
	 * The cached value of the '{@link #getProviders() <em>Providers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviders()
	 * @generated
	 * @ordered
	 */
	protected EList<Provider> providers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PagosPackage.Literals.INFORMATION_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PagosPackage.INFORMATION_TEMPLATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PagosPackage.INFORMATION_TEMPLATE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessAttribute> getAttLists() {
		if (attLists == null) {
			attLists = new EObjectContainmentEList<BusinessAttribute>(BusinessAttribute.class, this, PagosPackage.INFORMATION_TEMPLATE__ATT_LISTS);
		}
		return attLists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CalculationTemplate> getTemplates() {
		if (templates == null) {
			templates = new EObjectContainmentEList<CalculationTemplate>(CalculationTemplate.class, this, PagosPackage.INFORMATION_TEMPLATE__TEMPLATES);
		}
		return templates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Provider> getProviders() {
		if (providers == null) {
			providers = new EObjectContainmentEList<Provider>(Provider.class, this, PagosPackage.INFORMATION_TEMPLATE__PROVIDERS);
		}
		return providers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PagosPackage.INFORMATION_TEMPLATE__ATT_LISTS:
				return ((InternalEList<?>)getAttLists()).basicRemove(otherEnd, msgs);
			case PagosPackage.INFORMATION_TEMPLATE__TEMPLATES:
				return ((InternalEList<?>)getTemplates()).basicRemove(otherEnd, msgs);
			case PagosPackage.INFORMATION_TEMPLATE__PROVIDERS:
				return ((InternalEList<?>)getProviders()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PagosPackage.INFORMATION_TEMPLATE__NAME:
				return getName();
			case PagosPackage.INFORMATION_TEMPLATE__DESCRIPTION:
				return getDescription();
			case PagosPackage.INFORMATION_TEMPLATE__ATT_LISTS:
				return getAttLists();
			case PagosPackage.INFORMATION_TEMPLATE__TEMPLATES:
				return getTemplates();
			case PagosPackage.INFORMATION_TEMPLATE__PROVIDERS:
				return getProviders();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PagosPackage.INFORMATION_TEMPLATE__NAME:
				setName((String)newValue);
				return;
			case PagosPackage.INFORMATION_TEMPLATE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PagosPackage.INFORMATION_TEMPLATE__ATT_LISTS:
				getAttLists().clear();
				getAttLists().addAll((Collection<? extends BusinessAttribute>)newValue);
				return;
			case PagosPackage.INFORMATION_TEMPLATE__TEMPLATES:
				getTemplates().clear();
				getTemplates().addAll((Collection<? extends CalculationTemplate>)newValue);
				return;
			case PagosPackage.INFORMATION_TEMPLATE__PROVIDERS:
				getProviders().clear();
				getProviders().addAll((Collection<? extends Provider>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PagosPackage.INFORMATION_TEMPLATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PagosPackage.INFORMATION_TEMPLATE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PagosPackage.INFORMATION_TEMPLATE__ATT_LISTS:
				getAttLists().clear();
				return;
			case PagosPackage.INFORMATION_TEMPLATE__TEMPLATES:
				getTemplates().clear();
				return;
			case PagosPackage.INFORMATION_TEMPLATE__PROVIDERS:
				getProviders().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PagosPackage.INFORMATION_TEMPLATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PagosPackage.INFORMATION_TEMPLATE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PagosPackage.INFORMATION_TEMPLATE__ATT_LISTS:
				return attLists != null && !attLists.isEmpty();
			case PagosPackage.INFORMATION_TEMPLATE__TEMPLATES:
				return templates != null && !templates.isEmpty();
			case PagosPackage.INFORMATION_TEMPLATE__PROVIDERS:
				return providers != null && !providers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //InformationTemplateImpl
