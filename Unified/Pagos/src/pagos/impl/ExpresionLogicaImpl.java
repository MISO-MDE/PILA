/**
 */
package pagos.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pagos.ExpresionLogica;
import pagos.PagosPackage;
import pagos.TerminalValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expresion Logica</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pagos.impl.ExpresionLogicaImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link pagos.impl.ExpresionLogicaImpl#getLogOper <em>Log Oper</em>}</li>
 *   <li>{@link pagos.impl.ExpresionLogicaImpl#getVariable2 <em>Variable2</em>}</li>
 *   <li>{@link pagos.impl.ExpresionLogicaImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link pagos.impl.ExpresionLogicaImpl#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpresionLogicaImpl extends EObjectImpl implements ExpresionLogica {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<TerminalValue> variable;

	/**
	 * The cached value of the '{@link #getLogOper() <em>Log Oper</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogOper()
	 * @generated
	 * @ordered
	 */
	protected EList<String> logOper;

	/**
	 * The cached value of the '{@link #getVariable2() <em>Variable2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable2()
	 * @generated
	 * @ordered
	 */
	protected EList<TerminalValue> variable2;

	/**
	 * The cached value of the '{@link #getLiteral() <em>Literal</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteral()
	 * @generated
	 * @ordered
	 */
	protected EList<String> literal;

	/**
	 * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExp()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpresionLogica> exp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpresionLogicaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PagosPackage.Literals.EXPRESION_LOGICA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TerminalValue> getVariable() {
		if (variable == null) {
			variable = new EObjectContainmentEList<TerminalValue>(TerminalValue.class, this, PagosPackage.EXPRESION_LOGICA__VARIABLE);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLogOper() {
		if (logOper == null) {
			logOper = new EDataTypeEList<String>(String.class, this, PagosPackage.EXPRESION_LOGICA__LOG_OPER);
		}
		return logOper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TerminalValue> getVariable2() {
		if (variable2 == null) {
			variable2 = new EObjectContainmentEList<TerminalValue>(TerminalValue.class, this, PagosPackage.EXPRESION_LOGICA__VARIABLE2);
		}
		return variable2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLiteral() {
		if (literal == null) {
			literal = new EDataTypeEList<String>(String.class, this, PagosPackage.EXPRESION_LOGICA__LITERAL);
		}
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpresionLogica> getExp() {
		if (exp == null) {
			exp = new EObjectContainmentEList<ExpresionLogica>(ExpresionLogica.class, this, PagosPackage.EXPRESION_LOGICA__EXP);
		}
		return exp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PagosPackage.EXPRESION_LOGICA__VARIABLE:
				return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
			case PagosPackage.EXPRESION_LOGICA__VARIABLE2:
				return ((InternalEList<?>)getVariable2()).basicRemove(otherEnd, msgs);
			case PagosPackage.EXPRESION_LOGICA__EXP:
				return ((InternalEList<?>)getExp()).basicRemove(otherEnd, msgs);
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
			case PagosPackage.EXPRESION_LOGICA__VARIABLE:
				return getVariable();
			case PagosPackage.EXPRESION_LOGICA__LOG_OPER:
				return getLogOper();
			case PagosPackage.EXPRESION_LOGICA__VARIABLE2:
				return getVariable2();
			case PagosPackage.EXPRESION_LOGICA__LITERAL:
				return getLiteral();
			case PagosPackage.EXPRESION_LOGICA__EXP:
				return getExp();
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
			case PagosPackage.EXPRESION_LOGICA__VARIABLE:
				getVariable().clear();
				getVariable().addAll((Collection<? extends TerminalValue>)newValue);
				return;
			case PagosPackage.EXPRESION_LOGICA__LOG_OPER:
				getLogOper().clear();
				getLogOper().addAll((Collection<? extends String>)newValue);
				return;
			case PagosPackage.EXPRESION_LOGICA__VARIABLE2:
				getVariable2().clear();
				getVariable2().addAll((Collection<? extends TerminalValue>)newValue);
				return;
			case PagosPackage.EXPRESION_LOGICA__LITERAL:
				getLiteral().clear();
				getLiteral().addAll((Collection<? extends String>)newValue);
				return;
			case PagosPackage.EXPRESION_LOGICA__EXP:
				getExp().clear();
				getExp().addAll((Collection<? extends ExpresionLogica>)newValue);
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
			case PagosPackage.EXPRESION_LOGICA__VARIABLE:
				getVariable().clear();
				return;
			case PagosPackage.EXPRESION_LOGICA__LOG_OPER:
				getLogOper().clear();
				return;
			case PagosPackage.EXPRESION_LOGICA__VARIABLE2:
				getVariable2().clear();
				return;
			case PagosPackage.EXPRESION_LOGICA__LITERAL:
				getLiteral().clear();
				return;
			case PagosPackage.EXPRESION_LOGICA__EXP:
				getExp().clear();
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
			case PagosPackage.EXPRESION_LOGICA__VARIABLE:
				return variable != null && !variable.isEmpty();
			case PagosPackage.EXPRESION_LOGICA__LOG_OPER:
				return logOper != null && !logOper.isEmpty();
			case PagosPackage.EXPRESION_LOGICA__VARIABLE2:
				return variable2 != null && !variable2.isEmpty();
			case PagosPackage.EXPRESION_LOGICA__LITERAL:
				return literal != null && !literal.isEmpty();
			case PagosPackage.EXPRESION_LOGICA__EXP:
				return exp != null && !exp.isEmpty();
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
		result.append(" (logOper: ");
		result.append(logOper);
		result.append(", literal: ");
		result.append(literal);
		result.append(')');
		return result.toString();
	}

} //ExpresionLogicaImpl
