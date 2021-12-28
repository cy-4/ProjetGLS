/**
 */
package petriNet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petriNet.Arc#getLinkType <em>Link Type</em>}</li>
 *   <li>{@link petriNet.Arc#getWeight <em>Weight</em>}</li>
 *   <li>{@link petriNet.Arc#isPlaceToTrans <em>Place To Trans</em>}</li>
 *   <li>{@link petriNet.Arc#getTransition <em>Transition</em>}</li>
 *   <li>{@link petriNet.Arc#getPlace <em>Place</em>}</li>
 * </ul>
 *
 * @see petriNet.PetriNetPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends PetriNetElement {
	/**
	 * Returns the value of the '<em><b>Link Type</b></em>' attribute.
	 * The literals are from the enumeration {@link petriNet.TransType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Type</em>' attribute.
	 * @see petriNet.TransType
	 * @see #setLinkType(TransType)
	 * @see petriNet.PetriNetPackage#getArc_LinkType()
	 * @model required="true"
	 * @generated
	 */
	TransType getLinkType();

	/**
	 * Sets the value of the '{@link petriNet.Arc#getLinkType <em>Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Type</em>' attribute.
	 * @see petriNet.TransType
	 * @see #getLinkType()
	 * @generated
	 */
	void setLinkType(TransType value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see petriNet.PetriNetPackage#getArc_Weight()
	 * @model
	 * @generated
	 */
	int getWeight();

	/**
	 * Sets the value of the '{@link petriNet.Arc#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

	/**
	 * Returns the value of the '<em><b>Place To Trans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place To Trans</em>' attribute.
	 * @see #setPlaceToTrans(boolean)
	 * @see petriNet.PetriNetPackage#getArc_PlaceToTrans()
	 * @model required="true"
	 * @generated
	 */
	boolean isPlaceToTrans();

	/**
	 * Sets the value of the '{@link petriNet.Arc#isPlaceToTrans <em>Place To Trans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place To Trans</em>' attribute.
	 * @see #isPlaceToTrans()
	 * @generated
	 */
	void setPlaceToTrans(boolean value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petriNet.Transition#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' reference.
	 * @see #setTransition(Transition)
	 * @see petriNet.PetriNetPackage#getArc_Transition()
	 * @see petriNet.Transition#getArc
	 * @model opposite="arc" required="true"
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link petriNet.Arc#getTransition <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

	/**
	 * Returns the value of the '<em><b>Place</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petriNet.Place#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' reference.
	 * @see #setPlace(Place)
	 * @see petriNet.PetriNetPackage#getArc_Place()
	 * @see petriNet.Place#getArc
	 * @model opposite="arc" required="true"
	 * @generated
	 */
	Place getPlace();

	/**
	 * Sets the value of the '{@link petriNet.Arc#getPlace <em>Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' reference.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(Place value);

} // Arc
