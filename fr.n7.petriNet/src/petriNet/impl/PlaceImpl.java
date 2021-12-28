/**
 */
package petriNet.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import petriNet.Arc;
import petriNet.PetriNetPackage;
import petriNet.Place;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petriNet.impl.PlaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link petriNet.impl.PlaceImpl#getCurrentToken <em>Current Token</em>}</li>
 *   <li>{@link petriNet.impl.PlaceImpl#getMaxToken <em>Max Token</em>}</li>
 *   <li>{@link petriNet.impl.PlaceImpl#getArc <em>Arc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaceImpl extends PetriNetElementImpl implements Place {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentToken() <em>Current Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentToken()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_TOKEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurrentToken() <em>Current Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentToken()
	 * @generated
	 * @ordered
	 */
	protected int currentToken = CURRENT_TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxToken() <em>Max Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxToken()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_TOKEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxToken() <em>Max Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxToken()
	 * @generated
	 * @ordered
	 */
	protected int maxToken = MAX_TOKEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArc() <em>Arc</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArc()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> arc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetriNetPackage.Literals.PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.PLACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCurrentToken() {
		return currentToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentToken(int newCurrentToken) {
		int oldCurrentToken = currentToken;
		currentToken = newCurrentToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.PLACE__CURRENT_TOKEN, oldCurrentToken, currentToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxToken() {
		return maxToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxToken(int newMaxToken) {
		int oldMaxToken = maxToken;
		maxToken = newMaxToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.PLACE__MAX_TOKEN, oldMaxToken, maxToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getArc() {
		if (arc == null) {
			arc = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PetriNetPackage.PLACE__ARC, PetriNetPackage.ARC__PLACE);
		}
		return arc;
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
			case PetriNetPackage.PLACE__ARC:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArc()).basicAdd(otherEnd, msgs);
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
			case PetriNetPackage.PLACE__ARC:
				return ((InternalEList<?>)getArc()).basicRemove(otherEnd, msgs);
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
			case PetriNetPackage.PLACE__NAME:
				return getName();
			case PetriNetPackage.PLACE__CURRENT_TOKEN:
				return getCurrentToken();
			case PetriNetPackage.PLACE__MAX_TOKEN:
				return getMaxToken();
			case PetriNetPackage.PLACE__ARC:
				return getArc();
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
			case PetriNetPackage.PLACE__NAME:
				setName((String)newValue);
				return;
			case PetriNetPackage.PLACE__CURRENT_TOKEN:
				setCurrentToken((Integer)newValue);
				return;
			case PetriNetPackage.PLACE__MAX_TOKEN:
				setMaxToken((Integer)newValue);
				return;
			case PetriNetPackage.PLACE__ARC:
				getArc().clear();
				getArc().addAll((Collection<? extends Arc>)newValue);
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
			case PetriNetPackage.PLACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PetriNetPackage.PLACE__CURRENT_TOKEN:
				setCurrentToken(CURRENT_TOKEN_EDEFAULT);
				return;
			case PetriNetPackage.PLACE__MAX_TOKEN:
				setMaxToken(MAX_TOKEN_EDEFAULT);
				return;
			case PetriNetPackage.PLACE__ARC:
				getArc().clear();
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
			case PetriNetPackage.PLACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PetriNetPackage.PLACE__CURRENT_TOKEN:
				return currentToken != CURRENT_TOKEN_EDEFAULT;
			case PetriNetPackage.PLACE__MAX_TOKEN:
				return maxToken != MAX_TOKEN_EDEFAULT;
			case PetriNetPackage.PLACE__ARC:
				return arc != null && !arc.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", currentToken: ");
		result.append(currentToken);
		result.append(", maxToken: ");
		result.append(maxToken);
		result.append(')');
		return result.toString();
	}

} //PlaceImpl
