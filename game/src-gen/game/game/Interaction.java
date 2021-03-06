/**
 * generated by Xtext 2.23.0
 */
package game.game;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link game.game.Interaction#getQuestion <em>Question</em>}</li>
 *   <li>{@link game.game.Interaction#getPersonne <em>Personne</em>}</li>
 *   <li>{@link game.game.Interaction#getChoix <em>Choix</em>}</li>
 * </ul>
 *
 * @see game.game.GamePackage#getInteraction()
 * @model
 * @generated
 */
public interface Interaction extends ElementsJeu
{
  /**
	 * Returns the value of the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' attribute.
	 * @see #setQuestion(String)
	 * @see game.game.GamePackage#getInteraction_Question()
	 * @model
	 * @generated
	 */
  String getQuestion();

  /**
	 * Sets the value of the '{@link game.game.Interaction#getQuestion <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' attribute.
	 * @see #getQuestion()
	 * @generated
	 */
  void setQuestion(String value);

  /**
	 * Returns the value of the '<em><b>Personne</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link game.game.Personne#getInteractions <em>Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personne</em>' reference.
	 * @see #setPersonne(Personne)
	 * @see game.game.GamePackage#getInteraction_Personne()
	 * @see game.game.Personne#getInteractions
	 * @model opposite="interactions" required="true"
	 * @generated
	 */
	Personne getPersonne();

		/**
	 * Sets the value of the '{@link game.game.Interaction#getPersonne <em>Personne</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personne</em>' reference.
	 * @see #getPersonne()
	 * @generated
	 */
	void setPersonne(Personne value);

		/**
	 * Returns the value of the '<em><b>Choix</b></em>' reference list.
	 * The list contents are of type {@link game.game.Choix}.
	 * It is bidirectional and its opposite is '{@link game.game.Choix#getInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Choix</em>' reference list.
	 * @see game.game.GamePackage#getInteraction_Choix()
	 * @see game.game.Choix#getInteraction
	 * @model opposite="interaction"
	 * @generated
	 */
  EList<Choix> getChoix();

} // Interaction
