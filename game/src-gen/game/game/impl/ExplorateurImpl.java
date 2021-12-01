/**
 * generated by Xtext 2.23.0
 */
package game.game.impl;

import game.game.Connaissance;
import game.game.Explorateur;
import game.game.GamePackage;
import game.game.Objet;
import game.game.Place;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explorateur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link game.game.impl.ExplorateurImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link game.game.impl.ExplorateurImpl#getTailleDispo <em>Taille Dispo</em>}</li>
 *   <li>{@link game.game.impl.ExplorateurImpl#getObjets <em>Objets</em>}</li>
 *   <li>{@link game.game.impl.ExplorateurImpl#getConnaissances <em>Connaissances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplorateurImpl extends MinimalEObjectImpl.Container implements Explorateur
{
  /**
   * The cached value of the '{@link #getPlace() <em>Place</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlace()
   * @generated
   * @ordered
   */
  protected Place place;

  /**
   * The default value of the '{@link #getTailleDispo() <em>Taille Dispo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTailleDispo()
   * @generated
   * @ordered
   */
  protected static final int TAILLE_DISPO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTailleDispo() <em>Taille Dispo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTailleDispo()
   * @generated
   * @ordered
   */
  protected int tailleDispo = TAILLE_DISPO_EDEFAULT;

  /**
   * The cached value of the '{@link #getObjets() <em>Objets</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjets()
   * @generated
   * @ordered
   */
  protected Objet objets;

  /**
   * The cached value of the '{@link #getConnaissances() <em>Connaissances</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnaissances()
   * @generated
   * @ordered
   */
  protected Connaissance connaissances;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExplorateurImpl()
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
    return GamePackage.Literals.EXPLORATEUR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Place getPlace()
  {
    return place;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPlace(Place newPlace, NotificationChain msgs)
  {
    Place oldPlace = place;
    place = newPlace;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamePackage.EXPLORATEUR__PLACE, oldPlace, newPlace);
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
  public void setPlace(Place newPlace)
  {
    if (newPlace != place)
    {
      NotificationChain msgs = null;
      if (place != null)
        msgs = ((InternalEObject)place).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamePackage.EXPLORATEUR__PLACE, null, msgs);
      if (newPlace != null)
        msgs = ((InternalEObject)newPlace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamePackage.EXPLORATEUR__PLACE, null, msgs);
      msgs = basicSetPlace(newPlace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.EXPLORATEUR__PLACE, newPlace, newPlace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getTailleDispo()
  {
    return tailleDispo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTailleDispo(int newTailleDispo)
  {
    int oldTailleDispo = tailleDispo;
    tailleDispo = newTailleDispo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.EXPLORATEUR__TAILLE_DISPO, oldTailleDispo, tailleDispo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Objet getObjets()
  {
    return objets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObjets(Objet newObjets, NotificationChain msgs)
  {
    Objet oldObjets = objets;
    objets = newObjets;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamePackage.EXPLORATEUR__OBJETS, oldObjets, newObjets);
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
  public void setObjets(Objet newObjets)
  {
    if (newObjets != objets)
    {
      NotificationChain msgs = null;
      if (objets != null)
        msgs = ((InternalEObject)objets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamePackage.EXPLORATEUR__OBJETS, null, msgs);
      if (newObjets != null)
        msgs = ((InternalEObject)newObjets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamePackage.EXPLORATEUR__OBJETS, null, msgs);
      msgs = basicSetObjets(newObjets, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.EXPLORATEUR__OBJETS, newObjets, newObjets));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Connaissance getConnaissances()
  {
    return connaissances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConnaissances(Connaissance newConnaissances, NotificationChain msgs)
  {
    Connaissance oldConnaissances = connaissances;
    connaissances = newConnaissances;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamePackage.EXPLORATEUR__CONNAISSANCES, oldConnaissances, newConnaissances);
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
  public void setConnaissances(Connaissance newConnaissances)
  {
    if (newConnaissances != connaissances)
    {
      NotificationChain msgs = null;
      if (connaissances != null)
        msgs = ((InternalEObject)connaissances).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamePackage.EXPLORATEUR__CONNAISSANCES, null, msgs);
      if (newConnaissances != null)
        msgs = ((InternalEObject)newConnaissances).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamePackage.EXPLORATEUR__CONNAISSANCES, null, msgs);
      msgs = basicSetConnaissances(newConnaissances, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.EXPLORATEUR__CONNAISSANCES, newConnaissances, newConnaissances));
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
      case GamePackage.EXPLORATEUR__PLACE:
        return basicSetPlace(null, msgs);
      case GamePackage.EXPLORATEUR__OBJETS:
        return basicSetObjets(null, msgs);
      case GamePackage.EXPLORATEUR__CONNAISSANCES:
        return basicSetConnaissances(null, msgs);
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
      case GamePackage.EXPLORATEUR__PLACE:
        return getPlace();
      case GamePackage.EXPLORATEUR__TAILLE_DISPO:
        return getTailleDispo();
      case GamePackage.EXPLORATEUR__OBJETS:
        return getObjets();
      case GamePackage.EXPLORATEUR__CONNAISSANCES:
        return getConnaissances();
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
      case GamePackage.EXPLORATEUR__PLACE:
        setPlace((Place)newValue);
        return;
      case GamePackage.EXPLORATEUR__TAILLE_DISPO:
        setTailleDispo((Integer)newValue);
        return;
      case GamePackage.EXPLORATEUR__OBJETS:
        setObjets((Objet)newValue);
        return;
      case GamePackage.EXPLORATEUR__CONNAISSANCES:
        setConnaissances((Connaissance)newValue);
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
      case GamePackage.EXPLORATEUR__PLACE:
        setPlace((Place)null);
        return;
      case GamePackage.EXPLORATEUR__TAILLE_DISPO:
        setTailleDispo(TAILLE_DISPO_EDEFAULT);
        return;
      case GamePackage.EXPLORATEUR__OBJETS:
        setObjets((Objet)null);
        return;
      case GamePackage.EXPLORATEUR__CONNAISSANCES:
        setConnaissances((Connaissance)null);
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
      case GamePackage.EXPLORATEUR__PLACE:
        return place != null;
      case GamePackage.EXPLORATEUR__TAILLE_DISPO:
        return tailleDispo != TAILLE_DISPO_EDEFAULT;
      case GamePackage.EXPLORATEUR__OBJETS:
        return objets != null;
      case GamePackage.EXPLORATEUR__CONNAISSANCES:
        return connaissances != null;
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
    result.append(" (tailleDispo: ");
    result.append(tailleDispo);
    result.append(')');
    return result.toString();
  }

} //ExplorateurImpl