/**
 */
package petriNet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petriNet.PetriNetElement#getPetrinet <em>Petrinet</em>}</li>
 * </ul>
 *
 * @see petriNet.PetriNetPackage#getPetriNetElement()
 * @model abstract="true"
 * @generated
 */
public interface PetriNetElement extends EObject {

	/**
	 * Returns the value of the '<em><b>Petrinet</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petriNet.PetriNet#getPetrinetelement <em>Petrinetelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinet</em>' reference.
	 * @see #setPetrinet(PetriNet)
	 * @see petriNet.PetriNetPackage#getPetriNetElement_Petrinet()
	 * @see petriNet.PetriNet#getPetrinetelement
	 * @model opposite="petrinetelement" required="true"
	 * @generated
	 */
	PetriNet getPetrinet();

	/**
	 * Sets the value of the '{@link petriNet.PetriNetElement#getPetrinet <em>Petrinet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Petrinet</em>' reference.
	 * @see #getPetrinet()
	 * @generated
	 */
	void setPetrinet(PetriNet value);
} // PetriNetElement
