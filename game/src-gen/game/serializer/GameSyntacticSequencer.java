/*
 * generated by Xtext 2.23.0
 */
package game.serializer;

import com.google.inject.Inject;
import game.services.GameGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class GameSyntacticSequencer extends AbstractSyntacticSequencer {

	protected GameGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Condition_InterditsKeyword_0_4_2_1_0_or_RequisKeyword_0_4_2_0_0;
	protected AbstractElementAlias match_Condition___ConnaissancesKeyword_0_3_0___InterditesKeyword_0_3_1_1_0_or_RequisesKeyword_0_3_1_0_0____a;
	protected AbstractElementAlias match_Condition___ConnaissancesKeyword_0_3_0_____InterditesKeyword_0_3_1_1_0_or_RequisesKeyword_0_3_1_0_0___ConnaissancesKeyword_0_3_0__a_InterditesKeyword_0_3_1_1_0__q;
	protected AbstractElementAlias match_Condition___ConnaissancesKeyword_0_3_0_____InterditesKeyword_0_3_1_1_0_or_RequisesKeyword_0_3_1_0_0___ConnaissancesKeyword_0_3_0__a_RequisesKeyword_0_3_1_0_0__q;
	protected AbstractElementAlias match_Condition_____InterditesKeyword_0_3_1_1_0_or_RequisesKeyword_0_3_1_0_0___ConnaissancesKeyword_0_3_0__a;
	protected AbstractElementAlias match_Explorateur___ConnaissancesKeyword_8_0_PossedesKeyword_8_1__q;
	protected AbstractElementAlias match_Explorateur___ObjetsKeyword_7_0_PossedesKeyword_7_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (GameGrammarAccess) access;
		match_Condition_InterditsKeyword_0_4_2_1_0_or_RequisKeyword_0_4_2_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConditionAccess().getInterditsKeyword_0_4_2_1_0()), new TokenAlias(false, false, grammarAccess.getConditionAccess().getRequisKeyword_0_4_2_0_0()));
		match_Condition___ConnaissancesKeyword_0_3_0___InterditesKeyword_0_3_1_1_0_or_RequisesKeyword_0_3_1_0_0____a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getConditionAccess().getConnaissancesKeyword_0_3_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConditionAccess().getInterditesKeyword_0_3_1_1_0()), new TokenAlias(false, false, grammarAccess.getConditionAccess().getRequisesKeyword_0_3_1_0_0())));
		match_Condition___ConnaissancesKeyword_0_3_0_____InterditesKeyword_0_3_1_1_0_or_RequisesKeyword_0_3_1_0_0___ConnaissancesKeyword_0_3_0__a_InterditesKeyword_0_3_1_1_0__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getConditionAccess().getConnaissancesKeyword_0_3_0()), new GroupAlias(true, true, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConditionAccess().getInterditesKeyword_0_3_1_1_0()), new TokenAlias(false, false, grammarAccess.getConditionAccess().getRequisesKeyword_0_3_1_0_0())), new TokenAlias(false, false, grammarAccess.getConditionAccess().getConnaissancesKeyword_0_3_0())), new TokenAlias(false, false, grammarAccess.getConditionAccess().getInterditesKeyword_0_3_1_1_0()));
		match_Condition___ConnaissancesKeyword_0_3_0_____InterditesKeyword_0_3_1_1_0_or_RequisesKeyword_0_3_1_0_0___ConnaissancesKeyword_0_3_0__a_RequisesKeyword_0_3_1_0_0__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getConditionAccess().getConnaissancesKeyword_0_3_0()), new GroupAlias(true, true, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConditionAccess().getInterditesKeyword_0_3_1_1_0()), new TokenAlias(false, false, grammarAccess.getConditionAccess().getRequisesKeyword_0_3_1_0_0())), new TokenAlias(false, false, grammarAccess.getConditionAccess().getConnaissancesKeyword_0_3_0())), new TokenAlias(false, false, grammarAccess.getConditionAccess().getRequisesKeyword_0_3_1_0_0()));
		match_Condition_____InterditesKeyword_0_3_1_1_0_or_RequisesKeyword_0_3_1_0_0___ConnaissancesKeyword_0_3_0__a = new GroupAlias(true, true, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConditionAccess().getInterditesKeyword_0_3_1_1_0()), new TokenAlias(false, false, grammarAccess.getConditionAccess().getRequisesKeyword_0_3_1_0_0())), new TokenAlias(false, false, grammarAccess.getConditionAccess().getConnaissancesKeyword_0_3_0()));
		match_Explorateur___ConnaissancesKeyword_8_0_PossedesKeyword_8_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getExplorateurAccess().getConnaissancesKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getExplorateurAccess().getPossedesKeyword_8_1()));
		match_Explorateur___ObjetsKeyword_7_0_PossedesKeyword_7_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getExplorateurAccess().getObjetsKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getExplorateurAccess().getPossedesKeyword_7_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getBOOLRule())
			return getBOOLToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal BOOL returns ecore::EBoolean: ('true'|'false');
	 */
	protected String getBOOLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "true";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Condition_InterditsKeyword_0_4_2_1_0_or_RequisKeyword_0_4_2_0_0.equals(syntax))
				emit_Condition_InterditsKeyword_0_4_2_1_0_or_RequisKeyword_0_4_2_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Condition___ConnaissancesKeyword_0_3_0___InterditesKeyword_0_3_1_1_0_or_RequisesKeyword_0_3_1_0_0____a.equals(syntax))
				emit_Condition___ConnaissancesKeyword_0_3_0___InterditesKeyword_0_3_1_1_0_or_RequisesKeyword_0_3_1_0_0____a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Condition___ConnaissancesKeyword_0_3_0_____InterditesKeyword_0_3_1_1_0_or_RequisesKeyword_0_3_1_0_0___ConnaissancesKeyword_0_3_0__a_InterditesKeyword_0_3_1_1_0__q.equals(syntax))
				emit_Condition___ConnaissancesKeyword_0_3_0_____InterditesKeyword_0_3_1_1_0_or_RequisesKeyword_0_3_1_0_0___ConnaissancesKeyword_0_3_0__a_InterditesKeyword_0_3_1_1_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Condition___ConnaissancesKeyword_0_3_0_____InterditesKeyword_0_3_1_1_0_or_RequisesKeyword_0_3_1_0_0___ConnaissancesKeyword_0_3_0__a_RequisesKeyword_0_3_1_0_0__q.equals(syntax))
				emit_Condition___ConnaissancesKeyword_0_3_0_____InterditesKeyword_0_3_1_1_0_or_RequisesKeyword_0_3_1_0_0___ConnaissancesKeyword_0_3_0__a_RequisesKeyword_0_3_1_0_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Condition_____InterditesKeyword_0_3_1_1_0_or_RequisesKeyword_0_3_1_0_0___ConnaissancesKeyword_0_3_0__a.equals(syntax))
				emit_Condition_____InterditesKeyword_0_3_1_1_0_or_RequisesKeyword_0_3_1_0_0___ConnaissancesKeyword_0_3_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Explorateur___ConnaissancesKeyword_8_0_PossedesKeyword_8_1__q.equals(syntax))
				emit_Explorateur___ConnaissancesKeyword_8_0_PossedesKeyword_8_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Explorateur___ObjetsKeyword_7_0_PossedesKeyword_7_1__q.equals(syntax))
				emit_Explorateur___ObjetsKeyword_7_0_PossedesKeyword_7_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'requis' | 'interdits'
	 *
	 * This ambiguous syntax occurs at:
	 *     quantite=INT 'objets' (ambiguity) '}' (rule end)
	 *     quantite=INT 'objets' (ambiguity) quantite=INT
	 */
	protected void emit_Condition_InterditsKeyword_0_4_2_1_0_or_RequisKeyword_0_4_2_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('connaissances' ('requises' | 'interdites'))*
	 *
	 * This ambiguous syntax occurs at:
	 *     connaissancesInterdites+=[Connaissance|ID] (ambiguity) '}' (rule end)
	 *     connaissancesInterdites+=[Connaissance|ID] (ambiguity) quantite=INT
	 *     connaissancesRequises+=[Connaissance|ID] (ambiguity) '}' (rule end)
	 *     connaissancesRequises+=[Connaissance|ID] (ambiguity) quantite=INT
	 *     name=ID '{' (ambiguity) '}' (rule end)
	 *     name=ID '{' (ambiguity) quantite=INT
	 */
	protected void emit_Condition___ConnaissancesKeyword_0_3_0___InterditesKeyword_0_3_1_1_0_or_RequisesKeyword_0_3_1_0_0____a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('connaissances' (('requises' | 'interdites') 'connaissances')* 'interdites')?
	 *
	 * This ambiguous syntax occurs at:
	 *     connaissancesInterdites+=[Connaissance|ID] (ambiguity) connaissancesInterdites+=[Connaissance|ID]
	 */
	protected void emit_Condition___ConnaissancesKeyword_0_3_0_____InterditesKeyword_0_3_1_1_0_or_RequisesKeyword_0_3_1_0_0___ConnaissancesKeyword_0_3_0__a_InterditesKeyword_0_3_1_1_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('connaissances' (('requises' | 'interdites') 'connaissances')* 'requises')?
	 *
	 * This ambiguous syntax occurs at:
	 *     connaissancesRequises+=[Connaissance|ID] (ambiguity) connaissancesRequises+=[Connaissance|ID]
	 */
	protected void emit_Condition___ConnaissancesKeyword_0_3_0_____InterditesKeyword_0_3_1_1_0_or_RequisesKeyword_0_3_1_0_0___ConnaissancesKeyword_0_3_0__a_RequisesKeyword_0_3_1_0_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (('requises' | 'interdites') 'connaissances')*
	 *
	 * This ambiguous syntax occurs at:
	 *     connaissancesInterdites+=[Connaissance|ID] 'connaissances' (ambiguity) 'requises' connaissancesRequises+=[Connaissance|ID]
	 *     connaissancesRequises+=[Connaissance|ID] 'connaissances' (ambiguity) 'interdites' connaissancesInterdites+=[Connaissance|ID]
	 *     name=ID '{' 'connaissances' (ambiguity) 'interdites' connaissancesInterdites+=[Connaissance|ID]
	 *     name=ID '{' 'connaissances' (ambiguity) 'requises' connaissancesRequises+=[Connaissance|ID]
	 */
	protected void emit_Condition_____InterditesKeyword_0_3_1_1_0_or_RequisesKeyword_0_3_1_0_0___ConnaissancesKeyword_0_3_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('connaissances' 'possedes')?
	 *
	 * This ambiguous syntax occurs at:
	 *     objets+=Objet (ambiguity) '}' (rule end)
	 *     tailleDispo=INT ('objets' 'possedes')? (ambiguity) '}' (rule end)
	 */
	protected void emit_Explorateur___ConnaissancesKeyword_8_0_PossedesKeyword_8_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('objets' 'possedes')?
	 *
	 * This ambiguous syntax occurs at:
	 *     tailleDispo=INT (ambiguity) 'connaissances' 'possedes' connaissances+=Connaissance
	 *     tailleDispo=INT (ambiguity) ('connaissances' 'possedes')? '}' (rule end)
	 */
	protected void emit_Explorateur___ObjetsKeyword_7_0_PossedesKeyword_7_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
