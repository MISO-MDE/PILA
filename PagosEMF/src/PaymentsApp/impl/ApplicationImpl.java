/**
 */
package PaymentsApp.impl;

import PaymentsApp.Application;
import PaymentsApp.Intermediary;
import PaymentsApp.PaymentsAppPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.impl.ApplicationImpl#getIntermediary <em>Intermediary</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationImpl extends MinimalEObjectImpl.Container implements Application {
	/**
	 * The cached value of the '{@link #getIntermediary() <em>Intermediary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediary()
	 * @generated
	 * @ordered
	 */
	protected Intermediary intermediary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentsAppPackage.Literals.APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intermediary getIntermediary() {
		return intermediary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntermediary(Intermediary newIntermediary, NotificationChain msgs) {
		Intermediary oldIntermediary = intermediary;
		intermediary = newIntermediary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentsAppPackage.APPLICATION__INTERMEDIARY, oldIntermediary, newIntermediary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntermediary(Intermediary newIntermediary) {
		if (newIntermediary != intermediary) {
			NotificationChain msgs = null;
			if (intermediary != null)
				msgs = ((InternalEObject)intermediary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaymentsAppPackage.APPLICATION__INTERMEDIARY, null, msgs);
			if (newIntermediary != null)
				msgs = ((InternalEObject)newIntermediary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaymentsAppPackage.APPLICATION__INTERMEDIARY, null, msgs);
			msgs = basicSetIntermediary(newIntermediary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentsAppPackage.APPLICATION__INTERMEDIARY, newIntermediary, newIntermediary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PaymentsAppPackage.APPLICATION__INTERMEDIARY:
				return basicSetIntermediary(null, msgs);
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
			case PaymentsAppPackage.APPLICATION__INTERMEDIARY:
				return getIntermediary();
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
			case PaymentsAppPackage.APPLICATION__INTERMEDIARY:
				setIntermediary((Intermediary)newValue);
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
			case PaymentsAppPackage.APPLICATION__INTERMEDIARY:
				setIntermediary((Intermediary)null);
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
			case PaymentsAppPackage.APPLICATION__INTERMEDIARY:
				return intermediary != null;
		}
		return super.eIsSet(featureID);
	}

} //ApplicationImpl
