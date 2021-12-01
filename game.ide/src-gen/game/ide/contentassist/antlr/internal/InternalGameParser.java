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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_BOOL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'depart'", "'fin'", "'intermediaire'", "'jeu'", "'{'", "'}'", "'territoire'", "'lieu'", "':'", "'chemin'", "'de'", "'vers'", "'visible'", "'obligatoire'", "'ouvert'", "'personne'", "'actif'", "'interactions'", "'explorateur'", "'localisation'", "'taille'", "'disponible'", "'objets'", "'possedes'", "'connaissances'", "'connaissance'", "'objet'", "'quantite'", "'transformable'", "'interaction'", "'question'", "'choix'", "'reponse'", "'recompense'", "'avantage'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
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
    public static final int RULE_BOOL=5;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
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


    // $ANTLR start "entryRuleRecompense"
    // InternalGame.g:378:1: entryRuleRecompense : ruleRecompense EOF ;
    public final void entryRuleRecompense() throws RecognitionException {
        try {
            // InternalGame.g:379:1: ( ruleRecompense EOF )
            // InternalGame.g:380:1: ruleRecompense EOF
            {
             before(grammarAccess.getRecompenseRule()); 
            pushFollow(FOLLOW_1);
            ruleRecompense();

            state._fsp--;

             after(grammarAccess.getRecompenseRule()); 
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
    // $ANTLR end "entryRuleRecompense"


    // $ANTLR start "ruleRecompense"
    // InternalGame.g:387:1: ruleRecompense : ( ( rule__Recompense__Group__0 ) ) ;
    public final void ruleRecompense() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:391:2: ( ( ( rule__Recompense__Group__0 ) ) )
            // InternalGame.g:392:2: ( ( rule__Recompense__Group__0 ) )
            {
            // InternalGame.g:392:2: ( ( rule__Recompense__Group__0 ) )
            // InternalGame.g:393:3: ( rule__Recompense__Group__0 )
            {
             before(grammarAccess.getRecompenseAccess().getGroup()); 
            // InternalGame.g:394:3: ( rule__Recompense__Group__0 )
            // InternalGame.g:394:4: rule__Recompense__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Recompense__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecompenseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecompense"


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


    // $ANTLR start "rule__Nature__Alternatives"
    // InternalGame.g:487:1: rule__Nature__Alternatives : ( ( ( 'depart' ) ) | ( ( 'fin' ) ) | ( ( 'intermediaire' ) ) );
    public final void rule__Nature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:491:1: ( ( ( 'depart' ) ) | ( ( 'fin' ) ) | ( ( 'intermediaire' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 14:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGame.g:492:2: ( ( 'depart' ) )
                    {
                    // InternalGame.g:492:2: ( ( 'depart' ) )
                    // InternalGame.g:493:3: ( 'depart' )
                    {
                     before(grammarAccess.getNatureAccess().getDepartEnumLiteralDeclaration_0()); 
                    // InternalGame.g:494:3: ( 'depart' )
                    // InternalGame.g:494:4: 'depart'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getNatureAccess().getDepartEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:498:2: ( ( 'fin' ) )
                    {
                    // InternalGame.g:498:2: ( ( 'fin' ) )
                    // InternalGame.g:499:3: ( 'fin' )
                    {
                     before(grammarAccess.getNatureAccess().getFinEnumLiteralDeclaration_1()); 
                    // InternalGame.g:500:3: ( 'fin' )
                    // InternalGame.g:500:4: 'fin'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getNatureAccess().getFinEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:504:2: ( ( 'intermediaire' ) )
                    {
                    // InternalGame.g:504:2: ( ( 'intermediaire' ) )
                    // InternalGame.g:505:3: ( 'intermediaire' )
                    {
                     before(grammarAccess.getNatureAccess().getInterEnumLiteralDeclaration_2()); 
                    // InternalGame.g:506:3: ( 'intermediaire' )
                    // InternalGame.g:506:4: 'intermediaire'
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
    // InternalGame.g:514:1: rule__Jeu__Group__0 : rule__Jeu__Group__0__Impl rule__Jeu__Group__1 ;
    public final void rule__Jeu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:518:1: ( rule__Jeu__Group__0__Impl rule__Jeu__Group__1 )
            // InternalGame.g:519:2: rule__Jeu__Group__0__Impl rule__Jeu__Group__1
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
    // InternalGame.g:526:1: rule__Jeu__Group__0__Impl : ( 'jeu' ) ;
    public final void rule__Jeu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:530:1: ( ( 'jeu' ) )
            // InternalGame.g:531:1: ( 'jeu' )
            {
            // InternalGame.g:531:1: ( 'jeu' )
            // InternalGame.g:532:2: 'jeu'
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
    // InternalGame.g:541:1: rule__Jeu__Group__1 : rule__Jeu__Group__1__Impl rule__Jeu__Group__2 ;
    public final void rule__Jeu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:545:1: ( rule__Jeu__Group__1__Impl rule__Jeu__Group__2 )
            // InternalGame.g:546:2: rule__Jeu__Group__1__Impl rule__Jeu__Group__2
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
    // InternalGame.g:553:1: rule__Jeu__Group__1__Impl : ( ( rule__Jeu__NomAssignment_1 ) ) ;
    public final void rule__Jeu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:557:1: ( ( ( rule__Jeu__NomAssignment_1 ) ) )
            // InternalGame.g:558:1: ( ( rule__Jeu__NomAssignment_1 ) )
            {
            // InternalGame.g:558:1: ( ( rule__Jeu__NomAssignment_1 ) )
            // InternalGame.g:559:2: ( rule__Jeu__NomAssignment_1 )
            {
             before(grammarAccess.getJeuAccess().getNomAssignment_1()); 
            // InternalGame.g:560:2: ( rule__Jeu__NomAssignment_1 )
            // InternalGame.g:560:3: rule__Jeu__NomAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__NomAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJeuAccess().getNomAssignment_1()); 

            }


            }

        }
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
    // InternalGame.g:568:1: rule__Jeu__Group__2 : rule__Jeu__Group__2__Impl rule__Jeu__Group__3 ;
    public final void rule__Jeu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:572:1: ( rule__Jeu__Group__2__Impl rule__Jeu__Group__3 )
            // InternalGame.g:573:2: rule__Jeu__Group__2__Impl rule__Jeu__Group__3
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
    // InternalGame.g:580:1: rule__Jeu__Group__2__Impl : ( '{' ) ;
    public final void rule__Jeu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:584:1: ( ( '{' ) )
            // InternalGame.g:585:1: ( '{' )
            {
            // InternalGame.g:585:1: ( '{' )
            // InternalGame.g:586:2: '{'
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
    // InternalGame.g:595:1: rule__Jeu__Group__3 : rule__Jeu__Group__3__Impl rule__Jeu__Group__4 ;
    public final void rule__Jeu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:599:1: ( rule__Jeu__Group__3__Impl rule__Jeu__Group__4 )
            // InternalGame.g:600:2: rule__Jeu__Group__3__Impl rule__Jeu__Group__4
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
    // InternalGame.g:607:1: rule__Jeu__Group__3__Impl : ( ( rule__Jeu__TerritoireAssignment_3 ) ) ;
    public final void rule__Jeu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:611:1: ( ( ( rule__Jeu__TerritoireAssignment_3 ) ) )
            // InternalGame.g:612:1: ( ( rule__Jeu__TerritoireAssignment_3 ) )
            {
            // InternalGame.g:612:1: ( ( rule__Jeu__TerritoireAssignment_3 ) )
            // InternalGame.g:613:2: ( rule__Jeu__TerritoireAssignment_3 )
            {
             before(grammarAccess.getJeuAccess().getTerritoireAssignment_3()); 
            // InternalGame.g:614:2: ( rule__Jeu__TerritoireAssignment_3 )
            // InternalGame.g:614:3: rule__Jeu__TerritoireAssignment_3
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
    // InternalGame.g:622:1: rule__Jeu__Group__4 : rule__Jeu__Group__4__Impl rule__Jeu__Group__5 ;
    public final void rule__Jeu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:626:1: ( rule__Jeu__Group__4__Impl rule__Jeu__Group__5 )
            // InternalGame.g:627:2: rule__Jeu__Group__4__Impl rule__Jeu__Group__5
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
    // InternalGame.g:634:1: rule__Jeu__Group__4__Impl : ( ( rule__Jeu__ExplorateurAssignment_4 ) ) ;
    public final void rule__Jeu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:638:1: ( ( ( rule__Jeu__ExplorateurAssignment_4 ) ) )
            // InternalGame.g:639:1: ( ( rule__Jeu__ExplorateurAssignment_4 ) )
            {
            // InternalGame.g:639:1: ( ( rule__Jeu__ExplorateurAssignment_4 ) )
            // InternalGame.g:640:2: ( rule__Jeu__ExplorateurAssignment_4 )
            {
             before(grammarAccess.getJeuAccess().getExplorateurAssignment_4()); 
            // InternalGame.g:641:2: ( rule__Jeu__ExplorateurAssignment_4 )
            // InternalGame.g:641:3: rule__Jeu__ExplorateurAssignment_4
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
    // InternalGame.g:649:1: rule__Jeu__Group__5 : rule__Jeu__Group__5__Impl rule__Jeu__Group__6 ;
    public final void rule__Jeu__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:653:1: ( rule__Jeu__Group__5__Impl rule__Jeu__Group__6 )
            // InternalGame.g:654:2: rule__Jeu__Group__5__Impl rule__Jeu__Group__6
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
    // InternalGame.g:661:1: rule__Jeu__Group__5__Impl : ( ( rule__Jeu__ElementsjeuAssignment_5 )* ) ;
    public final void rule__Jeu__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:665:1: ( ( ( rule__Jeu__ElementsjeuAssignment_5 )* ) )
            // InternalGame.g:666:1: ( ( rule__Jeu__ElementsjeuAssignment_5 )* )
            {
            // InternalGame.g:666:1: ( ( rule__Jeu__ElementsjeuAssignment_5 )* )
            // InternalGame.g:667:2: ( rule__Jeu__ElementsjeuAssignment_5 )*
            {
             before(grammarAccess.getJeuAccess().getElementsjeuAssignment_5()); 
            // InternalGame.g:668:2: ( rule__Jeu__ElementsjeuAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19||LA5_0==21||LA5_0==27||(LA5_0>=37 && LA5_0<=38)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGame.g:668:3: rule__Jeu__ElementsjeuAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Jeu__ElementsjeuAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalGame.g:676:1: rule__Jeu__Group__6 : rule__Jeu__Group__6__Impl ;
    public final void rule__Jeu__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:680:1: ( rule__Jeu__Group__6__Impl )
            // InternalGame.g:681:2: rule__Jeu__Group__6__Impl
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
    // InternalGame.g:687:1: rule__Jeu__Group__6__Impl : ( '}' ) ;
    public final void rule__Jeu__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:691:1: ( ( '}' ) )
            // InternalGame.g:692:1: ( '}' )
            {
            // InternalGame.g:692:1: ( '}' )
            // InternalGame.g:693:2: '}'
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


    // $ANTLR start "rule__Territoire__Group__0"
    // InternalGame.g:703:1: rule__Territoire__Group__0 : rule__Territoire__Group__0__Impl rule__Territoire__Group__1 ;
    public final void rule__Territoire__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:707:1: ( rule__Territoire__Group__0__Impl rule__Territoire__Group__1 )
            // InternalGame.g:708:2: rule__Territoire__Group__0__Impl rule__Territoire__Group__1
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
    // InternalGame.g:715:1: rule__Territoire__Group__0__Impl : ( 'territoire' ) ;
    public final void rule__Territoire__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:719:1: ( ( 'territoire' ) )
            // InternalGame.g:720:1: ( 'territoire' )
            {
            // InternalGame.g:720:1: ( 'territoire' )
            // InternalGame.g:721:2: 'territoire'
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
    // InternalGame.g:730:1: rule__Territoire__Group__1 : rule__Territoire__Group__1__Impl rule__Territoire__Group__2 ;
    public final void rule__Territoire__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:734:1: ( rule__Territoire__Group__1__Impl rule__Territoire__Group__2 )
            // InternalGame.g:735:2: rule__Territoire__Group__1__Impl rule__Territoire__Group__2
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
    // InternalGame.g:742:1: rule__Territoire__Group__1__Impl : ( '{' ) ;
    public final void rule__Territoire__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:746:1: ( ( '{' ) )
            // InternalGame.g:747:1: ( '{' )
            {
            // InternalGame.g:747:1: ( '{' )
            // InternalGame.g:748:2: '{'
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
    // InternalGame.g:757:1: rule__Territoire__Group__2 : rule__Territoire__Group__2__Impl rule__Territoire__Group__3 ;
    public final void rule__Territoire__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:761:1: ( rule__Territoire__Group__2__Impl rule__Territoire__Group__3 )
            // InternalGame.g:762:2: rule__Territoire__Group__2__Impl rule__Territoire__Group__3
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
    // InternalGame.g:769:1: rule__Territoire__Group__2__Impl : ( ( ( rule__Territoire__PlacesAssignment_2 ) ) ( ( rule__Territoire__PlacesAssignment_2 )* ) ) ;
    public final void rule__Territoire__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:773:1: ( ( ( ( rule__Territoire__PlacesAssignment_2 ) ) ( ( rule__Territoire__PlacesAssignment_2 )* ) ) )
            // InternalGame.g:774:1: ( ( ( rule__Territoire__PlacesAssignment_2 ) ) ( ( rule__Territoire__PlacesAssignment_2 )* ) )
            {
            // InternalGame.g:774:1: ( ( ( rule__Territoire__PlacesAssignment_2 ) ) ( ( rule__Territoire__PlacesAssignment_2 )* ) )
            // InternalGame.g:775:2: ( ( rule__Territoire__PlacesAssignment_2 ) ) ( ( rule__Territoire__PlacesAssignment_2 )* )
            {
            // InternalGame.g:775:2: ( ( rule__Territoire__PlacesAssignment_2 ) )
            // InternalGame.g:776:3: ( rule__Territoire__PlacesAssignment_2 )
            {
             before(grammarAccess.getTerritoireAccess().getPlacesAssignment_2()); 
            // InternalGame.g:777:3: ( rule__Territoire__PlacesAssignment_2 )
            // InternalGame.g:777:4: rule__Territoire__PlacesAssignment_2
            {
            pushFollow(FOLLOW_8);
            rule__Territoire__PlacesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTerritoireAccess().getPlacesAssignment_2()); 

            }

            // InternalGame.g:780:2: ( ( rule__Territoire__PlacesAssignment_2 )* )
            // InternalGame.g:781:3: ( rule__Territoire__PlacesAssignment_2 )*
            {
             before(grammarAccess.getTerritoireAccess().getPlacesAssignment_2()); 
            // InternalGame.g:782:3: ( rule__Territoire__PlacesAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19||LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGame.g:782:4: rule__Territoire__PlacesAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Territoire__PlacesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalGame.g:791:1: rule__Territoire__Group__3 : rule__Territoire__Group__3__Impl ;
    public final void rule__Territoire__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:795:1: ( rule__Territoire__Group__3__Impl )
            // InternalGame.g:796:2: rule__Territoire__Group__3__Impl
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
    // InternalGame.g:802:1: rule__Territoire__Group__3__Impl : ( '}' ) ;
    public final void rule__Territoire__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:806:1: ( ( '}' ) )
            // InternalGame.g:807:1: ( '}' )
            {
            // InternalGame.g:807:1: ( '}' )
            // InternalGame.g:808:2: '}'
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
    // InternalGame.g:818:1: rule__Lieu__Group__0 : rule__Lieu__Group__0__Impl rule__Lieu__Group__1 ;
    public final void rule__Lieu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:822:1: ( rule__Lieu__Group__0__Impl rule__Lieu__Group__1 )
            // InternalGame.g:823:2: rule__Lieu__Group__0__Impl rule__Lieu__Group__1
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
    // InternalGame.g:830:1: rule__Lieu__Group__0__Impl : ( 'lieu' ) ;
    public final void rule__Lieu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:834:1: ( ( 'lieu' ) )
            // InternalGame.g:835:1: ( 'lieu' )
            {
            // InternalGame.g:835:1: ( 'lieu' )
            // InternalGame.g:836:2: 'lieu'
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
    // InternalGame.g:845:1: rule__Lieu__Group__1 : rule__Lieu__Group__1__Impl rule__Lieu__Group__2 ;
    public final void rule__Lieu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:849:1: ( rule__Lieu__Group__1__Impl rule__Lieu__Group__2 )
            // InternalGame.g:850:2: rule__Lieu__Group__1__Impl rule__Lieu__Group__2
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
    // InternalGame.g:857:1: rule__Lieu__Group__1__Impl : ( ( rule__Lieu__NomAssignment_1 ) ) ;
    public final void rule__Lieu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:861:1: ( ( ( rule__Lieu__NomAssignment_1 ) ) )
            // InternalGame.g:862:1: ( ( rule__Lieu__NomAssignment_1 ) )
            {
            // InternalGame.g:862:1: ( ( rule__Lieu__NomAssignment_1 ) )
            // InternalGame.g:863:2: ( rule__Lieu__NomAssignment_1 )
            {
             before(grammarAccess.getLieuAccess().getNomAssignment_1()); 
            // InternalGame.g:864:2: ( rule__Lieu__NomAssignment_1 )
            // InternalGame.g:864:3: rule__Lieu__NomAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__NomAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getNomAssignment_1()); 

            }


            }

        }
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
    // InternalGame.g:872:1: rule__Lieu__Group__2 : rule__Lieu__Group__2__Impl rule__Lieu__Group__3 ;
    public final void rule__Lieu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:876:1: ( rule__Lieu__Group__2__Impl rule__Lieu__Group__3 )
            // InternalGame.g:877:2: rule__Lieu__Group__2__Impl rule__Lieu__Group__3
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
    // InternalGame.g:884:1: rule__Lieu__Group__2__Impl : ( ':' ) ;
    public final void rule__Lieu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:888:1: ( ( ':' ) )
            // InternalGame.g:889:1: ( ':' )
            {
            // InternalGame.g:889:1: ( ':' )
            // InternalGame.g:890:2: ':'
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
    // InternalGame.g:899:1: rule__Lieu__Group__3 : rule__Lieu__Group__3__Impl ;
    public final void rule__Lieu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:903:1: ( rule__Lieu__Group__3__Impl )
            // InternalGame.g:904:2: rule__Lieu__Group__3__Impl
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
    // InternalGame.g:910:1: rule__Lieu__Group__3__Impl : ( ( rule__Lieu__NatureAssignment_3 ) ) ;
    public final void rule__Lieu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:914:1: ( ( ( rule__Lieu__NatureAssignment_3 ) ) )
            // InternalGame.g:915:1: ( ( rule__Lieu__NatureAssignment_3 ) )
            {
            // InternalGame.g:915:1: ( ( rule__Lieu__NatureAssignment_3 ) )
            // InternalGame.g:916:2: ( rule__Lieu__NatureAssignment_3 )
            {
             before(grammarAccess.getLieuAccess().getNatureAssignment_3()); 
            // InternalGame.g:917:2: ( rule__Lieu__NatureAssignment_3 )
            // InternalGame.g:917:3: rule__Lieu__NatureAssignment_3
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
    // InternalGame.g:926:1: rule__Chemin__Group__0 : rule__Chemin__Group__0__Impl rule__Chemin__Group__1 ;
    public final void rule__Chemin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:930:1: ( rule__Chemin__Group__0__Impl rule__Chemin__Group__1 )
            // InternalGame.g:931:2: rule__Chemin__Group__0__Impl rule__Chemin__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalGame.g:938:1: rule__Chemin__Group__0__Impl : ( 'chemin' ) ;
    public final void rule__Chemin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:942:1: ( ( 'chemin' ) )
            // InternalGame.g:943:1: ( 'chemin' )
            {
            // InternalGame.g:943:1: ( 'chemin' )
            // InternalGame.g:944:2: 'chemin'
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
    // InternalGame.g:953:1: rule__Chemin__Group__1 : rule__Chemin__Group__1__Impl rule__Chemin__Group__2 ;
    public final void rule__Chemin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:957:1: ( rule__Chemin__Group__1__Impl rule__Chemin__Group__2 )
            // InternalGame.g:958:2: rule__Chemin__Group__1__Impl rule__Chemin__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalGame.g:965:1: rule__Chemin__Group__1__Impl : ( '{' ) ;
    public final void rule__Chemin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:969:1: ( ( '{' ) )
            // InternalGame.g:970:1: ( '{' )
            {
            // InternalGame.g:970:1: ( '{' )
            // InternalGame.g:971:2: '{'
            {
             before(grammarAccess.getCheminAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalGame.g:980:1: rule__Chemin__Group__2 : rule__Chemin__Group__2__Impl rule__Chemin__Group__3 ;
    public final void rule__Chemin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:984:1: ( rule__Chemin__Group__2__Impl rule__Chemin__Group__3 )
            // InternalGame.g:985:2: rule__Chemin__Group__2__Impl rule__Chemin__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:992:1: rule__Chemin__Group__2__Impl : ( 'de' ) ;
    public final void rule__Chemin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:996:1: ( ( 'de' ) )
            // InternalGame.g:997:1: ( 'de' )
            {
            // InternalGame.g:997:1: ( 'de' )
            // InternalGame.g:998:2: 'de'
            {
             before(grammarAccess.getCheminAccess().getDeKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getDeKeyword_2()); 

            }


            }

        }
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
    // InternalGame.g:1007:1: rule__Chemin__Group__3 : rule__Chemin__Group__3__Impl rule__Chemin__Group__4 ;
    public final void rule__Chemin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1011:1: ( rule__Chemin__Group__3__Impl rule__Chemin__Group__4 )
            // InternalGame.g:1012:2: rule__Chemin__Group__3__Impl rule__Chemin__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalGame.g:1019:1: rule__Chemin__Group__3__Impl : ( ( rule__Chemin__PredAssignment_3 ) ) ;
    public final void rule__Chemin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1023:1: ( ( ( rule__Chemin__PredAssignment_3 ) ) )
            // InternalGame.g:1024:1: ( ( rule__Chemin__PredAssignment_3 ) )
            {
            // InternalGame.g:1024:1: ( ( rule__Chemin__PredAssignment_3 ) )
            // InternalGame.g:1025:2: ( rule__Chemin__PredAssignment_3 )
            {
             before(grammarAccess.getCheminAccess().getPredAssignment_3()); 
            // InternalGame.g:1026:2: ( rule__Chemin__PredAssignment_3 )
            // InternalGame.g:1026:3: rule__Chemin__PredAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__PredAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getPredAssignment_3()); 

            }


            }

        }
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
    // InternalGame.g:1034:1: rule__Chemin__Group__4 : rule__Chemin__Group__4__Impl rule__Chemin__Group__5 ;
    public final void rule__Chemin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1038:1: ( rule__Chemin__Group__4__Impl rule__Chemin__Group__5 )
            // InternalGame.g:1039:2: rule__Chemin__Group__4__Impl rule__Chemin__Group__5
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:1046:1: rule__Chemin__Group__4__Impl : ( 'vers' ) ;
    public final void rule__Chemin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1050:1: ( ( 'vers' ) )
            // InternalGame.g:1051:1: ( 'vers' )
            {
            // InternalGame.g:1051:1: ( 'vers' )
            // InternalGame.g:1052:2: 'vers'
            {
             before(grammarAccess.getCheminAccess().getVersKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getVersKeyword_4()); 

            }


            }

        }
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
    // InternalGame.g:1061:1: rule__Chemin__Group__5 : rule__Chemin__Group__5__Impl rule__Chemin__Group__6 ;
    public final void rule__Chemin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1065:1: ( rule__Chemin__Group__5__Impl rule__Chemin__Group__6 )
            // InternalGame.g:1066:2: rule__Chemin__Group__5__Impl rule__Chemin__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalGame.g:1073:1: rule__Chemin__Group__5__Impl : ( ( rule__Chemin__SuccAssignment_5 ) ) ;
    public final void rule__Chemin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1077:1: ( ( ( rule__Chemin__SuccAssignment_5 ) ) )
            // InternalGame.g:1078:1: ( ( rule__Chemin__SuccAssignment_5 ) )
            {
            // InternalGame.g:1078:1: ( ( rule__Chemin__SuccAssignment_5 ) )
            // InternalGame.g:1079:2: ( rule__Chemin__SuccAssignment_5 )
            {
             before(grammarAccess.getCheminAccess().getSuccAssignment_5()); 
            // InternalGame.g:1080:2: ( rule__Chemin__SuccAssignment_5 )
            // InternalGame.g:1080:3: rule__Chemin__SuccAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__SuccAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getSuccAssignment_5()); 

            }


            }

        }
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
    // InternalGame.g:1088:1: rule__Chemin__Group__6 : rule__Chemin__Group__6__Impl rule__Chemin__Group__7 ;
    public final void rule__Chemin__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1092:1: ( rule__Chemin__Group__6__Impl rule__Chemin__Group__7 )
            // InternalGame.g:1093:2: rule__Chemin__Group__6__Impl rule__Chemin__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:1100:1: rule__Chemin__Group__6__Impl : ( 'visible' ) ;
    public final void rule__Chemin__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1104:1: ( ( 'visible' ) )
            // InternalGame.g:1105:1: ( 'visible' )
            {
            // InternalGame.g:1105:1: ( 'visible' )
            // InternalGame.g:1106:2: 'visible'
            {
             before(grammarAccess.getCheminAccess().getVisibleKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getVisibleKeyword_6()); 

            }


            }

        }
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
    // InternalGame.g:1115:1: rule__Chemin__Group__7 : rule__Chemin__Group__7__Impl rule__Chemin__Group__8 ;
    public final void rule__Chemin__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1119:1: ( rule__Chemin__Group__7__Impl rule__Chemin__Group__8 )
            // InternalGame.g:1120:2: rule__Chemin__Group__7__Impl rule__Chemin__Group__8
            {
            pushFollow(FOLLOW_17);
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
    // InternalGame.g:1127:1: rule__Chemin__Group__7__Impl : ( ( rule__Chemin__VisibleAssignment_7 ) ) ;
    public final void rule__Chemin__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1131:1: ( ( ( rule__Chemin__VisibleAssignment_7 ) ) )
            // InternalGame.g:1132:1: ( ( rule__Chemin__VisibleAssignment_7 ) )
            {
            // InternalGame.g:1132:1: ( ( rule__Chemin__VisibleAssignment_7 ) )
            // InternalGame.g:1133:2: ( rule__Chemin__VisibleAssignment_7 )
            {
             before(grammarAccess.getCheminAccess().getVisibleAssignment_7()); 
            // InternalGame.g:1134:2: ( rule__Chemin__VisibleAssignment_7 )
            // InternalGame.g:1134:3: rule__Chemin__VisibleAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__VisibleAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getVisibleAssignment_7()); 

            }


            }

        }
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
    // InternalGame.g:1142:1: rule__Chemin__Group__8 : rule__Chemin__Group__8__Impl rule__Chemin__Group__9 ;
    public final void rule__Chemin__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1146:1: ( rule__Chemin__Group__8__Impl rule__Chemin__Group__9 )
            // InternalGame.g:1147:2: rule__Chemin__Group__8__Impl rule__Chemin__Group__9
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:1154:1: rule__Chemin__Group__8__Impl : ( 'obligatoire' ) ;
    public final void rule__Chemin__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1158:1: ( ( 'obligatoire' ) )
            // InternalGame.g:1159:1: ( 'obligatoire' )
            {
            // InternalGame.g:1159:1: ( 'obligatoire' )
            // InternalGame.g:1160:2: 'obligatoire'
            {
             before(grammarAccess.getCheminAccess().getObligatoireKeyword_8()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getObligatoireKeyword_8()); 

            }


            }

        }
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
    // InternalGame.g:1169:1: rule__Chemin__Group__9 : rule__Chemin__Group__9__Impl rule__Chemin__Group__10 ;
    public final void rule__Chemin__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1173:1: ( rule__Chemin__Group__9__Impl rule__Chemin__Group__10 )
            // InternalGame.g:1174:2: rule__Chemin__Group__9__Impl rule__Chemin__Group__10
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
    // InternalGame.g:1181:1: rule__Chemin__Group__9__Impl : ( ( rule__Chemin__ObligatoireAssignment_9 ) ) ;
    public final void rule__Chemin__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1185:1: ( ( ( rule__Chemin__ObligatoireAssignment_9 ) ) )
            // InternalGame.g:1186:1: ( ( rule__Chemin__ObligatoireAssignment_9 ) )
            {
            // InternalGame.g:1186:1: ( ( rule__Chemin__ObligatoireAssignment_9 ) )
            // InternalGame.g:1187:2: ( rule__Chemin__ObligatoireAssignment_9 )
            {
             before(grammarAccess.getCheminAccess().getObligatoireAssignment_9()); 
            // InternalGame.g:1188:2: ( rule__Chemin__ObligatoireAssignment_9 )
            // InternalGame.g:1188:3: rule__Chemin__ObligatoireAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__ObligatoireAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getObligatoireAssignment_9()); 

            }


            }

        }
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
    // InternalGame.g:1196:1: rule__Chemin__Group__10 : rule__Chemin__Group__10__Impl rule__Chemin__Group__11 ;
    public final void rule__Chemin__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1200:1: ( rule__Chemin__Group__10__Impl rule__Chemin__Group__11 )
            // InternalGame.g:1201:2: rule__Chemin__Group__10__Impl rule__Chemin__Group__11
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:1208:1: rule__Chemin__Group__10__Impl : ( 'ouvert' ) ;
    public final void rule__Chemin__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1212:1: ( ( 'ouvert' ) )
            // InternalGame.g:1213:1: ( 'ouvert' )
            {
            // InternalGame.g:1213:1: ( 'ouvert' )
            // InternalGame.g:1214:2: 'ouvert'
            {
             before(grammarAccess.getCheminAccess().getOuvertKeyword_10()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getOuvertKeyword_10()); 

            }


            }

        }
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
    // InternalGame.g:1223:1: rule__Chemin__Group__11 : rule__Chemin__Group__11__Impl rule__Chemin__Group__12 ;
    public final void rule__Chemin__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1227:1: ( rule__Chemin__Group__11__Impl rule__Chemin__Group__12 )
            // InternalGame.g:1228:2: rule__Chemin__Group__11__Impl rule__Chemin__Group__12
            {
            pushFollow(FOLLOW_10);
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
    // InternalGame.g:1235:1: rule__Chemin__Group__11__Impl : ( ( rule__Chemin__OuvertAssignment_11 ) ) ;
    public final void rule__Chemin__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1239:1: ( ( ( rule__Chemin__OuvertAssignment_11 ) ) )
            // InternalGame.g:1240:1: ( ( rule__Chemin__OuvertAssignment_11 ) )
            {
            // InternalGame.g:1240:1: ( ( rule__Chemin__OuvertAssignment_11 ) )
            // InternalGame.g:1241:2: ( rule__Chemin__OuvertAssignment_11 )
            {
             before(grammarAccess.getCheminAccess().getOuvertAssignment_11()); 
            // InternalGame.g:1242:2: ( rule__Chemin__OuvertAssignment_11 )
            // InternalGame.g:1242:3: rule__Chemin__OuvertAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__OuvertAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getOuvertAssignment_11()); 

            }


            }

        }
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
    // InternalGame.g:1250:1: rule__Chemin__Group__12 : rule__Chemin__Group__12__Impl ;
    public final void rule__Chemin__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1254:1: ( rule__Chemin__Group__12__Impl )
            // InternalGame.g:1255:2: rule__Chemin__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group__12__Impl();

            state._fsp--;


            }

        }
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
    // InternalGame.g:1261:1: rule__Chemin__Group__12__Impl : ( '}' ) ;
    public final void rule__Chemin__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1265:1: ( ( '}' ) )
            // InternalGame.g:1266:1: ( '}' )
            {
            // InternalGame.g:1266:1: ( '}' )
            // InternalGame.g:1267:2: '}'
            {
             before(grammarAccess.getCheminAccess().getRightCurlyBracketKeyword_12()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
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


    // $ANTLR start "rule__Personne__Group__0"
    // InternalGame.g:1277:1: rule__Personne__Group__0 : rule__Personne__Group__0__Impl rule__Personne__Group__1 ;
    public final void rule__Personne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1281:1: ( rule__Personne__Group__0__Impl rule__Personne__Group__1 )
            // InternalGame.g:1282:2: rule__Personne__Group__0__Impl rule__Personne__Group__1
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
    // InternalGame.g:1289:1: rule__Personne__Group__0__Impl : ( 'personne' ) ;
    public final void rule__Personne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1293:1: ( ( 'personne' ) )
            // InternalGame.g:1294:1: ( 'personne' )
            {
            // InternalGame.g:1294:1: ( 'personne' )
            // InternalGame.g:1295:2: 'personne'
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
    // InternalGame.g:1304:1: rule__Personne__Group__1 : rule__Personne__Group__1__Impl rule__Personne__Group__2 ;
    public final void rule__Personne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1308:1: ( rule__Personne__Group__1__Impl rule__Personne__Group__2 )
            // InternalGame.g:1309:2: rule__Personne__Group__1__Impl rule__Personne__Group__2
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
    // InternalGame.g:1316:1: rule__Personne__Group__1__Impl : ( ( rule__Personne__NomAssignment_1 ) ) ;
    public final void rule__Personne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1320:1: ( ( ( rule__Personne__NomAssignment_1 ) ) )
            // InternalGame.g:1321:1: ( ( rule__Personne__NomAssignment_1 ) )
            {
            // InternalGame.g:1321:1: ( ( rule__Personne__NomAssignment_1 ) )
            // InternalGame.g:1322:2: ( rule__Personne__NomAssignment_1 )
            {
             before(grammarAccess.getPersonneAccess().getNomAssignment_1()); 
            // InternalGame.g:1323:2: ( rule__Personne__NomAssignment_1 )
            // InternalGame.g:1323:3: rule__Personne__NomAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Personne__NomAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getNomAssignment_1()); 

            }


            }

        }
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
    // InternalGame.g:1331:1: rule__Personne__Group__2 : rule__Personne__Group__2__Impl rule__Personne__Group__3 ;
    public final void rule__Personne__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1335:1: ( rule__Personne__Group__2__Impl rule__Personne__Group__3 )
            // InternalGame.g:1336:2: rule__Personne__Group__2__Impl rule__Personne__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalGame.g:1343:1: rule__Personne__Group__2__Impl : ( '{' ) ;
    public final void rule__Personne__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1347:1: ( ( '{' ) )
            // InternalGame.g:1348:1: ( '{' )
            {
            // InternalGame.g:1348:1: ( '{' )
            // InternalGame.g:1349:2: '{'
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
    // InternalGame.g:1358:1: rule__Personne__Group__3 : rule__Personne__Group__3__Impl rule__Personne__Group__4 ;
    public final void rule__Personne__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1362:1: ( rule__Personne__Group__3__Impl rule__Personne__Group__4 )
            // InternalGame.g:1363:2: rule__Personne__Group__3__Impl rule__Personne__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:1370:1: rule__Personne__Group__3__Impl : ( 'visible' ) ;
    public final void rule__Personne__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1374:1: ( ( 'visible' ) )
            // InternalGame.g:1375:1: ( 'visible' )
            {
            // InternalGame.g:1375:1: ( 'visible' )
            // InternalGame.g:1376:2: 'visible'
            {
             before(grammarAccess.getPersonneAccess().getVisibleKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getVisibleKeyword_3()); 

            }


            }

        }
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
    // InternalGame.g:1385:1: rule__Personne__Group__4 : rule__Personne__Group__4__Impl rule__Personne__Group__5 ;
    public final void rule__Personne__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1389:1: ( rule__Personne__Group__4__Impl rule__Personne__Group__5 )
            // InternalGame.g:1390:2: rule__Personne__Group__4__Impl rule__Personne__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalGame.g:1397:1: rule__Personne__Group__4__Impl : ( ( rule__Personne__VisibleAssignment_4 ) ) ;
    public final void rule__Personne__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1401:1: ( ( ( rule__Personne__VisibleAssignment_4 ) ) )
            // InternalGame.g:1402:1: ( ( rule__Personne__VisibleAssignment_4 ) )
            {
            // InternalGame.g:1402:1: ( ( rule__Personne__VisibleAssignment_4 ) )
            // InternalGame.g:1403:2: ( rule__Personne__VisibleAssignment_4 )
            {
             before(grammarAccess.getPersonneAccess().getVisibleAssignment_4()); 
            // InternalGame.g:1404:2: ( rule__Personne__VisibleAssignment_4 )
            // InternalGame.g:1404:3: rule__Personne__VisibleAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Personne__VisibleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getVisibleAssignment_4()); 

            }


            }

        }
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
    // InternalGame.g:1412:1: rule__Personne__Group__5 : rule__Personne__Group__5__Impl rule__Personne__Group__6 ;
    public final void rule__Personne__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1416:1: ( rule__Personne__Group__5__Impl rule__Personne__Group__6 )
            // InternalGame.g:1417:2: rule__Personne__Group__5__Impl rule__Personne__Group__6
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
    // InternalGame.g:1424:1: rule__Personne__Group__5__Impl : ( 'actif' ) ;
    public final void rule__Personne__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1428:1: ( ( 'actif' ) )
            // InternalGame.g:1429:1: ( 'actif' )
            {
            // InternalGame.g:1429:1: ( 'actif' )
            // InternalGame.g:1430:2: 'actif'
            {
             before(grammarAccess.getPersonneAccess().getActifKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getActifKeyword_5()); 

            }


            }

        }
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
    // InternalGame.g:1439:1: rule__Personne__Group__6 : rule__Personne__Group__6__Impl rule__Personne__Group__7 ;
    public final void rule__Personne__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1443:1: ( rule__Personne__Group__6__Impl rule__Personne__Group__7 )
            // InternalGame.g:1444:2: rule__Personne__Group__6__Impl rule__Personne__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalGame.g:1451:1: rule__Personne__Group__6__Impl : ( ( rule__Personne__ActifAssignment_6 ) ) ;
    public final void rule__Personne__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1455:1: ( ( ( rule__Personne__ActifAssignment_6 ) ) )
            // InternalGame.g:1456:1: ( ( rule__Personne__ActifAssignment_6 ) )
            {
            // InternalGame.g:1456:1: ( ( rule__Personne__ActifAssignment_6 ) )
            // InternalGame.g:1457:2: ( rule__Personne__ActifAssignment_6 )
            {
             before(grammarAccess.getPersonneAccess().getActifAssignment_6()); 
            // InternalGame.g:1458:2: ( rule__Personne__ActifAssignment_6 )
            // InternalGame.g:1458:3: rule__Personne__ActifAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Personne__ActifAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getActifAssignment_6()); 

            }


            }

        }
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
    // InternalGame.g:1466:1: rule__Personne__Group__7 : rule__Personne__Group__7__Impl rule__Personne__Group__8 ;
    public final void rule__Personne__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1470:1: ( rule__Personne__Group__7__Impl rule__Personne__Group__8 )
            // InternalGame.g:1471:2: rule__Personne__Group__7__Impl rule__Personne__Group__8
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
    // InternalGame.g:1478:1: rule__Personne__Group__7__Impl : ( 'obligatoire' ) ;
    public final void rule__Personne__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1482:1: ( ( 'obligatoire' ) )
            // InternalGame.g:1483:1: ( 'obligatoire' )
            {
            // InternalGame.g:1483:1: ( 'obligatoire' )
            // InternalGame.g:1484:2: 'obligatoire'
            {
             before(grammarAccess.getPersonneAccess().getObligatoireKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getObligatoireKeyword_7()); 

            }


            }

        }
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
    // InternalGame.g:1493:1: rule__Personne__Group__8 : rule__Personne__Group__8__Impl rule__Personne__Group__9 ;
    public final void rule__Personne__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1497:1: ( rule__Personne__Group__8__Impl rule__Personne__Group__9 )
            // InternalGame.g:1498:2: rule__Personne__Group__8__Impl rule__Personne__Group__9
            {
            pushFollow(FOLLOW_20);
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
    // InternalGame.g:1505:1: rule__Personne__Group__8__Impl : ( ( rule__Personne__ObligatoireAssignment_8 ) ) ;
    public final void rule__Personne__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1509:1: ( ( ( rule__Personne__ObligatoireAssignment_8 ) ) )
            // InternalGame.g:1510:1: ( ( rule__Personne__ObligatoireAssignment_8 ) )
            {
            // InternalGame.g:1510:1: ( ( rule__Personne__ObligatoireAssignment_8 ) )
            // InternalGame.g:1511:2: ( rule__Personne__ObligatoireAssignment_8 )
            {
             before(grammarAccess.getPersonneAccess().getObligatoireAssignment_8()); 
            // InternalGame.g:1512:2: ( rule__Personne__ObligatoireAssignment_8 )
            // InternalGame.g:1512:3: rule__Personne__ObligatoireAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Personne__ObligatoireAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getObligatoireAssignment_8()); 

            }


            }

        }
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
    // InternalGame.g:1520:1: rule__Personne__Group__9 : rule__Personne__Group__9__Impl rule__Personne__Group__10 ;
    public final void rule__Personne__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1524:1: ( rule__Personne__Group__9__Impl rule__Personne__Group__10 )
            // InternalGame.g:1525:2: rule__Personne__Group__9__Impl rule__Personne__Group__10
            {
            pushFollow(FOLLOW_21);
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
    // InternalGame.g:1532:1: rule__Personne__Group__9__Impl : ( 'interactions' ) ;
    public final void rule__Personne__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1536:1: ( ( 'interactions' ) )
            // InternalGame.g:1537:1: ( 'interactions' )
            {
            // InternalGame.g:1537:1: ( 'interactions' )
            // InternalGame.g:1538:2: 'interactions'
            {
             before(grammarAccess.getPersonneAccess().getInteractionsKeyword_9()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getInteractionsKeyword_9()); 

            }


            }

        }
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
    // InternalGame.g:1547:1: rule__Personne__Group__10 : rule__Personne__Group__10__Impl rule__Personne__Group__11 ;
    public final void rule__Personne__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1551:1: ( rule__Personne__Group__10__Impl rule__Personne__Group__11 )
            // InternalGame.g:1552:2: rule__Personne__Group__10__Impl rule__Personne__Group__11
            {
            pushFollow(FOLLOW_21);
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
    // InternalGame.g:1559:1: rule__Personne__Group__10__Impl : ( ( rule__Personne__InteractionsAssignment_10 )* ) ;
    public final void rule__Personne__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1563:1: ( ( ( rule__Personne__InteractionsAssignment_10 )* ) )
            // InternalGame.g:1564:1: ( ( rule__Personne__InteractionsAssignment_10 )* )
            {
            // InternalGame.g:1564:1: ( ( rule__Personne__InteractionsAssignment_10 )* )
            // InternalGame.g:1565:2: ( rule__Personne__InteractionsAssignment_10 )*
            {
             before(grammarAccess.getPersonneAccess().getInteractionsAssignment_10()); 
            // InternalGame.g:1566:2: ( rule__Personne__InteractionsAssignment_10 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==41) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGame.g:1566:3: rule__Personne__InteractionsAssignment_10
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Personne__InteractionsAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPersonneAccess().getInteractionsAssignment_10()); 

            }


            }

        }
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
    // InternalGame.g:1574:1: rule__Personne__Group__11 : rule__Personne__Group__11__Impl ;
    public final void rule__Personne__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1578:1: ( rule__Personne__Group__11__Impl )
            // InternalGame.g:1579:2: rule__Personne__Group__11__Impl
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
    // InternalGame.g:1585:1: rule__Personne__Group__11__Impl : ( '}' ) ;
    public final void rule__Personne__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1589:1: ( ( '}' ) )
            // InternalGame.g:1590:1: ( '}' )
            {
            // InternalGame.g:1590:1: ( '}' )
            // InternalGame.g:1591:2: '}'
            {
             before(grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_11()); 
            match(input,17,FOLLOW_2); 
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


    // $ANTLR start "rule__Explorateur__Group__0"
    // InternalGame.g:1601:1: rule__Explorateur__Group__0 : rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1 ;
    public final void rule__Explorateur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1605:1: ( rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1 )
            // InternalGame.g:1606:2: rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1
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
    // InternalGame.g:1613:1: rule__Explorateur__Group__0__Impl : ( 'explorateur' ) ;
    public final void rule__Explorateur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1617:1: ( ( 'explorateur' ) )
            // InternalGame.g:1618:1: ( 'explorateur' )
            {
            // InternalGame.g:1618:1: ( 'explorateur' )
            // InternalGame.g:1619:2: 'explorateur'
            {
             before(grammarAccess.getExplorateurAccess().getExplorateurKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalGame.g:1628:1: rule__Explorateur__Group__1 : rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2 ;
    public final void rule__Explorateur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1632:1: ( rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2 )
            // InternalGame.g:1633:2: rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalGame.g:1640:1: rule__Explorateur__Group__1__Impl : ( '{' ) ;
    public final void rule__Explorateur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1644:1: ( ( '{' ) )
            // InternalGame.g:1645:1: ( '{' )
            {
            // InternalGame.g:1645:1: ( '{' )
            // InternalGame.g:1646:2: '{'
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
    // InternalGame.g:1655:1: rule__Explorateur__Group__2 : rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3 ;
    public final void rule__Explorateur__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1659:1: ( rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3 )
            // InternalGame.g:1660:2: rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalGame.g:1667:1: rule__Explorateur__Group__2__Impl : ( 'localisation' ) ;
    public final void rule__Explorateur__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1671:1: ( ( 'localisation' ) )
            // InternalGame.g:1672:1: ( 'localisation' )
            {
            // InternalGame.g:1672:1: ( 'localisation' )
            // InternalGame.g:1673:2: 'localisation'
            {
             before(grammarAccess.getExplorateurAccess().getLocalisationKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalGame.g:1682:1: rule__Explorateur__Group__3 : rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4 ;
    public final void rule__Explorateur__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1686:1: ( rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4 )
            // InternalGame.g:1687:2: rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalGame.g:1694:1: rule__Explorateur__Group__3__Impl : ( ( rule__Explorateur__PlaceAssignment_3 ) ) ;
    public final void rule__Explorateur__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1698:1: ( ( ( rule__Explorateur__PlaceAssignment_3 ) ) )
            // InternalGame.g:1699:1: ( ( rule__Explorateur__PlaceAssignment_3 ) )
            {
            // InternalGame.g:1699:1: ( ( rule__Explorateur__PlaceAssignment_3 ) )
            // InternalGame.g:1700:2: ( rule__Explorateur__PlaceAssignment_3 )
            {
             before(grammarAccess.getExplorateurAccess().getPlaceAssignment_3()); 
            // InternalGame.g:1701:2: ( rule__Explorateur__PlaceAssignment_3 )
            // InternalGame.g:1701:3: rule__Explorateur__PlaceAssignment_3
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
    // InternalGame.g:1709:1: rule__Explorateur__Group__4 : rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5 ;
    public final void rule__Explorateur__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1713:1: ( rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5 )
            // InternalGame.g:1714:2: rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalGame.g:1721:1: rule__Explorateur__Group__4__Impl : ( 'taille' ) ;
    public final void rule__Explorateur__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1725:1: ( ( 'taille' ) )
            // InternalGame.g:1726:1: ( 'taille' )
            {
            // InternalGame.g:1726:1: ( 'taille' )
            // InternalGame.g:1727:2: 'taille'
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
    // InternalGame.g:1736:1: rule__Explorateur__Group__5 : rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6 ;
    public final void rule__Explorateur__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1740:1: ( rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6 )
            // InternalGame.g:1741:2: rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6
            {
            pushFollow(FOLLOW_26);
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
    // InternalGame.g:1748:1: rule__Explorateur__Group__5__Impl : ( 'disponible' ) ;
    public final void rule__Explorateur__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1752:1: ( ( 'disponible' ) )
            // InternalGame.g:1753:1: ( 'disponible' )
            {
            // InternalGame.g:1753:1: ( 'disponible' )
            // InternalGame.g:1754:2: 'disponible'
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
    // InternalGame.g:1763:1: rule__Explorateur__Group__6 : rule__Explorateur__Group__6__Impl rule__Explorateur__Group__7 ;
    public final void rule__Explorateur__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1767:1: ( rule__Explorateur__Group__6__Impl rule__Explorateur__Group__7 )
            // InternalGame.g:1768:2: rule__Explorateur__Group__6__Impl rule__Explorateur__Group__7
            {
            pushFollow(FOLLOW_27);
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
    // InternalGame.g:1775:1: rule__Explorateur__Group__6__Impl : ( ( rule__Explorateur__TailleDispoAssignment_6 ) ) ;
    public final void rule__Explorateur__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1779:1: ( ( ( rule__Explorateur__TailleDispoAssignment_6 ) ) )
            // InternalGame.g:1780:1: ( ( rule__Explorateur__TailleDispoAssignment_6 ) )
            {
            // InternalGame.g:1780:1: ( ( rule__Explorateur__TailleDispoAssignment_6 ) )
            // InternalGame.g:1781:2: ( rule__Explorateur__TailleDispoAssignment_6 )
            {
             before(grammarAccess.getExplorateurAccess().getTailleDispoAssignment_6()); 
            // InternalGame.g:1782:2: ( rule__Explorateur__TailleDispoAssignment_6 )
            // InternalGame.g:1782:3: rule__Explorateur__TailleDispoAssignment_6
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
    // InternalGame.g:1790:1: rule__Explorateur__Group__7 : rule__Explorateur__Group__7__Impl rule__Explorateur__Group__8 ;
    public final void rule__Explorateur__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1794:1: ( rule__Explorateur__Group__7__Impl rule__Explorateur__Group__8 )
            // InternalGame.g:1795:2: rule__Explorateur__Group__7__Impl rule__Explorateur__Group__8
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
    // InternalGame.g:1802:1: rule__Explorateur__Group__7__Impl : ( 'objets' ) ;
    public final void rule__Explorateur__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1806:1: ( ( 'objets' ) )
            // InternalGame.g:1807:1: ( 'objets' )
            {
            // InternalGame.g:1807:1: ( 'objets' )
            // InternalGame.g:1808:2: 'objets'
            {
             before(grammarAccess.getExplorateurAccess().getObjetsKeyword_7()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getObjetsKeyword_7()); 

            }


            }

        }
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
    // InternalGame.g:1817:1: rule__Explorateur__Group__8 : rule__Explorateur__Group__8__Impl rule__Explorateur__Group__9 ;
    public final void rule__Explorateur__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1821:1: ( rule__Explorateur__Group__8__Impl rule__Explorateur__Group__9 )
            // InternalGame.g:1822:2: rule__Explorateur__Group__8__Impl rule__Explorateur__Group__9
            {
            pushFollow(FOLLOW_29);
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
    // InternalGame.g:1829:1: rule__Explorateur__Group__8__Impl : ( 'possedes' ) ;
    public final void rule__Explorateur__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1833:1: ( ( 'possedes' ) )
            // InternalGame.g:1834:1: ( 'possedes' )
            {
            // InternalGame.g:1834:1: ( 'possedes' )
            // InternalGame.g:1835:2: 'possedes'
            {
             before(grammarAccess.getExplorateurAccess().getPossedesKeyword_8()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getPossedesKeyword_8()); 

            }


            }

        }
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
    // InternalGame.g:1844:1: rule__Explorateur__Group__9 : rule__Explorateur__Group__9__Impl rule__Explorateur__Group__10 ;
    public final void rule__Explorateur__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1848:1: ( rule__Explorateur__Group__9__Impl rule__Explorateur__Group__10 )
            // InternalGame.g:1849:2: rule__Explorateur__Group__9__Impl rule__Explorateur__Group__10
            {
            pushFollow(FOLLOW_29);
            rule__Explorateur__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__10();

            state._fsp--;


            }

        }
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
    // InternalGame.g:1856:1: rule__Explorateur__Group__9__Impl : ( ( rule__Explorateur__ObjetsAssignment_9 )* ) ;
    public final void rule__Explorateur__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1860:1: ( ( ( rule__Explorateur__ObjetsAssignment_9 )* ) )
            // InternalGame.g:1861:1: ( ( rule__Explorateur__ObjetsAssignment_9 )* )
            {
            // InternalGame.g:1861:1: ( ( rule__Explorateur__ObjetsAssignment_9 )* )
            // InternalGame.g:1862:2: ( rule__Explorateur__ObjetsAssignment_9 )*
            {
             before(grammarAccess.getExplorateurAccess().getObjetsAssignment_9()); 
            // InternalGame.g:1863:2: ( rule__Explorateur__ObjetsAssignment_9 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==38) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGame.g:1863:3: rule__Explorateur__ObjetsAssignment_9
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Explorateur__ObjetsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getExplorateurAccess().getObjetsAssignment_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__Explorateur__Group__10"
    // InternalGame.g:1871:1: rule__Explorateur__Group__10 : rule__Explorateur__Group__10__Impl rule__Explorateur__Group__11 ;
    public final void rule__Explorateur__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1875:1: ( rule__Explorateur__Group__10__Impl rule__Explorateur__Group__11 )
            // InternalGame.g:1876:2: rule__Explorateur__Group__10__Impl rule__Explorateur__Group__11
            {
            pushFollow(FOLLOW_28);
            rule__Explorateur__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__10"


    // $ANTLR start "rule__Explorateur__Group__10__Impl"
    // InternalGame.g:1883:1: rule__Explorateur__Group__10__Impl : ( 'connaissances' ) ;
    public final void rule__Explorateur__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1887:1: ( ( 'connaissances' ) )
            // InternalGame.g:1888:1: ( 'connaissances' )
            {
            // InternalGame.g:1888:1: ( 'connaissances' )
            // InternalGame.g:1889:2: 'connaissances'
            {
             before(grammarAccess.getExplorateurAccess().getConnaissancesKeyword_10()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getConnaissancesKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__10__Impl"


    // $ANTLR start "rule__Explorateur__Group__11"
    // InternalGame.g:1898:1: rule__Explorateur__Group__11 : rule__Explorateur__Group__11__Impl rule__Explorateur__Group__12 ;
    public final void rule__Explorateur__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1902:1: ( rule__Explorateur__Group__11__Impl rule__Explorateur__Group__12 )
            // InternalGame.g:1903:2: rule__Explorateur__Group__11__Impl rule__Explorateur__Group__12
            {
            pushFollow(FOLLOW_31);
            rule__Explorateur__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__11"


    // $ANTLR start "rule__Explorateur__Group__11__Impl"
    // InternalGame.g:1910:1: rule__Explorateur__Group__11__Impl : ( 'possedes' ) ;
    public final void rule__Explorateur__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1914:1: ( ( 'possedes' ) )
            // InternalGame.g:1915:1: ( 'possedes' )
            {
            // InternalGame.g:1915:1: ( 'possedes' )
            // InternalGame.g:1916:2: 'possedes'
            {
             before(grammarAccess.getExplorateurAccess().getPossedesKeyword_11()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getPossedesKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__11__Impl"


    // $ANTLR start "rule__Explorateur__Group__12"
    // InternalGame.g:1925:1: rule__Explorateur__Group__12 : rule__Explorateur__Group__12__Impl rule__Explorateur__Group__13 ;
    public final void rule__Explorateur__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1929:1: ( rule__Explorateur__Group__12__Impl rule__Explorateur__Group__13 )
            // InternalGame.g:1930:2: rule__Explorateur__Group__12__Impl rule__Explorateur__Group__13
            {
            pushFollow(FOLLOW_31);
            rule__Explorateur__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__12"


    // $ANTLR start "rule__Explorateur__Group__12__Impl"
    // InternalGame.g:1937:1: rule__Explorateur__Group__12__Impl : ( ( rule__Explorateur__ConnaissancesAssignment_12 )* ) ;
    public final void rule__Explorateur__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1941:1: ( ( ( rule__Explorateur__ConnaissancesAssignment_12 )* ) )
            // InternalGame.g:1942:1: ( ( rule__Explorateur__ConnaissancesAssignment_12 )* )
            {
            // InternalGame.g:1942:1: ( ( rule__Explorateur__ConnaissancesAssignment_12 )* )
            // InternalGame.g:1943:2: ( rule__Explorateur__ConnaissancesAssignment_12 )*
            {
             before(grammarAccess.getExplorateurAccess().getConnaissancesAssignment_12()); 
            // InternalGame.g:1944:2: ( rule__Explorateur__ConnaissancesAssignment_12 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==37) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGame.g:1944:3: rule__Explorateur__ConnaissancesAssignment_12
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Explorateur__ConnaissancesAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getExplorateurAccess().getConnaissancesAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__12__Impl"


    // $ANTLR start "rule__Explorateur__Group__13"
    // InternalGame.g:1952:1: rule__Explorateur__Group__13 : rule__Explorateur__Group__13__Impl ;
    public final void rule__Explorateur__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1956:1: ( rule__Explorateur__Group__13__Impl )
            // InternalGame.g:1957:2: rule__Explorateur__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__13"


    // $ANTLR start "rule__Explorateur__Group__13__Impl"
    // InternalGame.g:1963:1: rule__Explorateur__Group__13__Impl : ( '}' ) ;
    public final void rule__Explorateur__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1967:1: ( ( '}' ) )
            // InternalGame.g:1968:1: ( '}' )
            {
            // InternalGame.g:1968:1: ( '}' )
            // InternalGame.g:1969:2: '}'
            {
             before(grammarAccess.getExplorateurAccess().getRightCurlyBracketKeyword_13()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__13__Impl"


    // $ANTLR start "rule__Connaissance__Group__0"
    // InternalGame.g:1979:1: rule__Connaissance__Group__0 : rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1 ;
    public final void rule__Connaissance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1983:1: ( rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1 )
            // InternalGame.g:1984:2: rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalGame.g:1991:1: rule__Connaissance__Group__0__Impl : ( 'connaissance' ) ;
    public final void rule__Connaissance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1995:1: ( ( 'connaissance' ) )
            // InternalGame.g:1996:1: ( 'connaissance' )
            {
            // InternalGame.g:1996:1: ( 'connaissance' )
            // InternalGame.g:1997:2: 'connaissance'
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
    // InternalGame.g:2006:1: rule__Connaissance__Group__1 : rule__Connaissance__Group__1__Impl rule__Connaissance__Group__2 ;
    public final void rule__Connaissance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2010:1: ( rule__Connaissance__Group__1__Impl rule__Connaissance__Group__2 )
            // InternalGame.g:2011:2: rule__Connaissance__Group__1__Impl rule__Connaissance__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalGame.g:2018:1: rule__Connaissance__Group__1__Impl : ( '{' ) ;
    public final void rule__Connaissance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2022:1: ( ( '{' ) )
            // InternalGame.g:2023:1: ( '{' )
            {
            // InternalGame.g:2023:1: ( '{' )
            // InternalGame.g:2024:2: '{'
            {
             before(grammarAccess.getConnaissanceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalGame.g:2033:1: rule__Connaissance__Group__2 : rule__Connaissance__Group__2__Impl rule__Connaissance__Group__3 ;
    public final void rule__Connaissance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2037:1: ( rule__Connaissance__Group__2__Impl rule__Connaissance__Group__3 )
            // InternalGame.g:2038:2: rule__Connaissance__Group__2__Impl rule__Connaissance__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:2045:1: rule__Connaissance__Group__2__Impl : ( 'visible' ) ;
    public final void rule__Connaissance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2049:1: ( ( 'visible' ) )
            // InternalGame.g:2050:1: ( 'visible' )
            {
            // InternalGame.g:2050:1: ( 'visible' )
            // InternalGame.g:2051:2: 'visible'
            {
             before(grammarAccess.getConnaissanceAccess().getVisibleKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getVisibleKeyword_2()); 

            }


            }

        }
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
    // InternalGame.g:2060:1: rule__Connaissance__Group__3 : rule__Connaissance__Group__3__Impl rule__Connaissance__Group__4 ;
    public final void rule__Connaissance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2064:1: ( rule__Connaissance__Group__3__Impl rule__Connaissance__Group__4 )
            // InternalGame.g:2065:2: rule__Connaissance__Group__3__Impl rule__Connaissance__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalGame.g:2072:1: rule__Connaissance__Group__3__Impl : ( ( rule__Connaissance__VisibleAssignment_3 ) ) ;
    public final void rule__Connaissance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2076:1: ( ( ( rule__Connaissance__VisibleAssignment_3 ) ) )
            // InternalGame.g:2077:1: ( ( rule__Connaissance__VisibleAssignment_3 ) )
            {
            // InternalGame.g:2077:1: ( ( rule__Connaissance__VisibleAssignment_3 ) )
            // InternalGame.g:2078:2: ( rule__Connaissance__VisibleAssignment_3 )
            {
             before(grammarAccess.getConnaissanceAccess().getVisibleAssignment_3()); 
            // InternalGame.g:2079:2: ( rule__Connaissance__VisibleAssignment_3 )
            // InternalGame.g:2079:3: rule__Connaissance__VisibleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__VisibleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConnaissanceAccess().getVisibleAssignment_3()); 

            }


            }

        }
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
    // InternalGame.g:2087:1: rule__Connaissance__Group__4 : rule__Connaissance__Group__4__Impl rule__Connaissance__Group__5 ;
    public final void rule__Connaissance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2091:1: ( rule__Connaissance__Group__4__Impl rule__Connaissance__Group__5 )
            // InternalGame.g:2092:2: rule__Connaissance__Group__4__Impl rule__Connaissance__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:2099:1: rule__Connaissance__Group__4__Impl : ( 'actif' ) ;
    public final void rule__Connaissance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2103:1: ( ( 'actif' ) )
            // InternalGame.g:2104:1: ( 'actif' )
            {
            // InternalGame.g:2104:1: ( 'actif' )
            // InternalGame.g:2105:2: 'actif'
            {
             before(grammarAccess.getConnaissanceAccess().getActifKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getActifKeyword_4()); 

            }


            }

        }
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
    // InternalGame.g:2114:1: rule__Connaissance__Group__5 : rule__Connaissance__Group__5__Impl rule__Connaissance__Group__6 ;
    public final void rule__Connaissance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2118:1: ( rule__Connaissance__Group__5__Impl rule__Connaissance__Group__6 )
            // InternalGame.g:2119:2: rule__Connaissance__Group__5__Impl rule__Connaissance__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalGame.g:2126:1: rule__Connaissance__Group__5__Impl : ( ( rule__Connaissance__ActifAssignment_5 ) ) ;
    public final void rule__Connaissance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2130:1: ( ( ( rule__Connaissance__ActifAssignment_5 ) ) )
            // InternalGame.g:2131:1: ( ( rule__Connaissance__ActifAssignment_5 ) )
            {
            // InternalGame.g:2131:1: ( ( rule__Connaissance__ActifAssignment_5 ) )
            // InternalGame.g:2132:2: ( rule__Connaissance__ActifAssignment_5 )
            {
             before(grammarAccess.getConnaissanceAccess().getActifAssignment_5()); 
            // InternalGame.g:2133:2: ( rule__Connaissance__ActifAssignment_5 )
            // InternalGame.g:2133:3: rule__Connaissance__ActifAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__ActifAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConnaissanceAccess().getActifAssignment_5()); 

            }


            }

        }
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
    // InternalGame.g:2141:1: rule__Connaissance__Group__6 : rule__Connaissance__Group__6__Impl ;
    public final void rule__Connaissance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2145:1: ( rule__Connaissance__Group__6__Impl )
            // InternalGame.g:2146:2: rule__Connaissance__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalGame.g:2152:1: rule__Connaissance__Group__6__Impl : ( '}' ) ;
    public final void rule__Connaissance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2156:1: ( ( '}' ) )
            // InternalGame.g:2157:1: ( '}' )
            {
            // InternalGame.g:2157:1: ( '}' )
            // InternalGame.g:2158:2: '}'
            {
             before(grammarAccess.getConnaissanceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Objet__Group__0"
    // InternalGame.g:2168:1: rule__Objet__Group__0 : rule__Objet__Group__0__Impl rule__Objet__Group__1 ;
    public final void rule__Objet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2172:1: ( rule__Objet__Group__0__Impl rule__Objet__Group__1 )
            // InternalGame.g:2173:2: rule__Objet__Group__0__Impl rule__Objet__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalGame.g:2180:1: rule__Objet__Group__0__Impl : ( 'objet' ) ;
    public final void rule__Objet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2184:1: ( ( 'objet' ) )
            // InternalGame.g:2185:1: ( 'objet' )
            {
            // InternalGame.g:2185:1: ( 'objet' )
            // InternalGame.g:2186:2: 'objet'
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
    // InternalGame.g:2195:1: rule__Objet__Group__1 : rule__Objet__Group__1__Impl rule__Objet__Group__2 ;
    public final void rule__Objet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2199:1: ( rule__Objet__Group__1__Impl rule__Objet__Group__2 )
            // InternalGame.g:2200:2: rule__Objet__Group__1__Impl rule__Objet__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalGame.g:2207:1: rule__Objet__Group__1__Impl : ( '{' ) ;
    public final void rule__Objet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2211:1: ( ( '{' ) )
            // InternalGame.g:2212:1: ( '{' )
            {
            // InternalGame.g:2212:1: ( '{' )
            // InternalGame.g:2213:2: '{'
            {
             before(grammarAccess.getObjetAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalGame.g:2222:1: rule__Objet__Group__2 : rule__Objet__Group__2__Impl rule__Objet__Group__3 ;
    public final void rule__Objet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2226:1: ( rule__Objet__Group__2__Impl rule__Objet__Group__3 )
            // InternalGame.g:2227:2: rule__Objet__Group__2__Impl rule__Objet__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:2234:1: rule__Objet__Group__2__Impl : ( 'visible' ) ;
    public final void rule__Objet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2238:1: ( ( 'visible' ) )
            // InternalGame.g:2239:1: ( 'visible' )
            {
            // InternalGame.g:2239:1: ( 'visible' )
            // InternalGame.g:2240:2: 'visible'
            {
             before(grammarAccess.getObjetAccess().getVisibleKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getVisibleKeyword_2()); 

            }


            }

        }
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
    // InternalGame.g:2249:1: rule__Objet__Group__3 : rule__Objet__Group__3__Impl rule__Objet__Group__4 ;
    public final void rule__Objet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2253:1: ( rule__Objet__Group__3__Impl rule__Objet__Group__4 )
            // InternalGame.g:2254:2: rule__Objet__Group__3__Impl rule__Objet__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalGame.g:2261:1: rule__Objet__Group__3__Impl : ( ( rule__Objet__VisibleAssignment_3 ) ) ;
    public final void rule__Objet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2265:1: ( ( ( rule__Objet__VisibleAssignment_3 ) ) )
            // InternalGame.g:2266:1: ( ( rule__Objet__VisibleAssignment_3 ) )
            {
            // InternalGame.g:2266:1: ( ( rule__Objet__VisibleAssignment_3 ) )
            // InternalGame.g:2267:2: ( rule__Objet__VisibleAssignment_3 )
            {
             before(grammarAccess.getObjetAccess().getVisibleAssignment_3()); 
            // InternalGame.g:2268:2: ( rule__Objet__VisibleAssignment_3 )
            // InternalGame.g:2268:3: rule__Objet__VisibleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Objet__VisibleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getVisibleAssignment_3()); 

            }


            }

        }
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
    // InternalGame.g:2276:1: rule__Objet__Group__4 : rule__Objet__Group__4__Impl rule__Objet__Group__5 ;
    public final void rule__Objet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2280:1: ( rule__Objet__Group__4__Impl rule__Objet__Group__5 )
            // InternalGame.g:2281:2: rule__Objet__Group__4__Impl rule__Objet__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:2288:1: rule__Objet__Group__4__Impl : ( 'actif' ) ;
    public final void rule__Objet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2292:1: ( ( 'actif' ) )
            // InternalGame.g:2293:1: ( 'actif' )
            {
            // InternalGame.g:2293:1: ( 'actif' )
            // InternalGame.g:2294:2: 'actif'
            {
             before(grammarAccess.getObjetAccess().getActifKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getActifKeyword_4()); 

            }


            }

        }
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
    // InternalGame.g:2303:1: rule__Objet__Group__5 : rule__Objet__Group__5__Impl rule__Objet__Group__6 ;
    public final void rule__Objet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2307:1: ( rule__Objet__Group__5__Impl rule__Objet__Group__6 )
            // InternalGame.g:2308:2: rule__Objet__Group__5__Impl rule__Objet__Group__6
            {
            pushFollow(FOLLOW_33);
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
    // InternalGame.g:2315:1: rule__Objet__Group__5__Impl : ( ( rule__Objet__ActifAssignment_5 ) ) ;
    public final void rule__Objet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2319:1: ( ( ( rule__Objet__ActifAssignment_5 ) ) )
            // InternalGame.g:2320:1: ( ( rule__Objet__ActifAssignment_5 ) )
            {
            // InternalGame.g:2320:1: ( ( rule__Objet__ActifAssignment_5 ) )
            // InternalGame.g:2321:2: ( rule__Objet__ActifAssignment_5 )
            {
             before(grammarAccess.getObjetAccess().getActifAssignment_5()); 
            // InternalGame.g:2322:2: ( rule__Objet__ActifAssignment_5 )
            // InternalGame.g:2322:3: rule__Objet__ActifAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Objet__ActifAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getActifAssignment_5()); 

            }


            }

        }
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
    // InternalGame.g:2330:1: rule__Objet__Group__6 : rule__Objet__Group__6__Impl rule__Objet__Group__7 ;
    public final void rule__Objet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2334:1: ( rule__Objet__Group__6__Impl rule__Objet__Group__7 )
            // InternalGame.g:2335:2: rule__Objet__Group__6__Impl rule__Objet__Group__7
            {
            pushFollow(FOLLOW_26);
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
    // InternalGame.g:2342:1: rule__Objet__Group__6__Impl : ( 'quantite' ) ;
    public final void rule__Objet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2346:1: ( ( 'quantite' ) )
            // InternalGame.g:2347:1: ( 'quantite' )
            {
            // InternalGame.g:2347:1: ( 'quantite' )
            // InternalGame.g:2348:2: 'quantite'
            {
             before(grammarAccess.getObjetAccess().getQuantiteKeyword_6()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getQuantiteKeyword_6()); 

            }


            }

        }
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
    // InternalGame.g:2357:1: rule__Objet__Group__7 : rule__Objet__Group__7__Impl rule__Objet__Group__8 ;
    public final void rule__Objet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2361:1: ( rule__Objet__Group__7__Impl rule__Objet__Group__8 )
            // InternalGame.g:2362:2: rule__Objet__Group__7__Impl rule__Objet__Group__8
            {
            pushFollow(FOLLOW_24);
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
    // InternalGame.g:2369:1: rule__Objet__Group__7__Impl : ( ( rule__Objet__QteAssignment_7 ) ) ;
    public final void rule__Objet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2373:1: ( ( ( rule__Objet__QteAssignment_7 ) ) )
            // InternalGame.g:2374:1: ( ( rule__Objet__QteAssignment_7 ) )
            {
            // InternalGame.g:2374:1: ( ( rule__Objet__QteAssignment_7 ) )
            // InternalGame.g:2375:2: ( rule__Objet__QteAssignment_7 )
            {
             before(grammarAccess.getObjetAccess().getQteAssignment_7()); 
            // InternalGame.g:2376:2: ( rule__Objet__QteAssignment_7 )
            // InternalGame.g:2376:3: rule__Objet__QteAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Objet__QteAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getQteAssignment_7()); 

            }


            }

        }
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
    // InternalGame.g:2384:1: rule__Objet__Group__8 : rule__Objet__Group__8__Impl rule__Objet__Group__9 ;
    public final void rule__Objet__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2388:1: ( rule__Objet__Group__8__Impl rule__Objet__Group__9 )
            // InternalGame.g:2389:2: rule__Objet__Group__8__Impl rule__Objet__Group__9
            {
            pushFollow(FOLLOW_26);
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
    // InternalGame.g:2396:1: rule__Objet__Group__8__Impl : ( 'taille' ) ;
    public final void rule__Objet__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2400:1: ( ( 'taille' ) )
            // InternalGame.g:2401:1: ( 'taille' )
            {
            // InternalGame.g:2401:1: ( 'taille' )
            // InternalGame.g:2402:2: 'taille'
            {
             before(grammarAccess.getObjetAccess().getTailleKeyword_8()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getTailleKeyword_8()); 

            }


            }

        }
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
    // InternalGame.g:2411:1: rule__Objet__Group__9 : rule__Objet__Group__9__Impl rule__Objet__Group__10 ;
    public final void rule__Objet__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2415:1: ( rule__Objet__Group__9__Impl rule__Objet__Group__10 )
            // InternalGame.g:2416:2: rule__Objet__Group__9__Impl rule__Objet__Group__10
            {
            pushFollow(FOLLOW_34);
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
    // InternalGame.g:2423:1: rule__Objet__Group__9__Impl : ( ( rule__Objet__TailleAssignment_9 ) ) ;
    public final void rule__Objet__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2427:1: ( ( ( rule__Objet__TailleAssignment_9 ) ) )
            // InternalGame.g:2428:1: ( ( rule__Objet__TailleAssignment_9 ) )
            {
            // InternalGame.g:2428:1: ( ( rule__Objet__TailleAssignment_9 ) )
            // InternalGame.g:2429:2: ( rule__Objet__TailleAssignment_9 )
            {
             before(grammarAccess.getObjetAccess().getTailleAssignment_9()); 
            // InternalGame.g:2430:2: ( rule__Objet__TailleAssignment_9 )
            // InternalGame.g:2430:3: rule__Objet__TailleAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Objet__TailleAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getTailleAssignment_9()); 

            }


            }

        }
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
    // InternalGame.g:2438:1: rule__Objet__Group__10 : rule__Objet__Group__10__Impl rule__Objet__Group__11 ;
    public final void rule__Objet__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2442:1: ( rule__Objet__Group__10__Impl rule__Objet__Group__11 )
            // InternalGame.g:2443:2: rule__Objet__Group__10__Impl rule__Objet__Group__11
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:2450:1: rule__Objet__Group__10__Impl : ( 'transformable' ) ;
    public final void rule__Objet__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2454:1: ( ( 'transformable' ) )
            // InternalGame.g:2455:1: ( 'transformable' )
            {
            // InternalGame.g:2455:1: ( 'transformable' )
            // InternalGame.g:2456:2: 'transformable'
            {
             before(grammarAccess.getObjetAccess().getTransformableKeyword_10()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getTransformableKeyword_10()); 

            }


            }

        }
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
    // InternalGame.g:2465:1: rule__Objet__Group__11 : rule__Objet__Group__11__Impl rule__Objet__Group__12 ;
    public final void rule__Objet__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2469:1: ( rule__Objet__Group__11__Impl rule__Objet__Group__12 )
            // InternalGame.g:2470:2: rule__Objet__Group__11__Impl rule__Objet__Group__12
            {
            pushFollow(FOLLOW_10);
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
    // InternalGame.g:2477:1: rule__Objet__Group__11__Impl : ( ( rule__Objet__TransformableAssignment_11 ) ) ;
    public final void rule__Objet__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2481:1: ( ( ( rule__Objet__TransformableAssignment_11 ) ) )
            // InternalGame.g:2482:1: ( ( rule__Objet__TransformableAssignment_11 ) )
            {
            // InternalGame.g:2482:1: ( ( rule__Objet__TransformableAssignment_11 ) )
            // InternalGame.g:2483:2: ( rule__Objet__TransformableAssignment_11 )
            {
             before(grammarAccess.getObjetAccess().getTransformableAssignment_11()); 
            // InternalGame.g:2484:2: ( rule__Objet__TransformableAssignment_11 )
            // InternalGame.g:2484:3: rule__Objet__TransformableAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Objet__TransformableAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getTransformableAssignment_11()); 

            }


            }

        }
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
    // InternalGame.g:2492:1: rule__Objet__Group__12 : rule__Objet__Group__12__Impl ;
    public final void rule__Objet__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2496:1: ( rule__Objet__Group__12__Impl )
            // InternalGame.g:2497:2: rule__Objet__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Objet__Group__12__Impl();

            state._fsp--;


            }

        }
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
    // InternalGame.g:2503:1: rule__Objet__Group__12__Impl : ( '}' ) ;
    public final void rule__Objet__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2507:1: ( ( '}' ) )
            // InternalGame.g:2508:1: ( '}' )
            {
            // InternalGame.g:2508:1: ( '}' )
            // InternalGame.g:2509:2: '}'
            {
             before(grammarAccess.getObjetAccess().getRightCurlyBracketKeyword_12()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
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


    // $ANTLR start "rule__Interaction__Group__0"
    // InternalGame.g:2519:1: rule__Interaction__Group__0 : rule__Interaction__Group__0__Impl rule__Interaction__Group__1 ;
    public final void rule__Interaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2523:1: ( rule__Interaction__Group__0__Impl rule__Interaction__Group__1 )
            // InternalGame.g:2524:2: rule__Interaction__Group__0__Impl rule__Interaction__Group__1
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
    // InternalGame.g:2531:1: rule__Interaction__Group__0__Impl : ( 'interaction' ) ;
    public final void rule__Interaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2535:1: ( ( 'interaction' ) )
            // InternalGame.g:2536:1: ( 'interaction' )
            {
            // InternalGame.g:2536:1: ( 'interaction' )
            // InternalGame.g:2537:2: 'interaction'
            {
             before(grammarAccess.getInteractionAccess().getInteractionKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalGame.g:2546:1: rule__Interaction__Group__1 : rule__Interaction__Group__1__Impl rule__Interaction__Group__2 ;
    public final void rule__Interaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2550:1: ( rule__Interaction__Group__1__Impl rule__Interaction__Group__2 )
            // InternalGame.g:2551:2: rule__Interaction__Group__1__Impl rule__Interaction__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalGame.g:2558:1: rule__Interaction__Group__1__Impl : ( '{' ) ;
    public final void rule__Interaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2562:1: ( ( '{' ) )
            // InternalGame.g:2563:1: ( '{' )
            {
            // InternalGame.g:2563:1: ( '{' )
            // InternalGame.g:2564:2: '{'
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
    // InternalGame.g:2573:1: rule__Interaction__Group__2 : rule__Interaction__Group__2__Impl rule__Interaction__Group__3 ;
    public final void rule__Interaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2577:1: ( rule__Interaction__Group__2__Impl rule__Interaction__Group__3 )
            // InternalGame.g:2578:2: rule__Interaction__Group__2__Impl rule__Interaction__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalGame.g:2585:1: rule__Interaction__Group__2__Impl : ( 'question' ) ;
    public final void rule__Interaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2589:1: ( ( 'question' ) )
            // InternalGame.g:2590:1: ( 'question' )
            {
            // InternalGame.g:2590:1: ( 'question' )
            // InternalGame.g:2591:2: 'question'
            {
             before(grammarAccess.getInteractionAccess().getQuestionKeyword_2()); 
            match(input,42,FOLLOW_2); 
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
    // InternalGame.g:2600:1: rule__Interaction__Group__3 : rule__Interaction__Group__3__Impl rule__Interaction__Group__4 ;
    public final void rule__Interaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2604:1: ( rule__Interaction__Group__3__Impl rule__Interaction__Group__4 )
            // InternalGame.g:2605:2: rule__Interaction__Group__3__Impl rule__Interaction__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalGame.g:2612:1: rule__Interaction__Group__3__Impl : ( ( rule__Interaction__QuestionAssignment_3 ) ) ;
    public final void rule__Interaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2616:1: ( ( ( rule__Interaction__QuestionAssignment_3 ) ) )
            // InternalGame.g:2617:1: ( ( rule__Interaction__QuestionAssignment_3 ) )
            {
            // InternalGame.g:2617:1: ( ( rule__Interaction__QuestionAssignment_3 ) )
            // InternalGame.g:2618:2: ( rule__Interaction__QuestionAssignment_3 )
            {
             before(grammarAccess.getInteractionAccess().getQuestionAssignment_3()); 
            // InternalGame.g:2619:2: ( rule__Interaction__QuestionAssignment_3 )
            // InternalGame.g:2619:3: rule__Interaction__QuestionAssignment_3
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
    // InternalGame.g:2627:1: rule__Interaction__Group__4 : rule__Interaction__Group__4__Impl rule__Interaction__Group__5 ;
    public final void rule__Interaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2631:1: ( rule__Interaction__Group__4__Impl rule__Interaction__Group__5 )
            // InternalGame.g:2632:2: rule__Interaction__Group__4__Impl rule__Interaction__Group__5
            {
            pushFollow(FOLLOW_37);
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
    // InternalGame.g:2639:1: rule__Interaction__Group__4__Impl : ( 'choix' ) ;
    public final void rule__Interaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2643:1: ( ( 'choix' ) )
            // InternalGame.g:2644:1: ( 'choix' )
            {
            // InternalGame.g:2644:1: ( 'choix' )
            // InternalGame.g:2645:2: 'choix'
            {
             before(grammarAccess.getInteractionAccess().getChoixKeyword_4()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getChoixKeyword_4()); 

            }


            }

        }
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
    // InternalGame.g:2654:1: rule__Interaction__Group__5 : rule__Interaction__Group__5__Impl rule__Interaction__Group__6 ;
    public final void rule__Interaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2658:1: ( rule__Interaction__Group__5__Impl rule__Interaction__Group__6 )
            // InternalGame.g:2659:2: rule__Interaction__Group__5__Impl rule__Interaction__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalGame.g:2666:1: rule__Interaction__Group__5__Impl : ( ( ( rule__Interaction__ChoixAssignment_5 ) ) ( ( rule__Interaction__ChoixAssignment_5 )* ) ) ;
    public final void rule__Interaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2670:1: ( ( ( ( rule__Interaction__ChoixAssignment_5 ) ) ( ( rule__Interaction__ChoixAssignment_5 )* ) ) )
            // InternalGame.g:2671:1: ( ( ( rule__Interaction__ChoixAssignment_5 ) ) ( ( rule__Interaction__ChoixAssignment_5 )* ) )
            {
            // InternalGame.g:2671:1: ( ( ( rule__Interaction__ChoixAssignment_5 ) ) ( ( rule__Interaction__ChoixAssignment_5 )* ) )
            // InternalGame.g:2672:2: ( ( rule__Interaction__ChoixAssignment_5 ) ) ( ( rule__Interaction__ChoixAssignment_5 )* )
            {
            // InternalGame.g:2672:2: ( ( rule__Interaction__ChoixAssignment_5 ) )
            // InternalGame.g:2673:3: ( rule__Interaction__ChoixAssignment_5 )
            {
             before(grammarAccess.getInteractionAccess().getChoixAssignment_5()); 
            // InternalGame.g:2674:3: ( rule__Interaction__ChoixAssignment_5 )
            // InternalGame.g:2674:4: rule__Interaction__ChoixAssignment_5
            {
            pushFollow(FOLLOW_38);
            rule__Interaction__ChoixAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getChoixAssignment_5()); 

            }

            // InternalGame.g:2677:2: ( ( rule__Interaction__ChoixAssignment_5 )* )
            // InternalGame.g:2678:3: ( rule__Interaction__ChoixAssignment_5 )*
            {
             before(grammarAccess.getInteractionAccess().getChoixAssignment_5()); 
            // InternalGame.g:2679:3: ( rule__Interaction__ChoixAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==43) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGame.g:2679:4: rule__Interaction__ChoixAssignment_5
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__Interaction__ChoixAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getInteractionAccess().getChoixAssignment_5()); 

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
    // $ANTLR end "rule__Interaction__Group__5__Impl"


    // $ANTLR start "rule__Interaction__Group__6"
    // InternalGame.g:2688:1: rule__Interaction__Group__6 : rule__Interaction__Group__6__Impl ;
    public final void rule__Interaction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2692:1: ( rule__Interaction__Group__6__Impl )
            // InternalGame.g:2693:2: rule__Interaction__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalGame.g:2699:1: rule__Interaction__Group__6__Impl : ( '}' ) ;
    public final void rule__Interaction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2703:1: ( ( '}' ) )
            // InternalGame.g:2704:1: ( '}' )
            {
            // InternalGame.g:2704:1: ( '}' )
            // InternalGame.g:2705:2: '}'
            {
             before(grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Choix__Group__0"
    // InternalGame.g:2715:1: rule__Choix__Group__0 : rule__Choix__Group__0__Impl rule__Choix__Group__1 ;
    public final void rule__Choix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2719:1: ( rule__Choix__Group__0__Impl rule__Choix__Group__1 )
            // InternalGame.g:2720:2: rule__Choix__Group__0__Impl rule__Choix__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalGame.g:2727:1: rule__Choix__Group__0__Impl : ( 'choix' ) ;
    public final void rule__Choix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2731:1: ( ( 'choix' ) )
            // InternalGame.g:2732:1: ( 'choix' )
            {
            // InternalGame.g:2732:1: ( 'choix' )
            // InternalGame.g:2733:2: 'choix'
            {
             before(grammarAccess.getChoixAccess().getChoixKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalGame.g:2742:1: rule__Choix__Group__1 : rule__Choix__Group__1__Impl rule__Choix__Group__2 ;
    public final void rule__Choix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2746:1: ( rule__Choix__Group__1__Impl rule__Choix__Group__2 )
            // InternalGame.g:2747:2: rule__Choix__Group__1__Impl rule__Choix__Group__2
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
    // InternalGame.g:2754:1: rule__Choix__Group__1__Impl : ( ( rule__Choix__NumeroAssignment_1 ) ) ;
    public final void rule__Choix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2758:1: ( ( ( rule__Choix__NumeroAssignment_1 ) ) )
            // InternalGame.g:2759:1: ( ( rule__Choix__NumeroAssignment_1 ) )
            {
            // InternalGame.g:2759:1: ( ( rule__Choix__NumeroAssignment_1 ) )
            // InternalGame.g:2760:2: ( rule__Choix__NumeroAssignment_1 )
            {
             before(grammarAccess.getChoixAccess().getNumeroAssignment_1()); 
            // InternalGame.g:2761:2: ( rule__Choix__NumeroAssignment_1 )
            // InternalGame.g:2761:3: rule__Choix__NumeroAssignment_1
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
    // InternalGame.g:2769:1: rule__Choix__Group__2 : rule__Choix__Group__2__Impl rule__Choix__Group__3 ;
    public final void rule__Choix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2773:1: ( rule__Choix__Group__2__Impl rule__Choix__Group__3 )
            // InternalGame.g:2774:2: rule__Choix__Group__2__Impl rule__Choix__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalGame.g:2781:1: rule__Choix__Group__2__Impl : ( '{' ) ;
    public final void rule__Choix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2785:1: ( ( '{' ) )
            // InternalGame.g:2786:1: ( '{' )
            {
            // InternalGame.g:2786:1: ( '{' )
            // InternalGame.g:2787:2: '{'
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
    // InternalGame.g:2796:1: rule__Choix__Group__3 : rule__Choix__Group__3__Impl rule__Choix__Group__4 ;
    public final void rule__Choix__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2800:1: ( rule__Choix__Group__3__Impl rule__Choix__Group__4 )
            // InternalGame.g:2801:2: rule__Choix__Group__3__Impl rule__Choix__Group__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalGame.g:2808:1: rule__Choix__Group__3__Impl : ( 'reponse' ) ;
    public final void rule__Choix__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2812:1: ( ( 'reponse' ) )
            // InternalGame.g:2813:1: ( 'reponse' )
            {
            // InternalGame.g:2813:1: ( 'reponse' )
            // InternalGame.g:2814:2: 'reponse'
            {
             before(grammarAccess.getChoixAccess().getReponseKeyword_3()); 
            match(input,44,FOLLOW_2); 
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
    // InternalGame.g:2823:1: rule__Choix__Group__4 : rule__Choix__Group__4__Impl rule__Choix__Group__5 ;
    public final void rule__Choix__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2827:1: ( rule__Choix__Group__4__Impl rule__Choix__Group__5 )
            // InternalGame.g:2828:2: rule__Choix__Group__4__Impl rule__Choix__Group__5
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
    // InternalGame.g:2835:1: rule__Choix__Group__4__Impl : ( ( rule__Choix__ReponseAssignment_4 ) ) ;
    public final void rule__Choix__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2839:1: ( ( ( rule__Choix__ReponseAssignment_4 ) ) )
            // InternalGame.g:2840:1: ( ( rule__Choix__ReponseAssignment_4 ) )
            {
            // InternalGame.g:2840:1: ( ( rule__Choix__ReponseAssignment_4 ) )
            // InternalGame.g:2841:2: ( rule__Choix__ReponseAssignment_4 )
            {
             before(grammarAccess.getChoixAccess().getReponseAssignment_4()); 
            // InternalGame.g:2842:2: ( rule__Choix__ReponseAssignment_4 )
            // InternalGame.g:2842:3: rule__Choix__ReponseAssignment_4
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
    // InternalGame.g:2850:1: rule__Choix__Group__5 : rule__Choix__Group__5__Impl rule__Choix__Group__6 ;
    public final void rule__Choix__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2854:1: ( rule__Choix__Group__5__Impl rule__Choix__Group__6 )
            // InternalGame.g:2855:2: rule__Choix__Group__5__Impl rule__Choix__Group__6
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
    // InternalGame.g:2862:1: rule__Choix__Group__5__Impl : ( 'recompense' ) ;
    public final void rule__Choix__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2866:1: ( ( 'recompense' ) )
            // InternalGame.g:2867:1: ( 'recompense' )
            {
            // InternalGame.g:2867:1: ( 'recompense' )
            // InternalGame.g:2868:2: 'recompense'
            {
             before(grammarAccess.getChoixAccess().getRecompenseKeyword_5()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getRecompenseKeyword_5()); 

            }


            }

        }
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
    // InternalGame.g:2877:1: rule__Choix__Group__6 : rule__Choix__Group__6__Impl rule__Choix__Group__7 ;
    public final void rule__Choix__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2881:1: ( rule__Choix__Group__6__Impl rule__Choix__Group__7 )
            // InternalGame.g:2882:2: rule__Choix__Group__6__Impl rule__Choix__Group__7
            {
            pushFollow(FOLLOW_10);
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
    // InternalGame.g:2889:1: rule__Choix__Group__6__Impl : ( ( rule__Choix__RecompenseAssignment_6 ) ) ;
    public final void rule__Choix__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2893:1: ( ( ( rule__Choix__RecompenseAssignment_6 ) ) )
            // InternalGame.g:2894:1: ( ( rule__Choix__RecompenseAssignment_6 ) )
            {
            // InternalGame.g:2894:1: ( ( rule__Choix__RecompenseAssignment_6 ) )
            // InternalGame.g:2895:2: ( rule__Choix__RecompenseAssignment_6 )
            {
             before(grammarAccess.getChoixAccess().getRecompenseAssignment_6()); 
            // InternalGame.g:2896:2: ( rule__Choix__RecompenseAssignment_6 )
            // InternalGame.g:2896:3: rule__Choix__RecompenseAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Choix__RecompenseAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getRecompenseAssignment_6()); 

            }


            }

        }
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
    // InternalGame.g:2904:1: rule__Choix__Group__7 : rule__Choix__Group__7__Impl ;
    public final void rule__Choix__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2908:1: ( rule__Choix__Group__7__Impl )
            // InternalGame.g:2909:2: rule__Choix__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalGame.g:2915:1: rule__Choix__Group__7__Impl : ( '}' ) ;
    public final void rule__Choix__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2919:1: ( ( '}' ) )
            // InternalGame.g:2920:1: ( '}' )
            {
            // InternalGame.g:2920:1: ( '}' )
            // InternalGame.g:2921:2: '}'
            {
             before(grammarAccess.getChoixAccess().getRightCurlyBracketKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Recompense__Group__0"
    // InternalGame.g:2931:1: rule__Recompense__Group__0 : rule__Recompense__Group__0__Impl rule__Recompense__Group__1 ;
    public final void rule__Recompense__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2935:1: ( rule__Recompense__Group__0__Impl rule__Recompense__Group__1 )
            // InternalGame.g:2936:2: rule__Recompense__Group__0__Impl rule__Recompense__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Recompense__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recompense__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recompense__Group__0"


    // $ANTLR start "rule__Recompense__Group__0__Impl"
    // InternalGame.g:2943:1: rule__Recompense__Group__0__Impl : ( 'recompense' ) ;
    public final void rule__Recompense__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2947:1: ( ( 'recompense' ) )
            // InternalGame.g:2948:1: ( 'recompense' )
            {
            // InternalGame.g:2948:1: ( 'recompense' )
            // InternalGame.g:2949:2: 'recompense'
            {
             before(grammarAccess.getRecompenseAccess().getRecompenseKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getRecompenseAccess().getRecompenseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recompense__Group__0__Impl"


    // $ANTLR start "rule__Recompense__Group__1"
    // InternalGame.g:2958:1: rule__Recompense__Group__1 : rule__Recompense__Group__1__Impl rule__Recompense__Group__2 ;
    public final void rule__Recompense__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2962:1: ( rule__Recompense__Group__1__Impl rule__Recompense__Group__2 )
            // InternalGame.g:2963:2: rule__Recompense__Group__1__Impl rule__Recompense__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__Recompense__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recompense__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recompense__Group__1"


    // $ANTLR start "rule__Recompense__Group__1__Impl"
    // InternalGame.g:2970:1: rule__Recompense__Group__1__Impl : ( '{' ) ;
    public final void rule__Recompense__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2974:1: ( ( '{' ) )
            // InternalGame.g:2975:1: ( '{' )
            {
            // InternalGame.g:2975:1: ( '{' )
            // InternalGame.g:2976:2: '{'
            {
             before(grammarAccess.getRecompenseAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRecompenseAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recompense__Group__1__Impl"


    // $ANTLR start "rule__Recompense__Group__2"
    // InternalGame.g:2985:1: rule__Recompense__Group__2 : rule__Recompense__Group__2__Impl rule__Recompense__Group__3 ;
    public final void rule__Recompense__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2989:1: ( rule__Recompense__Group__2__Impl rule__Recompense__Group__3 )
            // InternalGame.g:2990:2: rule__Recompense__Group__2__Impl rule__Recompense__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__Recompense__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recompense__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recompense__Group__2"


    // $ANTLR start "rule__Recompense__Group__2__Impl"
    // InternalGame.g:2997:1: rule__Recompense__Group__2__Impl : ( 'avantage' ) ;
    public final void rule__Recompense__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3001:1: ( ( 'avantage' ) )
            // InternalGame.g:3002:1: ( 'avantage' )
            {
            // InternalGame.g:3002:1: ( 'avantage' )
            // InternalGame.g:3003:2: 'avantage'
            {
             before(grammarAccess.getRecompenseAccess().getAvantageKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getRecompenseAccess().getAvantageKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recompense__Group__2__Impl"


    // $ANTLR start "rule__Recompense__Group__3"
    // InternalGame.g:3012:1: rule__Recompense__Group__3 : rule__Recompense__Group__3__Impl rule__Recompense__Group__4 ;
    public final void rule__Recompense__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3016:1: ( rule__Recompense__Group__3__Impl rule__Recompense__Group__4 )
            // InternalGame.g:3017:2: rule__Recompense__Group__3__Impl rule__Recompense__Group__4
            {
            pushFollow(FOLLOW_42);
            rule__Recompense__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recompense__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recompense__Group__3"


    // $ANTLR start "rule__Recompense__Group__3__Impl"
    // InternalGame.g:3024:1: rule__Recompense__Group__3__Impl : ( ( rule__Recompense__AvantageAssignment_3 )* ) ;
    public final void rule__Recompense__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3028:1: ( ( ( rule__Recompense__AvantageAssignment_3 )* ) )
            // InternalGame.g:3029:1: ( ( rule__Recompense__AvantageAssignment_3 )* )
            {
            // InternalGame.g:3029:1: ( ( rule__Recompense__AvantageAssignment_3 )* )
            // InternalGame.g:3030:2: ( rule__Recompense__AvantageAssignment_3 )*
            {
             before(grammarAccess.getRecompenseAccess().getAvantageAssignment_3()); 
            // InternalGame.g:3031:2: ( rule__Recompense__AvantageAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=37 && LA11_0<=38)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGame.g:3031:3: rule__Recompense__AvantageAssignment_3
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Recompense__AvantageAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getRecompenseAccess().getAvantageAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recompense__Group__3__Impl"


    // $ANTLR start "rule__Recompense__Group__4"
    // InternalGame.g:3039:1: rule__Recompense__Group__4 : rule__Recompense__Group__4__Impl ;
    public final void rule__Recompense__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3043:1: ( rule__Recompense__Group__4__Impl )
            // InternalGame.g:3044:2: rule__Recompense__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recompense__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recompense__Group__4"


    // $ANTLR start "rule__Recompense__Group__4__Impl"
    // InternalGame.g:3050:1: rule__Recompense__Group__4__Impl : ( '}' ) ;
    public final void rule__Recompense__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3054:1: ( ( '}' ) )
            // InternalGame.g:3055:1: ( '}' )
            {
            // InternalGame.g:3055:1: ( '}' )
            // InternalGame.g:3056:2: '}'
            {
             before(grammarAccess.getRecompenseAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRecompenseAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recompense__Group__4__Impl"


    // $ANTLR start "rule__Jeu__NomAssignment_1"
    // InternalGame.g:3066:1: rule__Jeu__NomAssignment_1 : ( RULE_ID ) ;
    public final void rule__Jeu__NomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3070:1: ( ( RULE_ID ) )
            // InternalGame.g:3071:2: ( RULE_ID )
            {
            // InternalGame.g:3071:2: ( RULE_ID )
            // InternalGame.g:3072:3: RULE_ID
            {
             before(grammarAccess.getJeuAccess().getNomIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getNomIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__NomAssignment_1"


    // $ANTLR start "rule__Jeu__TerritoireAssignment_3"
    // InternalGame.g:3081:1: rule__Jeu__TerritoireAssignment_3 : ( ruleTerritoire ) ;
    public final void rule__Jeu__TerritoireAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3085:1: ( ( ruleTerritoire ) )
            // InternalGame.g:3086:2: ( ruleTerritoire )
            {
            // InternalGame.g:3086:2: ( ruleTerritoire )
            // InternalGame.g:3087:3: ruleTerritoire
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
    // InternalGame.g:3096:1: rule__Jeu__ExplorateurAssignment_4 : ( ruleExplorateur ) ;
    public final void rule__Jeu__ExplorateurAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3100:1: ( ( ruleExplorateur ) )
            // InternalGame.g:3101:2: ( ruleExplorateur )
            {
            // InternalGame.g:3101:2: ( ruleExplorateur )
            // InternalGame.g:3102:3: ruleExplorateur
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
    // InternalGame.g:3111:1: rule__Jeu__ElementsjeuAssignment_5 : ( ruleElementsJeu ) ;
    public final void rule__Jeu__ElementsjeuAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3115:1: ( ( ruleElementsJeu ) )
            // InternalGame.g:3116:2: ( ruleElementsJeu )
            {
            // InternalGame.g:3116:2: ( ruleElementsJeu )
            // InternalGame.g:3117:3: ruleElementsJeu
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
    // InternalGame.g:3126:1: rule__Territoire__PlacesAssignment_2 : ( rulePlace ) ;
    public final void rule__Territoire__PlacesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3130:1: ( ( rulePlace ) )
            // InternalGame.g:3131:2: ( rulePlace )
            {
            // InternalGame.g:3131:2: ( rulePlace )
            // InternalGame.g:3132:3: rulePlace
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


    // $ANTLR start "rule__Lieu__NomAssignment_1"
    // InternalGame.g:3141:1: rule__Lieu__NomAssignment_1 : ( RULE_ID ) ;
    public final void rule__Lieu__NomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3145:1: ( ( RULE_ID ) )
            // InternalGame.g:3146:2: ( RULE_ID )
            {
            // InternalGame.g:3146:2: ( RULE_ID )
            // InternalGame.g:3147:3: RULE_ID
            {
             before(grammarAccess.getLieuAccess().getNomIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getNomIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__NomAssignment_1"


    // $ANTLR start "rule__Lieu__NatureAssignment_3"
    // InternalGame.g:3156:1: rule__Lieu__NatureAssignment_3 : ( ruleNature ) ;
    public final void rule__Lieu__NatureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3160:1: ( ( ruleNature ) )
            // InternalGame.g:3161:2: ( ruleNature )
            {
            // InternalGame.g:3161:2: ( ruleNature )
            // InternalGame.g:3162:3: ruleNature
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


    // $ANTLR start "rule__Chemin__PredAssignment_3"
    // InternalGame.g:3171:1: rule__Chemin__PredAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__PredAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3175:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:3176:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:3176:2: ( ( RULE_ID ) )
            // InternalGame.g:3177:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getPredLieuCrossReference_3_0()); 
            // InternalGame.g:3178:3: ( RULE_ID )
            // InternalGame.g:3179:4: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getPredLieuIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getPredLieuIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCheminAccess().getPredLieuCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__PredAssignment_3"


    // $ANTLR start "rule__Chemin__SuccAssignment_5"
    // InternalGame.g:3190:1: rule__Chemin__SuccAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__SuccAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3194:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:3195:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:3195:2: ( ( RULE_ID ) )
            // InternalGame.g:3196:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getSuccLieuCrossReference_5_0()); 
            // InternalGame.g:3197:3: ( RULE_ID )
            // InternalGame.g:3198:4: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getSuccLieuIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getSuccLieuIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getCheminAccess().getSuccLieuCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__SuccAssignment_5"


    // $ANTLR start "rule__Chemin__VisibleAssignment_7"
    // InternalGame.g:3209:1: rule__Chemin__VisibleAssignment_7 : ( RULE_BOOL ) ;
    public final void rule__Chemin__VisibleAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3213:1: ( ( RULE_BOOL ) )
            // InternalGame.g:3214:2: ( RULE_BOOL )
            {
            // InternalGame.g:3214:2: ( RULE_BOOL )
            // InternalGame.g:3215:3: RULE_BOOL
            {
             before(grammarAccess.getCheminAccess().getVisibleBOOLTerminalRuleCall_7_0()); 
            match(input,RULE_BOOL,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getVisibleBOOLTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__VisibleAssignment_7"


    // $ANTLR start "rule__Chemin__ObligatoireAssignment_9"
    // InternalGame.g:3224:1: rule__Chemin__ObligatoireAssignment_9 : ( RULE_BOOL ) ;
    public final void rule__Chemin__ObligatoireAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3228:1: ( ( RULE_BOOL ) )
            // InternalGame.g:3229:2: ( RULE_BOOL )
            {
            // InternalGame.g:3229:2: ( RULE_BOOL )
            // InternalGame.g:3230:3: RULE_BOOL
            {
             before(grammarAccess.getCheminAccess().getObligatoireBOOLTerminalRuleCall_9_0()); 
            match(input,RULE_BOOL,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getObligatoireBOOLTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__ObligatoireAssignment_9"


    // $ANTLR start "rule__Chemin__OuvertAssignment_11"
    // InternalGame.g:3239:1: rule__Chemin__OuvertAssignment_11 : ( RULE_BOOL ) ;
    public final void rule__Chemin__OuvertAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3243:1: ( ( RULE_BOOL ) )
            // InternalGame.g:3244:2: ( RULE_BOOL )
            {
            // InternalGame.g:3244:2: ( RULE_BOOL )
            // InternalGame.g:3245:3: RULE_BOOL
            {
             before(grammarAccess.getCheminAccess().getOuvertBOOLTerminalRuleCall_11_0()); 
            match(input,RULE_BOOL,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getOuvertBOOLTerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__OuvertAssignment_11"


    // $ANTLR start "rule__Personne__NomAssignment_1"
    // InternalGame.g:3254:1: rule__Personne__NomAssignment_1 : ( RULE_ID ) ;
    public final void rule__Personne__NomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3258:1: ( ( RULE_ID ) )
            // InternalGame.g:3259:2: ( RULE_ID )
            {
            // InternalGame.g:3259:2: ( RULE_ID )
            // InternalGame.g:3260:3: RULE_ID
            {
             before(grammarAccess.getPersonneAccess().getNomIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getNomIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__NomAssignment_1"


    // $ANTLR start "rule__Personne__VisibleAssignment_4"
    // InternalGame.g:3269:1: rule__Personne__VisibleAssignment_4 : ( RULE_BOOL ) ;
    public final void rule__Personne__VisibleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3273:1: ( ( RULE_BOOL ) )
            // InternalGame.g:3274:2: ( RULE_BOOL )
            {
            // InternalGame.g:3274:2: ( RULE_BOOL )
            // InternalGame.g:3275:3: RULE_BOOL
            {
             before(grammarAccess.getPersonneAccess().getVisibleBOOLTerminalRuleCall_4_0()); 
            match(input,RULE_BOOL,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getVisibleBOOLTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__VisibleAssignment_4"


    // $ANTLR start "rule__Personne__ActifAssignment_6"
    // InternalGame.g:3284:1: rule__Personne__ActifAssignment_6 : ( RULE_BOOL ) ;
    public final void rule__Personne__ActifAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3288:1: ( ( RULE_BOOL ) )
            // InternalGame.g:3289:2: ( RULE_BOOL )
            {
            // InternalGame.g:3289:2: ( RULE_BOOL )
            // InternalGame.g:3290:3: RULE_BOOL
            {
             before(grammarAccess.getPersonneAccess().getActifBOOLTerminalRuleCall_6_0()); 
            match(input,RULE_BOOL,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getActifBOOLTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__ActifAssignment_6"


    // $ANTLR start "rule__Personne__ObligatoireAssignment_8"
    // InternalGame.g:3299:1: rule__Personne__ObligatoireAssignment_8 : ( RULE_BOOL ) ;
    public final void rule__Personne__ObligatoireAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3303:1: ( ( RULE_BOOL ) )
            // InternalGame.g:3304:2: ( RULE_BOOL )
            {
            // InternalGame.g:3304:2: ( RULE_BOOL )
            // InternalGame.g:3305:3: RULE_BOOL
            {
             before(grammarAccess.getPersonneAccess().getObligatoireBOOLTerminalRuleCall_8_0()); 
            match(input,RULE_BOOL,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getObligatoireBOOLTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__ObligatoireAssignment_8"


    // $ANTLR start "rule__Personne__InteractionsAssignment_10"
    // InternalGame.g:3314:1: rule__Personne__InteractionsAssignment_10 : ( ruleInteraction ) ;
    public final void rule__Personne__InteractionsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3318:1: ( ( ruleInteraction ) )
            // InternalGame.g:3319:2: ( ruleInteraction )
            {
            // InternalGame.g:3319:2: ( ruleInteraction )
            // InternalGame.g:3320:3: ruleInteraction
            {
             before(grammarAccess.getPersonneAccess().getInteractionsInteractionParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleInteraction();

            state._fsp--;

             after(grammarAccess.getPersonneAccess().getInteractionsInteractionParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__InteractionsAssignment_10"


    // $ANTLR start "rule__Explorateur__PlaceAssignment_3"
    // InternalGame.g:3329:1: rule__Explorateur__PlaceAssignment_3 : ( rulePlace ) ;
    public final void rule__Explorateur__PlaceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3333:1: ( ( rulePlace ) )
            // InternalGame.g:3334:2: ( rulePlace )
            {
            // InternalGame.g:3334:2: ( rulePlace )
            // InternalGame.g:3335:3: rulePlace
            {
             before(grammarAccess.getExplorateurAccess().getPlacePlaceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePlace();

            state._fsp--;

             after(grammarAccess.getExplorateurAccess().getPlacePlaceParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalGame.g:3344:1: rule__Explorateur__TailleDispoAssignment_6 : ( RULE_INT ) ;
    public final void rule__Explorateur__TailleDispoAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3348:1: ( ( RULE_INT ) )
            // InternalGame.g:3349:2: ( RULE_INT )
            {
            // InternalGame.g:3349:2: ( RULE_INT )
            // InternalGame.g:3350:3: RULE_INT
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


    // $ANTLR start "rule__Explorateur__ObjetsAssignment_9"
    // InternalGame.g:3359:1: rule__Explorateur__ObjetsAssignment_9 : ( ruleObjet ) ;
    public final void rule__Explorateur__ObjetsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3363:1: ( ( ruleObjet ) )
            // InternalGame.g:3364:2: ( ruleObjet )
            {
            // InternalGame.g:3364:2: ( ruleObjet )
            // InternalGame.g:3365:3: ruleObjet
            {
             before(grammarAccess.getExplorateurAccess().getObjetsObjetParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleObjet();

            state._fsp--;

             after(grammarAccess.getExplorateurAccess().getObjetsObjetParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__ObjetsAssignment_9"


    // $ANTLR start "rule__Explorateur__ConnaissancesAssignment_12"
    // InternalGame.g:3374:1: rule__Explorateur__ConnaissancesAssignment_12 : ( ruleConnaissance ) ;
    public final void rule__Explorateur__ConnaissancesAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3378:1: ( ( ruleConnaissance ) )
            // InternalGame.g:3379:2: ( ruleConnaissance )
            {
            // InternalGame.g:3379:2: ( ruleConnaissance )
            // InternalGame.g:3380:3: ruleConnaissance
            {
             before(grammarAccess.getExplorateurAccess().getConnaissancesConnaissanceParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleConnaissance();

            state._fsp--;

             after(grammarAccess.getExplorateurAccess().getConnaissancesConnaissanceParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__ConnaissancesAssignment_12"


    // $ANTLR start "rule__Connaissance__VisibleAssignment_3"
    // InternalGame.g:3389:1: rule__Connaissance__VisibleAssignment_3 : ( RULE_BOOL ) ;
    public final void rule__Connaissance__VisibleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3393:1: ( ( RULE_BOOL ) )
            // InternalGame.g:3394:2: ( RULE_BOOL )
            {
            // InternalGame.g:3394:2: ( RULE_BOOL )
            // InternalGame.g:3395:3: RULE_BOOL
            {
             before(grammarAccess.getConnaissanceAccess().getVisibleBOOLTerminalRuleCall_3_0()); 
            match(input,RULE_BOOL,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getVisibleBOOLTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__VisibleAssignment_3"


    // $ANTLR start "rule__Connaissance__ActifAssignment_5"
    // InternalGame.g:3404:1: rule__Connaissance__ActifAssignment_5 : ( RULE_BOOL ) ;
    public final void rule__Connaissance__ActifAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3408:1: ( ( RULE_BOOL ) )
            // InternalGame.g:3409:2: ( RULE_BOOL )
            {
            // InternalGame.g:3409:2: ( RULE_BOOL )
            // InternalGame.g:3410:3: RULE_BOOL
            {
             before(grammarAccess.getConnaissanceAccess().getActifBOOLTerminalRuleCall_5_0()); 
            match(input,RULE_BOOL,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getActifBOOLTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__ActifAssignment_5"


    // $ANTLR start "rule__Objet__VisibleAssignment_3"
    // InternalGame.g:3419:1: rule__Objet__VisibleAssignment_3 : ( RULE_BOOL ) ;
    public final void rule__Objet__VisibleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3423:1: ( ( RULE_BOOL ) )
            // InternalGame.g:3424:2: ( RULE_BOOL )
            {
            // InternalGame.g:3424:2: ( RULE_BOOL )
            // InternalGame.g:3425:3: RULE_BOOL
            {
             before(grammarAccess.getObjetAccess().getVisibleBOOLTerminalRuleCall_3_0()); 
            match(input,RULE_BOOL,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getVisibleBOOLTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__VisibleAssignment_3"


    // $ANTLR start "rule__Objet__ActifAssignment_5"
    // InternalGame.g:3434:1: rule__Objet__ActifAssignment_5 : ( RULE_BOOL ) ;
    public final void rule__Objet__ActifAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3438:1: ( ( RULE_BOOL ) )
            // InternalGame.g:3439:2: ( RULE_BOOL )
            {
            // InternalGame.g:3439:2: ( RULE_BOOL )
            // InternalGame.g:3440:3: RULE_BOOL
            {
             before(grammarAccess.getObjetAccess().getActifBOOLTerminalRuleCall_5_0()); 
            match(input,RULE_BOOL,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getActifBOOLTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__ActifAssignment_5"


    // $ANTLR start "rule__Objet__QteAssignment_7"
    // InternalGame.g:3449:1: rule__Objet__QteAssignment_7 : ( RULE_INT ) ;
    public final void rule__Objet__QteAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3453:1: ( ( RULE_INT ) )
            // InternalGame.g:3454:2: ( RULE_INT )
            {
            // InternalGame.g:3454:2: ( RULE_INT )
            // InternalGame.g:3455:3: RULE_INT
            {
             before(grammarAccess.getObjetAccess().getQteINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getQteINTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__QteAssignment_7"


    // $ANTLR start "rule__Objet__TailleAssignment_9"
    // InternalGame.g:3464:1: rule__Objet__TailleAssignment_9 : ( RULE_INT ) ;
    public final void rule__Objet__TailleAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3468:1: ( ( RULE_INT ) )
            // InternalGame.g:3469:2: ( RULE_INT )
            {
            // InternalGame.g:3469:2: ( RULE_INT )
            // InternalGame.g:3470:3: RULE_INT
            {
             before(grammarAccess.getObjetAccess().getTailleINTTerminalRuleCall_9_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getTailleINTTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__TailleAssignment_9"


    // $ANTLR start "rule__Objet__TransformableAssignment_11"
    // InternalGame.g:3479:1: rule__Objet__TransformableAssignment_11 : ( RULE_BOOL ) ;
    public final void rule__Objet__TransformableAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3483:1: ( ( RULE_BOOL ) )
            // InternalGame.g:3484:2: ( RULE_BOOL )
            {
            // InternalGame.g:3484:2: ( RULE_BOOL )
            // InternalGame.g:3485:3: RULE_BOOL
            {
             before(grammarAccess.getObjetAccess().getTransformableBOOLTerminalRuleCall_11_0()); 
            match(input,RULE_BOOL,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getTransformableBOOLTerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__TransformableAssignment_11"


    // $ANTLR start "rule__Interaction__QuestionAssignment_3"
    // InternalGame.g:3494:1: rule__Interaction__QuestionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Interaction__QuestionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3498:1: ( ( RULE_STRING ) )
            // InternalGame.g:3499:2: ( RULE_STRING )
            {
            // InternalGame.g:3499:2: ( RULE_STRING )
            // InternalGame.g:3500:3: RULE_STRING
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


    // $ANTLR start "rule__Interaction__ChoixAssignment_5"
    // InternalGame.g:3509:1: rule__Interaction__ChoixAssignment_5 : ( ruleChoix ) ;
    public final void rule__Interaction__ChoixAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3513:1: ( ( ruleChoix ) )
            // InternalGame.g:3514:2: ( ruleChoix )
            {
            // InternalGame.g:3514:2: ( ruleChoix )
            // InternalGame.g:3515:3: ruleChoix
            {
             before(grammarAccess.getInteractionAccess().getChoixChoixParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleChoix();

            state._fsp--;

             after(grammarAccess.getInteractionAccess().getChoixChoixParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__ChoixAssignment_5"


    // $ANTLR start "rule__Choix__NumeroAssignment_1"
    // InternalGame.g:3524:1: rule__Choix__NumeroAssignment_1 : ( RULE_INT ) ;
    public final void rule__Choix__NumeroAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3528:1: ( ( RULE_INT ) )
            // InternalGame.g:3529:2: ( RULE_INT )
            {
            // InternalGame.g:3529:2: ( RULE_INT )
            // InternalGame.g:3530:3: RULE_INT
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
    // InternalGame.g:3539:1: rule__Choix__ReponseAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Choix__ReponseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3543:1: ( ( RULE_STRING ) )
            // InternalGame.g:3544:2: ( RULE_STRING )
            {
            // InternalGame.g:3544:2: ( RULE_STRING )
            // InternalGame.g:3545:3: RULE_STRING
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


    // $ANTLR start "rule__Choix__RecompenseAssignment_6"
    // InternalGame.g:3554:1: rule__Choix__RecompenseAssignment_6 : ( ruleRecompense ) ;
    public final void rule__Choix__RecompenseAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3558:1: ( ( ruleRecompense ) )
            // InternalGame.g:3559:2: ( ruleRecompense )
            {
            // InternalGame.g:3559:2: ( ruleRecompense )
            // InternalGame.g:3560:3: ruleRecompense
            {
             before(grammarAccess.getChoixAccess().getRecompenseRecompenseParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleRecompense();

            state._fsp--;

             after(grammarAccess.getChoixAccess().getRecompenseRecompenseParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__RecompenseAssignment_6"


    // $ANTLR start "rule__Recompense__AvantageAssignment_3"
    // InternalGame.g:3569:1: rule__Recompense__AvantageAssignment_3 : ( ruleAvantage ) ;
    public final void rule__Recompense__AvantageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3573:1: ( ( ruleAvantage ) )
            // InternalGame.g:3574:2: ( ruleAvantage )
            {
            // InternalGame.g:3574:2: ( ruleAvantage )
            // InternalGame.g:3575:3: ruleAvantage
            {
             before(grammarAccess.getRecompenseAccess().getAvantageAvantageParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAvantage();

            state._fsp--;

             after(grammarAccess.getRecompenseAccess().getAvantageAvantageParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recompense__AvantageAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000060082A0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000006008280002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000006008280000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000020000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000006000020000L});

}