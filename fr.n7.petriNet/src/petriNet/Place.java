/**
 */
package petriNet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petriNet.Place#getName <em>Name</em>}</li>
 *   <li>{@link petriNet.Place#getCurrentToken <em>Current Token</em>}</li>
 *   <li>{@link petriNet.Place#getMaxToken <em>Max Token</em>}</li>
 *   <li>{@link petriNet.Place#getArc <em>Arc</em>}</li>
 * </ul>
 *
 * @see petriNet.PetriNetPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends PetriNetElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petriNet.PetriNetPackage#getPlace_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petriNet.Place#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Current Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Token</em>' attribute.
	 * @see #setCurrentToken(int)
	 * @see petriNet.PetriNetPackage#getPlace_CurrentToken()
	 * @model required="true"
	 * @generated
	 */
	int getCurrentToken();

	/**
	 * Sets the value of the '{@link petriNet.Place#getCurrentToken <em>Current Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Token</em>' attribute.
	 * @see #getCurrentToken()
	 * @generated
	 */
	void setCurrentToken(int value);

	/**
	 * Returns the value of the '<em><b>Max Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Token</em>' attribute.
	 * @see #setMaxToken(int)
	 * @see petriNet.PetriNetPackage#getPlace_MaxToken()
	 * @model
	 * @generated
	 */
	int getMaxToken();

	/**
	 * Sets the value of the '{@link petriNet.Place#getMaxToken <em>Max Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Token</em>' attribute.
	 * @see #getMaxToken()
	 * @generated
	 */
	void setMaxToken(int value);

	/**
	 * Returns the value of the '<em><b>Arc</b></em>' reference list.
	 * The list contents are of type {@link petriNet.Arc}.
	 * It is bidirectional and its opposite is '{@link petriNet.Arc#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arc</em>' reference list.
	 * @see petriNet.PetriNetPackage#getPlace_Arc()
	 * @see petriNet.Arc#getPlace
	 * @model opposite="place" required="true"
	 * @generated
	 */
	EList<Arc> getArc();

} // Place
