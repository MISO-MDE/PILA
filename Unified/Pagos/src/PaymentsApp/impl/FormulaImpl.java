/**
 */
package PaymentsApp.impl;

import PaymentsApp.Formula;
import PaymentsApp.IfBlock;
import PaymentsApp.PaymentsAppPackage;
import PaymentsApp.ReturnBlock;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formula</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.impl.FormulaImpl#getFormulaBody <em>Formula Body</em>}</li>
 *   <li>{@link PaymentsApp.impl.FormulaImpl#getFormulaReturn <em>Formula Return</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormulaImpl extends EObjectImpl implements Formula {
	/**
	 * The cached value of the '{@link #getFormulaBody() <em>Formula Body</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormulaBody()
	 * @generated
	 * @ordered
	 */
	protected EList<IfBlock> formulaBody;

	/**
	 * The cached value of the '{@link #getFormulaReturn() <em>Formula Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormulaReturn()
	 * @generated
	 * @ordered
	 */
	protected ReturnBlock formulaReturn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormulaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentsAppPackage.Literals.FORMULA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfBlock> getFormulaBody() {
		if (formulaBody == null) {
			formulaBody = new EObjectContainmentEList<IfBlock>(IfBlock.class, this, PaymentsAppPackage.FORMULA__FORMULA_BODY);
		}
		return formulaBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnBlock getFormulaReturn() {
		return formulaReturn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormulaReturn(ReturnBlock newFormulaReturn, NotificationChain msgs) {
		ReturnBlock oldFormulaReturn = formulaReturn;
		formulaReturn = newFormulaReturn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentsAppPackage.FORMULA__FORMULA_RETURN, oldFormulaReturn, newFormulaReturn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormulaReturn(ReturnBlock newFormulaReturn) {
		if (newFormulaReturn != formulaReturn) {
			NotificationChain msgs = null;
			if (formulaReturn != null)
				msgs = ((InternalEObject)formulaReturn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaymentsAppPackage.FORMULA__FORMULA_RETURN, null, msgs);
			if (newFormulaReturn != null)
				msgs = ((InternalEObject)newFormulaReturn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaymentsAppPackage.FORMULA__FORMULA_RETURN, null, msgs);
			msgs = basicSetFormulaReturn(newFormulaReturn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentsAppPackage.FORMULA__FORMULA_RETURN, newFormulaReturn, newFormulaReturn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PaymentsAppPackage.FORMULA__FORMULA_BODY:
				return ((InternalEList<?>)getFormulaBody()).basicRemove(otherEnd, msgs);
			case PaymentsAppPackage.FORMULA__FORMULA_RETURN:
				return basicSetFormulaReturn(null, msgs);
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
			case PaymentsAppPackage.FORMULA__FORMULA_BODY:
				return getFormulaBody();
			case PaymentsAppPackage.FORMULA__FORMULA_RETURN:
				return getFormulaReturn();
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
			case PaymentsAppPackage.FORMULA__FORMULA_BODY:
				getFormulaBody().clear();
				getFormulaBody().addAll((Collection<? extends IfBlock>)newValue);
				return;
			case PaymentsAppPackage.FORMULA__FORMULA_RETURN:
				setFormulaReturn((ReturnBlock)newValue);
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
			case PaymentsAppPackage.FORMULA__FORMULA_BODY:
				getFormulaBody().clear();
				return;
			case PaymentsAppPackage.FORMULA__FORMULA_RETURN:
				setFormulaReturn((ReturnBlock)null);
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
			case PaymentsAppPackage.FORMULA__FORMULA_BODY:
				return formulaBody != null && !formulaBody.isEmpty();
			case PaymentsAppPackage.FORMULA__FORMULA_RETURN:
				return formulaReturn != null;
		}
		return super.eIsSet(featureID);
	}

} //FormulaImpl
