/**
 * generated by Xtext 2.10.0
 */
package co.edu.uniandes.pagos.impl;

import co.edu.uniandes.pagos.ExpresionLogica;
import co.edu.uniandes.pagos.PagosPackage;
import co.edu.uniandes.pagos.TerminalValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expresion Logica</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.pagos.impl.ExpresionLogicaImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link co.edu.uniandes.pagos.impl.ExpresionLogicaImpl#getLogOper <em>Log Oper</em>}</li>
 *   <li>{@link co.edu.uniandes.pagos.impl.ExpresionLogicaImpl#getVariable2 <em>Variable2</em>}</li>
 *   <li>{@link co.edu.uniandes.pagos.impl.ExpresionLogicaImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link co.edu.uniandes.pagos.impl.ExpresionLogicaImpl#getConOper <em>Con Oper</em>}</li>
 *   <li>{@link co.edu.uniandes.pagos.impl.ExpresionLogicaImpl#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpresionLogicaImpl extends MinimalEObjectImpl.Container implements ExpresionLogica
{
  /**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
  protected TerminalValue variable;

  /**
	 * The default value of the '{@link #getLogOper() <em>Log Oper</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLogOper()
	 * @generated
	 * @ordered
	 */
  protected static final String LOG_OPER_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getLogOper() <em>Log Oper</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLogOper()
	 * @generated
	 * @ordered
	 */
  protected String logOper = LOG_OPER_EDEFAULT;

  /**
	 * The cached value of the '{@link #getVariable2() <em>Variable2</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVariable2()
	 * @generated
	 * @ordered
	 */
  protected TerminalValue variable2;

  /**
	 * The default value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLiteral()
	 * @generated
	 * @ordered
	 */
  protected static final String LITERAL_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLiteral()
	 * @generated
	 * @ordered
	 */
  protected String literal = LITERAL_EDEFAULT;

  /**
	 * The default value of the '{@link #getConOper() <em>Con Oper</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getConOper()
	 * @generated
	 * @ordered
	 */
  protected static final String CON_OPER_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getConOper() <em>Con Oper</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getConOper()
	 * @generated
	 * @ordered
	 */
  protected String conOper = CON_OPER_EDEFAULT;

  /**
	 * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getExp()
	 * @generated
	 * @ordered
	 */
  protected ExpresionLogica exp;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ExpresionLogicaImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return PagosPackage.Literals.EXPRESION_LOGICA;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TerminalValue getVariable()
  {
		return variable;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetVariable(TerminalValue newVariable, NotificationChain msgs)
  {
		TerminalValue oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PagosPackage.EXPRESION_LOGICA__VARIABLE, oldVariable, newVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVariable(TerminalValue newVariable)
  {
		if (newVariable != variable) {
			NotificationChain msgs = null;
			if (variable != null)
				msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PagosPackage.EXPRESION_LOGICA__VARIABLE, null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PagosPackage.EXPRESION_LOGICA__VARIABLE, null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PagosPackage.EXPRESION_LOGICA__VARIABLE, newVariable, newVariable));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getLogOper()
  {
		return logOper;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setLogOper(String newLogOper)
  {
		String oldLogOper = logOper;
		logOper = newLogOper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PagosPackage.EXPRESION_LOGICA__LOG_OPER, oldLogOper, logOper));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TerminalValue getVariable2()
  {
		return variable2;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetVariable2(TerminalValue newVariable2, NotificationChain msgs)
  {
		TerminalValue oldVariable2 = variable2;
		variable2 = newVariable2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PagosPackage.EXPRESION_LOGICA__VARIABLE2, oldVariable2, newVariable2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVariable2(TerminalValue newVariable2)
  {
		if (newVariable2 != variable2) {
			NotificationChain msgs = null;
			if (variable2 != null)
				msgs = ((InternalEObject)variable2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PagosPackage.EXPRESION_LOGICA__VARIABLE2, null, msgs);
			if (newVariable2 != null)
				msgs = ((InternalEObject)newVariable2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PagosPackage.EXPRESION_LOGICA__VARIABLE2, null, msgs);
			msgs = basicSetVariable2(newVariable2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PagosPackage.EXPRESION_LOGICA__VARIABLE2, newVariable2, newVariable2));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getLiteral()
  {
		return literal;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setLiteral(String newLiteral)
  {
		String oldLiteral = literal;
		literal = newLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PagosPackage.EXPRESION_LOGICA__LITERAL, oldLiteral, literal));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getConOper()
  {
		return conOper;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setConOper(String newConOper)
  {
		String oldConOper = conOper;
		conOper = newConOper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PagosPackage.EXPRESION_LOGICA__CON_OPER, oldConOper, conOper));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ExpresionLogica getExp()
  {
		return exp;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetExp(ExpresionLogica newExp, NotificationChain msgs)
  {
		ExpresionLogica oldExp = exp;
		exp = newExp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PagosPackage.EXPRESION_LOGICA__EXP, oldExp, newExp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setExp(ExpresionLogica newExp)
  {
		if (newExp != exp) {
			NotificationChain msgs = null;
			if (exp != null)
				msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PagosPackage.EXPRESION_LOGICA__EXP, null, msgs);
			if (newExp != null)
				msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PagosPackage.EXPRESION_LOGICA__EXP, null, msgs);
			msgs = basicSetExp(newExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PagosPackage.EXPRESION_LOGICA__EXP, newExp, newExp));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case PagosPackage.EXPRESION_LOGICA__VARIABLE:
				return basicSetVariable(null, msgs);
			case PagosPackage.EXPRESION_LOGICA__VARIABLE2:
				return basicSetVariable2(null, msgs);
			case PagosPackage.EXPRESION_LOGICA__EXP:
				return basicSetExp(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case PagosPackage.EXPRESION_LOGICA__VARIABLE:
				return getVariable();
			case PagosPackage.EXPRESION_LOGICA__LOG_OPER:
				return getLogOper();
			case PagosPackage.EXPRESION_LOGICA__VARIABLE2:
				return getVariable2();
			case PagosPackage.EXPRESION_LOGICA__LITERAL:
				return getLiteral();
			case PagosPackage.EXPRESION_LOGICA__CON_OPER:
				return getConOper();
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
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case PagosPackage.EXPRESION_LOGICA__VARIABLE:
				setVariable((TerminalValue)newValue);
				return;
			case PagosPackage.EXPRESION_LOGICA__LOG_OPER:
				setLogOper((String)newValue);
				return;
			case PagosPackage.EXPRESION_LOGICA__VARIABLE2:
				setVariable2((TerminalValue)newValue);
				return;
			case PagosPackage.EXPRESION_LOGICA__LITERAL:
				setLiteral((String)newValue);
				return;
			case PagosPackage.EXPRESION_LOGICA__CON_OPER:
				setConOper((String)newValue);
				return;
			case PagosPackage.EXPRESION_LOGICA__EXP:
				setExp((ExpresionLogica)newValue);
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
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case PagosPackage.EXPRESION_LOGICA__VARIABLE:
				setVariable((TerminalValue)null);
				return;
			case PagosPackage.EXPRESION_LOGICA__LOG_OPER:
				setLogOper(LOG_OPER_EDEFAULT);
				return;
			case PagosPackage.EXPRESION_LOGICA__VARIABLE2:
				setVariable2((TerminalValue)null);
				return;
			case PagosPackage.EXPRESION_LOGICA__LITERAL:
				setLiteral(LITERAL_EDEFAULT);
				return;
			case PagosPackage.EXPRESION_LOGICA__CON_OPER:
				setConOper(CON_OPER_EDEFAULT);
				return;
			case PagosPackage.EXPRESION_LOGICA__EXP:
				setExp((ExpresionLogica)null);
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
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case PagosPackage.EXPRESION_LOGICA__VARIABLE:
				return variable != null;
			case PagosPackage.EXPRESION_LOGICA__LOG_OPER:
				return LOG_OPER_EDEFAULT == null ? logOper != null : !LOG_OPER_EDEFAULT.equals(logOper);
			case PagosPackage.EXPRESION_LOGICA__VARIABLE2:
				return variable2 != null;
			case PagosPackage.EXPRESION_LOGICA__LITERAL:
				return LITERAL_EDEFAULT == null ? literal != null : !LITERAL_EDEFAULT.equals(literal);
			case PagosPackage.EXPRESION_LOGICA__CON_OPER:
				return CON_OPER_EDEFAULT == null ? conOper != null : !CON_OPER_EDEFAULT.equals(conOper);
			case PagosPackage.EXPRESION_LOGICA__EXP:
				return exp != null;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (logOper: ");
		result.append(logOper);
		result.append(", literal: ");
		result.append(literal);
		result.append(", conOper: ");
		result.append(conOper);
		result.append(')');
		return result.toString();
	}

} //ExpresionLogicaImpl
