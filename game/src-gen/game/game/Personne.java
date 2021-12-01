/**
 * generated by Xtext 2.23.0
 */
package game.game;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Personne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link game.game.Personne#getPlace <em>Place</em>}</li>
 *   <li>{@link game.game.Personne#getVisible <em>Visible</em>}</li>
 *   <li>{@link game.game.Personne#getActif <em>Actif</em>}</li>
 *   <li>{@link game.game.Personne#isObligatoire <em>Obligatoire</em>}</li>
 *   <li>{@link game.game.Personne#getInteractions <em>Interactions</em>}</li>
 * </ul>
 *
 * @see game.game.GamePackage#getPersonne()
 * @model
 * @generated
 */
public interface Personne extends ElementsJeu
{
  /**
   * Returns the value of the '<em><b>Place</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Place</em>' reference.
   * @see #setPlace(Place)
   * @see game.game.GamePackage#getPersonne_Place()
   * @model
   * @generated
   */
  Place getPlace();

  /**
   * Sets the value of the '{@link game.game.Personne#getPlace <em>Place</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Place</em>' reference.
   * @see #getPlace()
   * @generated
   */
  void setPlace(Place value);

  /**
   * Returns the value of the '<em><b>Visible</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visible</em>' containment reference.
   * @see #setVisible(Condition)
   * @see game.game.GamePackage#getPersonne_Visible()
   * @model containment="true"
   * @generated
   */
  Condition getVisible();

  /**
   * Sets the value of the '{@link game.game.Personne#getVisible <em>Visible</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visible</em>' containment reference.
   * @see #getVisible()
   * @generated
   */
  void setVisible(Condition value);

  /**
   * Returns the value of the '<em><b>Actif</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actif</em>' containment reference.
   * @see #setActif(Condition)
   * @see game.game.GamePackage#getPersonne_Actif()
   * @model containment="true"
   * @generated
   */
  Condition getActif();

  /**
   * Sets the value of the '{@link game.game.Personne#getActif <em>Actif</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actif</em>' containment reference.
   * @see #getActif()
   * @generated
   */
  void setActif(Condition value);

  /**
   * Returns the value of the '<em><b>Obligatoire</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obligatoire</em>' attribute.
   * @see #setObligatoire(boolean)
   * @see game.game.GamePackage#getPersonne_Obligatoire()
   * @model
   * @generated
   */
  boolean isObligatoire();

  /**
   * Sets the value of the '{@link game.game.Personne#isObligatoire <em>Obligatoire</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Obligatoire</em>' attribute.
   * @see #isObligatoire()
   * @generated
   */
  void setObligatoire(boolean value);

  /**
   * Returns the value of the '<em><b>Interactions</b></em>' containment reference list.
   * The list contents are of type {@link game.game.Interaction}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interactions</em>' containment reference list.
   * @see game.game.GamePackage#getPersonne_Interactions()
   * @model containment="true"
   * @generated
   */
  EList<Interaction> getInteractions();

} // Personne
