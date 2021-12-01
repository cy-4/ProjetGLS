/**
 * generated by Xtext 2.23.0
 */
package game.game;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Avantage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link game.game.Avantage#isVisible <em>Visible</em>}</li>
 *   <li>{@link game.game.Avantage#isActif <em>Actif</em>}</li>
 * </ul>
 *
 * @see game.game.GamePackage#getAvantage()
 * @model
 * @generated
 */
public interface Avantage extends ElementsJeu
{
  /**
   * Returns the value of the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visible</em>' attribute.
   * @see #setVisible(boolean)
   * @see game.game.GamePackage#getAvantage_Visible()
   * @model
   * @generated
   */
  boolean isVisible();

  /**
   * Sets the value of the '{@link game.game.Avantage#isVisible <em>Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visible</em>' attribute.
   * @see #isVisible()
   * @generated
   */
  void setVisible(boolean value);

  /**
   * Returns the value of the '<em><b>Actif</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actif</em>' attribute.
   * @see #setActif(boolean)
   * @see game.game.GamePackage#getAvantage_Actif()
   * @model
   * @generated
   */
  boolean isActif();

  /**
   * Sets the value of the '{@link game.game.Avantage#isActif <em>Actif</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actif</em>' attribute.
   * @see #isActif()
   * @generated
   */
  void setActif(boolean value);

} // Avantage