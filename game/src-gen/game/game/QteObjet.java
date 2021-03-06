/**
 * generated by Xtext 2.23.0
 */
package game.game;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qte Objet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link game.game.QteObjet#getQte <em>Qte</em>}</li>
 *   <li>{@link game.game.QteObjet#getObjet <em>Objet</em>}</li>
 *   <li>{@link game.game.QteObjet#getChoixCons <em>Choix Cons</em>}</li>
 *   <li>{@link game.game.QteObjet#getChoixDon <em>Choix Don</em>}</li>
 * </ul>
 *
 * @see game.game.GamePackage#getQteObjet()
 * @model
 * @generated
 */
public interface QteObjet extends ElementsJeu
{
  /**
	 * Returns the value of the '<em><b>Qte</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Qte</em>' attribute.
	 * @see #setQte(int)
	 * @see game.game.GamePackage#getQteObjet_Qte()
	 * @model
	 * @generated
	 */
  int getQte();

  /**
	 * Sets the value of the '{@link game.game.QteObjet#getQte <em>Qte</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qte</em>' attribute.
	 * @see #getQte()
	 * @generated
	 */
  void setQte(int value);

  /**
	 * Returns the value of the '<em><b>Objet</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Objet</em>' reference.
	 * @see #setObjet(Objet)
	 * @see game.game.GamePackage#getQteObjet_Objet()
	 * @model
	 * @generated
	 */
  Objet getObjet();

  /**
	 * Sets the value of the '{@link game.game.QteObjet#getObjet <em>Objet</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objet</em>' reference.
	 * @see #getObjet()
	 * @generated
	 */
  void setObjet(Objet value);

		/**
	 * Returns the value of the '<em><b>Choix Cons</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link game.game.Choix#getObjetCons <em>Objet Cons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choix Cons</em>' container reference.
	 * @see #setChoixCons(Choix)
	 * @see game.game.GamePackage#getQteObjet_ChoixCons()
	 * @see game.game.Choix#getObjetCons
	 * @model opposite="objetCons" transient="false"
	 * @generated
	 */
	Choix getChoixCons();

		/**
	 * Sets the value of the '{@link game.game.QteObjet#getChoixCons <em>Choix Cons</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choix Cons</em>' container reference.
	 * @see #getChoixCons()
	 * @generated
	 */
	void setChoixCons(Choix value);

		/**
	 * Returns the value of the '<em><b>Choix Don</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link game.game.Choix#getObjetDon <em>Objet Don</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choix Don</em>' container reference.
	 * @see #setChoixDon(Choix)
	 * @see game.game.GamePackage#getQteObjet_ChoixDon()
	 * @see game.game.Choix#getObjetDon
	 * @model opposite="objetDon" transient="false"
	 * @generated
	 */
	Choix getChoixDon();

		/**
	 * Sets the value of the '{@link game.game.QteObjet#getChoixDon <em>Choix Don</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choix Don</em>' container reference.
	 * @see #getChoixDon()
	 * @generated
	 */
	void setChoixDon(Choix value);

} // QteObjet
