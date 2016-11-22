/**
 */
package PaymentsApp.impl;

import PaymentsApp.ElseSegment;
import PaymentsApp.Formula;
import PaymentsApp.PaymentsAppPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Else Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PaymentsApp.impl.ElseSegmentImpl#getIfSentence <em>If Sentence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElseSegmentImpl extends EObjectImpl implements ElseSegment {
	/**
	 * The cached value of the '{@link #getIfSentence() <em>If Sentence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfSentence()
	 * @generated
	 * @ordered
	 */
	protected Formula ifSentence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElseSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentsAppPackage.Literals.ELSE_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formula getIfSentence() {
		return ifSentence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfSentence(Formula newIfSentence, NotificationChain msgs) {
		Formula oldIfSentence = ifSentence;
		ifSentence = newIfSentence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentsAppPackage.ELSE_SEGMENT__IF_SENTENCE, oldIfSentence, newIfSentence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfSentence(Formula newIfSentence) {
		if (newIfSentence != ifSentence) {
			NotificationChain msgs = null;
			if (ifSentence != null)
				msgs = ((InternalEObject)ifSentence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaymentsAppPackage.ELSE_SEGMENT__IF_SENTENCE, null, msgs);
			if (newIfSentence != null)
				msgs = ((InternalEObject)newIfSentence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaymentsAppPackage.ELSE_SEGMENT__IF_SENTENCE, null, msgs);
			msgs = basicSetIfSentence(newIfSentence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentsAppPackage.ELSE_SEGMENT__IF_SENTENCE, newIfSentence, newIfSentence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PaymentsAppPackage.ELSE_SEGMENT__IF_SENTENCE:
				return basicSetIfSentence(null, msgs);
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
			case PaymentsAppPackage.ELSE_SEGMENT__IF_SENTENCE:
				return getIfSentence();
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
			case PaymentsAppPackage.ELSE_SEGMENT__IF_SENTENCE:
				setIfSentence((Formula)newValue);
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
			case PaymentsAppPackage.ELSE_SEGMENT__IF_SENTENCE:
				setIfSentence((Formula)null);
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
			case PaymentsAppPackage.ELSE_SEGMENT__IF_SENTENCE:
				return ifSentence != null;
		}
		return super.eIsSet(featureID);
	}

} //ElseSegmentImpl
