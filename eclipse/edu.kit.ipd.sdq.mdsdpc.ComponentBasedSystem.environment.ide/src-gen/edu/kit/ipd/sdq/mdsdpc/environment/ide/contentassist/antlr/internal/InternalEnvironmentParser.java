package edu.kit.ipd.sdq.mdsdpc.environment.ide.contentassist.antlr.internal;

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
import edu.kit.ipd.sdq.mdsdpc.environment.services.EnvironmentGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEnvironmentParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Environment'", "'{'", "'}'", "'container'", "','", "'link'", "'Container'", "'Link'", "'('", "')'"
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
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalEnvironmentParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEnvironmentParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEnvironmentParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEnvironment.g"; }


    	private EnvironmentGrammarAccess grammarAccess;

    	public void setGrammarAccess(EnvironmentGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleEnvironment"
    // InternalEnvironment.g:53:1: entryRuleEnvironment : ruleEnvironment EOF ;
    public final void entryRuleEnvironment() throws RecognitionException {
        try {
            // InternalEnvironment.g:54:1: ( ruleEnvironment EOF )
            // InternalEnvironment.g:55:1: ruleEnvironment EOF
            {
             before(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            ruleEnvironment();

            state._fsp--;

             after(grammarAccess.getEnvironmentRule()); 
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
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // InternalEnvironment.g:62:1: ruleEnvironment : ( ( rule__Environment__Group__0 ) ) ;
    public final void ruleEnvironment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:66:2: ( ( ( rule__Environment__Group__0 ) ) )
            // InternalEnvironment.g:67:2: ( ( rule__Environment__Group__0 ) )
            {
            // InternalEnvironment.g:67:2: ( ( rule__Environment__Group__0 ) )
            // InternalEnvironment.g:68:3: ( rule__Environment__Group__0 )
            {
             before(grammarAccess.getEnvironmentAccess().getGroup()); 
            // InternalEnvironment.g:69:3: ( rule__Environment__Group__0 )
            // InternalEnvironment.g:69:4: rule__Environment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleContainer"
    // InternalEnvironment.g:78:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // InternalEnvironment.g:79:1: ( ruleContainer EOF )
            // InternalEnvironment.g:80:1: ruleContainer EOF
            {
             before(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getContainerRule()); 
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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalEnvironment.g:87:1: ruleContainer : ( ( rule__Container__Group__0 ) ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:91:2: ( ( ( rule__Container__Group__0 ) ) )
            // InternalEnvironment.g:92:2: ( ( rule__Container__Group__0 ) )
            {
            // InternalEnvironment.g:92:2: ( ( rule__Container__Group__0 ) )
            // InternalEnvironment.g:93:3: ( rule__Container__Group__0 )
            {
             before(grammarAccess.getContainerAccess().getGroup()); 
            // InternalEnvironment.g:94:3: ( rule__Container__Group__0 )
            // InternalEnvironment.g:94:4: rule__Container__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleLink"
    // InternalEnvironment.g:103:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalEnvironment.g:104:1: ( ruleLink EOF )
            // InternalEnvironment.g:105:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getLinkRule()); 
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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalEnvironment.g:112:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:116:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalEnvironment.g:117:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalEnvironment.g:117:2: ( ( rule__Link__Group__0 ) )
            // InternalEnvironment.g:118:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalEnvironment.g:119:3: ( rule__Link__Group__0 )
            // InternalEnvironment.g:119:4: rule__Link__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleEString"
    // InternalEnvironment.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalEnvironment.g:129:1: ( ruleEString EOF )
            // InternalEnvironment.g:130:1: ruleEString EOF
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
    // InternalEnvironment.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalEnvironment.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalEnvironment.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalEnvironment.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalEnvironment.g:144:3: ( rule__EString__Alternatives )
            // InternalEnvironment.g:144:4: rule__EString__Alternatives
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalEnvironment.g:152:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:156:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalEnvironment.g:157:2: ( RULE_STRING )
                    {
                    // InternalEnvironment.g:157:2: ( RULE_STRING )
                    // InternalEnvironment.g:158:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEnvironment.g:163:2: ( RULE_ID )
                    {
                    // InternalEnvironment.g:163:2: ( RULE_ID )
                    // InternalEnvironment.g:164:3: RULE_ID
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


    // $ANTLR start "rule__Environment__Group__0"
    // InternalEnvironment.g:173:1: rule__Environment__Group__0 : rule__Environment__Group__0__Impl rule__Environment__Group__1 ;
    public final void rule__Environment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:177:1: ( rule__Environment__Group__0__Impl rule__Environment__Group__1 )
            // InternalEnvironment.g:178:2: rule__Environment__Group__0__Impl rule__Environment__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Environment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__0"


    // $ANTLR start "rule__Environment__Group__0__Impl"
    // InternalEnvironment.g:185:1: rule__Environment__Group__0__Impl : ( () ) ;
    public final void rule__Environment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:189:1: ( ( () ) )
            // InternalEnvironment.g:190:1: ( () )
            {
            // InternalEnvironment.g:190:1: ( () )
            // InternalEnvironment.g:191:2: ()
            {
             before(grammarAccess.getEnvironmentAccess().getEnvironmentAction_0()); 
            // InternalEnvironment.g:192:2: ()
            // InternalEnvironment.g:192:3: 
            {
            }

             after(grammarAccess.getEnvironmentAccess().getEnvironmentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__0__Impl"


    // $ANTLR start "rule__Environment__Group__1"
    // InternalEnvironment.g:200:1: rule__Environment__Group__1 : rule__Environment__Group__1__Impl rule__Environment__Group__2 ;
    public final void rule__Environment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:204:1: ( rule__Environment__Group__1__Impl rule__Environment__Group__2 )
            // InternalEnvironment.g:205:2: rule__Environment__Group__1__Impl rule__Environment__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Environment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__1"


    // $ANTLR start "rule__Environment__Group__1__Impl"
    // InternalEnvironment.g:212:1: rule__Environment__Group__1__Impl : ( 'Environment' ) ;
    public final void rule__Environment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:216:1: ( ( 'Environment' ) )
            // InternalEnvironment.g:217:1: ( 'Environment' )
            {
            // InternalEnvironment.g:217:1: ( 'Environment' )
            // InternalEnvironment.g:218:2: 'Environment'
            {
             before(grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__1__Impl"


    // $ANTLR start "rule__Environment__Group__2"
    // InternalEnvironment.g:227:1: rule__Environment__Group__2 : rule__Environment__Group__2__Impl rule__Environment__Group__3 ;
    public final void rule__Environment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:231:1: ( rule__Environment__Group__2__Impl rule__Environment__Group__3 )
            // InternalEnvironment.g:232:2: rule__Environment__Group__2__Impl rule__Environment__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Environment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__2"


    // $ANTLR start "rule__Environment__Group__2__Impl"
    // InternalEnvironment.g:239:1: rule__Environment__Group__2__Impl : ( ( rule__Environment__NameAssignment_2 ) ) ;
    public final void rule__Environment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:243:1: ( ( ( rule__Environment__NameAssignment_2 ) ) )
            // InternalEnvironment.g:244:1: ( ( rule__Environment__NameAssignment_2 ) )
            {
            // InternalEnvironment.g:244:1: ( ( rule__Environment__NameAssignment_2 ) )
            // InternalEnvironment.g:245:2: ( rule__Environment__NameAssignment_2 )
            {
             before(grammarAccess.getEnvironmentAccess().getNameAssignment_2()); 
            // InternalEnvironment.g:246:2: ( rule__Environment__NameAssignment_2 )
            // InternalEnvironment.g:246:3: rule__Environment__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Environment__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__2__Impl"


    // $ANTLR start "rule__Environment__Group__3"
    // InternalEnvironment.g:254:1: rule__Environment__Group__3 : rule__Environment__Group__3__Impl rule__Environment__Group__4 ;
    public final void rule__Environment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:258:1: ( rule__Environment__Group__3__Impl rule__Environment__Group__4 )
            // InternalEnvironment.g:259:2: rule__Environment__Group__3__Impl rule__Environment__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Environment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__3"


    // $ANTLR start "rule__Environment__Group__3__Impl"
    // InternalEnvironment.g:266:1: rule__Environment__Group__3__Impl : ( '{' ) ;
    public final void rule__Environment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:270:1: ( ( '{' ) )
            // InternalEnvironment.g:271:1: ( '{' )
            {
            // InternalEnvironment.g:271:1: ( '{' )
            // InternalEnvironment.g:272:2: '{'
            {
             before(grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__3__Impl"


    // $ANTLR start "rule__Environment__Group__4"
    // InternalEnvironment.g:281:1: rule__Environment__Group__4 : rule__Environment__Group__4__Impl rule__Environment__Group__5 ;
    public final void rule__Environment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:285:1: ( rule__Environment__Group__4__Impl rule__Environment__Group__5 )
            // InternalEnvironment.g:286:2: rule__Environment__Group__4__Impl rule__Environment__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Environment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__4"


    // $ANTLR start "rule__Environment__Group__4__Impl"
    // InternalEnvironment.g:293:1: rule__Environment__Group__4__Impl : ( ( rule__Environment__Group_4__0 )? ) ;
    public final void rule__Environment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:297:1: ( ( ( rule__Environment__Group_4__0 )? ) )
            // InternalEnvironment.g:298:1: ( ( rule__Environment__Group_4__0 )? )
            {
            // InternalEnvironment.g:298:1: ( ( rule__Environment__Group_4__0 )? )
            // InternalEnvironment.g:299:2: ( rule__Environment__Group_4__0 )?
            {
             before(grammarAccess.getEnvironmentAccess().getGroup_4()); 
            // InternalEnvironment.g:300:2: ( rule__Environment__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEnvironment.g:300:3: rule__Environment__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Environment__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnvironmentAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__4__Impl"


    // $ANTLR start "rule__Environment__Group__5"
    // InternalEnvironment.g:308:1: rule__Environment__Group__5 : rule__Environment__Group__5__Impl rule__Environment__Group__6 ;
    public final void rule__Environment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:312:1: ( rule__Environment__Group__5__Impl rule__Environment__Group__6 )
            // InternalEnvironment.g:313:2: rule__Environment__Group__5__Impl rule__Environment__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Environment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__5"


    // $ANTLR start "rule__Environment__Group__5__Impl"
    // InternalEnvironment.g:320:1: rule__Environment__Group__5__Impl : ( ( rule__Environment__Group_5__0 )? ) ;
    public final void rule__Environment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:324:1: ( ( ( rule__Environment__Group_5__0 )? ) )
            // InternalEnvironment.g:325:1: ( ( rule__Environment__Group_5__0 )? )
            {
            // InternalEnvironment.g:325:1: ( ( rule__Environment__Group_5__0 )? )
            // InternalEnvironment.g:326:2: ( rule__Environment__Group_5__0 )?
            {
             before(grammarAccess.getEnvironmentAccess().getGroup_5()); 
            // InternalEnvironment.g:327:2: ( rule__Environment__Group_5__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEnvironment.g:327:3: rule__Environment__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Environment__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnvironmentAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__5__Impl"


    // $ANTLR start "rule__Environment__Group__6"
    // InternalEnvironment.g:335:1: rule__Environment__Group__6 : rule__Environment__Group__6__Impl ;
    public final void rule__Environment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:339:1: ( rule__Environment__Group__6__Impl )
            // InternalEnvironment.g:340:2: rule__Environment__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__6"


    // $ANTLR start "rule__Environment__Group__6__Impl"
    // InternalEnvironment.g:346:1: rule__Environment__Group__6__Impl : ( '}' ) ;
    public final void rule__Environment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:350:1: ( ( '}' ) )
            // InternalEnvironment.g:351:1: ( '}' )
            {
            // InternalEnvironment.g:351:1: ( '}' )
            // InternalEnvironment.g:352:2: '}'
            {
             before(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__6__Impl"


    // $ANTLR start "rule__Environment__Group_4__0"
    // InternalEnvironment.g:362:1: rule__Environment__Group_4__0 : rule__Environment__Group_4__0__Impl rule__Environment__Group_4__1 ;
    public final void rule__Environment__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:366:1: ( rule__Environment__Group_4__0__Impl rule__Environment__Group_4__1 )
            // InternalEnvironment.g:367:2: rule__Environment__Group_4__0__Impl rule__Environment__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Environment__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_4__0"


    // $ANTLR start "rule__Environment__Group_4__0__Impl"
    // InternalEnvironment.g:374:1: rule__Environment__Group_4__0__Impl : ( 'container' ) ;
    public final void rule__Environment__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:378:1: ( ( 'container' ) )
            // InternalEnvironment.g:379:1: ( 'container' )
            {
            // InternalEnvironment.g:379:1: ( 'container' )
            // InternalEnvironment.g:380:2: 'container'
            {
             before(grammarAccess.getEnvironmentAccess().getContainerKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getContainerKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_4__0__Impl"


    // $ANTLR start "rule__Environment__Group_4__1"
    // InternalEnvironment.g:389:1: rule__Environment__Group_4__1 : rule__Environment__Group_4__1__Impl rule__Environment__Group_4__2 ;
    public final void rule__Environment__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:393:1: ( rule__Environment__Group_4__1__Impl rule__Environment__Group_4__2 )
            // InternalEnvironment.g:394:2: rule__Environment__Group_4__1__Impl rule__Environment__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__Environment__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_4__1"


    // $ANTLR start "rule__Environment__Group_4__1__Impl"
    // InternalEnvironment.g:401:1: rule__Environment__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Environment__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:405:1: ( ( '{' ) )
            // InternalEnvironment.g:406:1: ( '{' )
            {
            // InternalEnvironment.g:406:1: ( '{' )
            // InternalEnvironment.g:407:2: '{'
            {
             before(grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_4__1__Impl"


    // $ANTLR start "rule__Environment__Group_4__2"
    // InternalEnvironment.g:416:1: rule__Environment__Group_4__2 : rule__Environment__Group_4__2__Impl rule__Environment__Group_4__3 ;
    public final void rule__Environment__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:420:1: ( rule__Environment__Group_4__2__Impl rule__Environment__Group_4__3 )
            // InternalEnvironment.g:421:2: rule__Environment__Group_4__2__Impl rule__Environment__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__Environment__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_4__2"


    // $ANTLR start "rule__Environment__Group_4__2__Impl"
    // InternalEnvironment.g:428:1: rule__Environment__Group_4__2__Impl : ( ( rule__Environment__ContainerAssignment_4_2 ) ) ;
    public final void rule__Environment__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:432:1: ( ( ( rule__Environment__ContainerAssignment_4_2 ) ) )
            // InternalEnvironment.g:433:1: ( ( rule__Environment__ContainerAssignment_4_2 ) )
            {
            // InternalEnvironment.g:433:1: ( ( rule__Environment__ContainerAssignment_4_2 ) )
            // InternalEnvironment.g:434:2: ( rule__Environment__ContainerAssignment_4_2 )
            {
             before(grammarAccess.getEnvironmentAccess().getContainerAssignment_4_2()); 
            // InternalEnvironment.g:435:2: ( rule__Environment__ContainerAssignment_4_2 )
            // InternalEnvironment.g:435:3: rule__Environment__ContainerAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Environment__ContainerAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getContainerAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_4__2__Impl"


    // $ANTLR start "rule__Environment__Group_4__3"
    // InternalEnvironment.g:443:1: rule__Environment__Group_4__3 : rule__Environment__Group_4__3__Impl rule__Environment__Group_4__4 ;
    public final void rule__Environment__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:447:1: ( rule__Environment__Group_4__3__Impl rule__Environment__Group_4__4 )
            // InternalEnvironment.g:448:2: rule__Environment__Group_4__3__Impl rule__Environment__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__Environment__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_4__3"


    // $ANTLR start "rule__Environment__Group_4__3__Impl"
    // InternalEnvironment.g:455:1: rule__Environment__Group_4__3__Impl : ( ( rule__Environment__Group_4_3__0 )* ) ;
    public final void rule__Environment__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:459:1: ( ( ( rule__Environment__Group_4_3__0 )* ) )
            // InternalEnvironment.g:460:1: ( ( rule__Environment__Group_4_3__0 )* )
            {
            // InternalEnvironment.g:460:1: ( ( rule__Environment__Group_4_3__0 )* )
            // InternalEnvironment.g:461:2: ( rule__Environment__Group_4_3__0 )*
            {
             before(grammarAccess.getEnvironmentAccess().getGroup_4_3()); 
            // InternalEnvironment.g:462:2: ( rule__Environment__Group_4_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEnvironment.g:462:3: rule__Environment__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Environment__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getEnvironmentAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_4__3__Impl"


    // $ANTLR start "rule__Environment__Group_4__4"
    // InternalEnvironment.g:470:1: rule__Environment__Group_4__4 : rule__Environment__Group_4__4__Impl ;
    public final void rule__Environment__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:474:1: ( rule__Environment__Group_4__4__Impl )
            // InternalEnvironment.g:475:2: rule__Environment__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_4__4"


    // $ANTLR start "rule__Environment__Group_4__4__Impl"
    // InternalEnvironment.g:481:1: rule__Environment__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Environment__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:485:1: ( ( '}' ) )
            // InternalEnvironment.g:486:1: ( '}' )
            {
            // InternalEnvironment.g:486:1: ( '}' )
            // InternalEnvironment.g:487:2: '}'
            {
             before(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_4__4__Impl"


    // $ANTLR start "rule__Environment__Group_4_3__0"
    // InternalEnvironment.g:497:1: rule__Environment__Group_4_3__0 : rule__Environment__Group_4_3__0__Impl rule__Environment__Group_4_3__1 ;
    public final void rule__Environment__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:501:1: ( rule__Environment__Group_4_3__0__Impl rule__Environment__Group_4_3__1 )
            // InternalEnvironment.g:502:2: rule__Environment__Group_4_3__0__Impl rule__Environment__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Environment__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_4_3__0"


    // $ANTLR start "rule__Environment__Group_4_3__0__Impl"
    // InternalEnvironment.g:509:1: rule__Environment__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Environment__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:513:1: ( ( ',' ) )
            // InternalEnvironment.g:514:1: ( ',' )
            {
            // InternalEnvironment.g:514:1: ( ',' )
            // InternalEnvironment.g:515:2: ','
            {
             before(grammarAccess.getEnvironmentAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_4_3__0__Impl"


    // $ANTLR start "rule__Environment__Group_4_3__1"
    // InternalEnvironment.g:524:1: rule__Environment__Group_4_3__1 : rule__Environment__Group_4_3__1__Impl ;
    public final void rule__Environment__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:528:1: ( rule__Environment__Group_4_3__1__Impl )
            // InternalEnvironment.g:529:2: rule__Environment__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_4_3__1"


    // $ANTLR start "rule__Environment__Group_4_3__1__Impl"
    // InternalEnvironment.g:535:1: rule__Environment__Group_4_3__1__Impl : ( ( rule__Environment__ContainerAssignment_4_3_1 ) ) ;
    public final void rule__Environment__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:539:1: ( ( ( rule__Environment__ContainerAssignment_4_3_1 ) ) )
            // InternalEnvironment.g:540:1: ( ( rule__Environment__ContainerAssignment_4_3_1 ) )
            {
            // InternalEnvironment.g:540:1: ( ( rule__Environment__ContainerAssignment_4_3_1 ) )
            // InternalEnvironment.g:541:2: ( rule__Environment__ContainerAssignment_4_3_1 )
            {
             before(grammarAccess.getEnvironmentAccess().getContainerAssignment_4_3_1()); 
            // InternalEnvironment.g:542:2: ( rule__Environment__ContainerAssignment_4_3_1 )
            // InternalEnvironment.g:542:3: rule__Environment__ContainerAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Environment__ContainerAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getContainerAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_4_3__1__Impl"


    // $ANTLR start "rule__Environment__Group_5__0"
    // InternalEnvironment.g:551:1: rule__Environment__Group_5__0 : rule__Environment__Group_5__0__Impl rule__Environment__Group_5__1 ;
    public final void rule__Environment__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:555:1: ( rule__Environment__Group_5__0__Impl rule__Environment__Group_5__1 )
            // InternalEnvironment.g:556:2: rule__Environment__Group_5__0__Impl rule__Environment__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Environment__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_5__0"


    // $ANTLR start "rule__Environment__Group_5__0__Impl"
    // InternalEnvironment.g:563:1: rule__Environment__Group_5__0__Impl : ( 'link' ) ;
    public final void rule__Environment__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:567:1: ( ( 'link' ) )
            // InternalEnvironment.g:568:1: ( 'link' )
            {
            // InternalEnvironment.g:568:1: ( 'link' )
            // InternalEnvironment.g:569:2: 'link'
            {
             before(grammarAccess.getEnvironmentAccess().getLinkKeyword_5_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getLinkKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_5__0__Impl"


    // $ANTLR start "rule__Environment__Group_5__1"
    // InternalEnvironment.g:578:1: rule__Environment__Group_5__1 : rule__Environment__Group_5__1__Impl rule__Environment__Group_5__2 ;
    public final void rule__Environment__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:582:1: ( rule__Environment__Group_5__1__Impl rule__Environment__Group_5__2 )
            // InternalEnvironment.g:583:2: rule__Environment__Group_5__1__Impl rule__Environment__Group_5__2
            {
            pushFollow(FOLLOW_10);
            rule__Environment__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_5__1"


    // $ANTLR start "rule__Environment__Group_5__1__Impl"
    // InternalEnvironment.g:590:1: rule__Environment__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Environment__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:594:1: ( ( '{' ) )
            // InternalEnvironment.g:595:1: ( '{' )
            {
            // InternalEnvironment.g:595:1: ( '{' )
            // InternalEnvironment.g:596:2: '{'
            {
             before(grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_5__1__Impl"


    // $ANTLR start "rule__Environment__Group_5__2"
    // InternalEnvironment.g:605:1: rule__Environment__Group_5__2 : rule__Environment__Group_5__2__Impl rule__Environment__Group_5__3 ;
    public final void rule__Environment__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:609:1: ( rule__Environment__Group_5__2__Impl rule__Environment__Group_5__3 )
            // InternalEnvironment.g:610:2: rule__Environment__Group_5__2__Impl rule__Environment__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__Environment__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_5__2"


    // $ANTLR start "rule__Environment__Group_5__2__Impl"
    // InternalEnvironment.g:617:1: rule__Environment__Group_5__2__Impl : ( ( rule__Environment__LinkAssignment_5_2 ) ) ;
    public final void rule__Environment__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:621:1: ( ( ( rule__Environment__LinkAssignment_5_2 ) ) )
            // InternalEnvironment.g:622:1: ( ( rule__Environment__LinkAssignment_5_2 ) )
            {
            // InternalEnvironment.g:622:1: ( ( rule__Environment__LinkAssignment_5_2 ) )
            // InternalEnvironment.g:623:2: ( rule__Environment__LinkAssignment_5_2 )
            {
             before(grammarAccess.getEnvironmentAccess().getLinkAssignment_5_2()); 
            // InternalEnvironment.g:624:2: ( rule__Environment__LinkAssignment_5_2 )
            // InternalEnvironment.g:624:3: rule__Environment__LinkAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Environment__LinkAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getLinkAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_5__2__Impl"


    // $ANTLR start "rule__Environment__Group_5__3"
    // InternalEnvironment.g:632:1: rule__Environment__Group_5__3 : rule__Environment__Group_5__3__Impl rule__Environment__Group_5__4 ;
    public final void rule__Environment__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:636:1: ( rule__Environment__Group_5__3__Impl rule__Environment__Group_5__4 )
            // InternalEnvironment.g:637:2: rule__Environment__Group_5__3__Impl rule__Environment__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__Environment__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_5__3"


    // $ANTLR start "rule__Environment__Group_5__3__Impl"
    // InternalEnvironment.g:644:1: rule__Environment__Group_5__3__Impl : ( ( rule__Environment__Group_5_3__0 )* ) ;
    public final void rule__Environment__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:648:1: ( ( ( rule__Environment__Group_5_3__0 )* ) )
            // InternalEnvironment.g:649:1: ( ( rule__Environment__Group_5_3__0 )* )
            {
            // InternalEnvironment.g:649:1: ( ( rule__Environment__Group_5_3__0 )* )
            // InternalEnvironment.g:650:2: ( rule__Environment__Group_5_3__0 )*
            {
             before(grammarAccess.getEnvironmentAccess().getGroup_5_3()); 
            // InternalEnvironment.g:651:2: ( rule__Environment__Group_5_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEnvironment.g:651:3: rule__Environment__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Environment__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getEnvironmentAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_5__3__Impl"


    // $ANTLR start "rule__Environment__Group_5__4"
    // InternalEnvironment.g:659:1: rule__Environment__Group_5__4 : rule__Environment__Group_5__4__Impl ;
    public final void rule__Environment__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:663:1: ( rule__Environment__Group_5__4__Impl )
            // InternalEnvironment.g:664:2: rule__Environment__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_5__4"


    // $ANTLR start "rule__Environment__Group_5__4__Impl"
    // InternalEnvironment.g:670:1: rule__Environment__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Environment__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:674:1: ( ( '}' ) )
            // InternalEnvironment.g:675:1: ( '}' )
            {
            // InternalEnvironment.g:675:1: ( '}' )
            // InternalEnvironment.g:676:2: '}'
            {
             before(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_5__4__Impl"


    // $ANTLR start "rule__Environment__Group_5_3__0"
    // InternalEnvironment.g:686:1: rule__Environment__Group_5_3__0 : rule__Environment__Group_5_3__0__Impl rule__Environment__Group_5_3__1 ;
    public final void rule__Environment__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:690:1: ( rule__Environment__Group_5_3__0__Impl rule__Environment__Group_5_3__1 )
            // InternalEnvironment.g:691:2: rule__Environment__Group_5_3__0__Impl rule__Environment__Group_5_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Environment__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_5_3__0"


    // $ANTLR start "rule__Environment__Group_5_3__0__Impl"
    // InternalEnvironment.g:698:1: rule__Environment__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Environment__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:702:1: ( ( ',' ) )
            // InternalEnvironment.g:703:1: ( ',' )
            {
            // InternalEnvironment.g:703:1: ( ',' )
            // InternalEnvironment.g:704:2: ','
            {
             before(grammarAccess.getEnvironmentAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_5_3__0__Impl"


    // $ANTLR start "rule__Environment__Group_5_3__1"
    // InternalEnvironment.g:713:1: rule__Environment__Group_5_3__1 : rule__Environment__Group_5_3__1__Impl ;
    public final void rule__Environment__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:717:1: ( rule__Environment__Group_5_3__1__Impl )
            // InternalEnvironment.g:718:2: rule__Environment__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_5_3__1"


    // $ANTLR start "rule__Environment__Group_5_3__1__Impl"
    // InternalEnvironment.g:724:1: rule__Environment__Group_5_3__1__Impl : ( ( rule__Environment__LinkAssignment_5_3_1 ) ) ;
    public final void rule__Environment__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:728:1: ( ( ( rule__Environment__LinkAssignment_5_3_1 ) ) )
            // InternalEnvironment.g:729:1: ( ( rule__Environment__LinkAssignment_5_3_1 ) )
            {
            // InternalEnvironment.g:729:1: ( ( rule__Environment__LinkAssignment_5_3_1 ) )
            // InternalEnvironment.g:730:2: ( rule__Environment__LinkAssignment_5_3_1 )
            {
             before(grammarAccess.getEnvironmentAccess().getLinkAssignment_5_3_1()); 
            // InternalEnvironment.g:731:2: ( rule__Environment__LinkAssignment_5_3_1 )
            // InternalEnvironment.g:731:3: rule__Environment__LinkAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Environment__LinkAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getLinkAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_5_3__1__Impl"


    // $ANTLR start "rule__Container__Group__0"
    // InternalEnvironment.g:740:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:744:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // InternalEnvironment.g:745:2: rule__Container__Group__0__Impl rule__Container__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Container__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__0"


    // $ANTLR start "rule__Container__Group__0__Impl"
    // InternalEnvironment.g:752:1: rule__Container__Group__0__Impl : ( () ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:756:1: ( ( () ) )
            // InternalEnvironment.g:757:1: ( () )
            {
            // InternalEnvironment.g:757:1: ( () )
            // InternalEnvironment.g:758:2: ()
            {
             before(grammarAccess.getContainerAccess().getContainerAction_0()); 
            // InternalEnvironment.g:759:2: ()
            // InternalEnvironment.g:759:3: 
            {
            }

             after(grammarAccess.getContainerAccess().getContainerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__0__Impl"


    // $ANTLR start "rule__Container__Group__1"
    // InternalEnvironment.g:767:1: rule__Container__Group__1 : rule__Container__Group__1__Impl rule__Container__Group__2 ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:771:1: ( rule__Container__Group__1__Impl rule__Container__Group__2 )
            // InternalEnvironment.g:772:2: rule__Container__Group__1__Impl rule__Container__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Container__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__1"


    // $ANTLR start "rule__Container__Group__1__Impl"
    // InternalEnvironment.g:779:1: rule__Container__Group__1__Impl : ( 'Container' ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:783:1: ( ( 'Container' ) )
            // InternalEnvironment.g:784:1: ( 'Container' )
            {
            // InternalEnvironment.g:784:1: ( 'Container' )
            // InternalEnvironment.g:785:2: 'Container'
            {
             before(grammarAccess.getContainerAccess().getContainerKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getContainerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__1__Impl"


    // $ANTLR start "rule__Container__Group__2"
    // InternalEnvironment.g:794:1: rule__Container__Group__2 : rule__Container__Group__2__Impl ;
    public final void rule__Container__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:798:1: ( rule__Container__Group__2__Impl )
            // InternalEnvironment.g:799:2: rule__Container__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__2"


    // $ANTLR start "rule__Container__Group__2__Impl"
    // InternalEnvironment.g:805:1: rule__Container__Group__2__Impl : ( ( rule__Container__NameAssignment_2 ) ) ;
    public final void rule__Container__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:809:1: ( ( ( rule__Container__NameAssignment_2 ) ) )
            // InternalEnvironment.g:810:1: ( ( rule__Container__NameAssignment_2 ) )
            {
            // InternalEnvironment.g:810:1: ( ( rule__Container__NameAssignment_2 ) )
            // InternalEnvironment.g:811:2: ( rule__Container__NameAssignment_2 )
            {
             before(grammarAccess.getContainerAccess().getNameAssignment_2()); 
            // InternalEnvironment.g:812:2: ( rule__Container__NameAssignment_2 )
            // InternalEnvironment.g:812:3: rule__Container__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Container__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__2__Impl"


    // $ANTLR start "rule__Link__Group__0"
    // InternalEnvironment.g:821:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:825:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalEnvironment.g:826:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Link__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0"


    // $ANTLR start "rule__Link__Group__0__Impl"
    // InternalEnvironment.g:833:1: rule__Link__Group__0__Impl : ( 'Link' ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:837:1: ( ( 'Link' ) )
            // InternalEnvironment.g:838:1: ( 'Link' )
            {
            // InternalEnvironment.g:838:1: ( 'Link' )
            // InternalEnvironment.g:839:2: 'Link'
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLinkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0__Impl"


    // $ANTLR start "rule__Link__Group__1"
    // InternalEnvironment.g:848:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:852:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalEnvironment.g:853:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Link__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1"


    // $ANTLR start "rule__Link__Group__1__Impl"
    // InternalEnvironment.g:860:1: rule__Link__Group__1__Impl : ( ( rule__Link__NameAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:864:1: ( ( ( rule__Link__NameAssignment_1 ) ) )
            // InternalEnvironment.g:865:1: ( ( rule__Link__NameAssignment_1 ) )
            {
            // InternalEnvironment.g:865:1: ( ( rule__Link__NameAssignment_1 ) )
            // InternalEnvironment.g:866:2: ( rule__Link__NameAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_1()); 
            // InternalEnvironment.g:867:2: ( rule__Link__NameAssignment_1 )
            // InternalEnvironment.g:867:3: rule__Link__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1__Impl"


    // $ANTLR start "rule__Link__Group__2"
    // InternalEnvironment.g:875:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:879:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalEnvironment.g:880:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Link__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2"


    // $ANTLR start "rule__Link__Group__2__Impl"
    // InternalEnvironment.g:887:1: rule__Link__Group__2__Impl : ( '{' ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:891:1: ( ( '{' ) )
            // InternalEnvironment.g:892:1: ( '{' )
            {
            // InternalEnvironment.g:892:1: ( '{' )
            // InternalEnvironment.g:893:2: '{'
            {
             before(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2__Impl"


    // $ANTLR start "rule__Link__Group__3"
    // InternalEnvironment.g:902:1: rule__Link__Group__3 : rule__Link__Group__3__Impl rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:906:1: ( rule__Link__Group__3__Impl rule__Link__Group__4 )
            // InternalEnvironment.g:907:2: rule__Link__Group__3__Impl rule__Link__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Link__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__3"


    // $ANTLR start "rule__Link__Group__3__Impl"
    // InternalEnvironment.g:914:1: rule__Link__Group__3__Impl : ( 'container' ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:918:1: ( ( 'container' ) )
            // InternalEnvironment.g:919:1: ( 'container' )
            {
            // InternalEnvironment.g:919:1: ( 'container' )
            // InternalEnvironment.g:920:2: 'container'
            {
             before(grammarAccess.getLinkAccess().getContainerKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getContainerKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__3__Impl"


    // $ANTLR start "rule__Link__Group__4"
    // InternalEnvironment.g:929:1: rule__Link__Group__4 : rule__Link__Group__4__Impl rule__Link__Group__5 ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:933:1: ( rule__Link__Group__4__Impl rule__Link__Group__5 )
            // InternalEnvironment.g:934:2: rule__Link__Group__4__Impl rule__Link__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Link__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__4"


    // $ANTLR start "rule__Link__Group__4__Impl"
    // InternalEnvironment.g:941:1: rule__Link__Group__4__Impl : ( '(' ) ;
    public final void rule__Link__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:945:1: ( ( '(' ) )
            // InternalEnvironment.g:946:1: ( '(' )
            {
            // InternalEnvironment.g:946:1: ( '(' )
            // InternalEnvironment.g:947:2: '('
            {
             before(grammarAccess.getLinkAccess().getLeftParenthesisKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__4__Impl"


    // $ANTLR start "rule__Link__Group__5"
    // InternalEnvironment.g:956:1: rule__Link__Group__5 : rule__Link__Group__5__Impl rule__Link__Group__6 ;
    public final void rule__Link__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:960:1: ( rule__Link__Group__5__Impl rule__Link__Group__6 )
            // InternalEnvironment.g:961:2: rule__Link__Group__5__Impl rule__Link__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Link__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__5"


    // $ANTLR start "rule__Link__Group__5__Impl"
    // InternalEnvironment.g:968:1: rule__Link__Group__5__Impl : ( ( rule__Link__ContainerAssignment_5 ) ) ;
    public final void rule__Link__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:972:1: ( ( ( rule__Link__ContainerAssignment_5 ) ) )
            // InternalEnvironment.g:973:1: ( ( rule__Link__ContainerAssignment_5 ) )
            {
            // InternalEnvironment.g:973:1: ( ( rule__Link__ContainerAssignment_5 ) )
            // InternalEnvironment.g:974:2: ( rule__Link__ContainerAssignment_5 )
            {
             before(grammarAccess.getLinkAccess().getContainerAssignment_5()); 
            // InternalEnvironment.g:975:2: ( rule__Link__ContainerAssignment_5 )
            // InternalEnvironment.g:975:3: rule__Link__ContainerAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Link__ContainerAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getContainerAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__5__Impl"


    // $ANTLR start "rule__Link__Group__6"
    // InternalEnvironment.g:983:1: rule__Link__Group__6 : rule__Link__Group__6__Impl rule__Link__Group__7 ;
    public final void rule__Link__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:987:1: ( rule__Link__Group__6__Impl rule__Link__Group__7 )
            // InternalEnvironment.g:988:2: rule__Link__Group__6__Impl rule__Link__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Link__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__6"


    // $ANTLR start "rule__Link__Group__6__Impl"
    // InternalEnvironment.g:995:1: rule__Link__Group__6__Impl : ( ( rule__Link__Group_6__0 )* ) ;
    public final void rule__Link__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:999:1: ( ( ( rule__Link__Group_6__0 )* ) )
            // InternalEnvironment.g:1000:1: ( ( rule__Link__Group_6__0 )* )
            {
            // InternalEnvironment.g:1000:1: ( ( rule__Link__Group_6__0 )* )
            // InternalEnvironment.g:1001:2: ( rule__Link__Group_6__0 )*
            {
             before(grammarAccess.getLinkAccess().getGroup_6()); 
            // InternalEnvironment.g:1002:2: ( rule__Link__Group_6__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEnvironment.g:1002:3: rule__Link__Group_6__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Link__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__6__Impl"


    // $ANTLR start "rule__Link__Group__7"
    // InternalEnvironment.g:1010:1: rule__Link__Group__7 : rule__Link__Group__7__Impl rule__Link__Group__8 ;
    public final void rule__Link__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:1014:1: ( rule__Link__Group__7__Impl rule__Link__Group__8 )
            // InternalEnvironment.g:1015:2: rule__Link__Group__7__Impl rule__Link__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__Link__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__7"


    // $ANTLR start "rule__Link__Group__7__Impl"
    // InternalEnvironment.g:1022:1: rule__Link__Group__7__Impl : ( ')' ) ;
    public final void rule__Link__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:1026:1: ( ( ')' ) )
            // InternalEnvironment.g:1027:1: ( ')' )
            {
            // InternalEnvironment.g:1027:1: ( ')' )
            // InternalEnvironment.g:1028:2: ')'
            {
             before(grammarAccess.getLinkAccess().getRightParenthesisKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__7__Impl"


    // $ANTLR start "rule__Link__Group__8"
    // InternalEnvironment.g:1037:1: rule__Link__Group__8 : rule__Link__Group__8__Impl ;
    public final void rule__Link__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:1041:1: ( rule__Link__Group__8__Impl )
            // InternalEnvironment.g:1042:2: rule__Link__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__8"


    // $ANTLR start "rule__Link__Group__8__Impl"
    // InternalEnvironment.g:1048:1: rule__Link__Group__8__Impl : ( '}' ) ;
    public final void rule__Link__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:1052:1: ( ( '}' ) )
            // InternalEnvironment.g:1053:1: ( '}' )
            {
            // InternalEnvironment.g:1053:1: ( '}' )
            // InternalEnvironment.g:1054:2: '}'
            {
             before(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__8__Impl"


    // $ANTLR start "rule__Link__Group_6__0"
    // InternalEnvironment.g:1064:1: rule__Link__Group_6__0 : rule__Link__Group_6__0__Impl rule__Link__Group_6__1 ;
    public final void rule__Link__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:1068:1: ( rule__Link__Group_6__0__Impl rule__Link__Group_6__1 )
            // InternalEnvironment.g:1069:2: rule__Link__Group_6__0__Impl rule__Link__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Link__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_6__0"


    // $ANTLR start "rule__Link__Group_6__0__Impl"
    // InternalEnvironment.g:1076:1: rule__Link__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Link__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:1080:1: ( ( ',' ) )
            // InternalEnvironment.g:1081:1: ( ',' )
            {
            // InternalEnvironment.g:1081:1: ( ',' )
            // InternalEnvironment.g:1082:2: ','
            {
             before(grammarAccess.getLinkAccess().getCommaKeyword_6_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_6__0__Impl"


    // $ANTLR start "rule__Link__Group_6__1"
    // InternalEnvironment.g:1091:1: rule__Link__Group_6__1 : rule__Link__Group_6__1__Impl ;
    public final void rule__Link__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:1095:1: ( rule__Link__Group_6__1__Impl )
            // InternalEnvironment.g:1096:2: rule__Link__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_6__1"


    // $ANTLR start "rule__Link__Group_6__1__Impl"
    // InternalEnvironment.g:1102:1: rule__Link__Group_6__1__Impl : ( ( rule__Link__ContainerAssignment_6_1 ) ) ;
    public final void rule__Link__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:1106:1: ( ( ( rule__Link__ContainerAssignment_6_1 ) ) )
            // InternalEnvironment.g:1107:1: ( ( rule__Link__ContainerAssignment_6_1 ) )
            {
            // InternalEnvironment.g:1107:1: ( ( rule__Link__ContainerAssignment_6_1 ) )
            // InternalEnvironment.g:1108:2: ( rule__Link__ContainerAssignment_6_1 )
            {
             before(grammarAccess.getLinkAccess().getContainerAssignment_6_1()); 
            // InternalEnvironment.g:1109:2: ( rule__Link__ContainerAssignment_6_1 )
            // InternalEnvironment.g:1109:3: rule__Link__ContainerAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__ContainerAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getContainerAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_6__1__Impl"


    // $ANTLR start "rule__Environment__NameAssignment_2"
    // InternalEnvironment.g:1118:1: rule__Environment__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Environment__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:1122:1: ( ( ruleEString ) )
            // InternalEnvironment.g:1123:2: ( ruleEString )
            {
            // InternalEnvironment.g:1123:2: ( ruleEString )
            // InternalEnvironment.g:1124:3: ruleEString
            {
             before(grammarAccess.getEnvironmentAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnvironmentAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__NameAssignment_2"


    // $ANTLR start "rule__Environment__ContainerAssignment_4_2"
    // InternalEnvironment.g:1133:1: rule__Environment__ContainerAssignment_4_2 : ( ruleContainer ) ;
    public final void rule__Environment__ContainerAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:1137:1: ( ( ruleContainer ) )
            // InternalEnvironment.g:1138:2: ( ruleContainer )
            {
            // InternalEnvironment.g:1138:2: ( ruleContainer )
            // InternalEnvironment.g:1139:3: ruleContainer
            {
             before(grammarAccess.getEnvironmentAccess().getContainerContainerParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getEnvironmentAccess().getContainerContainerParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__ContainerAssignment_4_2"


    // $ANTLR start "rule__Environment__ContainerAssignment_4_3_1"
    // InternalEnvironment.g:1148:1: rule__Environment__ContainerAssignment_4_3_1 : ( ruleContainer ) ;
    public final void rule__Environment__ContainerAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:1152:1: ( ( ruleContainer ) )
            // InternalEnvironment.g:1153:2: ( ruleContainer )
            {
            // InternalEnvironment.g:1153:2: ( ruleContainer )
            // InternalEnvironment.g:1154:3: ruleContainer
            {
             before(grammarAccess.getEnvironmentAccess().getContainerContainerParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getEnvironmentAccess().getContainerContainerParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__ContainerAssignment_4_3_1"


    // $ANTLR start "rule__Environment__LinkAssignment_5_2"
    // InternalEnvironment.g:1163:1: rule__Environment__LinkAssignment_5_2 : ( ruleLink ) ;
    public final void rule__Environment__LinkAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:1167:1: ( ( ruleLink ) )
            // InternalEnvironment.g:1168:2: ( ruleLink )
            {
            // InternalEnvironment.g:1168:2: ( ruleLink )
            // InternalEnvironment.g:1169:3: ruleLink
            {
             before(grammarAccess.getEnvironmentAccess().getLinkLinkParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getEnvironmentAccess().getLinkLinkParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__LinkAssignment_5_2"


    // $ANTLR start "rule__Environment__LinkAssignment_5_3_1"
    // InternalEnvironment.g:1178:1: rule__Environment__LinkAssignment_5_3_1 : ( ruleLink ) ;
    public final void rule__Environment__LinkAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:1182:1: ( ( ruleLink ) )
            // InternalEnvironment.g:1183:2: ( ruleLink )
            {
            // InternalEnvironment.g:1183:2: ( ruleLink )
            // InternalEnvironment.g:1184:3: ruleLink
            {
             before(grammarAccess.getEnvironmentAccess().getLinkLinkParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getEnvironmentAccess().getLinkLinkParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__LinkAssignment_5_3_1"


    // $ANTLR start "rule__Container__NameAssignment_2"
    // InternalEnvironment.g:1193:1: rule__Container__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Container__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:1197:1: ( ( ruleEString ) )
            // InternalEnvironment.g:1198:2: ( ruleEString )
            {
            // InternalEnvironment.g:1198:2: ( ruleEString )
            // InternalEnvironment.g:1199:3: ruleEString
            {
             before(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__NameAssignment_2"


    // $ANTLR start "rule__Link__NameAssignment_1"
    // InternalEnvironment.g:1208:1: rule__Link__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Link__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:1212:1: ( ( ruleEString ) )
            // InternalEnvironment.g:1213:2: ( ruleEString )
            {
            // InternalEnvironment.g:1213:2: ( ruleEString )
            // InternalEnvironment.g:1214:3: ruleEString
            {
             before(grammarAccess.getLinkAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__NameAssignment_1"


    // $ANTLR start "rule__Link__ContainerAssignment_5"
    // InternalEnvironment.g:1223:1: rule__Link__ContainerAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Link__ContainerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:1227:1: ( ( ( ruleEString ) ) )
            // InternalEnvironment.g:1228:2: ( ( ruleEString ) )
            {
            // InternalEnvironment.g:1228:2: ( ( ruleEString ) )
            // InternalEnvironment.g:1229:3: ( ruleEString )
            {
             before(grammarAccess.getLinkAccess().getContainerContainerCrossReference_5_0()); 
            // InternalEnvironment.g:1230:3: ( ruleEString )
            // InternalEnvironment.g:1231:4: ruleEString
            {
             before(grammarAccess.getLinkAccess().getContainerContainerEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getContainerContainerEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getLinkAccess().getContainerContainerCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__ContainerAssignment_5"


    // $ANTLR start "rule__Link__ContainerAssignment_6_1"
    // InternalEnvironment.g:1242:1: rule__Link__ContainerAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Link__ContainerAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironment.g:1246:1: ( ( ( ruleEString ) ) )
            // InternalEnvironment.g:1247:2: ( ( ruleEString ) )
            {
            // InternalEnvironment.g:1247:2: ( ( ruleEString ) )
            // InternalEnvironment.g:1248:3: ( ruleEString )
            {
             before(grammarAccess.getLinkAccess().getContainerContainerCrossReference_6_1_0()); 
            // InternalEnvironment.g:1249:3: ( ruleEString )
            // InternalEnvironment.g:1250:4: ruleEString
            {
             before(grammarAccess.getLinkAccess().getContainerContainerEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getContainerContainerEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getLinkAccess().getContainerContainerCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__ContainerAssignment_6_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002000L});

}