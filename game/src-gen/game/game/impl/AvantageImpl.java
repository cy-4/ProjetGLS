/**
 * generated by Xtext 2.23.0
 */
package game.game.impl;

import game.game.Avantage;
import game.game.GamePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Avantage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link game.game.impl.AvantageImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link game.game.impl.AvantageImpl#isActif <em>Actif</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AvantageImpl extends ElementsJeuImpl implements Avantage
{
  /**
   * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isVisible()
   * @generated
   * @ordered
   */
  protected static final boolean VISIBLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isVisible()
   * @generated
   * @ordered
   */
  protected boolean visible = VISIBLE_EDEFAULT;

  /**
   * The default value of the '{@link #isActif() <em>Actif</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isActif()
   * @generated
   * @ordered
   */
  protected static final boolean ACTIF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isActif() <em>Actif</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isActif()
   * @generated
   * @ordered
   */
  protected boolean actif = ACTIF_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AvantageImpl()
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
    return GamePackage.Literals.AVANTAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isVisible()
  {
    return visible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVisible(boolean newVisible)
  {
    boolean oldVisible = visible;
    visible = newVisible;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.AVANTAGE__VISIBLE, oldVisible, visible));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isActif()
  {
    return actif;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setActif(boolean newActif)
  {
    boolean oldActif = actif;
    actif = newActif;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.AVANTAGE__ACTIF, oldActif, actif));
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
      case GamePackage.AVANTAGE__VISIBLE:
        return isVisible();
      case GamePackage.AVANTAGE__ACTIF:
        return isActif();
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
      case GamePackage.AVANTAGE__VISIBLE:
        setVisible((Boolean)newValue);
        return;
      case GamePackage.AVANTAGE__ACTIF:
        setActif((Boolean)newValue);
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
      case GamePackage.AVANTAGE__VISIBLE:
        setVisible(VISIBLE_EDEFAULT);
        return;
      case GamePackage.AVANTAGE__ACTIF:
        setActif(ACTIF_EDEFAULT);
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
      case GamePackage.AVANTAGE__VISIBLE:
        return visible != VISIBLE_EDEFAULT;
      case GamePackage.AVANTAGE__ACTIF:
        return actif != ACTIF_EDEFAULT;
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
    result.append(" (visible: ");
    result.append(visible);
    result.append(", actif: ");
    result.append(actif);
    result.append(')');
    return result.toString();
  }

} //AvantageImpl
