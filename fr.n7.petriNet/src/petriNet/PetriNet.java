/**
 */
package petriNet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petri Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petriNet.PetriNet#getPetriNetElements <em>Petri Net Elements</em>}</li>
 *   <li>{@link petriNet.PetriNet#getName <em>Name</em>}</li>
 *   <li>{@link petriNet.PetriNet#getPetrinetelement <em>Petrinetelement</em>}</li>
 * </ul>
 *
 * @see petriNet.PetriNetPackage#getPetriNet()
 * @model
 * @generated
 */
public interface PetriNet extends EObject {
	/**
	 * Returns the value of the '<em><b>Petri Net Elements</b></em>' containment reference list.
	 * The list contents are of type {@link petriNet.PetriNetElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petri Net Elements</em>' containment reference list.
	 * @see petriNet.PetriNetPackage#getPetriNet_PetriNetElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<PetriNetElement> getPetriNetElements();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petriNet.PetriNetPackage#getPetriNet_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petriNet.PetriNet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Petrinetelement</b></em>' reference list.
	 * The list contents are of type {@link petriNet.PetriNetElement}.
	 * It is bidirectional and its opposite is '{@link petriNet.PetriNetElement#getPetrinet <em>Petrinet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinetelement</em>' reference list.
	 * @see petriNet.PetriNetPackage#getPetriNet_Petrinetelement()
	 * @see petriNet.PetriNetElement#getPetrinet
	 * @model opposite="petrinet"
	 * @generated
	 */
	EList<PetriNetElement> getPetrinetelement();

} // PetriNet
