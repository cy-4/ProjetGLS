/*
 * generated by Xtext 2.23.0
 */
package game.serializer;

import com.google.inject.Inject;
import game.game.Chemin;
import game.game.Choix;
import game.game.Condition;
import game.game.Connaissance;
import game.game.Explorateur;
import game.game.GamePackage;
import game.game.Interaction;
import game.game.Jeu;
import game.game.Lieu;
import game.game.Objet;
import game.game.Personne;
import game.game.QteObjet;
import game.game.Territoire;
import game.services.GameGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class GameSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GameGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Iterable<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GamePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GamePackage.CHEMIN:
				sequence_Chemin(context, (Chemin) semanticObject); 
				return; 
			case GamePackage.CHOIX:
				sequence_Choix(context, (Choix) semanticObject); 
				return; 
			case GamePackage.CONDITION:
				sequence_Condition(context, (Condition) semanticObject); 
				return; 
			case GamePackage.CONNAISSANCE:
				sequence_Connaissance(context, (Connaissance) semanticObject); 
				return; 
			case GamePackage.EXPLORATEUR:
				sequence_Explorateur(context, (Explorateur) semanticObject); 
				return; 
			case GamePackage.INTERACTION:
				sequence_Interaction(context, (Interaction) semanticObject); 
				return; 
			case GamePackage.JEU:
				sequence_Jeu(context, (Jeu) semanticObject); 
				return; 
			case GamePackage.LIEU:
				sequence_Lieu(context, (Lieu) semanticObject); 
				return; 
			case GamePackage.OBJET:
				sequence_Objet(context, (Objet) semanticObject); 
				return; 
			case GamePackage.PERSONNE:
				sequence_Personne(context, (Personne) semanticObject); 
				return; 
			case GamePackage.QTE_OBJET:
				sequence_QteObjet(context, (QteObjet) semanticObject); 
				return; 
			case GamePackage.TERRITOIRE:
				sequence_Territoire(context, (Territoire) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ElementsJeu returns Chemin
	 *     Place returns Chemin
	 *     Chemin returns Chemin
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         pred=[Lieu|ID] 
	 *         succ=[Lieu|ID] 
	 *         visible=Condition 
	 *         obligatoire=BOOL 
	 *         ouvert=Condition
	 *     )
	 */
	protected void sequence_Chemin(ISerializationContext context, Chemin semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.ELEMENTS_JEU__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.ELEMENTS_JEU__NAME));
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.CHEMIN__PRED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.CHEMIN__PRED));
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.CHEMIN__SUCC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.CHEMIN__SUCC));
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.CHEMIN__VISIBLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.CHEMIN__VISIBLE));
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.CHEMIN__OBLIGATOIRE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.CHEMIN__OBLIGATOIRE));
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.CHEMIN__OUVERT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.CHEMIN__OUVERT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCheminAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCheminAccess().getPredLieuIDTerminalRuleCall_4_0_1(), semanticObject.eGet(GamePackage.Literals.CHEMIN__PRED, false));
		feeder.accept(grammarAccess.getCheminAccess().getSuccLieuIDTerminalRuleCall_6_0_1(), semanticObject.eGet(GamePackage.Literals.CHEMIN__SUCC, false));
		feeder.accept(grammarAccess.getCheminAccess().getVisibleConditionParserRuleCall_8_0(), semanticObject.getVisible());
		feeder.accept(grammarAccess.getCheminAccess().getObligatoireBOOLTerminalRuleCall_10_0(), semanticObject.isObligatoire());
		feeder.accept(grammarAccess.getCheminAccess().getOuvertConditionParserRuleCall_12_0(), semanticObject.getOuvert());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Choix returns Choix
	 *
	 * Constraint:
	 *     (name=ID reponse=STRING bonne=BOOL objetCons+=QteObjet* (objetDon+=QteObjet | connaisDon+=[Connaissance|ID])*)
	 */
	protected void sequence_Choix(ISerializationContext context, Choix semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns Condition
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (connaissancesRequises+=[Connaissance|ID] | connaissancesInterdites+=[Connaissance|ID])* 
	 *         (quantite=INT (objetsRequis+=[Objet|ID]+ | objetsInterdits+=[Objet|ID]+)?)*
	 *     )
	 */
	protected void sequence_Condition(ISerializationContext context, Condition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ElementsJeu returns Connaissance
	 *     Avantage returns Connaissance
	 *     Connaissance returns Connaissance
	 *
	 * Constraint:
	 *     (name=ID visible=Condition actif=Condition)
	 */
	protected void sequence_Connaissance(ISerializationContext context, Connaissance semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.ELEMENTS_JEU__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.ELEMENTS_JEU__NAME));
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.AVANTAGE__VISIBLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.AVANTAGE__VISIBLE));
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.AVANTAGE__ACTIF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.AVANTAGE__ACTIF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConnaissanceAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConnaissanceAccess().getVisibleConditionParserRuleCall_4_0(), semanticObject.getVisible());
		feeder.accept(grammarAccess.getConnaissanceAccess().getActifConditionParserRuleCall_6_0(), semanticObject.getActif());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Explorateur returns Explorateur
	 *
	 * Constraint:
	 *     (place=[Place|ID] tailleDispo=INT objets+=Objet* connaissances+=Connaissance*)
	 */
	protected void sequence_Explorateur(ISerializationContext context, Explorateur semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Interaction returns Interaction
	 *
	 * Constraint:
	 *     (name=ID question=STRING choix+=Choix+)
	 */
	protected void sequence_Interaction(ISerializationContext context, Interaction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Jeu returns Jeu
	 *
	 * Constraint:
	 *     (name=ID territoire=Territoire explorateur=Explorateur elementsjeu+=ElementsJeu*)
	 */
	protected void sequence_Jeu(ISerializationContext context, Jeu semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ElementsJeu returns Lieu
	 *     Place returns Lieu
	 *     Lieu returns Lieu
	 *
	 * Constraint:
	 *     (name=ID nature=Nature)
	 */
	protected void sequence_Lieu(ISerializationContext context, Lieu semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.ELEMENTS_JEU__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.ELEMENTS_JEU__NAME));
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.LIEU__NATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.LIEU__NATURE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLieuAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getLieuAccess().getNatureNatureEnumRuleCall_3_0(), semanticObject.getNature());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ElementsJeu returns Objet
	 *     Avantage returns Objet
	 *     Objet returns Objet
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         visible=Condition 
	 *         actif=Condition 
	 *         qte=INT 
	 *         taille=INT 
	 *         transformable=BOOL
	 *     )
	 */
	protected void sequence_Objet(ISerializationContext context, Objet semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.ELEMENTS_JEU__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.ELEMENTS_JEU__NAME));
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.AVANTAGE__VISIBLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.AVANTAGE__VISIBLE));
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.AVANTAGE__ACTIF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.AVANTAGE__ACTIF));
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.OBJET__QTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.OBJET__QTE));
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.OBJET__TAILLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.OBJET__TAILLE));
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.OBJET__TRANSFORMABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.OBJET__TRANSFORMABLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getObjetAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getObjetAccess().getVisibleConditionParserRuleCall_4_0(), semanticObject.getVisible());
		feeder.accept(grammarAccess.getObjetAccess().getActifConditionParserRuleCall_6_0(), semanticObject.getActif());
		feeder.accept(grammarAccess.getObjetAccess().getQteINTTerminalRuleCall_8_0(), semanticObject.getQte());
		feeder.accept(grammarAccess.getObjetAccess().getTailleINTTerminalRuleCall_10_0(), semanticObject.getTaille());
		feeder.accept(grammarAccess.getObjetAccess().getTransformableBOOLTerminalRuleCall_12_0(), semanticObject.isTransformable());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ElementsJeu returns Personne
	 *     Personne returns Personne
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         place=[Place|ID] 
	 *         visible=Condition 
	 *         actif=Condition 
	 *         obligatoire=BOOL 
	 *         interactions+=Interaction*
	 *     )
	 */
	protected void sequence_Personne(ISerializationContext context, Personne semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     QteObjet returns QteObjet
	 *
	 * Constraint:
	 *     (qte=INT objet=[Objet|ID])
	 */
	protected void sequence_QteObjet(ISerializationContext context, QteObjet semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.QTE_OBJET__QTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.QTE_OBJET__QTE));
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.QTE_OBJET__OBJET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.QTE_OBJET__OBJET));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getQteObjetAccess().getQteINTTerminalRuleCall_0_0(), semanticObject.getQte());
		feeder.accept(grammarAccess.getQteObjetAccess().getObjetObjetIDTerminalRuleCall_1_0_1(), semanticObject.eGet(GamePackage.Literals.QTE_OBJET__OBJET, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Territoire returns Territoire
	 *
	 * Constraint:
	 *     places+=Place+
	 */
	protected void sequence_Territoire(ISerializationContext context, Territoire semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
