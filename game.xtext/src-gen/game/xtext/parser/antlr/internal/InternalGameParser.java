package game.xtext.parser.antlr.internal;

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
import game.xtext.services.GameGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGameParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Jeu'", "'{'", "','", "'}'", "'Territoire'", "'places'", "'Explorateur'", "'taille'", "'localisation'", "'objets'", "'connaissances'", "'Lieu'", "'nature'", "'personnes'", "'obligatoire'", "'Chemin'", "'pred'", "'succ'", "'visible'", "'ouvert'", "'Personne'", "'place'", "'interactions'", "'active'", "'ConditionPersonne'", "'connaissanceRequise'", "'connaissanceInterdite'", "'objetRequis'", "'objetInterdit'", "'Interaction'", "'question'", "'personne'", "'choix'", "'Connaissance'", "'actif'", "'transformable'", "'Objet'", "'qte'", "'ConditionAvantage'", "'bonne'", "'Choix'", "'reponse'", "'connaisDon'", "'interaction'", "'objetCons'", "'objetDon'", "'QteObjet'", "'objet'", "'-'", "'ConditionChemin'", "'depart'", "'fin'", "'inter'"
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
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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
    public static final int RULE_STRING=5;
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
    // InternalGame.g:72:1: ruleJeu returns [EObject current=null] : ( () otherlv_1= 'Jeu' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_territoire_4_0= ruleTerritoire ) ) ( (lv_explorateur_5_0= ruleExplorateur ) ) ( (lv_elementsjeu_6_0= ruleElementsJeu ) ) (otherlv_7= ',' ( (lv_elementsjeu_8_0= ruleElementsJeu ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleJeu() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_territoire_4_0 = null;

        EObject lv_explorateur_5_0 = null;

        EObject lv_elementsjeu_6_0 = null;

        EObject lv_elementsjeu_8_0 = null;



        	enterRule();

        try {
            // InternalGame.g:78:2: ( ( () otherlv_1= 'Jeu' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_territoire_4_0= ruleTerritoire ) ) ( (lv_explorateur_5_0= ruleExplorateur ) ) ( (lv_elementsjeu_6_0= ruleElementsJeu ) ) (otherlv_7= ',' ( (lv_elementsjeu_8_0= ruleElementsJeu ) ) )* otherlv_9= '}' ) )
            // InternalGame.g:79:2: ( () otherlv_1= 'Jeu' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_territoire_4_0= ruleTerritoire ) ) ( (lv_explorateur_5_0= ruleExplorateur ) ) ( (lv_elementsjeu_6_0= ruleElementsJeu ) ) (otherlv_7= ',' ( (lv_elementsjeu_8_0= ruleElementsJeu ) ) )* otherlv_9= '}' )
            {
            // InternalGame.g:79:2: ( () otherlv_1= 'Jeu' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_territoire_4_0= ruleTerritoire ) ) ( (lv_explorateur_5_0= ruleExplorateur ) ) ( (lv_elementsjeu_6_0= ruleElementsJeu ) ) (otherlv_7= ',' ( (lv_elementsjeu_8_0= ruleElementsJeu ) ) )* otherlv_9= '}' )
            // InternalGame.g:80:3: () otherlv_1= 'Jeu' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_territoire_4_0= ruleTerritoire ) ) ( (lv_explorateur_5_0= ruleExplorateur ) ) ( (lv_elementsjeu_6_0= ruleElementsJeu ) ) (otherlv_7= ',' ( (lv_elementsjeu_8_0= ruleElementsJeu ) ) )* otherlv_9= '}'
            {
            // InternalGame.g:80:3: ()
            // InternalGame.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJeuAccess().getJeuAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getJeuAccess().getJeuKeyword_1());
            		
            // InternalGame.g:91:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGame.g:92:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGame.g:92:4: (lv_name_2_0= RULE_ID )
            // InternalGame.g:93:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getJeuAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJeuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGame.g:113:3: ( (lv_territoire_4_0= ruleTerritoire ) )
            // InternalGame.g:114:4: (lv_territoire_4_0= ruleTerritoire )
            {
            // InternalGame.g:114:4: (lv_territoire_4_0= ruleTerritoire )
            // InternalGame.g:115:5: lv_territoire_4_0= ruleTerritoire
            {

            					newCompositeNode(grammarAccess.getJeuAccess().getTerritoireTerritoireParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_territoire_4_0=ruleTerritoire();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJeuRule());
            					}
            					set(
            						current,
            						"territoire",
            						lv_territoire_4_0,
            						"game.xtext.Game.Territoire");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:132:3: ( (lv_explorateur_5_0= ruleExplorateur ) )
            // InternalGame.g:133:4: (lv_explorateur_5_0= ruleExplorateur )
            {
            // InternalGame.g:133:4: (lv_explorateur_5_0= ruleExplorateur )
            // InternalGame.g:134:5: lv_explorateur_5_0= ruleExplorateur
            {

            					newCompositeNode(grammarAccess.getJeuAccess().getExplorateurExplorateurParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_explorateur_5_0=ruleExplorateur();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJeuRule());
            					}
            					set(
            						current,
            						"explorateur",
            						lv_explorateur_5_0,
            						"game.xtext.Game.Explorateur");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:151:3: ( (lv_elementsjeu_6_0= ruleElementsJeu ) )
            // InternalGame.g:152:4: (lv_elementsjeu_6_0= ruleElementsJeu )
            {
            // InternalGame.g:152:4: (lv_elementsjeu_6_0= ruleElementsJeu )
            // InternalGame.g:153:5: lv_elementsjeu_6_0= ruleElementsJeu
            {

            					newCompositeNode(grammarAccess.getJeuAccess().getElementsjeuElementsJeuParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_elementsjeu_6_0=ruleElementsJeu();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJeuRule());
            					}
            					add(
            						current,
            						"elementsjeu",
            						lv_elementsjeu_6_0,
            						"game.xtext.Game.ElementsJeu");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:170:3: (otherlv_7= ',' ( (lv_elementsjeu_8_0= ruleElementsJeu ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGame.g:171:4: otherlv_7= ',' ( (lv_elementsjeu_8_0= ruleElementsJeu ) )
            	    {
            	    otherlv_7=(Token)match(input,13,FOLLOW_7); 

            	    				newLeafNode(otherlv_7, grammarAccess.getJeuAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalGame.g:175:4: ( (lv_elementsjeu_8_0= ruleElementsJeu ) )
            	    // InternalGame.g:176:5: (lv_elementsjeu_8_0= ruleElementsJeu )
            	    {
            	    // InternalGame.g:176:5: (lv_elementsjeu_8_0= ruleElementsJeu )
            	    // InternalGame.g:177:6: lv_elementsjeu_8_0= ruleElementsJeu
            	    {

            	    						newCompositeNode(grammarAccess.getJeuAccess().getElementsjeuElementsJeuParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_elementsjeu_8_0=ruleElementsJeu();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJeuRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elementsjeu",
            	    							lv_elementsjeu_8_0,
            	    							"game.xtext.Game.ElementsJeu");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalGame.g:203:1: entryRuleElementsJeu returns [EObject current=null] : iv_ruleElementsJeu= ruleElementsJeu EOF ;
    public final EObject entryRuleElementsJeu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementsJeu = null;


        try {
            // InternalGame.g:203:52: (iv_ruleElementsJeu= ruleElementsJeu EOF )
            // InternalGame.g:204:2: iv_ruleElementsJeu= ruleElementsJeu EOF
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
    // InternalGame.g:210:1: ruleElementsJeu returns [EObject current=null] : (this_Place_0= rulePlace | this_QteObjet_1= ruleQteObjet | this_Personne_2= rulePersonne | this_Connaissance_3= ruleConnaissance | this_Objet_4= ruleObjet | this_Interaction_5= ruleInteraction | this_Choix_6= ruleChoix | this_ConditionPersonne_7= ruleConditionPersonne | this_ConditionAvantage_8= ruleConditionAvantage | this_ConditionChemin_9= ruleConditionChemin ) ;
    public final EObject ruleElementsJeu() throws RecognitionException {
        EObject current = null;

        EObject this_Place_0 = null;

        EObject this_QteObjet_1 = null;

        EObject this_Personne_2 = null;

        EObject this_Connaissance_3 = null;

        EObject this_Objet_4 = null;

        EObject this_Interaction_5 = null;

        EObject this_Choix_6 = null;

        EObject this_ConditionPersonne_7 = null;

        EObject this_ConditionAvantage_8 = null;

        EObject this_ConditionChemin_9 = null;



        	enterRule();

        try {
            // InternalGame.g:216:2: ( (this_Place_0= rulePlace | this_QteObjet_1= ruleQteObjet | this_Personne_2= rulePersonne | this_Connaissance_3= ruleConnaissance | this_Objet_4= ruleObjet | this_Interaction_5= ruleInteraction | this_Choix_6= ruleChoix | this_ConditionPersonne_7= ruleConditionPersonne | this_ConditionAvantage_8= ruleConditionAvantage | this_ConditionChemin_9= ruleConditionChemin ) )
            // InternalGame.g:217:2: (this_Place_0= rulePlace | this_QteObjet_1= ruleQteObjet | this_Personne_2= rulePersonne | this_Connaissance_3= ruleConnaissance | this_Objet_4= ruleObjet | this_Interaction_5= ruleInteraction | this_Choix_6= ruleChoix | this_ConditionPersonne_7= ruleConditionPersonne | this_ConditionAvantage_8= ruleConditionAvantage | this_ConditionChemin_9= ruleConditionChemin )
            {
            // InternalGame.g:217:2: (this_Place_0= rulePlace | this_QteObjet_1= ruleQteObjet | this_Personne_2= rulePersonne | this_Connaissance_3= ruleConnaissance | this_Objet_4= ruleObjet | this_Interaction_5= ruleInteraction | this_Choix_6= ruleChoix | this_ConditionPersonne_7= ruleConditionPersonne | this_ConditionAvantage_8= ruleConditionAvantage | this_ConditionChemin_9= ruleConditionChemin )
            int alt2=10;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalGame.g:218:3: this_Place_0= rulePlace
                    {

                    			newCompositeNode(grammarAccess.getElementsJeuAccess().getPlaceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Place_0=rulePlace();

                    state._fsp--;


                    			current = this_Place_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGame.g:227:3: this_QteObjet_1= ruleQteObjet
                    {

                    			newCompositeNode(grammarAccess.getElementsJeuAccess().getQteObjetParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_QteObjet_1=ruleQteObjet();

                    state._fsp--;


                    			current = this_QteObjet_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGame.g:236:3: this_Personne_2= rulePersonne
                    {

                    			newCompositeNode(grammarAccess.getElementsJeuAccess().getPersonneParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Personne_2=rulePersonne();

                    state._fsp--;


                    			current = this_Personne_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalGame.g:245:3: this_Connaissance_3= ruleConnaissance
                    {

                    			newCompositeNode(grammarAccess.getElementsJeuAccess().getConnaissanceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Connaissance_3=ruleConnaissance();

                    state._fsp--;


                    			current = this_Connaissance_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalGame.g:254:3: this_Objet_4= ruleObjet
                    {

                    			newCompositeNode(grammarAccess.getElementsJeuAccess().getObjetParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Objet_4=ruleObjet();

                    state._fsp--;


                    			current = this_Objet_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalGame.g:263:3: this_Interaction_5= ruleInteraction
                    {

                    			newCompositeNode(grammarAccess.getElementsJeuAccess().getInteractionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interaction_5=ruleInteraction();

                    state._fsp--;


                    			current = this_Interaction_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalGame.g:272:3: this_Choix_6= ruleChoix
                    {

                    			newCompositeNode(grammarAccess.getElementsJeuAccess().getChoixParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Choix_6=ruleChoix();

                    state._fsp--;


                    			current = this_Choix_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalGame.g:281:3: this_ConditionPersonne_7= ruleConditionPersonne
                    {

                    			newCompositeNode(grammarAccess.getElementsJeuAccess().getConditionPersonneParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConditionPersonne_7=ruleConditionPersonne();

                    state._fsp--;


                    			current = this_ConditionPersonne_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalGame.g:290:3: this_ConditionAvantage_8= ruleConditionAvantage
                    {

                    			newCompositeNode(grammarAccess.getElementsJeuAccess().getConditionAvantageParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConditionAvantage_8=ruleConditionAvantage();

                    state._fsp--;


                    			current = this_ConditionAvantage_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalGame.g:299:3: this_ConditionChemin_9= ruleConditionChemin
                    {

                    			newCompositeNode(grammarAccess.getElementsJeuAccess().getConditionCheminParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConditionChemin_9=ruleConditionChemin();

                    state._fsp--;


                    			current = this_ConditionChemin_9;
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
    // InternalGame.g:311:1: entryRulePlace returns [EObject current=null] : iv_rulePlace= rulePlace EOF ;
    public final EObject entryRulePlace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlace = null;


        try {
            // InternalGame.g:311:46: (iv_rulePlace= rulePlace EOF )
            // InternalGame.g:312:2: iv_rulePlace= rulePlace EOF
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
    // InternalGame.g:318:1: rulePlace returns [EObject current=null] : (this_Lieu_0= ruleLieu | this_Chemin_1= ruleChemin ) ;
    public final EObject rulePlace() throws RecognitionException {
        EObject current = null;

        EObject this_Lieu_0 = null;

        EObject this_Chemin_1 = null;



        	enterRule();

        try {
            // InternalGame.g:324:2: ( (this_Lieu_0= ruleLieu | this_Chemin_1= ruleChemin ) )
            // InternalGame.g:325:2: (this_Lieu_0= ruleLieu | this_Chemin_1= ruleChemin )
            {
            // InternalGame.g:325:2: (this_Lieu_0= ruleLieu | this_Chemin_1= ruleChemin )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=25 && LA3_0<=26)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGame.g:326:3: this_Lieu_0= ruleLieu
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
                    // InternalGame.g:335:3: this_Chemin_1= ruleChemin
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


    // $ANTLR start "entryRuleTerritoire"
    // InternalGame.g:347:1: entryRuleTerritoire returns [EObject current=null] : iv_ruleTerritoire= ruleTerritoire EOF ;
    public final EObject entryRuleTerritoire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerritoire = null;


        try {
            // InternalGame.g:347:51: (iv_ruleTerritoire= ruleTerritoire EOF )
            // InternalGame.g:348:2: iv_ruleTerritoire= ruleTerritoire EOF
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
    // InternalGame.g:354:1: ruleTerritoire returns [EObject current=null] : ( () otherlv_1= 'Territoire' otherlv_2= '{' otherlv_3= 'places' ( (lv_places_4_0= rulePlace ) ) (otherlv_5= ',' ( (lv_places_6_0= rulePlace ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleTerritoire() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_places_4_0 = null;

        EObject lv_places_6_0 = null;



        	enterRule();

        try {
            // InternalGame.g:360:2: ( ( () otherlv_1= 'Territoire' otherlv_2= '{' otherlv_3= 'places' ( (lv_places_4_0= rulePlace ) ) (otherlv_5= ',' ( (lv_places_6_0= rulePlace ) ) )* otherlv_7= '}' ) )
            // InternalGame.g:361:2: ( () otherlv_1= 'Territoire' otherlv_2= '{' otherlv_3= 'places' ( (lv_places_4_0= rulePlace ) ) (otherlv_5= ',' ( (lv_places_6_0= rulePlace ) ) )* otherlv_7= '}' )
            {
            // InternalGame.g:361:2: ( () otherlv_1= 'Territoire' otherlv_2= '{' otherlv_3= 'places' ( (lv_places_4_0= rulePlace ) ) (otherlv_5= ',' ( (lv_places_6_0= rulePlace ) ) )* otherlv_7= '}' )
            // InternalGame.g:362:3: () otherlv_1= 'Territoire' otherlv_2= '{' otherlv_3= 'places' ( (lv_places_4_0= rulePlace ) ) (otherlv_5= ',' ( (lv_places_6_0= rulePlace ) ) )* otherlv_7= '}'
            {
            // InternalGame.g:362:3: ()
            // InternalGame.g:363:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTerritoireAccess().getTerritoireAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTerritoireAccess().getTerritoireKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getTerritoireAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getTerritoireAccess().getPlacesKeyword_3());
            		
            // InternalGame.g:381:3: ( (lv_places_4_0= rulePlace ) )
            // InternalGame.g:382:4: (lv_places_4_0= rulePlace )
            {
            // InternalGame.g:382:4: (lv_places_4_0= rulePlace )
            // InternalGame.g:383:5: lv_places_4_0= rulePlace
            {

            					newCompositeNode(grammarAccess.getTerritoireAccess().getPlacesPlaceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_places_4_0=rulePlace();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTerritoireRule());
            					}
            					add(
            						current,
            						"places",
            						lv_places_4_0,
            						"game.xtext.Game.Place");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:400:3: (otherlv_5= ',' ( (lv_places_6_0= rulePlace ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGame.g:401:4: otherlv_5= ',' ( (lv_places_6_0= rulePlace ) )
            	    {
            	    otherlv_5=(Token)match(input,13,FOLLOW_10); 

            	    				newLeafNode(otherlv_5, grammarAccess.getTerritoireAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalGame.g:405:4: ( (lv_places_6_0= rulePlace ) )
            	    // InternalGame.g:406:5: (lv_places_6_0= rulePlace )
            	    {
            	    // InternalGame.g:406:5: (lv_places_6_0= rulePlace )
            	    // InternalGame.g:407:6: lv_places_6_0= rulePlace
            	    {

            	    						newCompositeNode(grammarAccess.getTerritoireAccess().getPlacesPlaceParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_places_6_0=rulePlace();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTerritoireRule());
            	    						}
            	    						add(
            	    							current,
            	    							"places",
            	    							lv_places_6_0,
            	    							"game.xtext.Game.Place");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTerritoireAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleExplorateur"
    // InternalGame.g:433:1: entryRuleExplorateur returns [EObject current=null] : iv_ruleExplorateur= ruleExplorateur EOF ;
    public final EObject entryRuleExplorateur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplorateur = null;


        try {
            // InternalGame.g:433:52: (iv_ruleExplorateur= ruleExplorateur EOF )
            // InternalGame.g:434:2: iv_ruleExplorateur= ruleExplorateur EOF
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
    // InternalGame.g:440:1: ruleExplorateur returns [EObject current=null] : ( () otherlv_1= 'Explorateur' otherlv_2= '{' otherlv_3= 'taille' ( (lv_tailleDispo_4_0= ruleEInt ) ) otherlv_5= 'localisation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'objets' ( (lv_objets_8_0= ruleObjet ) ) (otherlv_9= ',' ( (lv_objets_10_0= ruleObjet ) ) )* )? (otherlv_11= 'connaissances' ( (lv_connaissances_12_0= ruleConnaissance ) ) (otherlv_13= ',' ( (lv_connaissances_14_0= ruleConnaissance ) ) )* )? otherlv_15= '}' ) ;
    public final EObject ruleExplorateur() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_tailleDispo_4_0 = null;

        EObject lv_objets_8_0 = null;

        EObject lv_objets_10_0 = null;

        EObject lv_connaissances_12_0 = null;

        EObject lv_connaissances_14_0 = null;



        	enterRule();

        try {
            // InternalGame.g:446:2: ( ( () otherlv_1= 'Explorateur' otherlv_2= '{' otherlv_3= 'taille' ( (lv_tailleDispo_4_0= ruleEInt ) ) otherlv_5= 'localisation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'objets' ( (lv_objets_8_0= ruleObjet ) ) (otherlv_9= ',' ( (lv_objets_10_0= ruleObjet ) ) )* )? (otherlv_11= 'connaissances' ( (lv_connaissances_12_0= ruleConnaissance ) ) (otherlv_13= ',' ( (lv_connaissances_14_0= ruleConnaissance ) ) )* )? otherlv_15= '}' ) )
            // InternalGame.g:447:2: ( () otherlv_1= 'Explorateur' otherlv_2= '{' otherlv_3= 'taille' ( (lv_tailleDispo_4_0= ruleEInt ) ) otherlv_5= 'localisation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'objets' ( (lv_objets_8_0= ruleObjet ) ) (otherlv_9= ',' ( (lv_objets_10_0= ruleObjet ) ) )* )? (otherlv_11= 'connaissances' ( (lv_connaissances_12_0= ruleConnaissance ) ) (otherlv_13= ',' ( (lv_connaissances_14_0= ruleConnaissance ) ) )* )? otherlv_15= '}' )
            {
            // InternalGame.g:447:2: ( () otherlv_1= 'Explorateur' otherlv_2= '{' otherlv_3= 'taille' ( (lv_tailleDispo_4_0= ruleEInt ) ) otherlv_5= 'localisation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'objets' ( (lv_objets_8_0= ruleObjet ) ) (otherlv_9= ',' ( (lv_objets_10_0= ruleObjet ) ) )* )? (otherlv_11= 'connaissances' ( (lv_connaissances_12_0= ruleConnaissance ) ) (otherlv_13= ',' ( (lv_connaissances_14_0= ruleConnaissance ) ) )* )? otherlv_15= '}' )
            // InternalGame.g:448:3: () otherlv_1= 'Explorateur' otherlv_2= '{' otherlv_3= 'taille' ( (lv_tailleDispo_4_0= ruleEInt ) ) otherlv_5= 'localisation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'objets' ( (lv_objets_8_0= ruleObjet ) ) (otherlv_9= ',' ( (lv_objets_10_0= ruleObjet ) ) )* )? (otherlv_11= 'connaissances' ( (lv_connaissances_12_0= ruleConnaissance ) ) (otherlv_13= ',' ( (lv_connaissances_14_0= ruleConnaissance ) ) )* )? otherlv_15= '}'
            {
            // InternalGame.g:448:3: ()
            // InternalGame.g:449:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExplorateurAccess().getExplorateurAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getExplorateurAccess().getExplorateurKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getExplorateurAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getExplorateurAccess().getTailleKeyword_3());
            		
            // InternalGame.g:467:3: ( (lv_tailleDispo_4_0= ruleEInt ) )
            // InternalGame.g:468:4: (lv_tailleDispo_4_0= ruleEInt )
            {
            // InternalGame.g:468:4: (lv_tailleDispo_4_0= ruleEInt )
            // InternalGame.g:469:5: lv_tailleDispo_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getExplorateurAccess().getTailleDispoEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_tailleDispo_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExplorateurRule());
            					}
            					set(
            						current,
            						"tailleDispo",
            						lv_tailleDispo_4_0,
            						"game.xtext.Game.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getExplorateurAccess().getLocalisationKeyword_5());
            		
            // InternalGame.g:490:3: ( (otherlv_6= RULE_ID ) )
            // InternalGame.g:491:4: (otherlv_6= RULE_ID )
            {
            // InternalGame.g:491:4: (otherlv_6= RULE_ID )
            // InternalGame.g:492:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExplorateurRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_6, grammarAccess.getExplorateurAccess().getPlacePlaceCrossReference_6_0());
            				

            }


            }

            // InternalGame.g:503:3: (otherlv_7= 'objets' ( (lv_objets_8_0= ruleObjet ) ) (otherlv_9= ',' ( (lv_objets_10_0= ruleObjet ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGame.g:504:4: otherlv_7= 'objets' ( (lv_objets_8_0= ruleObjet ) ) (otherlv_9= ',' ( (lv_objets_10_0= ruleObjet ) ) )*
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getExplorateurAccess().getObjetsKeyword_7_0());
                    			
                    // InternalGame.g:508:4: ( (lv_objets_8_0= ruleObjet ) )
                    // InternalGame.g:509:5: (lv_objets_8_0= ruleObjet )
                    {
                    // InternalGame.g:509:5: (lv_objets_8_0= ruleObjet )
                    // InternalGame.g:510:6: lv_objets_8_0= ruleObjet
                    {

                    						newCompositeNode(grammarAccess.getExplorateurAccess().getObjetsObjetParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_objets_8_0=ruleObjet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExplorateurRule());
                    						}
                    						add(
                    							current,
                    							"objets",
                    							lv_objets_8_0,
                    							"game.xtext.Game.Objet");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGame.g:527:4: (otherlv_9= ',' ( (lv_objets_10_0= ruleObjet ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==13) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalGame.g:528:5: otherlv_9= ',' ( (lv_objets_10_0= ruleObjet ) )
                    	    {
                    	    otherlv_9=(Token)match(input,13,FOLLOW_15); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getExplorateurAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalGame.g:532:5: ( (lv_objets_10_0= ruleObjet ) )
                    	    // InternalGame.g:533:6: (lv_objets_10_0= ruleObjet )
                    	    {
                    	    // InternalGame.g:533:6: (lv_objets_10_0= ruleObjet )
                    	    // InternalGame.g:534:7: lv_objets_10_0= ruleObjet
                    	    {

                    	    							newCompositeNode(grammarAccess.getExplorateurAccess().getObjetsObjetParserRuleCall_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_objets_10_0=ruleObjet();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExplorateurRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"objets",
                    	    								lv_objets_10_0,
                    	    								"game.xtext.Game.Objet");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalGame.g:553:3: (otherlv_11= 'connaissances' ( (lv_connaissances_12_0= ruleConnaissance ) ) (otherlv_13= ',' ( (lv_connaissances_14_0= ruleConnaissance ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGame.g:554:4: otherlv_11= 'connaissances' ( (lv_connaissances_12_0= ruleConnaissance ) ) (otherlv_13= ',' ( (lv_connaissances_14_0= ruleConnaissance ) ) )*
                    {
                    otherlv_11=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getExplorateurAccess().getConnaissancesKeyword_8_0());
                    			
                    // InternalGame.g:558:4: ( (lv_connaissances_12_0= ruleConnaissance ) )
                    // InternalGame.g:559:5: (lv_connaissances_12_0= ruleConnaissance )
                    {
                    // InternalGame.g:559:5: (lv_connaissances_12_0= ruleConnaissance )
                    // InternalGame.g:560:6: lv_connaissances_12_0= ruleConnaissance
                    {

                    						newCompositeNode(grammarAccess.getExplorateurAccess().getConnaissancesConnaissanceParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_connaissances_12_0=ruleConnaissance();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExplorateurRule());
                    						}
                    						add(
                    							current,
                    							"connaissances",
                    							lv_connaissances_12_0,
                    							"game.xtext.Game.Connaissance");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGame.g:577:4: (otherlv_13= ',' ( (lv_connaissances_14_0= ruleConnaissance ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==13) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalGame.g:578:5: otherlv_13= ',' ( (lv_connaissances_14_0= ruleConnaissance ) )
                    	    {
                    	    otherlv_13=(Token)match(input,13,FOLLOW_17); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getExplorateurAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalGame.g:582:5: ( (lv_connaissances_14_0= ruleConnaissance ) )
                    	    // InternalGame.g:583:6: (lv_connaissances_14_0= ruleConnaissance )
                    	    {
                    	    // InternalGame.g:583:6: (lv_connaissances_14_0= ruleConnaissance )
                    	    // InternalGame.g:584:7: lv_connaissances_14_0= ruleConnaissance
                    	    {

                    	    							newCompositeNode(grammarAccess.getExplorateurAccess().getConnaissancesConnaissanceParserRuleCall_8_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_connaissances_14_0=ruleConnaissance();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExplorateurRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"connaissances",
                    	    								lv_connaissances_14_0,
                    	    								"game.xtext.Game.Connaissance");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


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

            otherlv_15=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getExplorateurAccess().getRightCurlyBracketKeyword_9());
            		

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


    // $ANTLR start "entryRuleLieu"
    // InternalGame.g:611:1: entryRuleLieu returns [EObject current=null] : iv_ruleLieu= ruleLieu EOF ;
    public final EObject entryRuleLieu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLieu = null;


        try {
            // InternalGame.g:611:45: (iv_ruleLieu= ruleLieu EOF )
            // InternalGame.g:612:2: iv_ruleLieu= ruleLieu EOF
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
    // InternalGame.g:618:1: ruleLieu returns [EObject current=null] : ( () otherlv_1= 'Lieu' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'nature' ( (lv_nature_5_0= ruleNature ) ) (otherlv_6= 'personnes' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= '}' ) ;
    public final EObject ruleLieu() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Enumerator lv_nature_5_0 = null;



        	enterRule();

        try {
            // InternalGame.g:624:2: ( ( () otherlv_1= 'Lieu' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'nature' ( (lv_nature_5_0= ruleNature ) ) (otherlv_6= 'personnes' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= '}' ) )
            // InternalGame.g:625:2: ( () otherlv_1= 'Lieu' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'nature' ( (lv_nature_5_0= ruleNature ) ) (otherlv_6= 'personnes' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= '}' )
            {
            // InternalGame.g:625:2: ( () otherlv_1= 'Lieu' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'nature' ( (lv_nature_5_0= ruleNature ) ) (otherlv_6= 'personnes' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= '}' )
            // InternalGame.g:626:3: () otherlv_1= 'Lieu' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'nature' ( (lv_nature_5_0= ruleNature ) ) (otherlv_6= 'personnes' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= '}'
            {
            // InternalGame.g:626:3: ()
            // InternalGame.g:627:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLieuAccess().getLieuAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLieuAccess().getLieuKeyword_1());
            		
            // InternalGame.g:637:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGame.g:638:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGame.g:638:4: (lv_name_2_0= RULE_ID )
            // InternalGame.g:639:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getLieuAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLieuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getLieuAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getLieuAccess().getNatureKeyword_4());
            		
            // InternalGame.g:663:3: ( (lv_nature_5_0= ruleNature ) )
            // InternalGame.g:664:4: (lv_nature_5_0= ruleNature )
            {
            // InternalGame.g:664:4: (lv_nature_5_0= ruleNature )
            // InternalGame.g:665:5: lv_nature_5_0= ruleNature
            {

            					newCompositeNode(grammarAccess.getLieuAccess().getNatureNatureEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_20);
            lv_nature_5_0=ruleNature();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLieuRule());
            					}
            					set(
            						current,
            						"nature",
            						lv_nature_5_0,
            						"game.xtext.Game.Nature");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:682:3: (otherlv_6= 'personnes' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGame.g:683:4: otherlv_6= 'personnes' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getLieuAccess().getPersonnesKeyword_6_0());
                    			
                    // InternalGame.g:687:4: ( (otherlv_7= RULE_ID ) )
                    // InternalGame.g:688:5: (otherlv_7= RULE_ID )
                    {
                    // InternalGame.g:688:5: (otherlv_7= RULE_ID )
                    // InternalGame.g:689:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLieuRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_7, grammarAccess.getLieuAccess().getPersonnesPersonneCrossReference_6_1_0());
                    					

                    }


                    }

                    // InternalGame.g:700:4: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==13) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalGame.g:701:5: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,13,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getLieuAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalGame.g:705:5: ( (otherlv_9= RULE_ID ) )
                    	    // InternalGame.g:706:6: (otherlv_9= RULE_ID )
                    	    {
                    	    // InternalGame.g:706:6: (otherlv_9= RULE_ID )
                    	    // InternalGame.g:707:7: otherlv_9= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getLieuRule());
                    	    							}
                    	    						
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_8); 

                    	    							newLeafNode(otherlv_9, grammarAccess.getLieuAccess().getPersonnesPersonneCrossReference_6_2_1_0());
                    	    						

                    	    }


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

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getLieuAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalGame.g:728:1: entryRuleChemin returns [EObject current=null] : iv_ruleChemin= ruleChemin EOF ;
    public final EObject entryRuleChemin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChemin = null;


        try {
            // InternalGame.g:728:47: (iv_ruleChemin= ruleChemin EOF )
            // InternalGame.g:729:2: iv_ruleChemin= ruleChemin EOF
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
    // InternalGame.g:735:1: ruleChemin returns [EObject current=null] : ( () ( (lv_obligatoire_1_0= 'obligatoire' ) )? otherlv_2= 'Chemin' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'pred' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'succ' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'visible' ( (lv_visible_10_0= ruleConditionChemin ) ) (otherlv_11= ',' ( (lv_visible_12_0= ruleConditionChemin ) ) )* )? (otherlv_13= 'ouvert' ( (lv_ouvert_14_0= ruleConditionChemin ) ) (otherlv_15= ',' ( (lv_ouvert_16_0= ruleConditionChemin ) ) )* )? otherlv_17= '}' ) ;
    public final EObject ruleChemin() throws RecognitionException {
        EObject current = null;

        Token lv_obligatoire_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_visible_10_0 = null;

        EObject lv_visible_12_0 = null;

        EObject lv_ouvert_14_0 = null;

        EObject lv_ouvert_16_0 = null;



        	enterRule();

        try {
            // InternalGame.g:741:2: ( ( () ( (lv_obligatoire_1_0= 'obligatoire' ) )? otherlv_2= 'Chemin' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'pred' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'succ' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'visible' ( (lv_visible_10_0= ruleConditionChemin ) ) (otherlv_11= ',' ( (lv_visible_12_0= ruleConditionChemin ) ) )* )? (otherlv_13= 'ouvert' ( (lv_ouvert_14_0= ruleConditionChemin ) ) (otherlv_15= ',' ( (lv_ouvert_16_0= ruleConditionChemin ) ) )* )? otherlv_17= '}' ) )
            // InternalGame.g:742:2: ( () ( (lv_obligatoire_1_0= 'obligatoire' ) )? otherlv_2= 'Chemin' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'pred' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'succ' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'visible' ( (lv_visible_10_0= ruleConditionChemin ) ) (otherlv_11= ',' ( (lv_visible_12_0= ruleConditionChemin ) ) )* )? (otherlv_13= 'ouvert' ( (lv_ouvert_14_0= ruleConditionChemin ) ) (otherlv_15= ',' ( (lv_ouvert_16_0= ruleConditionChemin ) ) )* )? otherlv_17= '}' )
            {
            // InternalGame.g:742:2: ( () ( (lv_obligatoire_1_0= 'obligatoire' ) )? otherlv_2= 'Chemin' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'pred' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'succ' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'visible' ( (lv_visible_10_0= ruleConditionChemin ) ) (otherlv_11= ',' ( (lv_visible_12_0= ruleConditionChemin ) ) )* )? (otherlv_13= 'ouvert' ( (lv_ouvert_14_0= ruleConditionChemin ) ) (otherlv_15= ',' ( (lv_ouvert_16_0= ruleConditionChemin ) ) )* )? otherlv_17= '}' )
            // InternalGame.g:743:3: () ( (lv_obligatoire_1_0= 'obligatoire' ) )? otherlv_2= 'Chemin' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'pred' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'succ' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'visible' ( (lv_visible_10_0= ruleConditionChemin ) ) (otherlv_11= ',' ( (lv_visible_12_0= ruleConditionChemin ) ) )* )? (otherlv_13= 'ouvert' ( (lv_ouvert_14_0= ruleConditionChemin ) ) (otherlv_15= ',' ( (lv_ouvert_16_0= ruleConditionChemin ) ) )* )? otherlv_17= '}'
            {
            // InternalGame.g:743:3: ()
            // InternalGame.g:744:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCheminAccess().getCheminAction_0(),
            					current);
            			

            }

            // InternalGame.g:750:3: ( (lv_obligatoire_1_0= 'obligatoire' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGame.g:751:4: (lv_obligatoire_1_0= 'obligatoire' )
                    {
                    // InternalGame.g:751:4: (lv_obligatoire_1_0= 'obligatoire' )
                    // InternalGame.g:752:5: lv_obligatoire_1_0= 'obligatoire'
                    {
                    lv_obligatoire_1_0=(Token)match(input,25,FOLLOW_21); 

                    					newLeafNode(lv_obligatoire_1_0, grammarAccess.getCheminAccess().getObligatoireObligatoireKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCheminRule());
                    					}
                    					setWithLastConsumed(current, "obligatoire", lv_obligatoire_1_0 != null, "obligatoire");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCheminAccess().getCheminKeyword_2());
            		
            // InternalGame.g:768:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalGame.g:769:4: (lv_name_3_0= RULE_ID )
            {
            // InternalGame.g:769:4: (lv_name_3_0= RULE_ID )
            // InternalGame.g:770:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_3_0, grammarAccess.getCheminAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getCheminAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getCheminAccess().getPredKeyword_5());
            		
            // InternalGame.g:794:3: ( (otherlv_6= RULE_ID ) )
            // InternalGame.g:795:4: (otherlv_6= RULE_ID )
            {
            // InternalGame.g:795:4: (otherlv_6= RULE_ID )
            // InternalGame.g:796:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_6, grammarAccess.getCheminAccess().getPredLieuCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getCheminAccess().getSuccKeyword_7());
            		
            // InternalGame.g:811:3: ( (otherlv_8= RULE_ID ) )
            // InternalGame.g:812:4: (otherlv_8= RULE_ID )
            {
            // InternalGame.g:812:4: (otherlv_8= RULE_ID )
            // InternalGame.g:813:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_8, grammarAccess.getCheminAccess().getSuccLieuCrossReference_8_0());
            				

            }


            }

            // InternalGame.g:824:3: (otherlv_9= 'visible' ( (lv_visible_10_0= ruleConditionChemin ) ) (otherlv_11= ',' ( (lv_visible_12_0= ruleConditionChemin ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGame.g:825:4: otherlv_9= 'visible' ( (lv_visible_10_0= ruleConditionChemin ) ) (otherlv_11= ',' ( (lv_visible_12_0= ruleConditionChemin ) ) )*
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getCheminAccess().getVisibleKeyword_9_0());
                    			
                    // InternalGame.g:829:4: ( (lv_visible_10_0= ruleConditionChemin ) )
                    // InternalGame.g:830:5: (lv_visible_10_0= ruleConditionChemin )
                    {
                    // InternalGame.g:830:5: (lv_visible_10_0= ruleConditionChemin )
                    // InternalGame.g:831:6: lv_visible_10_0= ruleConditionChemin
                    {

                    						newCompositeNode(grammarAccess.getCheminAccess().getVisibleConditionCheminParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_visible_10_0=ruleConditionChemin();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCheminRule());
                    						}
                    						add(
                    							current,
                    							"visible",
                    							lv_visible_10_0,
                    							"game.xtext.Game.ConditionChemin");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGame.g:848:4: (otherlv_11= ',' ( (lv_visible_12_0= ruleConditionChemin ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==13) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalGame.g:849:5: otherlv_11= ',' ( (lv_visible_12_0= ruleConditionChemin ) )
                    	    {
                    	    otherlv_11=(Token)match(input,13,FOLLOW_7); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getCheminAccess().getCommaKeyword_9_2_0());
                    	    				
                    	    // InternalGame.g:853:5: ( (lv_visible_12_0= ruleConditionChemin ) )
                    	    // InternalGame.g:854:6: (lv_visible_12_0= ruleConditionChemin )
                    	    {
                    	    // InternalGame.g:854:6: (lv_visible_12_0= ruleConditionChemin )
                    	    // InternalGame.g:855:7: lv_visible_12_0= ruleConditionChemin
                    	    {

                    	    							newCompositeNode(grammarAccess.getCheminAccess().getVisibleConditionCheminParserRuleCall_9_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_visible_12_0=ruleConditionChemin();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCheminRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"visible",
                    	    								lv_visible_12_0,
                    	    								"game.xtext.Game.ConditionChemin");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalGame.g:874:3: (otherlv_13= 'ouvert' ( (lv_ouvert_14_0= ruleConditionChemin ) ) (otherlv_15= ',' ( (lv_ouvert_16_0= ruleConditionChemin ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGame.g:875:4: otherlv_13= 'ouvert' ( (lv_ouvert_14_0= ruleConditionChemin ) ) (otherlv_15= ',' ( (lv_ouvert_16_0= ruleConditionChemin ) ) )*
                    {
                    otherlv_13=(Token)match(input,30,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getCheminAccess().getOuvertKeyword_10_0());
                    			
                    // InternalGame.g:879:4: ( (lv_ouvert_14_0= ruleConditionChemin ) )
                    // InternalGame.g:880:5: (lv_ouvert_14_0= ruleConditionChemin )
                    {
                    // InternalGame.g:880:5: (lv_ouvert_14_0= ruleConditionChemin )
                    // InternalGame.g:881:6: lv_ouvert_14_0= ruleConditionChemin
                    {

                    						newCompositeNode(grammarAccess.getCheminAccess().getOuvertConditionCheminParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_ouvert_14_0=ruleConditionChemin();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCheminRule());
                    						}
                    						add(
                    							current,
                    							"ouvert",
                    							lv_ouvert_14_0,
                    							"game.xtext.Game.ConditionChemin");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGame.g:898:4: (otherlv_15= ',' ( (lv_ouvert_16_0= ruleConditionChemin ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==13) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalGame.g:899:5: otherlv_15= ',' ( (lv_ouvert_16_0= ruleConditionChemin ) )
                    	    {
                    	    otherlv_15=(Token)match(input,13,FOLLOW_7); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getCheminAccess().getCommaKeyword_10_2_0());
                    	    				
                    	    // InternalGame.g:903:5: ( (lv_ouvert_16_0= ruleConditionChemin ) )
                    	    // InternalGame.g:904:6: (lv_ouvert_16_0= ruleConditionChemin )
                    	    {
                    	    // InternalGame.g:904:6: (lv_ouvert_16_0= ruleConditionChemin )
                    	    // InternalGame.g:905:7: lv_ouvert_16_0= ruleConditionChemin
                    	    {

                    	    							newCompositeNode(grammarAccess.getCheminAccess().getOuvertConditionCheminParserRuleCall_10_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_ouvert_16_0=ruleConditionChemin();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCheminRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ouvert",
                    	    								lv_ouvert_16_0,
                    	    								"game.xtext.Game.ConditionChemin");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_17=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getCheminAccess().getRightCurlyBracketKeyword_11());
            		

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
    // InternalGame.g:932:1: entryRulePersonne returns [EObject current=null] : iv_rulePersonne= rulePersonne EOF ;
    public final EObject entryRulePersonne() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonne = null;


        try {
            // InternalGame.g:932:49: (iv_rulePersonne= rulePersonne EOF )
            // InternalGame.g:933:2: iv_rulePersonne= rulePersonne EOF
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
    // InternalGame.g:939:1: rulePersonne returns [EObject current=null] : ( ( (lv_obligatoire_0_0= 'obligatoire' ) )? otherlv_1= 'Personne' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'place' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'interactions' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* (otherlv_10= 'visible' ( (lv_visible_11_0= ruleConditionPersonne ) ) (otherlv_12= ',' ( (lv_visible_13_0= ruleConditionPersonne ) ) )* )? (otherlv_14= 'active' ( (lv_active_15_0= ruleConditionPersonne ) ) (otherlv_16= ',' ( (lv_active_17_0= ruleConditionPersonne ) ) )* )? otherlv_18= '}' ) ;
    public final EObject rulePersonne() throws RecognitionException {
        EObject current = null;

        Token lv_obligatoire_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_visible_11_0 = null;

        EObject lv_visible_13_0 = null;

        EObject lv_active_15_0 = null;

        EObject lv_active_17_0 = null;



        	enterRule();

        try {
            // InternalGame.g:945:2: ( ( ( (lv_obligatoire_0_0= 'obligatoire' ) )? otherlv_1= 'Personne' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'place' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'interactions' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* (otherlv_10= 'visible' ( (lv_visible_11_0= ruleConditionPersonne ) ) (otherlv_12= ',' ( (lv_visible_13_0= ruleConditionPersonne ) ) )* )? (otherlv_14= 'active' ( (lv_active_15_0= ruleConditionPersonne ) ) (otherlv_16= ',' ( (lv_active_17_0= ruleConditionPersonne ) ) )* )? otherlv_18= '}' ) )
            // InternalGame.g:946:2: ( ( (lv_obligatoire_0_0= 'obligatoire' ) )? otherlv_1= 'Personne' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'place' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'interactions' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* (otherlv_10= 'visible' ( (lv_visible_11_0= ruleConditionPersonne ) ) (otherlv_12= ',' ( (lv_visible_13_0= ruleConditionPersonne ) ) )* )? (otherlv_14= 'active' ( (lv_active_15_0= ruleConditionPersonne ) ) (otherlv_16= ',' ( (lv_active_17_0= ruleConditionPersonne ) ) )* )? otherlv_18= '}' )
            {
            // InternalGame.g:946:2: ( ( (lv_obligatoire_0_0= 'obligatoire' ) )? otherlv_1= 'Personne' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'place' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'interactions' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* (otherlv_10= 'visible' ( (lv_visible_11_0= ruleConditionPersonne ) ) (otherlv_12= ',' ( (lv_visible_13_0= ruleConditionPersonne ) ) )* )? (otherlv_14= 'active' ( (lv_active_15_0= ruleConditionPersonne ) ) (otherlv_16= ',' ( (lv_active_17_0= ruleConditionPersonne ) ) )* )? otherlv_18= '}' )
            // InternalGame.g:947:3: ( (lv_obligatoire_0_0= 'obligatoire' ) )? otherlv_1= 'Personne' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'place' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'interactions' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* (otherlv_10= 'visible' ( (lv_visible_11_0= ruleConditionPersonne ) ) (otherlv_12= ',' ( (lv_visible_13_0= ruleConditionPersonne ) ) )* )? (otherlv_14= 'active' ( (lv_active_15_0= ruleConditionPersonne ) ) (otherlv_16= ',' ( (lv_active_17_0= ruleConditionPersonne ) ) )* )? otherlv_18= '}'
            {
            // InternalGame.g:947:3: ( (lv_obligatoire_0_0= 'obligatoire' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGame.g:948:4: (lv_obligatoire_0_0= 'obligatoire' )
                    {
                    // InternalGame.g:948:4: (lv_obligatoire_0_0= 'obligatoire' )
                    // InternalGame.g:949:5: lv_obligatoire_0_0= 'obligatoire'
                    {
                    lv_obligatoire_0_0=(Token)match(input,25,FOLLOW_26); 

                    					newLeafNode(lv_obligatoire_0_0, grammarAccess.getPersonneAccess().getObligatoireObligatoireKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPersonneRule());
                    					}
                    					setWithLastConsumed(current, "obligatoire", lv_obligatoire_0_0 != null, "obligatoire");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonneAccess().getPersonneKeyword_1());
            		
            // InternalGame.g:965:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGame.g:966:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGame.g:966:4: (lv_name_2_0= RULE_ID )
            // InternalGame.g:967:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPersonneAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getPersonneAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getPersonneAccess().getPlaceKeyword_4());
            		
            // InternalGame.g:991:3: ( (otherlv_5= RULE_ID ) )
            // InternalGame.g:992:4: (otherlv_5= RULE_ID )
            {
            // InternalGame.g:992:4: (otherlv_5= RULE_ID )
            // InternalGame.g:993:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonneRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_5, grammarAccess.getPersonneAccess().getPlaceLieuCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getPersonneAccess().getInteractionsKeyword_6());
            		
            // InternalGame.g:1008:3: ( (otherlv_7= RULE_ID ) )
            // InternalGame.g:1009:4: (otherlv_7= RULE_ID )
            {
            // InternalGame.g:1009:4: (otherlv_7= RULE_ID )
            // InternalGame.g:1010:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonneRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_7, grammarAccess.getPersonneAccess().getInteractionsInteractionCrossReference_7_0());
            				

            }


            }

            // InternalGame.g:1021:3: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==13) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGame.g:1022:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
            	    {
            	    otherlv_8=(Token)match(input,13,FOLLOW_3); 

            	    				newLeafNode(otherlv_8, grammarAccess.getPersonneAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalGame.g:1026:4: ( (otherlv_9= RULE_ID ) )
            	    // InternalGame.g:1027:5: (otherlv_9= RULE_ID )
            	    {
            	    // InternalGame.g:1027:5: (otherlv_9= RULE_ID )
            	    // InternalGame.g:1028:6: otherlv_9= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPersonneRule());
            	    						}
            	    					
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_29); 

            	    						newLeafNode(otherlv_9, grammarAccess.getPersonneAccess().getInteractionsInteractionCrossReference_8_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalGame.g:1040:3: (otherlv_10= 'visible' ( (lv_visible_11_0= ruleConditionPersonne ) ) (otherlv_12= ',' ( (lv_visible_13_0= ruleConditionPersonne ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGame.g:1041:4: otherlv_10= 'visible' ( (lv_visible_11_0= ruleConditionPersonne ) ) (otherlv_12= ',' ( (lv_visible_13_0= ruleConditionPersonne ) ) )*
                    {
                    otherlv_10=(Token)match(input,29,FOLLOW_30); 

                    				newLeafNode(otherlv_10, grammarAccess.getPersonneAccess().getVisibleKeyword_9_0());
                    			
                    // InternalGame.g:1045:4: ( (lv_visible_11_0= ruleConditionPersonne ) )
                    // InternalGame.g:1046:5: (lv_visible_11_0= ruleConditionPersonne )
                    {
                    // InternalGame.g:1046:5: (lv_visible_11_0= ruleConditionPersonne )
                    // InternalGame.g:1047:6: lv_visible_11_0= ruleConditionPersonne
                    {

                    						newCompositeNode(grammarAccess.getPersonneAccess().getVisibleConditionPersonneParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_visible_11_0=ruleConditionPersonne();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonneRule());
                    						}
                    						add(
                    							current,
                    							"visible",
                    							lv_visible_11_0,
                    							"game.xtext.Game.ConditionPersonne");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGame.g:1064:4: (otherlv_12= ',' ( (lv_visible_13_0= ruleConditionPersonne ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==13) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalGame.g:1065:5: otherlv_12= ',' ( (lv_visible_13_0= ruleConditionPersonne ) )
                    	    {
                    	    otherlv_12=(Token)match(input,13,FOLLOW_30); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getPersonneAccess().getCommaKeyword_9_2_0());
                    	    				
                    	    // InternalGame.g:1069:5: ( (lv_visible_13_0= ruleConditionPersonne ) )
                    	    // InternalGame.g:1070:6: (lv_visible_13_0= ruleConditionPersonne )
                    	    {
                    	    // InternalGame.g:1070:6: (lv_visible_13_0= ruleConditionPersonne )
                    	    // InternalGame.g:1071:7: lv_visible_13_0= ruleConditionPersonne
                    	    {

                    	    							newCompositeNode(grammarAccess.getPersonneAccess().getVisibleConditionPersonneParserRuleCall_9_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    lv_visible_13_0=ruleConditionPersonne();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPersonneRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"visible",
                    	    								lv_visible_13_0,
                    	    								"game.xtext.Game.ConditionPersonne");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalGame.g:1090:3: (otherlv_14= 'active' ( (lv_active_15_0= ruleConditionPersonne ) ) (otherlv_16= ',' ( (lv_active_17_0= ruleConditionPersonne ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGame.g:1091:4: otherlv_14= 'active' ( (lv_active_15_0= ruleConditionPersonne ) ) (otherlv_16= ',' ( (lv_active_17_0= ruleConditionPersonne ) ) )*
                    {
                    otherlv_14=(Token)match(input,34,FOLLOW_30); 

                    				newLeafNode(otherlv_14, grammarAccess.getPersonneAccess().getActiveKeyword_10_0());
                    			
                    // InternalGame.g:1095:4: ( (lv_active_15_0= ruleConditionPersonne ) )
                    // InternalGame.g:1096:5: (lv_active_15_0= ruleConditionPersonne )
                    {
                    // InternalGame.g:1096:5: (lv_active_15_0= ruleConditionPersonne )
                    // InternalGame.g:1097:6: lv_active_15_0= ruleConditionPersonne
                    {

                    						newCompositeNode(grammarAccess.getPersonneAccess().getActiveConditionPersonneParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_active_15_0=ruleConditionPersonne();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonneRule());
                    						}
                    						add(
                    							current,
                    							"active",
                    							lv_active_15_0,
                    							"game.xtext.Game.ConditionPersonne");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGame.g:1114:4: (otherlv_16= ',' ( (lv_active_17_0= ruleConditionPersonne ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==13) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalGame.g:1115:5: otherlv_16= ',' ( (lv_active_17_0= ruleConditionPersonne ) )
                    	    {
                    	    otherlv_16=(Token)match(input,13,FOLLOW_30); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getPersonneAccess().getCommaKeyword_10_2_0());
                    	    				
                    	    // InternalGame.g:1119:5: ( (lv_active_17_0= ruleConditionPersonne ) )
                    	    // InternalGame.g:1120:6: (lv_active_17_0= ruleConditionPersonne )
                    	    {
                    	    // InternalGame.g:1120:6: (lv_active_17_0= ruleConditionPersonne )
                    	    // InternalGame.g:1121:7: lv_active_17_0= ruleConditionPersonne
                    	    {

                    	    							newCompositeNode(grammarAccess.getPersonneAccess().getActiveConditionPersonneParserRuleCall_10_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_active_17_0=ruleConditionPersonne();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPersonneRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"active",
                    	    								lv_active_17_0,
                    	    								"game.xtext.Game.ConditionPersonne");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_18=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_11());
            		

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


    // $ANTLR start "entryRuleConditionPersonne"
    // InternalGame.g:1148:1: entryRuleConditionPersonne returns [EObject current=null] : iv_ruleConditionPersonne= ruleConditionPersonne EOF ;
    public final EObject entryRuleConditionPersonne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionPersonne = null;


        try {
            // InternalGame.g:1148:58: (iv_ruleConditionPersonne= ruleConditionPersonne EOF )
            // InternalGame.g:1149:2: iv_ruleConditionPersonne= ruleConditionPersonne EOF
            {
             newCompositeNode(grammarAccess.getConditionPersonneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionPersonne=ruleConditionPersonne();

            state._fsp--;

             current =iv_ruleConditionPersonne; 
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
    // $ANTLR end "entryRuleConditionPersonne"


    // $ANTLR start "ruleConditionPersonne"
    // InternalGame.g:1155:1: ruleConditionPersonne returns [EObject current=null] : ( () otherlv_1= 'ConditionPersonne' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'connaissanceRequise' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'connaissanceInterdite' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'objetRequis' ( (otherlv_9= RULE_ID ) ) )? (otherlv_10= 'objetInterdit' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleConditionPersonne() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalGame.g:1161:2: ( ( () otherlv_1= 'ConditionPersonne' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'connaissanceRequise' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'connaissanceInterdite' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'objetRequis' ( (otherlv_9= RULE_ID ) ) )? (otherlv_10= 'objetInterdit' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= '}' ) )
            // InternalGame.g:1162:2: ( () otherlv_1= 'ConditionPersonne' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'connaissanceRequise' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'connaissanceInterdite' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'objetRequis' ( (otherlv_9= RULE_ID ) ) )? (otherlv_10= 'objetInterdit' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= '}' )
            {
            // InternalGame.g:1162:2: ( () otherlv_1= 'ConditionPersonne' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'connaissanceRequise' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'connaissanceInterdite' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'objetRequis' ( (otherlv_9= RULE_ID ) ) )? (otherlv_10= 'objetInterdit' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= '}' )
            // InternalGame.g:1163:3: () otherlv_1= 'ConditionPersonne' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'connaissanceRequise' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'connaissanceInterdite' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'objetRequis' ( (otherlv_9= RULE_ID ) ) )? (otherlv_10= 'objetInterdit' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= '}'
            {
            // InternalGame.g:1163:3: ()
            // InternalGame.g:1164:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConditionPersonneAccess().getConditionPersonneAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionPersonneAccess().getConditionPersonneKeyword_1());
            		
            // InternalGame.g:1174:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGame.g:1175:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGame.g:1175:4: (lv_name_2_0= RULE_ID )
            // InternalGame.g:1176:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getConditionPersonneAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionPersonneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getConditionPersonneAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGame.g:1196:3: (otherlv_4= 'connaissanceRequise' ( (otherlv_5= RULE_ID ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGame.g:1197:4: otherlv_4= 'connaissanceRequise' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getConditionPersonneAccess().getConnaissanceRequiseKeyword_4_0());
                    			
                    // InternalGame.g:1201:4: ( (otherlv_5= RULE_ID ) )
                    // InternalGame.g:1202:5: (otherlv_5= RULE_ID )
                    {
                    // InternalGame.g:1202:5: (otherlv_5= RULE_ID )
                    // InternalGame.g:1203:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionPersonneRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_33); 

                    						newLeafNode(otherlv_5, grammarAccess.getConditionPersonneAccess().getConnaissanceRequiseConnaissanceCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGame.g:1215:3: (otherlv_6= 'connaissanceInterdite' ( (otherlv_7= RULE_ID ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGame.g:1216:4: otherlv_6= 'connaissanceInterdite' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getConditionPersonneAccess().getConnaissanceInterditeKeyword_5_0());
                    			
                    // InternalGame.g:1220:4: ( (otherlv_7= RULE_ID ) )
                    // InternalGame.g:1221:5: (otherlv_7= RULE_ID )
                    {
                    // InternalGame.g:1221:5: (otherlv_7= RULE_ID )
                    // InternalGame.g:1222:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionPersonneRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_34); 

                    						newLeafNode(otherlv_7, grammarAccess.getConditionPersonneAccess().getConnaissanceInterditeConnaissanceCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGame.g:1234:3: (otherlv_8= 'objetRequis' ( (otherlv_9= RULE_ID ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGame.g:1235:4: otherlv_8= 'objetRequis' ( (otherlv_9= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getConditionPersonneAccess().getObjetRequisKeyword_6_0());
                    			
                    // InternalGame.g:1239:4: ( (otherlv_9= RULE_ID ) )
                    // InternalGame.g:1240:5: (otherlv_9= RULE_ID )
                    {
                    // InternalGame.g:1240:5: (otherlv_9= RULE_ID )
                    // InternalGame.g:1241:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionPersonneRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_35); 

                    						newLeafNode(otherlv_9, grammarAccess.getConditionPersonneAccess().getObjetRequisQteObjetCrossReference_6_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGame.g:1253:3: (otherlv_10= 'objetInterdit' ( (otherlv_11= RULE_ID ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGame.g:1254:4: otherlv_10= 'objetInterdit' ( (otherlv_11= RULE_ID ) )
                    {
                    otherlv_10=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getConditionPersonneAccess().getObjetInterditKeyword_7_0());
                    			
                    // InternalGame.g:1258:4: ( (otherlv_11= RULE_ID ) )
                    // InternalGame.g:1259:5: (otherlv_11= RULE_ID )
                    {
                    // InternalGame.g:1259:5: (otherlv_11= RULE_ID )
                    // InternalGame.g:1260:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionPersonneRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_36); 

                    						newLeafNode(otherlv_11, grammarAccess.getConditionPersonneAccess().getObjetInterditQteObjetCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getConditionPersonneAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleConditionPersonne"


    // $ANTLR start "entryRuleInteraction"
    // InternalGame.g:1280:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // InternalGame.g:1280:52: (iv_ruleInteraction= ruleInteraction EOF )
            // InternalGame.g:1281:2: iv_ruleInteraction= ruleInteraction EOF
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
    // InternalGame.g:1287:1: ruleInteraction returns [EObject current=null] : (otherlv_0= 'Interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'question' ( (lv_question_4_0= RULE_STRING ) ) )? otherlv_5= 'personne' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'choix' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}' ) ;
    public final EObject ruleInteraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_question_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalGame.g:1293:2: ( (otherlv_0= 'Interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'question' ( (lv_question_4_0= RULE_STRING ) ) )? otherlv_5= 'personne' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'choix' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}' ) )
            // InternalGame.g:1294:2: (otherlv_0= 'Interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'question' ( (lv_question_4_0= RULE_STRING ) ) )? otherlv_5= 'personne' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'choix' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}' )
            {
            // InternalGame.g:1294:2: (otherlv_0= 'Interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'question' ( (lv_question_4_0= RULE_STRING ) ) )? otherlv_5= 'personne' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'choix' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}' )
            // InternalGame.g:1295:3: otherlv_0= 'Interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'question' ( (lv_question_4_0= RULE_STRING ) ) )? otherlv_5= 'personne' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'choix' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInteractionAccess().getInteractionKeyword_0());
            		
            // InternalGame.g:1299:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:1300:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:1300:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:1301:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInteractionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInteractionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:1321:3: (otherlv_3= 'question' ( (lv_question_4_0= RULE_STRING ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==41) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGame.g:1322:4: otherlv_3= 'question' ( (lv_question_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_38); 

                    				newLeafNode(otherlv_3, grammarAccess.getInteractionAccess().getQuestionKeyword_3_0());
                    			
                    // InternalGame.g:1326:4: ( (lv_question_4_0= RULE_STRING ) )
                    // InternalGame.g:1327:5: (lv_question_4_0= RULE_STRING )
                    {
                    // InternalGame.g:1327:5: (lv_question_4_0= RULE_STRING )
                    // InternalGame.g:1328:6: lv_question_4_0= RULE_STRING
                    {
                    lv_question_4_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

                    						newLeafNode(lv_question_4_0, grammarAccess.getInteractionAccess().getQuestionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInteractionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"question",
                    							lv_question_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getInteractionAccess().getPersonneKeyword_4());
            		
            // InternalGame.g:1349:3: ( (otherlv_6= RULE_ID ) )
            // InternalGame.g:1350:4: (otherlv_6= RULE_ID )
            {
            // InternalGame.g:1350:4: (otherlv_6= RULE_ID )
            // InternalGame.g:1351:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInteractionRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_40); 

            					newLeafNode(otherlv_6, grammarAccess.getInteractionAccess().getPersonnePersonneCrossReference_5_0());
            				

            }


            }

            // InternalGame.g:1362:3: (otherlv_7= 'choix' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==43) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGame.g:1363:4: otherlv_7= 'choix' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    {
                    otherlv_7=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getInteractionAccess().getChoixKeyword_6_0());
                    			
                    // InternalGame.g:1367:4: ( (otherlv_8= RULE_ID ) )
                    // InternalGame.g:1368:5: (otherlv_8= RULE_ID )
                    {
                    // InternalGame.g:1368:5: (otherlv_8= RULE_ID )
                    // InternalGame.g:1369:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInteractionRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_8, grammarAccess.getInteractionAccess().getChoixChoixCrossReference_6_1_0());
                    					

                    }


                    }

                    // InternalGame.g:1380:4: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==13) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalGame.g:1381:5: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
                    	    {
                    	    otherlv_9=(Token)match(input,13,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getInteractionAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalGame.g:1385:5: ( (otherlv_10= RULE_ID ) )
                    	    // InternalGame.g:1386:6: (otherlv_10= RULE_ID )
                    	    {
                    	    // InternalGame.g:1386:6: (otherlv_10= RULE_ID )
                    	    // InternalGame.g:1387:7: otherlv_10= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getInteractionRule());
                    	    							}
                    	    						
                    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_8); 

                    	    							newLeafNode(otherlv_10, grammarAccess.getInteractionAccess().getChoixChoixCrossReference_6_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleConnaissance"
    // InternalGame.g:1408:1: entryRuleConnaissance returns [EObject current=null] : iv_ruleConnaissance= ruleConnaissance EOF ;
    public final EObject entryRuleConnaissance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnaissance = null;


        try {
            // InternalGame.g:1408:53: (iv_ruleConnaissance= ruleConnaissance EOF )
            // InternalGame.g:1409:2: iv_ruleConnaissance= ruleConnaissance EOF
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
    // InternalGame.g:1415:1: ruleConnaissance returns [EObject current=null] : ( () otherlv_1= 'Connaissance' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'choix' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'visible' ( (lv_visible_7_0= ruleConditionAvantage ) ) (otherlv_8= ',' ( (lv_visible_9_0= ruleConditionAvantage ) ) )* )? (otherlv_10= 'actif' ( (lv_actif_11_0= ruleConditionAvantage ) ) (otherlv_12= ',' ( (lv_actif_13_0= ruleConditionAvantage ) ) )* )? otherlv_14= '}' ) ;
    public final EObject ruleConnaissance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_visible_7_0 = null;

        EObject lv_visible_9_0 = null;

        EObject lv_actif_11_0 = null;

        EObject lv_actif_13_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1421:2: ( ( () otherlv_1= 'Connaissance' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'choix' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'visible' ( (lv_visible_7_0= ruleConditionAvantage ) ) (otherlv_8= ',' ( (lv_visible_9_0= ruleConditionAvantage ) ) )* )? (otherlv_10= 'actif' ( (lv_actif_11_0= ruleConditionAvantage ) ) (otherlv_12= ',' ( (lv_actif_13_0= ruleConditionAvantage ) ) )* )? otherlv_14= '}' ) )
            // InternalGame.g:1422:2: ( () otherlv_1= 'Connaissance' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'choix' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'visible' ( (lv_visible_7_0= ruleConditionAvantage ) ) (otherlv_8= ',' ( (lv_visible_9_0= ruleConditionAvantage ) ) )* )? (otherlv_10= 'actif' ( (lv_actif_11_0= ruleConditionAvantage ) ) (otherlv_12= ',' ( (lv_actif_13_0= ruleConditionAvantage ) ) )* )? otherlv_14= '}' )
            {
            // InternalGame.g:1422:2: ( () otherlv_1= 'Connaissance' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'choix' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'visible' ( (lv_visible_7_0= ruleConditionAvantage ) ) (otherlv_8= ',' ( (lv_visible_9_0= ruleConditionAvantage ) ) )* )? (otherlv_10= 'actif' ( (lv_actif_11_0= ruleConditionAvantage ) ) (otherlv_12= ',' ( (lv_actif_13_0= ruleConditionAvantage ) ) )* )? otherlv_14= '}' )
            // InternalGame.g:1423:3: () otherlv_1= 'Connaissance' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'choix' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'visible' ( (lv_visible_7_0= ruleConditionAvantage ) ) (otherlv_8= ',' ( (lv_visible_9_0= ruleConditionAvantage ) ) )* )? (otherlv_10= 'actif' ( (lv_actif_11_0= ruleConditionAvantage ) ) (otherlv_12= ',' ( (lv_actif_13_0= ruleConditionAvantage ) ) )* )? otherlv_14= '}'
            {
            // InternalGame.g:1423:3: ()
            // InternalGame.g:1424:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConnaissanceAccess().getConnaissanceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConnaissanceAccess().getConnaissanceKeyword_1());
            		
            // InternalGame.g:1434:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGame.g:1435:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGame.g:1435:4: (lv_name_2_0= RULE_ID )
            // InternalGame.g:1436:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getConnaissanceAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnaissanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getConnaissanceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGame.g:1456:3: (otherlv_4= 'choix' ( (otherlv_5= RULE_ID ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==43) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGame.g:1457:4: otherlv_4= 'choix' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getConnaissanceAccess().getChoixKeyword_4_0());
                    			
                    // InternalGame.g:1461:4: ( (otherlv_5= RULE_ID ) )
                    // InternalGame.g:1462:5: (otherlv_5= RULE_ID )
                    {
                    // InternalGame.g:1462:5: (otherlv_5= RULE_ID )
                    // InternalGame.g:1463:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnaissanceRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_42); 

                    						newLeafNode(otherlv_5, grammarAccess.getConnaissanceAccess().getChoixChoixCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGame.g:1475:3: (otherlv_6= 'visible' ( (lv_visible_7_0= ruleConditionAvantage ) ) (otherlv_8= ',' ( (lv_visible_9_0= ruleConditionAvantage ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==29) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGame.g:1476:4: otherlv_6= 'visible' ( (lv_visible_7_0= ruleConditionAvantage ) ) (otherlv_8= ',' ( (lv_visible_9_0= ruleConditionAvantage ) ) )*
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_43); 

                    				newLeafNode(otherlv_6, grammarAccess.getConnaissanceAccess().getVisibleKeyword_5_0());
                    			
                    // InternalGame.g:1480:4: ( (lv_visible_7_0= ruleConditionAvantage ) )
                    // InternalGame.g:1481:5: (lv_visible_7_0= ruleConditionAvantage )
                    {
                    // InternalGame.g:1481:5: (lv_visible_7_0= ruleConditionAvantage )
                    // InternalGame.g:1482:6: lv_visible_7_0= ruleConditionAvantage
                    {

                    						newCompositeNode(grammarAccess.getConnaissanceAccess().getVisibleConditionAvantageParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_visible_7_0=ruleConditionAvantage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnaissanceRule());
                    						}
                    						add(
                    							current,
                    							"visible",
                    							lv_visible_7_0,
                    							"game.xtext.Game.ConditionAvantage");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGame.g:1499:4: (otherlv_8= ',' ( (lv_visible_9_0= ruleConditionAvantage ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==13) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalGame.g:1500:5: otherlv_8= ',' ( (lv_visible_9_0= ruleConditionAvantage ) )
                    	    {
                    	    otherlv_8=(Token)match(input,13,FOLLOW_43); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getConnaissanceAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalGame.g:1504:5: ( (lv_visible_9_0= ruleConditionAvantage ) )
                    	    // InternalGame.g:1505:6: (lv_visible_9_0= ruleConditionAvantage )
                    	    {
                    	    // InternalGame.g:1505:6: (lv_visible_9_0= ruleConditionAvantage )
                    	    // InternalGame.g:1506:7: lv_visible_9_0= ruleConditionAvantage
                    	    {

                    	    							newCompositeNode(grammarAccess.getConnaissanceAccess().getVisibleConditionAvantageParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_44);
                    	    lv_visible_9_0=ruleConditionAvantage();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConnaissanceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"visible",
                    	    								lv_visible_9_0,
                    	    								"game.xtext.Game.ConditionAvantage");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalGame.g:1525:3: (otherlv_10= 'actif' ( (lv_actif_11_0= ruleConditionAvantage ) ) (otherlv_12= ',' ( (lv_actif_13_0= ruleConditionAvantage ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==45) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGame.g:1526:4: otherlv_10= 'actif' ( (lv_actif_11_0= ruleConditionAvantage ) ) (otherlv_12= ',' ( (lv_actif_13_0= ruleConditionAvantage ) ) )*
                    {
                    otherlv_10=(Token)match(input,45,FOLLOW_43); 

                    				newLeafNode(otherlv_10, grammarAccess.getConnaissanceAccess().getActifKeyword_6_0());
                    			
                    // InternalGame.g:1530:4: ( (lv_actif_11_0= ruleConditionAvantage ) )
                    // InternalGame.g:1531:5: (lv_actif_11_0= ruleConditionAvantage )
                    {
                    // InternalGame.g:1531:5: (lv_actif_11_0= ruleConditionAvantage )
                    // InternalGame.g:1532:6: lv_actif_11_0= ruleConditionAvantage
                    {

                    						newCompositeNode(grammarAccess.getConnaissanceAccess().getActifConditionAvantageParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_actif_11_0=ruleConditionAvantage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnaissanceRule());
                    						}
                    						add(
                    							current,
                    							"actif",
                    							lv_actif_11_0,
                    							"game.xtext.Game.ConditionAvantage");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGame.g:1549:4: (otherlv_12= ',' ( (lv_actif_13_0= ruleConditionAvantage ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==13) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalGame.g:1550:5: otherlv_12= ',' ( (lv_actif_13_0= ruleConditionAvantage ) )
                    	    {
                    	    otherlv_12=(Token)match(input,13,FOLLOW_43); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getConnaissanceAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalGame.g:1554:5: ( (lv_actif_13_0= ruleConditionAvantage ) )
                    	    // InternalGame.g:1555:6: (lv_actif_13_0= ruleConditionAvantage )
                    	    {
                    	    // InternalGame.g:1555:6: (lv_actif_13_0= ruleConditionAvantage )
                    	    // InternalGame.g:1556:7: lv_actif_13_0= ruleConditionAvantage
                    	    {

                    	    							newCompositeNode(grammarAccess.getConnaissanceAccess().getActifConditionAvantageParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_actif_13_0=ruleConditionAvantage();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConnaissanceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actif",
                    	    								lv_actif_13_0,
                    	    								"game.xtext.Game.ConditionAvantage");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getConnaissanceAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalGame.g:1583:1: entryRuleObjet returns [EObject current=null] : iv_ruleObjet= ruleObjet EOF ;
    public final EObject entryRuleObjet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjet = null;


        try {
            // InternalGame.g:1583:46: (iv_ruleObjet= ruleObjet EOF )
            // InternalGame.g:1584:2: iv_ruleObjet= ruleObjet EOF
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
    // InternalGame.g:1590:1: ruleObjet returns [EObject current=null] : ( () ( (lv_transformable_1_0= 'transformable' ) )? otherlv_2= 'Objet' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'qte' ( (lv_qte_6_0= ruleEInt ) ) )? (otherlv_7= 'taille' ( (lv_taille_8_0= ruleEInt ) ) )? (otherlv_9= 'visible' ( (lv_visible_10_0= ruleConditionAvantage ) ) (otherlv_11= ',' ( (lv_visible_12_0= ruleConditionAvantage ) ) )* )? (otherlv_13= 'actif' ( (lv_actif_14_0= ruleConditionAvantage ) ) (otherlv_15= ',' ( (lv_actif_16_0= ruleConditionAvantage ) ) )* )? otherlv_17= '}' ) ;
    public final EObject ruleObjet() throws RecognitionException {
        EObject current = null;

        Token lv_transformable_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_qte_6_0 = null;

        AntlrDatatypeRuleToken lv_taille_8_0 = null;

        EObject lv_visible_10_0 = null;

        EObject lv_visible_12_0 = null;

        EObject lv_actif_14_0 = null;

        EObject lv_actif_16_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1596:2: ( ( () ( (lv_transformable_1_0= 'transformable' ) )? otherlv_2= 'Objet' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'qte' ( (lv_qte_6_0= ruleEInt ) ) )? (otherlv_7= 'taille' ( (lv_taille_8_0= ruleEInt ) ) )? (otherlv_9= 'visible' ( (lv_visible_10_0= ruleConditionAvantage ) ) (otherlv_11= ',' ( (lv_visible_12_0= ruleConditionAvantage ) ) )* )? (otherlv_13= 'actif' ( (lv_actif_14_0= ruleConditionAvantage ) ) (otherlv_15= ',' ( (lv_actif_16_0= ruleConditionAvantage ) ) )* )? otherlv_17= '}' ) )
            // InternalGame.g:1597:2: ( () ( (lv_transformable_1_0= 'transformable' ) )? otherlv_2= 'Objet' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'qte' ( (lv_qte_6_0= ruleEInt ) ) )? (otherlv_7= 'taille' ( (lv_taille_8_0= ruleEInt ) ) )? (otherlv_9= 'visible' ( (lv_visible_10_0= ruleConditionAvantage ) ) (otherlv_11= ',' ( (lv_visible_12_0= ruleConditionAvantage ) ) )* )? (otherlv_13= 'actif' ( (lv_actif_14_0= ruleConditionAvantage ) ) (otherlv_15= ',' ( (lv_actif_16_0= ruleConditionAvantage ) ) )* )? otherlv_17= '}' )
            {
            // InternalGame.g:1597:2: ( () ( (lv_transformable_1_0= 'transformable' ) )? otherlv_2= 'Objet' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'qte' ( (lv_qte_6_0= ruleEInt ) ) )? (otherlv_7= 'taille' ( (lv_taille_8_0= ruleEInt ) ) )? (otherlv_9= 'visible' ( (lv_visible_10_0= ruleConditionAvantage ) ) (otherlv_11= ',' ( (lv_visible_12_0= ruleConditionAvantage ) ) )* )? (otherlv_13= 'actif' ( (lv_actif_14_0= ruleConditionAvantage ) ) (otherlv_15= ',' ( (lv_actif_16_0= ruleConditionAvantage ) ) )* )? otherlv_17= '}' )
            // InternalGame.g:1598:3: () ( (lv_transformable_1_0= 'transformable' ) )? otherlv_2= 'Objet' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'qte' ( (lv_qte_6_0= ruleEInt ) ) )? (otherlv_7= 'taille' ( (lv_taille_8_0= ruleEInt ) ) )? (otherlv_9= 'visible' ( (lv_visible_10_0= ruleConditionAvantage ) ) (otherlv_11= ',' ( (lv_visible_12_0= ruleConditionAvantage ) ) )* )? (otherlv_13= 'actif' ( (lv_actif_14_0= ruleConditionAvantage ) ) (otherlv_15= ',' ( (lv_actif_16_0= ruleConditionAvantage ) ) )* )? otherlv_17= '}'
            {
            // InternalGame.g:1598:3: ()
            // InternalGame.g:1599:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjetAccess().getObjetAction_0(),
            					current);
            			

            }

            // InternalGame.g:1605:3: ( (lv_transformable_1_0= 'transformable' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==46) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGame.g:1606:4: (lv_transformable_1_0= 'transformable' )
                    {
                    // InternalGame.g:1606:4: (lv_transformable_1_0= 'transformable' )
                    // InternalGame.g:1607:5: lv_transformable_1_0= 'transformable'
                    {
                    lv_transformable_1_0=(Token)match(input,46,FOLLOW_45); 

                    					newLeafNode(lv_transformable_1_0, grammarAccess.getObjetAccess().getTransformableTransformableKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getObjetRule());
                    					}
                    					setWithLastConsumed(current, "transformable", lv_transformable_1_0 != null, "transformable");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getObjetAccess().getObjetKeyword_2());
            		
            // InternalGame.g:1623:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalGame.g:1624:4: (lv_name_3_0= RULE_ID )
            {
            // InternalGame.g:1624:4: (lv_name_3_0= RULE_ID )
            // InternalGame.g:1625:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_3_0, grammarAccess.getObjetAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_4, grammarAccess.getObjetAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalGame.g:1645:3: (otherlv_5= 'qte' ( (lv_qte_6_0= ruleEInt ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==48) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalGame.g:1646:4: otherlv_5= 'qte' ( (lv_qte_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,48,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getObjetAccess().getQteKeyword_5_0());
                    			
                    // InternalGame.g:1650:4: ( (lv_qte_6_0= ruleEInt ) )
                    // InternalGame.g:1651:5: (lv_qte_6_0= ruleEInt )
                    {
                    // InternalGame.g:1651:5: (lv_qte_6_0= ruleEInt )
                    // InternalGame.g:1652:6: lv_qte_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getObjetAccess().getQteEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_qte_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjetRule());
                    						}
                    						set(
                    							current,
                    							"qte",
                    							lv_qte_6_0,
                    							"game.xtext.Game.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGame.g:1670:3: (otherlv_7= 'taille' ( (lv_taille_8_0= ruleEInt ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==18) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalGame.g:1671:4: otherlv_7= 'taille' ( (lv_taille_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getObjetAccess().getTailleKeyword_6_0());
                    			
                    // InternalGame.g:1675:4: ( (lv_taille_8_0= ruleEInt ) )
                    // InternalGame.g:1676:5: (lv_taille_8_0= ruleEInt )
                    {
                    // InternalGame.g:1676:5: (lv_taille_8_0= ruleEInt )
                    // InternalGame.g:1677:6: lv_taille_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getObjetAccess().getTailleEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_taille_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjetRule());
                    						}
                    						set(
                    							current,
                    							"taille",
                    							lv_taille_8_0,
                    							"game.xtext.Game.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGame.g:1695:3: (otherlv_9= 'visible' ( (lv_visible_10_0= ruleConditionAvantage ) ) (otherlv_11= ',' ( (lv_visible_12_0= ruleConditionAvantage ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==29) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalGame.g:1696:4: otherlv_9= 'visible' ( (lv_visible_10_0= ruleConditionAvantage ) ) (otherlv_11= ',' ( (lv_visible_12_0= ruleConditionAvantage ) ) )*
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_43); 

                    				newLeafNode(otherlv_9, grammarAccess.getObjetAccess().getVisibleKeyword_7_0());
                    			
                    // InternalGame.g:1700:4: ( (lv_visible_10_0= ruleConditionAvantage ) )
                    // InternalGame.g:1701:5: (lv_visible_10_0= ruleConditionAvantage )
                    {
                    // InternalGame.g:1701:5: (lv_visible_10_0= ruleConditionAvantage )
                    // InternalGame.g:1702:6: lv_visible_10_0= ruleConditionAvantage
                    {

                    						newCompositeNode(grammarAccess.getObjetAccess().getVisibleConditionAvantageParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_visible_10_0=ruleConditionAvantage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjetRule());
                    						}
                    						add(
                    							current,
                    							"visible",
                    							lv_visible_10_0,
                    							"game.xtext.Game.ConditionAvantage");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGame.g:1719:4: (otherlv_11= ',' ( (lv_visible_12_0= ruleConditionAvantage ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==13) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalGame.g:1720:5: otherlv_11= ',' ( (lv_visible_12_0= ruleConditionAvantage ) )
                    	    {
                    	    otherlv_11=(Token)match(input,13,FOLLOW_43); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getObjetAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalGame.g:1724:5: ( (lv_visible_12_0= ruleConditionAvantage ) )
                    	    // InternalGame.g:1725:6: (lv_visible_12_0= ruleConditionAvantage )
                    	    {
                    	    // InternalGame.g:1725:6: (lv_visible_12_0= ruleConditionAvantage )
                    	    // InternalGame.g:1726:7: lv_visible_12_0= ruleConditionAvantage
                    	    {

                    	    							newCompositeNode(grammarAccess.getObjetAccess().getVisibleConditionAvantageParserRuleCall_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_44);
                    	    lv_visible_12_0=ruleConditionAvantage();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getObjetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"visible",
                    	    								lv_visible_12_0,
                    	    								"game.xtext.Game.ConditionAvantage");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalGame.g:1745:3: (otherlv_13= 'actif' ( (lv_actif_14_0= ruleConditionAvantage ) ) (otherlv_15= ',' ( (lv_actif_16_0= ruleConditionAvantage ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==45) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalGame.g:1746:4: otherlv_13= 'actif' ( (lv_actif_14_0= ruleConditionAvantage ) ) (otherlv_15= ',' ( (lv_actif_16_0= ruleConditionAvantage ) ) )*
                    {
                    otherlv_13=(Token)match(input,45,FOLLOW_43); 

                    				newLeafNode(otherlv_13, grammarAccess.getObjetAccess().getActifKeyword_8_0());
                    			
                    // InternalGame.g:1750:4: ( (lv_actif_14_0= ruleConditionAvantage ) )
                    // InternalGame.g:1751:5: (lv_actif_14_0= ruleConditionAvantage )
                    {
                    // InternalGame.g:1751:5: (lv_actif_14_0= ruleConditionAvantage )
                    // InternalGame.g:1752:6: lv_actif_14_0= ruleConditionAvantage
                    {

                    						newCompositeNode(grammarAccess.getObjetAccess().getActifConditionAvantageParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_actif_14_0=ruleConditionAvantage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjetRule());
                    						}
                    						add(
                    							current,
                    							"actif",
                    							lv_actif_14_0,
                    							"game.xtext.Game.ConditionAvantage");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGame.g:1769:4: (otherlv_15= ',' ( (lv_actif_16_0= ruleConditionAvantage ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==13) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalGame.g:1770:5: otherlv_15= ',' ( (lv_actif_16_0= ruleConditionAvantage ) )
                    	    {
                    	    otherlv_15=(Token)match(input,13,FOLLOW_43); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getObjetAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalGame.g:1774:5: ( (lv_actif_16_0= ruleConditionAvantage ) )
                    	    // InternalGame.g:1775:6: (lv_actif_16_0= ruleConditionAvantage )
                    	    {
                    	    // InternalGame.g:1775:6: (lv_actif_16_0= ruleConditionAvantage )
                    	    // InternalGame.g:1776:7: lv_actif_16_0= ruleConditionAvantage
                    	    {

                    	    							newCompositeNode(grammarAccess.getObjetAccess().getActifConditionAvantageParserRuleCall_8_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_actif_16_0=ruleConditionAvantage();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getObjetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actif",
                    	    								lv_actif_16_0,
                    	    								"game.xtext.Game.ConditionAvantage");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_17=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getObjetAccess().getRightCurlyBracketKeyword_9());
            		

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


    // $ANTLR start "entryRuleConditionAvantage"
    // InternalGame.g:1803:1: entryRuleConditionAvantage returns [EObject current=null] : iv_ruleConditionAvantage= ruleConditionAvantage EOF ;
    public final EObject entryRuleConditionAvantage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionAvantage = null;


        try {
            // InternalGame.g:1803:58: (iv_ruleConditionAvantage= ruleConditionAvantage EOF )
            // InternalGame.g:1804:2: iv_ruleConditionAvantage= ruleConditionAvantage EOF
            {
             newCompositeNode(grammarAccess.getConditionAvantageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionAvantage=ruleConditionAvantage();

            state._fsp--;

             current =iv_ruleConditionAvantage; 
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
    // $ANTLR end "entryRuleConditionAvantage"


    // $ANTLR start "ruleConditionAvantage"
    // InternalGame.g:1810:1: ruleConditionAvantage returns [EObject current=null] : ( () otherlv_1= 'ConditionAvantage' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'connaissanceRequise' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'connaissanceInterdite' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'objetRequis' ( (otherlv_9= RULE_ID ) ) )? (otherlv_10= 'objetInterdit' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleConditionAvantage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalGame.g:1816:2: ( ( () otherlv_1= 'ConditionAvantage' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'connaissanceRequise' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'connaissanceInterdite' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'objetRequis' ( (otherlv_9= RULE_ID ) ) )? (otherlv_10= 'objetInterdit' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= '}' ) )
            // InternalGame.g:1817:2: ( () otherlv_1= 'ConditionAvantage' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'connaissanceRequise' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'connaissanceInterdite' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'objetRequis' ( (otherlv_9= RULE_ID ) ) )? (otherlv_10= 'objetInterdit' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= '}' )
            {
            // InternalGame.g:1817:2: ( () otherlv_1= 'ConditionAvantage' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'connaissanceRequise' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'connaissanceInterdite' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'objetRequis' ( (otherlv_9= RULE_ID ) ) )? (otherlv_10= 'objetInterdit' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= '}' )
            // InternalGame.g:1818:3: () otherlv_1= 'ConditionAvantage' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'connaissanceRequise' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'connaissanceInterdite' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'objetRequis' ( (otherlv_9= RULE_ID ) ) )? (otherlv_10= 'objetInterdit' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= '}'
            {
            // InternalGame.g:1818:3: ()
            // InternalGame.g:1819:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConditionAvantageAccess().getConditionAvantageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionAvantageAccess().getConditionAvantageKeyword_1());
            		
            // InternalGame.g:1829:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGame.g:1830:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGame.g:1830:4: (lv_name_2_0= RULE_ID )
            // InternalGame.g:1831:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getConditionAvantageAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionAvantageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getConditionAvantageAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGame.g:1851:3: (otherlv_4= 'connaissanceRequise' ( (otherlv_5= RULE_ID ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==36) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalGame.g:1852:4: otherlv_4= 'connaissanceRequise' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getConditionAvantageAccess().getConnaissanceRequiseKeyword_4_0());
                    			
                    // InternalGame.g:1856:4: ( (otherlv_5= RULE_ID ) )
                    // InternalGame.g:1857:5: (otherlv_5= RULE_ID )
                    {
                    // InternalGame.g:1857:5: (otherlv_5= RULE_ID )
                    // InternalGame.g:1858:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionAvantageRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_33); 

                    						newLeafNode(otherlv_5, grammarAccess.getConditionAvantageAccess().getConnaissanceRequiseConnaissanceCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGame.g:1870:3: (otherlv_6= 'connaissanceInterdite' ( (otherlv_7= RULE_ID ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==37) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalGame.g:1871:4: otherlv_6= 'connaissanceInterdite' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getConditionAvantageAccess().getConnaissanceInterditeKeyword_5_0());
                    			
                    // InternalGame.g:1875:4: ( (otherlv_7= RULE_ID ) )
                    // InternalGame.g:1876:5: (otherlv_7= RULE_ID )
                    {
                    // InternalGame.g:1876:5: (otherlv_7= RULE_ID )
                    // InternalGame.g:1877:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionAvantageRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_34); 

                    						newLeafNode(otherlv_7, grammarAccess.getConditionAvantageAccess().getConnaissanceInterditeConnaissanceCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGame.g:1889:3: (otherlv_8= 'objetRequis' ( (otherlv_9= RULE_ID ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==38) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalGame.g:1890:4: otherlv_8= 'objetRequis' ( (otherlv_9= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getConditionAvantageAccess().getObjetRequisKeyword_6_0());
                    			
                    // InternalGame.g:1894:4: ( (otherlv_9= RULE_ID ) )
                    // InternalGame.g:1895:5: (otherlv_9= RULE_ID )
                    {
                    // InternalGame.g:1895:5: (otherlv_9= RULE_ID )
                    // InternalGame.g:1896:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionAvantageRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_35); 

                    						newLeafNode(otherlv_9, grammarAccess.getConditionAvantageAccess().getObjetRequisQteObjetCrossReference_6_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGame.g:1908:3: (otherlv_10= 'objetInterdit' ( (otherlv_11= RULE_ID ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==39) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalGame.g:1909:4: otherlv_10= 'objetInterdit' ( (otherlv_11= RULE_ID ) )
                    {
                    otherlv_10=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getConditionAvantageAccess().getObjetInterditKeyword_7_0());
                    			
                    // InternalGame.g:1913:4: ( (otherlv_11= RULE_ID ) )
                    // InternalGame.g:1914:5: (otherlv_11= RULE_ID )
                    {
                    // InternalGame.g:1914:5: (otherlv_11= RULE_ID )
                    // InternalGame.g:1915:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionAvantageRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_36); 

                    						newLeafNode(otherlv_11, grammarAccess.getConditionAvantageAccess().getObjetInterditQteObjetCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getConditionAvantageAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleConditionAvantage"


    // $ANTLR start "entryRuleChoix"
    // InternalGame.g:1935:1: entryRuleChoix returns [EObject current=null] : iv_ruleChoix= ruleChoix EOF ;
    public final EObject entryRuleChoix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoix = null;


        try {
            // InternalGame.g:1935:46: (iv_ruleChoix= ruleChoix EOF )
            // InternalGame.g:1936:2: iv_ruleChoix= ruleChoix EOF
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
    // InternalGame.g:1942:1: ruleChoix returns [EObject current=null] : ( ( (lv_bonne_0_0= 'bonne' ) )? otherlv_1= 'Choix' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'reponse' ( (lv_reponse_5_0= RULE_STRING ) ) )? (otherlv_6= 'connaisDon' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= 'interaction' ( (otherlv_11= RULE_ID ) ) (otherlv_12= 'objetCons' ( (lv_objetCons_13_0= ruleQteObjet ) ) (otherlv_14= ',' ( (lv_objetCons_15_0= ruleQteObjet ) ) )* )? (otherlv_16= 'objetDon' ( (lv_objetDon_17_0= ruleQteObjet ) ) (otherlv_18= ',' ( (lv_objetDon_19_0= ruleQteObjet ) ) )* )? otherlv_20= '}' ) ;
    public final EObject ruleChoix() throws RecognitionException {
        EObject current = null;

        Token lv_bonne_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_reponse_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        EObject lv_objetCons_13_0 = null;

        EObject lv_objetCons_15_0 = null;

        EObject lv_objetDon_17_0 = null;

        EObject lv_objetDon_19_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1948:2: ( ( ( (lv_bonne_0_0= 'bonne' ) )? otherlv_1= 'Choix' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'reponse' ( (lv_reponse_5_0= RULE_STRING ) ) )? (otherlv_6= 'connaisDon' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= 'interaction' ( (otherlv_11= RULE_ID ) ) (otherlv_12= 'objetCons' ( (lv_objetCons_13_0= ruleQteObjet ) ) (otherlv_14= ',' ( (lv_objetCons_15_0= ruleQteObjet ) ) )* )? (otherlv_16= 'objetDon' ( (lv_objetDon_17_0= ruleQteObjet ) ) (otherlv_18= ',' ( (lv_objetDon_19_0= ruleQteObjet ) ) )* )? otherlv_20= '}' ) )
            // InternalGame.g:1949:2: ( ( (lv_bonne_0_0= 'bonne' ) )? otherlv_1= 'Choix' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'reponse' ( (lv_reponse_5_0= RULE_STRING ) ) )? (otherlv_6= 'connaisDon' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= 'interaction' ( (otherlv_11= RULE_ID ) ) (otherlv_12= 'objetCons' ( (lv_objetCons_13_0= ruleQteObjet ) ) (otherlv_14= ',' ( (lv_objetCons_15_0= ruleQteObjet ) ) )* )? (otherlv_16= 'objetDon' ( (lv_objetDon_17_0= ruleQteObjet ) ) (otherlv_18= ',' ( (lv_objetDon_19_0= ruleQteObjet ) ) )* )? otherlv_20= '}' )
            {
            // InternalGame.g:1949:2: ( ( (lv_bonne_0_0= 'bonne' ) )? otherlv_1= 'Choix' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'reponse' ( (lv_reponse_5_0= RULE_STRING ) ) )? (otherlv_6= 'connaisDon' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= 'interaction' ( (otherlv_11= RULE_ID ) ) (otherlv_12= 'objetCons' ( (lv_objetCons_13_0= ruleQteObjet ) ) (otherlv_14= ',' ( (lv_objetCons_15_0= ruleQteObjet ) ) )* )? (otherlv_16= 'objetDon' ( (lv_objetDon_17_0= ruleQteObjet ) ) (otherlv_18= ',' ( (lv_objetDon_19_0= ruleQteObjet ) ) )* )? otherlv_20= '}' )
            // InternalGame.g:1950:3: ( (lv_bonne_0_0= 'bonne' ) )? otherlv_1= 'Choix' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'reponse' ( (lv_reponse_5_0= RULE_STRING ) ) )? (otherlv_6= 'connaisDon' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= 'interaction' ( (otherlv_11= RULE_ID ) ) (otherlv_12= 'objetCons' ( (lv_objetCons_13_0= ruleQteObjet ) ) (otherlv_14= ',' ( (lv_objetCons_15_0= ruleQteObjet ) ) )* )? (otherlv_16= 'objetDon' ( (lv_objetDon_17_0= ruleQteObjet ) ) (otherlv_18= ',' ( (lv_objetDon_19_0= ruleQteObjet ) ) )* )? otherlv_20= '}'
            {
            // InternalGame.g:1950:3: ( (lv_bonne_0_0= 'bonne' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==50) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalGame.g:1951:4: (lv_bonne_0_0= 'bonne' )
                    {
                    // InternalGame.g:1951:4: (lv_bonne_0_0= 'bonne' )
                    // InternalGame.g:1952:5: lv_bonne_0_0= 'bonne'
                    {
                    lv_bonne_0_0=(Token)match(input,50,FOLLOW_48); 

                    					newLeafNode(lv_bonne_0_0, grammarAccess.getChoixAccess().getBonneBonneKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getChoixRule());
                    					}
                    					setWithLastConsumed(current, "bonne", lv_bonne_0_0 != null, "bonne");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getChoixAccess().getChoixKeyword_1());
            		
            // InternalGame.g:1968:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGame.g:1969:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGame.g:1969:4: (lv_name_2_0= RULE_ID )
            // InternalGame.g:1970:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getChoixAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoixRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_49); 

            			newLeafNode(otherlv_3, grammarAccess.getChoixAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGame.g:1990:3: (otherlv_4= 'reponse' ( (lv_reponse_5_0= RULE_STRING ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==52) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalGame.g:1991:4: otherlv_4= 'reponse' ( (lv_reponse_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,52,FOLLOW_38); 

                    				newLeafNode(otherlv_4, grammarAccess.getChoixAccess().getReponseKeyword_4_0());
                    			
                    // InternalGame.g:1995:4: ( (lv_reponse_5_0= RULE_STRING ) )
                    // InternalGame.g:1996:5: (lv_reponse_5_0= RULE_STRING )
                    {
                    // InternalGame.g:1996:5: (lv_reponse_5_0= RULE_STRING )
                    // InternalGame.g:1997:6: lv_reponse_5_0= RULE_STRING
                    {
                    lv_reponse_5_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

                    						newLeafNode(lv_reponse_5_0, grammarAccess.getChoixAccess().getReponseSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChoixRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"reponse",
                    							lv_reponse_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGame.g:2014:3: (otherlv_6= 'connaisDon' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==53) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalGame.g:2015:4: otherlv_6= 'connaisDon' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    {
                    otherlv_6=(Token)match(input,53,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getChoixAccess().getConnaisDonKeyword_5_0());
                    			
                    // InternalGame.g:2019:4: ( (otherlv_7= RULE_ID ) )
                    // InternalGame.g:2020:5: (otherlv_7= RULE_ID )
                    {
                    // InternalGame.g:2020:5: (otherlv_7= RULE_ID )
                    // InternalGame.g:2021:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChoixRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_51); 

                    						newLeafNode(otherlv_7, grammarAccess.getChoixAccess().getConnaisDonConnaissanceCrossReference_5_1_0());
                    					

                    }


                    }

                    // InternalGame.g:2032:4: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==13) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalGame.g:2033:5: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,13,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getChoixAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalGame.g:2037:5: ( (otherlv_9= RULE_ID ) )
                    	    // InternalGame.g:2038:6: (otherlv_9= RULE_ID )
                    	    {
                    	    // InternalGame.g:2038:6: (otherlv_9= RULE_ID )
                    	    // InternalGame.g:2039:7: otherlv_9= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getChoixRule());
                    	    							}
                    	    						
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_51); 

                    	    							newLeafNode(otherlv_9, grammarAccess.getChoixAccess().getConnaisDonConnaissanceCrossReference_5_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,54,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getChoixAccess().getInteractionKeyword_6());
            		
            // InternalGame.g:2056:3: ( (otherlv_11= RULE_ID ) )
            // InternalGame.g:2057:4: (otherlv_11= RULE_ID )
            {
            // InternalGame.g:2057:4: (otherlv_11= RULE_ID )
            // InternalGame.g:2058:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoixRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_52); 

            					newLeafNode(otherlv_11, grammarAccess.getChoixAccess().getInteractionInteractionCrossReference_7_0());
            				

            }


            }

            // InternalGame.g:2069:3: (otherlv_12= 'objetCons' ( (lv_objetCons_13_0= ruleQteObjet ) ) (otherlv_14= ',' ( (lv_objetCons_15_0= ruleQteObjet ) ) )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==55) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalGame.g:2070:4: otherlv_12= 'objetCons' ( (lv_objetCons_13_0= ruleQteObjet ) ) (otherlv_14= ',' ( (lv_objetCons_15_0= ruleQteObjet ) ) )*
                    {
                    otherlv_12=(Token)match(input,55,FOLLOW_53); 

                    				newLeafNode(otherlv_12, grammarAccess.getChoixAccess().getObjetConsKeyword_8_0());
                    			
                    // InternalGame.g:2074:4: ( (lv_objetCons_13_0= ruleQteObjet ) )
                    // InternalGame.g:2075:5: (lv_objetCons_13_0= ruleQteObjet )
                    {
                    // InternalGame.g:2075:5: (lv_objetCons_13_0= ruleQteObjet )
                    // InternalGame.g:2076:6: lv_objetCons_13_0= ruleQteObjet
                    {

                    						newCompositeNode(grammarAccess.getChoixAccess().getObjetConsQteObjetParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_54);
                    lv_objetCons_13_0=ruleQteObjet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChoixRule());
                    						}
                    						add(
                    							current,
                    							"objetCons",
                    							lv_objetCons_13_0,
                    							"game.xtext.Game.QteObjet");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGame.g:2093:4: (otherlv_14= ',' ( (lv_objetCons_15_0= ruleQteObjet ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==13) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalGame.g:2094:5: otherlv_14= ',' ( (lv_objetCons_15_0= ruleQteObjet ) )
                    	    {
                    	    otherlv_14=(Token)match(input,13,FOLLOW_53); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getChoixAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalGame.g:2098:5: ( (lv_objetCons_15_0= ruleQteObjet ) )
                    	    // InternalGame.g:2099:6: (lv_objetCons_15_0= ruleQteObjet )
                    	    {
                    	    // InternalGame.g:2099:6: (lv_objetCons_15_0= ruleQteObjet )
                    	    // InternalGame.g:2100:7: lv_objetCons_15_0= ruleQteObjet
                    	    {

                    	    							newCompositeNode(grammarAccess.getChoixAccess().getObjetConsQteObjetParserRuleCall_8_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_54);
                    	    lv_objetCons_15_0=ruleQteObjet();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getChoixRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"objetCons",
                    	    								lv_objetCons_15_0,
                    	    								"game.xtext.Game.QteObjet");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalGame.g:2119:3: (otherlv_16= 'objetDon' ( (lv_objetDon_17_0= ruleQteObjet ) ) (otherlv_18= ',' ( (lv_objetDon_19_0= ruleQteObjet ) ) )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==56) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalGame.g:2120:4: otherlv_16= 'objetDon' ( (lv_objetDon_17_0= ruleQteObjet ) ) (otherlv_18= ',' ( (lv_objetDon_19_0= ruleQteObjet ) ) )*
                    {
                    otherlv_16=(Token)match(input,56,FOLLOW_53); 

                    				newLeafNode(otherlv_16, grammarAccess.getChoixAccess().getObjetDonKeyword_9_0());
                    			
                    // InternalGame.g:2124:4: ( (lv_objetDon_17_0= ruleQteObjet ) )
                    // InternalGame.g:2125:5: (lv_objetDon_17_0= ruleQteObjet )
                    {
                    // InternalGame.g:2125:5: (lv_objetDon_17_0= ruleQteObjet )
                    // InternalGame.g:2126:6: lv_objetDon_17_0= ruleQteObjet
                    {

                    						newCompositeNode(grammarAccess.getChoixAccess().getObjetDonQteObjetParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_objetDon_17_0=ruleQteObjet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChoixRule());
                    						}
                    						add(
                    							current,
                    							"objetDon",
                    							lv_objetDon_17_0,
                    							"game.xtext.Game.QteObjet");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGame.g:2143:4: (otherlv_18= ',' ( (lv_objetDon_19_0= ruleQteObjet ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==13) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalGame.g:2144:5: otherlv_18= ',' ( (lv_objetDon_19_0= ruleQteObjet ) )
                    	    {
                    	    otherlv_18=(Token)match(input,13,FOLLOW_53); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getChoixAccess().getCommaKeyword_9_2_0());
                    	    				
                    	    // InternalGame.g:2148:5: ( (lv_objetDon_19_0= ruleQteObjet ) )
                    	    // InternalGame.g:2149:6: (lv_objetDon_19_0= ruleQteObjet )
                    	    {
                    	    // InternalGame.g:2149:6: (lv_objetDon_19_0= ruleQteObjet )
                    	    // InternalGame.g:2150:7: lv_objetDon_19_0= ruleQteObjet
                    	    {

                    	    							newCompositeNode(grammarAccess.getChoixAccess().getObjetDonQteObjetParserRuleCall_9_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_objetDon_19_0=ruleQteObjet();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getChoixRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"objetDon",
                    	    								lv_objetDon_19_0,
                    	    								"game.xtext.Game.QteObjet");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_20=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getChoixAccess().getRightCurlyBracketKeyword_10());
            		

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


    // $ANTLR start "entryRuleQteObjet"
    // InternalGame.g:2177:1: entryRuleQteObjet returns [EObject current=null] : iv_ruleQteObjet= ruleQteObjet EOF ;
    public final EObject entryRuleQteObjet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQteObjet = null;


        try {
            // InternalGame.g:2177:49: (iv_ruleQteObjet= ruleQteObjet EOF )
            // InternalGame.g:2178:2: iv_ruleQteObjet= ruleQteObjet EOF
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
    // InternalGame.g:2184:1: ruleQteObjet returns [EObject current=null] : ( () otherlv_1= 'QteObjet' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'qte' ( (lv_qte_5_0= ruleEInt ) ) )? (otherlv_6= 'objet' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleQteObjet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_qte_5_0 = null;



        	enterRule();

        try {
            // InternalGame.g:2190:2: ( ( () otherlv_1= 'QteObjet' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'qte' ( (lv_qte_5_0= ruleEInt ) ) )? (otherlv_6= 'objet' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' ) )
            // InternalGame.g:2191:2: ( () otherlv_1= 'QteObjet' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'qte' ( (lv_qte_5_0= ruleEInt ) ) )? (otherlv_6= 'objet' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' )
            {
            // InternalGame.g:2191:2: ( () otherlv_1= 'QteObjet' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'qte' ( (lv_qte_5_0= ruleEInt ) ) )? (otherlv_6= 'objet' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' )
            // InternalGame.g:2192:3: () otherlv_1= 'QteObjet' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'qte' ( (lv_qte_5_0= ruleEInt ) ) )? (otherlv_6= 'objet' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}'
            {
            // InternalGame.g:2192:3: ()
            // InternalGame.g:2193:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQteObjetAccess().getQteObjetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getQteObjetAccess().getQteObjetKeyword_1());
            		
            // InternalGame.g:2203:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGame.g:2204:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGame.g:2204:4: (lv_name_2_0= RULE_ID )
            // InternalGame.g:2205:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getQteObjetAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQteObjetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_55); 

            			newLeafNode(otherlv_3, grammarAccess.getQteObjetAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGame.g:2225:3: (otherlv_4= 'qte' ( (lv_qte_5_0= ruleEInt ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==48) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalGame.g:2226:4: otherlv_4= 'qte' ( (lv_qte_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,48,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getQteObjetAccess().getQteKeyword_4_0());
                    			
                    // InternalGame.g:2230:4: ( (lv_qte_5_0= ruleEInt ) )
                    // InternalGame.g:2231:5: (lv_qte_5_0= ruleEInt )
                    {
                    // InternalGame.g:2231:5: (lv_qte_5_0= ruleEInt )
                    // InternalGame.g:2232:6: lv_qte_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getQteObjetAccess().getQteEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_56);
                    lv_qte_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQteObjetRule());
                    						}
                    						set(
                    							current,
                    							"qte",
                    							lv_qte_5_0,
                    							"game.xtext.Game.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGame.g:2250:3: (otherlv_6= 'objet' ( (otherlv_7= RULE_ID ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==58) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalGame.g:2251:4: otherlv_6= 'objet' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,58,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getQteObjetAccess().getObjetKeyword_5_0());
                    			
                    // InternalGame.g:2255:4: ( (otherlv_7= RULE_ID ) )
                    // InternalGame.g:2256:5: (otherlv_7= RULE_ID )
                    {
                    // InternalGame.g:2256:5: (otherlv_7= RULE_ID )
                    // InternalGame.g:2257:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQteObjetRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_36); 

                    						newLeafNode(otherlv_7, grammarAccess.getQteObjetAccess().getObjetObjetCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getQteObjetAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleEInt"
    // InternalGame.g:2277:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalGame.g:2277:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalGame.g:2278:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalGame.g:2284:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalGame.g:2290:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalGame.g:2291:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalGame.g:2291:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalGame.g:2292:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalGame.g:2292:3: (kw= '-' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==59) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalGame.g:2293:4: kw= '-'
                    {
                    kw=(Token)match(input,59,FOLLOW_57); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleConditionChemin"
    // InternalGame.g:2310:1: entryRuleConditionChemin returns [EObject current=null] : iv_ruleConditionChemin= ruleConditionChemin EOF ;
    public final EObject entryRuleConditionChemin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionChemin = null;


        try {
            // InternalGame.g:2310:56: (iv_ruleConditionChemin= ruleConditionChemin EOF )
            // InternalGame.g:2311:2: iv_ruleConditionChemin= ruleConditionChemin EOF
            {
             newCompositeNode(grammarAccess.getConditionCheminRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionChemin=ruleConditionChemin();

            state._fsp--;

             current =iv_ruleConditionChemin; 
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
    // $ANTLR end "entryRuleConditionChemin"


    // $ANTLR start "ruleConditionChemin"
    // InternalGame.g:2317:1: ruleConditionChemin returns [EObject current=null] : ( () otherlv_1= 'ConditionChemin' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'connaissanceRequise' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'connaissanceInterdite' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'objetRequis' ( (otherlv_9= RULE_ID ) ) )? (otherlv_10= 'objetInterdit' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleConditionChemin() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalGame.g:2323:2: ( ( () otherlv_1= 'ConditionChemin' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'connaissanceRequise' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'connaissanceInterdite' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'objetRequis' ( (otherlv_9= RULE_ID ) ) )? (otherlv_10= 'objetInterdit' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= '}' ) )
            // InternalGame.g:2324:2: ( () otherlv_1= 'ConditionChemin' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'connaissanceRequise' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'connaissanceInterdite' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'objetRequis' ( (otherlv_9= RULE_ID ) ) )? (otherlv_10= 'objetInterdit' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= '}' )
            {
            // InternalGame.g:2324:2: ( () otherlv_1= 'ConditionChemin' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'connaissanceRequise' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'connaissanceInterdite' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'objetRequis' ( (otherlv_9= RULE_ID ) ) )? (otherlv_10= 'objetInterdit' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= '}' )
            // InternalGame.g:2325:3: () otherlv_1= 'ConditionChemin' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'connaissanceRequise' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'connaissanceInterdite' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'objetRequis' ( (otherlv_9= RULE_ID ) ) )? (otherlv_10= 'objetInterdit' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= '}'
            {
            // InternalGame.g:2325:3: ()
            // InternalGame.g:2326:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConditionCheminAccess().getConditionCheminAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionCheminAccess().getConditionCheminKeyword_1());
            		
            // InternalGame.g:2336:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGame.g:2337:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGame.g:2337:4: (lv_name_2_0= RULE_ID )
            // InternalGame.g:2338:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getConditionCheminAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionCheminRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getConditionCheminAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGame.g:2358:3: (otherlv_4= 'connaissanceRequise' ( (otherlv_5= RULE_ID ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==36) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalGame.g:2359:4: otherlv_4= 'connaissanceRequise' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getConditionCheminAccess().getConnaissanceRequiseKeyword_4_0());
                    			
                    // InternalGame.g:2363:4: ( (otherlv_5= RULE_ID ) )
                    // InternalGame.g:2364:5: (otherlv_5= RULE_ID )
                    {
                    // InternalGame.g:2364:5: (otherlv_5= RULE_ID )
                    // InternalGame.g:2365:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionCheminRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_33); 

                    						newLeafNode(otherlv_5, grammarAccess.getConditionCheminAccess().getConnaissanceRequiseConnaissanceCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGame.g:2377:3: (otherlv_6= 'connaissanceInterdite' ( (otherlv_7= RULE_ID ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==37) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalGame.g:2378:4: otherlv_6= 'connaissanceInterdite' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getConditionCheminAccess().getConnaissanceInterditeKeyword_5_0());
                    			
                    // InternalGame.g:2382:4: ( (otherlv_7= RULE_ID ) )
                    // InternalGame.g:2383:5: (otherlv_7= RULE_ID )
                    {
                    // InternalGame.g:2383:5: (otherlv_7= RULE_ID )
                    // InternalGame.g:2384:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionCheminRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_34); 

                    						newLeafNode(otherlv_7, grammarAccess.getConditionCheminAccess().getConnaissanceInterditeConnaissanceCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGame.g:2396:3: (otherlv_8= 'objetRequis' ( (otherlv_9= RULE_ID ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==38) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalGame.g:2397:4: otherlv_8= 'objetRequis' ( (otherlv_9= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getConditionCheminAccess().getObjetRequisKeyword_6_0());
                    			
                    // InternalGame.g:2401:4: ( (otherlv_9= RULE_ID ) )
                    // InternalGame.g:2402:5: (otherlv_9= RULE_ID )
                    {
                    // InternalGame.g:2402:5: (otherlv_9= RULE_ID )
                    // InternalGame.g:2403:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionCheminRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_35); 

                    						newLeafNode(otherlv_9, grammarAccess.getConditionCheminAccess().getObjetRequisQteObjetCrossReference_6_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGame.g:2415:3: (otherlv_10= 'objetInterdit' ( (otherlv_11= RULE_ID ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==39) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalGame.g:2416:4: otherlv_10= 'objetInterdit' ( (otherlv_11= RULE_ID ) )
                    {
                    otherlv_10=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getConditionCheminAccess().getObjetInterditKeyword_7_0());
                    			
                    // InternalGame.g:2420:4: ( (otherlv_11= RULE_ID ) )
                    // InternalGame.g:2421:5: (otherlv_11= RULE_ID )
                    {
                    // InternalGame.g:2421:5: (otherlv_11= RULE_ID )
                    // InternalGame.g:2422:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionCheminRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_36); 

                    						newLeafNode(otherlv_11, grammarAccess.getConditionCheminAccess().getObjetInterditQteObjetCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getConditionCheminAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleConditionChemin"


    // $ANTLR start "ruleNature"
    // InternalGame.g:2442:1: ruleNature returns [Enumerator current=null] : ( (enumLiteral_0= 'depart' ) | (enumLiteral_1= 'fin' ) | (enumLiteral_2= 'inter' ) ) ;
    public final Enumerator ruleNature() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGame.g:2448:2: ( ( (enumLiteral_0= 'depart' ) | (enumLiteral_1= 'fin' ) | (enumLiteral_2= 'inter' ) ) )
            // InternalGame.g:2449:2: ( (enumLiteral_0= 'depart' ) | (enumLiteral_1= 'fin' ) | (enumLiteral_2= 'inter' ) )
            {
            // InternalGame.g:2449:2: ( (enumLiteral_0= 'depart' ) | (enumLiteral_1= 'fin' ) | (enumLiteral_2= 'inter' ) )
            int alt60=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt60=1;
                }
                break;
            case 62:
                {
                alt60=2;
                }
                break;
            case 63:
                {
                alt60=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalGame.g:2450:3: (enumLiteral_0= 'depart' )
                    {
                    // InternalGame.g:2450:3: (enumLiteral_0= 'depart' )
                    // InternalGame.g:2451:4: enumLiteral_0= 'depart'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getNatureAccess().getDepartEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNatureAccess().getDepartEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:2458:3: (enumLiteral_1= 'fin' )
                    {
                    // InternalGame.g:2458:3: (enumLiteral_1= 'fin' )
                    // InternalGame.g:2459:4: enumLiteral_1= 'fin'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getNatureAccess().getFinEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNatureAccess().getFinEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:2466:3: (enumLiteral_2= 'inter' )
                    {
                    // InternalGame.g:2466:3: (enumLiteral_2= 'inter' )
                    // InternalGame.g:2467:4: enumLiteral_2= 'inter'
                    {
                    enumLiteral_2=(Token)match(input,63,FOLLOW_2); 

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


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\26\1\uffff\1\32\11\uffff";
    static final String dfa_3s = "\1\74\1\uffff\1\37\11\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\2\1\1\4\uffff\1\4\3\uffff\1\11\4\uffff\1\7\3\uffff\1\5\1\uffff\2\6\1\uffff\1\12\2\10\5\uffff\1\3\2\uffff\1\13",
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

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "217:2: (this_Place_0= rulePlace | this_QteObjet_1= ruleQteObjet | this_Personne_2= rulePersonne | this_Connaissance_3= ruleConnaissance | this_Objet_4= ruleObjet | this_Interaction_5= ruleInteraction | this_Choix_6= ruleChoix | this_ConditionPersonne_7= ruleConditionPersonne | this_ConditionAvantage_8= ruleConditionAvantage | this_ConditionChemin_9= ruleConditionChemin )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x120ED10886400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000006400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0800000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000304000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000206000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0xE000000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000060004000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040006000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000420006000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400006000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000F000004000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000E000004000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000C000004000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000004000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000280020004000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200020004000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200000006000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001200020044000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000200020044000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0070000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0040000000002000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0180000000004000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0100000000006000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0401000000004000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0400000000004000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000040L});

}