/**
 * generated by Xtext 2.23.0
 */
package game.game.impl;

import game.game.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GameFactoryImpl extends EFactoryImpl implements GameFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static GameFactory init()
  {
		try {
			GameFactory theGameFactory = (GameFactory)EPackage.Registry.INSTANCE.getEFactory(GamePackage.eNS_URI);
			if (theGameFactory != null) {
				return theGameFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GameFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public GameFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case GamePackage.JEU: return createJeu();
			case GamePackage.ELEMENTS_JEU: return createElementsJeu();
			case GamePackage.PLACE: return createPlace();
			case GamePackage.AVANTAGE: return createAvantage();
			case GamePackage.QTE_OBJET: return createQteObjet();
			case GamePackage.TERRITOIRE: return createTerritoire();
			case GamePackage.LIEU: return createLieu();
			case GamePackage.CHEMIN: return createChemin();
			case GamePackage.PERSONNE: return createPersonne();
			case GamePackage.EXPLORATEUR: return createExplorateur();
			case GamePackage.CONNAISSANCE: return createConnaissance();
			case GamePackage.OBJET: return createObjet();
			case GamePackage.INTERACTION: return createInteraction();
			case GamePackage.CHOIX: return createChoix();
			case GamePackage.CONDITION: return createCondition();
			case GamePackage.CONDITION_PERSONNE: return createConditionPersonne();
			case GamePackage.CONDITION_AVANTAGE: return createConditionAvantage();
			case GamePackage.CONDITION_CHEMIN: return createConditionChemin();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
		switch (eDataType.getClassifierID()) {
			case GamePackage.NATURE:
				return createNatureFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
		switch (eDataType.getClassifierID()) {
			case GamePackage.NATURE:
				return convertNatureToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Jeu createJeu()
  {
		JeuImpl jeu = new JeuImpl();
		return jeu;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public ElementsJeu createElementsJeu()
  {
		ElementsJeuImpl elementsJeu = new ElementsJeuImpl();
		return elementsJeu;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Place createPlace()
  {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Avantage createAvantage()
  {
		AvantageImpl avantage = new AvantageImpl();
		return avantage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public QteObjet createQteObjet()
  {
		QteObjetImpl qteObjet = new QteObjetImpl();
		return qteObjet;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Territoire createTerritoire()
  {
		TerritoireImpl territoire = new TerritoireImpl();
		return territoire;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Lieu createLieu()
  {
		LieuImpl lieu = new LieuImpl();
		return lieu;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Chemin createChemin()
  {
		CheminImpl chemin = new CheminImpl();
		return chemin;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Personne createPersonne()
  {
		PersonneImpl personne = new PersonneImpl();
		return personne;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Explorateur createExplorateur()
  {
		ExplorateurImpl explorateur = new ExplorateurImpl();
		return explorateur;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Connaissance createConnaissance()
  {
		ConnaissanceImpl connaissance = new ConnaissanceImpl();
		return connaissance;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Objet createObjet()
  {
		ObjetImpl objet = new ObjetImpl();
		return objet;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Interaction createInteraction()
  {
		InteractionImpl interaction = new InteractionImpl();
		return interaction;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Choix createChoix()
  {
		ChoixImpl choix = new ChoixImpl();
		return choix;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Condition createCondition()
  {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionPersonne createConditionPersonne() {
		ConditionPersonneImpl conditionPersonne = new ConditionPersonneImpl();
		return conditionPersonne;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionAvantage createConditionAvantage() {
		ConditionAvantageImpl conditionAvantage = new ConditionAvantageImpl();
		return conditionAvantage;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionChemin createConditionChemin() {
		ConditionCheminImpl conditionChemin = new ConditionCheminImpl();
		return conditionChemin;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Nature createNatureFromString(EDataType eDataType, String initialValue)
  {
		Nature result = Nature.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertNatureToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public GamePackage getGamePackage()
  {
		return (GamePackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static GamePackage getPackage()
  {
		return GamePackage.eINSTANCE;
	}

} //GameFactoryImpl
