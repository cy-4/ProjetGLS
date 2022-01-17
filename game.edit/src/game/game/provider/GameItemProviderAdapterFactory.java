/**
 * generated by Xtext 2.23.0
 */
package game.game.provider;

import game.game.util.GameAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GameItemProviderAdapterFactory extends GameAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link game.game.Jeu} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JeuItemProvider jeuItemProvider;

	/**
	 * This creates an adapter for a {@link game.game.Jeu}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJeuAdapter() {
		if (jeuItemProvider == null) {
			jeuItemProvider = new JeuItemProvider(this);
		}

		return jeuItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link game.game.ElementsJeu} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementsJeuItemProvider elementsJeuItemProvider;

	/**
	 * This creates an adapter for a {@link game.game.ElementsJeu}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElementsJeuAdapter() {
		if (elementsJeuItemProvider == null) {
			elementsJeuItemProvider = new ElementsJeuItemProvider(this);
		}

		return elementsJeuItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link game.game.Place} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceItemProvider placeItemProvider;

	/**
	 * This creates an adapter for a {@link game.game.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlaceAdapter() {
		if (placeItemProvider == null) {
			placeItemProvider = new PlaceItemProvider(this);
		}

		return placeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link game.game.Avantage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvantageItemProvider avantageItemProvider;

	/**
	 * This creates an adapter for a {@link game.game.Avantage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAvantageAdapter() {
		if (avantageItemProvider == null) {
			avantageItemProvider = new AvantageItemProvider(this);
		}

		return avantageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link game.game.QteObjet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QteObjetItemProvider qteObjetItemProvider;

	/**
	 * This creates an adapter for a {@link game.game.QteObjet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQteObjetAdapter() {
		if (qteObjetItemProvider == null) {
			qteObjetItemProvider = new QteObjetItemProvider(this);
		}

		return qteObjetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link game.game.Territoire} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerritoireItemProvider territoireItemProvider;

	/**
	 * This creates an adapter for a {@link game.game.Territoire}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTerritoireAdapter() {
		if (territoireItemProvider == null) {
			territoireItemProvider = new TerritoireItemProvider(this);
		}

		return territoireItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link game.game.Lieu} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LieuItemProvider lieuItemProvider;

	/**
	 * This creates an adapter for a {@link game.game.Lieu}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLieuAdapter() {
		if (lieuItemProvider == null) {
			lieuItemProvider = new LieuItemProvider(this);
		}

		return lieuItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link game.game.Chemin} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheminItemProvider cheminItemProvider;

	/**
	 * This creates an adapter for a {@link game.game.Chemin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCheminAdapter() {
		if (cheminItemProvider == null) {
			cheminItemProvider = new CheminItemProvider(this);
		}

		return cheminItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link game.game.Personne} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonneItemProvider personneItemProvider;

	/**
	 * This creates an adapter for a {@link game.game.Personne}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPersonneAdapter() {
		if (personneItemProvider == null) {
			personneItemProvider = new PersonneItemProvider(this);
		}

		return personneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link game.game.Explorateur} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplorateurItemProvider explorateurItemProvider;

	/**
	 * This creates an adapter for a {@link game.game.Explorateur}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExplorateurAdapter() {
		if (explorateurItemProvider == null) {
			explorateurItemProvider = new ExplorateurItemProvider(this);
		}

		return explorateurItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link game.game.Connaissance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnaissanceItemProvider connaissanceItemProvider;

	/**
	 * This creates an adapter for a {@link game.game.Connaissance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConnaissanceAdapter() {
		if (connaissanceItemProvider == null) {
			connaissanceItemProvider = new ConnaissanceItemProvider(this);
		}

		return connaissanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link game.game.Objet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjetItemProvider objetItemProvider;

	/**
	 * This creates an adapter for a {@link game.game.Objet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObjetAdapter() {
		if (objetItemProvider == null) {
			objetItemProvider = new ObjetItemProvider(this);
		}

		return objetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link game.game.Interaction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionItemProvider interactionItemProvider;

	/**
	 * This creates an adapter for a {@link game.game.Interaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInteractionAdapter() {
		if (interactionItemProvider == null) {
			interactionItemProvider = new InteractionItemProvider(this);
		}

		return interactionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link game.game.Choix} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoixItemProvider choixItemProvider;

	/**
	 * This creates an adapter for a {@link game.game.Choix}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChoixAdapter() {
		if (choixItemProvider == null) {
			choixItemProvider = new ChoixItemProvider(this);
		}

		return choixItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link game.game.Condition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionItemProvider conditionItemProvider;

	/**
	 * This creates an adapter for a {@link game.game.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConditionAdapter() {
		if (conditionItemProvider == null) {
			conditionItemProvider = new ConditionItemProvider(this);
		}

		return conditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link game.game.ConditionPersonne} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionPersonneItemProvider conditionPersonneItemProvider;

	/**
	 * This creates an adapter for a {@link game.game.ConditionPersonne}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConditionPersonneAdapter() {
		if (conditionPersonneItemProvider == null) {
			conditionPersonneItemProvider = new ConditionPersonneItemProvider(this);
		}

		return conditionPersonneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link game.game.ConditionAvantage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionAvantageItemProvider conditionAvantageItemProvider;

	/**
	 * This creates an adapter for a {@link game.game.ConditionAvantage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConditionAvantageAdapter() {
		if (conditionAvantageItemProvider == null) {
			conditionAvantageItemProvider = new ConditionAvantageItemProvider(this);
		}

		return conditionAvantageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link game.game.ConditionChemin} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionCheminItemProvider conditionCheminItemProvider;

	/**
	 * This creates an adapter for a {@link game.game.ConditionChemin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConditionCheminAdapter() {
		if (conditionCheminItemProvider == null) {
			conditionCheminItemProvider = new ConditionCheminItemProvider(this);
		}

		return conditionCheminItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (jeuItemProvider != null) jeuItemProvider.dispose();
		if (elementsJeuItemProvider != null) elementsJeuItemProvider.dispose();
		if (placeItemProvider != null) placeItemProvider.dispose();
		if (avantageItemProvider != null) avantageItemProvider.dispose();
		if (qteObjetItemProvider != null) qteObjetItemProvider.dispose();
		if (territoireItemProvider != null) territoireItemProvider.dispose();
		if (lieuItemProvider != null) lieuItemProvider.dispose();
		if (cheminItemProvider != null) cheminItemProvider.dispose();
		if (personneItemProvider != null) personneItemProvider.dispose();
		if (explorateurItemProvider != null) explorateurItemProvider.dispose();
		if (connaissanceItemProvider != null) connaissanceItemProvider.dispose();
		if (objetItemProvider != null) objetItemProvider.dispose();
		if (interactionItemProvider != null) interactionItemProvider.dispose();
		if (choixItemProvider != null) choixItemProvider.dispose();
		if (conditionItemProvider != null) conditionItemProvider.dispose();
		if (conditionPersonneItemProvider != null) conditionPersonneItemProvider.dispose();
		if (conditionAvantageItemProvider != null) conditionAvantageItemProvider.dispose();
		if (conditionCheminItemProvider != null) conditionCheminItemProvider.dispose();
	}

}
