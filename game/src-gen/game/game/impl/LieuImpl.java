/**
 * generated by Xtext 2.23.0
 */
package game.game.impl;

import game.game.GamePackage;
import game.game.Lieu;
import game.game.Nature;

import game.game.Personne;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lieu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link game.game.impl.LieuImpl#getNature <em>Nature</em>}</li>
 *   <li>{@link game.game.impl.LieuImpl#getPersonnes <em>Personnes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LieuImpl extends PlaceImpl implements Lieu
{
  /**
	 * The default value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
  protected static final Nature NATURE_EDEFAULT = Nature.DEPART;

  /**
	 * The cached value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
  protected Nature nature = NATURE_EDEFAULT;

  /**
	 * The cached value of the '{@link #getPersonnes() <em>Personnes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonnes()
	 * @generated
	 * @ordered
	 */
	protected EList<Personne> personnes;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected LieuImpl()
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
		return GamePackage.Literals.LIEU;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Nature getNature()
  {
		return nature;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setNature(Nature newNature)
  {
		Nature oldNature = nature;
		nature = newNature == null ? NATURE_EDEFAULT : newNature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.LIEU__NATURE, oldNature, nature));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Personne> getPersonnes() {
		if (personnes == null) {
			personnes = new EObjectWithInverseResolvingEList<Personne>(Personne.class, this, GamePackage.LIEU__PERSONNES, GamePackage.PERSONNE__PLACE);
		}
		return personnes;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GamePackage.LIEU__PERSONNES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPersonnes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GamePackage.LIEU__PERSONNES:
				return ((InternalEList<?>)getPersonnes()).basicRemove(otherEnd, msgs);
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
			case GamePackage.LIEU__NATURE:
				return getNature();
			case GamePackage.LIEU__PERSONNES:
				return getPersonnes();
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
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case GamePackage.LIEU__NATURE:
				setNature((Nature)newValue);
				return;
			case GamePackage.LIEU__PERSONNES:
				getPersonnes().clear();
				getPersonnes().addAll((Collection<? extends Personne>)newValue);
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
			case GamePackage.LIEU__NATURE:
				setNature(NATURE_EDEFAULT);
				return;
			case GamePackage.LIEU__PERSONNES:
				getPersonnes().clear();
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
			case GamePackage.LIEU__NATURE:
				return nature != NATURE_EDEFAULT;
			case GamePackage.LIEU__PERSONNES:
				return personnes != null && !personnes.isEmpty();
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
		result.append(" (nature: ");
		result.append(nature);
		result.append(')');
		return result.toString();
	}

} //LieuImpl
