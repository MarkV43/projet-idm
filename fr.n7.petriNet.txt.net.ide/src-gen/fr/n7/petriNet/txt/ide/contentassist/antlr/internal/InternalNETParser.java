package fr.n7.petriNet.txt.ide.contentassist.antlr.internal;

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
import fr.n7.petriNet.txt.services.NETGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNETParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(NETGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleNetwork"
    // InternalNET.g:53:1: entryRuleNetwork : ruleNetwork EOF ;
    public final void entryRuleNetwork() throws RecognitionException {
        try {
            // InternalNET.g:54:1: ( ruleNetwork EOF )
            // InternalNET.g:55:1: ruleNetwork EOF
            {
             before(grammarAccess.getNetworkRule()); 
            pushFollow(FOLLOW_1);
            ruleNetwork();

            state._fsp--;

             after(grammarAccess.getNetworkRule()); 
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
    // $ANTLR end "entryRuleNetwork"


    // $ANTLR start "ruleNetwork"
    // InternalNET.g:62:1: ruleNetwork : ( ( rule__Network__Group__0 ) ) ;
    public final void ruleNetwork() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:66:2: ( ( ( rule__Network__Group__0 ) ) )
            // InternalNET.g:67:2: ( ( rule__Network__Group__0 ) )
            {
            // InternalNET.g:67:2: ( ( rule__Network__Group__0 ) )
            // InternalNET.g:68:3: ( rule__Network__Group__0 )
            {
             before(grammarAccess.getNetworkAccess().getGroup()); 
            // InternalNET.g:69:3: ( rule__Network__Group__0 )
            // InternalNET.g:69:4: rule__Network__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Network__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNetworkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNetwork"


    // $ANTLR start "entryRuleElement"
    // InternalNET.g:78:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalNET.g:79:1: ( ruleElement EOF )
            // InternalNET.g:80:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalNET.g:87:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:91:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalNET.g:92:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalNET.g:92:2: ( ( rule__Element__Alternatives ) )
            // InternalNET.g:93:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalNET.g:94:3: ( rule__Element__Alternatives )
            // InternalNET.g:94:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleEString"
    // InternalNET.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalNET.g:104:1: ( ruleEString EOF )
            // InternalNET.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalNET.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalNET.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalNET.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalNET.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalNET.g:119:3: ( rule__EString__Alternatives )
            // InternalNET.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePlace"
    // InternalNET.g:128:1: entryRulePlace : rulePlace EOF ;
    public final void entryRulePlace() throws RecognitionException {
        try {
            // InternalNET.g:129:1: ( rulePlace EOF )
            // InternalNET.g:130:1: rulePlace EOF
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
    // InternalNET.g:137:1: rulePlace : ( ( rule__Place__Group__0 ) ) ;
    public final void rulePlace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:141:2: ( ( ( rule__Place__Group__0 ) ) )
            // InternalNET.g:142:2: ( ( rule__Place__Group__0 ) )
            {
            // InternalNET.g:142:2: ( ( rule__Place__Group__0 ) )
            // InternalNET.g:143:3: ( rule__Place__Group__0 )
            {
             before(grammarAccess.getPlaceAccess().getGroup()); 
            // InternalNET.g:144:3: ( rule__Place__Group__0 )
            // InternalNET.g:144:4: rule__Place__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleTransition"
    // InternalNET.g:153:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalNET.g:154:1: ( ruleTransition EOF )
            // InternalNET.g:155:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalNET.g:162:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:166:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalNET.g:167:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalNET.g:167:2: ( ( rule__Transition__Group__0 ) )
            // InternalNET.g:168:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalNET.g:169:3: ( rule__Transition__Group__0 )
            // InternalNET.g:169:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleEInt"
    // InternalNET.g:178:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalNET.g:179:1: ( ruleEInt EOF )
            // InternalNET.g:180:1: ruleEInt EOF
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
    // InternalNET.g:187:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:191:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalNET.g:192:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalNET.g:192:2: ( ( rule__EInt__Group__0 ) )
            // InternalNET.g:193:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalNET.g:194:3: ( rule__EInt__Group__0 )
            // InternalNET.g:194:4: rule__EInt__Group__0
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


    // $ANTLR start "entryRuleArc"
    // InternalNET.g:203:1: entryRuleArc : ruleArc EOF ;
    public final void entryRuleArc() throws RecognitionException {
        try {
            // InternalNET.g:204:1: ( ruleArc EOF )
            // InternalNET.g:205:1: ruleArc EOF
            {
             before(grammarAccess.getArcRule()); 
            pushFollow(FOLLOW_1);
            ruleArc();

            state._fsp--;

             after(grammarAccess.getArcRule()); 
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
    // $ANTLR end "entryRuleArc"


    // $ANTLR start "ruleArc"
    // InternalNET.g:212:1: ruleArc : ( ( rule__Arc__Alternatives ) ) ;
    public final void ruleArc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:216:2: ( ( ( rule__Arc__Alternatives ) ) )
            // InternalNET.g:217:2: ( ( rule__Arc__Alternatives ) )
            {
            // InternalNET.g:217:2: ( ( rule__Arc__Alternatives ) )
            // InternalNET.g:218:3: ( rule__Arc__Alternatives )
            {
             before(grammarAccess.getArcAccess().getAlternatives()); 
            // InternalNET.g:219:3: ( rule__Arc__Alternatives )
            // InternalNET.g:219:4: rule__Arc__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Arc__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArcAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArc"


    // $ANTLR start "entryRuleArc_Impl"
    // InternalNET.g:228:1: entryRuleArc_Impl : ruleArc_Impl EOF ;
    public final void entryRuleArc_Impl() throws RecognitionException {
        try {
            // InternalNET.g:229:1: ( ruleArc_Impl EOF )
            // InternalNET.g:230:1: ruleArc_Impl EOF
            {
             before(grammarAccess.getArc_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleArc_Impl();

            state._fsp--;

             after(grammarAccess.getArc_ImplRule()); 
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
    // $ANTLR end "entryRuleArc_Impl"


    // $ANTLR start "ruleArc_Impl"
    // InternalNET.g:237:1: ruleArc_Impl : ( ( rule__Arc_Impl__Group__0 ) ) ;
    public final void ruleArc_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:241:2: ( ( ( rule__Arc_Impl__Group__0 ) ) )
            // InternalNET.g:242:2: ( ( rule__Arc_Impl__Group__0 ) )
            {
            // InternalNET.g:242:2: ( ( rule__Arc_Impl__Group__0 ) )
            // InternalNET.g:243:3: ( rule__Arc_Impl__Group__0 )
            {
             before(grammarAccess.getArc_ImplAccess().getGroup()); 
            // InternalNET.g:244:3: ( rule__Arc_Impl__Group__0 )
            // InternalNET.g:244:4: rule__Arc_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Arc_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArc_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArc_Impl"


    // $ANTLR start "entryRuleReadArc"
    // InternalNET.g:253:1: entryRuleReadArc : ruleReadArc EOF ;
    public final void entryRuleReadArc() throws RecognitionException {
        try {
            // InternalNET.g:254:1: ( ruleReadArc EOF )
            // InternalNET.g:255:1: ruleReadArc EOF
            {
             before(grammarAccess.getReadArcRule()); 
            pushFollow(FOLLOW_1);
            ruleReadArc();

            state._fsp--;

             after(grammarAccess.getReadArcRule()); 
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
    // $ANTLR end "entryRuleReadArc"


    // $ANTLR start "ruleReadArc"
    // InternalNET.g:262:1: ruleReadArc : ( ( rule__ReadArc__Group__0 ) ) ;
    public final void ruleReadArc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:266:2: ( ( ( rule__ReadArc__Group__0 ) ) )
            // InternalNET.g:267:2: ( ( rule__ReadArc__Group__0 ) )
            {
            // InternalNET.g:267:2: ( ( rule__ReadArc__Group__0 ) )
            // InternalNET.g:268:3: ( rule__ReadArc__Group__0 )
            {
             before(grammarAccess.getReadArcAccess().getGroup()); 
            // InternalNET.g:269:3: ( rule__ReadArc__Group__0 )
            // InternalNET.g:269:4: rule__ReadArc__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReadArc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReadArcAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReadArc"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalNET.g:277:1: rule__Element__Alternatives : ( ( rulePlace ) | ( ruleTransition ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:281:1: ( ( rulePlace ) | ( ruleTransition ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalNET.g:282:2: ( rulePlace )
                    {
                    // InternalNET.g:282:2: ( rulePlace )
                    // InternalNET.g:283:3: rulePlace
                    {
                     before(grammarAccess.getElementAccess().getPlaceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePlace();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getPlaceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNET.g:288:2: ( ruleTransition )
                    {
                    // InternalNET.g:288:2: ( ruleTransition )
                    // InternalNET.g:289:3: ruleTransition
                    {
                     before(grammarAccess.getElementAccess().getTransitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTransition();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getTransitionParserRuleCall_1()); 

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalNET.g:298:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:302:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalNET.g:303:2: ( RULE_STRING )
                    {
                    // InternalNET.g:303:2: ( RULE_STRING )
                    // InternalNET.g:304:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNET.g:309:2: ( RULE_ID )
                    {
                    // InternalNET.g:309:2: ( RULE_ID )
                    // InternalNET.g:310:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Arc__Alternatives"
    // InternalNET.g:319:1: rule__Arc__Alternatives : ( ( ( rule__Arc__Group_0__0 ) ) | ( ruleReadArc ) );
    public final void rule__Arc__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:323:1: ( ( ( rule__Arc__Group_0__0 ) ) | ( ruleReadArc ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalNET.g:324:2: ( ( rule__Arc__Group_0__0 ) )
                    {
                    // InternalNET.g:324:2: ( ( rule__Arc__Group_0__0 ) )
                    // InternalNET.g:325:3: ( rule__Arc__Group_0__0 )
                    {
                     before(grammarAccess.getArcAccess().getGroup_0()); 
                    // InternalNET.g:326:3: ( rule__Arc__Group_0__0 )
                    // InternalNET.g:326:4: rule__Arc__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Arc__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArcAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNET.g:330:2: ( ruleReadArc )
                    {
                    // InternalNET.g:330:2: ( ruleReadArc )
                    // InternalNET.g:331:3: ruleReadArc
                    {
                     before(grammarAccess.getArcAccess().getReadArcParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleReadArc();

                    state._fsp--;

                     after(grammarAccess.getArcAccess().getReadArcParserRuleCall_1()); 

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
    // $ANTLR end "rule__Arc__Alternatives"


    // $ANTLR start "rule__Network__Group__0"
    // InternalNET.g:340:1: rule__Network__Group__0 : rule__Network__Group__0__Impl rule__Network__Group__1 ;
    public final void rule__Network__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:344:1: ( rule__Network__Group__0__Impl rule__Network__Group__1 )
            // InternalNET.g:345:2: rule__Network__Group__0__Impl rule__Network__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Network__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__0"


    // $ANTLR start "rule__Network__Group__0__Impl"
    // InternalNET.g:352:1: rule__Network__Group__0__Impl : ( () ) ;
    public final void rule__Network__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:356:1: ( ( () ) )
            // InternalNET.g:357:1: ( () )
            {
            // InternalNET.g:357:1: ( () )
            // InternalNET.g:358:2: ()
            {
             before(grammarAccess.getNetworkAccess().getNetworkAction_0()); 
            // InternalNET.g:359:2: ()
            // InternalNET.g:359:3: 
            {
            }

             after(grammarAccess.getNetworkAccess().getNetworkAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__0__Impl"


    // $ANTLR start "rule__Network__Group__1"
    // InternalNET.g:367:1: rule__Network__Group__1 : rule__Network__Group__1__Impl rule__Network__Group__2 ;
    public final void rule__Network__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:371:1: ( rule__Network__Group__1__Impl rule__Network__Group__2 )
            // InternalNET.g:372:2: rule__Network__Group__1__Impl rule__Network__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Network__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__1"


    // $ANTLR start "rule__Network__Group__1__Impl"
    // InternalNET.g:379:1: rule__Network__Group__1__Impl : ( 'net' ) ;
    public final void rule__Network__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:383:1: ( ( 'net' ) )
            // InternalNET.g:384:1: ( 'net' )
            {
            // InternalNET.g:384:1: ( 'net' )
            // InternalNET.g:385:2: 'net'
            {
             before(grammarAccess.getNetworkAccess().getNetKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getNetKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__1__Impl"


    // $ANTLR start "rule__Network__Group__2"
    // InternalNET.g:394:1: rule__Network__Group__2 : rule__Network__Group__2__Impl rule__Network__Group__3 ;
    public final void rule__Network__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:398:1: ( rule__Network__Group__2__Impl rule__Network__Group__3 )
            // InternalNET.g:399:2: rule__Network__Group__2__Impl rule__Network__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Network__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__2"


    // $ANTLR start "rule__Network__Group__2__Impl"
    // InternalNET.g:406:1: rule__Network__Group__2__Impl : ( ( rule__Network__NameAssignment_2 ) ) ;
    public final void rule__Network__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:410:1: ( ( ( rule__Network__NameAssignment_2 ) ) )
            // InternalNET.g:411:1: ( ( rule__Network__NameAssignment_2 ) )
            {
            // InternalNET.g:411:1: ( ( rule__Network__NameAssignment_2 ) )
            // InternalNET.g:412:2: ( rule__Network__NameAssignment_2 )
            {
             before(grammarAccess.getNetworkAccess().getNameAssignment_2()); 
            // InternalNET.g:413:2: ( rule__Network__NameAssignment_2 )
            // InternalNET.g:413:3: rule__Network__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Network__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNetworkAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__2__Impl"


    // $ANTLR start "rule__Network__Group__3"
    // InternalNET.g:421:1: rule__Network__Group__3 : rule__Network__Group__3__Impl rule__Network__Group__4 ;
    public final void rule__Network__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:425:1: ( rule__Network__Group__3__Impl rule__Network__Group__4 )
            // InternalNET.g:426:2: rule__Network__Group__3__Impl rule__Network__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Network__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__3"


    // $ANTLR start "rule__Network__Group__3__Impl"
    // InternalNET.g:433:1: rule__Network__Group__3__Impl : ( ( ( rule__Network__ElementsAssignment_3 ) ) ( ( rule__Network__ElementsAssignment_3 )* ) ) ;
    public final void rule__Network__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:437:1: ( ( ( ( rule__Network__ElementsAssignment_3 ) ) ( ( rule__Network__ElementsAssignment_3 )* ) ) )
            // InternalNET.g:438:1: ( ( ( rule__Network__ElementsAssignment_3 ) ) ( ( rule__Network__ElementsAssignment_3 )* ) )
            {
            // InternalNET.g:438:1: ( ( ( rule__Network__ElementsAssignment_3 ) ) ( ( rule__Network__ElementsAssignment_3 )* ) )
            // InternalNET.g:439:2: ( ( rule__Network__ElementsAssignment_3 ) ) ( ( rule__Network__ElementsAssignment_3 )* )
            {
            // InternalNET.g:439:2: ( ( rule__Network__ElementsAssignment_3 ) )
            // InternalNET.g:440:3: ( rule__Network__ElementsAssignment_3 )
            {
             before(grammarAccess.getNetworkAccess().getElementsAssignment_3()); 
            // InternalNET.g:441:3: ( rule__Network__ElementsAssignment_3 )
            // InternalNET.g:441:4: rule__Network__ElementsAssignment_3
            {
            pushFollow(FOLLOW_7);
            rule__Network__ElementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNetworkAccess().getElementsAssignment_3()); 

            }

            // InternalNET.g:444:2: ( ( rule__Network__ElementsAssignment_3 )* )
            // InternalNET.g:445:3: ( rule__Network__ElementsAssignment_3 )*
            {
             before(grammarAccess.getNetworkAccess().getElementsAssignment_3()); 
            // InternalNET.g:446:3: ( rule__Network__ElementsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12||LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalNET.g:446:4: rule__Network__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Network__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getNetworkAccess().getElementsAssignment_3()); 

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
    // $ANTLR end "rule__Network__Group__3__Impl"


    // $ANTLR start "rule__Network__Group__4"
    // InternalNET.g:455:1: rule__Network__Group__4 : rule__Network__Group__4__Impl ;
    public final void rule__Network__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:459:1: ( rule__Network__Group__4__Impl )
            // InternalNET.g:460:2: rule__Network__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Network__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__4"


    // $ANTLR start "rule__Network__Group__4__Impl"
    // InternalNET.g:466:1: rule__Network__Group__4__Impl : ( ( ( rule__Network__ArcsAssignment_4 ) ) ( ( rule__Network__ArcsAssignment_4 )* ) ) ;
    public final void rule__Network__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:470:1: ( ( ( ( rule__Network__ArcsAssignment_4 ) ) ( ( rule__Network__ArcsAssignment_4 )* ) ) )
            // InternalNET.g:471:1: ( ( ( rule__Network__ArcsAssignment_4 ) ) ( ( rule__Network__ArcsAssignment_4 )* ) )
            {
            // InternalNET.g:471:1: ( ( ( rule__Network__ArcsAssignment_4 ) ) ( ( rule__Network__ArcsAssignment_4 )* ) )
            // InternalNET.g:472:2: ( ( rule__Network__ArcsAssignment_4 ) ) ( ( rule__Network__ArcsAssignment_4 )* )
            {
            // InternalNET.g:472:2: ( ( rule__Network__ArcsAssignment_4 ) )
            // InternalNET.g:473:3: ( rule__Network__ArcsAssignment_4 )
            {
             before(grammarAccess.getNetworkAccess().getArcsAssignment_4()); 
            // InternalNET.g:474:3: ( rule__Network__ArcsAssignment_4 )
            // InternalNET.g:474:4: rule__Network__ArcsAssignment_4
            {
            pushFollow(FOLLOW_8);
            rule__Network__ArcsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getNetworkAccess().getArcsAssignment_4()); 

            }

            // InternalNET.g:477:2: ( ( rule__Network__ArcsAssignment_4 )* )
            // InternalNET.g:478:3: ( rule__Network__ArcsAssignment_4 )*
            {
             before(grammarAccess.getNetworkAccess().getArcsAssignment_4()); 
            // InternalNET.g:479:3: ( rule__Network__ArcsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)||LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalNET.g:479:4: rule__Network__ArcsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Network__ArcsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getNetworkAccess().getArcsAssignment_4()); 

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
    // $ANTLR end "rule__Network__Group__4__Impl"


    // $ANTLR start "rule__Place__Group__0"
    // InternalNET.g:489:1: rule__Place__Group__0 : rule__Place__Group__0__Impl rule__Place__Group__1 ;
    public final void rule__Place__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:493:1: ( rule__Place__Group__0__Impl rule__Place__Group__1 )
            // InternalNET.g:494:2: rule__Place__Group__0__Impl rule__Place__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Place__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__0"


    // $ANTLR start "rule__Place__Group__0__Impl"
    // InternalNET.g:501:1: rule__Place__Group__0__Impl : ( 'pl' ) ;
    public final void rule__Place__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:505:1: ( ( 'pl' ) )
            // InternalNET.g:506:1: ( 'pl' )
            {
            // InternalNET.g:506:1: ( 'pl' )
            // InternalNET.g:507:2: 'pl'
            {
             before(grammarAccess.getPlaceAccess().getPlKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getPlKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__0__Impl"


    // $ANTLR start "rule__Place__Group__1"
    // InternalNET.g:516:1: rule__Place__Group__1 : rule__Place__Group__1__Impl rule__Place__Group__2 ;
    public final void rule__Place__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:520:1: ( rule__Place__Group__1__Impl rule__Place__Group__2 )
            // InternalNET.g:521:2: rule__Place__Group__1__Impl rule__Place__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Place__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__1"


    // $ANTLR start "rule__Place__Group__1__Impl"
    // InternalNET.g:528:1: rule__Place__Group__1__Impl : ( ( rule__Place__NameAssignment_1 ) ) ;
    public final void rule__Place__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:532:1: ( ( ( rule__Place__NameAssignment_1 ) ) )
            // InternalNET.g:533:1: ( ( rule__Place__NameAssignment_1 ) )
            {
            // InternalNET.g:533:1: ( ( rule__Place__NameAssignment_1 ) )
            // InternalNET.g:534:2: ( rule__Place__NameAssignment_1 )
            {
             before(grammarAccess.getPlaceAccess().getNameAssignment_1()); 
            // InternalNET.g:535:2: ( rule__Place__NameAssignment_1 )
            // InternalNET.g:535:3: rule__Place__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Place__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__1__Impl"


    // $ANTLR start "rule__Place__Group__2"
    // InternalNET.g:543:1: rule__Place__Group__2 : rule__Place__Group__2__Impl ;
    public final void rule__Place__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:547:1: ( rule__Place__Group__2__Impl )
            // InternalNET.g:548:2: rule__Place__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__2"


    // $ANTLR start "rule__Place__Group__2__Impl"
    // InternalNET.g:554:1: rule__Place__Group__2__Impl : ( ( rule__Place__Group_2__0 )? ) ;
    public final void rule__Place__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:558:1: ( ( ( rule__Place__Group_2__0 )? ) )
            // InternalNET.g:559:1: ( ( rule__Place__Group_2__0 )? )
            {
            // InternalNET.g:559:1: ( ( rule__Place__Group_2__0 )? )
            // InternalNET.g:560:2: ( rule__Place__Group_2__0 )?
            {
             before(grammarAccess.getPlaceAccess().getGroup_2()); 
            // InternalNET.g:561:2: ( rule__Place__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalNET.g:561:3: rule__Place__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Place__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlaceAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__2__Impl"


    // $ANTLR start "rule__Place__Group_2__0"
    // InternalNET.g:570:1: rule__Place__Group_2__0 : rule__Place__Group_2__0__Impl rule__Place__Group_2__1 ;
    public final void rule__Place__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:574:1: ( rule__Place__Group_2__0__Impl rule__Place__Group_2__1 )
            // InternalNET.g:575:2: rule__Place__Group_2__0__Impl rule__Place__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__Place__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_2__0"


    // $ANTLR start "rule__Place__Group_2__0__Impl"
    // InternalNET.g:582:1: rule__Place__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Place__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:586:1: ( ( '(' ) )
            // InternalNET.g:587:1: ( '(' )
            {
            // InternalNET.g:587:1: ( '(' )
            // InternalNET.g:588:2: '('
            {
             before(grammarAccess.getPlaceAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_2__0__Impl"


    // $ANTLR start "rule__Place__Group_2__1"
    // InternalNET.g:597:1: rule__Place__Group_2__1 : rule__Place__Group_2__1__Impl rule__Place__Group_2__2 ;
    public final void rule__Place__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:601:1: ( rule__Place__Group_2__1__Impl rule__Place__Group_2__2 )
            // InternalNET.g:602:2: rule__Place__Group_2__1__Impl rule__Place__Group_2__2
            {
            pushFollow(FOLLOW_11);
            rule__Place__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_2__1"


    // $ANTLR start "rule__Place__Group_2__1__Impl"
    // InternalNET.g:609:1: rule__Place__Group_2__1__Impl : ( ( rule__Place__TokensAssignment_2_1 ) ) ;
    public final void rule__Place__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:613:1: ( ( ( rule__Place__TokensAssignment_2_1 ) ) )
            // InternalNET.g:614:1: ( ( rule__Place__TokensAssignment_2_1 ) )
            {
            // InternalNET.g:614:1: ( ( rule__Place__TokensAssignment_2_1 ) )
            // InternalNET.g:615:2: ( rule__Place__TokensAssignment_2_1 )
            {
             before(grammarAccess.getPlaceAccess().getTokensAssignment_2_1()); 
            // InternalNET.g:616:2: ( rule__Place__TokensAssignment_2_1 )
            // InternalNET.g:616:3: rule__Place__TokensAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Place__TokensAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getTokensAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_2__1__Impl"


    // $ANTLR start "rule__Place__Group_2__2"
    // InternalNET.g:624:1: rule__Place__Group_2__2 : rule__Place__Group_2__2__Impl ;
    public final void rule__Place__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:628:1: ( rule__Place__Group_2__2__Impl )
            // InternalNET.g:629:2: rule__Place__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_2__2"


    // $ANTLR start "rule__Place__Group_2__2__Impl"
    // InternalNET.g:635:1: rule__Place__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Place__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:639:1: ( ( ')' ) )
            // InternalNET.g:640:1: ( ')' )
            {
            // InternalNET.g:640:1: ( ')' )
            // InternalNET.g:641:2: ')'
            {
             before(grammarAccess.getPlaceAccess().getRightParenthesisKeyword_2_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_2__2__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalNET.g:651:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:655:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalNET.g:656:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalNET.g:663:1: rule__Transition__Group__0__Impl : ( () ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:667:1: ( ( () ) )
            // InternalNET.g:668:1: ( () )
            {
            // InternalNET.g:668:1: ( () )
            // InternalNET.g:669:2: ()
            {
             before(grammarAccess.getTransitionAccess().getTransitionAction_0()); 
            // InternalNET.g:670:2: ()
            // InternalNET.g:670:3: 
            {
            }

             after(grammarAccess.getTransitionAccess().getTransitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalNET.g:678:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:682:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalNET.g:683:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalNET.g:690:1: rule__Transition__Group__1__Impl : ( 'tr' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:694:1: ( ( 'tr' ) )
            // InternalNET.g:695:1: ( 'tr' )
            {
            // InternalNET.g:695:1: ( 'tr' )
            // InternalNET.g:696:2: 'tr'
            {
             before(grammarAccess.getTransitionAccess().getTrKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTrKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalNET.g:705:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:709:1: ( rule__Transition__Group__2__Impl )
            // InternalNET.g:710:2: rule__Transition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalNET.g:716:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__NameAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:720:1: ( ( ( rule__Transition__NameAssignment_2 ) ) )
            // InternalNET.g:721:1: ( ( rule__Transition__NameAssignment_2 ) )
            {
            // InternalNET.g:721:1: ( ( rule__Transition__NameAssignment_2 ) )
            // InternalNET.g:722:2: ( rule__Transition__NameAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getNameAssignment_2()); 
            // InternalNET.g:723:2: ( rule__Transition__NameAssignment_2 )
            // InternalNET.g:723:3: rule__Transition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalNET.g:732:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:736:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalNET.g:737:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalNET.g:744:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:748:1: ( ( ( '-' )? ) )
            // InternalNET.g:749:1: ( ( '-' )? )
            {
            // InternalNET.g:749:1: ( ( '-' )? )
            // InternalNET.g:750:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalNET.g:751:2: ( '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalNET.g:751:3: '-'
                    {
                    match(input,16,FOLLOW_2); 

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
    // InternalNET.g:759:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:763:1: ( rule__EInt__Group__1__Impl )
            // InternalNET.g:764:2: rule__EInt__Group__1__Impl
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
    // InternalNET.g:770:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:774:1: ( ( RULE_INT ) )
            // InternalNET.g:775:1: ( RULE_INT )
            {
            // InternalNET.g:775:1: ( RULE_INT )
            // InternalNET.g:776:2: RULE_INT
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


    // $ANTLR start "rule__Arc__Group_0__0"
    // InternalNET.g:786:1: rule__Arc__Group_0__0 : rule__Arc__Group_0__0__Impl rule__Arc__Group_0__1 ;
    public final void rule__Arc__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:790:1: ( rule__Arc__Group_0__0__Impl rule__Arc__Group_0__1 )
            // InternalNET.g:791:2: rule__Arc__Group_0__0__Impl rule__Arc__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Arc__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arc__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group_0__0"


    // $ANTLR start "rule__Arc__Group_0__0__Impl"
    // InternalNET.g:798:1: rule__Arc__Group_0__0__Impl : ( 'arc' ) ;
    public final void rule__Arc__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:802:1: ( ( 'arc' ) )
            // InternalNET.g:803:1: ( 'arc' )
            {
            // InternalNET.g:803:1: ( 'arc' )
            // InternalNET.g:804:2: 'arc'
            {
             before(grammarAccess.getArcAccess().getArcKeyword_0_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getArcAccess().getArcKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group_0__0__Impl"


    // $ANTLR start "rule__Arc__Group_0__1"
    // InternalNET.g:813:1: rule__Arc__Group_0__1 : rule__Arc__Group_0__1__Impl ;
    public final void rule__Arc__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:817:1: ( rule__Arc__Group_0__1__Impl )
            // InternalNET.g:818:2: rule__Arc__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arc__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group_0__1"


    // $ANTLR start "rule__Arc__Group_0__1__Impl"
    // InternalNET.g:824:1: rule__Arc__Group_0__1__Impl : ( ruleArc_Impl ) ;
    public final void rule__Arc__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:828:1: ( ( ruleArc_Impl ) )
            // InternalNET.g:829:1: ( ruleArc_Impl )
            {
            // InternalNET.g:829:1: ( ruleArc_Impl )
            // InternalNET.g:830:2: ruleArc_Impl
            {
             before(grammarAccess.getArcAccess().getArc_ImplParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleArc_Impl();

            state._fsp--;

             after(grammarAccess.getArcAccess().getArc_ImplParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group_0__1__Impl"


    // $ANTLR start "rule__Arc_Impl__Group__0"
    // InternalNET.g:840:1: rule__Arc_Impl__Group__0 : rule__Arc_Impl__Group__0__Impl rule__Arc_Impl__Group__1 ;
    public final void rule__Arc_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:844:1: ( rule__Arc_Impl__Group__0__Impl rule__Arc_Impl__Group__1 )
            // InternalNET.g:845:2: rule__Arc_Impl__Group__0__Impl rule__Arc_Impl__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Arc_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arc_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc_Impl__Group__0"


    // $ANTLR start "rule__Arc_Impl__Group__0__Impl"
    // InternalNET.g:852:1: rule__Arc_Impl__Group__0__Impl : ( ( rule__Arc_Impl__PredecessorAssignment_0 ) ) ;
    public final void rule__Arc_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:856:1: ( ( ( rule__Arc_Impl__PredecessorAssignment_0 ) ) )
            // InternalNET.g:857:1: ( ( rule__Arc_Impl__PredecessorAssignment_0 ) )
            {
            // InternalNET.g:857:1: ( ( rule__Arc_Impl__PredecessorAssignment_0 ) )
            // InternalNET.g:858:2: ( rule__Arc_Impl__PredecessorAssignment_0 )
            {
             before(grammarAccess.getArc_ImplAccess().getPredecessorAssignment_0()); 
            // InternalNET.g:859:2: ( rule__Arc_Impl__PredecessorAssignment_0 )
            // InternalNET.g:859:3: rule__Arc_Impl__PredecessorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Arc_Impl__PredecessorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getArc_ImplAccess().getPredecessorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc_Impl__Group__0__Impl"


    // $ANTLR start "rule__Arc_Impl__Group__1"
    // InternalNET.g:867:1: rule__Arc_Impl__Group__1 : rule__Arc_Impl__Group__1__Impl rule__Arc_Impl__Group__2 ;
    public final void rule__Arc_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:871:1: ( rule__Arc_Impl__Group__1__Impl rule__Arc_Impl__Group__2 )
            // InternalNET.g:872:2: rule__Arc_Impl__Group__1__Impl rule__Arc_Impl__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Arc_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arc_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc_Impl__Group__1"


    // $ANTLR start "rule__Arc_Impl__Group__1__Impl"
    // InternalNET.g:879:1: rule__Arc_Impl__Group__1__Impl : ( '-' ) ;
    public final void rule__Arc_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:883:1: ( ( '-' ) )
            // InternalNET.g:884:1: ( '-' )
            {
            // InternalNET.g:884:1: ( '-' )
            // InternalNET.g:885:2: '-'
            {
             before(grammarAccess.getArc_ImplAccess().getHyphenMinusKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getArc_ImplAccess().getHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc_Impl__Group__1__Impl"


    // $ANTLR start "rule__Arc_Impl__Group__2"
    // InternalNET.g:894:1: rule__Arc_Impl__Group__2 : rule__Arc_Impl__Group__2__Impl rule__Arc_Impl__Group__3 ;
    public final void rule__Arc_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:898:1: ( rule__Arc_Impl__Group__2__Impl rule__Arc_Impl__Group__3 )
            // InternalNET.g:899:2: rule__Arc_Impl__Group__2__Impl rule__Arc_Impl__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Arc_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arc_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc_Impl__Group__2"


    // $ANTLR start "rule__Arc_Impl__Group__2__Impl"
    // InternalNET.g:906:1: rule__Arc_Impl__Group__2__Impl : ( ( rule__Arc_Impl__Group_2__0 )? ) ;
    public final void rule__Arc_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:910:1: ( ( ( rule__Arc_Impl__Group_2__0 )? ) )
            // InternalNET.g:911:1: ( ( rule__Arc_Impl__Group_2__0 )? )
            {
            // InternalNET.g:911:1: ( ( rule__Arc_Impl__Group_2__0 )? )
            // InternalNET.g:912:2: ( rule__Arc_Impl__Group_2__0 )?
            {
             before(grammarAccess.getArc_ImplAccess().getGroup_2()); 
            // InternalNET.g:913:2: ( rule__Arc_Impl__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT||LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalNET.g:913:3: rule__Arc_Impl__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Arc_Impl__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArc_ImplAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc_Impl__Group__2__Impl"


    // $ANTLR start "rule__Arc_Impl__Group__3"
    // InternalNET.g:921:1: rule__Arc_Impl__Group__3 : rule__Arc_Impl__Group__3__Impl rule__Arc_Impl__Group__4 ;
    public final void rule__Arc_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:925:1: ( rule__Arc_Impl__Group__3__Impl rule__Arc_Impl__Group__4 )
            // InternalNET.g:926:2: rule__Arc_Impl__Group__3__Impl rule__Arc_Impl__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Arc_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arc_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc_Impl__Group__3"


    // $ANTLR start "rule__Arc_Impl__Group__3__Impl"
    // InternalNET.g:933:1: rule__Arc_Impl__Group__3__Impl : ( '>' ) ;
    public final void rule__Arc_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:937:1: ( ( '>' ) )
            // InternalNET.g:938:1: ( '>' )
            {
            // InternalNET.g:938:1: ( '>' )
            // InternalNET.g:939:2: '>'
            {
             before(grammarAccess.getArc_ImplAccess().getGreaterThanSignKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getArc_ImplAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc_Impl__Group__3__Impl"


    // $ANTLR start "rule__Arc_Impl__Group__4"
    // InternalNET.g:948:1: rule__Arc_Impl__Group__4 : rule__Arc_Impl__Group__4__Impl ;
    public final void rule__Arc_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:952:1: ( rule__Arc_Impl__Group__4__Impl )
            // InternalNET.g:953:2: rule__Arc_Impl__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arc_Impl__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc_Impl__Group__4"


    // $ANTLR start "rule__Arc_Impl__Group__4__Impl"
    // InternalNET.g:959:1: rule__Arc_Impl__Group__4__Impl : ( ( rule__Arc_Impl__SuccessorAssignment_4 ) ) ;
    public final void rule__Arc_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:963:1: ( ( ( rule__Arc_Impl__SuccessorAssignment_4 ) ) )
            // InternalNET.g:964:1: ( ( rule__Arc_Impl__SuccessorAssignment_4 ) )
            {
            // InternalNET.g:964:1: ( ( rule__Arc_Impl__SuccessorAssignment_4 ) )
            // InternalNET.g:965:2: ( rule__Arc_Impl__SuccessorAssignment_4 )
            {
             before(grammarAccess.getArc_ImplAccess().getSuccessorAssignment_4()); 
            // InternalNET.g:966:2: ( rule__Arc_Impl__SuccessorAssignment_4 )
            // InternalNET.g:966:3: rule__Arc_Impl__SuccessorAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Arc_Impl__SuccessorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getArc_ImplAccess().getSuccessorAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc_Impl__Group__4__Impl"


    // $ANTLR start "rule__Arc_Impl__Group_2__0"
    // InternalNET.g:975:1: rule__Arc_Impl__Group_2__0 : rule__Arc_Impl__Group_2__0__Impl rule__Arc_Impl__Group_2__1 ;
    public final void rule__Arc_Impl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:979:1: ( rule__Arc_Impl__Group_2__0__Impl rule__Arc_Impl__Group_2__1 )
            // InternalNET.g:980:2: rule__Arc_Impl__Group_2__0__Impl rule__Arc_Impl__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Arc_Impl__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arc_Impl__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc_Impl__Group_2__0"


    // $ANTLR start "rule__Arc_Impl__Group_2__0__Impl"
    // InternalNET.g:987:1: rule__Arc_Impl__Group_2__0__Impl : ( ( rule__Arc_Impl__WeightAssignment_2_0 ) ) ;
    public final void rule__Arc_Impl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:991:1: ( ( ( rule__Arc_Impl__WeightAssignment_2_0 ) ) )
            // InternalNET.g:992:1: ( ( rule__Arc_Impl__WeightAssignment_2_0 ) )
            {
            // InternalNET.g:992:1: ( ( rule__Arc_Impl__WeightAssignment_2_0 ) )
            // InternalNET.g:993:2: ( rule__Arc_Impl__WeightAssignment_2_0 )
            {
             before(grammarAccess.getArc_ImplAccess().getWeightAssignment_2_0()); 
            // InternalNET.g:994:2: ( rule__Arc_Impl__WeightAssignment_2_0 )
            // InternalNET.g:994:3: rule__Arc_Impl__WeightAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Arc_Impl__WeightAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getArc_ImplAccess().getWeightAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc_Impl__Group_2__0__Impl"


    // $ANTLR start "rule__Arc_Impl__Group_2__1"
    // InternalNET.g:1002:1: rule__Arc_Impl__Group_2__1 : rule__Arc_Impl__Group_2__1__Impl ;
    public final void rule__Arc_Impl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:1006:1: ( rule__Arc_Impl__Group_2__1__Impl )
            // InternalNET.g:1007:2: rule__Arc_Impl__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arc_Impl__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc_Impl__Group_2__1"


    // $ANTLR start "rule__Arc_Impl__Group_2__1__Impl"
    // InternalNET.g:1013:1: rule__Arc_Impl__Group_2__1__Impl : ( '-' ) ;
    public final void rule__Arc_Impl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:1017:1: ( ( '-' ) )
            // InternalNET.g:1018:1: ( '-' )
            {
            // InternalNET.g:1018:1: ( '-' )
            // InternalNET.g:1019:2: '-'
            {
             before(grammarAccess.getArc_ImplAccess().getHyphenMinusKeyword_2_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getArc_ImplAccess().getHyphenMinusKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc_Impl__Group_2__1__Impl"


    // $ANTLR start "rule__ReadArc__Group__0"
    // InternalNET.g:1029:1: rule__ReadArc__Group__0 : rule__ReadArc__Group__0__Impl rule__ReadArc__Group__1 ;
    public final void rule__ReadArc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:1033:1: ( rule__ReadArc__Group__0__Impl rule__ReadArc__Group__1 )
            // InternalNET.g:1034:2: rule__ReadArc__Group__0__Impl rule__ReadArc__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ReadArc__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReadArc__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadArc__Group__0"


    // $ANTLR start "rule__ReadArc__Group__0__Impl"
    // InternalNET.g:1041:1: rule__ReadArc__Group__0__Impl : ( ( rule__ReadArc__PredecessorAssignment_0 ) ) ;
    public final void rule__ReadArc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:1045:1: ( ( ( rule__ReadArc__PredecessorAssignment_0 ) ) )
            // InternalNET.g:1046:1: ( ( rule__ReadArc__PredecessorAssignment_0 ) )
            {
            // InternalNET.g:1046:1: ( ( rule__ReadArc__PredecessorAssignment_0 ) )
            // InternalNET.g:1047:2: ( rule__ReadArc__PredecessorAssignment_0 )
            {
             before(grammarAccess.getReadArcAccess().getPredecessorAssignment_0()); 
            // InternalNET.g:1048:2: ( rule__ReadArc__PredecessorAssignment_0 )
            // InternalNET.g:1048:3: rule__ReadArc__PredecessorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ReadArc__PredecessorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getReadArcAccess().getPredecessorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadArc__Group__0__Impl"


    // $ANTLR start "rule__ReadArc__Group__1"
    // InternalNET.g:1056:1: rule__ReadArc__Group__1 : rule__ReadArc__Group__1__Impl rule__ReadArc__Group__2 ;
    public final void rule__ReadArc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:1060:1: ( rule__ReadArc__Group__1__Impl rule__ReadArc__Group__2 )
            // InternalNET.g:1061:2: rule__ReadArc__Group__1__Impl rule__ReadArc__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ReadArc__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReadArc__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadArc__Group__1"


    // $ANTLR start "rule__ReadArc__Group__1__Impl"
    // InternalNET.g:1068:1: rule__ReadArc__Group__1__Impl : ( '-' ) ;
    public final void rule__ReadArc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:1072:1: ( ( '-' ) )
            // InternalNET.g:1073:1: ( '-' )
            {
            // InternalNET.g:1073:1: ( '-' )
            // InternalNET.g:1074:2: '-'
            {
             before(grammarAccess.getReadArcAccess().getHyphenMinusKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getReadArcAccess().getHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadArc__Group__1__Impl"


    // $ANTLR start "rule__ReadArc__Group__2"
    // InternalNET.g:1083:1: rule__ReadArc__Group__2 : rule__ReadArc__Group__2__Impl rule__ReadArc__Group__3 ;
    public final void rule__ReadArc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:1087:1: ( rule__ReadArc__Group__2__Impl rule__ReadArc__Group__3 )
            // InternalNET.g:1088:2: rule__ReadArc__Group__2__Impl rule__ReadArc__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__ReadArc__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReadArc__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadArc__Group__2"


    // $ANTLR start "rule__ReadArc__Group__2__Impl"
    // InternalNET.g:1095:1: rule__ReadArc__Group__2__Impl : ( ( rule__ReadArc__WeightAssignment_2 )? ) ;
    public final void rule__ReadArc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:1099:1: ( ( ( rule__ReadArc__WeightAssignment_2 )? ) )
            // InternalNET.g:1100:1: ( ( rule__ReadArc__WeightAssignment_2 )? )
            {
            // InternalNET.g:1100:1: ( ( rule__ReadArc__WeightAssignment_2 )? )
            // InternalNET.g:1101:2: ( rule__ReadArc__WeightAssignment_2 )?
            {
             before(grammarAccess.getReadArcAccess().getWeightAssignment_2()); 
            // InternalNET.g:1102:2: ( rule__ReadArc__WeightAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT||LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalNET.g:1102:3: rule__ReadArc__WeightAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReadArc__WeightAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReadArcAccess().getWeightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadArc__Group__2__Impl"


    // $ANTLR start "rule__ReadArc__Group__3"
    // InternalNET.g:1110:1: rule__ReadArc__Group__3 : rule__ReadArc__Group__3__Impl rule__ReadArc__Group__4 ;
    public final void rule__ReadArc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:1114:1: ( rule__ReadArc__Group__3__Impl rule__ReadArc__Group__4 )
            // InternalNET.g:1115:2: rule__ReadArc__Group__3__Impl rule__ReadArc__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__ReadArc__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReadArc__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadArc__Group__3"


    // $ANTLR start "rule__ReadArc__Group__3__Impl"
    // InternalNET.g:1122:1: rule__ReadArc__Group__3__Impl : ( '?>' ) ;
    public final void rule__ReadArc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:1126:1: ( ( '?>' ) )
            // InternalNET.g:1127:1: ( '?>' )
            {
            // InternalNET.g:1127:1: ( '?>' )
            // InternalNET.g:1128:2: '?>'
            {
             before(grammarAccess.getReadArcAccess().getQuestionMarkGreaterThanSignKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getReadArcAccess().getQuestionMarkGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadArc__Group__3__Impl"


    // $ANTLR start "rule__ReadArc__Group__4"
    // InternalNET.g:1137:1: rule__ReadArc__Group__4 : rule__ReadArc__Group__4__Impl ;
    public final void rule__ReadArc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:1141:1: ( rule__ReadArc__Group__4__Impl )
            // InternalNET.g:1142:2: rule__ReadArc__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReadArc__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadArc__Group__4"


    // $ANTLR start "rule__ReadArc__Group__4__Impl"
    // InternalNET.g:1148:1: rule__ReadArc__Group__4__Impl : ( ( rule__ReadArc__SuccessorAssignment_4 ) ) ;
    public final void rule__ReadArc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:1152:1: ( ( ( rule__ReadArc__SuccessorAssignment_4 ) ) )
            // InternalNET.g:1153:1: ( ( rule__ReadArc__SuccessorAssignment_4 ) )
            {
            // InternalNET.g:1153:1: ( ( rule__ReadArc__SuccessorAssignment_4 ) )
            // InternalNET.g:1154:2: ( rule__ReadArc__SuccessorAssignment_4 )
            {
             before(grammarAccess.getReadArcAccess().getSuccessorAssignment_4()); 
            // InternalNET.g:1155:2: ( rule__ReadArc__SuccessorAssignment_4 )
            // InternalNET.g:1155:3: rule__ReadArc__SuccessorAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ReadArc__SuccessorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getReadArcAccess().getSuccessorAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadArc__Group__4__Impl"


    // $ANTLR start "rule__Network__NameAssignment_2"
    // InternalNET.g:1164:1: rule__Network__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Network__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:1168:1: ( ( ruleEString ) )
            // InternalNET.g:1169:2: ( ruleEString )
            {
            // InternalNET.g:1169:2: ( ruleEString )
            // InternalNET.g:1170:3: ruleEString
            {
             before(grammarAccess.getNetworkAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNetworkAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__NameAssignment_2"


    // $ANTLR start "rule__Network__ElementsAssignment_3"
    // InternalNET.g:1179:1: rule__Network__ElementsAssignment_3 : ( ruleElement ) ;
    public final void rule__Network__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:1183:1: ( ( ruleElement ) )
            // InternalNET.g:1184:2: ( ruleElement )
            {
            // InternalNET.g:1184:2: ( ruleElement )
            // InternalNET.g:1185:3: ruleElement
            {
             before(grammarAccess.getNetworkAccess().getElementsElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getNetworkAccess().getElementsElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__ElementsAssignment_3"


    // $ANTLR start "rule__Network__ArcsAssignment_4"
    // InternalNET.g:1194:1: rule__Network__ArcsAssignment_4 : ( ruleArc ) ;
    public final void rule__Network__ArcsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:1198:1: ( ( ruleArc ) )
            // InternalNET.g:1199:2: ( ruleArc )
            {
            // InternalNET.g:1199:2: ( ruleArc )
            // InternalNET.g:1200:3: ruleArc
            {
             before(grammarAccess.getNetworkAccess().getArcsArcParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleArc();

            state._fsp--;

             after(grammarAccess.getNetworkAccess().getArcsArcParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__ArcsAssignment_4"


    // $ANTLR start "rule__Place__NameAssignment_1"
    // InternalNET.g:1209:1: rule__Place__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Place__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:1213:1: ( ( ruleEString ) )
            // InternalNET.g:1214:2: ( ruleEString )
            {
            // InternalNET.g:1214:2: ( ruleEString )
            // InternalNET.g:1215:3: ruleEString
            {
             before(grammarAccess.getPlaceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPlaceAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__NameAssignment_1"


    // $ANTLR start "rule__Place__TokensAssignment_2_1"
    // InternalNET.g:1224:1: rule__Place__TokensAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__Place__TokensAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:1228:1: ( ( ruleEInt ) )
            // InternalNET.g:1229:2: ( ruleEInt )
            {
            // InternalNET.g:1229:2: ( ruleEInt )
            // InternalNET.g:1230:3: ruleEInt
            {
             before(grammarAccess.getPlaceAccess().getTokensEIntParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPlaceAccess().getTokensEIntParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__TokensAssignment_2_1"


    // $ANTLR start "rule__Transition__NameAssignment_2"
    // InternalNET.g:1239:1: rule__Transition__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Transition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:1243:1: ( ( ruleEString ) )
            // InternalNET.g:1244:2: ( ruleEString )
            {
            // InternalNET.g:1244:2: ( ruleEString )
            // InternalNET.g:1245:3: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__NameAssignment_2"


    // $ANTLR start "rule__Arc_Impl__PredecessorAssignment_0"
    // InternalNET.g:1254:1: rule__Arc_Impl__PredecessorAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Arc_Impl__PredecessorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:1258:1: ( ( ( ruleEString ) ) )
            // InternalNET.g:1259:2: ( ( ruleEString ) )
            {
            // InternalNET.g:1259:2: ( ( ruleEString ) )
            // InternalNET.g:1260:3: ( ruleEString )
            {
             before(grammarAccess.getArc_ImplAccess().getPredecessorElementCrossReference_0_0()); 
            // InternalNET.g:1261:3: ( ruleEString )
            // InternalNET.g:1262:4: ruleEString
            {
             before(grammarAccess.getArc_ImplAccess().getPredecessorElementEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getArc_ImplAccess().getPredecessorElementEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getArc_ImplAccess().getPredecessorElementCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc_Impl__PredecessorAssignment_0"


    // $ANTLR start "rule__Arc_Impl__WeightAssignment_2_0"
    // InternalNET.g:1273:1: rule__Arc_Impl__WeightAssignment_2_0 : ( ruleEInt ) ;
    public final void rule__Arc_Impl__WeightAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:1277:1: ( ( ruleEInt ) )
            // InternalNET.g:1278:2: ( ruleEInt )
            {
            // InternalNET.g:1278:2: ( ruleEInt )
            // InternalNET.g:1279:3: ruleEInt
            {
             before(grammarAccess.getArc_ImplAccess().getWeightEIntParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getArc_ImplAccess().getWeightEIntParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc_Impl__WeightAssignment_2_0"


    // $ANTLR start "rule__Arc_Impl__SuccessorAssignment_4"
    // InternalNET.g:1288:1: rule__Arc_Impl__SuccessorAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Arc_Impl__SuccessorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:1292:1: ( ( ( ruleEString ) ) )
            // InternalNET.g:1293:2: ( ( ruleEString ) )
            {
            // InternalNET.g:1293:2: ( ( ruleEString ) )
            // InternalNET.g:1294:3: ( ruleEString )
            {
             before(grammarAccess.getArc_ImplAccess().getSuccessorElementCrossReference_4_0()); 
            // InternalNET.g:1295:3: ( ruleEString )
            // InternalNET.g:1296:4: ruleEString
            {
             before(grammarAccess.getArc_ImplAccess().getSuccessorElementEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getArc_ImplAccess().getSuccessorElementEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getArc_ImplAccess().getSuccessorElementCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc_Impl__SuccessorAssignment_4"


    // $ANTLR start "rule__ReadArc__PredecessorAssignment_0"
    // InternalNET.g:1307:1: rule__ReadArc__PredecessorAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__ReadArc__PredecessorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:1311:1: ( ( ( ruleEString ) ) )
            // InternalNET.g:1312:2: ( ( ruleEString ) )
            {
            // InternalNET.g:1312:2: ( ( ruleEString ) )
            // InternalNET.g:1313:3: ( ruleEString )
            {
             before(grammarAccess.getReadArcAccess().getPredecessorElementCrossReference_0_0()); 
            // InternalNET.g:1314:3: ( ruleEString )
            // InternalNET.g:1315:4: ruleEString
            {
             before(grammarAccess.getReadArcAccess().getPredecessorElementEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReadArcAccess().getPredecessorElementEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getReadArcAccess().getPredecessorElementCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadArc__PredecessorAssignment_0"


    // $ANTLR start "rule__ReadArc__WeightAssignment_2"
    // InternalNET.g:1326:1: rule__ReadArc__WeightAssignment_2 : ( ruleEInt ) ;
    public final void rule__ReadArc__WeightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:1330:1: ( ( ruleEInt ) )
            // InternalNET.g:1331:2: ( ruleEInt )
            {
            // InternalNET.g:1331:2: ( ruleEInt )
            // InternalNET.g:1332:3: ruleEInt
            {
             before(grammarAccess.getReadArcAccess().getWeightEIntParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getReadArcAccess().getWeightEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadArc__WeightAssignment_2"


    // $ANTLR start "rule__ReadArc__SuccessorAssignment_4"
    // InternalNET.g:1341:1: rule__ReadArc__SuccessorAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__ReadArc__SuccessorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNET.g:1345:1: ( ( ( ruleEString ) ) )
            // InternalNET.g:1346:2: ( ( ruleEString ) )
            {
            // InternalNET.g:1346:2: ( ( ruleEString ) )
            // InternalNET.g:1347:3: ( ruleEString )
            {
             before(grammarAccess.getReadArcAccess().getSuccessorElementCrossReference_4_0()); 
            // InternalNET.g:1348:3: ( ruleEString )
            // InternalNET.g:1349:4: ruleEString
            {
             before(grammarAccess.getReadArcAccess().getSuccessorElementEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReadArcAccess().getSuccessorElementEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getReadArcAccess().getSuccessorElementCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadArc__SuccessorAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000009002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020032L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000050040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000090040L});

}