/**
 */
package PaymentsApp.impl;

import PaymentsApp.ExpresionLogica;
import PaymentsApp.Expression;
import PaymentsApp.IfCondition;
import PaymentsApp.PaymentsAppPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.impl.IfConditionImpl#getLogExp <em>Log Exp</em>}</li>
 *   <li>{@link PaymentsApp.impl.IfConditionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfConditionImpl extends EObjectImpl implements IfCondition {
	/**
	 * The cached value of the '{@link #getLogExp() <em>Log Exp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogExp()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpresionLogica> logExp;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentsAppPackage.Literals.IF_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpresionLogica> getLogExp() {
		if (logExp == null) {
			logExp = new EObjectContainmentEList<ExpresionLogica>(ExpresionLogica.class, this, PaymentsAppPackage.IF_CONDITION__LOG_EXP);
		}
		return logExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getExpression() {
		if (expression == null) {
			expression = new EObjectContainmentEList<Expression>(Expression.class, this, PaymentsAppPackage.IF_CONDITION__EXPRESSION);
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PaymentsAppPackage.IF_CONDITION__LOG_EXP:
				return ((InternalEList<?>)getLogExp()).basicRemove(otherEnd, msgs);
			case PaymentsAppPackage.IF_CONDITION__EXPRESSION:
				return ((InternalEList<?>)getExpression()).basicRemove(otherEnd, msgs);
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
			case PaymentsAppPackage.IF_CONDITION__LOG_EXP:
				return getLogExp();
			case PaymentsAppPackage.IF_CONDITION__EXPRESSION:
				return getExpression();
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
			case PaymentsAppPackage.IF_CONDITION__LOG_EXP:
				getLogExp().clear();
				getLogExp().addAll((Collection<? extends ExpresionLogica>)newValue);
				return;
			case PaymentsAppPackage.IF_CONDITION__EXPRESSION:
				getExpression().clear();
				getExpression().addAll((Collection<? extends Expression>)newValue);
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
			case PaymentsAppPackage.IF_CONDITION__LOG_EXP:
				getLogExp().clear();
				return;
			case PaymentsAppPackage.IF_CONDITION__EXPRESSION:
				getExpression().clear();
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
			case PaymentsAppPackage.IF_CONDITION__LOG_EXP:
				return logExp != null && !logExp.isEmpty();
			case PaymentsAppPackage.IF_CONDITION__EXPRESSION:
				return expression != null && !expression.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfConditionImpl
