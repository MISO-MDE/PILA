/**
 */
package pagos.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import pagos.ElseSegment;
import pagos.IfBlock;
import pagos.IfCondition;
import pagos.PagosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pagos.impl.IfBlockImpl#getIfSentence <em>If Sentence</em>}</li>
 *   <li>{@link pagos.impl.IfBlockImpl#getElseSentence <em>Else Sentence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfBlockImpl extends EObjectImpl implements IfBlock {
	/**
	 * The cached value of the '{@link #getIfSentence() <em>If Sentence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfSentence()
	 * @generated
	 * @ordered
	 */
	protected IfCondition ifSentence;

	/**
	 * The cached value of the '{@link #getElseSentence() <em>Else Sentence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseSentence()
	 * @generated
	 * @ordered
	 */
	protected ElseSegment elseSentence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PagosPackage.Literals.IF_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfCondition getIfSentence() {
		return ifSentence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfSentence(IfCondition newIfSentence, NotificationChain msgs) {
		IfCondition oldIfSentence = ifSentence;
		ifSentence = newIfSentence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PagosPackage.IF_BLOCK__IF_SENTENCE, oldIfSentence, newIfSentence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfSentence(IfCondition newIfSentence) {
		if (newIfSentence != ifSentence) {
			NotificationChain msgs = null;
			if (ifSentence != null)
				msgs = ((InternalEObject)ifSentence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PagosPackage.IF_BLOCK__IF_SENTENCE, null, msgs);
			if (newIfSentence != null)
				msgs = ((InternalEObject)newIfSentence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PagosPackage.IF_BLOCK__IF_SENTENCE, null, msgs);
			msgs = basicSetIfSentence(newIfSentence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PagosPackage.IF_BLOCK__IF_SENTENCE, newIfSentence, newIfSentence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElseSegment getElseSentence() {
		return elseSentence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseSentence(ElseSegment newElseSentence, NotificationChain msgs) {
		ElseSegment oldElseSentence = elseSentence;
		elseSentence = newElseSentence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PagosPackage.IF_BLOCK__ELSE_SENTENCE, oldElseSentence, newElseSentence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseSentence(ElseSegment newElseSentence) {
		if (newElseSentence != elseSentence) {
			NotificationChain msgs = null;
			if (elseSentence != null)
				msgs = ((InternalEObject)elseSentence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PagosPackage.IF_BLOCK__ELSE_SENTENCE, null, msgs);
			if (newElseSentence != null)
				msgs = ((InternalEObject)newElseSentence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PagosPackage.IF_BLOCK__ELSE_SENTENCE, null, msgs);
			msgs = basicSetElseSentence(newElseSentence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PagosPackage.IF_BLOCK__ELSE_SENTENCE, newElseSentence, newElseSentence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PagosPackage.IF_BLOCK__IF_SENTENCE:
				return basicSetIfSentence(null, msgs);
			case PagosPackage.IF_BLOCK__ELSE_SENTENCE:
				return basicSetElseSentence(null, msgs);
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
			case PagosPackage.IF_BLOCK__IF_SENTENCE:
				return getIfSentence();
			case PagosPackage.IF_BLOCK__ELSE_SENTENCE:
				return getElseSentence();
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
			case PagosPackage.IF_BLOCK__IF_SENTENCE:
				setIfSentence((IfCondition)newValue);
				return;
			case PagosPackage.IF_BLOCK__ELSE_SENTENCE:
				setElseSentence((ElseSegment)newValue);
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
			case PagosPackage.IF_BLOCK__IF_SENTENCE:
				setIfSentence((IfCondition)null);
				return;
			case PagosPackage.IF_BLOCK__ELSE_SENTENCE:
				setElseSentence((ElseSegment)null);
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
			case PagosPackage.IF_BLOCK__IF_SENTENCE:
				return ifSentence != null;
			case PagosPackage.IF_BLOCK__ELSE_SENTENCE:
				return elseSentence != null;
		}
		return super.eIsSet(featureID);
	}

} //IfBlockImpl
