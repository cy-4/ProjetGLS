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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOL", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'consomme'", "'donne'", "'depart'", "'fin'", "'intermediaire'", "'jeu'", "'{'", "'}'", "'territoire'", "'lieu'", "':'", "'chemin'", "'de'", "'vers'", "'visible'", "'obligatoire'", "'ouvert'", "'personne'", "'localisation'", "'actif'", "'interactions'", "'explorateur'", "'taille'", "'disponible'", "'objets'", "'possedes'", "'connaissances'", "'connaissance'", "'objet'", "'quantite'", "'transformable'", "'interaction'", "'question'", "'choix'", "'reponse'", "'condition'", "'requises'", "'interdites'", "'requis'", "'interdits'"
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


    // $ANTLR start "entryRuleTerritoire"
    // InternalGame.g:153:1: entryRuleTerritoire : ruleTerritoire EOF ;
    public final void entryRuleTerritoire() throws RecognitionException {
        try {
            // InternalGame.g:154:1: ( ruleTerritoire EOF )
            // InternalGame.g:155:1: ruleTerritoire EOF
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
    // InternalGame.g:162:1: ruleTerritoire : ( ( rule__Territoire__Group__0 ) ) ;
    public final void ruleTerritoire() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:166:2: ( ( ( rule__Territoire__Group__0 ) ) )
            // InternalGame.g:167:2: ( ( rule__Territoire__Group__0 ) )
            {
            // InternalGame.g:167:2: ( ( rule__Territoire__Group__0 ) )
            // InternalGame.g:168:3: ( rule__Territoire__Group__0 )
            {
             before(grammarAccess.getTerritoireAccess().getGroup()); 
            // InternalGame.g:169:3: ( rule__Territoire__Group__0 )
            // InternalGame.g:169:4: rule__Territoire__Group__0
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


    // $ANTLR start "entryRuleExplorateur"
    // InternalGame.g:253:1: entryRuleExplorateur : ruleExplorateur EOF ;
    public final void entryRuleExplorateur() throws RecognitionException {
        try {
            // InternalGame.g:254:1: ( ruleExplorateur EOF )
            // InternalGame.g:255:1: ruleExplorateur EOF
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
    // InternalGame.g:262:1: ruleExplorateur : ( ( rule__Explorateur__Group__0 ) ) ;
    public final void ruleExplorateur() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:266:2: ( ( ( rule__Explorateur__Group__0 ) ) )
            // InternalGame.g:267:2: ( ( rule__Explorateur__Group__0 ) )
            {
            // InternalGame.g:267:2: ( ( rule__Explorateur__Group__0 ) )
            // InternalGame.g:268:3: ( rule__Explorateur__Group__0 )
            {
             before(grammarAccess.getExplorateurAccess().getGroup()); 
            // InternalGame.g:269:3: ( rule__Explorateur__Group__0 )
            // InternalGame.g:269:4: rule__Explorateur__Group__0
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
    // InternalGame.g:278:1: entryRuleConnaissance : ruleConnaissance EOF ;
    public final void entryRuleConnaissance() throws RecognitionException {
        try {
            // InternalGame.g:279:1: ( ruleConnaissance EOF )
            // InternalGame.g:280:1: ruleConnaissance EOF
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
    // InternalGame.g:287:1: ruleConnaissance : ( ( rule__Connaissance__Group__0 ) ) ;
    public final void ruleConnaissance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:291:2: ( ( ( rule__Connaissance__Group__0 ) ) )
            // InternalGame.g:292:2: ( ( rule__Connaissance__Group__0 ) )
            {
            // InternalGame.g:292:2: ( ( rule__Connaissance__Group__0 ) )
            // InternalGame.g:293:3: ( rule__Connaissance__Group__0 )
            {
             before(grammarAccess.getConnaissanceAccess().getGroup()); 
            // InternalGame.g:294:3: ( rule__Connaissance__Group__0 )
            // InternalGame.g:294:4: rule__Connaissance__Group__0
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
    // InternalGame.g:303:1: entryRuleObjet : ruleObjet EOF ;
    public final void entryRuleObjet() throws RecognitionException {
        try {
            // InternalGame.g:304:1: ( ruleObjet EOF )
            // InternalGame.g:305:1: ruleObjet EOF
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
    // InternalGame.g:312:1: ruleObjet : ( ( rule__Objet__Group__0 ) ) ;
    public final void ruleObjet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:316:2: ( ( ( rule__Objet__Group__0 ) ) )
            // InternalGame.g:317:2: ( ( rule__Objet__Group__0 ) )
            {
            // InternalGame.g:317:2: ( ( rule__Objet__Group__0 ) )
            // InternalGame.g:318:3: ( rule__Objet__Group__0 )
            {
             before(grammarAccess.getObjetAccess().getGroup()); 
            // InternalGame.g:319:3: ( rule__Objet__Group__0 )
            // InternalGame.g:319:4: rule__Objet__Group__0
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
    // InternalGame.g:328:1: entryRuleInteraction : ruleInteraction EOF ;
    public final void entryRuleInteraction() throws RecognitionException {
        try {
            // InternalGame.g:329:1: ( ruleInteraction EOF )
            // InternalGame.g:330:1: ruleInteraction EOF
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
    // InternalGame.g:337:1: ruleInteraction : ( ( rule__Interaction__Group__0 ) ) ;
    public final void ruleInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:341:2: ( ( ( rule__Interaction__Group__0 ) ) )
            // InternalGame.g:342:2: ( ( rule__Interaction__Group__0 ) )
            {
            // InternalGame.g:342:2: ( ( rule__Interaction__Group__0 ) )
            // InternalGame.g:343:3: ( rule__Interaction__Group__0 )
            {
             before(grammarAccess.getInteractionAccess().getGroup()); 
            // InternalGame.g:344:3: ( rule__Interaction__Group__0 )
            // InternalGame.g:344:4: rule__Interaction__Group__0
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
    // InternalGame.g:353:1: entryRuleChoix : ruleChoix EOF ;
    public final void entryRuleChoix() throws RecognitionException {
        try {
            // InternalGame.g:354:1: ( ruleChoix EOF )
            // InternalGame.g:355:1: ruleChoix EOF
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
    // InternalGame.g:362:1: ruleChoix : ( ( rule__Choix__Group__0 ) ) ;
    public final void ruleChoix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:366:2: ( ( ( rule__Choix__Group__0 ) ) )
            // InternalGame.g:367:2: ( ( rule__Choix__Group__0 ) )
            {
            // InternalGame.g:367:2: ( ( rule__Choix__Group__0 ) )
            // InternalGame.g:368:3: ( rule__Choix__Group__0 )
            {
             before(grammarAccess.getChoixAccess().getGroup()); 
            // InternalGame.g:369:3: ( rule__Choix__Group__0 )
            // InternalGame.g:369:4: rule__Choix__Group__0
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
    // InternalGame.g:378:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalGame.g:379:1: ( ruleCondition EOF )
            // InternalGame.g:380:1: ruleCondition EOF
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
    // InternalGame.g:387:1: ruleCondition : ( ( rule__Condition__Alternatives ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:391:2: ( ( ( rule__Condition__Alternatives ) ) )
            // InternalGame.g:392:2: ( ( rule__Condition__Alternatives ) )
            {
            // InternalGame.g:392:2: ( ( rule__Condition__Alternatives ) )
            // InternalGame.g:393:3: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalGame.g:394:3: ( rule__Condition__Alternatives )
            // InternalGame.g:394:4: rule__Condition__Alternatives
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
    // InternalGame.g:403:1: ruleNature : ( ( rule__Nature__Alternatives ) ) ;
    public final void ruleNature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:407:1: ( ( ( rule__Nature__Alternatives ) ) )
            // InternalGame.g:408:2: ( ( rule__Nature__Alternatives ) )
            {
            // InternalGame.g:408:2: ( ( rule__Nature__Alternatives ) )
            // InternalGame.g:409:3: ( rule__Nature__Alternatives )
            {
             before(grammarAccess.getNatureAccess().getAlternatives()); 
            // InternalGame.g:410:3: ( rule__Nature__Alternatives )
            // InternalGame.g:410:4: rule__Nature__Alternatives
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
    // InternalGame.g:418:1: rule__ElementsJeu__Alternatives : ( ( rulePersonne ) | ( ruleAvantage ) | ( rulePlace ) );
    public final void rule__ElementsJeu__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:422:1: ( ( rulePersonne ) | ( ruleAvantage ) | ( rulePlace ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt1=1;
                }
                break;
            case 39:
            case 40:
                {
                alt1=2;
                }
                break;
            case 21:
            case 23:
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
                    // InternalGame.g:423:2: ( rulePersonne )
                    {
                    // InternalGame.g:423:2: ( rulePersonne )
                    // InternalGame.g:424:3: rulePersonne
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
                    // InternalGame.g:429:2: ( ruleAvantage )
                    {
                    // InternalGame.g:429:2: ( ruleAvantage )
                    // InternalGame.g:430:3: ruleAvantage
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
                    // InternalGame.g:435:2: ( rulePlace )
                    {
                    // InternalGame.g:435:2: ( rulePlace )
                    // InternalGame.g:436:3: rulePlace
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
    // InternalGame.g:445:1: rule__Place__Alternatives : ( ( ruleLieu ) | ( ruleChemin ) );
    public final void rule__Place__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:449:1: ( ( ruleLieu ) | ( ruleChemin ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            else if ( (LA2_0==23) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGame.g:450:2: ( ruleLieu )
                    {
                    // InternalGame.g:450:2: ( ruleLieu )
                    // InternalGame.g:451:3: ruleLieu
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
                    // InternalGame.g:456:2: ( ruleChemin )
                    {
                    // InternalGame.g:456:2: ( ruleChemin )
                    // InternalGame.g:457:3: ruleChemin
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
    // InternalGame.g:466:1: rule__Avantage__Alternatives : ( ( ruleConnaissance ) | ( ruleObjet ) );
    public final void rule__Avantage__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:470:1: ( ( ruleConnaissance ) | ( ruleObjet ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==39) ) {
                alt3=1;
            }
            else if ( (LA3_0==40) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGame.g:471:2: ( ruleConnaissance )
                    {
                    // InternalGame.g:471:2: ( ruleConnaissance )
                    // InternalGame.g:472:3: ruleConnaissance
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
                    // InternalGame.g:477:2: ( ruleObjet )
                    {
                    // InternalGame.g:477:2: ( ruleObjet )
                    // InternalGame.g:478:3: ruleObjet
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


    // $ANTLR start "rule__Choix__Alternatives_5_0"
    // InternalGame.g:487:1: rule__Choix__Alternatives_5_0 : ( ( 'consomme' ) | ( 'donne' ) );
    public final void rule__Choix__Alternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:491:1: ( ( 'consomme' ) | ( 'donne' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGame.g:492:2: ( 'consomme' )
                    {
                    // InternalGame.g:492:2: ( 'consomme' )
                    // InternalGame.g:493:3: 'consomme'
                    {
                     before(grammarAccess.getChoixAccess().getConsommeKeyword_5_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getChoixAccess().getConsommeKeyword_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:498:2: ( 'donne' )
                    {
                    // InternalGame.g:498:2: ( 'donne' )
                    // InternalGame.g:499:3: 'donne'
                    {
                     before(grammarAccess.getChoixAccess().getDonneKeyword_5_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getChoixAccess().getDonneKeyword_5_0_1()); 

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
    // $ANTLR end "rule__Choix__Alternatives_5_0"


    // $ANTLR start "rule__Condition__Alternatives"
    // InternalGame.g:508:1: rule__Condition__Alternatives : ( ( ( rule__Condition__Group_0__0 ) ) | ( RULE_BOOL ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:512:1: ( ( ( rule__Condition__Group_0__0 ) ) | ( RULE_BOOL ) )
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
                    // InternalGame.g:513:2: ( ( rule__Condition__Group_0__0 ) )
                    {
                    // InternalGame.g:513:2: ( ( rule__Condition__Group_0__0 ) )
                    // InternalGame.g:514:3: ( rule__Condition__Group_0__0 )
                    {
                     before(grammarAccess.getConditionAccess().getGroup_0()); 
                    // InternalGame.g:515:3: ( rule__Condition__Group_0__0 )
                    // InternalGame.g:515:4: rule__Condition__Group_0__0
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
                    // InternalGame.g:519:2: ( RULE_BOOL )
                    {
                    // InternalGame.g:519:2: ( RULE_BOOL )
                    // InternalGame.g:520:3: RULE_BOOL
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
    // InternalGame.g:529:1: rule__Condition__Alternatives_0_3_1 : ( ( ( rule__Condition__Group_0_3_1_0__0 ) ) | ( ( rule__Condition__Group_0_3_1_1__0 ) ) );
    public final void rule__Condition__Alternatives_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:533:1: ( ( ( rule__Condition__Group_0_3_1_0__0 ) ) | ( ( rule__Condition__Group_0_3_1_1__0 ) ) )
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
                    // InternalGame.g:534:2: ( ( rule__Condition__Group_0_3_1_0__0 ) )
                    {
                    // InternalGame.g:534:2: ( ( rule__Condition__Group_0_3_1_0__0 ) )
                    // InternalGame.g:535:3: ( rule__Condition__Group_0_3_1_0__0 )
                    {
                     before(grammarAccess.getConditionAccess().getGroup_0_3_1_0()); 
                    // InternalGame.g:536:3: ( rule__Condition__Group_0_3_1_0__0 )
                    // InternalGame.g:536:4: rule__Condition__Group_0_3_1_0__0
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
                    // InternalGame.g:540:2: ( ( rule__Condition__Group_0_3_1_1__0 ) )
                    {
                    // InternalGame.g:540:2: ( ( rule__Condition__Group_0_3_1_1__0 ) )
                    // InternalGame.g:541:3: ( rule__Condition__Group_0_3_1_1__0 )
                    {
                     before(grammarAccess.getConditionAccess().getGroup_0_3_1_1()); 
                    // InternalGame.g:542:3: ( rule__Condition__Group_0_3_1_1__0 )
                    // InternalGame.g:542:4: rule__Condition__Group_0_3_1_1__0
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
    // InternalGame.g:550:1: rule__Condition__Alternatives_0_4_2 : ( ( ( rule__Condition__Group_0_4_2_0__0 ) ) | ( ( rule__Condition__Group_0_4_2_1__0 ) ) );
    public final void rule__Condition__Alternatives_0_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:554:1: ( ( ( rule__Condition__Group_0_4_2_0__0 ) ) | ( ( rule__Condition__Group_0_4_2_1__0 ) ) )
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
                    // InternalGame.g:555:2: ( ( rule__Condition__Group_0_4_2_0__0 ) )
                    {
                    // InternalGame.g:555:2: ( ( rule__Condition__Group_0_4_2_0__0 ) )
                    // InternalGame.g:556:3: ( rule__Condition__Group_0_4_2_0__0 )
                    {
                     before(grammarAccess.getConditionAccess().getGroup_0_4_2_0()); 
                    // InternalGame.g:557:3: ( rule__Condition__Group_0_4_2_0__0 )
                    // InternalGame.g:557:4: rule__Condition__Group_0_4_2_0__0
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
                    // InternalGame.g:561:2: ( ( rule__Condition__Group_0_4_2_1__0 ) )
                    {
                    // InternalGame.g:561:2: ( ( rule__Condition__Group_0_4_2_1__0 ) )
                    // InternalGame.g:562:3: ( rule__Condition__Group_0_4_2_1__0 )
                    {
                     before(grammarAccess.getConditionAccess().getGroup_0_4_2_1()); 
                    // InternalGame.g:563:3: ( rule__Condition__Group_0_4_2_1__0 )
                    // InternalGame.g:563:4: rule__Condition__Group_0_4_2_1__0
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
    // InternalGame.g:571:1: rule__Nature__Alternatives : ( ( ( 'depart' ) ) | ( ( 'fin' ) ) | ( ( 'intermediaire' ) ) );
    public final void rule__Nature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:575:1: ( ( ( 'depart' ) ) | ( ( 'fin' ) ) | ( ( 'intermediaire' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt8=1;
                }
                break;
            case 15:
                {
                alt8=2;
                }
                break;
            case 16:
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
                    // InternalGame.g:576:2: ( ( 'depart' ) )
                    {
                    // InternalGame.g:576:2: ( ( 'depart' ) )
                    // InternalGame.g:577:3: ( 'depart' )
                    {
                     before(grammarAccess.getNatureAccess().getDepartEnumLiteralDeclaration_0()); 
                    // InternalGame.g:578:3: ( 'depart' )
                    // InternalGame.g:578:4: 'depart'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getNatureAccess().getDepartEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:582:2: ( ( 'fin' ) )
                    {
                    // InternalGame.g:582:2: ( ( 'fin' ) )
                    // InternalGame.g:583:3: ( 'fin' )
                    {
                     before(grammarAccess.getNatureAccess().getFinEnumLiteralDeclaration_1()); 
                    // InternalGame.g:584:3: ( 'fin' )
                    // InternalGame.g:584:4: 'fin'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getNatureAccess().getFinEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:588:2: ( ( 'intermediaire' ) )
                    {
                    // InternalGame.g:588:2: ( ( 'intermediaire' ) )
                    // InternalGame.g:589:3: ( 'intermediaire' )
                    {
                     before(grammarAccess.getNatureAccess().getInterEnumLiteralDeclaration_2()); 
                    // InternalGame.g:590:3: ( 'intermediaire' )
                    // InternalGame.g:590:4: 'intermediaire'
                    {
                    match(input,16,FOLLOW_2); 

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
    // InternalGame.g:598:1: rule__Jeu__Group__0 : rule__Jeu__Group__0__Impl rule__Jeu__Group__1 ;
    public final void rule__Jeu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:602:1: ( rule__Jeu__Group__0__Impl rule__Jeu__Group__1 )
            // InternalGame.g:603:2: rule__Jeu__Group__0__Impl rule__Jeu__Group__1
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
    // InternalGame.g:610:1: rule__Jeu__Group__0__Impl : ( 'jeu' ) ;
    public final void rule__Jeu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:614:1: ( ( 'jeu' ) )
            // InternalGame.g:615:1: ( 'jeu' )
            {
            // InternalGame.g:615:1: ( 'jeu' )
            // InternalGame.g:616:2: 'jeu'
            {
             before(grammarAccess.getJeuAccess().getJeuKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalGame.g:625:1: rule__Jeu__Group__1 : rule__Jeu__Group__1__Impl rule__Jeu__Group__2 ;
    public final void rule__Jeu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:629:1: ( rule__Jeu__Group__1__Impl rule__Jeu__Group__2 )
            // InternalGame.g:630:2: rule__Jeu__Group__1__Impl rule__Jeu__Group__2
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
    // InternalGame.g:637:1: rule__Jeu__Group__1__Impl : ( ( rule__Jeu__NameAssignment_1 ) ) ;
    public final void rule__Jeu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:641:1: ( ( ( rule__Jeu__NameAssignment_1 ) ) )
            // InternalGame.g:642:1: ( ( rule__Jeu__NameAssignment_1 ) )
            {
            // InternalGame.g:642:1: ( ( rule__Jeu__NameAssignment_1 ) )
            // InternalGame.g:643:2: ( rule__Jeu__NameAssignment_1 )
            {
             before(grammarAccess.getJeuAccess().getNameAssignment_1()); 
            // InternalGame.g:644:2: ( rule__Jeu__NameAssignment_1 )
            // InternalGame.g:644:3: rule__Jeu__NameAssignment_1
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
    // InternalGame.g:652:1: rule__Jeu__Group__2 : rule__Jeu__Group__2__Impl rule__Jeu__Group__3 ;
    public final void rule__Jeu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:656:1: ( rule__Jeu__Group__2__Impl rule__Jeu__Group__3 )
            // InternalGame.g:657:2: rule__Jeu__Group__2__Impl rule__Jeu__Group__3
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
    // InternalGame.g:664:1: rule__Jeu__Group__2__Impl : ( '{' ) ;
    public final void rule__Jeu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:668:1: ( ( '{' ) )
            // InternalGame.g:669:1: ( '{' )
            {
            // InternalGame.g:669:1: ( '{' )
            // InternalGame.g:670:2: '{'
            {
             before(grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGame.g:679:1: rule__Jeu__Group__3 : rule__Jeu__Group__3__Impl rule__Jeu__Group__4 ;
    public final void rule__Jeu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:683:1: ( rule__Jeu__Group__3__Impl rule__Jeu__Group__4 )
            // InternalGame.g:684:2: rule__Jeu__Group__3__Impl rule__Jeu__Group__4
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
    // InternalGame.g:691:1: rule__Jeu__Group__3__Impl : ( ( rule__Jeu__TerritoireAssignment_3 ) ) ;
    public final void rule__Jeu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:695:1: ( ( ( rule__Jeu__TerritoireAssignment_3 ) ) )
            // InternalGame.g:696:1: ( ( rule__Jeu__TerritoireAssignment_3 ) )
            {
            // InternalGame.g:696:1: ( ( rule__Jeu__TerritoireAssignment_3 ) )
            // InternalGame.g:697:2: ( rule__Jeu__TerritoireAssignment_3 )
            {
             before(grammarAccess.getJeuAccess().getTerritoireAssignment_3()); 
            // InternalGame.g:698:2: ( rule__Jeu__TerritoireAssignment_3 )
            // InternalGame.g:698:3: rule__Jeu__TerritoireAssignment_3
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
    // InternalGame.g:706:1: rule__Jeu__Group__4 : rule__Jeu__Group__4__Impl rule__Jeu__Group__5 ;
    public final void rule__Jeu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:710:1: ( rule__Jeu__Group__4__Impl rule__Jeu__Group__5 )
            // InternalGame.g:711:2: rule__Jeu__Group__4__Impl rule__Jeu__Group__5
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
    // InternalGame.g:718:1: rule__Jeu__Group__4__Impl : ( ( rule__Jeu__ExplorateurAssignment_4 ) ) ;
    public final void rule__Jeu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:722:1: ( ( ( rule__Jeu__ExplorateurAssignment_4 ) ) )
            // InternalGame.g:723:1: ( ( rule__Jeu__ExplorateurAssignment_4 ) )
            {
            // InternalGame.g:723:1: ( ( rule__Jeu__ExplorateurAssignment_4 ) )
            // InternalGame.g:724:2: ( rule__Jeu__ExplorateurAssignment_4 )
            {
             before(grammarAccess.getJeuAccess().getExplorateurAssignment_4()); 
            // InternalGame.g:725:2: ( rule__Jeu__ExplorateurAssignment_4 )
            // InternalGame.g:725:3: rule__Jeu__ExplorateurAssignment_4
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
    // InternalGame.g:733:1: rule__Jeu__Group__5 : rule__Jeu__Group__5__Impl rule__Jeu__Group__6 ;
    public final void rule__Jeu__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:737:1: ( rule__Jeu__Group__5__Impl rule__Jeu__Group__6 )
            // InternalGame.g:738:2: rule__Jeu__Group__5__Impl rule__Jeu__Group__6
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
    // InternalGame.g:745:1: rule__Jeu__Group__5__Impl : ( ( rule__Jeu__ElementsjeuAssignment_5 )* ) ;
    public final void rule__Jeu__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:749:1: ( ( ( rule__Jeu__ElementsjeuAssignment_5 )* ) )
            // InternalGame.g:750:1: ( ( rule__Jeu__ElementsjeuAssignment_5 )* )
            {
            // InternalGame.g:750:1: ( ( rule__Jeu__ElementsjeuAssignment_5 )* )
            // InternalGame.g:751:2: ( rule__Jeu__ElementsjeuAssignment_5 )*
            {
             before(grammarAccess.getJeuAccess().getElementsjeuAssignment_5()); 
            // InternalGame.g:752:2: ( rule__Jeu__ElementsjeuAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21||LA9_0==23||LA9_0==29||(LA9_0>=39 && LA9_0<=40)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGame.g:752:3: rule__Jeu__ElementsjeuAssignment_5
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
    // InternalGame.g:760:1: rule__Jeu__Group__6 : rule__Jeu__Group__6__Impl ;
    public final void rule__Jeu__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:764:1: ( rule__Jeu__Group__6__Impl )
            // InternalGame.g:765:2: rule__Jeu__Group__6__Impl
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
    // InternalGame.g:771:1: rule__Jeu__Group__6__Impl : ( '}' ) ;
    public final void rule__Jeu__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:775:1: ( ( '}' ) )
            // InternalGame.g:776:1: ( '}' )
            {
            // InternalGame.g:776:1: ( '}' )
            // InternalGame.g:777:2: '}'
            {
             before(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
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


    // $ANTLR start "rule__Territoire__Group__0"
    // InternalGame.g:787:1: rule__Territoire__Group__0 : rule__Territoire__Group__0__Impl rule__Territoire__Group__1 ;
    public final void rule__Territoire__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:791:1: ( rule__Territoire__Group__0__Impl rule__Territoire__Group__1 )
            // InternalGame.g:792:2: rule__Territoire__Group__0__Impl rule__Territoire__Group__1
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
    // InternalGame.g:799:1: rule__Territoire__Group__0__Impl : ( 'territoire' ) ;
    public final void rule__Territoire__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:803:1: ( ( 'territoire' ) )
            // InternalGame.g:804:1: ( 'territoire' )
            {
            // InternalGame.g:804:1: ( 'territoire' )
            // InternalGame.g:805:2: 'territoire'
            {
             before(grammarAccess.getTerritoireAccess().getTerritoireKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalGame.g:814:1: rule__Territoire__Group__1 : rule__Territoire__Group__1__Impl rule__Territoire__Group__2 ;
    public final void rule__Territoire__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:818:1: ( rule__Territoire__Group__1__Impl rule__Territoire__Group__2 )
            // InternalGame.g:819:2: rule__Territoire__Group__1__Impl rule__Territoire__Group__2
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
    // InternalGame.g:826:1: rule__Territoire__Group__1__Impl : ( '{' ) ;
    public final void rule__Territoire__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:830:1: ( ( '{' ) )
            // InternalGame.g:831:1: ( '{' )
            {
            // InternalGame.g:831:1: ( '{' )
            // InternalGame.g:832:2: '{'
            {
             before(grammarAccess.getTerritoireAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGame.g:841:1: rule__Territoire__Group__2 : rule__Territoire__Group__2__Impl rule__Territoire__Group__3 ;
    public final void rule__Territoire__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:845:1: ( rule__Territoire__Group__2__Impl rule__Territoire__Group__3 )
            // InternalGame.g:846:2: rule__Territoire__Group__2__Impl rule__Territoire__Group__3
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
    // InternalGame.g:853:1: rule__Territoire__Group__2__Impl : ( ( ( rule__Territoire__PlacesAssignment_2 ) ) ( ( rule__Territoire__PlacesAssignment_2 )* ) ) ;
    public final void rule__Territoire__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:857:1: ( ( ( ( rule__Territoire__PlacesAssignment_2 ) ) ( ( rule__Territoire__PlacesAssignment_2 )* ) ) )
            // InternalGame.g:858:1: ( ( ( rule__Territoire__PlacesAssignment_2 ) ) ( ( rule__Territoire__PlacesAssignment_2 )* ) )
            {
            // InternalGame.g:858:1: ( ( ( rule__Territoire__PlacesAssignment_2 ) ) ( ( rule__Territoire__PlacesAssignment_2 )* ) )
            // InternalGame.g:859:2: ( ( rule__Territoire__PlacesAssignment_2 ) ) ( ( rule__Territoire__PlacesAssignment_2 )* )
            {
            // InternalGame.g:859:2: ( ( rule__Territoire__PlacesAssignment_2 ) )
            // InternalGame.g:860:3: ( rule__Territoire__PlacesAssignment_2 )
            {
             before(grammarAccess.getTerritoireAccess().getPlacesAssignment_2()); 
            // InternalGame.g:861:3: ( rule__Territoire__PlacesAssignment_2 )
            // InternalGame.g:861:4: rule__Territoire__PlacesAssignment_2
            {
            pushFollow(FOLLOW_8);
            rule__Territoire__PlacesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTerritoireAccess().getPlacesAssignment_2()); 

            }

            // InternalGame.g:864:2: ( ( rule__Territoire__PlacesAssignment_2 )* )
            // InternalGame.g:865:3: ( rule__Territoire__PlacesAssignment_2 )*
            {
             before(grammarAccess.getTerritoireAccess().getPlacesAssignment_2()); 
            // InternalGame.g:866:3: ( rule__Territoire__PlacesAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21||LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGame.g:866:4: rule__Territoire__PlacesAssignment_2
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
    // InternalGame.g:875:1: rule__Territoire__Group__3 : rule__Territoire__Group__3__Impl ;
    public final void rule__Territoire__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:879:1: ( rule__Territoire__Group__3__Impl )
            // InternalGame.g:880:2: rule__Territoire__Group__3__Impl
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
    // InternalGame.g:886:1: rule__Territoire__Group__3__Impl : ( '}' ) ;
    public final void rule__Territoire__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:890:1: ( ( '}' ) )
            // InternalGame.g:891:1: ( '}' )
            {
            // InternalGame.g:891:1: ( '}' )
            // InternalGame.g:892:2: '}'
            {
             before(grammarAccess.getTerritoireAccess().getRightCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGame.g:902:1: rule__Lieu__Group__0 : rule__Lieu__Group__0__Impl rule__Lieu__Group__1 ;
    public final void rule__Lieu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:906:1: ( rule__Lieu__Group__0__Impl rule__Lieu__Group__1 )
            // InternalGame.g:907:2: rule__Lieu__Group__0__Impl rule__Lieu__Group__1
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
    // InternalGame.g:914:1: rule__Lieu__Group__0__Impl : ( 'lieu' ) ;
    public final void rule__Lieu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:918:1: ( ( 'lieu' ) )
            // InternalGame.g:919:1: ( 'lieu' )
            {
            // InternalGame.g:919:1: ( 'lieu' )
            // InternalGame.g:920:2: 'lieu'
            {
             before(grammarAccess.getLieuAccess().getLieuKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalGame.g:929:1: rule__Lieu__Group__1 : rule__Lieu__Group__1__Impl rule__Lieu__Group__2 ;
    public final void rule__Lieu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:933:1: ( rule__Lieu__Group__1__Impl rule__Lieu__Group__2 )
            // InternalGame.g:934:2: rule__Lieu__Group__1__Impl rule__Lieu__Group__2
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
    // InternalGame.g:941:1: rule__Lieu__Group__1__Impl : ( ( rule__Lieu__NameAssignment_1 ) ) ;
    public final void rule__Lieu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:945:1: ( ( ( rule__Lieu__NameAssignment_1 ) ) )
            // InternalGame.g:946:1: ( ( rule__Lieu__NameAssignment_1 ) )
            {
            // InternalGame.g:946:1: ( ( rule__Lieu__NameAssignment_1 ) )
            // InternalGame.g:947:2: ( rule__Lieu__NameAssignment_1 )
            {
             before(grammarAccess.getLieuAccess().getNameAssignment_1()); 
            // InternalGame.g:948:2: ( rule__Lieu__NameAssignment_1 )
            // InternalGame.g:948:3: rule__Lieu__NameAssignment_1
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
    // InternalGame.g:956:1: rule__Lieu__Group__2 : rule__Lieu__Group__2__Impl rule__Lieu__Group__3 ;
    public final void rule__Lieu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:960:1: ( rule__Lieu__Group__2__Impl rule__Lieu__Group__3 )
            // InternalGame.g:961:2: rule__Lieu__Group__2__Impl rule__Lieu__Group__3
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
    // InternalGame.g:968:1: rule__Lieu__Group__2__Impl : ( ':' ) ;
    public final void rule__Lieu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:972:1: ( ( ':' ) )
            // InternalGame.g:973:1: ( ':' )
            {
            // InternalGame.g:973:1: ( ':' )
            // InternalGame.g:974:2: ':'
            {
             before(grammarAccess.getLieuAccess().getColonKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGame.g:983:1: rule__Lieu__Group__3 : rule__Lieu__Group__3__Impl ;
    public final void rule__Lieu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:987:1: ( rule__Lieu__Group__3__Impl )
            // InternalGame.g:988:2: rule__Lieu__Group__3__Impl
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
    // InternalGame.g:994:1: rule__Lieu__Group__3__Impl : ( ( rule__Lieu__NatureAssignment_3 ) ) ;
    public final void rule__Lieu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:998:1: ( ( ( rule__Lieu__NatureAssignment_3 ) ) )
            // InternalGame.g:999:1: ( ( rule__Lieu__NatureAssignment_3 ) )
            {
            // InternalGame.g:999:1: ( ( rule__Lieu__NatureAssignment_3 ) )
            // InternalGame.g:1000:2: ( rule__Lieu__NatureAssignment_3 )
            {
             before(grammarAccess.getLieuAccess().getNatureAssignment_3()); 
            // InternalGame.g:1001:2: ( rule__Lieu__NatureAssignment_3 )
            // InternalGame.g:1001:3: rule__Lieu__NatureAssignment_3
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
    // InternalGame.g:1010:1: rule__Chemin__Group__0 : rule__Chemin__Group__0__Impl rule__Chemin__Group__1 ;
    public final void rule__Chemin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1014:1: ( rule__Chemin__Group__0__Impl rule__Chemin__Group__1 )
            // InternalGame.g:1015:2: rule__Chemin__Group__0__Impl rule__Chemin__Group__1
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
    // InternalGame.g:1022:1: rule__Chemin__Group__0__Impl : ( 'chemin' ) ;
    public final void rule__Chemin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1026:1: ( ( 'chemin' ) )
            // InternalGame.g:1027:1: ( 'chemin' )
            {
            // InternalGame.g:1027:1: ( 'chemin' )
            // InternalGame.g:1028:2: 'chemin'
            {
             before(grammarAccess.getCheminAccess().getCheminKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGame.g:1037:1: rule__Chemin__Group__1 : rule__Chemin__Group__1__Impl rule__Chemin__Group__2 ;
    public final void rule__Chemin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1041:1: ( rule__Chemin__Group__1__Impl rule__Chemin__Group__2 )
            // InternalGame.g:1042:2: rule__Chemin__Group__1__Impl rule__Chemin__Group__2
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
    // InternalGame.g:1049:1: rule__Chemin__Group__1__Impl : ( ( rule__Chemin__NameAssignment_1 ) ) ;
    public final void rule__Chemin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1053:1: ( ( ( rule__Chemin__NameAssignment_1 ) ) )
            // InternalGame.g:1054:1: ( ( rule__Chemin__NameAssignment_1 ) )
            {
            // InternalGame.g:1054:1: ( ( rule__Chemin__NameAssignment_1 ) )
            // InternalGame.g:1055:2: ( rule__Chemin__NameAssignment_1 )
            {
             before(grammarAccess.getCheminAccess().getNameAssignment_1()); 
            // InternalGame.g:1056:2: ( rule__Chemin__NameAssignment_1 )
            // InternalGame.g:1056:3: rule__Chemin__NameAssignment_1
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
    // InternalGame.g:1064:1: rule__Chemin__Group__2 : rule__Chemin__Group__2__Impl rule__Chemin__Group__3 ;
    public final void rule__Chemin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1068:1: ( rule__Chemin__Group__2__Impl rule__Chemin__Group__3 )
            // InternalGame.g:1069:2: rule__Chemin__Group__2__Impl rule__Chemin__Group__3
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
    // InternalGame.g:1076:1: rule__Chemin__Group__2__Impl : ( '{' ) ;
    public final void rule__Chemin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1080:1: ( ( '{' ) )
            // InternalGame.g:1081:1: ( '{' )
            {
            // InternalGame.g:1081:1: ( '{' )
            // InternalGame.g:1082:2: '{'
            {
             before(grammarAccess.getCheminAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGame.g:1091:1: rule__Chemin__Group__3 : rule__Chemin__Group__3__Impl rule__Chemin__Group__4 ;
    public final void rule__Chemin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1095:1: ( rule__Chemin__Group__3__Impl rule__Chemin__Group__4 )
            // InternalGame.g:1096:2: rule__Chemin__Group__3__Impl rule__Chemin__Group__4
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
    // InternalGame.g:1103:1: rule__Chemin__Group__3__Impl : ( 'de' ) ;
    public final void rule__Chemin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1107:1: ( ( 'de' ) )
            // InternalGame.g:1108:1: ( 'de' )
            {
            // InternalGame.g:1108:1: ( 'de' )
            // InternalGame.g:1109:2: 'de'
            {
             before(grammarAccess.getCheminAccess().getDeKeyword_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalGame.g:1118:1: rule__Chemin__Group__4 : rule__Chemin__Group__4__Impl rule__Chemin__Group__5 ;
    public final void rule__Chemin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1122:1: ( rule__Chemin__Group__4__Impl rule__Chemin__Group__5 )
            // InternalGame.g:1123:2: rule__Chemin__Group__4__Impl rule__Chemin__Group__5
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
    // InternalGame.g:1130:1: rule__Chemin__Group__4__Impl : ( ( rule__Chemin__PredAssignment_4 ) ) ;
    public final void rule__Chemin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1134:1: ( ( ( rule__Chemin__PredAssignment_4 ) ) )
            // InternalGame.g:1135:1: ( ( rule__Chemin__PredAssignment_4 ) )
            {
            // InternalGame.g:1135:1: ( ( rule__Chemin__PredAssignment_4 ) )
            // InternalGame.g:1136:2: ( rule__Chemin__PredAssignment_4 )
            {
             before(grammarAccess.getCheminAccess().getPredAssignment_4()); 
            // InternalGame.g:1137:2: ( rule__Chemin__PredAssignment_4 )
            // InternalGame.g:1137:3: rule__Chemin__PredAssignment_4
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
    // InternalGame.g:1145:1: rule__Chemin__Group__5 : rule__Chemin__Group__5__Impl rule__Chemin__Group__6 ;
    public final void rule__Chemin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1149:1: ( rule__Chemin__Group__5__Impl rule__Chemin__Group__6 )
            // InternalGame.g:1150:2: rule__Chemin__Group__5__Impl rule__Chemin__Group__6
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
    // InternalGame.g:1157:1: rule__Chemin__Group__5__Impl : ( 'vers' ) ;
    public final void rule__Chemin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1161:1: ( ( 'vers' ) )
            // InternalGame.g:1162:1: ( 'vers' )
            {
            // InternalGame.g:1162:1: ( 'vers' )
            // InternalGame.g:1163:2: 'vers'
            {
             before(grammarAccess.getCheminAccess().getVersKeyword_5()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGame.g:1172:1: rule__Chemin__Group__6 : rule__Chemin__Group__6__Impl rule__Chemin__Group__7 ;
    public final void rule__Chemin__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1176:1: ( rule__Chemin__Group__6__Impl rule__Chemin__Group__7 )
            // InternalGame.g:1177:2: rule__Chemin__Group__6__Impl rule__Chemin__Group__7
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
    // InternalGame.g:1184:1: rule__Chemin__Group__6__Impl : ( ( rule__Chemin__SuccAssignment_6 ) ) ;
    public final void rule__Chemin__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1188:1: ( ( ( rule__Chemin__SuccAssignment_6 ) ) )
            // InternalGame.g:1189:1: ( ( rule__Chemin__SuccAssignment_6 ) )
            {
            // InternalGame.g:1189:1: ( ( rule__Chemin__SuccAssignment_6 ) )
            // InternalGame.g:1190:2: ( rule__Chemin__SuccAssignment_6 )
            {
             before(grammarAccess.getCheminAccess().getSuccAssignment_6()); 
            // InternalGame.g:1191:2: ( rule__Chemin__SuccAssignment_6 )
            // InternalGame.g:1191:3: rule__Chemin__SuccAssignment_6
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
    // InternalGame.g:1199:1: rule__Chemin__Group__7 : rule__Chemin__Group__7__Impl rule__Chemin__Group__8 ;
    public final void rule__Chemin__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1203:1: ( rule__Chemin__Group__7__Impl rule__Chemin__Group__8 )
            // InternalGame.g:1204:2: rule__Chemin__Group__7__Impl rule__Chemin__Group__8
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
    // InternalGame.g:1211:1: rule__Chemin__Group__7__Impl : ( 'visible' ) ;
    public final void rule__Chemin__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1215:1: ( ( 'visible' ) )
            // InternalGame.g:1216:1: ( 'visible' )
            {
            // InternalGame.g:1216:1: ( 'visible' )
            // InternalGame.g:1217:2: 'visible'
            {
             before(grammarAccess.getCheminAccess().getVisibleKeyword_7()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGame.g:1226:1: rule__Chemin__Group__8 : rule__Chemin__Group__8__Impl rule__Chemin__Group__9 ;
    public final void rule__Chemin__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1230:1: ( rule__Chemin__Group__8__Impl rule__Chemin__Group__9 )
            // InternalGame.g:1231:2: rule__Chemin__Group__8__Impl rule__Chemin__Group__9
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
    // InternalGame.g:1238:1: rule__Chemin__Group__8__Impl : ( ( rule__Chemin__VisibleAssignment_8 ) ) ;
    public final void rule__Chemin__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1242:1: ( ( ( rule__Chemin__VisibleAssignment_8 ) ) )
            // InternalGame.g:1243:1: ( ( rule__Chemin__VisibleAssignment_8 ) )
            {
            // InternalGame.g:1243:1: ( ( rule__Chemin__VisibleAssignment_8 ) )
            // InternalGame.g:1244:2: ( rule__Chemin__VisibleAssignment_8 )
            {
             before(grammarAccess.getCheminAccess().getVisibleAssignment_8()); 
            // InternalGame.g:1245:2: ( rule__Chemin__VisibleAssignment_8 )
            // InternalGame.g:1245:3: rule__Chemin__VisibleAssignment_8
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
    // InternalGame.g:1253:1: rule__Chemin__Group__9 : rule__Chemin__Group__9__Impl rule__Chemin__Group__10 ;
    public final void rule__Chemin__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1257:1: ( rule__Chemin__Group__9__Impl rule__Chemin__Group__10 )
            // InternalGame.g:1258:2: rule__Chemin__Group__9__Impl rule__Chemin__Group__10
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
    // InternalGame.g:1265:1: rule__Chemin__Group__9__Impl : ( 'obligatoire' ) ;
    public final void rule__Chemin__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1269:1: ( ( 'obligatoire' ) )
            // InternalGame.g:1270:1: ( 'obligatoire' )
            {
            // InternalGame.g:1270:1: ( 'obligatoire' )
            // InternalGame.g:1271:2: 'obligatoire'
            {
             before(grammarAccess.getCheminAccess().getObligatoireKeyword_9()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGame.g:1280:1: rule__Chemin__Group__10 : rule__Chemin__Group__10__Impl rule__Chemin__Group__11 ;
    public final void rule__Chemin__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1284:1: ( rule__Chemin__Group__10__Impl rule__Chemin__Group__11 )
            // InternalGame.g:1285:2: rule__Chemin__Group__10__Impl rule__Chemin__Group__11
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
    // InternalGame.g:1292:1: rule__Chemin__Group__10__Impl : ( ( rule__Chemin__ObligatoireAssignment_10 ) ) ;
    public final void rule__Chemin__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1296:1: ( ( ( rule__Chemin__ObligatoireAssignment_10 ) ) )
            // InternalGame.g:1297:1: ( ( rule__Chemin__ObligatoireAssignment_10 ) )
            {
            // InternalGame.g:1297:1: ( ( rule__Chemin__ObligatoireAssignment_10 ) )
            // InternalGame.g:1298:2: ( rule__Chemin__ObligatoireAssignment_10 )
            {
             before(grammarAccess.getCheminAccess().getObligatoireAssignment_10()); 
            // InternalGame.g:1299:2: ( rule__Chemin__ObligatoireAssignment_10 )
            // InternalGame.g:1299:3: rule__Chemin__ObligatoireAssignment_10
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
    // InternalGame.g:1307:1: rule__Chemin__Group__11 : rule__Chemin__Group__11__Impl rule__Chemin__Group__12 ;
    public final void rule__Chemin__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1311:1: ( rule__Chemin__Group__11__Impl rule__Chemin__Group__12 )
            // InternalGame.g:1312:2: rule__Chemin__Group__11__Impl rule__Chemin__Group__12
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
    // InternalGame.g:1319:1: rule__Chemin__Group__11__Impl : ( 'ouvert' ) ;
    public final void rule__Chemin__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1323:1: ( ( 'ouvert' ) )
            // InternalGame.g:1324:1: ( 'ouvert' )
            {
            // InternalGame.g:1324:1: ( 'ouvert' )
            // InternalGame.g:1325:2: 'ouvert'
            {
             before(grammarAccess.getCheminAccess().getOuvertKeyword_11()); 
            match(input,28,FOLLOW_2); 
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
    // InternalGame.g:1334:1: rule__Chemin__Group__12 : rule__Chemin__Group__12__Impl rule__Chemin__Group__13 ;
    public final void rule__Chemin__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1338:1: ( rule__Chemin__Group__12__Impl rule__Chemin__Group__13 )
            // InternalGame.g:1339:2: rule__Chemin__Group__12__Impl rule__Chemin__Group__13
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
    // InternalGame.g:1346:1: rule__Chemin__Group__12__Impl : ( ( rule__Chemin__OuvertAssignment_12 ) ) ;
    public final void rule__Chemin__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1350:1: ( ( ( rule__Chemin__OuvertAssignment_12 ) ) )
            // InternalGame.g:1351:1: ( ( rule__Chemin__OuvertAssignment_12 ) )
            {
            // InternalGame.g:1351:1: ( ( rule__Chemin__OuvertAssignment_12 ) )
            // InternalGame.g:1352:2: ( rule__Chemin__OuvertAssignment_12 )
            {
             before(grammarAccess.getCheminAccess().getOuvertAssignment_12()); 
            // InternalGame.g:1353:2: ( rule__Chemin__OuvertAssignment_12 )
            // InternalGame.g:1353:3: rule__Chemin__OuvertAssignment_12
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
    // InternalGame.g:1361:1: rule__Chemin__Group__13 : rule__Chemin__Group__13__Impl ;
    public final void rule__Chemin__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1365:1: ( rule__Chemin__Group__13__Impl )
            // InternalGame.g:1366:2: rule__Chemin__Group__13__Impl
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
    // InternalGame.g:1372:1: rule__Chemin__Group__13__Impl : ( '}' ) ;
    public final void rule__Chemin__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1376:1: ( ( '}' ) )
            // InternalGame.g:1377:1: ( '}' )
            {
            // InternalGame.g:1377:1: ( '}' )
            // InternalGame.g:1378:2: '}'
            {
             before(grammarAccess.getCheminAccess().getRightCurlyBracketKeyword_13()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGame.g:1388:1: rule__Personne__Group__0 : rule__Personne__Group__0__Impl rule__Personne__Group__1 ;
    public final void rule__Personne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1392:1: ( rule__Personne__Group__0__Impl rule__Personne__Group__1 )
            // InternalGame.g:1393:2: rule__Personne__Group__0__Impl rule__Personne__Group__1
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
    // InternalGame.g:1400:1: rule__Personne__Group__0__Impl : ( 'personne' ) ;
    public final void rule__Personne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1404:1: ( ( 'personne' ) )
            // InternalGame.g:1405:1: ( 'personne' )
            {
            // InternalGame.g:1405:1: ( 'personne' )
            // InternalGame.g:1406:2: 'personne'
            {
             before(grammarAccess.getPersonneAccess().getPersonneKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalGame.g:1415:1: rule__Personne__Group__1 : rule__Personne__Group__1__Impl rule__Personne__Group__2 ;
    public final void rule__Personne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1419:1: ( rule__Personne__Group__1__Impl rule__Personne__Group__2 )
            // InternalGame.g:1420:2: rule__Personne__Group__1__Impl rule__Personne__Group__2
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
    // InternalGame.g:1427:1: rule__Personne__Group__1__Impl : ( ( rule__Personne__NameAssignment_1 ) ) ;
    public final void rule__Personne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1431:1: ( ( ( rule__Personne__NameAssignment_1 ) ) )
            // InternalGame.g:1432:1: ( ( rule__Personne__NameAssignment_1 ) )
            {
            // InternalGame.g:1432:1: ( ( rule__Personne__NameAssignment_1 ) )
            // InternalGame.g:1433:2: ( rule__Personne__NameAssignment_1 )
            {
             before(grammarAccess.getPersonneAccess().getNameAssignment_1()); 
            // InternalGame.g:1434:2: ( rule__Personne__NameAssignment_1 )
            // InternalGame.g:1434:3: rule__Personne__NameAssignment_1
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
    // InternalGame.g:1442:1: rule__Personne__Group__2 : rule__Personne__Group__2__Impl rule__Personne__Group__3 ;
    public final void rule__Personne__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1446:1: ( rule__Personne__Group__2__Impl rule__Personne__Group__3 )
            // InternalGame.g:1447:2: rule__Personne__Group__2__Impl rule__Personne__Group__3
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
    // InternalGame.g:1454:1: rule__Personne__Group__2__Impl : ( '{' ) ;
    public final void rule__Personne__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1458:1: ( ( '{' ) )
            // InternalGame.g:1459:1: ( '{' )
            {
            // InternalGame.g:1459:1: ( '{' )
            // InternalGame.g:1460:2: '{'
            {
             before(grammarAccess.getPersonneAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGame.g:1469:1: rule__Personne__Group__3 : rule__Personne__Group__3__Impl rule__Personne__Group__4 ;
    public final void rule__Personne__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1473:1: ( rule__Personne__Group__3__Impl rule__Personne__Group__4 )
            // InternalGame.g:1474:2: rule__Personne__Group__3__Impl rule__Personne__Group__4
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
    // InternalGame.g:1481:1: rule__Personne__Group__3__Impl : ( 'localisation' ) ;
    public final void rule__Personne__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1485:1: ( ( 'localisation' ) )
            // InternalGame.g:1486:1: ( 'localisation' )
            {
            // InternalGame.g:1486:1: ( 'localisation' )
            // InternalGame.g:1487:2: 'localisation'
            {
             before(grammarAccess.getPersonneAccess().getLocalisationKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalGame.g:1496:1: rule__Personne__Group__4 : rule__Personne__Group__4__Impl rule__Personne__Group__5 ;
    public final void rule__Personne__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1500:1: ( rule__Personne__Group__4__Impl rule__Personne__Group__5 )
            // InternalGame.g:1501:2: rule__Personne__Group__4__Impl rule__Personne__Group__5
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
    // InternalGame.g:1508:1: rule__Personne__Group__4__Impl : ( ( rule__Personne__PlaceAssignment_4 ) ) ;
    public final void rule__Personne__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1512:1: ( ( ( rule__Personne__PlaceAssignment_4 ) ) )
            // InternalGame.g:1513:1: ( ( rule__Personne__PlaceAssignment_4 ) )
            {
            // InternalGame.g:1513:1: ( ( rule__Personne__PlaceAssignment_4 ) )
            // InternalGame.g:1514:2: ( rule__Personne__PlaceAssignment_4 )
            {
             before(grammarAccess.getPersonneAccess().getPlaceAssignment_4()); 
            // InternalGame.g:1515:2: ( rule__Personne__PlaceAssignment_4 )
            // InternalGame.g:1515:3: rule__Personne__PlaceAssignment_4
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
    // InternalGame.g:1523:1: rule__Personne__Group__5 : rule__Personne__Group__5__Impl rule__Personne__Group__6 ;
    public final void rule__Personne__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1527:1: ( rule__Personne__Group__5__Impl rule__Personne__Group__6 )
            // InternalGame.g:1528:2: rule__Personne__Group__5__Impl rule__Personne__Group__6
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
    // InternalGame.g:1535:1: rule__Personne__Group__5__Impl : ( 'visible' ) ;
    public final void rule__Personne__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1539:1: ( ( 'visible' ) )
            // InternalGame.g:1540:1: ( 'visible' )
            {
            // InternalGame.g:1540:1: ( 'visible' )
            // InternalGame.g:1541:2: 'visible'
            {
             before(grammarAccess.getPersonneAccess().getVisibleKeyword_5()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGame.g:1550:1: rule__Personne__Group__6 : rule__Personne__Group__6__Impl rule__Personne__Group__7 ;
    public final void rule__Personne__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1554:1: ( rule__Personne__Group__6__Impl rule__Personne__Group__7 )
            // InternalGame.g:1555:2: rule__Personne__Group__6__Impl rule__Personne__Group__7
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
    // InternalGame.g:1562:1: rule__Personne__Group__6__Impl : ( ( rule__Personne__VisibleAssignment_6 ) ) ;
    public final void rule__Personne__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1566:1: ( ( ( rule__Personne__VisibleAssignment_6 ) ) )
            // InternalGame.g:1567:1: ( ( rule__Personne__VisibleAssignment_6 ) )
            {
            // InternalGame.g:1567:1: ( ( rule__Personne__VisibleAssignment_6 ) )
            // InternalGame.g:1568:2: ( rule__Personne__VisibleAssignment_6 )
            {
             before(grammarAccess.getPersonneAccess().getVisibleAssignment_6()); 
            // InternalGame.g:1569:2: ( rule__Personne__VisibleAssignment_6 )
            // InternalGame.g:1569:3: rule__Personne__VisibleAssignment_6
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
    // InternalGame.g:1577:1: rule__Personne__Group__7 : rule__Personne__Group__7__Impl rule__Personne__Group__8 ;
    public final void rule__Personne__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1581:1: ( rule__Personne__Group__7__Impl rule__Personne__Group__8 )
            // InternalGame.g:1582:2: rule__Personne__Group__7__Impl rule__Personne__Group__8
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
    // InternalGame.g:1589:1: rule__Personne__Group__7__Impl : ( 'actif' ) ;
    public final void rule__Personne__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1593:1: ( ( 'actif' ) )
            // InternalGame.g:1594:1: ( 'actif' )
            {
            // InternalGame.g:1594:1: ( 'actif' )
            // InternalGame.g:1595:2: 'actif'
            {
             before(grammarAccess.getPersonneAccess().getActifKeyword_7()); 
            match(input,31,FOLLOW_2); 
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
    // InternalGame.g:1604:1: rule__Personne__Group__8 : rule__Personne__Group__8__Impl rule__Personne__Group__9 ;
    public final void rule__Personne__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1608:1: ( rule__Personne__Group__8__Impl rule__Personne__Group__9 )
            // InternalGame.g:1609:2: rule__Personne__Group__8__Impl rule__Personne__Group__9
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
    // InternalGame.g:1616:1: rule__Personne__Group__8__Impl : ( ( rule__Personne__ActifAssignment_8 ) ) ;
    public final void rule__Personne__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1620:1: ( ( ( rule__Personne__ActifAssignment_8 ) ) )
            // InternalGame.g:1621:1: ( ( rule__Personne__ActifAssignment_8 ) )
            {
            // InternalGame.g:1621:1: ( ( rule__Personne__ActifAssignment_8 ) )
            // InternalGame.g:1622:2: ( rule__Personne__ActifAssignment_8 )
            {
             before(grammarAccess.getPersonneAccess().getActifAssignment_8()); 
            // InternalGame.g:1623:2: ( rule__Personne__ActifAssignment_8 )
            // InternalGame.g:1623:3: rule__Personne__ActifAssignment_8
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
    // InternalGame.g:1631:1: rule__Personne__Group__9 : rule__Personne__Group__9__Impl rule__Personne__Group__10 ;
    public final void rule__Personne__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1635:1: ( rule__Personne__Group__9__Impl rule__Personne__Group__10 )
            // InternalGame.g:1636:2: rule__Personne__Group__9__Impl rule__Personne__Group__10
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
    // InternalGame.g:1643:1: rule__Personne__Group__9__Impl : ( 'obligatoire' ) ;
    public final void rule__Personne__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1647:1: ( ( 'obligatoire' ) )
            // InternalGame.g:1648:1: ( 'obligatoire' )
            {
            // InternalGame.g:1648:1: ( 'obligatoire' )
            // InternalGame.g:1649:2: 'obligatoire'
            {
             before(grammarAccess.getPersonneAccess().getObligatoireKeyword_9()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGame.g:1658:1: rule__Personne__Group__10 : rule__Personne__Group__10__Impl rule__Personne__Group__11 ;
    public final void rule__Personne__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1662:1: ( rule__Personne__Group__10__Impl rule__Personne__Group__11 )
            // InternalGame.g:1663:2: rule__Personne__Group__10__Impl rule__Personne__Group__11
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
    // InternalGame.g:1670:1: rule__Personne__Group__10__Impl : ( ( rule__Personne__ObligatoireAssignment_10 ) ) ;
    public final void rule__Personne__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1674:1: ( ( ( rule__Personne__ObligatoireAssignment_10 ) ) )
            // InternalGame.g:1675:1: ( ( rule__Personne__ObligatoireAssignment_10 ) )
            {
            // InternalGame.g:1675:1: ( ( rule__Personne__ObligatoireAssignment_10 ) )
            // InternalGame.g:1676:2: ( rule__Personne__ObligatoireAssignment_10 )
            {
             before(grammarAccess.getPersonneAccess().getObligatoireAssignment_10()); 
            // InternalGame.g:1677:2: ( rule__Personne__ObligatoireAssignment_10 )
            // InternalGame.g:1677:3: rule__Personne__ObligatoireAssignment_10
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
    // InternalGame.g:1685:1: rule__Personne__Group__11 : rule__Personne__Group__11__Impl rule__Personne__Group__12 ;
    public final void rule__Personne__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1689:1: ( rule__Personne__Group__11__Impl rule__Personne__Group__12 )
            // InternalGame.g:1690:2: rule__Personne__Group__11__Impl rule__Personne__Group__12
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
    // InternalGame.g:1697:1: rule__Personne__Group__11__Impl : ( 'interactions' ) ;
    public final void rule__Personne__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1701:1: ( ( 'interactions' ) )
            // InternalGame.g:1702:1: ( 'interactions' )
            {
            // InternalGame.g:1702:1: ( 'interactions' )
            // InternalGame.g:1703:2: 'interactions'
            {
             before(grammarAccess.getPersonneAccess().getInteractionsKeyword_11()); 
            match(input,32,FOLLOW_2); 
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
    // InternalGame.g:1712:1: rule__Personne__Group__12 : rule__Personne__Group__12__Impl rule__Personne__Group__13 ;
    public final void rule__Personne__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1716:1: ( rule__Personne__Group__12__Impl rule__Personne__Group__13 )
            // InternalGame.g:1717:2: rule__Personne__Group__12__Impl rule__Personne__Group__13
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
    // InternalGame.g:1724:1: rule__Personne__Group__12__Impl : ( ( rule__Personne__InteractionsAssignment_12 )* ) ;
    public final void rule__Personne__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1728:1: ( ( ( rule__Personne__InteractionsAssignment_12 )* ) )
            // InternalGame.g:1729:1: ( ( rule__Personne__InteractionsAssignment_12 )* )
            {
            // InternalGame.g:1729:1: ( ( rule__Personne__InteractionsAssignment_12 )* )
            // InternalGame.g:1730:2: ( rule__Personne__InteractionsAssignment_12 )*
            {
             before(grammarAccess.getPersonneAccess().getInteractionsAssignment_12()); 
            // InternalGame.g:1731:2: ( rule__Personne__InteractionsAssignment_12 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==43) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGame.g:1731:3: rule__Personne__InteractionsAssignment_12
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
    // InternalGame.g:1739:1: rule__Personne__Group__13 : rule__Personne__Group__13__Impl ;
    public final void rule__Personne__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1743:1: ( rule__Personne__Group__13__Impl )
            // InternalGame.g:1744:2: rule__Personne__Group__13__Impl
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
    // InternalGame.g:1750:1: rule__Personne__Group__13__Impl : ( '}' ) ;
    public final void rule__Personne__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1754:1: ( ( '}' ) )
            // InternalGame.g:1755:1: ( '}' )
            {
            // InternalGame.g:1755:1: ( '}' )
            // InternalGame.g:1756:2: '}'
            {
             before(grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_13()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGame.g:1766:1: rule__Explorateur__Group__0 : rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1 ;
    public final void rule__Explorateur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1770:1: ( rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1 )
            // InternalGame.g:1771:2: rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1
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
    // InternalGame.g:1778:1: rule__Explorateur__Group__0__Impl : ( 'explorateur' ) ;
    public final void rule__Explorateur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1782:1: ( ( 'explorateur' ) )
            // InternalGame.g:1783:1: ( 'explorateur' )
            {
            // InternalGame.g:1783:1: ( 'explorateur' )
            // InternalGame.g:1784:2: 'explorateur'
            {
             before(grammarAccess.getExplorateurAccess().getExplorateurKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalGame.g:1793:1: rule__Explorateur__Group__1 : rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2 ;
    public final void rule__Explorateur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1797:1: ( rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2 )
            // InternalGame.g:1798:2: rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2
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
    // InternalGame.g:1805:1: rule__Explorateur__Group__1__Impl : ( '{' ) ;
    public final void rule__Explorateur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1809:1: ( ( '{' ) )
            // InternalGame.g:1810:1: ( '{' )
            {
            // InternalGame.g:1810:1: ( '{' )
            // InternalGame.g:1811:2: '{'
            {
             before(grammarAccess.getExplorateurAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGame.g:1820:1: rule__Explorateur__Group__2 : rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3 ;
    public final void rule__Explorateur__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1824:1: ( rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3 )
            // InternalGame.g:1825:2: rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3
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
    // InternalGame.g:1832:1: rule__Explorateur__Group__2__Impl : ( 'localisation' ) ;
    public final void rule__Explorateur__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1836:1: ( ( 'localisation' ) )
            // InternalGame.g:1837:1: ( 'localisation' )
            {
            // InternalGame.g:1837:1: ( 'localisation' )
            // InternalGame.g:1838:2: 'localisation'
            {
             before(grammarAccess.getExplorateurAccess().getLocalisationKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalGame.g:1847:1: rule__Explorateur__Group__3 : rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4 ;
    public final void rule__Explorateur__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1851:1: ( rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4 )
            // InternalGame.g:1852:2: rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4
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
    // InternalGame.g:1859:1: rule__Explorateur__Group__3__Impl : ( ( rule__Explorateur__PlaceAssignment_3 ) ) ;
    public final void rule__Explorateur__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1863:1: ( ( ( rule__Explorateur__PlaceAssignment_3 ) ) )
            // InternalGame.g:1864:1: ( ( rule__Explorateur__PlaceAssignment_3 ) )
            {
            // InternalGame.g:1864:1: ( ( rule__Explorateur__PlaceAssignment_3 ) )
            // InternalGame.g:1865:2: ( rule__Explorateur__PlaceAssignment_3 )
            {
             before(grammarAccess.getExplorateurAccess().getPlaceAssignment_3()); 
            // InternalGame.g:1866:2: ( rule__Explorateur__PlaceAssignment_3 )
            // InternalGame.g:1866:3: rule__Explorateur__PlaceAssignment_3
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
    // InternalGame.g:1874:1: rule__Explorateur__Group__4 : rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5 ;
    public final void rule__Explorateur__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1878:1: ( rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5 )
            // InternalGame.g:1879:2: rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5
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
    // InternalGame.g:1886:1: rule__Explorateur__Group__4__Impl : ( 'taille' ) ;
    public final void rule__Explorateur__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1890:1: ( ( 'taille' ) )
            // InternalGame.g:1891:1: ( 'taille' )
            {
            // InternalGame.g:1891:1: ( 'taille' )
            // InternalGame.g:1892:2: 'taille'
            {
             before(grammarAccess.getExplorateurAccess().getTailleKeyword_4()); 
            match(input,34,FOLLOW_2); 
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
    // InternalGame.g:1901:1: rule__Explorateur__Group__5 : rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6 ;
    public final void rule__Explorateur__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1905:1: ( rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6 )
            // InternalGame.g:1906:2: rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6
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
    // InternalGame.g:1913:1: rule__Explorateur__Group__5__Impl : ( 'disponible' ) ;
    public final void rule__Explorateur__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1917:1: ( ( 'disponible' ) )
            // InternalGame.g:1918:1: ( 'disponible' )
            {
            // InternalGame.g:1918:1: ( 'disponible' )
            // InternalGame.g:1919:2: 'disponible'
            {
             before(grammarAccess.getExplorateurAccess().getDisponibleKeyword_5()); 
            match(input,35,FOLLOW_2); 
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
    // InternalGame.g:1928:1: rule__Explorateur__Group__6 : rule__Explorateur__Group__6__Impl rule__Explorateur__Group__7 ;
    public final void rule__Explorateur__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1932:1: ( rule__Explorateur__Group__6__Impl rule__Explorateur__Group__7 )
            // InternalGame.g:1933:2: rule__Explorateur__Group__6__Impl rule__Explorateur__Group__7
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
    // InternalGame.g:1940:1: rule__Explorateur__Group__6__Impl : ( ( rule__Explorateur__TailleDispoAssignment_6 ) ) ;
    public final void rule__Explorateur__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1944:1: ( ( ( rule__Explorateur__TailleDispoAssignment_6 ) ) )
            // InternalGame.g:1945:1: ( ( rule__Explorateur__TailleDispoAssignment_6 ) )
            {
            // InternalGame.g:1945:1: ( ( rule__Explorateur__TailleDispoAssignment_6 ) )
            // InternalGame.g:1946:2: ( rule__Explorateur__TailleDispoAssignment_6 )
            {
             before(grammarAccess.getExplorateurAccess().getTailleDispoAssignment_6()); 
            // InternalGame.g:1947:2: ( rule__Explorateur__TailleDispoAssignment_6 )
            // InternalGame.g:1947:3: rule__Explorateur__TailleDispoAssignment_6
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
    // InternalGame.g:1955:1: rule__Explorateur__Group__7 : rule__Explorateur__Group__7__Impl rule__Explorateur__Group__8 ;
    public final void rule__Explorateur__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1959:1: ( rule__Explorateur__Group__7__Impl rule__Explorateur__Group__8 )
            // InternalGame.g:1960:2: rule__Explorateur__Group__7__Impl rule__Explorateur__Group__8
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
    // InternalGame.g:1967:1: rule__Explorateur__Group__7__Impl : ( ( rule__Explorateur__Group_7__0 )? ) ;
    public final void rule__Explorateur__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1971:1: ( ( ( rule__Explorateur__Group_7__0 )? ) )
            // InternalGame.g:1972:1: ( ( rule__Explorateur__Group_7__0 )? )
            {
            // InternalGame.g:1972:1: ( ( rule__Explorateur__Group_7__0 )? )
            // InternalGame.g:1973:2: ( rule__Explorateur__Group_7__0 )?
            {
             before(grammarAccess.getExplorateurAccess().getGroup_7()); 
            // InternalGame.g:1974:2: ( rule__Explorateur__Group_7__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==36) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGame.g:1974:3: rule__Explorateur__Group_7__0
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
    // InternalGame.g:1982:1: rule__Explorateur__Group__8 : rule__Explorateur__Group__8__Impl rule__Explorateur__Group__9 ;
    public final void rule__Explorateur__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1986:1: ( rule__Explorateur__Group__8__Impl rule__Explorateur__Group__9 )
            // InternalGame.g:1987:2: rule__Explorateur__Group__8__Impl rule__Explorateur__Group__9
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
    // InternalGame.g:1994:1: rule__Explorateur__Group__8__Impl : ( ( rule__Explorateur__Group_8__0 )? ) ;
    public final void rule__Explorateur__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1998:1: ( ( ( rule__Explorateur__Group_8__0 )? ) )
            // InternalGame.g:1999:1: ( ( rule__Explorateur__Group_8__0 )? )
            {
            // InternalGame.g:1999:1: ( ( rule__Explorateur__Group_8__0 )? )
            // InternalGame.g:2000:2: ( rule__Explorateur__Group_8__0 )?
            {
             before(grammarAccess.getExplorateurAccess().getGroup_8()); 
            // InternalGame.g:2001:2: ( rule__Explorateur__Group_8__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==38) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGame.g:2001:3: rule__Explorateur__Group_8__0
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
    // InternalGame.g:2009:1: rule__Explorateur__Group__9 : rule__Explorateur__Group__9__Impl ;
    public final void rule__Explorateur__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2013:1: ( rule__Explorateur__Group__9__Impl )
            // InternalGame.g:2014:2: rule__Explorateur__Group__9__Impl
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
    // InternalGame.g:2020:1: rule__Explorateur__Group__9__Impl : ( '}' ) ;
    public final void rule__Explorateur__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2024:1: ( ( '}' ) )
            // InternalGame.g:2025:1: ( '}' )
            {
            // InternalGame.g:2025:1: ( '}' )
            // InternalGame.g:2026:2: '}'
            {
             before(grammarAccess.getExplorateurAccess().getRightCurlyBracketKeyword_9()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGame.g:2036:1: rule__Explorateur__Group_7__0 : rule__Explorateur__Group_7__0__Impl rule__Explorateur__Group_7__1 ;
    public final void rule__Explorateur__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2040:1: ( rule__Explorateur__Group_7__0__Impl rule__Explorateur__Group_7__1 )
            // InternalGame.g:2041:2: rule__Explorateur__Group_7__0__Impl rule__Explorateur__Group_7__1
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
    // InternalGame.g:2048:1: rule__Explorateur__Group_7__0__Impl : ( 'objets' ) ;
    public final void rule__Explorateur__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2052:1: ( ( 'objets' ) )
            // InternalGame.g:2053:1: ( 'objets' )
            {
            // InternalGame.g:2053:1: ( 'objets' )
            // InternalGame.g:2054:2: 'objets'
            {
             before(grammarAccess.getExplorateurAccess().getObjetsKeyword_7_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalGame.g:2063:1: rule__Explorateur__Group_7__1 : rule__Explorateur__Group_7__1__Impl rule__Explorateur__Group_7__2 ;
    public final void rule__Explorateur__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2067:1: ( rule__Explorateur__Group_7__1__Impl rule__Explorateur__Group_7__2 )
            // InternalGame.g:2068:2: rule__Explorateur__Group_7__1__Impl rule__Explorateur__Group_7__2
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
    // InternalGame.g:2075:1: rule__Explorateur__Group_7__1__Impl : ( 'possedes' ) ;
    public final void rule__Explorateur__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2079:1: ( ( 'possedes' ) )
            // InternalGame.g:2080:1: ( 'possedes' )
            {
            // InternalGame.g:2080:1: ( 'possedes' )
            // InternalGame.g:2081:2: 'possedes'
            {
             before(grammarAccess.getExplorateurAccess().getPossedesKeyword_7_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalGame.g:2090:1: rule__Explorateur__Group_7__2 : rule__Explorateur__Group_7__2__Impl ;
    public final void rule__Explorateur__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2094:1: ( rule__Explorateur__Group_7__2__Impl )
            // InternalGame.g:2095:2: rule__Explorateur__Group_7__2__Impl
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
    // InternalGame.g:2101:1: rule__Explorateur__Group_7__2__Impl : ( ( rule__Explorateur__ObjetsAssignment_7_2 )* ) ;
    public final void rule__Explorateur__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2105:1: ( ( ( rule__Explorateur__ObjetsAssignment_7_2 )* ) )
            // InternalGame.g:2106:1: ( ( rule__Explorateur__ObjetsAssignment_7_2 )* )
            {
            // InternalGame.g:2106:1: ( ( rule__Explorateur__ObjetsAssignment_7_2 )* )
            // InternalGame.g:2107:2: ( rule__Explorateur__ObjetsAssignment_7_2 )*
            {
             before(grammarAccess.getExplorateurAccess().getObjetsAssignment_7_2()); 
            // InternalGame.g:2108:2: ( rule__Explorateur__ObjetsAssignment_7_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==40) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGame.g:2108:3: rule__Explorateur__ObjetsAssignment_7_2
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
    // InternalGame.g:2117:1: rule__Explorateur__Group_8__0 : rule__Explorateur__Group_8__0__Impl rule__Explorateur__Group_8__1 ;
    public final void rule__Explorateur__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2121:1: ( rule__Explorateur__Group_8__0__Impl rule__Explorateur__Group_8__1 )
            // InternalGame.g:2122:2: rule__Explorateur__Group_8__0__Impl rule__Explorateur__Group_8__1
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
    // InternalGame.g:2129:1: rule__Explorateur__Group_8__0__Impl : ( 'connaissances' ) ;
    public final void rule__Explorateur__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2133:1: ( ( 'connaissances' ) )
            // InternalGame.g:2134:1: ( 'connaissances' )
            {
            // InternalGame.g:2134:1: ( 'connaissances' )
            // InternalGame.g:2135:2: 'connaissances'
            {
             before(grammarAccess.getExplorateurAccess().getConnaissancesKeyword_8_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalGame.g:2144:1: rule__Explorateur__Group_8__1 : rule__Explorateur__Group_8__1__Impl rule__Explorateur__Group_8__2 ;
    public final void rule__Explorateur__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2148:1: ( rule__Explorateur__Group_8__1__Impl rule__Explorateur__Group_8__2 )
            // InternalGame.g:2149:2: rule__Explorateur__Group_8__1__Impl rule__Explorateur__Group_8__2
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
    // InternalGame.g:2156:1: rule__Explorateur__Group_8__1__Impl : ( 'possedes' ) ;
    public final void rule__Explorateur__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2160:1: ( ( 'possedes' ) )
            // InternalGame.g:2161:1: ( 'possedes' )
            {
            // InternalGame.g:2161:1: ( 'possedes' )
            // InternalGame.g:2162:2: 'possedes'
            {
             before(grammarAccess.getExplorateurAccess().getPossedesKeyword_8_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalGame.g:2171:1: rule__Explorateur__Group_8__2 : rule__Explorateur__Group_8__2__Impl ;
    public final void rule__Explorateur__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2175:1: ( rule__Explorateur__Group_8__2__Impl )
            // InternalGame.g:2176:2: rule__Explorateur__Group_8__2__Impl
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
    // InternalGame.g:2182:1: rule__Explorateur__Group_8__2__Impl : ( ( rule__Explorateur__ConnaissancesAssignment_8_2 )* ) ;
    public final void rule__Explorateur__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2186:1: ( ( ( rule__Explorateur__ConnaissancesAssignment_8_2 )* ) )
            // InternalGame.g:2187:1: ( ( rule__Explorateur__ConnaissancesAssignment_8_2 )* )
            {
            // InternalGame.g:2187:1: ( ( rule__Explorateur__ConnaissancesAssignment_8_2 )* )
            // InternalGame.g:2188:2: ( rule__Explorateur__ConnaissancesAssignment_8_2 )*
            {
             before(grammarAccess.getExplorateurAccess().getConnaissancesAssignment_8_2()); 
            // InternalGame.g:2189:2: ( rule__Explorateur__ConnaissancesAssignment_8_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==39) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGame.g:2189:3: rule__Explorateur__ConnaissancesAssignment_8_2
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
    // InternalGame.g:2198:1: rule__Connaissance__Group__0 : rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1 ;
    public final void rule__Connaissance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2202:1: ( rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1 )
            // InternalGame.g:2203:2: rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1
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
    // InternalGame.g:2210:1: rule__Connaissance__Group__0__Impl : ( 'connaissance' ) ;
    public final void rule__Connaissance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2214:1: ( ( 'connaissance' ) )
            // InternalGame.g:2215:1: ( 'connaissance' )
            {
            // InternalGame.g:2215:1: ( 'connaissance' )
            // InternalGame.g:2216:2: 'connaissance'
            {
             before(grammarAccess.getConnaissanceAccess().getConnaissanceKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalGame.g:2225:1: rule__Connaissance__Group__1 : rule__Connaissance__Group__1__Impl rule__Connaissance__Group__2 ;
    public final void rule__Connaissance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2229:1: ( rule__Connaissance__Group__1__Impl rule__Connaissance__Group__2 )
            // InternalGame.g:2230:2: rule__Connaissance__Group__1__Impl rule__Connaissance__Group__2
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
    // InternalGame.g:2237:1: rule__Connaissance__Group__1__Impl : ( ( rule__Connaissance__NameAssignment_1 ) ) ;
    public final void rule__Connaissance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2241:1: ( ( ( rule__Connaissance__NameAssignment_1 ) ) )
            // InternalGame.g:2242:1: ( ( rule__Connaissance__NameAssignment_1 ) )
            {
            // InternalGame.g:2242:1: ( ( rule__Connaissance__NameAssignment_1 ) )
            // InternalGame.g:2243:2: ( rule__Connaissance__NameAssignment_1 )
            {
             before(grammarAccess.getConnaissanceAccess().getNameAssignment_1()); 
            // InternalGame.g:2244:2: ( rule__Connaissance__NameAssignment_1 )
            // InternalGame.g:2244:3: rule__Connaissance__NameAssignment_1
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
    // InternalGame.g:2252:1: rule__Connaissance__Group__2 : rule__Connaissance__Group__2__Impl rule__Connaissance__Group__3 ;
    public final void rule__Connaissance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2256:1: ( rule__Connaissance__Group__2__Impl rule__Connaissance__Group__3 )
            // InternalGame.g:2257:2: rule__Connaissance__Group__2__Impl rule__Connaissance__Group__3
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
    // InternalGame.g:2264:1: rule__Connaissance__Group__2__Impl : ( '{' ) ;
    public final void rule__Connaissance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2268:1: ( ( '{' ) )
            // InternalGame.g:2269:1: ( '{' )
            {
            // InternalGame.g:2269:1: ( '{' )
            // InternalGame.g:2270:2: '{'
            {
             before(grammarAccess.getConnaissanceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGame.g:2279:1: rule__Connaissance__Group__3 : rule__Connaissance__Group__3__Impl rule__Connaissance__Group__4 ;
    public final void rule__Connaissance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2283:1: ( rule__Connaissance__Group__3__Impl rule__Connaissance__Group__4 )
            // InternalGame.g:2284:2: rule__Connaissance__Group__3__Impl rule__Connaissance__Group__4
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
    // InternalGame.g:2291:1: rule__Connaissance__Group__3__Impl : ( 'visible' ) ;
    public final void rule__Connaissance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2295:1: ( ( 'visible' ) )
            // InternalGame.g:2296:1: ( 'visible' )
            {
            // InternalGame.g:2296:1: ( 'visible' )
            // InternalGame.g:2297:2: 'visible'
            {
             before(grammarAccess.getConnaissanceAccess().getVisibleKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGame.g:2306:1: rule__Connaissance__Group__4 : rule__Connaissance__Group__4__Impl rule__Connaissance__Group__5 ;
    public final void rule__Connaissance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2310:1: ( rule__Connaissance__Group__4__Impl rule__Connaissance__Group__5 )
            // InternalGame.g:2311:2: rule__Connaissance__Group__4__Impl rule__Connaissance__Group__5
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
    // InternalGame.g:2318:1: rule__Connaissance__Group__4__Impl : ( ( rule__Connaissance__VisibleAssignment_4 ) ) ;
    public final void rule__Connaissance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2322:1: ( ( ( rule__Connaissance__VisibleAssignment_4 ) ) )
            // InternalGame.g:2323:1: ( ( rule__Connaissance__VisibleAssignment_4 ) )
            {
            // InternalGame.g:2323:1: ( ( rule__Connaissance__VisibleAssignment_4 ) )
            // InternalGame.g:2324:2: ( rule__Connaissance__VisibleAssignment_4 )
            {
             before(grammarAccess.getConnaissanceAccess().getVisibleAssignment_4()); 
            // InternalGame.g:2325:2: ( rule__Connaissance__VisibleAssignment_4 )
            // InternalGame.g:2325:3: rule__Connaissance__VisibleAssignment_4
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
    // InternalGame.g:2333:1: rule__Connaissance__Group__5 : rule__Connaissance__Group__5__Impl rule__Connaissance__Group__6 ;
    public final void rule__Connaissance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2337:1: ( rule__Connaissance__Group__5__Impl rule__Connaissance__Group__6 )
            // InternalGame.g:2338:2: rule__Connaissance__Group__5__Impl rule__Connaissance__Group__6
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
    // InternalGame.g:2345:1: rule__Connaissance__Group__5__Impl : ( 'actif' ) ;
    public final void rule__Connaissance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2349:1: ( ( 'actif' ) )
            // InternalGame.g:2350:1: ( 'actif' )
            {
            // InternalGame.g:2350:1: ( 'actif' )
            // InternalGame.g:2351:2: 'actif'
            {
             before(grammarAccess.getConnaissanceAccess().getActifKeyword_5()); 
            match(input,31,FOLLOW_2); 
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
    // InternalGame.g:2360:1: rule__Connaissance__Group__6 : rule__Connaissance__Group__6__Impl rule__Connaissance__Group__7 ;
    public final void rule__Connaissance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2364:1: ( rule__Connaissance__Group__6__Impl rule__Connaissance__Group__7 )
            // InternalGame.g:2365:2: rule__Connaissance__Group__6__Impl rule__Connaissance__Group__7
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
    // InternalGame.g:2372:1: rule__Connaissance__Group__6__Impl : ( ( rule__Connaissance__ActifAssignment_6 ) ) ;
    public final void rule__Connaissance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2376:1: ( ( ( rule__Connaissance__ActifAssignment_6 ) ) )
            // InternalGame.g:2377:1: ( ( rule__Connaissance__ActifAssignment_6 ) )
            {
            // InternalGame.g:2377:1: ( ( rule__Connaissance__ActifAssignment_6 ) )
            // InternalGame.g:2378:2: ( rule__Connaissance__ActifAssignment_6 )
            {
             before(grammarAccess.getConnaissanceAccess().getActifAssignment_6()); 
            // InternalGame.g:2379:2: ( rule__Connaissance__ActifAssignment_6 )
            // InternalGame.g:2379:3: rule__Connaissance__ActifAssignment_6
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
    // InternalGame.g:2387:1: rule__Connaissance__Group__7 : rule__Connaissance__Group__7__Impl ;
    public final void rule__Connaissance__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2391:1: ( rule__Connaissance__Group__7__Impl )
            // InternalGame.g:2392:2: rule__Connaissance__Group__7__Impl
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
    // InternalGame.g:2398:1: rule__Connaissance__Group__7__Impl : ( '}' ) ;
    public final void rule__Connaissance__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2402:1: ( ( '}' ) )
            // InternalGame.g:2403:1: ( '}' )
            {
            // InternalGame.g:2403:1: ( '}' )
            // InternalGame.g:2404:2: '}'
            {
             before(grammarAccess.getConnaissanceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGame.g:2414:1: rule__Objet__Group__0 : rule__Objet__Group__0__Impl rule__Objet__Group__1 ;
    public final void rule__Objet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2418:1: ( rule__Objet__Group__0__Impl rule__Objet__Group__1 )
            // InternalGame.g:2419:2: rule__Objet__Group__0__Impl rule__Objet__Group__1
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
    // InternalGame.g:2426:1: rule__Objet__Group__0__Impl : ( 'objet' ) ;
    public final void rule__Objet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2430:1: ( ( 'objet' ) )
            // InternalGame.g:2431:1: ( 'objet' )
            {
            // InternalGame.g:2431:1: ( 'objet' )
            // InternalGame.g:2432:2: 'objet'
            {
             before(grammarAccess.getObjetAccess().getObjetKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalGame.g:2441:1: rule__Objet__Group__1 : rule__Objet__Group__1__Impl rule__Objet__Group__2 ;
    public final void rule__Objet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2445:1: ( rule__Objet__Group__1__Impl rule__Objet__Group__2 )
            // InternalGame.g:2446:2: rule__Objet__Group__1__Impl rule__Objet__Group__2
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
    // InternalGame.g:2453:1: rule__Objet__Group__1__Impl : ( ( rule__Objet__NameAssignment_1 ) ) ;
    public final void rule__Objet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2457:1: ( ( ( rule__Objet__NameAssignment_1 ) ) )
            // InternalGame.g:2458:1: ( ( rule__Objet__NameAssignment_1 ) )
            {
            // InternalGame.g:2458:1: ( ( rule__Objet__NameAssignment_1 ) )
            // InternalGame.g:2459:2: ( rule__Objet__NameAssignment_1 )
            {
             before(grammarAccess.getObjetAccess().getNameAssignment_1()); 
            // InternalGame.g:2460:2: ( rule__Objet__NameAssignment_1 )
            // InternalGame.g:2460:3: rule__Objet__NameAssignment_1
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
    // InternalGame.g:2468:1: rule__Objet__Group__2 : rule__Objet__Group__2__Impl rule__Objet__Group__3 ;
    public final void rule__Objet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2472:1: ( rule__Objet__Group__2__Impl rule__Objet__Group__3 )
            // InternalGame.g:2473:2: rule__Objet__Group__2__Impl rule__Objet__Group__3
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
    // InternalGame.g:2480:1: rule__Objet__Group__2__Impl : ( '{' ) ;
    public final void rule__Objet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2484:1: ( ( '{' ) )
            // InternalGame.g:2485:1: ( '{' )
            {
            // InternalGame.g:2485:1: ( '{' )
            // InternalGame.g:2486:2: '{'
            {
             before(grammarAccess.getObjetAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGame.g:2495:1: rule__Objet__Group__3 : rule__Objet__Group__3__Impl rule__Objet__Group__4 ;
    public final void rule__Objet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2499:1: ( rule__Objet__Group__3__Impl rule__Objet__Group__4 )
            // InternalGame.g:2500:2: rule__Objet__Group__3__Impl rule__Objet__Group__4
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
    // InternalGame.g:2507:1: rule__Objet__Group__3__Impl : ( 'visible' ) ;
    public final void rule__Objet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2511:1: ( ( 'visible' ) )
            // InternalGame.g:2512:1: ( 'visible' )
            {
            // InternalGame.g:2512:1: ( 'visible' )
            // InternalGame.g:2513:2: 'visible'
            {
             before(grammarAccess.getObjetAccess().getVisibleKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGame.g:2522:1: rule__Objet__Group__4 : rule__Objet__Group__4__Impl rule__Objet__Group__5 ;
    public final void rule__Objet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2526:1: ( rule__Objet__Group__4__Impl rule__Objet__Group__5 )
            // InternalGame.g:2527:2: rule__Objet__Group__4__Impl rule__Objet__Group__5
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
    // InternalGame.g:2534:1: rule__Objet__Group__4__Impl : ( ( rule__Objet__VisibleAssignment_4 ) ) ;
    public final void rule__Objet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2538:1: ( ( ( rule__Objet__VisibleAssignment_4 ) ) )
            // InternalGame.g:2539:1: ( ( rule__Objet__VisibleAssignment_4 ) )
            {
            // InternalGame.g:2539:1: ( ( rule__Objet__VisibleAssignment_4 ) )
            // InternalGame.g:2540:2: ( rule__Objet__VisibleAssignment_4 )
            {
             before(grammarAccess.getObjetAccess().getVisibleAssignment_4()); 
            // InternalGame.g:2541:2: ( rule__Objet__VisibleAssignment_4 )
            // InternalGame.g:2541:3: rule__Objet__VisibleAssignment_4
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
    // InternalGame.g:2549:1: rule__Objet__Group__5 : rule__Objet__Group__5__Impl rule__Objet__Group__6 ;
    public final void rule__Objet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2553:1: ( rule__Objet__Group__5__Impl rule__Objet__Group__6 )
            // InternalGame.g:2554:2: rule__Objet__Group__5__Impl rule__Objet__Group__6
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
    // InternalGame.g:2561:1: rule__Objet__Group__5__Impl : ( 'actif' ) ;
    public final void rule__Objet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2565:1: ( ( 'actif' ) )
            // InternalGame.g:2566:1: ( 'actif' )
            {
            // InternalGame.g:2566:1: ( 'actif' )
            // InternalGame.g:2567:2: 'actif'
            {
             before(grammarAccess.getObjetAccess().getActifKeyword_5()); 
            match(input,31,FOLLOW_2); 
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
    // InternalGame.g:2576:1: rule__Objet__Group__6 : rule__Objet__Group__6__Impl rule__Objet__Group__7 ;
    public final void rule__Objet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2580:1: ( rule__Objet__Group__6__Impl rule__Objet__Group__7 )
            // InternalGame.g:2581:2: rule__Objet__Group__6__Impl rule__Objet__Group__7
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
    // InternalGame.g:2588:1: rule__Objet__Group__6__Impl : ( ( rule__Objet__ActifAssignment_6 ) ) ;
    public final void rule__Objet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2592:1: ( ( ( rule__Objet__ActifAssignment_6 ) ) )
            // InternalGame.g:2593:1: ( ( rule__Objet__ActifAssignment_6 ) )
            {
            // InternalGame.g:2593:1: ( ( rule__Objet__ActifAssignment_6 ) )
            // InternalGame.g:2594:2: ( rule__Objet__ActifAssignment_6 )
            {
             before(grammarAccess.getObjetAccess().getActifAssignment_6()); 
            // InternalGame.g:2595:2: ( rule__Objet__ActifAssignment_6 )
            // InternalGame.g:2595:3: rule__Objet__ActifAssignment_6
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
    // InternalGame.g:2603:1: rule__Objet__Group__7 : rule__Objet__Group__7__Impl rule__Objet__Group__8 ;
    public final void rule__Objet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2607:1: ( rule__Objet__Group__7__Impl rule__Objet__Group__8 )
            // InternalGame.g:2608:2: rule__Objet__Group__7__Impl rule__Objet__Group__8
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
    // InternalGame.g:2615:1: rule__Objet__Group__7__Impl : ( 'quantite' ) ;
    public final void rule__Objet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2619:1: ( ( 'quantite' ) )
            // InternalGame.g:2620:1: ( 'quantite' )
            {
            // InternalGame.g:2620:1: ( 'quantite' )
            // InternalGame.g:2621:2: 'quantite'
            {
             before(grammarAccess.getObjetAccess().getQuantiteKeyword_7()); 
            match(input,41,FOLLOW_2); 
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
    // InternalGame.g:2630:1: rule__Objet__Group__8 : rule__Objet__Group__8__Impl rule__Objet__Group__9 ;
    public final void rule__Objet__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2634:1: ( rule__Objet__Group__8__Impl rule__Objet__Group__9 )
            // InternalGame.g:2635:2: rule__Objet__Group__8__Impl rule__Objet__Group__9
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
    // InternalGame.g:2642:1: rule__Objet__Group__8__Impl : ( ( rule__Objet__QteAssignment_8 ) ) ;
    public final void rule__Objet__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2646:1: ( ( ( rule__Objet__QteAssignment_8 ) ) )
            // InternalGame.g:2647:1: ( ( rule__Objet__QteAssignment_8 ) )
            {
            // InternalGame.g:2647:1: ( ( rule__Objet__QteAssignment_8 ) )
            // InternalGame.g:2648:2: ( rule__Objet__QteAssignment_8 )
            {
             before(grammarAccess.getObjetAccess().getQteAssignment_8()); 
            // InternalGame.g:2649:2: ( rule__Objet__QteAssignment_8 )
            // InternalGame.g:2649:3: rule__Objet__QteAssignment_8
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
    // InternalGame.g:2657:1: rule__Objet__Group__9 : rule__Objet__Group__9__Impl rule__Objet__Group__10 ;
    public final void rule__Objet__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2661:1: ( rule__Objet__Group__9__Impl rule__Objet__Group__10 )
            // InternalGame.g:2662:2: rule__Objet__Group__9__Impl rule__Objet__Group__10
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
    // InternalGame.g:2669:1: rule__Objet__Group__9__Impl : ( 'taille' ) ;
    public final void rule__Objet__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2673:1: ( ( 'taille' ) )
            // InternalGame.g:2674:1: ( 'taille' )
            {
            // InternalGame.g:2674:1: ( 'taille' )
            // InternalGame.g:2675:2: 'taille'
            {
             before(grammarAccess.getObjetAccess().getTailleKeyword_9()); 
            match(input,34,FOLLOW_2); 
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
    // InternalGame.g:2684:1: rule__Objet__Group__10 : rule__Objet__Group__10__Impl rule__Objet__Group__11 ;
    public final void rule__Objet__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2688:1: ( rule__Objet__Group__10__Impl rule__Objet__Group__11 )
            // InternalGame.g:2689:2: rule__Objet__Group__10__Impl rule__Objet__Group__11
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
    // InternalGame.g:2696:1: rule__Objet__Group__10__Impl : ( ( rule__Objet__TailleAssignment_10 ) ) ;
    public final void rule__Objet__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2700:1: ( ( ( rule__Objet__TailleAssignment_10 ) ) )
            // InternalGame.g:2701:1: ( ( rule__Objet__TailleAssignment_10 ) )
            {
            // InternalGame.g:2701:1: ( ( rule__Objet__TailleAssignment_10 ) )
            // InternalGame.g:2702:2: ( rule__Objet__TailleAssignment_10 )
            {
             before(grammarAccess.getObjetAccess().getTailleAssignment_10()); 
            // InternalGame.g:2703:2: ( rule__Objet__TailleAssignment_10 )
            // InternalGame.g:2703:3: rule__Objet__TailleAssignment_10
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
    // InternalGame.g:2711:1: rule__Objet__Group__11 : rule__Objet__Group__11__Impl rule__Objet__Group__12 ;
    public final void rule__Objet__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2715:1: ( rule__Objet__Group__11__Impl rule__Objet__Group__12 )
            // InternalGame.g:2716:2: rule__Objet__Group__11__Impl rule__Objet__Group__12
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
    // InternalGame.g:2723:1: rule__Objet__Group__11__Impl : ( 'transformable' ) ;
    public final void rule__Objet__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2727:1: ( ( 'transformable' ) )
            // InternalGame.g:2728:1: ( 'transformable' )
            {
            // InternalGame.g:2728:1: ( 'transformable' )
            // InternalGame.g:2729:2: 'transformable'
            {
             before(grammarAccess.getObjetAccess().getTransformableKeyword_11()); 
            match(input,42,FOLLOW_2); 
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
    // InternalGame.g:2738:1: rule__Objet__Group__12 : rule__Objet__Group__12__Impl rule__Objet__Group__13 ;
    public final void rule__Objet__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2742:1: ( rule__Objet__Group__12__Impl rule__Objet__Group__13 )
            // InternalGame.g:2743:2: rule__Objet__Group__12__Impl rule__Objet__Group__13
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
    // InternalGame.g:2750:1: rule__Objet__Group__12__Impl : ( ( rule__Objet__TransformableAssignment_12 ) ) ;
    public final void rule__Objet__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2754:1: ( ( ( rule__Objet__TransformableAssignment_12 ) ) )
            // InternalGame.g:2755:1: ( ( rule__Objet__TransformableAssignment_12 ) )
            {
            // InternalGame.g:2755:1: ( ( rule__Objet__TransformableAssignment_12 ) )
            // InternalGame.g:2756:2: ( rule__Objet__TransformableAssignment_12 )
            {
             before(grammarAccess.getObjetAccess().getTransformableAssignment_12()); 
            // InternalGame.g:2757:2: ( rule__Objet__TransformableAssignment_12 )
            // InternalGame.g:2757:3: rule__Objet__TransformableAssignment_12
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
    // InternalGame.g:2765:1: rule__Objet__Group__13 : rule__Objet__Group__13__Impl ;
    public final void rule__Objet__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2769:1: ( rule__Objet__Group__13__Impl )
            // InternalGame.g:2770:2: rule__Objet__Group__13__Impl
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
    // InternalGame.g:2776:1: rule__Objet__Group__13__Impl : ( '}' ) ;
    public final void rule__Objet__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2780:1: ( ( '}' ) )
            // InternalGame.g:2781:1: ( '}' )
            {
            // InternalGame.g:2781:1: ( '}' )
            // InternalGame.g:2782:2: '}'
            {
             before(grammarAccess.getObjetAccess().getRightCurlyBracketKeyword_13()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGame.g:2792:1: rule__Interaction__Group__0 : rule__Interaction__Group__0__Impl rule__Interaction__Group__1 ;
    public final void rule__Interaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2796:1: ( rule__Interaction__Group__0__Impl rule__Interaction__Group__1 )
            // InternalGame.g:2797:2: rule__Interaction__Group__0__Impl rule__Interaction__Group__1
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
    // InternalGame.g:2804:1: rule__Interaction__Group__0__Impl : ( 'interaction' ) ;
    public final void rule__Interaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2808:1: ( ( 'interaction' ) )
            // InternalGame.g:2809:1: ( 'interaction' )
            {
            // InternalGame.g:2809:1: ( 'interaction' )
            // InternalGame.g:2810:2: 'interaction'
            {
             before(grammarAccess.getInteractionAccess().getInteractionKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalGame.g:2819:1: rule__Interaction__Group__1 : rule__Interaction__Group__1__Impl rule__Interaction__Group__2 ;
    public final void rule__Interaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2823:1: ( rule__Interaction__Group__1__Impl rule__Interaction__Group__2 )
            // InternalGame.g:2824:2: rule__Interaction__Group__1__Impl rule__Interaction__Group__2
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
    // InternalGame.g:2831:1: rule__Interaction__Group__1__Impl : ( '{' ) ;
    public final void rule__Interaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2835:1: ( ( '{' ) )
            // InternalGame.g:2836:1: ( '{' )
            {
            // InternalGame.g:2836:1: ( '{' )
            // InternalGame.g:2837:2: '{'
            {
             before(grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGame.g:2846:1: rule__Interaction__Group__2 : rule__Interaction__Group__2__Impl rule__Interaction__Group__3 ;
    public final void rule__Interaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2850:1: ( rule__Interaction__Group__2__Impl rule__Interaction__Group__3 )
            // InternalGame.g:2851:2: rule__Interaction__Group__2__Impl rule__Interaction__Group__3
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
    // InternalGame.g:2858:1: rule__Interaction__Group__2__Impl : ( 'question' ) ;
    public final void rule__Interaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2862:1: ( ( 'question' ) )
            // InternalGame.g:2863:1: ( 'question' )
            {
            // InternalGame.g:2863:1: ( 'question' )
            // InternalGame.g:2864:2: 'question'
            {
             before(grammarAccess.getInteractionAccess().getQuestionKeyword_2()); 
            match(input,44,FOLLOW_2); 
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
    // InternalGame.g:2873:1: rule__Interaction__Group__3 : rule__Interaction__Group__3__Impl rule__Interaction__Group__4 ;
    public final void rule__Interaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2877:1: ( rule__Interaction__Group__3__Impl rule__Interaction__Group__4 )
            // InternalGame.g:2878:2: rule__Interaction__Group__3__Impl rule__Interaction__Group__4
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
    // InternalGame.g:2885:1: rule__Interaction__Group__3__Impl : ( ( rule__Interaction__QuestionAssignment_3 ) ) ;
    public final void rule__Interaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2889:1: ( ( ( rule__Interaction__QuestionAssignment_3 ) ) )
            // InternalGame.g:2890:1: ( ( rule__Interaction__QuestionAssignment_3 ) )
            {
            // InternalGame.g:2890:1: ( ( rule__Interaction__QuestionAssignment_3 ) )
            // InternalGame.g:2891:2: ( rule__Interaction__QuestionAssignment_3 )
            {
             before(grammarAccess.getInteractionAccess().getQuestionAssignment_3()); 
            // InternalGame.g:2892:2: ( rule__Interaction__QuestionAssignment_3 )
            // InternalGame.g:2892:3: rule__Interaction__QuestionAssignment_3
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
    // InternalGame.g:2900:1: rule__Interaction__Group__4 : rule__Interaction__Group__4__Impl rule__Interaction__Group__5 ;
    public final void rule__Interaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2904:1: ( rule__Interaction__Group__4__Impl rule__Interaction__Group__5 )
            // InternalGame.g:2905:2: rule__Interaction__Group__4__Impl rule__Interaction__Group__5
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
    // InternalGame.g:2912:1: rule__Interaction__Group__4__Impl : ( ( ( rule__Interaction__ChoixAssignment_4 ) ) ( ( rule__Interaction__ChoixAssignment_4 )* ) ) ;
    public final void rule__Interaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2916:1: ( ( ( ( rule__Interaction__ChoixAssignment_4 ) ) ( ( rule__Interaction__ChoixAssignment_4 )* ) ) )
            // InternalGame.g:2917:1: ( ( ( rule__Interaction__ChoixAssignment_4 ) ) ( ( rule__Interaction__ChoixAssignment_4 )* ) )
            {
            // InternalGame.g:2917:1: ( ( ( rule__Interaction__ChoixAssignment_4 ) ) ( ( rule__Interaction__ChoixAssignment_4 )* ) )
            // InternalGame.g:2918:2: ( ( rule__Interaction__ChoixAssignment_4 ) ) ( ( rule__Interaction__ChoixAssignment_4 )* )
            {
            // InternalGame.g:2918:2: ( ( rule__Interaction__ChoixAssignment_4 ) )
            // InternalGame.g:2919:3: ( rule__Interaction__ChoixAssignment_4 )
            {
             before(grammarAccess.getInteractionAccess().getChoixAssignment_4()); 
            // InternalGame.g:2920:3: ( rule__Interaction__ChoixAssignment_4 )
            // InternalGame.g:2920:4: rule__Interaction__ChoixAssignment_4
            {
            pushFollow(FOLLOW_39);
            rule__Interaction__ChoixAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getChoixAssignment_4()); 

            }

            // InternalGame.g:2923:2: ( ( rule__Interaction__ChoixAssignment_4 )* )
            // InternalGame.g:2924:3: ( rule__Interaction__ChoixAssignment_4 )*
            {
             before(grammarAccess.getInteractionAccess().getChoixAssignment_4()); 
            // InternalGame.g:2925:3: ( rule__Interaction__ChoixAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==45) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGame.g:2925:4: rule__Interaction__ChoixAssignment_4
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
    // InternalGame.g:2934:1: rule__Interaction__Group__5 : rule__Interaction__Group__5__Impl ;
    public final void rule__Interaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2938:1: ( rule__Interaction__Group__5__Impl )
            // InternalGame.g:2939:2: rule__Interaction__Group__5__Impl
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
    // InternalGame.g:2945:1: rule__Interaction__Group__5__Impl : ( '}' ) ;
    public final void rule__Interaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2949:1: ( ( '}' ) )
            // InternalGame.g:2950:1: ( '}' )
            {
            // InternalGame.g:2950:1: ( '}' )
            // InternalGame.g:2951:2: '}'
            {
             before(grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGame.g:2961:1: rule__Choix__Group__0 : rule__Choix__Group__0__Impl rule__Choix__Group__1 ;
    public final void rule__Choix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2965:1: ( rule__Choix__Group__0__Impl rule__Choix__Group__1 )
            // InternalGame.g:2966:2: rule__Choix__Group__0__Impl rule__Choix__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalGame.g:2973:1: rule__Choix__Group__0__Impl : ( 'choix' ) ;
    public final void rule__Choix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2977:1: ( ( 'choix' ) )
            // InternalGame.g:2978:1: ( 'choix' )
            {
            // InternalGame.g:2978:1: ( 'choix' )
            // InternalGame.g:2979:2: 'choix'
            {
             before(grammarAccess.getChoixAccess().getChoixKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalGame.g:2988:1: rule__Choix__Group__1 : rule__Choix__Group__1__Impl rule__Choix__Group__2 ;
    public final void rule__Choix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2992:1: ( rule__Choix__Group__1__Impl rule__Choix__Group__2 )
            // InternalGame.g:2993:2: rule__Choix__Group__1__Impl rule__Choix__Group__2
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
    // InternalGame.g:3000:1: rule__Choix__Group__1__Impl : ( ( rule__Choix__NumeroAssignment_1 ) ) ;
    public final void rule__Choix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3004:1: ( ( ( rule__Choix__NumeroAssignment_1 ) ) )
            // InternalGame.g:3005:1: ( ( rule__Choix__NumeroAssignment_1 ) )
            {
            // InternalGame.g:3005:1: ( ( rule__Choix__NumeroAssignment_1 ) )
            // InternalGame.g:3006:2: ( rule__Choix__NumeroAssignment_1 )
            {
             before(grammarAccess.getChoixAccess().getNumeroAssignment_1()); 
            // InternalGame.g:3007:2: ( rule__Choix__NumeroAssignment_1 )
            // InternalGame.g:3007:3: rule__Choix__NumeroAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Choix__NumeroAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getNumeroAssignment_1()); 

            }


            }

        }
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
    // InternalGame.g:3015:1: rule__Choix__Group__2 : rule__Choix__Group__2__Impl rule__Choix__Group__3 ;
    public final void rule__Choix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3019:1: ( rule__Choix__Group__2__Impl rule__Choix__Group__3 )
            // InternalGame.g:3020:2: rule__Choix__Group__2__Impl rule__Choix__Group__3
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
    // InternalGame.g:3027:1: rule__Choix__Group__2__Impl : ( '{' ) ;
    public final void rule__Choix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3031:1: ( ( '{' ) )
            // InternalGame.g:3032:1: ( '{' )
            {
            // InternalGame.g:3032:1: ( '{' )
            // InternalGame.g:3033:2: '{'
            {
             before(grammarAccess.getChoixAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGame.g:3042:1: rule__Choix__Group__3 : rule__Choix__Group__3__Impl rule__Choix__Group__4 ;
    public final void rule__Choix__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3046:1: ( rule__Choix__Group__3__Impl rule__Choix__Group__4 )
            // InternalGame.g:3047:2: rule__Choix__Group__3__Impl rule__Choix__Group__4
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
    // InternalGame.g:3054:1: rule__Choix__Group__3__Impl : ( 'reponse' ) ;
    public final void rule__Choix__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3058:1: ( ( 'reponse' ) )
            // InternalGame.g:3059:1: ( 'reponse' )
            {
            // InternalGame.g:3059:1: ( 'reponse' )
            // InternalGame.g:3060:2: 'reponse'
            {
             before(grammarAccess.getChoixAccess().getReponseKeyword_3()); 
            match(input,46,FOLLOW_2); 
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
    // InternalGame.g:3069:1: rule__Choix__Group__4 : rule__Choix__Group__4__Impl rule__Choix__Group__5 ;
    public final void rule__Choix__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3073:1: ( rule__Choix__Group__4__Impl rule__Choix__Group__5 )
            // InternalGame.g:3074:2: rule__Choix__Group__4__Impl rule__Choix__Group__5
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
    // InternalGame.g:3081:1: rule__Choix__Group__4__Impl : ( ( rule__Choix__ReponseAssignment_4 ) ) ;
    public final void rule__Choix__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3085:1: ( ( ( rule__Choix__ReponseAssignment_4 ) ) )
            // InternalGame.g:3086:1: ( ( rule__Choix__ReponseAssignment_4 ) )
            {
            // InternalGame.g:3086:1: ( ( rule__Choix__ReponseAssignment_4 ) )
            // InternalGame.g:3087:2: ( rule__Choix__ReponseAssignment_4 )
            {
             before(grammarAccess.getChoixAccess().getReponseAssignment_4()); 
            // InternalGame.g:3088:2: ( rule__Choix__ReponseAssignment_4 )
            // InternalGame.g:3088:3: rule__Choix__ReponseAssignment_4
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
    // InternalGame.g:3096:1: rule__Choix__Group__5 : rule__Choix__Group__5__Impl rule__Choix__Group__6 ;
    public final void rule__Choix__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3100:1: ( rule__Choix__Group__5__Impl rule__Choix__Group__6 )
            // InternalGame.g:3101:2: rule__Choix__Group__5__Impl rule__Choix__Group__6
            {
            pushFollow(FOLLOW_41);
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
    // InternalGame.g:3108:1: rule__Choix__Group__5__Impl : ( ( rule__Choix__Group_5__0 )* ) ;
    public final void rule__Choix__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3112:1: ( ( ( rule__Choix__Group_5__0 )* ) )
            // InternalGame.g:3113:1: ( ( rule__Choix__Group_5__0 )* )
            {
            // InternalGame.g:3113:1: ( ( rule__Choix__Group_5__0 )* )
            // InternalGame.g:3114:2: ( rule__Choix__Group_5__0 )*
            {
             before(grammarAccess.getChoixAccess().getGroup_5()); 
            // InternalGame.g:3115:2: ( rule__Choix__Group_5__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=12 && LA17_0<=13)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGame.g:3115:3: rule__Choix__Group_5__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__Choix__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

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
    // InternalGame.g:3123:1: rule__Choix__Group__6 : rule__Choix__Group__6__Impl ;
    public final void rule__Choix__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3127:1: ( rule__Choix__Group__6__Impl )
            // InternalGame.g:3128:2: rule__Choix__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalGame.g:3134:1: rule__Choix__Group__6__Impl : ( '}' ) ;
    public final void rule__Choix__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3138:1: ( ( '}' ) )
            // InternalGame.g:3139:1: ( '}' )
            {
            // InternalGame.g:3139:1: ( '}' )
            // InternalGame.g:3140:2: '}'
            {
             before(grammarAccess.getChoixAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Choix__Group_5__0"
    // InternalGame.g:3150:1: rule__Choix__Group_5__0 : rule__Choix__Group_5__0__Impl rule__Choix__Group_5__1 ;
    public final void rule__Choix__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3154:1: ( rule__Choix__Group_5__0__Impl rule__Choix__Group_5__1 )
            // InternalGame.g:3155:2: rule__Choix__Group_5__0__Impl rule__Choix__Group_5__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalGame.g:3162:1: rule__Choix__Group_5__0__Impl : ( ( rule__Choix__Alternatives_5_0 ) ) ;
    public final void rule__Choix__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3166:1: ( ( ( rule__Choix__Alternatives_5_0 ) ) )
            // InternalGame.g:3167:1: ( ( rule__Choix__Alternatives_5_0 ) )
            {
            // InternalGame.g:3167:1: ( ( rule__Choix__Alternatives_5_0 ) )
            // InternalGame.g:3168:2: ( rule__Choix__Alternatives_5_0 )
            {
             before(grammarAccess.getChoixAccess().getAlternatives_5_0()); 
            // InternalGame.g:3169:2: ( rule__Choix__Alternatives_5_0 )
            // InternalGame.g:3169:3: rule__Choix__Alternatives_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Alternatives_5_0();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getAlternatives_5_0()); 

            }


            }

        }
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
    // InternalGame.g:3177:1: rule__Choix__Group_5__1 : rule__Choix__Group_5__1__Impl rule__Choix__Group_5__2 ;
    public final void rule__Choix__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3181:1: ( rule__Choix__Group_5__1__Impl rule__Choix__Group_5__2 )
            // InternalGame.g:3182:2: rule__Choix__Group_5__1__Impl rule__Choix__Group_5__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:3189:1: rule__Choix__Group_5__1__Impl : ( ( rule__Choix__QteAssignment_5_1 ) ) ;
    public final void rule__Choix__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3193:1: ( ( ( rule__Choix__QteAssignment_5_1 ) ) )
            // InternalGame.g:3194:1: ( ( rule__Choix__QteAssignment_5_1 ) )
            {
            // InternalGame.g:3194:1: ( ( rule__Choix__QteAssignment_5_1 ) )
            // InternalGame.g:3195:2: ( rule__Choix__QteAssignment_5_1 )
            {
             before(grammarAccess.getChoixAccess().getQteAssignment_5_1()); 
            // InternalGame.g:3196:2: ( rule__Choix__QteAssignment_5_1 )
            // InternalGame.g:3196:3: rule__Choix__QteAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Choix__QteAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getQteAssignment_5_1()); 

            }


            }

        }
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
    // InternalGame.g:3204:1: rule__Choix__Group_5__2 : rule__Choix__Group_5__2__Impl ;
    public final void rule__Choix__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3208:1: ( rule__Choix__Group_5__2__Impl )
            // InternalGame.g:3209:2: rule__Choix__Group_5__2__Impl
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
    // InternalGame.g:3215:1: rule__Choix__Group_5__2__Impl : ( ( rule__Choix__AvantageAssignment_5_2 ) ) ;
    public final void rule__Choix__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3219:1: ( ( ( rule__Choix__AvantageAssignment_5_2 ) ) )
            // InternalGame.g:3220:1: ( ( rule__Choix__AvantageAssignment_5_2 ) )
            {
            // InternalGame.g:3220:1: ( ( rule__Choix__AvantageAssignment_5_2 ) )
            // InternalGame.g:3221:2: ( rule__Choix__AvantageAssignment_5_2 )
            {
             before(grammarAccess.getChoixAccess().getAvantageAssignment_5_2()); 
            // InternalGame.g:3222:2: ( rule__Choix__AvantageAssignment_5_2 )
            // InternalGame.g:3222:3: rule__Choix__AvantageAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Choix__AvantageAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getAvantageAssignment_5_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Condition__Group_0__0"
    // InternalGame.g:3231:1: rule__Condition__Group_0__0 : rule__Condition__Group_0__0__Impl rule__Condition__Group_0__1 ;
    public final void rule__Condition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3235:1: ( rule__Condition__Group_0__0__Impl rule__Condition__Group_0__1 )
            // InternalGame.g:3236:2: rule__Condition__Group_0__0__Impl rule__Condition__Group_0__1
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
    // InternalGame.g:3243:1: rule__Condition__Group_0__0__Impl : ( 'condition' ) ;
    public final void rule__Condition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3247:1: ( ( 'condition' ) )
            // InternalGame.g:3248:1: ( 'condition' )
            {
            // InternalGame.g:3248:1: ( 'condition' )
            // InternalGame.g:3249:2: 'condition'
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
    // InternalGame.g:3258:1: rule__Condition__Group_0__1 : rule__Condition__Group_0__1__Impl rule__Condition__Group_0__2 ;
    public final void rule__Condition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3262:1: ( rule__Condition__Group_0__1__Impl rule__Condition__Group_0__2 )
            // InternalGame.g:3263:2: rule__Condition__Group_0__1__Impl rule__Condition__Group_0__2
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
    // InternalGame.g:3270:1: rule__Condition__Group_0__1__Impl : ( ( rule__Condition__NameAssignment_0_1 ) ) ;
    public final void rule__Condition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3274:1: ( ( ( rule__Condition__NameAssignment_0_1 ) ) )
            // InternalGame.g:3275:1: ( ( rule__Condition__NameAssignment_0_1 ) )
            {
            // InternalGame.g:3275:1: ( ( rule__Condition__NameAssignment_0_1 ) )
            // InternalGame.g:3276:2: ( rule__Condition__NameAssignment_0_1 )
            {
             before(grammarAccess.getConditionAccess().getNameAssignment_0_1()); 
            // InternalGame.g:3277:2: ( rule__Condition__NameAssignment_0_1 )
            // InternalGame.g:3277:3: rule__Condition__NameAssignment_0_1
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
    // InternalGame.g:3285:1: rule__Condition__Group_0__2 : rule__Condition__Group_0__2__Impl rule__Condition__Group_0__3 ;
    public final void rule__Condition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3289:1: ( rule__Condition__Group_0__2__Impl rule__Condition__Group_0__3 )
            // InternalGame.g:3290:2: rule__Condition__Group_0__2__Impl rule__Condition__Group_0__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalGame.g:3297:1: rule__Condition__Group_0__2__Impl : ( '{' ) ;
    public final void rule__Condition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3301:1: ( ( '{' ) )
            // InternalGame.g:3302:1: ( '{' )
            {
            // InternalGame.g:3302:1: ( '{' )
            // InternalGame.g:3303:2: '{'
            {
             before(grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_0_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGame.g:3312:1: rule__Condition__Group_0__3 : rule__Condition__Group_0__3__Impl rule__Condition__Group_0__4 ;
    public final void rule__Condition__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3316:1: ( rule__Condition__Group_0__3__Impl rule__Condition__Group_0__4 )
            // InternalGame.g:3317:2: rule__Condition__Group_0__3__Impl rule__Condition__Group_0__4
            {
            pushFollow(FOLLOW_43);
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
    // InternalGame.g:3324:1: rule__Condition__Group_0__3__Impl : ( ( rule__Condition__Group_0_3__0 )* ) ;
    public final void rule__Condition__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3328:1: ( ( ( rule__Condition__Group_0_3__0 )* ) )
            // InternalGame.g:3329:1: ( ( rule__Condition__Group_0_3__0 )* )
            {
            // InternalGame.g:3329:1: ( ( rule__Condition__Group_0_3__0 )* )
            // InternalGame.g:3330:2: ( rule__Condition__Group_0_3__0 )*
            {
             before(grammarAccess.getConditionAccess().getGroup_0_3()); 
            // InternalGame.g:3331:2: ( rule__Condition__Group_0_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==38) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGame.g:3331:3: rule__Condition__Group_0_3__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__Condition__Group_0_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalGame.g:3339:1: rule__Condition__Group_0__4 : rule__Condition__Group_0__4__Impl rule__Condition__Group_0__5 ;
    public final void rule__Condition__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3343:1: ( rule__Condition__Group_0__4__Impl rule__Condition__Group_0__5 )
            // InternalGame.g:3344:2: rule__Condition__Group_0__4__Impl rule__Condition__Group_0__5
            {
            pushFollow(FOLLOW_43);
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
    // InternalGame.g:3351:1: rule__Condition__Group_0__4__Impl : ( ( rule__Condition__Group_0_4__0 )* ) ;
    public final void rule__Condition__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3355:1: ( ( ( rule__Condition__Group_0_4__0 )* ) )
            // InternalGame.g:3356:1: ( ( rule__Condition__Group_0_4__0 )* )
            {
            // InternalGame.g:3356:1: ( ( rule__Condition__Group_0_4__0 )* )
            // InternalGame.g:3357:2: ( rule__Condition__Group_0_4__0 )*
            {
             before(grammarAccess.getConditionAccess().getGroup_0_4()); 
            // InternalGame.g:3358:2: ( rule__Condition__Group_0_4__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_INT) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGame.g:3358:3: rule__Condition__Group_0_4__0
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__Condition__Group_0_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalGame.g:3366:1: rule__Condition__Group_0__5 : rule__Condition__Group_0__5__Impl ;
    public final void rule__Condition__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3370:1: ( rule__Condition__Group_0__5__Impl )
            // InternalGame.g:3371:2: rule__Condition__Group_0__5__Impl
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
    // InternalGame.g:3377:1: rule__Condition__Group_0__5__Impl : ( '}' ) ;
    public final void rule__Condition__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3381:1: ( ( '}' ) )
            // InternalGame.g:3382:1: ( '}' )
            {
            // InternalGame.g:3382:1: ( '}' )
            // InternalGame.g:3383:2: '}'
            {
             before(grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_0_5()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGame.g:3393:1: rule__Condition__Group_0_3__0 : rule__Condition__Group_0_3__0__Impl rule__Condition__Group_0_3__1 ;
    public final void rule__Condition__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3397:1: ( rule__Condition__Group_0_3__0__Impl rule__Condition__Group_0_3__1 )
            // InternalGame.g:3398:2: rule__Condition__Group_0_3__0__Impl rule__Condition__Group_0_3__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalGame.g:3405:1: rule__Condition__Group_0_3__0__Impl : ( 'connaissances' ) ;
    public final void rule__Condition__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3409:1: ( ( 'connaissances' ) )
            // InternalGame.g:3410:1: ( 'connaissances' )
            {
            // InternalGame.g:3410:1: ( 'connaissances' )
            // InternalGame.g:3411:2: 'connaissances'
            {
             before(grammarAccess.getConditionAccess().getConnaissancesKeyword_0_3_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalGame.g:3420:1: rule__Condition__Group_0_3__1 : rule__Condition__Group_0_3__1__Impl ;
    public final void rule__Condition__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3424:1: ( rule__Condition__Group_0_3__1__Impl )
            // InternalGame.g:3425:2: rule__Condition__Group_0_3__1__Impl
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
    // InternalGame.g:3431:1: rule__Condition__Group_0_3__1__Impl : ( ( rule__Condition__Alternatives_0_3_1 ) ) ;
    public final void rule__Condition__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3435:1: ( ( ( rule__Condition__Alternatives_0_3_1 ) ) )
            // InternalGame.g:3436:1: ( ( rule__Condition__Alternatives_0_3_1 ) )
            {
            // InternalGame.g:3436:1: ( ( rule__Condition__Alternatives_0_3_1 ) )
            // InternalGame.g:3437:2: ( rule__Condition__Alternatives_0_3_1 )
            {
             before(grammarAccess.getConditionAccess().getAlternatives_0_3_1()); 
            // InternalGame.g:3438:2: ( rule__Condition__Alternatives_0_3_1 )
            // InternalGame.g:3438:3: rule__Condition__Alternatives_0_3_1
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
    // InternalGame.g:3447:1: rule__Condition__Group_0_3_1_0__0 : rule__Condition__Group_0_3_1_0__0__Impl rule__Condition__Group_0_3_1_0__1 ;
    public final void rule__Condition__Group_0_3_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3451:1: ( rule__Condition__Group_0_3_1_0__0__Impl rule__Condition__Group_0_3_1_0__1 )
            // InternalGame.g:3452:2: rule__Condition__Group_0_3_1_0__0__Impl rule__Condition__Group_0_3_1_0__1
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
    // InternalGame.g:3459:1: rule__Condition__Group_0_3_1_0__0__Impl : ( 'requises' ) ;
    public final void rule__Condition__Group_0_3_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3463:1: ( ( 'requises' ) )
            // InternalGame.g:3464:1: ( 'requises' )
            {
            // InternalGame.g:3464:1: ( 'requises' )
            // InternalGame.g:3465:2: 'requises'
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
    // InternalGame.g:3474:1: rule__Condition__Group_0_3_1_0__1 : rule__Condition__Group_0_3_1_0__1__Impl ;
    public final void rule__Condition__Group_0_3_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3478:1: ( rule__Condition__Group_0_3_1_0__1__Impl )
            // InternalGame.g:3479:2: rule__Condition__Group_0_3_1_0__1__Impl
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
    // InternalGame.g:3485:1: rule__Condition__Group_0_3_1_0__1__Impl : ( ( rule__Condition__ConnaissancesRequisesAssignment_0_3_1_0_1 )* ) ;
    public final void rule__Condition__Group_0_3_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3489:1: ( ( ( rule__Condition__ConnaissancesRequisesAssignment_0_3_1_0_1 )* ) )
            // InternalGame.g:3490:1: ( ( rule__Condition__ConnaissancesRequisesAssignment_0_3_1_0_1 )* )
            {
            // InternalGame.g:3490:1: ( ( rule__Condition__ConnaissancesRequisesAssignment_0_3_1_0_1 )* )
            // InternalGame.g:3491:2: ( rule__Condition__ConnaissancesRequisesAssignment_0_3_1_0_1 )*
            {
             before(grammarAccess.getConditionAccess().getConnaissancesRequisesAssignment_0_3_1_0_1()); 
            // InternalGame.g:3492:2: ( rule__Condition__ConnaissancesRequisesAssignment_0_3_1_0_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGame.g:3492:3: rule__Condition__ConnaissancesRequisesAssignment_0_3_1_0_1
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__Condition__ConnaissancesRequisesAssignment_0_3_1_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalGame.g:3501:1: rule__Condition__Group_0_3_1_1__0 : rule__Condition__Group_0_3_1_1__0__Impl rule__Condition__Group_0_3_1_1__1 ;
    public final void rule__Condition__Group_0_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3505:1: ( rule__Condition__Group_0_3_1_1__0__Impl rule__Condition__Group_0_3_1_1__1 )
            // InternalGame.g:3506:2: rule__Condition__Group_0_3_1_1__0__Impl rule__Condition__Group_0_3_1_1__1
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
    // InternalGame.g:3513:1: rule__Condition__Group_0_3_1_1__0__Impl : ( 'interdites' ) ;
    public final void rule__Condition__Group_0_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3517:1: ( ( 'interdites' ) )
            // InternalGame.g:3518:1: ( 'interdites' )
            {
            // InternalGame.g:3518:1: ( 'interdites' )
            // InternalGame.g:3519:2: 'interdites'
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
    // InternalGame.g:3528:1: rule__Condition__Group_0_3_1_1__1 : rule__Condition__Group_0_3_1_1__1__Impl ;
    public final void rule__Condition__Group_0_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3532:1: ( rule__Condition__Group_0_3_1_1__1__Impl )
            // InternalGame.g:3533:2: rule__Condition__Group_0_3_1_1__1__Impl
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
    // InternalGame.g:3539:1: rule__Condition__Group_0_3_1_1__1__Impl : ( ( rule__Condition__ConnaissancesInterditesAssignment_0_3_1_1_1 )* ) ;
    public final void rule__Condition__Group_0_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3543:1: ( ( ( rule__Condition__ConnaissancesInterditesAssignment_0_3_1_1_1 )* ) )
            // InternalGame.g:3544:1: ( ( rule__Condition__ConnaissancesInterditesAssignment_0_3_1_1_1 )* )
            {
            // InternalGame.g:3544:1: ( ( rule__Condition__ConnaissancesInterditesAssignment_0_3_1_1_1 )* )
            // InternalGame.g:3545:2: ( rule__Condition__ConnaissancesInterditesAssignment_0_3_1_1_1 )*
            {
             before(grammarAccess.getConditionAccess().getConnaissancesInterditesAssignment_0_3_1_1_1()); 
            // InternalGame.g:3546:2: ( rule__Condition__ConnaissancesInterditesAssignment_0_3_1_1_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalGame.g:3546:3: rule__Condition__ConnaissancesInterditesAssignment_0_3_1_1_1
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__Condition__ConnaissancesInterditesAssignment_0_3_1_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalGame.g:3555:1: rule__Condition__Group_0_4__0 : rule__Condition__Group_0_4__0__Impl rule__Condition__Group_0_4__1 ;
    public final void rule__Condition__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3559:1: ( rule__Condition__Group_0_4__0__Impl rule__Condition__Group_0_4__1 )
            // InternalGame.g:3560:2: rule__Condition__Group_0_4__0__Impl rule__Condition__Group_0_4__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalGame.g:3567:1: rule__Condition__Group_0_4__0__Impl : ( ( rule__Condition__QuantiteAssignment_0_4_0 ) ) ;
    public final void rule__Condition__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3571:1: ( ( ( rule__Condition__QuantiteAssignment_0_4_0 ) ) )
            // InternalGame.g:3572:1: ( ( rule__Condition__QuantiteAssignment_0_4_0 ) )
            {
            // InternalGame.g:3572:1: ( ( rule__Condition__QuantiteAssignment_0_4_0 ) )
            // InternalGame.g:3573:2: ( rule__Condition__QuantiteAssignment_0_4_0 )
            {
             before(grammarAccess.getConditionAccess().getQuantiteAssignment_0_4_0()); 
            // InternalGame.g:3574:2: ( rule__Condition__QuantiteAssignment_0_4_0 )
            // InternalGame.g:3574:3: rule__Condition__QuantiteAssignment_0_4_0
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
    // InternalGame.g:3582:1: rule__Condition__Group_0_4__1 : rule__Condition__Group_0_4__1__Impl rule__Condition__Group_0_4__2 ;
    public final void rule__Condition__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3586:1: ( rule__Condition__Group_0_4__1__Impl rule__Condition__Group_0_4__2 )
            // InternalGame.g:3587:2: rule__Condition__Group_0_4__1__Impl rule__Condition__Group_0_4__2
            {
            pushFollow(FOLLOW_49);
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
    // InternalGame.g:3594:1: rule__Condition__Group_0_4__1__Impl : ( 'objets' ) ;
    public final void rule__Condition__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3598:1: ( ( 'objets' ) )
            // InternalGame.g:3599:1: ( 'objets' )
            {
            // InternalGame.g:3599:1: ( 'objets' )
            // InternalGame.g:3600:2: 'objets'
            {
             before(grammarAccess.getConditionAccess().getObjetsKeyword_0_4_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalGame.g:3609:1: rule__Condition__Group_0_4__2 : rule__Condition__Group_0_4__2__Impl ;
    public final void rule__Condition__Group_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3613:1: ( rule__Condition__Group_0_4__2__Impl )
            // InternalGame.g:3614:2: rule__Condition__Group_0_4__2__Impl
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
    // InternalGame.g:3620:1: rule__Condition__Group_0_4__2__Impl : ( ( rule__Condition__Alternatives_0_4_2 ) ) ;
    public final void rule__Condition__Group_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3624:1: ( ( ( rule__Condition__Alternatives_0_4_2 ) ) )
            // InternalGame.g:3625:1: ( ( rule__Condition__Alternatives_0_4_2 ) )
            {
            // InternalGame.g:3625:1: ( ( rule__Condition__Alternatives_0_4_2 ) )
            // InternalGame.g:3626:2: ( rule__Condition__Alternatives_0_4_2 )
            {
             before(grammarAccess.getConditionAccess().getAlternatives_0_4_2()); 
            // InternalGame.g:3627:2: ( rule__Condition__Alternatives_0_4_2 )
            // InternalGame.g:3627:3: rule__Condition__Alternatives_0_4_2
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
    // InternalGame.g:3636:1: rule__Condition__Group_0_4_2_0__0 : rule__Condition__Group_0_4_2_0__0__Impl rule__Condition__Group_0_4_2_0__1 ;
    public final void rule__Condition__Group_0_4_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3640:1: ( rule__Condition__Group_0_4_2_0__0__Impl rule__Condition__Group_0_4_2_0__1 )
            // InternalGame.g:3641:2: rule__Condition__Group_0_4_2_0__0__Impl rule__Condition__Group_0_4_2_0__1
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
    // InternalGame.g:3648:1: rule__Condition__Group_0_4_2_0__0__Impl : ( 'requis' ) ;
    public final void rule__Condition__Group_0_4_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3652:1: ( ( 'requis' ) )
            // InternalGame.g:3653:1: ( 'requis' )
            {
            // InternalGame.g:3653:1: ( 'requis' )
            // InternalGame.g:3654:2: 'requis'
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
    // InternalGame.g:3663:1: rule__Condition__Group_0_4_2_0__1 : rule__Condition__Group_0_4_2_0__1__Impl ;
    public final void rule__Condition__Group_0_4_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3667:1: ( rule__Condition__Group_0_4_2_0__1__Impl )
            // InternalGame.g:3668:2: rule__Condition__Group_0_4_2_0__1__Impl
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
    // InternalGame.g:3674:1: rule__Condition__Group_0_4_2_0__1__Impl : ( ( rule__Condition__ObjetsRequisAssignment_0_4_2_0_1 )* ) ;
    public final void rule__Condition__Group_0_4_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3678:1: ( ( ( rule__Condition__ObjetsRequisAssignment_0_4_2_0_1 )* ) )
            // InternalGame.g:3679:1: ( ( rule__Condition__ObjetsRequisAssignment_0_4_2_0_1 )* )
            {
            // InternalGame.g:3679:1: ( ( rule__Condition__ObjetsRequisAssignment_0_4_2_0_1 )* )
            // InternalGame.g:3680:2: ( rule__Condition__ObjetsRequisAssignment_0_4_2_0_1 )*
            {
             before(grammarAccess.getConditionAccess().getObjetsRequisAssignment_0_4_2_0_1()); 
            // InternalGame.g:3681:2: ( rule__Condition__ObjetsRequisAssignment_0_4_2_0_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGame.g:3681:3: rule__Condition__ObjetsRequisAssignment_0_4_2_0_1
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__Condition__ObjetsRequisAssignment_0_4_2_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalGame.g:3690:1: rule__Condition__Group_0_4_2_1__0 : rule__Condition__Group_0_4_2_1__0__Impl rule__Condition__Group_0_4_2_1__1 ;
    public final void rule__Condition__Group_0_4_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3694:1: ( rule__Condition__Group_0_4_2_1__0__Impl rule__Condition__Group_0_4_2_1__1 )
            // InternalGame.g:3695:2: rule__Condition__Group_0_4_2_1__0__Impl rule__Condition__Group_0_4_2_1__1
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
    // InternalGame.g:3702:1: rule__Condition__Group_0_4_2_1__0__Impl : ( 'interdits' ) ;
    public final void rule__Condition__Group_0_4_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3706:1: ( ( 'interdits' ) )
            // InternalGame.g:3707:1: ( 'interdits' )
            {
            // InternalGame.g:3707:1: ( 'interdits' )
            // InternalGame.g:3708:2: 'interdits'
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
    // InternalGame.g:3717:1: rule__Condition__Group_0_4_2_1__1 : rule__Condition__Group_0_4_2_1__1__Impl ;
    public final void rule__Condition__Group_0_4_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3721:1: ( rule__Condition__Group_0_4_2_1__1__Impl )
            // InternalGame.g:3722:2: rule__Condition__Group_0_4_2_1__1__Impl
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
    // InternalGame.g:3728:1: rule__Condition__Group_0_4_2_1__1__Impl : ( ( rule__Condition__ObjetsInterditsAssignment_0_4_2_1_1 )* ) ;
    public final void rule__Condition__Group_0_4_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3732:1: ( ( ( rule__Condition__ObjetsInterditsAssignment_0_4_2_1_1 )* ) )
            // InternalGame.g:3733:1: ( ( rule__Condition__ObjetsInterditsAssignment_0_4_2_1_1 )* )
            {
            // InternalGame.g:3733:1: ( ( rule__Condition__ObjetsInterditsAssignment_0_4_2_1_1 )* )
            // InternalGame.g:3734:2: ( rule__Condition__ObjetsInterditsAssignment_0_4_2_1_1 )*
            {
             before(grammarAccess.getConditionAccess().getObjetsInterditsAssignment_0_4_2_1_1()); 
            // InternalGame.g:3735:2: ( rule__Condition__ObjetsInterditsAssignment_0_4_2_1_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGame.g:3735:3: rule__Condition__ObjetsInterditsAssignment_0_4_2_1_1
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__Condition__ObjetsInterditsAssignment_0_4_2_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalGame.g:3744:1: rule__Jeu__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Jeu__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3748:1: ( ( RULE_ID ) )
            // InternalGame.g:3749:2: ( RULE_ID )
            {
            // InternalGame.g:3749:2: ( RULE_ID )
            // InternalGame.g:3750:3: RULE_ID
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
    // InternalGame.g:3759:1: rule__Jeu__TerritoireAssignment_3 : ( ruleTerritoire ) ;
    public final void rule__Jeu__TerritoireAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3763:1: ( ( ruleTerritoire ) )
            // InternalGame.g:3764:2: ( ruleTerritoire )
            {
            // InternalGame.g:3764:2: ( ruleTerritoire )
            // InternalGame.g:3765:3: ruleTerritoire
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
    // InternalGame.g:3774:1: rule__Jeu__ExplorateurAssignment_4 : ( ruleExplorateur ) ;
    public final void rule__Jeu__ExplorateurAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3778:1: ( ( ruleExplorateur ) )
            // InternalGame.g:3779:2: ( ruleExplorateur )
            {
            // InternalGame.g:3779:2: ( ruleExplorateur )
            // InternalGame.g:3780:3: ruleExplorateur
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
    // InternalGame.g:3789:1: rule__Jeu__ElementsjeuAssignment_5 : ( ruleElementsJeu ) ;
    public final void rule__Jeu__ElementsjeuAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3793:1: ( ( ruleElementsJeu ) )
            // InternalGame.g:3794:2: ( ruleElementsJeu )
            {
            // InternalGame.g:3794:2: ( ruleElementsJeu )
            // InternalGame.g:3795:3: ruleElementsJeu
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


    // $ANTLR start "rule__Territoire__PlacesAssignment_2"
    // InternalGame.g:3804:1: rule__Territoire__PlacesAssignment_2 : ( rulePlace ) ;
    public final void rule__Territoire__PlacesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3808:1: ( ( rulePlace ) )
            // InternalGame.g:3809:2: ( rulePlace )
            {
            // InternalGame.g:3809:2: ( rulePlace )
            // InternalGame.g:3810:3: rulePlace
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
    // InternalGame.g:3819:1: rule__Lieu__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Lieu__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3823:1: ( ( RULE_ID ) )
            // InternalGame.g:3824:2: ( RULE_ID )
            {
            // InternalGame.g:3824:2: ( RULE_ID )
            // InternalGame.g:3825:3: RULE_ID
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
    // InternalGame.g:3834:1: rule__Lieu__NatureAssignment_3 : ( ruleNature ) ;
    public final void rule__Lieu__NatureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3838:1: ( ( ruleNature ) )
            // InternalGame.g:3839:2: ( ruleNature )
            {
            // InternalGame.g:3839:2: ( ruleNature )
            // InternalGame.g:3840:3: ruleNature
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
    // InternalGame.g:3849:1: rule__Chemin__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Chemin__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3853:1: ( ( RULE_ID ) )
            // InternalGame.g:3854:2: ( RULE_ID )
            {
            // InternalGame.g:3854:2: ( RULE_ID )
            // InternalGame.g:3855:3: RULE_ID
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
    // InternalGame.g:3864:1: rule__Chemin__PredAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__PredAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3868:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:3869:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:3869:2: ( ( RULE_ID ) )
            // InternalGame.g:3870:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getPredLieuCrossReference_4_0()); 
            // InternalGame.g:3871:3: ( RULE_ID )
            // InternalGame.g:3872:4: RULE_ID
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
    // InternalGame.g:3883:1: rule__Chemin__SuccAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__SuccAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3887:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:3888:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:3888:2: ( ( RULE_ID ) )
            // InternalGame.g:3889:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getSuccLieuCrossReference_6_0()); 
            // InternalGame.g:3890:3: ( RULE_ID )
            // InternalGame.g:3891:4: RULE_ID
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
    // InternalGame.g:3902:1: rule__Chemin__VisibleAssignment_8 : ( ruleCondition ) ;
    public final void rule__Chemin__VisibleAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3906:1: ( ( ruleCondition ) )
            // InternalGame.g:3907:2: ( ruleCondition )
            {
            // InternalGame.g:3907:2: ( ruleCondition )
            // InternalGame.g:3908:3: ruleCondition
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
    // InternalGame.g:3917:1: rule__Chemin__ObligatoireAssignment_10 : ( RULE_BOOL ) ;
    public final void rule__Chemin__ObligatoireAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3921:1: ( ( RULE_BOOL ) )
            // InternalGame.g:3922:2: ( RULE_BOOL )
            {
            // InternalGame.g:3922:2: ( RULE_BOOL )
            // InternalGame.g:3923:3: RULE_BOOL
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
    // InternalGame.g:3932:1: rule__Chemin__OuvertAssignment_12 : ( ruleCondition ) ;
    public final void rule__Chemin__OuvertAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3936:1: ( ( ruleCondition ) )
            // InternalGame.g:3937:2: ( ruleCondition )
            {
            // InternalGame.g:3937:2: ( ruleCondition )
            // InternalGame.g:3938:3: ruleCondition
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
    // InternalGame.g:3947:1: rule__Personne__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Personne__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3951:1: ( ( RULE_ID ) )
            // InternalGame.g:3952:2: ( RULE_ID )
            {
            // InternalGame.g:3952:2: ( RULE_ID )
            // InternalGame.g:3953:3: RULE_ID
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
    // InternalGame.g:3962:1: rule__Personne__PlaceAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Personne__PlaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3966:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:3967:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:3967:2: ( ( RULE_ID ) )
            // InternalGame.g:3968:3: ( RULE_ID )
            {
             before(grammarAccess.getPersonneAccess().getPlacePlaceCrossReference_4_0()); 
            // InternalGame.g:3969:3: ( RULE_ID )
            // InternalGame.g:3970:4: RULE_ID
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
    // InternalGame.g:3981:1: rule__Personne__VisibleAssignment_6 : ( ruleCondition ) ;
    public final void rule__Personne__VisibleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3985:1: ( ( ruleCondition ) )
            // InternalGame.g:3986:2: ( ruleCondition )
            {
            // InternalGame.g:3986:2: ( ruleCondition )
            // InternalGame.g:3987:3: ruleCondition
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
    // InternalGame.g:3996:1: rule__Personne__ActifAssignment_8 : ( ruleCondition ) ;
    public final void rule__Personne__ActifAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4000:1: ( ( ruleCondition ) )
            // InternalGame.g:4001:2: ( ruleCondition )
            {
            // InternalGame.g:4001:2: ( ruleCondition )
            // InternalGame.g:4002:3: ruleCondition
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
    // InternalGame.g:4011:1: rule__Personne__ObligatoireAssignment_10 : ( RULE_BOOL ) ;
    public final void rule__Personne__ObligatoireAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4015:1: ( ( RULE_BOOL ) )
            // InternalGame.g:4016:2: ( RULE_BOOL )
            {
            // InternalGame.g:4016:2: ( RULE_BOOL )
            // InternalGame.g:4017:3: RULE_BOOL
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
    // InternalGame.g:4026:1: rule__Personne__InteractionsAssignment_12 : ( ruleInteraction ) ;
    public final void rule__Personne__InteractionsAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4030:1: ( ( ruleInteraction ) )
            // InternalGame.g:4031:2: ( ruleInteraction )
            {
            // InternalGame.g:4031:2: ( ruleInteraction )
            // InternalGame.g:4032:3: ruleInteraction
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
    // InternalGame.g:4041:1: rule__Explorateur__PlaceAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Explorateur__PlaceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4045:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:4046:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:4046:2: ( ( RULE_ID ) )
            // InternalGame.g:4047:3: ( RULE_ID )
            {
             before(grammarAccess.getExplorateurAccess().getPlacePlaceCrossReference_3_0()); 
            // InternalGame.g:4048:3: ( RULE_ID )
            // InternalGame.g:4049:4: RULE_ID
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
    // InternalGame.g:4060:1: rule__Explorateur__TailleDispoAssignment_6 : ( RULE_INT ) ;
    public final void rule__Explorateur__TailleDispoAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4064:1: ( ( RULE_INT ) )
            // InternalGame.g:4065:2: ( RULE_INT )
            {
            // InternalGame.g:4065:2: ( RULE_INT )
            // InternalGame.g:4066:3: RULE_INT
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
    // InternalGame.g:4075:1: rule__Explorateur__ObjetsAssignment_7_2 : ( ruleObjet ) ;
    public final void rule__Explorateur__ObjetsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4079:1: ( ( ruleObjet ) )
            // InternalGame.g:4080:2: ( ruleObjet )
            {
            // InternalGame.g:4080:2: ( ruleObjet )
            // InternalGame.g:4081:3: ruleObjet
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
    // InternalGame.g:4090:1: rule__Explorateur__ConnaissancesAssignment_8_2 : ( ruleConnaissance ) ;
    public final void rule__Explorateur__ConnaissancesAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4094:1: ( ( ruleConnaissance ) )
            // InternalGame.g:4095:2: ( ruleConnaissance )
            {
            // InternalGame.g:4095:2: ( ruleConnaissance )
            // InternalGame.g:4096:3: ruleConnaissance
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
    // InternalGame.g:4105:1: rule__Connaissance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Connaissance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4109:1: ( ( RULE_ID ) )
            // InternalGame.g:4110:2: ( RULE_ID )
            {
            // InternalGame.g:4110:2: ( RULE_ID )
            // InternalGame.g:4111:3: RULE_ID
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
    // InternalGame.g:4120:1: rule__Connaissance__VisibleAssignment_4 : ( ruleCondition ) ;
    public final void rule__Connaissance__VisibleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4124:1: ( ( ruleCondition ) )
            // InternalGame.g:4125:2: ( ruleCondition )
            {
            // InternalGame.g:4125:2: ( ruleCondition )
            // InternalGame.g:4126:3: ruleCondition
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
    // InternalGame.g:4135:1: rule__Connaissance__ActifAssignment_6 : ( ruleCondition ) ;
    public final void rule__Connaissance__ActifAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4139:1: ( ( ruleCondition ) )
            // InternalGame.g:4140:2: ( ruleCondition )
            {
            // InternalGame.g:4140:2: ( ruleCondition )
            // InternalGame.g:4141:3: ruleCondition
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
    // InternalGame.g:4150:1: rule__Objet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Objet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4154:1: ( ( RULE_ID ) )
            // InternalGame.g:4155:2: ( RULE_ID )
            {
            // InternalGame.g:4155:2: ( RULE_ID )
            // InternalGame.g:4156:3: RULE_ID
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
    // InternalGame.g:4165:1: rule__Objet__VisibleAssignment_4 : ( ruleCondition ) ;
    public final void rule__Objet__VisibleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4169:1: ( ( ruleCondition ) )
            // InternalGame.g:4170:2: ( ruleCondition )
            {
            // InternalGame.g:4170:2: ( ruleCondition )
            // InternalGame.g:4171:3: ruleCondition
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
    // InternalGame.g:4180:1: rule__Objet__ActifAssignment_6 : ( ruleCondition ) ;
    public final void rule__Objet__ActifAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4184:1: ( ( ruleCondition ) )
            // InternalGame.g:4185:2: ( ruleCondition )
            {
            // InternalGame.g:4185:2: ( ruleCondition )
            // InternalGame.g:4186:3: ruleCondition
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
    // InternalGame.g:4195:1: rule__Objet__QteAssignment_8 : ( RULE_INT ) ;
    public final void rule__Objet__QteAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4199:1: ( ( RULE_INT ) )
            // InternalGame.g:4200:2: ( RULE_INT )
            {
            // InternalGame.g:4200:2: ( RULE_INT )
            // InternalGame.g:4201:3: RULE_INT
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
    // InternalGame.g:4210:1: rule__Objet__TailleAssignment_10 : ( RULE_INT ) ;
    public final void rule__Objet__TailleAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4214:1: ( ( RULE_INT ) )
            // InternalGame.g:4215:2: ( RULE_INT )
            {
            // InternalGame.g:4215:2: ( RULE_INT )
            // InternalGame.g:4216:3: RULE_INT
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
    // InternalGame.g:4225:1: rule__Objet__TransformableAssignment_12 : ( RULE_BOOL ) ;
    public final void rule__Objet__TransformableAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4229:1: ( ( RULE_BOOL ) )
            // InternalGame.g:4230:2: ( RULE_BOOL )
            {
            // InternalGame.g:4230:2: ( RULE_BOOL )
            // InternalGame.g:4231:3: RULE_BOOL
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


    // $ANTLR start "rule__Interaction__QuestionAssignment_3"
    // InternalGame.g:4240:1: rule__Interaction__QuestionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Interaction__QuestionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4244:1: ( ( RULE_STRING ) )
            // InternalGame.g:4245:2: ( RULE_STRING )
            {
            // InternalGame.g:4245:2: ( RULE_STRING )
            // InternalGame.g:4246:3: RULE_STRING
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
    // InternalGame.g:4255:1: rule__Interaction__ChoixAssignment_4 : ( ruleChoix ) ;
    public final void rule__Interaction__ChoixAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4259:1: ( ( ruleChoix ) )
            // InternalGame.g:4260:2: ( ruleChoix )
            {
            // InternalGame.g:4260:2: ( ruleChoix )
            // InternalGame.g:4261:3: ruleChoix
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


    // $ANTLR start "rule__Choix__NumeroAssignment_1"
    // InternalGame.g:4270:1: rule__Choix__NumeroAssignment_1 : ( RULE_INT ) ;
    public final void rule__Choix__NumeroAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4274:1: ( ( RULE_INT ) )
            // InternalGame.g:4275:2: ( RULE_INT )
            {
            // InternalGame.g:4275:2: ( RULE_INT )
            // InternalGame.g:4276:3: RULE_INT
            {
             before(grammarAccess.getChoixAccess().getNumeroINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getNumeroINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__NumeroAssignment_1"


    // $ANTLR start "rule__Choix__ReponseAssignment_4"
    // InternalGame.g:4285:1: rule__Choix__ReponseAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Choix__ReponseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4289:1: ( ( RULE_STRING ) )
            // InternalGame.g:4290:2: ( RULE_STRING )
            {
            // InternalGame.g:4290:2: ( RULE_STRING )
            // InternalGame.g:4291:3: RULE_STRING
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


    // $ANTLR start "rule__Choix__QteAssignment_5_1"
    // InternalGame.g:4300:1: rule__Choix__QteAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__Choix__QteAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4304:1: ( ( RULE_INT ) )
            // InternalGame.g:4305:2: ( RULE_INT )
            {
            // InternalGame.g:4305:2: ( RULE_INT )
            // InternalGame.g:4306:3: RULE_INT
            {
             before(grammarAccess.getChoixAccess().getQteINTTerminalRuleCall_5_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getQteINTTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__QteAssignment_5_1"


    // $ANTLR start "rule__Choix__AvantageAssignment_5_2"
    // InternalGame.g:4315:1: rule__Choix__AvantageAssignment_5_2 : ( ( RULE_ID ) ) ;
    public final void rule__Choix__AvantageAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4319:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:4320:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:4320:2: ( ( RULE_ID ) )
            // InternalGame.g:4321:3: ( RULE_ID )
            {
             before(grammarAccess.getChoixAccess().getAvantageAvantageCrossReference_5_2_0()); 
            // InternalGame.g:4322:3: ( RULE_ID )
            // InternalGame.g:4323:4: RULE_ID
            {
             before(grammarAccess.getChoixAccess().getAvantageAvantageIDTerminalRuleCall_5_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getAvantageAvantageIDTerminalRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getChoixAccess().getAvantageAvantageCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__AvantageAssignment_5_2"


    // $ANTLR start "rule__Condition__NameAssignment_0_1"
    // InternalGame.g:4334:1: rule__Condition__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Condition__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4338:1: ( ( RULE_ID ) )
            // InternalGame.g:4339:2: ( RULE_ID )
            {
            // InternalGame.g:4339:2: ( RULE_ID )
            // InternalGame.g:4340:3: RULE_ID
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
    // InternalGame.g:4349:1: rule__Condition__ConnaissancesRequisesAssignment_0_3_1_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Condition__ConnaissancesRequisesAssignment_0_3_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4353:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:4354:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:4354:2: ( ( RULE_ID ) )
            // InternalGame.g:4355:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionAccess().getConnaissancesRequisesConnaissanceCrossReference_0_3_1_0_1_0()); 
            // InternalGame.g:4356:3: ( RULE_ID )
            // InternalGame.g:4357:4: RULE_ID
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
    // InternalGame.g:4368:1: rule__Condition__ConnaissancesInterditesAssignment_0_3_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Condition__ConnaissancesInterditesAssignment_0_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4372:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:4373:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:4373:2: ( ( RULE_ID ) )
            // InternalGame.g:4374:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionAccess().getConnaissancesInterditesConnaissanceCrossReference_0_3_1_1_1_0()); 
            // InternalGame.g:4375:3: ( RULE_ID )
            // InternalGame.g:4376:4: RULE_ID
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
    // InternalGame.g:4387:1: rule__Condition__QuantiteAssignment_0_4_0 : ( RULE_INT ) ;
    public final void rule__Condition__QuantiteAssignment_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4391:1: ( ( RULE_INT ) )
            // InternalGame.g:4392:2: ( RULE_INT )
            {
            // InternalGame.g:4392:2: ( RULE_INT )
            // InternalGame.g:4393:3: RULE_INT
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
    // InternalGame.g:4402:1: rule__Condition__ObjetsRequisAssignment_0_4_2_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Condition__ObjetsRequisAssignment_0_4_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4406:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:4407:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:4407:2: ( ( RULE_ID ) )
            // InternalGame.g:4408:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionAccess().getObjetsRequisObjetCrossReference_0_4_2_0_1_0()); 
            // InternalGame.g:4409:3: ( RULE_ID )
            // InternalGame.g:4410:4: RULE_ID
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
    // InternalGame.g:4421:1: rule__Condition__ObjetsInterditsAssignment_0_4_2_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Condition__ObjetsInterditsAssignment_0_4_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4425:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:4426:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:4426:2: ( ( RULE_ID ) )
            // InternalGame.g:4427:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionAccess().getObjetsInterditsObjetCrossReference_0_4_2_1_1_0()); 
            // InternalGame.g:4428:3: ( RULE_ID )
            // InternalGame.g:4429:4: RULE_ID
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000018020A80000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000018020A00002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000018020A00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080000080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000005000080000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000083000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000004000080040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x000C000000000000L});

}