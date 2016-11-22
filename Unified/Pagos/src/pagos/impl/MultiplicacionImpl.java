/**
 */
package pagos.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pagos.Expression;
import pagos.Multiplicacion;
import pagos.PagosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplicacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pagos.impl.MultiplicacionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link pagos.impl.MultiplicacionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link pagos.impl.MultiplicacionImpl#getRexp <em>Rexp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiplicacionImpl extends ExpressionImpl implements Multiplicacion {
	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected Expression left;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected String operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRexp() <em>Rexp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRexp()
	 * @generated
	 * @ordered
	 */
	protected Expression rexp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PagosPackage.Literals.MULTIPLICACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(Expression newLeft, NotificationChain msgs) {
		Expression oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PagosPackage.MULTIPLICACION__LEFT, oldLeft, newLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(Expression newLeft) {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PagosPackage.MULTIPLICACION__LEFT, null, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PagosPackage.MULTIPLICACION__LEFT, null, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PagosPackage.MULTIPLICACION__LEFT, newLeft, newLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(String newOperator) {
		String oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PagosPackage.MULTIPLICACION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getRexp() {
		return rexp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRexp(Expression newRexp, NotificationChain msgs) {
		Expression oldRexp = rexp;
		rexp = newRexp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PagosPackage.MULTIPLICACION__REXP, oldRexp, newRexp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRexp(Expression newRexp) {
		if (newRexp != rexp) {
			NotificationChain msgs = null;
			if (rexp != null)
				msgs = ((InternalEObject)rexp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PagosPackage.MULTIPLICACION__REXP, null, msgs);
			if (newRexp != null)
				msgs = ((InternalEObject)newRexp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PagosPackage.MULTIPLICACION__REXP, null, msgs);
			msgs = basicSetRexp(newRexp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PagosPackage.MULTIPLICACION__REXP, newRexp, newRexp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PagosPackage.MULTIPLICACION__LEFT:
				return basicSetLeft(null, msgs);
			case PagosPackage.MULTIPLICACION__REXP:
				return basicSetRexp(null, msgs);
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
			case PagosPackage.MULTIPLICACION__LEFT:
				return getLeft();
			case PagosPackage.MULTIPLICACION__OPERATOR:
				return getOperator();
			case PagosPackage.MULTIPLICACION__REXP:
				return getRexp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PagosPackage.MULTIPLICACION__LEFT:
				setLeft((Expression)newValue);
				return;
			case PagosPackage.MULTIPLICACION__OPERATOR:
				setOperator((String)newValue);
				return;
			case PagosPackage.MULTIPLICACION__REXP:
				setRexp((Expression)newValue);
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
			case PagosPackage.MULTIPLICACION__LEFT:
				setLeft((Expression)null);
				return;
			case PagosPackage.MULTIPLICACION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case PagosPackage.MULTIPLICACION__REXP:
				setRexp((Expression)null);
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
			case PagosPackage.MULTIPLICACION__LEFT:
				return left != null;
			case PagosPackage.MULTIPLICACION__OPERATOR:
				return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
			case PagosPackage.MULTIPLICACION__REXP:
				return rexp != null;
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //MultiplicacionImpl
