/**
 * generated by Xtext 2.23.0
 */
package game.game;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link game.game.Choix#getNumero <em>Numero</em>}</li>
 *   <li>{@link game.game.Choix#getReponse <em>Reponse</em>}</li>
 *   <li>{@link game.game.Choix#getRecompense <em>Recompense</em>}</li>
 * </ul>
 *
 * @see game.game.GamePackage#getChoix()
 * @model
 * @generated
 */
public interface Choix extends EObject
{
  /**
   * Returns the value of the '<em><b>Numero</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Numero</em>' attribute.
   * @see #setNumero(int)
   * @see game.game.GamePackage#getChoix_Numero()
   * @model
   * @generated
   */
  int getNumero();

  /**
   * Sets the value of the '{@link game.game.Choix#getNumero <em>Numero</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Numero</em>' attribute.
   * @see #getNumero()
   * @generated
   */
  void setNumero(int value);

  /**
   * Returns the value of the '<em><b>Reponse</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reponse</em>' attribute.
   * @see #setReponse(String)
   * @see game.game.GamePackage#getChoix_Reponse()
   * @model
   * @generated
   */
  String getReponse();

  /**
   * Sets the value of the '{@link game.game.Choix#getReponse <em>Reponse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reponse</em>' attribute.
   * @see #getReponse()
   * @generated
   */
  void setReponse(String value);

  /**
   * Returns the value of the '<em><b>Recompense</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recompense</em>' containment reference.
   * @see #setRecompense(Recompense)
   * @see game.game.GamePackage#getChoix_Recompense()
   * @model containment="true"
   * @generated
   */
  Recompense getRecompense();

  /**
   * Sets the value of the '{@link game.game.Choix#getRecompense <em>Recompense</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recompense</em>' containment reference.
   * @see #getRecompense()
   * @generated
   */
  void setRecompense(Recompense value);

} // Choix