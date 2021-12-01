/**
 * generated by Xtext 2.23.0
 */
package game.game.util;

import game.game.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see game.game.GamePackage
 * @generated
 */
public class GameSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GamePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = GamePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case GamePackage.JEU:
      {
        Jeu jeu = (Jeu)theEObject;
        T result = caseJeu(jeu);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamePackage.ELEMENTS_JEU:
      {
        ElementsJeu elementsJeu = (ElementsJeu)theEObject;
        T result = caseElementsJeu(elementsJeu);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamePackage.PLACE:
      {
        Place place = (Place)theEObject;
        T result = casePlace(place);
        if (result == null) result = caseElementsJeu(place);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamePackage.AVANTAGE:
      {
        Avantage avantage = (Avantage)theEObject;
        T result = caseAvantage(avantage);
        if (result == null) result = caseElementsJeu(avantage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamePackage.TERRITOIRE:
      {
        Territoire territoire = (Territoire)theEObject;
        T result = caseTerritoire(territoire);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamePackage.LIEU:
      {
        Lieu lieu = (Lieu)theEObject;
        T result = caseLieu(lieu);
        if (result == null) result = casePlace(lieu);
        if (result == null) result = caseElementsJeu(lieu);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamePackage.CHEMIN:
      {
        Chemin chemin = (Chemin)theEObject;
        T result = caseChemin(chemin);
        if (result == null) result = casePlace(chemin);
        if (result == null) result = caseElementsJeu(chemin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamePackage.PERSONNE:
      {
        Personne personne = (Personne)theEObject;
        T result = casePersonne(personne);
        if (result == null) result = caseElementsJeu(personne);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamePackage.EXPLORATEUR:
      {
        Explorateur explorateur = (Explorateur)theEObject;
        T result = caseExplorateur(explorateur);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamePackage.CONNAISSANCE:
      {
        Connaissance connaissance = (Connaissance)theEObject;
        T result = caseConnaissance(connaissance);
        if (result == null) result = caseAvantage(connaissance);
        if (result == null) result = caseElementsJeu(connaissance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamePackage.OBJET:
      {
        Objet objet = (Objet)theEObject;
        T result = caseObjet(objet);
        if (result == null) result = caseAvantage(objet);
        if (result == null) result = caseElementsJeu(objet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamePackage.INTERACTION:
      {
        Interaction interaction = (Interaction)theEObject;
        T result = caseInteraction(interaction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamePackage.CHOIX:
      {
        Choix choix = (Choix)theEObject;
        T result = caseChoix(choix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamePackage.CONDITION:
      {
        Condition condition = (Condition)theEObject;
        T result = caseCondition(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamePackage.RECOMPENSE:
      {
        Recompense recompense = (Recompense)theEObject;
        T result = caseRecompense(recompense);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Jeu</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Jeu</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJeu(Jeu object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Elements Jeu</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Elements Jeu</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementsJeu(ElementsJeu object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Place</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Place</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlace(Place object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Avantage</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Avantage</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAvantage(Avantage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Territoire</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Territoire</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerritoire(Territoire object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lieu</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lieu</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLieu(Lieu object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Chemin</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Chemin</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChemin(Chemin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Personne</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Personne</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePersonne(Personne object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Explorateur</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Explorateur</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExplorateur(Explorateur object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Connaissance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Connaissance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConnaissance(Connaissance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Objet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Objet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjet(Objet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interaction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interaction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteraction(Interaction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Choix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Choix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChoix(Choix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondition(Condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Recompense</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Recompense</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecompense(Recompense object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //GameSwitch
