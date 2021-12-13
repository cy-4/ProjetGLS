package game.ide.contentassist.antlr.internal;

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
import game.services.GameGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGameParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOL", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'depart'", "'fin'", "'intermediaire'", "'jeu'", "'{'", "'}'", "'territoire'", "'lieu'", "':'", "'chemin'", "'de'", "'vers'", "'visible'", "'obligatoire'", "'ouvert'", "'personne'", "'localisation'", "'actif'", "'interactions'", "'explorateur'", "'taille'", "'disponible'", "'objets'", "'possedes'", "'connaissances'", "'connaissance'", "'objet'", "'quantite'", "'transformable'", "'question'", "'choix'", "'reponse'", "'bonne'", "'consomme'", "'donne'", "'condition'", "'requises'", "'interdites'", "'requis'", "'interdits'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_BOOL=4;
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


    // $ANTLR start "entryRuleAvantage"
    // InternalGame.g:128:1: entryRuleAvantage : ruleAvantage EOF ;
    public final void entryRuleAvantage() throws RecognitionException {
        try {
            // InternalGame.g:129:1: ( ruleAvantage EOF )
            // InternalGame.g:130:1: ruleAvantage EOF
            {
             before(grammarAccess.getAvantageRule()); 
            pushFollow(FOLLOW_1);
            ruleAvantage();

            state._fsp--;

             after(grammarAccess.getAvantageRule()); 
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
    // $ANTLR end "entryRuleAvantage"


    // $ANTLR start "ruleAvantage"
    // InternalGame.g:137:1: ruleAvantage : ( ( rule__Avantage__Alternatives ) ) ;
    public final void ruleAvantage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:141:2: ( ( ( rule__Avantage__Alternatives ) ) )
            // InternalGame.g:142:2: ( ( rule__Avantage__Alternatives ) )
            {
            // InternalGame.g:142:2: ( ( rule__Avantage__Alternatives ) )
            // InternalGame.g:143:3: ( rule__Avantage__Alternatives )
            {
             before(grammarAccess.getAvantageAccess().getAlternatives()); 
            // InternalGame.g:144:3: ( rule__Avantage__Alternatives )
            // InternalGame.g:144:4: rule__Avantage__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Avantage__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAvantageAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAvantage"


    // $ANTLR start "entryRuleQteObjet"
    // InternalGame.g:153:1: entryRuleQteObjet : ruleQteObjet EOF ;
    public final void entryRuleQteObjet() throws RecognitionException {
        try {
            // InternalGame.g:154:1: ( ruleQteObjet EOF )
            // InternalGame.g:155:1: ruleQteObjet EOF
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
    // InternalGame.g:162:1: ruleQteObjet : ( ( rule__QteObjet__Group__0 ) ) ;
    public final void ruleQteObjet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:166:2: ( ( ( rule__QteObjet__Group__0 ) ) )
            // InternalGame.g:167:2: ( ( rule__QteObjet__Group__0 ) )
            {
            // InternalGame.g:167:2: ( ( rule__QteObjet__Group__0 ) )
            // InternalGame.g:168:3: ( rule__QteObjet__Group__0 )
            {
             before(grammarAccess.getQteObjetAccess().getGroup()); 
            // InternalGame.g:169:3: ( rule__QteObjet__Group__0 )
            // InternalGame.g:169:4: rule__QteObjet__Group__0
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


    // $ANTLR start "entryRuleTerritoire"
    // InternalGame.g:178:1: entryRuleTerritoire : ruleTerritoire EOF ;
    public final void entryRuleTerritoire() throws RecognitionException {
        try {
            // InternalGame.g:179:1: ( ruleTerritoire EOF )
            // InternalGame.g:180:1: ruleTerritoire EOF
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
    // InternalGame.g:187:1: ruleTerritoire : ( ( rule__Territoire__Group__0 ) ) ;
    public final void ruleTerritoire() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:191:2: ( ( ( rule__Territoire__Group__0 ) ) )
            // InternalGame.g:192:2: ( ( rule__Territoire__Group__0 ) )
            {
            // InternalGame.g:192:2: ( ( rule__Territoire__Group__0 ) )
            // InternalGame.g:193:3: ( rule__Territoire__Group__0 )
            {
             before(grammarAccess.getTerritoireAccess().getGroup()); 
            // InternalGame.g:194:3: ( rule__Territoire__Group__0 )
            // InternalGame.g:194:4: rule__Territoire__Group__0
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


    // $ANTLR start "entryRuleLieu"
    // InternalGame.g:203:1: entryRuleLieu : ruleLieu EOF ;
    public final void entryRuleLieu() throws RecognitionException {
        try {
            // InternalGame.g:204:1: ( ruleLieu EOF )
            // InternalGame.g:205:1: ruleLieu EOF
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
    // InternalGame.g:212:1: ruleLieu : ( ( rule__Lieu__Group__0 ) ) ;
    public final void ruleLieu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:216:2: ( ( ( rule__Lieu__Group__0 ) ) )
            // InternalGame.g:217:2: ( ( rule__Lieu__Group__0 ) )
            {
            // InternalGame.g:217:2: ( ( rule__Lieu__Group__0 ) )
            // InternalGame.g:218:3: ( rule__Lieu__Group__0 )
            {
             before(grammarAccess.getLieuAccess().getGroup()); 
            // InternalGame.g:219:3: ( rule__Lieu__Group__0 )
            // InternalGame.g:219:4: rule__Lieu__Group__0
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
    // InternalGame.g:228:1: entryRuleChemin : ruleChemin EOF ;
    public final void entryRuleChemin() throws RecognitionException {
        try {
            // InternalGame.g:229:1: ( ruleChemin EOF )
            // InternalGame.g:230:1: ruleChemin EOF
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
    // InternalGame.g:237:1: ruleChemin : ( ( rule__Chemin__Group__0 ) ) ;
    public final void ruleChemin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:241:2: ( ( ( rule__Chemin__Group__0 ) ) )
            // InternalGame.g:242:2: ( ( rule__Chemin__Group__0 ) )
            {
            // InternalGame.g:242:2: ( ( rule__Chemin__Group__0 ) )
            // InternalGame.g:243:3: ( rule__Chemin__Group__0 )
            {
             before(grammarAccess.getCheminAccess().getGroup()); 
            // InternalGame.g:244:3: ( rule__Chemin__Group__0 )
            // InternalGame.g:244:4: rule__Chemin__Group__0
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
    // InternalGame.g:253:1: entryRulePersonne : rulePersonne EOF ;
    public final void entryRulePersonne() throws RecognitionException {
        try {
            // InternalGame.g:254:1: ( rulePersonne EOF )
            // InternalGame.g:255:1: rulePersonne EOF
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
    // InternalGame.g:262:1: rulePersonne : ( ( rule__Personne__Group__0 ) ) ;
    public final void rulePersonne() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:266:2: ( ( ( rule__Personne__Group__0 ) ) )
            // InternalGame.g:267:2: ( ( rule__Personne__Group__0 ) )
            {
            // InternalGame.g:267:2: ( ( rule__Personne__Group__0 ) )
            // InternalGame.g:268:3: ( rule__Personne__Group__0 )
            {
             before(grammarAccess.getPersonneAccess().getGroup()); 
            // InternalGame.g:269:3: ( rule__Personne__Group__0 )
            // InternalGame.g:269:4: rule__Personne__Group__0
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


    // $ANTLR start "entryRuleExplorateur"
    // InternalGame.g:278:1: entryRuleExplorateur : ruleExplorateur EOF ;
    public final void entryRuleExplorateur() throws RecognitionException {
        try {
            // InternalGame.g:279:1: ( ruleExplorateur EOF )
            // InternalGame.g:280:1: ruleExplorateur EOF
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
    // InternalGame.g:287:1: ruleExplorateur : ( ( rule__Explorateur__Group__0 ) ) ;
    public final void ruleExplorateur() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:291:2: ( ( ( rule__Explorateur__Group__0 ) ) )
            // InternalGame.g:292:2: ( ( rule__Explorateur__Group__0 ) )
            {
            // InternalGame.g:292:2: ( ( rule__Explorateur__Group__0 ) )
            // InternalGame.g:293:3: ( rule__Explorateur__Group__0 )
            {
             before(grammarAccess.getExplorateurAccess().getGroup()); 
            // InternalGame.g:294:3: ( rule__Explorateur__Group__0 )
            // InternalGame.g:294:4: rule__Explorateur__Group__0
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


    // $ANTLR start "entryRuleInteraction"
    // InternalGame.g:353:1: entryRuleInteraction : ruleInteraction EOF ;
    public final void entryRuleInteraction() throws RecognitionException {
        try {
            // InternalGame.g:354:1: ( ruleInteraction EOF )
            // InternalGame.g:355:1: ruleInteraction EOF
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
    // InternalGame.g:362:1: ruleInteraction : ( ( rule__Interaction__Group__0 ) ) ;
    public final void ruleInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:366:2: ( ( ( rule__Interaction__Group__0 ) ) )
            // InternalGame.g:367:2: ( ( rule__Interaction__Group__0 ) )
            {
            // InternalGame.g:367:2: ( ( rule__Interaction__Group__0 ) )
            // InternalGame.g:368:3: ( rule__Interaction__Group__0 )
            {
             before(grammarAccess.getInteractionAccess().getGroup()); 
            // InternalGame.g:369:3: ( rule__Interaction__Group__0 )
            // InternalGame.g:369:4: rule__Interaction__Group__0
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


    // $ANTLR start "entryRuleCondition"
    // InternalGame.g:403:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalGame.g:404:1: ( ruleCondition EOF )
            // InternalGame.g:405:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalGame.g:412:1: ruleCondition : ( ( rule__Condition__Alternatives ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:416:2: ( ( ( rule__Condition__Alternatives ) ) )
            // InternalGame.g:417:2: ( ( rule__Condition__Alternatives ) )
            {
            // InternalGame.g:417:2: ( ( rule__Condition__Alternatives ) )
            // InternalGame.g:418:3: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalGame.g:419:3: ( rule__Condition__Alternatives )
            // InternalGame.g:419:4: rule__Condition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "ruleNature"
    // InternalGame.g:428:1: ruleNature : ( ( rule__Nature__Alternatives ) ) ;
    public final void ruleNature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:432:1: ( ( ( rule__Nature__Alternatives ) ) )
            // InternalGame.g:433:2: ( ( rule__Nature__Alternatives ) )
            {
            // InternalGame.g:433:2: ( ( rule__Nature__Alternatives ) )
            // InternalGame.g:434:3: ( rule__Nature__Alternatives )
            {
             before(grammarAccess.getNatureAccess().getAlternatives()); 
            // InternalGame.g:435:3: ( rule__Nature__Alternatives )
            // InternalGame.g:435:4: rule__Nature__Alternatives
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
    // InternalGame.g:443:1: rule__ElementsJeu__Alternatives : ( ( rulePersonne ) | ( ruleAvantage ) | ( rulePlace ) );
    public final void rule__ElementsJeu__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:447:1: ( ( rulePersonne ) | ( ruleAvantage ) | ( rulePlace ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt1=1;
                }
                break;
            case 37:
            case 38:
                {
                alt1=2;
                }
                break;
            case 19:
            case 21:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalGame.g:448:2: ( rulePersonne )
                    {
                    // InternalGame.g:448:2: ( rulePersonne )
                    // InternalGame.g:449:3: rulePersonne
                    {
                     before(grammarAccess.getElementsJeuAccess().getPersonneParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePersonne();

                    state._fsp--;

                     after(grammarAccess.getElementsJeuAccess().getPersonneParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:454:2: ( ruleAvantage )
                    {
                    // InternalGame.g:454:2: ( ruleAvantage )
                    // InternalGame.g:455:3: ruleAvantage
                    {
                     before(grammarAccess.getElementsJeuAccess().getAvantageParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAvantage();

                    state._fsp--;

                     after(grammarAccess.getElementsJeuAccess().getAvantageParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:460:2: ( rulePlace )
                    {
                    // InternalGame.g:460:2: ( rulePlace )
                    // InternalGame.g:461:3: rulePlace
                    {
                     before(grammarAccess.getElementsJeuAccess().getPlaceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePlace();

                    state._fsp--;

                     after(grammarAccess.getElementsJeuAccess().getPlaceParserRuleCall_2()); 

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
    // InternalGame.g:470:1: rule__Place__Alternatives : ( ( ruleLieu ) | ( ruleChemin ) );
    public final void rule__Place__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:474:1: ( ( ruleLieu ) | ( ruleChemin ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            else if ( (LA2_0==21) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGame.g:475:2: ( ruleLieu )
                    {
                    // InternalGame.g:475:2: ( ruleLieu )
                    // InternalGame.g:476:3: ruleLieu
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
                    // InternalGame.g:481:2: ( ruleChemin )
                    {
                    // InternalGame.g:481:2: ( ruleChemin )
                    // InternalGame.g:482:3: ruleChemin
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


    // $ANTLR start "rule__Avantage__Alternatives"
    // InternalGame.g:491:1: rule__Avantage__Alternatives : ( ( ruleConnaissance ) | ( ruleObjet ) );
    public final void rule__Avantage__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:495:1: ( ( ruleConnaissance ) | ( ruleObjet ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==37) ) {
                alt3=1;
            }
            else if ( (LA3_0==38) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGame.g:496:2: ( ruleConnaissance )
                    {
                    // InternalGame.g:496:2: ( ruleConnaissance )
                    // InternalGame.g:497:3: ruleConnaissance
                    {
                     before(grammarAccess.getAvantageAccess().getConnaissanceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleConnaissance();

                    state._fsp--;

                     after(grammarAccess.getAvantageAccess().getConnaissanceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:502:2: ( ruleObjet )
                    {
                    // InternalGame.g:502:2: ( ruleObjet )
                    // InternalGame.g:503:3: ruleObjet
                    {
                     before(grammarAccess.getAvantageAccess().getObjetParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleObjet();

                    state._fsp--;

                     after(grammarAccess.getAvantageAccess().getObjetParserRuleCall_1()); 

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
    // $ANTLR end "rule__Avantage__Alternatives"


    // $ANTLR start "rule__Choix__Alternatives_8_1"
    // InternalGame.g:512:1: rule__Choix__Alternatives_8_1 : ( ( ( rule__Choix__ObjetDonAssignment_8_1_0 ) ) | ( ( rule__Choix__Group_8_1_1__0 ) ) );
    public final void rule__Choix__Alternatives_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:516:1: ( ( ( rule__Choix__ObjetDonAssignment_8_1_0 ) ) | ( ( rule__Choix__Group_8_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==37) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGame.g:517:2: ( ( rule__Choix__ObjetDonAssignment_8_1_0 ) )
                    {
                    // InternalGame.g:517:2: ( ( rule__Choix__ObjetDonAssignment_8_1_0 ) )
                    // InternalGame.g:518:3: ( rule__Choix__ObjetDonAssignment_8_1_0 )
                    {
                     before(grammarAccess.getChoixAccess().getObjetDonAssignment_8_1_0()); 
                    // InternalGame.g:519:3: ( rule__Choix__ObjetDonAssignment_8_1_0 )
                    // InternalGame.g:519:4: rule__Choix__ObjetDonAssignment_8_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Choix__ObjetDonAssignment_8_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChoixAccess().getObjetDonAssignment_8_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:523:2: ( ( rule__Choix__Group_8_1_1__0 ) )
                    {
                    // InternalGame.g:523:2: ( ( rule__Choix__Group_8_1_1__0 ) )
                    // InternalGame.g:524:3: ( rule__Choix__Group_8_1_1__0 )
                    {
                     before(grammarAccess.getChoixAccess().getGroup_8_1_1()); 
                    // InternalGame.g:525:3: ( rule__Choix__Group_8_1_1__0 )
                    // InternalGame.g:525:4: rule__Choix__Group_8_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Choix__Group_8_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChoixAccess().getGroup_8_1_1()); 

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
    // $ANTLR end "rule__Choix__Alternatives_8_1"


    // $ANTLR start "rule__Condition__Alternatives"
    // InternalGame.g:533:1: rule__Condition__Alternatives : ( ( ( rule__Condition__Group_0__0 ) ) | ( RULE_BOOL ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:537:1: ( ( ( rule__Condition__Group_0__0 ) ) | ( RULE_BOOL ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==47) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_BOOL) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGame.g:538:2: ( ( rule__Condition__Group_0__0 ) )
                    {
                    // InternalGame.g:538:2: ( ( rule__Condition__Group_0__0 ) )
                    // InternalGame.g:539:3: ( rule__Condition__Group_0__0 )
                    {
                     before(grammarAccess.getConditionAccess().getGroup_0()); 
                    // InternalGame.g:540:3: ( rule__Condition__Group_0__0 )
                    // InternalGame.g:540:4: rule__Condition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:544:2: ( RULE_BOOL )
                    {
                    // InternalGame.g:544:2: ( RULE_BOOL )
                    // InternalGame.g:545:3: RULE_BOOL
                    {
                     before(grammarAccess.getConditionAccess().getBOOLTerminalRuleCall_1()); 
                    match(input,RULE_BOOL,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getBOOLTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Condition__Alternatives"


    // $ANTLR start "rule__Condition__Alternatives_0_3_1"
    // InternalGame.g:554:1: rule__Condition__Alternatives_0_3_1 : ( ( ( rule__Condition__Group_0_3_1_0__0 ) ) | ( ( rule__Condition__Group_0_3_1_1__0 ) ) );
    public final void rule__Condition__Alternatives_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:558:1: ( ( ( rule__Condition__Group_0_3_1_0__0 ) ) | ( ( rule__Condition__Group_0_3_1_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==48) ) {
                alt6=1;
            }
            else if ( (LA6_0==49) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGame.g:559:2: ( ( rule__Condition__Group_0_3_1_0__0 ) )
                    {
                    // InternalGame.g:559:2: ( ( rule__Condition__Group_0_3_1_0__0 ) )
                    // InternalGame.g:560:3: ( rule__Condition__Group_0_3_1_0__0 )
                    {
                     before(grammarAccess.getConditionAccess().getGroup_0_3_1_0()); 
                    // InternalGame.g:561:3: ( rule__Condition__Group_0_3_1_0__0 )
                    // InternalGame.g:561:4: rule__Condition__Group_0_3_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__Group_0_3_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionAccess().getGroup_0_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:565:2: ( ( rule__Condition__Group_0_3_1_1__0 ) )
                    {
                    // InternalGame.g:565:2: ( ( rule__Condition__Group_0_3_1_1__0 ) )
                    // InternalGame.g:566:3: ( rule__Condition__Group_0_3_1_1__0 )
                    {
                     before(grammarAccess.getConditionAccess().getGroup_0_3_1_1()); 
                    // InternalGame.g:567:3: ( rule__Condition__Group_0_3_1_1__0 )
                    // InternalGame.g:567:4: rule__Condition__Group_0_3_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__Group_0_3_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionAccess().getGroup_0_3_1_1()); 

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
    // $ANTLR end "rule__Condition__Alternatives_0_3_1"


    // $ANTLR start "rule__Condition__Alternatives_0_4_2"
    // InternalGame.g:575:1: rule__Condition__Alternatives_0_4_2 : ( ( ( rule__Condition__Group_0_4_2_0__0 ) ) | ( ( rule__Condition__Group_0_4_2_1__0 ) ) );
    public final void rule__Condition__Alternatives_0_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:579:1: ( ( ( rule__Condition__Group_0_4_2_0__0 ) ) | ( ( rule__Condition__Group_0_4_2_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==50) ) {
                alt7=1;
            }
            else if ( (LA7_0==51) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGame.g:580:2: ( ( rule__Condition__Group_0_4_2_0__0 ) )
                    {
                    // InternalGame.g:580:2: ( ( rule__Condition__Group_0_4_2_0__0 ) )
                    // InternalGame.g:581:3: ( rule__Condition__Group_0_4_2_0__0 )
                    {
                     before(grammarAccess.getConditionAccess().getGroup_0_4_2_0()); 
                    // InternalGame.g:582:3: ( rule__Condition__Group_0_4_2_0__0 )
                    // InternalGame.g:582:4: rule__Condition__Group_0_4_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__Group_0_4_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionAccess().getGroup_0_4_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:586:2: ( ( rule__Condition__Group_0_4_2_1__0 ) )
                    {
                    // InternalGame.g:586:2: ( ( rule__Condition__Group_0_4_2_1__0 ) )
                    // InternalGame.g:587:3: ( rule__Condition__Group_0_4_2_1__0 )
                    {
                     before(grammarAccess.getConditionAccess().getGroup_0_4_2_1()); 
                    // InternalGame.g:588:3: ( rule__Condition__Group_0_4_2_1__0 )
                    // InternalGame.g:588:4: rule__Condition__Group_0_4_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__Group_0_4_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionAccess().getGroup_0_4_2_1()); 

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
    // $ANTLR end "rule__Condition__Alternatives_0_4_2"


    // $ANTLR start "rule__Nature__Alternatives"
    // InternalGame.g:596:1: rule__Nature__Alternatives : ( ( ( 'depart' ) ) | ( ( 'fin' ) ) | ( ( 'intermediaire' ) ) );
    public final void rule__Nature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:600:1: ( ( ( 'depart' ) ) | ( ( 'fin' ) ) | ( ( 'intermediaire' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt8=1;
                }
                break;
            case 13:
                {
                alt8=2;
                }
                break;
            case 14:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalGame.g:601:2: ( ( 'depart' ) )
                    {
                    // InternalGame.g:601:2: ( ( 'depart' ) )
                    // InternalGame.g:602:3: ( 'depart' )
                    {
                     before(grammarAccess.getNatureAccess().getDepartEnumLiteralDeclaration_0()); 
                    // InternalGame.g:603:3: ( 'depart' )
                    // InternalGame.g:603:4: 'depart'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getNatureAccess().getDepartEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:607:2: ( ( 'fin' ) )
                    {
                    // InternalGame.g:607:2: ( ( 'fin' ) )
                    // InternalGame.g:608:3: ( 'fin' )
                    {
                     before(grammarAccess.getNatureAccess().getFinEnumLiteralDeclaration_1()); 
                    // InternalGame.g:609:3: ( 'fin' )
                    // InternalGame.g:609:4: 'fin'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getNatureAccess().getFinEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:613:2: ( ( 'intermediaire' ) )
                    {
                    // InternalGame.g:613:2: ( ( 'intermediaire' ) )
                    // InternalGame.g:614:3: ( 'intermediaire' )
                    {
                     before(grammarAccess.getNatureAccess().getInterEnumLiteralDeclaration_2()); 
                    // InternalGame.g:615:3: ( 'intermediaire' )
                    // InternalGame.g:615:4: 'intermediaire'
                    {
                    match(input,14,FOLLOW_2); 

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
    // InternalGame.g:623:1: rule__Jeu__Group__0 : rule__Jeu__Group__0__Impl rule__Jeu__Group__1 ;
    public final void rule__Jeu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:627:1: ( rule__Jeu__Group__0__Impl rule__Jeu__Group__1 )
            // InternalGame.g:628:2: rule__Jeu__Group__0__Impl rule__Jeu__Group__1
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
    // InternalGame.g:635:1: rule__Jeu__Group__0__Impl : ( 'jeu' ) ;
    public final void rule__Jeu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:639:1: ( ( 'jeu' ) )
            // InternalGame.g:640:1: ( 'jeu' )
            {
            // InternalGame.g:640:1: ( 'jeu' )
            // InternalGame.g:641:2: 'jeu'
            {
             before(grammarAccess.getJeuAccess().getJeuKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getJeuKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__0__Impl"


    // $ANTLR start "rule__Jeu__Group__1"
    // InternalGame.g:650:1: rule__Jeu__Group__1 : rule__Jeu__Group__1__Impl rule__Jeu__Group__2 ;
    public final void rule__Jeu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:654:1: ( rule__Jeu__Group__1__Impl rule__Jeu__Group__2 )
            // InternalGame.g:655:2: rule__Jeu__Group__1__Impl rule__Jeu__Group__2
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
    // InternalGame.g:662:1: rule__Jeu__Group__1__Impl : ( ( rule__Jeu__NameAssignment_1 ) ) ;
    public final void rule__Jeu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:666:1: ( ( ( rule__Jeu__NameAssignment_1 ) ) )
            // InternalGame.g:667:1: ( ( rule__Jeu__NameAssignment_1 ) )
            {
            // InternalGame.g:667:1: ( ( rule__Jeu__NameAssignment_1 ) )
            // InternalGame.g:668:2: ( rule__Jeu__NameAssignment_1 )
            {
             before(grammarAccess.getJeuAccess().getNameAssignment_1()); 
            // InternalGame.g:669:2: ( rule__Jeu__NameAssignment_1 )
            // InternalGame.g:669:3: rule__Jeu__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJeuAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalGame.g:677:1: rule__Jeu__Group__2 : rule__Jeu__Group__2__Impl rule__Jeu__Group__3 ;
    public final void rule__Jeu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:681:1: ( rule__Jeu__Group__2__Impl rule__Jeu__Group__3 )
            // InternalGame.g:682:2: rule__Jeu__Group__2__Impl rule__Jeu__Group__3
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
    // InternalGame.g:689:1: rule__Jeu__Group__2__Impl : ( '{' ) ;
    public final void rule__Jeu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:693:1: ( ( '{' ) )
            // InternalGame.g:694:1: ( '{' )
            {
            // InternalGame.g:694:1: ( '{' )
            // InternalGame.g:695:2: '{'
            {
             before(grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalGame.g:704:1: rule__Jeu__Group__3 : rule__Jeu__Group__3__Impl rule__Jeu__Group__4 ;
    public final void rule__Jeu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:708:1: ( rule__Jeu__Group__3__Impl rule__Jeu__Group__4 )
            // InternalGame.g:709:2: rule__Jeu__Group__3__Impl rule__Jeu__Group__4
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
    // InternalGame.g:716:1: rule__Jeu__Group__3__Impl : ( ( rule__Jeu__TerritoireAssignment_3 ) ) ;
    public final void rule__Jeu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:720:1: ( ( ( rule__Jeu__TerritoireAssignment_3 ) ) )
            // InternalGame.g:721:1: ( ( rule__Jeu__TerritoireAssignment_3 ) )
            {
            // InternalGame.g:721:1: ( ( rule__Jeu__TerritoireAssignment_3 ) )
            // InternalGame.g:722:2: ( rule__Jeu__TerritoireAssignment_3 )
            {
             before(grammarAccess.getJeuAccess().getTerritoireAssignment_3()); 
            // InternalGame.g:723:2: ( rule__Jeu__TerritoireAssignment_3 )
            // InternalGame.g:723:3: rule__Jeu__TerritoireAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__TerritoireAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getJeuAccess().getTerritoireAssignment_3()); 

            }


            }

        }
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
    // InternalGame.g:731:1: rule__Jeu__Group__4 : rule__Jeu__Group__4__Impl rule__Jeu__Group__5 ;
    public final void rule__Jeu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:735:1: ( rule__Jeu__Group__4__Impl rule__Jeu__Group__5 )
            // InternalGame.g:736:2: rule__Jeu__Group__4__Impl rule__Jeu__Group__5
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
    // InternalGame.g:743:1: rule__Jeu__Group__4__Impl : ( ( rule__Jeu__ExplorateurAssignment_4 ) ) ;
    public final void rule__Jeu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:747:1: ( ( ( rule__Jeu__ExplorateurAssignment_4 ) ) )
            // InternalGame.g:748:1: ( ( rule__Jeu__ExplorateurAssignment_4 ) )
            {
            // InternalGame.g:748:1: ( ( rule__Jeu__ExplorateurAssignment_4 ) )
            // InternalGame.g:749:2: ( rule__Jeu__ExplorateurAssignment_4 )
            {
             before(grammarAccess.getJeuAccess().getExplorateurAssignment_4()); 
            // InternalGame.g:750:2: ( rule__Jeu__ExplorateurAssignment_4 )
            // InternalGame.g:750:3: rule__Jeu__ExplorateurAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__ExplorateurAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getJeuAccess().getExplorateurAssignment_4()); 

            }


            }

        }
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
    // InternalGame.g:758:1: rule__Jeu__Group__5 : rule__Jeu__Group__5__Impl rule__Jeu__Group__6 ;
    public final void rule__Jeu__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:762:1: ( rule__Jeu__Group__5__Impl rule__Jeu__Group__6 )
            // InternalGame.g:763:2: rule__Jeu__Group__5__Impl rule__Jeu__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalGame.g:770:1: rule__Jeu__Group__5__Impl : ( ( rule__Jeu__ElementsjeuAssignment_5 )* ) ;
    public final void rule__Jeu__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:774:1: ( ( ( rule__Jeu__ElementsjeuAssignment_5 )* ) )
            // InternalGame.g:775:1: ( ( rule__Jeu__ElementsjeuAssignment_5 )* )
            {
            // InternalGame.g:775:1: ( ( rule__Jeu__ElementsjeuAssignment_5 )* )
            // InternalGame.g:776:2: ( rule__Jeu__ElementsjeuAssignment_5 )*
            {
             before(grammarAccess.getJeuAccess().getElementsjeuAssignment_5()); 
            // InternalGame.g:777:2: ( rule__Jeu__ElementsjeuAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19||LA9_0==21||LA9_0==27||(LA9_0>=37 && LA9_0<=38)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGame.g:777:3: rule__Jeu__ElementsjeuAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Jeu__ElementsjeuAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getJeuAccess().getElementsjeuAssignment_5()); 

            }


            }

        }
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
    // InternalGame.g:785:1: rule__Jeu__Group__6 : rule__Jeu__Group__6__Impl ;
    public final void rule__Jeu__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:789:1: ( rule__Jeu__Group__6__Impl )
            // InternalGame.g:790:2: rule__Jeu__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__Group__6__Impl();

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
    // InternalGame.g:796:1: rule__Jeu__Group__6__Impl : ( '}' ) ;
    public final void rule__Jeu__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:800:1: ( ( '}' ) )
            // InternalGame.g:801:1: ( '}' )
            {
            // InternalGame.g:801:1: ( '}' )
            // InternalGame.g:802:2: '}'
            {
             before(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__QteObjet__Group__0"
    // InternalGame.g:812:1: rule__QteObjet__Group__0 : rule__QteObjet__Group__0__Impl rule__QteObjet__Group__1 ;
    public final void rule__QteObjet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:816:1: ( rule__QteObjet__Group__0__Impl rule__QteObjet__Group__1 )
            // InternalGame.g:817:2: rule__QteObjet__Group__0__Impl rule__QteObjet__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:824:1: rule__QteObjet__Group__0__Impl : ( ( rule__QteObjet__QteAssignment_0 ) ) ;
    public final void rule__QteObjet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:828:1: ( ( ( rule__QteObjet__QteAssignment_0 ) ) )
            // InternalGame.g:829:1: ( ( rule__QteObjet__QteAssignment_0 ) )
            {
            // InternalGame.g:829:1: ( ( rule__QteObjet__QteAssignment_0 ) )
            // InternalGame.g:830:2: ( rule__QteObjet__QteAssignment_0 )
            {
             before(grammarAccess.getQteObjetAccess().getQteAssignment_0()); 
            // InternalGame.g:831:2: ( rule__QteObjet__QteAssignment_0 )
            // InternalGame.g:831:3: rule__QteObjet__QteAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__QteObjet__QteAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQteObjetAccess().getQteAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QteObjet__Group__0__Impl"


    // $ANTLR start "rule__QteObjet__Group__1"
    // InternalGame.g:839:1: rule__QteObjet__Group__1 : rule__QteObjet__Group__1__Impl ;
    public final void rule__QteObjet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:843:1: ( rule__QteObjet__Group__1__Impl )
            // InternalGame.g:844:2: rule__QteObjet__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QteObjet__Group__1__Impl();

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
    // InternalGame.g:850:1: rule__QteObjet__Group__1__Impl : ( ( rule__QteObjet__ObjetAssignment_1 ) ) ;
    public final void rule__QteObjet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:854:1: ( ( ( rule__QteObjet__ObjetAssignment_1 ) ) )
            // InternalGame.g:855:1: ( ( rule__QteObjet__ObjetAssignment_1 ) )
            {
            // InternalGame.g:855:1: ( ( rule__QteObjet__ObjetAssignment_1 ) )
            // InternalGame.g:856:2: ( rule__QteObjet__ObjetAssignment_1 )
            {
             before(grammarAccess.getQteObjetAccess().getObjetAssignment_1()); 
            // InternalGame.g:857:2: ( rule__QteObjet__ObjetAssignment_1 )
            // InternalGame.g:857:3: rule__QteObjet__ObjetAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__QteObjet__ObjetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQteObjetAccess().getObjetAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Territoire__Group__0"
    // InternalGame.g:866:1: rule__Territoire__Group__0 : rule__Territoire__Group__0__Impl rule__Territoire__Group__1 ;
    public final void rule__Territoire__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:870:1: ( rule__Territoire__Group__0__Impl rule__Territoire__Group__1 )
            // InternalGame.g:871:2: rule__Territoire__Group__0__Impl rule__Territoire__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalGame.g:878:1: rule__Territoire__Group__0__Impl : ( 'territoire' ) ;
    public final void rule__Territoire__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:882:1: ( ( 'territoire' ) )
            // InternalGame.g:883:1: ( 'territoire' )
            {
            // InternalGame.g:883:1: ( 'territoire' )
            // InternalGame.g:884:2: 'territoire'
            {
             before(grammarAccess.getTerritoireAccess().getTerritoireKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getTerritoireKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__Group__0__Impl"


    // $ANTLR start "rule__Territoire__Group__1"
    // InternalGame.g:893:1: rule__Territoire__Group__1 : rule__Territoire__Group__1__Impl rule__Territoire__Group__2 ;
    public final void rule__Territoire__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:897:1: ( rule__Territoire__Group__1__Impl rule__Territoire__Group__2 )
            // InternalGame.g:898:2: rule__Territoire__Group__1__Impl rule__Territoire__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalGame.g:905:1: rule__Territoire__Group__1__Impl : ( '{' ) ;
    public final void rule__Territoire__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:909:1: ( ( '{' ) )
            // InternalGame.g:910:1: ( '{' )
            {
            // InternalGame.g:910:1: ( '{' )
            // InternalGame.g:911:2: '{'
            {
             before(grammarAccess.getTerritoireAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalGame.g:920:1: rule__Territoire__Group__2 : rule__Territoire__Group__2__Impl rule__Territoire__Group__3 ;
    public final void rule__Territoire__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:924:1: ( rule__Territoire__Group__2__Impl rule__Territoire__Group__3 )
            // InternalGame.g:925:2: rule__Territoire__Group__2__Impl rule__Territoire__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalGame.g:932:1: rule__Territoire__Group__2__Impl : ( ( ( rule__Territoire__PlacesAssignment_2 ) ) ( ( rule__Territoire__PlacesAssignment_2 )* ) ) ;
    public final void rule__Territoire__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:936:1: ( ( ( ( rule__Territoire__PlacesAssignment_2 ) ) ( ( rule__Territoire__PlacesAssignment_2 )* ) ) )
            // InternalGame.g:937:1: ( ( ( rule__Territoire__PlacesAssignment_2 ) ) ( ( rule__Territoire__PlacesAssignment_2 )* ) )
            {
            // InternalGame.g:937:1: ( ( ( rule__Territoire__PlacesAssignment_2 ) ) ( ( rule__Territoire__PlacesAssignment_2 )* ) )
            // InternalGame.g:938:2: ( ( rule__Territoire__PlacesAssignment_2 ) ) ( ( rule__Territoire__PlacesAssignment_2 )* )
            {
            // InternalGame.g:938:2: ( ( rule__Territoire__PlacesAssignment_2 ) )
            // InternalGame.g:939:3: ( rule__Territoire__PlacesAssignment_2 )
            {
             before(grammarAccess.getTerritoireAccess().getPlacesAssignment_2()); 
            // InternalGame.g:940:3: ( rule__Territoire__PlacesAssignment_2 )
            // InternalGame.g:940:4: rule__Territoire__PlacesAssignment_2
            {
            pushFollow(FOLLOW_8);
            rule__Territoire__PlacesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTerritoireAccess().getPlacesAssignment_2()); 

            }

            // InternalGame.g:943:2: ( ( rule__Territoire__PlacesAssignment_2 )* )
            // InternalGame.g:944:3: ( rule__Territoire__PlacesAssignment_2 )*
            {
             before(grammarAccess.getTerritoireAccess().getPlacesAssignment_2()); 
            // InternalGame.g:945:3: ( rule__Territoire__PlacesAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19||LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGame.g:945:4: rule__Territoire__PlacesAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Territoire__PlacesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getTerritoireAccess().getPlacesAssignment_2()); 

            }


            }


            }

        }
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
    // InternalGame.g:954:1: rule__Territoire__Group__3 : rule__Territoire__Group__3__Impl ;
    public final void rule__Territoire__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:958:1: ( rule__Territoire__Group__3__Impl )
            // InternalGame.g:959:2: rule__Territoire__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Territoire__Group__3__Impl();

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
    // InternalGame.g:965:1: rule__Territoire__Group__3__Impl : ( '}' ) ;
    public final void rule__Territoire__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:969:1: ( ( '}' ) )
            // InternalGame.g:970:1: ( '}' )
            {
            // InternalGame.g:970:1: ( '}' )
            // InternalGame.g:971:2: '}'
            {
             before(grammarAccess.getTerritoireAccess().getRightCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Lieu__Group__0"
    // InternalGame.g:981:1: rule__Lieu__Group__0 : rule__Lieu__Group__0__Impl rule__Lieu__Group__1 ;
    public final void rule__Lieu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:985:1: ( rule__Lieu__Group__0__Impl rule__Lieu__Group__1 )
            // InternalGame.g:986:2: rule__Lieu__Group__0__Impl rule__Lieu__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:993:1: rule__Lieu__Group__0__Impl : ( 'lieu' ) ;
    public final void rule__Lieu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:997:1: ( ( 'lieu' ) )
            // InternalGame.g:998:1: ( 'lieu' )
            {
            // InternalGame.g:998:1: ( 'lieu' )
            // InternalGame.g:999:2: 'lieu'
            {
             before(grammarAccess.getLieuAccess().getLieuKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getLieuKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__0__Impl"


    // $ANTLR start "rule__Lieu__Group__1"
    // InternalGame.g:1008:1: rule__Lieu__Group__1 : rule__Lieu__Group__1__Impl rule__Lieu__Group__2 ;
    public final void rule__Lieu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1012:1: ( rule__Lieu__Group__1__Impl rule__Lieu__Group__2 )
            // InternalGame.g:1013:2: rule__Lieu__Group__1__Impl rule__Lieu__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalGame.g:1020:1: rule__Lieu__Group__1__Impl : ( ( rule__Lieu__NameAssignment_1 ) ) ;
    public final void rule__Lieu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1024:1: ( ( ( rule__Lieu__NameAssignment_1 ) ) )
            // InternalGame.g:1025:1: ( ( rule__Lieu__NameAssignment_1 ) )
            {
            // InternalGame.g:1025:1: ( ( rule__Lieu__NameAssignment_1 ) )
            // InternalGame.g:1026:2: ( rule__Lieu__NameAssignment_1 )
            {
             before(grammarAccess.getLieuAccess().getNameAssignment_1()); 
            // InternalGame.g:1027:2: ( rule__Lieu__NameAssignment_1 )
            // InternalGame.g:1027:3: rule__Lieu__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalGame.g:1035:1: rule__Lieu__Group__2 : rule__Lieu__Group__2__Impl rule__Lieu__Group__3 ;
    public final void rule__Lieu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1039:1: ( rule__Lieu__Group__2__Impl rule__Lieu__Group__3 )
            // InternalGame.g:1040:2: rule__Lieu__Group__2__Impl rule__Lieu__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalGame.g:1047:1: rule__Lieu__Group__2__Impl : ( ':' ) ;
    public final void rule__Lieu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1051:1: ( ( ':' ) )
            // InternalGame.g:1052:1: ( ':' )
            {
            // InternalGame.g:1052:1: ( ':' )
            // InternalGame.g:1053:2: ':'
            {
             before(grammarAccess.getLieuAccess().getColonKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getColonKeyword_2()); 

            }


            }

        }
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
    // InternalGame.g:1062:1: rule__Lieu__Group__3 : rule__Lieu__Group__3__Impl ;
    public final void rule__Lieu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1066:1: ( rule__Lieu__Group__3__Impl )
            // InternalGame.g:1067:2: rule__Lieu__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group__3__Impl();

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
    // InternalGame.g:1073:1: rule__Lieu__Group__3__Impl : ( ( rule__Lieu__NatureAssignment_3 ) ) ;
    public final void rule__Lieu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1077:1: ( ( ( rule__Lieu__NatureAssignment_3 ) ) )
            // InternalGame.g:1078:1: ( ( rule__Lieu__NatureAssignment_3 ) )
            {
            // InternalGame.g:1078:1: ( ( rule__Lieu__NatureAssignment_3 ) )
            // InternalGame.g:1079:2: ( rule__Lieu__NatureAssignment_3 )
            {
             before(grammarAccess.getLieuAccess().getNatureAssignment_3()); 
            // InternalGame.g:1080:2: ( rule__Lieu__NatureAssignment_3 )
            // InternalGame.g:1080:3: rule__Lieu__NatureAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__NatureAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getNatureAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Chemin__Group__0"
    // InternalGame.g:1089:1: rule__Chemin__Group__0 : rule__Chemin__Group__0__Impl rule__Chemin__Group__1 ;
    public final void rule__Chemin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1093:1: ( rule__Chemin__Group__0__Impl rule__Chemin__Group__1 )
            // InternalGame.g:1094:2: rule__Chemin__Group__0__Impl rule__Chemin__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:1101:1: rule__Chemin__Group__0__Impl : ( 'chemin' ) ;
    public final void rule__Chemin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1105:1: ( ( 'chemin' ) )
            // InternalGame.g:1106:1: ( 'chemin' )
            {
            // InternalGame.g:1106:1: ( 'chemin' )
            // InternalGame.g:1107:2: 'chemin'
            {
             before(grammarAccess.getCheminAccess().getCheminKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getCheminKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__0__Impl"


    // $ANTLR start "rule__Chemin__Group__1"
    // InternalGame.g:1116:1: rule__Chemin__Group__1 : rule__Chemin__Group__1__Impl rule__Chemin__Group__2 ;
    public final void rule__Chemin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1120:1: ( rule__Chemin__Group__1__Impl rule__Chemin__Group__2 )
            // InternalGame.g:1121:2: rule__Chemin__Group__1__Impl rule__Chemin__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalGame.g:1128:1: rule__Chemin__Group__1__Impl : ( ( rule__Chemin__NameAssignment_1 ) ) ;
    public final void rule__Chemin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1132:1: ( ( ( rule__Chemin__NameAssignment_1 ) ) )
            // InternalGame.g:1133:1: ( ( rule__Chemin__NameAssignment_1 ) )
            {
            // InternalGame.g:1133:1: ( ( rule__Chemin__NameAssignment_1 ) )
            // InternalGame.g:1134:2: ( rule__Chemin__NameAssignment_1 )
            {
             before(grammarAccess.getCheminAccess().getNameAssignment_1()); 
            // InternalGame.g:1135:2: ( rule__Chemin__NameAssignment_1 )
            // InternalGame.g:1135:3: rule__Chemin__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalGame.g:1143:1: rule__Chemin__Group__2 : rule__Chemin__Group__2__Impl rule__Chemin__Group__3 ;
    public final void rule__Chemin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1147:1: ( rule__Chemin__Group__2__Impl rule__Chemin__Group__3 )
            // InternalGame.g:1148:2: rule__Chemin__Group__2__Impl rule__Chemin__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalGame.g:1155:1: rule__Chemin__Group__2__Impl : ( '{' ) ;
    public final void rule__Chemin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1159:1: ( ( '{' ) )
            // InternalGame.g:1160:1: ( '{' )
            {
            // InternalGame.g:1160:1: ( '{' )
            // InternalGame.g:1161:2: '{'
            {
             before(grammarAccess.getCheminAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalGame.g:1170:1: rule__Chemin__Group__3 : rule__Chemin__Group__3__Impl rule__Chemin__Group__4 ;
    public final void rule__Chemin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1174:1: ( rule__Chemin__Group__3__Impl rule__Chemin__Group__4 )
            // InternalGame.g:1175:2: rule__Chemin__Group__3__Impl rule__Chemin__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:1182:1: rule__Chemin__Group__3__Impl : ( 'de' ) ;
    public final void rule__Chemin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1186:1: ( ( 'de' ) )
            // InternalGame.g:1187:1: ( 'de' )
            {
            // InternalGame.g:1187:1: ( 'de' )
            // InternalGame.g:1188:2: 'de'
            {
             before(grammarAccess.getCheminAccess().getDeKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getDeKeyword_3()); 

            }


            }

        }
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
    // InternalGame.g:1197:1: rule__Chemin__Group__4 : rule__Chemin__Group__4__Impl rule__Chemin__Group__5 ;
    public final void rule__Chemin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1201:1: ( rule__Chemin__Group__4__Impl rule__Chemin__Group__5 )
            // InternalGame.g:1202:2: rule__Chemin__Group__4__Impl rule__Chemin__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalGame.g:1209:1: rule__Chemin__Group__4__Impl : ( ( rule__Chemin__PredAssignment_4 ) ) ;
    public final void rule__Chemin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1213:1: ( ( ( rule__Chemin__PredAssignment_4 ) ) )
            // InternalGame.g:1214:1: ( ( rule__Chemin__PredAssignment_4 ) )
            {
            // InternalGame.g:1214:1: ( ( rule__Chemin__PredAssignment_4 ) )
            // InternalGame.g:1215:2: ( rule__Chemin__PredAssignment_4 )
            {
             before(grammarAccess.getCheminAccess().getPredAssignment_4()); 
            // InternalGame.g:1216:2: ( rule__Chemin__PredAssignment_4 )
            // InternalGame.g:1216:3: rule__Chemin__PredAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__PredAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getPredAssignment_4()); 

            }


            }

        }
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
    // InternalGame.g:1224:1: rule__Chemin__Group__5 : rule__Chemin__Group__5__Impl rule__Chemin__Group__6 ;
    public final void rule__Chemin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1228:1: ( rule__Chemin__Group__5__Impl rule__Chemin__Group__6 )
            // InternalGame.g:1229:2: rule__Chemin__Group__5__Impl rule__Chemin__Group__6
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:1236:1: rule__Chemin__Group__5__Impl : ( 'vers' ) ;
    public final void rule__Chemin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1240:1: ( ( 'vers' ) )
            // InternalGame.g:1241:1: ( 'vers' )
            {
            // InternalGame.g:1241:1: ( 'vers' )
            // InternalGame.g:1242:2: 'vers'
            {
             before(grammarAccess.getCheminAccess().getVersKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getVersKeyword_5()); 

            }


            }

        }
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
    // InternalGame.g:1251:1: rule__Chemin__Group__6 : rule__Chemin__Group__6__Impl rule__Chemin__Group__7 ;
    public final void rule__Chemin__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1255:1: ( rule__Chemin__Group__6__Impl rule__Chemin__Group__7 )
            // InternalGame.g:1256:2: rule__Chemin__Group__6__Impl rule__Chemin__Group__7
            {
            pushFollow(FOLLOW_15);
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
    // InternalGame.g:1263:1: rule__Chemin__Group__6__Impl : ( ( rule__Chemin__SuccAssignment_6 ) ) ;
    public final void rule__Chemin__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1267:1: ( ( ( rule__Chemin__SuccAssignment_6 ) ) )
            // InternalGame.g:1268:1: ( ( rule__Chemin__SuccAssignment_6 ) )
            {
            // InternalGame.g:1268:1: ( ( rule__Chemin__SuccAssignment_6 ) )
            // InternalGame.g:1269:2: ( rule__Chemin__SuccAssignment_6 )
            {
             before(grammarAccess.getCheminAccess().getSuccAssignment_6()); 
            // InternalGame.g:1270:2: ( rule__Chemin__SuccAssignment_6 )
            // InternalGame.g:1270:3: rule__Chemin__SuccAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__SuccAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getSuccAssignment_6()); 

            }


            }

        }
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
    // InternalGame.g:1278:1: rule__Chemin__Group__7 : rule__Chemin__Group__7__Impl rule__Chemin__Group__8 ;
    public final void rule__Chemin__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1282:1: ( rule__Chemin__Group__7__Impl rule__Chemin__Group__8 )
            // InternalGame.g:1283:2: rule__Chemin__Group__7__Impl rule__Chemin__Group__8
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:1290:1: rule__Chemin__Group__7__Impl : ( 'visible' ) ;
    public final void rule__Chemin__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1294:1: ( ( 'visible' ) )
            // InternalGame.g:1295:1: ( 'visible' )
            {
            // InternalGame.g:1295:1: ( 'visible' )
            // InternalGame.g:1296:2: 'visible'
            {
             before(grammarAccess.getCheminAccess().getVisibleKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getVisibleKeyword_7()); 

            }


            }

        }
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
    // InternalGame.g:1305:1: rule__Chemin__Group__8 : rule__Chemin__Group__8__Impl rule__Chemin__Group__9 ;
    public final void rule__Chemin__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1309:1: ( rule__Chemin__Group__8__Impl rule__Chemin__Group__9 )
            // InternalGame.g:1310:2: rule__Chemin__Group__8__Impl rule__Chemin__Group__9
            {
            pushFollow(FOLLOW_17);
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
    // InternalGame.g:1317:1: rule__Chemin__Group__8__Impl : ( ( rule__Chemin__VisibleAssignment_8 ) ) ;
    public final void rule__Chemin__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1321:1: ( ( ( rule__Chemin__VisibleAssignment_8 ) ) )
            // InternalGame.g:1322:1: ( ( rule__Chemin__VisibleAssignment_8 ) )
            {
            // InternalGame.g:1322:1: ( ( rule__Chemin__VisibleAssignment_8 ) )
            // InternalGame.g:1323:2: ( rule__Chemin__VisibleAssignment_8 )
            {
             before(grammarAccess.getCheminAccess().getVisibleAssignment_8()); 
            // InternalGame.g:1324:2: ( rule__Chemin__VisibleAssignment_8 )
            // InternalGame.g:1324:3: rule__Chemin__VisibleAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__VisibleAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getVisibleAssignment_8()); 

            }


            }

        }
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
    // InternalGame.g:1332:1: rule__Chemin__Group__9 : rule__Chemin__Group__9__Impl rule__Chemin__Group__10 ;
    public final void rule__Chemin__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1336:1: ( rule__Chemin__Group__9__Impl rule__Chemin__Group__10 )
            // InternalGame.g:1337:2: rule__Chemin__Group__9__Impl rule__Chemin__Group__10
            {
            pushFollow(FOLLOW_18);
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
    // InternalGame.g:1344:1: rule__Chemin__Group__9__Impl : ( 'obligatoire' ) ;
    public final void rule__Chemin__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1348:1: ( ( 'obligatoire' ) )
            // InternalGame.g:1349:1: ( 'obligatoire' )
            {
            // InternalGame.g:1349:1: ( 'obligatoire' )
            // InternalGame.g:1350:2: 'obligatoire'
            {
             before(grammarAccess.getCheminAccess().getObligatoireKeyword_9()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getObligatoireKeyword_9()); 

            }


            }

        }
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
    // InternalGame.g:1359:1: rule__Chemin__Group__10 : rule__Chemin__Group__10__Impl rule__Chemin__Group__11 ;
    public final void rule__Chemin__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1363:1: ( rule__Chemin__Group__10__Impl rule__Chemin__Group__11 )
            // InternalGame.g:1364:2: rule__Chemin__Group__10__Impl rule__Chemin__Group__11
            {
            pushFollow(FOLLOW_19);
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
    // InternalGame.g:1371:1: rule__Chemin__Group__10__Impl : ( ( rule__Chemin__ObligatoireAssignment_10 ) ) ;
    public final void rule__Chemin__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1375:1: ( ( ( rule__Chemin__ObligatoireAssignment_10 ) ) )
            // InternalGame.g:1376:1: ( ( rule__Chemin__ObligatoireAssignment_10 ) )
            {
            // InternalGame.g:1376:1: ( ( rule__Chemin__ObligatoireAssignment_10 ) )
            // InternalGame.g:1377:2: ( rule__Chemin__ObligatoireAssignment_10 )
            {
             before(grammarAccess.getCheminAccess().getObligatoireAssignment_10()); 
            // InternalGame.g:1378:2: ( rule__Chemin__ObligatoireAssignment_10 )
            // InternalGame.g:1378:3: rule__Chemin__ObligatoireAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__ObligatoireAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getObligatoireAssignment_10()); 

            }


            }

        }
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
    // InternalGame.g:1386:1: rule__Chemin__Group__11 : rule__Chemin__Group__11__Impl rule__Chemin__Group__12 ;
    public final void rule__Chemin__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1390:1: ( rule__Chemin__Group__11__Impl rule__Chemin__Group__12 )
            // InternalGame.g:1391:2: rule__Chemin__Group__11__Impl rule__Chemin__Group__12
            {
            pushFollow(FOLLOW_16);
            rule__Chemin__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__12();

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
    // InternalGame.g:1398:1: rule__Chemin__Group__11__Impl : ( 'ouvert' ) ;
    public final void rule__Chemin__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1402:1: ( ( 'ouvert' ) )
            // InternalGame.g:1403:1: ( 'ouvert' )
            {
            // InternalGame.g:1403:1: ( 'ouvert' )
            // InternalGame.g:1404:2: 'ouvert'
            {
             before(grammarAccess.getCheminAccess().getOuvertKeyword_11()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getOuvertKeyword_11()); 

            }


            }

        }
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


    // $ANTLR start "rule__Chemin__Group__12"
    // InternalGame.g:1413:1: rule__Chemin__Group__12 : rule__Chemin__Group__12__Impl rule__Chemin__Group__13 ;
    public final void rule__Chemin__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1417:1: ( rule__Chemin__Group__12__Impl rule__Chemin__Group__13 )
            // InternalGame.g:1418:2: rule__Chemin__Group__12__Impl rule__Chemin__Group__13
            {
            pushFollow(FOLLOW_10);
            rule__Chemin__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__13();

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
    // $ANTLR end "rule__Chemin__Group__12"


    // $ANTLR start "rule__Chemin__Group__12__Impl"
    // InternalGame.g:1425:1: rule__Chemin__Group__12__Impl : ( ( rule__Chemin__OuvertAssignment_12 ) ) ;
    public final void rule__Chemin__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1429:1: ( ( ( rule__Chemin__OuvertAssignment_12 ) ) )
            // InternalGame.g:1430:1: ( ( rule__Chemin__OuvertAssignment_12 ) )
            {
            // InternalGame.g:1430:1: ( ( rule__Chemin__OuvertAssignment_12 ) )
            // InternalGame.g:1431:2: ( rule__Chemin__OuvertAssignment_12 )
            {
             before(grammarAccess.getCheminAccess().getOuvertAssignment_12()); 
            // InternalGame.g:1432:2: ( rule__Chemin__OuvertAssignment_12 )
            // InternalGame.g:1432:3: rule__Chemin__OuvertAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__OuvertAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getOuvertAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__12__Impl"


    // $ANTLR start "rule__Chemin__Group__13"
    // InternalGame.g:1440:1: rule__Chemin__Group__13 : rule__Chemin__Group__13__Impl ;
    public final void rule__Chemin__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1444:1: ( rule__Chemin__Group__13__Impl )
            // InternalGame.g:1445:2: rule__Chemin__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group__13__Impl();

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
    // $ANTLR end "rule__Chemin__Group__13"


    // $ANTLR start "rule__Chemin__Group__13__Impl"
    // InternalGame.g:1451:1: rule__Chemin__Group__13__Impl : ( '}' ) ;
    public final void rule__Chemin__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1455:1: ( ( '}' ) )
            // InternalGame.g:1456:1: ( '}' )
            {
            // InternalGame.g:1456:1: ( '}' )
            // InternalGame.g:1457:2: '}'
            {
             before(grammarAccess.getCheminAccess().getRightCurlyBracketKeyword_13()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__13__Impl"


    // $ANTLR start "rule__Personne__Group__0"
    // InternalGame.g:1467:1: rule__Personne__Group__0 : rule__Personne__Group__0__Impl rule__Personne__Group__1 ;
    public final void rule__Personne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1471:1: ( rule__Personne__Group__0__Impl rule__Personne__Group__1 )
            // InternalGame.g:1472:2: rule__Personne__Group__0__Impl rule__Personne__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:1479:1: rule__Personne__Group__0__Impl : ( 'personne' ) ;
    public final void rule__Personne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1483:1: ( ( 'personne' ) )
            // InternalGame.g:1484:1: ( 'personne' )
            {
            // InternalGame.g:1484:1: ( 'personne' )
            // InternalGame.g:1485:2: 'personne'
            {
             before(grammarAccess.getPersonneAccess().getPersonneKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getPersonneKeyword_0()); 

            }


            }

        }
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
    // InternalGame.g:1494:1: rule__Personne__Group__1 : rule__Personne__Group__1__Impl rule__Personne__Group__2 ;
    public final void rule__Personne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1498:1: ( rule__Personne__Group__1__Impl rule__Personne__Group__2 )
            // InternalGame.g:1499:2: rule__Personne__Group__1__Impl rule__Personne__Group__2
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
    // InternalGame.g:1506:1: rule__Personne__Group__1__Impl : ( ( rule__Personne__NameAssignment_1 ) ) ;
    public final void rule__Personne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1510:1: ( ( ( rule__Personne__NameAssignment_1 ) ) )
            // InternalGame.g:1511:1: ( ( rule__Personne__NameAssignment_1 ) )
            {
            // InternalGame.g:1511:1: ( ( rule__Personne__NameAssignment_1 ) )
            // InternalGame.g:1512:2: ( rule__Personne__NameAssignment_1 )
            {
             before(grammarAccess.getPersonneAccess().getNameAssignment_1()); 
            // InternalGame.g:1513:2: ( rule__Personne__NameAssignment_1 )
            // InternalGame.g:1513:3: rule__Personne__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Personne__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalGame.g:1521:1: rule__Personne__Group__2 : rule__Personne__Group__2__Impl rule__Personne__Group__3 ;
    public final void rule__Personne__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1525:1: ( rule__Personne__Group__2__Impl rule__Personne__Group__3 )
            // InternalGame.g:1526:2: rule__Personne__Group__2__Impl rule__Personne__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalGame.g:1533:1: rule__Personne__Group__2__Impl : ( '{' ) ;
    public final void rule__Personne__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1537:1: ( ( '{' ) )
            // InternalGame.g:1538:1: ( '{' )
            {
            // InternalGame.g:1538:1: ( '{' )
            // InternalGame.g:1539:2: '{'
            {
             before(grammarAccess.getPersonneAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalGame.g:1548:1: rule__Personne__Group__3 : rule__Personne__Group__3__Impl rule__Personne__Group__4 ;
    public final void rule__Personne__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1552:1: ( rule__Personne__Group__3__Impl rule__Personne__Group__4 )
            // InternalGame.g:1553:2: rule__Personne__Group__3__Impl rule__Personne__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:1560:1: rule__Personne__Group__3__Impl : ( 'localisation' ) ;
    public final void rule__Personne__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1564:1: ( ( 'localisation' ) )
            // InternalGame.g:1565:1: ( 'localisation' )
            {
            // InternalGame.g:1565:1: ( 'localisation' )
            // InternalGame.g:1566:2: 'localisation'
            {
             before(grammarAccess.getPersonneAccess().getLocalisationKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getLocalisationKeyword_3()); 

            }


            }

        }
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
    // InternalGame.g:1575:1: rule__Personne__Group__4 : rule__Personne__Group__4__Impl rule__Personne__Group__5 ;
    public final void rule__Personne__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1579:1: ( rule__Personne__Group__4__Impl rule__Personne__Group__5 )
            // InternalGame.g:1580:2: rule__Personne__Group__4__Impl rule__Personne__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalGame.g:1587:1: rule__Personne__Group__4__Impl : ( ( rule__Personne__PlaceAssignment_4 ) ) ;
    public final void rule__Personne__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1591:1: ( ( ( rule__Personne__PlaceAssignment_4 ) ) )
            // InternalGame.g:1592:1: ( ( rule__Personne__PlaceAssignment_4 ) )
            {
            // InternalGame.g:1592:1: ( ( rule__Personne__PlaceAssignment_4 ) )
            // InternalGame.g:1593:2: ( rule__Personne__PlaceAssignment_4 )
            {
             before(grammarAccess.getPersonneAccess().getPlaceAssignment_4()); 
            // InternalGame.g:1594:2: ( rule__Personne__PlaceAssignment_4 )
            // InternalGame.g:1594:3: rule__Personne__PlaceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Personne__PlaceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getPlaceAssignment_4()); 

            }


            }

        }
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
    // InternalGame.g:1602:1: rule__Personne__Group__5 : rule__Personne__Group__5__Impl rule__Personne__Group__6 ;
    public final void rule__Personne__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1606:1: ( rule__Personne__Group__5__Impl rule__Personne__Group__6 )
            // InternalGame.g:1607:2: rule__Personne__Group__5__Impl rule__Personne__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:1614:1: rule__Personne__Group__5__Impl : ( 'visible' ) ;
    public final void rule__Personne__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1618:1: ( ( 'visible' ) )
            // InternalGame.g:1619:1: ( 'visible' )
            {
            // InternalGame.g:1619:1: ( 'visible' )
            // InternalGame.g:1620:2: 'visible'
            {
             before(grammarAccess.getPersonneAccess().getVisibleKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getVisibleKeyword_5()); 

            }


            }

        }
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
    // InternalGame.g:1629:1: rule__Personne__Group__6 : rule__Personne__Group__6__Impl rule__Personne__Group__7 ;
    public final void rule__Personne__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1633:1: ( rule__Personne__Group__6__Impl rule__Personne__Group__7 )
            // InternalGame.g:1634:2: rule__Personne__Group__6__Impl rule__Personne__Group__7
            {
            pushFollow(FOLLOW_21);
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
    // InternalGame.g:1641:1: rule__Personne__Group__6__Impl : ( ( rule__Personne__VisibleAssignment_6 ) ) ;
    public final void rule__Personne__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1645:1: ( ( ( rule__Personne__VisibleAssignment_6 ) ) )
            // InternalGame.g:1646:1: ( ( rule__Personne__VisibleAssignment_6 ) )
            {
            // InternalGame.g:1646:1: ( ( rule__Personne__VisibleAssignment_6 ) )
            // InternalGame.g:1647:2: ( rule__Personne__VisibleAssignment_6 )
            {
             before(grammarAccess.getPersonneAccess().getVisibleAssignment_6()); 
            // InternalGame.g:1648:2: ( rule__Personne__VisibleAssignment_6 )
            // InternalGame.g:1648:3: rule__Personne__VisibleAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Personne__VisibleAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getVisibleAssignment_6()); 

            }


            }

        }
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
    // InternalGame.g:1656:1: rule__Personne__Group__7 : rule__Personne__Group__7__Impl rule__Personne__Group__8 ;
    public final void rule__Personne__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1660:1: ( rule__Personne__Group__7__Impl rule__Personne__Group__8 )
            // InternalGame.g:1661:2: rule__Personne__Group__7__Impl rule__Personne__Group__8
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:1668:1: rule__Personne__Group__7__Impl : ( 'actif' ) ;
    public final void rule__Personne__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1672:1: ( ( 'actif' ) )
            // InternalGame.g:1673:1: ( 'actif' )
            {
            // InternalGame.g:1673:1: ( 'actif' )
            // InternalGame.g:1674:2: 'actif'
            {
             before(grammarAccess.getPersonneAccess().getActifKeyword_7()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getActifKeyword_7()); 

            }


            }

        }
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
    // InternalGame.g:1683:1: rule__Personne__Group__8 : rule__Personne__Group__8__Impl rule__Personne__Group__9 ;
    public final void rule__Personne__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1687:1: ( rule__Personne__Group__8__Impl rule__Personne__Group__9 )
            // InternalGame.g:1688:2: rule__Personne__Group__8__Impl rule__Personne__Group__9
            {
            pushFollow(FOLLOW_17);
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
    // InternalGame.g:1695:1: rule__Personne__Group__8__Impl : ( ( rule__Personne__ActifAssignment_8 ) ) ;
    public final void rule__Personne__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1699:1: ( ( ( rule__Personne__ActifAssignment_8 ) ) )
            // InternalGame.g:1700:1: ( ( rule__Personne__ActifAssignment_8 ) )
            {
            // InternalGame.g:1700:1: ( ( rule__Personne__ActifAssignment_8 ) )
            // InternalGame.g:1701:2: ( rule__Personne__ActifAssignment_8 )
            {
             before(grammarAccess.getPersonneAccess().getActifAssignment_8()); 
            // InternalGame.g:1702:2: ( rule__Personne__ActifAssignment_8 )
            // InternalGame.g:1702:3: rule__Personne__ActifAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Personne__ActifAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getActifAssignment_8()); 

            }


            }

        }
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
    // InternalGame.g:1710:1: rule__Personne__Group__9 : rule__Personne__Group__9__Impl rule__Personne__Group__10 ;
    public final void rule__Personne__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1714:1: ( rule__Personne__Group__9__Impl rule__Personne__Group__10 )
            // InternalGame.g:1715:2: rule__Personne__Group__9__Impl rule__Personne__Group__10
            {
            pushFollow(FOLLOW_18);
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
    // InternalGame.g:1722:1: rule__Personne__Group__9__Impl : ( 'obligatoire' ) ;
    public final void rule__Personne__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1726:1: ( ( 'obligatoire' ) )
            // InternalGame.g:1727:1: ( 'obligatoire' )
            {
            // InternalGame.g:1727:1: ( 'obligatoire' )
            // InternalGame.g:1728:2: 'obligatoire'
            {
             before(grammarAccess.getPersonneAccess().getObligatoireKeyword_9()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getObligatoireKeyword_9()); 

            }


            }

        }
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
    // InternalGame.g:1737:1: rule__Personne__Group__10 : rule__Personne__Group__10__Impl rule__Personne__Group__11 ;
    public final void rule__Personne__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1741:1: ( rule__Personne__Group__10__Impl rule__Personne__Group__11 )
            // InternalGame.g:1742:2: rule__Personne__Group__10__Impl rule__Personne__Group__11
            {
            pushFollow(FOLLOW_22);
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
    // InternalGame.g:1749:1: rule__Personne__Group__10__Impl : ( ( rule__Personne__ObligatoireAssignment_10 ) ) ;
    public final void rule__Personne__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1753:1: ( ( ( rule__Personne__ObligatoireAssignment_10 ) ) )
            // InternalGame.g:1754:1: ( ( rule__Personne__ObligatoireAssignment_10 ) )
            {
            // InternalGame.g:1754:1: ( ( rule__Personne__ObligatoireAssignment_10 ) )
            // InternalGame.g:1755:2: ( rule__Personne__ObligatoireAssignment_10 )
            {
             before(grammarAccess.getPersonneAccess().getObligatoireAssignment_10()); 
            // InternalGame.g:1756:2: ( rule__Personne__ObligatoireAssignment_10 )
            // InternalGame.g:1756:3: rule__Personne__ObligatoireAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Personne__ObligatoireAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getObligatoireAssignment_10()); 

            }


            }

        }
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
    // InternalGame.g:1764:1: rule__Personne__Group__11 : rule__Personne__Group__11__Impl rule__Personne__Group__12 ;
    public final void rule__Personne__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1768:1: ( rule__Personne__Group__11__Impl rule__Personne__Group__12 )
            // InternalGame.g:1769:2: rule__Personne__Group__11__Impl rule__Personne__Group__12
            {
            pushFollow(FOLLOW_23);
            rule__Personne__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__12();

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
    // InternalGame.g:1776:1: rule__Personne__Group__11__Impl : ( 'interactions' ) ;
    public final void rule__Personne__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1780:1: ( ( 'interactions' ) )
            // InternalGame.g:1781:1: ( 'interactions' )
            {
            // InternalGame.g:1781:1: ( 'interactions' )
            // InternalGame.g:1782:2: 'interactions'
            {
             before(grammarAccess.getPersonneAccess().getInteractionsKeyword_11()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getInteractionsKeyword_11()); 

            }


            }

        }
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


    // $ANTLR start "rule__Personne__Group__12"
    // InternalGame.g:1791:1: rule__Personne__Group__12 : rule__Personne__Group__12__Impl rule__Personne__Group__13 ;
    public final void rule__Personne__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1795:1: ( rule__Personne__Group__12__Impl rule__Personne__Group__13 )
            // InternalGame.g:1796:2: rule__Personne__Group__12__Impl rule__Personne__Group__13
            {
            pushFollow(FOLLOW_23);
            rule__Personne__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__13();

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
    // $ANTLR end "rule__Personne__Group__12"


    // $ANTLR start "rule__Personne__Group__12__Impl"
    // InternalGame.g:1803:1: rule__Personne__Group__12__Impl : ( ( rule__Personne__InteractionsAssignment_12 )* ) ;
    public final void rule__Personne__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1807:1: ( ( ( rule__Personne__InteractionsAssignment_12 )* ) )
            // InternalGame.g:1808:1: ( ( rule__Personne__InteractionsAssignment_12 )* )
            {
            // InternalGame.g:1808:1: ( ( rule__Personne__InteractionsAssignment_12 )* )
            // InternalGame.g:1809:2: ( rule__Personne__InteractionsAssignment_12 )*
            {
             before(grammarAccess.getPersonneAccess().getInteractionsAssignment_12()); 
            // InternalGame.g:1810:2: ( rule__Personne__InteractionsAssignment_12 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGame.g:1810:3: rule__Personne__InteractionsAssignment_12
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Personne__InteractionsAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getPersonneAccess().getInteractionsAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__12__Impl"


    // $ANTLR start "rule__Personne__Group__13"
    // InternalGame.g:1818:1: rule__Personne__Group__13 : rule__Personne__Group__13__Impl ;
    public final void rule__Personne__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1822:1: ( rule__Personne__Group__13__Impl )
            // InternalGame.g:1823:2: rule__Personne__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Personne__Group__13__Impl();

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
    // $ANTLR end "rule__Personne__Group__13"


    // $ANTLR start "rule__Personne__Group__13__Impl"
    // InternalGame.g:1829:1: rule__Personne__Group__13__Impl : ( '}' ) ;
    public final void rule__Personne__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1833:1: ( ( '}' ) )
            // InternalGame.g:1834:1: ( '}' )
            {
            // InternalGame.g:1834:1: ( '}' )
            // InternalGame.g:1835:2: '}'
            {
             before(grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_13()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__13__Impl"


    // $ANTLR start "rule__Explorateur__Group__0"
    // InternalGame.g:1845:1: rule__Explorateur__Group__0 : rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1 ;
    public final void rule__Explorateur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1849:1: ( rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1 )
            // InternalGame.g:1850:2: rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalGame.g:1857:1: rule__Explorateur__Group__0__Impl : ( 'explorateur' ) ;
    public final void rule__Explorateur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1861:1: ( ( 'explorateur' ) )
            // InternalGame.g:1862:1: ( 'explorateur' )
            {
            // InternalGame.g:1862:1: ( 'explorateur' )
            // InternalGame.g:1863:2: 'explorateur'
            {
             before(grammarAccess.getExplorateurAccess().getExplorateurKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getExplorateurKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__0__Impl"


    // $ANTLR start "rule__Explorateur__Group__1"
    // InternalGame.g:1872:1: rule__Explorateur__Group__1 : rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2 ;
    public final void rule__Explorateur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1876:1: ( rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2 )
            // InternalGame.g:1877:2: rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalGame.g:1884:1: rule__Explorateur__Group__1__Impl : ( '{' ) ;
    public final void rule__Explorateur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1888:1: ( ( '{' ) )
            // InternalGame.g:1889:1: ( '{' )
            {
            // InternalGame.g:1889:1: ( '{' )
            // InternalGame.g:1890:2: '{'
            {
             before(grammarAccess.getExplorateurAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalGame.g:1899:1: rule__Explorateur__Group__2 : rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3 ;
    public final void rule__Explorateur__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1903:1: ( rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3 )
            // InternalGame.g:1904:2: rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:1911:1: rule__Explorateur__Group__2__Impl : ( 'localisation' ) ;
    public final void rule__Explorateur__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1915:1: ( ( 'localisation' ) )
            // InternalGame.g:1916:1: ( 'localisation' )
            {
            // InternalGame.g:1916:1: ( 'localisation' )
            // InternalGame.g:1917:2: 'localisation'
            {
             before(grammarAccess.getExplorateurAccess().getLocalisationKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getLocalisationKeyword_2()); 

            }


            }

        }
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
    // InternalGame.g:1926:1: rule__Explorateur__Group__3 : rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4 ;
    public final void rule__Explorateur__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1930:1: ( rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4 )
            // InternalGame.g:1931:2: rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalGame.g:1938:1: rule__Explorateur__Group__3__Impl : ( ( rule__Explorateur__PlaceAssignment_3 ) ) ;
    public final void rule__Explorateur__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1942:1: ( ( ( rule__Explorateur__PlaceAssignment_3 ) ) )
            // InternalGame.g:1943:1: ( ( rule__Explorateur__PlaceAssignment_3 ) )
            {
            // InternalGame.g:1943:1: ( ( rule__Explorateur__PlaceAssignment_3 ) )
            // InternalGame.g:1944:2: ( rule__Explorateur__PlaceAssignment_3 )
            {
             before(grammarAccess.getExplorateurAccess().getPlaceAssignment_3()); 
            // InternalGame.g:1945:2: ( rule__Explorateur__PlaceAssignment_3 )
            // InternalGame.g:1945:3: rule__Explorateur__PlaceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Explorateur__PlaceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExplorateurAccess().getPlaceAssignment_3()); 

            }


            }

        }
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
    // InternalGame.g:1953:1: rule__Explorateur__Group__4 : rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5 ;
    public final void rule__Explorateur__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1957:1: ( rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5 )
            // InternalGame.g:1958:2: rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalGame.g:1965:1: rule__Explorateur__Group__4__Impl : ( 'taille' ) ;
    public final void rule__Explorateur__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1969:1: ( ( 'taille' ) )
            // InternalGame.g:1970:1: ( 'taille' )
            {
            // InternalGame.g:1970:1: ( 'taille' )
            // InternalGame.g:1971:2: 'taille'
            {
             before(grammarAccess.getExplorateurAccess().getTailleKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getTailleKeyword_4()); 

            }


            }

        }
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
    // InternalGame.g:1980:1: rule__Explorateur__Group__5 : rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6 ;
    public final void rule__Explorateur__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1984:1: ( rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6 )
            // InternalGame.g:1985:2: rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6
            {
            pushFollow(FOLLOW_27);
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
    // InternalGame.g:1992:1: rule__Explorateur__Group__5__Impl : ( 'disponible' ) ;
    public final void rule__Explorateur__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1996:1: ( ( 'disponible' ) )
            // InternalGame.g:1997:1: ( 'disponible' )
            {
            // InternalGame.g:1997:1: ( 'disponible' )
            // InternalGame.g:1998:2: 'disponible'
            {
             before(grammarAccess.getExplorateurAccess().getDisponibleKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getDisponibleKeyword_5()); 

            }


            }

        }
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
    // InternalGame.g:2007:1: rule__Explorateur__Group__6 : rule__Explorateur__Group__6__Impl rule__Explorateur__Group__7 ;
    public final void rule__Explorateur__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2011:1: ( rule__Explorateur__Group__6__Impl rule__Explorateur__Group__7 )
            // InternalGame.g:2012:2: rule__Explorateur__Group__6__Impl rule__Explorateur__Group__7
            {
            pushFollow(FOLLOW_28);
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
    // InternalGame.g:2019:1: rule__Explorateur__Group__6__Impl : ( ( rule__Explorateur__TailleDispoAssignment_6 ) ) ;
    public final void rule__Explorateur__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2023:1: ( ( ( rule__Explorateur__TailleDispoAssignment_6 ) ) )
            // InternalGame.g:2024:1: ( ( rule__Explorateur__TailleDispoAssignment_6 ) )
            {
            // InternalGame.g:2024:1: ( ( rule__Explorateur__TailleDispoAssignment_6 ) )
            // InternalGame.g:2025:2: ( rule__Explorateur__TailleDispoAssignment_6 )
            {
             before(grammarAccess.getExplorateurAccess().getTailleDispoAssignment_6()); 
            // InternalGame.g:2026:2: ( rule__Explorateur__TailleDispoAssignment_6 )
            // InternalGame.g:2026:3: rule__Explorateur__TailleDispoAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Explorateur__TailleDispoAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getExplorateurAccess().getTailleDispoAssignment_6()); 

            }


            }

        }
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
    // InternalGame.g:2034:1: rule__Explorateur__Group__7 : rule__Explorateur__Group__7__Impl rule__Explorateur__Group__8 ;
    public final void rule__Explorateur__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2038:1: ( rule__Explorateur__Group__7__Impl rule__Explorateur__Group__8 )
            // InternalGame.g:2039:2: rule__Explorateur__Group__7__Impl rule__Explorateur__Group__8
            {
            pushFollow(FOLLOW_28);
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
    // InternalGame.g:2046:1: rule__Explorateur__Group__7__Impl : ( ( rule__Explorateur__Group_7__0 )? ) ;
    public final void rule__Explorateur__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2050:1: ( ( ( rule__Explorateur__Group_7__0 )? ) )
            // InternalGame.g:2051:1: ( ( rule__Explorateur__Group_7__0 )? )
            {
            // InternalGame.g:2051:1: ( ( rule__Explorateur__Group_7__0 )? )
            // InternalGame.g:2052:2: ( rule__Explorateur__Group_7__0 )?
            {
             before(grammarAccess.getExplorateurAccess().getGroup_7()); 
            // InternalGame.g:2053:2: ( rule__Explorateur__Group_7__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGame.g:2053:3: rule__Explorateur__Group_7__0
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
    // InternalGame.g:2061:1: rule__Explorateur__Group__8 : rule__Explorateur__Group__8__Impl rule__Explorateur__Group__9 ;
    public final void rule__Explorateur__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2065:1: ( rule__Explorateur__Group__8__Impl rule__Explorateur__Group__9 )
            // InternalGame.g:2066:2: rule__Explorateur__Group__8__Impl rule__Explorateur__Group__9
            {
            pushFollow(FOLLOW_28);
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
    // InternalGame.g:2073:1: rule__Explorateur__Group__8__Impl : ( ( rule__Explorateur__Group_8__0 )? ) ;
    public final void rule__Explorateur__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2077:1: ( ( ( rule__Explorateur__Group_8__0 )? ) )
            // InternalGame.g:2078:1: ( ( rule__Explorateur__Group_8__0 )? )
            {
            // InternalGame.g:2078:1: ( ( rule__Explorateur__Group_8__0 )? )
            // InternalGame.g:2079:2: ( rule__Explorateur__Group_8__0 )?
            {
             before(grammarAccess.getExplorateurAccess().getGroup_8()); 
            // InternalGame.g:2080:2: ( rule__Explorateur__Group_8__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==36) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGame.g:2080:3: rule__Explorateur__Group_8__0
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
    // InternalGame.g:2088:1: rule__Explorateur__Group__9 : rule__Explorateur__Group__9__Impl ;
    public final void rule__Explorateur__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2092:1: ( rule__Explorateur__Group__9__Impl )
            // InternalGame.g:2093:2: rule__Explorateur__Group__9__Impl
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
    // InternalGame.g:2099:1: rule__Explorateur__Group__9__Impl : ( '}' ) ;
    public final void rule__Explorateur__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2103:1: ( ( '}' ) )
            // InternalGame.g:2104:1: ( '}' )
            {
            // InternalGame.g:2104:1: ( '}' )
            // InternalGame.g:2105:2: '}'
            {
             before(grammarAccess.getExplorateurAccess().getRightCurlyBracketKeyword_9()); 
            match(input,17,FOLLOW_2); 
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
    // InternalGame.g:2115:1: rule__Explorateur__Group_7__0 : rule__Explorateur__Group_7__0__Impl rule__Explorateur__Group_7__1 ;
    public final void rule__Explorateur__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2119:1: ( rule__Explorateur__Group_7__0__Impl rule__Explorateur__Group_7__1 )
            // InternalGame.g:2120:2: rule__Explorateur__Group_7__0__Impl rule__Explorateur__Group_7__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalGame.g:2127:1: rule__Explorateur__Group_7__0__Impl : ( 'objets' ) ;
    public final void rule__Explorateur__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2131:1: ( ( 'objets' ) )
            // InternalGame.g:2132:1: ( 'objets' )
            {
            // InternalGame.g:2132:1: ( 'objets' )
            // InternalGame.g:2133:2: 'objets'
            {
             before(grammarAccess.getExplorateurAccess().getObjetsKeyword_7_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalGame.g:2142:1: rule__Explorateur__Group_7__1 : rule__Explorateur__Group_7__1__Impl rule__Explorateur__Group_7__2 ;
    public final void rule__Explorateur__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2146:1: ( rule__Explorateur__Group_7__1__Impl rule__Explorateur__Group_7__2 )
            // InternalGame.g:2147:2: rule__Explorateur__Group_7__1__Impl rule__Explorateur__Group_7__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalGame.g:2154:1: rule__Explorateur__Group_7__1__Impl : ( 'possedes' ) ;
    public final void rule__Explorateur__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2158:1: ( ( 'possedes' ) )
            // InternalGame.g:2159:1: ( 'possedes' )
            {
            // InternalGame.g:2159:1: ( 'possedes' )
            // InternalGame.g:2160:2: 'possedes'
            {
             before(grammarAccess.getExplorateurAccess().getPossedesKeyword_7_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getPossedesKeyword_7_1()); 

            }


            }

        }
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
    // InternalGame.g:2169:1: rule__Explorateur__Group_7__2 : rule__Explorateur__Group_7__2__Impl ;
    public final void rule__Explorateur__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2173:1: ( rule__Explorateur__Group_7__2__Impl )
            // InternalGame.g:2174:2: rule__Explorateur__Group_7__2__Impl
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
    // InternalGame.g:2180:1: rule__Explorateur__Group_7__2__Impl : ( ( rule__Explorateur__ObjetsAssignment_7_2 )* ) ;
    public final void rule__Explorateur__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2184:1: ( ( ( rule__Explorateur__ObjetsAssignment_7_2 )* ) )
            // InternalGame.g:2185:1: ( ( rule__Explorateur__ObjetsAssignment_7_2 )* )
            {
            // InternalGame.g:2185:1: ( ( rule__Explorateur__ObjetsAssignment_7_2 )* )
            // InternalGame.g:2186:2: ( rule__Explorateur__ObjetsAssignment_7_2 )*
            {
             before(grammarAccess.getExplorateurAccess().getObjetsAssignment_7_2()); 
            // InternalGame.g:2187:2: ( rule__Explorateur__ObjetsAssignment_7_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==38) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGame.g:2187:3: rule__Explorateur__ObjetsAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Explorateur__ObjetsAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getExplorateurAccess().getObjetsAssignment_7_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Explorateur__Group_8__0"
    // InternalGame.g:2196:1: rule__Explorateur__Group_8__0 : rule__Explorateur__Group_8__0__Impl rule__Explorateur__Group_8__1 ;
    public final void rule__Explorateur__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2200:1: ( rule__Explorateur__Group_8__0__Impl rule__Explorateur__Group_8__1 )
            // InternalGame.g:2201:2: rule__Explorateur__Group_8__0__Impl rule__Explorateur__Group_8__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalGame.g:2208:1: rule__Explorateur__Group_8__0__Impl : ( 'connaissances' ) ;
    public final void rule__Explorateur__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2212:1: ( ( 'connaissances' ) )
            // InternalGame.g:2213:1: ( 'connaissances' )
            {
            // InternalGame.g:2213:1: ( 'connaissances' )
            // InternalGame.g:2214:2: 'connaissances'
            {
             before(grammarAccess.getExplorateurAccess().getConnaissancesKeyword_8_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalGame.g:2223:1: rule__Explorateur__Group_8__1 : rule__Explorateur__Group_8__1__Impl rule__Explorateur__Group_8__2 ;
    public final void rule__Explorateur__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2227:1: ( rule__Explorateur__Group_8__1__Impl rule__Explorateur__Group_8__2 )
            // InternalGame.g:2228:2: rule__Explorateur__Group_8__1__Impl rule__Explorateur__Group_8__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalGame.g:2235:1: rule__Explorateur__Group_8__1__Impl : ( 'possedes' ) ;
    public final void rule__Explorateur__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2239:1: ( ( 'possedes' ) )
            // InternalGame.g:2240:1: ( 'possedes' )
            {
            // InternalGame.g:2240:1: ( 'possedes' )
            // InternalGame.g:2241:2: 'possedes'
            {
             before(grammarAccess.getExplorateurAccess().getPossedesKeyword_8_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getPossedesKeyword_8_1()); 

            }


            }

        }
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
    // InternalGame.g:2250:1: rule__Explorateur__Group_8__2 : rule__Explorateur__Group_8__2__Impl ;
    public final void rule__Explorateur__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2254:1: ( rule__Explorateur__Group_8__2__Impl )
            // InternalGame.g:2255:2: rule__Explorateur__Group_8__2__Impl
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
    // InternalGame.g:2261:1: rule__Explorateur__Group_8__2__Impl : ( ( rule__Explorateur__ConnaissancesAssignment_8_2 )* ) ;
    public final void rule__Explorateur__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2265:1: ( ( ( rule__Explorateur__ConnaissancesAssignment_8_2 )* ) )
            // InternalGame.g:2266:1: ( ( rule__Explorateur__ConnaissancesAssignment_8_2 )* )
            {
            // InternalGame.g:2266:1: ( ( rule__Explorateur__ConnaissancesAssignment_8_2 )* )
            // InternalGame.g:2267:2: ( rule__Explorateur__ConnaissancesAssignment_8_2 )*
            {
             before(grammarAccess.getExplorateurAccess().getConnaissancesAssignment_8_2()); 
            // InternalGame.g:2268:2: ( rule__Explorateur__ConnaissancesAssignment_8_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==37) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGame.g:2268:3: rule__Explorateur__ConnaissancesAssignment_8_2
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Explorateur__ConnaissancesAssignment_8_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getExplorateurAccess().getConnaissancesAssignment_8_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Connaissance__Group__0"
    // InternalGame.g:2277:1: rule__Connaissance__Group__0 : rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1 ;
    public final void rule__Connaissance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2281:1: ( rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1 )
            // InternalGame.g:2282:2: rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:2289:1: rule__Connaissance__Group__0__Impl : ( 'connaissance' ) ;
    public final void rule__Connaissance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2293:1: ( ( 'connaissance' ) )
            // InternalGame.g:2294:1: ( 'connaissance' )
            {
            // InternalGame.g:2294:1: ( 'connaissance' )
            // InternalGame.g:2295:2: 'connaissance'
            {
             before(grammarAccess.getConnaissanceAccess().getConnaissanceKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getConnaissanceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__0__Impl"


    // $ANTLR start "rule__Connaissance__Group__1"
    // InternalGame.g:2304:1: rule__Connaissance__Group__1 : rule__Connaissance__Group__1__Impl rule__Connaissance__Group__2 ;
    public final void rule__Connaissance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2308:1: ( rule__Connaissance__Group__1__Impl rule__Connaissance__Group__2 )
            // InternalGame.g:2309:2: rule__Connaissance__Group__1__Impl rule__Connaissance__Group__2
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
    // InternalGame.g:2316:1: rule__Connaissance__Group__1__Impl : ( ( rule__Connaissance__NameAssignment_1 ) ) ;
    public final void rule__Connaissance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2320:1: ( ( ( rule__Connaissance__NameAssignment_1 ) ) )
            // InternalGame.g:2321:1: ( ( rule__Connaissance__NameAssignment_1 ) )
            {
            // InternalGame.g:2321:1: ( ( rule__Connaissance__NameAssignment_1 ) )
            // InternalGame.g:2322:2: ( rule__Connaissance__NameAssignment_1 )
            {
             before(grammarAccess.getConnaissanceAccess().getNameAssignment_1()); 
            // InternalGame.g:2323:2: ( rule__Connaissance__NameAssignment_1 )
            // InternalGame.g:2323:3: rule__Connaissance__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConnaissanceAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalGame.g:2331:1: rule__Connaissance__Group__2 : rule__Connaissance__Group__2__Impl rule__Connaissance__Group__3 ;
    public final void rule__Connaissance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2335:1: ( rule__Connaissance__Group__2__Impl rule__Connaissance__Group__3 )
            // InternalGame.g:2336:2: rule__Connaissance__Group__2__Impl rule__Connaissance__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalGame.g:2343:1: rule__Connaissance__Group__2__Impl : ( '{' ) ;
    public final void rule__Connaissance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2347:1: ( ( '{' ) )
            // InternalGame.g:2348:1: ( '{' )
            {
            // InternalGame.g:2348:1: ( '{' )
            // InternalGame.g:2349:2: '{'
            {
             before(grammarAccess.getConnaissanceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalGame.g:2358:1: rule__Connaissance__Group__3 : rule__Connaissance__Group__3__Impl rule__Connaissance__Group__4 ;
    public final void rule__Connaissance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2362:1: ( rule__Connaissance__Group__3__Impl rule__Connaissance__Group__4 )
            // InternalGame.g:2363:2: rule__Connaissance__Group__3__Impl rule__Connaissance__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:2370:1: rule__Connaissance__Group__3__Impl : ( 'visible' ) ;
    public final void rule__Connaissance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2374:1: ( ( 'visible' ) )
            // InternalGame.g:2375:1: ( 'visible' )
            {
            // InternalGame.g:2375:1: ( 'visible' )
            // InternalGame.g:2376:2: 'visible'
            {
             before(grammarAccess.getConnaissanceAccess().getVisibleKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getVisibleKeyword_3()); 

            }


            }

        }
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
    // InternalGame.g:2385:1: rule__Connaissance__Group__4 : rule__Connaissance__Group__4__Impl rule__Connaissance__Group__5 ;
    public final void rule__Connaissance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2389:1: ( rule__Connaissance__Group__4__Impl rule__Connaissance__Group__5 )
            // InternalGame.g:2390:2: rule__Connaissance__Group__4__Impl rule__Connaissance__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalGame.g:2397:1: rule__Connaissance__Group__4__Impl : ( ( rule__Connaissance__VisibleAssignment_4 ) ) ;
    public final void rule__Connaissance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2401:1: ( ( ( rule__Connaissance__VisibleAssignment_4 ) ) )
            // InternalGame.g:2402:1: ( ( rule__Connaissance__VisibleAssignment_4 ) )
            {
            // InternalGame.g:2402:1: ( ( rule__Connaissance__VisibleAssignment_4 ) )
            // InternalGame.g:2403:2: ( rule__Connaissance__VisibleAssignment_4 )
            {
             before(grammarAccess.getConnaissanceAccess().getVisibleAssignment_4()); 
            // InternalGame.g:2404:2: ( rule__Connaissance__VisibleAssignment_4 )
            // InternalGame.g:2404:3: rule__Connaissance__VisibleAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__VisibleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConnaissanceAccess().getVisibleAssignment_4()); 

            }


            }

        }
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
    // InternalGame.g:2412:1: rule__Connaissance__Group__5 : rule__Connaissance__Group__5__Impl rule__Connaissance__Group__6 ;
    public final void rule__Connaissance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2416:1: ( rule__Connaissance__Group__5__Impl rule__Connaissance__Group__6 )
            // InternalGame.g:2417:2: rule__Connaissance__Group__5__Impl rule__Connaissance__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:2424:1: rule__Connaissance__Group__5__Impl : ( 'actif' ) ;
    public final void rule__Connaissance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2428:1: ( ( 'actif' ) )
            // InternalGame.g:2429:1: ( 'actif' )
            {
            // InternalGame.g:2429:1: ( 'actif' )
            // InternalGame.g:2430:2: 'actif'
            {
             before(grammarAccess.getConnaissanceAccess().getActifKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getActifKeyword_5()); 

            }


            }

        }
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
    // InternalGame.g:2439:1: rule__Connaissance__Group__6 : rule__Connaissance__Group__6__Impl rule__Connaissance__Group__7 ;
    public final void rule__Connaissance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2443:1: ( rule__Connaissance__Group__6__Impl rule__Connaissance__Group__7 )
            // InternalGame.g:2444:2: rule__Connaissance__Group__6__Impl rule__Connaissance__Group__7
            {
            pushFollow(FOLLOW_10);
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
    // InternalGame.g:2451:1: rule__Connaissance__Group__6__Impl : ( ( rule__Connaissance__ActifAssignment_6 ) ) ;
    public final void rule__Connaissance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2455:1: ( ( ( rule__Connaissance__ActifAssignment_6 ) ) )
            // InternalGame.g:2456:1: ( ( rule__Connaissance__ActifAssignment_6 ) )
            {
            // InternalGame.g:2456:1: ( ( rule__Connaissance__ActifAssignment_6 ) )
            // InternalGame.g:2457:2: ( rule__Connaissance__ActifAssignment_6 )
            {
             before(grammarAccess.getConnaissanceAccess().getActifAssignment_6()); 
            // InternalGame.g:2458:2: ( rule__Connaissance__ActifAssignment_6 )
            // InternalGame.g:2458:3: rule__Connaissance__ActifAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__ActifAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getConnaissanceAccess().getActifAssignment_6()); 

            }


            }

        }
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
    // InternalGame.g:2466:1: rule__Connaissance__Group__7 : rule__Connaissance__Group__7__Impl ;
    public final void rule__Connaissance__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2470:1: ( rule__Connaissance__Group__7__Impl )
            // InternalGame.g:2471:2: rule__Connaissance__Group__7__Impl
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
    // InternalGame.g:2477:1: rule__Connaissance__Group__7__Impl : ( '}' ) ;
    public final void rule__Connaissance__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2481:1: ( ( '}' ) )
            // InternalGame.g:2482:1: ( '}' )
            {
            // InternalGame.g:2482:1: ( '}' )
            // InternalGame.g:2483:2: '}'
            {
             before(grammarAccess.getConnaissanceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,17,FOLLOW_2); 
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


    // $ANTLR start "rule__Objet__Group__0"
    // InternalGame.g:2493:1: rule__Objet__Group__0 : rule__Objet__Group__0__Impl rule__Objet__Group__1 ;
    public final void rule__Objet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2497:1: ( rule__Objet__Group__0__Impl rule__Objet__Group__1 )
            // InternalGame.g:2498:2: rule__Objet__Group__0__Impl rule__Objet__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:2505:1: rule__Objet__Group__0__Impl : ( 'objet' ) ;
    public final void rule__Objet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2509:1: ( ( 'objet' ) )
            // InternalGame.g:2510:1: ( 'objet' )
            {
            // InternalGame.g:2510:1: ( 'objet' )
            // InternalGame.g:2511:2: 'objet'
            {
             before(grammarAccess.getObjetAccess().getObjetKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getObjetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__0__Impl"


    // $ANTLR start "rule__Objet__Group__1"
    // InternalGame.g:2520:1: rule__Objet__Group__1 : rule__Objet__Group__1__Impl rule__Objet__Group__2 ;
    public final void rule__Objet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2524:1: ( rule__Objet__Group__1__Impl rule__Objet__Group__2 )
            // InternalGame.g:2525:2: rule__Objet__Group__1__Impl rule__Objet__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalGame.g:2532:1: rule__Objet__Group__1__Impl : ( ( rule__Objet__NameAssignment_1 ) ) ;
    public final void rule__Objet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2536:1: ( ( ( rule__Objet__NameAssignment_1 ) ) )
            // InternalGame.g:2537:1: ( ( rule__Objet__NameAssignment_1 ) )
            {
            // InternalGame.g:2537:1: ( ( rule__Objet__NameAssignment_1 ) )
            // InternalGame.g:2538:2: ( rule__Objet__NameAssignment_1 )
            {
             before(grammarAccess.getObjetAccess().getNameAssignment_1()); 
            // InternalGame.g:2539:2: ( rule__Objet__NameAssignment_1 )
            // InternalGame.g:2539:3: rule__Objet__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Objet__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalGame.g:2547:1: rule__Objet__Group__2 : rule__Objet__Group__2__Impl rule__Objet__Group__3 ;
    public final void rule__Objet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2551:1: ( rule__Objet__Group__2__Impl rule__Objet__Group__3 )
            // InternalGame.g:2552:2: rule__Objet__Group__2__Impl rule__Objet__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalGame.g:2559:1: rule__Objet__Group__2__Impl : ( '{' ) ;
    public final void rule__Objet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2563:1: ( ( '{' ) )
            // InternalGame.g:2564:1: ( '{' )
            {
            // InternalGame.g:2564:1: ( '{' )
            // InternalGame.g:2565:2: '{'
            {
             before(grammarAccess.getObjetAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalGame.g:2574:1: rule__Objet__Group__3 : rule__Objet__Group__3__Impl rule__Objet__Group__4 ;
    public final void rule__Objet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2578:1: ( rule__Objet__Group__3__Impl rule__Objet__Group__4 )
            // InternalGame.g:2579:2: rule__Objet__Group__3__Impl rule__Objet__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:2586:1: rule__Objet__Group__3__Impl : ( 'visible' ) ;
    public final void rule__Objet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2590:1: ( ( 'visible' ) )
            // InternalGame.g:2591:1: ( 'visible' )
            {
            // InternalGame.g:2591:1: ( 'visible' )
            // InternalGame.g:2592:2: 'visible'
            {
             before(grammarAccess.getObjetAccess().getVisibleKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getVisibleKeyword_3()); 

            }


            }

        }
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
    // InternalGame.g:2601:1: rule__Objet__Group__4 : rule__Objet__Group__4__Impl rule__Objet__Group__5 ;
    public final void rule__Objet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2605:1: ( rule__Objet__Group__4__Impl rule__Objet__Group__5 )
            // InternalGame.g:2606:2: rule__Objet__Group__4__Impl rule__Objet__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalGame.g:2613:1: rule__Objet__Group__4__Impl : ( ( rule__Objet__VisibleAssignment_4 ) ) ;
    public final void rule__Objet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2617:1: ( ( ( rule__Objet__VisibleAssignment_4 ) ) )
            // InternalGame.g:2618:1: ( ( rule__Objet__VisibleAssignment_4 ) )
            {
            // InternalGame.g:2618:1: ( ( rule__Objet__VisibleAssignment_4 ) )
            // InternalGame.g:2619:2: ( rule__Objet__VisibleAssignment_4 )
            {
             before(grammarAccess.getObjetAccess().getVisibleAssignment_4()); 
            // InternalGame.g:2620:2: ( rule__Objet__VisibleAssignment_4 )
            // InternalGame.g:2620:3: rule__Objet__VisibleAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Objet__VisibleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getVisibleAssignment_4()); 

            }


            }

        }
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
    // InternalGame.g:2628:1: rule__Objet__Group__5 : rule__Objet__Group__5__Impl rule__Objet__Group__6 ;
    public final void rule__Objet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2632:1: ( rule__Objet__Group__5__Impl rule__Objet__Group__6 )
            // InternalGame.g:2633:2: rule__Objet__Group__5__Impl rule__Objet__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:2640:1: rule__Objet__Group__5__Impl : ( 'actif' ) ;
    public final void rule__Objet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2644:1: ( ( 'actif' ) )
            // InternalGame.g:2645:1: ( 'actif' )
            {
            // InternalGame.g:2645:1: ( 'actif' )
            // InternalGame.g:2646:2: 'actif'
            {
             before(grammarAccess.getObjetAccess().getActifKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getActifKeyword_5()); 

            }


            }

        }
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
    // InternalGame.g:2655:1: rule__Objet__Group__6 : rule__Objet__Group__6__Impl rule__Objet__Group__7 ;
    public final void rule__Objet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2659:1: ( rule__Objet__Group__6__Impl rule__Objet__Group__7 )
            // InternalGame.g:2660:2: rule__Objet__Group__6__Impl rule__Objet__Group__7
            {
            pushFollow(FOLLOW_34);
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
    // InternalGame.g:2667:1: rule__Objet__Group__6__Impl : ( ( rule__Objet__ActifAssignment_6 ) ) ;
    public final void rule__Objet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2671:1: ( ( ( rule__Objet__ActifAssignment_6 ) ) )
            // InternalGame.g:2672:1: ( ( rule__Objet__ActifAssignment_6 ) )
            {
            // InternalGame.g:2672:1: ( ( rule__Objet__ActifAssignment_6 ) )
            // InternalGame.g:2673:2: ( rule__Objet__ActifAssignment_6 )
            {
             before(grammarAccess.getObjetAccess().getActifAssignment_6()); 
            // InternalGame.g:2674:2: ( rule__Objet__ActifAssignment_6 )
            // InternalGame.g:2674:3: rule__Objet__ActifAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Objet__ActifAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getActifAssignment_6()); 

            }


            }

        }
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
    // InternalGame.g:2682:1: rule__Objet__Group__7 : rule__Objet__Group__7__Impl rule__Objet__Group__8 ;
    public final void rule__Objet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2686:1: ( rule__Objet__Group__7__Impl rule__Objet__Group__8 )
            // InternalGame.g:2687:2: rule__Objet__Group__7__Impl rule__Objet__Group__8
            {
            pushFollow(FOLLOW_27);
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
    // InternalGame.g:2694:1: rule__Objet__Group__7__Impl : ( 'quantite' ) ;
    public final void rule__Objet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2698:1: ( ( 'quantite' ) )
            // InternalGame.g:2699:1: ( 'quantite' )
            {
            // InternalGame.g:2699:1: ( 'quantite' )
            // InternalGame.g:2700:2: 'quantite'
            {
             before(grammarAccess.getObjetAccess().getQuantiteKeyword_7()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getQuantiteKeyword_7()); 

            }


            }

        }
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
    // InternalGame.g:2709:1: rule__Objet__Group__8 : rule__Objet__Group__8__Impl rule__Objet__Group__9 ;
    public final void rule__Objet__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2713:1: ( rule__Objet__Group__8__Impl rule__Objet__Group__9 )
            // InternalGame.g:2714:2: rule__Objet__Group__8__Impl rule__Objet__Group__9
            {
            pushFollow(FOLLOW_25);
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
    // InternalGame.g:2721:1: rule__Objet__Group__8__Impl : ( ( rule__Objet__QteAssignment_8 ) ) ;
    public final void rule__Objet__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2725:1: ( ( ( rule__Objet__QteAssignment_8 ) ) )
            // InternalGame.g:2726:1: ( ( rule__Objet__QteAssignment_8 ) )
            {
            // InternalGame.g:2726:1: ( ( rule__Objet__QteAssignment_8 ) )
            // InternalGame.g:2727:2: ( rule__Objet__QteAssignment_8 )
            {
             before(grammarAccess.getObjetAccess().getQteAssignment_8()); 
            // InternalGame.g:2728:2: ( rule__Objet__QteAssignment_8 )
            // InternalGame.g:2728:3: rule__Objet__QteAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Objet__QteAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getQteAssignment_8()); 

            }


            }

        }
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
    // InternalGame.g:2736:1: rule__Objet__Group__9 : rule__Objet__Group__9__Impl rule__Objet__Group__10 ;
    public final void rule__Objet__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2740:1: ( rule__Objet__Group__9__Impl rule__Objet__Group__10 )
            // InternalGame.g:2741:2: rule__Objet__Group__9__Impl rule__Objet__Group__10
            {
            pushFollow(FOLLOW_27);
            rule__Objet__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__10();

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
    // InternalGame.g:2748:1: rule__Objet__Group__9__Impl : ( 'taille' ) ;
    public final void rule__Objet__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2752:1: ( ( 'taille' ) )
            // InternalGame.g:2753:1: ( 'taille' )
            {
            // InternalGame.g:2753:1: ( 'taille' )
            // InternalGame.g:2754:2: 'taille'
            {
             before(grammarAccess.getObjetAccess().getTailleKeyword_9()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getTailleKeyword_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__Objet__Group__10"
    // InternalGame.g:2763:1: rule__Objet__Group__10 : rule__Objet__Group__10__Impl rule__Objet__Group__11 ;
    public final void rule__Objet__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2767:1: ( rule__Objet__Group__10__Impl rule__Objet__Group__11 )
            // InternalGame.g:2768:2: rule__Objet__Group__10__Impl rule__Objet__Group__11
            {
            pushFollow(FOLLOW_35);
            rule__Objet__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__11();

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
    // $ANTLR end "rule__Objet__Group__10"


    // $ANTLR start "rule__Objet__Group__10__Impl"
    // InternalGame.g:2775:1: rule__Objet__Group__10__Impl : ( ( rule__Objet__TailleAssignment_10 ) ) ;
    public final void rule__Objet__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2779:1: ( ( ( rule__Objet__TailleAssignment_10 ) ) )
            // InternalGame.g:2780:1: ( ( rule__Objet__TailleAssignment_10 ) )
            {
            // InternalGame.g:2780:1: ( ( rule__Objet__TailleAssignment_10 ) )
            // InternalGame.g:2781:2: ( rule__Objet__TailleAssignment_10 )
            {
             before(grammarAccess.getObjetAccess().getTailleAssignment_10()); 
            // InternalGame.g:2782:2: ( rule__Objet__TailleAssignment_10 )
            // InternalGame.g:2782:3: rule__Objet__TailleAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Objet__TailleAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getTailleAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__10__Impl"


    // $ANTLR start "rule__Objet__Group__11"
    // InternalGame.g:2790:1: rule__Objet__Group__11 : rule__Objet__Group__11__Impl rule__Objet__Group__12 ;
    public final void rule__Objet__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2794:1: ( rule__Objet__Group__11__Impl rule__Objet__Group__12 )
            // InternalGame.g:2795:2: rule__Objet__Group__11__Impl rule__Objet__Group__12
            {
            pushFollow(FOLLOW_18);
            rule__Objet__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__12();

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
    // $ANTLR end "rule__Objet__Group__11"


    // $ANTLR start "rule__Objet__Group__11__Impl"
    // InternalGame.g:2802:1: rule__Objet__Group__11__Impl : ( 'transformable' ) ;
    public final void rule__Objet__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2806:1: ( ( 'transformable' ) )
            // InternalGame.g:2807:1: ( 'transformable' )
            {
            // InternalGame.g:2807:1: ( 'transformable' )
            // InternalGame.g:2808:2: 'transformable'
            {
             before(grammarAccess.getObjetAccess().getTransformableKeyword_11()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getTransformableKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__11__Impl"


    // $ANTLR start "rule__Objet__Group__12"
    // InternalGame.g:2817:1: rule__Objet__Group__12 : rule__Objet__Group__12__Impl rule__Objet__Group__13 ;
    public final void rule__Objet__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2821:1: ( rule__Objet__Group__12__Impl rule__Objet__Group__13 )
            // InternalGame.g:2822:2: rule__Objet__Group__12__Impl rule__Objet__Group__13
            {
            pushFollow(FOLLOW_10);
            rule__Objet__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__13();

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
    // $ANTLR end "rule__Objet__Group__12"


    // $ANTLR start "rule__Objet__Group__12__Impl"
    // InternalGame.g:2829:1: rule__Objet__Group__12__Impl : ( ( rule__Objet__TransformableAssignment_12 ) ) ;
    public final void rule__Objet__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2833:1: ( ( ( rule__Objet__TransformableAssignment_12 ) ) )
            // InternalGame.g:2834:1: ( ( rule__Objet__TransformableAssignment_12 ) )
            {
            // InternalGame.g:2834:1: ( ( rule__Objet__TransformableAssignment_12 ) )
            // InternalGame.g:2835:2: ( rule__Objet__TransformableAssignment_12 )
            {
             before(grammarAccess.getObjetAccess().getTransformableAssignment_12()); 
            // InternalGame.g:2836:2: ( rule__Objet__TransformableAssignment_12 )
            // InternalGame.g:2836:3: rule__Objet__TransformableAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Objet__TransformableAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getTransformableAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__12__Impl"


    // $ANTLR start "rule__Objet__Group__13"
    // InternalGame.g:2844:1: rule__Objet__Group__13 : rule__Objet__Group__13__Impl ;
    public final void rule__Objet__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2848:1: ( rule__Objet__Group__13__Impl )
            // InternalGame.g:2849:2: rule__Objet__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Objet__Group__13__Impl();

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
    // $ANTLR end "rule__Objet__Group__13"


    // $ANTLR start "rule__Objet__Group__13__Impl"
    // InternalGame.g:2855:1: rule__Objet__Group__13__Impl : ( '}' ) ;
    public final void rule__Objet__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2859:1: ( ( '}' ) )
            // InternalGame.g:2860:1: ( '}' )
            {
            // InternalGame.g:2860:1: ( '}' )
            // InternalGame.g:2861:2: '}'
            {
             before(grammarAccess.getObjetAccess().getRightCurlyBracketKeyword_13()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__13__Impl"


    // $ANTLR start "rule__Interaction__Group__0"
    // InternalGame.g:2871:1: rule__Interaction__Group__0 : rule__Interaction__Group__0__Impl rule__Interaction__Group__1 ;
    public final void rule__Interaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2875:1: ( rule__Interaction__Group__0__Impl rule__Interaction__Group__1 )
            // InternalGame.g:2876:2: rule__Interaction__Group__0__Impl rule__Interaction__Group__1
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
    // InternalGame.g:2883:1: rule__Interaction__Group__0__Impl : ( ( rule__Interaction__NameAssignment_0 ) ) ;
    public final void rule__Interaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2887:1: ( ( ( rule__Interaction__NameAssignment_0 ) ) )
            // InternalGame.g:2888:1: ( ( rule__Interaction__NameAssignment_0 ) )
            {
            // InternalGame.g:2888:1: ( ( rule__Interaction__NameAssignment_0 ) )
            // InternalGame.g:2889:2: ( rule__Interaction__NameAssignment_0 )
            {
             before(grammarAccess.getInteractionAccess().getNameAssignment_0()); 
            // InternalGame.g:2890:2: ( rule__Interaction__NameAssignment_0 )
            // InternalGame.g:2890:3: rule__Interaction__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // InternalGame.g:2898:1: rule__Interaction__Group__1 : rule__Interaction__Group__1__Impl rule__Interaction__Group__2 ;
    public final void rule__Interaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2902:1: ( rule__Interaction__Group__1__Impl rule__Interaction__Group__2 )
            // InternalGame.g:2903:2: rule__Interaction__Group__1__Impl rule__Interaction__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalGame.g:2910:1: rule__Interaction__Group__1__Impl : ( '{' ) ;
    public final void rule__Interaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2914:1: ( ( '{' ) )
            // InternalGame.g:2915:1: ( '{' )
            {
            // InternalGame.g:2915:1: ( '{' )
            // InternalGame.g:2916:2: '{'
            {
             before(grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalGame.g:2925:1: rule__Interaction__Group__2 : rule__Interaction__Group__2__Impl rule__Interaction__Group__3 ;
    public final void rule__Interaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2929:1: ( rule__Interaction__Group__2__Impl rule__Interaction__Group__3 )
            // InternalGame.g:2930:2: rule__Interaction__Group__2__Impl rule__Interaction__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalGame.g:2937:1: rule__Interaction__Group__2__Impl : ( 'question' ) ;
    public final void rule__Interaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2941:1: ( ( 'question' ) )
            // InternalGame.g:2942:1: ( 'question' )
            {
            // InternalGame.g:2942:1: ( 'question' )
            // InternalGame.g:2943:2: 'question'
            {
             before(grammarAccess.getInteractionAccess().getQuestionKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getQuestionKeyword_2()); 

            }


            }

        }
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
    // InternalGame.g:2952:1: rule__Interaction__Group__3 : rule__Interaction__Group__3__Impl rule__Interaction__Group__4 ;
    public final void rule__Interaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2956:1: ( rule__Interaction__Group__3__Impl rule__Interaction__Group__4 )
            // InternalGame.g:2957:2: rule__Interaction__Group__3__Impl rule__Interaction__Group__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalGame.g:2964:1: rule__Interaction__Group__3__Impl : ( ( rule__Interaction__QuestionAssignment_3 ) ) ;
    public final void rule__Interaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2968:1: ( ( ( rule__Interaction__QuestionAssignment_3 ) ) )
            // InternalGame.g:2969:1: ( ( rule__Interaction__QuestionAssignment_3 ) )
            {
            // InternalGame.g:2969:1: ( ( rule__Interaction__QuestionAssignment_3 ) )
            // InternalGame.g:2970:2: ( rule__Interaction__QuestionAssignment_3 )
            {
             before(grammarAccess.getInteractionAccess().getQuestionAssignment_3()); 
            // InternalGame.g:2971:2: ( rule__Interaction__QuestionAssignment_3 )
            // InternalGame.g:2971:3: rule__Interaction__QuestionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__QuestionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getQuestionAssignment_3()); 

            }


            }

        }
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
    // InternalGame.g:2979:1: rule__Interaction__Group__4 : rule__Interaction__Group__4__Impl rule__Interaction__Group__5 ;
    public final void rule__Interaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2983:1: ( rule__Interaction__Group__4__Impl rule__Interaction__Group__5 )
            // InternalGame.g:2984:2: rule__Interaction__Group__4__Impl rule__Interaction__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalGame.g:2991:1: rule__Interaction__Group__4__Impl : ( ( ( rule__Interaction__ChoixAssignment_4 ) ) ( ( rule__Interaction__ChoixAssignment_4 )* ) ) ;
    public final void rule__Interaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2995:1: ( ( ( ( rule__Interaction__ChoixAssignment_4 ) ) ( ( rule__Interaction__ChoixAssignment_4 )* ) ) )
            // InternalGame.g:2996:1: ( ( ( rule__Interaction__ChoixAssignment_4 ) ) ( ( rule__Interaction__ChoixAssignment_4 )* ) )
            {
            // InternalGame.g:2996:1: ( ( ( rule__Interaction__ChoixAssignment_4 ) ) ( ( rule__Interaction__ChoixAssignment_4 )* ) )
            // InternalGame.g:2997:2: ( ( rule__Interaction__ChoixAssignment_4 ) ) ( ( rule__Interaction__ChoixAssignment_4 )* )
            {
            // InternalGame.g:2997:2: ( ( rule__Interaction__ChoixAssignment_4 ) )
            // InternalGame.g:2998:3: ( rule__Interaction__ChoixAssignment_4 )
            {
             before(grammarAccess.getInteractionAccess().getChoixAssignment_4()); 
            // InternalGame.g:2999:3: ( rule__Interaction__ChoixAssignment_4 )
            // InternalGame.g:2999:4: rule__Interaction__ChoixAssignment_4
            {
            pushFollow(FOLLOW_39);
            rule__Interaction__ChoixAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getChoixAssignment_4()); 

            }

            // InternalGame.g:3002:2: ( ( rule__Interaction__ChoixAssignment_4 )* )
            // InternalGame.g:3003:3: ( rule__Interaction__ChoixAssignment_4 )*
            {
             before(grammarAccess.getInteractionAccess().getChoixAssignment_4()); 
            // InternalGame.g:3004:3: ( rule__Interaction__ChoixAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==42) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGame.g:3004:4: rule__Interaction__ChoixAssignment_4
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__Interaction__ChoixAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getInteractionAccess().getChoixAssignment_4()); 

            }


            }


            }

        }
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
    // InternalGame.g:3013:1: rule__Interaction__Group__5 : rule__Interaction__Group__5__Impl ;
    public final void rule__Interaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3017:1: ( rule__Interaction__Group__5__Impl )
            // InternalGame.g:3018:2: rule__Interaction__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__Group__5__Impl();

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
    // InternalGame.g:3024:1: rule__Interaction__Group__5__Impl : ( '}' ) ;
    public final void rule__Interaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3028:1: ( ( '}' ) )
            // InternalGame.g:3029:1: ( '}' )
            {
            // InternalGame.g:3029:1: ( '}' )
            // InternalGame.g:3030:2: '}'
            {
             before(grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Choix__Group__0"
    // InternalGame.g:3040:1: rule__Choix__Group__0 : rule__Choix__Group__0__Impl rule__Choix__Group__1 ;
    public final void rule__Choix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3044:1: ( rule__Choix__Group__0__Impl rule__Choix__Group__1 )
            // InternalGame.g:3045:2: rule__Choix__Group__0__Impl rule__Choix__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:3052:1: rule__Choix__Group__0__Impl : ( 'choix' ) ;
    public final void rule__Choix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3056:1: ( ( 'choix' ) )
            // InternalGame.g:3057:1: ( 'choix' )
            {
            // InternalGame.g:3057:1: ( 'choix' )
            // InternalGame.g:3058:2: 'choix'
            {
             before(grammarAccess.getChoixAccess().getChoixKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getChoixKeyword_0()); 

            }


            }

        }
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
    // InternalGame.g:3067:1: rule__Choix__Group__1 : rule__Choix__Group__1__Impl rule__Choix__Group__2 ;
    public final void rule__Choix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3071:1: ( rule__Choix__Group__1__Impl rule__Choix__Group__2 )
            // InternalGame.g:3072:2: rule__Choix__Group__1__Impl rule__Choix__Group__2
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
    // InternalGame.g:3079:1: rule__Choix__Group__1__Impl : ( ( rule__Choix__NameAssignment_1 ) ) ;
    public final void rule__Choix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3083:1: ( ( ( rule__Choix__NameAssignment_1 ) ) )
            // InternalGame.g:3084:1: ( ( rule__Choix__NameAssignment_1 ) )
            {
            // InternalGame.g:3084:1: ( ( rule__Choix__NameAssignment_1 ) )
            // InternalGame.g:3085:2: ( rule__Choix__NameAssignment_1 )
            {
             before(grammarAccess.getChoixAccess().getNameAssignment_1()); 
            // InternalGame.g:3086:2: ( rule__Choix__NameAssignment_1 )
            // InternalGame.g:3086:3: rule__Choix__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Choix__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalGame.g:3094:1: rule__Choix__Group__2 : rule__Choix__Group__2__Impl rule__Choix__Group__3 ;
    public final void rule__Choix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3098:1: ( rule__Choix__Group__2__Impl rule__Choix__Group__3 )
            // InternalGame.g:3099:2: rule__Choix__Group__2__Impl rule__Choix__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalGame.g:3106:1: rule__Choix__Group__2__Impl : ( '{' ) ;
    public final void rule__Choix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3110:1: ( ( '{' ) )
            // InternalGame.g:3111:1: ( '{' )
            {
            // InternalGame.g:3111:1: ( '{' )
            // InternalGame.g:3112:2: '{'
            {
             before(grammarAccess.getChoixAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalGame.g:3121:1: rule__Choix__Group__3 : rule__Choix__Group__3__Impl rule__Choix__Group__4 ;
    public final void rule__Choix__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3125:1: ( rule__Choix__Group__3__Impl rule__Choix__Group__4 )
            // InternalGame.g:3126:2: rule__Choix__Group__3__Impl rule__Choix__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalGame.g:3133:1: rule__Choix__Group__3__Impl : ( 'reponse' ) ;
    public final void rule__Choix__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3137:1: ( ( 'reponse' ) )
            // InternalGame.g:3138:1: ( 'reponse' )
            {
            // InternalGame.g:3138:1: ( 'reponse' )
            // InternalGame.g:3139:2: 'reponse'
            {
             before(grammarAccess.getChoixAccess().getReponseKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getReponseKeyword_3()); 

            }


            }

        }
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
    // InternalGame.g:3148:1: rule__Choix__Group__4 : rule__Choix__Group__4__Impl rule__Choix__Group__5 ;
    public final void rule__Choix__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3152:1: ( rule__Choix__Group__4__Impl rule__Choix__Group__5 )
            // InternalGame.g:3153:2: rule__Choix__Group__4__Impl rule__Choix__Group__5
            {
            pushFollow(FOLLOW_41);
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
    // InternalGame.g:3160:1: rule__Choix__Group__4__Impl : ( ( rule__Choix__ReponseAssignment_4 ) ) ;
    public final void rule__Choix__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3164:1: ( ( ( rule__Choix__ReponseAssignment_4 ) ) )
            // InternalGame.g:3165:1: ( ( rule__Choix__ReponseAssignment_4 ) )
            {
            // InternalGame.g:3165:1: ( ( rule__Choix__ReponseAssignment_4 ) )
            // InternalGame.g:3166:2: ( rule__Choix__ReponseAssignment_4 )
            {
             before(grammarAccess.getChoixAccess().getReponseAssignment_4()); 
            // InternalGame.g:3167:2: ( rule__Choix__ReponseAssignment_4 )
            // InternalGame.g:3167:3: rule__Choix__ReponseAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Choix__ReponseAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getReponseAssignment_4()); 

            }


            }

        }
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
    // InternalGame.g:3175:1: rule__Choix__Group__5 : rule__Choix__Group__5__Impl rule__Choix__Group__6 ;
    public final void rule__Choix__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3179:1: ( rule__Choix__Group__5__Impl rule__Choix__Group__6 )
            // InternalGame.g:3180:2: rule__Choix__Group__5__Impl rule__Choix__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalGame.g:3187:1: rule__Choix__Group__5__Impl : ( 'bonne' ) ;
    public final void rule__Choix__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3191:1: ( ( 'bonne' ) )
            // InternalGame.g:3192:1: ( 'bonne' )
            {
            // InternalGame.g:3192:1: ( 'bonne' )
            // InternalGame.g:3193:2: 'bonne'
            {
             before(grammarAccess.getChoixAccess().getBonneKeyword_5()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getBonneKeyword_5()); 

            }


            }

        }
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
    // InternalGame.g:3202:1: rule__Choix__Group__6 : rule__Choix__Group__6__Impl rule__Choix__Group__7 ;
    public final void rule__Choix__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3206:1: ( rule__Choix__Group__6__Impl rule__Choix__Group__7 )
            // InternalGame.g:3207:2: rule__Choix__Group__6__Impl rule__Choix__Group__7
            {
            pushFollow(FOLLOW_42);
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
    // InternalGame.g:3214:1: rule__Choix__Group__6__Impl : ( ( rule__Choix__BonneAssignment_6 ) ) ;
    public final void rule__Choix__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3218:1: ( ( ( rule__Choix__BonneAssignment_6 ) ) )
            // InternalGame.g:3219:1: ( ( rule__Choix__BonneAssignment_6 ) )
            {
            // InternalGame.g:3219:1: ( ( rule__Choix__BonneAssignment_6 ) )
            // InternalGame.g:3220:2: ( rule__Choix__BonneAssignment_6 )
            {
             before(grammarAccess.getChoixAccess().getBonneAssignment_6()); 
            // InternalGame.g:3221:2: ( rule__Choix__BonneAssignment_6 )
            // InternalGame.g:3221:3: rule__Choix__BonneAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Choix__BonneAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getBonneAssignment_6()); 

            }


            }

        }
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
    // InternalGame.g:3229:1: rule__Choix__Group__7 : rule__Choix__Group__7__Impl rule__Choix__Group__8 ;
    public final void rule__Choix__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3233:1: ( rule__Choix__Group__7__Impl rule__Choix__Group__8 )
            // InternalGame.g:3234:2: rule__Choix__Group__7__Impl rule__Choix__Group__8
            {
            pushFollow(FOLLOW_42);
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
    // InternalGame.g:3241:1: rule__Choix__Group__7__Impl : ( ( rule__Choix__Group_7__0 )* ) ;
    public final void rule__Choix__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3245:1: ( ( ( rule__Choix__Group_7__0 )* ) )
            // InternalGame.g:3246:1: ( ( rule__Choix__Group_7__0 )* )
            {
            // InternalGame.g:3246:1: ( ( rule__Choix__Group_7__0 )* )
            // InternalGame.g:3247:2: ( rule__Choix__Group_7__0 )*
            {
             before(grammarAccess.getChoixAccess().getGroup_7()); 
            // InternalGame.g:3248:2: ( rule__Choix__Group_7__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==45) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGame.g:3248:3: rule__Choix__Group_7__0
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__Choix__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getChoixAccess().getGroup_7()); 

            }


            }

        }
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
    // InternalGame.g:3256:1: rule__Choix__Group__8 : rule__Choix__Group__8__Impl rule__Choix__Group__9 ;
    public final void rule__Choix__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3260:1: ( rule__Choix__Group__8__Impl rule__Choix__Group__9 )
            // InternalGame.g:3261:2: rule__Choix__Group__8__Impl rule__Choix__Group__9
            {
            pushFollow(FOLLOW_42);
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
    // InternalGame.g:3268:1: rule__Choix__Group__8__Impl : ( ( rule__Choix__Group_8__0 )* ) ;
    public final void rule__Choix__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3272:1: ( ( ( rule__Choix__Group_8__0 )* ) )
            // InternalGame.g:3273:1: ( ( rule__Choix__Group_8__0 )* )
            {
            // InternalGame.g:3273:1: ( ( rule__Choix__Group_8__0 )* )
            // InternalGame.g:3274:2: ( rule__Choix__Group_8__0 )*
            {
             before(grammarAccess.getChoixAccess().getGroup_8()); 
            // InternalGame.g:3275:2: ( rule__Choix__Group_8__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==46) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGame.g:3275:3: rule__Choix__Group_8__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__Choix__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

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
    // InternalGame.g:3283:1: rule__Choix__Group__9 : rule__Choix__Group__9__Impl ;
    public final void rule__Choix__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3287:1: ( rule__Choix__Group__9__Impl )
            // InternalGame.g:3288:2: rule__Choix__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group__9__Impl();

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
    // InternalGame.g:3294:1: rule__Choix__Group__9__Impl : ( '}' ) ;
    public final void rule__Choix__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3298:1: ( ( '}' ) )
            // InternalGame.g:3299:1: ( '}' )
            {
            // InternalGame.g:3299:1: ( '}' )
            // InternalGame.g:3300:2: '}'
            {
             before(grammarAccess.getChoixAccess().getRightCurlyBracketKeyword_9()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__Choix__Group_7__0"
    // InternalGame.g:3310:1: rule__Choix__Group_7__0 : rule__Choix__Group_7__0__Impl rule__Choix__Group_7__1 ;
    public final void rule__Choix__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3314:1: ( rule__Choix__Group_7__0__Impl rule__Choix__Group_7__1 )
            // InternalGame.g:3315:2: rule__Choix__Group_7__0__Impl rule__Choix__Group_7__1
            {
            pushFollow(FOLLOW_27);
            rule__Choix__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group_7__1();

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
    // $ANTLR end "rule__Choix__Group_7__0"


    // $ANTLR start "rule__Choix__Group_7__0__Impl"
    // InternalGame.g:3322:1: rule__Choix__Group_7__0__Impl : ( 'consomme' ) ;
    public final void rule__Choix__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3326:1: ( ( 'consomme' ) )
            // InternalGame.g:3327:1: ( 'consomme' )
            {
            // InternalGame.g:3327:1: ( 'consomme' )
            // InternalGame.g:3328:2: 'consomme'
            {
             before(grammarAccess.getChoixAccess().getConsommeKeyword_7_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getConsommeKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_7__0__Impl"


    // $ANTLR start "rule__Choix__Group_7__1"
    // InternalGame.g:3337:1: rule__Choix__Group_7__1 : rule__Choix__Group_7__1__Impl ;
    public final void rule__Choix__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3341:1: ( rule__Choix__Group_7__1__Impl )
            // InternalGame.g:3342:2: rule__Choix__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group_7__1__Impl();

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
    // $ANTLR end "rule__Choix__Group_7__1"


    // $ANTLR start "rule__Choix__Group_7__1__Impl"
    // InternalGame.g:3348:1: rule__Choix__Group_7__1__Impl : ( ( rule__Choix__ObjetConsAssignment_7_1 ) ) ;
    public final void rule__Choix__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3352:1: ( ( ( rule__Choix__ObjetConsAssignment_7_1 ) ) )
            // InternalGame.g:3353:1: ( ( rule__Choix__ObjetConsAssignment_7_1 ) )
            {
            // InternalGame.g:3353:1: ( ( rule__Choix__ObjetConsAssignment_7_1 ) )
            // InternalGame.g:3354:2: ( rule__Choix__ObjetConsAssignment_7_1 )
            {
             before(grammarAccess.getChoixAccess().getObjetConsAssignment_7_1()); 
            // InternalGame.g:3355:2: ( rule__Choix__ObjetConsAssignment_7_1 )
            // InternalGame.g:3355:3: rule__Choix__ObjetConsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Choix__ObjetConsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getObjetConsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_7__1__Impl"


    // $ANTLR start "rule__Choix__Group_8__0"
    // InternalGame.g:3364:1: rule__Choix__Group_8__0 : rule__Choix__Group_8__0__Impl rule__Choix__Group_8__1 ;
    public final void rule__Choix__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3368:1: ( rule__Choix__Group_8__0__Impl rule__Choix__Group_8__1 )
            // InternalGame.g:3369:2: rule__Choix__Group_8__0__Impl rule__Choix__Group_8__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalGame.g:3376:1: rule__Choix__Group_8__0__Impl : ( 'donne' ) ;
    public final void rule__Choix__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3380:1: ( ( 'donne' ) )
            // InternalGame.g:3381:1: ( 'donne' )
            {
            // InternalGame.g:3381:1: ( 'donne' )
            // InternalGame.g:3382:2: 'donne'
            {
             before(grammarAccess.getChoixAccess().getDonneKeyword_8_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getDonneKeyword_8_0()); 

            }


            }

        }
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
    // InternalGame.g:3391:1: rule__Choix__Group_8__1 : rule__Choix__Group_8__1__Impl ;
    public final void rule__Choix__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3395:1: ( rule__Choix__Group_8__1__Impl )
            // InternalGame.g:3396:2: rule__Choix__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group_8__1__Impl();

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
    // InternalGame.g:3402:1: rule__Choix__Group_8__1__Impl : ( ( rule__Choix__Alternatives_8_1 ) ) ;
    public final void rule__Choix__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3406:1: ( ( ( rule__Choix__Alternatives_8_1 ) ) )
            // InternalGame.g:3407:1: ( ( rule__Choix__Alternatives_8_1 ) )
            {
            // InternalGame.g:3407:1: ( ( rule__Choix__Alternatives_8_1 ) )
            // InternalGame.g:3408:2: ( rule__Choix__Alternatives_8_1 )
            {
             before(grammarAccess.getChoixAccess().getAlternatives_8_1()); 
            // InternalGame.g:3409:2: ( rule__Choix__Alternatives_8_1 )
            // InternalGame.g:3409:3: rule__Choix__Alternatives_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Alternatives_8_1();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getAlternatives_8_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Choix__Group_8_1_1__0"
    // InternalGame.g:3418:1: rule__Choix__Group_8_1_1__0 : rule__Choix__Group_8_1_1__0__Impl rule__Choix__Group_8_1_1__1 ;
    public final void rule__Choix__Group_8_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3422:1: ( rule__Choix__Group_8_1_1__0__Impl rule__Choix__Group_8_1_1__1 )
            // InternalGame.g:3423:2: rule__Choix__Group_8_1_1__0__Impl rule__Choix__Group_8_1_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Choix__Group_8_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group_8_1_1__1();

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
    // $ANTLR end "rule__Choix__Group_8_1_1__0"


    // $ANTLR start "rule__Choix__Group_8_1_1__0__Impl"
    // InternalGame.g:3430:1: rule__Choix__Group_8_1_1__0__Impl : ( 'connaissance' ) ;
    public final void rule__Choix__Group_8_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3434:1: ( ( 'connaissance' ) )
            // InternalGame.g:3435:1: ( 'connaissance' )
            {
            // InternalGame.g:3435:1: ( 'connaissance' )
            // InternalGame.g:3436:2: 'connaissance'
            {
             before(grammarAccess.getChoixAccess().getConnaissanceKeyword_8_1_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getConnaissanceKeyword_8_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_8_1_1__0__Impl"


    // $ANTLR start "rule__Choix__Group_8_1_1__1"
    // InternalGame.g:3445:1: rule__Choix__Group_8_1_1__1 : rule__Choix__Group_8_1_1__1__Impl ;
    public final void rule__Choix__Group_8_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3449:1: ( rule__Choix__Group_8_1_1__1__Impl )
            // InternalGame.g:3450:2: rule__Choix__Group_8_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group_8_1_1__1__Impl();

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
    // $ANTLR end "rule__Choix__Group_8_1_1__1"


    // $ANTLR start "rule__Choix__Group_8_1_1__1__Impl"
    // InternalGame.g:3456:1: rule__Choix__Group_8_1_1__1__Impl : ( ( rule__Choix__ConnaisDonAssignment_8_1_1_1 ) ) ;
    public final void rule__Choix__Group_8_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3460:1: ( ( ( rule__Choix__ConnaisDonAssignment_8_1_1_1 ) ) )
            // InternalGame.g:3461:1: ( ( rule__Choix__ConnaisDonAssignment_8_1_1_1 ) )
            {
            // InternalGame.g:3461:1: ( ( rule__Choix__ConnaisDonAssignment_8_1_1_1 ) )
            // InternalGame.g:3462:2: ( rule__Choix__ConnaisDonAssignment_8_1_1_1 )
            {
             before(grammarAccess.getChoixAccess().getConnaisDonAssignment_8_1_1_1()); 
            // InternalGame.g:3463:2: ( rule__Choix__ConnaisDonAssignment_8_1_1_1 )
            // InternalGame.g:3463:3: rule__Choix__ConnaisDonAssignment_8_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Choix__ConnaisDonAssignment_8_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getConnaisDonAssignment_8_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group_8_1_1__1__Impl"


    // $ANTLR start "rule__Condition__Group_0__0"
    // InternalGame.g:3472:1: rule__Condition__Group_0__0 : rule__Condition__Group_0__0__Impl rule__Condition__Group_0__1 ;
    public final void rule__Condition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3476:1: ( rule__Condition__Group_0__0__Impl rule__Condition__Group_0__1 )
            // InternalGame.g:3477:2: rule__Condition__Group_0__0__Impl rule__Condition__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Condition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_0__1();

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
    // $ANTLR end "rule__Condition__Group_0__0"


    // $ANTLR start "rule__Condition__Group_0__0__Impl"
    // InternalGame.g:3484:1: rule__Condition__Group_0__0__Impl : ( 'condition' ) ;
    public final void rule__Condition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3488:1: ( ( 'condition' ) )
            // InternalGame.g:3489:1: ( 'condition' )
            {
            // InternalGame.g:3489:1: ( 'condition' )
            // InternalGame.g:3490:2: 'condition'
            {
             before(grammarAccess.getConditionAccess().getConditionKeyword_0_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getConditionKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__0__Impl"


    // $ANTLR start "rule__Condition__Group_0__1"
    // InternalGame.g:3499:1: rule__Condition__Group_0__1 : rule__Condition__Group_0__1__Impl rule__Condition__Group_0__2 ;
    public final void rule__Condition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3503:1: ( rule__Condition__Group_0__1__Impl rule__Condition__Group_0__2 )
            // InternalGame.g:3504:2: rule__Condition__Group_0__1__Impl rule__Condition__Group_0__2
            {
            pushFollow(FOLLOW_4);
            rule__Condition__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_0__2();

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
    // $ANTLR end "rule__Condition__Group_0__1"


    // $ANTLR start "rule__Condition__Group_0__1__Impl"
    // InternalGame.g:3511:1: rule__Condition__Group_0__1__Impl : ( ( rule__Condition__NameAssignment_0_1 ) ) ;
    public final void rule__Condition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3515:1: ( ( ( rule__Condition__NameAssignment_0_1 ) ) )
            // InternalGame.g:3516:1: ( ( rule__Condition__NameAssignment_0_1 ) )
            {
            // InternalGame.g:3516:1: ( ( rule__Condition__NameAssignment_0_1 ) )
            // InternalGame.g:3517:2: ( rule__Condition__NameAssignment_0_1 )
            {
             before(grammarAccess.getConditionAccess().getNameAssignment_0_1()); 
            // InternalGame.g:3518:2: ( rule__Condition__NameAssignment_0_1 )
            // InternalGame.g:3518:3: rule__Condition__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__1__Impl"


    // $ANTLR start "rule__Condition__Group_0__2"
    // InternalGame.g:3526:1: rule__Condition__Group_0__2 : rule__Condition__Group_0__2__Impl rule__Condition__Group_0__3 ;
    public final void rule__Condition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3530:1: ( rule__Condition__Group_0__2__Impl rule__Condition__Group_0__3 )
            // InternalGame.g:3531:2: rule__Condition__Group_0__2__Impl rule__Condition__Group_0__3
            {
            pushFollow(FOLLOW_46);
            rule__Condition__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_0__3();

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
    // $ANTLR end "rule__Condition__Group_0__2"


    // $ANTLR start "rule__Condition__Group_0__2__Impl"
    // InternalGame.g:3538:1: rule__Condition__Group_0__2__Impl : ( '{' ) ;
    public final void rule__Condition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3542:1: ( ( '{' ) )
            // InternalGame.g:3543:1: ( '{' )
            {
            // InternalGame.g:3543:1: ( '{' )
            // InternalGame.g:3544:2: '{'
            {
             before(grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_0_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__2__Impl"


    // $ANTLR start "rule__Condition__Group_0__3"
    // InternalGame.g:3553:1: rule__Condition__Group_0__3 : rule__Condition__Group_0__3__Impl rule__Condition__Group_0__4 ;
    public final void rule__Condition__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3557:1: ( rule__Condition__Group_0__3__Impl rule__Condition__Group_0__4 )
            // InternalGame.g:3558:2: rule__Condition__Group_0__3__Impl rule__Condition__Group_0__4
            {
            pushFollow(FOLLOW_46);
            rule__Condition__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_0__4();

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
    // $ANTLR end "rule__Condition__Group_0__3"


    // $ANTLR start "rule__Condition__Group_0__3__Impl"
    // InternalGame.g:3565:1: rule__Condition__Group_0__3__Impl : ( ( rule__Condition__Group_0_3__0 )* ) ;
    public final void rule__Condition__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3569:1: ( ( ( rule__Condition__Group_0_3__0 )* ) )
            // InternalGame.g:3570:1: ( ( rule__Condition__Group_0_3__0 )* )
            {
            // InternalGame.g:3570:1: ( ( rule__Condition__Group_0_3__0 )* )
            // InternalGame.g:3571:2: ( rule__Condition__Group_0_3__0 )*
            {
             before(grammarAccess.getConditionAccess().getGroup_0_3()); 
            // InternalGame.g:3572:2: ( rule__Condition__Group_0_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==36) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGame.g:3572:3: rule__Condition__Group_0_3__0
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__Condition__Group_0_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getConditionAccess().getGroup_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__3__Impl"


    // $ANTLR start "rule__Condition__Group_0__4"
    // InternalGame.g:3580:1: rule__Condition__Group_0__4 : rule__Condition__Group_0__4__Impl rule__Condition__Group_0__5 ;
    public final void rule__Condition__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3584:1: ( rule__Condition__Group_0__4__Impl rule__Condition__Group_0__5 )
            // InternalGame.g:3585:2: rule__Condition__Group_0__4__Impl rule__Condition__Group_0__5
            {
            pushFollow(FOLLOW_46);
            rule__Condition__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_0__5();

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
    // $ANTLR end "rule__Condition__Group_0__4"


    // $ANTLR start "rule__Condition__Group_0__4__Impl"
    // InternalGame.g:3592:1: rule__Condition__Group_0__4__Impl : ( ( rule__Condition__Group_0_4__0 )* ) ;
    public final void rule__Condition__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3596:1: ( ( ( rule__Condition__Group_0_4__0 )* ) )
            // InternalGame.g:3597:1: ( ( rule__Condition__Group_0_4__0 )* )
            {
            // InternalGame.g:3597:1: ( ( rule__Condition__Group_0_4__0 )* )
            // InternalGame.g:3598:2: ( rule__Condition__Group_0_4__0 )*
            {
             before(grammarAccess.getConditionAccess().getGroup_0_4()); 
            // InternalGame.g:3599:2: ( rule__Condition__Group_0_4__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_INT) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGame.g:3599:3: rule__Condition__Group_0_4__0
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__Condition__Group_0_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getConditionAccess().getGroup_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__4__Impl"


    // $ANTLR start "rule__Condition__Group_0__5"
    // InternalGame.g:3607:1: rule__Condition__Group_0__5 : rule__Condition__Group_0__5__Impl ;
    public final void rule__Condition__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3611:1: ( rule__Condition__Group_0__5__Impl )
            // InternalGame.g:3612:2: rule__Condition__Group_0__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group_0__5__Impl();

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
    // $ANTLR end "rule__Condition__Group_0__5"


    // $ANTLR start "rule__Condition__Group_0__5__Impl"
    // InternalGame.g:3618:1: rule__Condition__Group_0__5__Impl : ( '}' ) ;
    public final void rule__Condition__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3622:1: ( ( '}' ) )
            // InternalGame.g:3623:1: ( '}' )
            {
            // InternalGame.g:3623:1: ( '}' )
            // InternalGame.g:3624:2: '}'
            {
             before(grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_0_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__5__Impl"


    // $ANTLR start "rule__Condition__Group_0_3__0"
    // InternalGame.g:3634:1: rule__Condition__Group_0_3__0 : rule__Condition__Group_0_3__0__Impl rule__Condition__Group_0_3__1 ;
    public final void rule__Condition__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3638:1: ( rule__Condition__Group_0_3__0__Impl rule__Condition__Group_0_3__1 )
            // InternalGame.g:3639:2: rule__Condition__Group_0_3__0__Impl rule__Condition__Group_0_3__1
            {
            pushFollow(FOLLOW_49);
            rule__Condition__Group_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_0_3__1();

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
    // $ANTLR end "rule__Condition__Group_0_3__0"


    // $ANTLR start "rule__Condition__Group_0_3__0__Impl"
    // InternalGame.g:3646:1: rule__Condition__Group_0_3__0__Impl : ( 'connaissances' ) ;
    public final void rule__Condition__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3650:1: ( ( 'connaissances' ) )
            // InternalGame.g:3651:1: ( 'connaissances' )
            {
            // InternalGame.g:3651:1: ( 'connaissances' )
            // InternalGame.g:3652:2: 'connaissances'
            {
             before(grammarAccess.getConditionAccess().getConnaissancesKeyword_0_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getConnaissancesKeyword_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0_3__0__Impl"


    // $ANTLR start "rule__Condition__Group_0_3__1"
    // InternalGame.g:3661:1: rule__Condition__Group_0_3__1 : rule__Condition__Group_0_3__1__Impl ;
    public final void rule__Condition__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3665:1: ( rule__Condition__Group_0_3__1__Impl )
            // InternalGame.g:3666:2: rule__Condition__Group_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group_0_3__1__Impl();

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
    // $ANTLR end "rule__Condition__Group_0_3__1"


    // $ANTLR start "rule__Condition__Group_0_3__1__Impl"
    // InternalGame.g:3672:1: rule__Condition__Group_0_3__1__Impl : ( ( rule__Condition__Alternatives_0_3_1 ) ) ;
    public final void rule__Condition__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3676:1: ( ( ( rule__Condition__Alternatives_0_3_1 ) ) )
            // InternalGame.g:3677:1: ( ( rule__Condition__Alternatives_0_3_1 ) )
            {
            // InternalGame.g:3677:1: ( ( rule__Condition__Alternatives_0_3_1 ) )
            // InternalGame.g:3678:2: ( rule__Condition__Alternatives_0_3_1 )
            {
             before(grammarAccess.getConditionAccess().getAlternatives_0_3_1()); 
            // InternalGame.g:3679:2: ( rule__Condition__Alternatives_0_3_1 )
            // InternalGame.g:3679:3: rule__Condition__Alternatives_0_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Alternatives_0_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0_3__1__Impl"


    // $ANTLR start "rule__Condition__Group_0_3_1_0__0"
    // InternalGame.g:3688:1: rule__Condition__Group_0_3_1_0__0 : rule__Condition__Group_0_3_1_0__0__Impl rule__Condition__Group_0_3_1_0__1 ;
    public final void rule__Condition__Group_0_3_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3692:1: ( rule__Condition__Group_0_3_1_0__0__Impl rule__Condition__Group_0_3_1_0__1 )
            // InternalGame.g:3693:2: rule__Condition__Group_0_3_1_0__0__Impl rule__Condition__Group_0_3_1_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Condition__Group_0_3_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_0_3_1_0__1();

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
    // $ANTLR end "rule__Condition__Group_0_3_1_0__0"


    // $ANTLR start "rule__Condition__Group_0_3_1_0__0__Impl"
    // InternalGame.g:3700:1: rule__Condition__Group_0_3_1_0__0__Impl : ( 'requises' ) ;
    public final void rule__Condition__Group_0_3_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3704:1: ( ( 'requises' ) )
            // InternalGame.g:3705:1: ( 'requises' )
            {
            // InternalGame.g:3705:1: ( 'requises' )
            // InternalGame.g:3706:2: 'requises'
            {
             before(grammarAccess.getConditionAccess().getRequisesKeyword_0_3_1_0_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getRequisesKeyword_0_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0_3_1_0__0__Impl"


    // $ANTLR start "rule__Condition__Group_0_3_1_0__1"
    // InternalGame.g:3715:1: rule__Condition__Group_0_3_1_0__1 : rule__Condition__Group_0_3_1_0__1__Impl ;
    public final void rule__Condition__Group_0_3_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3719:1: ( rule__Condition__Group_0_3_1_0__1__Impl )
            // InternalGame.g:3720:2: rule__Condition__Group_0_3_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group_0_3_1_0__1__Impl();

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
    // $ANTLR end "rule__Condition__Group_0_3_1_0__1"


    // $ANTLR start "rule__Condition__Group_0_3_1_0__1__Impl"
    // InternalGame.g:3726:1: rule__Condition__Group_0_3_1_0__1__Impl : ( ( rule__Condition__ConnaissancesRequisesAssignment_0_3_1_0_1 )* ) ;
    public final void rule__Condition__Group_0_3_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3730:1: ( ( ( rule__Condition__ConnaissancesRequisesAssignment_0_3_1_0_1 )* ) )
            // InternalGame.g:3731:1: ( ( rule__Condition__ConnaissancesRequisesAssignment_0_3_1_0_1 )* )
            {
            // InternalGame.g:3731:1: ( ( rule__Condition__ConnaissancesRequisesAssignment_0_3_1_0_1 )* )
            // InternalGame.g:3732:2: ( rule__Condition__ConnaissancesRequisesAssignment_0_3_1_0_1 )*
            {
             before(grammarAccess.getConditionAccess().getConnaissancesRequisesAssignment_0_3_1_0_1()); 
            // InternalGame.g:3733:2: ( rule__Condition__ConnaissancesRequisesAssignment_0_3_1_0_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalGame.g:3733:3: rule__Condition__ConnaissancesRequisesAssignment_0_3_1_0_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Condition__ConnaissancesRequisesAssignment_0_3_1_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getConditionAccess().getConnaissancesRequisesAssignment_0_3_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0_3_1_0__1__Impl"


    // $ANTLR start "rule__Condition__Group_0_3_1_1__0"
    // InternalGame.g:3742:1: rule__Condition__Group_0_3_1_1__0 : rule__Condition__Group_0_3_1_1__0__Impl rule__Condition__Group_0_3_1_1__1 ;
    public final void rule__Condition__Group_0_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3746:1: ( rule__Condition__Group_0_3_1_1__0__Impl rule__Condition__Group_0_3_1_1__1 )
            // InternalGame.g:3747:2: rule__Condition__Group_0_3_1_1__0__Impl rule__Condition__Group_0_3_1_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Condition__Group_0_3_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_0_3_1_1__1();

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
    // $ANTLR end "rule__Condition__Group_0_3_1_1__0"


    // $ANTLR start "rule__Condition__Group_0_3_1_1__0__Impl"
    // InternalGame.g:3754:1: rule__Condition__Group_0_3_1_1__0__Impl : ( 'interdites' ) ;
    public final void rule__Condition__Group_0_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3758:1: ( ( 'interdites' ) )
            // InternalGame.g:3759:1: ( 'interdites' )
            {
            // InternalGame.g:3759:1: ( 'interdites' )
            // InternalGame.g:3760:2: 'interdites'
            {
             before(grammarAccess.getConditionAccess().getInterditesKeyword_0_3_1_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getInterditesKeyword_0_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0_3_1_1__0__Impl"


    // $ANTLR start "rule__Condition__Group_0_3_1_1__1"
    // InternalGame.g:3769:1: rule__Condition__Group_0_3_1_1__1 : rule__Condition__Group_0_3_1_1__1__Impl ;
    public final void rule__Condition__Group_0_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3773:1: ( rule__Condition__Group_0_3_1_1__1__Impl )
            // InternalGame.g:3774:2: rule__Condition__Group_0_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group_0_3_1_1__1__Impl();

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
    // $ANTLR end "rule__Condition__Group_0_3_1_1__1"


    // $ANTLR start "rule__Condition__Group_0_3_1_1__1__Impl"
    // InternalGame.g:3780:1: rule__Condition__Group_0_3_1_1__1__Impl : ( ( rule__Condition__ConnaissancesInterditesAssignment_0_3_1_1_1 )* ) ;
    public final void rule__Condition__Group_0_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3784:1: ( ( ( rule__Condition__ConnaissancesInterditesAssignment_0_3_1_1_1 )* ) )
            // InternalGame.g:3785:1: ( ( rule__Condition__ConnaissancesInterditesAssignment_0_3_1_1_1 )* )
            {
            // InternalGame.g:3785:1: ( ( rule__Condition__ConnaissancesInterditesAssignment_0_3_1_1_1 )* )
            // InternalGame.g:3786:2: ( rule__Condition__ConnaissancesInterditesAssignment_0_3_1_1_1 )*
            {
             before(grammarAccess.getConditionAccess().getConnaissancesInterditesAssignment_0_3_1_1_1()); 
            // InternalGame.g:3787:2: ( rule__Condition__ConnaissancesInterditesAssignment_0_3_1_1_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGame.g:3787:3: rule__Condition__ConnaissancesInterditesAssignment_0_3_1_1_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Condition__ConnaissancesInterditesAssignment_0_3_1_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getConditionAccess().getConnaissancesInterditesAssignment_0_3_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0_3_1_1__1__Impl"


    // $ANTLR start "rule__Condition__Group_0_4__0"
    // InternalGame.g:3796:1: rule__Condition__Group_0_4__0 : rule__Condition__Group_0_4__0__Impl rule__Condition__Group_0_4__1 ;
    public final void rule__Condition__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3800:1: ( rule__Condition__Group_0_4__0__Impl rule__Condition__Group_0_4__1 )
            // InternalGame.g:3801:2: rule__Condition__Group_0_4__0__Impl rule__Condition__Group_0_4__1
            {
            pushFollow(FOLLOW_50);
            rule__Condition__Group_0_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_0_4__1();

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
    // $ANTLR end "rule__Condition__Group_0_4__0"


    // $ANTLR start "rule__Condition__Group_0_4__0__Impl"
    // InternalGame.g:3808:1: rule__Condition__Group_0_4__0__Impl : ( ( rule__Condition__QuantiteAssignment_0_4_0 ) ) ;
    public final void rule__Condition__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3812:1: ( ( ( rule__Condition__QuantiteAssignment_0_4_0 ) ) )
            // InternalGame.g:3813:1: ( ( rule__Condition__QuantiteAssignment_0_4_0 ) )
            {
            // InternalGame.g:3813:1: ( ( rule__Condition__QuantiteAssignment_0_4_0 ) )
            // InternalGame.g:3814:2: ( rule__Condition__QuantiteAssignment_0_4_0 )
            {
             before(grammarAccess.getConditionAccess().getQuantiteAssignment_0_4_0()); 
            // InternalGame.g:3815:2: ( rule__Condition__QuantiteAssignment_0_4_0 )
            // InternalGame.g:3815:3: rule__Condition__QuantiteAssignment_0_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__QuantiteAssignment_0_4_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getQuantiteAssignment_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0_4__0__Impl"


    // $ANTLR start "rule__Condition__Group_0_4__1"
    // InternalGame.g:3823:1: rule__Condition__Group_0_4__1 : rule__Condition__Group_0_4__1__Impl rule__Condition__Group_0_4__2 ;
    public final void rule__Condition__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3827:1: ( rule__Condition__Group_0_4__1__Impl rule__Condition__Group_0_4__2 )
            // InternalGame.g:3828:2: rule__Condition__Group_0_4__1__Impl rule__Condition__Group_0_4__2
            {
            pushFollow(FOLLOW_51);
            rule__Condition__Group_0_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_0_4__2();

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
    // $ANTLR end "rule__Condition__Group_0_4__1"


    // $ANTLR start "rule__Condition__Group_0_4__1__Impl"
    // InternalGame.g:3835:1: rule__Condition__Group_0_4__1__Impl : ( 'objets' ) ;
    public final void rule__Condition__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3839:1: ( ( 'objets' ) )
            // InternalGame.g:3840:1: ( 'objets' )
            {
            // InternalGame.g:3840:1: ( 'objets' )
            // InternalGame.g:3841:2: 'objets'
            {
             before(grammarAccess.getConditionAccess().getObjetsKeyword_0_4_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getObjetsKeyword_0_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0_4__1__Impl"


    // $ANTLR start "rule__Condition__Group_0_4__2"
    // InternalGame.g:3850:1: rule__Condition__Group_0_4__2 : rule__Condition__Group_0_4__2__Impl ;
    public final void rule__Condition__Group_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3854:1: ( rule__Condition__Group_0_4__2__Impl )
            // InternalGame.g:3855:2: rule__Condition__Group_0_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group_0_4__2__Impl();

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
    // $ANTLR end "rule__Condition__Group_0_4__2"


    // $ANTLR start "rule__Condition__Group_0_4__2__Impl"
    // InternalGame.g:3861:1: rule__Condition__Group_0_4__2__Impl : ( ( rule__Condition__Alternatives_0_4_2 ) ) ;
    public final void rule__Condition__Group_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3865:1: ( ( ( rule__Condition__Alternatives_0_4_2 ) ) )
            // InternalGame.g:3866:1: ( ( rule__Condition__Alternatives_0_4_2 ) )
            {
            // InternalGame.g:3866:1: ( ( rule__Condition__Alternatives_0_4_2 ) )
            // InternalGame.g:3867:2: ( rule__Condition__Alternatives_0_4_2 )
            {
             before(grammarAccess.getConditionAccess().getAlternatives_0_4_2()); 
            // InternalGame.g:3868:2: ( rule__Condition__Alternatives_0_4_2 )
            // InternalGame.g:3868:3: rule__Condition__Alternatives_0_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Alternatives_0_4_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives_0_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0_4__2__Impl"


    // $ANTLR start "rule__Condition__Group_0_4_2_0__0"
    // InternalGame.g:3877:1: rule__Condition__Group_0_4_2_0__0 : rule__Condition__Group_0_4_2_0__0__Impl rule__Condition__Group_0_4_2_0__1 ;
    public final void rule__Condition__Group_0_4_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3881:1: ( rule__Condition__Group_0_4_2_0__0__Impl rule__Condition__Group_0_4_2_0__1 )
            // InternalGame.g:3882:2: rule__Condition__Group_0_4_2_0__0__Impl rule__Condition__Group_0_4_2_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Condition__Group_0_4_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_0_4_2_0__1();

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
    // $ANTLR end "rule__Condition__Group_0_4_2_0__0"


    // $ANTLR start "rule__Condition__Group_0_4_2_0__0__Impl"
    // InternalGame.g:3889:1: rule__Condition__Group_0_4_2_0__0__Impl : ( 'requis' ) ;
    public final void rule__Condition__Group_0_4_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3893:1: ( ( 'requis' ) )
            // InternalGame.g:3894:1: ( 'requis' )
            {
            // InternalGame.g:3894:1: ( 'requis' )
            // InternalGame.g:3895:2: 'requis'
            {
             before(grammarAccess.getConditionAccess().getRequisKeyword_0_4_2_0_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getRequisKeyword_0_4_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0_4_2_0__0__Impl"


    // $ANTLR start "rule__Condition__Group_0_4_2_0__1"
    // InternalGame.g:3904:1: rule__Condition__Group_0_4_2_0__1 : rule__Condition__Group_0_4_2_0__1__Impl ;
    public final void rule__Condition__Group_0_4_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3908:1: ( rule__Condition__Group_0_4_2_0__1__Impl )
            // InternalGame.g:3909:2: rule__Condition__Group_0_4_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group_0_4_2_0__1__Impl();

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
    // $ANTLR end "rule__Condition__Group_0_4_2_0__1"


    // $ANTLR start "rule__Condition__Group_0_4_2_0__1__Impl"
    // InternalGame.g:3915:1: rule__Condition__Group_0_4_2_0__1__Impl : ( ( rule__Condition__ObjetsRequisAssignment_0_4_2_0_1 )* ) ;
    public final void rule__Condition__Group_0_4_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3919:1: ( ( ( rule__Condition__ObjetsRequisAssignment_0_4_2_0_1 )* ) )
            // InternalGame.g:3920:1: ( ( rule__Condition__ObjetsRequisAssignment_0_4_2_0_1 )* )
            {
            // InternalGame.g:3920:1: ( ( rule__Condition__ObjetsRequisAssignment_0_4_2_0_1 )* )
            // InternalGame.g:3921:2: ( rule__Condition__ObjetsRequisAssignment_0_4_2_0_1 )*
            {
             before(grammarAccess.getConditionAccess().getObjetsRequisAssignment_0_4_2_0_1()); 
            // InternalGame.g:3922:2: ( rule__Condition__ObjetsRequisAssignment_0_4_2_0_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGame.g:3922:3: rule__Condition__ObjetsRequisAssignment_0_4_2_0_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Condition__ObjetsRequisAssignment_0_4_2_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getConditionAccess().getObjetsRequisAssignment_0_4_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0_4_2_0__1__Impl"


    // $ANTLR start "rule__Condition__Group_0_4_2_1__0"
    // InternalGame.g:3931:1: rule__Condition__Group_0_4_2_1__0 : rule__Condition__Group_0_4_2_1__0__Impl rule__Condition__Group_0_4_2_1__1 ;
    public final void rule__Condition__Group_0_4_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3935:1: ( rule__Condition__Group_0_4_2_1__0__Impl rule__Condition__Group_0_4_2_1__1 )
            // InternalGame.g:3936:2: rule__Condition__Group_0_4_2_1__0__Impl rule__Condition__Group_0_4_2_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Condition__Group_0_4_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_0_4_2_1__1();

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
    // $ANTLR end "rule__Condition__Group_0_4_2_1__0"


    // $ANTLR start "rule__Condition__Group_0_4_2_1__0__Impl"
    // InternalGame.g:3943:1: rule__Condition__Group_0_4_2_1__0__Impl : ( 'interdits' ) ;
    public final void rule__Condition__Group_0_4_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3947:1: ( ( 'interdits' ) )
            // InternalGame.g:3948:1: ( 'interdits' )
            {
            // InternalGame.g:3948:1: ( 'interdits' )
            // InternalGame.g:3949:2: 'interdits'
            {
             before(grammarAccess.getConditionAccess().getInterditsKeyword_0_4_2_1_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getInterditsKeyword_0_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0_4_2_1__0__Impl"


    // $ANTLR start "rule__Condition__Group_0_4_2_1__1"
    // InternalGame.g:3958:1: rule__Condition__Group_0_4_2_1__1 : rule__Condition__Group_0_4_2_1__1__Impl ;
    public final void rule__Condition__Group_0_4_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3962:1: ( rule__Condition__Group_0_4_2_1__1__Impl )
            // InternalGame.g:3963:2: rule__Condition__Group_0_4_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group_0_4_2_1__1__Impl();

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
    // $ANTLR end "rule__Condition__Group_0_4_2_1__1"


    // $ANTLR start "rule__Condition__Group_0_4_2_1__1__Impl"
    // InternalGame.g:3969:1: rule__Condition__Group_0_4_2_1__1__Impl : ( ( rule__Condition__ObjetsInterditsAssignment_0_4_2_1_1 )* ) ;
    public final void rule__Condition__Group_0_4_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3973:1: ( ( ( rule__Condition__ObjetsInterditsAssignment_0_4_2_1_1 )* ) )
            // InternalGame.g:3974:1: ( ( rule__Condition__ObjetsInterditsAssignment_0_4_2_1_1 )* )
            {
            // InternalGame.g:3974:1: ( ( rule__Condition__ObjetsInterditsAssignment_0_4_2_1_1 )* )
            // InternalGame.g:3975:2: ( rule__Condition__ObjetsInterditsAssignment_0_4_2_1_1 )*
            {
             before(grammarAccess.getConditionAccess().getObjetsInterditsAssignment_0_4_2_1_1()); 
            // InternalGame.g:3976:2: ( rule__Condition__ObjetsInterditsAssignment_0_4_2_1_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalGame.g:3976:3: rule__Condition__ObjetsInterditsAssignment_0_4_2_1_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Condition__ObjetsInterditsAssignment_0_4_2_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getConditionAccess().getObjetsInterditsAssignment_0_4_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0_4_2_1__1__Impl"


    // $ANTLR start "rule__Jeu__NameAssignment_1"
    // InternalGame.g:3985:1: rule__Jeu__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Jeu__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3989:1: ( ( RULE_ID ) )
            // InternalGame.g:3990:2: ( RULE_ID )
            {
            // InternalGame.g:3990:2: ( RULE_ID )
            // InternalGame.g:3991:3: RULE_ID
            {
             before(grammarAccess.getJeuAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__NameAssignment_1"


    // $ANTLR start "rule__Jeu__TerritoireAssignment_3"
    // InternalGame.g:4000:1: rule__Jeu__TerritoireAssignment_3 : ( ruleTerritoire ) ;
    public final void rule__Jeu__TerritoireAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4004:1: ( ( ruleTerritoire ) )
            // InternalGame.g:4005:2: ( ruleTerritoire )
            {
            // InternalGame.g:4005:2: ( ruleTerritoire )
            // InternalGame.g:4006:3: ruleTerritoire
            {
             before(grammarAccess.getJeuAccess().getTerritoireTerritoireParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTerritoire();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getTerritoireTerritoireParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__TerritoireAssignment_3"


    // $ANTLR start "rule__Jeu__ExplorateurAssignment_4"
    // InternalGame.g:4015:1: rule__Jeu__ExplorateurAssignment_4 : ( ruleExplorateur ) ;
    public final void rule__Jeu__ExplorateurAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4019:1: ( ( ruleExplorateur ) )
            // InternalGame.g:4020:2: ( ruleExplorateur )
            {
            // InternalGame.g:4020:2: ( ruleExplorateur )
            // InternalGame.g:4021:3: ruleExplorateur
            {
             before(grammarAccess.getJeuAccess().getExplorateurExplorateurParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExplorateur();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getExplorateurExplorateurParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__ExplorateurAssignment_4"


    // $ANTLR start "rule__Jeu__ElementsjeuAssignment_5"
    // InternalGame.g:4030:1: rule__Jeu__ElementsjeuAssignment_5 : ( ruleElementsJeu ) ;
    public final void rule__Jeu__ElementsjeuAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4034:1: ( ( ruleElementsJeu ) )
            // InternalGame.g:4035:2: ( ruleElementsJeu )
            {
            // InternalGame.g:4035:2: ( ruleElementsJeu )
            // InternalGame.g:4036:3: ruleElementsJeu
            {
             before(grammarAccess.getJeuAccess().getElementsjeuElementsJeuParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleElementsJeu();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getElementsjeuElementsJeuParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__ElementsjeuAssignment_5"


    // $ANTLR start "rule__QteObjet__QteAssignment_0"
    // InternalGame.g:4045:1: rule__QteObjet__QteAssignment_0 : ( RULE_INT ) ;
    public final void rule__QteObjet__QteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4049:1: ( ( RULE_INT ) )
            // InternalGame.g:4050:2: ( RULE_INT )
            {
            // InternalGame.g:4050:2: ( RULE_INT )
            // InternalGame.g:4051:3: RULE_INT
            {
             before(grammarAccess.getQteObjetAccess().getQteINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getQteObjetAccess().getQteINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QteObjet__QteAssignment_0"


    // $ANTLR start "rule__QteObjet__ObjetAssignment_1"
    // InternalGame.g:4060:1: rule__QteObjet__ObjetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__QteObjet__ObjetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4064:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:4065:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:4065:2: ( ( RULE_ID ) )
            // InternalGame.g:4066:3: ( RULE_ID )
            {
             before(grammarAccess.getQteObjetAccess().getObjetObjetCrossReference_1_0()); 
            // InternalGame.g:4067:3: ( RULE_ID )
            // InternalGame.g:4068:4: RULE_ID
            {
             before(grammarAccess.getQteObjetAccess().getObjetObjetIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQteObjetAccess().getObjetObjetIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getQteObjetAccess().getObjetObjetCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QteObjet__ObjetAssignment_1"


    // $ANTLR start "rule__Territoire__PlacesAssignment_2"
    // InternalGame.g:4079:1: rule__Territoire__PlacesAssignment_2 : ( rulePlace ) ;
    public final void rule__Territoire__PlacesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4083:1: ( ( rulePlace ) )
            // InternalGame.g:4084:2: ( rulePlace )
            {
            // InternalGame.g:4084:2: ( rulePlace )
            // InternalGame.g:4085:3: rulePlace
            {
             before(grammarAccess.getTerritoireAccess().getPlacesPlaceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlace();

            state._fsp--;

             after(grammarAccess.getTerritoireAccess().getPlacesPlaceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Territoire__PlacesAssignment_2"


    // $ANTLR start "rule__Lieu__NameAssignment_1"
    // InternalGame.g:4094:1: rule__Lieu__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Lieu__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4098:1: ( ( RULE_ID ) )
            // InternalGame.g:4099:2: ( RULE_ID )
            {
            // InternalGame.g:4099:2: ( RULE_ID )
            // InternalGame.g:4100:3: RULE_ID
            {
             before(grammarAccess.getLieuAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__NameAssignment_1"


    // $ANTLR start "rule__Lieu__NatureAssignment_3"
    // InternalGame.g:4109:1: rule__Lieu__NatureAssignment_3 : ( ruleNature ) ;
    public final void rule__Lieu__NatureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4113:1: ( ( ruleNature ) )
            // InternalGame.g:4114:2: ( ruleNature )
            {
            // InternalGame.g:4114:2: ( ruleNature )
            // InternalGame.g:4115:3: ruleNature
            {
             before(grammarAccess.getLieuAccess().getNatureNatureEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNature();

            state._fsp--;

             after(grammarAccess.getLieuAccess().getNatureNatureEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__NatureAssignment_3"


    // $ANTLR start "rule__Chemin__NameAssignment_1"
    // InternalGame.g:4124:1: rule__Chemin__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Chemin__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4128:1: ( ( RULE_ID ) )
            // InternalGame.g:4129:2: ( RULE_ID )
            {
            // InternalGame.g:4129:2: ( RULE_ID )
            // InternalGame.g:4130:3: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__NameAssignment_1"


    // $ANTLR start "rule__Chemin__PredAssignment_4"
    // InternalGame.g:4139:1: rule__Chemin__PredAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__PredAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4143:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:4144:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:4144:2: ( ( RULE_ID ) )
            // InternalGame.g:4145:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getPredLieuCrossReference_4_0()); 
            // InternalGame.g:4146:3: ( RULE_ID )
            // InternalGame.g:4147:4: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getPredLieuIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getPredLieuIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getCheminAccess().getPredLieuCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__PredAssignment_4"


    // $ANTLR start "rule__Chemin__SuccAssignment_6"
    // InternalGame.g:4158:1: rule__Chemin__SuccAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__SuccAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4162:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:4163:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:4163:2: ( ( RULE_ID ) )
            // InternalGame.g:4164:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getSuccLieuCrossReference_6_0()); 
            // InternalGame.g:4165:3: ( RULE_ID )
            // InternalGame.g:4166:4: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getSuccLieuIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getSuccLieuIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getCheminAccess().getSuccLieuCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__SuccAssignment_6"


    // $ANTLR start "rule__Chemin__VisibleAssignment_8"
    // InternalGame.g:4177:1: rule__Chemin__VisibleAssignment_8 : ( ruleCondition ) ;
    public final void rule__Chemin__VisibleAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4181:1: ( ( ruleCondition ) )
            // InternalGame.g:4182:2: ( ruleCondition )
            {
            // InternalGame.g:4182:2: ( ruleCondition )
            // InternalGame.g:4183:3: ruleCondition
            {
             before(grammarAccess.getCheminAccess().getVisibleConditionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getCheminAccess().getVisibleConditionParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__VisibleAssignment_8"


    // $ANTLR start "rule__Chemin__ObligatoireAssignment_10"
    // InternalGame.g:4192:1: rule__Chemin__ObligatoireAssignment_10 : ( RULE_BOOL ) ;
    public final void rule__Chemin__ObligatoireAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4196:1: ( ( RULE_BOOL ) )
            // InternalGame.g:4197:2: ( RULE_BOOL )
            {
            // InternalGame.g:4197:2: ( RULE_BOOL )
            // InternalGame.g:4198:3: RULE_BOOL
            {
             before(grammarAccess.getCheminAccess().getObligatoireBOOLTerminalRuleCall_10_0()); 
            match(input,RULE_BOOL,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getObligatoireBOOLTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__ObligatoireAssignment_10"


    // $ANTLR start "rule__Chemin__OuvertAssignment_12"
    // InternalGame.g:4207:1: rule__Chemin__OuvertAssignment_12 : ( ruleCondition ) ;
    public final void rule__Chemin__OuvertAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4211:1: ( ( ruleCondition ) )
            // InternalGame.g:4212:2: ( ruleCondition )
            {
            // InternalGame.g:4212:2: ( ruleCondition )
            // InternalGame.g:4213:3: ruleCondition
            {
             before(grammarAccess.getCheminAccess().getOuvertConditionParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getCheminAccess().getOuvertConditionParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__OuvertAssignment_12"


    // $ANTLR start "rule__Personne__NameAssignment_1"
    // InternalGame.g:4222:1: rule__Personne__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Personne__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4226:1: ( ( RULE_ID ) )
            // InternalGame.g:4227:2: ( RULE_ID )
            {
            // InternalGame.g:4227:2: ( RULE_ID )
            // InternalGame.g:4228:3: RULE_ID
            {
             before(grammarAccess.getPersonneAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__NameAssignment_1"


    // $ANTLR start "rule__Personne__PlaceAssignment_4"
    // InternalGame.g:4237:1: rule__Personne__PlaceAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Personne__PlaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4241:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:4242:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:4242:2: ( ( RULE_ID ) )
            // InternalGame.g:4243:3: ( RULE_ID )
            {
             before(grammarAccess.getPersonneAccess().getPlacePlaceCrossReference_4_0()); 
            // InternalGame.g:4244:3: ( RULE_ID )
            // InternalGame.g:4245:4: RULE_ID
            {
             before(grammarAccess.getPersonneAccess().getPlacePlaceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getPlacePlaceIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getPersonneAccess().getPlacePlaceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__PlaceAssignment_4"


    // $ANTLR start "rule__Personne__VisibleAssignment_6"
    // InternalGame.g:4256:1: rule__Personne__VisibleAssignment_6 : ( ruleCondition ) ;
    public final void rule__Personne__VisibleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4260:1: ( ( ruleCondition ) )
            // InternalGame.g:4261:2: ( ruleCondition )
            {
            // InternalGame.g:4261:2: ( ruleCondition )
            // InternalGame.g:4262:3: ruleCondition
            {
             before(grammarAccess.getPersonneAccess().getVisibleConditionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getPersonneAccess().getVisibleConditionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__VisibleAssignment_6"


    // $ANTLR start "rule__Personne__ActifAssignment_8"
    // InternalGame.g:4271:1: rule__Personne__ActifAssignment_8 : ( ruleCondition ) ;
    public final void rule__Personne__ActifAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4275:1: ( ( ruleCondition ) )
            // InternalGame.g:4276:2: ( ruleCondition )
            {
            // InternalGame.g:4276:2: ( ruleCondition )
            // InternalGame.g:4277:3: ruleCondition
            {
             before(grammarAccess.getPersonneAccess().getActifConditionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getPersonneAccess().getActifConditionParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__ActifAssignment_8"


    // $ANTLR start "rule__Personne__ObligatoireAssignment_10"
    // InternalGame.g:4286:1: rule__Personne__ObligatoireAssignment_10 : ( RULE_BOOL ) ;
    public final void rule__Personne__ObligatoireAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4290:1: ( ( RULE_BOOL ) )
            // InternalGame.g:4291:2: ( RULE_BOOL )
            {
            // InternalGame.g:4291:2: ( RULE_BOOL )
            // InternalGame.g:4292:3: RULE_BOOL
            {
             before(grammarAccess.getPersonneAccess().getObligatoireBOOLTerminalRuleCall_10_0()); 
            match(input,RULE_BOOL,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getObligatoireBOOLTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__ObligatoireAssignment_10"


    // $ANTLR start "rule__Personne__InteractionsAssignment_12"
    // InternalGame.g:4301:1: rule__Personne__InteractionsAssignment_12 : ( ruleInteraction ) ;
    public final void rule__Personne__InteractionsAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4305:1: ( ( ruleInteraction ) )
            // InternalGame.g:4306:2: ( ruleInteraction )
            {
            // InternalGame.g:4306:2: ( ruleInteraction )
            // InternalGame.g:4307:3: ruleInteraction
            {
             before(grammarAccess.getPersonneAccess().getInteractionsInteractionParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleInteraction();

            state._fsp--;

             after(grammarAccess.getPersonneAccess().getInteractionsInteractionParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__InteractionsAssignment_12"


    // $ANTLR start "rule__Explorateur__PlaceAssignment_3"
    // InternalGame.g:4316:1: rule__Explorateur__PlaceAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Explorateur__PlaceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4320:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:4321:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:4321:2: ( ( RULE_ID ) )
            // InternalGame.g:4322:3: ( RULE_ID )
            {
             before(grammarAccess.getExplorateurAccess().getPlacePlaceCrossReference_3_0()); 
            // InternalGame.g:4323:3: ( RULE_ID )
            // InternalGame.g:4324:4: RULE_ID
            {
             before(grammarAccess.getExplorateurAccess().getPlacePlaceIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getPlacePlaceIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getExplorateurAccess().getPlacePlaceCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__PlaceAssignment_3"


    // $ANTLR start "rule__Explorateur__TailleDispoAssignment_6"
    // InternalGame.g:4335:1: rule__Explorateur__TailleDispoAssignment_6 : ( RULE_INT ) ;
    public final void rule__Explorateur__TailleDispoAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4339:1: ( ( RULE_INT ) )
            // InternalGame.g:4340:2: ( RULE_INT )
            {
            // InternalGame.g:4340:2: ( RULE_INT )
            // InternalGame.g:4341:3: RULE_INT
            {
             before(grammarAccess.getExplorateurAccess().getTailleDispoINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getTailleDispoINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__TailleDispoAssignment_6"


    // $ANTLR start "rule__Explorateur__ObjetsAssignment_7_2"
    // InternalGame.g:4350:1: rule__Explorateur__ObjetsAssignment_7_2 : ( ruleObjet ) ;
    public final void rule__Explorateur__ObjetsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4354:1: ( ( ruleObjet ) )
            // InternalGame.g:4355:2: ( ruleObjet )
            {
            // InternalGame.g:4355:2: ( ruleObjet )
            // InternalGame.g:4356:3: ruleObjet
            {
             before(grammarAccess.getExplorateurAccess().getObjetsObjetParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleObjet();

            state._fsp--;

             after(grammarAccess.getExplorateurAccess().getObjetsObjetParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__ObjetsAssignment_7_2"


    // $ANTLR start "rule__Explorateur__ConnaissancesAssignment_8_2"
    // InternalGame.g:4365:1: rule__Explorateur__ConnaissancesAssignment_8_2 : ( ruleConnaissance ) ;
    public final void rule__Explorateur__ConnaissancesAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4369:1: ( ( ruleConnaissance ) )
            // InternalGame.g:4370:2: ( ruleConnaissance )
            {
            // InternalGame.g:4370:2: ( ruleConnaissance )
            // InternalGame.g:4371:3: ruleConnaissance
            {
             before(grammarAccess.getExplorateurAccess().getConnaissancesConnaissanceParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConnaissance();

            state._fsp--;

             after(grammarAccess.getExplorateurAccess().getConnaissancesConnaissanceParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__ConnaissancesAssignment_8_2"


    // $ANTLR start "rule__Connaissance__NameAssignment_1"
    // InternalGame.g:4380:1: rule__Connaissance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Connaissance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4384:1: ( ( RULE_ID ) )
            // InternalGame.g:4385:2: ( RULE_ID )
            {
            // InternalGame.g:4385:2: ( RULE_ID )
            // InternalGame.g:4386:3: RULE_ID
            {
             before(grammarAccess.getConnaissanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__NameAssignment_1"


    // $ANTLR start "rule__Connaissance__VisibleAssignment_4"
    // InternalGame.g:4395:1: rule__Connaissance__VisibleAssignment_4 : ( ruleCondition ) ;
    public final void rule__Connaissance__VisibleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4399:1: ( ( ruleCondition ) )
            // InternalGame.g:4400:2: ( ruleCondition )
            {
            // InternalGame.g:4400:2: ( ruleCondition )
            // InternalGame.g:4401:3: ruleCondition
            {
             before(grammarAccess.getConnaissanceAccess().getVisibleConditionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConnaissanceAccess().getVisibleConditionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__VisibleAssignment_4"


    // $ANTLR start "rule__Connaissance__ActifAssignment_6"
    // InternalGame.g:4410:1: rule__Connaissance__ActifAssignment_6 : ( ruleCondition ) ;
    public final void rule__Connaissance__ActifAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4414:1: ( ( ruleCondition ) )
            // InternalGame.g:4415:2: ( ruleCondition )
            {
            // InternalGame.g:4415:2: ( ruleCondition )
            // InternalGame.g:4416:3: ruleCondition
            {
             before(grammarAccess.getConnaissanceAccess().getActifConditionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConnaissanceAccess().getActifConditionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__ActifAssignment_6"


    // $ANTLR start "rule__Objet__NameAssignment_1"
    // InternalGame.g:4425:1: rule__Objet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Objet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4429:1: ( ( RULE_ID ) )
            // InternalGame.g:4430:2: ( RULE_ID )
            {
            // InternalGame.g:4430:2: ( RULE_ID )
            // InternalGame.g:4431:3: RULE_ID
            {
             before(grammarAccess.getObjetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__NameAssignment_1"


    // $ANTLR start "rule__Objet__VisibleAssignment_4"
    // InternalGame.g:4440:1: rule__Objet__VisibleAssignment_4 : ( ruleCondition ) ;
    public final void rule__Objet__VisibleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4444:1: ( ( ruleCondition ) )
            // InternalGame.g:4445:2: ( ruleCondition )
            {
            // InternalGame.g:4445:2: ( ruleCondition )
            // InternalGame.g:4446:3: ruleCondition
            {
             before(grammarAccess.getObjetAccess().getVisibleConditionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getObjetAccess().getVisibleConditionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__VisibleAssignment_4"


    // $ANTLR start "rule__Objet__ActifAssignment_6"
    // InternalGame.g:4455:1: rule__Objet__ActifAssignment_6 : ( ruleCondition ) ;
    public final void rule__Objet__ActifAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4459:1: ( ( ruleCondition ) )
            // InternalGame.g:4460:2: ( ruleCondition )
            {
            // InternalGame.g:4460:2: ( ruleCondition )
            // InternalGame.g:4461:3: ruleCondition
            {
             before(grammarAccess.getObjetAccess().getActifConditionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getObjetAccess().getActifConditionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__ActifAssignment_6"


    // $ANTLR start "rule__Objet__QteAssignment_8"
    // InternalGame.g:4470:1: rule__Objet__QteAssignment_8 : ( RULE_INT ) ;
    public final void rule__Objet__QteAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4474:1: ( ( RULE_INT ) )
            // InternalGame.g:4475:2: ( RULE_INT )
            {
            // InternalGame.g:4475:2: ( RULE_INT )
            // InternalGame.g:4476:3: RULE_INT
            {
             before(grammarAccess.getObjetAccess().getQteINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getQteINTTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__QteAssignment_8"


    // $ANTLR start "rule__Objet__TailleAssignment_10"
    // InternalGame.g:4485:1: rule__Objet__TailleAssignment_10 : ( RULE_INT ) ;
    public final void rule__Objet__TailleAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4489:1: ( ( RULE_INT ) )
            // InternalGame.g:4490:2: ( RULE_INT )
            {
            // InternalGame.g:4490:2: ( RULE_INT )
            // InternalGame.g:4491:3: RULE_INT
            {
             before(grammarAccess.getObjetAccess().getTailleINTTerminalRuleCall_10_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getTailleINTTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__TailleAssignment_10"


    // $ANTLR start "rule__Objet__TransformableAssignment_12"
    // InternalGame.g:4500:1: rule__Objet__TransformableAssignment_12 : ( RULE_BOOL ) ;
    public final void rule__Objet__TransformableAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4504:1: ( ( RULE_BOOL ) )
            // InternalGame.g:4505:2: ( RULE_BOOL )
            {
            // InternalGame.g:4505:2: ( RULE_BOOL )
            // InternalGame.g:4506:3: RULE_BOOL
            {
             before(grammarAccess.getObjetAccess().getTransformableBOOLTerminalRuleCall_12_0()); 
            match(input,RULE_BOOL,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getTransformableBOOLTerminalRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__TransformableAssignment_12"


    // $ANTLR start "rule__Interaction__NameAssignment_0"
    // InternalGame.g:4515:1: rule__Interaction__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Interaction__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4519:1: ( ( RULE_ID ) )
            // InternalGame.g:4520:2: ( RULE_ID )
            {
            // InternalGame.g:4520:2: ( RULE_ID )
            // InternalGame.g:4521:3: RULE_ID
            {
             before(grammarAccess.getInteractionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__NameAssignment_0"


    // $ANTLR start "rule__Interaction__QuestionAssignment_3"
    // InternalGame.g:4530:1: rule__Interaction__QuestionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Interaction__QuestionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4534:1: ( ( RULE_STRING ) )
            // InternalGame.g:4535:2: ( RULE_STRING )
            {
            // InternalGame.g:4535:2: ( RULE_STRING )
            // InternalGame.g:4536:3: RULE_STRING
            {
             before(grammarAccess.getInteractionAccess().getQuestionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getQuestionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__QuestionAssignment_3"


    // $ANTLR start "rule__Interaction__ChoixAssignment_4"
    // InternalGame.g:4545:1: rule__Interaction__ChoixAssignment_4 : ( ruleChoix ) ;
    public final void rule__Interaction__ChoixAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4549:1: ( ( ruleChoix ) )
            // InternalGame.g:4550:2: ( ruleChoix )
            {
            // InternalGame.g:4550:2: ( ruleChoix )
            // InternalGame.g:4551:3: ruleChoix
            {
             before(grammarAccess.getInteractionAccess().getChoixChoixParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleChoix();

            state._fsp--;

             after(grammarAccess.getInteractionAccess().getChoixChoixParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__ChoixAssignment_4"


    // $ANTLR start "rule__Choix__NameAssignment_1"
    // InternalGame.g:4560:1: rule__Choix__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Choix__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4564:1: ( ( RULE_ID ) )
            // InternalGame.g:4565:2: ( RULE_ID )
            {
            // InternalGame.g:4565:2: ( RULE_ID )
            // InternalGame.g:4566:3: RULE_ID
            {
             before(grammarAccess.getChoixAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__NameAssignment_1"


    // $ANTLR start "rule__Choix__ReponseAssignment_4"
    // InternalGame.g:4575:1: rule__Choix__ReponseAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Choix__ReponseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4579:1: ( ( RULE_STRING ) )
            // InternalGame.g:4580:2: ( RULE_STRING )
            {
            // InternalGame.g:4580:2: ( RULE_STRING )
            // InternalGame.g:4581:3: RULE_STRING
            {
             before(grammarAccess.getChoixAccess().getReponseSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getReponseSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__ReponseAssignment_4"


    // $ANTLR start "rule__Choix__BonneAssignment_6"
    // InternalGame.g:4590:1: rule__Choix__BonneAssignment_6 : ( RULE_BOOL ) ;
    public final void rule__Choix__BonneAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4594:1: ( ( RULE_BOOL ) )
            // InternalGame.g:4595:2: ( RULE_BOOL )
            {
            // InternalGame.g:4595:2: ( RULE_BOOL )
            // InternalGame.g:4596:3: RULE_BOOL
            {
             before(grammarAccess.getChoixAccess().getBonneBOOLTerminalRuleCall_6_0()); 
            match(input,RULE_BOOL,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getBonneBOOLTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__BonneAssignment_6"


    // $ANTLR start "rule__Choix__ObjetConsAssignment_7_1"
    // InternalGame.g:4605:1: rule__Choix__ObjetConsAssignment_7_1 : ( ruleQteObjet ) ;
    public final void rule__Choix__ObjetConsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4609:1: ( ( ruleQteObjet ) )
            // InternalGame.g:4610:2: ( ruleQteObjet )
            {
            // InternalGame.g:4610:2: ( ruleQteObjet )
            // InternalGame.g:4611:3: ruleQteObjet
            {
             before(grammarAccess.getChoixAccess().getObjetConsQteObjetParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQteObjet();

            state._fsp--;

             after(grammarAccess.getChoixAccess().getObjetConsQteObjetParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__ObjetConsAssignment_7_1"


    // $ANTLR start "rule__Choix__ObjetDonAssignment_8_1_0"
    // InternalGame.g:4620:1: rule__Choix__ObjetDonAssignment_8_1_0 : ( ruleQteObjet ) ;
    public final void rule__Choix__ObjetDonAssignment_8_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4624:1: ( ( ruleQteObjet ) )
            // InternalGame.g:4625:2: ( ruleQteObjet )
            {
            // InternalGame.g:4625:2: ( ruleQteObjet )
            // InternalGame.g:4626:3: ruleQteObjet
            {
             before(grammarAccess.getChoixAccess().getObjetDonQteObjetParserRuleCall_8_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQteObjet();

            state._fsp--;

             after(grammarAccess.getChoixAccess().getObjetDonQteObjetParserRuleCall_8_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__ObjetDonAssignment_8_1_0"


    // $ANTLR start "rule__Choix__ConnaisDonAssignment_8_1_1_1"
    // InternalGame.g:4635:1: rule__Choix__ConnaisDonAssignment_8_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Choix__ConnaisDonAssignment_8_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4639:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:4640:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:4640:2: ( ( RULE_ID ) )
            // InternalGame.g:4641:3: ( RULE_ID )
            {
             before(grammarAccess.getChoixAccess().getConnaisDonConnaissanceCrossReference_8_1_1_1_0()); 
            // InternalGame.g:4642:3: ( RULE_ID )
            // InternalGame.g:4643:4: RULE_ID
            {
             before(grammarAccess.getChoixAccess().getConnaisDonConnaissanceIDTerminalRuleCall_8_1_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getConnaisDonConnaissanceIDTerminalRuleCall_8_1_1_1_0_1()); 

            }

             after(grammarAccess.getChoixAccess().getConnaisDonConnaissanceCrossReference_8_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__ConnaisDonAssignment_8_1_1_1"


    // $ANTLR start "rule__Condition__NameAssignment_0_1"
    // InternalGame.g:4654:1: rule__Condition__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Condition__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4658:1: ( ( RULE_ID ) )
            // InternalGame.g:4659:2: ( RULE_ID )
            {
            // InternalGame.g:4659:2: ( RULE_ID )
            // InternalGame.g:4660:3: RULE_ID
            {
             before(grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__NameAssignment_0_1"


    // $ANTLR start "rule__Condition__ConnaissancesRequisesAssignment_0_3_1_0_1"
    // InternalGame.g:4669:1: rule__Condition__ConnaissancesRequisesAssignment_0_3_1_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Condition__ConnaissancesRequisesAssignment_0_3_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4673:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:4674:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:4674:2: ( ( RULE_ID ) )
            // InternalGame.g:4675:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionAccess().getConnaissancesRequisesConnaissanceCrossReference_0_3_1_0_1_0()); 
            // InternalGame.g:4676:3: ( RULE_ID )
            // InternalGame.g:4677:4: RULE_ID
            {
             before(grammarAccess.getConditionAccess().getConnaissancesRequisesConnaissanceIDTerminalRuleCall_0_3_1_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getConnaissancesRequisesConnaissanceIDTerminalRuleCall_0_3_1_0_1_0_1()); 

            }

             after(grammarAccess.getConditionAccess().getConnaissancesRequisesConnaissanceCrossReference_0_3_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ConnaissancesRequisesAssignment_0_3_1_0_1"


    // $ANTLR start "rule__Condition__ConnaissancesInterditesAssignment_0_3_1_1_1"
    // InternalGame.g:4688:1: rule__Condition__ConnaissancesInterditesAssignment_0_3_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Condition__ConnaissancesInterditesAssignment_0_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4692:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:4693:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:4693:2: ( ( RULE_ID ) )
            // InternalGame.g:4694:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionAccess().getConnaissancesInterditesConnaissanceCrossReference_0_3_1_1_1_0()); 
            // InternalGame.g:4695:3: ( RULE_ID )
            // InternalGame.g:4696:4: RULE_ID
            {
             before(grammarAccess.getConditionAccess().getConnaissancesInterditesConnaissanceIDTerminalRuleCall_0_3_1_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getConnaissancesInterditesConnaissanceIDTerminalRuleCall_0_3_1_1_1_0_1()); 

            }

             after(grammarAccess.getConditionAccess().getConnaissancesInterditesConnaissanceCrossReference_0_3_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ConnaissancesInterditesAssignment_0_3_1_1_1"


    // $ANTLR start "rule__Condition__QuantiteAssignment_0_4_0"
    // InternalGame.g:4707:1: rule__Condition__QuantiteAssignment_0_4_0 : ( RULE_INT ) ;
    public final void rule__Condition__QuantiteAssignment_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4711:1: ( ( RULE_INT ) )
            // InternalGame.g:4712:2: ( RULE_INT )
            {
            // InternalGame.g:4712:2: ( RULE_INT )
            // InternalGame.g:4713:3: RULE_INT
            {
             before(grammarAccess.getConditionAccess().getQuantiteINTTerminalRuleCall_0_4_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getQuantiteINTTerminalRuleCall_0_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__QuantiteAssignment_0_4_0"


    // $ANTLR start "rule__Condition__ObjetsRequisAssignment_0_4_2_0_1"
    // InternalGame.g:4722:1: rule__Condition__ObjetsRequisAssignment_0_4_2_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Condition__ObjetsRequisAssignment_0_4_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4726:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:4727:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:4727:2: ( ( RULE_ID ) )
            // InternalGame.g:4728:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionAccess().getObjetsRequisObjetCrossReference_0_4_2_0_1_0()); 
            // InternalGame.g:4729:3: ( RULE_ID )
            // InternalGame.g:4730:4: RULE_ID
            {
             before(grammarAccess.getConditionAccess().getObjetsRequisObjetIDTerminalRuleCall_0_4_2_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getObjetsRequisObjetIDTerminalRuleCall_0_4_2_0_1_0_1()); 

            }

             after(grammarAccess.getConditionAccess().getObjetsRequisObjetCrossReference_0_4_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ObjetsRequisAssignment_0_4_2_0_1"


    // $ANTLR start "rule__Condition__ObjetsInterditsAssignment_0_4_2_1_1"
    // InternalGame.g:4741:1: rule__Condition__ObjetsInterditsAssignment_0_4_2_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Condition__ObjetsInterditsAssignment_0_4_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4745:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:4746:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:4746:2: ( ( RULE_ID ) )
            // InternalGame.g:4747:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionAccess().getObjetsInterditsObjetCrossReference_0_4_2_1_1_0()); 
            // InternalGame.g:4748:3: ( RULE_ID )
            // InternalGame.g:4749:4: RULE_ID
            {
             before(grammarAccess.getConditionAccess().getObjetsInterditsObjetIDTerminalRuleCall_0_4_2_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getObjetsInterditsObjetIDTerminalRuleCall_0_4_2_1_1_0_1()); 

            }

             after(grammarAccess.getConditionAccess().getObjetsInterditsObjetCrossReference_0_4_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ObjetsInterditsAssignment_0_4_2_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000060082A0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000006008280002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000006008280000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001400020000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000600000020000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000001000020040L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x000C000000000000L});

}