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
import pagos.Formula;
import pagos.PagosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calculation Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pagos.impl.CalculationTemplateImpl#getName <em>Name</em>}</li>
 *   <li>{@link pagos.impl.CalculationTemplateImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link pagos.impl.CalculationTemplateImpl#getAttLists <em>Att Lists</em>}</li>
 *   <li>{@link pagos.impl.CalculationTemplateImpl#getFormulas <em>Formulas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalculationTemplateImpl extends EObjectImpl implements CalculationTemplate {
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
	 * The cached value of the '{@link #getFormulas() <em>Formulas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormulas()
	 * @generated
	 * @ordered
	 */
	protected EList<Formula> formulas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalculationTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PagosPackage.Literals.CALCULATION_TEMPLATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PagosPackage.CALCULATION_TEMPLATE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PagosPackage.CALCULATION_TEMPLATE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessAttribute> getAttLists() {
		if (attLists == null) {
			attLists = new EObjectContainmentEList<BusinessAttribute>(BusinessAttribute.class, this, PagosPackage.CALCULATION_TEMPLATE__ATT_LISTS);
		}
		return attLists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Formula> getFormulas() {
		if (formulas == null) {
			formulas = new EObjectContainmentEList<Formula>(Formula.class, this, PagosPackage.CALCULATION_TEMPLATE__FORMULAS);
		}
		return formulas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PagosPackage.CALCULATION_TEMPLATE__ATT_LISTS:
				return ((InternalEList<?>)getAttLists()).basicRemove(otherEnd, msgs);
			case PagosPackage.CALCULATION_TEMPLATE__FORMULAS:
				return ((InternalEList<?>)getFormulas()).basicRemove(otherEnd, msgs);
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
			case PagosPackage.CALCULATION_TEMPLATE__NAME:
				return getName();
			case PagosPackage.CALCULATION_TEMPLATE__DESCRIPTION:
				return getDescription();
			case PagosPackage.CALCULATION_TEMPLATE__ATT_LISTS:
				return getAttLists();
			case PagosPackage.CALCULATION_TEMPLATE__FORMULAS:
				return getFormulas();
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
			case PagosPackage.CALCULATION_TEMPLATE__NAME:
				setName((String)newValue);
				return;
			case PagosPackage.CALCULATION_TEMPLATE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PagosPackage.CALCULATION_TEMPLATE__ATT_LISTS:
				getAttLists().clear();
				getAttLists().addAll((Collection<? extends BusinessAttribute>)newValue);
				return;
			case PagosPackage.CALCULATION_TEMPLATE__FORMULAS:
				getFormulas().clear();
				getFormulas().addAll((Collection<? extends Formula>)newValue);
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
			case PagosPackage.CALCULATION_TEMPLATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PagosPackage.CALCULATION_TEMPLATE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PagosPackage.CALCULATION_TEMPLATE__ATT_LISTS:
				getAttLists().clear();
				return;
			case PagosPackage.CALCULATION_TEMPLATE__FORMULAS:
				getFormulas().clear();
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
			case PagosPackage.CALCULATION_TEMPLATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PagosPackage.CALCULATION_TEMPLATE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PagosPackage.CALCULATION_TEMPLATE__ATT_LISTS:
				return attLists != null && !attLists.isEmpty();
			case PagosPackage.CALCULATION_TEMPLATE__FORMULAS:
				return formulas != null && !formulas.isEmpty();
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

} //CalculationTemplateImpl
