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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petriNet.PetriNet;
import petriNet.PetriNetElement;
import petriNet.PetriNetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Petri Net</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petriNet.impl.PetriNetImpl#getPetriNetElements <em>Petri Net Elements</em>}</li>
 *   <li>{@link petriNet.impl.PetriNetImpl#getName <em>Name</em>}</li>
 *   <li>{@link petriNet.impl.PetriNetImpl#getPetrinetelement <em>Petrinetelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PetriNetImpl extends MinimalEObjectImpl.Container implements PetriNet {
	/**
	 * The cached value of the '{@link #getPetriNetElements() <em>Petri Net Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetriNetElements()
	 * @generated
	 * @ordered
	 */
	protected EList<PetriNetElement> petriNetElements;

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
	 * The cached value of the '{@link #getPetrinetelement() <em>Petrinetelement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetrinetelement()
	 * @generated
	 * @ordered
	 */
	protected EList<PetriNetElement> petrinetelement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PetriNetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetriNetPackage.Literals.PETRI_NET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PetriNetElement> getPetriNetElements() {
		if (petriNetElements == null) {
			petriNetElements = new EObjectContainmentEList<PetriNetElement>(PetriNetElement.class, this, PetriNetPackage.PETRI_NET__PETRI_NET_ELEMENTS);
		}
		return petriNetElements;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.PETRI_NET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PetriNetElement> getPetrinetelement() {
		if (petrinetelement == null) {
			petrinetelement = new EObjectWithInverseResolvingEList<PetriNetElement>(PetriNetElement.class, this, PetriNetPackage.PETRI_NET__PETRINETELEMENT, PetriNetPackage.PETRI_NET_ELEMENT__PETRINET);
		}
		return petrinetelement;
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
			case PetriNetPackage.PETRI_NET__PETRINETELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPetrinetelement()).basicAdd(otherEnd, msgs);
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
			case PetriNetPackage.PETRI_NET__PETRI_NET_ELEMENTS:
				return ((InternalEList<?>)getPetriNetElements()).basicRemove(otherEnd, msgs);
			case PetriNetPackage.PETRI_NET__PETRINETELEMENT:
				return ((InternalEList<?>)getPetrinetelement()).basicRemove(otherEnd, msgs);
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
			case PetriNetPackage.PETRI_NET__PETRI_NET_ELEMENTS:
				return getPetriNetElements();
			case PetriNetPackage.PETRI_NET__NAME:
				return getName();
			case PetriNetPackage.PETRI_NET__PETRINETELEMENT:
				return getPetrinetelement();
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
			case PetriNetPackage.PETRI_NET__PETRI_NET_ELEMENTS:
				getPetriNetElements().clear();
				getPetriNetElements().addAll((Collection<? extends PetriNetElement>)newValue);
				return;
			case PetriNetPackage.PETRI_NET__NAME:
				setName((String)newValue);
				return;
			case PetriNetPackage.PETRI_NET__PETRINETELEMENT:
				getPetrinetelement().clear();
				getPetrinetelement().addAll((Collection<? extends PetriNetElement>)newValue);
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
			case PetriNetPackage.PETRI_NET__PETRI_NET_ELEMENTS:
				getPetriNetElements().clear();
				return;
			case PetriNetPackage.PETRI_NET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PetriNetPackage.PETRI_NET__PETRINETELEMENT:
				getPetrinetelement().clear();
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
			case PetriNetPackage.PETRI_NET__PETRI_NET_ELEMENTS:
				return petriNetElements != null && !petriNetElements.isEmpty();
			case PetriNetPackage.PETRI_NET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PetriNetPackage.PETRI_NET__PETRINETELEMENT:
				return petrinetelement != null && !petrinetelement.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //PetriNetImpl
