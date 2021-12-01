package game.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import game.services.GameGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGameParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_BOOL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'jeu'", "'{'", "'}'", "'territoire'", "'lieu'", "':'", "'chemin'", "'de'", "'vers'", "'visible'", "'obligatoire'", "'ouvert'", "'personne'", "'actif'", "'interactions'", "'explorateur'", "'localisation'", "'taille'", "'disponible'", "'objets'", "'possedes'", "'connaissances'", "'connaissance'", "'objet'", "'quantite'", "'transformable'", "'interaction'", "'question'", "'choix'", "'reponse'", "'recompense'", "'avantage'", "'depart'", "'fin'", "'intermediaire'"
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

        public InternalGameParser(TokenStream input, GameGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Jeu";
       	}

       	@Override
       	protected GameGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleJeu"
    // InternalGame.g:65:1: entryRuleJeu returns [EObject current=null] : iv_ruleJeu= ruleJeu EOF ;
    public final EObject entryRuleJeu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJeu = null;


        try {
            // InternalGame.g:65:44: (iv_ruleJeu= ruleJeu EOF )
            // InternalGame.g:66:2: iv_ruleJeu= ruleJeu EOF
            {
             newCompositeNode(grammarAccess.getJeuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJeu=ruleJeu();

            state._fsp--;

             current =iv_ruleJeu; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJeu"


    // $ANTLR start "ruleJeu"
    // InternalGame.g:72:1: ruleJeu returns [EObject current=null] : (otherlv_0= 'jeu' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_territoire_3_0= ruleTerritoire ) ) ( (lv_explorateur_4_0= ruleExplorateur ) ) ( (lv_elementsjeu_5_0= ruleElementsJeu ) )* otherlv_6= '}' ) ;
    public final EObject ruleJeu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nom_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_territoire_3_0 = null;

        EObject lv_explorateur_4_0 = null;

        EObject lv_elementsjeu_5_0 = null;



        	enterRule();

        try {
            // InternalGame.g:78:2: ( (otherlv_0= 'jeu' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_territoire_3_0= ruleTerritoire ) ) ( (lv_explorateur_4_0= ruleExplorateur ) ) ( (lv_elementsjeu_5_0= ruleElementsJeu ) )* otherlv_6= '}' ) )
            // InternalGame.g:79:2: (otherlv_0= 'jeu' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_territoire_3_0= ruleTerritoire ) ) ( (lv_explorateur_4_0= ruleExplorateur ) ) ( (lv_elementsjeu_5_0= ruleElementsJeu ) )* otherlv_6= '}' )
            {
            // InternalGame.g:79:2: (otherlv_0= 'jeu' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_territoire_3_0= ruleTerritoire ) ) ( (lv_explorateur_4_0= ruleExplorateur ) ) ( (lv_elementsjeu_5_0= ruleElementsJeu ) )* otherlv_6= '}' )
            // InternalGame.g:80:3: otherlv_0= 'jeu' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_territoire_3_0= ruleTerritoire ) ) ( (lv_explorateur_4_0= ruleExplorateur ) ) ( (lv_elementsjeu_5_0= ruleElementsJeu ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJeuAccess().getJeuKeyword_0());
            		
            // InternalGame.g:84:3: ( (lv_nom_1_0= RULE_ID ) )
            // InternalGame.g:85:4: (lv_nom_1_0= RULE_ID )
            {
            // InternalGame.g:85:4: (lv_nom_1_0= RULE_ID )
            // InternalGame.g:86:5: lv_nom_1_0= RULE_ID
            {
            lv_nom_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_nom_1_0, grammarAccess.getJeuAccess().getNomIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJeuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nom",
            						lv_nom_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:106:3: ( (lv_territoire_3_0= ruleTerritoire ) )
            // InternalGame.g:107:4: (lv_territoire_3_0= ruleTerritoire )
            {
            // InternalGame.g:107:4: (lv_territoire_3_0= ruleTerritoire )
            // InternalGame.g:108:5: lv_territoire_3_0= ruleTerritoire
            {

            					newCompositeNode(grammarAccess.getJeuAccess().getTerritoireTerritoireParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_territoire_3_0=ruleTerritoire();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJeuRule());
            					}
            					set(
            						current,
            						"territoire",
            						lv_territoire_3_0,
            						"game.Game.Territoire");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:125:3: ( (lv_explorateur_4_0= ruleExplorateur ) )
            // InternalGame.g:126:4: (lv_explorateur_4_0= ruleExplorateur )
            {
            // InternalGame.g:126:4: (lv_explorateur_4_0= ruleExplorateur )
            // InternalGame.g:127:5: lv_explorateur_4_0= ruleExplorateur
            {

            					newCompositeNode(grammarAccess.getJeuAccess().getExplorateurExplorateurParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_explorateur_4_0=ruleExplorateur();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJeuRule());
            					}
            					set(
            						current,
            						"explorateur",
            						lv_explorateur_4_0,
            						"game.Game.Explorateur");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:144:3: ( (lv_elementsjeu_5_0= ruleElementsJeu ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16||LA1_0==18||LA1_0==24||(LA1_0>=34 && LA1_0<=35)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGame.g:145:4: (lv_elementsjeu_5_0= ruleElementsJeu )
            	    {
            	    // InternalGame.g:145:4: (lv_elementsjeu_5_0= ruleElementsJeu )
            	    // InternalGame.g:146:5: lv_elementsjeu_5_0= ruleElementsJeu
            	    {

            	    					newCompositeNode(grammarAccess.getJeuAccess().getElementsjeuElementsJeuParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_elementsjeu_5_0=ruleElementsJeu();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJeuRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elementsjeu",
            	    						lv_elementsjeu_5_0,
            	    						"game.Game.ElementsJeu");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJeu"


    // $ANTLR start "entryRuleElementsJeu"
    // InternalGame.g:171:1: entryRuleElementsJeu returns [EObject current=null] : iv_ruleElementsJeu= ruleElementsJeu EOF ;
    public final EObject entryRuleElementsJeu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementsJeu = null;


        try {
            // InternalGame.g:171:52: (iv_ruleElementsJeu= ruleElementsJeu EOF )
            // InternalGame.g:172:2: iv_ruleElementsJeu= ruleElementsJeu EOF
            {
             newCompositeNode(grammarAccess.getElementsJeuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementsJeu=ruleElementsJeu();

            state._fsp--;

             current =iv_ruleElementsJeu; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementsJeu"


    // $ANTLR start "ruleElementsJeu"
    // InternalGame.g:178:1: ruleElementsJeu returns [EObject current=null] : (this_Personne_0= rulePersonne | this_Avantage_1= ruleAvantage | this_Place_2= rulePlace ) ;
    public final EObject ruleElementsJeu() throws RecognitionException {
        EObject current = null;

        EObject this_Personne_0 = null;

        EObject this_Avantage_1 = null;

        EObject this_Place_2 = null;



        	enterRule();

        try {
            // InternalGame.g:184:2: ( (this_Personne_0= rulePersonne | this_Avantage_1= ruleAvantage | this_Place_2= rulePlace ) )
            // InternalGame.g:185:2: (this_Personne_0= rulePersonne | this_Avantage_1= ruleAvantage | this_Place_2= rulePlace )
            {
            // InternalGame.g:185:2: (this_Personne_0= rulePersonne | this_Avantage_1= ruleAvantage | this_Place_2= rulePlace )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt2=1;
                }
                break;
            case 34:
            case 35:
                {
                alt2=2;
                }
                break;
            case 16:
            case 18:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGame.g:186:3: this_Personne_0= rulePersonne
                    {

                    			newCompositeNode(grammarAccess.getElementsJeuAccess().getPersonneParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Personne_0=rulePersonne();

                    state._fsp--;


                    			current = this_Personne_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGame.g:195:3: this_Avantage_1= ruleAvantage
                    {

                    			newCompositeNode(grammarAccess.getElementsJeuAccess().getAvantageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Avantage_1=ruleAvantage();

                    state._fsp--;


                    			current = this_Avantage_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGame.g:204:3: this_Place_2= rulePlace
                    {

                    			newCompositeNode(grammarAccess.getElementsJeuAccess().getPlaceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Place_2=rulePlace();

                    state._fsp--;


                    			current = this_Place_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementsJeu"


    // $ANTLR start "entryRulePlace"
    // InternalGame.g:216:1: entryRulePlace returns [EObject current=null] : iv_rulePlace= rulePlace EOF ;
    public final EObject entryRulePlace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlace = null;


        try {
            // InternalGame.g:216:46: (iv_rulePlace= rulePlace EOF )
            // InternalGame.g:217:2: iv_rulePlace= rulePlace EOF
            {
             newCompositeNode(grammarAccess.getPlaceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlace=rulePlace();

            state._fsp--;

             current =iv_rulePlace; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlace"


    // $ANTLR start "rulePlace"
    // InternalGame.g:223:1: rulePlace returns [EObject current=null] : (this_Lieu_0= ruleLieu | this_Chemin_1= ruleChemin ) ;
    public final EObject rulePlace() throws RecognitionException {
        EObject current = null;

        EObject this_Lieu_0 = null;

        EObject this_Chemin_1 = null;



        	enterRule();

        try {
            // InternalGame.g:229:2: ( (this_Lieu_0= ruleLieu | this_Chemin_1= ruleChemin ) )
            // InternalGame.g:230:2: (this_Lieu_0= ruleLieu | this_Chemin_1= ruleChemin )
            {
            // InternalGame.g:230:2: (this_Lieu_0= ruleLieu | this_Chemin_1= ruleChemin )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGame.g:231:3: this_Lieu_0= ruleLieu
                    {

                    			newCompositeNode(grammarAccess.getPlaceAccess().getLieuParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Lieu_0=ruleLieu();

                    state._fsp--;


                    			current = this_Lieu_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGame.g:240:3: this_Chemin_1= ruleChemin
                    {

                    			newCompositeNode(grammarAccess.getPlaceAccess().getCheminParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Chemin_1=ruleChemin();

                    state._fsp--;


                    			current = this_Chemin_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlace"


    // $ANTLR start "entryRuleAvantage"
    // InternalGame.g:252:1: entryRuleAvantage returns [EObject current=null] : iv_ruleAvantage= ruleAvantage EOF ;
    public final EObject entryRuleAvantage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvantage = null;


        try {
            // InternalGame.g:252:49: (iv_ruleAvantage= ruleAvantage EOF )
            // InternalGame.g:253:2: iv_ruleAvantage= ruleAvantage EOF
            {
             newCompositeNode(grammarAccess.getAvantageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAvantage=ruleAvantage();

            state._fsp--;

             current =iv_ruleAvantage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAvantage"


    // $ANTLR start "ruleAvantage"
    // InternalGame.g:259:1: ruleAvantage returns [EObject current=null] : (this_Connaissance_0= ruleConnaissance | this_Objet_1= ruleObjet ) ;
    public final EObject ruleAvantage() throws RecognitionException {
        EObject current = null;

        EObject this_Connaissance_0 = null;

        EObject this_Objet_1 = null;



        	enterRule();

        try {
            // InternalGame.g:265:2: ( (this_Connaissance_0= ruleConnaissance | this_Objet_1= ruleObjet ) )
            // InternalGame.g:266:2: (this_Connaissance_0= ruleConnaissance | this_Objet_1= ruleObjet )
            {
            // InternalGame.g:266:2: (this_Connaissance_0= ruleConnaissance | this_Objet_1= ruleObjet )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==34) ) {
                alt4=1;
            }
            else if ( (LA4_0==35) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGame.g:267:3: this_Connaissance_0= ruleConnaissance
                    {

                    			newCompositeNode(grammarAccess.getAvantageAccess().getConnaissanceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Connaissance_0=ruleConnaissance();

                    state._fsp--;


                    			current = this_Connaissance_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGame.g:276:3: this_Objet_1= ruleObjet
                    {

                    			newCompositeNode(grammarAccess.getAvantageAccess().getObjetParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Objet_1=ruleObjet();

                    state._fsp--;


                    			current = this_Objet_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAvantage"


    // $ANTLR start "entryRuleTerritoire"
    // InternalGame.g:288:1: entryRuleTerritoire returns [EObject current=null] : iv_ruleTerritoire= ruleTerritoire EOF ;
    public final EObject entryRuleTerritoire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerritoire = null;


        try {
            // InternalGame.g:288:51: (iv_ruleTerritoire= ruleTerritoire EOF )
            // InternalGame.g:289:2: iv_ruleTerritoire= ruleTerritoire EOF
            {
             newCompositeNode(grammarAccess.getTerritoireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerritoire=ruleTerritoire();

            state._fsp--;

             current =iv_ruleTerritoire; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerritoire"


    // $ANTLR start "ruleTerritoire"
    // InternalGame.g:295:1: ruleTerritoire returns [EObject current=null] : (otherlv_0= 'territoire' otherlv_1= '{' ( (lv_places_2_0= rulePlace ) )+ otherlv_3= '}' ) ;
    public final EObject ruleTerritoire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_places_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:301:2: ( (otherlv_0= 'territoire' otherlv_1= '{' ( (lv_places_2_0= rulePlace ) )+ otherlv_3= '}' ) )
            // InternalGame.g:302:2: (otherlv_0= 'territoire' otherlv_1= '{' ( (lv_places_2_0= rulePlace ) )+ otherlv_3= '}' )
            {
            // InternalGame.g:302:2: (otherlv_0= 'territoire' otherlv_1= '{' ( (lv_places_2_0= rulePlace ) )+ otherlv_3= '}' )
            // InternalGame.g:303:3: otherlv_0= 'territoire' otherlv_1= '{' ( (lv_places_2_0= rulePlace ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTerritoireAccess().getTerritoireKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getTerritoireAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:311:3: ( (lv_places_2_0= rulePlace ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16||LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGame.g:312:4: (lv_places_2_0= rulePlace )
            	    {
            	    // InternalGame.g:312:4: (lv_places_2_0= rulePlace )
            	    // InternalGame.g:313:5: lv_places_2_0= rulePlace
            	    {

            	    					newCompositeNode(grammarAccess.getTerritoireAccess().getPlacesPlaceParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_places_2_0=rulePlace();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTerritoireRule());
            	    					}
            	    					add(
            	    						current,
            	    						"places",
            	    						lv_places_2_0,
            	    						"game.Game.Place");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTerritoireAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerritoire"


    // $ANTLR start "entryRuleLieu"
    // InternalGame.g:338:1: entryRuleLieu returns [EObject current=null] : iv_ruleLieu= ruleLieu EOF ;
    public final EObject entryRuleLieu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLieu = null;


        try {
            // InternalGame.g:338:45: (iv_ruleLieu= ruleLieu EOF )
            // InternalGame.g:339:2: iv_ruleLieu= ruleLieu EOF
            {
             newCompositeNode(grammarAccess.getLieuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLieu=ruleLieu();

            state._fsp--;

             current =iv_ruleLieu; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLieu"


    // $ANTLR start "ruleLieu"
    // InternalGame.g:345:1: ruleLieu returns [EObject current=null] : (otherlv_0= 'lieu' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_nature_3_0= ruleNature ) ) ) ;
    public final EObject ruleLieu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nom_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_nature_3_0 = null;



        	enterRule();

        try {
            // InternalGame.g:351:2: ( (otherlv_0= 'lieu' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_nature_3_0= ruleNature ) ) ) )
            // InternalGame.g:352:2: (otherlv_0= 'lieu' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_nature_3_0= ruleNature ) ) )
            {
            // InternalGame.g:352:2: (otherlv_0= 'lieu' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_nature_3_0= ruleNature ) ) )
            // InternalGame.g:353:3: otherlv_0= 'lieu' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_nature_3_0= ruleNature ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLieuAccess().getLieuKeyword_0());
            		
            // InternalGame.g:357:3: ( (lv_nom_1_0= RULE_ID ) )
            // InternalGame.g:358:4: (lv_nom_1_0= RULE_ID )
            {
            // InternalGame.g:358:4: (lv_nom_1_0= RULE_ID )
            // InternalGame.g:359:5: lv_nom_1_0= RULE_ID
            {
            lv_nom_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_nom_1_0, grammarAccess.getLieuAccess().getNomIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLieuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nom",
            						lv_nom_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getLieuAccess().getColonKeyword_2());
            		
            // InternalGame.g:379:3: ( (lv_nature_3_0= ruleNature ) )
            // InternalGame.g:380:4: (lv_nature_3_0= ruleNature )
            {
            // InternalGame.g:380:4: (lv_nature_3_0= ruleNature )
            // InternalGame.g:381:5: lv_nature_3_0= ruleNature
            {

            					newCompositeNode(grammarAccess.getLieuAccess().getNatureNatureEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_nature_3_0=ruleNature();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLieuRule());
            					}
            					set(
            						current,
            						"nature",
            						lv_nature_3_0,
            						"game.Game.Nature");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLieu"


    // $ANTLR start "entryRuleChemin"
    // InternalGame.g:402:1: entryRuleChemin returns [EObject current=null] : iv_ruleChemin= ruleChemin EOF ;
    public final EObject entryRuleChemin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChemin = null;


        try {
            // InternalGame.g:402:47: (iv_ruleChemin= ruleChemin EOF )
            // InternalGame.g:403:2: iv_ruleChemin= ruleChemin EOF
            {
             newCompositeNode(grammarAccess.getCheminRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChemin=ruleChemin();

            state._fsp--;

             current =iv_ruleChemin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChemin"


    // $ANTLR start "ruleChemin"
    // InternalGame.g:409:1: ruleChemin returns [EObject current=null] : (otherlv_0= 'chemin' otherlv_1= '{' otherlv_2= 'de' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'vers' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'visible' ( (lv_visible_7_0= RULE_BOOL ) ) otherlv_8= 'obligatoire' ( (lv_obligatoire_9_0= RULE_BOOL ) ) otherlv_10= 'ouvert' ( (lv_ouvert_11_0= RULE_BOOL ) ) otherlv_12= '}' ) ;
    public final EObject ruleChemin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_visible_7_0=null;
        Token otherlv_8=null;
        Token lv_obligatoire_9_0=null;
        Token otherlv_10=null;
        Token lv_ouvert_11_0=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalGame.g:415:2: ( (otherlv_0= 'chemin' otherlv_1= '{' otherlv_2= 'de' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'vers' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'visible' ( (lv_visible_7_0= RULE_BOOL ) ) otherlv_8= 'obligatoire' ( (lv_obligatoire_9_0= RULE_BOOL ) ) otherlv_10= 'ouvert' ( (lv_ouvert_11_0= RULE_BOOL ) ) otherlv_12= '}' ) )
            // InternalGame.g:416:2: (otherlv_0= 'chemin' otherlv_1= '{' otherlv_2= 'de' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'vers' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'visible' ( (lv_visible_7_0= RULE_BOOL ) ) otherlv_8= 'obligatoire' ( (lv_obligatoire_9_0= RULE_BOOL ) ) otherlv_10= 'ouvert' ( (lv_ouvert_11_0= RULE_BOOL ) ) otherlv_12= '}' )
            {
            // InternalGame.g:416:2: (otherlv_0= 'chemin' otherlv_1= '{' otherlv_2= 'de' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'vers' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'visible' ( (lv_visible_7_0= RULE_BOOL ) ) otherlv_8= 'obligatoire' ( (lv_obligatoire_9_0= RULE_BOOL ) ) otherlv_10= 'ouvert' ( (lv_ouvert_11_0= RULE_BOOL ) ) otherlv_12= '}' )
            // InternalGame.g:417:3: otherlv_0= 'chemin' otherlv_1= '{' otherlv_2= 'de' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'vers' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'visible' ( (lv_visible_7_0= RULE_BOOL ) ) otherlv_8= 'obligatoire' ( (lv_obligatoire_9_0= RULE_BOOL ) ) otherlv_10= 'ouvert' ( (lv_ouvert_11_0= RULE_BOOL ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCheminAccess().getCheminKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getCheminAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCheminAccess().getDeKeyword_2());
            		
            // InternalGame.g:429:3: ( (otherlv_3= RULE_ID ) )
            // InternalGame.g:430:4: (otherlv_3= RULE_ID )
            {
            // InternalGame.g:430:4: (otherlv_3= RULE_ID )
            // InternalGame.g:431:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getCheminAccess().getPredLieuCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getCheminAccess().getVersKeyword_4());
            		
            // InternalGame.g:446:3: ( (otherlv_5= RULE_ID ) )
            // InternalGame.g:447:4: (otherlv_5= RULE_ID )
            {
            // InternalGame.g:447:4: (otherlv_5= RULE_ID )
            // InternalGame.g:448:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_5, grammarAccess.getCheminAccess().getSuccLieuCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getCheminAccess().getVisibleKeyword_6());
            		
            // InternalGame.g:463:3: ( (lv_visible_7_0= RULE_BOOL ) )
            // InternalGame.g:464:4: (lv_visible_7_0= RULE_BOOL )
            {
            // InternalGame.g:464:4: (lv_visible_7_0= RULE_BOOL )
            // InternalGame.g:465:5: lv_visible_7_0= RULE_BOOL
            {
            lv_visible_7_0=(Token)match(input,RULE_BOOL,FOLLOW_15); 

            					newLeafNode(lv_visible_7_0, grammarAccess.getCheminAccess().getVisibleBOOLTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            					setWithLastConsumed(
            						current,
            						"visible",
            						lv_visible_7_0,
            						"game.Game.BOOL");
            				

            }


            }

            otherlv_8=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getCheminAccess().getObligatoireKeyword_8());
            		
            // InternalGame.g:485:3: ( (lv_obligatoire_9_0= RULE_BOOL ) )
            // InternalGame.g:486:4: (lv_obligatoire_9_0= RULE_BOOL )
            {
            // InternalGame.g:486:4: (lv_obligatoire_9_0= RULE_BOOL )
            // InternalGame.g:487:5: lv_obligatoire_9_0= RULE_BOOL
            {
            lv_obligatoire_9_0=(Token)match(input,RULE_BOOL,FOLLOW_16); 

            					newLeafNode(lv_obligatoire_9_0, grammarAccess.getCheminAccess().getObligatoireBOOLTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            					setWithLastConsumed(
            						current,
            						"obligatoire",
            						lv_obligatoire_9_0,
            						"game.Game.BOOL");
            				

            }


            }

            otherlv_10=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_10, grammarAccess.getCheminAccess().getOuvertKeyword_10());
            		
            // InternalGame.g:507:3: ( (lv_ouvert_11_0= RULE_BOOL ) )
            // InternalGame.g:508:4: (lv_ouvert_11_0= RULE_BOOL )
            {
            // InternalGame.g:508:4: (lv_ouvert_11_0= RULE_BOOL )
            // InternalGame.g:509:5: lv_ouvert_11_0= RULE_BOOL
            {
            lv_ouvert_11_0=(Token)match(input,RULE_BOOL,FOLLOW_17); 

            					newLeafNode(lv_ouvert_11_0, grammarAccess.getCheminAccess().getOuvertBOOLTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ouvert",
            						lv_ouvert_11_0,
            						"game.Game.BOOL");
            				

            }


            }

            otherlv_12=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getCheminAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChemin"


    // $ANTLR start "entryRulePersonne"
    // InternalGame.g:533:1: entryRulePersonne returns [EObject current=null] : iv_rulePersonne= rulePersonne EOF ;
    public final EObject entryRulePersonne() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonne = null;


        try {
            // InternalGame.g:533:49: (iv_rulePersonne= rulePersonne EOF )
            // InternalGame.g:534:2: iv_rulePersonne= rulePersonne EOF
            {
             newCompositeNode(grammarAccess.getPersonneRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePersonne=rulePersonne();

            state._fsp--;

             current =iv_rulePersonne; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePersonne"


    // $ANTLR start "rulePersonne"
    // InternalGame.g:540:1: rulePersonne returns [EObject current=null] : (otherlv_0= 'personne' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visible' ( (lv_visible_4_0= RULE_BOOL ) ) otherlv_5= 'actif' ( (lv_actif_6_0= RULE_BOOL ) ) otherlv_7= 'obligatoire' ( (lv_obligatoire_8_0= RULE_BOOL ) ) otherlv_9= 'interactions' ( (lv_interactions_10_0= ruleInteraction ) )* otherlv_11= '}' ) ;
    public final EObject rulePersonne() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nom_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_visible_4_0=null;
        Token otherlv_5=null;
        Token lv_actif_6_0=null;
        Token otherlv_7=null;
        Token lv_obligatoire_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_interactions_10_0 = null;



        	enterRule();

        try {
            // InternalGame.g:546:2: ( (otherlv_0= 'personne' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visible' ( (lv_visible_4_0= RULE_BOOL ) ) otherlv_5= 'actif' ( (lv_actif_6_0= RULE_BOOL ) ) otherlv_7= 'obligatoire' ( (lv_obligatoire_8_0= RULE_BOOL ) ) otherlv_9= 'interactions' ( (lv_interactions_10_0= ruleInteraction ) )* otherlv_11= '}' ) )
            // InternalGame.g:547:2: (otherlv_0= 'personne' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visible' ( (lv_visible_4_0= RULE_BOOL ) ) otherlv_5= 'actif' ( (lv_actif_6_0= RULE_BOOL ) ) otherlv_7= 'obligatoire' ( (lv_obligatoire_8_0= RULE_BOOL ) ) otherlv_9= 'interactions' ( (lv_interactions_10_0= ruleInteraction ) )* otherlv_11= '}' )
            {
            // InternalGame.g:547:2: (otherlv_0= 'personne' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visible' ( (lv_visible_4_0= RULE_BOOL ) ) otherlv_5= 'actif' ( (lv_actif_6_0= RULE_BOOL ) ) otherlv_7= 'obligatoire' ( (lv_obligatoire_8_0= RULE_BOOL ) ) otherlv_9= 'interactions' ( (lv_interactions_10_0= ruleInteraction ) )* otherlv_11= '}' )
            // InternalGame.g:548:3: otherlv_0= 'personne' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visible' ( (lv_visible_4_0= RULE_BOOL ) ) otherlv_5= 'actif' ( (lv_actif_6_0= RULE_BOOL ) ) otherlv_7= 'obligatoire' ( (lv_obligatoire_8_0= RULE_BOOL ) ) otherlv_9= 'interactions' ( (lv_interactions_10_0= ruleInteraction ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonneAccess().getPersonneKeyword_0());
            		
            // InternalGame.g:552:3: ( (lv_nom_1_0= RULE_ID ) )
            // InternalGame.g:553:4: (lv_nom_1_0= RULE_ID )
            {
            // InternalGame.g:553:4: (lv_nom_1_0= RULE_ID )
            // InternalGame.g:554:5: lv_nom_1_0= RULE_ID
            {
            lv_nom_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_nom_1_0, grammarAccess.getPersonneAccess().getNomIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nom",
            						lv_nom_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonneAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getPersonneAccess().getVisibleKeyword_3());
            		
            // InternalGame.g:578:3: ( (lv_visible_4_0= RULE_BOOL ) )
            // InternalGame.g:579:4: (lv_visible_4_0= RULE_BOOL )
            {
            // InternalGame.g:579:4: (lv_visible_4_0= RULE_BOOL )
            // InternalGame.g:580:5: lv_visible_4_0= RULE_BOOL
            {
            lv_visible_4_0=(Token)match(input,RULE_BOOL,FOLLOW_18); 

            					newLeafNode(lv_visible_4_0, grammarAccess.getPersonneAccess().getVisibleBOOLTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"visible",
            						lv_visible_4_0,
            						"game.Game.BOOL");
            				

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getPersonneAccess().getActifKeyword_5());
            		
            // InternalGame.g:600:3: ( (lv_actif_6_0= RULE_BOOL ) )
            // InternalGame.g:601:4: (lv_actif_6_0= RULE_BOOL )
            {
            // InternalGame.g:601:4: (lv_actif_6_0= RULE_BOOL )
            // InternalGame.g:602:5: lv_actif_6_0= RULE_BOOL
            {
            lv_actif_6_0=(Token)match(input,RULE_BOOL,FOLLOW_15); 

            					newLeafNode(lv_actif_6_0, grammarAccess.getPersonneAccess().getActifBOOLTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"actif",
            						lv_actif_6_0,
            						"game.Game.BOOL");
            				

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getPersonneAccess().getObligatoireKeyword_7());
            		
            // InternalGame.g:622:3: ( (lv_obligatoire_8_0= RULE_BOOL ) )
            // InternalGame.g:623:4: (lv_obligatoire_8_0= RULE_BOOL )
            {
            // InternalGame.g:623:4: (lv_obligatoire_8_0= RULE_BOOL )
            // InternalGame.g:624:5: lv_obligatoire_8_0= RULE_BOOL
            {
            lv_obligatoire_8_0=(Token)match(input,RULE_BOOL,FOLLOW_19); 

            					newLeafNode(lv_obligatoire_8_0, grammarAccess.getPersonneAccess().getObligatoireBOOLTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"obligatoire",
            						lv_obligatoire_8_0,
            						"game.Game.BOOL");
            				

            }


            }

            otherlv_9=(Token)match(input,26,FOLLOW_20); 

            			newLeafNode(otherlv_9, grammarAccess.getPersonneAccess().getInteractionsKeyword_9());
            		
            // InternalGame.g:644:3: ( (lv_interactions_10_0= ruleInteraction ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==38) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGame.g:645:4: (lv_interactions_10_0= ruleInteraction )
            	    {
            	    // InternalGame.g:645:4: (lv_interactions_10_0= ruleInteraction )
            	    // InternalGame.g:646:5: lv_interactions_10_0= ruleInteraction
            	    {

            	    					newCompositeNode(grammarAccess.getPersonneAccess().getInteractionsInteractionParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_interactions_10_0=ruleInteraction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPersonneRule());
            	    					}
            	    					add(
            	    						current,
            	    						"interactions",
            	    						lv_interactions_10_0,
            	    						"game.Game.Interaction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePersonne"


    // $ANTLR start "entryRuleExplorateur"
    // InternalGame.g:671:1: entryRuleExplorateur returns [EObject current=null] : iv_ruleExplorateur= ruleExplorateur EOF ;
    public final EObject entryRuleExplorateur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplorateur = null;


        try {
            // InternalGame.g:671:52: (iv_ruleExplorateur= ruleExplorateur EOF )
            // InternalGame.g:672:2: iv_ruleExplorateur= ruleExplorateur EOF
            {
             newCompositeNode(grammarAccess.getExplorateurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExplorateur=ruleExplorateur();

            state._fsp--;

             current =iv_ruleExplorateur; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExplorateur"


    // $ANTLR start "ruleExplorateur"
    // InternalGame.g:678:1: ruleExplorateur returns [EObject current=null] : (otherlv_0= 'explorateur' otherlv_1= '{' otherlv_2= 'localisation' ( (lv_place_3_0= rulePlace ) ) otherlv_4= 'taille' otherlv_5= 'disponible' ( (lv_tailleDispo_6_0= RULE_INT ) ) otherlv_7= 'objets' otherlv_8= 'possedes' ( (lv_objets_9_0= ruleObjet ) )* otherlv_10= 'connaissances' otherlv_11= 'possedes' ( (lv_connaissances_12_0= ruleConnaissance ) )* otherlv_13= '}' ) ;
    public final EObject ruleExplorateur() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_tailleDispo_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_place_3_0 = null;

        EObject lv_objets_9_0 = null;

        EObject lv_connaissances_12_0 = null;



        	enterRule();

        try {
            // InternalGame.g:684:2: ( (otherlv_0= 'explorateur' otherlv_1= '{' otherlv_2= 'localisation' ( (lv_place_3_0= rulePlace ) ) otherlv_4= 'taille' otherlv_5= 'disponible' ( (lv_tailleDispo_6_0= RULE_INT ) ) otherlv_7= 'objets' otherlv_8= 'possedes' ( (lv_objets_9_0= ruleObjet ) )* otherlv_10= 'connaissances' otherlv_11= 'possedes' ( (lv_connaissances_12_0= ruleConnaissance ) )* otherlv_13= '}' ) )
            // InternalGame.g:685:2: (otherlv_0= 'explorateur' otherlv_1= '{' otherlv_2= 'localisation' ( (lv_place_3_0= rulePlace ) ) otherlv_4= 'taille' otherlv_5= 'disponible' ( (lv_tailleDispo_6_0= RULE_INT ) ) otherlv_7= 'objets' otherlv_8= 'possedes' ( (lv_objets_9_0= ruleObjet ) )* otherlv_10= 'connaissances' otherlv_11= 'possedes' ( (lv_connaissances_12_0= ruleConnaissance ) )* otherlv_13= '}' )
            {
            // InternalGame.g:685:2: (otherlv_0= 'explorateur' otherlv_1= '{' otherlv_2= 'localisation' ( (lv_place_3_0= rulePlace ) ) otherlv_4= 'taille' otherlv_5= 'disponible' ( (lv_tailleDispo_6_0= RULE_INT ) ) otherlv_7= 'objets' otherlv_8= 'possedes' ( (lv_objets_9_0= ruleObjet ) )* otherlv_10= 'connaissances' otherlv_11= 'possedes' ( (lv_connaissances_12_0= ruleConnaissance ) )* otherlv_13= '}' )
            // InternalGame.g:686:3: otherlv_0= 'explorateur' otherlv_1= '{' otherlv_2= 'localisation' ( (lv_place_3_0= rulePlace ) ) otherlv_4= 'taille' otherlv_5= 'disponible' ( (lv_tailleDispo_6_0= RULE_INT ) ) otherlv_7= 'objets' otherlv_8= 'possedes' ( (lv_objets_9_0= ruleObjet ) )* otherlv_10= 'connaissances' otherlv_11= 'possedes' ( (lv_connaissances_12_0= ruleConnaissance ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExplorateurAccess().getExplorateurKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getExplorateurAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getExplorateurAccess().getLocalisationKeyword_2());
            		
            // InternalGame.g:698:3: ( (lv_place_3_0= rulePlace ) )
            // InternalGame.g:699:4: (lv_place_3_0= rulePlace )
            {
            // InternalGame.g:699:4: (lv_place_3_0= rulePlace )
            // InternalGame.g:700:5: lv_place_3_0= rulePlace
            {

            					newCompositeNode(grammarAccess.getExplorateurAccess().getPlacePlaceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_place_3_0=rulePlace();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExplorateurRule());
            					}
            					set(
            						current,
            						"place",
            						lv_place_3_0,
            						"game.Game.Place");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getExplorateurAccess().getTailleKeyword_4());
            		
            otherlv_5=(Token)match(input,30,FOLLOW_24); 

            			newLeafNode(otherlv_5, grammarAccess.getExplorateurAccess().getDisponibleKeyword_5());
            		
            // InternalGame.g:725:3: ( (lv_tailleDispo_6_0= RULE_INT ) )
            // InternalGame.g:726:4: (lv_tailleDispo_6_0= RULE_INT )
            {
            // InternalGame.g:726:4: (lv_tailleDispo_6_0= RULE_INT )
            // InternalGame.g:727:5: lv_tailleDispo_6_0= RULE_INT
            {
            lv_tailleDispo_6_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            					newLeafNode(lv_tailleDispo_6_0, grammarAccess.getExplorateurAccess().getTailleDispoINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExplorateurRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tailleDispo",
            						lv_tailleDispo_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,31,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getExplorateurAccess().getObjetsKeyword_7());
            		
            otherlv_8=(Token)match(input,32,FOLLOW_27); 

            			newLeafNode(otherlv_8, grammarAccess.getExplorateurAccess().getPossedesKeyword_8());
            		
            // InternalGame.g:751:3: ( (lv_objets_9_0= ruleObjet ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==35) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGame.g:752:4: (lv_objets_9_0= ruleObjet )
            	    {
            	    // InternalGame.g:752:4: (lv_objets_9_0= ruleObjet )
            	    // InternalGame.g:753:5: lv_objets_9_0= ruleObjet
            	    {

            	    					newCompositeNode(grammarAccess.getExplorateurAccess().getObjetsObjetParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_objets_9_0=ruleObjet();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExplorateurRule());
            	    					}
            	    					set(
            	    						current,
            	    						"objets",
            	    						lv_objets_9_0,
            	    						"game.Game.Objet");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_10=(Token)match(input,33,FOLLOW_26); 

            			newLeafNode(otherlv_10, grammarAccess.getExplorateurAccess().getConnaissancesKeyword_10());
            		
            otherlv_11=(Token)match(input,32,FOLLOW_28); 

            			newLeafNode(otherlv_11, grammarAccess.getExplorateurAccess().getPossedesKeyword_11());
            		
            // InternalGame.g:778:3: ( (lv_connaissances_12_0= ruleConnaissance ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==34) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGame.g:779:4: (lv_connaissances_12_0= ruleConnaissance )
            	    {
            	    // InternalGame.g:779:4: (lv_connaissances_12_0= ruleConnaissance )
            	    // InternalGame.g:780:5: lv_connaissances_12_0= ruleConnaissance
            	    {

            	    					newCompositeNode(grammarAccess.getExplorateurAccess().getConnaissancesConnaissanceParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_connaissances_12_0=ruleConnaissance();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExplorateurRule());
            	    					}
            	    					set(
            	    						current,
            	    						"connaissances",
            	    						lv_connaissances_12_0,
            	    						"game.Game.Connaissance");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_13=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getExplorateurAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExplorateur"


    // $ANTLR start "entryRuleConnaissance"
    // InternalGame.g:805:1: entryRuleConnaissance returns [EObject current=null] : iv_ruleConnaissance= ruleConnaissance EOF ;
    public final EObject entryRuleConnaissance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnaissance = null;


        try {
            // InternalGame.g:805:53: (iv_ruleConnaissance= ruleConnaissance EOF )
            // InternalGame.g:806:2: iv_ruleConnaissance= ruleConnaissance EOF
            {
             newCompositeNode(grammarAccess.getConnaissanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnaissance=ruleConnaissance();

            state._fsp--;

             current =iv_ruleConnaissance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnaissance"


    // $ANTLR start "ruleConnaissance"
    // InternalGame.g:812:1: ruleConnaissance returns [EObject current=null] : (otherlv_0= 'connaissance' otherlv_1= '{' otherlv_2= 'visible' ( (lv_visible_3_0= RULE_BOOL ) ) otherlv_4= 'actif' ( (lv_actif_5_0= RULE_BOOL ) ) otherlv_6= '}' ) ;
    public final EObject ruleConnaissance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_visible_3_0=null;
        Token otherlv_4=null;
        Token lv_actif_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalGame.g:818:2: ( (otherlv_0= 'connaissance' otherlv_1= '{' otherlv_2= 'visible' ( (lv_visible_3_0= RULE_BOOL ) ) otherlv_4= 'actif' ( (lv_actif_5_0= RULE_BOOL ) ) otherlv_6= '}' ) )
            // InternalGame.g:819:2: (otherlv_0= 'connaissance' otherlv_1= '{' otherlv_2= 'visible' ( (lv_visible_3_0= RULE_BOOL ) ) otherlv_4= 'actif' ( (lv_actif_5_0= RULE_BOOL ) ) otherlv_6= '}' )
            {
            // InternalGame.g:819:2: (otherlv_0= 'connaissance' otherlv_1= '{' otherlv_2= 'visible' ( (lv_visible_3_0= RULE_BOOL ) ) otherlv_4= 'actif' ( (lv_actif_5_0= RULE_BOOL ) ) otherlv_6= '}' )
            // InternalGame.g:820:3: otherlv_0= 'connaissance' otherlv_1= '{' otherlv_2= 'visible' ( (lv_visible_3_0= RULE_BOOL ) ) otherlv_4= 'actif' ( (lv_actif_5_0= RULE_BOOL ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConnaissanceAccess().getConnaissanceKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getConnaissanceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getConnaissanceAccess().getVisibleKeyword_2());
            		
            // InternalGame.g:832:3: ( (lv_visible_3_0= RULE_BOOL ) )
            // InternalGame.g:833:4: (lv_visible_3_0= RULE_BOOL )
            {
            // InternalGame.g:833:4: (lv_visible_3_0= RULE_BOOL )
            // InternalGame.g:834:5: lv_visible_3_0= RULE_BOOL
            {
            lv_visible_3_0=(Token)match(input,RULE_BOOL,FOLLOW_18); 

            					newLeafNode(lv_visible_3_0, grammarAccess.getConnaissanceAccess().getVisibleBOOLTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnaissanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"visible",
            						lv_visible_3_0,
            						"game.Game.BOOL");
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getConnaissanceAccess().getActifKeyword_4());
            		
            // InternalGame.g:854:3: ( (lv_actif_5_0= RULE_BOOL ) )
            // InternalGame.g:855:4: (lv_actif_5_0= RULE_BOOL )
            {
            // InternalGame.g:855:4: (lv_actif_5_0= RULE_BOOL )
            // InternalGame.g:856:5: lv_actif_5_0= RULE_BOOL
            {
            lv_actif_5_0=(Token)match(input,RULE_BOOL,FOLLOW_17); 

            					newLeafNode(lv_actif_5_0, grammarAccess.getConnaissanceAccess().getActifBOOLTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnaissanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"actif",
            						lv_actif_5_0,
            						"game.Game.BOOL");
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getConnaissanceAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnaissance"


    // $ANTLR start "entryRuleObjet"
    // InternalGame.g:880:1: entryRuleObjet returns [EObject current=null] : iv_ruleObjet= ruleObjet EOF ;
    public final EObject entryRuleObjet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjet = null;


        try {
            // InternalGame.g:880:46: (iv_ruleObjet= ruleObjet EOF )
            // InternalGame.g:881:2: iv_ruleObjet= ruleObjet EOF
            {
             newCompositeNode(grammarAccess.getObjetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjet=ruleObjet();

            state._fsp--;

             current =iv_ruleObjet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjet"


    // $ANTLR start "ruleObjet"
    // InternalGame.g:887:1: ruleObjet returns [EObject current=null] : (otherlv_0= 'objet' otherlv_1= '{' otherlv_2= 'visible' ( (lv_visible_3_0= RULE_BOOL ) ) otherlv_4= 'actif' ( (lv_actif_5_0= RULE_BOOL ) ) otherlv_6= 'quantite' ( (lv_qte_7_0= RULE_INT ) ) otherlv_8= 'taille' ( (lv_taille_9_0= RULE_INT ) ) otherlv_10= 'transformable' ( (lv_transformable_11_0= RULE_BOOL ) ) otherlv_12= '}' ) ;
    public final EObject ruleObjet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_visible_3_0=null;
        Token otherlv_4=null;
        Token lv_actif_5_0=null;
        Token otherlv_6=null;
        Token lv_qte_7_0=null;
        Token otherlv_8=null;
        Token lv_taille_9_0=null;
        Token otherlv_10=null;
        Token lv_transformable_11_0=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalGame.g:893:2: ( (otherlv_0= 'objet' otherlv_1= '{' otherlv_2= 'visible' ( (lv_visible_3_0= RULE_BOOL ) ) otherlv_4= 'actif' ( (lv_actif_5_0= RULE_BOOL ) ) otherlv_6= 'quantite' ( (lv_qte_7_0= RULE_INT ) ) otherlv_8= 'taille' ( (lv_taille_9_0= RULE_INT ) ) otherlv_10= 'transformable' ( (lv_transformable_11_0= RULE_BOOL ) ) otherlv_12= '}' ) )
            // InternalGame.g:894:2: (otherlv_0= 'objet' otherlv_1= '{' otherlv_2= 'visible' ( (lv_visible_3_0= RULE_BOOL ) ) otherlv_4= 'actif' ( (lv_actif_5_0= RULE_BOOL ) ) otherlv_6= 'quantite' ( (lv_qte_7_0= RULE_INT ) ) otherlv_8= 'taille' ( (lv_taille_9_0= RULE_INT ) ) otherlv_10= 'transformable' ( (lv_transformable_11_0= RULE_BOOL ) ) otherlv_12= '}' )
            {
            // InternalGame.g:894:2: (otherlv_0= 'objet' otherlv_1= '{' otherlv_2= 'visible' ( (lv_visible_3_0= RULE_BOOL ) ) otherlv_4= 'actif' ( (lv_actif_5_0= RULE_BOOL ) ) otherlv_6= 'quantite' ( (lv_qte_7_0= RULE_INT ) ) otherlv_8= 'taille' ( (lv_taille_9_0= RULE_INT ) ) otherlv_10= 'transformable' ( (lv_transformable_11_0= RULE_BOOL ) ) otherlv_12= '}' )
            // InternalGame.g:895:3: otherlv_0= 'objet' otherlv_1= '{' otherlv_2= 'visible' ( (lv_visible_3_0= RULE_BOOL ) ) otherlv_4= 'actif' ( (lv_actif_5_0= RULE_BOOL ) ) otherlv_6= 'quantite' ( (lv_qte_7_0= RULE_INT ) ) otherlv_8= 'taille' ( (lv_taille_9_0= RULE_INT ) ) otherlv_10= 'transformable' ( (lv_transformable_11_0= RULE_BOOL ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObjetAccess().getObjetKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getObjetAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getObjetAccess().getVisibleKeyword_2());
            		
            // InternalGame.g:907:3: ( (lv_visible_3_0= RULE_BOOL ) )
            // InternalGame.g:908:4: (lv_visible_3_0= RULE_BOOL )
            {
            // InternalGame.g:908:4: (lv_visible_3_0= RULE_BOOL )
            // InternalGame.g:909:5: lv_visible_3_0= RULE_BOOL
            {
            lv_visible_3_0=(Token)match(input,RULE_BOOL,FOLLOW_18); 

            					newLeafNode(lv_visible_3_0, grammarAccess.getObjetAccess().getVisibleBOOLTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"visible",
            						lv_visible_3_0,
            						"game.Game.BOOL");
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getObjetAccess().getActifKeyword_4());
            		
            // InternalGame.g:929:3: ( (lv_actif_5_0= RULE_BOOL ) )
            // InternalGame.g:930:4: (lv_actif_5_0= RULE_BOOL )
            {
            // InternalGame.g:930:4: (lv_actif_5_0= RULE_BOOL )
            // InternalGame.g:931:5: lv_actif_5_0= RULE_BOOL
            {
            lv_actif_5_0=(Token)match(input,RULE_BOOL,FOLLOW_29); 

            					newLeafNode(lv_actif_5_0, grammarAccess.getObjetAccess().getActifBOOLTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"actif",
            						lv_actif_5_0,
            						"game.Game.BOOL");
            				

            }


            }

            otherlv_6=(Token)match(input,36,FOLLOW_24); 

            			newLeafNode(otherlv_6, grammarAccess.getObjetAccess().getQuantiteKeyword_6());
            		
            // InternalGame.g:951:3: ( (lv_qte_7_0= RULE_INT ) )
            // InternalGame.g:952:4: (lv_qte_7_0= RULE_INT )
            {
            // InternalGame.g:952:4: (lv_qte_7_0= RULE_INT )
            // InternalGame.g:953:5: lv_qte_7_0= RULE_INT
            {
            lv_qte_7_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_qte_7_0, grammarAccess.getObjetAccess().getQteINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"qte",
            						lv_qte_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_24); 

            			newLeafNode(otherlv_8, grammarAccess.getObjetAccess().getTailleKeyword_8());
            		
            // InternalGame.g:973:3: ( (lv_taille_9_0= RULE_INT ) )
            // InternalGame.g:974:4: (lv_taille_9_0= RULE_INT )
            {
            // InternalGame.g:974:4: (lv_taille_9_0= RULE_INT )
            // InternalGame.g:975:5: lv_taille_9_0= RULE_INT
            {
            lv_taille_9_0=(Token)match(input,RULE_INT,FOLLOW_30); 

            					newLeafNode(lv_taille_9_0, grammarAccess.getObjetAccess().getTailleINTTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"taille",
            						lv_taille_9_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_10=(Token)match(input,37,FOLLOW_14); 

            			newLeafNode(otherlv_10, grammarAccess.getObjetAccess().getTransformableKeyword_10());
            		
            // InternalGame.g:995:3: ( (lv_transformable_11_0= RULE_BOOL ) )
            // InternalGame.g:996:4: (lv_transformable_11_0= RULE_BOOL )
            {
            // InternalGame.g:996:4: (lv_transformable_11_0= RULE_BOOL )
            // InternalGame.g:997:5: lv_transformable_11_0= RULE_BOOL
            {
            lv_transformable_11_0=(Token)match(input,RULE_BOOL,FOLLOW_17); 

            					newLeafNode(lv_transformable_11_0, grammarAccess.getObjetAccess().getTransformableBOOLTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"transformable",
            						lv_transformable_11_0,
            						"game.Game.BOOL");
            				

            }


            }

            otherlv_12=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getObjetAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjet"


    // $ANTLR start "entryRuleInteraction"
    // InternalGame.g:1021:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // InternalGame.g:1021:52: (iv_ruleInteraction= ruleInteraction EOF )
            // InternalGame.g:1022:2: iv_ruleInteraction= ruleInteraction EOF
            {
             newCompositeNode(grammarAccess.getInteractionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteraction=ruleInteraction();

            state._fsp--;

             current =iv_ruleInteraction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteraction"


    // $ANTLR start "ruleInteraction"
    // InternalGame.g:1028:1: ruleInteraction returns [EObject current=null] : (otherlv_0= 'interaction' otherlv_1= '{' otherlv_2= 'question' ( (lv_question_3_0= RULE_STRING ) ) otherlv_4= 'choix' ( (lv_choix_5_0= ruleChoix ) )+ otherlv_6= '}' ) ;
    public final EObject ruleInteraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_question_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_choix_5_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1034:2: ( (otherlv_0= 'interaction' otherlv_1= '{' otherlv_2= 'question' ( (lv_question_3_0= RULE_STRING ) ) otherlv_4= 'choix' ( (lv_choix_5_0= ruleChoix ) )+ otherlv_6= '}' ) )
            // InternalGame.g:1035:2: (otherlv_0= 'interaction' otherlv_1= '{' otherlv_2= 'question' ( (lv_question_3_0= RULE_STRING ) ) otherlv_4= 'choix' ( (lv_choix_5_0= ruleChoix ) )+ otherlv_6= '}' )
            {
            // InternalGame.g:1035:2: (otherlv_0= 'interaction' otherlv_1= '{' otherlv_2= 'question' ( (lv_question_3_0= RULE_STRING ) ) otherlv_4= 'choix' ( (lv_choix_5_0= ruleChoix ) )+ otherlv_6= '}' )
            // InternalGame.g:1036:3: otherlv_0= 'interaction' otherlv_1= '{' otherlv_2= 'question' ( (lv_question_3_0= RULE_STRING ) ) otherlv_4= 'choix' ( (lv_choix_5_0= ruleChoix ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInteractionAccess().getInteractionKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,39,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getInteractionAccess().getQuestionKeyword_2());
            		
            // InternalGame.g:1048:3: ( (lv_question_3_0= RULE_STRING ) )
            // InternalGame.g:1049:4: (lv_question_3_0= RULE_STRING )
            {
            // InternalGame.g:1049:4: (lv_question_3_0= RULE_STRING )
            // InternalGame.g:1050:5: lv_question_3_0= RULE_STRING
            {
            lv_question_3_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

            					newLeafNode(lv_question_3_0, grammarAccess.getInteractionAccess().getQuestionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInteractionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"question",
            						lv_question_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,40,FOLLOW_33); 

            			newLeafNode(otherlv_4, grammarAccess.getInteractionAccess().getChoixKeyword_4());
            		
            // InternalGame.g:1070:3: ( (lv_choix_5_0= ruleChoix ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==40) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGame.g:1071:4: (lv_choix_5_0= ruleChoix )
            	    {
            	    // InternalGame.g:1071:4: (lv_choix_5_0= ruleChoix )
            	    // InternalGame.g:1072:5: lv_choix_5_0= ruleChoix
            	    {

            	    					newCompositeNode(grammarAccess.getInteractionAccess().getChoixChoixParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_34);
            	    lv_choix_5_0=ruleChoix();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInteractionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"choix",
            	    						lv_choix_5_0,
            	    						"game.Game.Choix");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteraction"


    // $ANTLR start "entryRuleChoix"
    // InternalGame.g:1097:1: entryRuleChoix returns [EObject current=null] : iv_ruleChoix= ruleChoix EOF ;
    public final EObject entryRuleChoix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoix = null;


        try {
            // InternalGame.g:1097:46: (iv_ruleChoix= ruleChoix EOF )
            // InternalGame.g:1098:2: iv_ruleChoix= ruleChoix EOF
            {
             newCompositeNode(grammarAccess.getChoixRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChoix=ruleChoix();

            state._fsp--;

             current =iv_ruleChoix; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChoix"


    // $ANTLR start "ruleChoix"
    // InternalGame.g:1104:1: ruleChoix returns [EObject current=null] : (otherlv_0= 'choix' ( (lv_numero_1_0= RULE_INT ) ) otherlv_2= '{' otherlv_3= 'reponse' ( (lv_reponse_4_0= RULE_STRING ) ) otherlv_5= 'recompense' ( (lv_recompense_6_0= ruleRecompense ) ) otherlv_7= '}' ) ;
    public final EObject ruleChoix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_numero_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_reponse_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_recompense_6_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1110:2: ( (otherlv_0= 'choix' ( (lv_numero_1_0= RULE_INT ) ) otherlv_2= '{' otherlv_3= 'reponse' ( (lv_reponse_4_0= RULE_STRING ) ) otherlv_5= 'recompense' ( (lv_recompense_6_0= ruleRecompense ) ) otherlv_7= '}' ) )
            // InternalGame.g:1111:2: (otherlv_0= 'choix' ( (lv_numero_1_0= RULE_INT ) ) otherlv_2= '{' otherlv_3= 'reponse' ( (lv_reponse_4_0= RULE_STRING ) ) otherlv_5= 'recompense' ( (lv_recompense_6_0= ruleRecompense ) ) otherlv_7= '}' )
            {
            // InternalGame.g:1111:2: (otherlv_0= 'choix' ( (lv_numero_1_0= RULE_INT ) ) otherlv_2= '{' otherlv_3= 'reponse' ( (lv_reponse_4_0= RULE_STRING ) ) otherlv_5= 'recompense' ( (lv_recompense_6_0= ruleRecompense ) ) otherlv_7= '}' )
            // InternalGame.g:1112:3: otherlv_0= 'choix' ( (lv_numero_1_0= RULE_INT ) ) otherlv_2= '{' otherlv_3= 'reponse' ( (lv_reponse_4_0= RULE_STRING ) ) otherlv_5= 'recompense' ( (lv_recompense_6_0= ruleRecompense ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getChoixAccess().getChoixKeyword_0());
            		
            // InternalGame.g:1116:3: ( (lv_numero_1_0= RULE_INT ) )
            // InternalGame.g:1117:4: (lv_numero_1_0= RULE_INT )
            {
            // InternalGame.g:1117:4: (lv_numero_1_0= RULE_INT )
            // InternalGame.g:1118:5: lv_numero_1_0= RULE_INT
            {
            lv_numero_1_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_numero_1_0, grammarAccess.getChoixAccess().getNumeroINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoixRule());
            					}
            					setWithLastConsumed(
            						current,
            						"numero",
            						lv_numero_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getChoixAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,41,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getChoixAccess().getReponseKeyword_3());
            		
            // InternalGame.g:1142:3: ( (lv_reponse_4_0= RULE_STRING ) )
            // InternalGame.g:1143:4: (lv_reponse_4_0= RULE_STRING )
            {
            // InternalGame.g:1143:4: (lv_reponse_4_0= RULE_STRING )
            // InternalGame.g:1144:5: lv_reponse_4_0= RULE_STRING
            {
            lv_reponse_4_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

            					newLeafNode(lv_reponse_4_0, grammarAccess.getChoixAccess().getReponseSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoixRule());
            					}
            					setWithLastConsumed(
            						current,
            						"reponse",
            						lv_reponse_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,42,FOLLOW_36); 

            			newLeafNode(otherlv_5, grammarAccess.getChoixAccess().getRecompenseKeyword_5());
            		
            // InternalGame.g:1164:3: ( (lv_recompense_6_0= ruleRecompense ) )
            // InternalGame.g:1165:4: (lv_recompense_6_0= ruleRecompense )
            {
            // InternalGame.g:1165:4: (lv_recompense_6_0= ruleRecompense )
            // InternalGame.g:1166:5: lv_recompense_6_0= ruleRecompense
            {

            					newCompositeNode(grammarAccess.getChoixAccess().getRecompenseRecompenseParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_17);
            lv_recompense_6_0=ruleRecompense();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChoixRule());
            					}
            					set(
            						current,
            						"recompense",
            						lv_recompense_6_0,
            						"game.Game.Recompense");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getChoixAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChoix"


    // $ANTLR start "entryRuleRecompense"
    // InternalGame.g:1191:1: entryRuleRecompense returns [EObject current=null] : iv_ruleRecompense= ruleRecompense EOF ;
    public final EObject entryRuleRecompense() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecompense = null;


        try {
            // InternalGame.g:1191:51: (iv_ruleRecompense= ruleRecompense EOF )
            // InternalGame.g:1192:2: iv_ruleRecompense= ruleRecompense EOF
            {
             newCompositeNode(grammarAccess.getRecompenseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecompense=ruleRecompense();

            state._fsp--;

             current =iv_ruleRecompense; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecompense"


    // $ANTLR start "ruleRecompense"
    // InternalGame.g:1198:1: ruleRecompense returns [EObject current=null] : (otherlv_0= 'recompense' otherlv_1= '{' otherlv_2= 'avantage' ( (lv_avantage_3_0= ruleAvantage ) )* otherlv_4= '}' ) ;
    public final EObject ruleRecompense() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_avantage_3_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1204:2: ( (otherlv_0= 'recompense' otherlv_1= '{' otherlv_2= 'avantage' ( (lv_avantage_3_0= ruleAvantage ) )* otherlv_4= '}' ) )
            // InternalGame.g:1205:2: (otherlv_0= 'recompense' otherlv_1= '{' otherlv_2= 'avantage' ( (lv_avantage_3_0= ruleAvantage ) )* otherlv_4= '}' )
            {
            // InternalGame.g:1205:2: (otherlv_0= 'recompense' otherlv_1= '{' otherlv_2= 'avantage' ( (lv_avantage_3_0= ruleAvantage ) )* otherlv_4= '}' )
            // InternalGame.g:1206:3: otherlv_0= 'recompense' otherlv_1= '{' otherlv_2= 'avantage' ( (lv_avantage_3_0= ruleAvantage ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRecompenseAccess().getRecompenseKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getRecompenseAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,43,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getRecompenseAccess().getAvantageKeyword_2());
            		
            // InternalGame.g:1218:3: ( (lv_avantage_3_0= ruleAvantage ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=34 && LA10_0<=35)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGame.g:1219:4: (lv_avantage_3_0= ruleAvantage )
            	    {
            	    // InternalGame.g:1219:4: (lv_avantage_3_0= ruleAvantage )
            	    // InternalGame.g:1220:5: lv_avantage_3_0= ruleAvantage
            	    {

            	    					newCompositeNode(grammarAccess.getRecompenseAccess().getAvantageAvantageParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_38);
            	    lv_avantage_3_0=ruleAvantage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRecompenseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"avantage",
            	    						lv_avantage_3_0,
            	    						"game.Game.Avantage");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRecompenseAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecompense"


    // $ANTLR start "ruleNature"
    // InternalGame.g:1245:1: ruleNature returns [Enumerator current=null] : ( (enumLiteral_0= 'depart' ) | (enumLiteral_1= 'fin' ) | (enumLiteral_2= 'intermediaire' ) ) ;
    public final Enumerator ruleNature() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGame.g:1251:2: ( ( (enumLiteral_0= 'depart' ) | (enumLiteral_1= 'fin' ) | (enumLiteral_2= 'intermediaire' ) ) )
            // InternalGame.g:1252:2: ( (enumLiteral_0= 'depart' ) | (enumLiteral_1= 'fin' ) | (enumLiteral_2= 'intermediaire' ) )
            {
            // InternalGame.g:1252:2: ( (enumLiteral_0= 'depart' ) | (enumLiteral_1= 'fin' ) | (enumLiteral_2= 'intermediaire' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt11=1;
                }
                break;
            case 45:
                {
                alt11=2;
                }
                break;
            case 46:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalGame.g:1253:3: (enumLiteral_0= 'depart' )
                    {
                    // InternalGame.g:1253:3: (enumLiteral_0= 'depart' )
                    // InternalGame.g:1254:4: enumLiteral_0= 'depart'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getNatureAccess().getDepartEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNatureAccess().getDepartEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:1261:3: (enumLiteral_1= 'fin' )
                    {
                    // InternalGame.g:1261:3: (enumLiteral_1= 'fin' )
                    // InternalGame.g:1262:4: enumLiteral_1= 'fin'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getNatureAccess().getFinEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNatureAccess().getFinEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:1269:3: (enumLiteral_2= 'intermediaire' )
                    {
                    // InternalGame.g:1269:3: (enumLiteral_2= 'intermediaire' )
                    // InternalGame.g:1270:4: enumLiteral_2= 'intermediaire'
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getNatureAccess().getInterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNatureAccess().getInterEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNature"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000C01054000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000C01050000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400004000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000004000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000C00004000L});

}