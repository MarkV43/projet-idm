package fr.n7.petriNet.txt.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.n7.petriNet.txt.services.NETGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNETParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'net'", "'pl'", "'('", "')'", "'tr'", "'-'", "'arc'", "'>'", "'?>'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalNETParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNETParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNETParser.tokenNames; }
    public String getGrammarFileName() { return "InternalNET.g"; }



     	private NETGrammarAccess grammarAccess;

        public InternalNETParser(TokenStream input, NETGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Network";
       	}

       	@Override
       	protected NETGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleNetwork"
    // InternalNET.g:64:1: entryRuleNetwork returns [EObject current=null] : iv_ruleNetwork= ruleNetwork EOF ;
    public final EObject entryRuleNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetwork = null;


        try {
            // InternalNET.g:64:48: (iv_ruleNetwork= ruleNetwork EOF )
            // InternalNET.g:65:2: iv_ruleNetwork= ruleNetwork EOF
            {
             newCompositeNode(grammarAccess.getNetworkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetwork=ruleNetwork();

            state._fsp--;

             current =iv_ruleNetwork; 
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
    // $ANTLR end "entryRuleNetwork"


    // $ANTLR start "ruleNetwork"
    // InternalNET.g:71:1: ruleNetwork returns [EObject current=null] : ( () otherlv_1= 'net' ( (lv_name_2_0= ruleEString ) ) ( (lv_elements_3_0= ruleElement ) )+ ( (lv_arcs_4_0= ruleArc ) )+ ) ;
    public final EObject ruleNetwork() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_elements_3_0 = null;

        EObject lv_arcs_4_0 = null;



        	enterRule();

        try {
            // InternalNET.g:77:2: ( ( () otherlv_1= 'net' ( (lv_name_2_0= ruleEString ) ) ( (lv_elements_3_0= ruleElement ) )+ ( (lv_arcs_4_0= ruleArc ) )+ ) )
            // InternalNET.g:78:2: ( () otherlv_1= 'net' ( (lv_name_2_0= ruleEString ) ) ( (lv_elements_3_0= ruleElement ) )+ ( (lv_arcs_4_0= ruleArc ) )+ )
            {
            // InternalNET.g:78:2: ( () otherlv_1= 'net' ( (lv_name_2_0= ruleEString ) ) ( (lv_elements_3_0= ruleElement ) )+ ( (lv_arcs_4_0= ruleArc ) )+ )
            // InternalNET.g:79:3: () otherlv_1= 'net' ( (lv_name_2_0= ruleEString ) ) ( (lv_elements_3_0= ruleElement ) )+ ( (lv_arcs_4_0= ruleArc ) )+
            {
            // InternalNET.g:79:3: ()
            // InternalNET.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNetworkAccess().getNetworkAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getNetworkAccess().getNetKeyword_1());
            		
            // InternalNET.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalNET.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalNET.g:91:4: (lv_name_2_0= ruleEString )
            // InternalNET.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNetworkAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNetworkRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.n7.petriNet.txt.NET.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNET.g:109:3: ( (lv_elements_3_0= ruleElement ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalNET.g:110:4: (lv_elements_3_0= ruleElement )
            	    {
            	    // InternalNET.g:110:4: (lv_elements_3_0= ruleElement )
            	    // InternalNET.g:111:5: lv_elements_3_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getNetworkAccess().getElementsElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_elements_3_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNetworkRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"fr.n7.petriNet.txt.NET.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalNET.g:128:3: ( (lv_arcs_4_0= ruleArc ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)||LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalNET.g:129:4: (lv_arcs_4_0= ruleArc )
            	    {
            	    // InternalNET.g:129:4: (lv_arcs_4_0= ruleArc )
            	    // InternalNET.g:130:5: lv_arcs_4_0= ruleArc
            	    {

            	    					newCompositeNode(grammarAccess.getNetworkAccess().getArcsArcParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_arcs_4_0=ruleArc();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNetworkRule());
            	    					}
            	    					add(
            	    						current,
            	    						"arcs",
            	    						lv_arcs_4_0,
            	    						"fr.n7.petriNet.txt.NET.Arc");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


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
    // $ANTLR end "ruleNetwork"


    // $ANTLR start "entryRuleElement"
    // InternalNET.g:151:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalNET.g:151:48: (iv_ruleElement= ruleElement EOF )
            // InternalNET.g:152:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalNET.g:158:1: ruleElement returns [EObject current=null] : (this_Place_0= rulePlace | this_Transition_1= ruleTransition ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Place_0 = null;

        EObject this_Transition_1 = null;



        	enterRule();

        try {
            // InternalNET.g:164:2: ( (this_Place_0= rulePlace | this_Transition_1= ruleTransition ) )
            // InternalNET.g:165:2: (this_Place_0= rulePlace | this_Transition_1= ruleTransition )
            {
            // InternalNET.g:165:2: (this_Place_0= rulePlace | this_Transition_1= ruleTransition )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalNET.g:166:3: this_Place_0= rulePlace
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getPlaceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Place_0=rulePlace();

                    state._fsp--;


                    			current = this_Place_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalNET.g:175:3: this_Transition_1= ruleTransition
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getTransitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Transition_1=ruleTransition();

                    state._fsp--;


                    			current = this_Transition_1;
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleEString"
    // InternalNET.g:187:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalNET.g:187:47: (iv_ruleEString= ruleEString EOF )
            // InternalNET.g:188:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalNET.g:194:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalNET.g:200:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalNET.g:201:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalNET.g:201:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalNET.g:202:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalNET.g:210:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePlace"
    // InternalNET.g:221:1: entryRulePlace returns [EObject current=null] : iv_rulePlace= rulePlace EOF ;
    public final EObject entryRulePlace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlace = null;


        try {
            // InternalNET.g:221:46: (iv_rulePlace= rulePlace EOF )
            // InternalNET.g:222:2: iv_rulePlace= rulePlace EOF
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
    // InternalNET.g:228:1: rulePlace returns [EObject current=null] : (otherlv_0= 'pl' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( (lv_tokens_3_0= ruleEInt ) ) otherlv_4= ')' )? ) ;
    public final EObject rulePlace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_tokens_3_0 = null;



        	enterRule();

        try {
            // InternalNET.g:234:2: ( (otherlv_0= 'pl' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( (lv_tokens_3_0= ruleEInt ) ) otherlv_4= ')' )? ) )
            // InternalNET.g:235:2: (otherlv_0= 'pl' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( (lv_tokens_3_0= ruleEInt ) ) otherlv_4= ')' )? )
            {
            // InternalNET.g:235:2: (otherlv_0= 'pl' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( (lv_tokens_3_0= ruleEInt ) ) otherlv_4= ')' )? )
            // InternalNET.g:236:3: otherlv_0= 'pl' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( (lv_tokens_3_0= ruleEInt ) ) otherlv_4= ')' )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlaceAccess().getPlKeyword_0());
            		
            // InternalNET.g:240:3: ( (lv_name_1_0= ruleEString ) )
            // InternalNET.g:241:4: (lv_name_1_0= ruleEString )
            {
            // InternalNET.g:241:4: (lv_name_1_0= ruleEString )
            // InternalNET.g:242:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPlaceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlaceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.n7.petriNet.txt.NET.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNET.g:259:3: (otherlv_2= '(' ( (lv_tokens_3_0= ruleEInt ) ) otherlv_4= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalNET.g:260:4: otherlv_2= '(' ( (lv_tokens_3_0= ruleEInt ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getPlaceAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalNET.g:264:4: ( (lv_tokens_3_0= ruleEInt ) )
                    // InternalNET.g:265:5: (lv_tokens_3_0= ruleEInt )
                    {
                    // InternalNET.g:265:5: (lv_tokens_3_0= ruleEInt )
                    // InternalNET.g:266:6: lv_tokens_3_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPlaceAccess().getTokensEIntParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_tokens_3_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlaceRule());
                    						}
                    						set(
                    							current,
                    							"tokens",
                    							lv_tokens_3_0,
                    							"fr.n7.petriNet.txt.NET.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPlaceAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

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
    // $ANTLR end "rulePlace"


    // $ANTLR start "entryRuleTransition"
    // InternalNET.g:292:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalNET.g:292:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalNET.g:293:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalNET.g:299:1: ruleTransition returns [EObject current=null] : ( () otherlv_1= 'tr' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalNET.g:305:2: ( ( () otherlv_1= 'tr' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalNET.g:306:2: ( () otherlv_1= 'tr' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalNET.g:306:2: ( () otherlv_1= 'tr' ( (lv_name_2_0= ruleEString ) ) )
            // InternalNET.g:307:3: () otherlv_1= 'tr' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalNET.g:307:3: ()
            // InternalNET.g:308:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransitionAccess().getTransitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getTrKeyword_1());
            		
            // InternalNET.g:318:3: ( (lv_name_2_0= ruleEString ) )
            // InternalNET.g:319:4: (lv_name_2_0= ruleEString )
            {
            // InternalNET.g:319:4: (lv_name_2_0= ruleEString )
            // InternalNET.g:320:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.n7.petriNet.txt.NET.EString");
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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleEInt"
    // InternalNET.g:341:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalNET.g:341:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalNET.g:342:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalNET.g:348:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalNET.g:354:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalNET.g:355:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalNET.g:355:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalNET.g:356:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalNET.g:356:3: (kw= '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalNET.g:357:4: kw= '-'
                    {
                    kw=(Token)match(input,16,FOLLOW_10); 

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


    // $ANTLR start "entryRuleArc"
    // InternalNET.g:374:1: entryRuleArc returns [EObject current=null] : iv_ruleArc= ruleArc EOF ;
    public final EObject entryRuleArc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArc = null;


        try {
            // InternalNET.g:374:44: (iv_ruleArc= ruleArc EOF )
            // InternalNET.g:375:2: iv_ruleArc= ruleArc EOF
            {
             newCompositeNode(grammarAccess.getArcRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArc=ruleArc();

            state._fsp--;

             current =iv_ruleArc; 
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
    // $ANTLR end "entryRuleArc"


    // $ANTLR start "ruleArc"
    // InternalNET.g:381:1: ruleArc returns [EObject current=null] : ( (otherlv_0= 'arc' this_Arc_Impl_1= ruleArc_Impl ) | this_ReadArc_2= ruleReadArc ) ;
    public final EObject ruleArc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Arc_Impl_1 = null;

        EObject this_ReadArc_2 = null;



        	enterRule();

        try {
            // InternalNET.g:387:2: ( ( (otherlv_0= 'arc' this_Arc_Impl_1= ruleArc_Impl ) | this_ReadArc_2= ruleReadArc ) )
            // InternalNET.g:388:2: ( (otherlv_0= 'arc' this_Arc_Impl_1= ruleArc_Impl ) | this_ReadArc_2= ruleReadArc )
            {
            // InternalNET.g:388:2: ( (otherlv_0= 'arc' this_Arc_Impl_1= ruleArc_Impl ) | this_ReadArc_2= ruleReadArc )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalNET.g:389:3: (otherlv_0= 'arc' this_Arc_Impl_1= ruleArc_Impl )
                    {
                    // InternalNET.g:389:3: (otherlv_0= 'arc' this_Arc_Impl_1= ruleArc_Impl )
                    // InternalNET.g:390:4: otherlv_0= 'arc' this_Arc_Impl_1= ruleArc_Impl
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getArcAccess().getArcKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getArcAccess().getArc_ImplParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Arc_Impl_1=ruleArc_Impl();

                    state._fsp--;


                    				current = this_Arc_Impl_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalNET.g:404:3: this_ReadArc_2= ruleReadArc
                    {

                    			newCompositeNode(grammarAccess.getArcAccess().getReadArcParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReadArc_2=ruleReadArc();

                    state._fsp--;


                    			current = this_ReadArc_2;
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
    // $ANTLR end "ruleArc"


    // $ANTLR start "entryRuleArc_Impl"
    // InternalNET.g:416:1: entryRuleArc_Impl returns [EObject current=null] : iv_ruleArc_Impl= ruleArc_Impl EOF ;
    public final EObject entryRuleArc_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArc_Impl = null;


        try {
            // InternalNET.g:416:49: (iv_ruleArc_Impl= ruleArc_Impl EOF )
            // InternalNET.g:417:2: iv_ruleArc_Impl= ruleArc_Impl EOF
            {
             newCompositeNode(grammarAccess.getArc_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArc_Impl=ruleArc_Impl();

            state._fsp--;

             current =iv_ruleArc_Impl; 
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
    // $ANTLR end "entryRuleArc_Impl"


    // $ANTLR start "ruleArc_Impl"
    // InternalNET.g:423:1: ruleArc_Impl returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '-' ( ( (lv_weight_2_0= ruleEInt ) ) otherlv_3= '-' )? otherlv_4= '>' ( ( ruleEString ) ) ) ;
    public final EObject ruleArc_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_weight_2_0 = null;



        	enterRule();

        try {
            // InternalNET.g:429:2: ( ( ( ( ruleEString ) ) otherlv_1= '-' ( ( (lv_weight_2_0= ruleEInt ) ) otherlv_3= '-' )? otherlv_4= '>' ( ( ruleEString ) ) ) )
            // InternalNET.g:430:2: ( ( ( ruleEString ) ) otherlv_1= '-' ( ( (lv_weight_2_0= ruleEInt ) ) otherlv_3= '-' )? otherlv_4= '>' ( ( ruleEString ) ) )
            {
            // InternalNET.g:430:2: ( ( ( ruleEString ) ) otherlv_1= '-' ( ( (lv_weight_2_0= ruleEInt ) ) otherlv_3= '-' )? otherlv_4= '>' ( ( ruleEString ) ) )
            // InternalNET.g:431:3: ( ( ruleEString ) ) otherlv_1= '-' ( ( (lv_weight_2_0= ruleEInt ) ) otherlv_3= '-' )? otherlv_4= '>' ( ( ruleEString ) )
            {
            // InternalNET.g:431:3: ( ( ruleEString ) )
            // InternalNET.g:432:4: ( ruleEString )
            {
            // InternalNET.g:432:4: ( ruleEString )
            // InternalNET.g:433:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArc_ImplRule());
            					}
            				

            					newCompositeNode(grammarAccess.getArc_ImplAccess().getPredecessorElementCrossReference_0_0());
            				
            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getArc_ImplAccess().getHyphenMinusKeyword_1());
            		
            // InternalNET.g:451:3: ( ( (lv_weight_2_0= ruleEInt ) ) otherlv_3= '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT||LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalNET.g:452:4: ( (lv_weight_2_0= ruleEInt ) ) otherlv_3= '-'
                    {
                    // InternalNET.g:452:4: ( (lv_weight_2_0= ruleEInt ) )
                    // InternalNET.g:453:5: (lv_weight_2_0= ruleEInt )
                    {
                    // InternalNET.g:453:5: (lv_weight_2_0= ruleEInt )
                    // InternalNET.g:454:6: lv_weight_2_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getArc_ImplAccess().getWeightEIntParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_weight_2_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArc_ImplRule());
                    						}
                    						set(
                    							current,
                    							"weight",
                    							lv_weight_2_0,
                    							"fr.n7.petriNet.txt.NET.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getArc_ImplAccess().getHyphenMinusKeyword_2_1());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getArc_ImplAccess().getGreaterThanSignKeyword_3());
            		
            // InternalNET.g:480:3: ( ( ruleEString ) )
            // InternalNET.g:481:4: ( ruleEString )
            {
            // InternalNET.g:481:4: ( ruleEString )
            // InternalNET.g:482:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArc_ImplRule());
            					}
            				

            					newCompositeNode(grammarAccess.getArc_ImplAccess().getSuccessorElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleArc_Impl"


    // $ANTLR start "entryRuleReadArc"
    // InternalNET.g:500:1: entryRuleReadArc returns [EObject current=null] : iv_ruleReadArc= ruleReadArc EOF ;
    public final EObject entryRuleReadArc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadArc = null;


        try {
            // InternalNET.g:500:48: (iv_ruleReadArc= ruleReadArc EOF )
            // InternalNET.g:501:2: iv_ruleReadArc= ruleReadArc EOF
            {
             newCompositeNode(grammarAccess.getReadArcRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReadArc=ruleReadArc();

            state._fsp--;

             current =iv_ruleReadArc; 
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
    // $ANTLR end "entryRuleReadArc"


    // $ANTLR start "ruleReadArc"
    // InternalNET.g:507:1: ruleReadArc returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '-' ( (lv_weight_2_0= ruleEInt ) )? otherlv_3= '?>' ( ( ruleEString ) ) ) ;
    public final EObject ruleReadArc() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_weight_2_0 = null;



        	enterRule();

        try {
            // InternalNET.g:513:2: ( ( ( ( ruleEString ) ) otherlv_1= '-' ( (lv_weight_2_0= ruleEInt ) )? otherlv_3= '?>' ( ( ruleEString ) ) ) )
            // InternalNET.g:514:2: ( ( ( ruleEString ) ) otherlv_1= '-' ( (lv_weight_2_0= ruleEInt ) )? otherlv_3= '?>' ( ( ruleEString ) ) )
            {
            // InternalNET.g:514:2: ( ( ( ruleEString ) ) otherlv_1= '-' ( (lv_weight_2_0= ruleEInt ) )? otherlv_3= '?>' ( ( ruleEString ) ) )
            // InternalNET.g:515:3: ( ( ruleEString ) ) otherlv_1= '-' ( (lv_weight_2_0= ruleEInt ) )? otherlv_3= '?>' ( ( ruleEString ) )
            {
            // InternalNET.g:515:3: ( ( ruleEString ) )
            // InternalNET.g:516:4: ( ruleEString )
            {
            // InternalNET.g:516:4: ( ruleEString )
            // InternalNET.g:517:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReadArcRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReadArcAccess().getPredecessorElementCrossReference_0_0());
            				
            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getReadArcAccess().getHyphenMinusKeyword_1());
            		
            // InternalNET.g:535:3: ( (lv_weight_2_0= ruleEInt ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT||LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalNET.g:536:4: (lv_weight_2_0= ruleEInt )
                    {
                    // InternalNET.g:536:4: (lv_weight_2_0= ruleEInt )
                    // InternalNET.g:537:5: lv_weight_2_0= ruleEInt
                    {

                    					newCompositeNode(grammarAccess.getReadArcAccess().getWeightEIntParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_weight_2_0=ruleEInt();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getReadArcRule());
                    					}
                    					set(
                    						current,
                    						"weight",
                    						lv_weight_2_0,
                    						"fr.n7.petriNet.txt.NET.EInt");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getReadArcAccess().getQuestionMarkGreaterThanSignKeyword_3());
            		
            // InternalNET.g:558:3: ( ( ruleEString ) )
            // InternalNET.g:559:4: ( ruleEString )
            {
            // InternalNET.g:559:4: ( ruleEString )
            // InternalNET.g:560:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReadArcRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReadArcAccess().getSuccessorElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleReadArc"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000029030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020032L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000050040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000090040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});

}