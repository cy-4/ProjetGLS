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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'jeu'", "'{'", "'}'", "'territoire'", "'lieu'", "':'", "'chemin'", "'de'", "'vers'", "'visible'", "'obligatoire'", "'ouvert'", "'personne'", "'localisation'", "'actif'", "'interactions'", "'explorateur'", "'taille'", "'disponible'", "'objets'", "'possedes'", "'connaissances'", "'connaissance'", "'objet'", "'quantite'", "'transformable'", "'question'", "'choix'", "'reponse'", "'bonne'", "'consomme'", "'donne'", "'condition'", "'requises'", "'interdites'", "'requis'", "'interdits'", "'depart'", "'fin'", "'intermediaire'"
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
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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
    public static final int RULE_BOOL=6;
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
    // InternalGame.g:72:1: ruleJeu returns [EObject current=null] : (otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_territoire_3_0= ruleTerritoire ) ) ( (lv_explorateur_4_0= ruleExplorateur ) ) ( (lv_elementsjeu_5_0= ruleElementsJeu ) )* otherlv_6= '}' ) ;
    public final EObject ruleJeu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_territoire_3_0 = null;

        EObject lv_explorateur_4_0 = null;

        EObject lv_elementsjeu_5_0 = null;



        	enterRule();

        try {
            // InternalGame.g:78:2: ( (otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_territoire_3_0= ruleTerritoire ) ) ( (lv_explorateur_4_0= ruleExplorateur ) ) ( (lv_elementsjeu_5_0= ruleElementsJeu ) )* otherlv_6= '}' ) )
            // InternalGame.g:79:2: (otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_territoire_3_0= ruleTerritoire ) ) ( (lv_explorateur_4_0= ruleExplorateur ) ) ( (lv_elementsjeu_5_0= ruleElementsJeu ) )* otherlv_6= '}' )
            {
            // InternalGame.g:79:2: (otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_territoire_3_0= ruleTerritoire ) ) ( (lv_explorateur_4_0= ruleExplorateur ) ) ( (lv_elementsjeu_5_0= ruleElementsJeu ) )* otherlv_6= '}' )
            // InternalGame.g:80:3: otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_territoire_3_0= ruleTerritoire ) ) ( (lv_explorateur_4_0= ruleExplorateur ) ) ( (lv_elementsjeu_5_0= ruleElementsJeu ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJeuAccess().getJeuKeyword_0());
            		
            // InternalGame.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getJeuAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJeuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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


    // $ANTLR start "entryRuleQteObjet"
    // InternalGame.g:288:1: entryRuleQteObjet returns [EObject current=null] : iv_ruleQteObjet= ruleQteObjet EOF ;
    public final EObject entryRuleQteObjet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQteObjet = null;


        try {
            // InternalGame.g:288:49: (iv_ruleQteObjet= ruleQteObjet EOF )
            // InternalGame.g:289:2: iv_ruleQteObjet= ruleQteObjet EOF
            {
             newCompositeNode(grammarAccess.getQteObjetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQteObjet=ruleQteObjet();

            state._fsp--;

             current =iv_ruleQteObjet; 
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
    // $ANTLR end "entryRuleQteObjet"


    // $ANTLR start "ruleQteObjet"
    // InternalGame.g:295:1: ruleQteObjet returns [EObject current=null] : ( ( (lv_qte_0_0= RULE_INT ) ) ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleQteObjet() throws RecognitionException {
        EObject current = null;

        Token lv_qte_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalGame.g:301:2: ( ( ( (lv_qte_0_0= RULE_INT ) ) ( (otherlv_1= RULE_ID ) ) ) )
            // InternalGame.g:302:2: ( ( (lv_qte_0_0= RULE_INT ) ) ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalGame.g:302:2: ( ( (lv_qte_0_0= RULE_INT ) ) ( (otherlv_1= RULE_ID ) ) )
            // InternalGame.g:303:3: ( (lv_qte_0_0= RULE_INT ) ) ( (otherlv_1= RULE_ID ) )
            {
            // InternalGame.g:303:3: ( (lv_qte_0_0= RULE_INT ) )
            // InternalGame.g:304:4: (lv_qte_0_0= RULE_INT )
            {
            // InternalGame.g:304:4: (lv_qte_0_0= RULE_INT )
            // InternalGame.g:305:5: lv_qte_0_0= RULE_INT
            {
            lv_qte_0_0=(Token)match(input,RULE_INT,FOLLOW_3); 

            					newLeafNode(lv_qte_0_0, grammarAccess.getQteObjetAccess().getQteINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQteObjetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"qte",
            						lv_qte_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGame.g:321:3: ( (otherlv_1= RULE_ID ) )
            // InternalGame.g:322:4: (otherlv_1= RULE_ID )
            {
            // InternalGame.g:322:4: (otherlv_1= RULE_ID )
            // InternalGame.g:323:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQteObjetRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getQteObjetAccess().getObjetObjetCrossReference_1_0());
            				

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
    // $ANTLR end "ruleQteObjet"


    // $ANTLR start "entryRuleTerritoire"
    // InternalGame.g:338:1: entryRuleTerritoire returns [EObject current=null] : iv_ruleTerritoire= ruleTerritoire EOF ;
    public final EObject entryRuleTerritoire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerritoire = null;


        try {
            // InternalGame.g:338:51: (iv_ruleTerritoire= ruleTerritoire EOF )
            // InternalGame.g:339:2: iv_ruleTerritoire= ruleTerritoire EOF
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
    // InternalGame.g:345:1: ruleTerritoire returns [EObject current=null] : (otherlv_0= 'territoire' otherlv_1= '{' ( (lv_places_2_0= rulePlace ) )+ otherlv_3= '}' ) ;
    public final EObject ruleTerritoire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_places_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:351:2: ( (otherlv_0= 'territoire' otherlv_1= '{' ( (lv_places_2_0= rulePlace ) )+ otherlv_3= '}' ) )
            // InternalGame.g:352:2: (otherlv_0= 'territoire' otherlv_1= '{' ( (lv_places_2_0= rulePlace ) )+ otherlv_3= '}' )
            {
            // InternalGame.g:352:2: (otherlv_0= 'territoire' otherlv_1= '{' ( (lv_places_2_0= rulePlace ) )+ otherlv_3= '}' )
            // InternalGame.g:353:3: otherlv_0= 'territoire' otherlv_1= '{' ( (lv_places_2_0= rulePlace ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTerritoireAccess().getTerritoireKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getTerritoireAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:361:3: ( (lv_places_2_0= rulePlace ) )+
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
            	    // InternalGame.g:362:4: (lv_places_2_0= rulePlace )
            	    {
            	    // InternalGame.g:362:4: (lv_places_2_0= rulePlace )
            	    // InternalGame.g:363:5: lv_places_2_0= rulePlace
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
    // InternalGame.g:388:1: entryRuleLieu returns [EObject current=null] : iv_ruleLieu= ruleLieu EOF ;
    public final EObject entryRuleLieu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLieu = null;


        try {
            // InternalGame.g:388:45: (iv_ruleLieu= ruleLieu EOF )
            // InternalGame.g:389:2: iv_ruleLieu= ruleLieu EOF
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
    // InternalGame.g:395:1: ruleLieu returns [EObject current=null] : (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_nature_3_0= ruleNature ) ) ) ;
    public final EObject ruleLieu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_nature_3_0 = null;



        	enterRule();

        try {
            // InternalGame.g:401:2: ( (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_nature_3_0= ruleNature ) ) ) )
            // InternalGame.g:402:2: (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_nature_3_0= ruleNature ) ) )
            {
            // InternalGame.g:402:2: (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_nature_3_0= ruleNature ) ) )
            // InternalGame.g:403:3: otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_nature_3_0= ruleNature ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLieuAccess().getLieuKeyword_0());
            		
            // InternalGame.g:407:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:408:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:408:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:409:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLieuAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLieuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getLieuAccess().getColonKeyword_2());
            		
            // InternalGame.g:429:3: ( (lv_nature_3_0= ruleNature ) )
            // InternalGame.g:430:4: (lv_nature_3_0= ruleNature )
            {
            // InternalGame.g:430:4: (lv_nature_3_0= ruleNature )
            // InternalGame.g:431:5: lv_nature_3_0= ruleNature
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
    // InternalGame.g:452:1: entryRuleChemin returns [EObject current=null] : iv_ruleChemin= ruleChemin EOF ;
    public final EObject entryRuleChemin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChemin = null;


        try {
            // InternalGame.g:452:47: (iv_ruleChemin= ruleChemin EOF )
            // InternalGame.g:453:2: iv_ruleChemin= ruleChemin EOF
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
    // InternalGame.g:459:1: ruleChemin returns [EObject current=null] : (otherlv_0= 'chemin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'de' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'vers' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'visible' ( (lv_visible_8_0= ruleCondition ) ) otherlv_9= 'obligatoire' ( (lv_obligatoire_10_0= RULE_BOOL ) ) otherlv_11= 'ouvert' ( (lv_ouvert_12_0= ruleCondition ) ) otherlv_13= '}' ) ;
    public final EObject ruleChemin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_obligatoire_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_visible_8_0 = null;

        EObject lv_ouvert_12_0 = null;



        	enterRule();

        try {
            // InternalGame.g:465:2: ( (otherlv_0= 'chemin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'de' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'vers' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'visible' ( (lv_visible_8_0= ruleCondition ) ) otherlv_9= 'obligatoire' ( (lv_obligatoire_10_0= RULE_BOOL ) ) otherlv_11= 'ouvert' ( (lv_ouvert_12_0= ruleCondition ) ) otherlv_13= '}' ) )
            // InternalGame.g:466:2: (otherlv_0= 'chemin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'de' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'vers' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'visible' ( (lv_visible_8_0= ruleCondition ) ) otherlv_9= 'obligatoire' ( (lv_obligatoire_10_0= RULE_BOOL ) ) otherlv_11= 'ouvert' ( (lv_ouvert_12_0= ruleCondition ) ) otherlv_13= '}' )
            {
            // InternalGame.g:466:2: (otherlv_0= 'chemin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'de' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'vers' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'visible' ( (lv_visible_8_0= ruleCondition ) ) otherlv_9= 'obligatoire' ( (lv_obligatoire_10_0= RULE_BOOL ) ) otherlv_11= 'ouvert' ( (lv_ouvert_12_0= ruleCondition ) ) otherlv_13= '}' )
            // InternalGame.g:467:3: otherlv_0= 'chemin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'de' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'vers' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'visible' ( (lv_visible_8_0= ruleCondition ) ) otherlv_9= 'obligatoire' ( (lv_obligatoire_10_0= RULE_BOOL ) ) otherlv_11= 'ouvert' ( (lv_ouvert_12_0= ruleCondition ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCheminAccess().getCheminKeyword_0());
            		
            // InternalGame.g:471:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:472:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:472:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:473:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCheminAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getCheminAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCheminAccess().getDeKeyword_3());
            		
            // InternalGame.g:497:3: ( (otherlv_4= RULE_ID ) )
            // InternalGame.g:498:4: (otherlv_4= RULE_ID )
            {
            // InternalGame.g:498:4: (otherlv_4= RULE_ID )
            // InternalGame.g:499:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_4, grammarAccess.getCheminAccess().getPredLieuCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getCheminAccess().getVersKeyword_5());
            		
            // InternalGame.g:514:3: ( (otherlv_6= RULE_ID ) )
            // InternalGame.g:515:4: (otherlv_6= RULE_ID )
            {
            // InternalGame.g:515:4: (otherlv_6= RULE_ID )
            // InternalGame.g:516:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_6, grammarAccess.getCheminAccess().getSuccLieuCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getCheminAccess().getVisibleKeyword_7());
            		
            // InternalGame.g:531:3: ( (lv_visible_8_0= ruleCondition ) )
            // InternalGame.g:532:4: (lv_visible_8_0= ruleCondition )
            {
            // InternalGame.g:532:4: (lv_visible_8_0= ruleCondition )
            // InternalGame.g:533:5: lv_visible_8_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getCheminAccess().getVisibleConditionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_15);
            lv_visible_8_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheminRule());
            					}
            					set(
            						current,
            						"visible",
            						lv_visible_8_0,
            						"game.Game.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_9, grammarAccess.getCheminAccess().getObligatoireKeyword_9());
            		
            // InternalGame.g:554:3: ( (lv_obligatoire_10_0= RULE_BOOL ) )
            // InternalGame.g:555:4: (lv_obligatoire_10_0= RULE_BOOL )
            {
            // InternalGame.g:555:4: (lv_obligatoire_10_0= RULE_BOOL )
            // InternalGame.g:556:5: lv_obligatoire_10_0= RULE_BOOL
            {
            lv_obligatoire_10_0=(Token)match(input,RULE_BOOL,FOLLOW_17); 

            					newLeafNode(lv_obligatoire_10_0, grammarAccess.getCheminAccess().getObligatoireBOOLTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            					setWithLastConsumed(
            						current,
            						"obligatoire",
            						lv_obligatoire_10_0,
            						"game.Game.BOOL");
            				

            }


            }

            otherlv_11=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_11, grammarAccess.getCheminAccess().getOuvertKeyword_11());
            		
            // InternalGame.g:576:3: ( (lv_ouvert_12_0= ruleCondition ) )
            // InternalGame.g:577:4: (lv_ouvert_12_0= ruleCondition )
            {
            // InternalGame.g:577:4: (lv_ouvert_12_0= ruleCondition )
            // InternalGame.g:578:5: lv_ouvert_12_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getCheminAccess().getOuvertConditionParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_18);
            lv_ouvert_12_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheminRule());
            					}
            					set(
            						current,
            						"ouvert",
            						lv_ouvert_12_0,
            						"game.Game.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getCheminAccess().getRightCurlyBracketKeyword_13());
            		

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
    // InternalGame.g:603:1: entryRulePersonne returns [EObject current=null] : iv_rulePersonne= rulePersonne EOF ;
    public final EObject entryRulePersonne() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonne = null;


        try {
            // InternalGame.g:603:49: (iv_rulePersonne= rulePersonne EOF )
            // InternalGame.g:604:2: iv_rulePersonne= rulePersonne EOF
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
    // InternalGame.g:610:1: rulePersonne returns [EObject current=null] : (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'localisation' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'visible' ( (lv_visible_6_0= ruleCondition ) ) otherlv_7= 'actif' ( (lv_actif_8_0= ruleCondition ) ) otherlv_9= 'obligatoire' ( (lv_obligatoire_10_0= RULE_BOOL ) ) otherlv_11= 'interactions' ( (lv_interactions_12_0= ruleInteraction ) )* otherlv_13= '}' ) ;
    public final EObject rulePersonne() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_obligatoire_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_visible_6_0 = null;

        EObject lv_actif_8_0 = null;

        EObject lv_interactions_12_0 = null;



        	enterRule();

        try {
            // InternalGame.g:616:2: ( (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'localisation' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'visible' ( (lv_visible_6_0= ruleCondition ) ) otherlv_7= 'actif' ( (lv_actif_8_0= ruleCondition ) ) otherlv_9= 'obligatoire' ( (lv_obligatoire_10_0= RULE_BOOL ) ) otherlv_11= 'interactions' ( (lv_interactions_12_0= ruleInteraction ) )* otherlv_13= '}' ) )
            // InternalGame.g:617:2: (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'localisation' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'visible' ( (lv_visible_6_0= ruleCondition ) ) otherlv_7= 'actif' ( (lv_actif_8_0= ruleCondition ) ) otherlv_9= 'obligatoire' ( (lv_obligatoire_10_0= RULE_BOOL ) ) otherlv_11= 'interactions' ( (lv_interactions_12_0= ruleInteraction ) )* otherlv_13= '}' )
            {
            // InternalGame.g:617:2: (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'localisation' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'visible' ( (lv_visible_6_0= ruleCondition ) ) otherlv_7= 'actif' ( (lv_actif_8_0= ruleCondition ) ) otherlv_9= 'obligatoire' ( (lv_obligatoire_10_0= RULE_BOOL ) ) otherlv_11= 'interactions' ( (lv_interactions_12_0= ruleInteraction ) )* otherlv_13= '}' )
            // InternalGame.g:618:3: otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'localisation' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'visible' ( (lv_visible_6_0= ruleCondition ) ) otherlv_7= 'actif' ( (lv_actif_8_0= ruleCondition ) ) otherlv_9= 'obligatoire' ( (lv_obligatoire_10_0= RULE_BOOL ) ) otherlv_11= 'interactions' ( (lv_interactions_12_0= ruleInteraction ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonneAccess().getPersonneKeyword_0());
            		
            // InternalGame.g:622:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:623:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:623:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:624:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPersonneAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonneAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPersonneAccess().getLocalisationKeyword_3());
            		
            // InternalGame.g:648:3: ( (otherlv_4= RULE_ID ) )
            // InternalGame.g:649:4: (otherlv_4= RULE_ID )
            {
            // InternalGame.g:649:4: (otherlv_4= RULE_ID )
            // InternalGame.g:650:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonneRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_4, grammarAccess.getPersonneAccess().getPlacePlaceCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getPersonneAccess().getVisibleKeyword_5());
            		
            // InternalGame.g:665:3: ( (lv_visible_6_0= ruleCondition ) )
            // InternalGame.g:666:4: (lv_visible_6_0= ruleCondition )
            {
            // InternalGame.g:666:4: (lv_visible_6_0= ruleCondition )
            // InternalGame.g:667:5: lv_visible_6_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getPersonneAccess().getVisibleConditionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_20);
            lv_visible_6_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonneRule());
            					}
            					set(
            						current,
            						"visible",
            						lv_visible_6_0,
            						"game.Game.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getPersonneAccess().getActifKeyword_7());
            		
            // InternalGame.g:688:3: ( (lv_actif_8_0= ruleCondition ) )
            // InternalGame.g:689:4: (lv_actif_8_0= ruleCondition )
            {
            // InternalGame.g:689:4: (lv_actif_8_0= ruleCondition )
            // InternalGame.g:690:5: lv_actif_8_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getPersonneAccess().getActifConditionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_15);
            lv_actif_8_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonneRule());
            					}
            					set(
            						current,
            						"actif",
            						lv_actif_8_0,
            						"game.Game.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_9, grammarAccess.getPersonneAccess().getObligatoireKeyword_9());
            		
            // InternalGame.g:711:3: ( (lv_obligatoire_10_0= RULE_BOOL ) )
            // InternalGame.g:712:4: (lv_obligatoire_10_0= RULE_BOOL )
            {
            // InternalGame.g:712:4: (lv_obligatoire_10_0= RULE_BOOL )
            // InternalGame.g:713:5: lv_obligatoire_10_0= RULE_BOOL
            {
            lv_obligatoire_10_0=(Token)match(input,RULE_BOOL,FOLLOW_21); 

            					newLeafNode(lv_obligatoire_10_0, grammarAccess.getPersonneAccess().getObligatoireBOOLTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"obligatoire",
            						lv_obligatoire_10_0,
            						"game.Game.BOOL");
            				

            }


            }

            otherlv_11=(Token)match(input,27,FOLLOW_22); 

            			newLeafNode(otherlv_11, grammarAccess.getPersonneAccess().getInteractionsKeyword_11());
            		
            // InternalGame.g:733:3: ( (lv_interactions_12_0= ruleInteraction ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGame.g:734:4: (lv_interactions_12_0= ruleInteraction )
            	    {
            	    // InternalGame.g:734:4: (lv_interactions_12_0= ruleInteraction )
            	    // InternalGame.g:735:5: lv_interactions_12_0= ruleInteraction
            	    {

            	    					newCompositeNode(grammarAccess.getPersonneAccess().getInteractionsInteractionParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_interactions_12_0=ruleInteraction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPersonneRule());
            	    					}
            	    					add(
            	    						current,
            	    						"interactions",
            	    						lv_interactions_12_0,
            	    						"game.Game.Interaction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_13=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_13());
            		

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
    // InternalGame.g:760:1: entryRuleExplorateur returns [EObject current=null] : iv_ruleExplorateur= ruleExplorateur EOF ;
    public final EObject entryRuleExplorateur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplorateur = null;


        try {
            // InternalGame.g:760:52: (iv_ruleExplorateur= ruleExplorateur EOF )
            // InternalGame.g:761:2: iv_ruleExplorateur= ruleExplorateur EOF
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
    // InternalGame.g:767:1: ruleExplorateur returns [EObject current=null] : (otherlv_0= 'explorateur' otherlv_1= '{' otherlv_2= 'localisation' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'taille' otherlv_5= 'disponible' ( (lv_tailleDispo_6_0= RULE_INT ) ) (otherlv_7= 'objets' otherlv_8= 'possedes' ( (lv_objets_9_0= ruleObjet ) )* )? (otherlv_10= 'connaissances' otherlv_11= 'possedes' ( (lv_connaissances_12_0= ruleConnaissance ) )* )? otherlv_13= '}' ) ;
    public final EObject ruleExplorateur() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_tailleDispo_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_objets_9_0 = null;

        EObject lv_connaissances_12_0 = null;



        	enterRule();

        try {
            // InternalGame.g:773:2: ( (otherlv_0= 'explorateur' otherlv_1= '{' otherlv_2= 'localisation' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'taille' otherlv_5= 'disponible' ( (lv_tailleDispo_6_0= RULE_INT ) ) (otherlv_7= 'objets' otherlv_8= 'possedes' ( (lv_objets_9_0= ruleObjet ) )* )? (otherlv_10= 'connaissances' otherlv_11= 'possedes' ( (lv_connaissances_12_0= ruleConnaissance ) )* )? otherlv_13= '}' ) )
            // InternalGame.g:774:2: (otherlv_0= 'explorateur' otherlv_1= '{' otherlv_2= 'localisation' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'taille' otherlv_5= 'disponible' ( (lv_tailleDispo_6_0= RULE_INT ) ) (otherlv_7= 'objets' otherlv_8= 'possedes' ( (lv_objets_9_0= ruleObjet ) )* )? (otherlv_10= 'connaissances' otherlv_11= 'possedes' ( (lv_connaissances_12_0= ruleConnaissance ) )* )? otherlv_13= '}' )
            {
            // InternalGame.g:774:2: (otherlv_0= 'explorateur' otherlv_1= '{' otherlv_2= 'localisation' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'taille' otherlv_5= 'disponible' ( (lv_tailleDispo_6_0= RULE_INT ) ) (otherlv_7= 'objets' otherlv_8= 'possedes' ( (lv_objets_9_0= ruleObjet ) )* )? (otherlv_10= 'connaissances' otherlv_11= 'possedes' ( (lv_connaissances_12_0= ruleConnaissance ) )* )? otherlv_13= '}' )
            // InternalGame.g:775:3: otherlv_0= 'explorateur' otherlv_1= '{' otherlv_2= 'localisation' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'taille' otherlv_5= 'disponible' ( (lv_tailleDispo_6_0= RULE_INT ) ) (otherlv_7= 'objets' otherlv_8= 'possedes' ( (lv_objets_9_0= ruleObjet ) )* )? (otherlv_10= 'connaissances' otherlv_11= 'possedes' ( (lv_connaissances_12_0= ruleConnaissance ) )* )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExplorateurAccess().getExplorateurKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getExplorateurAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getExplorateurAccess().getLocalisationKeyword_2());
            		
            // InternalGame.g:787:3: ( (otherlv_3= RULE_ID ) )
            // InternalGame.g:788:4: (otherlv_3= RULE_ID )
            {
            // InternalGame.g:788:4: (otherlv_3= RULE_ID )
            // InternalGame.g:789:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExplorateurRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_3, grammarAccess.getExplorateurAccess().getPlacePlaceCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getExplorateurAccess().getTailleKeyword_4());
            		
            otherlv_5=(Token)match(input,30,FOLLOW_25); 

            			newLeafNode(otherlv_5, grammarAccess.getExplorateurAccess().getDisponibleKeyword_5());
            		
            // InternalGame.g:808:3: ( (lv_tailleDispo_6_0= RULE_INT ) )
            // InternalGame.g:809:4: (lv_tailleDispo_6_0= RULE_INT )
            {
            // InternalGame.g:809:4: (lv_tailleDispo_6_0= RULE_INT )
            // InternalGame.g:810:5: lv_tailleDispo_6_0= RULE_INT
            {
            lv_tailleDispo_6_0=(Token)match(input,RULE_INT,FOLLOW_26); 

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

            // InternalGame.g:826:3: (otherlv_7= 'objets' otherlv_8= 'possedes' ( (lv_objets_9_0= ruleObjet ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGame.g:827:4: otherlv_7= 'objets' otherlv_8= 'possedes' ( (lv_objets_9_0= ruleObjet ) )*
                    {
                    otherlv_7=(Token)match(input,31,FOLLOW_27); 

                    				newLeafNode(otherlv_7, grammarAccess.getExplorateurAccess().getObjetsKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,32,FOLLOW_28); 

                    				newLeafNode(otherlv_8, grammarAccess.getExplorateurAccess().getPossedesKeyword_7_1());
                    			
                    // InternalGame.g:835:4: ( (lv_objets_9_0= ruleObjet ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==35) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalGame.g:836:5: (lv_objets_9_0= ruleObjet )
                    	    {
                    	    // InternalGame.g:836:5: (lv_objets_9_0= ruleObjet )
                    	    // InternalGame.g:837:6: lv_objets_9_0= ruleObjet
                    	    {

                    	    						newCompositeNode(grammarAccess.getExplorateurAccess().getObjetsObjetParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_28);
                    	    lv_objets_9_0=ruleObjet();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getExplorateurRule());
                    	    						}
                    	    						add(
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


                    }
                    break;

            }

            // InternalGame.g:855:3: (otherlv_10= 'connaissances' otherlv_11= 'possedes' ( (lv_connaissances_12_0= ruleConnaissance ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==33) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGame.g:856:4: otherlv_10= 'connaissances' otherlv_11= 'possedes' ( (lv_connaissances_12_0= ruleConnaissance ) )*
                    {
                    otherlv_10=(Token)match(input,33,FOLLOW_27); 

                    				newLeafNode(otherlv_10, grammarAccess.getExplorateurAccess().getConnaissancesKeyword_8_0());
                    			
                    otherlv_11=(Token)match(input,32,FOLLOW_29); 

                    				newLeafNode(otherlv_11, grammarAccess.getExplorateurAccess().getPossedesKeyword_8_1());
                    			
                    // InternalGame.g:864:4: ( (lv_connaissances_12_0= ruleConnaissance ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==34) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalGame.g:865:5: (lv_connaissances_12_0= ruleConnaissance )
                    	    {
                    	    // InternalGame.g:865:5: (lv_connaissances_12_0= ruleConnaissance )
                    	    // InternalGame.g:866:6: lv_connaissances_12_0= ruleConnaissance
                    	    {

                    	    						newCompositeNode(grammarAccess.getExplorateurAccess().getConnaissancesConnaissanceParserRuleCall_8_2_0());
                    	    					
                    	    pushFollow(FOLLOW_29);
                    	    lv_connaissances_12_0=ruleConnaissance();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getExplorateurRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"connaissances",
                    	    							lv_connaissances_12_0,
                    	    							"game.Game.Connaissance");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getExplorateurAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalGame.g:892:1: entryRuleConnaissance returns [EObject current=null] : iv_ruleConnaissance= ruleConnaissance EOF ;
    public final EObject entryRuleConnaissance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnaissance = null;


        try {
            // InternalGame.g:892:53: (iv_ruleConnaissance= ruleConnaissance EOF )
            // InternalGame.g:893:2: iv_ruleConnaissance= ruleConnaissance EOF
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
    // InternalGame.g:899:1: ruleConnaissance returns [EObject current=null] : (otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visible' ( (lv_visible_4_0= ruleCondition ) ) otherlv_5= 'actif' ( (lv_actif_6_0= ruleCondition ) ) otherlv_7= '}' ) ;
    public final EObject ruleConnaissance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_visible_4_0 = null;

        EObject lv_actif_6_0 = null;



        	enterRule();

        try {
            // InternalGame.g:905:2: ( (otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visible' ( (lv_visible_4_0= ruleCondition ) ) otherlv_5= 'actif' ( (lv_actif_6_0= ruleCondition ) ) otherlv_7= '}' ) )
            // InternalGame.g:906:2: (otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visible' ( (lv_visible_4_0= ruleCondition ) ) otherlv_5= 'actif' ( (lv_actif_6_0= ruleCondition ) ) otherlv_7= '}' )
            {
            // InternalGame.g:906:2: (otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visible' ( (lv_visible_4_0= ruleCondition ) ) otherlv_5= 'actif' ( (lv_actif_6_0= ruleCondition ) ) otherlv_7= '}' )
            // InternalGame.g:907:3: otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visible' ( (lv_visible_4_0= ruleCondition ) ) otherlv_5= 'actif' ( (lv_actif_6_0= ruleCondition ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConnaissanceAccess().getConnaissanceKeyword_0());
            		
            // InternalGame.g:911:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:912:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:912:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:913:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConnaissanceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnaissanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getConnaissanceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getConnaissanceAccess().getVisibleKeyword_3());
            		
            // InternalGame.g:937:3: ( (lv_visible_4_0= ruleCondition ) )
            // InternalGame.g:938:4: (lv_visible_4_0= ruleCondition )
            {
            // InternalGame.g:938:4: (lv_visible_4_0= ruleCondition )
            // InternalGame.g:939:5: lv_visible_4_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getConnaissanceAccess().getVisibleConditionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_visible_4_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnaissanceRule());
            					}
            					set(
            						current,
            						"visible",
            						lv_visible_4_0,
            						"game.Game.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getConnaissanceAccess().getActifKeyword_5());
            		
            // InternalGame.g:960:3: ( (lv_actif_6_0= ruleCondition ) )
            // InternalGame.g:961:4: (lv_actif_6_0= ruleCondition )
            {
            // InternalGame.g:961:4: (lv_actif_6_0= ruleCondition )
            // InternalGame.g:962:5: lv_actif_6_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getConnaissanceAccess().getActifConditionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_18);
            lv_actif_6_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnaissanceRule());
            					}
            					set(
            						current,
            						"actif",
            						lv_actif_6_0,
            						"game.Game.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getConnaissanceAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalGame.g:987:1: entryRuleObjet returns [EObject current=null] : iv_ruleObjet= ruleObjet EOF ;
    public final EObject entryRuleObjet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjet = null;


        try {
            // InternalGame.g:987:46: (iv_ruleObjet= ruleObjet EOF )
            // InternalGame.g:988:2: iv_ruleObjet= ruleObjet EOF
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
    // InternalGame.g:994:1: ruleObjet returns [EObject current=null] : (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visible' ( (lv_visible_4_0= ruleCondition ) ) otherlv_5= 'actif' ( (lv_actif_6_0= ruleCondition ) ) otherlv_7= 'quantite' ( (lv_qte_8_0= RULE_INT ) ) otherlv_9= 'taille' ( (lv_taille_10_0= RULE_INT ) ) otherlv_11= 'transformable' ( (lv_transformable_12_0= RULE_BOOL ) ) otherlv_13= '}' ) ;
    public final EObject ruleObjet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_qte_8_0=null;
        Token otherlv_9=null;
        Token lv_taille_10_0=null;
        Token otherlv_11=null;
        Token lv_transformable_12_0=null;
        Token otherlv_13=null;
        EObject lv_visible_4_0 = null;

        EObject lv_actif_6_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1000:2: ( (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visible' ( (lv_visible_4_0= ruleCondition ) ) otherlv_5= 'actif' ( (lv_actif_6_0= ruleCondition ) ) otherlv_7= 'quantite' ( (lv_qte_8_0= RULE_INT ) ) otherlv_9= 'taille' ( (lv_taille_10_0= RULE_INT ) ) otherlv_11= 'transformable' ( (lv_transformable_12_0= RULE_BOOL ) ) otherlv_13= '}' ) )
            // InternalGame.g:1001:2: (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visible' ( (lv_visible_4_0= ruleCondition ) ) otherlv_5= 'actif' ( (lv_actif_6_0= ruleCondition ) ) otherlv_7= 'quantite' ( (lv_qte_8_0= RULE_INT ) ) otherlv_9= 'taille' ( (lv_taille_10_0= RULE_INT ) ) otherlv_11= 'transformable' ( (lv_transformable_12_0= RULE_BOOL ) ) otherlv_13= '}' )
            {
            // InternalGame.g:1001:2: (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visible' ( (lv_visible_4_0= ruleCondition ) ) otherlv_5= 'actif' ( (lv_actif_6_0= ruleCondition ) ) otherlv_7= 'quantite' ( (lv_qte_8_0= RULE_INT ) ) otherlv_9= 'taille' ( (lv_taille_10_0= RULE_INT ) ) otherlv_11= 'transformable' ( (lv_transformable_12_0= RULE_BOOL ) ) otherlv_13= '}' )
            // InternalGame.g:1002:3: otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'visible' ( (lv_visible_4_0= ruleCondition ) ) otherlv_5= 'actif' ( (lv_actif_6_0= ruleCondition ) ) otherlv_7= 'quantite' ( (lv_qte_8_0= RULE_INT ) ) otherlv_9= 'taille' ( (lv_taille_10_0= RULE_INT ) ) otherlv_11= 'transformable' ( (lv_transformable_12_0= RULE_BOOL ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getObjetAccess().getObjetKeyword_0());
            		
            // InternalGame.g:1006:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:1007:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:1007:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:1008:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getObjetAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getObjetAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getObjetAccess().getVisibleKeyword_3());
            		
            // InternalGame.g:1032:3: ( (lv_visible_4_0= ruleCondition ) )
            // InternalGame.g:1033:4: (lv_visible_4_0= ruleCondition )
            {
            // InternalGame.g:1033:4: (lv_visible_4_0= ruleCondition )
            // InternalGame.g:1034:5: lv_visible_4_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getObjetAccess().getVisibleConditionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_visible_4_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjetRule());
            					}
            					set(
            						current,
            						"visible",
            						lv_visible_4_0,
            						"game.Game.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getObjetAccess().getActifKeyword_5());
            		
            // InternalGame.g:1055:3: ( (lv_actif_6_0= ruleCondition ) )
            // InternalGame.g:1056:4: (lv_actif_6_0= ruleCondition )
            {
            // InternalGame.g:1056:4: (lv_actif_6_0= ruleCondition )
            // InternalGame.g:1057:5: lv_actif_6_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getObjetAccess().getActifConditionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_30);
            lv_actif_6_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjetRule());
            					}
            					set(
            						current,
            						"actif",
            						lv_actif_6_0,
            						"game.Game.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,36,FOLLOW_25); 

            			newLeafNode(otherlv_7, grammarAccess.getObjetAccess().getQuantiteKeyword_7());
            		
            // InternalGame.g:1078:3: ( (lv_qte_8_0= RULE_INT ) )
            // InternalGame.g:1079:4: (lv_qte_8_0= RULE_INT )
            {
            // InternalGame.g:1079:4: (lv_qte_8_0= RULE_INT )
            // InternalGame.g:1080:5: lv_qte_8_0= RULE_INT
            {
            lv_qte_8_0=(Token)match(input,RULE_INT,FOLLOW_23); 

            					newLeafNode(lv_qte_8_0, grammarAccess.getObjetAccess().getQteINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"qte",
            						lv_qte_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,29,FOLLOW_25); 

            			newLeafNode(otherlv_9, grammarAccess.getObjetAccess().getTailleKeyword_9());
            		
            // InternalGame.g:1100:3: ( (lv_taille_10_0= RULE_INT ) )
            // InternalGame.g:1101:4: (lv_taille_10_0= RULE_INT )
            {
            // InternalGame.g:1101:4: (lv_taille_10_0= RULE_INT )
            // InternalGame.g:1102:5: lv_taille_10_0= RULE_INT
            {
            lv_taille_10_0=(Token)match(input,RULE_INT,FOLLOW_31); 

            					newLeafNode(lv_taille_10_0, grammarAccess.getObjetAccess().getTailleINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"taille",
            						lv_taille_10_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_11=(Token)match(input,37,FOLLOW_16); 

            			newLeafNode(otherlv_11, grammarAccess.getObjetAccess().getTransformableKeyword_11());
            		
            // InternalGame.g:1122:3: ( (lv_transformable_12_0= RULE_BOOL ) )
            // InternalGame.g:1123:4: (lv_transformable_12_0= RULE_BOOL )
            {
            // InternalGame.g:1123:4: (lv_transformable_12_0= RULE_BOOL )
            // InternalGame.g:1124:5: lv_transformable_12_0= RULE_BOOL
            {
            lv_transformable_12_0=(Token)match(input,RULE_BOOL,FOLLOW_18); 

            					newLeafNode(lv_transformable_12_0, grammarAccess.getObjetAccess().getTransformableBOOLTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"transformable",
            						lv_transformable_12_0,
            						"game.Game.BOOL");
            				

            }


            }

            otherlv_13=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getObjetAccess().getRightCurlyBracketKeyword_13());
            		

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
    // InternalGame.g:1148:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // InternalGame.g:1148:52: (iv_ruleInteraction= ruleInteraction EOF )
            // InternalGame.g:1149:2: iv_ruleInteraction= ruleInteraction EOF
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
    // InternalGame.g:1155:1: ruleInteraction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'question' ( (lv_question_3_0= RULE_STRING ) ) ( (lv_choix_4_0= ruleChoix ) )+ otherlv_5= '}' ) ;
    public final EObject ruleInteraction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_question_3_0=null;
        Token otherlv_5=null;
        EObject lv_choix_4_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1161:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'question' ( (lv_question_3_0= RULE_STRING ) ) ( (lv_choix_4_0= ruleChoix ) )+ otherlv_5= '}' ) )
            // InternalGame.g:1162:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'question' ( (lv_question_3_0= RULE_STRING ) ) ( (lv_choix_4_0= ruleChoix ) )+ otherlv_5= '}' )
            {
            // InternalGame.g:1162:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'question' ( (lv_question_3_0= RULE_STRING ) ) ( (lv_choix_4_0= ruleChoix ) )+ otherlv_5= '}' )
            // InternalGame.g:1163:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'question' ( (lv_question_3_0= RULE_STRING ) ) ( (lv_choix_4_0= ruleChoix ) )+ otherlv_5= '}'
            {
            // InternalGame.g:1163:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGame.g:1164:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGame.g:1164:4: (lv_name_0_0= RULE_ID )
            // InternalGame.g:1165:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getInteractionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInteractionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,38,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getInteractionAccess().getQuestionKeyword_2());
            		
            // InternalGame.g:1189:3: ( (lv_question_3_0= RULE_STRING ) )
            // InternalGame.g:1190:4: (lv_question_3_0= RULE_STRING )
            {
            // InternalGame.g:1190:4: (lv_question_3_0= RULE_STRING )
            // InternalGame.g:1191:5: lv_question_3_0= RULE_STRING
            {
            lv_question_3_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

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

            // InternalGame.g:1207:3: ( (lv_choix_4_0= ruleChoix ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==39) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGame.g:1208:4: (lv_choix_4_0= ruleChoix )
            	    {
            	    // InternalGame.g:1208:4: (lv_choix_4_0= ruleChoix )
            	    // InternalGame.g:1209:5: lv_choix_4_0= ruleChoix
            	    {

            	    					newCompositeNode(grammarAccess.getInteractionAccess().getChoixChoixParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_choix_4_0=ruleChoix();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInteractionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"choix",
            	    						lv_choix_4_0,
            	    						"game.Game.Choix");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalGame.g:1234:1: entryRuleChoix returns [EObject current=null] : iv_ruleChoix= ruleChoix EOF ;
    public final EObject entryRuleChoix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoix = null;


        try {
            // InternalGame.g:1234:46: (iv_ruleChoix= ruleChoix EOF )
            // InternalGame.g:1235:2: iv_ruleChoix= ruleChoix EOF
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
    // InternalGame.g:1241:1: ruleChoix returns [EObject current=null] : (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'reponse' ( (lv_reponse_4_0= RULE_STRING ) ) otherlv_5= 'bonne' ( (lv_bonne_6_0= RULE_BOOL ) ) (otherlv_7= 'consomme' ( (lv_objetCons_8_0= ruleQteObjet ) ) )* (otherlv_9= 'donne' ( ( (lv_objetDon_10_0= ruleQteObjet ) ) | (otherlv_11= 'connaissance' ( (otherlv_12= RULE_ID ) ) ) ) )* otherlv_13= '}' ) ;
    public final EObject ruleChoix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_reponse_4_0=null;
        Token otherlv_5=null;
        Token lv_bonne_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_objetCons_8_0 = null;

        EObject lv_objetDon_10_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1247:2: ( (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'reponse' ( (lv_reponse_4_0= RULE_STRING ) ) otherlv_5= 'bonne' ( (lv_bonne_6_0= RULE_BOOL ) ) (otherlv_7= 'consomme' ( (lv_objetCons_8_0= ruleQteObjet ) ) )* (otherlv_9= 'donne' ( ( (lv_objetDon_10_0= ruleQteObjet ) ) | (otherlv_11= 'connaissance' ( (otherlv_12= RULE_ID ) ) ) ) )* otherlv_13= '}' ) )
            // InternalGame.g:1248:2: (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'reponse' ( (lv_reponse_4_0= RULE_STRING ) ) otherlv_5= 'bonne' ( (lv_bonne_6_0= RULE_BOOL ) ) (otherlv_7= 'consomme' ( (lv_objetCons_8_0= ruleQteObjet ) ) )* (otherlv_9= 'donne' ( ( (lv_objetDon_10_0= ruleQteObjet ) ) | (otherlv_11= 'connaissance' ( (otherlv_12= RULE_ID ) ) ) ) )* otherlv_13= '}' )
            {
            // InternalGame.g:1248:2: (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'reponse' ( (lv_reponse_4_0= RULE_STRING ) ) otherlv_5= 'bonne' ( (lv_bonne_6_0= RULE_BOOL ) ) (otherlv_7= 'consomme' ( (lv_objetCons_8_0= ruleQteObjet ) ) )* (otherlv_9= 'donne' ( ( (lv_objetDon_10_0= ruleQteObjet ) ) | (otherlv_11= 'connaissance' ( (otherlv_12= RULE_ID ) ) ) ) )* otherlv_13= '}' )
            // InternalGame.g:1249:3: otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'reponse' ( (lv_reponse_4_0= RULE_STRING ) ) otherlv_5= 'bonne' ( (lv_bonne_6_0= RULE_BOOL ) ) (otherlv_7= 'consomme' ( (lv_objetCons_8_0= ruleQteObjet ) ) )* (otherlv_9= 'donne' ( ( (lv_objetDon_10_0= ruleQteObjet ) ) | (otherlv_11= 'connaissance' ( (otherlv_12= RULE_ID ) ) ) ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getChoixAccess().getChoixKeyword_0());
            		
            // InternalGame.g:1253:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:1254:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:1254:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:1255:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getChoixAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoixRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getChoixAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,40,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getChoixAccess().getReponseKeyword_3());
            		
            // InternalGame.g:1279:3: ( (lv_reponse_4_0= RULE_STRING ) )
            // InternalGame.g:1280:4: (lv_reponse_4_0= RULE_STRING )
            {
            // InternalGame.g:1280:4: (lv_reponse_4_0= RULE_STRING )
            // InternalGame.g:1281:5: lv_reponse_4_0= RULE_STRING
            {
            lv_reponse_4_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

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

            otherlv_5=(Token)match(input,41,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getChoixAccess().getBonneKeyword_5());
            		
            // InternalGame.g:1301:3: ( (lv_bonne_6_0= RULE_BOOL ) )
            // InternalGame.g:1302:4: (lv_bonne_6_0= RULE_BOOL )
            {
            // InternalGame.g:1302:4: (lv_bonne_6_0= RULE_BOOL )
            // InternalGame.g:1303:5: lv_bonne_6_0= RULE_BOOL
            {
            lv_bonne_6_0=(Token)match(input,RULE_BOOL,FOLLOW_38); 

            					newLeafNode(lv_bonne_6_0, grammarAccess.getChoixAccess().getBonneBOOLTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoixRule());
            					}
            					setWithLastConsumed(
            						current,
            						"bonne",
            						lv_bonne_6_0,
            						"game.Game.BOOL");
            				

            }


            }

            // InternalGame.g:1319:3: (otherlv_7= 'consomme' ( (lv_objetCons_8_0= ruleQteObjet ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==42) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGame.g:1320:4: otherlv_7= 'consomme' ( (lv_objetCons_8_0= ruleQteObjet ) )
            	    {
            	    otherlv_7=(Token)match(input,42,FOLLOW_25); 

            	    				newLeafNode(otherlv_7, grammarAccess.getChoixAccess().getConsommeKeyword_7_0());
            	    			
            	    // InternalGame.g:1324:4: ( (lv_objetCons_8_0= ruleQteObjet ) )
            	    // InternalGame.g:1325:5: (lv_objetCons_8_0= ruleQteObjet )
            	    {
            	    // InternalGame.g:1325:5: (lv_objetCons_8_0= ruleQteObjet )
            	    // InternalGame.g:1326:6: lv_objetCons_8_0= ruleQteObjet
            	    {

            	    						newCompositeNode(grammarAccess.getChoixAccess().getObjetConsQteObjetParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_objetCons_8_0=ruleQteObjet();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getChoixRule());
            	    						}
            	    						add(
            	    							current,
            	    							"objetCons",
            	    							lv_objetCons_8_0,
            	    							"game.Game.QteObjet");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalGame.g:1344:3: (otherlv_9= 'donne' ( ( (lv_objetDon_10_0= ruleQteObjet ) ) | (otherlv_11= 'connaissance' ( (otherlv_12= RULE_ID ) ) ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==43) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGame.g:1345:4: otherlv_9= 'donne' ( ( (lv_objetDon_10_0= ruleQteObjet ) ) | (otherlv_11= 'connaissance' ( (otherlv_12= RULE_ID ) ) ) )
            	    {
            	    otherlv_9=(Token)match(input,43,FOLLOW_39); 

            	    				newLeafNode(otherlv_9, grammarAccess.getChoixAccess().getDonneKeyword_8_0());
            	    			
            	    // InternalGame.g:1349:4: ( ( (lv_objetDon_10_0= ruleQteObjet ) ) | (otherlv_11= 'connaissance' ( (otherlv_12= RULE_ID ) ) ) )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==RULE_INT) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==34) ) {
            	        alt13=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalGame.g:1350:5: ( (lv_objetDon_10_0= ruleQteObjet ) )
            	            {
            	            // InternalGame.g:1350:5: ( (lv_objetDon_10_0= ruleQteObjet ) )
            	            // InternalGame.g:1351:6: (lv_objetDon_10_0= ruleQteObjet )
            	            {
            	            // InternalGame.g:1351:6: (lv_objetDon_10_0= ruleQteObjet )
            	            // InternalGame.g:1352:7: lv_objetDon_10_0= ruleQteObjet
            	            {

            	            							newCompositeNode(grammarAccess.getChoixAccess().getObjetDonQteObjetParserRuleCall_8_1_0_0());
            	            						
            	            pushFollow(FOLLOW_40);
            	            lv_objetDon_10_0=ruleQteObjet();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getChoixRule());
            	            							}
            	            							add(
            	            								current,
            	            								"objetDon",
            	            								lv_objetDon_10_0,
            	            								"game.Game.QteObjet");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalGame.g:1370:5: (otherlv_11= 'connaissance' ( (otherlv_12= RULE_ID ) ) )
            	            {
            	            // InternalGame.g:1370:5: (otherlv_11= 'connaissance' ( (otherlv_12= RULE_ID ) ) )
            	            // InternalGame.g:1371:6: otherlv_11= 'connaissance' ( (otherlv_12= RULE_ID ) )
            	            {
            	            otherlv_11=(Token)match(input,34,FOLLOW_3); 

            	            						newLeafNode(otherlv_11, grammarAccess.getChoixAccess().getConnaissanceKeyword_8_1_1_0());
            	            					
            	            // InternalGame.g:1375:6: ( (otherlv_12= RULE_ID ) )
            	            // InternalGame.g:1376:7: (otherlv_12= RULE_ID )
            	            {
            	            // InternalGame.g:1376:7: (otherlv_12= RULE_ID )
            	            // InternalGame.g:1377:8: otherlv_12= RULE_ID
            	            {

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getChoixRule());
            	            								}
            	            							
            	            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_40); 

            	            								newLeafNode(otherlv_12, grammarAccess.getChoixAccess().getConnaisDonConnaissanceCrossReference_8_1_1_1_0());
            	            							

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_13=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getChoixAccess().getRightCurlyBracketKeyword_9());
            		

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


    // $ANTLR start "entryRuleCondition"
    // InternalGame.g:1399:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalGame.g:1399:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalGame.g:1400:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalGame.g:1406:1: ruleCondition returns [EObject current=null] : ( (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'connaissances' ( (otherlv_4= 'requises' ( (otherlv_5= RULE_ID ) )* ) | (otherlv_6= 'interdites' ( (otherlv_7= RULE_ID ) )* ) ) )* ( ( (lv_quantite_8_0= RULE_INT ) ) otherlv_9= 'objets' ( (otherlv_10= 'requis' ( (otherlv_11= RULE_ID ) )* ) | (otherlv_12= 'interdits' ( (otherlv_13= RULE_ID ) )* ) ) )* otherlv_14= '}' ) | this_BOOL_15= RULE_BOOL ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_quantite_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token this_BOOL_15=null;


        	enterRule();

        try {
            // InternalGame.g:1412:2: ( ( (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'connaissances' ( (otherlv_4= 'requises' ( (otherlv_5= RULE_ID ) )* ) | (otherlv_6= 'interdites' ( (otherlv_7= RULE_ID ) )* ) ) )* ( ( (lv_quantite_8_0= RULE_INT ) ) otherlv_9= 'objets' ( (otherlv_10= 'requis' ( (otherlv_11= RULE_ID ) )* ) | (otherlv_12= 'interdits' ( (otherlv_13= RULE_ID ) )* ) ) )* otherlv_14= '}' ) | this_BOOL_15= RULE_BOOL ) )
            // InternalGame.g:1413:2: ( (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'connaissances' ( (otherlv_4= 'requises' ( (otherlv_5= RULE_ID ) )* ) | (otherlv_6= 'interdites' ( (otherlv_7= RULE_ID ) )* ) ) )* ( ( (lv_quantite_8_0= RULE_INT ) ) otherlv_9= 'objets' ( (otherlv_10= 'requis' ( (otherlv_11= RULE_ID ) )* ) | (otherlv_12= 'interdits' ( (otherlv_13= RULE_ID ) )* ) ) )* otherlv_14= '}' ) | this_BOOL_15= RULE_BOOL )
            {
            // InternalGame.g:1413:2: ( (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'connaissances' ( (otherlv_4= 'requises' ( (otherlv_5= RULE_ID ) )* ) | (otherlv_6= 'interdites' ( (otherlv_7= RULE_ID ) )* ) ) )* ( ( (lv_quantite_8_0= RULE_INT ) ) otherlv_9= 'objets' ( (otherlv_10= 'requis' ( (otherlv_11= RULE_ID ) )* ) | (otherlv_12= 'interdits' ( (otherlv_13= RULE_ID ) )* ) ) )* otherlv_14= '}' ) | this_BOOL_15= RULE_BOOL )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==44) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_BOOL) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalGame.g:1414:3: (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'connaissances' ( (otherlv_4= 'requises' ( (otherlv_5= RULE_ID ) )* ) | (otherlv_6= 'interdites' ( (otherlv_7= RULE_ID ) )* ) ) )* ( ( (lv_quantite_8_0= RULE_INT ) ) otherlv_9= 'objets' ( (otherlv_10= 'requis' ( (otherlv_11= RULE_ID ) )* ) | (otherlv_12= 'interdits' ( (otherlv_13= RULE_ID ) )* ) ) )* otherlv_14= '}' )
                    {
                    // InternalGame.g:1414:3: (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'connaissances' ( (otherlv_4= 'requises' ( (otherlv_5= RULE_ID ) )* ) | (otherlv_6= 'interdites' ( (otherlv_7= RULE_ID ) )* ) ) )* ( ( (lv_quantite_8_0= RULE_INT ) ) otherlv_9= 'objets' ( (otherlv_10= 'requis' ( (otherlv_11= RULE_ID ) )* ) | (otherlv_12= 'interdits' ( (otherlv_13= RULE_ID ) )* ) ) )* otherlv_14= '}' )
                    // InternalGame.g:1415:4: otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'connaissances' ( (otherlv_4= 'requises' ( (otherlv_5= RULE_ID ) )* ) | (otherlv_6= 'interdites' ( (otherlv_7= RULE_ID ) )* ) ) )* ( ( (lv_quantite_8_0= RULE_INT ) ) otherlv_9= 'objets' ( (otherlv_10= 'requis' ( (otherlv_11= RULE_ID ) )* ) | (otherlv_12= 'interdits' ( (otherlv_13= RULE_ID ) )* ) ) )* otherlv_14= '}'
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getConditionKeyword_0_0());
                    			
                    // InternalGame.g:1419:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalGame.g:1420:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalGame.g:1420:5: (lv_name_1_0= RULE_ID )
                    // InternalGame.g:1421:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_41); 

                    				newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_0_2());
                    			
                    // InternalGame.g:1441:4: (otherlv_3= 'connaissances' ( (otherlv_4= 'requises' ( (otherlv_5= RULE_ID ) )* ) | (otherlv_6= 'interdites' ( (otherlv_7= RULE_ID ) )* ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==33) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalGame.g:1442:5: otherlv_3= 'connaissances' ( (otherlv_4= 'requises' ( (otherlv_5= RULE_ID ) )* ) | (otherlv_6= 'interdites' ( (otherlv_7= RULE_ID ) )* ) )
                    	    {
                    	    otherlv_3=(Token)match(input,33,FOLLOW_42); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getConnaissancesKeyword_0_3_0());
                    	    				
                    	    // InternalGame.g:1446:5: ( (otherlv_4= 'requises' ( (otherlv_5= RULE_ID ) )* ) | (otherlv_6= 'interdites' ( (otherlv_7= RULE_ID ) )* ) )
                    	    int alt17=2;
                    	    int LA17_0 = input.LA(1);

                    	    if ( (LA17_0==45) ) {
                    	        alt17=1;
                    	    }
                    	    else if ( (LA17_0==46) ) {
                    	        alt17=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 17, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt17) {
                    	        case 1 :
                    	            // InternalGame.g:1447:6: (otherlv_4= 'requises' ( (otherlv_5= RULE_ID ) )* )
                    	            {
                    	            // InternalGame.g:1447:6: (otherlv_4= 'requises' ( (otherlv_5= RULE_ID ) )* )
                    	            // InternalGame.g:1448:7: otherlv_4= 'requises' ( (otherlv_5= RULE_ID ) )*
                    	            {
                    	            otherlv_4=(Token)match(input,45,FOLLOW_43); 

                    	            							newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getRequisesKeyword_0_3_1_0_0());
                    	            						
                    	            // InternalGame.g:1452:7: ( (otherlv_5= RULE_ID ) )*
                    	            loop15:
                    	            do {
                    	                int alt15=2;
                    	                int LA15_0 = input.LA(1);

                    	                if ( (LA15_0==RULE_ID) ) {
                    	                    alt15=1;
                    	                }


                    	                switch (alt15) {
                    	            	case 1 :
                    	            	    // InternalGame.g:1453:8: (otherlv_5= RULE_ID )
                    	            	    {
                    	            	    // InternalGame.g:1453:8: (otherlv_5= RULE_ID )
                    	            	    // InternalGame.g:1454:9: otherlv_5= RULE_ID
                    	            	    {

                    	            	    									if (current==null) {
                    	            	    										current = createModelElement(grammarAccess.getConditionRule());
                    	            	    									}
                    	            	    								
                    	            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_43); 

                    	            	    									newLeafNode(otherlv_5, grammarAccess.getConditionAccess().getConnaissancesRequisesConnaissanceCrossReference_0_3_1_0_1_0());
                    	            	    								

                    	            	    }


                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    break loop15;
                    	                }
                    	            } while (true);


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalGame.g:1467:6: (otherlv_6= 'interdites' ( (otherlv_7= RULE_ID ) )* )
                    	            {
                    	            // InternalGame.g:1467:6: (otherlv_6= 'interdites' ( (otherlv_7= RULE_ID ) )* )
                    	            // InternalGame.g:1468:7: otherlv_6= 'interdites' ( (otherlv_7= RULE_ID ) )*
                    	            {
                    	            otherlv_6=(Token)match(input,46,FOLLOW_43); 

                    	            							newLeafNode(otherlv_6, grammarAccess.getConditionAccess().getInterditesKeyword_0_3_1_1_0());
                    	            						
                    	            // InternalGame.g:1472:7: ( (otherlv_7= RULE_ID ) )*
                    	            loop16:
                    	            do {
                    	                int alt16=2;
                    	                int LA16_0 = input.LA(1);

                    	                if ( (LA16_0==RULE_ID) ) {
                    	                    alt16=1;
                    	                }


                    	                switch (alt16) {
                    	            	case 1 :
                    	            	    // InternalGame.g:1473:8: (otherlv_7= RULE_ID )
                    	            	    {
                    	            	    // InternalGame.g:1473:8: (otherlv_7= RULE_ID )
                    	            	    // InternalGame.g:1474:9: otherlv_7= RULE_ID
                    	            	    {

                    	            	    									if (current==null) {
                    	            	    										current = createModelElement(grammarAccess.getConditionRule());
                    	            	    									}
                    	            	    								
                    	            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_43); 

                    	            	    									newLeafNode(otherlv_7, grammarAccess.getConditionAccess().getConnaissancesInterditesConnaissanceCrossReference_0_3_1_1_1_0());
                    	            	    								

                    	            	    }


                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    break loop16;
                    	                }
                    	            } while (true);


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    // InternalGame.g:1488:4: ( ( (lv_quantite_8_0= RULE_INT ) ) otherlv_9= 'objets' ( (otherlv_10= 'requis' ( (otherlv_11= RULE_ID ) )* ) | (otherlv_12= 'interdits' ( (otherlv_13= RULE_ID ) )* ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_INT) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalGame.g:1489:5: ( (lv_quantite_8_0= RULE_INT ) ) otherlv_9= 'objets' ( (otherlv_10= 'requis' ( (otherlv_11= RULE_ID ) )* ) | (otherlv_12= 'interdits' ( (otherlv_13= RULE_ID ) )* ) )
                    	    {
                    	    // InternalGame.g:1489:5: ( (lv_quantite_8_0= RULE_INT ) )
                    	    // InternalGame.g:1490:6: (lv_quantite_8_0= RULE_INT )
                    	    {
                    	    // InternalGame.g:1490:6: (lv_quantite_8_0= RULE_INT )
                    	    // InternalGame.g:1491:7: lv_quantite_8_0= RULE_INT
                    	    {
                    	    lv_quantite_8_0=(Token)match(input,RULE_INT,FOLLOW_44); 

                    	    							newLeafNode(lv_quantite_8_0, grammarAccess.getConditionAccess().getQuantiteINTTerminalRuleCall_0_4_0_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getConditionRule());
                    	    							}
                    	    							setWithLastConsumed(
                    	    								current,
                    	    								"quantite",
                    	    								lv_quantite_8_0,
                    	    								"org.eclipse.xtext.common.Terminals.INT");
                    	    						

                    	    }


                    	    }

                    	    otherlv_9=(Token)match(input,31,FOLLOW_45); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getConditionAccess().getObjetsKeyword_0_4_1());
                    	    				
                    	    // InternalGame.g:1511:5: ( (otherlv_10= 'requis' ( (otherlv_11= RULE_ID ) )* ) | (otherlv_12= 'interdits' ( (otherlv_13= RULE_ID ) )* ) )
                    	    int alt21=2;
                    	    int LA21_0 = input.LA(1);

                    	    if ( (LA21_0==47) ) {
                    	        alt21=1;
                    	    }
                    	    else if ( (LA21_0==48) ) {
                    	        alt21=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 21, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt21) {
                    	        case 1 :
                    	            // InternalGame.g:1512:6: (otherlv_10= 'requis' ( (otherlv_11= RULE_ID ) )* )
                    	            {
                    	            // InternalGame.g:1512:6: (otherlv_10= 'requis' ( (otherlv_11= RULE_ID ) )* )
                    	            // InternalGame.g:1513:7: otherlv_10= 'requis' ( (otherlv_11= RULE_ID ) )*
                    	            {
                    	            otherlv_10=(Token)match(input,47,FOLLOW_46); 

                    	            							newLeafNode(otherlv_10, grammarAccess.getConditionAccess().getRequisKeyword_0_4_2_0_0());
                    	            						
                    	            // InternalGame.g:1517:7: ( (otherlv_11= RULE_ID ) )*
                    	            loop19:
                    	            do {
                    	                int alt19=2;
                    	                int LA19_0 = input.LA(1);

                    	                if ( (LA19_0==RULE_ID) ) {
                    	                    alt19=1;
                    	                }


                    	                switch (alt19) {
                    	            	case 1 :
                    	            	    // InternalGame.g:1518:8: (otherlv_11= RULE_ID )
                    	            	    {
                    	            	    // InternalGame.g:1518:8: (otherlv_11= RULE_ID )
                    	            	    // InternalGame.g:1519:9: otherlv_11= RULE_ID
                    	            	    {

                    	            	    									if (current==null) {
                    	            	    										current = createModelElement(grammarAccess.getConditionRule());
                    	            	    									}
                    	            	    								
                    	            	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_46); 

                    	            	    									newLeafNode(otherlv_11, grammarAccess.getConditionAccess().getObjetsRequisObjetCrossReference_0_4_2_0_1_0());
                    	            	    								

                    	            	    }


                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    break loop19;
                    	                }
                    	            } while (true);


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalGame.g:1532:6: (otherlv_12= 'interdits' ( (otherlv_13= RULE_ID ) )* )
                    	            {
                    	            // InternalGame.g:1532:6: (otherlv_12= 'interdits' ( (otherlv_13= RULE_ID ) )* )
                    	            // InternalGame.g:1533:7: otherlv_12= 'interdits' ( (otherlv_13= RULE_ID ) )*
                    	            {
                    	            otherlv_12=(Token)match(input,48,FOLLOW_46); 

                    	            							newLeafNode(otherlv_12, grammarAccess.getConditionAccess().getInterditsKeyword_0_4_2_1_0());
                    	            						
                    	            // InternalGame.g:1537:7: ( (otherlv_13= RULE_ID ) )*
                    	            loop20:
                    	            do {
                    	                int alt20=2;
                    	                int LA20_0 = input.LA(1);

                    	                if ( (LA20_0==RULE_ID) ) {
                    	                    alt20=1;
                    	                }


                    	                switch (alt20) {
                    	            	case 1 :
                    	            	    // InternalGame.g:1538:8: (otherlv_13= RULE_ID )
                    	            	    {
                    	            	    // InternalGame.g:1538:8: (otherlv_13= RULE_ID )
                    	            	    // InternalGame.g:1539:9: otherlv_13= RULE_ID
                    	            	    {

                    	            	    									if (current==null) {
                    	            	    										current = createModelElement(grammarAccess.getConditionRule());
                    	            	    									}
                    	            	    								
                    	            	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_46); 

                    	            	    									newLeafNode(otherlv_13, grammarAccess.getConditionAccess().getObjetsInterditsObjetCrossReference_0_4_2_1_1_0());
                    	            	    								

                    	            	    }


                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    break loop20;
                    	                }
                    	            } while (true);


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_0_5());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:1559:3: this_BOOL_15= RULE_BOOL
                    {
                    this_BOOL_15=(Token)match(input,RULE_BOOL,FOLLOW_2); 

                    			newLeafNode(this_BOOL_15, grammarAccess.getConditionAccess().getBOOLTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "ruleNature"
    // InternalGame.g:1567:1: ruleNature returns [Enumerator current=null] : ( (enumLiteral_0= 'depart' ) | (enumLiteral_1= 'fin' ) | (enumLiteral_2= 'intermediaire' ) ) ;
    public final Enumerator ruleNature() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGame.g:1573:2: ( ( (enumLiteral_0= 'depart' ) | (enumLiteral_1= 'fin' ) | (enumLiteral_2= 'intermediaire' ) ) )
            // InternalGame.g:1574:2: ( (enumLiteral_0= 'depart' ) | (enumLiteral_1= 'fin' ) | (enumLiteral_2= 'intermediaire' ) )
            {
            // InternalGame.g:1574:2: ( (enumLiteral_0= 'depart' ) | (enumLiteral_1= 'fin' ) | (enumLiteral_2= 'intermediaire' ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt24=1;
                }
                break;
            case 50:
                {
                alt24=2;
                }
                break;
            case 51:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalGame.g:1575:3: (enumLiteral_0= 'depart' )
                    {
                    // InternalGame.g:1575:3: (enumLiteral_0= 'depart' )
                    // InternalGame.g:1576:4: enumLiteral_0= 'depart'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getNatureAccess().getDepartEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNatureAccess().getDepartEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:1583:3: (enumLiteral_1= 'fin' )
                    {
                    // InternalGame.g:1583:3: (enumLiteral_1= 'fin' )
                    // InternalGame.g:1584:4: enumLiteral_1= 'fin'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getNatureAccess().getFinEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNatureAccess().getFinEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:1591:3: (enumLiteral_2= 'intermediaire' )
                    {
                    // InternalGame.g:1591:3: (enumLiteral_2= 'intermediaire' )
                    // InternalGame.g:1592:4: enumLiteral_2= 'intermediaire'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000C01054000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000C01050000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000E000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000100000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000280004000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400004000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000004000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000C0000004000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000200004020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000200004030L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000004030L});

}