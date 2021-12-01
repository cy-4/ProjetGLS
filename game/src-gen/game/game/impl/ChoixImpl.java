/**
 * generated by Xtext 2.23.0
 */
package game.game.impl;

import game.game.Choix;
import game.game.GamePackage;
import game.game.Recompense;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link game.game.impl.ChoixImpl#getNumero <em>Numero</em>}</li>
 *   <li>{@link game.game.impl.ChoixImpl#getReponse <em>Reponse</em>}</li>
 *   <li>{@link game.game.impl.ChoixImpl#getRecompense <em>Recompense</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChoixImpl extends MinimalEObjectImpl.Container implements Choix
{
  /**
   * The default value of the '{@link #getNumero() <em>Numero</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumero()
   * @generated
   * @ordered
   */
  protected static final int NUMERO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumero() <em>Numero</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumero()
   * @generated
   * @ordered
   */
  protected int numero = NUMERO_EDEFAULT;

  /**
   * The default value of the '{@link #getReponse() <em>Reponse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReponse()
   * @generated
   * @ordered
   */
  protected static final String REPONSE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReponse() <em>Reponse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReponse()
   * @generated
   * @ordered
   */
  protected String reponse = REPONSE_EDEFAULT;

  /**
   * The cached value of the '{@link #getRecompense() <em>Recompense</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecompense()
   * @generated
   * @ordered
   */
  protected Recompense recompense;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChoixImpl()
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
    return GamePackage.Literals.CHOIX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getNumero()
  {
    return numero;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNumero(int newNumero)
  {
    int oldNumero = numero;
    numero = newNumero;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.CHOIX__NUMERO, oldNumero, numero));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getReponse()
  {
    return reponse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReponse(String newReponse)
  {
    String oldReponse = reponse;
    reponse = newReponse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.CHOIX__REPONSE, oldReponse, reponse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Recompense getRecompense()
  {
    return recompense;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRecompense(Recompense newRecompense, NotificationChain msgs)
  {
    Recompense oldRecompense = recompense;
    recompense = newRecompense;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamePackage.CHOIX__RECOMPENSE, oldRecompense, newRecompense);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRecompense(Recompense newRecompense)
  {
    if (newRecompense != recompense)
    {
      NotificationChain msgs = null;
      if (recompense != null)
        msgs = ((InternalEObject)recompense).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamePackage.CHOIX__RECOMPENSE, null, msgs);
      if (newRecompense != null)
        msgs = ((InternalEObject)newRecompense).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamePackage.CHOIX__RECOMPENSE, null, msgs);
      msgs = basicSetRecompense(newRecompense, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.CHOIX__RECOMPENSE, newRecompense, newRecompense));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GamePackage.CHOIX__RECOMPENSE:
        return basicSetRecompense(null, msgs);
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
    switch (featureID)
    {
      case GamePackage.CHOIX__NUMERO:
        return getNumero();
      case GamePackage.CHOIX__REPONSE:
        return getReponse();
      case GamePackage.CHOIX__RECOMPENSE:
        return getRecompense();
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
    switch (featureID)
    {
      case GamePackage.CHOIX__NUMERO:
        setNumero((Integer)newValue);
        return;
      case GamePackage.CHOIX__REPONSE:
        setReponse((String)newValue);
        return;
      case GamePackage.CHOIX__RECOMPENSE:
        setRecompense((Recompense)newValue);
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
    switch (featureID)
    {
      case GamePackage.CHOIX__NUMERO:
        setNumero(NUMERO_EDEFAULT);
        return;
      case GamePackage.CHOIX__REPONSE:
        setReponse(REPONSE_EDEFAULT);
        return;
      case GamePackage.CHOIX__RECOMPENSE:
        setRecompense((Recompense)null);
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
    switch (featureID)
    {
      case GamePackage.CHOIX__NUMERO:
        return numero != NUMERO_EDEFAULT;
      case GamePackage.CHOIX__REPONSE:
        return REPONSE_EDEFAULT == null ? reponse != null : !REPONSE_EDEFAULT.equals(reponse);
      case GamePackage.CHOIX__RECOMPENSE:
        return recompense != null;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (numero: ");
    result.append(numero);
    result.append(", reponse: ");
    result.append(reponse);
    result.append(')');
    return result.toString();
  }

} //ChoixImpl