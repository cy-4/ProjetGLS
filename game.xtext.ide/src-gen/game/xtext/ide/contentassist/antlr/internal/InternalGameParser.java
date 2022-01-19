package game.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import game.xtext.services.GameGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGameParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'depart'", "'fin'", "'inter'", "'Jeu'", "'{'", "'}'", "','", "'Territoire'", "'places'", "'Explorateur'", "'taille'", "'localisation'", "'objets'", "'connaissances'", "'Lieu'", "'nature'", "'personnes'", "'Chemin'", "'pred'", "'succ'", "'visible'", "'ouvert'", "'Personne'", "'place'", "'interactions'", "'active'", "'ConditionPersonne'", "'connaissanceRequise'", "'connaissanceInterdite'", "'objetRequis'", "'objetInterdit'", "'Interaction'", "'personne'", "'question'", "'choix'", "'Connaissance'", "'actif'", "'Objet'", "'qte'", "'ConditionAvantage'", "'Choix'", "'interaction'", "'reponse'", "'connaisDon'", "'objetCons'", "'objetDon'", "'QteObjet'", "'objet'", "'-'", "'ConditionChemin'", "'obligatoire'", "'transformable'", "'bonne'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalGameParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGameParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGameParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGame.g"; }


    	private GameGrammarAccess grammarAccess;

    	public void setGrammarAccess(GameGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleJeu"
    // InternalGame.g:53:1: entryRuleJeu : ruleJeu EOF ;
    public final void entryRuleJeu() throws RecognitionException {
        try {
            // InternalGame.g:54:1: ( ruleJeu EOF )
            // InternalGame.g:55:1: ruleJeu EOF
            {
             before(grammarAccess.getJeuRule()); 
            pushFollow(FOLLOW_1);
            ruleJeu();

            state._fsp--;

             after(grammarAccess.getJeuRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJeu"


    // $ANTLR start "ruleJeu"
    // InternalGame.g:62:1: ruleJeu : ( ( rule__Jeu__Group__0 ) ) ;
    public final void ruleJeu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:66:2: ( ( ( rule__Jeu__Group__0 ) ) )
            // InternalGame.g:67:2: ( ( rule__Jeu__Group__0 ) )
            {
            // InternalGame.g:67:2: ( ( rule__Jeu__Group__0 ) )
            // InternalGame.g:68:3: ( rule__Jeu__Group__0 )
            {
             before(grammarAccess.getJeuAccess().getGroup()); 
            // InternalGame.g:69:3: ( rule__Jeu__Group__0 )
            // InternalGame.g:69:4: rule__Jeu__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJeuAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJeu"


    // $ANTLR start "entryRuleElementsJeu"
    // InternalGame.g:78:1: entryRuleElementsJeu : ruleElementsJeu EOF ;
    public final void entryRuleElementsJeu() throws RecognitionException {
        try {
            // InternalGame.g:79:1: ( ruleElementsJeu EOF )
            // InternalGame.g:80:1: ruleElementsJeu EOF
            {
             before(grammarAccess.getElementsJeuRule()); 
            pushFollow(FOLLOW_1);
            ruleElementsJeu();

            state._fsp--;

             after(grammarAccess.getElementsJeuRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElementsJeu"


    // $ANTLR start "ruleElementsJeu"
    // InternalGame.g:87:1: ruleElementsJeu : ( ( rule__ElementsJeu__Alternatives ) ) ;
    public final void ruleElementsJeu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:91:2: ( ( ( rule__ElementsJeu__Alternatives ) ) )
            // InternalGame.g:92:2: ( ( rule__ElementsJeu__Alternatives ) )
            {
            // InternalGame.g:92:2: ( ( rule__ElementsJeu__Alternatives ) )
            // InternalGame.g:93:3: ( rule__ElementsJeu__Alternatives )
            {
             before(grammarAccess.getElementsJeuAccess().getAlternatives()); 
            // InternalGame.g:94:3: ( rule__ElementsJeu__Alternatives )
            // InternalGame.g:94:4: rule__ElementsJeu__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ElementsJeu__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementsJeuAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementsJeu"


    // $ANTLR start "entryRulePlace"
    // InternalGame.g:103:1: entryRulePlace : rulePlace EOF ;
    public final void entryRulePlace() throws RecognitionException {
        try {
            // InternalGame.g:104:1: ( rulePlace EOF )
            // InternalGame.g:105:1: rulePlace EOF
            {
             before(grammarAccess.getPlaceRule()); 
            pushFollow(FOLLOW_1);
            rulePlace();

            state._fsp--;

             after(grammarAccess.getPlaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlace"


    // $ANTLR start "rulePlace"
    // InternalGame.g:112:1: rulePlace : ( ( rule__Place__Alternatives ) ) ;
    public final void rulePlace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:116:2: ( ( ( rule__Place__Alternatives ) ) )
            // InternalGame.g:117:2: ( ( rule__Place__Alternatives ) )
            {
            // InternalGame.g:117:2: ( ( rule__Place__Alternatives ) )
            // InternalGame.g:118:3: ( rule__Place__Alternatives )
            {
             before(grammarAccess.getPlaceAccess().getAlternatives()); 
            // InternalGame.g:119:3: ( rule__Place__Alternatives )
            // InternalGame.g:119:4: rule__Place__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Place__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlace"


    // $ANTLR start "entryRuleTerritoire"
    // InternalGame.g:128:1: entryRuleTerritoire : ruleTerritoire EOF ;
    public final void entryRuleTerritoire() throws RecognitionException {
        try {
            // InternalGame.g:129:1: ( ruleTerritoire EOF )
            // InternalGame.g:130:1: ruleTerritoire EOF
            {
             before(grammarAccess.getTerritoireRule()); 
            pushFollow(FOLLOW_1);
            ruleTerritoire();

            state._fsp--;

             after(grammarAccess.getTerritoireRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerritoire"


    // $ANTLR start "ruleTerritoire"
    // InternalGame.g:137:1: ruleTerritoire : ( ( rule__Territoire__Group__0 ) ) ;
    public final void ruleTerritoire() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:141:2: ( ( ( rule__Territoire__Group__0 ) ) )
            // InternalGame.g:142:2: ( ( rule__Territoire__Group__0 ) )
            {
            // InternalGame.g:142:2: ( ( rule__Territoire__Group__0 ) )
            // InternalGame.g:143:3: ( rule__Territoire__Group__0 )
            {
             before(grammarAccess.getTerritoireAccess().getGroup()); 
            // InternalGame.g:144:3: ( rule__Territoire__Group__0 )
            // InternalGame.g:144:4: rule__Territoire__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Territoire__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTerritoireAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerritoire"


    // $ANTLR start "entryRuleExplorateur"
    // InternalGame.g:153:1: entryRuleExplorateur : ruleExplorateur EOF ;
    public final void entryRuleExplorateur() throws RecognitionException {
        try {
            // InternalGame.g:154:1: ( ruleExplorateur EOF )
            // InternalGame.g:155:1: ruleExplorateur EOF
            {
             before(grammarAccess.getExplorateurRule()); 
            pushFollow(FOLLOW_1);
            ruleExplorateur();

            state._fsp--;

             after(grammarAccess.getExplorateurRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExplorateur"


    // $ANTLR start "ruleExplorateur"
    // InternalGame.g:162:1: ruleExplorateur : ( ( rule__Explorateur__Group__0 ) ) ;
    public final void ruleExplorateur() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:166:2: ( ( ( rule__Explorateur__Group__0 ) ) )
            // InternalGame.g:167:2: ( ( rule__Explorateur__Group__0 ) )
            {
            // InternalGame.g:167:2: ( ( rule__Explorateur__Group__0 ) )
            // InternalGame.g:168:3: ( rule__Explorateur__Group__0 )
            {
             before(grammarAccess.getExplorateurAccess().getGroup()); 
            // InternalGame.g:169:3: ( rule__Explorateur__Group__0 )
            // InternalGame.g:169:4: rule__Explorateur__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExplorateurAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExplorateur"


    // $ANTLR start "entryRuleLieu"
    // InternalGame.g:178:1: entryRuleLieu : ruleLieu EOF ;
    public final void entryRuleLieu() throws RecognitionException {
        try {
            // InternalGame.g:179:1: ( ruleLieu EOF )
            // InternalGame.g:180:1: ruleLieu EOF
            {
             before(grammarAccess.getLieuRule()); 
            pushFollow(FOLLOW_1);
            ruleLieu();

            state._fsp--;

             after(grammarAccess.getLieuRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLieu"


    // $ANTLR start "ruleLieu"
    // InternalGame.g:187:1: ruleLieu : ( ( rule__Lieu__Group__0 ) ) ;
    public final void ruleLieu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:191:2: ( ( ( rule__Lieu__Group__0 ) ) )
            // InternalGame.g:192:2: ( ( rule__Lieu__Group__0 ) )
            {
            // InternalGame.g:192:2: ( ( rule__Lieu__Group__0 ) )
            // InternalGame.g:193:3: ( rule__Lieu__Group__0 )
            {
             before(grammarAccess.getLieuAccess().getGroup()); 
            // InternalGame.g:194:3: ( rule__Lieu__Group__0 )
            // InternalGame.g:194:4: rule__Lieu__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLieu"


    // $ANTLR start "entryRuleChemin"
    // InternalGame.g:203:1: entryRuleChemin : ruleChemin EOF ;
    public final void entryRuleChemin() throws RecognitionException {
        try {
            // InternalGame.g:204:1: ( ruleChemin EOF )
            // InternalGame.g:205:1: ruleChemin EOF
            {
             before(grammarAccess.getCheminRule()); 
            pushFollow(FOLLOW_1);
            ruleChemin();

            state._fsp--;

             after(grammarAccess.getCheminRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChemin"


    // $ANTLR start "ruleChemin"
    // InternalGame.g:212:1: ruleChemin : ( ( rule__Chemin__Group__0 ) ) ;
    public final void ruleChemin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:216:2: ( ( ( rule__Chemin__Group__0 ) ) )
            // InternalGame.g:217:2: ( ( rule__Chemin__Group__0 ) )
            {
            // InternalGame.g:217:2: ( ( rule__Chemin__Group__0 ) )
            // InternalGame.g:218:3: ( rule__Chemin__Group__0 )
            {
             before(grammarAccess.getCheminAccess().getGroup()); 
            // InternalGame.g:219:3: ( rule__Chemin__Group__0 )
            // InternalGame.g:219:4: rule__Chemin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChemin"


    // $ANTLR start "entryRulePersonne"
    // InternalGame.g:228:1: entryRulePersonne : rulePersonne EOF ;
    public final void entryRulePersonne() throws RecognitionException {
        try {
            // InternalGame.g:229:1: ( rulePersonne EOF )
            // InternalGame.g:230:1: rulePersonne EOF
            {
             before(grammarAccess.getPersonneRule()); 
            pushFollow(FOLLOW_1);
            rulePersonne();

            state._fsp--;

             after(grammarAccess.getPersonneRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePersonne"


    // $ANTLR start "rulePersonne"
    // InternalGame.g:237:1: rulePersonne : ( ( rule__Personne__Group__0 ) ) ;
    public final void rulePersonne() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:241:2: ( ( ( rule__Personne__Group__0 ) ) )
            // InternalGame.g:242:2: ( ( rule__Personne__Group__0 ) )
            {
            // InternalGame.g:242:2: ( ( rule__Personne__Group__0 ) )
            // InternalGame.g:243:3: ( rule__Personne__Group__0 )
            {
             before(grammarAccess.getPersonneAccess().getGroup()); 
            // InternalGame.g:244:3: ( rule__Personne__Group__0 )
            // InternalGame.g:244:4: rule__Personne__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Personne__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePersonne"


    // $ANTLR start "entryRuleConditionPersonne"
    // InternalGame.g:253:1: entryRuleConditionPersonne : ruleConditionPersonne EOF ;
    public final void entryRuleConditionPersonne() throws RecognitionException {
        try {
            // InternalGame.g:254:1: ( ruleConditionPersonne EOF )
            // InternalGame.g:255:1: ruleConditionPersonne EOF
            {
             before(grammarAccess.getConditionPersonneRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionPersonne();

            state._fsp--;

             after(grammarAccess.getConditionPersonneRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditionPersonne"


    // $ANTLR start "ruleConditionPersonne"
    // InternalGame.g:262:1: ruleConditionPersonne : ( ( rule__ConditionPersonne__Group__0 ) ) ;
    public final void ruleConditionPersonne() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:266:2: ( ( ( rule__ConditionPersonne__Group__0 ) ) )
            // InternalGame.g:267:2: ( ( rule__ConditionPersonne__Group__0 ) )
            {
            // InternalGame.g:267:2: ( ( rule__ConditionPersonne__Group__0 ) )
            // InternalGame.g:268:3: ( rule__ConditionPersonne__Group__0 )
            {
             before(grammarAccess.getConditionPersonneAccess().getGroup()); 
            // InternalGame.g:269:3: ( rule__ConditionPersonne__Group__0 )
            // InternalGame.g:269:4: rule__ConditionPersonne__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionPersonne__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionPersonneAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionPersonne"


    // $ANTLR start "entryRuleInteraction"
    // InternalGame.g:278:1: entryRuleInteraction : ruleInteraction EOF ;
    public final void entryRuleInteraction() throws RecognitionException {
        try {
            // InternalGame.g:279:1: ( ruleInteraction EOF )
            // InternalGame.g:280:1: ruleInteraction EOF
            {
             before(grammarAccess.getInteractionRule()); 
            pushFollow(FOLLOW_1);
            ruleInteraction();

            state._fsp--;

             after(grammarAccess.getInteractionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInteraction"


    // $ANTLR start "ruleInteraction"
    // InternalGame.g:287:1: ruleInteraction : ( ( rule__Interaction__Group__0 ) ) ;
    public final void ruleInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:291:2: ( ( ( rule__Interaction__Group__0 ) ) )
            // InternalGame.g:292:2: ( ( rule__Interaction__Group__0 ) )
            {
            // InternalGame.g:292:2: ( ( rule__Interaction__Group__0 ) )
            // InternalGame.g:293:3: ( rule__Interaction__Group__0 )
            {
             before(grammarAccess.getInteractionAccess().getGroup()); 
            // InternalGame.g:294:3: ( rule__Interaction__Group__0 )
            // InternalGame.g:294:4: rule__Interaction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteraction"


    // $ANTLR start "entryRuleConnaissance"
    // InternalGame.g:303:1: entryRuleConnaissance : ruleConnaissance EOF ;
    public final void entryRuleConnaissance() throws RecognitionException {
        try {
            // InternalGame.g:304:1: ( ruleConnaissance EOF )
            // InternalGame.g:305:1: ruleConnaissance EOF
            {
             before(grammarAccess.getConnaissanceRule()); 
            pushFollow(FOLLOW_1);
            ruleConnaissance();

            state._fsp--;

             after(grammarAccess.getConnaissanceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConnaissance"


    // $ANTLR start "ruleConnaissance"
    // InternalGame.g:312:1: ruleConnaissance : ( ( rule__Connaissance__Group__0 ) ) ;
    public final void ruleConnaissance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:316:2: ( ( ( rule__Connaissance__Group__0 ) ) )
            // InternalGame.g:317:2: ( ( rule__Connaissance__Group__0 ) )
            {
            // InternalGame.g:317:2: ( ( rule__Connaissance__Group__0 ) )
            // InternalGame.g:318:3: ( rule__Connaissance__Group__0 )
            {
             before(grammarAccess.getConnaissanceAccess().getGroup()); 
            // InternalGame.g:319:3: ( rule__Connaissance__Group__0 )
            // InternalGame.g:319:4: rule__Connaissance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnaissanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnaissance"


    // $ANTLR start "entryRuleObjet"
    // InternalGame.g:328:1: entryRuleObjet : ruleObjet EOF ;
    public final void entryRuleObjet() throws RecognitionException {
        try {
            // InternalGame.g:329:1: ( ruleObjet EOF )
            // InternalGame.g:330:1: ruleObjet EOF
            {
             before(grammarAccess.getObjetRule()); 
            pushFollow(FOLLOW_1);
            ruleObjet();

            state._fsp--;

             after(grammarAccess.getObjetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObjet"


    // $ANTLR start "ruleObjet"
    // InternalGame.g:337:1: ruleObjet : ( ( rule__Objet__Group__0 ) ) ;
    public final void ruleObjet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:341:2: ( ( ( rule__Objet__Group__0 ) ) )
            // InternalGame.g:342:2: ( ( rule__Objet__Group__0 ) )
            {
            // InternalGame.g:342:2: ( ( rule__Objet__Group__0 ) )
            // InternalGame.g:343:3: ( rule__Objet__Group__0 )
            {
             before(grammarAccess.getObjetAccess().getGroup()); 
            // InternalGame.g:344:3: ( rule__Objet__Group__0 )
            // InternalGame.g:344:4: rule__Objet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Objet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjet"


    // $ANTLR start "entryRuleConditionAvantage"
    // InternalGame.g:353:1: entryRuleConditionAvantage : ruleConditionAvantage EOF ;
    public final void entryRuleConditionAvantage() throws RecognitionException {
        try {
            // InternalGame.g:354:1: ( ruleConditionAvantage EOF )
            // InternalGame.g:355:1: ruleConditionAvantage EOF
            {
             before(grammarAccess.getConditionAvantageRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionAvantage();

            state._fsp--;

             after(grammarAccess.getConditionAvantageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditionAvantage"


    // $ANTLR start "ruleConditionAvantage"
    // InternalGame.g:362:1: ruleConditionAvantage : ( ( rule__ConditionAvantage__Group__0 ) ) ;
    public final void ruleConditionAvantage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:366:2: ( ( ( rule__ConditionAvantage__Group__0 ) ) )
            // InternalGame.g:367:2: ( ( rule__ConditionAvantage__Group__0 ) )
            {
            // InternalGame.g:367:2: ( ( rule__ConditionAvantage__Group__0 ) )
            // InternalGame.g:368:3: ( rule__ConditionAvantage__Group__0 )
            {
             before(grammarAccess.getConditionAvantageAccess().getGroup()); 
            // InternalGame.g:369:3: ( rule__ConditionAvantage__Group__0 )
            // InternalGame.g:369:4: rule__ConditionAvantage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionAvantage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAvantageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionAvantage"


    // $ANTLR start "entryRuleChoix"
    // InternalGame.g:378:1: entryRuleChoix : ruleChoix EOF ;
    public final void entryRuleChoix() throws RecognitionException {
        try {
            // InternalGame.g:379:1: ( ruleChoix EOF )
            // InternalGame.g:380:1: ruleChoix EOF
            {
             before(grammarAccess.getChoixRule()); 
            pushFollow(FOLLOW_1);
            ruleChoix();

            state._fsp--;

             after(grammarAccess.getChoixRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChoix"


    // $ANTLR start "ruleChoix"
    // InternalGame.g:387:1: ruleChoix : ( ( rule__Choix__Group__0 ) ) ;
    public final void ruleChoix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:391:2: ( ( ( rule__Choix__Group__0 ) ) )
            // InternalGame.g:392:2: ( ( rule__Choix__Group__0 ) )
            {
            // InternalGame.g:392:2: ( ( rule__Choix__Group__0 ) )
            // InternalGame.g:393:3: ( rule__Choix__Group__0 )
            {
             before(grammarAccess.getChoixAccess().getGroup()); 
            // InternalGame.g:394:3: ( rule__Choix__Group__0 )
            // InternalGame.g:394:4: rule__Choix__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChoix"


    // $ANTLR start "entryRuleQteObjet"
    // InternalGame.g:403:1: entryRuleQteObjet : ruleQteObjet EOF ;
    public final void entryRuleQteObjet() throws RecognitionException {
        try {
            // InternalGame.g:404:1: ( ruleQteObjet EOF )
            // InternalGame.g:405:1: ruleQteObjet EOF
            {
             before(grammarAccess.getQteObjetRule()); 
            pushFollow(FOLLOW_1);
            ruleQteObjet();

            state._fsp--;

             after(grammarAccess.getQteObjetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQteObjet"


    // $ANTLR start "ruleQteObjet"
    // InternalGame.g:412:1: ruleQteObjet : ( ( rule__QteObjet__Group__0 ) ) ;
    public final void ruleQteObjet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:416:2: ( ( ( rule__QteObjet__Group__0 ) ) )
            // InternalGame.g:417:2: ( ( rule__QteObjet__Group__0 ) )
            {
            // InternalGame.g:417:2: ( ( rule__QteObjet__Group__0 ) )
            // InternalGame.g:418:3: ( rule__QteObjet__Group__0 )
            {
             before(grammarAccess.getQteObjetAccess().getGroup()); 
            // InternalGame.g:419:3: ( rule__QteObjet__Group__0 )
            // InternalGame.g:419:4: rule__QteObjet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QteObjet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQteObjetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQteObjet"


    // $ANTLR start "entryRuleEInt"
    // InternalGame.g:428:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalGame.g:429:1: ( ruleEInt EOF )
            // InternalGame.g:430:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalGame.g:437:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:441:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalGame.g:442:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalGame.g:442:2: ( ( rule__EInt__Group__0 ) )
            // InternalGame.g:443:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalGame.g:444:3: ( rule__EInt__Group__0 )
            // InternalGame.g:444:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleConditionChemin"
    // InternalGame.g:453:1: entryRuleConditionChemin : ruleConditionChemin EOF ;
    public final void entryRuleConditionChemin() throws RecognitionException {
        try {
            // InternalGame.g:454:1: ( ruleConditionChemin EOF )
            // InternalGame.g:455:1: ruleConditionChemin EOF
            {
             before(grammarAccess.getConditionCheminRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionChemin();

            state._fsp--;

             after(grammarAccess.getConditionCheminRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditionChemin"


    // $ANTLR start "ruleConditionChemin"
    // InternalGame.g:462:1: ruleConditionChemin : ( ( rule__ConditionChemin__Group__0 ) ) ;
    public final void ruleConditionChemin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:466:2: ( ( ( rule__ConditionChemin__Group__0 ) ) )
            // InternalGame.g:467:2: ( ( rule__ConditionChemin__Group__0 ) )
            {
            // InternalGame.g:467:2: ( ( rule__ConditionChemin__Group__0 ) )
            // InternalGame.g:468:3: ( rule__ConditionChemin__Group__0 )
            {
             before(grammarAccess.getConditionCheminAccess().getGroup()); 
            // InternalGame.g:469:3: ( rule__ConditionChemin__Group__0 )
            // InternalGame.g:469:4: rule__ConditionChemin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionChemin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionCheminAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionChemin"


    // $ANTLR start "ruleNature"
    // InternalGame.g:478:1: ruleNature : ( ( rule__Nature__Alternatives ) ) ;
    public final void ruleNature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:482:1: ( ( ( rule__Nature__Alternatives ) ) )
            // InternalGame.g:483:2: ( ( rule__Nature__Alternatives ) )
            {
            // InternalGame.g:483:2: ( ( rule__Nature__Alternatives ) )
            // InternalGame.g:484:3: ( rule__Nature__Alternatives )
            {
             before(grammarAccess.getNatureAccess().getAlternatives()); 
            // InternalGame.g:485:3: ( rule__Nature__Alternatives )
            // InternalGame.g:485:4: rule__Nature__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Nature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNatureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNature"


    // $ANTLR start "rule__ElementsJeu__Alternatives"
    // InternalGame.g:493:1: rule__ElementsJeu__Alternatives : ( ( rulePlace ) | ( ruleQteObjet ) | ( rulePersonne ) | ( ruleConnaissance ) | ( ruleObjet ) | ( ruleInteraction ) | ( ruleChoix ) | ( ruleConditionPersonne ) | ( ruleConditionAvantage ) | ( ruleConditionChemin ) );
    public final void rule__ElementsJeu__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:497:1: ( ( rulePlace ) | ( ruleQteObjet ) | ( rulePersonne ) | ( ruleConnaissance ) | ( ruleObjet ) | ( ruleInteraction ) | ( ruleChoix ) | ( ruleConditionPersonne ) | ( ruleConditionAvantage ) | ( ruleConditionChemin ) )
            int alt1=10;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalGame.g:498:2: ( rulePlace )
                    {
                    // InternalGame.g:498:2: ( rulePlace )
                    // InternalGame.g:499:3: rulePlace
                    {
                     before(grammarAccess.getElementsJeuAccess().getPlaceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePlace();

                    state._fsp--;

                     after(grammarAccess.getElementsJeuAccess().getPlaceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:504:2: ( ruleQteObjet )
                    {
                    // InternalGame.g:504:2: ( ruleQteObjet )
                    // InternalGame.g:505:3: ruleQteObjet
                    {
                     before(grammarAccess.getElementsJeuAccess().getQteObjetParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleQteObjet();

                    state._fsp--;

                     after(grammarAccess.getElementsJeuAccess().getQteObjetParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:510:2: ( rulePersonne )
                    {
                    // InternalGame.g:510:2: ( rulePersonne )
                    // InternalGame.g:511:3: rulePersonne
                    {
                     before(grammarAccess.getElementsJeuAccess().getPersonneParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePersonne();

                    state._fsp--;

                     after(grammarAccess.getElementsJeuAccess().getPersonneParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGame.g:516:2: ( ruleConnaissance )
                    {
                    // InternalGame.g:516:2: ( ruleConnaissance )
                    // InternalGame.g:517:3: ruleConnaissance
                    {
                     before(grammarAccess.getElementsJeuAccess().getConnaissanceParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleConnaissance();

                    state._fsp--;

                     after(grammarAccess.getElementsJeuAccess().getConnaissanceParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGame.g:522:2: ( ruleObjet )
                    {
                    // InternalGame.g:522:2: ( ruleObjet )
                    // InternalGame.g:523:3: ruleObjet
                    {
                     before(grammarAccess.getElementsJeuAccess().getObjetParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleObjet();

                    state._fsp--;

                     after(grammarAccess.getElementsJeuAccess().getObjetParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGame.g:528:2: ( ruleInteraction )
                    {
                    // InternalGame.g:528:2: ( ruleInteraction )
                    // InternalGame.g:529:3: ruleInteraction
                    {
                     before(grammarAccess.getElementsJeuAccess().getInteractionParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleInteraction();

                    state._fsp--;

                     after(grammarAccess.getElementsJeuAccess().getInteractionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGame.g:534:2: ( ruleChoix )
                    {
                    // InternalGame.g:534:2: ( ruleChoix )
                    // InternalGame.g:535:3: ruleChoix
                    {
                     before(grammarAccess.getElementsJeuAccess().getChoixParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleChoix();

                    state._fsp--;

                     after(grammarAccess.getElementsJeuAccess().getChoixParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalGame.g:540:2: ( ruleConditionPersonne )
                    {
                    // InternalGame.g:540:2: ( ruleConditionPersonne )
                    // InternalGame.g:541:3: ruleConditionPersonne
                    {
                     before(grammarAccess.getElementsJeuAccess().getConditionPersonneParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleConditionPersonne();

                    state._fsp--;

                     after(grammarAccess.getElementsJeuAccess().getConditionPersonneParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalGame.g:546:2: ( ruleConditionAvantage )
                    {
                    // InternalGame.g:546:2: ( ruleConditionAvantage )
                    // InternalGame.g:547:3: ruleConditionAvantage
                    {
                     before(grammarAccess.getElementsJeuAccess().getConditionAvantageParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleConditionAvantage();

                    state._fsp--;

                     after(grammarAccess.getElementsJeuAccess().getConditionAvantageParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalGame.g:552:2: ( ruleConditionChemin )
                    {
                    // InternalGame.g:552:2: ( ruleConditionChemin )
                    // InternalGame.g:553:3: ruleConditionChemin
                    {
                     before(grammarAccess.getElementsJeuAccess().getConditionCheminParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleConditionChemin();

                    state._fsp--;

                     after(grammarAccess.getElementsJeuAccess().getConditionCheminParserRuleCall_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementsJeu__Alternatives"


    // $ANTLR start "rule__Place__Alternatives"
    // InternalGame.g:562:1: rule__Place__Alternatives : ( ( ruleLieu ) | ( ruleChemin ) );
    public final void rule__Place__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:566:1: ( ( ruleLieu ) | ( ruleChemin ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==25) ) {
                alt2=1;
            }
            else if ( (LA2_0==28||LA2_0==61) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGame.g:567:2: ( ruleLieu )
                    {
                    // InternalGame.g:567:2: ( ruleLieu )
                    // InternalGame.g:568:3: ruleLieu
                    {
                     before(grammarAccess.getPlaceAccess().getLieuParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLieu();

                    state._fsp--;

                     after(grammarAccess.getPlaceAccess().getLieuParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:573:2: ( ruleChemin )
                    {
                    // InternalGame.g:573:2: ( ruleChemin )
                    // InternalGame.g:574:3: ruleChemin
                    {
                     before(grammarAccess.getPlaceAccess().getCheminParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleChemin();

                    state._fsp--;

                     after(grammarAccess.getPlaceAccess().getCheminParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Alternatives"


    // $ANTLR start "rule__Nature__Alternatives"
    // InternalGame.g:583:1: rule__Nature__Alternatives : ( ( ( 'depart' ) ) | ( ( 'fin' ) ) | ( ( 'inter' ) ) );
    public final void rule__Nature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:587:1: ( ( ( 'depart' ) ) | ( ( 'fin' ) ) | ( ( 'inter' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGame.g:588:2: ( ( 'depart' ) )
                    {
                    // InternalGame.g:588:2: ( ( 'depart' ) )
                    // InternalGame.g:589:3: ( 'depart' )
                    {
                     before(grammarAccess.getNatureAccess().getDepartEnumLiteralDeclaration_0()); 
                    // InternalGame.g:590:3: ( 'depart' )
                    // InternalGame.g:590:4: 'depart'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getNatureAccess().getDepartEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:594:2: ( ( 'fin' ) )
                    {
                    // InternalGame.g:594:2: ( ( 'fin' ) )
                    // InternalGame.g:595:3: ( 'fin' )
                    {
                     before(grammarAccess.getNatureAccess().getFinEnumLiteralDeclaration_1()); 
                    // InternalGame.g:596:3: ( 'fin' )
                    // InternalGame.g:596:4: 'fin'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getNatureAccess().getFinEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:600:2: ( ( 'inter' ) )
                    {
                    // InternalGame.g:600:2: ( ( 'inter' ) )
                    // InternalGame.g:601:3: ( 'inter' )
                    {
                     before(grammarAccess.getNatureAccess().getInterEnumLiteralDeclaration_2()); 
                    // InternalGame.g:602:3: ( 'inter' )
                    // InternalGame.g:602:4: 'inter'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getNatureAccess().getInterEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nature__Alternatives"


    // $ANTLR start "rule__Jeu__Group__0"
    // InternalGame.g:610:1: rule__Jeu__Group__0 : rule__Jeu__Group__0__Impl rule__Jeu__Group__1 ;
    public final void rule__Jeu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:614:1: ( rule__Jeu__Group__0__Impl rule__Jeu__Group__1 )
            // InternalGame.g:615:2: rule__Jeu__Group__0__Impl rule__Jeu__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Jeu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__0"


    // $ANTLR start "rule__Jeu__Group__0__Impl"
    // InternalGame.g:622:1: rule__Jeu__Group__0__Impl : ( () ) ;
    public final void rule__Jeu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:626:1: ( ( () ) )
            // InternalGame.g:627:1: ( () )
            {
            // InternalGame.g:627:1: ( () )
            // InternalGame.g:628:2: ()
            {
             before(grammarAccess.getJeuAccess().getJeuAction_0()); 
            // InternalGame.g:629:2: ()
            // InternalGame.g:629:3: 
            {
            }

             after(grammarAccess.getJeuAccess().getJeuAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__0__Impl"


    // $ANTLR start "rule__Jeu__Group__1"
    // InternalGame.g:637:1: rule__Jeu__Group__1 : rule__Jeu__Group__1__Impl rule__Jeu__Group__2 ;
    public final void rule__Jeu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:641:1: ( rule__Jeu__Group__1__Impl rule__Jeu__Group__2 )
            // InternalGame.g:642:2: rule__Jeu__Group__1__Impl rule__Jeu__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Jeu__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__1"


    // $ANTLR start "rule__Jeu__Group__1__Impl"
    // InternalGame.g:649:1: rule__Jeu__Group__1__Impl : ( 'Jeu' ) ;
    public final void rule__Jeu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:653:1: ( ( 'Jeu' ) )
            // InternalGame.g:654:1: ( 'Jeu' )
            {
            // InternalGame.g:654:1: ( 'Jeu' )
            // InternalGame.g:655:2: 'Jeu'
            {
             before(grammarAccess.getJeuAccess().getJeuKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getJeuKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__1__Impl"


    // $ANTLR start "rule__Jeu__Group__2"
    // InternalGame.g:664:1: rule__Jeu__Group__2 : rule__Jeu__Group__2__Impl rule__Jeu__Group__3 ;
    public final void rule__Jeu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:668:1: ( rule__Jeu__Group__2__Impl rule__Jeu__Group__3 )
            // InternalGame.g:669:2: rule__Jeu__Group__2__Impl rule__Jeu__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Jeu__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__2"


    // $ANTLR start "rule__Jeu__Group__2__Impl"
    // InternalGame.g:676:1: rule__Jeu__Group__2__Impl : ( ( rule__Jeu__NameAssignment_2 ) ) ;
    public final void rule__Jeu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:680:1: ( ( ( rule__Jeu__NameAssignment_2 ) ) )
            // InternalGame.g:681:1: ( ( rule__Jeu__NameAssignment_2 ) )
            {
            // InternalGame.g:681:1: ( ( rule__Jeu__NameAssignment_2 ) )
            // InternalGame.g:682:2: ( rule__Jeu__NameAssignment_2 )
            {
             before(grammarAccess.getJeuAccess().getNameAssignment_2()); 
            // InternalGame.g:683:2: ( rule__Jeu__NameAssignment_2 )
            // InternalGame.g:683:3: rule__Jeu__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getJeuAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__2__Impl"


    // $ANTLR start "rule__Jeu__Group__3"
    // InternalGame.g:691:1: rule__Jeu__Group__3 : rule__Jeu__Group__3__Impl rule__Jeu__Group__4 ;
    public final void rule__Jeu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:695:1: ( rule__Jeu__Group__3__Impl rule__Jeu__Group__4 )
            // InternalGame.g:696:2: rule__Jeu__Group__3__Impl rule__Jeu__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Jeu__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__3"


    // $ANTLR start "rule__Jeu__Group__3__Impl"
    // InternalGame.g:703:1: rule__Jeu__Group__3__Impl : ( '{' ) ;
    public final void rule__Jeu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:707:1: ( ( '{' ) )
            // InternalGame.g:708:1: ( '{' )
            {
            // InternalGame.g:708:1: ( '{' )
            // InternalGame.g:709:2: '{'
            {
             before(grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__3__Impl"


    // $ANTLR start "rule__Jeu__Group__4"
    // InternalGame.g:718:1: rule__Jeu__Group__4 : rule__Jeu__Group__4__Impl rule__Jeu__Group__5 ;
    public final void rule__Jeu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:722:1: ( rule__Jeu__Group__4__Impl rule__Jeu__Group__5 )
            // InternalGame.g:723:2: rule__Jeu__Group__4__Impl rule__Jeu__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Jeu__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__4"


    // $ANTLR start "rule__Jeu__Group__4__Impl"
    // InternalGame.g:730:1: rule__Jeu__Group__4__Impl : ( ( rule__Jeu__TerritoireAssignment_4 ) ) ;
    public final void rule__Jeu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:734:1: ( ( ( rule__Jeu__TerritoireAssignment_4 ) ) )
            // InternalGame.g:735:1: ( ( rule__Jeu__TerritoireAssignment_4 ) )
            {
            // InternalGame.g:735:1: ( ( rule__Jeu__TerritoireAssignment_4 ) )
            // InternalGame.g:736:2: ( rule__Jeu__TerritoireAssignment_4 )
            {
             before(grammarAccess.getJeuAccess().getTerritoireAssignment_4()); 
            // InternalGame.g:737:2: ( rule__Jeu__TerritoireAssignment_4 )
            // InternalGame.g:737:3: rule__Jeu__TerritoireAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__TerritoireAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getJeuAccess().getTerritoireAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__4__Impl"


    // $ANTLR start "rule__Jeu__Group__5"
    // InternalGame.g:745:1: rule__Jeu__Group__5 : rule__Jeu__Group__5__Impl rule__Jeu__Group__6 ;
    public final void rule__Jeu__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:749:1: ( rule__Jeu__Group__5__Impl rule__Jeu__Group__6 )
            // InternalGame.g:750:2: rule__Jeu__Group__5__Impl rule__Jeu__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Jeu__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__5"


    // $ANTLR start "rule__Jeu__Group__5__Impl"
    // InternalGame.g:757:1: rule__Jeu__Group__5__Impl : ( ( rule__Jeu__ExplorateurAssignment_5 ) ) ;
    public final void rule__Jeu__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:761:1: ( ( ( rule__Jeu__ExplorateurAssignment_5 ) ) )
            // InternalGame.g:762:1: ( ( rule__Jeu__ExplorateurAssignment_5 ) )
            {
            // InternalGame.g:762:1: ( ( rule__Jeu__ExplorateurAssignment_5 ) )
            // InternalGame.g:763:2: ( rule__Jeu__ExplorateurAssignment_5 )
            {
             before(grammarAccess.getJeuAccess().getExplorateurAssignment_5()); 
            // InternalGame.g:764:2: ( rule__Jeu__ExplorateurAssignment_5 )
            // InternalGame.g:764:3: rule__Jeu__ExplorateurAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__ExplorateurAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getJeuAccess().getExplorateurAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__5__Impl"


    // $ANTLR start "rule__Jeu__Group__6"
    // InternalGame.g:772:1: rule__Jeu__Group__6 : rule__Jeu__Group__6__Impl rule__Jeu__Group__7 ;
    public final void rule__Jeu__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:776:1: ( rule__Jeu__Group__6__Impl rule__Jeu__Group__7 )
            // InternalGame.g:777:2: rule__Jeu__Group__6__Impl rule__Jeu__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Jeu__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__6"


    // $ANTLR start "rule__Jeu__Group__6__Impl"
    // InternalGame.g:784:1: rule__Jeu__Group__6__Impl : ( ( rule__Jeu__ElementsjeuAssignment_6 ) ) ;
    public final void rule__Jeu__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:788:1: ( ( ( rule__Jeu__ElementsjeuAssignment_6 ) ) )
            // InternalGame.g:789:1: ( ( rule__Jeu__ElementsjeuAssignment_6 ) )
            {
            // InternalGame.g:789:1: ( ( rule__Jeu__ElementsjeuAssignment_6 ) )
            // InternalGame.g:790:2: ( rule__Jeu__ElementsjeuAssignment_6 )
            {
             before(grammarAccess.getJeuAccess().getElementsjeuAssignment_6()); 
            // InternalGame.g:791:2: ( rule__Jeu__ElementsjeuAssignment_6 )
            // InternalGame.g:791:3: rule__Jeu__ElementsjeuAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__ElementsjeuAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getJeuAccess().getElementsjeuAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__6__Impl"


    // $ANTLR start "rule__Jeu__Group__7"
    // InternalGame.g:799:1: rule__Jeu__Group__7 : rule__Jeu__Group__7__Impl rule__Jeu__Group__8 ;
    public final void rule__Jeu__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:803:1: ( rule__Jeu__Group__7__Impl rule__Jeu__Group__8 )
            // InternalGame.g:804:2: rule__Jeu__Group__7__Impl rule__Jeu__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Jeu__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__7"


    // $ANTLR start "rule__Jeu__Group__7__Impl"
    // InternalGame.g:811:1: rule__Jeu__Group__7__Impl : ( ( rule__Jeu__Group_7__0 )* ) ;
    public final void rule__Jeu__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:815:1: ( ( ( rule__Jeu__Group_7__0 )* ) )
            // InternalGame.g:816:1: ( ( rule__Jeu__Group_7__0 )* )
            {
            // InternalGame.g:816:1: ( ( rule__Jeu__Group_7__0 )* )
            // InternalGame.g:817:2: ( rule__Jeu__Group_7__0 )*
            {
             before(grammarAccess.getJeuAccess().getGroup_7()); 
            // InternalGame.g:818:2: ( rule__Jeu__Group_7__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGame.g:818:3: rule__Jeu__Group_7__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Jeu__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getJeuAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__7__Impl"


    // $ANTLR start "rule__Jeu__Group__8"
    // InternalGame.g:826:1: rule__Jeu__Group__8 : rule__Jeu__Group__8__Impl ;
    public final void rule__Jeu__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:830:1: ( rule__Jeu__Group__8__Impl )
            // InternalGame.g:831:2: rule__Jeu__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__8"


    // $ANTLR start "rule__Jeu__Group__8__Impl"
    // InternalGame.g:837:1: rule__Jeu__Group__8__Impl : ( '}' ) ;
    public final void rule__Jeu__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:841:1: ( ( '}' ) )
            // InternalGame.g:842:1: ( '}' )
            {
            // InternalGame.g:842:1: ( '}' )
            // InternalGame.g:843:2: '}'
            {
             before(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__8__Impl"


    // $ANTLR start "rule__Jeu__Group_7__0"
    // InternalGame.g:853:1: rule__Jeu__Group_7__0 : rule__Jeu__Group_7__0__Impl rule__Jeu__Group_7__1 ;
    public final void rule__Jeu__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:857:1: ( rule__Jeu__Group_7__0__Impl rule__Jeu__Group_7__1 )
            // InternalGame.g:858:2: rule__Jeu__Group_7__0__Impl rule__Jeu__Group_7__1
            {
            pushFollow(FOLLOW_8);
            rule__Jeu__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group_7__0"


    // $ANTLR start "rule__Jeu__Group_7__0__Impl"
    // InternalGame.g:865:1: rule__Jeu__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Jeu__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:869:1: ( ( ',' ) )
            // InternalGame.g:870:1: ( ',' )
            {
            // InternalGame.g:870:1: ( ',' )
            // InternalGame.g:871:2: ','
            {
             before(grammarAccess.getJeuAccess().getCommaKeyword_7_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group_7__0__Impl"


    // $ANTLR start "rule__Jeu__Group_7__1"
    // InternalGame.g:880:1: rule__Jeu__Group_7__1 : rule__Jeu__Group_7__1__Impl ;
    public final void rule__Jeu__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:884:1: ( rule__Jeu__Group_7__1__Impl )
            // InternalGame.g:885:2: rule__Jeu__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group_7__1"


    // $ANTLR start "rule__Jeu__Group_7__1__Impl"
    // InternalGame.g:891:1: rule__Jeu__Group_7__1__Impl : ( ( rule__Jeu__ElementsjeuAssignment_7_1 ) ) ;
    public final void rule__Jeu__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:895:1: ( ( ( rule__Jeu__ElementsjeuAssignment_7_1 ) ) )
            // InternalGame.g:896:1: ( ( rule__Jeu__ElementsjeuAssignment_7_1 ) )
            {
            // InternalGame.g:896:1: ( ( rule__Jeu__ElementsjeuAssignment_7_1 ) )
            // InternalGame.g:897:2: ( rule__Jeu__ElementsjeuAssignment_7_1 )
            {
             before(grammarAccess.getJeuAccess().getElementsjeuAssignment_7_1()); 
            // InternalGame.g:898:2: ( rule__Jeu__ElementsjeuAssignment_7_1 )
            // InternalGame.g:898:3: rule__Jeu__ElementsjeuAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__ElementsjeuAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getJeuAccess().getElementsjeuAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group_7__1__Impl"


    // $ANTLR start "rule__Territoire__Group__0"
    // InternalGame.g:907:1: rule__Territoire__Group__0 : rule__Territoire__Group__0__Impl rule__Territoire__Group__1 ;
    public final void rule__Territoire__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:911:1: ( rule__Territoire__Group__0__Impl rule__Territoire__Group__1 )
            // InternalGame.g:912:2: rule__Territoire__Group__0__Impl rule__Territoire__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Territoire__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Territoire__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group__0"


    // $ANTLR start "rule__Territoire__Group__0__Impl"
    // InternalGame.g:919:1: rule__Territoire__Group__0__Impl : ( () ) ;
    public final void rule__Territoire__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:923:1: ( ( () ) )
            // InternalGame.g:924:1: ( () )
            {
            // InternalGame.g:924:1: ( () )
            // InternalGame.g:925:2: ()
            {
             before(grammarAccess.getTerritoireAccess().getTerritoireAction_0()); 
            // InternalGame.g:926:2: ()
            // InternalGame.g:926:3: 
            {
            }

             after(grammarAccess.getTerritoireAccess().getTerritoireAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group__0__Impl"


    // $ANTLR start "rule__Territoire__Group__1"
    // InternalGame.g:934:1: rule__Territoire__Group__1 : rule__Territoire__Group__1__Impl rule__Territoire__Group__2 ;
    public final void rule__Territoire__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:938:1: ( rule__Territoire__Group__1__Impl rule__Territoire__Group__2 )
            // InternalGame.g:939:2: rule__Territoire__Group__1__Impl rule__Territoire__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Territoire__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Territoire__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group__1"


    // $ANTLR start "rule__Territoire__Group__1__Impl"
    // InternalGame.g:946:1: rule__Territoire__Group__1__Impl : ( 'Territoire' ) ;
    public final void rule__Territoire__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:950:1: ( ( 'Territoire' ) )
            // InternalGame.g:951:1: ( 'Territoire' )
            {
            // InternalGame.g:951:1: ( 'Territoire' )
            // InternalGame.g:952:2: 'Territoire'
            {
             before(grammarAccess.getTerritoireAccess().getTerritoireKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getTerritoireKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group__1__Impl"


    // $ANTLR start "rule__Territoire__Group__2"
    // InternalGame.g:961:1: rule__Territoire__Group__2 : rule__Territoire__Group__2__Impl rule__Territoire__Group__3 ;
    public final void rule__Territoire__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:965:1: ( rule__Territoire__Group__2__Impl rule__Territoire__Group__3 )
            // InternalGame.g:966:2: rule__Territoire__Group__2__Impl rule__Territoire__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Territoire__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Territoire__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group__2"


    // $ANTLR start "rule__Territoire__Group__2__Impl"
    // InternalGame.g:973:1: rule__Territoire__Group__2__Impl : ( '{' ) ;
    public final void rule__Territoire__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:977:1: ( ( '{' ) )
            // InternalGame.g:978:1: ( '{' )
            {
            // InternalGame.g:978:1: ( '{' )
            // InternalGame.g:979:2: '{'
            {
             before(grammarAccess.getTerritoireAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group__2__Impl"


    // $ANTLR start "rule__Territoire__Group__3"
    // InternalGame.g:988:1: rule__Territoire__Group__3 : rule__Territoire__Group__3__Impl rule__Territoire__Group__4 ;
    public final void rule__Territoire__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:992:1: ( rule__Territoire__Group__3__Impl rule__Territoire__Group__4 )
            // InternalGame.g:993:2: rule__Territoire__Group__3__Impl rule__Territoire__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Territoire__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Territoire__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group__3"


    // $ANTLR start "rule__Territoire__Group__3__Impl"
    // InternalGame.g:1000:1: rule__Territoire__Group__3__Impl : ( 'places' ) ;
    public final void rule__Territoire__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1004:1: ( ( 'places' ) )
            // InternalGame.g:1005:1: ( 'places' )
            {
            // InternalGame.g:1005:1: ( 'places' )
            // InternalGame.g:1006:2: 'places'
            {
             before(grammarAccess.getTerritoireAccess().getPlacesKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getPlacesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group__3__Impl"


    // $ANTLR start "rule__Territoire__Group__4"
    // InternalGame.g:1015:1: rule__Territoire__Group__4 : rule__Territoire__Group__4__Impl rule__Territoire__Group__5 ;
    public final void rule__Territoire__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1019:1: ( rule__Territoire__Group__4__Impl rule__Territoire__Group__5 )
            // InternalGame.g:1020:2: rule__Territoire__Group__4__Impl rule__Territoire__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Territoire__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Territoire__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group__4"


    // $ANTLR start "rule__Territoire__Group__4__Impl"
    // InternalGame.g:1027:1: rule__Territoire__Group__4__Impl : ( ( rule__Territoire__PlacesAssignment_4 ) ) ;
    public final void rule__Territoire__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1031:1: ( ( ( rule__Territoire__PlacesAssignment_4 ) ) )
            // InternalGame.g:1032:1: ( ( rule__Territoire__PlacesAssignment_4 ) )
            {
            // InternalGame.g:1032:1: ( ( rule__Territoire__PlacesAssignment_4 ) )
            // InternalGame.g:1033:2: ( rule__Territoire__PlacesAssignment_4 )
            {
             before(grammarAccess.getTerritoireAccess().getPlacesAssignment_4()); 
            // InternalGame.g:1034:2: ( rule__Territoire__PlacesAssignment_4 )
            // InternalGame.g:1034:3: rule__Territoire__PlacesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Territoire__PlacesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTerritoireAccess().getPlacesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group__4__Impl"


    // $ANTLR start "rule__Territoire__Group__5"
    // InternalGame.g:1042:1: rule__Territoire__Group__5 : rule__Territoire__Group__5__Impl rule__Territoire__Group__6 ;
    public final void rule__Territoire__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1046:1: ( rule__Territoire__Group__5__Impl rule__Territoire__Group__6 )
            // InternalGame.g:1047:2: rule__Territoire__Group__5__Impl rule__Territoire__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Territoire__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Territoire__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group__5"


    // $ANTLR start "rule__Territoire__Group__5__Impl"
    // InternalGame.g:1054:1: rule__Territoire__Group__5__Impl : ( ( rule__Territoire__Group_5__0 )* ) ;
    public final void rule__Territoire__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1058:1: ( ( ( rule__Territoire__Group_5__0 )* ) )
            // InternalGame.g:1059:1: ( ( rule__Territoire__Group_5__0 )* )
            {
            // InternalGame.g:1059:1: ( ( rule__Territoire__Group_5__0 )* )
            // InternalGame.g:1060:2: ( rule__Territoire__Group_5__0 )*
            {
             before(grammarAccess.getTerritoireAccess().getGroup_5()); 
            // InternalGame.g:1061:2: ( rule__Territoire__Group_5__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGame.g:1061:3: rule__Territoire__Group_5__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Territoire__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getTerritoireAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group__5__Impl"


    // $ANTLR start "rule__Territoire__Group__6"
    // InternalGame.g:1069:1: rule__Territoire__Group__6 : rule__Territoire__Group__6__Impl ;
    public final void rule__Territoire__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1073:1: ( rule__Territoire__Group__6__Impl )
            // InternalGame.g:1074:2: rule__Territoire__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Territoire__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group__6"


    // $ANTLR start "rule__Territoire__Group__6__Impl"
    // InternalGame.g:1080:1: rule__Territoire__Group__6__Impl : ( '}' ) ;
    public final void rule__Territoire__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1084:1: ( ( '}' ) )
            // InternalGame.g:1085:1: ( '}' )
            {
            // InternalGame.g:1085:1: ( '}' )
            // InternalGame.g:1086:2: '}'
            {
             before(grammarAccess.getTerritoireAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group__6__Impl"


    // $ANTLR start "rule__Territoire__Group_5__0"
    // InternalGame.g:1096:1: rule__Territoire__Group_5__0 : rule__Territoire__Group_5__0__Impl rule__Territoire__Group_5__1 ;
    public final void rule__Territoire__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1100:1: ( rule__Territoire__Group_5__0__Impl rule__Territoire__Group_5__1 )
            // InternalGame.g:1101:2: rule__Territoire__Group_5__0__Impl rule__Territoire__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__Territoire__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Territoire__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group_5__0"


    // $ANTLR start "rule__Territoire__Group_5__0__Impl"
    // InternalGame.g:1108:1: rule__Territoire__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Territoire__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1112:1: ( ( ',' ) )
            // InternalGame.g:1113:1: ( ',' )
            {
            // InternalGame.g:1113:1: ( ',' )
            // InternalGame.g:1114:2: ','
            {
             before(grammarAccess.getTerritoireAccess().getCommaKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group_5__0__Impl"


    // $ANTLR start "rule__Territoire__Group_5__1"
    // InternalGame.g:1123:1: rule__Territoire__Group_5__1 : rule__Territoire__Group_5__1__Impl ;
    public final void rule__Territoire__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1127:1: ( rule__Territoire__Group_5__1__Impl )
            // InternalGame.g:1128:2: rule__Territoire__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Territoire__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group_5__1"


    // $ANTLR start "rule__Territoire__Group_5__1__Impl"
    // InternalGame.g:1134:1: rule__Territoire__Group_5__1__Impl : ( ( rule__Territoire__PlacesAssignment_5_1 ) ) ;
    public final void rule__Territoire__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1138:1: ( ( ( rule__Territoire__PlacesAssignment_5_1 ) ) )
            // InternalGame.g:1139:1: ( ( rule__Territoire__PlacesAssignment_5_1 ) )
            {
            // InternalGame.g:1139:1: ( ( rule__Territoire__PlacesAssignment_5_1 ) )
            // InternalGame.g:1140:2: ( rule__Territoire__PlacesAssignment_5_1 )
            {
             before(grammarAccess.getTerritoireAccess().getPlacesAssignment_5_1()); 
            // InternalGame.g:1141:2: ( rule__Territoire__PlacesAssignment_5_1 )
            // InternalGame.g:1141:3: rule__Territoire__PlacesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Territoire__PlacesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTerritoireAccess().getPlacesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group_5__1__Impl"


    // $ANTLR start "rule__Explorateur__Group__0"
    // InternalGame.g:1150:1: rule__Explorateur__Group__0 : rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1 ;
    public final void rule__Explorateur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1154:1: ( rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1 )
            // InternalGame.g:1155:2: rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Explorateur__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__0"


    // $ANTLR start "rule__Explorateur__Group__0__Impl"
    // InternalGame.g:1162:1: rule__Explorateur__Group__0__Impl : ( () ) ;
    public final void rule__Explorateur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1166:1: ( ( () ) )
            // InternalGame.g:1167:1: ( () )
            {
            // InternalGame.g:1167:1: ( () )
            // InternalGame.g:1168:2: ()
            {
             before(grammarAccess.getExplorateurAccess().getExplorateurAction_0()); 
            // InternalGame.g:1169:2: ()
            // InternalGame.g:1169:3: 
            {
            }

             after(grammarAccess.getExplorateurAccess().getExplorateurAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__0__Impl"


    // $ANTLR start "rule__Explorateur__Group__1"
    // InternalGame.g:1177:1: rule__Explorateur__Group__1 : rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2 ;
    public final void rule__Explorateur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1181:1: ( rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2 )
            // InternalGame.g:1182:2: rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Explorateur__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__1"


    // $ANTLR start "rule__Explorateur__Group__1__Impl"
    // InternalGame.g:1189:1: rule__Explorateur__Group__1__Impl : ( 'Explorateur' ) ;
    public final void rule__Explorateur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1193:1: ( ( 'Explorateur' ) )
            // InternalGame.g:1194:1: ( 'Explorateur' )
            {
            // InternalGame.g:1194:1: ( 'Explorateur' )
            // InternalGame.g:1195:2: 'Explorateur'
            {
             before(grammarAccess.getExplorateurAccess().getExplorateurKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getExplorateurKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__1__Impl"


    // $ANTLR start "rule__Explorateur__Group__2"
    // InternalGame.g:1204:1: rule__Explorateur__Group__2 : rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3 ;
    public final void rule__Explorateur__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1208:1: ( rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3 )
            // InternalGame.g:1209:2: rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Explorateur__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__2"


    // $ANTLR start "rule__Explorateur__Group__2__Impl"
    // InternalGame.g:1216:1: rule__Explorateur__Group__2__Impl : ( '{' ) ;
    public final void rule__Explorateur__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1220:1: ( ( '{' ) )
            // InternalGame.g:1221:1: ( '{' )
            {
            // InternalGame.g:1221:1: ( '{' )
            // InternalGame.g:1222:2: '{'
            {
             before(grammarAccess.getExplorateurAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__2__Impl"


    // $ANTLR start "rule__Explorateur__Group__3"
    // InternalGame.g:1231:1: rule__Explorateur__Group__3 : rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4 ;
    public final void rule__Explorateur__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1235:1: ( rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4 )
            // InternalGame.g:1236:2: rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Explorateur__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__3"


    // $ANTLR start "rule__Explorateur__Group__3__Impl"
    // InternalGame.g:1243:1: rule__Explorateur__Group__3__Impl : ( 'taille' ) ;
    public final void rule__Explorateur__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1247:1: ( ( 'taille' ) )
            // InternalGame.g:1248:1: ( 'taille' )
            {
            // InternalGame.g:1248:1: ( 'taille' )
            // InternalGame.g:1249:2: 'taille'
            {
             before(grammarAccess.getExplorateurAccess().getTailleKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getTailleKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__3__Impl"


    // $ANTLR start "rule__Explorateur__Group__4"
    // InternalGame.g:1258:1: rule__Explorateur__Group__4 : rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5 ;
    public final void rule__Explorateur__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1262:1: ( rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5 )
            // InternalGame.g:1263:2: rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Explorateur__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__4"


    // $ANTLR start "rule__Explorateur__Group__4__Impl"
    // InternalGame.g:1270:1: rule__Explorateur__Group__4__Impl : ( ( rule__Explorateur__TailleDispoAssignment_4 ) ) ;
    public final void rule__Explorateur__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1274:1: ( ( ( rule__Explorateur__TailleDispoAssignment_4 ) ) )
            // InternalGame.g:1275:1: ( ( rule__Explorateur__TailleDispoAssignment_4 ) )
            {
            // InternalGame.g:1275:1: ( ( rule__Explorateur__TailleDispoAssignment_4 ) )
            // InternalGame.g:1276:2: ( rule__Explorateur__TailleDispoAssignment_4 )
            {
             before(grammarAccess.getExplorateurAccess().getTailleDispoAssignment_4()); 
            // InternalGame.g:1277:2: ( rule__Explorateur__TailleDispoAssignment_4 )
            // InternalGame.g:1277:3: rule__Explorateur__TailleDispoAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Explorateur__TailleDispoAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getExplorateurAccess().getTailleDispoAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__4__Impl"


    // $ANTLR start "rule__Explorateur__Group__5"
    // InternalGame.g:1285:1: rule__Explorateur__Group__5 : rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6 ;
    public final void rule__Explorateur__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1289:1: ( rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6 )
            // InternalGame.g:1290:2: rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Explorateur__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__5"


    // $ANTLR start "rule__Explorateur__Group__5__Impl"
    // InternalGame.g:1297:1: rule__Explorateur__Group__5__Impl : ( 'localisation' ) ;
    public final void rule__Explorateur__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1301:1: ( ( 'localisation' ) )
            // InternalGame.g:1302:1: ( 'localisation' )
            {
            // InternalGame.g:1302:1: ( 'localisation' )
            // InternalGame.g:1303:2: 'localisation'
            {
             before(grammarAccess.getExplorateurAccess().getLocalisationKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getLocalisationKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__5__Impl"


    // $ANTLR start "rule__Explorateur__Group__6"
    // InternalGame.g:1312:1: rule__Explorateur__Group__6 : rule__Explorateur__Group__6__Impl rule__Explorateur__Group__7 ;
    public final void rule__Explorateur__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1316:1: ( rule__Explorateur__Group__6__Impl rule__Explorateur__Group__7 )
            // InternalGame.g:1317:2: rule__Explorateur__Group__6__Impl rule__Explorateur__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Explorateur__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__6"


    // $ANTLR start "rule__Explorateur__Group__6__Impl"
    // InternalGame.g:1324:1: rule__Explorateur__Group__6__Impl : ( ( rule__Explorateur__PlaceAssignment_6 ) ) ;
    public final void rule__Explorateur__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1328:1: ( ( ( rule__Explorateur__PlaceAssignment_6 ) ) )
            // InternalGame.g:1329:1: ( ( rule__Explorateur__PlaceAssignment_6 ) )
            {
            // InternalGame.g:1329:1: ( ( rule__Explorateur__PlaceAssignment_6 ) )
            // InternalGame.g:1330:2: ( rule__Explorateur__PlaceAssignment_6 )
            {
             before(grammarAccess.getExplorateurAccess().getPlaceAssignment_6()); 
            // InternalGame.g:1331:2: ( rule__Explorateur__PlaceAssignment_6 )
            // InternalGame.g:1331:3: rule__Explorateur__PlaceAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Explorateur__PlaceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getExplorateurAccess().getPlaceAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__6__Impl"


    // $ANTLR start "rule__Explorateur__Group__7"
    // InternalGame.g:1339:1: rule__Explorateur__Group__7 : rule__Explorateur__Group__7__Impl rule__Explorateur__Group__8 ;
    public final void rule__Explorateur__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1343:1: ( rule__Explorateur__Group__7__Impl rule__Explorateur__Group__8 )
            // InternalGame.g:1344:2: rule__Explorateur__Group__7__Impl rule__Explorateur__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Explorateur__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__7"


    // $ANTLR start "rule__Explorateur__Group__7__Impl"
    // InternalGame.g:1351:1: rule__Explorateur__Group__7__Impl : ( ( rule__Explorateur__Group_7__0 )? ) ;
    public final void rule__Explorateur__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1355:1: ( ( ( rule__Explorateur__Group_7__0 )? ) )
            // InternalGame.g:1356:1: ( ( rule__Explorateur__Group_7__0 )? )
            {
            // InternalGame.g:1356:1: ( ( rule__Explorateur__Group_7__0 )? )
            // InternalGame.g:1357:2: ( rule__Explorateur__Group_7__0 )?
            {
             before(grammarAccess.getExplorateurAccess().getGroup_7()); 
            // InternalGame.g:1358:2: ( rule__Explorateur__Group_7__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGame.g:1358:3: rule__Explorateur__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Explorateur__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExplorateurAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__7__Impl"


    // $ANTLR start "rule__Explorateur__Group__8"
    // InternalGame.g:1366:1: rule__Explorateur__Group__8 : rule__Explorateur__Group__8__Impl rule__Explorateur__Group__9 ;
    public final void rule__Explorateur__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1370:1: ( rule__Explorateur__Group__8__Impl rule__Explorateur__Group__9 )
            // InternalGame.g:1371:2: rule__Explorateur__Group__8__Impl rule__Explorateur__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__Explorateur__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__8"


    // $ANTLR start "rule__Explorateur__Group__8__Impl"
    // InternalGame.g:1378:1: rule__Explorateur__Group__8__Impl : ( ( rule__Explorateur__Group_8__0 )? ) ;
    public final void rule__Explorateur__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1382:1: ( ( ( rule__Explorateur__Group_8__0 )? ) )
            // InternalGame.g:1383:1: ( ( rule__Explorateur__Group_8__0 )? )
            {
            // InternalGame.g:1383:1: ( ( rule__Explorateur__Group_8__0 )? )
            // InternalGame.g:1384:2: ( rule__Explorateur__Group_8__0 )?
            {
             before(grammarAccess.getExplorateurAccess().getGroup_8()); 
            // InternalGame.g:1385:2: ( rule__Explorateur__Group_8__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGame.g:1385:3: rule__Explorateur__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Explorateur__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExplorateurAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__8__Impl"


    // $ANTLR start "rule__Explorateur__Group__9"
    // InternalGame.g:1393:1: rule__Explorateur__Group__9 : rule__Explorateur__Group__9__Impl ;
    public final void rule__Explorateur__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1397:1: ( rule__Explorateur__Group__9__Impl )
            // InternalGame.g:1398:2: rule__Explorateur__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__9"


    // $ANTLR start "rule__Explorateur__Group__9__Impl"
    // InternalGame.g:1404:1: rule__Explorateur__Group__9__Impl : ( '}' ) ;
    public final void rule__Explorateur__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1408:1: ( ( '}' ) )
            // InternalGame.g:1409:1: ( '}' )
            {
            // InternalGame.g:1409:1: ( '}' )
            // InternalGame.g:1410:2: '}'
            {
             before(grammarAccess.getExplorateurAccess().getRightCurlyBracketKeyword_9()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__9__Impl"


    // $ANTLR start "rule__Explorateur__Group_7__0"
    // InternalGame.g:1420:1: rule__Explorateur__Group_7__0 : rule__Explorateur__Group_7__0__Impl rule__Explorateur__Group_7__1 ;
    public final void rule__Explorateur__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1424:1: ( rule__Explorateur__Group_7__0__Impl rule__Explorateur__Group_7__1 )
            // InternalGame.g:1425:2: rule__Explorateur__Group_7__0__Impl rule__Explorateur__Group_7__1
            {
            pushFollow(FOLLOW_17);
            rule__Explorateur__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group_7__0"


    // $ANTLR start "rule__Explorateur__Group_7__0__Impl"
    // InternalGame.g:1432:1: rule__Explorateur__Group_7__0__Impl : ( 'objets' ) ;
    public final void rule__Explorateur__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1436:1: ( ( 'objets' ) )
            // InternalGame.g:1437:1: ( 'objets' )
            {
            // InternalGame.g:1437:1: ( 'objets' )
            // InternalGame.g:1438:2: 'objets'
            {
             before(grammarAccess.getExplorateurAccess().getObjetsKeyword_7_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getObjetsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group_7__0__Impl"


    // $ANTLR start "rule__Explorateur__Group_7__1"
    // InternalGame.g:1447:1: rule__Explorateur__Group_7__1 : rule__Explorateur__Group_7__1__Impl rule__Explorateur__Group_7__2 ;
    public final void rule__Explorateur__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1451:1: ( rule__Explorateur__Group_7__1__Impl rule__Explorateur__Group_7__2 )
            // InternalGame.g:1452:2: rule__Explorateur__Group_7__1__Impl rule__Explorateur__Group_7__2
            {
            pushFollow(FOLLOW_18);
            rule__Explorateur__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group_7__1"


    // $ANTLR start "rule__Explorateur__Group_7__1__Impl"
    // InternalGame.g:1459:1: rule__Explorateur__Group_7__1__Impl : ( ( rule__Explorateur__ObjetsAssignment_7_1 ) ) ;
    public final void rule__Explorateur__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1463:1: ( ( ( rule__Explorateur__ObjetsAssignment_7_1 ) ) )
            // InternalGame.g:1464:1: ( ( rule__Explorateur__ObjetsAssignment_7_1 ) )
            {
            // InternalGame.g:1464:1: ( ( rule__Explorateur__ObjetsAssignment_7_1 ) )
            // InternalGame.g:1465:2: ( rule__Explorateur__ObjetsAssignment_7_1 )
            {
             before(grammarAccess.getExplorateurAccess().getObjetsAssignment_7_1()); 
            // InternalGame.g:1466:2: ( rule__Explorateur__ObjetsAssignment_7_1 )
            // InternalGame.g:1466:3: rule__Explorateur__ObjetsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Explorateur__ObjetsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getExplorateurAccess().getObjetsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group_7__1__Impl"


    // $ANTLR start "rule__Explorateur__Group_7__2"
    // InternalGame.g:1474:1: rule__Explorateur__Group_7__2 : rule__Explorateur__Group_7__2__Impl ;
    public final void rule__Explorateur__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1478:1: ( rule__Explorateur__Group_7__2__Impl )
            // InternalGame.g:1479:2: rule__Explorateur__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Explorateur__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group_7__2"


    // $ANTLR start "rule__Explorateur__Group_7__2__Impl"
    // InternalGame.g:1485:1: rule__Explorateur__Group_7__2__Impl : ( ( rule__Explorateur__Group_7_2__0 )* ) ;
    public final void rule__Explorateur__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1489:1: ( ( ( rule__Explorateur__Group_7_2__0 )* ) )
            // InternalGame.g:1490:1: ( ( rule__Explorateur__Group_7_2__0 )* )
            {
            // InternalGame.g:1490:1: ( ( rule__Explorateur__Group_7_2__0 )* )
            // InternalGame.g:1491:2: ( rule__Explorateur__Group_7_2__0 )*
            {
             before(grammarAccess.getExplorateurAccess().getGroup_7_2()); 
            // InternalGame.g:1492:2: ( rule__Explorateur__Group_7_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGame.g:1492:3: rule__Explorateur__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Explorateur__Group_7_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getExplorateurAccess().getGroup_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group_7__2__Impl"


    // $ANTLR start "rule__Explorateur__Group_7_2__0"
    // InternalGame.g:1501:1: rule__Explorateur__Group_7_2__0 : rule__Explorateur__Group_7_2__0__Impl rule__Explorateur__Group_7_2__1 ;
    public final void rule__Explorateur__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1505:1: ( rule__Explorateur__Group_7_2__0__Impl rule__Explorateur__Group_7_2__1 )
            // InternalGame.g:1506:2: rule__Explorateur__Group_7_2__0__Impl rule__Explorateur__Group_7_2__1
            {
            pushFollow(FOLLOW_17);
            rule__Explorateur__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group_7_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group_7_2__0"


    // $ANTLR start "rule__Explorateur__Group_7_2__0__Impl"
    // InternalGame.g:1513:1: rule__Explorateur__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__Explorateur__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1517:1: ( ( ',' ) )
            // InternalGame.g:1518:1: ( ',' )
            {
            // InternalGame.g:1518:1: ( ',' )
            // InternalGame.g:1519:2: ','
            {
             before(grammarAccess.getExplorateurAccess().getCommaKeyword_7_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getCommaKeyword_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group_7_2__0__Impl"


    // $ANTLR start "rule__Explorateur__Group_7_2__1"
    // InternalGame.g:1528:1: rule__Explorateur__Group_7_2__1 : rule__Explorateur__Group_7_2__1__Impl ;
    public final void rule__Explorateur__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1532:1: ( rule__Explorateur__Group_7_2__1__Impl )
            // InternalGame.g:1533:2: rule__Explorateur__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Explorateur__Group_7_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group_7_2__1"


    // $ANTLR start "rule__Explorateur__Group_7_2__1__Impl"
    // InternalGame.g:1539:1: rule__Explorateur__Group_7_2__1__Impl : ( ( rule__Explorateur__ObjetsAssignment_7_2_1 ) ) ;
    public final void rule__Explorateur__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1543:1: ( ( ( rule__Explorateur__ObjetsAssignment_7_2_1 ) ) )
            // InternalGame.g:1544:1: ( ( rule__Explorateur__ObjetsAssignment_7_2_1 ) )
            {
            // InternalGame.g:1544:1: ( ( rule__Explorateur__ObjetsAssignment_7_2_1 ) )
            // InternalGame.g:1545:2: ( rule__Explorateur__ObjetsAssignment_7_2_1 )
            {
             before(grammarAccess.getExplorateurAccess().getObjetsAssignment_7_2_1()); 
            // InternalGame.g:1546:2: ( rule__Explorateur__ObjetsAssignment_7_2_1 )
            // InternalGame.g:1546:3: rule__Explorateur__ObjetsAssignment_7_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Explorateur__ObjetsAssignment_7_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExplorateurAccess().getObjetsAssignment_7_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group_7_2__1__Impl"


    // $ANTLR start "rule__Explorateur__Group_8__0"
    // InternalGame.g:1555:1: rule__Explorateur__Group_8__0 : rule__Explorateur__Group_8__0__Impl rule__Explorateur__Group_8__1 ;
    public final void rule__Explorateur__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1559:1: ( rule__Explorateur__Group_8__0__Impl rule__Explorateur__Group_8__1 )
            // InternalGame.g:1560:2: rule__Explorateur__Group_8__0__Impl rule__Explorateur__Group_8__1
            {
            pushFollow(FOLLOW_19);
            rule__Explorateur__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group_8__0"


    // $ANTLR start "rule__Explorateur__Group_8__0__Impl"
    // InternalGame.g:1567:1: rule__Explorateur__Group_8__0__Impl : ( 'connaissances' ) ;
    public final void rule__Explorateur__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1571:1: ( ( 'connaissances' ) )
            // InternalGame.g:1572:1: ( 'connaissances' )
            {
            // InternalGame.g:1572:1: ( 'connaissances' )
            // InternalGame.g:1573:2: 'connaissances'
            {
             before(grammarAccess.getExplorateurAccess().getConnaissancesKeyword_8_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getConnaissancesKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group_8__0__Impl"


    // $ANTLR start "rule__Explorateur__Group_8__1"
    // InternalGame.g:1582:1: rule__Explorateur__Group_8__1 : rule__Explorateur__Group_8__1__Impl rule__Explorateur__Group_8__2 ;
    public final void rule__Explorateur__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1586:1: ( rule__Explorateur__Group_8__1__Impl rule__Explorateur__Group_8__2 )
            // InternalGame.g:1587:2: rule__Explorateur__Group_8__1__Impl rule__Explorateur__Group_8__2
            {
            pushFollow(FOLLOW_18);
            rule__Explorateur__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group_8__1"


    // $ANTLR start "rule__Explorateur__Group_8__1__Impl"
    // InternalGame.g:1594:1: rule__Explorateur__Group_8__1__Impl : ( ( rule__Explorateur__ConnaissancesAssignment_8_1 ) ) ;
    public final void rule__Explorateur__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1598:1: ( ( ( rule__Explorateur__ConnaissancesAssignment_8_1 ) ) )
            // InternalGame.g:1599:1: ( ( rule__Explorateur__ConnaissancesAssignment_8_1 ) )
            {
            // InternalGame.g:1599:1: ( ( rule__Explorateur__ConnaissancesAssignment_8_1 ) )
            // InternalGame.g:1600:2: ( rule__Explorateur__ConnaissancesAssignment_8_1 )
            {
             before(grammarAccess.getExplorateurAccess().getConnaissancesAssignment_8_1()); 
            // InternalGame.g:1601:2: ( rule__Explorateur__ConnaissancesAssignment_8_1 )
            // InternalGame.g:1601:3: rule__Explorateur__ConnaissancesAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Explorateur__ConnaissancesAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getExplorateurAccess().getConnaissancesAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group_8__1__Impl"


    // $ANTLR start "rule__Explorateur__Group_8__2"
    // InternalGame.g:1609:1: rule__Explorateur__Group_8__2 : rule__Explorateur__Group_8__2__Impl ;
    public final void rule__Explorateur__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1613:1: ( rule__Explorateur__Group_8__2__Impl )
            // InternalGame.g:1614:2: rule__Explorateur__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Explorateur__Group_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group_8__2"


    // $ANTLR start "rule__Explorateur__Group_8__2__Impl"
    // InternalGame.g:1620:1: rule__Explorateur__Group_8__2__Impl : ( ( rule__Explorateur__Group_8_2__0 )* ) ;
    public final void rule__Explorateur__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1624:1: ( ( ( rule__Explorateur__Group_8_2__0 )* ) )
            // InternalGame.g:1625:1: ( ( rule__Explorateur__Group_8_2__0 )* )
            {
            // InternalGame.g:1625:1: ( ( rule__Explorateur__Group_8_2__0 )* )
            // InternalGame.g:1626:2: ( rule__Explorateur__Group_8_2__0 )*
            {
             before(grammarAccess.getExplorateurAccess().getGroup_8_2()); 
            // InternalGame.g:1627:2: ( rule__Explorateur__Group_8_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGame.g:1627:3: rule__Explorateur__Group_8_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Explorateur__Group_8_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getExplorateurAccess().getGroup_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group_8__2__Impl"


    // $ANTLR start "rule__Explorateur__Group_8_2__0"
    // InternalGame.g:1636:1: rule__Explorateur__Group_8_2__0 : rule__Explorateur__Group_8_2__0__Impl rule__Explorateur__Group_8_2__1 ;
    public final void rule__Explorateur__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1640:1: ( rule__Explorateur__Group_8_2__0__Impl rule__Explorateur__Group_8_2__1 )
            // InternalGame.g:1641:2: rule__Explorateur__Group_8_2__0__Impl rule__Explorateur__Group_8_2__1
            {
            pushFollow(FOLLOW_19);
            rule__Explorateur__Group_8_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group_8_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group_8_2__0"


    // $ANTLR start "rule__Explorateur__Group_8_2__0__Impl"
    // InternalGame.g:1648:1: rule__Explorateur__Group_8_2__0__Impl : ( ',' ) ;
    public final void rule__Explorateur__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1652:1: ( ( ',' ) )
            // InternalGame.g:1653:1: ( ',' )
            {
            // InternalGame.g:1653:1: ( ',' )
            // InternalGame.g:1654:2: ','
            {
             before(grammarAccess.getExplorateurAccess().getCommaKeyword_8_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getCommaKeyword_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group_8_2__0__Impl"


    // $ANTLR start "rule__Explorateur__Group_8_2__1"
    // InternalGame.g:1663:1: rule__Explorateur__Group_8_2__1 : rule__Explorateur__Group_8_2__1__Impl ;
    public final void rule__Explorateur__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1667:1: ( rule__Explorateur__Group_8_2__1__Impl )
            // InternalGame.g:1668:2: rule__Explorateur__Group_8_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Explorateur__Group_8_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group_8_2__1"


    // $ANTLR start "rule__Explorateur__Group_8_2__1__Impl"
    // InternalGame.g:1674:1: rule__Explorateur__Group_8_2__1__Impl : ( ( rule__Explorateur__ConnaissancesAssignment_8_2_1 ) ) ;
    public final void rule__Explorateur__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1678:1: ( ( ( rule__Explorateur__ConnaissancesAssignment_8_2_1 ) ) )
            // InternalGame.g:1679:1: ( ( rule__Explorateur__ConnaissancesAssignment_8_2_1 ) )
            {
            // InternalGame.g:1679:1: ( ( rule__Explorateur__ConnaissancesAssignment_8_2_1 ) )
            // InternalGame.g:1680:2: ( rule__Explorateur__ConnaissancesAssignment_8_2_1 )
            {
             before(grammarAccess.getExplorateurAccess().getConnaissancesAssignment_8_2_1()); 
            // InternalGame.g:1681:2: ( rule__Explorateur__ConnaissancesAssignment_8_2_1 )
            // InternalGame.g:1681:3: rule__Explorateur__ConnaissancesAssignment_8_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Explorateur__ConnaissancesAssignment_8_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExplorateurAccess().getConnaissancesAssignment_8_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group_8_2__1__Impl"


    // $ANTLR start "rule__Lieu__Group__0"
    // InternalGame.g:1690:1: rule__Lieu__Group__0 : rule__Lieu__Group__0__Impl rule__Lieu__Group__1 ;
    public final void rule__Lieu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1694:1: ( rule__Lieu__Group__0__Impl rule__Lieu__Group__1 )
            // InternalGame.g:1695:2: rule__Lieu__Group__0__Impl rule__Lieu__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Lieu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__0"


    // $ANTLR start "rule__Lieu__Group__0__Impl"
    // InternalGame.g:1702:1: rule__Lieu__Group__0__Impl : ( () ) ;
    public final void rule__Lieu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1706:1: ( ( () ) )
            // InternalGame.g:1707:1: ( () )
            {
            // InternalGame.g:1707:1: ( () )
            // InternalGame.g:1708:2: ()
            {
             before(grammarAccess.getLieuAccess().getLieuAction_0()); 
            // InternalGame.g:1709:2: ()
            // InternalGame.g:1709:3: 
            {
            }

             after(grammarAccess.getLieuAccess().getLieuAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__0__Impl"


    // $ANTLR start "rule__Lieu__Group__1"
    // InternalGame.g:1717:1: rule__Lieu__Group__1 : rule__Lieu__Group__1__Impl rule__Lieu__Group__2 ;
    public final void rule__Lieu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1721:1: ( rule__Lieu__Group__1__Impl rule__Lieu__Group__2 )
            // InternalGame.g:1722:2: rule__Lieu__Group__1__Impl rule__Lieu__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Lieu__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__1"


    // $ANTLR start "rule__Lieu__Group__1__Impl"
    // InternalGame.g:1729:1: rule__Lieu__Group__1__Impl : ( 'Lieu' ) ;
    public final void rule__Lieu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1733:1: ( ( 'Lieu' ) )
            // InternalGame.g:1734:1: ( 'Lieu' )
            {
            // InternalGame.g:1734:1: ( 'Lieu' )
            // InternalGame.g:1735:2: 'Lieu'
            {
             before(grammarAccess.getLieuAccess().getLieuKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getLieuKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__1__Impl"


    // $ANTLR start "rule__Lieu__Group__2"
    // InternalGame.g:1744:1: rule__Lieu__Group__2 : rule__Lieu__Group__2__Impl rule__Lieu__Group__3 ;
    public final void rule__Lieu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1748:1: ( rule__Lieu__Group__2__Impl rule__Lieu__Group__3 )
            // InternalGame.g:1749:2: rule__Lieu__Group__2__Impl rule__Lieu__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Lieu__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__2"


    // $ANTLR start "rule__Lieu__Group__2__Impl"
    // InternalGame.g:1756:1: rule__Lieu__Group__2__Impl : ( ( rule__Lieu__NameAssignment_2 ) ) ;
    public final void rule__Lieu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1760:1: ( ( ( rule__Lieu__NameAssignment_2 ) ) )
            // InternalGame.g:1761:1: ( ( rule__Lieu__NameAssignment_2 ) )
            {
            // InternalGame.g:1761:1: ( ( rule__Lieu__NameAssignment_2 ) )
            // InternalGame.g:1762:2: ( rule__Lieu__NameAssignment_2 )
            {
             before(grammarAccess.getLieuAccess().getNameAssignment_2()); 
            // InternalGame.g:1763:2: ( rule__Lieu__NameAssignment_2 )
            // InternalGame.g:1763:3: rule__Lieu__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__2__Impl"


    // $ANTLR start "rule__Lieu__Group__3"
    // InternalGame.g:1771:1: rule__Lieu__Group__3 : rule__Lieu__Group__3__Impl rule__Lieu__Group__4 ;
    public final void rule__Lieu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1775:1: ( rule__Lieu__Group__3__Impl rule__Lieu__Group__4 )
            // InternalGame.g:1776:2: rule__Lieu__Group__3__Impl rule__Lieu__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Lieu__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__3"


    // $ANTLR start "rule__Lieu__Group__3__Impl"
    // InternalGame.g:1783:1: rule__Lieu__Group__3__Impl : ( '{' ) ;
    public final void rule__Lieu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1787:1: ( ( '{' ) )
            // InternalGame.g:1788:1: ( '{' )
            {
            // InternalGame.g:1788:1: ( '{' )
            // InternalGame.g:1789:2: '{'
            {
             before(grammarAccess.getLieuAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__3__Impl"


    // $ANTLR start "rule__Lieu__Group__4"
    // InternalGame.g:1798:1: rule__Lieu__Group__4 : rule__Lieu__Group__4__Impl rule__Lieu__Group__5 ;
    public final void rule__Lieu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1802:1: ( rule__Lieu__Group__4__Impl rule__Lieu__Group__5 )
            // InternalGame.g:1803:2: rule__Lieu__Group__4__Impl rule__Lieu__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Lieu__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__4"


    // $ANTLR start "rule__Lieu__Group__4__Impl"
    // InternalGame.g:1810:1: rule__Lieu__Group__4__Impl : ( 'nature' ) ;
    public final void rule__Lieu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1814:1: ( ( 'nature' ) )
            // InternalGame.g:1815:1: ( 'nature' )
            {
            // InternalGame.g:1815:1: ( 'nature' )
            // InternalGame.g:1816:2: 'nature'
            {
             before(grammarAccess.getLieuAccess().getNatureKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getNatureKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__4__Impl"


    // $ANTLR start "rule__Lieu__Group__5"
    // InternalGame.g:1825:1: rule__Lieu__Group__5 : rule__Lieu__Group__5__Impl rule__Lieu__Group__6 ;
    public final void rule__Lieu__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1829:1: ( rule__Lieu__Group__5__Impl rule__Lieu__Group__6 )
            // InternalGame.g:1830:2: rule__Lieu__Group__5__Impl rule__Lieu__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Lieu__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__5"


    // $ANTLR start "rule__Lieu__Group__5__Impl"
    // InternalGame.g:1837:1: rule__Lieu__Group__5__Impl : ( ( rule__Lieu__NatureAssignment_5 ) ) ;
    public final void rule__Lieu__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1841:1: ( ( ( rule__Lieu__NatureAssignment_5 ) ) )
            // InternalGame.g:1842:1: ( ( rule__Lieu__NatureAssignment_5 ) )
            {
            // InternalGame.g:1842:1: ( ( rule__Lieu__NatureAssignment_5 ) )
            // InternalGame.g:1843:2: ( rule__Lieu__NatureAssignment_5 )
            {
             before(grammarAccess.getLieuAccess().getNatureAssignment_5()); 
            // InternalGame.g:1844:2: ( rule__Lieu__NatureAssignment_5 )
            // InternalGame.g:1844:3: rule__Lieu__NatureAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__NatureAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getNatureAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__5__Impl"


    // $ANTLR start "rule__Lieu__Group__6"
    // InternalGame.g:1852:1: rule__Lieu__Group__6 : rule__Lieu__Group__6__Impl rule__Lieu__Group__7 ;
    public final void rule__Lieu__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1856:1: ( rule__Lieu__Group__6__Impl rule__Lieu__Group__7 )
            // InternalGame.g:1857:2: rule__Lieu__Group__6__Impl rule__Lieu__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__Lieu__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__6"


    // $ANTLR start "rule__Lieu__Group__6__Impl"
    // InternalGame.g:1864:1: rule__Lieu__Group__6__Impl : ( ( rule__Lieu__Group_6__0 )? ) ;
    public final void rule__Lieu__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1868:1: ( ( ( rule__Lieu__Group_6__0 )? ) )
            // InternalGame.g:1869:1: ( ( rule__Lieu__Group_6__0 )? )
            {
            // InternalGame.g:1869:1: ( ( rule__Lieu__Group_6__0 )? )
            // InternalGame.g:1870:2: ( rule__Lieu__Group_6__0 )?
            {
             before(grammarAccess.getLieuAccess().getGroup_6()); 
            // InternalGame.g:1871:2: ( rule__Lieu__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGame.g:1871:3: rule__Lieu__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lieu__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLieuAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__6__Impl"


    // $ANTLR start "rule__Lieu__Group__7"
    // InternalGame.g:1879:1: rule__Lieu__Group__7 : rule__Lieu__Group__7__Impl ;
    public final void rule__Lieu__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1883:1: ( rule__Lieu__Group__7__Impl )
            // InternalGame.g:1884:2: rule__Lieu__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__7"


    // $ANTLR start "rule__Lieu__Group__7__Impl"
    // InternalGame.g:1890:1: rule__Lieu__Group__7__Impl : ( '}' ) ;
    public final void rule__Lieu__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1894:1: ( ( '}' ) )
            // InternalGame.g:1895:1: ( '}' )
            {
            // InternalGame.g:1895:1: ( '}' )
            // InternalGame.g:1896:2: '}'
            {
             before(grammarAccess.getLieuAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__7__Impl"


    // $ANTLR start "rule__Lieu__Group_6__0"
    // InternalGame.g:1906:1: rule__Lieu__Group_6__0 : rule__Lieu__Group_6__0__Impl rule__Lieu__Group_6__1 ;
    public final void rule__Lieu__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1910:1: ( rule__Lieu__Group_6__0__Impl rule__Lieu__Group_6__1 )
            // InternalGame.g:1911:2: rule__Lieu__Group_6__0__Impl rule__Lieu__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Lieu__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_6__0"


    // $ANTLR start "rule__Lieu__Group_6__0__Impl"
    // InternalGame.g:1918:1: rule__Lieu__Group_6__0__Impl : ( 'personnes' ) ;
    public final void rule__Lieu__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1922:1: ( ( 'personnes' ) )
            // InternalGame.g:1923:1: ( 'personnes' )
            {
            // InternalGame.g:1923:1: ( 'personnes' )
            // InternalGame.g:1924:2: 'personnes'
            {
             before(grammarAccess.getLieuAccess().getPersonnesKeyword_6_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getPersonnesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_6__0__Impl"


    // $ANTLR start "rule__Lieu__Group_6__1"
    // InternalGame.g:1933:1: rule__Lieu__Group_6__1 : rule__Lieu__Group_6__1__Impl rule__Lieu__Group_6__2 ;
    public final void rule__Lieu__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1937:1: ( rule__Lieu__Group_6__1__Impl rule__Lieu__Group_6__2 )
            // InternalGame.g:1938:2: rule__Lieu__Group_6__1__Impl rule__Lieu__Group_6__2
            {
            pushFollow(FOLLOW_18);
            rule__Lieu__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_6__1"


    // $ANTLR start "rule__Lieu__Group_6__1__Impl"
    // InternalGame.g:1945:1: rule__Lieu__Group_6__1__Impl : ( ( rule__Lieu__PersonnesAssignment_6_1 ) ) ;
    public final void rule__Lieu__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1949:1: ( ( ( rule__Lieu__PersonnesAssignment_6_1 ) ) )
            // InternalGame.g:1950:1: ( ( rule__Lieu__PersonnesAssignment_6_1 ) )
            {
            // InternalGame.g:1950:1: ( ( rule__Lieu__PersonnesAssignment_6_1 ) )
            // InternalGame.g:1951:2: ( rule__Lieu__PersonnesAssignment_6_1 )
            {
             before(grammarAccess.getLieuAccess().getPersonnesAssignment_6_1()); 
            // InternalGame.g:1952:2: ( rule__Lieu__PersonnesAssignment_6_1 )
            // InternalGame.g:1952:3: rule__Lieu__PersonnesAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__PersonnesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getPersonnesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_6__1__Impl"


    // $ANTLR start "rule__Lieu__Group_6__2"
    // InternalGame.g:1960:1: rule__Lieu__Group_6__2 : rule__Lieu__Group_6__2__Impl ;
    public final void rule__Lieu__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1964:1: ( rule__Lieu__Group_6__2__Impl )
            // InternalGame.g:1965:2: rule__Lieu__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_6__2"


    // $ANTLR start "rule__Lieu__Group_6__2__Impl"
    // InternalGame.g:1971:1: rule__Lieu__Group_6__2__Impl : ( ( rule__Lieu__Group_6_2__0 )* ) ;
    public final void rule__Lieu__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1975:1: ( ( ( rule__Lieu__Group_6_2__0 )* ) )
            // InternalGame.g:1976:1: ( ( rule__Lieu__Group_6_2__0 )* )
            {
            // InternalGame.g:1976:1: ( ( rule__Lieu__Group_6_2__0 )* )
            // InternalGame.g:1977:2: ( rule__Lieu__Group_6_2__0 )*
            {
             before(grammarAccess.getLieuAccess().getGroup_6_2()); 
            // InternalGame.g:1978:2: ( rule__Lieu__Group_6_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGame.g:1978:3: rule__Lieu__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Lieu__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getLieuAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_6__2__Impl"


    // $ANTLR start "rule__Lieu__Group_6_2__0"
    // InternalGame.g:1987:1: rule__Lieu__Group_6_2__0 : rule__Lieu__Group_6_2__0__Impl rule__Lieu__Group_6_2__1 ;
    public final void rule__Lieu__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1991:1: ( rule__Lieu__Group_6_2__0__Impl rule__Lieu__Group_6_2__1 )
            // InternalGame.g:1992:2: rule__Lieu__Group_6_2__0__Impl rule__Lieu__Group_6_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Lieu__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_6_2__0"


    // $ANTLR start "rule__Lieu__Group_6_2__0__Impl"
    // InternalGame.g:1999:1: rule__Lieu__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__Lieu__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2003:1: ( ( ',' ) )
            // InternalGame.g:2004:1: ( ',' )
            {
            // InternalGame.g:2004:1: ( ',' )
            // InternalGame.g:2005:2: ','
            {
             before(grammarAccess.getLieuAccess().getCommaKeyword_6_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getCommaKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_6_2__0__Impl"


    // $ANTLR start "rule__Lieu__Group_6_2__1"
    // InternalGame.g:2014:1: rule__Lieu__Group_6_2__1 : rule__Lieu__Group_6_2__1__Impl ;
    public final void rule__Lieu__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2018:1: ( rule__Lieu__Group_6_2__1__Impl )
            // InternalGame.g:2019:2: rule__Lieu__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group_6_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_6_2__1"


    // $ANTLR start "rule__Lieu__Group_6_2__1__Impl"
    // InternalGame.g:2025:1: rule__Lieu__Group_6_2__1__Impl : ( ( rule__Lieu__PersonnesAssignment_6_2_1 ) ) ;
    public final void rule__Lieu__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2029:1: ( ( ( rule__Lieu__PersonnesAssignment_6_2_1 ) ) )
            // InternalGame.g:2030:1: ( ( rule__Lieu__PersonnesAssignment_6_2_1 ) )
            {
            // InternalGame.g:2030:1: ( ( rule__Lieu__PersonnesAssignment_6_2_1 ) )
            // InternalGame.g:2031:2: ( rule__Lieu__PersonnesAssignment_6_2_1 )
            {
             before(grammarAccess.getLieuAccess().getPersonnesAssignment_6_2_1()); 
            // InternalGame.g:2032:2: ( rule__Lieu__PersonnesAssignment_6_2_1 )
            // InternalGame.g:2032:3: rule__Lieu__PersonnesAssignment_6_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__PersonnesAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getPersonnesAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_6_2__1__Impl"


    // $ANTLR start "rule__Chemin__Group__0"
    // InternalGame.g:2041:1: rule__Chemin__Group__0 : rule__Chemin__Group__0__Impl rule__Chemin__Group__1 ;
    public final void rule__Chemin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2045:1: ( rule__Chemin__Group__0__Impl rule__Chemin__Group__1 )
            // InternalGame.g:2046:2: rule__Chemin__Group__0__Impl rule__Chemin__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Chemin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__0"


    // $ANTLR start "rule__Chemin__Group__0__Impl"
    // InternalGame.g:2053:1: rule__Chemin__Group__0__Impl : ( () ) ;
    public final void rule__Chemin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2057:1: ( ( () ) )
            // InternalGame.g:2058:1: ( () )
            {
            // InternalGame.g:2058:1: ( () )
            // InternalGame.g:2059:2: ()
            {
             before(grammarAccess.getCheminAccess().getCheminAction_0()); 
            // InternalGame.g:2060:2: ()
            // InternalGame.g:2060:3: 
            {
            }

             after(grammarAccess.getCheminAccess().getCheminAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__0__Impl"


    // $ANTLR start "rule__Chemin__Group__1"
    // InternalGame.g:2068:1: rule__Chemin__Group__1 : rule__Chemin__Group__1__Impl rule__Chemin__Group__2 ;
    public final void rule__Chemin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2072:1: ( rule__Chemin__Group__1__Impl rule__Chemin__Group__2 )
            // InternalGame.g:2073:2: rule__Chemin__Group__1__Impl rule__Chemin__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Chemin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__1"


    // $ANTLR start "rule__Chemin__Group__1__Impl"
    // InternalGame.g:2080:1: rule__Chemin__Group__1__Impl : ( ( rule__Chemin__ObligatoireAssignment_1 )? ) ;
    public final void rule__Chemin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2084:1: ( ( ( rule__Chemin__ObligatoireAssignment_1 )? ) )
            // InternalGame.g:2085:1: ( ( rule__Chemin__ObligatoireAssignment_1 )? )
            {
            // InternalGame.g:2085:1: ( ( rule__Chemin__ObligatoireAssignment_1 )? )
            // InternalGame.g:2086:2: ( rule__Chemin__ObligatoireAssignment_1 )?
            {
             before(grammarAccess.getCheminAccess().getObligatoireAssignment_1()); 
            // InternalGame.g:2087:2: ( rule__Chemin__ObligatoireAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==61) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGame.g:2087:3: rule__Chemin__ObligatoireAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Chemin__ObligatoireAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheminAccess().getObligatoireAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__1__Impl"


    // $ANTLR start "rule__Chemin__Group__2"
    // InternalGame.g:2095:1: rule__Chemin__Group__2 : rule__Chemin__Group__2__Impl rule__Chemin__Group__3 ;
    public final void rule__Chemin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2099:1: ( rule__Chemin__Group__2__Impl rule__Chemin__Group__3 )
            // InternalGame.g:2100:2: rule__Chemin__Group__2__Impl rule__Chemin__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Chemin__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__2"


    // $ANTLR start "rule__Chemin__Group__2__Impl"
    // InternalGame.g:2107:1: rule__Chemin__Group__2__Impl : ( 'Chemin' ) ;
    public final void rule__Chemin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2111:1: ( ( 'Chemin' ) )
            // InternalGame.g:2112:1: ( 'Chemin' )
            {
            // InternalGame.g:2112:1: ( 'Chemin' )
            // InternalGame.g:2113:2: 'Chemin'
            {
             before(grammarAccess.getCheminAccess().getCheminKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getCheminKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__2__Impl"


    // $ANTLR start "rule__Chemin__Group__3"
    // InternalGame.g:2122:1: rule__Chemin__Group__3 : rule__Chemin__Group__3__Impl rule__Chemin__Group__4 ;
    public final void rule__Chemin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2126:1: ( rule__Chemin__Group__3__Impl rule__Chemin__Group__4 )
            // InternalGame.g:2127:2: rule__Chemin__Group__3__Impl rule__Chemin__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Chemin__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__3"


    // $ANTLR start "rule__Chemin__Group__3__Impl"
    // InternalGame.g:2134:1: rule__Chemin__Group__3__Impl : ( ( rule__Chemin__NameAssignment_3 ) ) ;
    public final void rule__Chemin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2138:1: ( ( ( rule__Chemin__NameAssignment_3 ) ) )
            // InternalGame.g:2139:1: ( ( rule__Chemin__NameAssignment_3 ) )
            {
            // InternalGame.g:2139:1: ( ( rule__Chemin__NameAssignment_3 ) )
            // InternalGame.g:2140:2: ( rule__Chemin__NameAssignment_3 )
            {
             before(grammarAccess.getCheminAccess().getNameAssignment_3()); 
            // InternalGame.g:2141:2: ( rule__Chemin__NameAssignment_3 )
            // InternalGame.g:2141:3: rule__Chemin__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__3__Impl"


    // $ANTLR start "rule__Chemin__Group__4"
    // InternalGame.g:2149:1: rule__Chemin__Group__4 : rule__Chemin__Group__4__Impl rule__Chemin__Group__5 ;
    public final void rule__Chemin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2153:1: ( rule__Chemin__Group__4__Impl rule__Chemin__Group__5 )
            // InternalGame.g:2154:2: rule__Chemin__Group__4__Impl rule__Chemin__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Chemin__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__4"


    // $ANTLR start "rule__Chemin__Group__4__Impl"
    // InternalGame.g:2161:1: rule__Chemin__Group__4__Impl : ( '{' ) ;
    public final void rule__Chemin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2165:1: ( ( '{' ) )
            // InternalGame.g:2166:1: ( '{' )
            {
            // InternalGame.g:2166:1: ( '{' )
            // InternalGame.g:2167:2: '{'
            {
             before(grammarAccess.getCheminAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__4__Impl"


    // $ANTLR start "rule__Chemin__Group__5"
    // InternalGame.g:2176:1: rule__Chemin__Group__5 : rule__Chemin__Group__5__Impl rule__Chemin__Group__6 ;
    public final void rule__Chemin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2180:1: ( rule__Chemin__Group__5__Impl rule__Chemin__Group__6 )
            // InternalGame.g:2181:2: rule__Chemin__Group__5__Impl rule__Chemin__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Chemin__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__5"


    // $ANTLR start "rule__Chemin__Group__5__Impl"
    // InternalGame.g:2188:1: rule__Chemin__Group__5__Impl : ( 'pred' ) ;
    public final void rule__Chemin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2192:1: ( ( 'pred' ) )
            // InternalGame.g:2193:1: ( 'pred' )
            {
            // InternalGame.g:2193:1: ( 'pred' )
            // InternalGame.g:2194:2: 'pred'
            {
             before(grammarAccess.getCheminAccess().getPredKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getPredKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__5__Impl"


    // $ANTLR start "rule__Chemin__Group__6"
    // InternalGame.g:2203:1: rule__Chemin__Group__6 : rule__Chemin__Group__6__Impl rule__Chemin__Group__7 ;
    public final void rule__Chemin__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2207:1: ( rule__Chemin__Group__6__Impl rule__Chemin__Group__7 )
            // InternalGame.g:2208:2: rule__Chemin__Group__6__Impl rule__Chemin__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__Chemin__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__6"


    // $ANTLR start "rule__Chemin__Group__6__Impl"
    // InternalGame.g:2215:1: rule__Chemin__Group__6__Impl : ( ( rule__Chemin__PredAssignment_6 ) ) ;
    public final void rule__Chemin__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2219:1: ( ( ( rule__Chemin__PredAssignment_6 ) ) )
            // InternalGame.g:2220:1: ( ( rule__Chemin__PredAssignment_6 ) )
            {
            // InternalGame.g:2220:1: ( ( rule__Chemin__PredAssignment_6 ) )
            // InternalGame.g:2221:2: ( rule__Chemin__PredAssignment_6 )
            {
             before(grammarAccess.getCheminAccess().getPredAssignment_6()); 
            // InternalGame.g:2222:2: ( rule__Chemin__PredAssignment_6 )
            // InternalGame.g:2222:3: rule__Chemin__PredAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__PredAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getPredAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__6__Impl"


    // $ANTLR start "rule__Chemin__Group__7"
    // InternalGame.g:2230:1: rule__Chemin__Group__7 : rule__Chemin__Group__7__Impl rule__Chemin__Group__8 ;
    public final void rule__Chemin__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2234:1: ( rule__Chemin__Group__7__Impl rule__Chemin__Group__8 )
            // InternalGame.g:2235:2: rule__Chemin__Group__7__Impl rule__Chemin__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Chemin__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__7"


    // $ANTLR start "rule__Chemin__Group__7__Impl"
    // InternalGame.g:2242:1: rule__Chemin__Group__7__Impl : ( 'succ' ) ;
    public final void rule__Chemin__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2246:1: ( ( 'succ' ) )
            // InternalGame.g:2247:1: ( 'succ' )
            {
            // InternalGame.g:2247:1: ( 'succ' )
            // InternalGame.g:2248:2: 'succ'
            {
             before(grammarAccess.getCheminAccess().getSuccKeyword_7()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getSuccKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__7__Impl"


    // $ANTLR start "rule__Chemin__Group__8"
    // InternalGame.g:2257:1: rule__Chemin__Group__8 : rule__Chemin__Group__8__Impl rule__Chemin__Group__9 ;
    public final void rule__Chemin__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2261:1: ( rule__Chemin__Group__8__Impl rule__Chemin__Group__9 )
            // InternalGame.g:2262:2: rule__Chemin__Group__8__Impl rule__Chemin__Group__9
            {
            pushFollow(FOLLOW_26);
            rule__Chemin__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__8"


    // $ANTLR start "rule__Chemin__Group__8__Impl"
    // InternalGame.g:2269:1: rule__Chemin__Group__8__Impl : ( ( rule__Chemin__SuccAssignment_8 ) ) ;
    public final void rule__Chemin__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2273:1: ( ( ( rule__Chemin__SuccAssignment_8 ) ) )
            // InternalGame.g:2274:1: ( ( rule__Chemin__SuccAssignment_8 ) )
            {
            // InternalGame.g:2274:1: ( ( rule__Chemin__SuccAssignment_8 ) )
            // InternalGame.g:2275:2: ( rule__Chemin__SuccAssignment_8 )
            {
             before(grammarAccess.getCheminAccess().getSuccAssignment_8()); 
            // InternalGame.g:2276:2: ( rule__Chemin__SuccAssignment_8 )
            // InternalGame.g:2276:3: rule__Chemin__SuccAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__SuccAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getSuccAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__8__Impl"


    // $ANTLR start "rule__Chemin__Group__9"
    // InternalGame.g:2284:1: rule__Chemin__Group__9 : rule__Chemin__Group__9__Impl rule__Chemin__Group__10 ;
    public final void rule__Chemin__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2288:1: ( rule__Chemin__Group__9__Impl rule__Chemin__Group__10 )
            // InternalGame.g:2289:2: rule__Chemin__Group__9__Impl rule__Chemin__Group__10
            {
            pushFollow(FOLLOW_26);
            rule__Chemin__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__9"


    // $ANTLR start "rule__Chemin__Group__9__Impl"
    // InternalGame.g:2296:1: rule__Chemin__Group__9__Impl : ( ( rule__Chemin__Group_9__0 )? ) ;
    public final void rule__Chemin__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2300:1: ( ( ( rule__Chemin__Group_9__0 )? ) )
            // InternalGame.g:2301:1: ( ( rule__Chemin__Group_9__0 )? )
            {
            // InternalGame.g:2301:1: ( ( rule__Chemin__Group_9__0 )? )
            // InternalGame.g:2302:2: ( rule__Chemin__Group_9__0 )?
            {
             before(grammarAccess.getCheminAccess().getGroup_9()); 
            // InternalGame.g:2303:2: ( rule__Chemin__Group_9__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGame.g:2303:3: rule__Chemin__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Chemin__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheminAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__9__Impl"


    // $ANTLR start "rule__Chemin__Group__10"
    // InternalGame.g:2311:1: rule__Chemin__Group__10 : rule__Chemin__Group__10__Impl rule__Chemin__Group__11 ;
    public final void rule__Chemin__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2315:1: ( rule__Chemin__Group__10__Impl rule__Chemin__Group__11 )
            // InternalGame.g:2316:2: rule__Chemin__Group__10__Impl rule__Chemin__Group__11
            {
            pushFollow(FOLLOW_26);
            rule__Chemin__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__10"


    // $ANTLR start "rule__Chemin__Group__10__Impl"
    // InternalGame.g:2323:1: rule__Chemin__Group__10__Impl : ( ( rule__Chemin__Group_10__0 )? ) ;
    public final void rule__Chemin__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2327:1: ( ( ( rule__Chemin__Group_10__0 )? ) )
            // InternalGame.g:2328:1: ( ( rule__Chemin__Group_10__0 )? )
            {
            // InternalGame.g:2328:1: ( ( rule__Chemin__Group_10__0 )? )
            // InternalGame.g:2329:2: ( rule__Chemin__Group_10__0 )?
            {
             before(grammarAccess.getCheminAccess().getGroup_10()); 
            // InternalGame.g:2330:2: ( rule__Chemin__Group_10__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGame.g:2330:3: rule__Chemin__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Chemin__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheminAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__10__Impl"


    // $ANTLR start "rule__Chemin__Group__11"
    // InternalGame.g:2338:1: rule__Chemin__Group__11 : rule__Chemin__Group__11__Impl ;
    public final void rule__Chemin__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2342:1: ( rule__Chemin__Group__11__Impl )
            // InternalGame.g:2343:2: rule__Chemin__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__11"


    // $ANTLR start "rule__Chemin__Group__11__Impl"
    // InternalGame.g:2349:1: rule__Chemin__Group__11__Impl : ( '}' ) ;
    public final void rule__Chemin__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2353:1: ( ( '}' ) )
            // InternalGame.g:2354:1: ( '}' )
            {
            // InternalGame.g:2354:1: ( '}' )
            // InternalGame.g:2355:2: '}'
            {
             before(grammarAccess.getCheminAccess().getRightCurlyBracketKeyword_11()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__11__Impl"


    // $ANTLR start "rule__Chemin__Group_9__0"
    // InternalGame.g:2365:1: rule__Chemin__Group_9__0 : rule__Chemin__Group_9__0__Impl rule__Chemin__Group_9__1 ;
    public final void rule__Chemin__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2369:1: ( rule__Chemin__Group_9__0__Impl rule__Chemin__Group_9__1 )
            // InternalGame.g:2370:2: rule__Chemin__Group_9__0__Impl rule__Chemin__Group_9__1
            {
            pushFollow(FOLLOW_8);
            rule__Chemin__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_9__0"


    // $ANTLR start "rule__Chemin__Group_9__0__Impl"
    // InternalGame.g:2377:1: rule__Chemin__Group_9__0__Impl : ( 'visible' ) ;
    public final void rule__Chemin__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2381:1: ( ( 'visible' ) )
            // InternalGame.g:2382:1: ( 'visible' )
            {
            // InternalGame.g:2382:1: ( 'visible' )
            // InternalGame.g:2383:2: 'visible'
            {
             before(grammarAccess.getCheminAccess().getVisibleKeyword_9_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getVisibleKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_9__0__Impl"


    // $ANTLR start "rule__Chemin__Group_9__1"
    // InternalGame.g:2392:1: rule__Chemin__Group_9__1 : rule__Chemin__Group_9__1__Impl rule__Chemin__Group_9__2 ;
    public final void rule__Chemin__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2396:1: ( rule__Chemin__Group_9__1__Impl rule__Chemin__Group_9__2 )
            // InternalGame.g:2397:2: rule__Chemin__Group_9__1__Impl rule__Chemin__Group_9__2
            {
            pushFollow(FOLLOW_18);
            rule__Chemin__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_9__1"


    // $ANTLR start "rule__Chemin__Group_9__1__Impl"
    // InternalGame.g:2404:1: rule__Chemin__Group_9__1__Impl : ( ( rule__Chemin__VisibleAssignment_9_1 ) ) ;
    public final void rule__Chemin__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2408:1: ( ( ( rule__Chemin__VisibleAssignment_9_1 ) ) )
            // InternalGame.g:2409:1: ( ( rule__Chemin__VisibleAssignment_9_1 ) )
            {
            // InternalGame.g:2409:1: ( ( rule__Chemin__VisibleAssignment_9_1 ) )
            // InternalGame.g:2410:2: ( rule__Chemin__VisibleAssignment_9_1 )
            {
             before(grammarAccess.getCheminAccess().getVisibleAssignment_9_1()); 
            // InternalGame.g:2411:2: ( rule__Chemin__VisibleAssignment_9_1 )
            // InternalGame.g:2411:3: rule__Chemin__VisibleAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__VisibleAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getVisibleAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_9__1__Impl"


    // $ANTLR start "rule__Chemin__Group_9__2"
    // InternalGame.g:2419:1: rule__Chemin__Group_9__2 : rule__Chemin__Group_9__2__Impl ;
    public final void rule__Chemin__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2423:1: ( rule__Chemin__Group_9__2__Impl )
            // InternalGame.g:2424:2: rule__Chemin__Group_9__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group_9__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_9__2"


    // $ANTLR start "rule__Chemin__Group_9__2__Impl"
    // InternalGame.g:2430:1: rule__Chemin__Group_9__2__Impl : ( ( rule__Chemin__Group_9_2__0 )* ) ;
    public final void rule__Chemin__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2434:1: ( ( ( rule__Chemin__Group_9_2__0 )* ) )
            // InternalGame.g:2435:1: ( ( rule__Chemin__Group_9_2__0 )* )
            {
            // InternalGame.g:2435:1: ( ( rule__Chemin__Group_9_2__0 )* )
            // InternalGame.g:2436:2: ( rule__Chemin__Group_9_2__0 )*
            {
             before(grammarAccess.getCheminAccess().getGroup_9_2()); 
            // InternalGame.g:2437:2: ( rule__Chemin__Group_9_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==17) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGame.g:2437:3: rule__Chemin__Group_9_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Chemin__Group_9_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getCheminAccess().getGroup_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_9__2__Impl"


    // $ANTLR start "rule__Chemin__Group_9_2__0"
    // InternalGame.g:2446:1: rule__Chemin__Group_9_2__0 : rule__Chemin__Group_9_2__0__Impl rule__Chemin__Group_9_2__1 ;
    public final void rule__Chemin__Group_9_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2450:1: ( rule__Chemin__Group_9_2__0__Impl rule__Chemin__Group_9_2__1 )
            // InternalGame.g:2451:2: rule__Chemin__Group_9_2__0__Impl rule__Chemin__Group_9_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Chemin__Group_9_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group_9_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_9_2__0"


    // $ANTLR start "rule__Chemin__Group_9_2__0__Impl"
    // InternalGame.g:2458:1: rule__Chemin__Group_9_2__0__Impl : ( ',' ) ;
    public final void rule__Chemin__Group_9_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2462:1: ( ( ',' ) )
            // InternalGame.g:2463:1: ( ',' )
            {
            // InternalGame.g:2463:1: ( ',' )
            // InternalGame.g:2464:2: ','
            {
             before(grammarAccess.getCheminAccess().getCommaKeyword_9_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getCommaKeyword_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_9_2__0__Impl"


    // $ANTLR start "rule__Chemin__Group_9_2__1"
    // InternalGame.g:2473:1: rule__Chemin__Group_9_2__1 : rule__Chemin__Group_9_2__1__Impl ;
    public final void rule__Chemin__Group_9_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2477:1: ( rule__Chemin__Group_9_2__1__Impl )
            // InternalGame.g:2478:2: rule__Chemin__Group_9_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group_9_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_9_2__1"


    // $ANTLR start "rule__Chemin__Group_9_2__1__Impl"
    // InternalGame.g:2484:1: rule__Chemin__Group_9_2__1__Impl : ( ( rule__Chemin__VisibleAssignment_9_2_1 ) ) ;
    public final void rule__Chemin__Group_9_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2488:1: ( ( ( rule__Chemin__VisibleAssignment_9_2_1 ) ) )
            // InternalGame.g:2489:1: ( ( rule__Chemin__VisibleAssignment_9_2_1 ) )
            {
            // InternalGame.g:2489:1: ( ( rule__Chemin__VisibleAssignment_9_2_1 ) )
            // InternalGame.g:2490:2: ( rule__Chemin__VisibleAssignment_9_2_1 )
            {
             before(grammarAccess.getCheminAccess().getVisibleAssignment_9_2_1()); 
            // InternalGame.g:2491:2: ( rule__Chemin__VisibleAssignment_9_2_1 )
            // InternalGame.g:2491:3: rule__Chemin__VisibleAssignment_9_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__VisibleAssignment_9_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getVisibleAssignment_9_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_9_2__1__Impl"


    // $ANTLR start "rule__Chemin__Group_10__0"
    // InternalGame.g:2500:1: rule__Chemin__Group_10__0 : rule__Chemin__Group_10__0__Impl rule__Chemin__Group_10__1 ;
    public final void rule__Chemin__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2504:1: ( rule__Chemin__Group_10__0__Impl rule__Chemin__Group_10__1 )
            // InternalGame.g:2505:2: rule__Chemin__Group_10__0__Impl rule__Chemin__Group_10__1
            {
            pushFollow(FOLLOW_8);
            rule__Chemin__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_10__0"


    // $ANTLR start "rule__Chemin__Group_10__0__Impl"
    // InternalGame.g:2512:1: rule__Chemin__Group_10__0__Impl : ( 'ouvert' ) ;
    public final void rule__Chemin__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2516:1: ( ( 'ouvert' ) )
            // InternalGame.g:2517:1: ( 'ouvert' )
            {
            // InternalGame.g:2517:1: ( 'ouvert' )
            // InternalGame.g:2518:2: 'ouvert'
            {
             before(grammarAccess.getCheminAccess().getOuvertKeyword_10_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getOuvertKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_10__0__Impl"


    // $ANTLR start "rule__Chemin__Group_10__1"
    // InternalGame.g:2527:1: rule__Chemin__Group_10__1 : rule__Chemin__Group_10__1__Impl rule__Chemin__Group_10__2 ;
    public final void rule__Chemin__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2531:1: ( rule__Chemin__Group_10__1__Impl rule__Chemin__Group_10__2 )
            // InternalGame.g:2532:2: rule__Chemin__Group_10__1__Impl rule__Chemin__Group_10__2
            {
            pushFollow(FOLLOW_18);
            rule__Chemin__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_10__1"


    // $ANTLR start "rule__Chemin__Group_10__1__Impl"
    // InternalGame.g:2539:1: rule__Chemin__Group_10__1__Impl : ( ( rule__Chemin__OuvertAssignment_10_1 ) ) ;
    public final void rule__Chemin__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2543:1: ( ( ( rule__Chemin__OuvertAssignment_10_1 ) ) )
            // InternalGame.g:2544:1: ( ( rule__Chemin__OuvertAssignment_10_1 ) )
            {
            // InternalGame.g:2544:1: ( ( rule__Chemin__OuvertAssignment_10_1 ) )
            // InternalGame.g:2545:2: ( rule__Chemin__OuvertAssignment_10_1 )
            {
             before(grammarAccess.getCheminAccess().getOuvertAssignment_10_1()); 
            // InternalGame.g:2546:2: ( rule__Chemin__OuvertAssignment_10_1 )
            // InternalGame.g:2546:3: rule__Chemin__OuvertAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__OuvertAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getOuvertAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_10__1__Impl"


    // $ANTLR start "rule__Chemin__Group_10__2"
    // InternalGame.g:2554:1: rule__Chemin__Group_10__2 : rule__Chemin__Group_10__2__Impl ;
    public final void rule__Chemin__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2558:1: ( rule__Chemin__Group_10__2__Impl )
            // InternalGame.g:2559:2: rule__Chemin__Group_10__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group_10__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_10__2"


    // $ANTLR start "rule__Chemin__Group_10__2__Impl"
    // InternalGame.g:2565:1: rule__Chemin__Group_10__2__Impl : ( ( rule__Chemin__Group_10_2__0 )* ) ;
    public final void rule__Chemin__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2569:1: ( ( ( rule__Chemin__Group_10_2__0 )* ) )
            // InternalGame.g:2570:1: ( ( rule__Chemin__Group_10_2__0 )* )
            {
            // InternalGame.g:2570:1: ( ( rule__Chemin__Group_10_2__0 )* )
            // InternalGame.g:2571:2: ( rule__Chemin__Group_10_2__0 )*
            {
             before(grammarAccess.getCheminAccess().getGroup_10_2()); 
            // InternalGame.g:2572:2: ( rule__Chemin__Group_10_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGame.g:2572:3: rule__Chemin__Group_10_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Chemin__Group_10_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getCheminAccess().getGroup_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_10__2__Impl"


    // $ANTLR start "rule__Chemin__Group_10_2__0"
    // InternalGame.g:2581:1: rule__Chemin__Group_10_2__0 : rule__Chemin__Group_10_2__0__Impl rule__Chemin__Group_10_2__1 ;
    public final void rule__Chemin__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2585:1: ( rule__Chemin__Group_10_2__0__Impl rule__Chemin__Group_10_2__1 )
            // InternalGame.g:2586:2: rule__Chemin__Group_10_2__0__Impl rule__Chemin__Group_10_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Chemin__Group_10_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group_10_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_10_2__0"


    // $ANTLR start "rule__Chemin__Group_10_2__0__Impl"
    // InternalGame.g:2593:1: rule__Chemin__Group_10_2__0__Impl : ( ',' ) ;
    public final void rule__Chemin__Group_10_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2597:1: ( ( ',' ) )
            // InternalGame.g:2598:1: ( ',' )
            {
            // InternalGame.g:2598:1: ( ',' )
            // InternalGame.g:2599:2: ','
            {
             before(grammarAccess.getCheminAccess().getCommaKeyword_10_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getCommaKeyword_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_10_2__0__Impl"


    // $ANTLR start "rule__Chemin__Group_10_2__1"
    // InternalGame.g:2608:1: rule__Chemin__Group_10_2__1 : rule__Chemin__Group_10_2__1__Impl ;
    public final void rule__Chemin__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2612:1: ( rule__Chemin__Group_10_2__1__Impl )
            // InternalGame.g:2613:2: rule__Chemin__Group_10_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group_10_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_10_2__1"


    // $ANTLR start "rule__Chemin__Group_10_2__1__Impl"
    // InternalGame.g:2619:1: rule__Chemin__Group_10_2__1__Impl : ( ( rule__Chemin__OuvertAssignment_10_2_1 ) ) ;
    public final void rule__Chemin__Group_10_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2623:1: ( ( ( rule__Chemin__OuvertAssignment_10_2_1 ) ) )
            // InternalGame.g:2624:1: ( ( rule__Chemin__OuvertAssignment_10_2_1 ) )
            {
            // InternalGame.g:2624:1: ( ( rule__Chemin__OuvertAssignment_10_2_1 ) )
            // InternalGame.g:2625:2: ( rule__Chemin__OuvertAssignment_10_2_1 )
            {
             before(grammarAccess.getCheminAccess().getOuvertAssignment_10_2_1()); 
            // InternalGame.g:2626:2: ( rule__Chemin__OuvertAssignment_10_2_1 )
            // InternalGame.g:2626:3: rule__Chemin__OuvertAssignment_10_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__OuvertAssignment_10_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getOuvertAssignment_10_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_10_2__1__Impl"


    // $ANTLR start "rule__Personne__Group__0"
    // InternalGame.g:2635:1: rule__Personne__Group__0 : rule__Personne__Group__0__Impl rule__Personne__Group__1 ;
    public final void rule__Personne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2639:1: ( rule__Personne__Group__0__Impl rule__Personne__Group__1 )
            // InternalGame.g:2640:2: rule__Personne__Group__0__Impl rule__Personne__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Personne__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__0"


    // $ANTLR start "rule__Personne__Group__0__Impl"
    // InternalGame.g:2647:1: rule__Personne__Group__0__Impl : ( ( rule__Personne__ObligatoireAssignment_0 )? ) ;
    public final void rule__Personne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2651:1: ( ( ( rule__Personne__ObligatoireAssignment_0 )? ) )
            // InternalGame.g:2652:1: ( ( rule__Personne__ObligatoireAssignment_0 )? )
            {
            // InternalGame.g:2652:1: ( ( rule__Personne__ObligatoireAssignment_0 )? )
            // InternalGame.g:2653:2: ( rule__Personne__ObligatoireAssignment_0 )?
            {
             before(grammarAccess.getPersonneAccess().getObligatoireAssignment_0()); 
            // InternalGame.g:2654:2: ( rule__Personne__ObligatoireAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==61) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGame.g:2654:3: rule__Personne__ObligatoireAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Personne__ObligatoireAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersonneAccess().getObligatoireAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__0__Impl"


    // $ANTLR start "rule__Personne__Group__1"
    // InternalGame.g:2662:1: rule__Personne__Group__1 : rule__Personne__Group__1__Impl rule__Personne__Group__2 ;
    public final void rule__Personne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2666:1: ( rule__Personne__Group__1__Impl rule__Personne__Group__2 )
            // InternalGame.g:2667:2: rule__Personne__Group__1__Impl rule__Personne__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Personne__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__1"


    // $ANTLR start "rule__Personne__Group__1__Impl"
    // InternalGame.g:2674:1: rule__Personne__Group__1__Impl : ( 'Personne' ) ;
    public final void rule__Personne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2678:1: ( ( 'Personne' ) )
            // InternalGame.g:2679:1: ( 'Personne' )
            {
            // InternalGame.g:2679:1: ( 'Personne' )
            // InternalGame.g:2680:2: 'Personne'
            {
             before(grammarAccess.getPersonneAccess().getPersonneKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getPersonneKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__1__Impl"


    // $ANTLR start "rule__Personne__Group__2"
    // InternalGame.g:2689:1: rule__Personne__Group__2 : rule__Personne__Group__2__Impl rule__Personne__Group__3 ;
    public final void rule__Personne__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2693:1: ( rule__Personne__Group__2__Impl rule__Personne__Group__3 )
            // InternalGame.g:2694:2: rule__Personne__Group__2__Impl rule__Personne__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Personne__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__2"


    // $ANTLR start "rule__Personne__Group__2__Impl"
    // InternalGame.g:2701:1: rule__Personne__Group__2__Impl : ( ( rule__Personne__NameAssignment_2 ) ) ;
    public final void rule__Personne__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2705:1: ( ( ( rule__Personne__NameAssignment_2 ) ) )
            // InternalGame.g:2706:1: ( ( rule__Personne__NameAssignment_2 ) )
            {
            // InternalGame.g:2706:1: ( ( rule__Personne__NameAssignment_2 ) )
            // InternalGame.g:2707:2: ( rule__Personne__NameAssignment_2 )
            {
             before(grammarAccess.getPersonneAccess().getNameAssignment_2()); 
            // InternalGame.g:2708:2: ( rule__Personne__NameAssignment_2 )
            // InternalGame.g:2708:3: rule__Personne__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Personne__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__2__Impl"


    // $ANTLR start "rule__Personne__Group__3"
    // InternalGame.g:2716:1: rule__Personne__Group__3 : rule__Personne__Group__3__Impl rule__Personne__Group__4 ;
    public final void rule__Personne__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2720:1: ( rule__Personne__Group__3__Impl rule__Personne__Group__4 )
            // InternalGame.g:2721:2: rule__Personne__Group__3__Impl rule__Personne__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Personne__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__3"


    // $ANTLR start "rule__Personne__Group__3__Impl"
    // InternalGame.g:2728:1: rule__Personne__Group__3__Impl : ( '{' ) ;
    public final void rule__Personne__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2732:1: ( ( '{' ) )
            // InternalGame.g:2733:1: ( '{' )
            {
            // InternalGame.g:2733:1: ( '{' )
            // InternalGame.g:2734:2: '{'
            {
             before(grammarAccess.getPersonneAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__3__Impl"


    // $ANTLR start "rule__Personne__Group__4"
    // InternalGame.g:2743:1: rule__Personne__Group__4 : rule__Personne__Group__4__Impl rule__Personne__Group__5 ;
    public final void rule__Personne__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2747:1: ( rule__Personne__Group__4__Impl rule__Personne__Group__5 )
            // InternalGame.g:2748:2: rule__Personne__Group__4__Impl rule__Personne__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Personne__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__4"


    // $ANTLR start "rule__Personne__Group__4__Impl"
    // InternalGame.g:2755:1: rule__Personne__Group__4__Impl : ( 'place' ) ;
    public final void rule__Personne__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2759:1: ( ( 'place' ) )
            // InternalGame.g:2760:1: ( 'place' )
            {
            // InternalGame.g:2760:1: ( 'place' )
            // InternalGame.g:2761:2: 'place'
            {
             before(grammarAccess.getPersonneAccess().getPlaceKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getPlaceKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__4__Impl"


    // $ANTLR start "rule__Personne__Group__5"
    // InternalGame.g:2770:1: rule__Personne__Group__5 : rule__Personne__Group__5__Impl rule__Personne__Group__6 ;
    public final void rule__Personne__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2774:1: ( rule__Personne__Group__5__Impl rule__Personne__Group__6 )
            // InternalGame.g:2775:2: rule__Personne__Group__5__Impl rule__Personne__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__Personne__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__5"


    // $ANTLR start "rule__Personne__Group__5__Impl"
    // InternalGame.g:2782:1: rule__Personne__Group__5__Impl : ( ( rule__Personne__PlaceAssignment_5 ) ) ;
    public final void rule__Personne__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2786:1: ( ( ( rule__Personne__PlaceAssignment_5 ) ) )
            // InternalGame.g:2787:1: ( ( rule__Personne__PlaceAssignment_5 ) )
            {
            // InternalGame.g:2787:1: ( ( rule__Personne__PlaceAssignment_5 ) )
            // InternalGame.g:2788:2: ( rule__Personne__PlaceAssignment_5 )
            {
             before(grammarAccess.getPersonneAccess().getPlaceAssignment_5()); 
            // InternalGame.g:2789:2: ( rule__Personne__PlaceAssignment_5 )
            // InternalGame.g:2789:3: rule__Personne__PlaceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Personne__PlaceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getPlaceAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__5__Impl"


    // $ANTLR start "rule__Personne__Group__6"
    // InternalGame.g:2797:1: rule__Personne__Group__6 : rule__Personne__Group__6__Impl rule__Personne__Group__7 ;
    public final void rule__Personne__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2801:1: ( rule__Personne__Group__6__Impl rule__Personne__Group__7 )
            // InternalGame.g:2802:2: rule__Personne__Group__6__Impl rule__Personne__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__Personne__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__6"


    // $ANTLR start "rule__Personne__Group__6__Impl"
    // InternalGame.g:2809:1: rule__Personne__Group__6__Impl : ( 'interactions' ) ;
    public final void rule__Personne__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2813:1: ( ( 'interactions' ) )
            // InternalGame.g:2814:1: ( 'interactions' )
            {
            // InternalGame.g:2814:1: ( 'interactions' )
            // InternalGame.g:2815:2: 'interactions'
            {
             before(grammarAccess.getPersonneAccess().getInteractionsKeyword_6()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getInteractionsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__6__Impl"


    // $ANTLR start "rule__Personne__Group__7"
    // InternalGame.g:2824:1: rule__Personne__Group__7 : rule__Personne__Group__7__Impl rule__Personne__Group__8 ;
    public final void rule__Personne__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2828:1: ( rule__Personne__Group__7__Impl rule__Personne__Group__8 )
            // InternalGame.g:2829:2: rule__Personne__Group__7__Impl rule__Personne__Group__8
            {
            pushFollow(FOLLOW_30);
            rule__Personne__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__7"


    // $ANTLR start "rule__Personne__Group__7__Impl"
    // InternalGame.g:2836:1: rule__Personne__Group__7__Impl : ( ( rule__Personne__InteractionsAssignment_7 ) ) ;
    public final void rule__Personne__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2840:1: ( ( ( rule__Personne__InteractionsAssignment_7 ) ) )
            // InternalGame.g:2841:1: ( ( rule__Personne__InteractionsAssignment_7 ) )
            {
            // InternalGame.g:2841:1: ( ( rule__Personne__InteractionsAssignment_7 ) )
            // InternalGame.g:2842:2: ( rule__Personne__InteractionsAssignment_7 )
            {
             before(grammarAccess.getPersonneAccess().getInteractionsAssignment_7()); 
            // InternalGame.g:2843:2: ( rule__Personne__InteractionsAssignment_7 )
            // InternalGame.g:2843:3: rule__Personne__InteractionsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Personne__InteractionsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getInteractionsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__7__Impl"


    // $ANTLR start "rule__Personne__Group__8"
    // InternalGame.g:2851:1: rule__Personne__Group__8 : rule__Personne__Group__8__Impl rule__Personne__Group__9 ;
    public final void rule__Personne__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2855:1: ( rule__Personne__Group__8__Impl rule__Personne__Group__9 )
            // InternalGame.g:2856:2: rule__Personne__Group__8__Impl rule__Personne__Group__9
            {
            pushFollow(FOLLOW_30);
            rule__Personne__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__8"


    // $ANTLR start "rule__Personne__Group__8__Impl"
    // InternalGame.g:2863:1: rule__Personne__Group__8__Impl : ( ( rule__Personne__Group_8__0 )* ) ;
    public final void rule__Personne__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2867:1: ( ( ( rule__Personne__Group_8__0 )* ) )
            // InternalGame.g:2868:1: ( ( rule__Personne__Group_8__0 )* )
            {
            // InternalGame.g:2868:1: ( ( rule__Personne__Group_8__0 )* )
            // InternalGame.g:2869:2: ( rule__Personne__Group_8__0 )*
            {
             before(grammarAccess.getPersonneAccess().getGroup_8()); 
            // InternalGame.g:2870:2: ( rule__Personne__Group_8__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==17) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGame.g:2870:3: rule__Personne__Group_8__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Personne__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getPersonneAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__8__Impl"


    // $ANTLR start "rule__Personne__Group__9"
    // InternalGame.g:2878:1: rule__Personne__Group__9 : rule__Personne__Group__9__Impl rule__Personne__Group__10 ;
    public final void rule__Personne__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2882:1: ( rule__Personne__Group__9__Impl rule__Personne__Group__10 )
            // InternalGame.g:2883:2: rule__Personne__Group__9__Impl rule__Personne__Group__10
            {
            pushFollow(FOLLOW_30);
            rule__Personne__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__9"


    // $ANTLR start "rule__Personne__Group__9__Impl"
    // InternalGame.g:2890:1: rule__Personne__Group__9__Impl : ( ( rule__Personne__Group_9__0 )? ) ;
    public final void rule__Personne__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2894:1: ( ( ( rule__Personne__Group_9__0 )? ) )
            // InternalGame.g:2895:1: ( ( rule__Personne__Group_9__0 )? )
            {
            // InternalGame.g:2895:1: ( ( rule__Personne__Group_9__0 )? )
            // InternalGame.g:2896:2: ( rule__Personne__Group_9__0 )?
            {
             before(grammarAccess.getPersonneAccess().getGroup_9()); 
            // InternalGame.g:2897:2: ( rule__Personne__Group_9__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGame.g:2897:3: rule__Personne__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Personne__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersonneAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__9__Impl"


    // $ANTLR start "rule__Personne__Group__10"
    // InternalGame.g:2905:1: rule__Personne__Group__10 : rule__Personne__Group__10__Impl rule__Personne__Group__11 ;
    public final void rule__Personne__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2909:1: ( rule__Personne__Group__10__Impl rule__Personne__Group__11 )
            // InternalGame.g:2910:2: rule__Personne__Group__10__Impl rule__Personne__Group__11
            {
            pushFollow(FOLLOW_30);
            rule__Personne__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__10"


    // $ANTLR start "rule__Personne__Group__10__Impl"
    // InternalGame.g:2917:1: rule__Personne__Group__10__Impl : ( ( rule__Personne__Group_10__0 )? ) ;
    public final void rule__Personne__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2921:1: ( ( ( rule__Personne__Group_10__0 )? ) )
            // InternalGame.g:2922:1: ( ( rule__Personne__Group_10__0 )? )
            {
            // InternalGame.g:2922:1: ( ( rule__Personne__Group_10__0 )? )
            // InternalGame.g:2923:2: ( rule__Personne__Group_10__0 )?
            {
             before(grammarAccess.getPersonneAccess().getGroup_10()); 
            // InternalGame.g:2924:2: ( rule__Personne__Group_10__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGame.g:2924:3: rule__Personne__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Personne__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersonneAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__10__Impl"


    // $ANTLR start "rule__Personne__Group__11"
    // InternalGame.g:2932:1: rule__Personne__Group__11 : rule__Personne__Group__11__Impl ;
    public final void rule__Personne__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2936:1: ( rule__Personne__Group__11__Impl )
            // InternalGame.g:2937:2: rule__Personne__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Personne__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__11"


    // $ANTLR start "rule__Personne__Group__11__Impl"
    // InternalGame.g:2943:1: rule__Personne__Group__11__Impl : ( '}' ) ;
    public final void rule__Personne__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2947:1: ( ( '}' ) )
            // InternalGame.g:2948:1: ( '}' )
            {
            // InternalGame.g:2948:1: ( '}' )
            // InternalGame.g:2949:2: '}'
            {
             before(grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_11()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__11__Impl"


    // $ANTLR start "rule__Personne__Group_8__0"
    // InternalGame.g:2959:1: rule__Personne__Group_8__0 : rule__Personne__Group_8__0__Impl rule__Personne__Group_8__1 ;
    public final void rule__Personne__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2963:1: ( rule__Personne__Group_8__0__Impl rule__Personne__Group_8__1 )
            // InternalGame.g:2964:2: rule__Personne__Group_8__0__Impl rule__Personne__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__Personne__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_8__0"


    // $ANTLR start "rule__Personne__Group_8__0__Impl"
    // InternalGame.g:2971:1: rule__Personne__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Personne__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2975:1: ( ( ',' ) )
            // InternalGame.g:2976:1: ( ',' )
            {
            // InternalGame.g:2976:1: ( ',' )
            // InternalGame.g:2977:2: ','
            {
             before(grammarAccess.getPersonneAccess().getCommaKeyword_8_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_8__0__Impl"


    // $ANTLR start "rule__Personne__Group_8__1"
    // InternalGame.g:2986:1: rule__Personne__Group_8__1 : rule__Personne__Group_8__1__Impl ;
    public final void rule__Personne__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2990:1: ( rule__Personne__Group_8__1__Impl )
            // InternalGame.g:2991:2: rule__Personne__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Personne__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_8__1"


    // $ANTLR start "rule__Personne__Group_8__1__Impl"
    // InternalGame.g:2997:1: rule__Personne__Group_8__1__Impl : ( ( rule__Personne__InteractionsAssignment_8_1 ) ) ;
    public final void rule__Personne__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3001:1: ( ( ( rule__Personne__InteractionsAssignment_8_1 ) ) )
            // InternalGame.g:3002:1: ( ( rule__Personne__InteractionsAssignment_8_1 ) )
            {
            // InternalGame.g:3002:1: ( ( rule__Personne__InteractionsAssignment_8_1 ) )
            // InternalGame.g:3003:2: ( rule__Personne__InteractionsAssignment_8_1 )
            {
             before(grammarAccess.getPersonneAccess().getInteractionsAssignment_8_1()); 
            // InternalGame.g:3004:2: ( rule__Personne__InteractionsAssignment_8_1 )
            // InternalGame.g:3004:3: rule__Personne__InteractionsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Personne__InteractionsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getInteractionsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_8__1__Impl"


    // $ANTLR start "rule__Personne__Group_9__0"
    // InternalGame.g:3013:1: rule__Personne__Group_9__0 : rule__Personne__Group_9__0__Impl rule__Personne__Group_9__1 ;
    public final void rule__Personne__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3017:1: ( rule__Personne__Group_9__0__Impl rule__Personne__Group_9__1 )
            // InternalGame.g:3018:2: rule__Personne__Group_9__0__Impl rule__Personne__Group_9__1
            {
            pushFollow(FOLLOW_31);
            rule__Personne__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_9__0"


    // $ANTLR start "rule__Personne__Group_9__0__Impl"
    // InternalGame.g:3025:1: rule__Personne__Group_9__0__Impl : ( 'visible' ) ;
    public final void rule__Personne__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3029:1: ( ( 'visible' ) )
            // InternalGame.g:3030:1: ( 'visible' )
            {
            // InternalGame.g:3030:1: ( 'visible' )
            // InternalGame.g:3031:2: 'visible'
            {
             before(grammarAccess.getPersonneAccess().getVisibleKeyword_9_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getVisibleKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_9__0__Impl"


    // $ANTLR start "rule__Personne__Group_9__1"
    // InternalGame.g:3040:1: rule__Personne__Group_9__1 : rule__Personne__Group_9__1__Impl rule__Personne__Group_9__2 ;
    public final void rule__Personne__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3044:1: ( rule__Personne__Group_9__1__Impl rule__Personne__Group_9__2 )
            // InternalGame.g:3045:2: rule__Personne__Group_9__1__Impl rule__Personne__Group_9__2
            {
            pushFollow(FOLLOW_18);
            rule__Personne__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_9__1"


    // $ANTLR start "rule__Personne__Group_9__1__Impl"
    // InternalGame.g:3052:1: rule__Personne__Group_9__1__Impl : ( ( rule__Personne__VisibleAssignment_9_1 ) ) ;
    public final void rule__Personne__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3056:1: ( ( ( rule__Personne__VisibleAssignment_9_1 ) ) )
            // InternalGame.g:3057:1: ( ( rule__Personne__VisibleAssignment_9_1 ) )
            {
            // InternalGame.g:3057:1: ( ( rule__Personne__VisibleAssignment_9_1 ) )
            // InternalGame.g:3058:2: ( rule__Personne__VisibleAssignment_9_1 )
            {
             before(grammarAccess.getPersonneAccess().getVisibleAssignment_9_1()); 
            // InternalGame.g:3059:2: ( rule__Personne__VisibleAssignment_9_1 )
            // InternalGame.g:3059:3: rule__Personne__VisibleAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Personne__VisibleAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getVisibleAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_9__1__Impl"


    // $ANTLR start "rule__Personne__Group_9__2"
    // InternalGame.g:3067:1: rule__Personne__Group_9__2 : rule__Personne__Group_9__2__Impl ;
    public final void rule__Personne__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3071:1: ( rule__Personne__Group_9__2__Impl )
            // InternalGame.g:3072:2: rule__Personne__Group_9__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Personne__Group_9__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_9__2"


    // $ANTLR start "rule__Personne__Group_9__2__Impl"
    // InternalGame.g:3078:1: rule__Personne__Group_9__2__Impl : ( ( rule__Personne__Group_9_2__0 )* ) ;
    public final void rule__Personne__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3082:1: ( ( ( rule__Personne__Group_9_2__0 )* ) )
            // InternalGame.g:3083:1: ( ( rule__Personne__Group_9_2__0 )* )
            {
            // InternalGame.g:3083:1: ( ( rule__Personne__Group_9_2__0 )* )
            // InternalGame.g:3084:2: ( rule__Personne__Group_9_2__0 )*
            {
             before(grammarAccess.getPersonneAccess().getGroup_9_2()); 
            // InternalGame.g:3085:2: ( rule__Personne__Group_9_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==17) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalGame.g:3085:3: rule__Personne__Group_9_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Personne__Group_9_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getPersonneAccess().getGroup_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_9__2__Impl"


    // $ANTLR start "rule__Personne__Group_9_2__0"
    // InternalGame.g:3094:1: rule__Personne__Group_9_2__0 : rule__Personne__Group_9_2__0__Impl rule__Personne__Group_9_2__1 ;
    public final void rule__Personne__Group_9_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3098:1: ( rule__Personne__Group_9_2__0__Impl rule__Personne__Group_9_2__1 )
            // InternalGame.g:3099:2: rule__Personne__Group_9_2__0__Impl rule__Personne__Group_9_2__1
            {
            pushFollow(FOLLOW_31);
            rule__Personne__Group_9_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group_9_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_9_2__0"


    // $ANTLR start "rule__Personne__Group_9_2__0__Impl"
    // InternalGame.g:3106:1: rule__Personne__Group_9_2__0__Impl : ( ',' ) ;
    public final void rule__Personne__Group_9_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3110:1: ( ( ',' ) )
            // InternalGame.g:3111:1: ( ',' )
            {
            // InternalGame.g:3111:1: ( ',' )
            // InternalGame.g:3112:2: ','
            {
             before(grammarAccess.getPersonneAccess().getCommaKeyword_9_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getCommaKeyword_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_9_2__0__Impl"


    // $ANTLR start "rule__Personne__Group_9_2__1"
    // InternalGame.g:3121:1: rule__Personne__Group_9_2__1 : rule__Personne__Group_9_2__1__Impl ;
    public final void rule__Personne__Group_9_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3125:1: ( rule__Personne__Group_9_2__1__Impl )
            // InternalGame.g:3126:2: rule__Personne__Group_9_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Personne__Group_9_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_9_2__1"


    // $ANTLR start "rule__Personne__Group_9_2__1__Impl"
    // InternalGame.g:3132:1: rule__Personne__Group_9_2__1__Impl : ( ( rule__Personne__VisibleAssignment_9_2_1 ) ) ;
    public final void rule__Personne__Group_9_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3136:1: ( ( ( rule__Personne__VisibleAssignment_9_2_1 ) ) )
            // InternalGame.g:3137:1: ( ( rule__Personne__VisibleAssignment_9_2_1 ) )
            {
            // InternalGame.g:3137:1: ( ( rule__Personne__VisibleAssignment_9_2_1 ) )
            // InternalGame.g:3138:2: ( rule__Personne__VisibleAssignment_9_2_1 )
            {
             before(grammarAccess.getPersonneAccess().getVisibleAssignment_9_2_1()); 
            // InternalGame.g:3139:2: ( rule__Personne__VisibleAssignment_9_2_1 )
            // InternalGame.g:3139:3: rule__Personne__VisibleAssignment_9_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Personne__VisibleAssignment_9_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getVisibleAssignment_9_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_9_2__1__Impl"


    // $ANTLR start "rule__Personne__Group_10__0"
    // InternalGame.g:3148:1: rule__Personne__Group_10__0 : rule__Personne__Group_10__0__Impl rule__Personne__Group_10__1 ;
    public final void rule__Personne__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3152:1: ( rule__Personne__Group_10__0__Impl rule__Personne__Group_10__1 )
            // InternalGame.g:3153:2: rule__Personne__Group_10__0__Impl rule__Personne__Group_10__1
            {
            pushFollow(FOLLOW_31);
            rule__Personne__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_10__0"


    // $ANTLR start "rule__Personne__Group_10__0__Impl"
    // InternalGame.g:3160:1: rule__Personne__Group_10__0__Impl : ( 'active' ) ;
    public final void rule__Personne__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3164:1: ( ( 'active' ) )
            // InternalGame.g:3165:1: ( 'active' )
            {
            // InternalGame.g:3165:1: ( 'active' )
            // InternalGame.g:3166:2: 'active'
            {
             before(grammarAccess.getPersonneAccess().getActiveKeyword_10_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getActiveKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_10__0__Impl"


    // $ANTLR start "rule__Personne__Group_10__1"
    // InternalGame.g:3175:1: rule__Personne__Group_10__1 : rule__Personne__Group_10__1__Impl rule__Personne__Group_10__2 ;
    public final void rule__Personne__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3179:1: ( rule__Personne__Group_10__1__Impl rule__Personne__Group_10__2 )
            // InternalGame.g:3180:2: rule__Personne__Group_10__1__Impl rule__Personne__Group_10__2
            {
            pushFollow(FOLLOW_18);
            rule__Personne__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_10__1"


    // $ANTLR start "rule__Personne__Group_10__1__Impl"
    // InternalGame.g:3187:1: rule__Personne__Group_10__1__Impl : ( ( rule__Personne__ActiveAssignment_10_1 ) ) ;
    public final void rule__Personne__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3191:1: ( ( ( rule__Personne__ActiveAssignment_10_1 ) ) )
            // InternalGame.g:3192:1: ( ( rule__Personne__ActiveAssignment_10_1 ) )
            {
            // InternalGame.g:3192:1: ( ( rule__Personne__ActiveAssignment_10_1 ) )
            // InternalGame.g:3193:2: ( rule__Personne__ActiveAssignment_10_1 )
            {
             before(grammarAccess.getPersonneAccess().getActiveAssignment_10_1()); 
            // InternalGame.g:3194:2: ( rule__Personne__ActiveAssignment_10_1 )
            // InternalGame.g:3194:3: rule__Personne__ActiveAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Personne__ActiveAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getActiveAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_10__1__Impl"


    // $ANTLR start "rule__Personne__Group_10__2"
    // InternalGame.g:3202:1: rule__Personne__Group_10__2 : rule__Personne__Group_10__2__Impl ;
    public final void rule__Personne__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3206:1: ( rule__Personne__Group_10__2__Impl )
            // InternalGame.g:3207:2: rule__Personne__Group_10__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Personne__Group_10__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_10__2"


    // $ANTLR start "rule__Personne__Group_10__2__Impl"
    // InternalGame.g:3213:1: rule__Personne__Group_10__2__Impl : ( ( rule__Personne__Group_10_2__0 )* ) ;
    public final void rule__Personne__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3217:1: ( ( ( rule__Personne__Group_10_2__0 )* ) )
            // InternalGame.g:3218:1: ( ( rule__Personne__Group_10_2__0 )* )
            {
            // InternalGame.g:3218:1: ( ( rule__Personne__Group_10_2__0 )* )
            // InternalGame.g:3219:2: ( rule__Personne__Group_10_2__0 )*
            {
             before(grammarAccess.getPersonneAccess().getGroup_10_2()); 
            // InternalGame.g:3220:2: ( rule__Personne__Group_10_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==17) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGame.g:3220:3: rule__Personne__Group_10_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Personne__Group_10_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getPersonneAccess().getGroup_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_10__2__Impl"


    // $ANTLR start "rule__Personne__Group_10_2__0"
    // InternalGame.g:3229:1: rule__Personne__Group_10_2__0 : rule__Personne__Group_10_2__0__Impl rule__Personne__Group_10_2__1 ;
    public final void rule__Personne__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3233:1: ( rule__Personne__Group_10_2__0__Impl rule__Personne__Group_10_2__1 )
            // InternalGame.g:3234:2: rule__Personne__Group_10_2__0__Impl rule__Personne__Group_10_2__1
            {
            pushFollow(FOLLOW_31);
            rule__Personne__Group_10_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group_10_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_10_2__0"


    // $ANTLR start "rule__Personne__Group_10_2__0__Impl"
    // InternalGame.g:3241:1: rule__Personne__Group_10_2__0__Impl : ( ',' ) ;
    public final void rule__Personne__Group_10_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3245:1: ( ( ',' ) )
            // InternalGame.g:3246:1: ( ',' )
            {
            // InternalGame.g:3246:1: ( ',' )
            // InternalGame.g:3247:2: ','
            {
             before(grammarAccess.getPersonneAccess().getCommaKeyword_10_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getCommaKeyword_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_10_2__0__Impl"


    // $ANTLR start "rule__Personne__Group_10_2__1"
    // InternalGame.g:3256:1: rule__Personne__Group_10_2__1 : rule__Personne__Group_10_2__1__Impl ;
    public final void rule__Personne__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3260:1: ( rule__Personne__Group_10_2__1__Impl )
            // InternalGame.g:3261:2: rule__Personne__Group_10_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Personne__Group_10_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_10_2__1"


    // $ANTLR start "rule__Personne__Group_10_2__1__Impl"
    // InternalGame.g:3267:1: rule__Personne__Group_10_2__1__Impl : ( ( rule__Personne__ActiveAssignment_10_2_1 ) ) ;
    public final void rule__Personne__Group_10_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3271:1: ( ( ( rule__Personne__ActiveAssignment_10_2_1 ) ) )
            // InternalGame.g:3272:1: ( ( rule__Personne__ActiveAssignment_10_2_1 ) )
            {
            // InternalGame.g:3272:1: ( ( rule__Personne__ActiveAssignment_10_2_1 ) )
            // InternalGame.g:3273:2: ( rule__Personne__ActiveAssignment_10_2_1 )
            {
             before(grammarAccess.getPersonneAccess().getActiveAssignment_10_2_1()); 
            // InternalGame.g:3274:2: ( rule__Personne__ActiveAssignment_10_2_1 )
            // InternalGame.g:3274:3: rule__Personne__ActiveAssignment_10_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Personne__ActiveAssignment_10_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getActiveAssignment_10_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_10_2__1__Impl"


    // $ANTLR start "rule__ConditionPersonne__Group__0"
    // InternalGame.g:3283:1: rule__ConditionPersonne__Group__0 : rule__ConditionPersonne__Group__0__Impl rule__ConditionPersonne__Group__1 ;
    public final void rule__ConditionPersonne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3287:1: ( rule__ConditionPersonne__Group__0__Impl rule__ConditionPersonne__Group__1 )
            // InternalGame.g:3288:2: rule__ConditionPersonne__Group__0__Impl rule__ConditionPersonne__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__ConditionPersonne__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionPersonne__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group__0"


    // $ANTLR start "rule__ConditionPersonne__Group__0__Impl"
    // InternalGame.g:3295:1: rule__ConditionPersonne__Group__0__Impl : ( () ) ;
    public final void rule__ConditionPersonne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3299:1: ( ( () ) )
            // InternalGame.g:3300:1: ( () )
            {
            // InternalGame.g:3300:1: ( () )
            // InternalGame.g:3301:2: ()
            {
             before(grammarAccess.getConditionPersonneAccess().getConditionPersonneAction_0()); 
            // InternalGame.g:3302:2: ()
            // InternalGame.g:3302:3: 
            {
            }

             after(grammarAccess.getConditionPersonneAccess().getConditionPersonneAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group__0__Impl"


    // $ANTLR start "rule__ConditionPersonne__Group__1"
    // InternalGame.g:3310:1: rule__ConditionPersonne__Group__1 : rule__ConditionPersonne__Group__1__Impl rule__ConditionPersonne__Group__2 ;
    public final void rule__ConditionPersonne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3314:1: ( rule__ConditionPersonne__Group__1__Impl rule__ConditionPersonne__Group__2 )
            // InternalGame.g:3315:2: rule__ConditionPersonne__Group__1__Impl rule__ConditionPersonne__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ConditionPersonne__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionPersonne__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group__1"


    // $ANTLR start "rule__ConditionPersonne__Group__1__Impl"
    // InternalGame.g:3322:1: rule__ConditionPersonne__Group__1__Impl : ( 'ConditionPersonne' ) ;
    public final void rule__ConditionPersonne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3326:1: ( ( 'ConditionPersonne' ) )
            // InternalGame.g:3327:1: ( 'ConditionPersonne' )
            {
            // InternalGame.g:3327:1: ( 'ConditionPersonne' )
            // InternalGame.g:3328:2: 'ConditionPersonne'
            {
             before(grammarAccess.getConditionPersonneAccess().getConditionPersonneKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getConditionPersonneAccess().getConditionPersonneKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group__1__Impl"


    // $ANTLR start "rule__ConditionPersonne__Group__2"
    // InternalGame.g:3337:1: rule__ConditionPersonne__Group__2 : rule__ConditionPersonne__Group__2__Impl rule__ConditionPersonne__Group__3 ;
    public final void rule__ConditionPersonne__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3341:1: ( rule__ConditionPersonne__Group__2__Impl rule__ConditionPersonne__Group__3 )
            // InternalGame.g:3342:2: rule__ConditionPersonne__Group__2__Impl rule__ConditionPersonne__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ConditionPersonne__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionPersonne__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group__2"


    // $ANTLR start "rule__ConditionPersonne__Group__2__Impl"
    // InternalGame.g:3349:1: rule__ConditionPersonne__Group__2__Impl : ( ( rule__ConditionPersonne__NameAssignment_2 ) ) ;
    public final void rule__ConditionPersonne__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3353:1: ( ( ( rule__ConditionPersonne__NameAssignment_2 ) ) )
            // InternalGame.g:3354:1: ( ( rule__ConditionPersonne__NameAssignment_2 ) )
            {
            // InternalGame.g:3354:1: ( ( rule__ConditionPersonne__NameAssignment_2 ) )
            // InternalGame.g:3355:2: ( rule__ConditionPersonne__NameAssignment_2 )
            {
             before(grammarAccess.getConditionPersonneAccess().getNameAssignment_2()); 
            // InternalGame.g:3356:2: ( rule__ConditionPersonne__NameAssignment_2 )
            // InternalGame.g:3356:3: rule__ConditionPersonne__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConditionPersonne__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionPersonneAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group__2__Impl"


    // $ANTLR start "rule__ConditionPersonne__Group__3"
    // InternalGame.g:3364:1: rule__ConditionPersonne__Group__3 : rule__ConditionPersonne__Group__3__Impl rule__ConditionPersonne__Group__4 ;
    public final void rule__ConditionPersonne__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3368:1: ( rule__ConditionPersonne__Group__3__Impl rule__ConditionPersonne__Group__4 )
            // InternalGame.g:3369:2: rule__ConditionPersonne__Group__3__Impl rule__ConditionPersonne__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__ConditionPersonne__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionPersonne__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group__3"


    // $ANTLR start "rule__ConditionPersonne__Group__3__Impl"
    // InternalGame.g:3376:1: rule__ConditionPersonne__Group__3__Impl : ( '{' ) ;
    public final void rule__ConditionPersonne__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3380:1: ( ( '{' ) )
            // InternalGame.g:3381:1: ( '{' )
            {
            // InternalGame.g:3381:1: ( '{' )
            // InternalGame.g:3382:2: '{'
            {
             before(grammarAccess.getConditionPersonneAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getConditionPersonneAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group__3__Impl"


    // $ANTLR start "rule__ConditionPersonne__Group__4"
    // InternalGame.g:3391:1: rule__ConditionPersonne__Group__4 : rule__ConditionPersonne__Group__4__Impl rule__ConditionPersonne__Group__5 ;
    public final void rule__ConditionPersonne__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3395:1: ( rule__ConditionPersonne__Group__4__Impl rule__ConditionPersonne__Group__5 )
            // InternalGame.g:3396:2: rule__ConditionPersonne__Group__4__Impl rule__ConditionPersonne__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__ConditionPersonne__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionPersonne__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group__4"


    // $ANTLR start "rule__ConditionPersonne__Group__4__Impl"
    // InternalGame.g:3403:1: rule__ConditionPersonne__Group__4__Impl : ( ( rule__ConditionPersonne__Group_4__0 )? ) ;
    public final void rule__ConditionPersonne__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3407:1: ( ( ( rule__ConditionPersonne__Group_4__0 )? ) )
            // InternalGame.g:3408:1: ( ( rule__ConditionPersonne__Group_4__0 )? )
            {
            // InternalGame.g:3408:1: ( ( rule__ConditionPersonne__Group_4__0 )? )
            // InternalGame.g:3409:2: ( rule__ConditionPersonne__Group_4__0 )?
            {
             before(grammarAccess.getConditionPersonneAccess().getGroup_4()); 
            // InternalGame.g:3410:2: ( rule__ConditionPersonne__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGame.g:3410:3: rule__ConditionPersonne__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionPersonne__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionPersonneAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group__4__Impl"


    // $ANTLR start "rule__ConditionPersonne__Group__5"
    // InternalGame.g:3418:1: rule__ConditionPersonne__Group__5 : rule__ConditionPersonne__Group__5__Impl rule__ConditionPersonne__Group__6 ;
    public final void rule__ConditionPersonne__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3422:1: ( rule__ConditionPersonne__Group__5__Impl rule__ConditionPersonne__Group__6 )
            // InternalGame.g:3423:2: rule__ConditionPersonne__Group__5__Impl rule__ConditionPersonne__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__ConditionPersonne__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionPersonne__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group__5"


    // $ANTLR start "rule__ConditionPersonne__Group__5__Impl"
    // InternalGame.g:3430:1: rule__ConditionPersonne__Group__5__Impl : ( ( rule__ConditionPersonne__Group_5__0 )? ) ;
    public final void rule__ConditionPersonne__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3434:1: ( ( ( rule__ConditionPersonne__Group_5__0 )? ) )
            // InternalGame.g:3435:1: ( ( rule__ConditionPersonne__Group_5__0 )? )
            {
            // InternalGame.g:3435:1: ( ( rule__ConditionPersonne__Group_5__0 )? )
            // InternalGame.g:3436:2: ( rule__ConditionPersonne__Group_5__0 )?
            {
             before(grammarAccess.getConditionPersonneAccess().getGroup_5()); 
            // InternalGame.g:3437:2: ( rule__ConditionPersonne__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGame.g:3437:3: rule__ConditionPersonne__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionPersonne__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionPersonneAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group__5__Impl"


    // $ANTLR start "rule__ConditionPersonne__Group__6"
    // InternalGame.g:3445:1: rule__ConditionPersonne__Group__6 : rule__ConditionPersonne__Group__6__Impl rule__ConditionPersonne__Group__7 ;
    public final void rule__ConditionPersonne__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3449:1: ( rule__ConditionPersonne__Group__6__Impl rule__ConditionPersonne__Group__7 )
            // InternalGame.g:3450:2: rule__ConditionPersonne__Group__6__Impl rule__ConditionPersonne__Group__7
            {
            pushFollow(FOLLOW_32);
            rule__ConditionPersonne__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionPersonne__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group__6"


    // $ANTLR start "rule__ConditionPersonne__Group__6__Impl"
    // InternalGame.g:3457:1: rule__ConditionPersonne__Group__6__Impl : ( ( rule__ConditionPersonne__Group_6__0 )? ) ;
    public final void rule__ConditionPersonne__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3461:1: ( ( ( rule__ConditionPersonne__Group_6__0 )? ) )
            // InternalGame.g:3462:1: ( ( rule__ConditionPersonne__Group_6__0 )? )
            {
            // InternalGame.g:3462:1: ( ( rule__ConditionPersonne__Group_6__0 )? )
            // InternalGame.g:3463:2: ( rule__ConditionPersonne__Group_6__0 )?
            {
             before(grammarAccess.getConditionPersonneAccess().getGroup_6()); 
            // InternalGame.g:3464:2: ( rule__ConditionPersonne__Group_6__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGame.g:3464:3: rule__ConditionPersonne__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionPersonne__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionPersonneAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group__6__Impl"


    // $ANTLR start "rule__ConditionPersonne__Group__7"
    // InternalGame.g:3472:1: rule__ConditionPersonne__Group__7 : rule__ConditionPersonne__Group__7__Impl rule__ConditionPersonne__Group__8 ;
    public final void rule__ConditionPersonne__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3476:1: ( rule__ConditionPersonne__Group__7__Impl rule__ConditionPersonne__Group__8 )
            // InternalGame.g:3477:2: rule__ConditionPersonne__Group__7__Impl rule__ConditionPersonne__Group__8
            {
            pushFollow(FOLLOW_32);
            rule__ConditionPersonne__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionPersonne__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group__7"


    // $ANTLR start "rule__ConditionPersonne__Group__7__Impl"
    // InternalGame.g:3484:1: rule__ConditionPersonne__Group__7__Impl : ( ( rule__ConditionPersonne__Group_7__0 )? ) ;
    public final void rule__ConditionPersonne__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3488:1: ( ( ( rule__ConditionPersonne__Group_7__0 )? ) )
            // InternalGame.g:3489:1: ( ( rule__ConditionPersonne__Group_7__0 )? )
            {
            // InternalGame.g:3489:1: ( ( rule__ConditionPersonne__Group_7__0 )? )
            // InternalGame.g:3490:2: ( rule__ConditionPersonne__Group_7__0 )?
            {
             before(grammarAccess.getConditionPersonneAccess().getGroup_7()); 
            // InternalGame.g:3491:2: ( rule__ConditionPersonne__Group_7__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==41) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGame.g:3491:3: rule__ConditionPersonne__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionPersonne__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionPersonneAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group__7__Impl"


    // $ANTLR start "rule__ConditionPersonne__Group__8"
    // InternalGame.g:3499:1: rule__ConditionPersonne__Group__8 : rule__ConditionPersonne__Group__8__Impl ;
    public final void rule__ConditionPersonne__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3503:1: ( rule__ConditionPersonne__Group__8__Impl )
            // InternalGame.g:3504:2: rule__ConditionPersonne__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionPersonne__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group__8"


    // $ANTLR start "rule__ConditionPersonne__Group__8__Impl"
    // InternalGame.g:3510:1: rule__ConditionPersonne__Group__8__Impl : ( '}' ) ;
    public final void rule__ConditionPersonne__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3514:1: ( ( '}' ) )
            // InternalGame.g:3515:1: ( '}' )
            {
            // InternalGame.g:3515:1: ( '}' )
            // InternalGame.g:3516:2: '}'
            {
             before(grammarAccess.getConditionPersonneAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConditionPersonneAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group__8__Impl"


    // $ANTLR start "rule__ConditionPersonne__Group_4__0"
    // InternalGame.g:3526:1: rule__ConditionPersonne__Group_4__0 : rule__ConditionPersonne__Group_4__0__Impl rule__ConditionPersonne__Group_4__1 ;
    public final void rule__ConditionPersonne__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3530:1: ( rule__ConditionPersonne__Group_4__0__Impl rule__ConditionPersonne__Group_4__1 )
            // InternalGame.g:3531:2: rule__ConditionPersonne__Group_4__0__Impl rule__ConditionPersonne__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__ConditionPersonne__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionPersonne__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group_4__0"


    // $ANTLR start "rule__ConditionPersonne__Group_4__0__Impl"
    // InternalGame.g:3538:1: rule__ConditionPersonne__Group_4__0__Impl : ( 'connaissanceRequise' ) ;
    public final void rule__ConditionPersonne__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3542:1: ( ( 'connaissanceRequise' ) )
            // InternalGame.g:3543:1: ( 'connaissanceRequise' )
            {
            // InternalGame.g:3543:1: ( 'connaissanceRequise' )
            // InternalGame.g:3544:2: 'connaissanceRequise'
            {
             before(grammarAccess.getConditionPersonneAccess().getConnaissanceRequiseKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getConditionPersonneAccess().getConnaissanceRequiseKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group_4__0__Impl"


    // $ANTLR start "rule__ConditionPersonne__Group_4__1"
    // InternalGame.g:3553:1: rule__ConditionPersonne__Group_4__1 : rule__ConditionPersonne__Group_4__1__Impl ;
    public final void rule__ConditionPersonne__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3557:1: ( rule__ConditionPersonne__Group_4__1__Impl )
            // InternalGame.g:3558:2: rule__ConditionPersonne__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionPersonne__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group_4__1"


    // $ANTLR start "rule__ConditionPersonne__Group_4__1__Impl"
    // InternalGame.g:3564:1: rule__ConditionPersonne__Group_4__1__Impl : ( ( rule__ConditionPersonne__ConnaissanceRequiseAssignment_4_1 ) ) ;
    public final void rule__ConditionPersonne__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3568:1: ( ( ( rule__ConditionPersonne__ConnaissanceRequiseAssignment_4_1 ) ) )
            // InternalGame.g:3569:1: ( ( rule__ConditionPersonne__ConnaissanceRequiseAssignment_4_1 ) )
            {
            // InternalGame.g:3569:1: ( ( rule__ConditionPersonne__ConnaissanceRequiseAssignment_4_1 ) )
            // InternalGame.g:3570:2: ( rule__ConditionPersonne__ConnaissanceRequiseAssignment_4_1 )
            {
             before(grammarAccess.getConditionPersonneAccess().getConnaissanceRequiseAssignment_4_1()); 
            // InternalGame.g:3571:2: ( rule__ConditionPersonne__ConnaissanceRequiseAssignment_4_1 )
            // InternalGame.g:3571:3: rule__ConditionPersonne__ConnaissanceRequiseAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionPersonne__ConnaissanceRequiseAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionPersonneAccess().getConnaissanceRequiseAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group_4__1__Impl"


    // $ANTLR start "rule__ConditionPersonne__Group_5__0"
    // InternalGame.g:3580:1: rule__ConditionPersonne__Group_5__0 : rule__ConditionPersonne__Group_5__0__Impl rule__ConditionPersonne__Group_5__1 ;
    public final void rule__ConditionPersonne__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3584:1: ( rule__ConditionPersonne__Group_5__0__Impl rule__ConditionPersonne__Group_5__1 )
            // InternalGame.g:3585:2: rule__ConditionPersonne__Group_5__0__Impl rule__ConditionPersonne__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__ConditionPersonne__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionPersonne__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group_5__0"


    // $ANTLR start "rule__ConditionPersonne__Group_5__0__Impl"
    // InternalGame.g:3592:1: rule__ConditionPersonne__Group_5__0__Impl : ( 'connaissanceInterdite' ) ;
    public final void rule__ConditionPersonne__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3596:1: ( ( 'connaissanceInterdite' ) )
            // InternalGame.g:3597:1: ( 'connaissanceInterdite' )
            {
            // InternalGame.g:3597:1: ( 'connaissanceInterdite' )
            // InternalGame.g:3598:2: 'connaissanceInterdite'
            {
             before(grammarAccess.getConditionPersonneAccess().getConnaissanceInterditeKeyword_5_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getConditionPersonneAccess().getConnaissanceInterditeKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group_5__0__Impl"


    // $ANTLR start "rule__ConditionPersonne__Group_5__1"
    // InternalGame.g:3607:1: rule__ConditionPersonne__Group_5__1 : rule__ConditionPersonne__Group_5__1__Impl ;
    public final void rule__ConditionPersonne__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3611:1: ( rule__ConditionPersonne__Group_5__1__Impl )
            // InternalGame.g:3612:2: rule__ConditionPersonne__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionPersonne__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group_5__1"


    // $ANTLR start "rule__ConditionPersonne__Group_5__1__Impl"
    // InternalGame.g:3618:1: rule__ConditionPersonne__Group_5__1__Impl : ( ( rule__ConditionPersonne__ConnaissanceInterditeAssignment_5_1 ) ) ;
    public final void rule__ConditionPersonne__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3622:1: ( ( ( rule__ConditionPersonne__ConnaissanceInterditeAssignment_5_1 ) ) )
            // InternalGame.g:3623:1: ( ( rule__ConditionPersonne__ConnaissanceInterditeAssignment_5_1 ) )
            {
            // InternalGame.g:3623:1: ( ( rule__ConditionPersonne__ConnaissanceInterditeAssignment_5_1 ) )
            // InternalGame.g:3624:2: ( rule__ConditionPersonne__ConnaissanceInterditeAssignment_5_1 )
            {
             before(grammarAccess.getConditionPersonneAccess().getConnaissanceInterditeAssignment_5_1()); 
            // InternalGame.g:3625:2: ( rule__ConditionPersonne__ConnaissanceInterditeAssignment_5_1 )
            // InternalGame.g:3625:3: rule__ConditionPersonne__ConnaissanceInterditeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionPersonne__ConnaissanceInterditeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionPersonneAccess().getConnaissanceInterditeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group_5__1__Impl"


    // $ANTLR start "rule__ConditionPersonne__Group_6__0"
    // InternalGame.g:3634:1: rule__ConditionPersonne__Group_6__0 : rule__ConditionPersonne__Group_6__0__Impl rule__ConditionPersonne__Group_6__1 ;
    public final void rule__ConditionPersonne__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3638:1: ( rule__ConditionPersonne__Group_6__0__Impl rule__ConditionPersonne__Group_6__1 )
            // InternalGame.g:3639:2: rule__ConditionPersonne__Group_6__0__Impl rule__ConditionPersonne__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__ConditionPersonne__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionPersonne__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group_6__0"


    // $ANTLR start "rule__ConditionPersonne__Group_6__0__Impl"
    // InternalGame.g:3646:1: rule__ConditionPersonne__Group_6__0__Impl : ( 'objetRequis' ) ;
    public final void rule__ConditionPersonne__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3650:1: ( ( 'objetRequis' ) )
            // InternalGame.g:3651:1: ( 'objetRequis' )
            {
            // InternalGame.g:3651:1: ( 'objetRequis' )
            // InternalGame.g:3652:2: 'objetRequis'
            {
             before(grammarAccess.getConditionPersonneAccess().getObjetRequisKeyword_6_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getConditionPersonneAccess().getObjetRequisKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group_6__0__Impl"


    // $ANTLR start "rule__ConditionPersonne__Group_6__1"
    // InternalGame.g:3661:1: rule__ConditionPersonne__Group_6__1 : rule__ConditionPersonne__Group_6__1__Impl ;
    public final void rule__ConditionPersonne__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3665:1: ( rule__ConditionPersonne__Group_6__1__Impl )
            // InternalGame.g:3666:2: rule__ConditionPersonne__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionPersonne__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group_6__1"


    // $ANTLR start "rule__ConditionPersonne__Group_6__1__Impl"
    // InternalGame.g:3672:1: rule__ConditionPersonne__Group_6__1__Impl : ( ( rule__ConditionPersonne__ObjetRequisAssignment_6_1 ) ) ;
    public final void rule__ConditionPersonne__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3676:1: ( ( ( rule__ConditionPersonne__ObjetRequisAssignment_6_1 ) ) )
            // InternalGame.g:3677:1: ( ( rule__ConditionPersonne__ObjetRequisAssignment_6_1 ) )
            {
            // InternalGame.g:3677:1: ( ( rule__ConditionPersonne__ObjetRequisAssignment_6_1 ) )
            // InternalGame.g:3678:2: ( rule__ConditionPersonne__ObjetRequisAssignment_6_1 )
            {
             before(grammarAccess.getConditionPersonneAccess().getObjetRequisAssignment_6_1()); 
            // InternalGame.g:3679:2: ( rule__ConditionPersonne__ObjetRequisAssignment_6_1 )
            // InternalGame.g:3679:3: rule__ConditionPersonne__ObjetRequisAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionPersonne__ObjetRequisAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionPersonneAccess().getObjetRequisAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group_6__1__Impl"


    // $ANTLR start "rule__ConditionPersonne__Group_7__0"
    // InternalGame.g:3688:1: rule__ConditionPersonne__Group_7__0 : rule__ConditionPersonne__Group_7__0__Impl rule__ConditionPersonne__Group_7__1 ;
    public final void rule__ConditionPersonne__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3692:1: ( rule__ConditionPersonne__Group_7__0__Impl rule__ConditionPersonne__Group_7__1 )
            // InternalGame.g:3693:2: rule__ConditionPersonne__Group_7__0__Impl rule__ConditionPersonne__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__ConditionPersonne__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionPersonne__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group_7__0"


    // $ANTLR start "rule__ConditionPersonne__Group_7__0__Impl"
    // InternalGame.g:3700:1: rule__ConditionPersonne__Group_7__0__Impl : ( 'objetInterdit' ) ;
    public final void rule__ConditionPersonne__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3704:1: ( ( 'objetInterdit' ) )
            // InternalGame.g:3705:1: ( 'objetInterdit' )
            {
            // InternalGame.g:3705:1: ( 'objetInterdit' )
            // InternalGame.g:3706:2: 'objetInterdit'
            {
             before(grammarAccess.getConditionPersonneAccess().getObjetInterditKeyword_7_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getConditionPersonneAccess().getObjetInterditKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group_7__0__Impl"


    // $ANTLR start "rule__ConditionPersonne__Group_7__1"
    // InternalGame.g:3715:1: rule__ConditionPersonne__Group_7__1 : rule__ConditionPersonne__Group_7__1__Impl ;
    public final void rule__ConditionPersonne__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3719:1: ( rule__ConditionPersonne__Group_7__1__Impl )
            // InternalGame.g:3720:2: rule__ConditionPersonne__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionPersonne__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group_7__1"


    // $ANTLR start "rule__ConditionPersonne__Group_7__1__Impl"
    // InternalGame.g:3726:1: rule__ConditionPersonne__Group_7__1__Impl : ( ( rule__ConditionPersonne__ObjetInterditAssignment_7_1 ) ) ;
    public final void rule__ConditionPersonne__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3730:1: ( ( ( rule__ConditionPersonne__ObjetInterditAssignment_7_1 ) ) )
            // InternalGame.g:3731:1: ( ( rule__ConditionPersonne__ObjetInterditAssignment_7_1 ) )
            {
            // InternalGame.g:3731:1: ( ( rule__ConditionPersonne__ObjetInterditAssignment_7_1 ) )
            // InternalGame.g:3732:2: ( rule__ConditionPersonne__ObjetInterditAssignment_7_1 )
            {
             before(grammarAccess.getConditionPersonneAccess().getObjetInterditAssignment_7_1()); 
            // InternalGame.g:3733:2: ( rule__ConditionPersonne__ObjetInterditAssignment_7_1 )
            // InternalGame.g:3733:3: rule__ConditionPersonne__ObjetInterditAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionPersonne__ObjetInterditAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionPersonneAccess().getObjetInterditAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__Group_7__1__Impl"


    // $ANTLR start "rule__Interaction__Group__0"
    // InternalGame.g:3742:1: rule__Interaction__Group__0 : rule__Interaction__Group__0__Impl rule__Interaction__Group__1 ;
    public final void rule__Interaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3746:1: ( rule__Interaction__Group__0__Impl rule__Interaction__Group__1 )
            // InternalGame.g:3747:2: rule__Interaction__Group__0__Impl rule__Interaction__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Interaction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__0"


    // $ANTLR start "rule__Interaction__Group__0__Impl"
    // InternalGame.g:3754:1: rule__Interaction__Group__0__Impl : ( 'Interaction' ) ;
    public final void rule__Interaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3758:1: ( ( 'Interaction' ) )
            // InternalGame.g:3759:1: ( 'Interaction' )
            {
            // InternalGame.g:3759:1: ( 'Interaction' )
            // InternalGame.g:3760:2: 'Interaction'
            {
             before(grammarAccess.getInteractionAccess().getInteractionKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getInteractionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__0__Impl"


    // $ANTLR start "rule__Interaction__Group__1"
    // InternalGame.g:3769:1: rule__Interaction__Group__1 : rule__Interaction__Group__1__Impl rule__Interaction__Group__2 ;
    public final void rule__Interaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3773:1: ( rule__Interaction__Group__1__Impl rule__Interaction__Group__2 )
            // InternalGame.g:3774:2: rule__Interaction__Group__1__Impl rule__Interaction__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Interaction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__1"


    // $ANTLR start "rule__Interaction__Group__1__Impl"
    // InternalGame.g:3781:1: rule__Interaction__Group__1__Impl : ( ( rule__Interaction__NameAssignment_1 ) ) ;
    public final void rule__Interaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3785:1: ( ( ( rule__Interaction__NameAssignment_1 ) ) )
            // InternalGame.g:3786:1: ( ( rule__Interaction__NameAssignment_1 ) )
            {
            // InternalGame.g:3786:1: ( ( rule__Interaction__NameAssignment_1 ) )
            // InternalGame.g:3787:2: ( rule__Interaction__NameAssignment_1 )
            {
             before(grammarAccess.getInteractionAccess().getNameAssignment_1()); 
            // InternalGame.g:3788:2: ( rule__Interaction__NameAssignment_1 )
            // InternalGame.g:3788:3: rule__Interaction__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__1__Impl"


    // $ANTLR start "rule__Interaction__Group__2"
    // InternalGame.g:3796:1: rule__Interaction__Group__2 : rule__Interaction__Group__2__Impl rule__Interaction__Group__3 ;
    public final void rule__Interaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3800:1: ( rule__Interaction__Group__2__Impl rule__Interaction__Group__3 )
            // InternalGame.g:3801:2: rule__Interaction__Group__2__Impl rule__Interaction__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Interaction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__2"


    // $ANTLR start "rule__Interaction__Group__2__Impl"
    // InternalGame.g:3808:1: rule__Interaction__Group__2__Impl : ( '{' ) ;
    public final void rule__Interaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3812:1: ( ( '{' ) )
            // InternalGame.g:3813:1: ( '{' )
            {
            // InternalGame.g:3813:1: ( '{' )
            // InternalGame.g:3814:2: '{'
            {
             before(grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__2__Impl"


    // $ANTLR start "rule__Interaction__Group__3"
    // InternalGame.g:3823:1: rule__Interaction__Group__3 : rule__Interaction__Group__3__Impl rule__Interaction__Group__4 ;
    public final void rule__Interaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3827:1: ( rule__Interaction__Group__3__Impl rule__Interaction__Group__4 )
            // InternalGame.g:3828:2: rule__Interaction__Group__3__Impl rule__Interaction__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__Interaction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__3"


    // $ANTLR start "rule__Interaction__Group__3__Impl"
    // InternalGame.g:3835:1: rule__Interaction__Group__3__Impl : ( ( rule__Interaction__Group_3__0 )? ) ;
    public final void rule__Interaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3839:1: ( ( ( rule__Interaction__Group_3__0 )? ) )
            // InternalGame.g:3840:1: ( ( rule__Interaction__Group_3__0 )? )
            {
            // InternalGame.g:3840:1: ( ( rule__Interaction__Group_3__0 )? )
            // InternalGame.g:3841:2: ( rule__Interaction__Group_3__0 )?
            {
             before(grammarAccess.getInteractionAccess().getGroup_3()); 
            // InternalGame.g:3842:2: ( rule__Interaction__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==44) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGame.g:3842:3: rule__Interaction__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Interaction__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInteractionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__3__Impl"


    // $ANTLR start "rule__Interaction__Group__4"
    // InternalGame.g:3850:1: rule__Interaction__Group__4 : rule__Interaction__Group__4__Impl rule__Interaction__Group__5 ;
    public final void rule__Interaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3854:1: ( rule__Interaction__Group__4__Impl rule__Interaction__Group__5 )
            // InternalGame.g:3855:2: rule__Interaction__Group__4__Impl rule__Interaction__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Interaction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__4"


    // $ANTLR start "rule__Interaction__Group__4__Impl"
    // InternalGame.g:3862:1: rule__Interaction__Group__4__Impl : ( 'personne' ) ;
    public final void rule__Interaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3866:1: ( ( 'personne' ) )
            // InternalGame.g:3867:1: ( 'personne' )
            {
            // InternalGame.g:3867:1: ( 'personne' )
            // InternalGame.g:3868:2: 'personne'
            {
             before(grammarAccess.getInteractionAccess().getPersonneKeyword_4()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getPersonneKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__4__Impl"


    // $ANTLR start "rule__Interaction__Group__5"
    // InternalGame.g:3877:1: rule__Interaction__Group__5 : rule__Interaction__Group__5__Impl rule__Interaction__Group__6 ;
    public final void rule__Interaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3881:1: ( rule__Interaction__Group__5__Impl rule__Interaction__Group__6 )
            // InternalGame.g:3882:2: rule__Interaction__Group__5__Impl rule__Interaction__Group__6
            {
            pushFollow(FOLLOW_34);
            rule__Interaction__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__5"


    // $ANTLR start "rule__Interaction__Group__5__Impl"
    // InternalGame.g:3889:1: rule__Interaction__Group__5__Impl : ( ( rule__Interaction__PersonneAssignment_5 ) ) ;
    public final void rule__Interaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3893:1: ( ( ( rule__Interaction__PersonneAssignment_5 ) ) )
            // InternalGame.g:3894:1: ( ( rule__Interaction__PersonneAssignment_5 ) )
            {
            // InternalGame.g:3894:1: ( ( rule__Interaction__PersonneAssignment_5 ) )
            // InternalGame.g:3895:2: ( rule__Interaction__PersonneAssignment_5 )
            {
             before(grammarAccess.getInteractionAccess().getPersonneAssignment_5()); 
            // InternalGame.g:3896:2: ( rule__Interaction__PersonneAssignment_5 )
            // InternalGame.g:3896:3: rule__Interaction__PersonneAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__PersonneAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getPersonneAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__5__Impl"


    // $ANTLR start "rule__Interaction__Group__6"
    // InternalGame.g:3904:1: rule__Interaction__Group__6 : rule__Interaction__Group__6__Impl rule__Interaction__Group__7 ;
    public final void rule__Interaction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3908:1: ( rule__Interaction__Group__6__Impl rule__Interaction__Group__7 )
            // InternalGame.g:3909:2: rule__Interaction__Group__6__Impl rule__Interaction__Group__7
            {
            pushFollow(FOLLOW_34);
            rule__Interaction__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__6"


    // $ANTLR start "rule__Interaction__Group__6__Impl"
    // InternalGame.g:3916:1: rule__Interaction__Group__6__Impl : ( ( rule__Interaction__Group_6__0 )? ) ;
    public final void rule__Interaction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3920:1: ( ( ( rule__Interaction__Group_6__0 )? ) )
            // InternalGame.g:3921:1: ( ( rule__Interaction__Group_6__0 )? )
            {
            // InternalGame.g:3921:1: ( ( rule__Interaction__Group_6__0 )? )
            // InternalGame.g:3922:2: ( rule__Interaction__Group_6__0 )?
            {
             before(grammarAccess.getInteractionAccess().getGroup_6()); 
            // InternalGame.g:3923:2: ( rule__Interaction__Group_6__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==45) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGame.g:3923:3: rule__Interaction__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Interaction__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInteractionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__6__Impl"


    // $ANTLR start "rule__Interaction__Group__7"
    // InternalGame.g:3931:1: rule__Interaction__Group__7 : rule__Interaction__Group__7__Impl ;
    public final void rule__Interaction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3935:1: ( rule__Interaction__Group__7__Impl )
            // InternalGame.g:3936:2: rule__Interaction__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__7"


    // $ANTLR start "rule__Interaction__Group__7__Impl"
    // InternalGame.g:3942:1: rule__Interaction__Group__7__Impl : ( '}' ) ;
    public final void rule__Interaction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3946:1: ( ( '}' ) )
            // InternalGame.g:3947:1: ( '}' )
            {
            // InternalGame.g:3947:1: ( '}' )
            // InternalGame.g:3948:2: '}'
            {
             before(grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__7__Impl"


    // $ANTLR start "rule__Interaction__Group_3__0"
    // InternalGame.g:3958:1: rule__Interaction__Group_3__0 : rule__Interaction__Group_3__0__Impl rule__Interaction__Group_3__1 ;
    public final void rule__Interaction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3962:1: ( rule__Interaction__Group_3__0__Impl rule__Interaction__Group_3__1 )
            // InternalGame.g:3963:2: rule__Interaction__Group_3__0__Impl rule__Interaction__Group_3__1
            {
            pushFollow(FOLLOW_35);
            rule__Interaction__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group_3__0"


    // $ANTLR start "rule__Interaction__Group_3__0__Impl"
    // InternalGame.g:3970:1: rule__Interaction__Group_3__0__Impl : ( 'question' ) ;
    public final void rule__Interaction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3974:1: ( ( 'question' ) )
            // InternalGame.g:3975:1: ( 'question' )
            {
            // InternalGame.g:3975:1: ( 'question' )
            // InternalGame.g:3976:2: 'question'
            {
             before(grammarAccess.getInteractionAccess().getQuestionKeyword_3_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getQuestionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group_3__0__Impl"


    // $ANTLR start "rule__Interaction__Group_3__1"
    // InternalGame.g:3985:1: rule__Interaction__Group_3__1 : rule__Interaction__Group_3__1__Impl ;
    public final void rule__Interaction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3989:1: ( rule__Interaction__Group_3__1__Impl )
            // InternalGame.g:3990:2: rule__Interaction__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group_3__1"


    // $ANTLR start "rule__Interaction__Group_3__1__Impl"
    // InternalGame.g:3996:1: rule__Interaction__Group_3__1__Impl : ( ( rule__Interaction__QuestionAssignment_3_1 ) ) ;
    public final void rule__Interaction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4000:1: ( ( ( rule__Interaction__QuestionAssignment_3_1 ) ) )
            // InternalGame.g:4001:1: ( ( rule__Interaction__QuestionAssignment_3_1 ) )
            {
            // InternalGame.g:4001:1: ( ( rule__Interaction__QuestionAssignment_3_1 ) )
            // InternalGame.g:4002:2: ( rule__Interaction__QuestionAssignment_3_1 )
            {
             before(grammarAccess.getInteractionAccess().getQuestionAssignment_3_1()); 
            // InternalGame.g:4003:2: ( rule__Interaction__QuestionAssignment_3_1 )
            // InternalGame.g:4003:3: rule__Interaction__QuestionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__QuestionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getQuestionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group_3__1__Impl"


    // $ANTLR start "rule__Interaction__Group_6__0"
    // InternalGame.g:4012:1: rule__Interaction__Group_6__0 : rule__Interaction__Group_6__0__Impl rule__Interaction__Group_6__1 ;
    public final void rule__Interaction__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4016:1: ( rule__Interaction__Group_6__0__Impl rule__Interaction__Group_6__1 )
            // InternalGame.g:4017:2: rule__Interaction__Group_6__0__Impl rule__Interaction__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Interaction__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group_6__0"


    // $ANTLR start "rule__Interaction__Group_6__0__Impl"
    // InternalGame.g:4024:1: rule__Interaction__Group_6__0__Impl : ( 'choix' ) ;
    public final void rule__Interaction__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4028:1: ( ( 'choix' ) )
            // InternalGame.g:4029:1: ( 'choix' )
            {
            // InternalGame.g:4029:1: ( 'choix' )
            // InternalGame.g:4030:2: 'choix'
            {
             before(grammarAccess.getInteractionAccess().getChoixKeyword_6_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getChoixKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group_6__0__Impl"


    // $ANTLR start "rule__Interaction__Group_6__1"
    // InternalGame.g:4039:1: rule__Interaction__Group_6__1 : rule__Interaction__Group_6__1__Impl rule__Interaction__Group_6__2 ;
    public final void rule__Interaction__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4043:1: ( rule__Interaction__Group_6__1__Impl rule__Interaction__Group_6__2 )
            // InternalGame.g:4044:2: rule__Interaction__Group_6__1__Impl rule__Interaction__Group_6__2
            {
            pushFollow(FOLLOW_18);
            rule__Interaction__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group_6__1"


    // $ANTLR start "rule__Interaction__Group_6__1__Impl"
    // InternalGame.g:4051:1: rule__Interaction__Group_6__1__Impl : ( ( rule__Interaction__ChoixAssignment_6_1 ) ) ;
    public final void rule__Interaction__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4055:1: ( ( ( rule__Interaction__ChoixAssignment_6_1 ) ) )
            // InternalGame.g:4056:1: ( ( rule__Interaction__ChoixAssignment_6_1 ) )
            {
            // InternalGame.g:4056:1: ( ( rule__Interaction__ChoixAssignment_6_1 ) )
            // InternalGame.g:4057:2: ( rule__Interaction__ChoixAssignment_6_1 )
            {
             before(grammarAccess.getInteractionAccess().getChoixAssignment_6_1()); 
            // InternalGame.g:4058:2: ( rule__Interaction__ChoixAssignment_6_1 )
            // InternalGame.g:4058:3: rule__Interaction__ChoixAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__ChoixAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getChoixAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group_6__1__Impl"


    // $ANTLR start "rule__Interaction__Group_6__2"
    // InternalGame.g:4066:1: rule__Interaction__Group_6__2 : rule__Interaction__Group_6__2__Impl ;
    public final void rule__Interaction__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4070:1: ( rule__Interaction__Group_6__2__Impl )
            // InternalGame.g:4071:2: rule__Interaction__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group_6__2"


    // $ANTLR start "rule__Interaction__Group_6__2__Impl"
    // InternalGame.g:4077:1: rule__Interaction__Group_6__2__Impl : ( ( rule__Interaction__Group_6_2__0 )* ) ;
    public final void rule__Interaction__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4081:1: ( ( ( rule__Interaction__Group_6_2__0 )* ) )
            // InternalGame.g:4082:1: ( ( rule__Interaction__Group_6_2__0 )* )
            {
            // InternalGame.g:4082:1: ( ( rule__Interaction__Group_6_2__0 )* )
            // InternalGame.g:4083:2: ( rule__Interaction__Group_6_2__0 )*
            {
             before(grammarAccess.getInteractionAccess().getGroup_6_2()); 
            // InternalGame.g:4084:2: ( rule__Interaction__Group_6_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==17) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalGame.g:4084:3: rule__Interaction__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Interaction__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getInteractionAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group_6__2__Impl"


    // $ANTLR start "rule__Interaction__Group_6_2__0"
    // InternalGame.g:4093:1: rule__Interaction__Group_6_2__0 : rule__Interaction__Group_6_2__0__Impl rule__Interaction__Group_6_2__1 ;
    public final void rule__Interaction__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4097:1: ( rule__Interaction__Group_6_2__0__Impl rule__Interaction__Group_6_2__1 )
            // InternalGame.g:4098:2: rule__Interaction__Group_6_2__0__Impl rule__Interaction__Group_6_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Interaction__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group_6_2__0"


    // $ANTLR start "rule__Interaction__Group_6_2__0__Impl"
    // InternalGame.g:4105:1: rule__Interaction__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__Interaction__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4109:1: ( ( ',' ) )
            // InternalGame.g:4110:1: ( ',' )
            {
            // InternalGame.g:4110:1: ( ',' )
            // InternalGame.g:4111:2: ','
            {
             before(grammarAccess.getInteractionAccess().getCommaKeyword_6_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getCommaKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group_6_2__0__Impl"


    // $ANTLR start "rule__Interaction__Group_6_2__1"
    // InternalGame.g:4120:1: rule__Interaction__Group_6_2__1 : rule__Interaction__Group_6_2__1__Impl ;
    public final void rule__Interaction__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4124:1: ( rule__Interaction__Group_6_2__1__Impl )
            // InternalGame.g:4125:2: rule__Interaction__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__Group_6_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group_6_2__1"


    // $ANTLR start "rule__Interaction__Group_6_2__1__Impl"
    // InternalGame.g:4131:1: rule__Interaction__Group_6_2__1__Impl : ( ( rule__Interaction__ChoixAssignment_6_2_1 ) ) ;
    public final void rule__Interaction__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4135:1: ( ( ( rule__Interaction__ChoixAssignment_6_2_1 ) ) )
            // InternalGame.g:4136:1: ( ( rule__Interaction__ChoixAssignment_6_2_1 ) )
            {
            // InternalGame.g:4136:1: ( ( rule__Interaction__ChoixAssignment_6_2_1 ) )
            // InternalGame.g:4137:2: ( rule__Interaction__ChoixAssignment_6_2_1 )
            {
             before(grammarAccess.getInteractionAccess().getChoixAssignment_6_2_1()); 
            // InternalGame.g:4138:2: ( rule__Interaction__ChoixAssignment_6_2_1 )
            // InternalGame.g:4138:3: rule__Interaction__ChoixAssignment_6_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__ChoixAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getChoixAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group_6_2__1__Impl"


    // $ANTLR start "rule__Connaissance__Group__0"
    // InternalGame.g:4147:1: rule__Connaissance__Group__0 : rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1 ;
    public final void rule__Connaissance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4151:1: ( rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1 )
            // InternalGame.g:4152:2: rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Connaissance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__0"


    // $ANTLR start "rule__Connaissance__Group__0__Impl"
    // InternalGame.g:4159:1: rule__Connaissance__Group__0__Impl : ( () ) ;
    public final void rule__Connaissance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4163:1: ( ( () ) )
            // InternalGame.g:4164:1: ( () )
            {
            // InternalGame.g:4164:1: ( () )
            // InternalGame.g:4165:2: ()
            {
             before(grammarAccess.getConnaissanceAccess().getConnaissanceAction_0()); 
            // InternalGame.g:4166:2: ()
            // InternalGame.g:4166:3: 
            {
            }

             after(grammarAccess.getConnaissanceAccess().getConnaissanceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__0__Impl"


    // $ANTLR start "rule__Connaissance__Group__1"
    // InternalGame.g:4174:1: rule__Connaissance__Group__1 : rule__Connaissance__Group__1__Impl rule__Connaissance__Group__2 ;
    public final void rule__Connaissance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4178:1: ( rule__Connaissance__Group__1__Impl rule__Connaissance__Group__2 )
            // InternalGame.g:4179:2: rule__Connaissance__Group__1__Impl rule__Connaissance__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Connaissance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__1"


    // $ANTLR start "rule__Connaissance__Group__1__Impl"
    // InternalGame.g:4186:1: rule__Connaissance__Group__1__Impl : ( 'Connaissance' ) ;
    public final void rule__Connaissance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4190:1: ( ( 'Connaissance' ) )
            // InternalGame.g:4191:1: ( 'Connaissance' )
            {
            // InternalGame.g:4191:1: ( 'Connaissance' )
            // InternalGame.g:4192:2: 'Connaissance'
            {
             before(grammarAccess.getConnaissanceAccess().getConnaissanceKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getConnaissanceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__1__Impl"


    // $ANTLR start "rule__Connaissance__Group__2"
    // InternalGame.g:4201:1: rule__Connaissance__Group__2 : rule__Connaissance__Group__2__Impl rule__Connaissance__Group__3 ;
    public final void rule__Connaissance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4205:1: ( rule__Connaissance__Group__2__Impl rule__Connaissance__Group__3 )
            // InternalGame.g:4206:2: rule__Connaissance__Group__2__Impl rule__Connaissance__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Connaissance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__2"


    // $ANTLR start "rule__Connaissance__Group__2__Impl"
    // InternalGame.g:4213:1: rule__Connaissance__Group__2__Impl : ( ( rule__Connaissance__NameAssignment_2 ) ) ;
    public final void rule__Connaissance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4217:1: ( ( ( rule__Connaissance__NameAssignment_2 ) ) )
            // InternalGame.g:4218:1: ( ( rule__Connaissance__NameAssignment_2 ) )
            {
            // InternalGame.g:4218:1: ( ( rule__Connaissance__NameAssignment_2 ) )
            // InternalGame.g:4219:2: ( rule__Connaissance__NameAssignment_2 )
            {
             before(grammarAccess.getConnaissanceAccess().getNameAssignment_2()); 
            // InternalGame.g:4220:2: ( rule__Connaissance__NameAssignment_2 )
            // InternalGame.g:4220:3: rule__Connaissance__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConnaissanceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__2__Impl"


    // $ANTLR start "rule__Connaissance__Group__3"
    // InternalGame.g:4228:1: rule__Connaissance__Group__3 : rule__Connaissance__Group__3__Impl rule__Connaissance__Group__4 ;
    public final void rule__Connaissance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4232:1: ( rule__Connaissance__Group__3__Impl rule__Connaissance__Group__4 )
            // InternalGame.g:4233:2: rule__Connaissance__Group__3__Impl rule__Connaissance__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__Connaissance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__3"


    // $ANTLR start "rule__Connaissance__Group__3__Impl"
    // InternalGame.g:4240:1: rule__Connaissance__Group__3__Impl : ( '{' ) ;
    public final void rule__Connaissance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4244:1: ( ( '{' ) )
            // InternalGame.g:4245:1: ( '{' )
            {
            // InternalGame.g:4245:1: ( '{' )
            // InternalGame.g:4246:2: '{'
            {
             before(grammarAccess.getConnaissanceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__3__Impl"


    // $ANTLR start "rule__Connaissance__Group__4"
    // InternalGame.g:4255:1: rule__Connaissance__Group__4 : rule__Connaissance__Group__4__Impl rule__Connaissance__Group__5 ;
    public final void rule__Connaissance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4259:1: ( rule__Connaissance__Group__4__Impl rule__Connaissance__Group__5 )
            // InternalGame.g:4260:2: rule__Connaissance__Group__4__Impl rule__Connaissance__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__Connaissance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__4"


    // $ANTLR start "rule__Connaissance__Group__4__Impl"
    // InternalGame.g:4267:1: rule__Connaissance__Group__4__Impl : ( ( rule__Connaissance__Group_4__0 )? ) ;
    public final void rule__Connaissance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4271:1: ( ( ( rule__Connaissance__Group_4__0 )? ) )
            // InternalGame.g:4272:1: ( ( rule__Connaissance__Group_4__0 )? )
            {
            // InternalGame.g:4272:1: ( ( rule__Connaissance__Group_4__0 )? )
            // InternalGame.g:4273:2: ( rule__Connaissance__Group_4__0 )?
            {
             before(grammarAccess.getConnaissanceAccess().getGroup_4()); 
            // InternalGame.g:4274:2: ( rule__Connaissance__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==45) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGame.g:4274:3: rule__Connaissance__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Connaissance__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnaissanceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__4__Impl"


    // $ANTLR start "rule__Connaissance__Group__5"
    // InternalGame.g:4282:1: rule__Connaissance__Group__5 : rule__Connaissance__Group__5__Impl rule__Connaissance__Group__6 ;
    public final void rule__Connaissance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4286:1: ( rule__Connaissance__Group__5__Impl rule__Connaissance__Group__6 )
            // InternalGame.g:4287:2: rule__Connaissance__Group__5__Impl rule__Connaissance__Group__6
            {
            pushFollow(FOLLOW_36);
            rule__Connaissance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__5"


    // $ANTLR start "rule__Connaissance__Group__5__Impl"
    // InternalGame.g:4294:1: rule__Connaissance__Group__5__Impl : ( ( rule__Connaissance__Group_5__0 )? ) ;
    public final void rule__Connaissance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4298:1: ( ( ( rule__Connaissance__Group_5__0 )? ) )
            // InternalGame.g:4299:1: ( ( rule__Connaissance__Group_5__0 )? )
            {
            // InternalGame.g:4299:1: ( ( rule__Connaissance__Group_5__0 )? )
            // InternalGame.g:4300:2: ( rule__Connaissance__Group_5__0 )?
            {
             before(grammarAccess.getConnaissanceAccess().getGroup_5()); 
            // InternalGame.g:4301:2: ( rule__Connaissance__Group_5__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGame.g:4301:3: rule__Connaissance__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Connaissance__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnaissanceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__5__Impl"


    // $ANTLR start "rule__Connaissance__Group__6"
    // InternalGame.g:4309:1: rule__Connaissance__Group__6 : rule__Connaissance__Group__6__Impl rule__Connaissance__Group__7 ;
    public final void rule__Connaissance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4313:1: ( rule__Connaissance__Group__6__Impl rule__Connaissance__Group__7 )
            // InternalGame.g:4314:2: rule__Connaissance__Group__6__Impl rule__Connaissance__Group__7
            {
            pushFollow(FOLLOW_36);
            rule__Connaissance__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__6"


    // $ANTLR start "rule__Connaissance__Group__6__Impl"
    // InternalGame.g:4321:1: rule__Connaissance__Group__6__Impl : ( ( rule__Connaissance__Group_6__0 )? ) ;
    public final void rule__Connaissance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4325:1: ( ( ( rule__Connaissance__Group_6__0 )? ) )
            // InternalGame.g:4326:1: ( ( rule__Connaissance__Group_6__0 )? )
            {
            // InternalGame.g:4326:1: ( ( rule__Connaissance__Group_6__0 )? )
            // InternalGame.g:4327:2: ( rule__Connaissance__Group_6__0 )?
            {
             before(grammarAccess.getConnaissanceAccess().getGroup_6()); 
            // InternalGame.g:4328:2: ( rule__Connaissance__Group_6__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==47) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGame.g:4328:3: rule__Connaissance__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Connaissance__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnaissanceAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__6__Impl"


    // $ANTLR start "rule__Connaissance__Group__7"
    // InternalGame.g:4336:1: rule__Connaissance__Group__7 : rule__Connaissance__Group__7__Impl ;
    public final void rule__Connaissance__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4340:1: ( rule__Connaissance__Group__7__Impl )
            // InternalGame.g:4341:2: rule__Connaissance__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__7"


    // $ANTLR start "rule__Connaissance__Group__7__Impl"
    // InternalGame.g:4347:1: rule__Connaissance__Group__7__Impl : ( '}' ) ;
    public final void rule__Connaissance__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4351:1: ( ( '}' ) )
            // InternalGame.g:4352:1: ( '}' )
            {
            // InternalGame.g:4352:1: ( '}' )
            // InternalGame.g:4353:2: '}'
            {
             before(grammarAccess.getConnaissanceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__7__Impl"


    // $ANTLR start "rule__Connaissance__Group_4__0"
    // InternalGame.g:4363:1: rule__Connaissance__Group_4__0 : rule__Connaissance__Group_4__0__Impl rule__Connaissance__Group_4__1 ;
    public final void rule__Connaissance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4367:1: ( rule__Connaissance__Group_4__0__Impl rule__Connaissance__Group_4__1 )
            // InternalGame.g:4368:2: rule__Connaissance__Group_4__0__Impl rule__Connaissance__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Connaissance__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group_4__0"


    // $ANTLR start "rule__Connaissance__Group_4__0__Impl"
    // InternalGame.g:4375:1: rule__Connaissance__Group_4__0__Impl : ( 'choix' ) ;
    public final void rule__Connaissance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4379:1: ( ( 'choix' ) )
            // InternalGame.g:4380:1: ( 'choix' )
            {
            // InternalGame.g:4380:1: ( 'choix' )
            // InternalGame.g:4381:2: 'choix'
            {
             before(grammarAccess.getConnaissanceAccess().getChoixKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getChoixKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group_4__0__Impl"


    // $ANTLR start "rule__Connaissance__Group_4__1"
    // InternalGame.g:4390:1: rule__Connaissance__Group_4__1 : rule__Connaissance__Group_4__1__Impl ;
    public final void rule__Connaissance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4394:1: ( rule__Connaissance__Group_4__1__Impl )
            // InternalGame.g:4395:2: rule__Connaissance__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group_4__1"


    // $ANTLR start "rule__Connaissance__Group_4__1__Impl"
    // InternalGame.g:4401:1: rule__Connaissance__Group_4__1__Impl : ( ( rule__Connaissance__ChoixAssignment_4_1 ) ) ;
    public final void rule__Connaissance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4405:1: ( ( ( rule__Connaissance__ChoixAssignment_4_1 ) ) )
            // InternalGame.g:4406:1: ( ( rule__Connaissance__ChoixAssignment_4_1 ) )
            {
            // InternalGame.g:4406:1: ( ( rule__Connaissance__ChoixAssignment_4_1 ) )
            // InternalGame.g:4407:2: ( rule__Connaissance__ChoixAssignment_4_1 )
            {
             before(grammarAccess.getConnaissanceAccess().getChoixAssignment_4_1()); 
            // InternalGame.g:4408:2: ( rule__Connaissance__ChoixAssignment_4_1 )
            // InternalGame.g:4408:3: rule__Connaissance__ChoixAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__ChoixAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getConnaissanceAccess().getChoixAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group_4__1__Impl"


    // $ANTLR start "rule__Connaissance__Group_5__0"
    // InternalGame.g:4417:1: rule__Connaissance__Group_5__0 : rule__Connaissance__Group_5__0__Impl rule__Connaissance__Group_5__1 ;
    public final void rule__Connaissance__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4421:1: ( rule__Connaissance__Group_5__0__Impl rule__Connaissance__Group_5__1 )
            // InternalGame.g:4422:2: rule__Connaissance__Group_5__0__Impl rule__Connaissance__Group_5__1
            {
            pushFollow(FOLLOW_37);
            rule__Connaissance__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group_5__0"


    // $ANTLR start "rule__Connaissance__Group_5__0__Impl"
    // InternalGame.g:4429:1: rule__Connaissance__Group_5__0__Impl : ( 'visible' ) ;
    public final void rule__Connaissance__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4433:1: ( ( 'visible' ) )
            // InternalGame.g:4434:1: ( 'visible' )
            {
            // InternalGame.g:4434:1: ( 'visible' )
            // InternalGame.g:4435:2: 'visible'
            {
             before(grammarAccess.getConnaissanceAccess().getVisibleKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getVisibleKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group_5__0__Impl"


    // $ANTLR start "rule__Connaissance__Group_5__1"
    // InternalGame.g:4444:1: rule__Connaissance__Group_5__1 : rule__Connaissance__Group_5__1__Impl rule__Connaissance__Group_5__2 ;
    public final void rule__Connaissance__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4448:1: ( rule__Connaissance__Group_5__1__Impl rule__Connaissance__Group_5__2 )
            // InternalGame.g:4449:2: rule__Connaissance__Group_5__1__Impl rule__Connaissance__Group_5__2
            {
            pushFollow(FOLLOW_18);
            rule__Connaissance__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group_5__1"


    // $ANTLR start "rule__Connaissance__Group_5__1__Impl"
    // InternalGame.g:4456:1: rule__Connaissance__Group_5__1__Impl : ( ( rule__Connaissance__VisibleAssignment_5_1 ) ) ;
    public final void rule__Connaissance__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4460:1: ( ( ( rule__Connaissance__VisibleAssignment_5_1 ) ) )
            // InternalGame.g:4461:1: ( ( rule__Connaissance__VisibleAssignment_5_1 ) )
            {
            // InternalGame.g:4461:1: ( ( rule__Connaissance__VisibleAssignment_5_1 ) )
            // InternalGame.g:4462:2: ( rule__Connaissance__VisibleAssignment_5_1 )
            {
             before(grammarAccess.getConnaissanceAccess().getVisibleAssignment_5_1()); 
            // InternalGame.g:4463:2: ( rule__Connaissance__VisibleAssignment_5_1 )
            // InternalGame.g:4463:3: rule__Connaissance__VisibleAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__VisibleAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getConnaissanceAccess().getVisibleAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group_5__1__Impl"


    // $ANTLR start "rule__Connaissance__Group_5__2"
    // InternalGame.g:4471:1: rule__Connaissance__Group_5__2 : rule__Connaissance__Group_5__2__Impl ;
    public final void rule__Connaissance__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4475:1: ( rule__Connaissance__Group_5__2__Impl )
            // InternalGame.g:4476:2: rule__Connaissance__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group_5__2"


    // $ANTLR start "rule__Connaissance__Group_5__2__Impl"
    // InternalGame.g:4482:1: rule__Connaissance__Group_5__2__Impl : ( ( rule__Connaissance__Group_5_2__0 )* ) ;
    public final void rule__Connaissance__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4486:1: ( ( ( rule__Connaissance__Group_5_2__0 )* ) )
            // InternalGame.g:4487:1: ( ( rule__Connaissance__Group_5_2__0 )* )
            {
            // InternalGame.g:4487:1: ( ( rule__Connaissance__Group_5_2__0 )* )
            // InternalGame.g:4488:2: ( rule__Connaissance__Group_5_2__0 )*
            {
             before(grammarAccess.getConnaissanceAccess().getGroup_5_2()); 
            // InternalGame.g:4489:2: ( rule__Connaissance__Group_5_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==17) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalGame.g:4489:3: rule__Connaissance__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Connaissance__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getConnaissanceAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group_5__2__Impl"


    // $ANTLR start "rule__Connaissance__Group_5_2__0"
    // InternalGame.g:4498:1: rule__Connaissance__Group_5_2__0 : rule__Connaissance__Group_5_2__0__Impl rule__Connaissance__Group_5_2__1 ;
    public final void rule__Connaissance__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4502:1: ( rule__Connaissance__Group_5_2__0__Impl rule__Connaissance__Group_5_2__1 )
            // InternalGame.g:4503:2: rule__Connaissance__Group_5_2__0__Impl rule__Connaissance__Group_5_2__1
            {
            pushFollow(FOLLOW_37);
            rule__Connaissance__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group_5_2__0"


    // $ANTLR start "rule__Connaissance__Group_5_2__0__Impl"
    // InternalGame.g:4510:1: rule__Connaissance__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Connaissance__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4514:1: ( ( ',' ) )
            // InternalGame.g:4515:1: ( ',' )
            {
            // InternalGame.g:4515:1: ( ',' )
            // InternalGame.g:4516:2: ','
            {
             before(grammarAccess.getConnaissanceAccess().getCommaKeyword_5_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getCommaKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group_5_2__0__Impl"


    // $ANTLR start "rule__Connaissance__Group_5_2__1"
    // InternalGame.g:4525:1: rule__Connaissance__Group_5_2__1 : rule__Connaissance__Group_5_2__1__Impl ;
    public final void rule__Connaissance__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4529:1: ( rule__Connaissance__Group_5_2__1__Impl )
            // InternalGame.g:4530:2: rule__Connaissance__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group_5_2__1"


    // $ANTLR start "rule__Connaissance__Group_5_2__1__Impl"
    // InternalGame.g:4536:1: rule__Connaissance__Group_5_2__1__Impl : ( ( rule__Connaissance__VisibleAssignment_5_2_1 ) ) ;
    public final void rule__Connaissance__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4540:1: ( ( ( rule__Connaissance__VisibleAssignment_5_2_1 ) ) )
            // InternalGame.g:4541:1: ( ( rule__Connaissance__VisibleAssignment_5_2_1 ) )
            {
            // InternalGame.g:4541:1: ( ( rule__Connaissance__VisibleAssignment_5_2_1 ) )
            // InternalGame.g:4542:2: ( rule__Connaissance__VisibleAssignment_5_2_1 )
            {
             before(grammarAccess.getConnaissanceAccess().getVisibleAssignment_5_2_1()); 
            // InternalGame.g:4543:2: ( rule__Connaissance__VisibleAssignment_5_2_1 )
            // InternalGame.g:4543:3: rule__Connaissance__VisibleAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__VisibleAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConnaissanceAccess().getVisibleAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group_5_2__1__Impl"


    // $ANTLR start "rule__Connaissance__Group_6__0"
    // InternalGame.g:4552:1: rule__Connaissance__Group_6__0 : rule__Connaissance__Group_6__0__Impl rule__Connaissance__Group_6__1 ;
    public final void rule__Connaissance__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4556:1: ( rule__Connaissance__Group_6__0__Impl rule__Connaissance__Group_6__1 )
            // InternalGame.g:4557:2: rule__Connaissance__Group_6__0__Impl rule__Connaissance__Group_6__1
            {
            pushFollow(FOLLOW_37);
            rule__Connaissance__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group_6__0"


    // $ANTLR start "rule__Connaissance__Group_6__0__Impl"
    // InternalGame.g:4564:1: rule__Connaissance__Group_6__0__Impl : ( 'actif' ) ;
    public final void rule__Connaissance__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4568:1: ( ( 'actif' ) )
            // InternalGame.g:4569:1: ( 'actif' )
            {
            // InternalGame.g:4569:1: ( 'actif' )
            // InternalGame.g:4570:2: 'actif'
            {
             before(grammarAccess.getConnaissanceAccess().getActifKeyword_6_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getActifKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group_6__0__Impl"


    // $ANTLR start "rule__Connaissance__Group_6__1"
    // InternalGame.g:4579:1: rule__Connaissance__Group_6__1 : rule__Connaissance__Group_6__1__Impl rule__Connaissance__Group_6__2 ;
    public final void rule__Connaissance__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4583:1: ( rule__Connaissance__Group_6__1__Impl rule__Connaissance__Group_6__2 )
            // InternalGame.g:4584:2: rule__Connaissance__Group_6__1__Impl rule__Connaissance__Group_6__2
            {
            pushFollow(FOLLOW_18);
            rule__Connaissance__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group_6__1"


    // $ANTLR start "rule__Connaissance__Group_6__1__Impl"
    // InternalGame.g:4591:1: rule__Connaissance__Group_6__1__Impl : ( ( rule__Connaissance__ActifAssignment_6_1 ) ) ;
    public final void rule__Connaissance__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4595:1: ( ( ( rule__Connaissance__ActifAssignment_6_1 ) ) )
            // InternalGame.g:4596:1: ( ( rule__Connaissance__ActifAssignment_6_1 ) )
            {
            // InternalGame.g:4596:1: ( ( rule__Connaissance__ActifAssignment_6_1 ) )
            // InternalGame.g:4597:2: ( rule__Connaissance__ActifAssignment_6_1 )
            {
             before(grammarAccess.getConnaissanceAccess().getActifAssignment_6_1()); 
            // InternalGame.g:4598:2: ( rule__Connaissance__ActifAssignment_6_1 )
            // InternalGame.g:4598:3: rule__Connaissance__ActifAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__ActifAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getConnaissanceAccess().getActifAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group_6__1__Impl"


    // $ANTLR start "rule__Connaissance__Group_6__2"
    // InternalGame.g:4606:1: rule__Connaissance__Group_6__2 : rule__Connaissance__Group_6__2__Impl ;
    public final void rule__Connaissance__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4610:1: ( rule__Connaissance__Group_6__2__Impl )
            // InternalGame.g:4611:2: rule__Connaissance__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group_6__2"


    // $ANTLR start "rule__Connaissance__Group_6__2__Impl"
    // InternalGame.g:4617:1: rule__Connaissance__Group_6__2__Impl : ( ( rule__Connaissance__Group_6_2__0 )* ) ;
    public final void rule__Connaissance__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4621:1: ( ( ( rule__Connaissance__Group_6_2__0 )* ) )
            // InternalGame.g:4622:1: ( ( rule__Connaissance__Group_6_2__0 )* )
            {
            // InternalGame.g:4622:1: ( ( rule__Connaissance__Group_6_2__0 )* )
            // InternalGame.g:4623:2: ( rule__Connaissance__Group_6_2__0 )*
            {
             before(grammarAccess.getConnaissanceAccess().getGroup_6_2()); 
            // InternalGame.g:4624:2: ( rule__Connaissance__Group_6_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==17) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalGame.g:4624:3: rule__Connaissance__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Connaissance__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getConnaissanceAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group_6__2__Impl"


    // $ANTLR start "rule__Connaissance__Group_6_2__0"
    // InternalGame.g:4633:1: rule__Connaissance__Group_6_2__0 : rule__Connaissance__Group_6_2__0__Impl rule__Connaissance__Group_6_2__1 ;
    public final void rule__Connaissance__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4637:1: ( rule__Connaissance__Group_6_2__0__Impl rule__Connaissance__Group_6_2__1 )
            // InternalGame.g:4638:2: rule__Connaissance__Group_6_2__0__Impl rule__Connaissance__Group_6_2__1
            {
            pushFollow(FOLLOW_37);
            rule__Connaissance__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group_6_2__0"


    // $ANTLR start "rule__Connaissance__Group_6_2__0__Impl"
    // InternalGame.g:4645:1: rule__Connaissance__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__Connaissance__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4649:1: ( ( ',' ) )
            // InternalGame.g:4650:1: ( ',' )
            {
            // InternalGame.g:4650:1: ( ',' )
            // InternalGame.g:4651:2: ','
            {
             before(grammarAccess.getConnaissanceAccess().getCommaKeyword_6_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getCommaKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group_6_2__0__Impl"


    // $ANTLR start "rule__Connaissance__Group_6_2__1"
    // InternalGame.g:4660:1: rule__Connaissance__Group_6_2__1 : rule__Connaissance__Group_6_2__1__Impl ;
    public final void rule__Connaissance__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4664:1: ( rule__Connaissance__Group_6_2__1__Impl )
            // InternalGame.g:4665:2: rule__Connaissance__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__Group_6_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group_6_2__1"


    // $ANTLR start "rule__Connaissance__Group_6_2__1__Impl"
    // InternalGame.g:4671:1: rule__Connaissance__Group_6_2__1__Impl : ( ( rule__Connaissance__ActifAssignment_6_2_1 ) ) ;
    public final void rule__Connaissance__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4675:1: ( ( ( rule__Connaissance__ActifAssignment_6_2_1 ) ) )
            // InternalGame.g:4676:1: ( ( rule__Connaissance__ActifAssignment_6_2_1 ) )
            {
            // InternalGame.g:4676:1: ( ( rule__Connaissance__ActifAssignment_6_2_1 ) )
            // InternalGame.g:4677:2: ( rule__Connaissance__ActifAssignment_6_2_1 )
            {
             before(grammarAccess.getConnaissanceAccess().getActifAssignment_6_2_1()); 
            // InternalGame.g:4678:2: ( rule__Connaissance__ActifAssignment_6_2_1 )
            // InternalGame.g:4678:3: rule__Connaissance__ActifAssignment_6_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__ActifAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConnaissanceAccess().getActifAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group_6_2__1__Impl"


    // $ANTLR start "rule__Objet__Group__0"
    // InternalGame.g:4687:1: rule__Objet__Group__0 : rule__Objet__Group__0__Impl rule__Objet__Group__1 ;
    public final void rule__Objet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4691:1: ( rule__Objet__Group__0__Impl rule__Objet__Group__1 )
            // InternalGame.g:4692:2: rule__Objet__Group__0__Impl rule__Objet__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Objet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__0"


    // $ANTLR start "rule__Objet__Group__0__Impl"
    // InternalGame.g:4699:1: rule__Objet__Group__0__Impl : ( () ) ;
    public final void rule__Objet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4703:1: ( ( () ) )
            // InternalGame.g:4704:1: ( () )
            {
            // InternalGame.g:4704:1: ( () )
            // InternalGame.g:4705:2: ()
            {
             before(grammarAccess.getObjetAccess().getObjetAction_0()); 
            // InternalGame.g:4706:2: ()
            // InternalGame.g:4706:3: 
            {
            }

             after(grammarAccess.getObjetAccess().getObjetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__0__Impl"


    // $ANTLR start "rule__Objet__Group__1"
    // InternalGame.g:4714:1: rule__Objet__Group__1 : rule__Objet__Group__1__Impl rule__Objet__Group__2 ;
    public final void rule__Objet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4718:1: ( rule__Objet__Group__1__Impl rule__Objet__Group__2 )
            // InternalGame.g:4719:2: rule__Objet__Group__1__Impl rule__Objet__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Objet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__1"


    // $ANTLR start "rule__Objet__Group__1__Impl"
    // InternalGame.g:4726:1: rule__Objet__Group__1__Impl : ( ( rule__Objet__TransformableAssignment_1 )? ) ;
    public final void rule__Objet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4730:1: ( ( ( rule__Objet__TransformableAssignment_1 )? ) )
            // InternalGame.g:4731:1: ( ( rule__Objet__TransformableAssignment_1 )? )
            {
            // InternalGame.g:4731:1: ( ( rule__Objet__TransformableAssignment_1 )? )
            // InternalGame.g:4732:2: ( rule__Objet__TransformableAssignment_1 )?
            {
             before(grammarAccess.getObjetAccess().getTransformableAssignment_1()); 
            // InternalGame.g:4733:2: ( rule__Objet__TransformableAssignment_1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==62) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalGame.g:4733:3: rule__Objet__TransformableAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Objet__TransformableAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjetAccess().getTransformableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__1__Impl"


    // $ANTLR start "rule__Objet__Group__2"
    // InternalGame.g:4741:1: rule__Objet__Group__2 : rule__Objet__Group__2__Impl rule__Objet__Group__3 ;
    public final void rule__Objet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4745:1: ( rule__Objet__Group__2__Impl rule__Objet__Group__3 )
            // InternalGame.g:4746:2: rule__Objet__Group__2__Impl rule__Objet__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Objet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__2"


    // $ANTLR start "rule__Objet__Group__2__Impl"
    // InternalGame.g:4753:1: rule__Objet__Group__2__Impl : ( 'Objet' ) ;
    public final void rule__Objet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4757:1: ( ( 'Objet' ) )
            // InternalGame.g:4758:1: ( 'Objet' )
            {
            // InternalGame.g:4758:1: ( 'Objet' )
            // InternalGame.g:4759:2: 'Objet'
            {
             before(grammarAccess.getObjetAccess().getObjetKeyword_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getObjetKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__2__Impl"


    // $ANTLR start "rule__Objet__Group__3"
    // InternalGame.g:4768:1: rule__Objet__Group__3 : rule__Objet__Group__3__Impl rule__Objet__Group__4 ;
    public final void rule__Objet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4772:1: ( rule__Objet__Group__3__Impl rule__Objet__Group__4 )
            // InternalGame.g:4773:2: rule__Objet__Group__3__Impl rule__Objet__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Objet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__3"


    // $ANTLR start "rule__Objet__Group__3__Impl"
    // InternalGame.g:4780:1: rule__Objet__Group__3__Impl : ( ( rule__Objet__NameAssignment_3 ) ) ;
    public final void rule__Objet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4784:1: ( ( ( rule__Objet__NameAssignment_3 ) ) )
            // InternalGame.g:4785:1: ( ( rule__Objet__NameAssignment_3 ) )
            {
            // InternalGame.g:4785:1: ( ( rule__Objet__NameAssignment_3 ) )
            // InternalGame.g:4786:2: ( rule__Objet__NameAssignment_3 )
            {
             before(grammarAccess.getObjetAccess().getNameAssignment_3()); 
            // InternalGame.g:4787:2: ( rule__Objet__NameAssignment_3 )
            // InternalGame.g:4787:3: rule__Objet__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Objet__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__3__Impl"


    // $ANTLR start "rule__Objet__Group__4"
    // InternalGame.g:4795:1: rule__Objet__Group__4 : rule__Objet__Group__4__Impl rule__Objet__Group__5 ;
    public final void rule__Objet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4799:1: ( rule__Objet__Group__4__Impl rule__Objet__Group__5 )
            // InternalGame.g:4800:2: rule__Objet__Group__4__Impl rule__Objet__Group__5
            {
            pushFollow(FOLLOW_38);
            rule__Objet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__4"


    // $ANTLR start "rule__Objet__Group__4__Impl"
    // InternalGame.g:4807:1: rule__Objet__Group__4__Impl : ( '{' ) ;
    public final void rule__Objet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4811:1: ( ( '{' ) )
            // InternalGame.g:4812:1: ( '{' )
            {
            // InternalGame.g:4812:1: ( '{' )
            // InternalGame.g:4813:2: '{'
            {
             before(grammarAccess.getObjetAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__4__Impl"


    // $ANTLR start "rule__Objet__Group__5"
    // InternalGame.g:4822:1: rule__Objet__Group__5 : rule__Objet__Group__5__Impl rule__Objet__Group__6 ;
    public final void rule__Objet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4826:1: ( rule__Objet__Group__5__Impl rule__Objet__Group__6 )
            // InternalGame.g:4827:2: rule__Objet__Group__5__Impl rule__Objet__Group__6
            {
            pushFollow(FOLLOW_38);
            rule__Objet__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__5"


    // $ANTLR start "rule__Objet__Group__5__Impl"
    // InternalGame.g:4834:1: rule__Objet__Group__5__Impl : ( ( rule__Objet__Group_5__0 )? ) ;
    public final void rule__Objet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4838:1: ( ( ( rule__Objet__Group_5__0 )? ) )
            // InternalGame.g:4839:1: ( ( rule__Objet__Group_5__0 )? )
            {
            // InternalGame.g:4839:1: ( ( rule__Objet__Group_5__0 )? )
            // InternalGame.g:4840:2: ( rule__Objet__Group_5__0 )?
            {
             before(grammarAccess.getObjetAccess().getGroup_5()); 
            // InternalGame.g:4841:2: ( rule__Objet__Group_5__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==49) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalGame.g:4841:3: rule__Objet__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Objet__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjetAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__5__Impl"


    // $ANTLR start "rule__Objet__Group__6"
    // InternalGame.g:4849:1: rule__Objet__Group__6 : rule__Objet__Group__6__Impl rule__Objet__Group__7 ;
    public final void rule__Objet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4853:1: ( rule__Objet__Group__6__Impl rule__Objet__Group__7 )
            // InternalGame.g:4854:2: rule__Objet__Group__6__Impl rule__Objet__Group__7
            {
            pushFollow(FOLLOW_38);
            rule__Objet__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__6"


    // $ANTLR start "rule__Objet__Group__6__Impl"
    // InternalGame.g:4861:1: rule__Objet__Group__6__Impl : ( ( rule__Objet__Group_6__0 )? ) ;
    public final void rule__Objet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4865:1: ( ( ( rule__Objet__Group_6__0 )? ) )
            // InternalGame.g:4866:1: ( ( rule__Objet__Group_6__0 )? )
            {
            // InternalGame.g:4866:1: ( ( rule__Objet__Group_6__0 )? )
            // InternalGame.g:4867:2: ( rule__Objet__Group_6__0 )?
            {
             before(grammarAccess.getObjetAccess().getGroup_6()); 
            // InternalGame.g:4868:2: ( rule__Objet__Group_6__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==21) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalGame.g:4868:3: rule__Objet__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Objet__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjetAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__6__Impl"


    // $ANTLR start "rule__Objet__Group__7"
    // InternalGame.g:4876:1: rule__Objet__Group__7 : rule__Objet__Group__7__Impl rule__Objet__Group__8 ;
    public final void rule__Objet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4880:1: ( rule__Objet__Group__7__Impl rule__Objet__Group__8 )
            // InternalGame.g:4881:2: rule__Objet__Group__7__Impl rule__Objet__Group__8
            {
            pushFollow(FOLLOW_38);
            rule__Objet__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__7"


    // $ANTLR start "rule__Objet__Group__7__Impl"
    // InternalGame.g:4888:1: rule__Objet__Group__7__Impl : ( ( rule__Objet__Group_7__0 )? ) ;
    public final void rule__Objet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4892:1: ( ( ( rule__Objet__Group_7__0 )? ) )
            // InternalGame.g:4893:1: ( ( rule__Objet__Group_7__0 )? )
            {
            // InternalGame.g:4893:1: ( ( rule__Objet__Group_7__0 )? )
            // InternalGame.g:4894:2: ( rule__Objet__Group_7__0 )?
            {
             before(grammarAccess.getObjetAccess().getGroup_7()); 
            // InternalGame.g:4895:2: ( rule__Objet__Group_7__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==31) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalGame.g:4895:3: rule__Objet__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Objet__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjetAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__7__Impl"


    // $ANTLR start "rule__Objet__Group__8"
    // InternalGame.g:4903:1: rule__Objet__Group__8 : rule__Objet__Group__8__Impl rule__Objet__Group__9 ;
    public final void rule__Objet__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4907:1: ( rule__Objet__Group__8__Impl rule__Objet__Group__9 )
            // InternalGame.g:4908:2: rule__Objet__Group__8__Impl rule__Objet__Group__9
            {
            pushFollow(FOLLOW_38);
            rule__Objet__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__8"


    // $ANTLR start "rule__Objet__Group__8__Impl"
    // InternalGame.g:4915:1: rule__Objet__Group__8__Impl : ( ( rule__Objet__Group_8__0 )? ) ;
    public final void rule__Objet__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4919:1: ( ( ( rule__Objet__Group_8__0 )? ) )
            // InternalGame.g:4920:1: ( ( rule__Objet__Group_8__0 )? )
            {
            // InternalGame.g:4920:1: ( ( rule__Objet__Group_8__0 )? )
            // InternalGame.g:4921:2: ( rule__Objet__Group_8__0 )?
            {
             before(grammarAccess.getObjetAccess().getGroup_8()); 
            // InternalGame.g:4922:2: ( rule__Objet__Group_8__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==47) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalGame.g:4922:3: rule__Objet__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Objet__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjetAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__8__Impl"


    // $ANTLR start "rule__Objet__Group__9"
    // InternalGame.g:4930:1: rule__Objet__Group__9 : rule__Objet__Group__9__Impl ;
    public final void rule__Objet__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4934:1: ( rule__Objet__Group__9__Impl )
            // InternalGame.g:4935:2: rule__Objet__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Objet__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__9"


    // $ANTLR start "rule__Objet__Group__9__Impl"
    // InternalGame.g:4941:1: rule__Objet__Group__9__Impl : ( '}' ) ;
    public final void rule__Objet__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4945:1: ( ( '}' ) )
            // InternalGame.g:4946:1: ( '}' )
            {
            // InternalGame.g:4946:1: ( '}' )
            // InternalGame.g:4947:2: '}'
            {
             before(grammarAccess.getObjetAccess().getRightCurlyBracketKeyword_9()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__9__Impl"


    // $ANTLR start "rule__Objet__Group_5__0"
    // InternalGame.g:4957:1: rule__Objet__Group_5__0 : rule__Objet__Group_5__0__Impl rule__Objet__Group_5__1 ;
    public final void rule__Objet__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4961:1: ( rule__Objet__Group_5__0__Impl rule__Objet__Group_5__1 )
            // InternalGame.g:4962:2: rule__Objet__Group_5__0__Impl rule__Objet__Group_5__1
            {
            pushFollow(FOLLOW_14);
            rule__Objet__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_5__0"


    // $ANTLR start "rule__Objet__Group_5__0__Impl"
    // InternalGame.g:4969:1: rule__Objet__Group_5__0__Impl : ( 'qte' ) ;
    public final void rule__Objet__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4973:1: ( ( 'qte' ) )
            // InternalGame.g:4974:1: ( 'qte' )
            {
            // InternalGame.g:4974:1: ( 'qte' )
            // InternalGame.g:4975:2: 'qte'
            {
             before(grammarAccess.getObjetAccess().getQteKeyword_5_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getQteKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_5__0__Impl"


    // $ANTLR start "rule__Objet__Group_5__1"
    // InternalGame.g:4984:1: rule__Objet__Group_5__1 : rule__Objet__Group_5__1__Impl ;
    public final void rule__Objet__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4988:1: ( rule__Objet__Group_5__1__Impl )
            // InternalGame.g:4989:2: rule__Objet__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Objet__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_5__1"


    // $ANTLR start "rule__Objet__Group_5__1__Impl"
    // InternalGame.g:4995:1: rule__Objet__Group_5__1__Impl : ( ( rule__Objet__QteAssignment_5_1 ) ) ;
    public final void rule__Objet__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4999:1: ( ( ( rule__Objet__QteAssignment_5_1 ) ) )
            // InternalGame.g:5000:1: ( ( rule__Objet__QteAssignment_5_1 ) )
            {
            // InternalGame.g:5000:1: ( ( rule__Objet__QteAssignment_5_1 ) )
            // InternalGame.g:5001:2: ( rule__Objet__QteAssignment_5_1 )
            {
             before(grammarAccess.getObjetAccess().getQteAssignment_5_1()); 
            // InternalGame.g:5002:2: ( rule__Objet__QteAssignment_5_1 )
            // InternalGame.g:5002:3: rule__Objet__QteAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Objet__QteAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getQteAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_5__1__Impl"


    // $ANTLR start "rule__Objet__Group_6__0"
    // InternalGame.g:5011:1: rule__Objet__Group_6__0 : rule__Objet__Group_6__0__Impl rule__Objet__Group_6__1 ;
    public final void rule__Objet__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5015:1: ( rule__Objet__Group_6__0__Impl rule__Objet__Group_6__1 )
            // InternalGame.g:5016:2: rule__Objet__Group_6__0__Impl rule__Objet__Group_6__1
            {
            pushFollow(FOLLOW_14);
            rule__Objet__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_6__0"


    // $ANTLR start "rule__Objet__Group_6__0__Impl"
    // InternalGame.g:5023:1: rule__Objet__Group_6__0__Impl : ( 'taille' ) ;
    public final void rule__Objet__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5027:1: ( ( 'taille' ) )
            // InternalGame.g:5028:1: ( 'taille' )
            {
            // InternalGame.g:5028:1: ( 'taille' )
            // InternalGame.g:5029:2: 'taille'
            {
             before(grammarAccess.getObjetAccess().getTailleKeyword_6_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getTailleKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_6__0__Impl"


    // $ANTLR start "rule__Objet__Group_6__1"
    // InternalGame.g:5038:1: rule__Objet__Group_6__1 : rule__Objet__Group_6__1__Impl ;
    public final void rule__Objet__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5042:1: ( rule__Objet__Group_6__1__Impl )
            // InternalGame.g:5043:2: rule__Objet__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Objet__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_6__1"


    // $ANTLR start "rule__Objet__Group_6__1__Impl"
    // InternalGame.g:5049:1: rule__Objet__Group_6__1__Impl : ( ( rule__Objet__TailleAssignment_6_1 ) ) ;
    public final void rule__Objet__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5053:1: ( ( ( rule__Objet__TailleAssignment_6_1 ) ) )
            // InternalGame.g:5054:1: ( ( rule__Objet__TailleAssignment_6_1 ) )
            {
            // InternalGame.g:5054:1: ( ( rule__Objet__TailleAssignment_6_1 ) )
            // InternalGame.g:5055:2: ( rule__Objet__TailleAssignment_6_1 )
            {
             before(grammarAccess.getObjetAccess().getTailleAssignment_6_1()); 
            // InternalGame.g:5056:2: ( rule__Objet__TailleAssignment_6_1 )
            // InternalGame.g:5056:3: rule__Objet__TailleAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Objet__TailleAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getTailleAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_6__1__Impl"


    // $ANTLR start "rule__Objet__Group_7__0"
    // InternalGame.g:5065:1: rule__Objet__Group_7__0 : rule__Objet__Group_7__0__Impl rule__Objet__Group_7__1 ;
    public final void rule__Objet__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5069:1: ( rule__Objet__Group_7__0__Impl rule__Objet__Group_7__1 )
            // InternalGame.g:5070:2: rule__Objet__Group_7__0__Impl rule__Objet__Group_7__1
            {
            pushFollow(FOLLOW_37);
            rule__Objet__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_7__0"


    // $ANTLR start "rule__Objet__Group_7__0__Impl"
    // InternalGame.g:5077:1: rule__Objet__Group_7__0__Impl : ( 'visible' ) ;
    public final void rule__Objet__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5081:1: ( ( 'visible' ) )
            // InternalGame.g:5082:1: ( 'visible' )
            {
            // InternalGame.g:5082:1: ( 'visible' )
            // InternalGame.g:5083:2: 'visible'
            {
             before(grammarAccess.getObjetAccess().getVisibleKeyword_7_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getVisibleKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_7__0__Impl"


    // $ANTLR start "rule__Objet__Group_7__1"
    // InternalGame.g:5092:1: rule__Objet__Group_7__1 : rule__Objet__Group_7__1__Impl rule__Objet__Group_7__2 ;
    public final void rule__Objet__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5096:1: ( rule__Objet__Group_7__1__Impl rule__Objet__Group_7__2 )
            // InternalGame.g:5097:2: rule__Objet__Group_7__1__Impl rule__Objet__Group_7__2
            {
            pushFollow(FOLLOW_18);
            rule__Objet__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_7__1"


    // $ANTLR start "rule__Objet__Group_7__1__Impl"
    // InternalGame.g:5104:1: rule__Objet__Group_7__1__Impl : ( ( rule__Objet__VisibleAssignment_7_1 ) ) ;
    public final void rule__Objet__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5108:1: ( ( ( rule__Objet__VisibleAssignment_7_1 ) ) )
            // InternalGame.g:5109:1: ( ( rule__Objet__VisibleAssignment_7_1 ) )
            {
            // InternalGame.g:5109:1: ( ( rule__Objet__VisibleAssignment_7_1 ) )
            // InternalGame.g:5110:2: ( rule__Objet__VisibleAssignment_7_1 )
            {
             before(grammarAccess.getObjetAccess().getVisibleAssignment_7_1()); 
            // InternalGame.g:5111:2: ( rule__Objet__VisibleAssignment_7_1 )
            // InternalGame.g:5111:3: rule__Objet__VisibleAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Objet__VisibleAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getVisibleAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_7__1__Impl"


    // $ANTLR start "rule__Objet__Group_7__2"
    // InternalGame.g:5119:1: rule__Objet__Group_7__2 : rule__Objet__Group_7__2__Impl ;
    public final void rule__Objet__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5123:1: ( rule__Objet__Group_7__2__Impl )
            // InternalGame.g:5124:2: rule__Objet__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Objet__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_7__2"


    // $ANTLR start "rule__Objet__Group_7__2__Impl"
    // InternalGame.g:5130:1: rule__Objet__Group_7__2__Impl : ( ( rule__Objet__Group_7_2__0 )* ) ;
    public final void rule__Objet__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5134:1: ( ( ( rule__Objet__Group_7_2__0 )* ) )
            // InternalGame.g:5135:1: ( ( rule__Objet__Group_7_2__0 )* )
            {
            // InternalGame.g:5135:1: ( ( rule__Objet__Group_7_2__0 )* )
            // InternalGame.g:5136:2: ( rule__Objet__Group_7_2__0 )*
            {
             before(grammarAccess.getObjetAccess().getGroup_7_2()); 
            // InternalGame.g:5137:2: ( rule__Objet__Group_7_2__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==17) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalGame.g:5137:3: rule__Objet__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Objet__Group_7_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getObjetAccess().getGroup_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_7__2__Impl"


    // $ANTLR start "rule__Objet__Group_7_2__0"
    // InternalGame.g:5146:1: rule__Objet__Group_7_2__0 : rule__Objet__Group_7_2__0__Impl rule__Objet__Group_7_2__1 ;
    public final void rule__Objet__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5150:1: ( rule__Objet__Group_7_2__0__Impl rule__Objet__Group_7_2__1 )
            // InternalGame.g:5151:2: rule__Objet__Group_7_2__0__Impl rule__Objet__Group_7_2__1
            {
            pushFollow(FOLLOW_37);
            rule__Objet__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group_7_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_7_2__0"


    // $ANTLR start "rule__Objet__Group_7_2__0__Impl"
    // InternalGame.g:5158:1: rule__Objet__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__Objet__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5162:1: ( ( ',' ) )
            // InternalGame.g:5163:1: ( ',' )
            {
            // InternalGame.g:5163:1: ( ',' )
            // InternalGame.g:5164:2: ','
            {
             before(grammarAccess.getObjetAccess().getCommaKeyword_7_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getCommaKeyword_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_7_2__0__Impl"


    // $ANTLR start "rule__Objet__Group_7_2__1"
    // InternalGame.g:5173:1: rule__Objet__Group_7_2__1 : rule__Objet__Group_7_2__1__Impl ;
    public final void rule__Objet__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5177:1: ( rule__Objet__Group_7_2__1__Impl )
            // InternalGame.g:5178:2: rule__Objet__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Objet__Group_7_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_7_2__1"


    // $ANTLR start "rule__Objet__Group_7_2__1__Impl"
    // InternalGame.g:5184:1: rule__Objet__Group_7_2__1__Impl : ( ( rule__Objet__VisibleAssignment_7_2_1 ) ) ;
    public final void rule__Objet__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5188:1: ( ( ( rule__Objet__VisibleAssignment_7_2_1 ) ) )
            // InternalGame.g:5189:1: ( ( rule__Objet__VisibleAssignment_7_2_1 ) )
            {
            // InternalGame.g:5189:1: ( ( rule__Objet__VisibleAssignment_7_2_1 ) )
            // InternalGame.g:5190:2: ( rule__Objet__VisibleAssignment_7_2_1 )
            {
             before(grammarAccess.getObjetAccess().getVisibleAssignment_7_2_1()); 
            // InternalGame.g:5191:2: ( rule__Objet__VisibleAssignment_7_2_1 )
            // InternalGame.g:5191:3: rule__Objet__VisibleAssignment_7_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Objet__VisibleAssignment_7_2_1();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getVisibleAssignment_7_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_7_2__1__Impl"


    // $ANTLR start "rule__Objet__Group_8__0"
    // InternalGame.g:5200:1: rule__Objet__Group_8__0 : rule__Objet__Group_8__0__Impl rule__Objet__Group_8__1 ;
    public final void rule__Objet__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5204:1: ( rule__Objet__Group_8__0__Impl rule__Objet__Group_8__1 )
            // InternalGame.g:5205:2: rule__Objet__Group_8__0__Impl rule__Objet__Group_8__1
            {
            pushFollow(FOLLOW_37);
            rule__Objet__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_8__0"


    // $ANTLR start "rule__Objet__Group_8__0__Impl"
    // InternalGame.g:5212:1: rule__Objet__Group_8__0__Impl : ( 'actif' ) ;
    public final void rule__Objet__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5216:1: ( ( 'actif' ) )
            // InternalGame.g:5217:1: ( 'actif' )
            {
            // InternalGame.g:5217:1: ( 'actif' )
            // InternalGame.g:5218:2: 'actif'
            {
             before(grammarAccess.getObjetAccess().getActifKeyword_8_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getActifKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_8__0__Impl"


    // $ANTLR start "rule__Objet__Group_8__1"
    // InternalGame.g:5227:1: rule__Objet__Group_8__1 : rule__Objet__Group_8__1__Impl rule__Objet__Group_8__2 ;
    public final void rule__Objet__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5231:1: ( rule__Objet__Group_8__1__Impl rule__Objet__Group_8__2 )
            // InternalGame.g:5232:2: rule__Objet__Group_8__1__Impl rule__Objet__Group_8__2
            {
            pushFollow(FOLLOW_18);
            rule__Objet__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_8__1"


    // $ANTLR start "rule__Objet__Group_8__1__Impl"
    // InternalGame.g:5239:1: rule__Objet__Group_8__1__Impl : ( ( rule__Objet__ActifAssignment_8_1 ) ) ;
    public final void rule__Objet__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5243:1: ( ( ( rule__Objet__ActifAssignment_8_1 ) ) )
            // InternalGame.g:5244:1: ( ( rule__Objet__ActifAssignment_8_1 ) )
            {
            // InternalGame.g:5244:1: ( ( rule__Objet__ActifAssignment_8_1 ) )
            // InternalGame.g:5245:2: ( rule__Objet__ActifAssignment_8_1 )
            {
             before(grammarAccess.getObjetAccess().getActifAssignment_8_1()); 
            // InternalGame.g:5246:2: ( rule__Objet__ActifAssignment_8_1 )
            // InternalGame.g:5246:3: rule__Objet__ActifAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Objet__ActifAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getActifAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_8__1__Impl"


    // $ANTLR start "rule__Objet__Group_8__2"
    // InternalGame.g:5254:1: rule__Objet__Group_8__2 : rule__Objet__Group_8__2__Impl ;
    public final void rule__Objet__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5258:1: ( rule__Objet__Group_8__2__Impl )
            // InternalGame.g:5259:2: rule__Objet__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Objet__Group_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_8__2"


    // $ANTLR start "rule__Objet__Group_8__2__Impl"
    // InternalGame.g:5265:1: rule__Objet__Group_8__2__Impl : ( ( rule__Objet__Group_8_2__0 )* ) ;
    public final void rule__Objet__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5269:1: ( ( ( rule__Objet__Group_8_2__0 )* ) )
            // InternalGame.g:5270:1: ( ( rule__Objet__Group_8_2__0 )* )
            {
            // InternalGame.g:5270:1: ( ( rule__Objet__Group_8_2__0 )* )
            // InternalGame.g:5271:2: ( rule__Objet__Group_8_2__0 )*
            {
             before(grammarAccess.getObjetAccess().getGroup_8_2()); 
            // InternalGame.g:5272:2: ( rule__Objet__Group_8_2__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==17) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalGame.g:5272:3: rule__Objet__Group_8_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Objet__Group_8_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getObjetAccess().getGroup_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_8__2__Impl"


    // $ANTLR start "rule__Objet__Group_8_2__0"
    // InternalGame.g:5281:1: rule__Objet__Group_8_2__0 : rule__Objet__Group_8_2__0__Impl rule__Objet__Group_8_2__1 ;
    public final void rule__Objet__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5285:1: ( rule__Objet__Group_8_2__0__Impl rule__Objet__Group_8_2__1 )
            // InternalGame.g:5286:2: rule__Objet__Group_8_2__0__Impl rule__Objet__Group_8_2__1
            {
            pushFollow(FOLLOW_37);
            rule__Objet__Group_8_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group_8_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_8_2__0"


    // $ANTLR start "rule__Objet__Group_8_2__0__Impl"
    // InternalGame.g:5293:1: rule__Objet__Group_8_2__0__Impl : ( ',' ) ;
    public final void rule__Objet__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5297:1: ( ( ',' ) )
            // InternalGame.g:5298:1: ( ',' )
            {
            // InternalGame.g:5298:1: ( ',' )
            // InternalGame.g:5299:2: ','
            {
             before(grammarAccess.getObjetAccess().getCommaKeyword_8_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getCommaKeyword_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_8_2__0__Impl"


    // $ANTLR start "rule__Objet__Group_8_2__1"
    // InternalGame.g:5308:1: rule__Objet__Group_8_2__1 : rule__Objet__Group_8_2__1__Impl ;
    public final void rule__Objet__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5312:1: ( rule__Objet__Group_8_2__1__Impl )
            // InternalGame.g:5313:2: rule__Objet__Group_8_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Objet__Group_8_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_8_2__1"


    // $ANTLR start "rule__Objet__Group_8_2__1__Impl"
    // InternalGame.g:5319:1: rule__Objet__Group_8_2__1__Impl : ( ( rule__Objet__ActifAssignment_8_2_1 ) ) ;
    public final void rule__Objet__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5323:1: ( ( ( rule__Objet__ActifAssignment_8_2_1 ) ) )
            // InternalGame.g:5324:1: ( ( rule__Objet__ActifAssignment_8_2_1 ) )
            {
            // InternalGame.g:5324:1: ( ( rule__Objet__ActifAssignment_8_2_1 ) )
            // InternalGame.g:5325:2: ( rule__Objet__ActifAssignment_8_2_1 )
            {
             before(grammarAccess.getObjetAccess().getActifAssignment_8_2_1()); 
            // InternalGame.g:5326:2: ( rule__Objet__ActifAssignment_8_2_1 )
            // InternalGame.g:5326:3: rule__Objet__ActifAssignment_8_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Objet__ActifAssignment_8_2_1();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getActifAssignment_8_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_8_2__1__Impl"


    // $ANTLR start "rule__ConditionAvantage__Group__0"
    // InternalGame.g:5335:1: rule__ConditionAvantage__Group__0 : rule__ConditionAvantage__Group__0__Impl rule__ConditionAvantage__Group__1 ;
    public final void rule__ConditionAvantage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5339:1: ( rule__ConditionAvantage__Group__0__Impl rule__ConditionAvantage__Group__1 )
            // InternalGame.g:5340:2: rule__ConditionAvantage__Group__0__Impl rule__ConditionAvantage__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__ConditionAvantage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionAvantage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group__0"


    // $ANTLR start "rule__ConditionAvantage__Group__0__Impl"
    // InternalGame.g:5347:1: rule__ConditionAvantage__Group__0__Impl : ( () ) ;
    public final void rule__ConditionAvantage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5351:1: ( ( () ) )
            // InternalGame.g:5352:1: ( () )
            {
            // InternalGame.g:5352:1: ( () )
            // InternalGame.g:5353:2: ()
            {
             before(grammarAccess.getConditionAvantageAccess().getConditionAvantageAction_0()); 
            // InternalGame.g:5354:2: ()
            // InternalGame.g:5354:3: 
            {
            }

             after(grammarAccess.getConditionAvantageAccess().getConditionAvantageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group__0__Impl"


    // $ANTLR start "rule__ConditionAvantage__Group__1"
    // InternalGame.g:5362:1: rule__ConditionAvantage__Group__1 : rule__ConditionAvantage__Group__1__Impl rule__ConditionAvantage__Group__2 ;
    public final void rule__ConditionAvantage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5366:1: ( rule__ConditionAvantage__Group__1__Impl rule__ConditionAvantage__Group__2 )
            // InternalGame.g:5367:2: rule__ConditionAvantage__Group__1__Impl rule__ConditionAvantage__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ConditionAvantage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionAvantage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group__1"


    // $ANTLR start "rule__ConditionAvantage__Group__1__Impl"
    // InternalGame.g:5374:1: rule__ConditionAvantage__Group__1__Impl : ( 'ConditionAvantage' ) ;
    public final void rule__ConditionAvantage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5378:1: ( ( 'ConditionAvantage' ) )
            // InternalGame.g:5379:1: ( 'ConditionAvantage' )
            {
            // InternalGame.g:5379:1: ( 'ConditionAvantage' )
            // InternalGame.g:5380:2: 'ConditionAvantage'
            {
             before(grammarAccess.getConditionAvantageAccess().getConditionAvantageKeyword_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getConditionAvantageAccess().getConditionAvantageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group__1__Impl"


    // $ANTLR start "rule__ConditionAvantage__Group__2"
    // InternalGame.g:5389:1: rule__ConditionAvantage__Group__2 : rule__ConditionAvantage__Group__2__Impl rule__ConditionAvantage__Group__3 ;
    public final void rule__ConditionAvantage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5393:1: ( rule__ConditionAvantage__Group__2__Impl rule__ConditionAvantage__Group__3 )
            // InternalGame.g:5394:2: rule__ConditionAvantage__Group__2__Impl rule__ConditionAvantage__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ConditionAvantage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionAvantage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group__2"


    // $ANTLR start "rule__ConditionAvantage__Group__2__Impl"
    // InternalGame.g:5401:1: rule__ConditionAvantage__Group__2__Impl : ( ( rule__ConditionAvantage__NameAssignment_2 ) ) ;
    public final void rule__ConditionAvantage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5405:1: ( ( ( rule__ConditionAvantage__NameAssignment_2 ) ) )
            // InternalGame.g:5406:1: ( ( rule__ConditionAvantage__NameAssignment_2 ) )
            {
            // InternalGame.g:5406:1: ( ( rule__ConditionAvantage__NameAssignment_2 ) )
            // InternalGame.g:5407:2: ( rule__ConditionAvantage__NameAssignment_2 )
            {
             before(grammarAccess.getConditionAvantageAccess().getNameAssignment_2()); 
            // InternalGame.g:5408:2: ( rule__ConditionAvantage__NameAssignment_2 )
            // InternalGame.g:5408:3: rule__ConditionAvantage__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConditionAvantage__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionAvantageAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group__2__Impl"


    // $ANTLR start "rule__ConditionAvantage__Group__3"
    // InternalGame.g:5416:1: rule__ConditionAvantage__Group__3 : rule__ConditionAvantage__Group__3__Impl rule__ConditionAvantage__Group__4 ;
    public final void rule__ConditionAvantage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5420:1: ( rule__ConditionAvantage__Group__3__Impl rule__ConditionAvantage__Group__4 )
            // InternalGame.g:5421:2: rule__ConditionAvantage__Group__3__Impl rule__ConditionAvantage__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__ConditionAvantage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionAvantage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group__3"


    // $ANTLR start "rule__ConditionAvantage__Group__3__Impl"
    // InternalGame.g:5428:1: rule__ConditionAvantage__Group__3__Impl : ( '{' ) ;
    public final void rule__ConditionAvantage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5432:1: ( ( '{' ) )
            // InternalGame.g:5433:1: ( '{' )
            {
            // InternalGame.g:5433:1: ( '{' )
            // InternalGame.g:5434:2: '{'
            {
             before(grammarAccess.getConditionAvantageAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getConditionAvantageAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group__3__Impl"


    // $ANTLR start "rule__ConditionAvantage__Group__4"
    // InternalGame.g:5443:1: rule__ConditionAvantage__Group__4 : rule__ConditionAvantage__Group__4__Impl rule__ConditionAvantage__Group__5 ;
    public final void rule__ConditionAvantage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5447:1: ( rule__ConditionAvantage__Group__4__Impl rule__ConditionAvantage__Group__5 )
            // InternalGame.g:5448:2: rule__ConditionAvantage__Group__4__Impl rule__ConditionAvantage__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__ConditionAvantage__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionAvantage__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group__4"


    // $ANTLR start "rule__ConditionAvantage__Group__4__Impl"
    // InternalGame.g:5455:1: rule__ConditionAvantage__Group__4__Impl : ( ( rule__ConditionAvantage__Group_4__0 )? ) ;
    public final void rule__ConditionAvantage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5459:1: ( ( ( rule__ConditionAvantage__Group_4__0 )? ) )
            // InternalGame.g:5460:1: ( ( rule__ConditionAvantage__Group_4__0 )? )
            {
            // InternalGame.g:5460:1: ( ( rule__ConditionAvantage__Group_4__0 )? )
            // InternalGame.g:5461:2: ( rule__ConditionAvantage__Group_4__0 )?
            {
             before(grammarAccess.getConditionAvantageAccess().getGroup_4()); 
            // InternalGame.g:5462:2: ( rule__ConditionAvantage__Group_4__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==38) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalGame.g:5462:3: rule__ConditionAvantage__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionAvantage__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionAvantageAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group__4__Impl"


    // $ANTLR start "rule__ConditionAvantage__Group__5"
    // InternalGame.g:5470:1: rule__ConditionAvantage__Group__5 : rule__ConditionAvantage__Group__5__Impl rule__ConditionAvantage__Group__6 ;
    public final void rule__ConditionAvantage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5474:1: ( rule__ConditionAvantage__Group__5__Impl rule__ConditionAvantage__Group__6 )
            // InternalGame.g:5475:2: rule__ConditionAvantage__Group__5__Impl rule__ConditionAvantage__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__ConditionAvantage__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionAvantage__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group__5"


    // $ANTLR start "rule__ConditionAvantage__Group__5__Impl"
    // InternalGame.g:5482:1: rule__ConditionAvantage__Group__5__Impl : ( ( rule__ConditionAvantage__Group_5__0 )? ) ;
    public final void rule__ConditionAvantage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5486:1: ( ( ( rule__ConditionAvantage__Group_5__0 )? ) )
            // InternalGame.g:5487:1: ( ( rule__ConditionAvantage__Group_5__0 )? )
            {
            // InternalGame.g:5487:1: ( ( rule__ConditionAvantage__Group_5__0 )? )
            // InternalGame.g:5488:2: ( rule__ConditionAvantage__Group_5__0 )?
            {
             before(grammarAccess.getConditionAvantageAccess().getGroup_5()); 
            // InternalGame.g:5489:2: ( rule__ConditionAvantage__Group_5__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==39) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalGame.g:5489:3: rule__ConditionAvantage__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionAvantage__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionAvantageAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group__5__Impl"


    // $ANTLR start "rule__ConditionAvantage__Group__6"
    // InternalGame.g:5497:1: rule__ConditionAvantage__Group__6 : rule__ConditionAvantage__Group__6__Impl rule__ConditionAvantage__Group__7 ;
    public final void rule__ConditionAvantage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5501:1: ( rule__ConditionAvantage__Group__6__Impl rule__ConditionAvantage__Group__7 )
            // InternalGame.g:5502:2: rule__ConditionAvantage__Group__6__Impl rule__ConditionAvantage__Group__7
            {
            pushFollow(FOLLOW_32);
            rule__ConditionAvantage__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionAvantage__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group__6"


    // $ANTLR start "rule__ConditionAvantage__Group__6__Impl"
    // InternalGame.g:5509:1: rule__ConditionAvantage__Group__6__Impl : ( ( rule__ConditionAvantage__Group_6__0 )? ) ;
    public final void rule__ConditionAvantage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5513:1: ( ( ( rule__ConditionAvantage__Group_6__0 )? ) )
            // InternalGame.g:5514:1: ( ( rule__ConditionAvantage__Group_6__0 )? )
            {
            // InternalGame.g:5514:1: ( ( rule__ConditionAvantage__Group_6__0 )? )
            // InternalGame.g:5515:2: ( rule__ConditionAvantage__Group_6__0 )?
            {
             before(grammarAccess.getConditionAvantageAccess().getGroup_6()); 
            // InternalGame.g:5516:2: ( rule__ConditionAvantage__Group_6__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==40) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalGame.g:5516:3: rule__ConditionAvantage__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionAvantage__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionAvantageAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group__6__Impl"


    // $ANTLR start "rule__ConditionAvantage__Group__7"
    // InternalGame.g:5524:1: rule__ConditionAvantage__Group__7 : rule__ConditionAvantage__Group__7__Impl rule__ConditionAvantage__Group__8 ;
    public final void rule__ConditionAvantage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5528:1: ( rule__ConditionAvantage__Group__7__Impl rule__ConditionAvantage__Group__8 )
            // InternalGame.g:5529:2: rule__ConditionAvantage__Group__7__Impl rule__ConditionAvantage__Group__8
            {
            pushFollow(FOLLOW_32);
            rule__ConditionAvantage__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionAvantage__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group__7"


    // $ANTLR start "rule__ConditionAvantage__Group__7__Impl"
    // InternalGame.g:5536:1: rule__ConditionAvantage__Group__7__Impl : ( ( rule__ConditionAvantage__Group_7__0 )? ) ;
    public final void rule__ConditionAvantage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5540:1: ( ( ( rule__ConditionAvantage__Group_7__0 )? ) )
            // InternalGame.g:5541:1: ( ( rule__ConditionAvantage__Group_7__0 )? )
            {
            // InternalGame.g:5541:1: ( ( rule__ConditionAvantage__Group_7__0 )? )
            // InternalGame.g:5542:2: ( rule__ConditionAvantage__Group_7__0 )?
            {
             before(grammarAccess.getConditionAvantageAccess().getGroup_7()); 
            // InternalGame.g:5543:2: ( rule__ConditionAvantage__Group_7__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==41) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalGame.g:5543:3: rule__ConditionAvantage__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionAvantage__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionAvantageAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group__7__Impl"


    // $ANTLR start "rule__ConditionAvantage__Group__8"
    // InternalGame.g:5551:1: rule__ConditionAvantage__Group__8 : rule__ConditionAvantage__Group__8__Impl ;
    public final void rule__ConditionAvantage__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5555:1: ( rule__ConditionAvantage__Group__8__Impl )
            // InternalGame.g:5556:2: rule__ConditionAvantage__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionAvantage__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group__8"


    // $ANTLR start "rule__ConditionAvantage__Group__8__Impl"
    // InternalGame.g:5562:1: rule__ConditionAvantage__Group__8__Impl : ( '}' ) ;
    public final void rule__ConditionAvantage__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5566:1: ( ( '}' ) )
            // InternalGame.g:5567:1: ( '}' )
            {
            // InternalGame.g:5567:1: ( '}' )
            // InternalGame.g:5568:2: '}'
            {
             before(grammarAccess.getConditionAvantageAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConditionAvantageAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group__8__Impl"


    // $ANTLR start "rule__ConditionAvantage__Group_4__0"
    // InternalGame.g:5578:1: rule__ConditionAvantage__Group_4__0 : rule__ConditionAvantage__Group_4__0__Impl rule__ConditionAvantage__Group_4__1 ;
    public final void rule__ConditionAvantage__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5582:1: ( rule__ConditionAvantage__Group_4__0__Impl rule__ConditionAvantage__Group_4__1 )
            // InternalGame.g:5583:2: rule__ConditionAvantage__Group_4__0__Impl rule__ConditionAvantage__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__ConditionAvantage__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionAvantage__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group_4__0"


    // $ANTLR start "rule__ConditionAvantage__Group_4__0__Impl"
    // InternalGame.g:5590:1: rule__ConditionAvantage__Group_4__0__Impl : ( 'connaissanceRequise' ) ;
    public final void rule__ConditionAvantage__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5594:1: ( ( 'connaissanceRequise' ) )
            // InternalGame.g:5595:1: ( 'connaissanceRequise' )
            {
            // InternalGame.g:5595:1: ( 'connaissanceRequise' )
            // InternalGame.g:5596:2: 'connaissanceRequise'
            {
             before(grammarAccess.getConditionAvantageAccess().getConnaissanceRequiseKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getConditionAvantageAccess().getConnaissanceRequiseKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group_4__0__Impl"


    // $ANTLR start "rule__ConditionAvantage__Group_4__1"
    // InternalGame.g:5605:1: rule__ConditionAvantage__Group_4__1 : rule__ConditionAvantage__Group_4__1__Impl ;
    public final void rule__ConditionAvantage__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5609:1: ( rule__ConditionAvantage__Group_4__1__Impl )
            // InternalGame.g:5610:2: rule__ConditionAvantage__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionAvantage__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group_4__1"


    // $ANTLR start "rule__ConditionAvantage__Group_4__1__Impl"
    // InternalGame.g:5616:1: rule__ConditionAvantage__Group_4__1__Impl : ( ( rule__ConditionAvantage__ConnaissanceRequiseAssignment_4_1 ) ) ;
    public final void rule__ConditionAvantage__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5620:1: ( ( ( rule__ConditionAvantage__ConnaissanceRequiseAssignment_4_1 ) ) )
            // InternalGame.g:5621:1: ( ( rule__ConditionAvantage__ConnaissanceRequiseAssignment_4_1 ) )
            {
            // InternalGame.g:5621:1: ( ( rule__ConditionAvantage__ConnaissanceRequiseAssignment_4_1 ) )
            // InternalGame.g:5622:2: ( rule__ConditionAvantage__ConnaissanceRequiseAssignment_4_1 )
            {
             before(grammarAccess.getConditionAvantageAccess().getConnaissanceRequiseAssignment_4_1()); 
            // InternalGame.g:5623:2: ( rule__ConditionAvantage__ConnaissanceRequiseAssignment_4_1 )
            // InternalGame.g:5623:3: rule__ConditionAvantage__ConnaissanceRequiseAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionAvantage__ConnaissanceRequiseAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAvantageAccess().getConnaissanceRequiseAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group_4__1__Impl"


    // $ANTLR start "rule__ConditionAvantage__Group_5__0"
    // InternalGame.g:5632:1: rule__ConditionAvantage__Group_5__0 : rule__ConditionAvantage__Group_5__0__Impl rule__ConditionAvantage__Group_5__1 ;
    public final void rule__ConditionAvantage__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5636:1: ( rule__ConditionAvantage__Group_5__0__Impl rule__ConditionAvantage__Group_5__1 )
            // InternalGame.g:5637:2: rule__ConditionAvantage__Group_5__0__Impl rule__ConditionAvantage__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__ConditionAvantage__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionAvantage__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group_5__0"


    // $ANTLR start "rule__ConditionAvantage__Group_5__0__Impl"
    // InternalGame.g:5644:1: rule__ConditionAvantage__Group_5__0__Impl : ( 'connaissanceInterdite' ) ;
    public final void rule__ConditionAvantage__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5648:1: ( ( 'connaissanceInterdite' ) )
            // InternalGame.g:5649:1: ( 'connaissanceInterdite' )
            {
            // InternalGame.g:5649:1: ( 'connaissanceInterdite' )
            // InternalGame.g:5650:2: 'connaissanceInterdite'
            {
             before(grammarAccess.getConditionAvantageAccess().getConnaissanceInterditeKeyword_5_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getConditionAvantageAccess().getConnaissanceInterditeKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group_5__0__Impl"


    // $ANTLR start "rule__ConditionAvantage__Group_5__1"
    // InternalGame.g:5659:1: rule__ConditionAvantage__Group_5__1 : rule__ConditionAvantage__Group_5__1__Impl ;
    public final void rule__ConditionAvantage__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5663:1: ( rule__ConditionAvantage__Group_5__1__Impl )
            // InternalGame.g:5664:2: rule__ConditionAvantage__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionAvantage__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group_5__1"


    // $ANTLR start "rule__ConditionAvantage__Group_5__1__Impl"
    // InternalGame.g:5670:1: rule__ConditionAvantage__Group_5__1__Impl : ( ( rule__ConditionAvantage__ConnaissanceInterditeAssignment_5_1 ) ) ;
    public final void rule__ConditionAvantage__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5674:1: ( ( ( rule__ConditionAvantage__ConnaissanceInterditeAssignment_5_1 ) ) )
            // InternalGame.g:5675:1: ( ( rule__ConditionAvantage__ConnaissanceInterditeAssignment_5_1 ) )
            {
            // InternalGame.g:5675:1: ( ( rule__ConditionAvantage__ConnaissanceInterditeAssignment_5_1 ) )
            // InternalGame.g:5676:2: ( rule__ConditionAvantage__ConnaissanceInterditeAssignment_5_1 )
            {
             before(grammarAccess.getConditionAvantageAccess().getConnaissanceInterditeAssignment_5_1()); 
            // InternalGame.g:5677:2: ( rule__ConditionAvantage__ConnaissanceInterditeAssignment_5_1 )
            // InternalGame.g:5677:3: rule__ConditionAvantage__ConnaissanceInterditeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionAvantage__ConnaissanceInterditeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAvantageAccess().getConnaissanceInterditeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group_5__1__Impl"


    // $ANTLR start "rule__ConditionAvantage__Group_6__0"
    // InternalGame.g:5686:1: rule__ConditionAvantage__Group_6__0 : rule__ConditionAvantage__Group_6__0__Impl rule__ConditionAvantage__Group_6__1 ;
    public final void rule__ConditionAvantage__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5690:1: ( rule__ConditionAvantage__Group_6__0__Impl rule__ConditionAvantage__Group_6__1 )
            // InternalGame.g:5691:2: rule__ConditionAvantage__Group_6__0__Impl rule__ConditionAvantage__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__ConditionAvantage__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionAvantage__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group_6__0"


    // $ANTLR start "rule__ConditionAvantage__Group_6__0__Impl"
    // InternalGame.g:5698:1: rule__ConditionAvantage__Group_6__0__Impl : ( 'objetRequis' ) ;
    public final void rule__ConditionAvantage__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5702:1: ( ( 'objetRequis' ) )
            // InternalGame.g:5703:1: ( 'objetRequis' )
            {
            // InternalGame.g:5703:1: ( 'objetRequis' )
            // InternalGame.g:5704:2: 'objetRequis'
            {
             before(grammarAccess.getConditionAvantageAccess().getObjetRequisKeyword_6_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getConditionAvantageAccess().getObjetRequisKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group_6__0__Impl"


    // $ANTLR start "rule__ConditionAvantage__Group_6__1"
    // InternalGame.g:5713:1: rule__ConditionAvantage__Group_6__1 : rule__ConditionAvantage__Group_6__1__Impl ;
    public final void rule__ConditionAvantage__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5717:1: ( rule__ConditionAvantage__Group_6__1__Impl )
            // InternalGame.g:5718:2: rule__ConditionAvantage__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionAvantage__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group_6__1"


    // $ANTLR start "rule__ConditionAvantage__Group_6__1__Impl"
    // InternalGame.g:5724:1: rule__ConditionAvantage__Group_6__1__Impl : ( ( rule__ConditionAvantage__ObjetRequisAssignment_6_1 ) ) ;
    public final void rule__ConditionAvantage__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5728:1: ( ( ( rule__ConditionAvantage__ObjetRequisAssignment_6_1 ) ) )
            // InternalGame.g:5729:1: ( ( rule__ConditionAvantage__ObjetRequisAssignment_6_1 ) )
            {
            // InternalGame.g:5729:1: ( ( rule__ConditionAvantage__ObjetRequisAssignment_6_1 ) )
            // InternalGame.g:5730:2: ( rule__ConditionAvantage__ObjetRequisAssignment_6_1 )
            {
             before(grammarAccess.getConditionAvantageAccess().getObjetRequisAssignment_6_1()); 
            // InternalGame.g:5731:2: ( rule__ConditionAvantage__ObjetRequisAssignment_6_1 )
            // InternalGame.g:5731:3: rule__ConditionAvantage__ObjetRequisAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionAvantage__ObjetRequisAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAvantageAccess().getObjetRequisAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group_6__1__Impl"


    // $ANTLR start "rule__ConditionAvantage__Group_7__0"
    // InternalGame.g:5740:1: rule__ConditionAvantage__Group_7__0 : rule__ConditionAvantage__Group_7__0__Impl rule__ConditionAvantage__Group_7__1 ;
    public final void rule__ConditionAvantage__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5744:1: ( rule__ConditionAvantage__Group_7__0__Impl rule__ConditionAvantage__Group_7__1 )
            // InternalGame.g:5745:2: rule__ConditionAvantage__Group_7__0__Impl rule__ConditionAvantage__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__ConditionAvantage__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionAvantage__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group_7__0"


    // $ANTLR start "rule__ConditionAvantage__Group_7__0__Impl"
    // InternalGame.g:5752:1: rule__ConditionAvantage__Group_7__0__Impl : ( 'objetInterdit' ) ;
    public final void rule__ConditionAvantage__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5756:1: ( ( 'objetInterdit' ) )
            // InternalGame.g:5757:1: ( 'objetInterdit' )
            {
            // InternalGame.g:5757:1: ( 'objetInterdit' )
            // InternalGame.g:5758:2: 'objetInterdit'
            {
             before(grammarAccess.getConditionAvantageAccess().getObjetInterditKeyword_7_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getConditionAvantageAccess().getObjetInterditKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group_7__0__Impl"


    // $ANTLR start "rule__ConditionAvantage__Group_7__1"
    // InternalGame.g:5767:1: rule__ConditionAvantage__Group_7__1 : rule__ConditionAvantage__Group_7__1__Impl ;
    public final void rule__ConditionAvantage__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5771:1: ( rule__ConditionAvantage__Group_7__1__Impl )
            // InternalGame.g:5772:2: rule__ConditionAvantage__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionAvantage__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group_7__1"


    // $ANTLR start "rule__ConditionAvantage__Group_7__1__Impl"
    // InternalGame.g:5778:1: rule__ConditionAvantage__Group_7__1__Impl : ( ( rule__ConditionAvantage__ObjetInterditAssignment_7_1 ) ) ;
    public final void rule__ConditionAvantage__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5782:1: ( ( ( rule__ConditionAvantage__ObjetInterditAssignment_7_1 ) ) )
            // InternalGame.g:5783:1: ( ( rule__ConditionAvantage__ObjetInterditAssignment_7_1 ) )
            {
            // InternalGame.g:5783:1: ( ( rule__ConditionAvantage__ObjetInterditAssignment_7_1 ) )
            // InternalGame.g:5784:2: ( rule__ConditionAvantage__ObjetInterditAssignment_7_1 )
            {
             before(grammarAccess.getConditionAvantageAccess().getObjetInterditAssignment_7_1()); 
            // InternalGame.g:5785:2: ( rule__ConditionAvantage__ObjetInterditAssignment_7_1 )
            // InternalGame.g:5785:3: rule__ConditionAvantage__ObjetInterditAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionAvantage__ObjetInterditAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAvantageAccess().getObjetInterditAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__Group_7__1__Impl"


    // $ANTLR start "rule__Choix__Group__0"
    // InternalGame.g:5794:1: rule__Choix__Group__0 : rule__Choix__Group__0__Impl rule__Choix__Group__1 ;
    public final void rule__Choix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5798:1: ( rule__Choix__Group__0__Impl rule__Choix__Group__1 )
            // InternalGame.g:5799:2: rule__Choix__Group__0__Impl rule__Choix__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Choix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__0"


    // $ANTLR start "rule__Choix__Group__0__Impl"
    // InternalGame.g:5806:1: rule__Choix__Group__0__Impl : ( ( rule__Choix__BonneAssignment_0 )? ) ;
    public final void rule__Choix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5810:1: ( ( ( rule__Choix__BonneAssignment_0 )? ) )
            // InternalGame.g:5811:1: ( ( rule__Choix__BonneAssignment_0 )? )
            {
            // InternalGame.g:5811:1: ( ( rule__Choix__BonneAssignment_0 )? )
            // InternalGame.g:5812:2: ( rule__Choix__BonneAssignment_0 )?
            {
             before(grammarAccess.getChoixAccess().getBonneAssignment_0()); 
            // InternalGame.g:5813:2: ( rule__Choix__BonneAssignment_0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==63) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalGame.g:5813:3: rule__Choix__BonneAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Choix__BonneAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChoixAccess().getBonneAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__0__Impl"


    // $ANTLR start "rule__Choix__Group__1"
    // InternalGame.g:5821:1: rule__Choix__Group__1 : rule__Choix__Group__1__Impl rule__Choix__Group__2 ;
    public final void rule__Choix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5825:1: ( rule__Choix__Group__1__Impl rule__Choix__Group__2 )
            // InternalGame.g:5826:2: rule__Choix__Group__1__Impl rule__Choix__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Choix__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__1"


    // $ANTLR start "rule__Choix__Group__1__Impl"
    // InternalGame.g:5833:1: rule__Choix__Group__1__Impl : ( 'Choix' ) ;
    public final void rule__Choix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5837:1: ( ( 'Choix' ) )
            // InternalGame.g:5838:1: ( 'Choix' )
            {
            // InternalGame.g:5838:1: ( 'Choix' )
            // InternalGame.g:5839:2: 'Choix'
            {
             before(grammarAccess.getChoixAccess().getChoixKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getChoixKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__1__Impl"


    // $ANTLR start "rule__Choix__Group__2"
    // InternalGame.g:5848:1: rule__Choix__Group__2 : rule__Choix__Group__2__Impl rule__Choix__Group__3 ;
    public final void rule__Choix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5852:1: ( rule__Choix__Group__2__Impl rule__Choix__Group__3 )
            // InternalGame.g:5853:2: rule__Choix__Group__2__Impl rule__Choix__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Choix__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__2"


    // $ANTLR start "rule__Choix__Group__2__Impl"
    // InternalGame.g:5860:1: rule__Choix__Group__2__Impl : ( ( rule__Choix__NameAssignment_2 ) ) ;
    public final void rule__Choix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5864:1: ( ( ( rule__Choix__NameAssignment_2 ) ) )
            // InternalGame.g:5865:1: ( ( rule__Choix__NameAssignment_2 ) )
            {
            // InternalGame.g:5865:1: ( ( rule__Choix__NameAssignment_2 ) )
            // InternalGame.g:5866:2: ( rule__Choix__NameAssignment_2 )
            {
             before(grammarAccess.getChoixAccess().getNameAssignment_2()); 
            // InternalGame.g:5867:2: ( rule__Choix__NameAssignment_2 )
            // InternalGame.g:5867:3: rule__Choix__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Choix__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__2__Impl"


    // $ANTLR start "rule__Choix__Group__3"
    // InternalGame.g:5875:1: rule__Choix__Group__3 : rule__Choix__Group__3__Impl rule__Choix__Group__4 ;
    public final void rule__Choix__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5879:1: ( rule__Choix__Group__3__Impl rule__Choix__Group__4 )
            // InternalGame.g:5880:2: rule__Choix__Group__3__Impl rule__Choix__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__Choix__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__3"


    // $ANTLR start "rule__Choix__Group__3__Impl"
    // InternalGame.g:5887:1: rule__Choix__Group__3__Impl : ( '{' ) ;
    public final void rule__Choix__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5891:1: ( ( '{' ) )
            // InternalGame.g:5892:1: ( '{' )
            {
            // InternalGame.g:5892:1: ( '{' )
            // InternalGame.g:5893:2: '{'
            {
             before(grammarAccess.getChoixAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__3__Impl"


    // $ANTLR start "rule__Choix__Group__4"
    // InternalGame.g:5902:1: rule__Choix__Group__4 : rule__Choix__Group__4__Impl rule__Choix__Group__5 ;
    public final void rule__Choix__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5906:1: ( rule__Choix__Group__4__Impl rule__Choix__Group__5 )
            // InternalGame.g:5907:2: rule__Choix__Group__4__Impl rule__Choix__Group__5
            {
            pushFollow(FOLLOW_40);
            rule__Choix__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__4"


    // $ANTLR start "rule__Choix__Group__4__Impl"
    // InternalGame.g:5914:1: rule__Choix__Group__4__Impl : ( ( rule__Choix__Group_4__0 )? ) ;
    public final void rule__Choix__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5918:1: ( ( ( rule__Choix__Group_4__0 )? ) )
            // InternalGame.g:5919:1: ( ( rule__Choix__Group_4__0 )? )
            {
            // InternalGame.g:5919:1: ( ( rule__Choix__Group_4__0 )? )
            // InternalGame.g:5920:2: ( rule__Choix__Group_4__0 )?
            {
             before(grammarAccess.getChoixAccess().getGroup_4()); 
            // InternalGame.g:5921:2: ( rule__Choix__Group_4__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==53) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalGame.g:5921:3: rule__Choix__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Choix__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChoixAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__4__Impl"


    // $ANTLR start "rule__Choix__Group__5"
    // InternalGame.g:5929:1: rule__Choix__Group__5 : rule__Choix__Group__5__Impl rule__Choix__Group__6 ;
    public final void rule__Choix__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5933:1: ( rule__Choix__Group__5__Impl rule__Choix__Group__6 )
            // InternalGame.g:5934:2: rule__Choix__Group__5__Impl rule__Choix__Group__6
            {
            pushFollow(FOLLOW_40);
            rule__Choix__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__5"


    // $ANTLR start "rule__Choix__Group__5__Impl"
    // InternalGame.g:5941:1: rule__Choix__Group__5__Impl : ( ( rule__Choix__Group_5__0 )? ) ;
    public final void rule__Choix__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5945:1: ( ( ( rule__Choix__Group_5__0 )? ) )
            // InternalGame.g:5946:1: ( ( rule__Choix__Group_5__0 )? )
            {
            // InternalGame.g:5946:1: ( ( rule__Choix__Group_5__0 )? )
            // InternalGame.g:5947:2: ( rule__Choix__Group_5__0 )?
            {
             before(grammarAccess.getChoixAccess().getGroup_5()); 
            // InternalGame.g:5948:2: ( rule__Choix__Group_5__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==54) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalGame.g:5948:3: rule__Choix__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Choix__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChoixAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__5__Impl"


    // $ANTLR start "rule__Choix__Group__6"
    // InternalGame.g:5956:1: rule__Choix__Group__6 : rule__Choix__Group__6__Impl rule__Choix__Group__7 ;
    public final void rule__Choix__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5960:1: ( rule__Choix__Group__6__Impl rule__Choix__Group__7 )
            // InternalGame.g:5961:2: rule__Choix__Group__6__Impl rule__Choix__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__Choix__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__6"


    // $ANTLR start "rule__Choix__Group__6__Impl"
    // InternalGame.g:5968:1: rule__Choix__Group__6__Impl : ( 'interaction' ) ;
    public final void rule__Choix__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5972:1: ( ( 'interaction' ) )
            // InternalGame.g:5973:1: ( 'interaction' )
            {
            // InternalGame.g:5973:1: ( 'interaction' )
            // InternalGame.g:5974:2: 'interaction'
            {
             before(grammarAccess.getChoixAccess().getInteractionKeyword_6()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getInteractionKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__6__Impl"


    // $ANTLR start "rule__Choix__Group__7"
    // InternalGame.g:5983:1: rule__Choix__Group__7 : rule__Choix__Group__7__Impl rule__Choix__Group__8 ;
    public final void rule__Choix__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5987:1: ( rule__Choix__Group__7__Impl rule__Choix__Group__8 )
            // InternalGame.g:5988:2: rule__Choix__Group__7__Impl rule__Choix__Group__8
            {
            pushFollow(FOLLOW_41);
            rule__Choix__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__7"


    // $ANTLR start "rule__Choix__Group__7__Impl"
    // InternalGame.g:5995:1: rule__Choix__Group__7__Impl : ( ( rule__Choix__InteractionAssignment_7 ) ) ;
    public final void rule__Choix__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5999:1: ( ( ( rule__Choix__InteractionAssignment_7 ) ) )
            // InternalGame.g:6000:1: ( ( rule__Choix__InteractionAssignment_7 ) )
            {
            // InternalGame.g:6000:1: ( ( rule__Choix__InteractionAssignment_7 ) )
            // InternalGame.g:6001:2: ( rule__Choix__InteractionAssignment_7 )
            {
             before(grammarAccess.getChoixAccess().getInteractionAssignment_7()); 
            // InternalGame.g:6002:2: ( rule__Choix__InteractionAssignment_7 )
            // InternalGame.g:6002:3: rule__Choix__InteractionAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Choix__InteractionAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getInteractionAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__7__Impl"


    // $ANTLR start "rule__Choix__Group__8"
    // InternalGame.g:6010:1: rule__Choix__Group__8 : rule__Choix__Group__8__Impl rule__Choix__Group__9 ;
    public final void rule__Choix__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6014:1: ( rule__Choix__Group__8__Impl rule__Choix__Group__9 )
            // InternalGame.g:6015:2: rule__Choix__Group__8__Impl rule__Choix__Group__9
            {
            pushFollow(FOLLOW_41);
            rule__Choix__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__8"


    // $ANTLR start "rule__Choix__Group__8__Impl"
    // InternalGame.g:6022:1: rule__Choix__Group__8__Impl : ( ( rule__Choix__Group_8__0 )? ) ;
    public final void rule__Choix__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6026:1: ( ( ( rule__Choix__Group_8__0 )? ) )
            // InternalGame.g:6027:1: ( ( rule__Choix__Group_8__0 )? )
            {
            // InternalGame.g:6027:1: ( ( rule__Choix__Group_8__0 )? )
            // InternalGame.g:6028:2: ( rule__Choix__Group_8__0 )?
            {
             before(grammarAccess.getChoixAccess().getGroup_8()); 
            // InternalGame.g:6029:2: ( rule__Choix__Group_8__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==55) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalGame.g:6029:3: rule__Choix__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Choix__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChoixAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__8__Impl"


    // $ANTLR start "rule__Choix__Group__9"
    // InternalGame.g:6037:1: rule__Choix__Group__9 : rule__Choix__Group__9__Impl rule__Choix__Group__10 ;
    public final void rule__Choix__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6041:1: ( rule__Choix__Group__9__Impl rule__Choix__Group__10 )
            // InternalGame.g:6042:2: rule__Choix__Group__9__Impl rule__Choix__Group__10
            {
            pushFollow(FOLLOW_41);
            rule__Choix__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__9"


    // $ANTLR start "rule__Choix__Group__9__Impl"
    // InternalGame.g:6049:1: rule__Choix__Group__9__Impl : ( ( rule__Choix__Group_9__0 )? ) ;
    public final void rule__Choix__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6053:1: ( ( ( rule__Choix__Group_9__0 )? ) )
            // InternalGame.g:6054:1: ( ( rule__Choix__Group_9__0 )? )
            {
            // InternalGame.g:6054:1: ( ( rule__Choix__Group_9__0 )? )
            // InternalGame.g:6055:2: ( rule__Choix__Group_9__0 )?
            {
             before(grammarAccess.getChoixAccess().getGroup_9()); 
            // InternalGame.g:6056:2: ( rule__Choix__Group_9__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==56) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalGame.g:6056:3: rule__Choix__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Choix__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChoixAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__9__Impl"


    // $ANTLR start "rule__Choix__Group__10"
    // InternalGame.g:6064:1: rule__Choix__Group__10 : rule__Choix__Group__10__Impl ;
    public final void rule__Choix__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6068:1: ( rule__Choix__Group__10__Impl )
            // InternalGame.g:6069:2: rule__Choix__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__10"


    // $ANTLR start "rule__Choix__Group__10__Impl"
    // InternalGame.g:6075:1: rule__Choix__Group__10__Impl : ( '}' ) ;
    public final void rule__Choix__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6079:1: ( ( '}' ) )
            // InternalGame.g:6080:1: ( '}' )
            {
            // InternalGame.g:6080:1: ( '}' )
            // InternalGame.g:6081:2: '}'
            {
             before(grammarAccess.getChoixAccess().getRightCurlyBracketKeyword_10()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__10__Impl"


    // $ANTLR start "rule__Choix__Group_4__0"
    // InternalGame.g:6091:1: rule__Choix__Group_4__0 : rule__Choix__Group_4__0__Impl rule__Choix__Group_4__1 ;
    public final void rule__Choix__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6095:1: ( rule__Choix__Group_4__0__Impl rule__Choix__Group_4__1 )
            // InternalGame.g:6096:2: rule__Choix__Group_4__0__Impl rule__Choix__Group_4__1
            {
            pushFollow(FOLLOW_35);
            rule__Choix__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_4__0"


    // $ANTLR start "rule__Choix__Group_4__0__Impl"
    // InternalGame.g:6103:1: rule__Choix__Group_4__0__Impl : ( 'reponse' ) ;
    public final void rule__Choix__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6107:1: ( ( 'reponse' ) )
            // InternalGame.g:6108:1: ( 'reponse' )
            {
            // InternalGame.g:6108:1: ( 'reponse' )
            // InternalGame.g:6109:2: 'reponse'
            {
             before(grammarAccess.getChoixAccess().getReponseKeyword_4_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getReponseKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_4__0__Impl"


    // $ANTLR start "rule__Choix__Group_4__1"
    // InternalGame.g:6118:1: rule__Choix__Group_4__1 : rule__Choix__Group_4__1__Impl ;
    public final void rule__Choix__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6122:1: ( rule__Choix__Group_4__1__Impl )
            // InternalGame.g:6123:2: rule__Choix__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_4__1"


    // $ANTLR start "rule__Choix__Group_4__1__Impl"
    // InternalGame.g:6129:1: rule__Choix__Group_4__1__Impl : ( ( rule__Choix__ReponseAssignment_4_1 ) ) ;
    public final void rule__Choix__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6133:1: ( ( ( rule__Choix__ReponseAssignment_4_1 ) ) )
            // InternalGame.g:6134:1: ( ( rule__Choix__ReponseAssignment_4_1 ) )
            {
            // InternalGame.g:6134:1: ( ( rule__Choix__ReponseAssignment_4_1 ) )
            // InternalGame.g:6135:2: ( rule__Choix__ReponseAssignment_4_1 )
            {
             before(grammarAccess.getChoixAccess().getReponseAssignment_4_1()); 
            // InternalGame.g:6136:2: ( rule__Choix__ReponseAssignment_4_1 )
            // InternalGame.g:6136:3: rule__Choix__ReponseAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Choix__ReponseAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getReponseAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_4__1__Impl"


    // $ANTLR start "rule__Choix__Group_5__0"
    // InternalGame.g:6145:1: rule__Choix__Group_5__0 : rule__Choix__Group_5__0__Impl rule__Choix__Group_5__1 ;
    public final void rule__Choix__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6149:1: ( rule__Choix__Group_5__0__Impl rule__Choix__Group_5__1 )
            // InternalGame.g:6150:2: rule__Choix__Group_5__0__Impl rule__Choix__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Choix__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_5__0"


    // $ANTLR start "rule__Choix__Group_5__0__Impl"
    // InternalGame.g:6157:1: rule__Choix__Group_5__0__Impl : ( 'connaisDon' ) ;
    public final void rule__Choix__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6161:1: ( ( 'connaisDon' ) )
            // InternalGame.g:6162:1: ( 'connaisDon' )
            {
            // InternalGame.g:6162:1: ( 'connaisDon' )
            // InternalGame.g:6163:2: 'connaisDon'
            {
             before(grammarAccess.getChoixAccess().getConnaisDonKeyword_5_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getConnaisDonKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_5__0__Impl"


    // $ANTLR start "rule__Choix__Group_5__1"
    // InternalGame.g:6172:1: rule__Choix__Group_5__1 : rule__Choix__Group_5__1__Impl rule__Choix__Group_5__2 ;
    public final void rule__Choix__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6176:1: ( rule__Choix__Group_5__1__Impl rule__Choix__Group_5__2 )
            // InternalGame.g:6177:2: rule__Choix__Group_5__1__Impl rule__Choix__Group_5__2
            {
            pushFollow(FOLLOW_18);
            rule__Choix__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_5__1"


    // $ANTLR start "rule__Choix__Group_5__1__Impl"
    // InternalGame.g:6184:1: rule__Choix__Group_5__1__Impl : ( ( rule__Choix__ConnaisDonAssignment_5_1 ) ) ;
    public final void rule__Choix__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6188:1: ( ( ( rule__Choix__ConnaisDonAssignment_5_1 ) ) )
            // InternalGame.g:6189:1: ( ( rule__Choix__ConnaisDonAssignment_5_1 ) )
            {
            // InternalGame.g:6189:1: ( ( rule__Choix__ConnaisDonAssignment_5_1 ) )
            // InternalGame.g:6190:2: ( rule__Choix__ConnaisDonAssignment_5_1 )
            {
             before(grammarAccess.getChoixAccess().getConnaisDonAssignment_5_1()); 
            // InternalGame.g:6191:2: ( rule__Choix__ConnaisDonAssignment_5_1 )
            // InternalGame.g:6191:3: rule__Choix__ConnaisDonAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Choix__ConnaisDonAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getConnaisDonAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_5__1__Impl"


    // $ANTLR start "rule__Choix__Group_5__2"
    // InternalGame.g:6199:1: rule__Choix__Group_5__2 : rule__Choix__Group_5__2__Impl ;
    public final void rule__Choix__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6203:1: ( rule__Choix__Group_5__2__Impl )
            // InternalGame.g:6204:2: rule__Choix__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_5__2"


    // $ANTLR start "rule__Choix__Group_5__2__Impl"
    // InternalGame.g:6210:1: rule__Choix__Group_5__2__Impl : ( ( rule__Choix__Group_5_2__0 )* ) ;
    public final void rule__Choix__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6214:1: ( ( ( rule__Choix__Group_5_2__0 )* ) )
            // InternalGame.g:6215:1: ( ( rule__Choix__Group_5_2__0 )* )
            {
            // InternalGame.g:6215:1: ( ( rule__Choix__Group_5_2__0 )* )
            // InternalGame.g:6216:2: ( rule__Choix__Group_5_2__0 )*
            {
             before(grammarAccess.getChoixAccess().getGroup_5_2()); 
            // InternalGame.g:6217:2: ( rule__Choix__Group_5_2__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==17) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalGame.g:6217:3: rule__Choix__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Choix__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getChoixAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_5__2__Impl"


    // $ANTLR start "rule__Choix__Group_5_2__0"
    // InternalGame.g:6226:1: rule__Choix__Group_5_2__0 : rule__Choix__Group_5_2__0__Impl rule__Choix__Group_5_2__1 ;
    public final void rule__Choix__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6230:1: ( rule__Choix__Group_5_2__0__Impl rule__Choix__Group_5_2__1 )
            // InternalGame.g:6231:2: rule__Choix__Group_5_2__0__Impl rule__Choix__Group_5_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Choix__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_5_2__0"


    // $ANTLR start "rule__Choix__Group_5_2__0__Impl"
    // InternalGame.g:6238:1: rule__Choix__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Choix__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6242:1: ( ( ',' ) )
            // InternalGame.g:6243:1: ( ',' )
            {
            // InternalGame.g:6243:1: ( ',' )
            // InternalGame.g:6244:2: ','
            {
             before(grammarAccess.getChoixAccess().getCommaKeyword_5_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getCommaKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_5_2__0__Impl"


    // $ANTLR start "rule__Choix__Group_5_2__1"
    // InternalGame.g:6253:1: rule__Choix__Group_5_2__1 : rule__Choix__Group_5_2__1__Impl ;
    public final void rule__Choix__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6257:1: ( rule__Choix__Group_5_2__1__Impl )
            // InternalGame.g:6258:2: rule__Choix__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_5_2__1"


    // $ANTLR start "rule__Choix__Group_5_2__1__Impl"
    // InternalGame.g:6264:1: rule__Choix__Group_5_2__1__Impl : ( ( rule__Choix__ConnaisDonAssignment_5_2_1 ) ) ;
    public final void rule__Choix__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6268:1: ( ( ( rule__Choix__ConnaisDonAssignment_5_2_1 ) ) )
            // InternalGame.g:6269:1: ( ( rule__Choix__ConnaisDonAssignment_5_2_1 ) )
            {
            // InternalGame.g:6269:1: ( ( rule__Choix__ConnaisDonAssignment_5_2_1 ) )
            // InternalGame.g:6270:2: ( rule__Choix__ConnaisDonAssignment_5_2_1 )
            {
             before(grammarAccess.getChoixAccess().getConnaisDonAssignment_5_2_1()); 
            // InternalGame.g:6271:2: ( rule__Choix__ConnaisDonAssignment_5_2_1 )
            // InternalGame.g:6271:3: rule__Choix__ConnaisDonAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Choix__ConnaisDonAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getConnaisDonAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_5_2__1__Impl"


    // $ANTLR start "rule__Choix__Group_8__0"
    // InternalGame.g:6280:1: rule__Choix__Group_8__0 : rule__Choix__Group_8__0__Impl rule__Choix__Group_8__1 ;
    public final void rule__Choix__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6284:1: ( rule__Choix__Group_8__0__Impl rule__Choix__Group_8__1 )
            // InternalGame.g:6285:2: rule__Choix__Group_8__0__Impl rule__Choix__Group_8__1
            {
            pushFollow(FOLLOW_42);
            rule__Choix__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_8__0"


    // $ANTLR start "rule__Choix__Group_8__0__Impl"
    // InternalGame.g:6292:1: rule__Choix__Group_8__0__Impl : ( 'objetCons' ) ;
    public final void rule__Choix__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6296:1: ( ( 'objetCons' ) )
            // InternalGame.g:6297:1: ( 'objetCons' )
            {
            // InternalGame.g:6297:1: ( 'objetCons' )
            // InternalGame.g:6298:2: 'objetCons'
            {
             before(grammarAccess.getChoixAccess().getObjetConsKeyword_8_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getObjetConsKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_8__0__Impl"


    // $ANTLR start "rule__Choix__Group_8__1"
    // InternalGame.g:6307:1: rule__Choix__Group_8__1 : rule__Choix__Group_8__1__Impl rule__Choix__Group_8__2 ;
    public final void rule__Choix__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6311:1: ( rule__Choix__Group_8__1__Impl rule__Choix__Group_8__2 )
            // InternalGame.g:6312:2: rule__Choix__Group_8__1__Impl rule__Choix__Group_8__2
            {
            pushFollow(FOLLOW_18);
            rule__Choix__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_8__1"


    // $ANTLR start "rule__Choix__Group_8__1__Impl"
    // InternalGame.g:6319:1: rule__Choix__Group_8__1__Impl : ( ( rule__Choix__ObjetConsAssignment_8_1 ) ) ;
    public final void rule__Choix__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6323:1: ( ( ( rule__Choix__ObjetConsAssignment_8_1 ) ) )
            // InternalGame.g:6324:1: ( ( rule__Choix__ObjetConsAssignment_8_1 ) )
            {
            // InternalGame.g:6324:1: ( ( rule__Choix__ObjetConsAssignment_8_1 ) )
            // InternalGame.g:6325:2: ( rule__Choix__ObjetConsAssignment_8_1 )
            {
             before(grammarAccess.getChoixAccess().getObjetConsAssignment_8_1()); 
            // InternalGame.g:6326:2: ( rule__Choix__ObjetConsAssignment_8_1 )
            // InternalGame.g:6326:3: rule__Choix__ObjetConsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Choix__ObjetConsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getObjetConsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_8__1__Impl"


    // $ANTLR start "rule__Choix__Group_8__2"
    // InternalGame.g:6334:1: rule__Choix__Group_8__2 : rule__Choix__Group_8__2__Impl ;
    public final void rule__Choix__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6338:1: ( rule__Choix__Group_8__2__Impl )
            // InternalGame.g:6339:2: rule__Choix__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_8__2"


    // $ANTLR start "rule__Choix__Group_8__2__Impl"
    // InternalGame.g:6345:1: rule__Choix__Group_8__2__Impl : ( ( rule__Choix__Group_8_2__0 )* ) ;
    public final void rule__Choix__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6349:1: ( ( ( rule__Choix__Group_8_2__0 )* ) )
            // InternalGame.g:6350:1: ( ( rule__Choix__Group_8_2__0 )* )
            {
            // InternalGame.g:6350:1: ( ( rule__Choix__Group_8_2__0 )* )
            // InternalGame.g:6351:2: ( rule__Choix__Group_8_2__0 )*
            {
             before(grammarAccess.getChoixAccess().getGroup_8_2()); 
            // InternalGame.g:6352:2: ( rule__Choix__Group_8_2__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==17) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalGame.g:6352:3: rule__Choix__Group_8_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Choix__Group_8_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getChoixAccess().getGroup_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_8__2__Impl"


    // $ANTLR start "rule__Choix__Group_8_2__0"
    // InternalGame.g:6361:1: rule__Choix__Group_8_2__0 : rule__Choix__Group_8_2__0__Impl rule__Choix__Group_8_2__1 ;
    public final void rule__Choix__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6365:1: ( rule__Choix__Group_8_2__0__Impl rule__Choix__Group_8_2__1 )
            // InternalGame.g:6366:2: rule__Choix__Group_8_2__0__Impl rule__Choix__Group_8_2__1
            {
            pushFollow(FOLLOW_42);
            rule__Choix__Group_8_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group_8_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_8_2__0"


    // $ANTLR start "rule__Choix__Group_8_2__0__Impl"
    // InternalGame.g:6373:1: rule__Choix__Group_8_2__0__Impl : ( ',' ) ;
    public final void rule__Choix__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6377:1: ( ( ',' ) )
            // InternalGame.g:6378:1: ( ',' )
            {
            // InternalGame.g:6378:1: ( ',' )
            // InternalGame.g:6379:2: ','
            {
             before(grammarAccess.getChoixAccess().getCommaKeyword_8_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getCommaKeyword_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_8_2__0__Impl"


    // $ANTLR start "rule__Choix__Group_8_2__1"
    // InternalGame.g:6388:1: rule__Choix__Group_8_2__1 : rule__Choix__Group_8_2__1__Impl ;
    public final void rule__Choix__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6392:1: ( rule__Choix__Group_8_2__1__Impl )
            // InternalGame.g:6393:2: rule__Choix__Group_8_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group_8_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_8_2__1"


    // $ANTLR start "rule__Choix__Group_8_2__1__Impl"
    // InternalGame.g:6399:1: rule__Choix__Group_8_2__1__Impl : ( ( rule__Choix__ObjetConsAssignment_8_2_1 ) ) ;
    public final void rule__Choix__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6403:1: ( ( ( rule__Choix__ObjetConsAssignment_8_2_1 ) ) )
            // InternalGame.g:6404:1: ( ( rule__Choix__ObjetConsAssignment_8_2_1 ) )
            {
            // InternalGame.g:6404:1: ( ( rule__Choix__ObjetConsAssignment_8_2_1 ) )
            // InternalGame.g:6405:2: ( rule__Choix__ObjetConsAssignment_8_2_1 )
            {
             before(grammarAccess.getChoixAccess().getObjetConsAssignment_8_2_1()); 
            // InternalGame.g:6406:2: ( rule__Choix__ObjetConsAssignment_8_2_1 )
            // InternalGame.g:6406:3: rule__Choix__ObjetConsAssignment_8_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Choix__ObjetConsAssignment_8_2_1();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getObjetConsAssignment_8_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_8_2__1__Impl"


    // $ANTLR start "rule__Choix__Group_9__0"
    // InternalGame.g:6415:1: rule__Choix__Group_9__0 : rule__Choix__Group_9__0__Impl rule__Choix__Group_9__1 ;
    public final void rule__Choix__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6419:1: ( rule__Choix__Group_9__0__Impl rule__Choix__Group_9__1 )
            // InternalGame.g:6420:2: rule__Choix__Group_9__0__Impl rule__Choix__Group_9__1
            {
            pushFollow(FOLLOW_42);
            rule__Choix__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_9__0"


    // $ANTLR start "rule__Choix__Group_9__0__Impl"
    // InternalGame.g:6427:1: rule__Choix__Group_9__0__Impl : ( 'objetDon' ) ;
    public final void rule__Choix__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6431:1: ( ( 'objetDon' ) )
            // InternalGame.g:6432:1: ( 'objetDon' )
            {
            // InternalGame.g:6432:1: ( 'objetDon' )
            // InternalGame.g:6433:2: 'objetDon'
            {
             before(grammarAccess.getChoixAccess().getObjetDonKeyword_9_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getObjetDonKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_9__0__Impl"


    // $ANTLR start "rule__Choix__Group_9__1"
    // InternalGame.g:6442:1: rule__Choix__Group_9__1 : rule__Choix__Group_9__1__Impl rule__Choix__Group_9__2 ;
    public final void rule__Choix__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6446:1: ( rule__Choix__Group_9__1__Impl rule__Choix__Group_9__2 )
            // InternalGame.g:6447:2: rule__Choix__Group_9__1__Impl rule__Choix__Group_9__2
            {
            pushFollow(FOLLOW_18);
            rule__Choix__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_9__1"


    // $ANTLR start "rule__Choix__Group_9__1__Impl"
    // InternalGame.g:6454:1: rule__Choix__Group_9__1__Impl : ( ( rule__Choix__ObjetDonAssignment_9_1 ) ) ;
    public final void rule__Choix__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6458:1: ( ( ( rule__Choix__ObjetDonAssignment_9_1 ) ) )
            // InternalGame.g:6459:1: ( ( rule__Choix__ObjetDonAssignment_9_1 ) )
            {
            // InternalGame.g:6459:1: ( ( rule__Choix__ObjetDonAssignment_9_1 ) )
            // InternalGame.g:6460:2: ( rule__Choix__ObjetDonAssignment_9_1 )
            {
             before(grammarAccess.getChoixAccess().getObjetDonAssignment_9_1()); 
            // InternalGame.g:6461:2: ( rule__Choix__ObjetDonAssignment_9_1 )
            // InternalGame.g:6461:3: rule__Choix__ObjetDonAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Choix__ObjetDonAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getObjetDonAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_9__1__Impl"


    // $ANTLR start "rule__Choix__Group_9__2"
    // InternalGame.g:6469:1: rule__Choix__Group_9__2 : rule__Choix__Group_9__2__Impl ;
    public final void rule__Choix__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6473:1: ( rule__Choix__Group_9__2__Impl )
            // InternalGame.g:6474:2: rule__Choix__Group_9__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group_9__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_9__2"


    // $ANTLR start "rule__Choix__Group_9__2__Impl"
    // InternalGame.g:6480:1: rule__Choix__Group_9__2__Impl : ( ( rule__Choix__Group_9_2__0 )* ) ;
    public final void rule__Choix__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6484:1: ( ( ( rule__Choix__Group_9_2__0 )* ) )
            // InternalGame.g:6485:1: ( ( rule__Choix__Group_9_2__0 )* )
            {
            // InternalGame.g:6485:1: ( ( rule__Choix__Group_9_2__0 )* )
            // InternalGame.g:6486:2: ( rule__Choix__Group_9_2__0 )*
            {
             before(grammarAccess.getChoixAccess().getGroup_9_2()); 
            // InternalGame.g:6487:2: ( rule__Choix__Group_9_2__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==17) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalGame.g:6487:3: rule__Choix__Group_9_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Choix__Group_9_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getChoixAccess().getGroup_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_9__2__Impl"


    // $ANTLR start "rule__Choix__Group_9_2__0"
    // InternalGame.g:6496:1: rule__Choix__Group_9_2__0 : rule__Choix__Group_9_2__0__Impl rule__Choix__Group_9_2__1 ;
    public final void rule__Choix__Group_9_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6500:1: ( rule__Choix__Group_9_2__0__Impl rule__Choix__Group_9_2__1 )
            // InternalGame.g:6501:2: rule__Choix__Group_9_2__0__Impl rule__Choix__Group_9_2__1
            {
            pushFollow(FOLLOW_42);
            rule__Choix__Group_9_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group_9_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_9_2__0"


    // $ANTLR start "rule__Choix__Group_9_2__0__Impl"
    // InternalGame.g:6508:1: rule__Choix__Group_9_2__0__Impl : ( ',' ) ;
    public final void rule__Choix__Group_9_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6512:1: ( ( ',' ) )
            // InternalGame.g:6513:1: ( ',' )
            {
            // InternalGame.g:6513:1: ( ',' )
            // InternalGame.g:6514:2: ','
            {
             before(grammarAccess.getChoixAccess().getCommaKeyword_9_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getCommaKeyword_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_9_2__0__Impl"


    // $ANTLR start "rule__Choix__Group_9_2__1"
    // InternalGame.g:6523:1: rule__Choix__Group_9_2__1 : rule__Choix__Group_9_2__1__Impl ;
    public final void rule__Choix__Group_9_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6527:1: ( rule__Choix__Group_9_2__1__Impl )
            // InternalGame.g:6528:2: rule__Choix__Group_9_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group_9_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_9_2__1"


    // $ANTLR start "rule__Choix__Group_9_2__1__Impl"
    // InternalGame.g:6534:1: rule__Choix__Group_9_2__1__Impl : ( ( rule__Choix__ObjetDonAssignment_9_2_1 ) ) ;
    public final void rule__Choix__Group_9_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6538:1: ( ( ( rule__Choix__ObjetDonAssignment_9_2_1 ) ) )
            // InternalGame.g:6539:1: ( ( rule__Choix__ObjetDonAssignment_9_2_1 ) )
            {
            // InternalGame.g:6539:1: ( ( rule__Choix__ObjetDonAssignment_9_2_1 ) )
            // InternalGame.g:6540:2: ( rule__Choix__ObjetDonAssignment_9_2_1 )
            {
             before(grammarAccess.getChoixAccess().getObjetDonAssignment_9_2_1()); 
            // InternalGame.g:6541:2: ( rule__Choix__ObjetDonAssignment_9_2_1 )
            // InternalGame.g:6541:3: rule__Choix__ObjetDonAssignment_9_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Choix__ObjetDonAssignment_9_2_1();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getObjetDonAssignment_9_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_9_2__1__Impl"


    // $ANTLR start "rule__QteObjet__Group__0"
    // InternalGame.g:6550:1: rule__QteObjet__Group__0 : rule__QteObjet__Group__0__Impl rule__QteObjet__Group__1 ;
    public final void rule__QteObjet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6554:1: ( rule__QteObjet__Group__0__Impl rule__QteObjet__Group__1 )
            // InternalGame.g:6555:2: rule__QteObjet__Group__0__Impl rule__QteObjet__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__QteObjet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QteObjet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QteObjet__Group__0"


    // $ANTLR start "rule__QteObjet__Group__0__Impl"
    // InternalGame.g:6562:1: rule__QteObjet__Group__0__Impl : ( () ) ;
    public final void rule__QteObjet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6566:1: ( ( () ) )
            // InternalGame.g:6567:1: ( () )
            {
            // InternalGame.g:6567:1: ( () )
            // InternalGame.g:6568:2: ()
            {
             before(grammarAccess.getQteObjetAccess().getQteObjetAction_0()); 
            // InternalGame.g:6569:2: ()
            // InternalGame.g:6569:3: 
            {
            }

             after(grammarAccess.getQteObjetAccess().getQteObjetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QteObjet__Group__0__Impl"


    // $ANTLR start "rule__QteObjet__Group__1"
    // InternalGame.g:6577:1: rule__QteObjet__Group__1 : rule__QteObjet__Group__1__Impl rule__QteObjet__Group__2 ;
    public final void rule__QteObjet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6581:1: ( rule__QteObjet__Group__1__Impl rule__QteObjet__Group__2 )
            // InternalGame.g:6582:2: rule__QteObjet__Group__1__Impl rule__QteObjet__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__QteObjet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QteObjet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QteObjet__Group__1"


    // $ANTLR start "rule__QteObjet__Group__1__Impl"
    // InternalGame.g:6589:1: rule__QteObjet__Group__1__Impl : ( 'QteObjet' ) ;
    public final void rule__QteObjet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6593:1: ( ( 'QteObjet' ) )
            // InternalGame.g:6594:1: ( 'QteObjet' )
            {
            // InternalGame.g:6594:1: ( 'QteObjet' )
            // InternalGame.g:6595:2: 'QteObjet'
            {
             before(grammarAccess.getQteObjetAccess().getQteObjetKeyword_1()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getQteObjetAccess().getQteObjetKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QteObjet__Group__1__Impl"


    // $ANTLR start "rule__QteObjet__Group__2"
    // InternalGame.g:6604:1: rule__QteObjet__Group__2 : rule__QteObjet__Group__2__Impl rule__QteObjet__Group__3 ;
    public final void rule__QteObjet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6608:1: ( rule__QteObjet__Group__2__Impl rule__QteObjet__Group__3 )
            // InternalGame.g:6609:2: rule__QteObjet__Group__2__Impl rule__QteObjet__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__QteObjet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QteObjet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QteObjet__Group__2"


    // $ANTLR start "rule__QteObjet__Group__2__Impl"
    // InternalGame.g:6616:1: rule__QteObjet__Group__2__Impl : ( ( rule__QteObjet__NameAssignment_2 ) ) ;
    public final void rule__QteObjet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6620:1: ( ( ( rule__QteObjet__NameAssignment_2 ) ) )
            // InternalGame.g:6621:1: ( ( rule__QteObjet__NameAssignment_2 ) )
            {
            // InternalGame.g:6621:1: ( ( rule__QteObjet__NameAssignment_2 ) )
            // InternalGame.g:6622:2: ( rule__QteObjet__NameAssignment_2 )
            {
             before(grammarAccess.getQteObjetAccess().getNameAssignment_2()); 
            // InternalGame.g:6623:2: ( rule__QteObjet__NameAssignment_2 )
            // InternalGame.g:6623:3: rule__QteObjet__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__QteObjet__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQteObjetAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QteObjet__Group__2__Impl"


    // $ANTLR start "rule__QteObjet__Group__3"
    // InternalGame.g:6631:1: rule__QteObjet__Group__3 : rule__QteObjet__Group__3__Impl rule__QteObjet__Group__4 ;
    public final void rule__QteObjet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6635:1: ( rule__QteObjet__Group__3__Impl rule__QteObjet__Group__4 )
            // InternalGame.g:6636:2: rule__QteObjet__Group__3__Impl rule__QteObjet__Group__4
            {
            pushFollow(FOLLOW_43);
            rule__QteObjet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QteObjet__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QteObjet__Group__3"


    // $ANTLR start "rule__QteObjet__Group__3__Impl"
    // InternalGame.g:6643:1: rule__QteObjet__Group__3__Impl : ( '{' ) ;
    public final void rule__QteObjet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6647:1: ( ( '{' ) )
            // InternalGame.g:6648:1: ( '{' )
            {
            // InternalGame.g:6648:1: ( '{' )
            // InternalGame.g:6649:2: '{'
            {
             before(grammarAccess.getQteObjetAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getQteObjetAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QteObjet__Group__3__Impl"


    // $ANTLR start "rule__QteObjet__Group__4"
    // InternalGame.g:6658:1: rule__QteObjet__Group__4 : rule__QteObjet__Group__4__Impl rule__QteObjet__Group__5 ;
    public final void rule__QteObjet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6662:1: ( rule__QteObjet__Group__4__Impl rule__QteObjet__Group__5 )
            // InternalGame.g:6663:2: rule__QteObjet__Group__4__Impl rule__QteObjet__Group__5
            {
            pushFollow(FOLLOW_43);
            rule__QteObjet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QteObjet__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QteObjet__Group__4"


    // $ANTLR start "rule__QteObjet__Group__4__Impl"
    // InternalGame.g:6670:1: rule__QteObjet__Group__4__Impl : ( ( rule__QteObjet__Group_4__0 )? ) ;
    public final void rule__QteObjet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6674:1: ( ( ( rule__QteObjet__Group_4__0 )? ) )
            // InternalGame.g:6675:1: ( ( rule__QteObjet__Group_4__0 )? )
            {
            // InternalGame.g:6675:1: ( ( rule__QteObjet__Group_4__0 )? )
            // InternalGame.g:6676:2: ( rule__QteObjet__Group_4__0 )?
            {
             before(grammarAccess.getQteObjetAccess().getGroup_4()); 
            // InternalGame.g:6677:2: ( rule__QteObjet__Group_4__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==49) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalGame.g:6677:3: rule__QteObjet__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QteObjet__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQteObjetAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QteObjet__Group__4__Impl"


    // $ANTLR start "rule__QteObjet__Group__5"
    // InternalGame.g:6685:1: rule__QteObjet__Group__5 : rule__QteObjet__Group__5__Impl rule__QteObjet__Group__6 ;
    public final void rule__QteObjet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6689:1: ( rule__QteObjet__Group__5__Impl rule__QteObjet__Group__6 )
            // InternalGame.g:6690:2: rule__QteObjet__Group__5__Impl rule__QteObjet__Group__6
            {
            pushFollow(FOLLOW_43);
            rule__QteObjet__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QteObjet__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QteObjet__Group__5"


    // $ANTLR start "rule__QteObjet__Group__5__Impl"
    // InternalGame.g:6697:1: rule__QteObjet__Group__5__Impl : ( ( rule__QteObjet__Group_5__0 )? ) ;
    public final void rule__QteObjet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6701:1: ( ( ( rule__QteObjet__Group_5__0 )? ) )
            // InternalGame.g:6702:1: ( ( rule__QteObjet__Group_5__0 )? )
            {
            // InternalGame.g:6702:1: ( ( rule__QteObjet__Group_5__0 )? )
            // InternalGame.g:6703:2: ( rule__QteObjet__Group_5__0 )?
            {
             before(grammarAccess.getQteObjetAccess().getGroup_5()); 
            // InternalGame.g:6704:2: ( rule__QteObjet__Group_5__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==58) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalGame.g:6704:3: rule__QteObjet__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QteObjet__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQteObjetAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QteObjet__Group__5__Impl"


    // $ANTLR start "rule__QteObjet__Group__6"
    // InternalGame.g:6712:1: rule__QteObjet__Group__6 : rule__QteObjet__Group__6__Impl ;
    public final void rule__QteObjet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6716:1: ( rule__QteObjet__Group__6__Impl )
            // InternalGame.g:6717:2: rule__QteObjet__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QteObjet__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QteObjet__Group__6"


    // $ANTLR start "rule__QteObjet__Group__6__Impl"
    // InternalGame.g:6723:1: rule__QteObjet__Group__6__Impl : ( '}' ) ;
    public final void rule__QteObjet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6727:1: ( ( '}' ) )
            // InternalGame.g:6728:1: ( '}' )
            {
            // InternalGame.g:6728:1: ( '}' )
            // InternalGame.g:6729:2: '}'
            {
             before(grammarAccess.getQteObjetAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getQteObjetAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QteObjet__Group__6__Impl"


    // $ANTLR start "rule__QteObjet__Group_4__0"
    // InternalGame.g:6739:1: rule__QteObjet__Group_4__0 : rule__QteObjet__Group_4__0__Impl rule__QteObjet__Group_4__1 ;
    public final void rule__QteObjet__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6743:1: ( rule__QteObjet__Group_4__0__Impl rule__QteObjet__Group_4__1 )
            // InternalGame.g:6744:2: rule__QteObjet__Group_4__0__Impl rule__QteObjet__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__QteObjet__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QteObjet__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QteObjet__Group_4__0"


    // $ANTLR start "rule__QteObjet__Group_4__0__Impl"
    // InternalGame.g:6751:1: rule__QteObjet__Group_4__0__Impl : ( 'qte' ) ;
    public final void rule__QteObjet__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6755:1: ( ( 'qte' ) )
            // InternalGame.g:6756:1: ( 'qte' )
            {
            // InternalGame.g:6756:1: ( 'qte' )
            // InternalGame.g:6757:2: 'qte'
            {
             before(grammarAccess.getQteObjetAccess().getQteKeyword_4_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getQteObjetAccess().getQteKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QteObjet__Group_4__0__Impl"


    // $ANTLR start "rule__QteObjet__Group_4__1"
    // InternalGame.g:6766:1: rule__QteObjet__Group_4__1 : rule__QteObjet__Group_4__1__Impl ;
    public final void rule__QteObjet__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6770:1: ( rule__QteObjet__Group_4__1__Impl )
            // InternalGame.g:6771:2: rule__QteObjet__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QteObjet__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QteObjet__Group_4__1"


    // $ANTLR start "rule__QteObjet__Group_4__1__Impl"
    // InternalGame.g:6777:1: rule__QteObjet__Group_4__1__Impl : ( ( rule__QteObjet__QteAssignment_4_1 ) ) ;
    public final void rule__QteObjet__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6781:1: ( ( ( rule__QteObjet__QteAssignment_4_1 ) ) )
            // InternalGame.g:6782:1: ( ( rule__QteObjet__QteAssignment_4_1 ) )
            {
            // InternalGame.g:6782:1: ( ( rule__QteObjet__QteAssignment_4_1 ) )
            // InternalGame.g:6783:2: ( rule__QteObjet__QteAssignment_4_1 )
            {
             before(grammarAccess.getQteObjetAccess().getQteAssignment_4_1()); 
            // InternalGame.g:6784:2: ( rule__QteObjet__QteAssignment_4_1 )
            // InternalGame.g:6784:3: rule__QteObjet__QteAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__QteObjet__QteAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getQteObjetAccess().getQteAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QteObjet__Group_4__1__Impl"


    // $ANTLR start "rule__QteObjet__Group_5__0"
    // InternalGame.g:6793:1: rule__QteObjet__Group_5__0 : rule__QteObjet__Group_5__0__Impl rule__QteObjet__Group_5__1 ;
    public final void rule__QteObjet__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6797:1: ( rule__QteObjet__Group_5__0__Impl rule__QteObjet__Group_5__1 )
            // InternalGame.g:6798:2: rule__QteObjet__Group_5__0__Impl rule__QteObjet__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__QteObjet__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QteObjet__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QteObjet__Group_5__0"


    // $ANTLR start "rule__QteObjet__Group_5__0__Impl"
    // InternalGame.g:6805:1: rule__QteObjet__Group_5__0__Impl : ( 'objet' ) ;
    public final void rule__QteObjet__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6809:1: ( ( 'objet' ) )
            // InternalGame.g:6810:1: ( 'objet' )
            {
            // InternalGame.g:6810:1: ( 'objet' )
            // InternalGame.g:6811:2: 'objet'
            {
             before(grammarAccess.getQteObjetAccess().getObjetKeyword_5_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getQteObjetAccess().getObjetKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QteObjet__Group_5__0__Impl"


    // $ANTLR start "rule__QteObjet__Group_5__1"
    // InternalGame.g:6820:1: rule__QteObjet__Group_5__1 : rule__QteObjet__Group_5__1__Impl ;
    public final void rule__QteObjet__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6824:1: ( rule__QteObjet__Group_5__1__Impl )
            // InternalGame.g:6825:2: rule__QteObjet__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QteObjet__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QteObjet__Group_5__1"


    // $ANTLR start "rule__QteObjet__Group_5__1__Impl"
    // InternalGame.g:6831:1: rule__QteObjet__Group_5__1__Impl : ( ( rule__QteObjet__ObjetAssignment_5_1 ) ) ;
    public final void rule__QteObjet__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6835:1: ( ( ( rule__QteObjet__ObjetAssignment_5_1 ) ) )
            // InternalGame.g:6836:1: ( ( rule__QteObjet__ObjetAssignment_5_1 ) )
            {
            // InternalGame.g:6836:1: ( ( rule__QteObjet__ObjetAssignment_5_1 ) )
            // InternalGame.g:6837:2: ( rule__QteObjet__ObjetAssignment_5_1 )
            {
             before(grammarAccess.getQteObjetAccess().getObjetAssignment_5_1()); 
            // InternalGame.g:6838:2: ( rule__QteObjet__ObjetAssignment_5_1 )
            // InternalGame.g:6838:3: rule__QteObjet__ObjetAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__QteObjet__ObjetAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getQteObjetAccess().getObjetAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QteObjet__Group_5__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalGame.g:6847:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6851:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalGame.g:6852:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalGame.g:6859:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6863:1: ( ( ( '-' )? ) )
            // InternalGame.g:6864:1: ( ( '-' )? )
            {
            // InternalGame.g:6864:1: ( ( '-' )? )
            // InternalGame.g:6865:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalGame.g:6866:2: ( '-' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==59) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalGame.g:6866:3: '-'
                    {
                    match(input,59,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalGame.g:6874:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6878:1: ( rule__EInt__Group__1__Impl )
            // InternalGame.g:6879:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalGame.g:6885:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6889:1: ( ( RULE_INT ) )
            // InternalGame.g:6890:1: ( RULE_INT )
            {
            // InternalGame.g:6890:1: ( RULE_INT )
            // InternalGame.g:6891:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__ConditionChemin__Group__0"
    // InternalGame.g:6901:1: rule__ConditionChemin__Group__0 : rule__ConditionChemin__Group__0__Impl rule__ConditionChemin__Group__1 ;
    public final void rule__ConditionChemin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6905:1: ( rule__ConditionChemin__Group__0__Impl rule__ConditionChemin__Group__1 )
            // InternalGame.g:6906:2: rule__ConditionChemin__Group__0__Impl rule__ConditionChemin__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ConditionChemin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionChemin__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group__0"


    // $ANTLR start "rule__ConditionChemin__Group__0__Impl"
    // InternalGame.g:6913:1: rule__ConditionChemin__Group__0__Impl : ( () ) ;
    public final void rule__ConditionChemin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6917:1: ( ( () ) )
            // InternalGame.g:6918:1: ( () )
            {
            // InternalGame.g:6918:1: ( () )
            // InternalGame.g:6919:2: ()
            {
             before(grammarAccess.getConditionCheminAccess().getConditionCheminAction_0()); 
            // InternalGame.g:6920:2: ()
            // InternalGame.g:6920:3: 
            {
            }

             after(grammarAccess.getConditionCheminAccess().getConditionCheminAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group__0__Impl"


    // $ANTLR start "rule__ConditionChemin__Group__1"
    // InternalGame.g:6928:1: rule__ConditionChemin__Group__1 : rule__ConditionChemin__Group__1__Impl rule__ConditionChemin__Group__2 ;
    public final void rule__ConditionChemin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6932:1: ( rule__ConditionChemin__Group__1__Impl rule__ConditionChemin__Group__2 )
            // InternalGame.g:6933:2: rule__ConditionChemin__Group__1__Impl rule__ConditionChemin__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ConditionChemin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionChemin__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group__1"


    // $ANTLR start "rule__ConditionChemin__Group__1__Impl"
    // InternalGame.g:6940:1: rule__ConditionChemin__Group__1__Impl : ( 'ConditionChemin' ) ;
    public final void rule__ConditionChemin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6944:1: ( ( 'ConditionChemin' ) )
            // InternalGame.g:6945:1: ( 'ConditionChemin' )
            {
            // InternalGame.g:6945:1: ( 'ConditionChemin' )
            // InternalGame.g:6946:2: 'ConditionChemin'
            {
             before(grammarAccess.getConditionCheminAccess().getConditionCheminKeyword_1()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getConditionCheminAccess().getConditionCheminKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group__1__Impl"


    // $ANTLR start "rule__ConditionChemin__Group__2"
    // InternalGame.g:6955:1: rule__ConditionChemin__Group__2 : rule__ConditionChemin__Group__2__Impl rule__ConditionChemin__Group__3 ;
    public final void rule__ConditionChemin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6959:1: ( rule__ConditionChemin__Group__2__Impl rule__ConditionChemin__Group__3 )
            // InternalGame.g:6960:2: rule__ConditionChemin__Group__2__Impl rule__ConditionChemin__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ConditionChemin__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionChemin__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group__2"


    // $ANTLR start "rule__ConditionChemin__Group__2__Impl"
    // InternalGame.g:6967:1: rule__ConditionChemin__Group__2__Impl : ( ( rule__ConditionChemin__NameAssignment_2 ) ) ;
    public final void rule__ConditionChemin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6971:1: ( ( ( rule__ConditionChemin__NameAssignment_2 ) ) )
            // InternalGame.g:6972:1: ( ( rule__ConditionChemin__NameAssignment_2 ) )
            {
            // InternalGame.g:6972:1: ( ( rule__ConditionChemin__NameAssignment_2 ) )
            // InternalGame.g:6973:2: ( rule__ConditionChemin__NameAssignment_2 )
            {
             before(grammarAccess.getConditionCheminAccess().getNameAssignment_2()); 
            // InternalGame.g:6974:2: ( rule__ConditionChemin__NameAssignment_2 )
            // InternalGame.g:6974:3: rule__ConditionChemin__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConditionChemin__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionCheminAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group__2__Impl"


    // $ANTLR start "rule__ConditionChemin__Group__3"
    // InternalGame.g:6982:1: rule__ConditionChemin__Group__3 : rule__ConditionChemin__Group__3__Impl rule__ConditionChemin__Group__4 ;
    public final void rule__ConditionChemin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6986:1: ( rule__ConditionChemin__Group__3__Impl rule__ConditionChemin__Group__4 )
            // InternalGame.g:6987:2: rule__ConditionChemin__Group__3__Impl rule__ConditionChemin__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__ConditionChemin__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionChemin__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group__3"


    // $ANTLR start "rule__ConditionChemin__Group__3__Impl"
    // InternalGame.g:6994:1: rule__ConditionChemin__Group__3__Impl : ( '{' ) ;
    public final void rule__ConditionChemin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6998:1: ( ( '{' ) )
            // InternalGame.g:6999:1: ( '{' )
            {
            // InternalGame.g:6999:1: ( '{' )
            // InternalGame.g:7000:2: '{'
            {
             before(grammarAccess.getConditionCheminAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getConditionCheminAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group__3__Impl"


    // $ANTLR start "rule__ConditionChemin__Group__4"
    // InternalGame.g:7009:1: rule__ConditionChemin__Group__4 : rule__ConditionChemin__Group__4__Impl rule__ConditionChemin__Group__5 ;
    public final void rule__ConditionChemin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7013:1: ( rule__ConditionChemin__Group__4__Impl rule__ConditionChemin__Group__5 )
            // InternalGame.g:7014:2: rule__ConditionChemin__Group__4__Impl rule__ConditionChemin__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__ConditionChemin__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionChemin__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group__4"


    // $ANTLR start "rule__ConditionChemin__Group__4__Impl"
    // InternalGame.g:7021:1: rule__ConditionChemin__Group__4__Impl : ( ( rule__ConditionChemin__Group_4__0 )? ) ;
    public final void rule__ConditionChemin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7025:1: ( ( ( rule__ConditionChemin__Group_4__0 )? ) )
            // InternalGame.g:7026:1: ( ( rule__ConditionChemin__Group_4__0 )? )
            {
            // InternalGame.g:7026:1: ( ( rule__ConditionChemin__Group_4__0 )? )
            // InternalGame.g:7027:2: ( rule__ConditionChemin__Group_4__0 )?
            {
             before(grammarAccess.getConditionCheminAccess().getGroup_4()); 
            // InternalGame.g:7028:2: ( rule__ConditionChemin__Group_4__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==38) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalGame.g:7028:3: rule__ConditionChemin__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionChemin__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionCheminAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group__4__Impl"


    // $ANTLR start "rule__ConditionChemin__Group__5"
    // InternalGame.g:7036:1: rule__ConditionChemin__Group__5 : rule__ConditionChemin__Group__5__Impl rule__ConditionChemin__Group__6 ;
    public final void rule__ConditionChemin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7040:1: ( rule__ConditionChemin__Group__5__Impl rule__ConditionChemin__Group__6 )
            // InternalGame.g:7041:2: rule__ConditionChemin__Group__5__Impl rule__ConditionChemin__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__ConditionChemin__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionChemin__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group__5"


    // $ANTLR start "rule__ConditionChemin__Group__5__Impl"
    // InternalGame.g:7048:1: rule__ConditionChemin__Group__5__Impl : ( ( rule__ConditionChemin__Group_5__0 )? ) ;
    public final void rule__ConditionChemin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7052:1: ( ( ( rule__ConditionChemin__Group_5__0 )? ) )
            // InternalGame.g:7053:1: ( ( rule__ConditionChemin__Group_5__0 )? )
            {
            // InternalGame.g:7053:1: ( ( rule__ConditionChemin__Group_5__0 )? )
            // InternalGame.g:7054:2: ( rule__ConditionChemin__Group_5__0 )?
            {
             before(grammarAccess.getConditionCheminAccess().getGroup_5()); 
            // InternalGame.g:7055:2: ( rule__ConditionChemin__Group_5__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==39) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalGame.g:7055:3: rule__ConditionChemin__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionChemin__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionCheminAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group__5__Impl"


    // $ANTLR start "rule__ConditionChemin__Group__6"
    // InternalGame.g:7063:1: rule__ConditionChemin__Group__6 : rule__ConditionChemin__Group__6__Impl rule__ConditionChemin__Group__7 ;
    public final void rule__ConditionChemin__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7067:1: ( rule__ConditionChemin__Group__6__Impl rule__ConditionChemin__Group__7 )
            // InternalGame.g:7068:2: rule__ConditionChemin__Group__6__Impl rule__ConditionChemin__Group__7
            {
            pushFollow(FOLLOW_32);
            rule__ConditionChemin__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionChemin__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group__6"


    // $ANTLR start "rule__ConditionChemin__Group__6__Impl"
    // InternalGame.g:7075:1: rule__ConditionChemin__Group__6__Impl : ( ( rule__ConditionChemin__Group_6__0 )? ) ;
    public final void rule__ConditionChemin__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7079:1: ( ( ( rule__ConditionChemin__Group_6__0 )? ) )
            // InternalGame.g:7080:1: ( ( rule__ConditionChemin__Group_6__0 )? )
            {
            // InternalGame.g:7080:1: ( ( rule__ConditionChemin__Group_6__0 )? )
            // InternalGame.g:7081:2: ( rule__ConditionChemin__Group_6__0 )?
            {
             before(grammarAccess.getConditionCheminAccess().getGroup_6()); 
            // InternalGame.g:7082:2: ( rule__ConditionChemin__Group_6__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==40) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalGame.g:7082:3: rule__ConditionChemin__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionChemin__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionCheminAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group__6__Impl"


    // $ANTLR start "rule__ConditionChemin__Group__7"
    // InternalGame.g:7090:1: rule__ConditionChemin__Group__7 : rule__ConditionChemin__Group__7__Impl rule__ConditionChemin__Group__8 ;
    public final void rule__ConditionChemin__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7094:1: ( rule__ConditionChemin__Group__7__Impl rule__ConditionChemin__Group__8 )
            // InternalGame.g:7095:2: rule__ConditionChemin__Group__7__Impl rule__ConditionChemin__Group__8
            {
            pushFollow(FOLLOW_32);
            rule__ConditionChemin__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionChemin__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group__7"


    // $ANTLR start "rule__ConditionChemin__Group__7__Impl"
    // InternalGame.g:7102:1: rule__ConditionChemin__Group__7__Impl : ( ( rule__ConditionChemin__Group_7__0 )? ) ;
    public final void rule__ConditionChemin__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7106:1: ( ( ( rule__ConditionChemin__Group_7__0 )? ) )
            // InternalGame.g:7107:1: ( ( rule__ConditionChemin__Group_7__0 )? )
            {
            // InternalGame.g:7107:1: ( ( rule__ConditionChemin__Group_7__0 )? )
            // InternalGame.g:7108:2: ( rule__ConditionChemin__Group_7__0 )?
            {
             before(grammarAccess.getConditionCheminAccess().getGroup_7()); 
            // InternalGame.g:7109:2: ( rule__ConditionChemin__Group_7__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==41) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalGame.g:7109:3: rule__ConditionChemin__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionChemin__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionCheminAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group__7__Impl"


    // $ANTLR start "rule__ConditionChemin__Group__8"
    // InternalGame.g:7117:1: rule__ConditionChemin__Group__8 : rule__ConditionChemin__Group__8__Impl ;
    public final void rule__ConditionChemin__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7121:1: ( rule__ConditionChemin__Group__8__Impl )
            // InternalGame.g:7122:2: rule__ConditionChemin__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionChemin__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group__8"


    // $ANTLR start "rule__ConditionChemin__Group__8__Impl"
    // InternalGame.g:7128:1: rule__ConditionChemin__Group__8__Impl : ( '}' ) ;
    public final void rule__ConditionChemin__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7132:1: ( ( '}' ) )
            // InternalGame.g:7133:1: ( '}' )
            {
            // InternalGame.g:7133:1: ( '}' )
            // InternalGame.g:7134:2: '}'
            {
             before(grammarAccess.getConditionCheminAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConditionCheminAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group__8__Impl"


    // $ANTLR start "rule__ConditionChemin__Group_4__0"
    // InternalGame.g:7144:1: rule__ConditionChemin__Group_4__0 : rule__ConditionChemin__Group_4__0__Impl rule__ConditionChemin__Group_4__1 ;
    public final void rule__ConditionChemin__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7148:1: ( rule__ConditionChemin__Group_4__0__Impl rule__ConditionChemin__Group_4__1 )
            // InternalGame.g:7149:2: rule__ConditionChemin__Group_4__0__Impl rule__ConditionChemin__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__ConditionChemin__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionChemin__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group_4__0"


    // $ANTLR start "rule__ConditionChemin__Group_4__0__Impl"
    // InternalGame.g:7156:1: rule__ConditionChemin__Group_4__0__Impl : ( 'connaissanceRequise' ) ;
    public final void rule__ConditionChemin__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7160:1: ( ( 'connaissanceRequise' ) )
            // InternalGame.g:7161:1: ( 'connaissanceRequise' )
            {
            // InternalGame.g:7161:1: ( 'connaissanceRequise' )
            // InternalGame.g:7162:2: 'connaissanceRequise'
            {
             before(grammarAccess.getConditionCheminAccess().getConnaissanceRequiseKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getConditionCheminAccess().getConnaissanceRequiseKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group_4__0__Impl"


    // $ANTLR start "rule__ConditionChemin__Group_4__1"
    // InternalGame.g:7171:1: rule__ConditionChemin__Group_4__1 : rule__ConditionChemin__Group_4__1__Impl ;
    public final void rule__ConditionChemin__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7175:1: ( rule__ConditionChemin__Group_4__1__Impl )
            // InternalGame.g:7176:2: rule__ConditionChemin__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionChemin__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group_4__1"


    // $ANTLR start "rule__ConditionChemin__Group_4__1__Impl"
    // InternalGame.g:7182:1: rule__ConditionChemin__Group_4__1__Impl : ( ( rule__ConditionChemin__ConnaissanceRequiseAssignment_4_1 ) ) ;
    public final void rule__ConditionChemin__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7186:1: ( ( ( rule__ConditionChemin__ConnaissanceRequiseAssignment_4_1 ) ) )
            // InternalGame.g:7187:1: ( ( rule__ConditionChemin__ConnaissanceRequiseAssignment_4_1 ) )
            {
            // InternalGame.g:7187:1: ( ( rule__ConditionChemin__ConnaissanceRequiseAssignment_4_1 ) )
            // InternalGame.g:7188:2: ( rule__ConditionChemin__ConnaissanceRequiseAssignment_4_1 )
            {
             before(grammarAccess.getConditionCheminAccess().getConnaissanceRequiseAssignment_4_1()); 
            // InternalGame.g:7189:2: ( rule__ConditionChemin__ConnaissanceRequiseAssignment_4_1 )
            // InternalGame.g:7189:3: rule__ConditionChemin__ConnaissanceRequiseAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionChemin__ConnaissanceRequiseAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionCheminAccess().getConnaissanceRequiseAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group_4__1__Impl"


    // $ANTLR start "rule__ConditionChemin__Group_5__0"
    // InternalGame.g:7198:1: rule__ConditionChemin__Group_5__0 : rule__ConditionChemin__Group_5__0__Impl rule__ConditionChemin__Group_5__1 ;
    public final void rule__ConditionChemin__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7202:1: ( rule__ConditionChemin__Group_5__0__Impl rule__ConditionChemin__Group_5__1 )
            // InternalGame.g:7203:2: rule__ConditionChemin__Group_5__0__Impl rule__ConditionChemin__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__ConditionChemin__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionChemin__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group_5__0"


    // $ANTLR start "rule__ConditionChemin__Group_5__0__Impl"
    // InternalGame.g:7210:1: rule__ConditionChemin__Group_5__0__Impl : ( 'connaissanceInterdite' ) ;
    public final void rule__ConditionChemin__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7214:1: ( ( 'connaissanceInterdite' ) )
            // InternalGame.g:7215:1: ( 'connaissanceInterdite' )
            {
            // InternalGame.g:7215:1: ( 'connaissanceInterdite' )
            // InternalGame.g:7216:2: 'connaissanceInterdite'
            {
             before(grammarAccess.getConditionCheminAccess().getConnaissanceInterditeKeyword_5_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getConditionCheminAccess().getConnaissanceInterditeKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group_5__0__Impl"


    // $ANTLR start "rule__ConditionChemin__Group_5__1"
    // InternalGame.g:7225:1: rule__ConditionChemin__Group_5__1 : rule__ConditionChemin__Group_5__1__Impl ;
    public final void rule__ConditionChemin__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7229:1: ( rule__ConditionChemin__Group_5__1__Impl )
            // InternalGame.g:7230:2: rule__ConditionChemin__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionChemin__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group_5__1"


    // $ANTLR start "rule__ConditionChemin__Group_5__1__Impl"
    // InternalGame.g:7236:1: rule__ConditionChemin__Group_5__1__Impl : ( ( rule__ConditionChemin__ConnaissanceInterditeAssignment_5_1 ) ) ;
    public final void rule__ConditionChemin__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7240:1: ( ( ( rule__ConditionChemin__ConnaissanceInterditeAssignment_5_1 ) ) )
            // InternalGame.g:7241:1: ( ( rule__ConditionChemin__ConnaissanceInterditeAssignment_5_1 ) )
            {
            // InternalGame.g:7241:1: ( ( rule__ConditionChemin__ConnaissanceInterditeAssignment_5_1 ) )
            // InternalGame.g:7242:2: ( rule__ConditionChemin__ConnaissanceInterditeAssignment_5_1 )
            {
             before(grammarAccess.getConditionCheminAccess().getConnaissanceInterditeAssignment_5_1()); 
            // InternalGame.g:7243:2: ( rule__ConditionChemin__ConnaissanceInterditeAssignment_5_1 )
            // InternalGame.g:7243:3: rule__ConditionChemin__ConnaissanceInterditeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionChemin__ConnaissanceInterditeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionCheminAccess().getConnaissanceInterditeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group_5__1__Impl"


    // $ANTLR start "rule__ConditionChemin__Group_6__0"
    // InternalGame.g:7252:1: rule__ConditionChemin__Group_6__0 : rule__ConditionChemin__Group_6__0__Impl rule__ConditionChemin__Group_6__1 ;
    public final void rule__ConditionChemin__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7256:1: ( rule__ConditionChemin__Group_6__0__Impl rule__ConditionChemin__Group_6__1 )
            // InternalGame.g:7257:2: rule__ConditionChemin__Group_6__0__Impl rule__ConditionChemin__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__ConditionChemin__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionChemin__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group_6__0"


    // $ANTLR start "rule__ConditionChemin__Group_6__0__Impl"
    // InternalGame.g:7264:1: rule__ConditionChemin__Group_6__0__Impl : ( 'objetRequis' ) ;
    public final void rule__ConditionChemin__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7268:1: ( ( 'objetRequis' ) )
            // InternalGame.g:7269:1: ( 'objetRequis' )
            {
            // InternalGame.g:7269:1: ( 'objetRequis' )
            // InternalGame.g:7270:2: 'objetRequis'
            {
             before(grammarAccess.getConditionCheminAccess().getObjetRequisKeyword_6_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getConditionCheminAccess().getObjetRequisKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group_6__0__Impl"


    // $ANTLR start "rule__ConditionChemin__Group_6__1"
    // InternalGame.g:7279:1: rule__ConditionChemin__Group_6__1 : rule__ConditionChemin__Group_6__1__Impl ;
    public final void rule__ConditionChemin__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7283:1: ( rule__ConditionChemin__Group_6__1__Impl )
            // InternalGame.g:7284:2: rule__ConditionChemin__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionChemin__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group_6__1"


    // $ANTLR start "rule__ConditionChemin__Group_6__1__Impl"
    // InternalGame.g:7290:1: rule__ConditionChemin__Group_6__1__Impl : ( ( rule__ConditionChemin__ObjetRequisAssignment_6_1 ) ) ;
    public final void rule__ConditionChemin__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7294:1: ( ( ( rule__ConditionChemin__ObjetRequisAssignment_6_1 ) ) )
            // InternalGame.g:7295:1: ( ( rule__ConditionChemin__ObjetRequisAssignment_6_1 ) )
            {
            // InternalGame.g:7295:1: ( ( rule__ConditionChemin__ObjetRequisAssignment_6_1 ) )
            // InternalGame.g:7296:2: ( rule__ConditionChemin__ObjetRequisAssignment_6_1 )
            {
             before(grammarAccess.getConditionCheminAccess().getObjetRequisAssignment_6_1()); 
            // InternalGame.g:7297:2: ( rule__ConditionChemin__ObjetRequisAssignment_6_1 )
            // InternalGame.g:7297:3: rule__ConditionChemin__ObjetRequisAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionChemin__ObjetRequisAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionCheminAccess().getObjetRequisAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group_6__1__Impl"


    // $ANTLR start "rule__ConditionChemin__Group_7__0"
    // InternalGame.g:7306:1: rule__ConditionChemin__Group_7__0 : rule__ConditionChemin__Group_7__0__Impl rule__ConditionChemin__Group_7__1 ;
    public final void rule__ConditionChemin__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7310:1: ( rule__ConditionChemin__Group_7__0__Impl rule__ConditionChemin__Group_7__1 )
            // InternalGame.g:7311:2: rule__ConditionChemin__Group_7__0__Impl rule__ConditionChemin__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__ConditionChemin__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionChemin__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group_7__0"


    // $ANTLR start "rule__ConditionChemin__Group_7__0__Impl"
    // InternalGame.g:7318:1: rule__ConditionChemin__Group_7__0__Impl : ( 'objetInterdit' ) ;
    public final void rule__ConditionChemin__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7322:1: ( ( 'objetInterdit' ) )
            // InternalGame.g:7323:1: ( 'objetInterdit' )
            {
            // InternalGame.g:7323:1: ( 'objetInterdit' )
            // InternalGame.g:7324:2: 'objetInterdit'
            {
             before(grammarAccess.getConditionCheminAccess().getObjetInterditKeyword_7_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getConditionCheminAccess().getObjetInterditKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group_7__0__Impl"


    // $ANTLR start "rule__ConditionChemin__Group_7__1"
    // InternalGame.g:7333:1: rule__ConditionChemin__Group_7__1 : rule__ConditionChemin__Group_7__1__Impl ;
    public final void rule__ConditionChemin__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7337:1: ( rule__ConditionChemin__Group_7__1__Impl )
            // InternalGame.g:7338:2: rule__ConditionChemin__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionChemin__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group_7__1"


    // $ANTLR start "rule__ConditionChemin__Group_7__1__Impl"
    // InternalGame.g:7344:1: rule__ConditionChemin__Group_7__1__Impl : ( ( rule__ConditionChemin__ObjetInterditAssignment_7_1 ) ) ;
    public final void rule__ConditionChemin__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7348:1: ( ( ( rule__ConditionChemin__ObjetInterditAssignment_7_1 ) ) )
            // InternalGame.g:7349:1: ( ( rule__ConditionChemin__ObjetInterditAssignment_7_1 ) )
            {
            // InternalGame.g:7349:1: ( ( rule__ConditionChemin__ObjetInterditAssignment_7_1 ) )
            // InternalGame.g:7350:2: ( rule__ConditionChemin__ObjetInterditAssignment_7_1 )
            {
             before(grammarAccess.getConditionCheminAccess().getObjetInterditAssignment_7_1()); 
            // InternalGame.g:7351:2: ( rule__ConditionChemin__ObjetInterditAssignment_7_1 )
            // InternalGame.g:7351:3: rule__ConditionChemin__ObjetInterditAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionChemin__ObjetInterditAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionCheminAccess().getObjetInterditAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__Group_7__1__Impl"


    // $ANTLR start "rule__Jeu__NameAssignment_2"
    // InternalGame.g:7360:1: rule__Jeu__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Jeu__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7364:1: ( ( RULE_ID ) )
            // InternalGame.g:7365:2: ( RULE_ID )
            {
            // InternalGame.g:7365:2: ( RULE_ID )
            // InternalGame.g:7366:3: RULE_ID
            {
             before(grammarAccess.getJeuAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__NameAssignment_2"


    // $ANTLR start "rule__Jeu__TerritoireAssignment_4"
    // InternalGame.g:7375:1: rule__Jeu__TerritoireAssignment_4 : ( ruleTerritoire ) ;
    public final void rule__Jeu__TerritoireAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7379:1: ( ( ruleTerritoire ) )
            // InternalGame.g:7380:2: ( ruleTerritoire )
            {
            // InternalGame.g:7380:2: ( ruleTerritoire )
            // InternalGame.g:7381:3: ruleTerritoire
            {
             before(grammarAccess.getJeuAccess().getTerritoireTerritoireParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTerritoire();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getTerritoireTerritoireParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__TerritoireAssignment_4"


    // $ANTLR start "rule__Jeu__ExplorateurAssignment_5"
    // InternalGame.g:7390:1: rule__Jeu__ExplorateurAssignment_5 : ( ruleExplorateur ) ;
    public final void rule__Jeu__ExplorateurAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7394:1: ( ( ruleExplorateur ) )
            // InternalGame.g:7395:2: ( ruleExplorateur )
            {
            // InternalGame.g:7395:2: ( ruleExplorateur )
            // InternalGame.g:7396:3: ruleExplorateur
            {
             before(grammarAccess.getJeuAccess().getExplorateurExplorateurParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExplorateur();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getExplorateurExplorateurParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__ExplorateurAssignment_5"


    // $ANTLR start "rule__Jeu__ElementsjeuAssignment_6"
    // InternalGame.g:7405:1: rule__Jeu__ElementsjeuAssignment_6 : ( ruleElementsJeu ) ;
    public final void rule__Jeu__ElementsjeuAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7409:1: ( ( ruleElementsJeu ) )
            // InternalGame.g:7410:2: ( ruleElementsJeu )
            {
            // InternalGame.g:7410:2: ( ruleElementsJeu )
            // InternalGame.g:7411:3: ruleElementsJeu
            {
             before(grammarAccess.getJeuAccess().getElementsjeuElementsJeuParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleElementsJeu();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getElementsjeuElementsJeuParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__ElementsjeuAssignment_6"


    // $ANTLR start "rule__Jeu__ElementsjeuAssignment_7_1"
    // InternalGame.g:7420:1: rule__Jeu__ElementsjeuAssignment_7_1 : ( ruleElementsJeu ) ;
    public final void rule__Jeu__ElementsjeuAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7424:1: ( ( ruleElementsJeu ) )
            // InternalGame.g:7425:2: ( ruleElementsJeu )
            {
            // InternalGame.g:7425:2: ( ruleElementsJeu )
            // InternalGame.g:7426:3: ruleElementsJeu
            {
             before(grammarAccess.getJeuAccess().getElementsjeuElementsJeuParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElementsJeu();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getElementsjeuElementsJeuParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__ElementsjeuAssignment_7_1"


    // $ANTLR start "rule__Territoire__PlacesAssignment_4"
    // InternalGame.g:7435:1: rule__Territoire__PlacesAssignment_4 : ( rulePlace ) ;
    public final void rule__Territoire__PlacesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7439:1: ( ( rulePlace ) )
            // InternalGame.g:7440:2: ( rulePlace )
            {
            // InternalGame.g:7440:2: ( rulePlace )
            // InternalGame.g:7441:3: rulePlace
            {
             before(grammarAccess.getTerritoireAccess().getPlacesPlaceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePlace();

            state._fsp--;

             after(grammarAccess.getTerritoireAccess().getPlacesPlaceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__PlacesAssignment_4"


    // $ANTLR start "rule__Territoire__PlacesAssignment_5_1"
    // InternalGame.g:7450:1: rule__Territoire__PlacesAssignment_5_1 : ( rulePlace ) ;
    public final void rule__Territoire__PlacesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7454:1: ( ( rulePlace ) )
            // InternalGame.g:7455:2: ( rulePlace )
            {
            // InternalGame.g:7455:2: ( rulePlace )
            // InternalGame.g:7456:3: rulePlace
            {
             before(grammarAccess.getTerritoireAccess().getPlacesPlaceParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlace();

            state._fsp--;

             after(grammarAccess.getTerritoireAccess().getPlacesPlaceParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__PlacesAssignment_5_1"


    // $ANTLR start "rule__Explorateur__TailleDispoAssignment_4"
    // InternalGame.g:7465:1: rule__Explorateur__TailleDispoAssignment_4 : ( ruleEInt ) ;
    public final void rule__Explorateur__TailleDispoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7469:1: ( ( ruleEInt ) )
            // InternalGame.g:7470:2: ( ruleEInt )
            {
            // InternalGame.g:7470:2: ( ruleEInt )
            // InternalGame.g:7471:3: ruleEInt
            {
             before(grammarAccess.getExplorateurAccess().getTailleDispoEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getExplorateurAccess().getTailleDispoEIntParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__TailleDispoAssignment_4"


    // $ANTLR start "rule__Explorateur__PlaceAssignment_6"
    // InternalGame.g:7480:1: rule__Explorateur__PlaceAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Explorateur__PlaceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7484:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:7485:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:7485:2: ( ( RULE_ID ) )
            // InternalGame.g:7486:3: ( RULE_ID )
            {
             before(grammarAccess.getExplorateurAccess().getPlacePlaceCrossReference_6_0()); 
            // InternalGame.g:7487:3: ( RULE_ID )
            // InternalGame.g:7488:4: RULE_ID
            {
             before(grammarAccess.getExplorateurAccess().getPlacePlaceIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getPlacePlaceIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getExplorateurAccess().getPlacePlaceCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__PlaceAssignment_6"


    // $ANTLR start "rule__Explorateur__ObjetsAssignment_7_1"
    // InternalGame.g:7499:1: rule__Explorateur__ObjetsAssignment_7_1 : ( ruleObjet ) ;
    public final void rule__Explorateur__ObjetsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7503:1: ( ( ruleObjet ) )
            // InternalGame.g:7504:2: ( ruleObjet )
            {
            // InternalGame.g:7504:2: ( ruleObjet )
            // InternalGame.g:7505:3: ruleObjet
            {
             before(grammarAccess.getExplorateurAccess().getObjetsObjetParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObjet();

            state._fsp--;

             after(grammarAccess.getExplorateurAccess().getObjetsObjetParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__ObjetsAssignment_7_1"


    // $ANTLR start "rule__Explorateur__ObjetsAssignment_7_2_1"
    // InternalGame.g:7514:1: rule__Explorateur__ObjetsAssignment_7_2_1 : ( ruleObjet ) ;
    public final void rule__Explorateur__ObjetsAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7518:1: ( ( ruleObjet ) )
            // InternalGame.g:7519:2: ( ruleObjet )
            {
            // InternalGame.g:7519:2: ( ruleObjet )
            // InternalGame.g:7520:3: ruleObjet
            {
             before(grammarAccess.getExplorateurAccess().getObjetsObjetParserRuleCall_7_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObjet();

            state._fsp--;

             after(grammarAccess.getExplorateurAccess().getObjetsObjetParserRuleCall_7_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__ObjetsAssignment_7_2_1"


    // $ANTLR start "rule__Explorateur__ConnaissancesAssignment_8_1"
    // InternalGame.g:7529:1: rule__Explorateur__ConnaissancesAssignment_8_1 : ( ruleConnaissance ) ;
    public final void rule__Explorateur__ConnaissancesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7533:1: ( ( ruleConnaissance ) )
            // InternalGame.g:7534:2: ( ruleConnaissance )
            {
            // InternalGame.g:7534:2: ( ruleConnaissance )
            // InternalGame.g:7535:3: ruleConnaissance
            {
             before(grammarAccess.getExplorateurAccess().getConnaissancesConnaissanceParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConnaissance();

            state._fsp--;

             after(grammarAccess.getExplorateurAccess().getConnaissancesConnaissanceParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__ConnaissancesAssignment_8_1"


    // $ANTLR start "rule__Explorateur__ConnaissancesAssignment_8_2_1"
    // InternalGame.g:7544:1: rule__Explorateur__ConnaissancesAssignment_8_2_1 : ( ruleConnaissance ) ;
    public final void rule__Explorateur__ConnaissancesAssignment_8_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7548:1: ( ( ruleConnaissance ) )
            // InternalGame.g:7549:2: ( ruleConnaissance )
            {
            // InternalGame.g:7549:2: ( ruleConnaissance )
            // InternalGame.g:7550:3: ruleConnaissance
            {
             before(grammarAccess.getExplorateurAccess().getConnaissancesConnaissanceParserRuleCall_8_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConnaissance();

            state._fsp--;

             after(grammarAccess.getExplorateurAccess().getConnaissancesConnaissanceParserRuleCall_8_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__ConnaissancesAssignment_8_2_1"


    // $ANTLR start "rule__Lieu__NameAssignment_2"
    // InternalGame.g:7559:1: rule__Lieu__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Lieu__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7563:1: ( ( RULE_ID ) )
            // InternalGame.g:7564:2: ( RULE_ID )
            {
            // InternalGame.g:7564:2: ( RULE_ID )
            // InternalGame.g:7565:3: RULE_ID
            {
             before(grammarAccess.getLieuAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__NameAssignment_2"


    // $ANTLR start "rule__Lieu__NatureAssignment_5"
    // InternalGame.g:7574:1: rule__Lieu__NatureAssignment_5 : ( ruleNature ) ;
    public final void rule__Lieu__NatureAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7578:1: ( ( ruleNature ) )
            // InternalGame.g:7579:2: ( ruleNature )
            {
            // InternalGame.g:7579:2: ( ruleNature )
            // InternalGame.g:7580:3: ruleNature
            {
             before(grammarAccess.getLieuAccess().getNatureNatureEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleNature();

            state._fsp--;

             after(grammarAccess.getLieuAccess().getNatureNatureEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__NatureAssignment_5"


    // $ANTLR start "rule__Lieu__PersonnesAssignment_6_1"
    // InternalGame.g:7589:1: rule__Lieu__PersonnesAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__Lieu__PersonnesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7593:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:7594:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:7594:2: ( ( RULE_ID ) )
            // InternalGame.g:7595:3: ( RULE_ID )
            {
             before(grammarAccess.getLieuAccess().getPersonnesPersonneCrossReference_6_1_0()); 
            // InternalGame.g:7596:3: ( RULE_ID )
            // InternalGame.g:7597:4: RULE_ID
            {
             before(grammarAccess.getLieuAccess().getPersonnesPersonneIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getPersonnesPersonneIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getLieuAccess().getPersonnesPersonneCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__PersonnesAssignment_6_1"


    // $ANTLR start "rule__Lieu__PersonnesAssignment_6_2_1"
    // InternalGame.g:7608:1: rule__Lieu__PersonnesAssignment_6_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Lieu__PersonnesAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7612:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:7613:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:7613:2: ( ( RULE_ID ) )
            // InternalGame.g:7614:3: ( RULE_ID )
            {
             before(grammarAccess.getLieuAccess().getPersonnesPersonneCrossReference_6_2_1_0()); 
            // InternalGame.g:7615:3: ( RULE_ID )
            // InternalGame.g:7616:4: RULE_ID
            {
             before(grammarAccess.getLieuAccess().getPersonnesPersonneIDTerminalRuleCall_6_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getPersonnesPersonneIDTerminalRuleCall_6_2_1_0_1()); 

            }

             after(grammarAccess.getLieuAccess().getPersonnesPersonneCrossReference_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__PersonnesAssignment_6_2_1"


    // $ANTLR start "rule__Chemin__ObligatoireAssignment_1"
    // InternalGame.g:7627:1: rule__Chemin__ObligatoireAssignment_1 : ( ( 'obligatoire' ) ) ;
    public final void rule__Chemin__ObligatoireAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7631:1: ( ( ( 'obligatoire' ) ) )
            // InternalGame.g:7632:2: ( ( 'obligatoire' ) )
            {
            // InternalGame.g:7632:2: ( ( 'obligatoire' ) )
            // InternalGame.g:7633:3: ( 'obligatoire' )
            {
             before(grammarAccess.getCheminAccess().getObligatoireObligatoireKeyword_1_0()); 
            // InternalGame.g:7634:3: ( 'obligatoire' )
            // InternalGame.g:7635:4: 'obligatoire'
            {
             before(grammarAccess.getCheminAccess().getObligatoireObligatoireKeyword_1_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getObligatoireObligatoireKeyword_1_0()); 

            }

             after(grammarAccess.getCheminAccess().getObligatoireObligatoireKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__ObligatoireAssignment_1"


    // $ANTLR start "rule__Chemin__NameAssignment_3"
    // InternalGame.g:7646:1: rule__Chemin__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Chemin__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7650:1: ( ( RULE_ID ) )
            // InternalGame.g:7651:2: ( RULE_ID )
            {
            // InternalGame.g:7651:2: ( RULE_ID )
            // InternalGame.g:7652:3: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__NameAssignment_3"


    // $ANTLR start "rule__Chemin__PredAssignment_6"
    // InternalGame.g:7661:1: rule__Chemin__PredAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__PredAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7665:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:7666:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:7666:2: ( ( RULE_ID ) )
            // InternalGame.g:7667:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getPredLieuCrossReference_6_0()); 
            // InternalGame.g:7668:3: ( RULE_ID )
            // InternalGame.g:7669:4: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getPredLieuIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getPredLieuIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getCheminAccess().getPredLieuCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__PredAssignment_6"


    // $ANTLR start "rule__Chemin__SuccAssignment_8"
    // InternalGame.g:7680:1: rule__Chemin__SuccAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__SuccAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7684:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:7685:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:7685:2: ( ( RULE_ID ) )
            // InternalGame.g:7686:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getSuccLieuCrossReference_8_0()); 
            // InternalGame.g:7687:3: ( RULE_ID )
            // InternalGame.g:7688:4: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getSuccLieuIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getSuccLieuIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getCheminAccess().getSuccLieuCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__SuccAssignment_8"


    // $ANTLR start "rule__Chemin__VisibleAssignment_9_1"
    // InternalGame.g:7699:1: rule__Chemin__VisibleAssignment_9_1 : ( ruleConditionChemin ) ;
    public final void rule__Chemin__VisibleAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7703:1: ( ( ruleConditionChemin ) )
            // InternalGame.g:7704:2: ( ruleConditionChemin )
            {
            // InternalGame.g:7704:2: ( ruleConditionChemin )
            // InternalGame.g:7705:3: ruleConditionChemin
            {
             before(grammarAccess.getCheminAccess().getVisibleConditionCheminParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionChemin();

            state._fsp--;

             after(grammarAccess.getCheminAccess().getVisibleConditionCheminParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__VisibleAssignment_9_1"


    // $ANTLR start "rule__Chemin__VisibleAssignment_9_2_1"
    // InternalGame.g:7714:1: rule__Chemin__VisibleAssignment_9_2_1 : ( ruleConditionChemin ) ;
    public final void rule__Chemin__VisibleAssignment_9_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7718:1: ( ( ruleConditionChemin ) )
            // InternalGame.g:7719:2: ( ruleConditionChemin )
            {
            // InternalGame.g:7719:2: ( ruleConditionChemin )
            // InternalGame.g:7720:3: ruleConditionChemin
            {
             before(grammarAccess.getCheminAccess().getVisibleConditionCheminParserRuleCall_9_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionChemin();

            state._fsp--;

             after(grammarAccess.getCheminAccess().getVisibleConditionCheminParserRuleCall_9_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__VisibleAssignment_9_2_1"


    // $ANTLR start "rule__Chemin__OuvertAssignment_10_1"
    // InternalGame.g:7729:1: rule__Chemin__OuvertAssignment_10_1 : ( ruleConditionChemin ) ;
    public final void rule__Chemin__OuvertAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7733:1: ( ( ruleConditionChemin ) )
            // InternalGame.g:7734:2: ( ruleConditionChemin )
            {
            // InternalGame.g:7734:2: ( ruleConditionChemin )
            // InternalGame.g:7735:3: ruleConditionChemin
            {
             before(grammarAccess.getCheminAccess().getOuvertConditionCheminParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionChemin();

            state._fsp--;

             after(grammarAccess.getCheminAccess().getOuvertConditionCheminParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__OuvertAssignment_10_1"


    // $ANTLR start "rule__Chemin__OuvertAssignment_10_2_1"
    // InternalGame.g:7744:1: rule__Chemin__OuvertAssignment_10_2_1 : ( ruleConditionChemin ) ;
    public final void rule__Chemin__OuvertAssignment_10_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7748:1: ( ( ruleConditionChemin ) )
            // InternalGame.g:7749:2: ( ruleConditionChemin )
            {
            // InternalGame.g:7749:2: ( ruleConditionChemin )
            // InternalGame.g:7750:3: ruleConditionChemin
            {
             before(grammarAccess.getCheminAccess().getOuvertConditionCheminParserRuleCall_10_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionChemin();

            state._fsp--;

             after(grammarAccess.getCheminAccess().getOuvertConditionCheminParserRuleCall_10_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__OuvertAssignment_10_2_1"


    // $ANTLR start "rule__Personne__ObligatoireAssignment_0"
    // InternalGame.g:7759:1: rule__Personne__ObligatoireAssignment_0 : ( ( 'obligatoire' ) ) ;
    public final void rule__Personne__ObligatoireAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7763:1: ( ( ( 'obligatoire' ) ) )
            // InternalGame.g:7764:2: ( ( 'obligatoire' ) )
            {
            // InternalGame.g:7764:2: ( ( 'obligatoire' ) )
            // InternalGame.g:7765:3: ( 'obligatoire' )
            {
             before(grammarAccess.getPersonneAccess().getObligatoireObligatoireKeyword_0_0()); 
            // InternalGame.g:7766:3: ( 'obligatoire' )
            // InternalGame.g:7767:4: 'obligatoire'
            {
             before(grammarAccess.getPersonneAccess().getObligatoireObligatoireKeyword_0_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getObligatoireObligatoireKeyword_0_0()); 

            }

             after(grammarAccess.getPersonneAccess().getObligatoireObligatoireKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__ObligatoireAssignment_0"


    // $ANTLR start "rule__Personne__NameAssignment_2"
    // InternalGame.g:7778:1: rule__Personne__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Personne__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7782:1: ( ( RULE_ID ) )
            // InternalGame.g:7783:2: ( RULE_ID )
            {
            // InternalGame.g:7783:2: ( RULE_ID )
            // InternalGame.g:7784:3: RULE_ID
            {
             before(grammarAccess.getPersonneAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__NameAssignment_2"


    // $ANTLR start "rule__Personne__PlaceAssignment_5"
    // InternalGame.g:7793:1: rule__Personne__PlaceAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Personne__PlaceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7797:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:7798:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:7798:2: ( ( RULE_ID ) )
            // InternalGame.g:7799:3: ( RULE_ID )
            {
             before(grammarAccess.getPersonneAccess().getPlaceLieuCrossReference_5_0()); 
            // InternalGame.g:7800:3: ( RULE_ID )
            // InternalGame.g:7801:4: RULE_ID
            {
             before(grammarAccess.getPersonneAccess().getPlaceLieuIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getPlaceLieuIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getPersonneAccess().getPlaceLieuCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__PlaceAssignment_5"


    // $ANTLR start "rule__Personne__InteractionsAssignment_7"
    // InternalGame.g:7812:1: rule__Personne__InteractionsAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Personne__InteractionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7816:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:7817:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:7817:2: ( ( RULE_ID ) )
            // InternalGame.g:7818:3: ( RULE_ID )
            {
             before(grammarAccess.getPersonneAccess().getInteractionsInteractionCrossReference_7_0()); 
            // InternalGame.g:7819:3: ( RULE_ID )
            // InternalGame.g:7820:4: RULE_ID
            {
             before(grammarAccess.getPersonneAccess().getInteractionsInteractionIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getInteractionsInteractionIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getPersonneAccess().getInteractionsInteractionCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__InteractionsAssignment_7"


    // $ANTLR start "rule__Personne__InteractionsAssignment_8_1"
    // InternalGame.g:7831:1: rule__Personne__InteractionsAssignment_8_1 : ( ( RULE_ID ) ) ;
    public final void rule__Personne__InteractionsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7835:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:7836:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:7836:2: ( ( RULE_ID ) )
            // InternalGame.g:7837:3: ( RULE_ID )
            {
             before(grammarAccess.getPersonneAccess().getInteractionsInteractionCrossReference_8_1_0()); 
            // InternalGame.g:7838:3: ( RULE_ID )
            // InternalGame.g:7839:4: RULE_ID
            {
             before(grammarAccess.getPersonneAccess().getInteractionsInteractionIDTerminalRuleCall_8_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getInteractionsInteractionIDTerminalRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getPersonneAccess().getInteractionsInteractionCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__InteractionsAssignment_8_1"


    // $ANTLR start "rule__Personne__VisibleAssignment_9_1"
    // InternalGame.g:7850:1: rule__Personne__VisibleAssignment_9_1 : ( ruleConditionPersonne ) ;
    public final void rule__Personne__VisibleAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7854:1: ( ( ruleConditionPersonne ) )
            // InternalGame.g:7855:2: ( ruleConditionPersonne )
            {
            // InternalGame.g:7855:2: ( ruleConditionPersonne )
            // InternalGame.g:7856:3: ruleConditionPersonne
            {
             before(grammarAccess.getPersonneAccess().getVisibleConditionPersonneParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionPersonne();

            state._fsp--;

             after(grammarAccess.getPersonneAccess().getVisibleConditionPersonneParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__VisibleAssignment_9_1"


    // $ANTLR start "rule__Personne__VisibleAssignment_9_2_1"
    // InternalGame.g:7865:1: rule__Personne__VisibleAssignment_9_2_1 : ( ruleConditionPersonne ) ;
    public final void rule__Personne__VisibleAssignment_9_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7869:1: ( ( ruleConditionPersonne ) )
            // InternalGame.g:7870:2: ( ruleConditionPersonne )
            {
            // InternalGame.g:7870:2: ( ruleConditionPersonne )
            // InternalGame.g:7871:3: ruleConditionPersonne
            {
             before(grammarAccess.getPersonneAccess().getVisibleConditionPersonneParserRuleCall_9_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionPersonne();

            state._fsp--;

             after(grammarAccess.getPersonneAccess().getVisibleConditionPersonneParserRuleCall_9_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__VisibleAssignment_9_2_1"


    // $ANTLR start "rule__Personne__ActiveAssignment_10_1"
    // InternalGame.g:7880:1: rule__Personne__ActiveAssignment_10_1 : ( ruleConditionPersonne ) ;
    public final void rule__Personne__ActiveAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7884:1: ( ( ruleConditionPersonne ) )
            // InternalGame.g:7885:2: ( ruleConditionPersonne )
            {
            // InternalGame.g:7885:2: ( ruleConditionPersonne )
            // InternalGame.g:7886:3: ruleConditionPersonne
            {
             before(grammarAccess.getPersonneAccess().getActiveConditionPersonneParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionPersonne();

            state._fsp--;

             after(grammarAccess.getPersonneAccess().getActiveConditionPersonneParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__ActiveAssignment_10_1"


    // $ANTLR start "rule__Personne__ActiveAssignment_10_2_1"
    // InternalGame.g:7895:1: rule__Personne__ActiveAssignment_10_2_1 : ( ruleConditionPersonne ) ;
    public final void rule__Personne__ActiveAssignment_10_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7899:1: ( ( ruleConditionPersonne ) )
            // InternalGame.g:7900:2: ( ruleConditionPersonne )
            {
            // InternalGame.g:7900:2: ( ruleConditionPersonne )
            // InternalGame.g:7901:3: ruleConditionPersonne
            {
             before(grammarAccess.getPersonneAccess().getActiveConditionPersonneParserRuleCall_10_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionPersonne();

            state._fsp--;

             after(grammarAccess.getPersonneAccess().getActiveConditionPersonneParserRuleCall_10_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__ActiveAssignment_10_2_1"


    // $ANTLR start "rule__ConditionPersonne__NameAssignment_2"
    // InternalGame.g:7910:1: rule__ConditionPersonne__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ConditionPersonne__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7914:1: ( ( RULE_ID ) )
            // InternalGame.g:7915:2: ( RULE_ID )
            {
            // InternalGame.g:7915:2: ( RULE_ID )
            // InternalGame.g:7916:3: RULE_ID
            {
             before(grammarAccess.getConditionPersonneAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionPersonneAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__NameAssignment_2"


    // $ANTLR start "rule__ConditionPersonne__ConnaissanceRequiseAssignment_4_1"
    // InternalGame.g:7925:1: rule__ConditionPersonne__ConnaissanceRequiseAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConditionPersonne__ConnaissanceRequiseAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7929:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:7930:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:7930:2: ( ( RULE_ID ) )
            // InternalGame.g:7931:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionPersonneAccess().getConnaissanceRequiseConnaissanceCrossReference_4_1_0()); 
            // InternalGame.g:7932:3: ( RULE_ID )
            // InternalGame.g:7933:4: RULE_ID
            {
             before(grammarAccess.getConditionPersonneAccess().getConnaissanceRequiseConnaissanceIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionPersonneAccess().getConnaissanceRequiseConnaissanceIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getConditionPersonneAccess().getConnaissanceRequiseConnaissanceCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__ConnaissanceRequiseAssignment_4_1"


    // $ANTLR start "rule__ConditionPersonne__ConnaissanceInterditeAssignment_5_1"
    // InternalGame.g:7944:1: rule__ConditionPersonne__ConnaissanceInterditeAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConditionPersonne__ConnaissanceInterditeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7948:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:7949:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:7949:2: ( ( RULE_ID ) )
            // InternalGame.g:7950:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionPersonneAccess().getConnaissanceInterditeConnaissanceCrossReference_5_1_0()); 
            // InternalGame.g:7951:3: ( RULE_ID )
            // InternalGame.g:7952:4: RULE_ID
            {
             before(grammarAccess.getConditionPersonneAccess().getConnaissanceInterditeConnaissanceIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionPersonneAccess().getConnaissanceInterditeConnaissanceIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getConditionPersonneAccess().getConnaissanceInterditeConnaissanceCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__ConnaissanceInterditeAssignment_5_1"


    // $ANTLR start "rule__ConditionPersonne__ObjetRequisAssignment_6_1"
    // InternalGame.g:7963:1: rule__ConditionPersonne__ObjetRequisAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConditionPersonne__ObjetRequisAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7967:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:7968:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:7968:2: ( ( RULE_ID ) )
            // InternalGame.g:7969:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionPersonneAccess().getObjetRequisQteObjetCrossReference_6_1_0()); 
            // InternalGame.g:7970:3: ( RULE_ID )
            // InternalGame.g:7971:4: RULE_ID
            {
             before(grammarAccess.getConditionPersonneAccess().getObjetRequisQteObjetIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionPersonneAccess().getObjetRequisQteObjetIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getConditionPersonneAccess().getObjetRequisQteObjetCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__ObjetRequisAssignment_6_1"


    // $ANTLR start "rule__ConditionPersonne__ObjetInterditAssignment_7_1"
    // InternalGame.g:7982:1: rule__ConditionPersonne__ObjetInterditAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConditionPersonne__ObjetInterditAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7986:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:7987:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:7987:2: ( ( RULE_ID ) )
            // InternalGame.g:7988:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionPersonneAccess().getObjetInterditQteObjetCrossReference_7_1_0()); 
            // InternalGame.g:7989:3: ( RULE_ID )
            // InternalGame.g:7990:4: RULE_ID
            {
             before(grammarAccess.getConditionPersonneAccess().getObjetInterditQteObjetIDTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionPersonneAccess().getObjetInterditQteObjetIDTerminalRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getConditionPersonneAccess().getObjetInterditQteObjetCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionPersonne__ObjetInterditAssignment_7_1"


    // $ANTLR start "rule__Interaction__NameAssignment_1"
    // InternalGame.g:8001:1: rule__Interaction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Interaction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8005:1: ( ( RULE_ID ) )
            // InternalGame.g:8006:2: ( RULE_ID )
            {
            // InternalGame.g:8006:2: ( RULE_ID )
            // InternalGame.g:8007:3: RULE_ID
            {
             before(grammarAccess.getInteractionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__NameAssignment_1"


    // $ANTLR start "rule__Interaction__QuestionAssignment_3_1"
    // InternalGame.g:8016:1: rule__Interaction__QuestionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Interaction__QuestionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8020:1: ( ( RULE_STRING ) )
            // InternalGame.g:8021:2: ( RULE_STRING )
            {
            // InternalGame.g:8021:2: ( RULE_STRING )
            // InternalGame.g:8022:3: RULE_STRING
            {
             before(grammarAccess.getInteractionAccess().getQuestionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getQuestionSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__QuestionAssignment_3_1"


    // $ANTLR start "rule__Interaction__PersonneAssignment_5"
    // InternalGame.g:8031:1: rule__Interaction__PersonneAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Interaction__PersonneAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8035:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:8036:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:8036:2: ( ( RULE_ID ) )
            // InternalGame.g:8037:3: ( RULE_ID )
            {
             before(grammarAccess.getInteractionAccess().getPersonnePersonneCrossReference_5_0()); 
            // InternalGame.g:8038:3: ( RULE_ID )
            // InternalGame.g:8039:4: RULE_ID
            {
             before(grammarAccess.getInteractionAccess().getPersonnePersonneIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getPersonnePersonneIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getInteractionAccess().getPersonnePersonneCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__PersonneAssignment_5"


    // $ANTLR start "rule__Interaction__ChoixAssignment_6_1"
    // InternalGame.g:8050:1: rule__Interaction__ChoixAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__Interaction__ChoixAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8054:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:8055:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:8055:2: ( ( RULE_ID ) )
            // InternalGame.g:8056:3: ( RULE_ID )
            {
             before(grammarAccess.getInteractionAccess().getChoixChoixCrossReference_6_1_0()); 
            // InternalGame.g:8057:3: ( RULE_ID )
            // InternalGame.g:8058:4: RULE_ID
            {
             before(grammarAccess.getInteractionAccess().getChoixChoixIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getChoixChoixIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getInteractionAccess().getChoixChoixCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__ChoixAssignment_6_1"


    // $ANTLR start "rule__Interaction__ChoixAssignment_6_2_1"
    // InternalGame.g:8069:1: rule__Interaction__ChoixAssignment_6_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Interaction__ChoixAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8073:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:8074:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:8074:2: ( ( RULE_ID ) )
            // InternalGame.g:8075:3: ( RULE_ID )
            {
             before(grammarAccess.getInteractionAccess().getChoixChoixCrossReference_6_2_1_0()); 
            // InternalGame.g:8076:3: ( RULE_ID )
            // InternalGame.g:8077:4: RULE_ID
            {
             before(grammarAccess.getInteractionAccess().getChoixChoixIDTerminalRuleCall_6_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getChoixChoixIDTerminalRuleCall_6_2_1_0_1()); 

            }

             after(grammarAccess.getInteractionAccess().getChoixChoixCrossReference_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__ChoixAssignment_6_2_1"


    // $ANTLR start "rule__Connaissance__NameAssignment_2"
    // InternalGame.g:8088:1: rule__Connaissance__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Connaissance__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8092:1: ( ( RULE_ID ) )
            // InternalGame.g:8093:2: ( RULE_ID )
            {
            // InternalGame.g:8093:2: ( RULE_ID )
            // InternalGame.g:8094:3: RULE_ID
            {
             before(grammarAccess.getConnaissanceAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__NameAssignment_2"


    // $ANTLR start "rule__Connaissance__ChoixAssignment_4_1"
    // InternalGame.g:8103:1: rule__Connaissance__ChoixAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Connaissance__ChoixAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8107:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:8108:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:8108:2: ( ( RULE_ID ) )
            // InternalGame.g:8109:3: ( RULE_ID )
            {
             before(grammarAccess.getConnaissanceAccess().getChoixChoixCrossReference_4_1_0()); 
            // InternalGame.g:8110:3: ( RULE_ID )
            // InternalGame.g:8111:4: RULE_ID
            {
             before(grammarAccess.getConnaissanceAccess().getChoixChoixIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getChoixChoixIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getConnaissanceAccess().getChoixChoixCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__ChoixAssignment_4_1"


    // $ANTLR start "rule__Connaissance__VisibleAssignment_5_1"
    // InternalGame.g:8122:1: rule__Connaissance__VisibleAssignment_5_1 : ( ruleConditionAvantage ) ;
    public final void rule__Connaissance__VisibleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8126:1: ( ( ruleConditionAvantage ) )
            // InternalGame.g:8127:2: ( ruleConditionAvantage )
            {
            // InternalGame.g:8127:2: ( ruleConditionAvantage )
            // InternalGame.g:8128:3: ruleConditionAvantage
            {
             before(grammarAccess.getConnaissanceAccess().getVisibleConditionAvantageParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionAvantage();

            state._fsp--;

             after(grammarAccess.getConnaissanceAccess().getVisibleConditionAvantageParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__VisibleAssignment_5_1"


    // $ANTLR start "rule__Connaissance__VisibleAssignment_5_2_1"
    // InternalGame.g:8137:1: rule__Connaissance__VisibleAssignment_5_2_1 : ( ruleConditionAvantage ) ;
    public final void rule__Connaissance__VisibleAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8141:1: ( ( ruleConditionAvantage ) )
            // InternalGame.g:8142:2: ( ruleConditionAvantage )
            {
            // InternalGame.g:8142:2: ( ruleConditionAvantage )
            // InternalGame.g:8143:3: ruleConditionAvantage
            {
             before(grammarAccess.getConnaissanceAccess().getVisibleConditionAvantageParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionAvantage();

            state._fsp--;

             after(grammarAccess.getConnaissanceAccess().getVisibleConditionAvantageParserRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__VisibleAssignment_5_2_1"


    // $ANTLR start "rule__Connaissance__ActifAssignment_6_1"
    // InternalGame.g:8152:1: rule__Connaissance__ActifAssignment_6_1 : ( ruleConditionAvantage ) ;
    public final void rule__Connaissance__ActifAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8156:1: ( ( ruleConditionAvantage ) )
            // InternalGame.g:8157:2: ( ruleConditionAvantage )
            {
            // InternalGame.g:8157:2: ( ruleConditionAvantage )
            // InternalGame.g:8158:3: ruleConditionAvantage
            {
             before(grammarAccess.getConnaissanceAccess().getActifConditionAvantageParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionAvantage();

            state._fsp--;

             after(grammarAccess.getConnaissanceAccess().getActifConditionAvantageParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__ActifAssignment_6_1"


    // $ANTLR start "rule__Connaissance__ActifAssignment_6_2_1"
    // InternalGame.g:8167:1: rule__Connaissance__ActifAssignment_6_2_1 : ( ruleConditionAvantage ) ;
    public final void rule__Connaissance__ActifAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8171:1: ( ( ruleConditionAvantage ) )
            // InternalGame.g:8172:2: ( ruleConditionAvantage )
            {
            // InternalGame.g:8172:2: ( ruleConditionAvantage )
            // InternalGame.g:8173:3: ruleConditionAvantage
            {
             before(grammarAccess.getConnaissanceAccess().getActifConditionAvantageParserRuleCall_6_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionAvantage();

            state._fsp--;

             after(grammarAccess.getConnaissanceAccess().getActifConditionAvantageParserRuleCall_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__ActifAssignment_6_2_1"


    // $ANTLR start "rule__Objet__TransformableAssignment_1"
    // InternalGame.g:8182:1: rule__Objet__TransformableAssignment_1 : ( ( 'transformable' ) ) ;
    public final void rule__Objet__TransformableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8186:1: ( ( ( 'transformable' ) ) )
            // InternalGame.g:8187:2: ( ( 'transformable' ) )
            {
            // InternalGame.g:8187:2: ( ( 'transformable' ) )
            // InternalGame.g:8188:3: ( 'transformable' )
            {
             before(grammarAccess.getObjetAccess().getTransformableTransformableKeyword_1_0()); 
            // InternalGame.g:8189:3: ( 'transformable' )
            // InternalGame.g:8190:4: 'transformable'
            {
             before(grammarAccess.getObjetAccess().getTransformableTransformableKeyword_1_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getTransformableTransformableKeyword_1_0()); 

            }

             after(grammarAccess.getObjetAccess().getTransformableTransformableKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__TransformableAssignment_1"


    // $ANTLR start "rule__Objet__NameAssignment_3"
    // InternalGame.g:8201:1: rule__Objet__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Objet__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8205:1: ( ( RULE_ID ) )
            // InternalGame.g:8206:2: ( RULE_ID )
            {
            // InternalGame.g:8206:2: ( RULE_ID )
            // InternalGame.g:8207:3: RULE_ID
            {
             before(grammarAccess.getObjetAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__NameAssignment_3"


    // $ANTLR start "rule__Objet__QteAssignment_5_1"
    // InternalGame.g:8216:1: rule__Objet__QteAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Objet__QteAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8220:1: ( ( ruleEInt ) )
            // InternalGame.g:8221:2: ( ruleEInt )
            {
            // InternalGame.g:8221:2: ( ruleEInt )
            // InternalGame.g:8222:3: ruleEInt
            {
             before(grammarAccess.getObjetAccess().getQteEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getObjetAccess().getQteEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__QteAssignment_5_1"


    // $ANTLR start "rule__Objet__TailleAssignment_6_1"
    // InternalGame.g:8231:1: rule__Objet__TailleAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Objet__TailleAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8235:1: ( ( ruleEInt ) )
            // InternalGame.g:8236:2: ( ruleEInt )
            {
            // InternalGame.g:8236:2: ( ruleEInt )
            // InternalGame.g:8237:3: ruleEInt
            {
             before(grammarAccess.getObjetAccess().getTailleEIntParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getObjetAccess().getTailleEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__TailleAssignment_6_1"


    // $ANTLR start "rule__Objet__VisibleAssignment_7_1"
    // InternalGame.g:8246:1: rule__Objet__VisibleAssignment_7_1 : ( ruleConditionAvantage ) ;
    public final void rule__Objet__VisibleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8250:1: ( ( ruleConditionAvantage ) )
            // InternalGame.g:8251:2: ( ruleConditionAvantage )
            {
            // InternalGame.g:8251:2: ( ruleConditionAvantage )
            // InternalGame.g:8252:3: ruleConditionAvantage
            {
             before(grammarAccess.getObjetAccess().getVisibleConditionAvantageParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionAvantage();

            state._fsp--;

             after(grammarAccess.getObjetAccess().getVisibleConditionAvantageParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__VisibleAssignment_7_1"


    // $ANTLR start "rule__Objet__VisibleAssignment_7_2_1"
    // InternalGame.g:8261:1: rule__Objet__VisibleAssignment_7_2_1 : ( ruleConditionAvantage ) ;
    public final void rule__Objet__VisibleAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8265:1: ( ( ruleConditionAvantage ) )
            // InternalGame.g:8266:2: ( ruleConditionAvantage )
            {
            // InternalGame.g:8266:2: ( ruleConditionAvantage )
            // InternalGame.g:8267:3: ruleConditionAvantage
            {
             before(grammarAccess.getObjetAccess().getVisibleConditionAvantageParserRuleCall_7_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionAvantage();

            state._fsp--;

             after(grammarAccess.getObjetAccess().getVisibleConditionAvantageParserRuleCall_7_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__VisibleAssignment_7_2_1"


    // $ANTLR start "rule__Objet__ActifAssignment_8_1"
    // InternalGame.g:8276:1: rule__Objet__ActifAssignment_8_1 : ( ruleConditionAvantage ) ;
    public final void rule__Objet__ActifAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8280:1: ( ( ruleConditionAvantage ) )
            // InternalGame.g:8281:2: ( ruleConditionAvantage )
            {
            // InternalGame.g:8281:2: ( ruleConditionAvantage )
            // InternalGame.g:8282:3: ruleConditionAvantage
            {
             before(grammarAccess.getObjetAccess().getActifConditionAvantageParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionAvantage();

            state._fsp--;

             after(grammarAccess.getObjetAccess().getActifConditionAvantageParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__ActifAssignment_8_1"


    // $ANTLR start "rule__Objet__ActifAssignment_8_2_1"
    // InternalGame.g:8291:1: rule__Objet__ActifAssignment_8_2_1 : ( ruleConditionAvantage ) ;
    public final void rule__Objet__ActifAssignment_8_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8295:1: ( ( ruleConditionAvantage ) )
            // InternalGame.g:8296:2: ( ruleConditionAvantage )
            {
            // InternalGame.g:8296:2: ( ruleConditionAvantage )
            // InternalGame.g:8297:3: ruleConditionAvantage
            {
             before(grammarAccess.getObjetAccess().getActifConditionAvantageParserRuleCall_8_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionAvantage();

            state._fsp--;

             after(grammarAccess.getObjetAccess().getActifConditionAvantageParserRuleCall_8_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__ActifAssignment_8_2_1"


    // $ANTLR start "rule__ConditionAvantage__NameAssignment_2"
    // InternalGame.g:8306:1: rule__ConditionAvantage__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ConditionAvantage__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8310:1: ( ( RULE_ID ) )
            // InternalGame.g:8311:2: ( RULE_ID )
            {
            // InternalGame.g:8311:2: ( RULE_ID )
            // InternalGame.g:8312:3: RULE_ID
            {
             before(grammarAccess.getConditionAvantageAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionAvantageAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__NameAssignment_2"


    // $ANTLR start "rule__ConditionAvantage__ConnaissanceRequiseAssignment_4_1"
    // InternalGame.g:8321:1: rule__ConditionAvantage__ConnaissanceRequiseAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConditionAvantage__ConnaissanceRequiseAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8325:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:8326:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:8326:2: ( ( RULE_ID ) )
            // InternalGame.g:8327:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionAvantageAccess().getConnaissanceRequiseConnaissanceCrossReference_4_1_0()); 
            // InternalGame.g:8328:3: ( RULE_ID )
            // InternalGame.g:8329:4: RULE_ID
            {
             before(grammarAccess.getConditionAvantageAccess().getConnaissanceRequiseConnaissanceIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionAvantageAccess().getConnaissanceRequiseConnaissanceIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getConditionAvantageAccess().getConnaissanceRequiseConnaissanceCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__ConnaissanceRequiseAssignment_4_1"


    // $ANTLR start "rule__ConditionAvantage__ConnaissanceInterditeAssignment_5_1"
    // InternalGame.g:8340:1: rule__ConditionAvantage__ConnaissanceInterditeAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConditionAvantage__ConnaissanceInterditeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8344:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:8345:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:8345:2: ( ( RULE_ID ) )
            // InternalGame.g:8346:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionAvantageAccess().getConnaissanceInterditeConnaissanceCrossReference_5_1_0()); 
            // InternalGame.g:8347:3: ( RULE_ID )
            // InternalGame.g:8348:4: RULE_ID
            {
             before(grammarAccess.getConditionAvantageAccess().getConnaissanceInterditeConnaissanceIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionAvantageAccess().getConnaissanceInterditeConnaissanceIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getConditionAvantageAccess().getConnaissanceInterditeConnaissanceCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__ConnaissanceInterditeAssignment_5_1"


    // $ANTLR start "rule__ConditionAvantage__ObjetRequisAssignment_6_1"
    // InternalGame.g:8359:1: rule__ConditionAvantage__ObjetRequisAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConditionAvantage__ObjetRequisAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8363:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:8364:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:8364:2: ( ( RULE_ID ) )
            // InternalGame.g:8365:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionAvantageAccess().getObjetRequisQteObjetCrossReference_6_1_0()); 
            // InternalGame.g:8366:3: ( RULE_ID )
            // InternalGame.g:8367:4: RULE_ID
            {
             before(grammarAccess.getConditionAvantageAccess().getObjetRequisQteObjetIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionAvantageAccess().getObjetRequisQteObjetIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getConditionAvantageAccess().getObjetRequisQteObjetCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__ObjetRequisAssignment_6_1"


    // $ANTLR start "rule__ConditionAvantage__ObjetInterditAssignment_7_1"
    // InternalGame.g:8378:1: rule__ConditionAvantage__ObjetInterditAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConditionAvantage__ObjetInterditAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8382:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:8383:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:8383:2: ( ( RULE_ID ) )
            // InternalGame.g:8384:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionAvantageAccess().getObjetInterditQteObjetCrossReference_7_1_0()); 
            // InternalGame.g:8385:3: ( RULE_ID )
            // InternalGame.g:8386:4: RULE_ID
            {
             before(grammarAccess.getConditionAvantageAccess().getObjetInterditQteObjetIDTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionAvantageAccess().getObjetInterditQteObjetIDTerminalRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getConditionAvantageAccess().getObjetInterditQteObjetCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionAvantage__ObjetInterditAssignment_7_1"


    // $ANTLR start "rule__Choix__BonneAssignment_0"
    // InternalGame.g:8397:1: rule__Choix__BonneAssignment_0 : ( ( 'bonne' ) ) ;
    public final void rule__Choix__BonneAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8401:1: ( ( ( 'bonne' ) ) )
            // InternalGame.g:8402:2: ( ( 'bonne' ) )
            {
            // InternalGame.g:8402:2: ( ( 'bonne' ) )
            // InternalGame.g:8403:3: ( 'bonne' )
            {
             before(grammarAccess.getChoixAccess().getBonneBonneKeyword_0_0()); 
            // InternalGame.g:8404:3: ( 'bonne' )
            // InternalGame.g:8405:4: 'bonne'
            {
             before(grammarAccess.getChoixAccess().getBonneBonneKeyword_0_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getBonneBonneKeyword_0_0()); 

            }

             after(grammarAccess.getChoixAccess().getBonneBonneKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__BonneAssignment_0"


    // $ANTLR start "rule__Choix__NameAssignment_2"
    // InternalGame.g:8416:1: rule__Choix__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Choix__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8420:1: ( ( RULE_ID ) )
            // InternalGame.g:8421:2: ( RULE_ID )
            {
            // InternalGame.g:8421:2: ( RULE_ID )
            // InternalGame.g:8422:3: RULE_ID
            {
             before(grammarAccess.getChoixAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__NameAssignment_2"


    // $ANTLR start "rule__Choix__ReponseAssignment_4_1"
    // InternalGame.g:8431:1: rule__Choix__ReponseAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Choix__ReponseAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8435:1: ( ( RULE_STRING ) )
            // InternalGame.g:8436:2: ( RULE_STRING )
            {
            // InternalGame.g:8436:2: ( RULE_STRING )
            // InternalGame.g:8437:3: RULE_STRING
            {
             before(grammarAccess.getChoixAccess().getReponseSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getReponseSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__ReponseAssignment_4_1"


    // $ANTLR start "rule__Choix__ConnaisDonAssignment_5_1"
    // InternalGame.g:8446:1: rule__Choix__ConnaisDonAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Choix__ConnaisDonAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8450:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:8451:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:8451:2: ( ( RULE_ID ) )
            // InternalGame.g:8452:3: ( RULE_ID )
            {
             before(grammarAccess.getChoixAccess().getConnaisDonConnaissanceCrossReference_5_1_0()); 
            // InternalGame.g:8453:3: ( RULE_ID )
            // InternalGame.g:8454:4: RULE_ID
            {
             before(grammarAccess.getChoixAccess().getConnaisDonConnaissanceIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getConnaisDonConnaissanceIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getChoixAccess().getConnaisDonConnaissanceCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__ConnaisDonAssignment_5_1"


    // $ANTLR start "rule__Choix__ConnaisDonAssignment_5_2_1"
    // InternalGame.g:8465:1: rule__Choix__ConnaisDonAssignment_5_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Choix__ConnaisDonAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8469:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:8470:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:8470:2: ( ( RULE_ID ) )
            // InternalGame.g:8471:3: ( RULE_ID )
            {
             before(grammarAccess.getChoixAccess().getConnaisDonConnaissanceCrossReference_5_2_1_0()); 
            // InternalGame.g:8472:3: ( RULE_ID )
            // InternalGame.g:8473:4: RULE_ID
            {
             before(grammarAccess.getChoixAccess().getConnaisDonConnaissanceIDTerminalRuleCall_5_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getConnaisDonConnaissanceIDTerminalRuleCall_5_2_1_0_1()); 

            }

             after(grammarAccess.getChoixAccess().getConnaisDonConnaissanceCrossReference_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__ConnaisDonAssignment_5_2_1"


    // $ANTLR start "rule__Choix__InteractionAssignment_7"
    // InternalGame.g:8484:1: rule__Choix__InteractionAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Choix__InteractionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8488:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:8489:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:8489:2: ( ( RULE_ID ) )
            // InternalGame.g:8490:3: ( RULE_ID )
            {
             before(grammarAccess.getChoixAccess().getInteractionInteractionCrossReference_7_0()); 
            // InternalGame.g:8491:3: ( RULE_ID )
            // InternalGame.g:8492:4: RULE_ID
            {
             before(grammarAccess.getChoixAccess().getInteractionInteractionIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getInteractionInteractionIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getChoixAccess().getInteractionInteractionCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__InteractionAssignment_7"


    // $ANTLR start "rule__Choix__ObjetConsAssignment_8_1"
    // InternalGame.g:8503:1: rule__Choix__ObjetConsAssignment_8_1 : ( ruleQteObjet ) ;
    public final void rule__Choix__ObjetConsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8507:1: ( ( ruleQteObjet ) )
            // InternalGame.g:8508:2: ( ruleQteObjet )
            {
            // InternalGame.g:8508:2: ( ruleQteObjet )
            // InternalGame.g:8509:3: ruleQteObjet
            {
             before(grammarAccess.getChoixAccess().getObjetConsQteObjetParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQteObjet();

            state._fsp--;

             after(grammarAccess.getChoixAccess().getObjetConsQteObjetParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__ObjetConsAssignment_8_1"


    // $ANTLR start "rule__Choix__ObjetConsAssignment_8_2_1"
    // InternalGame.g:8518:1: rule__Choix__ObjetConsAssignment_8_2_1 : ( ruleQteObjet ) ;
    public final void rule__Choix__ObjetConsAssignment_8_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8522:1: ( ( ruleQteObjet ) )
            // InternalGame.g:8523:2: ( ruleQteObjet )
            {
            // InternalGame.g:8523:2: ( ruleQteObjet )
            // InternalGame.g:8524:3: ruleQteObjet
            {
             before(grammarAccess.getChoixAccess().getObjetConsQteObjetParserRuleCall_8_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQteObjet();

            state._fsp--;

             after(grammarAccess.getChoixAccess().getObjetConsQteObjetParserRuleCall_8_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__ObjetConsAssignment_8_2_1"


    // $ANTLR start "rule__Choix__ObjetDonAssignment_9_1"
    // InternalGame.g:8533:1: rule__Choix__ObjetDonAssignment_9_1 : ( ruleQteObjet ) ;
    public final void rule__Choix__ObjetDonAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8537:1: ( ( ruleQteObjet ) )
            // InternalGame.g:8538:2: ( ruleQteObjet )
            {
            // InternalGame.g:8538:2: ( ruleQteObjet )
            // InternalGame.g:8539:3: ruleQteObjet
            {
             before(grammarAccess.getChoixAccess().getObjetDonQteObjetParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQteObjet();

            state._fsp--;

             after(grammarAccess.getChoixAccess().getObjetDonQteObjetParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__ObjetDonAssignment_9_1"


    // $ANTLR start "rule__Choix__ObjetDonAssignment_9_2_1"
    // InternalGame.g:8548:1: rule__Choix__ObjetDonAssignment_9_2_1 : ( ruleQteObjet ) ;
    public final void rule__Choix__ObjetDonAssignment_9_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8552:1: ( ( ruleQteObjet ) )
            // InternalGame.g:8553:2: ( ruleQteObjet )
            {
            // InternalGame.g:8553:2: ( ruleQteObjet )
            // InternalGame.g:8554:3: ruleQteObjet
            {
             before(grammarAccess.getChoixAccess().getObjetDonQteObjetParserRuleCall_9_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQteObjet();

            state._fsp--;

             after(grammarAccess.getChoixAccess().getObjetDonQteObjetParserRuleCall_9_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__ObjetDonAssignment_9_2_1"


    // $ANTLR start "rule__QteObjet__NameAssignment_2"
    // InternalGame.g:8563:1: rule__QteObjet__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__QteObjet__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8567:1: ( ( RULE_ID ) )
            // InternalGame.g:8568:2: ( RULE_ID )
            {
            // InternalGame.g:8568:2: ( RULE_ID )
            // InternalGame.g:8569:3: RULE_ID
            {
             before(grammarAccess.getQteObjetAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQteObjetAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QteObjet__NameAssignment_2"


    // $ANTLR start "rule__QteObjet__QteAssignment_4_1"
    // InternalGame.g:8578:1: rule__QteObjet__QteAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__QteObjet__QteAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8582:1: ( ( ruleEInt ) )
            // InternalGame.g:8583:2: ( ruleEInt )
            {
            // InternalGame.g:8583:2: ( ruleEInt )
            // InternalGame.g:8584:3: ruleEInt
            {
             before(grammarAccess.getQteObjetAccess().getQteEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getQteObjetAccess().getQteEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QteObjet__QteAssignment_4_1"


    // $ANTLR start "rule__QteObjet__ObjetAssignment_5_1"
    // InternalGame.g:8593:1: rule__QteObjet__ObjetAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__QteObjet__ObjetAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8597:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:8598:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:8598:2: ( ( RULE_ID ) )
            // InternalGame.g:8599:3: ( RULE_ID )
            {
             before(grammarAccess.getQteObjetAccess().getObjetObjetCrossReference_5_1_0()); 
            // InternalGame.g:8600:3: ( RULE_ID )
            // InternalGame.g:8601:4: RULE_ID
            {
             before(grammarAccess.getQteObjetAccess().getObjetObjetIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQteObjetAccess().getObjetObjetIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getQteObjetAccess().getObjetObjetCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QteObjet__ObjetAssignment_5_1"


    // $ANTLR start "rule__ConditionChemin__NameAssignment_2"
    // InternalGame.g:8612:1: rule__ConditionChemin__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ConditionChemin__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8616:1: ( ( RULE_ID ) )
            // InternalGame.g:8617:2: ( RULE_ID )
            {
            // InternalGame.g:8617:2: ( RULE_ID )
            // InternalGame.g:8618:3: RULE_ID
            {
             before(grammarAccess.getConditionCheminAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionCheminAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__NameAssignment_2"


    // $ANTLR start "rule__ConditionChemin__ConnaissanceRequiseAssignment_4_1"
    // InternalGame.g:8627:1: rule__ConditionChemin__ConnaissanceRequiseAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConditionChemin__ConnaissanceRequiseAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8631:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:8632:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:8632:2: ( ( RULE_ID ) )
            // InternalGame.g:8633:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionCheminAccess().getConnaissanceRequiseConnaissanceCrossReference_4_1_0()); 
            // InternalGame.g:8634:3: ( RULE_ID )
            // InternalGame.g:8635:4: RULE_ID
            {
             before(grammarAccess.getConditionCheminAccess().getConnaissanceRequiseConnaissanceIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionCheminAccess().getConnaissanceRequiseConnaissanceIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getConditionCheminAccess().getConnaissanceRequiseConnaissanceCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__ConnaissanceRequiseAssignment_4_1"


    // $ANTLR start "rule__ConditionChemin__ConnaissanceInterditeAssignment_5_1"
    // InternalGame.g:8646:1: rule__ConditionChemin__ConnaissanceInterditeAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConditionChemin__ConnaissanceInterditeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8650:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:8651:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:8651:2: ( ( RULE_ID ) )
            // InternalGame.g:8652:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionCheminAccess().getConnaissanceInterditeConnaissanceCrossReference_5_1_0()); 
            // InternalGame.g:8653:3: ( RULE_ID )
            // InternalGame.g:8654:4: RULE_ID
            {
             before(grammarAccess.getConditionCheminAccess().getConnaissanceInterditeConnaissanceIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionCheminAccess().getConnaissanceInterditeConnaissanceIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getConditionCheminAccess().getConnaissanceInterditeConnaissanceCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__ConnaissanceInterditeAssignment_5_1"


    // $ANTLR start "rule__ConditionChemin__ObjetRequisAssignment_6_1"
    // InternalGame.g:8665:1: rule__ConditionChemin__ObjetRequisAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConditionChemin__ObjetRequisAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8669:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:8670:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:8670:2: ( ( RULE_ID ) )
            // InternalGame.g:8671:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionCheminAccess().getObjetRequisQteObjetCrossReference_6_1_0()); 
            // InternalGame.g:8672:3: ( RULE_ID )
            // InternalGame.g:8673:4: RULE_ID
            {
             before(grammarAccess.getConditionCheminAccess().getObjetRequisQteObjetIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionCheminAccess().getObjetRequisQteObjetIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getConditionCheminAccess().getObjetRequisQteObjetCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__ObjetRequisAssignment_6_1"


    // $ANTLR start "rule__ConditionChemin__ObjetInterditAssignment_7_1"
    // InternalGame.g:8684:1: rule__ConditionChemin__ObjetInterditAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConditionChemin__ObjetInterditAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:8688:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:8689:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:8689:2: ( ( RULE_ID ) )
            // InternalGame.g:8690:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionCheminAccess().getObjetInterditQteObjetCrossReference_7_1_0()); 
            // InternalGame.g:8691:3: ( RULE_ID )
            // InternalGame.g:8692:4: RULE_ID
            {
             before(grammarAccess.getConditionCheminAccess().getObjetInterditQteObjetIDTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionCheminAccess().getObjetInterditQteObjetIDTerminalRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getConditionCheminAccess().getObjetInterditQteObjetCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionChemin__ObjetInterditAssignment_7_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\31\1\uffff\1\34\11\uffff";
    static final String dfa_3s = "\1\77\1\uffff\1\41\11\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\1\4\uffff\1\4\3\uffff\1\11\4\uffff\1\7\3\uffff\1\5\1\uffff\1\6\1\uffff\1\12\1\10\5\uffff\1\3\2\uffff\1\13\1\2\1\6\1\10",
            "",
            "\1\1\4\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "493:1: rule__ElementsJeu__Alternatives : ( ( rulePlace ) | ( ruleQteObjet ) | ( rulePersonne ) | ( ruleConnaissance ) | ( ruleObjet ) | ( ruleInteraction ) | ( ruleChoix ) | ( ruleConditionPersonne ) | ( ruleConditionAvantage ) | ( ruleConditionChemin ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0xF20D442212000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x2000000012000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0800000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001810000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x4001000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008010000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000180010000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x2000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001080030000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000003C000010000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000010000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000A00080010000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0002800080210000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x8008000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0070000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0180000000010000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0402000000010000L});

}