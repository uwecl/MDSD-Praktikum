package edu.kit.ipd.sdq.mdsdpc.mydsl.ide.contentassist.antlr.internal;

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
import edu.kit.ipd.sdq.mdsdpc.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'boolean'", "'char'", "'date'", "'double'", "'float'", "'list'", "'long'", "'map'", "'string'", "'ComponentBasedSystem'", "'{'", "'interface'", "'('", "')'", "'environment'", "'}'", "','", "'repository'", "'allocation'", "'assemblycontext'", "'type'", "'assemblyconnector'", "'Interface'", "'signature'", "'AssemblyContext'", "'component'", "'Type'", "'AssemblyConnector'", "'providedrole'", "'requiredrole'", "'Signature'", "'returntype'", "'parameter'", "'Parameter'", "'parametertype'", "'ReturnType'", "'ParameterType'", "'Simple'", "'kind'", "'Complex'", "'simple'", "'Void'", "'Component'", "'service'", "'behaviourdescription'", "'BehaviourDescription'", "'Service'", "'correspondingSignatures'", "'RequiredRole'", "'ProvidedRole'", "'CompositeComponent'", "'delegationconnector'", "'InternalAction'", "'ExternalCall'", "'Loop'", "'Branch'", "'DelegationConnector'", "'role'", "'Role'", "'Container'", "'Link'", "'container'", "'AllocationContext'"
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
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleComponentBasedSystem"
    // InternalMyDsl.g:53:1: entryRuleComponentBasedSystem : ruleComponentBasedSystem EOF ;
    public final void entryRuleComponentBasedSystem() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleComponentBasedSystem EOF )
            // InternalMyDsl.g:55:1: ruleComponentBasedSystem EOF
            {
             before(grammarAccess.getComponentBasedSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentBasedSystem();

            state._fsp--;

             after(grammarAccess.getComponentBasedSystemRule()); 
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
    // $ANTLR end "entryRuleComponentBasedSystem"


    // $ANTLR start "ruleComponentBasedSystem"
    // InternalMyDsl.g:62:1: ruleComponentBasedSystem : ( ( rule__ComponentBasedSystem__Group__0 ) ) ;
    public final void ruleComponentBasedSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__ComponentBasedSystem__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__ComponentBasedSystem__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__ComponentBasedSystem__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__ComponentBasedSystem__Group__0 )
            {
             before(grammarAccess.getComponentBasedSystemAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__ComponentBasedSystem__Group__0 )
            // InternalMyDsl.g:69:4: rule__ComponentBasedSystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentBasedSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentBasedSystem"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:78:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleType EOF )
            // InternalMyDsl.g:80:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:87:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Type__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Type__Alternatives )
            // InternalMyDsl.g:94:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleComponent"
    // InternalMyDsl.g:103:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleComponent EOF )
            // InternalMyDsl.g:105:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalMyDsl.g:112:1: ruleComponent : ( ( rule__Component__Alternatives ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Component__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Component__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Component__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__Component__Alternatives )
            {
             before(grammarAccess.getComponentAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__Component__Alternatives )
            // InternalMyDsl.g:119:4: rule__Component__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Component__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleBehaviourDescription"
    // InternalMyDsl.g:128:1: entryRuleBehaviourDescription : ruleBehaviourDescription EOF ;
    public final void entryRuleBehaviourDescription() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleBehaviourDescription EOF )
            // InternalMyDsl.g:130:1: ruleBehaviourDescription EOF
            {
             before(grammarAccess.getBehaviourDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleBehaviourDescription();

            state._fsp--;

             after(grammarAccess.getBehaviourDescriptionRule()); 
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
    // $ANTLR end "entryRuleBehaviourDescription"


    // $ANTLR start "ruleBehaviourDescription"
    // InternalMyDsl.g:137:1: ruleBehaviourDescription : ( ( rule__BehaviourDescription__Alternatives ) ) ;
    public final void ruleBehaviourDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__BehaviourDescription__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__BehaviourDescription__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__BehaviourDescription__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__BehaviourDescription__Alternatives )
            {
             before(grammarAccess.getBehaviourDescriptionAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__BehaviourDescription__Alternatives )
            // InternalMyDsl.g:144:4: rule__BehaviourDescription__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BehaviourDescription__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBehaviourDescriptionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBehaviourDescription"


    // $ANTLR start "entryRuleInterface"
    // InternalMyDsl.g:153:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleInterface EOF )
            // InternalMyDsl.g:155:1: ruleInterface EOF
            {
             before(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_1);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getInterfaceRule()); 
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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalMyDsl.g:162:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Interface__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Interface__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Interface__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Interface__Group__0 )
            {
             before(grammarAccess.getInterfaceAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Interface__Group__0 )
            // InternalMyDsl.g:169:4: rule__Interface__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleAssemblyContext"
    // InternalMyDsl.g:178:1: entryRuleAssemblyContext : ruleAssemblyContext EOF ;
    public final void entryRuleAssemblyContext() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleAssemblyContext EOF )
            // InternalMyDsl.g:180:1: ruleAssemblyContext EOF
            {
             before(grammarAccess.getAssemblyContextRule()); 
            pushFollow(FOLLOW_1);
            ruleAssemblyContext();

            state._fsp--;

             after(grammarAccess.getAssemblyContextRule()); 
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
    // $ANTLR end "entryRuleAssemblyContext"


    // $ANTLR start "ruleAssemblyContext"
    // InternalMyDsl.g:187:1: ruleAssemblyContext : ( ( rule__AssemblyContext__Group__0 ) ) ;
    public final void ruleAssemblyContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__AssemblyContext__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__AssemblyContext__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__AssemblyContext__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__AssemblyContext__Group__0 )
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__AssemblyContext__Group__0 )
            // InternalMyDsl.g:194:4: rule__AssemblyContext__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssemblyContext"


    // $ANTLR start "entryRuleType_Impl"
    // InternalMyDsl.g:203:1: entryRuleType_Impl : ruleType_Impl EOF ;
    public final void entryRuleType_Impl() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleType_Impl EOF )
            // InternalMyDsl.g:205:1: ruleType_Impl EOF
            {
             before(grammarAccess.getType_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleType_Impl();

            state._fsp--;

             after(grammarAccess.getType_ImplRule()); 
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
    // $ANTLR end "entryRuleType_Impl"


    // $ANTLR start "ruleType_Impl"
    // InternalMyDsl.g:212:1: ruleType_Impl : ( ( rule__Type_Impl__Group__0 ) ) ;
    public final void ruleType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Type_Impl__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Type_Impl__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Type_Impl__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Type_Impl__Group__0 )
            {
             before(grammarAccess.getType_ImplAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Type_Impl__Group__0 )
            // InternalMyDsl.g:219:4: rule__Type_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getType_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType_Impl"


    // $ANTLR start "entryRuleAssemblyConnector"
    // InternalMyDsl.g:228:1: entryRuleAssemblyConnector : ruleAssemblyConnector EOF ;
    public final void entryRuleAssemblyConnector() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleAssemblyConnector EOF )
            // InternalMyDsl.g:230:1: ruleAssemblyConnector EOF
            {
             before(grammarAccess.getAssemblyConnectorRule()); 
            pushFollow(FOLLOW_1);
            ruleAssemblyConnector();

            state._fsp--;

             after(grammarAccess.getAssemblyConnectorRule()); 
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
    // $ANTLR end "entryRuleAssemblyConnector"


    // $ANTLR start "ruleAssemblyConnector"
    // InternalMyDsl.g:237:1: ruleAssemblyConnector : ( ( rule__AssemblyConnector__Group__0 ) ) ;
    public final void ruleAssemblyConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__AssemblyConnector__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__AssemblyConnector__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__AssemblyConnector__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__AssemblyConnector__Group__0 )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__AssemblyConnector__Group__0 )
            // InternalMyDsl.g:244:4: rule__AssemblyConnector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyConnectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssemblyConnector"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:253:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleEString EOF )
            // InternalMyDsl.g:255:1: ruleEString EOF
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
    // InternalMyDsl.g:262:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:268:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:269:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:269:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleSignature"
    // InternalMyDsl.g:278:1: entryRuleSignature : ruleSignature EOF ;
    public final void entryRuleSignature() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleSignature EOF )
            // InternalMyDsl.g:280:1: ruleSignature EOF
            {
             before(grammarAccess.getSignatureRule()); 
            pushFollow(FOLLOW_1);
            ruleSignature();

            state._fsp--;

             after(grammarAccess.getSignatureRule()); 
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
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // InternalMyDsl.g:287:1: ruleSignature : ( ( rule__Signature__Group__0 ) ) ;
    public final void ruleSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Signature__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Signature__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Signature__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Signature__Group__0 )
            {
             before(grammarAccess.getSignatureAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Signature__Group__0 )
            // InternalMyDsl.g:294:4: rule__Signature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleParameter"
    // InternalMyDsl.g:303:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleParameter EOF )
            // InternalMyDsl.g:305:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalMyDsl.g:312:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Parameter__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Parameter__Group__0 )
            // InternalMyDsl.g:319:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleReturnType_Impl"
    // InternalMyDsl.g:328:1: entryRuleReturnType_Impl : ruleReturnType_Impl EOF ;
    public final void entryRuleReturnType_Impl() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleReturnType_Impl EOF )
            // InternalMyDsl.g:330:1: ruleReturnType_Impl EOF
            {
             before(grammarAccess.getReturnType_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleReturnType_Impl();

            state._fsp--;

             after(grammarAccess.getReturnType_ImplRule()); 
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
    // $ANTLR end "entryRuleReturnType_Impl"


    // $ANTLR start "ruleReturnType_Impl"
    // InternalMyDsl.g:337:1: ruleReturnType_Impl : ( ( rule__ReturnType_Impl__Group__0 ) ) ;
    public final void ruleReturnType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__ReturnType_Impl__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__ReturnType_Impl__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__ReturnType_Impl__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__ReturnType_Impl__Group__0 )
            {
             before(grammarAccess.getReturnType_ImplAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__ReturnType_Impl__Group__0 )
            // InternalMyDsl.g:344:4: rule__ReturnType_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReturnType_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReturnType_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReturnType_Impl"


    // $ANTLR start "entryRuleParameterType_Impl"
    // InternalMyDsl.g:353:1: entryRuleParameterType_Impl : ruleParameterType_Impl EOF ;
    public final void entryRuleParameterType_Impl() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleParameterType_Impl EOF )
            // InternalMyDsl.g:355:1: ruleParameterType_Impl EOF
            {
             before(grammarAccess.getParameterType_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterType_Impl();

            state._fsp--;

             after(grammarAccess.getParameterType_ImplRule()); 
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
    // $ANTLR end "entryRuleParameterType_Impl"


    // $ANTLR start "ruleParameterType_Impl"
    // InternalMyDsl.g:362:1: ruleParameterType_Impl : ( ( rule__ParameterType_Impl__Group__0 ) ) ;
    public final void ruleParameterType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__ParameterType_Impl__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__ParameterType_Impl__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__ParameterType_Impl__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__ParameterType_Impl__Group__0 )
            {
             before(grammarAccess.getParameterType_ImplAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__ParameterType_Impl__Group__0 )
            // InternalMyDsl.g:369:4: rule__ParameterType_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterType_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterType_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterType_Impl"


    // $ANTLR start "entryRuleSimple"
    // InternalMyDsl.g:378:1: entryRuleSimple : ruleSimple EOF ;
    public final void entryRuleSimple() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleSimple EOF )
            // InternalMyDsl.g:380:1: ruleSimple EOF
            {
             before(grammarAccess.getSimpleRule()); 
            pushFollow(FOLLOW_1);
            ruleSimple();

            state._fsp--;

             after(grammarAccess.getSimpleRule()); 
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
    // $ANTLR end "entryRuleSimple"


    // $ANTLR start "ruleSimple"
    // InternalMyDsl.g:387:1: ruleSimple : ( ( rule__Simple__Group__0 ) ) ;
    public final void ruleSimple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__Simple__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__Simple__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__Simple__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__Simple__Group__0 )
            {
             before(grammarAccess.getSimpleAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__Simple__Group__0 )
            // InternalMyDsl.g:394:4: rule__Simple__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Simple__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimple"


    // $ANTLR start "entryRuleComplex"
    // InternalMyDsl.g:403:1: entryRuleComplex : ruleComplex EOF ;
    public final void entryRuleComplex() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleComplex EOF )
            // InternalMyDsl.g:405:1: ruleComplex EOF
            {
             before(grammarAccess.getComplexRule()); 
            pushFollow(FOLLOW_1);
            ruleComplex();

            state._fsp--;

             after(grammarAccess.getComplexRule()); 
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
    // $ANTLR end "entryRuleComplex"


    // $ANTLR start "ruleComplex"
    // InternalMyDsl.g:412:1: ruleComplex : ( ( rule__Complex__Group__0 ) ) ;
    public final void ruleComplex() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__Complex__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__Complex__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__Complex__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__Complex__Group__0 )
            {
             before(grammarAccess.getComplexAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__Complex__Group__0 )
            // InternalMyDsl.g:419:4: rule__Complex__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Complex__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComplexAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplex"


    // $ANTLR start "entryRuleVoid"
    // InternalMyDsl.g:428:1: entryRuleVoid : ruleVoid EOF ;
    public final void entryRuleVoid() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleVoid EOF )
            // InternalMyDsl.g:430:1: ruleVoid EOF
            {
             before(grammarAccess.getVoidRule()); 
            pushFollow(FOLLOW_1);
            ruleVoid();

            state._fsp--;

             after(grammarAccess.getVoidRule()); 
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
    // $ANTLR end "entryRuleVoid"


    // $ANTLR start "ruleVoid"
    // InternalMyDsl.g:437:1: ruleVoid : ( ( rule__Void__Group__0 ) ) ;
    public final void ruleVoid() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__Void__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__Void__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__Void__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__Void__Group__0 )
            {
             before(grammarAccess.getVoidAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__Void__Group__0 )
            // InternalMyDsl.g:444:4: rule__Void__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Void__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVoidAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVoid"


    // $ANTLR start "entryRuleComponent_Impl"
    // InternalMyDsl.g:453:1: entryRuleComponent_Impl : ruleComponent_Impl EOF ;
    public final void entryRuleComponent_Impl() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleComponent_Impl EOF )
            // InternalMyDsl.g:455:1: ruleComponent_Impl EOF
            {
             before(grammarAccess.getComponent_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent_Impl();

            state._fsp--;

             after(grammarAccess.getComponent_ImplRule()); 
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
    // $ANTLR end "entryRuleComponent_Impl"


    // $ANTLR start "ruleComponent_Impl"
    // InternalMyDsl.g:462:1: ruleComponent_Impl : ( ( rule__Component_Impl__Group__0 ) ) ;
    public final void ruleComponent_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__Component_Impl__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__Component_Impl__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__Component_Impl__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__Component_Impl__Group__0 )
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__Component_Impl__Group__0 )
            // InternalMyDsl.g:469:4: rule__Component_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent_Impl"


    // $ANTLR start "entryRuleBehaviourDescription_Impl"
    // InternalMyDsl.g:478:1: entryRuleBehaviourDescription_Impl : ruleBehaviourDescription_Impl EOF ;
    public final void entryRuleBehaviourDescription_Impl() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleBehaviourDescription_Impl EOF )
            // InternalMyDsl.g:480:1: ruleBehaviourDescription_Impl EOF
            {
             before(grammarAccess.getBehaviourDescription_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleBehaviourDescription_Impl();

            state._fsp--;

             after(grammarAccess.getBehaviourDescription_ImplRule()); 
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
    // $ANTLR end "entryRuleBehaviourDescription_Impl"


    // $ANTLR start "ruleBehaviourDescription_Impl"
    // InternalMyDsl.g:487:1: ruleBehaviourDescription_Impl : ( ( rule__BehaviourDescription_Impl__Group__0 ) ) ;
    public final void ruleBehaviourDescription_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__BehaviourDescription_Impl__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__BehaviourDescription_Impl__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__BehaviourDescription_Impl__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__BehaviourDescription_Impl__Group__0 )
            {
             before(grammarAccess.getBehaviourDescription_ImplAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__BehaviourDescription_Impl__Group__0 )
            // InternalMyDsl.g:494:4: rule__BehaviourDescription_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BehaviourDescription_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBehaviourDescription_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBehaviourDescription_Impl"


    // $ANTLR start "entryRuleService"
    // InternalMyDsl.g:503:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleService EOF )
            // InternalMyDsl.g:505:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalMyDsl.g:512:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__Service__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__Service__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__Service__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__Service__Group__0 )
            // InternalMyDsl.g:519:4: rule__Service__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleRequiredRole"
    // InternalMyDsl.g:528:1: entryRuleRequiredRole : ruleRequiredRole EOF ;
    public final void entryRuleRequiredRole() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleRequiredRole EOF )
            // InternalMyDsl.g:530:1: ruleRequiredRole EOF
            {
             before(grammarAccess.getRequiredRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleRequiredRole();

            state._fsp--;

             after(grammarAccess.getRequiredRoleRule()); 
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
    // $ANTLR end "entryRuleRequiredRole"


    // $ANTLR start "ruleRequiredRole"
    // InternalMyDsl.g:537:1: ruleRequiredRole : ( ( rule__RequiredRole__Group__0 ) ) ;
    public final void ruleRequiredRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__RequiredRole__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__RequiredRole__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__RequiredRole__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__RequiredRole__Group__0 )
            {
             before(grammarAccess.getRequiredRoleAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__RequiredRole__Group__0 )
            // InternalMyDsl.g:544:4: rule__RequiredRole__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RequiredRole__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequiredRoleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequiredRole"


    // $ANTLR start "entryRuleProvidedRole"
    // InternalMyDsl.g:553:1: entryRuleProvidedRole : ruleProvidedRole EOF ;
    public final void entryRuleProvidedRole() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleProvidedRole EOF )
            // InternalMyDsl.g:555:1: ruleProvidedRole EOF
            {
             before(grammarAccess.getProvidedRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleProvidedRole();

            state._fsp--;

             after(grammarAccess.getProvidedRoleRule()); 
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
    // $ANTLR end "entryRuleProvidedRole"


    // $ANTLR start "ruleProvidedRole"
    // InternalMyDsl.g:562:1: ruleProvidedRole : ( ( rule__ProvidedRole__Group__0 ) ) ;
    public final void ruleProvidedRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__ProvidedRole__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__ProvidedRole__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__ProvidedRole__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__ProvidedRole__Group__0 )
            {
             before(grammarAccess.getProvidedRoleAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__ProvidedRole__Group__0 )
            // InternalMyDsl.g:569:4: rule__ProvidedRole__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProvidedRole__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProvidedRoleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProvidedRole"


    // $ANTLR start "entryRuleCompositeComponent"
    // InternalMyDsl.g:578:1: entryRuleCompositeComponent : ruleCompositeComponent EOF ;
    public final void entryRuleCompositeComponent() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleCompositeComponent EOF )
            // InternalMyDsl.g:580:1: ruleCompositeComponent EOF
            {
             before(grammarAccess.getCompositeComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositeComponent();

            state._fsp--;

             after(grammarAccess.getCompositeComponentRule()); 
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
    // $ANTLR end "entryRuleCompositeComponent"


    // $ANTLR start "ruleCompositeComponent"
    // InternalMyDsl.g:587:1: ruleCompositeComponent : ( ( rule__CompositeComponent__Group__0 ) ) ;
    public final void ruleCompositeComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__CompositeComponent__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__CompositeComponent__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__CompositeComponent__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__CompositeComponent__Group__0 )
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__CompositeComponent__Group__0 )
            // InternalMyDsl.g:594:4: rule__CompositeComponent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositeComponent"


    // $ANTLR start "entryRuleInternalAction"
    // InternalMyDsl.g:603:1: entryRuleInternalAction : ruleInternalAction EOF ;
    public final void entryRuleInternalAction() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleInternalAction EOF )
            // InternalMyDsl.g:605:1: ruleInternalAction EOF
            {
             before(grammarAccess.getInternalActionRule()); 
            pushFollow(FOLLOW_1);
            ruleInternalAction();

            state._fsp--;

             after(grammarAccess.getInternalActionRule()); 
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
    // $ANTLR end "entryRuleInternalAction"


    // $ANTLR start "ruleInternalAction"
    // InternalMyDsl.g:612:1: ruleInternalAction : ( ( rule__InternalAction__Group__0 ) ) ;
    public final void ruleInternalAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__InternalAction__Group__0 ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__InternalAction__Group__0 ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__InternalAction__Group__0 ) )
            // InternalMyDsl.g:618:3: ( rule__InternalAction__Group__0 )
            {
             before(grammarAccess.getInternalActionAccess().getGroup()); 
            // InternalMyDsl.g:619:3: ( rule__InternalAction__Group__0 )
            // InternalMyDsl.g:619:4: rule__InternalAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InternalAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInternalActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInternalAction"


    // $ANTLR start "entryRuleExternalCall"
    // InternalMyDsl.g:628:1: entryRuleExternalCall : ruleExternalCall EOF ;
    public final void entryRuleExternalCall() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleExternalCall EOF )
            // InternalMyDsl.g:630:1: ruleExternalCall EOF
            {
             before(grammarAccess.getExternalCallRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalCall();

            state._fsp--;

             after(grammarAccess.getExternalCallRule()); 
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
    // $ANTLR end "entryRuleExternalCall"


    // $ANTLR start "ruleExternalCall"
    // InternalMyDsl.g:637:1: ruleExternalCall : ( ( rule__ExternalCall__Group__0 ) ) ;
    public final void ruleExternalCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__ExternalCall__Group__0 ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__ExternalCall__Group__0 ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__ExternalCall__Group__0 ) )
            // InternalMyDsl.g:643:3: ( rule__ExternalCall__Group__0 )
            {
             before(grammarAccess.getExternalCallAccess().getGroup()); 
            // InternalMyDsl.g:644:3: ( rule__ExternalCall__Group__0 )
            // InternalMyDsl.g:644:4: rule__ExternalCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalCall"


    // $ANTLR start "entryRuleLoop"
    // InternalMyDsl.g:653:1: entryRuleLoop : ruleLoop EOF ;
    public final void entryRuleLoop() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleLoop EOF )
            // InternalMyDsl.g:655:1: ruleLoop EOF
            {
             before(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            ruleLoop();

            state._fsp--;

             after(grammarAccess.getLoopRule()); 
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
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalMyDsl.g:662:1: ruleLoop : ( ( rule__Loop__Group__0 ) ) ;
    public final void ruleLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__Loop__Group__0 ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__Loop__Group__0 ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__Loop__Group__0 ) )
            // InternalMyDsl.g:668:3: ( rule__Loop__Group__0 )
            {
             before(grammarAccess.getLoopAccess().getGroup()); 
            // InternalMyDsl.g:669:3: ( rule__Loop__Group__0 )
            // InternalMyDsl.g:669:4: rule__Loop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleBranch"
    // InternalMyDsl.g:678:1: entryRuleBranch : ruleBranch EOF ;
    public final void entryRuleBranch() throws RecognitionException {
        try {
            // InternalMyDsl.g:679:1: ( ruleBranch EOF )
            // InternalMyDsl.g:680:1: ruleBranch EOF
            {
             before(grammarAccess.getBranchRule()); 
            pushFollow(FOLLOW_1);
            ruleBranch();

            state._fsp--;

             after(grammarAccess.getBranchRule()); 
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
    // $ANTLR end "entryRuleBranch"


    // $ANTLR start "ruleBranch"
    // InternalMyDsl.g:687:1: ruleBranch : ( ( rule__Branch__Group__0 ) ) ;
    public final void ruleBranch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:2: ( ( ( rule__Branch__Group__0 ) ) )
            // InternalMyDsl.g:692:2: ( ( rule__Branch__Group__0 ) )
            {
            // InternalMyDsl.g:692:2: ( ( rule__Branch__Group__0 ) )
            // InternalMyDsl.g:693:3: ( rule__Branch__Group__0 )
            {
             before(grammarAccess.getBranchAccess().getGroup()); 
            // InternalMyDsl.g:694:3: ( rule__Branch__Group__0 )
            // InternalMyDsl.g:694:4: rule__Branch__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Branch__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBranchAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBranch"


    // $ANTLR start "entryRuleDelegationConnector"
    // InternalMyDsl.g:703:1: entryRuleDelegationConnector : ruleDelegationConnector EOF ;
    public final void entryRuleDelegationConnector() throws RecognitionException {
        try {
            // InternalMyDsl.g:704:1: ( ruleDelegationConnector EOF )
            // InternalMyDsl.g:705:1: ruleDelegationConnector EOF
            {
             before(grammarAccess.getDelegationConnectorRule()); 
            pushFollow(FOLLOW_1);
            ruleDelegationConnector();

            state._fsp--;

             after(grammarAccess.getDelegationConnectorRule()); 
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
    // $ANTLR end "entryRuleDelegationConnector"


    // $ANTLR start "ruleDelegationConnector"
    // InternalMyDsl.g:712:1: ruleDelegationConnector : ( ( rule__DelegationConnector__Group__0 ) ) ;
    public final void ruleDelegationConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:2: ( ( ( rule__DelegationConnector__Group__0 ) ) )
            // InternalMyDsl.g:717:2: ( ( rule__DelegationConnector__Group__0 ) )
            {
            // InternalMyDsl.g:717:2: ( ( rule__DelegationConnector__Group__0 ) )
            // InternalMyDsl.g:718:3: ( rule__DelegationConnector__Group__0 )
            {
             before(grammarAccess.getDelegationConnectorAccess().getGroup()); 
            // InternalMyDsl.g:719:3: ( rule__DelegationConnector__Group__0 )
            // InternalMyDsl.g:719:4: rule__DelegationConnector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDelegationConnectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDelegationConnector"


    // $ANTLR start "entryRuleRole_Impl"
    // InternalMyDsl.g:728:1: entryRuleRole_Impl : ruleRole_Impl EOF ;
    public final void entryRuleRole_Impl() throws RecognitionException {
        try {
            // InternalMyDsl.g:729:1: ( ruleRole_Impl EOF )
            // InternalMyDsl.g:730:1: ruleRole_Impl EOF
            {
             before(grammarAccess.getRole_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleRole_Impl();

            state._fsp--;

             after(grammarAccess.getRole_ImplRule()); 
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
    // $ANTLR end "entryRuleRole_Impl"


    // $ANTLR start "ruleRole_Impl"
    // InternalMyDsl.g:737:1: ruleRole_Impl : ( ( rule__Role_Impl__Group__0 ) ) ;
    public final void ruleRole_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:741:2: ( ( ( rule__Role_Impl__Group__0 ) ) )
            // InternalMyDsl.g:742:2: ( ( rule__Role_Impl__Group__0 ) )
            {
            // InternalMyDsl.g:742:2: ( ( rule__Role_Impl__Group__0 ) )
            // InternalMyDsl.g:743:3: ( rule__Role_Impl__Group__0 )
            {
             before(grammarAccess.getRole_ImplAccess().getGroup()); 
            // InternalMyDsl.g:744:3: ( rule__Role_Impl__Group__0 )
            // InternalMyDsl.g:744:4: rule__Role_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Role_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRole_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRole_Impl"


    // $ANTLR start "entryRuleContainer"
    // InternalMyDsl.g:753:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // InternalMyDsl.g:754:1: ( ruleContainer EOF )
            // InternalMyDsl.g:755:1: ruleContainer EOF
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
    // InternalMyDsl.g:762:1: ruleContainer : ( ( rule__Container__Group__0 ) ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:766:2: ( ( ( rule__Container__Group__0 ) ) )
            // InternalMyDsl.g:767:2: ( ( rule__Container__Group__0 ) )
            {
            // InternalMyDsl.g:767:2: ( ( rule__Container__Group__0 ) )
            // InternalMyDsl.g:768:3: ( rule__Container__Group__0 )
            {
             before(grammarAccess.getContainerAccess().getGroup()); 
            // InternalMyDsl.g:769:3: ( rule__Container__Group__0 )
            // InternalMyDsl.g:769:4: rule__Container__Group__0
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
    // InternalMyDsl.g:778:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalMyDsl.g:779:1: ( ruleLink EOF )
            // InternalMyDsl.g:780:1: ruleLink EOF
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
    // InternalMyDsl.g:787:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:791:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalMyDsl.g:792:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalMyDsl.g:792:2: ( ( rule__Link__Group__0 ) )
            // InternalMyDsl.g:793:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalMyDsl.g:794:3: ( rule__Link__Group__0 )
            // InternalMyDsl.g:794:4: rule__Link__Group__0
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


    // $ANTLR start "entryRuleAllocationContext"
    // InternalMyDsl.g:803:1: entryRuleAllocationContext : ruleAllocationContext EOF ;
    public final void entryRuleAllocationContext() throws RecognitionException {
        try {
            // InternalMyDsl.g:804:1: ( ruleAllocationContext EOF )
            // InternalMyDsl.g:805:1: ruleAllocationContext EOF
            {
             before(grammarAccess.getAllocationContextRule()); 
            pushFollow(FOLLOW_1);
            ruleAllocationContext();

            state._fsp--;

             after(grammarAccess.getAllocationContextRule()); 
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
    // $ANTLR end "entryRuleAllocationContext"


    // $ANTLR start "ruleAllocationContext"
    // InternalMyDsl.g:812:1: ruleAllocationContext : ( ( rule__AllocationContext__Group__0 ) ) ;
    public final void ruleAllocationContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:816:2: ( ( ( rule__AllocationContext__Group__0 ) ) )
            // InternalMyDsl.g:817:2: ( ( rule__AllocationContext__Group__0 ) )
            {
            // InternalMyDsl.g:817:2: ( ( rule__AllocationContext__Group__0 ) )
            // InternalMyDsl.g:818:3: ( rule__AllocationContext__Group__0 )
            {
             before(grammarAccess.getAllocationContextAccess().getGroup()); 
            // InternalMyDsl.g:819:3: ( rule__AllocationContext__Group__0 )
            // InternalMyDsl.g:819:4: rule__AllocationContext__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllocationContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAllocationContext"


    // $ANTLR start "rulesimpleTypes"
    // InternalMyDsl.g:828:1: rulesimpleTypes : ( ( rule__SimpleTypes__Alternatives ) ) ;
    public final void rulesimpleTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:832:1: ( ( ( rule__SimpleTypes__Alternatives ) ) )
            // InternalMyDsl.g:833:2: ( ( rule__SimpleTypes__Alternatives ) )
            {
            // InternalMyDsl.g:833:2: ( ( rule__SimpleTypes__Alternatives ) )
            // InternalMyDsl.g:834:3: ( rule__SimpleTypes__Alternatives )
            {
             before(grammarAccess.getSimpleTypesAccess().getAlternatives()); 
            // InternalMyDsl.g:835:3: ( rule__SimpleTypes__Alternatives )
            // InternalMyDsl.g:835:4: rule__SimpleTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SimpleTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesimpleTypes"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMyDsl.g:843:1: rule__Type__Alternatives : ( ( ruleType_Impl ) | ( ruleSimple ) | ( ruleComplex ) | ( ruleParameterType_Impl ) | ( ruleVoid ) | ( ruleReturnType_Impl ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:847:1: ( ( ruleType_Impl ) | ( ruleSimple ) | ( ruleComplex ) | ( ruleParameterType_Impl ) | ( ruleVoid ) | ( ruleReturnType_Impl ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt1=1;
                }
                break;
            case 49:
                {
                alt1=2;
                }
                break;
            case 51:
                {
                alt1=3;
                }
                break;
            case 48:
                {
                alt1=4;
                }
                break;
            case 53:
                {
                alt1=5;
                }
                break;
            case 47:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:848:2: ( ruleType_Impl )
                    {
                    // InternalMyDsl.g:848:2: ( ruleType_Impl )
                    // InternalMyDsl.g:849:3: ruleType_Impl
                    {
                     before(grammarAccess.getTypeAccess().getType_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleType_Impl();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getType_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:854:2: ( ruleSimple )
                    {
                    // InternalMyDsl.g:854:2: ( ruleSimple )
                    // InternalMyDsl.g:855:3: ruleSimple
                    {
                     before(grammarAccess.getTypeAccess().getSimpleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSimple();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getSimpleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:860:2: ( ruleComplex )
                    {
                    // InternalMyDsl.g:860:2: ( ruleComplex )
                    // InternalMyDsl.g:861:3: ruleComplex
                    {
                     before(grammarAccess.getTypeAccess().getComplexParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleComplex();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getComplexParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:866:2: ( ruleParameterType_Impl )
                    {
                    // InternalMyDsl.g:866:2: ( ruleParameterType_Impl )
                    // InternalMyDsl.g:867:3: ruleParameterType_Impl
                    {
                     before(grammarAccess.getTypeAccess().getParameterType_ImplParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterType_Impl();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getParameterType_ImplParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:872:2: ( ruleVoid )
                    {
                    // InternalMyDsl.g:872:2: ( ruleVoid )
                    // InternalMyDsl.g:873:3: ruleVoid
                    {
                     before(grammarAccess.getTypeAccess().getVoidParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleVoid();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getVoidParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:878:2: ( ruleReturnType_Impl )
                    {
                    // InternalMyDsl.g:878:2: ( ruleReturnType_Impl )
                    // InternalMyDsl.g:879:3: ruleReturnType_Impl
                    {
                     before(grammarAccess.getTypeAccess().getReturnType_ImplParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleReturnType_Impl();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getReturnType_ImplParserRuleCall_5()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Component__Alternatives"
    // InternalMyDsl.g:888:1: rule__Component__Alternatives : ( ( ruleComponent_Impl ) | ( ruleCompositeComponent ) );
    public final void rule__Component__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:892:1: ( ( ruleComponent_Impl ) | ( ruleCompositeComponent ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==54) ) {
                alt2=1;
            }
            else if ( (LA2_0==62) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:893:2: ( ruleComponent_Impl )
                    {
                    // InternalMyDsl.g:893:2: ( ruleComponent_Impl )
                    // InternalMyDsl.g:894:3: ruleComponent_Impl
                    {
                     before(grammarAccess.getComponentAccess().getComponent_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleComponent_Impl();

                    state._fsp--;

                     after(grammarAccess.getComponentAccess().getComponent_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:899:2: ( ruleCompositeComponent )
                    {
                    // InternalMyDsl.g:899:2: ( ruleCompositeComponent )
                    // InternalMyDsl.g:900:3: ruleCompositeComponent
                    {
                     before(grammarAccess.getComponentAccess().getCompositeComponentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCompositeComponent();

                    state._fsp--;

                     after(grammarAccess.getComponentAccess().getCompositeComponentParserRuleCall_1()); 

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
    // $ANTLR end "rule__Component__Alternatives"


    // $ANTLR start "rule__BehaviourDescription__Alternatives"
    // InternalMyDsl.g:909:1: rule__BehaviourDescription__Alternatives : ( ( ruleBehaviourDescription_Impl ) | ( ruleInternalAction ) | ( ruleExternalCall ) | ( ruleLoop ) | ( ruleBranch ) );
    public final void rule__BehaviourDescription__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:913:1: ( ( ruleBehaviourDescription_Impl ) | ( ruleInternalAction ) | ( ruleExternalCall ) | ( ruleLoop ) | ( ruleBranch ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt3=1;
                }
                break;
            case 64:
                {
                alt3=2;
                }
                break;
            case 65:
                {
                alt3=3;
                }
                break;
            case 66:
                {
                alt3=4;
                }
                break;
            case 67:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:914:2: ( ruleBehaviourDescription_Impl )
                    {
                    // InternalMyDsl.g:914:2: ( ruleBehaviourDescription_Impl )
                    // InternalMyDsl.g:915:3: ruleBehaviourDescription_Impl
                    {
                     before(grammarAccess.getBehaviourDescriptionAccess().getBehaviourDescription_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBehaviourDescription_Impl();

                    state._fsp--;

                     after(grammarAccess.getBehaviourDescriptionAccess().getBehaviourDescription_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:920:2: ( ruleInternalAction )
                    {
                    // InternalMyDsl.g:920:2: ( ruleInternalAction )
                    // InternalMyDsl.g:921:3: ruleInternalAction
                    {
                     before(grammarAccess.getBehaviourDescriptionAccess().getInternalActionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInternalAction();

                    state._fsp--;

                     after(grammarAccess.getBehaviourDescriptionAccess().getInternalActionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:926:2: ( ruleExternalCall )
                    {
                    // InternalMyDsl.g:926:2: ( ruleExternalCall )
                    // InternalMyDsl.g:927:3: ruleExternalCall
                    {
                     before(grammarAccess.getBehaviourDescriptionAccess().getExternalCallParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleExternalCall();

                    state._fsp--;

                     after(grammarAccess.getBehaviourDescriptionAccess().getExternalCallParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:932:2: ( ruleLoop )
                    {
                    // InternalMyDsl.g:932:2: ( ruleLoop )
                    // InternalMyDsl.g:933:3: ruleLoop
                    {
                     before(grammarAccess.getBehaviourDescriptionAccess().getLoopParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLoop();

                    state._fsp--;

                     after(grammarAccess.getBehaviourDescriptionAccess().getLoopParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:938:2: ( ruleBranch )
                    {
                    // InternalMyDsl.g:938:2: ( ruleBranch )
                    // InternalMyDsl.g:939:3: ruleBranch
                    {
                     before(grammarAccess.getBehaviourDescriptionAccess().getBranchParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleBranch();

                    state._fsp--;

                     after(grammarAccess.getBehaviourDescriptionAccess().getBranchParserRuleCall_4()); 

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
    // $ANTLR end "rule__BehaviourDescription__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:948:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:952:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalMyDsl.g:953:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:953:2: ( RULE_STRING )
                    // InternalMyDsl.g:954:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:959:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:959:2: ( RULE_ID )
                    // InternalMyDsl.g:960:3: RULE_ID
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


    // $ANTLR start "rule__SimpleTypes__Alternatives"
    // InternalMyDsl.g:969:1: rule__SimpleTypes__Alternatives : ( ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'char' ) ) | ( ( 'date' ) ) | ( ( 'double' ) ) | ( ( 'float' ) ) | ( ( 'list' ) ) | ( ( 'long' ) ) | ( ( 'map' ) ) | ( ( 'string' ) ) );
    public final void rule__SimpleTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:973:1: ( ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'char' ) ) | ( ( 'date' ) ) | ( ( 'double' ) ) | ( ( 'float' ) ) | ( ( 'list' ) ) | ( ( 'long' ) ) | ( ( 'map' ) ) | ( ( 'string' ) ) )
            int alt5=10;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            case 14:
                {
                alt5=4;
                }
                break;
            case 15:
                {
                alt5=5;
                }
                break;
            case 16:
                {
                alt5=6;
                }
                break;
            case 17:
                {
                alt5=7;
                }
                break;
            case 18:
                {
                alt5=8;
                }
                break;
            case 19:
                {
                alt5=9;
                }
                break;
            case 20:
                {
                alt5=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:974:2: ( ( 'int' ) )
                    {
                    // InternalMyDsl.g:974:2: ( ( 'int' ) )
                    // InternalMyDsl.g:975:3: ( 'int' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getIntEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:976:3: ( 'int' )
                    // InternalMyDsl.g:976:4: 'int'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getIntEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:980:2: ( ( 'boolean' ) )
                    {
                    // InternalMyDsl.g:980:2: ( ( 'boolean' ) )
                    // InternalMyDsl.g:981:3: ( 'boolean' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getBooleanEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:982:3: ( 'boolean' )
                    // InternalMyDsl.g:982:4: 'boolean'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getBooleanEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:986:2: ( ( 'char' ) )
                    {
                    // InternalMyDsl.g:986:2: ( ( 'char' ) )
                    // InternalMyDsl.g:987:3: ( 'char' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getCharEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:988:3: ( 'char' )
                    // InternalMyDsl.g:988:4: 'char'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getCharEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:992:2: ( ( 'date' ) )
                    {
                    // InternalMyDsl.g:992:2: ( ( 'date' ) )
                    // InternalMyDsl.g:993:3: ( 'date' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getDateEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:994:3: ( 'date' )
                    // InternalMyDsl.g:994:4: 'date'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getDateEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:998:2: ( ( 'double' ) )
                    {
                    // InternalMyDsl.g:998:2: ( ( 'double' ) )
                    // InternalMyDsl.g:999:3: ( 'double' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getDoubleEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:1000:3: ( 'double' )
                    // InternalMyDsl.g:1000:4: 'double'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getDoubleEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1004:2: ( ( 'float' ) )
                    {
                    // InternalMyDsl.g:1004:2: ( ( 'float' ) )
                    // InternalMyDsl.g:1005:3: ( 'float' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getFloatEnumLiteralDeclaration_5()); 
                    // InternalMyDsl.g:1006:3: ( 'float' )
                    // InternalMyDsl.g:1006:4: 'float'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getFloatEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1010:2: ( ( 'list' ) )
                    {
                    // InternalMyDsl.g:1010:2: ( ( 'list' ) )
                    // InternalMyDsl.g:1011:3: ( 'list' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getListEnumLiteralDeclaration_6()); 
                    // InternalMyDsl.g:1012:3: ( 'list' )
                    // InternalMyDsl.g:1012:4: 'list'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getListEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1016:2: ( ( 'long' ) )
                    {
                    // InternalMyDsl.g:1016:2: ( ( 'long' ) )
                    // InternalMyDsl.g:1017:3: ( 'long' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getLongEnumLiteralDeclaration_7()); 
                    // InternalMyDsl.g:1018:3: ( 'long' )
                    // InternalMyDsl.g:1018:4: 'long'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getLongEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:1022:2: ( ( 'map' ) )
                    {
                    // InternalMyDsl.g:1022:2: ( ( 'map' ) )
                    // InternalMyDsl.g:1023:3: ( 'map' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getMapEnumLiteralDeclaration_8()); 
                    // InternalMyDsl.g:1024:3: ( 'map' )
                    // InternalMyDsl.g:1024:4: 'map'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getMapEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:1028:2: ( ( 'string' ) )
                    {
                    // InternalMyDsl.g:1028:2: ( ( 'string' ) )
                    // InternalMyDsl.g:1029:3: ( 'string' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getStringEnumLiteralDeclaration_9()); 
                    // InternalMyDsl.g:1030:3: ( 'string' )
                    // InternalMyDsl.g:1030:4: 'string'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getStringEnumLiteralDeclaration_9()); 

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
    // $ANTLR end "rule__SimpleTypes__Alternatives"


    // $ANTLR start "rule__ComponentBasedSystem__Group__0"
    // InternalMyDsl.g:1038:1: rule__ComponentBasedSystem__Group__0 : rule__ComponentBasedSystem__Group__0__Impl rule__ComponentBasedSystem__Group__1 ;
    public final void rule__ComponentBasedSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1042:1: ( rule__ComponentBasedSystem__Group__0__Impl rule__ComponentBasedSystem__Group__1 )
            // InternalMyDsl.g:1043:2: rule__ComponentBasedSystem__Group__0__Impl rule__ComponentBasedSystem__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentBasedSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__0"


    // $ANTLR start "rule__ComponentBasedSystem__Group__0__Impl"
    // InternalMyDsl.g:1050:1: rule__ComponentBasedSystem__Group__0__Impl : ( 'ComponentBasedSystem' ) ;
    public final void rule__ComponentBasedSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1054:1: ( ( 'ComponentBasedSystem' ) )
            // InternalMyDsl.g:1055:1: ( 'ComponentBasedSystem' )
            {
            // InternalMyDsl.g:1055:1: ( 'ComponentBasedSystem' )
            // InternalMyDsl.g:1056:2: 'ComponentBasedSystem'
            {
             before(grammarAccess.getComponentBasedSystemAccess().getComponentBasedSystemKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getComponentBasedSystemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__0__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group__1"
    // InternalMyDsl.g:1065:1: rule__ComponentBasedSystem__Group__1 : rule__ComponentBasedSystem__Group__1__Impl rule__ComponentBasedSystem__Group__2 ;
    public final void rule__ComponentBasedSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1069:1: ( rule__ComponentBasedSystem__Group__1__Impl rule__ComponentBasedSystem__Group__2 )
            // InternalMyDsl.g:1070:2: rule__ComponentBasedSystem__Group__1__Impl rule__ComponentBasedSystem__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ComponentBasedSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__1"


    // $ANTLR start "rule__ComponentBasedSystem__Group__1__Impl"
    // InternalMyDsl.g:1077:1: rule__ComponentBasedSystem__Group__1__Impl : ( '{' ) ;
    public final void rule__ComponentBasedSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1081:1: ( ( '{' ) )
            // InternalMyDsl.g:1082:1: ( '{' )
            {
            // InternalMyDsl.g:1082:1: ( '{' )
            // InternalMyDsl.g:1083:2: '{'
            {
             before(grammarAccess.getComponentBasedSystemAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__1__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group__2"
    // InternalMyDsl.g:1092:1: rule__ComponentBasedSystem__Group__2 : rule__ComponentBasedSystem__Group__2__Impl rule__ComponentBasedSystem__Group__3 ;
    public final void rule__ComponentBasedSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1096:1: ( rule__ComponentBasedSystem__Group__2__Impl rule__ComponentBasedSystem__Group__3 )
            // InternalMyDsl.g:1097:2: rule__ComponentBasedSystem__Group__2__Impl rule__ComponentBasedSystem__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ComponentBasedSystem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__2"


    // $ANTLR start "rule__ComponentBasedSystem__Group__2__Impl"
    // InternalMyDsl.g:1104:1: rule__ComponentBasedSystem__Group__2__Impl : ( 'interface' ) ;
    public final void rule__ComponentBasedSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1108:1: ( ( 'interface' ) )
            // InternalMyDsl.g:1109:1: ( 'interface' )
            {
            // InternalMyDsl.g:1109:1: ( 'interface' )
            // InternalMyDsl.g:1110:2: 'interface'
            {
             before(grammarAccess.getComponentBasedSystemAccess().getInterfaceKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getInterfaceKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__2__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group__3"
    // InternalMyDsl.g:1119:1: rule__ComponentBasedSystem__Group__3 : rule__ComponentBasedSystem__Group__3__Impl rule__ComponentBasedSystem__Group__4 ;
    public final void rule__ComponentBasedSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1123:1: ( rule__ComponentBasedSystem__Group__3__Impl rule__ComponentBasedSystem__Group__4 )
            // InternalMyDsl.g:1124:2: rule__ComponentBasedSystem__Group__3__Impl rule__ComponentBasedSystem__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ComponentBasedSystem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__3"


    // $ANTLR start "rule__ComponentBasedSystem__Group__3__Impl"
    // InternalMyDsl.g:1131:1: rule__ComponentBasedSystem__Group__3__Impl : ( '(' ) ;
    public final void rule__ComponentBasedSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1135:1: ( ( '(' ) )
            // InternalMyDsl.g:1136:1: ( '(' )
            {
            // InternalMyDsl.g:1136:1: ( '(' )
            // InternalMyDsl.g:1137:2: '('
            {
             before(grammarAccess.getComponentBasedSystemAccess().getLeftParenthesisKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__3__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group__4"
    // InternalMyDsl.g:1146:1: rule__ComponentBasedSystem__Group__4 : rule__ComponentBasedSystem__Group__4__Impl rule__ComponentBasedSystem__Group__5 ;
    public final void rule__ComponentBasedSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1150:1: ( rule__ComponentBasedSystem__Group__4__Impl rule__ComponentBasedSystem__Group__5 )
            // InternalMyDsl.g:1151:2: rule__ComponentBasedSystem__Group__4__Impl rule__ComponentBasedSystem__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__ComponentBasedSystem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__4"


    // $ANTLR start "rule__ComponentBasedSystem__Group__4__Impl"
    // InternalMyDsl.g:1158:1: rule__ComponentBasedSystem__Group__4__Impl : ( ( rule__ComponentBasedSystem__InterfaceAssignment_4 ) ) ;
    public final void rule__ComponentBasedSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1162:1: ( ( ( rule__ComponentBasedSystem__InterfaceAssignment_4 ) ) )
            // InternalMyDsl.g:1163:1: ( ( rule__ComponentBasedSystem__InterfaceAssignment_4 ) )
            {
            // InternalMyDsl.g:1163:1: ( ( rule__ComponentBasedSystem__InterfaceAssignment_4 ) )
            // InternalMyDsl.g:1164:2: ( rule__ComponentBasedSystem__InterfaceAssignment_4 )
            {
             before(grammarAccess.getComponentBasedSystemAccess().getInterfaceAssignment_4()); 
            // InternalMyDsl.g:1165:2: ( rule__ComponentBasedSystem__InterfaceAssignment_4 )
            // InternalMyDsl.g:1165:3: rule__ComponentBasedSystem__InterfaceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__InterfaceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getComponentBasedSystemAccess().getInterfaceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__4__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group__5"
    // InternalMyDsl.g:1173:1: rule__ComponentBasedSystem__Group__5 : rule__ComponentBasedSystem__Group__5__Impl rule__ComponentBasedSystem__Group__6 ;
    public final void rule__ComponentBasedSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1177:1: ( rule__ComponentBasedSystem__Group__5__Impl rule__ComponentBasedSystem__Group__6 )
            // InternalMyDsl.g:1178:2: rule__ComponentBasedSystem__Group__5__Impl rule__ComponentBasedSystem__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__ComponentBasedSystem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__5"


    // $ANTLR start "rule__ComponentBasedSystem__Group__5__Impl"
    // InternalMyDsl.g:1185:1: rule__ComponentBasedSystem__Group__5__Impl : ( ( rule__ComponentBasedSystem__Group_5__0 )* ) ;
    public final void rule__ComponentBasedSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1189:1: ( ( ( rule__ComponentBasedSystem__Group_5__0 )* ) )
            // InternalMyDsl.g:1190:1: ( ( rule__ComponentBasedSystem__Group_5__0 )* )
            {
            // InternalMyDsl.g:1190:1: ( ( rule__ComponentBasedSystem__Group_5__0 )* )
            // InternalMyDsl.g:1191:2: ( rule__ComponentBasedSystem__Group_5__0 )*
            {
             before(grammarAccess.getComponentBasedSystemAccess().getGroup_5()); 
            // InternalMyDsl.g:1192:2: ( rule__ComponentBasedSystem__Group_5__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:1192:3: rule__ComponentBasedSystem__Group_5__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ComponentBasedSystem__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getComponentBasedSystemAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__5__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group__6"
    // InternalMyDsl.g:1200:1: rule__ComponentBasedSystem__Group__6 : rule__ComponentBasedSystem__Group__6__Impl rule__ComponentBasedSystem__Group__7 ;
    public final void rule__ComponentBasedSystem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1204:1: ( rule__ComponentBasedSystem__Group__6__Impl rule__ComponentBasedSystem__Group__7 )
            // InternalMyDsl.g:1205:2: rule__ComponentBasedSystem__Group__6__Impl rule__ComponentBasedSystem__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__ComponentBasedSystem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__6"


    // $ANTLR start "rule__ComponentBasedSystem__Group__6__Impl"
    // InternalMyDsl.g:1212:1: rule__ComponentBasedSystem__Group__6__Impl : ( ')' ) ;
    public final void rule__ComponentBasedSystem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1216:1: ( ( ')' ) )
            // InternalMyDsl.g:1217:1: ( ')' )
            {
            // InternalMyDsl.g:1217:1: ( ')' )
            // InternalMyDsl.g:1218:2: ')'
            {
             before(grammarAccess.getComponentBasedSystemAccess().getRightParenthesisKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__6__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group__7"
    // InternalMyDsl.g:1227:1: rule__ComponentBasedSystem__Group__7 : rule__ComponentBasedSystem__Group__7__Impl rule__ComponentBasedSystem__Group__8 ;
    public final void rule__ComponentBasedSystem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1231:1: ( rule__ComponentBasedSystem__Group__7__Impl rule__ComponentBasedSystem__Group__8 )
            // InternalMyDsl.g:1232:2: rule__ComponentBasedSystem__Group__7__Impl rule__ComponentBasedSystem__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__ComponentBasedSystem__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__7"


    // $ANTLR start "rule__ComponentBasedSystem__Group__7__Impl"
    // InternalMyDsl.g:1239:1: rule__ComponentBasedSystem__Group__7__Impl : ( 'environment' ) ;
    public final void rule__ComponentBasedSystem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1243:1: ( ( 'environment' ) )
            // InternalMyDsl.g:1244:1: ( 'environment' )
            {
            // InternalMyDsl.g:1244:1: ( 'environment' )
            // InternalMyDsl.g:1245:2: 'environment'
            {
             before(grammarAccess.getComponentBasedSystemAccess().getEnvironmentKeyword_7()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getEnvironmentKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__7__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group__8"
    // InternalMyDsl.g:1254:1: rule__ComponentBasedSystem__Group__8 : rule__ComponentBasedSystem__Group__8__Impl rule__ComponentBasedSystem__Group__9 ;
    public final void rule__ComponentBasedSystem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1258:1: ( rule__ComponentBasedSystem__Group__8__Impl rule__ComponentBasedSystem__Group__9 )
            // InternalMyDsl.g:1259:2: rule__ComponentBasedSystem__Group__8__Impl rule__ComponentBasedSystem__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__ComponentBasedSystem__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__8"


    // $ANTLR start "rule__ComponentBasedSystem__Group__8__Impl"
    // InternalMyDsl.g:1266:1: rule__ComponentBasedSystem__Group__8__Impl : ( ( rule__ComponentBasedSystem__EnvironmentAssignment_8 ) ) ;
    public final void rule__ComponentBasedSystem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1270:1: ( ( ( rule__ComponentBasedSystem__EnvironmentAssignment_8 ) ) )
            // InternalMyDsl.g:1271:1: ( ( rule__ComponentBasedSystem__EnvironmentAssignment_8 ) )
            {
            // InternalMyDsl.g:1271:1: ( ( rule__ComponentBasedSystem__EnvironmentAssignment_8 ) )
            // InternalMyDsl.g:1272:2: ( rule__ComponentBasedSystem__EnvironmentAssignment_8 )
            {
             before(grammarAccess.getComponentBasedSystemAccess().getEnvironmentAssignment_8()); 
            // InternalMyDsl.g:1273:2: ( rule__ComponentBasedSystem__EnvironmentAssignment_8 )
            // InternalMyDsl.g:1273:3: rule__ComponentBasedSystem__EnvironmentAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__EnvironmentAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getComponentBasedSystemAccess().getEnvironmentAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__8__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group__9"
    // InternalMyDsl.g:1281:1: rule__ComponentBasedSystem__Group__9 : rule__ComponentBasedSystem__Group__9__Impl rule__ComponentBasedSystem__Group__10 ;
    public final void rule__ComponentBasedSystem__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1285:1: ( rule__ComponentBasedSystem__Group__9__Impl rule__ComponentBasedSystem__Group__10 )
            // InternalMyDsl.g:1286:2: rule__ComponentBasedSystem__Group__9__Impl rule__ComponentBasedSystem__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__ComponentBasedSystem__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__9"


    // $ANTLR start "rule__ComponentBasedSystem__Group__9__Impl"
    // InternalMyDsl.g:1293:1: rule__ComponentBasedSystem__Group__9__Impl : ( ( rule__ComponentBasedSystem__Group_9__0 )? ) ;
    public final void rule__ComponentBasedSystem__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1297:1: ( ( ( rule__ComponentBasedSystem__Group_9__0 )? ) )
            // InternalMyDsl.g:1298:1: ( ( rule__ComponentBasedSystem__Group_9__0 )? )
            {
            // InternalMyDsl.g:1298:1: ( ( rule__ComponentBasedSystem__Group_9__0 )? )
            // InternalMyDsl.g:1299:2: ( rule__ComponentBasedSystem__Group_9__0 )?
            {
             before(grammarAccess.getComponentBasedSystemAccess().getGroup_9()); 
            // InternalMyDsl.g:1300:2: ( rule__ComponentBasedSystem__Group_9__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1300:3: rule__ComponentBasedSystem__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentBasedSystem__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentBasedSystemAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__9__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group__10"
    // InternalMyDsl.g:1308:1: rule__ComponentBasedSystem__Group__10 : rule__ComponentBasedSystem__Group__10__Impl rule__ComponentBasedSystem__Group__11 ;
    public final void rule__ComponentBasedSystem__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1312:1: ( rule__ComponentBasedSystem__Group__10__Impl rule__ComponentBasedSystem__Group__11 )
            // InternalMyDsl.g:1313:2: rule__ComponentBasedSystem__Group__10__Impl rule__ComponentBasedSystem__Group__11
            {
            pushFollow(FOLLOW_10);
            rule__ComponentBasedSystem__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__10"


    // $ANTLR start "rule__ComponentBasedSystem__Group__10__Impl"
    // InternalMyDsl.g:1320:1: rule__ComponentBasedSystem__Group__10__Impl : ( ( rule__ComponentBasedSystem__Group_10__0 )? ) ;
    public final void rule__ComponentBasedSystem__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1324:1: ( ( ( rule__ComponentBasedSystem__Group_10__0 )? ) )
            // InternalMyDsl.g:1325:1: ( ( rule__ComponentBasedSystem__Group_10__0 )? )
            {
            // InternalMyDsl.g:1325:1: ( ( rule__ComponentBasedSystem__Group_10__0 )? )
            // InternalMyDsl.g:1326:2: ( rule__ComponentBasedSystem__Group_10__0 )?
            {
             before(grammarAccess.getComponentBasedSystemAccess().getGroup_10()); 
            // InternalMyDsl.g:1327:2: ( rule__ComponentBasedSystem__Group_10__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1327:3: rule__ComponentBasedSystem__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentBasedSystem__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentBasedSystemAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__10__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group__11"
    // InternalMyDsl.g:1335:1: rule__ComponentBasedSystem__Group__11 : rule__ComponentBasedSystem__Group__11__Impl rule__ComponentBasedSystem__Group__12 ;
    public final void rule__ComponentBasedSystem__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1339:1: ( rule__ComponentBasedSystem__Group__11__Impl rule__ComponentBasedSystem__Group__12 )
            // InternalMyDsl.g:1340:2: rule__ComponentBasedSystem__Group__11__Impl rule__ComponentBasedSystem__Group__12
            {
            pushFollow(FOLLOW_10);
            rule__ComponentBasedSystem__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__11"


    // $ANTLR start "rule__ComponentBasedSystem__Group__11__Impl"
    // InternalMyDsl.g:1347:1: rule__ComponentBasedSystem__Group__11__Impl : ( ( rule__ComponentBasedSystem__Group_11__0 )? ) ;
    public final void rule__ComponentBasedSystem__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1351:1: ( ( ( rule__ComponentBasedSystem__Group_11__0 )? ) )
            // InternalMyDsl.g:1352:1: ( ( rule__ComponentBasedSystem__Group_11__0 )? )
            {
            // InternalMyDsl.g:1352:1: ( ( rule__ComponentBasedSystem__Group_11__0 )? )
            // InternalMyDsl.g:1353:2: ( rule__ComponentBasedSystem__Group_11__0 )?
            {
             before(grammarAccess.getComponentBasedSystemAccess().getGroup_11()); 
            // InternalMyDsl.g:1354:2: ( rule__ComponentBasedSystem__Group_11__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1354:3: rule__ComponentBasedSystem__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentBasedSystem__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentBasedSystemAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__11__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group__12"
    // InternalMyDsl.g:1362:1: rule__ComponentBasedSystem__Group__12 : rule__ComponentBasedSystem__Group__12__Impl rule__ComponentBasedSystem__Group__13 ;
    public final void rule__ComponentBasedSystem__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1366:1: ( rule__ComponentBasedSystem__Group__12__Impl rule__ComponentBasedSystem__Group__13 )
            // InternalMyDsl.g:1367:2: rule__ComponentBasedSystem__Group__12__Impl rule__ComponentBasedSystem__Group__13
            {
            pushFollow(FOLLOW_10);
            rule__ComponentBasedSystem__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__12"


    // $ANTLR start "rule__ComponentBasedSystem__Group__12__Impl"
    // InternalMyDsl.g:1374:1: rule__ComponentBasedSystem__Group__12__Impl : ( ( rule__ComponentBasedSystem__Group_12__0 )? ) ;
    public final void rule__ComponentBasedSystem__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1378:1: ( ( ( rule__ComponentBasedSystem__Group_12__0 )? ) )
            // InternalMyDsl.g:1379:1: ( ( rule__ComponentBasedSystem__Group_12__0 )? )
            {
            // InternalMyDsl.g:1379:1: ( ( rule__ComponentBasedSystem__Group_12__0 )? )
            // InternalMyDsl.g:1380:2: ( rule__ComponentBasedSystem__Group_12__0 )?
            {
             before(grammarAccess.getComponentBasedSystemAccess().getGroup_12()); 
            // InternalMyDsl.g:1381:2: ( rule__ComponentBasedSystem__Group_12__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1381:3: rule__ComponentBasedSystem__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentBasedSystem__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentBasedSystemAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__12__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group__13"
    // InternalMyDsl.g:1389:1: rule__ComponentBasedSystem__Group__13 : rule__ComponentBasedSystem__Group__13__Impl rule__ComponentBasedSystem__Group__14 ;
    public final void rule__ComponentBasedSystem__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1393:1: ( rule__ComponentBasedSystem__Group__13__Impl rule__ComponentBasedSystem__Group__14 )
            // InternalMyDsl.g:1394:2: rule__ComponentBasedSystem__Group__13__Impl rule__ComponentBasedSystem__Group__14
            {
            pushFollow(FOLLOW_10);
            rule__ComponentBasedSystem__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__13"


    // $ANTLR start "rule__ComponentBasedSystem__Group__13__Impl"
    // InternalMyDsl.g:1401:1: rule__ComponentBasedSystem__Group__13__Impl : ( ( rule__ComponentBasedSystem__Group_13__0 )? ) ;
    public final void rule__ComponentBasedSystem__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1405:1: ( ( ( rule__ComponentBasedSystem__Group_13__0 )? ) )
            // InternalMyDsl.g:1406:1: ( ( rule__ComponentBasedSystem__Group_13__0 )? )
            {
            // InternalMyDsl.g:1406:1: ( ( rule__ComponentBasedSystem__Group_13__0 )? )
            // InternalMyDsl.g:1407:2: ( rule__ComponentBasedSystem__Group_13__0 )?
            {
             before(grammarAccess.getComponentBasedSystemAccess().getGroup_13()); 
            // InternalMyDsl.g:1408:2: ( rule__ComponentBasedSystem__Group_13__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1408:3: rule__ComponentBasedSystem__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentBasedSystem__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentBasedSystemAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__13__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group__14"
    // InternalMyDsl.g:1416:1: rule__ComponentBasedSystem__Group__14 : rule__ComponentBasedSystem__Group__14__Impl ;
    public final void rule__ComponentBasedSystem__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1420:1: ( rule__ComponentBasedSystem__Group__14__Impl )
            // InternalMyDsl.g:1421:2: rule__ComponentBasedSystem__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__14"


    // $ANTLR start "rule__ComponentBasedSystem__Group__14__Impl"
    // InternalMyDsl.g:1427:1: rule__ComponentBasedSystem__Group__14__Impl : ( '}' ) ;
    public final void rule__ComponentBasedSystem__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1431:1: ( ( '}' ) )
            // InternalMyDsl.g:1432:1: ( '}' )
            {
            // InternalMyDsl.g:1432:1: ( '}' )
            // InternalMyDsl.g:1433:2: '}'
            {
             before(grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_14()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group__14__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_5__0"
    // InternalMyDsl.g:1443:1: rule__ComponentBasedSystem__Group_5__0 : rule__ComponentBasedSystem__Group_5__0__Impl rule__ComponentBasedSystem__Group_5__1 ;
    public final void rule__ComponentBasedSystem__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1447:1: ( rule__ComponentBasedSystem__Group_5__0__Impl rule__ComponentBasedSystem__Group_5__1 )
            // InternalMyDsl.g:1448:2: rule__ComponentBasedSystem__Group_5__0__Impl rule__ComponentBasedSystem__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__ComponentBasedSystem__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_5__0"


    // $ANTLR start "rule__ComponentBasedSystem__Group_5__0__Impl"
    // InternalMyDsl.g:1455:1: rule__ComponentBasedSystem__Group_5__0__Impl : ( ',' ) ;
    public final void rule__ComponentBasedSystem__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1459:1: ( ( ',' ) )
            // InternalMyDsl.g:1460:1: ( ',' )
            {
            // InternalMyDsl.g:1460:1: ( ',' )
            // InternalMyDsl.g:1461:2: ','
            {
             before(grammarAccess.getComponentBasedSystemAccess().getCommaKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_5__0__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_5__1"
    // InternalMyDsl.g:1470:1: rule__ComponentBasedSystem__Group_5__1 : rule__ComponentBasedSystem__Group_5__1__Impl ;
    public final void rule__ComponentBasedSystem__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1474:1: ( rule__ComponentBasedSystem__Group_5__1__Impl )
            // InternalMyDsl.g:1475:2: rule__ComponentBasedSystem__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_5__1"


    // $ANTLR start "rule__ComponentBasedSystem__Group_5__1__Impl"
    // InternalMyDsl.g:1481:1: rule__ComponentBasedSystem__Group_5__1__Impl : ( ( rule__ComponentBasedSystem__InterfaceAssignment_5_1 ) ) ;
    public final void rule__ComponentBasedSystem__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1485:1: ( ( ( rule__ComponentBasedSystem__InterfaceAssignment_5_1 ) ) )
            // InternalMyDsl.g:1486:1: ( ( rule__ComponentBasedSystem__InterfaceAssignment_5_1 ) )
            {
            // InternalMyDsl.g:1486:1: ( ( rule__ComponentBasedSystem__InterfaceAssignment_5_1 ) )
            // InternalMyDsl.g:1487:2: ( rule__ComponentBasedSystem__InterfaceAssignment_5_1 )
            {
             before(grammarAccess.getComponentBasedSystemAccess().getInterfaceAssignment_5_1()); 
            // InternalMyDsl.g:1488:2: ( rule__ComponentBasedSystem__InterfaceAssignment_5_1 )
            // InternalMyDsl.g:1488:3: rule__ComponentBasedSystem__InterfaceAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__InterfaceAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentBasedSystemAccess().getInterfaceAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_5__1__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_9__0"
    // InternalMyDsl.g:1497:1: rule__ComponentBasedSystem__Group_9__0 : rule__ComponentBasedSystem__Group_9__0__Impl rule__ComponentBasedSystem__Group_9__1 ;
    public final void rule__ComponentBasedSystem__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1501:1: ( rule__ComponentBasedSystem__Group_9__0__Impl rule__ComponentBasedSystem__Group_9__1 )
            // InternalMyDsl.g:1502:2: rule__ComponentBasedSystem__Group_9__0__Impl rule__ComponentBasedSystem__Group_9__1
            {
            pushFollow(FOLLOW_6);
            rule__ComponentBasedSystem__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_9__0"


    // $ANTLR start "rule__ComponentBasedSystem__Group_9__0__Impl"
    // InternalMyDsl.g:1509:1: rule__ComponentBasedSystem__Group_9__0__Impl : ( 'repository' ) ;
    public final void rule__ComponentBasedSystem__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1513:1: ( ( 'repository' ) )
            // InternalMyDsl.g:1514:1: ( 'repository' )
            {
            // InternalMyDsl.g:1514:1: ( 'repository' )
            // InternalMyDsl.g:1515:2: 'repository'
            {
             before(grammarAccess.getComponentBasedSystemAccess().getRepositoryKeyword_9_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getRepositoryKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_9__0__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_9__1"
    // InternalMyDsl.g:1524:1: rule__ComponentBasedSystem__Group_9__1 : rule__ComponentBasedSystem__Group_9__1__Impl ;
    public final void rule__ComponentBasedSystem__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1528:1: ( rule__ComponentBasedSystem__Group_9__1__Impl )
            // InternalMyDsl.g:1529:2: rule__ComponentBasedSystem__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_9__1"


    // $ANTLR start "rule__ComponentBasedSystem__Group_9__1__Impl"
    // InternalMyDsl.g:1535:1: rule__ComponentBasedSystem__Group_9__1__Impl : ( ( rule__ComponentBasedSystem__RepositoryAssignment_9_1 ) ) ;
    public final void rule__ComponentBasedSystem__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1539:1: ( ( ( rule__ComponentBasedSystem__RepositoryAssignment_9_1 ) ) )
            // InternalMyDsl.g:1540:1: ( ( rule__ComponentBasedSystem__RepositoryAssignment_9_1 ) )
            {
            // InternalMyDsl.g:1540:1: ( ( rule__ComponentBasedSystem__RepositoryAssignment_9_1 ) )
            // InternalMyDsl.g:1541:2: ( rule__ComponentBasedSystem__RepositoryAssignment_9_1 )
            {
             before(grammarAccess.getComponentBasedSystemAccess().getRepositoryAssignment_9_1()); 
            // InternalMyDsl.g:1542:2: ( rule__ComponentBasedSystem__RepositoryAssignment_9_1 )
            // InternalMyDsl.g:1542:3: rule__ComponentBasedSystem__RepositoryAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__RepositoryAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentBasedSystemAccess().getRepositoryAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_9__1__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_10__0"
    // InternalMyDsl.g:1551:1: rule__ComponentBasedSystem__Group_10__0 : rule__ComponentBasedSystem__Group_10__0__Impl rule__ComponentBasedSystem__Group_10__1 ;
    public final void rule__ComponentBasedSystem__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1555:1: ( rule__ComponentBasedSystem__Group_10__0__Impl rule__ComponentBasedSystem__Group_10__1 )
            // InternalMyDsl.g:1556:2: rule__ComponentBasedSystem__Group_10__0__Impl rule__ComponentBasedSystem__Group_10__1
            {
            pushFollow(FOLLOW_6);
            rule__ComponentBasedSystem__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_10__0"


    // $ANTLR start "rule__ComponentBasedSystem__Group_10__0__Impl"
    // InternalMyDsl.g:1563:1: rule__ComponentBasedSystem__Group_10__0__Impl : ( 'allocation' ) ;
    public final void rule__ComponentBasedSystem__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1567:1: ( ( 'allocation' ) )
            // InternalMyDsl.g:1568:1: ( 'allocation' )
            {
            // InternalMyDsl.g:1568:1: ( 'allocation' )
            // InternalMyDsl.g:1569:2: 'allocation'
            {
             before(grammarAccess.getComponentBasedSystemAccess().getAllocationKeyword_10_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getAllocationKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_10__0__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_10__1"
    // InternalMyDsl.g:1578:1: rule__ComponentBasedSystem__Group_10__1 : rule__ComponentBasedSystem__Group_10__1__Impl ;
    public final void rule__ComponentBasedSystem__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1582:1: ( rule__ComponentBasedSystem__Group_10__1__Impl )
            // InternalMyDsl.g:1583:2: rule__ComponentBasedSystem__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_10__1"


    // $ANTLR start "rule__ComponentBasedSystem__Group_10__1__Impl"
    // InternalMyDsl.g:1589:1: rule__ComponentBasedSystem__Group_10__1__Impl : ( ( rule__ComponentBasedSystem__AllocationAssignment_10_1 ) ) ;
    public final void rule__ComponentBasedSystem__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1593:1: ( ( ( rule__ComponentBasedSystem__AllocationAssignment_10_1 ) ) )
            // InternalMyDsl.g:1594:1: ( ( rule__ComponentBasedSystem__AllocationAssignment_10_1 ) )
            {
            // InternalMyDsl.g:1594:1: ( ( rule__ComponentBasedSystem__AllocationAssignment_10_1 ) )
            // InternalMyDsl.g:1595:2: ( rule__ComponentBasedSystem__AllocationAssignment_10_1 )
            {
             before(grammarAccess.getComponentBasedSystemAccess().getAllocationAssignment_10_1()); 
            // InternalMyDsl.g:1596:2: ( rule__ComponentBasedSystem__AllocationAssignment_10_1 )
            // InternalMyDsl.g:1596:3: rule__ComponentBasedSystem__AllocationAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__AllocationAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentBasedSystemAccess().getAllocationAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_10__1__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_11__0"
    // InternalMyDsl.g:1605:1: rule__ComponentBasedSystem__Group_11__0 : rule__ComponentBasedSystem__Group_11__0__Impl rule__ComponentBasedSystem__Group_11__1 ;
    public final void rule__ComponentBasedSystem__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1609:1: ( rule__ComponentBasedSystem__Group_11__0__Impl rule__ComponentBasedSystem__Group_11__1 )
            // InternalMyDsl.g:1610:2: rule__ComponentBasedSystem__Group_11__0__Impl rule__ComponentBasedSystem__Group_11__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentBasedSystem__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_11__0"


    // $ANTLR start "rule__ComponentBasedSystem__Group_11__0__Impl"
    // InternalMyDsl.g:1617:1: rule__ComponentBasedSystem__Group_11__0__Impl : ( 'assemblycontext' ) ;
    public final void rule__ComponentBasedSystem__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1621:1: ( ( 'assemblycontext' ) )
            // InternalMyDsl.g:1622:1: ( 'assemblycontext' )
            {
            // InternalMyDsl.g:1622:1: ( 'assemblycontext' )
            // InternalMyDsl.g:1623:2: 'assemblycontext'
            {
             before(grammarAccess.getComponentBasedSystemAccess().getAssemblycontextKeyword_11_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getAssemblycontextKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_11__0__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_11__1"
    // InternalMyDsl.g:1632:1: rule__ComponentBasedSystem__Group_11__1 : rule__ComponentBasedSystem__Group_11__1__Impl rule__ComponentBasedSystem__Group_11__2 ;
    public final void rule__ComponentBasedSystem__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1636:1: ( rule__ComponentBasedSystem__Group_11__1__Impl rule__ComponentBasedSystem__Group_11__2 )
            // InternalMyDsl.g:1637:2: rule__ComponentBasedSystem__Group_11__1__Impl rule__ComponentBasedSystem__Group_11__2
            {
            pushFollow(FOLLOW_11);
            rule__ComponentBasedSystem__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_11__1"


    // $ANTLR start "rule__ComponentBasedSystem__Group_11__1__Impl"
    // InternalMyDsl.g:1644:1: rule__ComponentBasedSystem__Group_11__1__Impl : ( '{' ) ;
    public final void rule__ComponentBasedSystem__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1648:1: ( ( '{' ) )
            // InternalMyDsl.g:1649:1: ( '{' )
            {
            // InternalMyDsl.g:1649:1: ( '{' )
            // InternalMyDsl.g:1650:2: '{'
            {
             before(grammarAccess.getComponentBasedSystemAccess().getLeftCurlyBracketKeyword_11_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getLeftCurlyBracketKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_11__1__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_11__2"
    // InternalMyDsl.g:1659:1: rule__ComponentBasedSystem__Group_11__2 : rule__ComponentBasedSystem__Group_11__2__Impl rule__ComponentBasedSystem__Group_11__3 ;
    public final void rule__ComponentBasedSystem__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1663:1: ( rule__ComponentBasedSystem__Group_11__2__Impl rule__ComponentBasedSystem__Group_11__3 )
            // InternalMyDsl.g:1664:2: rule__ComponentBasedSystem__Group_11__2__Impl rule__ComponentBasedSystem__Group_11__3
            {
            pushFollow(FOLLOW_12);
            rule__ComponentBasedSystem__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_11__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_11__2"


    // $ANTLR start "rule__ComponentBasedSystem__Group_11__2__Impl"
    // InternalMyDsl.g:1671:1: rule__ComponentBasedSystem__Group_11__2__Impl : ( ( rule__ComponentBasedSystem__AssemblycontextAssignment_11_2 ) ) ;
    public final void rule__ComponentBasedSystem__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1675:1: ( ( ( rule__ComponentBasedSystem__AssemblycontextAssignment_11_2 ) ) )
            // InternalMyDsl.g:1676:1: ( ( rule__ComponentBasedSystem__AssemblycontextAssignment_11_2 ) )
            {
            // InternalMyDsl.g:1676:1: ( ( rule__ComponentBasedSystem__AssemblycontextAssignment_11_2 ) )
            // InternalMyDsl.g:1677:2: ( rule__ComponentBasedSystem__AssemblycontextAssignment_11_2 )
            {
             before(grammarAccess.getComponentBasedSystemAccess().getAssemblycontextAssignment_11_2()); 
            // InternalMyDsl.g:1678:2: ( rule__ComponentBasedSystem__AssemblycontextAssignment_11_2 )
            // InternalMyDsl.g:1678:3: rule__ComponentBasedSystem__AssemblycontextAssignment_11_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__AssemblycontextAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentBasedSystemAccess().getAssemblycontextAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_11__2__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_11__3"
    // InternalMyDsl.g:1686:1: rule__ComponentBasedSystem__Group_11__3 : rule__ComponentBasedSystem__Group_11__3__Impl rule__ComponentBasedSystem__Group_11__4 ;
    public final void rule__ComponentBasedSystem__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1690:1: ( rule__ComponentBasedSystem__Group_11__3__Impl rule__ComponentBasedSystem__Group_11__4 )
            // InternalMyDsl.g:1691:2: rule__ComponentBasedSystem__Group_11__3__Impl rule__ComponentBasedSystem__Group_11__4
            {
            pushFollow(FOLLOW_12);
            rule__ComponentBasedSystem__Group_11__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_11__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_11__3"


    // $ANTLR start "rule__ComponentBasedSystem__Group_11__3__Impl"
    // InternalMyDsl.g:1698:1: rule__ComponentBasedSystem__Group_11__3__Impl : ( ( rule__ComponentBasedSystem__Group_11_3__0 )* ) ;
    public final void rule__ComponentBasedSystem__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1702:1: ( ( ( rule__ComponentBasedSystem__Group_11_3__0 )* ) )
            // InternalMyDsl.g:1703:1: ( ( rule__ComponentBasedSystem__Group_11_3__0 )* )
            {
            // InternalMyDsl.g:1703:1: ( ( rule__ComponentBasedSystem__Group_11_3__0 )* )
            // InternalMyDsl.g:1704:2: ( rule__ComponentBasedSystem__Group_11_3__0 )*
            {
             before(grammarAccess.getComponentBasedSystemAccess().getGroup_11_3()); 
            // InternalMyDsl.g:1705:2: ( rule__ComponentBasedSystem__Group_11_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1705:3: rule__ComponentBasedSystem__Group_11_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ComponentBasedSystem__Group_11_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getComponentBasedSystemAccess().getGroup_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_11__3__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_11__4"
    // InternalMyDsl.g:1713:1: rule__ComponentBasedSystem__Group_11__4 : rule__ComponentBasedSystem__Group_11__4__Impl ;
    public final void rule__ComponentBasedSystem__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1717:1: ( rule__ComponentBasedSystem__Group_11__4__Impl )
            // InternalMyDsl.g:1718:2: rule__ComponentBasedSystem__Group_11__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_11__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_11__4"


    // $ANTLR start "rule__ComponentBasedSystem__Group_11__4__Impl"
    // InternalMyDsl.g:1724:1: rule__ComponentBasedSystem__Group_11__4__Impl : ( '}' ) ;
    public final void rule__ComponentBasedSystem__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1728:1: ( ( '}' ) )
            // InternalMyDsl.g:1729:1: ( '}' )
            {
            // InternalMyDsl.g:1729:1: ( '}' )
            // InternalMyDsl.g:1730:2: '}'
            {
             before(grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_11_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_11_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_11__4__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_11_3__0"
    // InternalMyDsl.g:1740:1: rule__ComponentBasedSystem__Group_11_3__0 : rule__ComponentBasedSystem__Group_11_3__0__Impl rule__ComponentBasedSystem__Group_11_3__1 ;
    public final void rule__ComponentBasedSystem__Group_11_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1744:1: ( rule__ComponentBasedSystem__Group_11_3__0__Impl rule__ComponentBasedSystem__Group_11_3__1 )
            // InternalMyDsl.g:1745:2: rule__ComponentBasedSystem__Group_11_3__0__Impl rule__ComponentBasedSystem__Group_11_3__1
            {
            pushFollow(FOLLOW_11);
            rule__ComponentBasedSystem__Group_11_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_11_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_11_3__0"


    // $ANTLR start "rule__ComponentBasedSystem__Group_11_3__0__Impl"
    // InternalMyDsl.g:1752:1: rule__ComponentBasedSystem__Group_11_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentBasedSystem__Group_11_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1756:1: ( ( ',' ) )
            // InternalMyDsl.g:1757:1: ( ',' )
            {
            // InternalMyDsl.g:1757:1: ( ',' )
            // InternalMyDsl.g:1758:2: ','
            {
             before(grammarAccess.getComponentBasedSystemAccess().getCommaKeyword_11_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getCommaKeyword_11_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_11_3__0__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_11_3__1"
    // InternalMyDsl.g:1767:1: rule__ComponentBasedSystem__Group_11_3__1 : rule__ComponentBasedSystem__Group_11_3__1__Impl ;
    public final void rule__ComponentBasedSystem__Group_11_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1771:1: ( rule__ComponentBasedSystem__Group_11_3__1__Impl )
            // InternalMyDsl.g:1772:2: rule__ComponentBasedSystem__Group_11_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_11_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_11_3__1"


    // $ANTLR start "rule__ComponentBasedSystem__Group_11_3__1__Impl"
    // InternalMyDsl.g:1778:1: rule__ComponentBasedSystem__Group_11_3__1__Impl : ( ( rule__ComponentBasedSystem__AssemblycontextAssignment_11_3_1 ) ) ;
    public final void rule__ComponentBasedSystem__Group_11_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1782:1: ( ( ( rule__ComponentBasedSystem__AssemblycontextAssignment_11_3_1 ) ) )
            // InternalMyDsl.g:1783:1: ( ( rule__ComponentBasedSystem__AssemblycontextAssignment_11_3_1 ) )
            {
            // InternalMyDsl.g:1783:1: ( ( rule__ComponentBasedSystem__AssemblycontextAssignment_11_3_1 ) )
            // InternalMyDsl.g:1784:2: ( rule__ComponentBasedSystem__AssemblycontextAssignment_11_3_1 )
            {
             before(grammarAccess.getComponentBasedSystemAccess().getAssemblycontextAssignment_11_3_1()); 
            // InternalMyDsl.g:1785:2: ( rule__ComponentBasedSystem__AssemblycontextAssignment_11_3_1 )
            // InternalMyDsl.g:1785:3: rule__ComponentBasedSystem__AssemblycontextAssignment_11_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__AssemblycontextAssignment_11_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentBasedSystemAccess().getAssemblycontextAssignment_11_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_11_3__1__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_12__0"
    // InternalMyDsl.g:1794:1: rule__ComponentBasedSystem__Group_12__0 : rule__ComponentBasedSystem__Group_12__0__Impl rule__ComponentBasedSystem__Group_12__1 ;
    public final void rule__ComponentBasedSystem__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1798:1: ( rule__ComponentBasedSystem__Group_12__0__Impl rule__ComponentBasedSystem__Group_12__1 )
            // InternalMyDsl.g:1799:2: rule__ComponentBasedSystem__Group_12__0__Impl rule__ComponentBasedSystem__Group_12__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentBasedSystem__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_12__0"


    // $ANTLR start "rule__ComponentBasedSystem__Group_12__0__Impl"
    // InternalMyDsl.g:1806:1: rule__ComponentBasedSystem__Group_12__0__Impl : ( 'type' ) ;
    public final void rule__ComponentBasedSystem__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1810:1: ( ( 'type' ) )
            // InternalMyDsl.g:1811:1: ( 'type' )
            {
            // InternalMyDsl.g:1811:1: ( 'type' )
            // InternalMyDsl.g:1812:2: 'type'
            {
             before(grammarAccess.getComponentBasedSystemAccess().getTypeKeyword_12_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getTypeKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_12__0__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_12__1"
    // InternalMyDsl.g:1821:1: rule__ComponentBasedSystem__Group_12__1 : rule__ComponentBasedSystem__Group_12__1__Impl rule__ComponentBasedSystem__Group_12__2 ;
    public final void rule__ComponentBasedSystem__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1825:1: ( rule__ComponentBasedSystem__Group_12__1__Impl rule__ComponentBasedSystem__Group_12__2 )
            // InternalMyDsl.g:1826:2: rule__ComponentBasedSystem__Group_12__1__Impl rule__ComponentBasedSystem__Group_12__2
            {
            pushFollow(FOLLOW_13);
            rule__ComponentBasedSystem__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_12__1"


    // $ANTLR start "rule__ComponentBasedSystem__Group_12__1__Impl"
    // InternalMyDsl.g:1833:1: rule__ComponentBasedSystem__Group_12__1__Impl : ( '{' ) ;
    public final void rule__ComponentBasedSystem__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1837:1: ( ( '{' ) )
            // InternalMyDsl.g:1838:1: ( '{' )
            {
            // InternalMyDsl.g:1838:1: ( '{' )
            // InternalMyDsl.g:1839:2: '{'
            {
             before(grammarAccess.getComponentBasedSystemAccess().getLeftCurlyBracketKeyword_12_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getLeftCurlyBracketKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_12__1__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_12__2"
    // InternalMyDsl.g:1848:1: rule__ComponentBasedSystem__Group_12__2 : rule__ComponentBasedSystem__Group_12__2__Impl rule__ComponentBasedSystem__Group_12__3 ;
    public final void rule__ComponentBasedSystem__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1852:1: ( rule__ComponentBasedSystem__Group_12__2__Impl rule__ComponentBasedSystem__Group_12__3 )
            // InternalMyDsl.g:1853:2: rule__ComponentBasedSystem__Group_12__2__Impl rule__ComponentBasedSystem__Group_12__3
            {
            pushFollow(FOLLOW_12);
            rule__ComponentBasedSystem__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_12__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_12__2"


    // $ANTLR start "rule__ComponentBasedSystem__Group_12__2__Impl"
    // InternalMyDsl.g:1860:1: rule__ComponentBasedSystem__Group_12__2__Impl : ( ( rule__ComponentBasedSystem__TypeAssignment_12_2 ) ) ;
    public final void rule__ComponentBasedSystem__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1864:1: ( ( ( rule__ComponentBasedSystem__TypeAssignment_12_2 ) ) )
            // InternalMyDsl.g:1865:1: ( ( rule__ComponentBasedSystem__TypeAssignment_12_2 ) )
            {
            // InternalMyDsl.g:1865:1: ( ( rule__ComponentBasedSystem__TypeAssignment_12_2 ) )
            // InternalMyDsl.g:1866:2: ( rule__ComponentBasedSystem__TypeAssignment_12_2 )
            {
             before(grammarAccess.getComponentBasedSystemAccess().getTypeAssignment_12_2()); 
            // InternalMyDsl.g:1867:2: ( rule__ComponentBasedSystem__TypeAssignment_12_2 )
            // InternalMyDsl.g:1867:3: rule__ComponentBasedSystem__TypeAssignment_12_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__TypeAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentBasedSystemAccess().getTypeAssignment_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_12__2__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_12__3"
    // InternalMyDsl.g:1875:1: rule__ComponentBasedSystem__Group_12__3 : rule__ComponentBasedSystem__Group_12__3__Impl rule__ComponentBasedSystem__Group_12__4 ;
    public final void rule__ComponentBasedSystem__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1879:1: ( rule__ComponentBasedSystem__Group_12__3__Impl rule__ComponentBasedSystem__Group_12__4 )
            // InternalMyDsl.g:1880:2: rule__ComponentBasedSystem__Group_12__3__Impl rule__ComponentBasedSystem__Group_12__4
            {
            pushFollow(FOLLOW_12);
            rule__ComponentBasedSystem__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_12__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_12__3"


    // $ANTLR start "rule__ComponentBasedSystem__Group_12__3__Impl"
    // InternalMyDsl.g:1887:1: rule__ComponentBasedSystem__Group_12__3__Impl : ( ( rule__ComponentBasedSystem__Group_12_3__0 )* ) ;
    public final void rule__ComponentBasedSystem__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1891:1: ( ( ( rule__ComponentBasedSystem__Group_12_3__0 )* ) )
            // InternalMyDsl.g:1892:1: ( ( rule__ComponentBasedSystem__Group_12_3__0 )* )
            {
            // InternalMyDsl.g:1892:1: ( ( rule__ComponentBasedSystem__Group_12_3__0 )* )
            // InternalMyDsl.g:1893:2: ( rule__ComponentBasedSystem__Group_12_3__0 )*
            {
             before(grammarAccess.getComponentBasedSystemAccess().getGroup_12_3()); 
            // InternalMyDsl.g:1894:2: ( rule__ComponentBasedSystem__Group_12_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1894:3: rule__ComponentBasedSystem__Group_12_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ComponentBasedSystem__Group_12_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getComponentBasedSystemAccess().getGroup_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_12__3__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_12__4"
    // InternalMyDsl.g:1902:1: rule__ComponentBasedSystem__Group_12__4 : rule__ComponentBasedSystem__Group_12__4__Impl ;
    public final void rule__ComponentBasedSystem__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1906:1: ( rule__ComponentBasedSystem__Group_12__4__Impl )
            // InternalMyDsl.g:1907:2: rule__ComponentBasedSystem__Group_12__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_12__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_12__4"


    // $ANTLR start "rule__ComponentBasedSystem__Group_12__4__Impl"
    // InternalMyDsl.g:1913:1: rule__ComponentBasedSystem__Group_12__4__Impl : ( '}' ) ;
    public final void rule__ComponentBasedSystem__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1917:1: ( ( '}' ) )
            // InternalMyDsl.g:1918:1: ( '}' )
            {
            // InternalMyDsl.g:1918:1: ( '}' )
            // InternalMyDsl.g:1919:2: '}'
            {
             before(grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_12_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_12_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_12__4__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_12_3__0"
    // InternalMyDsl.g:1929:1: rule__ComponentBasedSystem__Group_12_3__0 : rule__ComponentBasedSystem__Group_12_3__0__Impl rule__ComponentBasedSystem__Group_12_3__1 ;
    public final void rule__ComponentBasedSystem__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1933:1: ( rule__ComponentBasedSystem__Group_12_3__0__Impl rule__ComponentBasedSystem__Group_12_3__1 )
            // InternalMyDsl.g:1934:2: rule__ComponentBasedSystem__Group_12_3__0__Impl rule__ComponentBasedSystem__Group_12_3__1
            {
            pushFollow(FOLLOW_13);
            rule__ComponentBasedSystem__Group_12_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_12_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_12_3__0"


    // $ANTLR start "rule__ComponentBasedSystem__Group_12_3__0__Impl"
    // InternalMyDsl.g:1941:1: rule__ComponentBasedSystem__Group_12_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentBasedSystem__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1945:1: ( ( ',' ) )
            // InternalMyDsl.g:1946:1: ( ',' )
            {
            // InternalMyDsl.g:1946:1: ( ',' )
            // InternalMyDsl.g:1947:2: ','
            {
             before(grammarAccess.getComponentBasedSystemAccess().getCommaKeyword_12_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getCommaKeyword_12_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_12_3__0__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_12_3__1"
    // InternalMyDsl.g:1956:1: rule__ComponentBasedSystem__Group_12_3__1 : rule__ComponentBasedSystem__Group_12_3__1__Impl ;
    public final void rule__ComponentBasedSystem__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1960:1: ( rule__ComponentBasedSystem__Group_12_3__1__Impl )
            // InternalMyDsl.g:1961:2: rule__ComponentBasedSystem__Group_12_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_12_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_12_3__1"


    // $ANTLR start "rule__ComponentBasedSystem__Group_12_3__1__Impl"
    // InternalMyDsl.g:1967:1: rule__ComponentBasedSystem__Group_12_3__1__Impl : ( ( rule__ComponentBasedSystem__TypeAssignment_12_3_1 ) ) ;
    public final void rule__ComponentBasedSystem__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1971:1: ( ( ( rule__ComponentBasedSystem__TypeAssignment_12_3_1 ) ) )
            // InternalMyDsl.g:1972:1: ( ( rule__ComponentBasedSystem__TypeAssignment_12_3_1 ) )
            {
            // InternalMyDsl.g:1972:1: ( ( rule__ComponentBasedSystem__TypeAssignment_12_3_1 ) )
            // InternalMyDsl.g:1973:2: ( rule__ComponentBasedSystem__TypeAssignment_12_3_1 )
            {
             before(grammarAccess.getComponentBasedSystemAccess().getTypeAssignment_12_3_1()); 
            // InternalMyDsl.g:1974:2: ( rule__ComponentBasedSystem__TypeAssignment_12_3_1 )
            // InternalMyDsl.g:1974:3: rule__ComponentBasedSystem__TypeAssignment_12_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__TypeAssignment_12_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentBasedSystemAccess().getTypeAssignment_12_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_12_3__1__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_13__0"
    // InternalMyDsl.g:1983:1: rule__ComponentBasedSystem__Group_13__0 : rule__ComponentBasedSystem__Group_13__0__Impl rule__ComponentBasedSystem__Group_13__1 ;
    public final void rule__ComponentBasedSystem__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1987:1: ( rule__ComponentBasedSystem__Group_13__0__Impl rule__ComponentBasedSystem__Group_13__1 )
            // InternalMyDsl.g:1988:2: rule__ComponentBasedSystem__Group_13__0__Impl rule__ComponentBasedSystem__Group_13__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentBasedSystem__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_13__0"


    // $ANTLR start "rule__ComponentBasedSystem__Group_13__0__Impl"
    // InternalMyDsl.g:1995:1: rule__ComponentBasedSystem__Group_13__0__Impl : ( 'assemblyconnector' ) ;
    public final void rule__ComponentBasedSystem__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1999:1: ( ( 'assemblyconnector' ) )
            // InternalMyDsl.g:2000:1: ( 'assemblyconnector' )
            {
            // InternalMyDsl.g:2000:1: ( 'assemblyconnector' )
            // InternalMyDsl.g:2001:2: 'assemblyconnector'
            {
             before(grammarAccess.getComponentBasedSystemAccess().getAssemblyconnectorKeyword_13_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getAssemblyconnectorKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_13__0__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_13__1"
    // InternalMyDsl.g:2010:1: rule__ComponentBasedSystem__Group_13__1 : rule__ComponentBasedSystem__Group_13__1__Impl rule__ComponentBasedSystem__Group_13__2 ;
    public final void rule__ComponentBasedSystem__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2014:1: ( rule__ComponentBasedSystem__Group_13__1__Impl rule__ComponentBasedSystem__Group_13__2 )
            // InternalMyDsl.g:2015:2: rule__ComponentBasedSystem__Group_13__1__Impl rule__ComponentBasedSystem__Group_13__2
            {
            pushFollow(FOLLOW_14);
            rule__ComponentBasedSystem__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_13__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_13__1"


    // $ANTLR start "rule__ComponentBasedSystem__Group_13__1__Impl"
    // InternalMyDsl.g:2022:1: rule__ComponentBasedSystem__Group_13__1__Impl : ( '{' ) ;
    public final void rule__ComponentBasedSystem__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2026:1: ( ( '{' ) )
            // InternalMyDsl.g:2027:1: ( '{' )
            {
            // InternalMyDsl.g:2027:1: ( '{' )
            // InternalMyDsl.g:2028:2: '{'
            {
             before(grammarAccess.getComponentBasedSystemAccess().getLeftCurlyBracketKeyword_13_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getLeftCurlyBracketKeyword_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_13__1__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_13__2"
    // InternalMyDsl.g:2037:1: rule__ComponentBasedSystem__Group_13__2 : rule__ComponentBasedSystem__Group_13__2__Impl rule__ComponentBasedSystem__Group_13__3 ;
    public final void rule__ComponentBasedSystem__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2041:1: ( rule__ComponentBasedSystem__Group_13__2__Impl rule__ComponentBasedSystem__Group_13__3 )
            // InternalMyDsl.g:2042:2: rule__ComponentBasedSystem__Group_13__2__Impl rule__ComponentBasedSystem__Group_13__3
            {
            pushFollow(FOLLOW_12);
            rule__ComponentBasedSystem__Group_13__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_13__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_13__2"


    // $ANTLR start "rule__ComponentBasedSystem__Group_13__2__Impl"
    // InternalMyDsl.g:2049:1: rule__ComponentBasedSystem__Group_13__2__Impl : ( ( rule__ComponentBasedSystem__AssemblyconnectorAssignment_13_2 ) ) ;
    public final void rule__ComponentBasedSystem__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2053:1: ( ( ( rule__ComponentBasedSystem__AssemblyconnectorAssignment_13_2 ) ) )
            // InternalMyDsl.g:2054:1: ( ( rule__ComponentBasedSystem__AssemblyconnectorAssignment_13_2 ) )
            {
            // InternalMyDsl.g:2054:1: ( ( rule__ComponentBasedSystem__AssemblyconnectorAssignment_13_2 ) )
            // InternalMyDsl.g:2055:2: ( rule__ComponentBasedSystem__AssemblyconnectorAssignment_13_2 )
            {
             before(grammarAccess.getComponentBasedSystemAccess().getAssemblyconnectorAssignment_13_2()); 
            // InternalMyDsl.g:2056:2: ( rule__ComponentBasedSystem__AssemblyconnectorAssignment_13_2 )
            // InternalMyDsl.g:2056:3: rule__ComponentBasedSystem__AssemblyconnectorAssignment_13_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__AssemblyconnectorAssignment_13_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentBasedSystemAccess().getAssemblyconnectorAssignment_13_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_13__2__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_13__3"
    // InternalMyDsl.g:2064:1: rule__ComponentBasedSystem__Group_13__3 : rule__ComponentBasedSystem__Group_13__3__Impl rule__ComponentBasedSystem__Group_13__4 ;
    public final void rule__ComponentBasedSystem__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2068:1: ( rule__ComponentBasedSystem__Group_13__3__Impl rule__ComponentBasedSystem__Group_13__4 )
            // InternalMyDsl.g:2069:2: rule__ComponentBasedSystem__Group_13__3__Impl rule__ComponentBasedSystem__Group_13__4
            {
            pushFollow(FOLLOW_12);
            rule__ComponentBasedSystem__Group_13__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_13__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_13__3"


    // $ANTLR start "rule__ComponentBasedSystem__Group_13__3__Impl"
    // InternalMyDsl.g:2076:1: rule__ComponentBasedSystem__Group_13__3__Impl : ( ( rule__ComponentBasedSystem__Group_13_3__0 )* ) ;
    public final void rule__ComponentBasedSystem__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2080:1: ( ( ( rule__ComponentBasedSystem__Group_13_3__0 )* ) )
            // InternalMyDsl.g:2081:1: ( ( rule__ComponentBasedSystem__Group_13_3__0 )* )
            {
            // InternalMyDsl.g:2081:1: ( ( rule__ComponentBasedSystem__Group_13_3__0 )* )
            // InternalMyDsl.g:2082:2: ( rule__ComponentBasedSystem__Group_13_3__0 )*
            {
             before(grammarAccess.getComponentBasedSystemAccess().getGroup_13_3()); 
            // InternalMyDsl.g:2083:2: ( rule__ComponentBasedSystem__Group_13_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:2083:3: rule__ComponentBasedSystem__Group_13_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ComponentBasedSystem__Group_13_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getComponentBasedSystemAccess().getGroup_13_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_13__3__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_13__4"
    // InternalMyDsl.g:2091:1: rule__ComponentBasedSystem__Group_13__4 : rule__ComponentBasedSystem__Group_13__4__Impl ;
    public final void rule__ComponentBasedSystem__Group_13__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2095:1: ( rule__ComponentBasedSystem__Group_13__4__Impl )
            // InternalMyDsl.g:2096:2: rule__ComponentBasedSystem__Group_13__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_13__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_13__4"


    // $ANTLR start "rule__ComponentBasedSystem__Group_13__4__Impl"
    // InternalMyDsl.g:2102:1: rule__ComponentBasedSystem__Group_13__4__Impl : ( '}' ) ;
    public final void rule__ComponentBasedSystem__Group_13__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2106:1: ( ( '}' ) )
            // InternalMyDsl.g:2107:1: ( '}' )
            {
            // InternalMyDsl.g:2107:1: ( '}' )
            // InternalMyDsl.g:2108:2: '}'
            {
             before(grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_13_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_13_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_13__4__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_13_3__0"
    // InternalMyDsl.g:2118:1: rule__ComponentBasedSystem__Group_13_3__0 : rule__ComponentBasedSystem__Group_13_3__0__Impl rule__ComponentBasedSystem__Group_13_3__1 ;
    public final void rule__ComponentBasedSystem__Group_13_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2122:1: ( rule__ComponentBasedSystem__Group_13_3__0__Impl rule__ComponentBasedSystem__Group_13_3__1 )
            // InternalMyDsl.g:2123:2: rule__ComponentBasedSystem__Group_13_3__0__Impl rule__ComponentBasedSystem__Group_13_3__1
            {
            pushFollow(FOLLOW_14);
            rule__ComponentBasedSystem__Group_13_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_13_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_13_3__0"


    // $ANTLR start "rule__ComponentBasedSystem__Group_13_3__0__Impl"
    // InternalMyDsl.g:2130:1: rule__ComponentBasedSystem__Group_13_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentBasedSystem__Group_13_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2134:1: ( ( ',' ) )
            // InternalMyDsl.g:2135:1: ( ',' )
            {
            // InternalMyDsl.g:2135:1: ( ',' )
            // InternalMyDsl.g:2136:2: ','
            {
             before(grammarAccess.getComponentBasedSystemAccess().getCommaKeyword_13_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComponentBasedSystemAccess().getCommaKeyword_13_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_13_3__0__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__Group_13_3__1"
    // InternalMyDsl.g:2145:1: rule__ComponentBasedSystem__Group_13_3__1 : rule__ComponentBasedSystem__Group_13_3__1__Impl ;
    public final void rule__ComponentBasedSystem__Group_13_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2149:1: ( rule__ComponentBasedSystem__Group_13_3__1__Impl )
            // InternalMyDsl.g:2150:2: rule__ComponentBasedSystem__Group_13_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__Group_13_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_13_3__1"


    // $ANTLR start "rule__ComponentBasedSystem__Group_13_3__1__Impl"
    // InternalMyDsl.g:2156:1: rule__ComponentBasedSystem__Group_13_3__1__Impl : ( ( rule__ComponentBasedSystem__AssemblyconnectorAssignment_13_3_1 ) ) ;
    public final void rule__ComponentBasedSystem__Group_13_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2160:1: ( ( ( rule__ComponentBasedSystem__AssemblyconnectorAssignment_13_3_1 ) ) )
            // InternalMyDsl.g:2161:1: ( ( rule__ComponentBasedSystem__AssemblyconnectorAssignment_13_3_1 ) )
            {
            // InternalMyDsl.g:2161:1: ( ( rule__ComponentBasedSystem__AssemblyconnectorAssignment_13_3_1 ) )
            // InternalMyDsl.g:2162:2: ( rule__ComponentBasedSystem__AssemblyconnectorAssignment_13_3_1 )
            {
             before(grammarAccess.getComponentBasedSystemAccess().getAssemblyconnectorAssignment_13_3_1()); 
            // InternalMyDsl.g:2163:2: ( rule__ComponentBasedSystem__AssemblyconnectorAssignment_13_3_1 )
            // InternalMyDsl.g:2163:3: rule__ComponentBasedSystem__AssemblyconnectorAssignment_13_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBasedSystem__AssemblyconnectorAssignment_13_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentBasedSystemAccess().getAssemblyconnectorAssignment_13_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__Group_13_3__1__Impl"


    // $ANTLR start "rule__Interface__Group__0"
    // InternalMyDsl.g:2172:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2176:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // InternalMyDsl.g:2177:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Interface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__0"


    // $ANTLR start "rule__Interface__Group__0__Impl"
    // InternalMyDsl.g:2184:1: rule__Interface__Group__0__Impl : ( () ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2188:1: ( ( () ) )
            // InternalMyDsl.g:2189:1: ( () )
            {
            // InternalMyDsl.g:2189:1: ( () )
            // InternalMyDsl.g:2190:2: ()
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceAction_0()); 
            // InternalMyDsl.g:2191:2: ()
            // InternalMyDsl.g:2191:3: 
            {
            }

             after(grammarAccess.getInterfaceAccess().getInterfaceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__0__Impl"


    // $ANTLR start "rule__Interface__Group__1"
    // InternalMyDsl.g:2199:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2203:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // InternalMyDsl.g:2204:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Interface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__1"


    // $ANTLR start "rule__Interface__Group__1__Impl"
    // InternalMyDsl.g:2211:1: rule__Interface__Group__1__Impl : ( 'Interface' ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2215:1: ( ( 'Interface' ) )
            // InternalMyDsl.g:2216:1: ( 'Interface' )
            {
            // InternalMyDsl.g:2216:1: ( 'Interface' )
            // InternalMyDsl.g:2217:2: 'Interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getInterfaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__1__Impl"


    // $ANTLR start "rule__Interface__Group__2"
    // InternalMyDsl.g:2226:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2230:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // InternalMyDsl.g:2231:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Interface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__2"


    // $ANTLR start "rule__Interface__Group__2__Impl"
    // InternalMyDsl.g:2238:1: rule__Interface__Group__2__Impl : ( ( rule__Interface__NameAssignment_2 ) ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2242:1: ( ( ( rule__Interface__NameAssignment_2 ) ) )
            // InternalMyDsl.g:2243:1: ( ( rule__Interface__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:2243:1: ( ( rule__Interface__NameAssignment_2 ) )
            // InternalMyDsl.g:2244:2: ( rule__Interface__NameAssignment_2 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2245:2: ( rule__Interface__NameAssignment_2 )
            // InternalMyDsl.g:2245:3: rule__Interface__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Interface__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__2__Impl"


    // $ANTLR start "rule__Interface__Group__3"
    // InternalMyDsl.g:2253:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2257:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // InternalMyDsl.g:2258:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Interface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__3"


    // $ANTLR start "rule__Interface__Group__3__Impl"
    // InternalMyDsl.g:2265:1: rule__Interface__Group__3__Impl : ( '{' ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2269:1: ( ( '{' ) )
            // InternalMyDsl.g:2270:1: ( '{' )
            {
            // InternalMyDsl.g:2270:1: ( '{' )
            // InternalMyDsl.g:2271:2: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__3__Impl"


    // $ANTLR start "rule__Interface__Group__4"
    // InternalMyDsl.g:2280:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl rule__Interface__Group__5 ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2284:1: ( rule__Interface__Group__4__Impl rule__Interface__Group__5 )
            // InternalMyDsl.g:2285:2: rule__Interface__Group__4__Impl rule__Interface__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Interface__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__4"


    // $ANTLR start "rule__Interface__Group__4__Impl"
    // InternalMyDsl.g:2292:1: rule__Interface__Group__4__Impl : ( ( rule__Interface__Group_4__0 )? ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2296:1: ( ( ( rule__Interface__Group_4__0 )? ) )
            // InternalMyDsl.g:2297:1: ( ( rule__Interface__Group_4__0 )? )
            {
            // InternalMyDsl.g:2297:1: ( ( rule__Interface__Group_4__0 )? )
            // InternalMyDsl.g:2298:2: ( rule__Interface__Group_4__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_4()); 
            // InternalMyDsl.g:2299:2: ( rule__Interface__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:2299:3: rule__Interface__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Interface__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__4__Impl"


    // $ANTLR start "rule__Interface__Group__5"
    // InternalMyDsl.g:2307:1: rule__Interface__Group__5 : rule__Interface__Group__5__Impl ;
    public final void rule__Interface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2311:1: ( rule__Interface__Group__5__Impl )
            // InternalMyDsl.g:2312:2: rule__Interface__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__5"


    // $ANTLR start "rule__Interface__Group__5__Impl"
    // InternalMyDsl.g:2318:1: rule__Interface__Group__5__Impl : ( '}' ) ;
    public final void rule__Interface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2322:1: ( ( '}' ) )
            // InternalMyDsl.g:2323:1: ( '}' )
            {
            // InternalMyDsl.g:2323:1: ( '}' )
            // InternalMyDsl.g:2324:2: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__5__Impl"


    // $ANTLR start "rule__Interface__Group_4__0"
    // InternalMyDsl.g:2334:1: rule__Interface__Group_4__0 : rule__Interface__Group_4__0__Impl rule__Interface__Group_4__1 ;
    public final void rule__Interface__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2338:1: ( rule__Interface__Group_4__0__Impl rule__Interface__Group_4__1 )
            // InternalMyDsl.g:2339:2: rule__Interface__Group_4__0__Impl rule__Interface__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Interface__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__0"


    // $ANTLR start "rule__Interface__Group_4__0__Impl"
    // InternalMyDsl.g:2346:1: rule__Interface__Group_4__0__Impl : ( 'signature' ) ;
    public final void rule__Interface__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2350:1: ( ( 'signature' ) )
            // InternalMyDsl.g:2351:1: ( 'signature' )
            {
            // InternalMyDsl.g:2351:1: ( 'signature' )
            // InternalMyDsl.g:2352:2: 'signature'
            {
             before(grammarAccess.getInterfaceAccess().getSignatureKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getSignatureKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__0__Impl"


    // $ANTLR start "rule__Interface__Group_4__1"
    // InternalMyDsl.g:2361:1: rule__Interface__Group_4__1 : rule__Interface__Group_4__1__Impl rule__Interface__Group_4__2 ;
    public final void rule__Interface__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2365:1: ( rule__Interface__Group_4__1__Impl rule__Interface__Group_4__2 )
            // InternalMyDsl.g:2366:2: rule__Interface__Group_4__1__Impl rule__Interface__Group_4__2
            {
            pushFollow(FOLLOW_17);
            rule__Interface__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__1"


    // $ANTLR start "rule__Interface__Group_4__1__Impl"
    // InternalMyDsl.g:2373:1: rule__Interface__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Interface__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2377:1: ( ( '{' ) )
            // InternalMyDsl.g:2378:1: ( '{' )
            {
            // InternalMyDsl.g:2378:1: ( '{' )
            // InternalMyDsl.g:2379:2: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__1__Impl"


    // $ANTLR start "rule__Interface__Group_4__2"
    // InternalMyDsl.g:2388:1: rule__Interface__Group_4__2 : rule__Interface__Group_4__2__Impl rule__Interface__Group_4__3 ;
    public final void rule__Interface__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2392:1: ( rule__Interface__Group_4__2__Impl rule__Interface__Group_4__3 )
            // InternalMyDsl.g:2393:2: rule__Interface__Group_4__2__Impl rule__Interface__Group_4__3
            {
            pushFollow(FOLLOW_12);
            rule__Interface__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__2"


    // $ANTLR start "rule__Interface__Group_4__2__Impl"
    // InternalMyDsl.g:2400:1: rule__Interface__Group_4__2__Impl : ( ( rule__Interface__SignatureAssignment_4_2 ) ) ;
    public final void rule__Interface__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2404:1: ( ( ( rule__Interface__SignatureAssignment_4_2 ) ) )
            // InternalMyDsl.g:2405:1: ( ( rule__Interface__SignatureAssignment_4_2 ) )
            {
            // InternalMyDsl.g:2405:1: ( ( rule__Interface__SignatureAssignment_4_2 ) )
            // InternalMyDsl.g:2406:2: ( rule__Interface__SignatureAssignment_4_2 )
            {
             before(grammarAccess.getInterfaceAccess().getSignatureAssignment_4_2()); 
            // InternalMyDsl.g:2407:2: ( rule__Interface__SignatureAssignment_4_2 )
            // InternalMyDsl.g:2407:3: rule__Interface__SignatureAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Interface__SignatureAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getSignatureAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__2__Impl"


    // $ANTLR start "rule__Interface__Group_4__3"
    // InternalMyDsl.g:2415:1: rule__Interface__Group_4__3 : rule__Interface__Group_4__3__Impl rule__Interface__Group_4__4 ;
    public final void rule__Interface__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2419:1: ( rule__Interface__Group_4__3__Impl rule__Interface__Group_4__4 )
            // InternalMyDsl.g:2420:2: rule__Interface__Group_4__3__Impl rule__Interface__Group_4__4
            {
            pushFollow(FOLLOW_12);
            rule__Interface__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__3"


    // $ANTLR start "rule__Interface__Group_4__3__Impl"
    // InternalMyDsl.g:2427:1: rule__Interface__Group_4__3__Impl : ( ( rule__Interface__Group_4_3__0 )* ) ;
    public final void rule__Interface__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2431:1: ( ( ( rule__Interface__Group_4_3__0 )* ) )
            // InternalMyDsl.g:2432:1: ( ( rule__Interface__Group_4_3__0 )* )
            {
            // InternalMyDsl.g:2432:1: ( ( rule__Interface__Group_4_3__0 )* )
            // InternalMyDsl.g:2433:2: ( rule__Interface__Group_4_3__0 )*
            {
             before(grammarAccess.getInterfaceAccess().getGroup_4_3()); 
            // InternalMyDsl.g:2434:2: ( rule__Interface__Group_4_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==28) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:2434:3: rule__Interface__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Interface__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getInterfaceAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__3__Impl"


    // $ANTLR start "rule__Interface__Group_4__4"
    // InternalMyDsl.g:2442:1: rule__Interface__Group_4__4 : rule__Interface__Group_4__4__Impl ;
    public final void rule__Interface__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2446:1: ( rule__Interface__Group_4__4__Impl )
            // InternalMyDsl.g:2447:2: rule__Interface__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__4"


    // $ANTLR start "rule__Interface__Group_4__4__Impl"
    // InternalMyDsl.g:2453:1: rule__Interface__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Interface__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2457:1: ( ( '}' ) )
            // InternalMyDsl.g:2458:1: ( '}' )
            {
            // InternalMyDsl.g:2458:1: ( '}' )
            // InternalMyDsl.g:2459:2: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__4__Impl"


    // $ANTLR start "rule__Interface__Group_4_3__0"
    // InternalMyDsl.g:2469:1: rule__Interface__Group_4_3__0 : rule__Interface__Group_4_3__0__Impl rule__Interface__Group_4_3__1 ;
    public final void rule__Interface__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2473:1: ( rule__Interface__Group_4_3__0__Impl rule__Interface__Group_4_3__1 )
            // InternalMyDsl.g:2474:2: rule__Interface__Group_4_3__0__Impl rule__Interface__Group_4_3__1
            {
            pushFollow(FOLLOW_17);
            rule__Interface__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4_3__0"


    // $ANTLR start "rule__Interface__Group_4_3__0__Impl"
    // InternalMyDsl.g:2481:1: rule__Interface__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Interface__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2485:1: ( ( ',' ) )
            // InternalMyDsl.g:2486:1: ( ',' )
            {
            // InternalMyDsl.g:2486:1: ( ',' )
            // InternalMyDsl.g:2487:2: ','
            {
             before(grammarAccess.getInterfaceAccess().getCommaKeyword_4_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4_3__0__Impl"


    // $ANTLR start "rule__Interface__Group_4_3__1"
    // InternalMyDsl.g:2496:1: rule__Interface__Group_4_3__1 : rule__Interface__Group_4_3__1__Impl ;
    public final void rule__Interface__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2500:1: ( rule__Interface__Group_4_3__1__Impl )
            // InternalMyDsl.g:2501:2: rule__Interface__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4_3__1"


    // $ANTLR start "rule__Interface__Group_4_3__1__Impl"
    // InternalMyDsl.g:2507:1: rule__Interface__Group_4_3__1__Impl : ( ( rule__Interface__SignatureAssignment_4_3_1 ) ) ;
    public final void rule__Interface__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2511:1: ( ( ( rule__Interface__SignatureAssignment_4_3_1 ) ) )
            // InternalMyDsl.g:2512:1: ( ( rule__Interface__SignatureAssignment_4_3_1 ) )
            {
            // InternalMyDsl.g:2512:1: ( ( rule__Interface__SignatureAssignment_4_3_1 ) )
            // InternalMyDsl.g:2513:2: ( rule__Interface__SignatureAssignment_4_3_1 )
            {
             before(grammarAccess.getInterfaceAccess().getSignatureAssignment_4_3_1()); 
            // InternalMyDsl.g:2514:2: ( rule__Interface__SignatureAssignment_4_3_1 )
            // InternalMyDsl.g:2514:3: rule__Interface__SignatureAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Interface__SignatureAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getSignatureAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4_3__1__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__0"
    // InternalMyDsl.g:2523:1: rule__AssemblyContext__Group__0 : rule__AssemblyContext__Group__0__Impl rule__AssemblyContext__Group__1 ;
    public final void rule__AssemblyContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2527:1: ( rule__AssemblyContext__Group__0__Impl rule__AssemblyContext__Group__1 )
            // InternalMyDsl.g:2528:2: rule__AssemblyContext__Group__0__Impl rule__AssemblyContext__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__AssemblyContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__0"


    // $ANTLR start "rule__AssemblyContext__Group__0__Impl"
    // InternalMyDsl.g:2535:1: rule__AssemblyContext__Group__0__Impl : ( 'AssemblyContext' ) ;
    public final void rule__AssemblyContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2539:1: ( ( 'AssemblyContext' ) )
            // InternalMyDsl.g:2540:1: ( 'AssemblyContext' )
            {
            // InternalMyDsl.g:2540:1: ( 'AssemblyContext' )
            // InternalMyDsl.g:2541:2: 'AssemblyContext'
            {
             before(grammarAccess.getAssemblyContextAccess().getAssemblyContextKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getAssemblyContextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__0__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__1"
    // InternalMyDsl.g:2550:1: rule__AssemblyContext__Group__1 : rule__AssemblyContext__Group__1__Impl rule__AssemblyContext__Group__2 ;
    public final void rule__AssemblyContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2554:1: ( rule__AssemblyContext__Group__1__Impl rule__AssemblyContext__Group__2 )
            // InternalMyDsl.g:2555:2: rule__AssemblyContext__Group__1__Impl rule__AssemblyContext__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__AssemblyContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__1"


    // $ANTLR start "rule__AssemblyContext__Group__1__Impl"
    // InternalMyDsl.g:2562:1: rule__AssemblyContext__Group__1__Impl : ( ( rule__AssemblyContext__NameAssignment_1 ) ) ;
    public final void rule__AssemblyContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2566:1: ( ( ( rule__AssemblyContext__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2567:1: ( ( rule__AssemblyContext__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2567:1: ( ( rule__AssemblyContext__NameAssignment_1 ) )
            // InternalMyDsl.g:2568:2: ( rule__AssemblyContext__NameAssignment_1 )
            {
             before(grammarAccess.getAssemblyContextAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2569:2: ( rule__AssemblyContext__NameAssignment_1 )
            // InternalMyDsl.g:2569:3: rule__AssemblyContext__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__1__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__2"
    // InternalMyDsl.g:2577:1: rule__AssemblyContext__Group__2 : rule__AssemblyContext__Group__2__Impl rule__AssemblyContext__Group__3 ;
    public final void rule__AssemblyContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2581:1: ( rule__AssemblyContext__Group__2__Impl rule__AssemblyContext__Group__3 )
            // InternalMyDsl.g:2582:2: rule__AssemblyContext__Group__2__Impl rule__AssemblyContext__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__AssemblyContext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__2"


    // $ANTLR start "rule__AssemblyContext__Group__2__Impl"
    // InternalMyDsl.g:2589:1: rule__AssemblyContext__Group__2__Impl : ( '{' ) ;
    public final void rule__AssemblyContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2593:1: ( ( '{' ) )
            // InternalMyDsl.g:2594:1: ( '{' )
            {
            // InternalMyDsl.g:2594:1: ( '{' )
            // InternalMyDsl.g:2595:2: '{'
            {
             before(grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__2__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__3"
    // InternalMyDsl.g:2604:1: rule__AssemblyContext__Group__3 : rule__AssemblyContext__Group__3__Impl rule__AssemblyContext__Group__4 ;
    public final void rule__AssemblyContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2608:1: ( rule__AssemblyContext__Group__3__Impl rule__AssemblyContext__Group__4 )
            // InternalMyDsl.g:2609:2: rule__AssemblyContext__Group__3__Impl rule__AssemblyContext__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__AssemblyContext__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__3"


    // $ANTLR start "rule__AssemblyContext__Group__3__Impl"
    // InternalMyDsl.g:2616:1: rule__AssemblyContext__Group__3__Impl : ( 'component' ) ;
    public final void rule__AssemblyContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2620:1: ( ( 'component' ) )
            // InternalMyDsl.g:2621:1: ( 'component' )
            {
            // InternalMyDsl.g:2621:1: ( 'component' )
            // InternalMyDsl.g:2622:2: 'component'
            {
             before(grammarAccess.getAssemblyContextAccess().getComponentKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getComponentKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__3__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__4"
    // InternalMyDsl.g:2631:1: rule__AssemblyContext__Group__4 : rule__AssemblyContext__Group__4__Impl rule__AssemblyContext__Group__5 ;
    public final void rule__AssemblyContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2635:1: ( rule__AssemblyContext__Group__4__Impl rule__AssemblyContext__Group__5 )
            // InternalMyDsl.g:2636:2: rule__AssemblyContext__Group__4__Impl rule__AssemblyContext__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__AssemblyContext__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__4"


    // $ANTLR start "rule__AssemblyContext__Group__4__Impl"
    // InternalMyDsl.g:2643:1: rule__AssemblyContext__Group__4__Impl : ( ( rule__AssemblyContext__ComponentAssignment_4 ) ) ;
    public final void rule__AssemblyContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2647:1: ( ( ( rule__AssemblyContext__ComponentAssignment_4 ) ) )
            // InternalMyDsl.g:2648:1: ( ( rule__AssemblyContext__ComponentAssignment_4 ) )
            {
            // InternalMyDsl.g:2648:1: ( ( rule__AssemblyContext__ComponentAssignment_4 ) )
            // InternalMyDsl.g:2649:2: ( rule__AssemblyContext__ComponentAssignment_4 )
            {
             before(grammarAccess.getAssemblyContextAccess().getComponentAssignment_4()); 
            // InternalMyDsl.g:2650:2: ( rule__AssemblyContext__ComponentAssignment_4 )
            // InternalMyDsl.g:2650:3: rule__AssemblyContext__ComponentAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__ComponentAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getComponentAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__4__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__5"
    // InternalMyDsl.g:2658:1: rule__AssemblyContext__Group__5 : rule__AssemblyContext__Group__5__Impl ;
    public final void rule__AssemblyContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2662:1: ( rule__AssemblyContext__Group__5__Impl )
            // InternalMyDsl.g:2663:2: rule__AssemblyContext__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__5"


    // $ANTLR start "rule__AssemblyContext__Group__5__Impl"
    // InternalMyDsl.g:2669:1: rule__AssemblyContext__Group__5__Impl : ( '}' ) ;
    public final void rule__AssemblyContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2673:1: ( ( '}' ) )
            // InternalMyDsl.g:2674:1: ( '}' )
            {
            // InternalMyDsl.g:2674:1: ( '}' )
            // InternalMyDsl.g:2675:2: '}'
            {
             before(grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__5__Impl"


    // $ANTLR start "rule__Type_Impl__Group__0"
    // InternalMyDsl.g:2685:1: rule__Type_Impl__Group__0 : rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1 ;
    public final void rule__Type_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2689:1: ( rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1 )
            // InternalMyDsl.g:2690:2: rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Type_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__0"


    // $ANTLR start "rule__Type_Impl__Group__0__Impl"
    // InternalMyDsl.g:2697:1: rule__Type_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Type_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2701:1: ( ( () ) )
            // InternalMyDsl.g:2702:1: ( () )
            {
            // InternalMyDsl.g:2702:1: ( () )
            // InternalMyDsl.g:2703:2: ()
            {
             before(grammarAccess.getType_ImplAccess().getTypeAction_0()); 
            // InternalMyDsl.g:2704:2: ()
            // InternalMyDsl.g:2704:3: 
            {
            }

             after(grammarAccess.getType_ImplAccess().getTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__0__Impl"


    // $ANTLR start "rule__Type_Impl__Group__1"
    // InternalMyDsl.g:2712:1: rule__Type_Impl__Group__1 : rule__Type_Impl__Group__1__Impl rule__Type_Impl__Group__2 ;
    public final void rule__Type_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2716:1: ( rule__Type_Impl__Group__1__Impl rule__Type_Impl__Group__2 )
            // InternalMyDsl.g:2717:2: rule__Type_Impl__Group__1__Impl rule__Type_Impl__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Type_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__1"


    // $ANTLR start "rule__Type_Impl__Group__1__Impl"
    // InternalMyDsl.g:2724:1: rule__Type_Impl__Group__1__Impl : ( 'Type' ) ;
    public final void rule__Type_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2728:1: ( ( 'Type' ) )
            // InternalMyDsl.g:2729:1: ( 'Type' )
            {
            // InternalMyDsl.g:2729:1: ( 'Type' )
            // InternalMyDsl.g:2730:2: 'Type'
            {
             before(grammarAccess.getType_ImplAccess().getTypeKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getType_ImplAccess().getTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__1__Impl"


    // $ANTLR start "rule__Type_Impl__Group__2"
    // InternalMyDsl.g:2739:1: rule__Type_Impl__Group__2 : rule__Type_Impl__Group__2__Impl ;
    public final void rule__Type_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2743:1: ( rule__Type_Impl__Group__2__Impl )
            // InternalMyDsl.g:2744:2: rule__Type_Impl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type_Impl__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__2"


    // $ANTLR start "rule__Type_Impl__Group__2__Impl"
    // InternalMyDsl.g:2750:1: rule__Type_Impl__Group__2__Impl : ( ( rule__Type_Impl__NameAssignment_2 ) ) ;
    public final void rule__Type_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2754:1: ( ( ( rule__Type_Impl__NameAssignment_2 ) ) )
            // InternalMyDsl.g:2755:1: ( ( rule__Type_Impl__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:2755:1: ( ( rule__Type_Impl__NameAssignment_2 ) )
            // InternalMyDsl.g:2756:2: ( rule__Type_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getType_ImplAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2757:2: ( rule__Type_Impl__NameAssignment_2 )
            // InternalMyDsl.g:2757:3: rule__Type_Impl__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Type_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getType_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__2__Impl"


    // $ANTLR start "rule__AssemblyConnector__Group__0"
    // InternalMyDsl.g:2766:1: rule__AssemblyConnector__Group__0 : rule__AssemblyConnector__Group__0__Impl rule__AssemblyConnector__Group__1 ;
    public final void rule__AssemblyConnector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2770:1: ( rule__AssemblyConnector__Group__0__Impl rule__AssemblyConnector__Group__1 )
            // InternalMyDsl.g:2771:2: rule__AssemblyConnector__Group__0__Impl rule__AssemblyConnector__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__AssemblyConnector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__0"


    // $ANTLR start "rule__AssemblyConnector__Group__0__Impl"
    // InternalMyDsl.g:2778:1: rule__AssemblyConnector__Group__0__Impl : ( 'AssemblyConnector' ) ;
    public final void rule__AssemblyConnector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2782:1: ( ( 'AssemblyConnector' ) )
            // InternalMyDsl.g:2783:1: ( 'AssemblyConnector' )
            {
            // InternalMyDsl.g:2783:1: ( 'AssemblyConnector' )
            // InternalMyDsl.g:2784:2: 'AssemblyConnector'
            {
             before(grammarAccess.getAssemblyConnectorAccess().getAssemblyConnectorKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAssemblyConnectorAccess().getAssemblyConnectorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__0__Impl"


    // $ANTLR start "rule__AssemblyConnector__Group__1"
    // InternalMyDsl.g:2793:1: rule__AssemblyConnector__Group__1 : rule__AssemblyConnector__Group__1__Impl rule__AssemblyConnector__Group__2 ;
    public final void rule__AssemblyConnector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2797:1: ( rule__AssemblyConnector__Group__1__Impl rule__AssemblyConnector__Group__2 )
            // InternalMyDsl.g:2798:2: rule__AssemblyConnector__Group__1__Impl rule__AssemblyConnector__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__AssemblyConnector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__1"


    // $ANTLR start "rule__AssemblyConnector__Group__1__Impl"
    // InternalMyDsl.g:2805:1: rule__AssemblyConnector__Group__1__Impl : ( ( rule__AssemblyConnector__NameAssignment_1 ) ) ;
    public final void rule__AssemblyConnector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2809:1: ( ( ( rule__AssemblyConnector__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2810:1: ( ( rule__AssemblyConnector__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2810:1: ( ( rule__AssemblyConnector__NameAssignment_1 ) )
            // InternalMyDsl.g:2811:2: ( rule__AssemblyConnector__NameAssignment_1 )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2812:2: ( rule__AssemblyConnector__NameAssignment_1 )
            // InternalMyDsl.g:2812:3: rule__AssemblyConnector__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyConnectorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__1__Impl"


    // $ANTLR start "rule__AssemblyConnector__Group__2"
    // InternalMyDsl.g:2820:1: rule__AssemblyConnector__Group__2 : rule__AssemblyConnector__Group__2__Impl rule__AssemblyConnector__Group__3 ;
    public final void rule__AssemblyConnector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2824:1: ( rule__AssemblyConnector__Group__2__Impl rule__AssemblyConnector__Group__3 )
            // InternalMyDsl.g:2825:2: rule__AssemblyConnector__Group__2__Impl rule__AssemblyConnector__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__AssemblyConnector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__2"


    // $ANTLR start "rule__AssemblyConnector__Group__2__Impl"
    // InternalMyDsl.g:2832:1: rule__AssemblyConnector__Group__2__Impl : ( '{' ) ;
    public final void rule__AssemblyConnector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2836:1: ( ( '{' ) )
            // InternalMyDsl.g:2837:1: ( '{' )
            {
            // InternalMyDsl.g:2837:1: ( '{' )
            // InternalMyDsl.g:2838:2: '{'
            {
             before(grammarAccess.getAssemblyConnectorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAssemblyConnectorAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__2__Impl"


    // $ANTLR start "rule__AssemblyConnector__Group__3"
    // InternalMyDsl.g:2847:1: rule__AssemblyConnector__Group__3 : rule__AssemblyConnector__Group__3__Impl rule__AssemblyConnector__Group__4 ;
    public final void rule__AssemblyConnector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2851:1: ( rule__AssemblyConnector__Group__3__Impl rule__AssemblyConnector__Group__4 )
            // InternalMyDsl.g:2852:2: rule__AssemblyConnector__Group__3__Impl rule__AssemblyConnector__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__AssemblyConnector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__3"


    // $ANTLR start "rule__AssemblyConnector__Group__3__Impl"
    // InternalMyDsl.g:2859:1: rule__AssemblyConnector__Group__3__Impl : ( 'providedrole' ) ;
    public final void rule__AssemblyConnector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2863:1: ( ( 'providedrole' ) )
            // InternalMyDsl.g:2864:1: ( 'providedrole' )
            {
            // InternalMyDsl.g:2864:1: ( 'providedrole' )
            // InternalMyDsl.g:2865:2: 'providedrole'
            {
             before(grammarAccess.getAssemblyConnectorAccess().getProvidedroleKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAssemblyConnectorAccess().getProvidedroleKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__3__Impl"


    // $ANTLR start "rule__AssemblyConnector__Group__4"
    // InternalMyDsl.g:2874:1: rule__AssemblyConnector__Group__4 : rule__AssemblyConnector__Group__4__Impl rule__AssemblyConnector__Group__5 ;
    public final void rule__AssemblyConnector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2878:1: ( rule__AssemblyConnector__Group__4__Impl rule__AssemblyConnector__Group__5 )
            // InternalMyDsl.g:2879:2: rule__AssemblyConnector__Group__4__Impl rule__AssemblyConnector__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__AssemblyConnector__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__4"


    // $ANTLR start "rule__AssemblyConnector__Group__4__Impl"
    // InternalMyDsl.g:2886:1: rule__AssemblyConnector__Group__4__Impl : ( ( rule__AssemblyConnector__ProvidedroleAssignment_4 ) ) ;
    public final void rule__AssemblyConnector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2890:1: ( ( ( rule__AssemblyConnector__ProvidedroleAssignment_4 ) ) )
            // InternalMyDsl.g:2891:1: ( ( rule__AssemblyConnector__ProvidedroleAssignment_4 ) )
            {
            // InternalMyDsl.g:2891:1: ( ( rule__AssemblyConnector__ProvidedroleAssignment_4 ) )
            // InternalMyDsl.g:2892:2: ( rule__AssemblyConnector__ProvidedroleAssignment_4 )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getProvidedroleAssignment_4()); 
            // InternalMyDsl.g:2893:2: ( rule__AssemblyConnector__ProvidedroleAssignment_4 )
            // InternalMyDsl.g:2893:3: rule__AssemblyConnector__ProvidedroleAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__ProvidedroleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyConnectorAccess().getProvidedroleAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__4__Impl"


    // $ANTLR start "rule__AssemblyConnector__Group__5"
    // InternalMyDsl.g:2901:1: rule__AssemblyConnector__Group__5 : rule__AssemblyConnector__Group__5__Impl rule__AssemblyConnector__Group__6 ;
    public final void rule__AssemblyConnector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2905:1: ( rule__AssemblyConnector__Group__5__Impl rule__AssemblyConnector__Group__6 )
            // InternalMyDsl.g:2906:2: rule__AssemblyConnector__Group__5__Impl rule__AssemblyConnector__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__AssemblyConnector__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__5"


    // $ANTLR start "rule__AssemblyConnector__Group__5__Impl"
    // InternalMyDsl.g:2913:1: rule__AssemblyConnector__Group__5__Impl : ( 'requiredrole' ) ;
    public final void rule__AssemblyConnector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2917:1: ( ( 'requiredrole' ) )
            // InternalMyDsl.g:2918:1: ( 'requiredrole' )
            {
            // InternalMyDsl.g:2918:1: ( 'requiredrole' )
            // InternalMyDsl.g:2919:2: 'requiredrole'
            {
             before(grammarAccess.getAssemblyConnectorAccess().getRequiredroleKeyword_5()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAssemblyConnectorAccess().getRequiredroleKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__5__Impl"


    // $ANTLR start "rule__AssemblyConnector__Group__6"
    // InternalMyDsl.g:2928:1: rule__AssemblyConnector__Group__6 : rule__AssemblyConnector__Group__6__Impl rule__AssemblyConnector__Group__7 ;
    public final void rule__AssemblyConnector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2932:1: ( rule__AssemblyConnector__Group__6__Impl rule__AssemblyConnector__Group__7 )
            // InternalMyDsl.g:2933:2: rule__AssemblyConnector__Group__6__Impl rule__AssemblyConnector__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__AssemblyConnector__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__6"


    // $ANTLR start "rule__AssemblyConnector__Group__6__Impl"
    // InternalMyDsl.g:2940:1: rule__AssemblyConnector__Group__6__Impl : ( ( rule__AssemblyConnector__RequiredroleAssignment_6 ) ) ;
    public final void rule__AssemblyConnector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2944:1: ( ( ( rule__AssemblyConnector__RequiredroleAssignment_6 ) ) )
            // InternalMyDsl.g:2945:1: ( ( rule__AssemblyConnector__RequiredroleAssignment_6 ) )
            {
            // InternalMyDsl.g:2945:1: ( ( rule__AssemblyConnector__RequiredroleAssignment_6 ) )
            // InternalMyDsl.g:2946:2: ( rule__AssemblyConnector__RequiredroleAssignment_6 )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getRequiredroleAssignment_6()); 
            // InternalMyDsl.g:2947:2: ( rule__AssemblyConnector__RequiredroleAssignment_6 )
            // InternalMyDsl.g:2947:3: rule__AssemblyConnector__RequiredroleAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__RequiredroleAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyConnectorAccess().getRequiredroleAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__6__Impl"


    // $ANTLR start "rule__AssemblyConnector__Group__7"
    // InternalMyDsl.g:2955:1: rule__AssemblyConnector__Group__7 : rule__AssemblyConnector__Group__7__Impl ;
    public final void rule__AssemblyConnector__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2959:1: ( rule__AssemblyConnector__Group__7__Impl )
            // InternalMyDsl.g:2960:2: rule__AssemblyConnector__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__7"


    // $ANTLR start "rule__AssemblyConnector__Group__7__Impl"
    // InternalMyDsl.g:2966:1: rule__AssemblyConnector__Group__7__Impl : ( '}' ) ;
    public final void rule__AssemblyConnector__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2970:1: ( ( '}' ) )
            // InternalMyDsl.g:2971:1: ( '}' )
            {
            // InternalMyDsl.g:2971:1: ( '}' )
            // InternalMyDsl.g:2972:2: '}'
            {
             before(grammarAccess.getAssemblyConnectorAccess().getRightCurlyBracketKeyword_7()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAssemblyConnectorAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__7__Impl"


    // $ANTLR start "rule__Signature__Group__0"
    // InternalMyDsl.g:2982:1: rule__Signature__Group__0 : rule__Signature__Group__0__Impl rule__Signature__Group__1 ;
    public final void rule__Signature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2986:1: ( rule__Signature__Group__0__Impl rule__Signature__Group__1 )
            // InternalMyDsl.g:2987:2: rule__Signature__Group__0__Impl rule__Signature__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Signature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__0"


    // $ANTLR start "rule__Signature__Group__0__Impl"
    // InternalMyDsl.g:2994:1: rule__Signature__Group__0__Impl : ( 'Signature' ) ;
    public final void rule__Signature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2998:1: ( ( 'Signature' ) )
            // InternalMyDsl.g:2999:1: ( 'Signature' )
            {
            // InternalMyDsl.g:2999:1: ( 'Signature' )
            // InternalMyDsl.g:3000:2: 'Signature'
            {
             before(grammarAccess.getSignatureAccess().getSignatureKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getSignatureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__0__Impl"


    // $ANTLR start "rule__Signature__Group__1"
    // InternalMyDsl.g:3009:1: rule__Signature__Group__1 : rule__Signature__Group__1__Impl rule__Signature__Group__2 ;
    public final void rule__Signature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3013:1: ( rule__Signature__Group__1__Impl rule__Signature__Group__2 )
            // InternalMyDsl.g:3014:2: rule__Signature__Group__1__Impl rule__Signature__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Signature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__1"


    // $ANTLR start "rule__Signature__Group__1__Impl"
    // InternalMyDsl.g:3021:1: rule__Signature__Group__1__Impl : ( ( rule__Signature__NameAssignment_1 ) ) ;
    public final void rule__Signature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3025:1: ( ( ( rule__Signature__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3026:1: ( ( rule__Signature__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3026:1: ( ( rule__Signature__NameAssignment_1 ) )
            // InternalMyDsl.g:3027:2: ( rule__Signature__NameAssignment_1 )
            {
             before(grammarAccess.getSignatureAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3028:2: ( rule__Signature__NameAssignment_1 )
            // InternalMyDsl.g:3028:3: rule__Signature__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Signature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__1__Impl"


    // $ANTLR start "rule__Signature__Group__2"
    // InternalMyDsl.g:3036:1: rule__Signature__Group__2 : rule__Signature__Group__2__Impl rule__Signature__Group__3 ;
    public final void rule__Signature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3040:1: ( rule__Signature__Group__2__Impl rule__Signature__Group__3 )
            // InternalMyDsl.g:3041:2: rule__Signature__Group__2__Impl rule__Signature__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Signature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__2"


    // $ANTLR start "rule__Signature__Group__2__Impl"
    // InternalMyDsl.g:3048:1: rule__Signature__Group__2__Impl : ( '{' ) ;
    public final void rule__Signature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3052:1: ( ( '{' ) )
            // InternalMyDsl.g:3053:1: ( '{' )
            {
            // InternalMyDsl.g:3053:1: ( '{' )
            // InternalMyDsl.g:3054:2: '{'
            {
             before(grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__2__Impl"


    // $ANTLR start "rule__Signature__Group__3"
    // InternalMyDsl.g:3063:1: rule__Signature__Group__3 : rule__Signature__Group__3__Impl rule__Signature__Group__4 ;
    public final void rule__Signature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3067:1: ( rule__Signature__Group__3__Impl rule__Signature__Group__4 )
            // InternalMyDsl.g:3068:2: rule__Signature__Group__3__Impl rule__Signature__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Signature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__3"


    // $ANTLR start "rule__Signature__Group__3__Impl"
    // InternalMyDsl.g:3075:1: rule__Signature__Group__3__Impl : ( 'returntype' ) ;
    public final void rule__Signature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3079:1: ( ( 'returntype' ) )
            // InternalMyDsl.g:3080:1: ( 'returntype' )
            {
            // InternalMyDsl.g:3080:1: ( 'returntype' )
            // InternalMyDsl.g:3081:2: 'returntype'
            {
             before(grammarAccess.getSignatureAccess().getReturntypeKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getReturntypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__3__Impl"


    // $ANTLR start "rule__Signature__Group__4"
    // InternalMyDsl.g:3090:1: rule__Signature__Group__4 : rule__Signature__Group__4__Impl rule__Signature__Group__5 ;
    public final void rule__Signature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3094:1: ( rule__Signature__Group__4__Impl rule__Signature__Group__5 )
            // InternalMyDsl.g:3095:2: rule__Signature__Group__4__Impl rule__Signature__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Signature__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__4"


    // $ANTLR start "rule__Signature__Group__4__Impl"
    // InternalMyDsl.g:3102:1: rule__Signature__Group__4__Impl : ( ( rule__Signature__ReturntypeAssignment_4 ) ) ;
    public final void rule__Signature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3106:1: ( ( ( rule__Signature__ReturntypeAssignment_4 ) ) )
            // InternalMyDsl.g:3107:1: ( ( rule__Signature__ReturntypeAssignment_4 ) )
            {
            // InternalMyDsl.g:3107:1: ( ( rule__Signature__ReturntypeAssignment_4 ) )
            // InternalMyDsl.g:3108:2: ( rule__Signature__ReturntypeAssignment_4 )
            {
             before(grammarAccess.getSignatureAccess().getReturntypeAssignment_4()); 
            // InternalMyDsl.g:3109:2: ( rule__Signature__ReturntypeAssignment_4 )
            // InternalMyDsl.g:3109:3: rule__Signature__ReturntypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Signature__ReturntypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getReturntypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__4__Impl"


    // $ANTLR start "rule__Signature__Group__5"
    // InternalMyDsl.g:3117:1: rule__Signature__Group__5 : rule__Signature__Group__5__Impl rule__Signature__Group__6 ;
    public final void rule__Signature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3121:1: ( rule__Signature__Group__5__Impl rule__Signature__Group__6 )
            // InternalMyDsl.g:3122:2: rule__Signature__Group__5__Impl rule__Signature__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__Signature__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__5"


    // $ANTLR start "rule__Signature__Group__5__Impl"
    // InternalMyDsl.g:3129:1: rule__Signature__Group__5__Impl : ( ( rule__Signature__Group_5__0 )? ) ;
    public final void rule__Signature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3133:1: ( ( ( rule__Signature__Group_5__0 )? ) )
            // InternalMyDsl.g:3134:1: ( ( rule__Signature__Group_5__0 )? )
            {
            // InternalMyDsl.g:3134:1: ( ( rule__Signature__Group_5__0 )? )
            // InternalMyDsl.g:3135:2: ( rule__Signature__Group_5__0 )?
            {
             before(grammarAccess.getSignatureAccess().getGroup_5()); 
            // InternalMyDsl.g:3136:2: ( rule__Signature__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==44) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:3136:3: rule__Signature__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Signature__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSignatureAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__5__Impl"


    // $ANTLR start "rule__Signature__Group__6"
    // InternalMyDsl.g:3144:1: rule__Signature__Group__6 : rule__Signature__Group__6__Impl ;
    public final void rule__Signature__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3148:1: ( rule__Signature__Group__6__Impl )
            // InternalMyDsl.g:3149:2: rule__Signature__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__6"


    // $ANTLR start "rule__Signature__Group__6__Impl"
    // InternalMyDsl.g:3155:1: rule__Signature__Group__6__Impl : ( '}' ) ;
    public final void rule__Signature__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3159:1: ( ( '}' ) )
            // InternalMyDsl.g:3160:1: ( '}' )
            {
            // InternalMyDsl.g:3160:1: ( '}' )
            // InternalMyDsl.g:3161:2: '}'
            {
             before(grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__6__Impl"


    // $ANTLR start "rule__Signature__Group_5__0"
    // InternalMyDsl.g:3171:1: rule__Signature__Group_5__0 : rule__Signature__Group_5__0__Impl rule__Signature__Group_5__1 ;
    public final void rule__Signature__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3175:1: ( rule__Signature__Group_5__0__Impl rule__Signature__Group_5__1 )
            // InternalMyDsl.g:3176:2: rule__Signature__Group_5__0__Impl rule__Signature__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Signature__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__0"


    // $ANTLR start "rule__Signature__Group_5__0__Impl"
    // InternalMyDsl.g:3183:1: rule__Signature__Group_5__0__Impl : ( 'parameter' ) ;
    public final void rule__Signature__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3187:1: ( ( 'parameter' ) )
            // InternalMyDsl.g:3188:1: ( 'parameter' )
            {
            // InternalMyDsl.g:3188:1: ( 'parameter' )
            // InternalMyDsl.g:3189:2: 'parameter'
            {
             before(grammarAccess.getSignatureAccess().getParameterKeyword_5_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getParameterKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__0__Impl"


    // $ANTLR start "rule__Signature__Group_5__1"
    // InternalMyDsl.g:3198:1: rule__Signature__Group_5__1 : rule__Signature__Group_5__1__Impl rule__Signature__Group_5__2 ;
    public final void rule__Signature__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3202:1: ( rule__Signature__Group_5__1__Impl rule__Signature__Group_5__2 )
            // InternalMyDsl.g:3203:2: rule__Signature__Group_5__1__Impl rule__Signature__Group_5__2
            {
            pushFollow(FOLLOW_25);
            rule__Signature__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__1"


    // $ANTLR start "rule__Signature__Group_5__1__Impl"
    // InternalMyDsl.g:3210:1: rule__Signature__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Signature__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3214:1: ( ( '{' ) )
            // InternalMyDsl.g:3215:1: ( '{' )
            {
            // InternalMyDsl.g:3215:1: ( '{' )
            // InternalMyDsl.g:3216:2: '{'
            {
             before(grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__1__Impl"


    // $ANTLR start "rule__Signature__Group_5__2"
    // InternalMyDsl.g:3225:1: rule__Signature__Group_5__2 : rule__Signature__Group_5__2__Impl rule__Signature__Group_5__3 ;
    public final void rule__Signature__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3229:1: ( rule__Signature__Group_5__2__Impl rule__Signature__Group_5__3 )
            // InternalMyDsl.g:3230:2: rule__Signature__Group_5__2__Impl rule__Signature__Group_5__3
            {
            pushFollow(FOLLOW_12);
            rule__Signature__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__2"


    // $ANTLR start "rule__Signature__Group_5__2__Impl"
    // InternalMyDsl.g:3237:1: rule__Signature__Group_5__2__Impl : ( ( rule__Signature__ParameterAssignment_5_2 ) ) ;
    public final void rule__Signature__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3241:1: ( ( ( rule__Signature__ParameterAssignment_5_2 ) ) )
            // InternalMyDsl.g:3242:1: ( ( rule__Signature__ParameterAssignment_5_2 ) )
            {
            // InternalMyDsl.g:3242:1: ( ( rule__Signature__ParameterAssignment_5_2 ) )
            // InternalMyDsl.g:3243:2: ( rule__Signature__ParameterAssignment_5_2 )
            {
             before(grammarAccess.getSignatureAccess().getParameterAssignment_5_2()); 
            // InternalMyDsl.g:3244:2: ( rule__Signature__ParameterAssignment_5_2 )
            // InternalMyDsl.g:3244:3: rule__Signature__ParameterAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Signature__ParameterAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getParameterAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__2__Impl"


    // $ANTLR start "rule__Signature__Group_5__3"
    // InternalMyDsl.g:3252:1: rule__Signature__Group_5__3 : rule__Signature__Group_5__3__Impl rule__Signature__Group_5__4 ;
    public final void rule__Signature__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3256:1: ( rule__Signature__Group_5__3__Impl rule__Signature__Group_5__4 )
            // InternalMyDsl.g:3257:2: rule__Signature__Group_5__3__Impl rule__Signature__Group_5__4
            {
            pushFollow(FOLLOW_12);
            rule__Signature__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__3"


    // $ANTLR start "rule__Signature__Group_5__3__Impl"
    // InternalMyDsl.g:3264:1: rule__Signature__Group_5__3__Impl : ( ( rule__Signature__Group_5_3__0 )* ) ;
    public final void rule__Signature__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3268:1: ( ( ( rule__Signature__Group_5_3__0 )* ) )
            // InternalMyDsl.g:3269:1: ( ( rule__Signature__Group_5_3__0 )* )
            {
            // InternalMyDsl.g:3269:1: ( ( rule__Signature__Group_5_3__0 )* )
            // InternalMyDsl.g:3270:2: ( rule__Signature__Group_5_3__0 )*
            {
             before(grammarAccess.getSignatureAccess().getGroup_5_3()); 
            // InternalMyDsl.g:3271:2: ( rule__Signature__Group_5_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==28) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:3271:3: rule__Signature__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Signature__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getSignatureAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__3__Impl"


    // $ANTLR start "rule__Signature__Group_5__4"
    // InternalMyDsl.g:3279:1: rule__Signature__Group_5__4 : rule__Signature__Group_5__4__Impl ;
    public final void rule__Signature__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3283:1: ( rule__Signature__Group_5__4__Impl )
            // InternalMyDsl.g:3284:2: rule__Signature__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__4"


    // $ANTLR start "rule__Signature__Group_5__4__Impl"
    // InternalMyDsl.g:3290:1: rule__Signature__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Signature__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3294:1: ( ( '}' ) )
            // InternalMyDsl.g:3295:1: ( '}' )
            {
            // InternalMyDsl.g:3295:1: ( '}' )
            // InternalMyDsl.g:3296:2: '}'
            {
             before(grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__4__Impl"


    // $ANTLR start "rule__Signature__Group_5_3__0"
    // InternalMyDsl.g:3306:1: rule__Signature__Group_5_3__0 : rule__Signature__Group_5_3__0__Impl rule__Signature__Group_5_3__1 ;
    public final void rule__Signature__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3310:1: ( rule__Signature__Group_5_3__0__Impl rule__Signature__Group_5_3__1 )
            // InternalMyDsl.g:3311:2: rule__Signature__Group_5_3__0__Impl rule__Signature__Group_5_3__1
            {
            pushFollow(FOLLOW_25);
            rule__Signature__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5_3__0"


    // $ANTLR start "rule__Signature__Group_5_3__0__Impl"
    // InternalMyDsl.g:3318:1: rule__Signature__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Signature__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3322:1: ( ( ',' ) )
            // InternalMyDsl.g:3323:1: ( ',' )
            {
            // InternalMyDsl.g:3323:1: ( ',' )
            // InternalMyDsl.g:3324:2: ','
            {
             before(grammarAccess.getSignatureAccess().getCommaKeyword_5_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5_3__0__Impl"


    // $ANTLR start "rule__Signature__Group_5_3__1"
    // InternalMyDsl.g:3333:1: rule__Signature__Group_5_3__1 : rule__Signature__Group_5_3__1__Impl ;
    public final void rule__Signature__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3337:1: ( rule__Signature__Group_5_3__1__Impl )
            // InternalMyDsl.g:3338:2: rule__Signature__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5_3__1"


    // $ANTLR start "rule__Signature__Group_5_3__1__Impl"
    // InternalMyDsl.g:3344:1: rule__Signature__Group_5_3__1__Impl : ( ( rule__Signature__ParameterAssignment_5_3_1 ) ) ;
    public final void rule__Signature__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3348:1: ( ( ( rule__Signature__ParameterAssignment_5_3_1 ) ) )
            // InternalMyDsl.g:3349:1: ( ( rule__Signature__ParameterAssignment_5_3_1 ) )
            {
            // InternalMyDsl.g:3349:1: ( ( rule__Signature__ParameterAssignment_5_3_1 ) )
            // InternalMyDsl.g:3350:2: ( rule__Signature__ParameterAssignment_5_3_1 )
            {
             before(grammarAccess.getSignatureAccess().getParameterAssignment_5_3_1()); 
            // InternalMyDsl.g:3351:2: ( rule__Signature__ParameterAssignment_5_3_1 )
            // InternalMyDsl.g:3351:3: rule__Signature__ParameterAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Signature__ParameterAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getParameterAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5_3__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalMyDsl.g:3360:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3364:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalMyDsl.g:3365:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalMyDsl.g:3372:1: rule__Parameter__Group__0__Impl : ( 'Parameter' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3376:1: ( ( 'Parameter' ) )
            // InternalMyDsl.g:3377:1: ( 'Parameter' )
            {
            // InternalMyDsl.g:3377:1: ( 'Parameter' )
            // InternalMyDsl.g:3378:2: 'Parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getParameterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalMyDsl.g:3387:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3391:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalMyDsl.g:3392:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalMyDsl.g:3399:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3403:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3404:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3404:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalMyDsl.g:3405:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3406:2: ( rule__Parameter__NameAssignment_1 )
            // InternalMyDsl.g:3406:3: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalMyDsl.g:3414:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3418:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalMyDsl.g:3419:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalMyDsl.g:3426:1: rule__Parameter__Group__2__Impl : ( '{' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3430:1: ( ( '{' ) )
            // InternalMyDsl.g:3431:1: ( '{' )
            {
            // InternalMyDsl.g:3431:1: ( '{' )
            // InternalMyDsl.g:3432:2: '{'
            {
             before(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalMyDsl.g:3441:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3445:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalMyDsl.g:3446:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Parameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalMyDsl.g:3453:1: rule__Parameter__Group__3__Impl : ( 'parametertype' ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3457:1: ( ( 'parametertype' ) )
            // InternalMyDsl.g:3458:1: ( 'parametertype' )
            {
            // InternalMyDsl.g:3458:1: ( 'parametertype' )
            // InternalMyDsl.g:3459:2: 'parametertype'
            {
             before(grammarAccess.getParameterAccess().getParametertypeKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getParametertypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Parameter__Group__4"
    // InternalMyDsl.g:3468:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl rule__Parameter__Group__5 ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3472:1: ( rule__Parameter__Group__4__Impl rule__Parameter__Group__5 )
            // InternalMyDsl.g:3473:2: rule__Parameter__Group__4__Impl rule__Parameter__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Parameter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__4"


    // $ANTLR start "rule__Parameter__Group__4__Impl"
    // InternalMyDsl.g:3480:1: rule__Parameter__Group__4__Impl : ( ( rule__Parameter__ParametertypeAssignment_4 ) ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3484:1: ( ( ( rule__Parameter__ParametertypeAssignment_4 ) ) )
            // InternalMyDsl.g:3485:1: ( ( rule__Parameter__ParametertypeAssignment_4 ) )
            {
            // InternalMyDsl.g:3485:1: ( ( rule__Parameter__ParametertypeAssignment_4 ) )
            // InternalMyDsl.g:3486:2: ( rule__Parameter__ParametertypeAssignment_4 )
            {
             before(grammarAccess.getParameterAccess().getParametertypeAssignment_4()); 
            // InternalMyDsl.g:3487:2: ( rule__Parameter__ParametertypeAssignment_4 )
            // InternalMyDsl.g:3487:3: rule__Parameter__ParametertypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__ParametertypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getParametertypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__4__Impl"


    // $ANTLR start "rule__Parameter__Group__5"
    // InternalMyDsl.g:3495:1: rule__Parameter__Group__5 : rule__Parameter__Group__5__Impl ;
    public final void rule__Parameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3499:1: ( rule__Parameter__Group__5__Impl )
            // InternalMyDsl.g:3500:2: rule__Parameter__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__5"


    // $ANTLR start "rule__Parameter__Group__5__Impl"
    // InternalMyDsl.g:3506:1: rule__Parameter__Group__5__Impl : ( '}' ) ;
    public final void rule__Parameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3510:1: ( ( '}' ) )
            // InternalMyDsl.g:3511:1: ( '}' )
            {
            // InternalMyDsl.g:3511:1: ( '}' )
            // InternalMyDsl.g:3512:2: '}'
            {
             before(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__5__Impl"


    // $ANTLR start "rule__ReturnType_Impl__Group__0"
    // InternalMyDsl.g:3522:1: rule__ReturnType_Impl__Group__0 : rule__ReturnType_Impl__Group__0__Impl rule__ReturnType_Impl__Group__1 ;
    public final void rule__ReturnType_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3526:1: ( rule__ReturnType_Impl__Group__0__Impl rule__ReturnType_Impl__Group__1 )
            // InternalMyDsl.g:3527:2: rule__ReturnType_Impl__Group__0__Impl rule__ReturnType_Impl__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ReturnType_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReturnType_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnType_Impl__Group__0"


    // $ANTLR start "rule__ReturnType_Impl__Group__0__Impl"
    // InternalMyDsl.g:3534:1: rule__ReturnType_Impl__Group__0__Impl : ( () ) ;
    public final void rule__ReturnType_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3538:1: ( ( () ) )
            // InternalMyDsl.g:3539:1: ( () )
            {
            // InternalMyDsl.g:3539:1: ( () )
            // InternalMyDsl.g:3540:2: ()
            {
             before(grammarAccess.getReturnType_ImplAccess().getReturnTypeAction_0()); 
            // InternalMyDsl.g:3541:2: ()
            // InternalMyDsl.g:3541:3: 
            {
            }

             after(grammarAccess.getReturnType_ImplAccess().getReturnTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnType_Impl__Group__0__Impl"


    // $ANTLR start "rule__ReturnType_Impl__Group__1"
    // InternalMyDsl.g:3549:1: rule__ReturnType_Impl__Group__1 : rule__ReturnType_Impl__Group__1__Impl rule__ReturnType_Impl__Group__2 ;
    public final void rule__ReturnType_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3553:1: ( rule__ReturnType_Impl__Group__1__Impl rule__ReturnType_Impl__Group__2 )
            // InternalMyDsl.g:3554:2: rule__ReturnType_Impl__Group__1__Impl rule__ReturnType_Impl__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ReturnType_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReturnType_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnType_Impl__Group__1"


    // $ANTLR start "rule__ReturnType_Impl__Group__1__Impl"
    // InternalMyDsl.g:3561:1: rule__ReturnType_Impl__Group__1__Impl : ( 'ReturnType' ) ;
    public final void rule__ReturnType_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3565:1: ( ( 'ReturnType' ) )
            // InternalMyDsl.g:3566:1: ( 'ReturnType' )
            {
            // InternalMyDsl.g:3566:1: ( 'ReturnType' )
            // InternalMyDsl.g:3567:2: 'ReturnType'
            {
             before(grammarAccess.getReturnType_ImplAccess().getReturnTypeKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getReturnType_ImplAccess().getReturnTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnType_Impl__Group__1__Impl"


    // $ANTLR start "rule__ReturnType_Impl__Group__2"
    // InternalMyDsl.g:3576:1: rule__ReturnType_Impl__Group__2 : rule__ReturnType_Impl__Group__2__Impl ;
    public final void rule__ReturnType_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3580:1: ( rule__ReturnType_Impl__Group__2__Impl )
            // InternalMyDsl.g:3581:2: rule__ReturnType_Impl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReturnType_Impl__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnType_Impl__Group__2"


    // $ANTLR start "rule__ReturnType_Impl__Group__2__Impl"
    // InternalMyDsl.g:3587:1: rule__ReturnType_Impl__Group__2__Impl : ( ( rule__ReturnType_Impl__NameAssignment_2 ) ) ;
    public final void rule__ReturnType_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3591:1: ( ( ( rule__ReturnType_Impl__NameAssignment_2 ) ) )
            // InternalMyDsl.g:3592:1: ( ( rule__ReturnType_Impl__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:3592:1: ( ( rule__ReturnType_Impl__NameAssignment_2 ) )
            // InternalMyDsl.g:3593:2: ( rule__ReturnType_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getReturnType_ImplAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:3594:2: ( rule__ReturnType_Impl__NameAssignment_2 )
            // InternalMyDsl.g:3594:3: rule__ReturnType_Impl__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ReturnType_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReturnType_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnType_Impl__Group__2__Impl"


    // $ANTLR start "rule__ParameterType_Impl__Group__0"
    // InternalMyDsl.g:3603:1: rule__ParameterType_Impl__Group__0 : rule__ParameterType_Impl__Group__0__Impl rule__ParameterType_Impl__Group__1 ;
    public final void rule__ParameterType_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3607:1: ( rule__ParameterType_Impl__Group__0__Impl rule__ParameterType_Impl__Group__1 )
            // InternalMyDsl.g:3608:2: rule__ParameterType_Impl__Group__0__Impl rule__ParameterType_Impl__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__ParameterType_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterType_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterType_Impl__Group__0"


    // $ANTLR start "rule__ParameterType_Impl__Group__0__Impl"
    // InternalMyDsl.g:3615:1: rule__ParameterType_Impl__Group__0__Impl : ( () ) ;
    public final void rule__ParameterType_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3619:1: ( ( () ) )
            // InternalMyDsl.g:3620:1: ( () )
            {
            // InternalMyDsl.g:3620:1: ( () )
            // InternalMyDsl.g:3621:2: ()
            {
             before(grammarAccess.getParameterType_ImplAccess().getParameterTypeAction_0()); 
            // InternalMyDsl.g:3622:2: ()
            // InternalMyDsl.g:3622:3: 
            {
            }

             after(grammarAccess.getParameterType_ImplAccess().getParameterTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterType_Impl__Group__0__Impl"


    // $ANTLR start "rule__ParameterType_Impl__Group__1"
    // InternalMyDsl.g:3630:1: rule__ParameterType_Impl__Group__1 : rule__ParameterType_Impl__Group__1__Impl rule__ParameterType_Impl__Group__2 ;
    public final void rule__ParameterType_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3634:1: ( rule__ParameterType_Impl__Group__1__Impl rule__ParameterType_Impl__Group__2 )
            // InternalMyDsl.g:3635:2: rule__ParameterType_Impl__Group__1__Impl rule__ParameterType_Impl__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ParameterType_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterType_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterType_Impl__Group__1"


    // $ANTLR start "rule__ParameterType_Impl__Group__1__Impl"
    // InternalMyDsl.g:3642:1: rule__ParameterType_Impl__Group__1__Impl : ( 'ParameterType' ) ;
    public final void rule__ParameterType_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3646:1: ( ( 'ParameterType' ) )
            // InternalMyDsl.g:3647:1: ( 'ParameterType' )
            {
            // InternalMyDsl.g:3647:1: ( 'ParameterType' )
            // InternalMyDsl.g:3648:2: 'ParameterType'
            {
             before(grammarAccess.getParameterType_ImplAccess().getParameterTypeKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getParameterType_ImplAccess().getParameterTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterType_Impl__Group__1__Impl"


    // $ANTLR start "rule__ParameterType_Impl__Group__2"
    // InternalMyDsl.g:3657:1: rule__ParameterType_Impl__Group__2 : rule__ParameterType_Impl__Group__2__Impl ;
    public final void rule__ParameterType_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3661:1: ( rule__ParameterType_Impl__Group__2__Impl )
            // InternalMyDsl.g:3662:2: rule__ParameterType_Impl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterType_Impl__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterType_Impl__Group__2"


    // $ANTLR start "rule__ParameterType_Impl__Group__2__Impl"
    // InternalMyDsl.g:3668:1: rule__ParameterType_Impl__Group__2__Impl : ( ( rule__ParameterType_Impl__NameAssignment_2 ) ) ;
    public final void rule__ParameterType_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3672:1: ( ( ( rule__ParameterType_Impl__NameAssignment_2 ) ) )
            // InternalMyDsl.g:3673:1: ( ( rule__ParameterType_Impl__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:3673:1: ( ( rule__ParameterType_Impl__NameAssignment_2 ) )
            // InternalMyDsl.g:3674:2: ( rule__ParameterType_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getParameterType_ImplAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:3675:2: ( rule__ParameterType_Impl__NameAssignment_2 )
            // InternalMyDsl.g:3675:3: rule__ParameterType_Impl__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ParameterType_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterType_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterType_Impl__Group__2__Impl"


    // $ANTLR start "rule__Simple__Group__0"
    // InternalMyDsl.g:3684:1: rule__Simple__Group__0 : rule__Simple__Group__0__Impl rule__Simple__Group__1 ;
    public final void rule__Simple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3688:1: ( rule__Simple__Group__0__Impl rule__Simple__Group__1 )
            // InternalMyDsl.g:3689:2: rule__Simple__Group__0__Impl rule__Simple__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Simple__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simple__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__0"


    // $ANTLR start "rule__Simple__Group__0__Impl"
    // InternalMyDsl.g:3696:1: rule__Simple__Group__0__Impl : ( () ) ;
    public final void rule__Simple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3700:1: ( ( () ) )
            // InternalMyDsl.g:3701:1: ( () )
            {
            // InternalMyDsl.g:3701:1: ( () )
            // InternalMyDsl.g:3702:2: ()
            {
             before(grammarAccess.getSimpleAccess().getSimpleAction_0()); 
            // InternalMyDsl.g:3703:2: ()
            // InternalMyDsl.g:3703:3: 
            {
            }

             after(grammarAccess.getSimpleAccess().getSimpleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__0__Impl"


    // $ANTLR start "rule__Simple__Group__1"
    // InternalMyDsl.g:3711:1: rule__Simple__Group__1 : rule__Simple__Group__1__Impl rule__Simple__Group__2 ;
    public final void rule__Simple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3715:1: ( rule__Simple__Group__1__Impl rule__Simple__Group__2 )
            // InternalMyDsl.g:3716:2: rule__Simple__Group__1__Impl rule__Simple__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Simple__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simple__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__1"


    // $ANTLR start "rule__Simple__Group__1__Impl"
    // InternalMyDsl.g:3723:1: rule__Simple__Group__1__Impl : ( 'Simple' ) ;
    public final void rule__Simple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3727:1: ( ( 'Simple' ) )
            // InternalMyDsl.g:3728:1: ( 'Simple' )
            {
            // InternalMyDsl.g:3728:1: ( 'Simple' )
            // InternalMyDsl.g:3729:2: 'Simple'
            {
             before(grammarAccess.getSimpleAccess().getSimpleKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getSimpleAccess().getSimpleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__1__Impl"


    // $ANTLR start "rule__Simple__Group__2"
    // InternalMyDsl.g:3738:1: rule__Simple__Group__2 : rule__Simple__Group__2__Impl rule__Simple__Group__3 ;
    public final void rule__Simple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3742:1: ( rule__Simple__Group__2__Impl rule__Simple__Group__3 )
            // InternalMyDsl.g:3743:2: rule__Simple__Group__2__Impl rule__Simple__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Simple__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simple__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__2"


    // $ANTLR start "rule__Simple__Group__2__Impl"
    // InternalMyDsl.g:3750:1: rule__Simple__Group__2__Impl : ( ( rule__Simple__NameAssignment_2 ) ) ;
    public final void rule__Simple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3754:1: ( ( ( rule__Simple__NameAssignment_2 ) ) )
            // InternalMyDsl.g:3755:1: ( ( rule__Simple__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:3755:1: ( ( rule__Simple__NameAssignment_2 ) )
            // InternalMyDsl.g:3756:2: ( rule__Simple__NameAssignment_2 )
            {
             before(grammarAccess.getSimpleAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:3757:2: ( rule__Simple__NameAssignment_2 )
            // InternalMyDsl.g:3757:3: rule__Simple__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Simple__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__2__Impl"


    // $ANTLR start "rule__Simple__Group__3"
    // InternalMyDsl.g:3765:1: rule__Simple__Group__3 : rule__Simple__Group__3__Impl rule__Simple__Group__4 ;
    public final void rule__Simple__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3769:1: ( rule__Simple__Group__3__Impl rule__Simple__Group__4 )
            // InternalMyDsl.g:3770:2: rule__Simple__Group__3__Impl rule__Simple__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Simple__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simple__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__3"


    // $ANTLR start "rule__Simple__Group__3__Impl"
    // InternalMyDsl.g:3777:1: rule__Simple__Group__3__Impl : ( '{' ) ;
    public final void rule__Simple__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3781:1: ( ( '{' ) )
            // InternalMyDsl.g:3782:1: ( '{' )
            {
            // InternalMyDsl.g:3782:1: ( '{' )
            // InternalMyDsl.g:3783:2: '{'
            {
             before(grammarAccess.getSimpleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSimpleAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__3__Impl"


    // $ANTLR start "rule__Simple__Group__4"
    // InternalMyDsl.g:3792:1: rule__Simple__Group__4 : rule__Simple__Group__4__Impl rule__Simple__Group__5 ;
    public final void rule__Simple__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3796:1: ( rule__Simple__Group__4__Impl rule__Simple__Group__5 )
            // InternalMyDsl.g:3797:2: rule__Simple__Group__4__Impl rule__Simple__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__Simple__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simple__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__4"


    // $ANTLR start "rule__Simple__Group__4__Impl"
    // InternalMyDsl.g:3804:1: rule__Simple__Group__4__Impl : ( ( rule__Simple__Group_4__0 )? ) ;
    public final void rule__Simple__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3808:1: ( ( ( rule__Simple__Group_4__0 )? ) )
            // InternalMyDsl.g:3809:1: ( ( rule__Simple__Group_4__0 )? )
            {
            // InternalMyDsl.g:3809:1: ( ( rule__Simple__Group_4__0 )? )
            // InternalMyDsl.g:3810:2: ( rule__Simple__Group_4__0 )?
            {
             before(grammarAccess.getSimpleAccess().getGroup_4()); 
            // InternalMyDsl.g:3811:2: ( rule__Simple__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==50) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:3811:3: rule__Simple__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__4__Impl"


    // $ANTLR start "rule__Simple__Group__5"
    // InternalMyDsl.g:3819:1: rule__Simple__Group__5 : rule__Simple__Group__5__Impl ;
    public final void rule__Simple__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3823:1: ( rule__Simple__Group__5__Impl )
            // InternalMyDsl.g:3824:2: rule__Simple__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Simple__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__5"


    // $ANTLR start "rule__Simple__Group__5__Impl"
    // InternalMyDsl.g:3830:1: rule__Simple__Group__5__Impl : ( '}' ) ;
    public final void rule__Simple__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3834:1: ( ( '}' ) )
            // InternalMyDsl.g:3835:1: ( '}' )
            {
            // InternalMyDsl.g:3835:1: ( '}' )
            // InternalMyDsl.g:3836:2: '}'
            {
             before(grammarAccess.getSimpleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSimpleAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__5__Impl"


    // $ANTLR start "rule__Simple__Group_4__0"
    // InternalMyDsl.g:3846:1: rule__Simple__Group_4__0 : rule__Simple__Group_4__0__Impl rule__Simple__Group_4__1 ;
    public final void rule__Simple__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3850:1: ( rule__Simple__Group_4__0__Impl rule__Simple__Group_4__1 )
            // InternalMyDsl.g:3851:2: rule__Simple__Group_4__0__Impl rule__Simple__Group_4__1
            {
            pushFollow(FOLLOW_30);
            rule__Simple__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simple__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group_4__0"


    // $ANTLR start "rule__Simple__Group_4__0__Impl"
    // InternalMyDsl.g:3858:1: rule__Simple__Group_4__0__Impl : ( 'kind' ) ;
    public final void rule__Simple__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3862:1: ( ( 'kind' ) )
            // InternalMyDsl.g:3863:1: ( 'kind' )
            {
            // InternalMyDsl.g:3863:1: ( 'kind' )
            // InternalMyDsl.g:3864:2: 'kind'
            {
             before(grammarAccess.getSimpleAccess().getKindKeyword_4_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getSimpleAccess().getKindKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group_4__0__Impl"


    // $ANTLR start "rule__Simple__Group_4__1"
    // InternalMyDsl.g:3873:1: rule__Simple__Group_4__1 : rule__Simple__Group_4__1__Impl ;
    public final void rule__Simple__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3877:1: ( rule__Simple__Group_4__1__Impl )
            // InternalMyDsl.g:3878:2: rule__Simple__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Simple__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group_4__1"


    // $ANTLR start "rule__Simple__Group_4__1__Impl"
    // InternalMyDsl.g:3884:1: rule__Simple__Group_4__1__Impl : ( ( rule__Simple__KindAssignment_4_1 ) ) ;
    public final void rule__Simple__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3888:1: ( ( ( rule__Simple__KindAssignment_4_1 ) ) )
            // InternalMyDsl.g:3889:1: ( ( rule__Simple__KindAssignment_4_1 ) )
            {
            // InternalMyDsl.g:3889:1: ( ( rule__Simple__KindAssignment_4_1 ) )
            // InternalMyDsl.g:3890:2: ( rule__Simple__KindAssignment_4_1 )
            {
             before(grammarAccess.getSimpleAccess().getKindAssignment_4_1()); 
            // InternalMyDsl.g:3891:2: ( rule__Simple__KindAssignment_4_1 )
            // InternalMyDsl.g:3891:3: rule__Simple__KindAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Simple__KindAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getKindAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group_4__1__Impl"


    // $ANTLR start "rule__Complex__Group__0"
    // InternalMyDsl.g:3900:1: rule__Complex__Group__0 : rule__Complex__Group__0__Impl rule__Complex__Group__1 ;
    public final void rule__Complex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3904:1: ( rule__Complex__Group__0__Impl rule__Complex__Group__1 )
            // InternalMyDsl.g:3905:2: rule__Complex__Group__0__Impl rule__Complex__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Complex__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complex__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__0"


    // $ANTLR start "rule__Complex__Group__0__Impl"
    // InternalMyDsl.g:3912:1: rule__Complex__Group__0__Impl : ( 'Complex' ) ;
    public final void rule__Complex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3916:1: ( ( 'Complex' ) )
            // InternalMyDsl.g:3917:1: ( 'Complex' )
            {
            // InternalMyDsl.g:3917:1: ( 'Complex' )
            // InternalMyDsl.g:3918:2: 'Complex'
            {
             before(grammarAccess.getComplexAccess().getComplexKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getComplexAccess().getComplexKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__0__Impl"


    // $ANTLR start "rule__Complex__Group__1"
    // InternalMyDsl.g:3927:1: rule__Complex__Group__1 : rule__Complex__Group__1__Impl rule__Complex__Group__2 ;
    public final void rule__Complex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3931:1: ( rule__Complex__Group__1__Impl rule__Complex__Group__2 )
            // InternalMyDsl.g:3932:2: rule__Complex__Group__1__Impl rule__Complex__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Complex__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complex__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__1"


    // $ANTLR start "rule__Complex__Group__1__Impl"
    // InternalMyDsl.g:3939:1: rule__Complex__Group__1__Impl : ( ( rule__Complex__NameAssignment_1 ) ) ;
    public final void rule__Complex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3943:1: ( ( ( rule__Complex__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3944:1: ( ( rule__Complex__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3944:1: ( ( rule__Complex__NameAssignment_1 ) )
            // InternalMyDsl.g:3945:2: ( rule__Complex__NameAssignment_1 )
            {
             before(grammarAccess.getComplexAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3946:2: ( rule__Complex__NameAssignment_1 )
            // InternalMyDsl.g:3946:3: rule__Complex__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Complex__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__1__Impl"


    // $ANTLR start "rule__Complex__Group__2"
    // InternalMyDsl.g:3954:1: rule__Complex__Group__2 : rule__Complex__Group__2__Impl rule__Complex__Group__3 ;
    public final void rule__Complex__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3958:1: ( rule__Complex__Group__2__Impl rule__Complex__Group__3 )
            // InternalMyDsl.g:3959:2: rule__Complex__Group__2__Impl rule__Complex__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Complex__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complex__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__2"


    // $ANTLR start "rule__Complex__Group__2__Impl"
    // InternalMyDsl.g:3966:1: rule__Complex__Group__2__Impl : ( '{' ) ;
    public final void rule__Complex__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3970:1: ( ( '{' ) )
            // InternalMyDsl.g:3971:1: ( '{' )
            {
            // InternalMyDsl.g:3971:1: ( '{' )
            // InternalMyDsl.g:3972:2: '{'
            {
             before(grammarAccess.getComplexAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComplexAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__2__Impl"


    // $ANTLR start "rule__Complex__Group__3"
    // InternalMyDsl.g:3981:1: rule__Complex__Group__3 : rule__Complex__Group__3__Impl rule__Complex__Group__4 ;
    public final void rule__Complex__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3985:1: ( rule__Complex__Group__3__Impl rule__Complex__Group__4 )
            // InternalMyDsl.g:3986:2: rule__Complex__Group__3__Impl rule__Complex__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Complex__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complex__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__3"


    // $ANTLR start "rule__Complex__Group__3__Impl"
    // InternalMyDsl.g:3993:1: rule__Complex__Group__3__Impl : ( 'simple' ) ;
    public final void rule__Complex__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3997:1: ( ( 'simple' ) )
            // InternalMyDsl.g:3998:1: ( 'simple' )
            {
            // InternalMyDsl.g:3998:1: ( 'simple' )
            // InternalMyDsl.g:3999:2: 'simple'
            {
             before(grammarAccess.getComplexAccess().getSimpleKeyword_3()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getComplexAccess().getSimpleKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__3__Impl"


    // $ANTLR start "rule__Complex__Group__4"
    // InternalMyDsl.g:4008:1: rule__Complex__Group__4 : rule__Complex__Group__4__Impl rule__Complex__Group__5 ;
    public final void rule__Complex__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4012:1: ( rule__Complex__Group__4__Impl rule__Complex__Group__5 )
            // InternalMyDsl.g:4013:2: rule__Complex__Group__4__Impl rule__Complex__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Complex__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complex__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__4"


    // $ANTLR start "rule__Complex__Group__4__Impl"
    // InternalMyDsl.g:4020:1: rule__Complex__Group__4__Impl : ( '{' ) ;
    public final void rule__Complex__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4024:1: ( ( '{' ) )
            // InternalMyDsl.g:4025:1: ( '{' )
            {
            // InternalMyDsl.g:4025:1: ( '{' )
            // InternalMyDsl.g:4026:2: '{'
            {
             before(grammarAccess.getComplexAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComplexAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__4__Impl"


    // $ANTLR start "rule__Complex__Group__5"
    // InternalMyDsl.g:4035:1: rule__Complex__Group__5 : rule__Complex__Group__5__Impl rule__Complex__Group__6 ;
    public final void rule__Complex__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4039:1: ( rule__Complex__Group__5__Impl rule__Complex__Group__6 )
            // InternalMyDsl.g:4040:2: rule__Complex__Group__5__Impl rule__Complex__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Complex__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complex__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__5"


    // $ANTLR start "rule__Complex__Group__5__Impl"
    // InternalMyDsl.g:4047:1: rule__Complex__Group__5__Impl : ( ( rule__Complex__SimpleAssignment_5 ) ) ;
    public final void rule__Complex__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4051:1: ( ( ( rule__Complex__SimpleAssignment_5 ) ) )
            // InternalMyDsl.g:4052:1: ( ( rule__Complex__SimpleAssignment_5 ) )
            {
            // InternalMyDsl.g:4052:1: ( ( rule__Complex__SimpleAssignment_5 ) )
            // InternalMyDsl.g:4053:2: ( rule__Complex__SimpleAssignment_5 )
            {
             before(grammarAccess.getComplexAccess().getSimpleAssignment_5()); 
            // InternalMyDsl.g:4054:2: ( rule__Complex__SimpleAssignment_5 )
            // InternalMyDsl.g:4054:3: rule__Complex__SimpleAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Complex__SimpleAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getComplexAccess().getSimpleAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__5__Impl"


    // $ANTLR start "rule__Complex__Group__6"
    // InternalMyDsl.g:4062:1: rule__Complex__Group__6 : rule__Complex__Group__6__Impl rule__Complex__Group__7 ;
    public final void rule__Complex__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4066:1: ( rule__Complex__Group__6__Impl rule__Complex__Group__7 )
            // InternalMyDsl.g:4067:2: rule__Complex__Group__6__Impl rule__Complex__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Complex__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complex__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__6"


    // $ANTLR start "rule__Complex__Group__6__Impl"
    // InternalMyDsl.g:4074:1: rule__Complex__Group__6__Impl : ( ( rule__Complex__Group_6__0 )* ) ;
    public final void rule__Complex__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4078:1: ( ( ( rule__Complex__Group_6__0 )* ) )
            // InternalMyDsl.g:4079:1: ( ( rule__Complex__Group_6__0 )* )
            {
            // InternalMyDsl.g:4079:1: ( ( rule__Complex__Group_6__0 )* )
            // InternalMyDsl.g:4080:2: ( rule__Complex__Group_6__0 )*
            {
             before(grammarAccess.getComplexAccess().getGroup_6()); 
            // InternalMyDsl.g:4081:2: ( rule__Complex__Group_6__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==28) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:4081:3: rule__Complex__Group_6__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Complex__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getComplexAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__6__Impl"


    // $ANTLR start "rule__Complex__Group__7"
    // InternalMyDsl.g:4089:1: rule__Complex__Group__7 : rule__Complex__Group__7__Impl rule__Complex__Group__8 ;
    public final void rule__Complex__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4093:1: ( rule__Complex__Group__7__Impl rule__Complex__Group__8 )
            // InternalMyDsl.g:4094:2: rule__Complex__Group__7__Impl rule__Complex__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__Complex__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complex__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__7"


    // $ANTLR start "rule__Complex__Group__7__Impl"
    // InternalMyDsl.g:4101:1: rule__Complex__Group__7__Impl : ( '}' ) ;
    public final void rule__Complex__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4105:1: ( ( '}' ) )
            // InternalMyDsl.g:4106:1: ( '}' )
            {
            // InternalMyDsl.g:4106:1: ( '}' )
            // InternalMyDsl.g:4107:2: '}'
            {
             before(grammarAccess.getComplexAccess().getRightCurlyBracketKeyword_7()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComplexAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__7__Impl"


    // $ANTLR start "rule__Complex__Group__8"
    // InternalMyDsl.g:4116:1: rule__Complex__Group__8 : rule__Complex__Group__8__Impl ;
    public final void rule__Complex__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4120:1: ( rule__Complex__Group__8__Impl )
            // InternalMyDsl.g:4121:2: rule__Complex__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Complex__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__8"


    // $ANTLR start "rule__Complex__Group__8__Impl"
    // InternalMyDsl.g:4127:1: rule__Complex__Group__8__Impl : ( '}' ) ;
    public final void rule__Complex__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4131:1: ( ( '}' ) )
            // InternalMyDsl.g:4132:1: ( '}' )
            {
            // InternalMyDsl.g:4132:1: ( '}' )
            // InternalMyDsl.g:4133:2: '}'
            {
             before(grammarAccess.getComplexAccess().getRightCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComplexAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__8__Impl"


    // $ANTLR start "rule__Complex__Group_6__0"
    // InternalMyDsl.g:4143:1: rule__Complex__Group_6__0 : rule__Complex__Group_6__0__Impl rule__Complex__Group_6__1 ;
    public final void rule__Complex__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4147:1: ( rule__Complex__Group_6__0__Impl rule__Complex__Group_6__1 )
            // InternalMyDsl.g:4148:2: rule__Complex__Group_6__0__Impl rule__Complex__Group_6__1
            {
            pushFollow(FOLLOW_28);
            rule__Complex__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complex__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group_6__0"


    // $ANTLR start "rule__Complex__Group_6__0__Impl"
    // InternalMyDsl.g:4155:1: rule__Complex__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Complex__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4159:1: ( ( ',' ) )
            // InternalMyDsl.g:4160:1: ( ',' )
            {
            // InternalMyDsl.g:4160:1: ( ',' )
            // InternalMyDsl.g:4161:2: ','
            {
             before(grammarAccess.getComplexAccess().getCommaKeyword_6_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComplexAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group_6__0__Impl"


    // $ANTLR start "rule__Complex__Group_6__1"
    // InternalMyDsl.g:4170:1: rule__Complex__Group_6__1 : rule__Complex__Group_6__1__Impl ;
    public final void rule__Complex__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4174:1: ( rule__Complex__Group_6__1__Impl )
            // InternalMyDsl.g:4175:2: rule__Complex__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Complex__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group_6__1"


    // $ANTLR start "rule__Complex__Group_6__1__Impl"
    // InternalMyDsl.g:4181:1: rule__Complex__Group_6__1__Impl : ( ( rule__Complex__SimpleAssignment_6_1 ) ) ;
    public final void rule__Complex__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4185:1: ( ( ( rule__Complex__SimpleAssignment_6_1 ) ) )
            // InternalMyDsl.g:4186:1: ( ( rule__Complex__SimpleAssignment_6_1 ) )
            {
            // InternalMyDsl.g:4186:1: ( ( rule__Complex__SimpleAssignment_6_1 ) )
            // InternalMyDsl.g:4187:2: ( rule__Complex__SimpleAssignment_6_1 )
            {
             before(grammarAccess.getComplexAccess().getSimpleAssignment_6_1()); 
            // InternalMyDsl.g:4188:2: ( rule__Complex__SimpleAssignment_6_1 )
            // InternalMyDsl.g:4188:3: rule__Complex__SimpleAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Complex__SimpleAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexAccess().getSimpleAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group_6__1__Impl"


    // $ANTLR start "rule__Void__Group__0"
    // InternalMyDsl.g:4197:1: rule__Void__Group__0 : rule__Void__Group__0__Impl rule__Void__Group__1 ;
    public final void rule__Void__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4201:1: ( rule__Void__Group__0__Impl rule__Void__Group__1 )
            // InternalMyDsl.g:4202:2: rule__Void__Group__0__Impl rule__Void__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Void__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Void__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Void__Group__0"


    // $ANTLR start "rule__Void__Group__0__Impl"
    // InternalMyDsl.g:4209:1: rule__Void__Group__0__Impl : ( () ) ;
    public final void rule__Void__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4213:1: ( ( () ) )
            // InternalMyDsl.g:4214:1: ( () )
            {
            // InternalMyDsl.g:4214:1: ( () )
            // InternalMyDsl.g:4215:2: ()
            {
             before(grammarAccess.getVoidAccess().getVoidAction_0()); 
            // InternalMyDsl.g:4216:2: ()
            // InternalMyDsl.g:4216:3: 
            {
            }

             after(grammarAccess.getVoidAccess().getVoidAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Void__Group__0__Impl"


    // $ANTLR start "rule__Void__Group__1"
    // InternalMyDsl.g:4224:1: rule__Void__Group__1 : rule__Void__Group__1__Impl rule__Void__Group__2 ;
    public final void rule__Void__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4228:1: ( rule__Void__Group__1__Impl rule__Void__Group__2 )
            // InternalMyDsl.g:4229:2: rule__Void__Group__1__Impl rule__Void__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Void__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Void__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Void__Group__1"


    // $ANTLR start "rule__Void__Group__1__Impl"
    // InternalMyDsl.g:4236:1: rule__Void__Group__1__Impl : ( 'Void' ) ;
    public final void rule__Void__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4240:1: ( ( 'Void' ) )
            // InternalMyDsl.g:4241:1: ( 'Void' )
            {
            // InternalMyDsl.g:4241:1: ( 'Void' )
            // InternalMyDsl.g:4242:2: 'Void'
            {
             before(grammarAccess.getVoidAccess().getVoidKeyword_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getVoidAccess().getVoidKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Void__Group__1__Impl"


    // $ANTLR start "rule__Void__Group__2"
    // InternalMyDsl.g:4251:1: rule__Void__Group__2 : rule__Void__Group__2__Impl ;
    public final void rule__Void__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4255:1: ( rule__Void__Group__2__Impl )
            // InternalMyDsl.g:4256:2: rule__Void__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Void__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Void__Group__2"


    // $ANTLR start "rule__Void__Group__2__Impl"
    // InternalMyDsl.g:4262:1: rule__Void__Group__2__Impl : ( ( rule__Void__NameAssignment_2 ) ) ;
    public final void rule__Void__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4266:1: ( ( ( rule__Void__NameAssignment_2 ) ) )
            // InternalMyDsl.g:4267:1: ( ( rule__Void__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:4267:1: ( ( rule__Void__NameAssignment_2 ) )
            // InternalMyDsl.g:4268:2: ( rule__Void__NameAssignment_2 )
            {
             before(grammarAccess.getVoidAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:4269:2: ( rule__Void__NameAssignment_2 )
            // InternalMyDsl.g:4269:3: rule__Void__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Void__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVoidAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Void__Group__2__Impl"


    // $ANTLR start "rule__Component_Impl__Group__0"
    // InternalMyDsl.g:4278:1: rule__Component_Impl__Group__0 : rule__Component_Impl__Group__0__Impl rule__Component_Impl__Group__1 ;
    public final void rule__Component_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4282:1: ( rule__Component_Impl__Group__0__Impl rule__Component_Impl__Group__1 )
            // InternalMyDsl.g:4283:2: rule__Component_Impl__Group__0__Impl rule__Component_Impl__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Component_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__0"


    // $ANTLR start "rule__Component_Impl__Group__0__Impl"
    // InternalMyDsl.g:4290:1: rule__Component_Impl__Group__0__Impl : ( 'Component' ) ;
    public final void rule__Component_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4294:1: ( ( 'Component' ) )
            // InternalMyDsl.g:4295:1: ( 'Component' )
            {
            // InternalMyDsl.g:4295:1: ( 'Component' )
            // InternalMyDsl.g:4296:2: 'Component'
            {
             before(grammarAccess.getComponent_ImplAccess().getComponentKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getComponentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__0__Impl"


    // $ANTLR start "rule__Component_Impl__Group__1"
    // InternalMyDsl.g:4305:1: rule__Component_Impl__Group__1 : rule__Component_Impl__Group__1__Impl rule__Component_Impl__Group__2 ;
    public final void rule__Component_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4309:1: ( rule__Component_Impl__Group__1__Impl rule__Component_Impl__Group__2 )
            // InternalMyDsl.g:4310:2: rule__Component_Impl__Group__1__Impl rule__Component_Impl__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Component_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__1"


    // $ANTLR start "rule__Component_Impl__Group__1__Impl"
    // InternalMyDsl.g:4317:1: rule__Component_Impl__Group__1__Impl : ( ( rule__Component_Impl__NameAssignment_1 ) ) ;
    public final void rule__Component_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4321:1: ( ( ( rule__Component_Impl__NameAssignment_1 ) ) )
            // InternalMyDsl.g:4322:1: ( ( rule__Component_Impl__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:4322:1: ( ( rule__Component_Impl__NameAssignment_1 ) )
            // InternalMyDsl.g:4323:2: ( rule__Component_Impl__NameAssignment_1 )
            {
             before(grammarAccess.getComponent_ImplAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4324:2: ( rule__Component_Impl__NameAssignment_1 )
            // InternalMyDsl.g:4324:3: rule__Component_Impl__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__1__Impl"


    // $ANTLR start "rule__Component_Impl__Group__2"
    // InternalMyDsl.g:4332:1: rule__Component_Impl__Group__2 : rule__Component_Impl__Group__2__Impl rule__Component_Impl__Group__3 ;
    public final void rule__Component_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4336:1: ( rule__Component_Impl__Group__2__Impl rule__Component_Impl__Group__3 )
            // InternalMyDsl.g:4337:2: rule__Component_Impl__Group__2__Impl rule__Component_Impl__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Component_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__2"


    // $ANTLR start "rule__Component_Impl__Group__2__Impl"
    // InternalMyDsl.g:4344:1: rule__Component_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__Component_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4348:1: ( ( '{' ) )
            // InternalMyDsl.g:4349:1: ( '{' )
            {
            // InternalMyDsl.g:4349:1: ( '{' )
            // InternalMyDsl.g:4350:2: '{'
            {
             before(grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__2__Impl"


    // $ANTLR start "rule__Component_Impl__Group__3"
    // InternalMyDsl.g:4359:1: rule__Component_Impl__Group__3 : rule__Component_Impl__Group__3__Impl rule__Component_Impl__Group__4 ;
    public final void rule__Component_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4363:1: ( rule__Component_Impl__Group__3__Impl rule__Component_Impl__Group__4 )
            // InternalMyDsl.g:4364:2: rule__Component_Impl__Group__3__Impl rule__Component_Impl__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__Component_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__3"


    // $ANTLR start "rule__Component_Impl__Group__3__Impl"
    // InternalMyDsl.g:4371:1: rule__Component_Impl__Group__3__Impl : ( ( rule__Component_Impl__Group_3__0 )? ) ;
    public final void rule__Component_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4375:1: ( ( ( rule__Component_Impl__Group_3__0 )? ) )
            // InternalMyDsl.g:4376:1: ( ( rule__Component_Impl__Group_3__0 )? )
            {
            // InternalMyDsl.g:4376:1: ( ( rule__Component_Impl__Group_3__0 )? )
            // InternalMyDsl.g:4377:2: ( rule__Component_Impl__Group_3__0 )?
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_3()); 
            // InternalMyDsl.g:4378:2: ( rule__Component_Impl__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==56) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:4378:3: rule__Component_Impl__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component_Impl__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponent_ImplAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__3__Impl"


    // $ANTLR start "rule__Component_Impl__Group__4"
    // InternalMyDsl.g:4386:1: rule__Component_Impl__Group__4 : rule__Component_Impl__Group__4__Impl rule__Component_Impl__Group__5 ;
    public final void rule__Component_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4390:1: ( rule__Component_Impl__Group__4__Impl rule__Component_Impl__Group__5 )
            // InternalMyDsl.g:4391:2: rule__Component_Impl__Group__4__Impl rule__Component_Impl__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Component_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__4"


    // $ANTLR start "rule__Component_Impl__Group__4__Impl"
    // InternalMyDsl.g:4398:1: rule__Component_Impl__Group__4__Impl : ( 'service' ) ;
    public final void rule__Component_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4402:1: ( ( 'service' ) )
            // InternalMyDsl.g:4403:1: ( 'service' )
            {
            // InternalMyDsl.g:4403:1: ( 'service' )
            // InternalMyDsl.g:4404:2: 'service'
            {
             before(grammarAccess.getComponent_ImplAccess().getServiceKeyword_4()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getServiceKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__4__Impl"


    // $ANTLR start "rule__Component_Impl__Group__5"
    // InternalMyDsl.g:4413:1: rule__Component_Impl__Group__5 : rule__Component_Impl__Group__5__Impl rule__Component_Impl__Group__6 ;
    public final void rule__Component_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4417:1: ( rule__Component_Impl__Group__5__Impl rule__Component_Impl__Group__6 )
            // InternalMyDsl.g:4418:2: rule__Component_Impl__Group__5__Impl rule__Component_Impl__Group__6
            {
            pushFollow(FOLLOW_34);
            rule__Component_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__5"


    // $ANTLR start "rule__Component_Impl__Group__5__Impl"
    // InternalMyDsl.g:4425:1: rule__Component_Impl__Group__5__Impl : ( '{' ) ;
    public final void rule__Component_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4429:1: ( ( '{' ) )
            // InternalMyDsl.g:4430:1: ( '{' )
            {
            // InternalMyDsl.g:4430:1: ( '{' )
            // InternalMyDsl.g:4431:2: '{'
            {
             before(grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__5__Impl"


    // $ANTLR start "rule__Component_Impl__Group__6"
    // InternalMyDsl.g:4440:1: rule__Component_Impl__Group__6 : rule__Component_Impl__Group__6__Impl rule__Component_Impl__Group__7 ;
    public final void rule__Component_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4444:1: ( rule__Component_Impl__Group__6__Impl rule__Component_Impl__Group__7 )
            // InternalMyDsl.g:4445:2: rule__Component_Impl__Group__6__Impl rule__Component_Impl__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Component_Impl__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__6"


    // $ANTLR start "rule__Component_Impl__Group__6__Impl"
    // InternalMyDsl.g:4452:1: rule__Component_Impl__Group__6__Impl : ( ( rule__Component_Impl__ServiceAssignment_6 ) ) ;
    public final void rule__Component_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4456:1: ( ( ( rule__Component_Impl__ServiceAssignment_6 ) ) )
            // InternalMyDsl.g:4457:1: ( ( rule__Component_Impl__ServiceAssignment_6 ) )
            {
            // InternalMyDsl.g:4457:1: ( ( rule__Component_Impl__ServiceAssignment_6 ) )
            // InternalMyDsl.g:4458:2: ( rule__Component_Impl__ServiceAssignment_6 )
            {
             before(grammarAccess.getComponent_ImplAccess().getServiceAssignment_6()); 
            // InternalMyDsl.g:4459:2: ( rule__Component_Impl__ServiceAssignment_6 )
            // InternalMyDsl.g:4459:3: rule__Component_Impl__ServiceAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__ServiceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getServiceAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__6__Impl"


    // $ANTLR start "rule__Component_Impl__Group__7"
    // InternalMyDsl.g:4467:1: rule__Component_Impl__Group__7 : rule__Component_Impl__Group__7__Impl rule__Component_Impl__Group__8 ;
    public final void rule__Component_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4471:1: ( rule__Component_Impl__Group__7__Impl rule__Component_Impl__Group__8 )
            // InternalMyDsl.g:4472:2: rule__Component_Impl__Group__7__Impl rule__Component_Impl__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__Component_Impl__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__7"


    // $ANTLR start "rule__Component_Impl__Group__7__Impl"
    // InternalMyDsl.g:4479:1: rule__Component_Impl__Group__7__Impl : ( ( rule__Component_Impl__Group_7__0 )* ) ;
    public final void rule__Component_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4483:1: ( ( ( rule__Component_Impl__Group_7__0 )* ) )
            // InternalMyDsl.g:4484:1: ( ( rule__Component_Impl__Group_7__0 )* )
            {
            // InternalMyDsl.g:4484:1: ( ( rule__Component_Impl__Group_7__0 )* )
            // InternalMyDsl.g:4485:2: ( rule__Component_Impl__Group_7__0 )*
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_7()); 
            // InternalMyDsl.g:4486:2: ( rule__Component_Impl__Group_7__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==28) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:4486:3: rule__Component_Impl__Group_7__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Component_Impl__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getComponent_ImplAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__7__Impl"


    // $ANTLR start "rule__Component_Impl__Group__8"
    // InternalMyDsl.g:4494:1: rule__Component_Impl__Group__8 : rule__Component_Impl__Group__8__Impl rule__Component_Impl__Group__9 ;
    public final void rule__Component_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4498:1: ( rule__Component_Impl__Group__8__Impl rule__Component_Impl__Group__9 )
            // InternalMyDsl.g:4499:2: rule__Component_Impl__Group__8__Impl rule__Component_Impl__Group__9
            {
            pushFollow(FOLLOW_35);
            rule__Component_Impl__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__8"


    // $ANTLR start "rule__Component_Impl__Group__8__Impl"
    // InternalMyDsl.g:4506:1: rule__Component_Impl__Group__8__Impl : ( '}' ) ;
    public final void rule__Component_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4510:1: ( ( '}' ) )
            // InternalMyDsl.g:4511:1: ( '}' )
            {
            // InternalMyDsl.g:4511:1: ( '}' )
            // InternalMyDsl.g:4512:2: '}'
            {
             before(grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__8__Impl"


    // $ANTLR start "rule__Component_Impl__Group__9"
    // InternalMyDsl.g:4521:1: rule__Component_Impl__Group__9 : rule__Component_Impl__Group__9__Impl rule__Component_Impl__Group__10 ;
    public final void rule__Component_Impl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4525:1: ( rule__Component_Impl__Group__9__Impl rule__Component_Impl__Group__10 )
            // InternalMyDsl.g:4526:2: rule__Component_Impl__Group__9__Impl rule__Component_Impl__Group__10
            {
            pushFollow(FOLLOW_35);
            rule__Component_Impl__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__9"


    // $ANTLR start "rule__Component_Impl__Group__9__Impl"
    // InternalMyDsl.g:4533:1: rule__Component_Impl__Group__9__Impl : ( ( rule__Component_Impl__Group_9__0 )? ) ;
    public final void rule__Component_Impl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4537:1: ( ( ( rule__Component_Impl__Group_9__0 )? ) )
            // InternalMyDsl.g:4538:1: ( ( rule__Component_Impl__Group_9__0 )? )
            {
            // InternalMyDsl.g:4538:1: ( ( rule__Component_Impl__Group_9__0 )? )
            // InternalMyDsl.g:4539:2: ( rule__Component_Impl__Group_9__0 )?
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_9()); 
            // InternalMyDsl.g:4540:2: ( rule__Component_Impl__Group_9__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:4540:3: rule__Component_Impl__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component_Impl__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponent_ImplAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__9__Impl"


    // $ANTLR start "rule__Component_Impl__Group__10"
    // InternalMyDsl.g:4548:1: rule__Component_Impl__Group__10 : rule__Component_Impl__Group__10__Impl rule__Component_Impl__Group__11 ;
    public final void rule__Component_Impl__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4552:1: ( rule__Component_Impl__Group__10__Impl rule__Component_Impl__Group__11 )
            // InternalMyDsl.g:4553:2: rule__Component_Impl__Group__10__Impl rule__Component_Impl__Group__11
            {
            pushFollow(FOLLOW_36);
            rule__Component_Impl__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__10"


    // $ANTLR start "rule__Component_Impl__Group__10__Impl"
    // InternalMyDsl.g:4560:1: rule__Component_Impl__Group__10__Impl : ( 'providedrole' ) ;
    public final void rule__Component_Impl__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4564:1: ( ( 'providedrole' ) )
            // InternalMyDsl.g:4565:1: ( 'providedrole' )
            {
            // InternalMyDsl.g:4565:1: ( 'providedrole' )
            // InternalMyDsl.g:4566:2: 'providedrole'
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedroleKeyword_10()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getProvidedroleKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__10__Impl"


    // $ANTLR start "rule__Component_Impl__Group__11"
    // InternalMyDsl.g:4575:1: rule__Component_Impl__Group__11 : rule__Component_Impl__Group__11__Impl rule__Component_Impl__Group__12 ;
    public final void rule__Component_Impl__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4579:1: ( rule__Component_Impl__Group__11__Impl rule__Component_Impl__Group__12 )
            // InternalMyDsl.g:4580:2: rule__Component_Impl__Group__11__Impl rule__Component_Impl__Group__12
            {
            pushFollow(FOLLOW_19);
            rule__Component_Impl__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__11"


    // $ANTLR start "rule__Component_Impl__Group__11__Impl"
    // InternalMyDsl.g:4587:1: rule__Component_Impl__Group__11__Impl : ( ( rule__Component_Impl__ProvidedroleAssignment_11 ) ) ;
    public final void rule__Component_Impl__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4591:1: ( ( ( rule__Component_Impl__ProvidedroleAssignment_11 ) ) )
            // InternalMyDsl.g:4592:1: ( ( rule__Component_Impl__ProvidedroleAssignment_11 ) )
            {
            // InternalMyDsl.g:4592:1: ( ( rule__Component_Impl__ProvidedroleAssignment_11 ) )
            // InternalMyDsl.g:4593:2: ( rule__Component_Impl__ProvidedroleAssignment_11 )
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedroleAssignment_11()); 
            // InternalMyDsl.g:4594:2: ( rule__Component_Impl__ProvidedroleAssignment_11 )
            // InternalMyDsl.g:4594:3: rule__Component_Impl__ProvidedroleAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__ProvidedroleAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getProvidedroleAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__11__Impl"


    // $ANTLR start "rule__Component_Impl__Group__12"
    // InternalMyDsl.g:4602:1: rule__Component_Impl__Group__12 : rule__Component_Impl__Group__12__Impl ;
    public final void rule__Component_Impl__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4606:1: ( rule__Component_Impl__Group__12__Impl )
            // InternalMyDsl.g:4607:2: rule__Component_Impl__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__12"


    // $ANTLR start "rule__Component_Impl__Group__12__Impl"
    // InternalMyDsl.g:4613:1: rule__Component_Impl__Group__12__Impl : ( '}' ) ;
    public final void rule__Component_Impl__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4617:1: ( ( '}' ) )
            // InternalMyDsl.g:4618:1: ( '}' )
            {
            // InternalMyDsl.g:4618:1: ( '}' )
            // InternalMyDsl.g:4619:2: '}'
            {
             before(grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_12()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__12__Impl"


    // $ANTLR start "rule__Component_Impl__Group_3__0"
    // InternalMyDsl.g:4629:1: rule__Component_Impl__Group_3__0 : rule__Component_Impl__Group_3__0__Impl rule__Component_Impl__Group_3__1 ;
    public final void rule__Component_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4633:1: ( rule__Component_Impl__Group_3__0__Impl rule__Component_Impl__Group_3__1 )
            // InternalMyDsl.g:4634:2: rule__Component_Impl__Group_3__0__Impl rule__Component_Impl__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Component_Impl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3__0"


    // $ANTLR start "rule__Component_Impl__Group_3__0__Impl"
    // InternalMyDsl.g:4641:1: rule__Component_Impl__Group_3__0__Impl : ( 'behaviourdescription' ) ;
    public final void rule__Component_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4645:1: ( ( 'behaviourdescription' ) )
            // InternalMyDsl.g:4646:1: ( 'behaviourdescription' )
            {
            // InternalMyDsl.g:4646:1: ( 'behaviourdescription' )
            // InternalMyDsl.g:4647:2: 'behaviourdescription'
            {
             before(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionKeyword_3_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3__0__Impl"


    // $ANTLR start "rule__Component_Impl__Group_3__1"
    // InternalMyDsl.g:4656:1: rule__Component_Impl__Group_3__1 : rule__Component_Impl__Group_3__1__Impl rule__Component_Impl__Group_3__2 ;
    public final void rule__Component_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4660:1: ( rule__Component_Impl__Group_3__1__Impl rule__Component_Impl__Group_3__2 )
            // InternalMyDsl.g:4661:2: rule__Component_Impl__Group_3__1__Impl rule__Component_Impl__Group_3__2
            {
            pushFollow(FOLLOW_37);
            rule__Component_Impl__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3__1"


    // $ANTLR start "rule__Component_Impl__Group_3__1__Impl"
    // InternalMyDsl.g:4668:1: rule__Component_Impl__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Component_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4672:1: ( ( '{' ) )
            // InternalMyDsl.g:4673:1: ( '{' )
            {
            // InternalMyDsl.g:4673:1: ( '{' )
            // InternalMyDsl.g:4674:2: '{'
            {
             before(grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3__1__Impl"


    // $ANTLR start "rule__Component_Impl__Group_3__2"
    // InternalMyDsl.g:4683:1: rule__Component_Impl__Group_3__2 : rule__Component_Impl__Group_3__2__Impl rule__Component_Impl__Group_3__3 ;
    public final void rule__Component_Impl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4687:1: ( rule__Component_Impl__Group_3__2__Impl rule__Component_Impl__Group_3__3 )
            // InternalMyDsl.g:4688:2: rule__Component_Impl__Group_3__2__Impl rule__Component_Impl__Group_3__3
            {
            pushFollow(FOLLOW_12);
            rule__Component_Impl__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3__2"


    // $ANTLR start "rule__Component_Impl__Group_3__2__Impl"
    // InternalMyDsl.g:4695:1: rule__Component_Impl__Group_3__2__Impl : ( ( rule__Component_Impl__BehaviourdescriptionAssignment_3_2 ) ) ;
    public final void rule__Component_Impl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4699:1: ( ( ( rule__Component_Impl__BehaviourdescriptionAssignment_3_2 ) ) )
            // InternalMyDsl.g:4700:1: ( ( rule__Component_Impl__BehaviourdescriptionAssignment_3_2 ) )
            {
            // InternalMyDsl.g:4700:1: ( ( rule__Component_Impl__BehaviourdescriptionAssignment_3_2 ) )
            // InternalMyDsl.g:4701:2: ( rule__Component_Impl__BehaviourdescriptionAssignment_3_2 )
            {
             before(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionAssignment_3_2()); 
            // InternalMyDsl.g:4702:2: ( rule__Component_Impl__BehaviourdescriptionAssignment_3_2 )
            // InternalMyDsl.g:4702:3: rule__Component_Impl__BehaviourdescriptionAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__BehaviourdescriptionAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3__2__Impl"


    // $ANTLR start "rule__Component_Impl__Group_3__3"
    // InternalMyDsl.g:4710:1: rule__Component_Impl__Group_3__3 : rule__Component_Impl__Group_3__3__Impl rule__Component_Impl__Group_3__4 ;
    public final void rule__Component_Impl__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4714:1: ( rule__Component_Impl__Group_3__3__Impl rule__Component_Impl__Group_3__4 )
            // InternalMyDsl.g:4715:2: rule__Component_Impl__Group_3__3__Impl rule__Component_Impl__Group_3__4
            {
            pushFollow(FOLLOW_12);
            rule__Component_Impl__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3__3"


    // $ANTLR start "rule__Component_Impl__Group_3__3__Impl"
    // InternalMyDsl.g:4722:1: rule__Component_Impl__Group_3__3__Impl : ( ( rule__Component_Impl__Group_3_3__0 )* ) ;
    public final void rule__Component_Impl__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4726:1: ( ( ( rule__Component_Impl__Group_3_3__0 )* ) )
            // InternalMyDsl.g:4727:1: ( ( rule__Component_Impl__Group_3_3__0 )* )
            {
            // InternalMyDsl.g:4727:1: ( ( rule__Component_Impl__Group_3_3__0 )* )
            // InternalMyDsl.g:4728:2: ( rule__Component_Impl__Group_3_3__0 )*
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_3_3()); 
            // InternalMyDsl.g:4729:2: ( rule__Component_Impl__Group_3_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==28) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMyDsl.g:4729:3: rule__Component_Impl__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Component_Impl__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getComponent_ImplAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3__3__Impl"


    // $ANTLR start "rule__Component_Impl__Group_3__4"
    // InternalMyDsl.g:4737:1: rule__Component_Impl__Group_3__4 : rule__Component_Impl__Group_3__4__Impl ;
    public final void rule__Component_Impl__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4741:1: ( rule__Component_Impl__Group_3__4__Impl )
            // InternalMyDsl.g:4742:2: rule__Component_Impl__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3__4"


    // $ANTLR start "rule__Component_Impl__Group_3__4__Impl"
    // InternalMyDsl.g:4748:1: rule__Component_Impl__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Component_Impl__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4752:1: ( ( '}' ) )
            // InternalMyDsl.g:4753:1: ( '}' )
            {
            // InternalMyDsl.g:4753:1: ( '}' )
            // InternalMyDsl.g:4754:2: '}'
            {
             before(grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3__4__Impl"


    // $ANTLR start "rule__Component_Impl__Group_3_3__0"
    // InternalMyDsl.g:4764:1: rule__Component_Impl__Group_3_3__0 : rule__Component_Impl__Group_3_3__0__Impl rule__Component_Impl__Group_3_3__1 ;
    public final void rule__Component_Impl__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4768:1: ( rule__Component_Impl__Group_3_3__0__Impl rule__Component_Impl__Group_3_3__1 )
            // InternalMyDsl.g:4769:2: rule__Component_Impl__Group_3_3__0__Impl rule__Component_Impl__Group_3_3__1
            {
            pushFollow(FOLLOW_37);
            rule__Component_Impl__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3_3__0"


    // $ANTLR start "rule__Component_Impl__Group_3_3__0__Impl"
    // InternalMyDsl.g:4776:1: rule__Component_Impl__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Component_Impl__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4780:1: ( ( ',' ) )
            // InternalMyDsl.g:4781:1: ( ',' )
            {
            // InternalMyDsl.g:4781:1: ( ',' )
            // InternalMyDsl.g:4782:2: ','
            {
             before(grammarAccess.getComponent_ImplAccess().getCommaKeyword_3_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3_3__0__Impl"


    // $ANTLR start "rule__Component_Impl__Group_3_3__1"
    // InternalMyDsl.g:4791:1: rule__Component_Impl__Group_3_3__1 : rule__Component_Impl__Group_3_3__1__Impl ;
    public final void rule__Component_Impl__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4795:1: ( rule__Component_Impl__Group_3_3__1__Impl )
            // InternalMyDsl.g:4796:2: rule__Component_Impl__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3_3__1"


    // $ANTLR start "rule__Component_Impl__Group_3_3__1__Impl"
    // InternalMyDsl.g:4802:1: rule__Component_Impl__Group_3_3__1__Impl : ( ( rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1 ) ) ;
    public final void rule__Component_Impl__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4806:1: ( ( ( rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1 ) ) )
            // InternalMyDsl.g:4807:1: ( ( rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1 ) )
            {
            // InternalMyDsl.g:4807:1: ( ( rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1 ) )
            // InternalMyDsl.g:4808:2: ( rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1 )
            {
             before(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionAssignment_3_3_1()); 
            // InternalMyDsl.g:4809:2: ( rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1 )
            // InternalMyDsl.g:4809:3: rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3_3__1__Impl"


    // $ANTLR start "rule__Component_Impl__Group_7__0"
    // InternalMyDsl.g:4818:1: rule__Component_Impl__Group_7__0 : rule__Component_Impl__Group_7__0__Impl rule__Component_Impl__Group_7__1 ;
    public final void rule__Component_Impl__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4822:1: ( rule__Component_Impl__Group_7__0__Impl rule__Component_Impl__Group_7__1 )
            // InternalMyDsl.g:4823:2: rule__Component_Impl__Group_7__0__Impl rule__Component_Impl__Group_7__1
            {
            pushFollow(FOLLOW_34);
            rule__Component_Impl__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_7__0"


    // $ANTLR start "rule__Component_Impl__Group_7__0__Impl"
    // InternalMyDsl.g:4830:1: rule__Component_Impl__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Component_Impl__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4834:1: ( ( ',' ) )
            // InternalMyDsl.g:4835:1: ( ',' )
            {
            // InternalMyDsl.g:4835:1: ( ',' )
            // InternalMyDsl.g:4836:2: ','
            {
             before(grammarAccess.getComponent_ImplAccess().getCommaKeyword_7_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_7__0__Impl"


    // $ANTLR start "rule__Component_Impl__Group_7__1"
    // InternalMyDsl.g:4845:1: rule__Component_Impl__Group_7__1 : rule__Component_Impl__Group_7__1__Impl ;
    public final void rule__Component_Impl__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4849:1: ( rule__Component_Impl__Group_7__1__Impl )
            // InternalMyDsl.g:4850:2: rule__Component_Impl__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_7__1"


    // $ANTLR start "rule__Component_Impl__Group_7__1__Impl"
    // InternalMyDsl.g:4856:1: rule__Component_Impl__Group_7__1__Impl : ( ( rule__Component_Impl__ServiceAssignment_7_1 ) ) ;
    public final void rule__Component_Impl__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4860:1: ( ( ( rule__Component_Impl__ServiceAssignment_7_1 ) ) )
            // InternalMyDsl.g:4861:1: ( ( rule__Component_Impl__ServiceAssignment_7_1 ) )
            {
            // InternalMyDsl.g:4861:1: ( ( rule__Component_Impl__ServiceAssignment_7_1 ) )
            // InternalMyDsl.g:4862:2: ( rule__Component_Impl__ServiceAssignment_7_1 )
            {
             before(grammarAccess.getComponent_ImplAccess().getServiceAssignment_7_1()); 
            // InternalMyDsl.g:4863:2: ( rule__Component_Impl__ServiceAssignment_7_1 )
            // InternalMyDsl.g:4863:3: rule__Component_Impl__ServiceAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__ServiceAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getServiceAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_7__1__Impl"


    // $ANTLR start "rule__Component_Impl__Group_9__0"
    // InternalMyDsl.g:4872:1: rule__Component_Impl__Group_9__0 : rule__Component_Impl__Group_9__0__Impl rule__Component_Impl__Group_9__1 ;
    public final void rule__Component_Impl__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4876:1: ( rule__Component_Impl__Group_9__0__Impl rule__Component_Impl__Group_9__1 )
            // InternalMyDsl.g:4877:2: rule__Component_Impl__Group_9__0__Impl rule__Component_Impl__Group_9__1
            {
            pushFollow(FOLLOW_3);
            rule__Component_Impl__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9__0"


    // $ANTLR start "rule__Component_Impl__Group_9__0__Impl"
    // InternalMyDsl.g:4884:1: rule__Component_Impl__Group_9__0__Impl : ( 'requiredrole' ) ;
    public final void rule__Component_Impl__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4888:1: ( ( 'requiredrole' ) )
            // InternalMyDsl.g:4889:1: ( 'requiredrole' )
            {
            // InternalMyDsl.g:4889:1: ( 'requiredrole' )
            // InternalMyDsl.g:4890:2: 'requiredrole'
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredroleKeyword_9_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getRequiredroleKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9__0__Impl"


    // $ANTLR start "rule__Component_Impl__Group_9__1"
    // InternalMyDsl.g:4899:1: rule__Component_Impl__Group_9__1 : rule__Component_Impl__Group_9__1__Impl rule__Component_Impl__Group_9__2 ;
    public final void rule__Component_Impl__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4903:1: ( rule__Component_Impl__Group_9__1__Impl rule__Component_Impl__Group_9__2 )
            // InternalMyDsl.g:4904:2: rule__Component_Impl__Group_9__1__Impl rule__Component_Impl__Group_9__2
            {
            pushFollow(FOLLOW_38);
            rule__Component_Impl__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9__1"


    // $ANTLR start "rule__Component_Impl__Group_9__1__Impl"
    // InternalMyDsl.g:4911:1: rule__Component_Impl__Group_9__1__Impl : ( '{' ) ;
    public final void rule__Component_Impl__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4915:1: ( ( '{' ) )
            // InternalMyDsl.g:4916:1: ( '{' )
            {
            // InternalMyDsl.g:4916:1: ( '{' )
            // InternalMyDsl.g:4917:2: '{'
            {
             before(grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9__1__Impl"


    // $ANTLR start "rule__Component_Impl__Group_9__2"
    // InternalMyDsl.g:4926:1: rule__Component_Impl__Group_9__2 : rule__Component_Impl__Group_9__2__Impl rule__Component_Impl__Group_9__3 ;
    public final void rule__Component_Impl__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4930:1: ( rule__Component_Impl__Group_9__2__Impl rule__Component_Impl__Group_9__3 )
            // InternalMyDsl.g:4931:2: rule__Component_Impl__Group_9__2__Impl rule__Component_Impl__Group_9__3
            {
            pushFollow(FOLLOW_12);
            rule__Component_Impl__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9__2"


    // $ANTLR start "rule__Component_Impl__Group_9__2__Impl"
    // InternalMyDsl.g:4938:1: rule__Component_Impl__Group_9__2__Impl : ( ( rule__Component_Impl__RequiredroleAssignment_9_2 ) ) ;
    public final void rule__Component_Impl__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4942:1: ( ( ( rule__Component_Impl__RequiredroleAssignment_9_2 ) ) )
            // InternalMyDsl.g:4943:1: ( ( rule__Component_Impl__RequiredroleAssignment_9_2 ) )
            {
            // InternalMyDsl.g:4943:1: ( ( rule__Component_Impl__RequiredroleAssignment_9_2 ) )
            // InternalMyDsl.g:4944:2: ( rule__Component_Impl__RequiredroleAssignment_9_2 )
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredroleAssignment_9_2()); 
            // InternalMyDsl.g:4945:2: ( rule__Component_Impl__RequiredroleAssignment_9_2 )
            // InternalMyDsl.g:4945:3: rule__Component_Impl__RequiredroleAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__RequiredroleAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getRequiredroleAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9__2__Impl"


    // $ANTLR start "rule__Component_Impl__Group_9__3"
    // InternalMyDsl.g:4953:1: rule__Component_Impl__Group_9__3 : rule__Component_Impl__Group_9__3__Impl rule__Component_Impl__Group_9__4 ;
    public final void rule__Component_Impl__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4957:1: ( rule__Component_Impl__Group_9__3__Impl rule__Component_Impl__Group_9__4 )
            // InternalMyDsl.g:4958:2: rule__Component_Impl__Group_9__3__Impl rule__Component_Impl__Group_9__4
            {
            pushFollow(FOLLOW_12);
            rule__Component_Impl__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9__3"


    // $ANTLR start "rule__Component_Impl__Group_9__3__Impl"
    // InternalMyDsl.g:4965:1: rule__Component_Impl__Group_9__3__Impl : ( ( rule__Component_Impl__Group_9_3__0 )* ) ;
    public final void rule__Component_Impl__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4969:1: ( ( ( rule__Component_Impl__Group_9_3__0 )* ) )
            // InternalMyDsl.g:4970:1: ( ( rule__Component_Impl__Group_9_3__0 )* )
            {
            // InternalMyDsl.g:4970:1: ( ( rule__Component_Impl__Group_9_3__0 )* )
            // InternalMyDsl.g:4971:2: ( rule__Component_Impl__Group_9_3__0 )*
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_9_3()); 
            // InternalMyDsl.g:4972:2: ( rule__Component_Impl__Group_9_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==28) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:4972:3: rule__Component_Impl__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Component_Impl__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getComponent_ImplAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9__3__Impl"


    // $ANTLR start "rule__Component_Impl__Group_9__4"
    // InternalMyDsl.g:4980:1: rule__Component_Impl__Group_9__4 : rule__Component_Impl__Group_9__4__Impl ;
    public final void rule__Component_Impl__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4984:1: ( rule__Component_Impl__Group_9__4__Impl )
            // InternalMyDsl.g:4985:2: rule__Component_Impl__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9__4"


    // $ANTLR start "rule__Component_Impl__Group_9__4__Impl"
    // InternalMyDsl.g:4991:1: rule__Component_Impl__Group_9__4__Impl : ( '}' ) ;
    public final void rule__Component_Impl__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4995:1: ( ( '}' ) )
            // InternalMyDsl.g:4996:1: ( '}' )
            {
            // InternalMyDsl.g:4996:1: ( '}' )
            // InternalMyDsl.g:4997:2: '}'
            {
             before(grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9__4__Impl"


    // $ANTLR start "rule__Component_Impl__Group_9_3__0"
    // InternalMyDsl.g:5007:1: rule__Component_Impl__Group_9_3__0 : rule__Component_Impl__Group_9_3__0__Impl rule__Component_Impl__Group_9_3__1 ;
    public final void rule__Component_Impl__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5011:1: ( rule__Component_Impl__Group_9_3__0__Impl rule__Component_Impl__Group_9_3__1 )
            // InternalMyDsl.g:5012:2: rule__Component_Impl__Group_9_3__0__Impl rule__Component_Impl__Group_9_3__1
            {
            pushFollow(FOLLOW_38);
            rule__Component_Impl__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9_3__0"


    // $ANTLR start "rule__Component_Impl__Group_9_3__0__Impl"
    // InternalMyDsl.g:5019:1: rule__Component_Impl__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__Component_Impl__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5023:1: ( ( ',' ) )
            // InternalMyDsl.g:5024:1: ( ',' )
            {
            // InternalMyDsl.g:5024:1: ( ',' )
            // InternalMyDsl.g:5025:2: ','
            {
             before(grammarAccess.getComponent_ImplAccess().getCommaKeyword_9_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9_3__0__Impl"


    // $ANTLR start "rule__Component_Impl__Group_9_3__1"
    // InternalMyDsl.g:5034:1: rule__Component_Impl__Group_9_3__1 : rule__Component_Impl__Group_9_3__1__Impl ;
    public final void rule__Component_Impl__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5038:1: ( rule__Component_Impl__Group_9_3__1__Impl )
            // InternalMyDsl.g:5039:2: rule__Component_Impl__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9_3__1"


    // $ANTLR start "rule__Component_Impl__Group_9_3__1__Impl"
    // InternalMyDsl.g:5045:1: rule__Component_Impl__Group_9_3__1__Impl : ( ( rule__Component_Impl__RequiredroleAssignment_9_3_1 ) ) ;
    public final void rule__Component_Impl__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5049:1: ( ( ( rule__Component_Impl__RequiredroleAssignment_9_3_1 ) ) )
            // InternalMyDsl.g:5050:1: ( ( rule__Component_Impl__RequiredroleAssignment_9_3_1 ) )
            {
            // InternalMyDsl.g:5050:1: ( ( rule__Component_Impl__RequiredroleAssignment_9_3_1 ) )
            // InternalMyDsl.g:5051:2: ( rule__Component_Impl__RequiredroleAssignment_9_3_1 )
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredroleAssignment_9_3_1()); 
            // InternalMyDsl.g:5052:2: ( rule__Component_Impl__RequiredroleAssignment_9_3_1 )
            // InternalMyDsl.g:5052:3: rule__Component_Impl__RequiredroleAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__RequiredroleAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getRequiredroleAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9_3__1__Impl"


    // $ANTLR start "rule__BehaviourDescription_Impl__Group__0"
    // InternalMyDsl.g:5061:1: rule__BehaviourDescription_Impl__Group__0 : rule__BehaviourDescription_Impl__Group__0__Impl rule__BehaviourDescription_Impl__Group__1 ;
    public final void rule__BehaviourDescription_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5065:1: ( rule__BehaviourDescription_Impl__Group__0__Impl rule__BehaviourDescription_Impl__Group__1 )
            // InternalMyDsl.g:5066:2: rule__BehaviourDescription_Impl__Group__0__Impl rule__BehaviourDescription_Impl__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__BehaviourDescription_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviourDescription_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription_Impl__Group__0"


    // $ANTLR start "rule__BehaviourDescription_Impl__Group__0__Impl"
    // InternalMyDsl.g:5073:1: rule__BehaviourDescription_Impl__Group__0__Impl : ( () ) ;
    public final void rule__BehaviourDescription_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5077:1: ( ( () ) )
            // InternalMyDsl.g:5078:1: ( () )
            {
            // InternalMyDsl.g:5078:1: ( () )
            // InternalMyDsl.g:5079:2: ()
            {
             before(grammarAccess.getBehaviourDescription_ImplAccess().getBehaviourDescriptionAction_0()); 
            // InternalMyDsl.g:5080:2: ()
            // InternalMyDsl.g:5080:3: 
            {
            }

             after(grammarAccess.getBehaviourDescription_ImplAccess().getBehaviourDescriptionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription_Impl__Group__0__Impl"


    // $ANTLR start "rule__BehaviourDescription_Impl__Group__1"
    // InternalMyDsl.g:5088:1: rule__BehaviourDescription_Impl__Group__1 : rule__BehaviourDescription_Impl__Group__1__Impl ;
    public final void rule__BehaviourDescription_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5092:1: ( rule__BehaviourDescription_Impl__Group__1__Impl )
            // InternalMyDsl.g:5093:2: rule__BehaviourDescription_Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BehaviourDescription_Impl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription_Impl__Group__1"


    // $ANTLR start "rule__BehaviourDescription_Impl__Group__1__Impl"
    // InternalMyDsl.g:5099:1: rule__BehaviourDescription_Impl__Group__1__Impl : ( 'BehaviourDescription' ) ;
    public final void rule__BehaviourDescription_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5103:1: ( ( 'BehaviourDescription' ) )
            // InternalMyDsl.g:5104:1: ( 'BehaviourDescription' )
            {
            // InternalMyDsl.g:5104:1: ( 'BehaviourDescription' )
            // InternalMyDsl.g:5105:2: 'BehaviourDescription'
            {
             before(grammarAccess.getBehaviourDescription_ImplAccess().getBehaviourDescriptionKeyword_1()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getBehaviourDescription_ImplAccess().getBehaviourDescriptionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription_Impl__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__0"
    // InternalMyDsl.g:5115:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5119:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // InternalMyDsl.g:5120:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0"


    // $ANTLR start "rule__Service__Group__0__Impl"
    // InternalMyDsl.g:5127:1: rule__Service__Group__0__Impl : ( 'Service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5131:1: ( ( 'Service' ) )
            // InternalMyDsl.g:5132:1: ( 'Service' )
            {
            // InternalMyDsl.g:5132:1: ( 'Service' )
            // InternalMyDsl.g:5133:2: 'Service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getServiceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0__Impl"


    // $ANTLR start "rule__Service__Group__1"
    // InternalMyDsl.g:5142:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5146:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // InternalMyDsl.g:5147:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__Service__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1"


    // $ANTLR start "rule__Service__Group__1__Impl"
    // InternalMyDsl.g:5154:1: rule__Service__Group__1__Impl : ( '{' ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5158:1: ( ( '{' ) )
            // InternalMyDsl.g:5159:1: ( '{' )
            {
            // InternalMyDsl.g:5159:1: ( '{' )
            // InternalMyDsl.g:5160:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__2"
    // InternalMyDsl.g:5169:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5173:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // InternalMyDsl.g:5174:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Service__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2"


    // $ANTLR start "rule__Service__Group__2__Impl"
    // InternalMyDsl.g:5181:1: rule__Service__Group__2__Impl : ( 'correspondingSignatures' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5185:1: ( ( 'correspondingSignatures' ) )
            // InternalMyDsl.g:5186:1: ( 'correspondingSignatures' )
            {
            // InternalMyDsl.g:5186:1: ( 'correspondingSignatures' )
            // InternalMyDsl.g:5187:2: 'correspondingSignatures'
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignaturesKeyword_2()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getCorrespondingSignaturesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__3"
    // InternalMyDsl.g:5196:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5200:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // InternalMyDsl.g:5201:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Service__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3"


    // $ANTLR start "rule__Service__Group__3__Impl"
    // InternalMyDsl.g:5208:1: rule__Service__Group__3__Impl : ( '(' ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5212:1: ( ( '(' ) )
            // InternalMyDsl.g:5213:1: ( '(' )
            {
            // InternalMyDsl.g:5213:1: ( '(' )
            // InternalMyDsl.g:5214:2: '('
            {
             before(grammarAccess.getServiceAccess().getLeftParenthesisKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__4"
    // InternalMyDsl.g:5223:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5227:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // InternalMyDsl.g:5228:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Service__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4"


    // $ANTLR start "rule__Service__Group__4__Impl"
    // InternalMyDsl.g:5235:1: rule__Service__Group__4__Impl : ( ( rule__Service__CorrespondingSignaturesAssignment_4 ) ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5239:1: ( ( ( rule__Service__CorrespondingSignaturesAssignment_4 ) ) )
            // InternalMyDsl.g:5240:1: ( ( rule__Service__CorrespondingSignaturesAssignment_4 ) )
            {
            // InternalMyDsl.g:5240:1: ( ( rule__Service__CorrespondingSignaturesAssignment_4 ) )
            // InternalMyDsl.g:5241:2: ( rule__Service__CorrespondingSignaturesAssignment_4 )
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignaturesAssignment_4()); 
            // InternalMyDsl.g:5242:2: ( rule__Service__CorrespondingSignaturesAssignment_4 )
            // InternalMyDsl.g:5242:3: rule__Service__CorrespondingSignaturesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Service__CorrespondingSignaturesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getCorrespondingSignaturesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4__Impl"


    // $ANTLR start "rule__Service__Group__5"
    // InternalMyDsl.g:5250:1: rule__Service__Group__5 : rule__Service__Group__5__Impl rule__Service__Group__6 ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5254:1: ( rule__Service__Group__5__Impl rule__Service__Group__6 )
            // InternalMyDsl.g:5255:2: rule__Service__Group__5__Impl rule__Service__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Service__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5"


    // $ANTLR start "rule__Service__Group__5__Impl"
    // InternalMyDsl.g:5262:1: rule__Service__Group__5__Impl : ( ( rule__Service__Group_5__0 )* ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5266:1: ( ( ( rule__Service__Group_5__0 )* ) )
            // InternalMyDsl.g:5267:1: ( ( rule__Service__Group_5__0 )* )
            {
            // InternalMyDsl.g:5267:1: ( ( rule__Service__Group_5__0 )* )
            // InternalMyDsl.g:5268:2: ( rule__Service__Group_5__0 )*
            {
             before(grammarAccess.getServiceAccess().getGroup_5()); 
            // InternalMyDsl.g:5269:2: ( rule__Service__Group_5__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==28) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyDsl.g:5269:3: rule__Service__Group_5__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Service__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5__Impl"


    // $ANTLR start "rule__Service__Group__6"
    // InternalMyDsl.g:5277:1: rule__Service__Group__6 : rule__Service__Group__6__Impl rule__Service__Group__7 ;
    public final void rule__Service__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5281:1: ( rule__Service__Group__6__Impl rule__Service__Group__7 )
            // InternalMyDsl.g:5282:2: rule__Service__Group__6__Impl rule__Service__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__Service__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__6"


    // $ANTLR start "rule__Service__Group__6__Impl"
    // InternalMyDsl.g:5289:1: rule__Service__Group__6__Impl : ( ')' ) ;
    public final void rule__Service__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5293:1: ( ( ')' ) )
            // InternalMyDsl.g:5294:1: ( ')' )
            {
            // InternalMyDsl.g:5294:1: ( ')' )
            // InternalMyDsl.g:5295:2: ')'
            {
             before(grammarAccess.getServiceAccess().getRightParenthesisKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__6__Impl"


    // $ANTLR start "rule__Service__Group__7"
    // InternalMyDsl.g:5304:1: rule__Service__Group__7 : rule__Service__Group__7__Impl ;
    public final void rule__Service__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5308:1: ( rule__Service__Group__7__Impl )
            // InternalMyDsl.g:5309:2: rule__Service__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__7"


    // $ANTLR start "rule__Service__Group__7__Impl"
    // InternalMyDsl.g:5315:1: rule__Service__Group__7__Impl : ( '}' ) ;
    public final void rule__Service__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5319:1: ( ( '}' ) )
            // InternalMyDsl.g:5320:1: ( '}' )
            {
            // InternalMyDsl.g:5320:1: ( '}' )
            // InternalMyDsl.g:5321:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__7__Impl"


    // $ANTLR start "rule__Service__Group_5__0"
    // InternalMyDsl.g:5331:1: rule__Service__Group_5__0 : rule__Service__Group_5__0__Impl rule__Service__Group_5__1 ;
    public final void rule__Service__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5335:1: ( rule__Service__Group_5__0__Impl rule__Service__Group_5__1 )
            // InternalMyDsl.g:5336:2: rule__Service__Group_5__0__Impl rule__Service__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__Service__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_5__0"


    // $ANTLR start "rule__Service__Group_5__0__Impl"
    // InternalMyDsl.g:5343:1: rule__Service__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Service__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5347:1: ( ( ',' ) )
            // InternalMyDsl.g:5348:1: ( ',' )
            {
            // InternalMyDsl.g:5348:1: ( ',' )
            // InternalMyDsl.g:5349:2: ','
            {
             before(grammarAccess.getServiceAccess().getCommaKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_5__0__Impl"


    // $ANTLR start "rule__Service__Group_5__1"
    // InternalMyDsl.g:5358:1: rule__Service__Group_5__1 : rule__Service__Group_5__1__Impl ;
    public final void rule__Service__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5362:1: ( rule__Service__Group_5__1__Impl )
            // InternalMyDsl.g:5363:2: rule__Service__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_5__1"


    // $ANTLR start "rule__Service__Group_5__1__Impl"
    // InternalMyDsl.g:5369:1: rule__Service__Group_5__1__Impl : ( ( rule__Service__CorrespondingSignaturesAssignment_5_1 ) ) ;
    public final void rule__Service__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5373:1: ( ( ( rule__Service__CorrespondingSignaturesAssignment_5_1 ) ) )
            // InternalMyDsl.g:5374:1: ( ( rule__Service__CorrespondingSignaturesAssignment_5_1 ) )
            {
            // InternalMyDsl.g:5374:1: ( ( rule__Service__CorrespondingSignaturesAssignment_5_1 ) )
            // InternalMyDsl.g:5375:2: ( rule__Service__CorrespondingSignaturesAssignment_5_1 )
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignaturesAssignment_5_1()); 
            // InternalMyDsl.g:5376:2: ( rule__Service__CorrespondingSignaturesAssignment_5_1 )
            // InternalMyDsl.g:5376:3: rule__Service__CorrespondingSignaturesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__CorrespondingSignaturesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getCorrespondingSignaturesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_5__1__Impl"


    // $ANTLR start "rule__RequiredRole__Group__0"
    // InternalMyDsl.g:5385:1: rule__RequiredRole__Group__0 : rule__RequiredRole__Group__0__Impl rule__RequiredRole__Group__1 ;
    public final void rule__RequiredRole__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5389:1: ( rule__RequiredRole__Group__0__Impl rule__RequiredRole__Group__1 )
            // InternalMyDsl.g:5390:2: rule__RequiredRole__Group__0__Impl rule__RequiredRole__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__RequiredRole__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredRole__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__Group__0"


    // $ANTLR start "rule__RequiredRole__Group__0__Impl"
    // InternalMyDsl.g:5397:1: rule__RequiredRole__Group__0__Impl : ( 'RequiredRole' ) ;
    public final void rule__RequiredRole__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5401:1: ( ( 'RequiredRole' ) )
            // InternalMyDsl.g:5402:1: ( 'RequiredRole' )
            {
            // InternalMyDsl.g:5402:1: ( 'RequiredRole' )
            // InternalMyDsl.g:5403:2: 'RequiredRole'
            {
             before(grammarAccess.getRequiredRoleAccess().getRequiredRoleKeyword_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getRequiredRoleAccess().getRequiredRoleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__Group__0__Impl"


    // $ANTLR start "rule__RequiredRole__Group__1"
    // InternalMyDsl.g:5412:1: rule__RequiredRole__Group__1 : rule__RequiredRole__Group__1__Impl rule__RequiredRole__Group__2 ;
    public final void rule__RequiredRole__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5416:1: ( rule__RequiredRole__Group__1__Impl rule__RequiredRole__Group__2 )
            // InternalMyDsl.g:5417:2: rule__RequiredRole__Group__1__Impl rule__RequiredRole__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__RequiredRole__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredRole__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__Group__1"


    // $ANTLR start "rule__RequiredRole__Group__1__Impl"
    // InternalMyDsl.g:5424:1: rule__RequiredRole__Group__1__Impl : ( ( rule__RequiredRole__NameAssignment_1 ) ) ;
    public final void rule__RequiredRole__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5428:1: ( ( ( rule__RequiredRole__NameAssignment_1 ) ) )
            // InternalMyDsl.g:5429:1: ( ( rule__RequiredRole__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:5429:1: ( ( rule__RequiredRole__NameAssignment_1 ) )
            // InternalMyDsl.g:5430:2: ( rule__RequiredRole__NameAssignment_1 )
            {
             before(grammarAccess.getRequiredRoleAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:5431:2: ( rule__RequiredRole__NameAssignment_1 )
            // InternalMyDsl.g:5431:3: rule__RequiredRole__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RequiredRole__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRequiredRoleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__Group__1__Impl"


    // $ANTLR start "rule__RequiredRole__Group__2"
    // InternalMyDsl.g:5439:1: rule__RequiredRole__Group__2 : rule__RequiredRole__Group__2__Impl rule__RequiredRole__Group__3 ;
    public final void rule__RequiredRole__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5443:1: ( rule__RequiredRole__Group__2__Impl rule__RequiredRole__Group__3 )
            // InternalMyDsl.g:5444:2: rule__RequiredRole__Group__2__Impl rule__RequiredRole__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__RequiredRole__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredRole__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__Group__2"


    // $ANTLR start "rule__RequiredRole__Group__2__Impl"
    // InternalMyDsl.g:5451:1: rule__RequiredRole__Group__2__Impl : ( '{' ) ;
    public final void rule__RequiredRole__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5455:1: ( ( '{' ) )
            // InternalMyDsl.g:5456:1: ( '{' )
            {
            // InternalMyDsl.g:5456:1: ( '{' )
            // InternalMyDsl.g:5457:2: '{'
            {
             before(grammarAccess.getRequiredRoleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRequiredRoleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__Group__2__Impl"


    // $ANTLR start "rule__RequiredRole__Group__3"
    // InternalMyDsl.g:5466:1: rule__RequiredRole__Group__3 : rule__RequiredRole__Group__3__Impl rule__RequiredRole__Group__4 ;
    public final void rule__RequiredRole__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5470:1: ( rule__RequiredRole__Group__3__Impl rule__RequiredRole__Group__4 )
            // InternalMyDsl.g:5471:2: rule__RequiredRole__Group__3__Impl rule__RequiredRole__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__RequiredRole__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredRole__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__Group__3"


    // $ANTLR start "rule__RequiredRole__Group__3__Impl"
    // InternalMyDsl.g:5478:1: rule__RequiredRole__Group__3__Impl : ( 'interface' ) ;
    public final void rule__RequiredRole__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5482:1: ( ( 'interface' ) )
            // InternalMyDsl.g:5483:1: ( 'interface' )
            {
            // InternalMyDsl.g:5483:1: ( 'interface' )
            // InternalMyDsl.g:5484:2: 'interface'
            {
             before(grammarAccess.getRequiredRoleAccess().getInterfaceKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRequiredRoleAccess().getInterfaceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__Group__3__Impl"


    // $ANTLR start "rule__RequiredRole__Group__4"
    // InternalMyDsl.g:5493:1: rule__RequiredRole__Group__4 : rule__RequiredRole__Group__4__Impl rule__RequiredRole__Group__5 ;
    public final void rule__RequiredRole__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5497:1: ( rule__RequiredRole__Group__4__Impl rule__RequiredRole__Group__5 )
            // InternalMyDsl.g:5498:2: rule__RequiredRole__Group__4__Impl rule__RequiredRole__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__RequiredRole__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredRole__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__Group__4"


    // $ANTLR start "rule__RequiredRole__Group__4__Impl"
    // InternalMyDsl.g:5505:1: rule__RequiredRole__Group__4__Impl : ( ( rule__RequiredRole__InterfaceAssignment_4 ) ) ;
    public final void rule__RequiredRole__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5509:1: ( ( ( rule__RequiredRole__InterfaceAssignment_4 ) ) )
            // InternalMyDsl.g:5510:1: ( ( rule__RequiredRole__InterfaceAssignment_4 ) )
            {
            // InternalMyDsl.g:5510:1: ( ( rule__RequiredRole__InterfaceAssignment_4 ) )
            // InternalMyDsl.g:5511:2: ( rule__RequiredRole__InterfaceAssignment_4 )
            {
             before(grammarAccess.getRequiredRoleAccess().getInterfaceAssignment_4()); 
            // InternalMyDsl.g:5512:2: ( rule__RequiredRole__InterfaceAssignment_4 )
            // InternalMyDsl.g:5512:3: rule__RequiredRole__InterfaceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RequiredRole__InterfaceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRequiredRoleAccess().getInterfaceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__Group__4__Impl"


    // $ANTLR start "rule__RequiredRole__Group__5"
    // InternalMyDsl.g:5520:1: rule__RequiredRole__Group__5 : rule__RequiredRole__Group__5__Impl ;
    public final void rule__RequiredRole__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5524:1: ( rule__RequiredRole__Group__5__Impl )
            // InternalMyDsl.g:5525:2: rule__RequiredRole__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequiredRole__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__Group__5"


    // $ANTLR start "rule__RequiredRole__Group__5__Impl"
    // InternalMyDsl.g:5531:1: rule__RequiredRole__Group__5__Impl : ( '}' ) ;
    public final void rule__RequiredRole__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5535:1: ( ( '}' ) )
            // InternalMyDsl.g:5536:1: ( '}' )
            {
            // InternalMyDsl.g:5536:1: ( '}' )
            // InternalMyDsl.g:5537:2: '}'
            {
             before(grammarAccess.getRequiredRoleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRequiredRoleAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__Group__5__Impl"


    // $ANTLR start "rule__ProvidedRole__Group__0"
    // InternalMyDsl.g:5547:1: rule__ProvidedRole__Group__0 : rule__ProvidedRole__Group__0__Impl rule__ProvidedRole__Group__1 ;
    public final void rule__ProvidedRole__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5551:1: ( rule__ProvidedRole__Group__0__Impl rule__ProvidedRole__Group__1 )
            // InternalMyDsl.g:5552:2: rule__ProvidedRole__Group__0__Impl rule__ProvidedRole__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ProvidedRole__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProvidedRole__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__Group__0"


    // $ANTLR start "rule__ProvidedRole__Group__0__Impl"
    // InternalMyDsl.g:5559:1: rule__ProvidedRole__Group__0__Impl : ( 'ProvidedRole' ) ;
    public final void rule__ProvidedRole__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5563:1: ( ( 'ProvidedRole' ) )
            // InternalMyDsl.g:5564:1: ( 'ProvidedRole' )
            {
            // InternalMyDsl.g:5564:1: ( 'ProvidedRole' )
            // InternalMyDsl.g:5565:2: 'ProvidedRole'
            {
             before(grammarAccess.getProvidedRoleAccess().getProvidedRoleKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getProvidedRoleAccess().getProvidedRoleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__Group__0__Impl"


    // $ANTLR start "rule__ProvidedRole__Group__1"
    // InternalMyDsl.g:5574:1: rule__ProvidedRole__Group__1 : rule__ProvidedRole__Group__1__Impl rule__ProvidedRole__Group__2 ;
    public final void rule__ProvidedRole__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5578:1: ( rule__ProvidedRole__Group__1__Impl rule__ProvidedRole__Group__2 )
            // InternalMyDsl.g:5579:2: rule__ProvidedRole__Group__1__Impl rule__ProvidedRole__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ProvidedRole__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProvidedRole__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__Group__1"


    // $ANTLR start "rule__ProvidedRole__Group__1__Impl"
    // InternalMyDsl.g:5586:1: rule__ProvidedRole__Group__1__Impl : ( ( rule__ProvidedRole__NameAssignment_1 ) ) ;
    public final void rule__ProvidedRole__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5590:1: ( ( ( rule__ProvidedRole__NameAssignment_1 ) ) )
            // InternalMyDsl.g:5591:1: ( ( rule__ProvidedRole__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:5591:1: ( ( rule__ProvidedRole__NameAssignment_1 ) )
            // InternalMyDsl.g:5592:2: ( rule__ProvidedRole__NameAssignment_1 )
            {
             before(grammarAccess.getProvidedRoleAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:5593:2: ( rule__ProvidedRole__NameAssignment_1 )
            // InternalMyDsl.g:5593:3: rule__ProvidedRole__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ProvidedRole__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProvidedRoleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__Group__1__Impl"


    // $ANTLR start "rule__ProvidedRole__Group__2"
    // InternalMyDsl.g:5601:1: rule__ProvidedRole__Group__2 : rule__ProvidedRole__Group__2__Impl rule__ProvidedRole__Group__3 ;
    public final void rule__ProvidedRole__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5605:1: ( rule__ProvidedRole__Group__2__Impl rule__ProvidedRole__Group__3 )
            // InternalMyDsl.g:5606:2: rule__ProvidedRole__Group__2__Impl rule__ProvidedRole__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ProvidedRole__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProvidedRole__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__Group__2"


    // $ANTLR start "rule__ProvidedRole__Group__2__Impl"
    // InternalMyDsl.g:5613:1: rule__ProvidedRole__Group__2__Impl : ( '{' ) ;
    public final void rule__ProvidedRole__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5617:1: ( ( '{' ) )
            // InternalMyDsl.g:5618:1: ( '{' )
            {
            // InternalMyDsl.g:5618:1: ( '{' )
            // InternalMyDsl.g:5619:2: '{'
            {
             before(grammarAccess.getProvidedRoleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProvidedRoleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__Group__2__Impl"


    // $ANTLR start "rule__ProvidedRole__Group__3"
    // InternalMyDsl.g:5628:1: rule__ProvidedRole__Group__3 : rule__ProvidedRole__Group__3__Impl rule__ProvidedRole__Group__4 ;
    public final void rule__ProvidedRole__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5632:1: ( rule__ProvidedRole__Group__3__Impl rule__ProvidedRole__Group__4 )
            // InternalMyDsl.g:5633:2: rule__ProvidedRole__Group__3__Impl rule__ProvidedRole__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ProvidedRole__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProvidedRole__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__Group__3"


    // $ANTLR start "rule__ProvidedRole__Group__3__Impl"
    // InternalMyDsl.g:5640:1: rule__ProvidedRole__Group__3__Impl : ( 'interface' ) ;
    public final void rule__ProvidedRole__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5644:1: ( ( 'interface' ) )
            // InternalMyDsl.g:5645:1: ( 'interface' )
            {
            // InternalMyDsl.g:5645:1: ( 'interface' )
            // InternalMyDsl.g:5646:2: 'interface'
            {
             before(grammarAccess.getProvidedRoleAccess().getInterfaceKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProvidedRoleAccess().getInterfaceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__Group__3__Impl"


    // $ANTLR start "rule__ProvidedRole__Group__4"
    // InternalMyDsl.g:5655:1: rule__ProvidedRole__Group__4 : rule__ProvidedRole__Group__4__Impl rule__ProvidedRole__Group__5 ;
    public final void rule__ProvidedRole__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5659:1: ( rule__ProvidedRole__Group__4__Impl rule__ProvidedRole__Group__5 )
            // InternalMyDsl.g:5660:2: rule__ProvidedRole__Group__4__Impl rule__ProvidedRole__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__ProvidedRole__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProvidedRole__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__Group__4"


    // $ANTLR start "rule__ProvidedRole__Group__4__Impl"
    // InternalMyDsl.g:5667:1: rule__ProvidedRole__Group__4__Impl : ( ( rule__ProvidedRole__InterfaceAssignment_4 ) ) ;
    public final void rule__ProvidedRole__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5671:1: ( ( ( rule__ProvidedRole__InterfaceAssignment_4 ) ) )
            // InternalMyDsl.g:5672:1: ( ( rule__ProvidedRole__InterfaceAssignment_4 ) )
            {
            // InternalMyDsl.g:5672:1: ( ( rule__ProvidedRole__InterfaceAssignment_4 ) )
            // InternalMyDsl.g:5673:2: ( rule__ProvidedRole__InterfaceAssignment_4 )
            {
             before(grammarAccess.getProvidedRoleAccess().getInterfaceAssignment_4()); 
            // InternalMyDsl.g:5674:2: ( rule__ProvidedRole__InterfaceAssignment_4 )
            // InternalMyDsl.g:5674:3: rule__ProvidedRole__InterfaceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ProvidedRole__InterfaceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getProvidedRoleAccess().getInterfaceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__Group__4__Impl"


    // $ANTLR start "rule__ProvidedRole__Group__5"
    // InternalMyDsl.g:5682:1: rule__ProvidedRole__Group__5 : rule__ProvidedRole__Group__5__Impl ;
    public final void rule__ProvidedRole__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5686:1: ( rule__ProvidedRole__Group__5__Impl )
            // InternalMyDsl.g:5687:2: rule__ProvidedRole__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProvidedRole__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__Group__5"


    // $ANTLR start "rule__ProvidedRole__Group__5__Impl"
    // InternalMyDsl.g:5693:1: rule__ProvidedRole__Group__5__Impl : ( '}' ) ;
    public final void rule__ProvidedRole__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5697:1: ( ( '}' ) )
            // InternalMyDsl.g:5698:1: ( '}' )
            {
            // InternalMyDsl.g:5698:1: ( '}' )
            // InternalMyDsl.g:5699:2: '}'
            {
             before(grammarAccess.getProvidedRoleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getProvidedRoleAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__Group__5__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__0"
    // InternalMyDsl.g:5709:1: rule__CompositeComponent__Group__0 : rule__CompositeComponent__Group__0__Impl rule__CompositeComponent__Group__1 ;
    public final void rule__CompositeComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5713:1: ( rule__CompositeComponent__Group__0__Impl rule__CompositeComponent__Group__1 )
            // InternalMyDsl.g:5714:2: rule__CompositeComponent__Group__0__Impl rule__CompositeComponent__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__CompositeComponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__0"


    // $ANTLR start "rule__CompositeComponent__Group__0__Impl"
    // InternalMyDsl.g:5721:1: rule__CompositeComponent__Group__0__Impl : ( 'CompositeComponent' ) ;
    public final void rule__CompositeComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5725:1: ( ( 'CompositeComponent' ) )
            // InternalMyDsl.g:5726:1: ( 'CompositeComponent' )
            {
            // InternalMyDsl.g:5726:1: ( 'CompositeComponent' )
            // InternalMyDsl.g:5727:2: 'CompositeComponent'
            {
             before(grammarAccess.getCompositeComponentAccess().getCompositeComponentKeyword_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getCompositeComponentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__1"
    // InternalMyDsl.g:5736:1: rule__CompositeComponent__Group__1 : rule__CompositeComponent__Group__1__Impl rule__CompositeComponent__Group__2 ;
    public final void rule__CompositeComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5740:1: ( rule__CompositeComponent__Group__1__Impl rule__CompositeComponent__Group__2 )
            // InternalMyDsl.g:5741:2: rule__CompositeComponent__Group__1__Impl rule__CompositeComponent__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__CompositeComponent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__1"


    // $ANTLR start "rule__CompositeComponent__Group__1__Impl"
    // InternalMyDsl.g:5748:1: rule__CompositeComponent__Group__1__Impl : ( ( rule__CompositeComponent__NameAssignment_1 ) ) ;
    public final void rule__CompositeComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5752:1: ( ( ( rule__CompositeComponent__NameAssignment_1 ) ) )
            // InternalMyDsl.g:5753:1: ( ( rule__CompositeComponent__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:5753:1: ( ( rule__CompositeComponent__NameAssignment_1 ) )
            // InternalMyDsl.g:5754:2: ( rule__CompositeComponent__NameAssignment_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:5755:2: ( rule__CompositeComponent__NameAssignment_1 )
            // InternalMyDsl.g:5755:3: rule__CompositeComponent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__1__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__2"
    // InternalMyDsl.g:5763:1: rule__CompositeComponent__Group__2 : rule__CompositeComponent__Group__2__Impl rule__CompositeComponent__Group__3 ;
    public final void rule__CompositeComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5767:1: ( rule__CompositeComponent__Group__2__Impl rule__CompositeComponent__Group__3 )
            // InternalMyDsl.g:5768:2: rule__CompositeComponent__Group__2__Impl rule__CompositeComponent__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__CompositeComponent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__2"


    // $ANTLR start "rule__CompositeComponent__Group__2__Impl"
    // InternalMyDsl.g:5775:1: rule__CompositeComponent__Group__2__Impl : ( '{' ) ;
    public final void rule__CompositeComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5779:1: ( ( '{' ) )
            // InternalMyDsl.g:5780:1: ( '{' )
            {
            // InternalMyDsl.g:5780:1: ( '{' )
            // InternalMyDsl.g:5781:2: '{'
            {
             before(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__2__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__3"
    // InternalMyDsl.g:5790:1: rule__CompositeComponent__Group__3 : rule__CompositeComponent__Group__3__Impl rule__CompositeComponent__Group__4 ;
    public final void rule__CompositeComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5794:1: ( rule__CompositeComponent__Group__3__Impl rule__CompositeComponent__Group__4 )
            // InternalMyDsl.g:5795:2: rule__CompositeComponent__Group__3__Impl rule__CompositeComponent__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__CompositeComponent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__3"


    // $ANTLR start "rule__CompositeComponent__Group__3__Impl"
    // InternalMyDsl.g:5802:1: rule__CompositeComponent__Group__3__Impl : ( ( rule__CompositeComponent__Group_3__0 )? ) ;
    public final void rule__CompositeComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5806:1: ( ( ( rule__CompositeComponent__Group_3__0 )? ) )
            // InternalMyDsl.g:5807:1: ( ( rule__CompositeComponent__Group_3__0 )? )
            {
            // InternalMyDsl.g:5807:1: ( ( rule__CompositeComponent__Group_3__0 )? )
            // InternalMyDsl.g:5808:2: ( rule__CompositeComponent__Group_3__0 )?
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_3()); 
            // InternalMyDsl.g:5809:2: ( rule__CompositeComponent__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==56) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:5809:3: rule__CompositeComponent__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeComponent__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeComponentAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__3__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__4"
    // InternalMyDsl.g:5817:1: rule__CompositeComponent__Group__4 : rule__CompositeComponent__Group__4__Impl rule__CompositeComponent__Group__5 ;
    public final void rule__CompositeComponent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5821:1: ( rule__CompositeComponent__Group__4__Impl rule__CompositeComponent__Group__5 )
            // InternalMyDsl.g:5822:2: rule__CompositeComponent__Group__4__Impl rule__CompositeComponent__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__CompositeComponent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__4"


    // $ANTLR start "rule__CompositeComponent__Group__4__Impl"
    // InternalMyDsl.g:5829:1: rule__CompositeComponent__Group__4__Impl : ( 'service' ) ;
    public final void rule__CompositeComponent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5833:1: ( ( 'service' ) )
            // InternalMyDsl.g:5834:1: ( 'service' )
            {
            // InternalMyDsl.g:5834:1: ( 'service' )
            // InternalMyDsl.g:5835:2: 'service'
            {
             before(grammarAccess.getCompositeComponentAccess().getServiceKeyword_4()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getServiceKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__4__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__5"
    // InternalMyDsl.g:5844:1: rule__CompositeComponent__Group__5 : rule__CompositeComponent__Group__5__Impl rule__CompositeComponent__Group__6 ;
    public final void rule__CompositeComponent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5848:1: ( rule__CompositeComponent__Group__5__Impl rule__CompositeComponent__Group__6 )
            // InternalMyDsl.g:5849:2: rule__CompositeComponent__Group__5__Impl rule__CompositeComponent__Group__6
            {
            pushFollow(FOLLOW_34);
            rule__CompositeComponent__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__5"


    // $ANTLR start "rule__CompositeComponent__Group__5__Impl"
    // InternalMyDsl.g:5856:1: rule__CompositeComponent__Group__5__Impl : ( '{' ) ;
    public final void rule__CompositeComponent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5860:1: ( ( '{' ) )
            // InternalMyDsl.g:5861:1: ( '{' )
            {
            // InternalMyDsl.g:5861:1: ( '{' )
            // InternalMyDsl.g:5862:2: '{'
            {
             before(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__5__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__6"
    // InternalMyDsl.g:5871:1: rule__CompositeComponent__Group__6 : rule__CompositeComponent__Group__6__Impl rule__CompositeComponent__Group__7 ;
    public final void rule__CompositeComponent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5875:1: ( rule__CompositeComponent__Group__6__Impl rule__CompositeComponent__Group__7 )
            // InternalMyDsl.g:5876:2: rule__CompositeComponent__Group__6__Impl rule__CompositeComponent__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__CompositeComponent__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__6"


    // $ANTLR start "rule__CompositeComponent__Group__6__Impl"
    // InternalMyDsl.g:5883:1: rule__CompositeComponent__Group__6__Impl : ( ( rule__CompositeComponent__ServiceAssignment_6 ) ) ;
    public final void rule__CompositeComponent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5887:1: ( ( ( rule__CompositeComponent__ServiceAssignment_6 ) ) )
            // InternalMyDsl.g:5888:1: ( ( rule__CompositeComponent__ServiceAssignment_6 ) )
            {
            // InternalMyDsl.g:5888:1: ( ( rule__CompositeComponent__ServiceAssignment_6 ) )
            // InternalMyDsl.g:5889:2: ( rule__CompositeComponent__ServiceAssignment_6 )
            {
             before(grammarAccess.getCompositeComponentAccess().getServiceAssignment_6()); 
            // InternalMyDsl.g:5890:2: ( rule__CompositeComponent__ServiceAssignment_6 )
            // InternalMyDsl.g:5890:3: rule__CompositeComponent__ServiceAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__ServiceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getServiceAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__6__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__7"
    // InternalMyDsl.g:5898:1: rule__CompositeComponent__Group__7 : rule__CompositeComponent__Group__7__Impl rule__CompositeComponent__Group__8 ;
    public final void rule__CompositeComponent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5902:1: ( rule__CompositeComponent__Group__7__Impl rule__CompositeComponent__Group__8 )
            // InternalMyDsl.g:5903:2: rule__CompositeComponent__Group__7__Impl rule__CompositeComponent__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__CompositeComponent__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__7"


    // $ANTLR start "rule__CompositeComponent__Group__7__Impl"
    // InternalMyDsl.g:5910:1: rule__CompositeComponent__Group__7__Impl : ( ( rule__CompositeComponent__Group_7__0 )* ) ;
    public final void rule__CompositeComponent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5914:1: ( ( ( rule__CompositeComponent__Group_7__0 )* ) )
            // InternalMyDsl.g:5915:1: ( ( rule__CompositeComponent__Group_7__0 )* )
            {
            // InternalMyDsl.g:5915:1: ( ( rule__CompositeComponent__Group_7__0 )* )
            // InternalMyDsl.g:5916:2: ( rule__CompositeComponent__Group_7__0 )*
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_7()); 
            // InternalMyDsl.g:5917:2: ( rule__CompositeComponent__Group_7__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==28) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:5917:3: rule__CompositeComponent__Group_7__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__CompositeComponent__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getCompositeComponentAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__7__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__8"
    // InternalMyDsl.g:5925:1: rule__CompositeComponent__Group__8 : rule__CompositeComponent__Group__8__Impl rule__CompositeComponent__Group__9 ;
    public final void rule__CompositeComponent__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5929:1: ( rule__CompositeComponent__Group__8__Impl rule__CompositeComponent__Group__9 )
            // InternalMyDsl.g:5930:2: rule__CompositeComponent__Group__8__Impl rule__CompositeComponent__Group__9
            {
            pushFollow(FOLLOW_35);
            rule__CompositeComponent__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__8"


    // $ANTLR start "rule__CompositeComponent__Group__8__Impl"
    // InternalMyDsl.g:5937:1: rule__CompositeComponent__Group__8__Impl : ( '}' ) ;
    public final void rule__CompositeComponent__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5941:1: ( ( '}' ) )
            // InternalMyDsl.g:5942:1: ( '}' )
            {
            // InternalMyDsl.g:5942:1: ( '}' )
            // InternalMyDsl.g:5943:2: '}'
            {
             before(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__8__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__9"
    // InternalMyDsl.g:5952:1: rule__CompositeComponent__Group__9 : rule__CompositeComponent__Group__9__Impl rule__CompositeComponent__Group__10 ;
    public final void rule__CompositeComponent__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5956:1: ( rule__CompositeComponent__Group__9__Impl rule__CompositeComponent__Group__10 )
            // InternalMyDsl.g:5957:2: rule__CompositeComponent__Group__9__Impl rule__CompositeComponent__Group__10
            {
            pushFollow(FOLLOW_35);
            rule__CompositeComponent__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__9"


    // $ANTLR start "rule__CompositeComponent__Group__9__Impl"
    // InternalMyDsl.g:5964:1: rule__CompositeComponent__Group__9__Impl : ( ( rule__CompositeComponent__Group_9__0 )? ) ;
    public final void rule__CompositeComponent__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5968:1: ( ( ( rule__CompositeComponent__Group_9__0 )? ) )
            // InternalMyDsl.g:5969:1: ( ( rule__CompositeComponent__Group_9__0 )? )
            {
            // InternalMyDsl.g:5969:1: ( ( rule__CompositeComponent__Group_9__0 )? )
            // InternalMyDsl.g:5970:2: ( rule__CompositeComponent__Group_9__0 )?
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_9()); 
            // InternalMyDsl.g:5971:2: ( rule__CompositeComponent__Group_9__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==41) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:5971:3: rule__CompositeComponent__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeComponent__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeComponentAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__9__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__10"
    // InternalMyDsl.g:5979:1: rule__CompositeComponent__Group__10 : rule__CompositeComponent__Group__10__Impl rule__CompositeComponent__Group__11 ;
    public final void rule__CompositeComponent__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5983:1: ( rule__CompositeComponent__Group__10__Impl rule__CompositeComponent__Group__11 )
            // InternalMyDsl.g:5984:2: rule__CompositeComponent__Group__10__Impl rule__CompositeComponent__Group__11
            {
            pushFollow(FOLLOW_36);
            rule__CompositeComponent__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__10"


    // $ANTLR start "rule__CompositeComponent__Group__10__Impl"
    // InternalMyDsl.g:5991:1: rule__CompositeComponent__Group__10__Impl : ( 'providedrole' ) ;
    public final void rule__CompositeComponent__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5995:1: ( ( 'providedrole' ) )
            // InternalMyDsl.g:5996:1: ( 'providedrole' )
            {
            // InternalMyDsl.g:5996:1: ( 'providedrole' )
            // InternalMyDsl.g:5997:2: 'providedrole'
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedroleKeyword_10()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getProvidedroleKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__10__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__11"
    // InternalMyDsl.g:6006:1: rule__CompositeComponent__Group__11 : rule__CompositeComponent__Group__11__Impl rule__CompositeComponent__Group__12 ;
    public final void rule__CompositeComponent__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6010:1: ( rule__CompositeComponent__Group__11__Impl rule__CompositeComponent__Group__12 )
            // InternalMyDsl.g:6011:2: rule__CompositeComponent__Group__11__Impl rule__CompositeComponent__Group__12
            {
            pushFollow(FOLLOW_41);
            rule__CompositeComponent__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__11"


    // $ANTLR start "rule__CompositeComponent__Group__11__Impl"
    // InternalMyDsl.g:6018:1: rule__CompositeComponent__Group__11__Impl : ( ( rule__CompositeComponent__ProvidedroleAssignment_11 ) ) ;
    public final void rule__CompositeComponent__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6022:1: ( ( ( rule__CompositeComponent__ProvidedroleAssignment_11 ) ) )
            // InternalMyDsl.g:6023:1: ( ( rule__CompositeComponent__ProvidedroleAssignment_11 ) )
            {
            // InternalMyDsl.g:6023:1: ( ( rule__CompositeComponent__ProvidedroleAssignment_11 ) )
            // InternalMyDsl.g:6024:2: ( rule__CompositeComponent__ProvidedroleAssignment_11 )
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedroleAssignment_11()); 
            // InternalMyDsl.g:6025:2: ( rule__CompositeComponent__ProvidedroleAssignment_11 )
            // InternalMyDsl.g:6025:3: rule__CompositeComponent__ProvidedroleAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__ProvidedroleAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getProvidedroleAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__11__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__12"
    // InternalMyDsl.g:6033:1: rule__CompositeComponent__Group__12 : rule__CompositeComponent__Group__12__Impl rule__CompositeComponent__Group__13 ;
    public final void rule__CompositeComponent__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6037:1: ( rule__CompositeComponent__Group__12__Impl rule__CompositeComponent__Group__13 )
            // InternalMyDsl.g:6038:2: rule__CompositeComponent__Group__12__Impl rule__CompositeComponent__Group__13
            {
            pushFollow(FOLLOW_3);
            rule__CompositeComponent__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__12"


    // $ANTLR start "rule__CompositeComponent__Group__12__Impl"
    // InternalMyDsl.g:6045:1: rule__CompositeComponent__Group__12__Impl : ( 'assemblycontext' ) ;
    public final void rule__CompositeComponent__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6049:1: ( ( 'assemblycontext' ) )
            // InternalMyDsl.g:6050:1: ( 'assemblycontext' )
            {
            // InternalMyDsl.g:6050:1: ( 'assemblycontext' )
            // InternalMyDsl.g:6051:2: 'assemblycontext'
            {
             before(grammarAccess.getCompositeComponentAccess().getAssemblycontextKeyword_12()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getAssemblycontextKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__12__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__13"
    // InternalMyDsl.g:6060:1: rule__CompositeComponent__Group__13 : rule__CompositeComponent__Group__13__Impl rule__CompositeComponent__Group__14 ;
    public final void rule__CompositeComponent__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6064:1: ( rule__CompositeComponent__Group__13__Impl rule__CompositeComponent__Group__14 )
            // InternalMyDsl.g:6065:2: rule__CompositeComponent__Group__13__Impl rule__CompositeComponent__Group__14
            {
            pushFollow(FOLLOW_11);
            rule__CompositeComponent__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__13"


    // $ANTLR start "rule__CompositeComponent__Group__13__Impl"
    // InternalMyDsl.g:6072:1: rule__CompositeComponent__Group__13__Impl : ( '{' ) ;
    public final void rule__CompositeComponent__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6076:1: ( ( '{' ) )
            // InternalMyDsl.g:6077:1: ( '{' )
            {
            // InternalMyDsl.g:6077:1: ( '{' )
            // InternalMyDsl.g:6078:2: '{'
            {
             before(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_13()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__13__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__14"
    // InternalMyDsl.g:6087:1: rule__CompositeComponent__Group__14 : rule__CompositeComponent__Group__14__Impl rule__CompositeComponent__Group__15 ;
    public final void rule__CompositeComponent__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6091:1: ( rule__CompositeComponent__Group__14__Impl rule__CompositeComponent__Group__15 )
            // InternalMyDsl.g:6092:2: rule__CompositeComponent__Group__14__Impl rule__CompositeComponent__Group__15
            {
            pushFollow(FOLLOW_12);
            rule__CompositeComponent__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__14"


    // $ANTLR start "rule__CompositeComponent__Group__14__Impl"
    // InternalMyDsl.g:6099:1: rule__CompositeComponent__Group__14__Impl : ( ( rule__CompositeComponent__AssemblycontextAssignment_14 ) ) ;
    public final void rule__CompositeComponent__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6103:1: ( ( ( rule__CompositeComponent__AssemblycontextAssignment_14 ) ) )
            // InternalMyDsl.g:6104:1: ( ( rule__CompositeComponent__AssemblycontextAssignment_14 ) )
            {
            // InternalMyDsl.g:6104:1: ( ( rule__CompositeComponent__AssemblycontextAssignment_14 ) )
            // InternalMyDsl.g:6105:2: ( rule__CompositeComponent__AssemblycontextAssignment_14 )
            {
             before(grammarAccess.getCompositeComponentAccess().getAssemblycontextAssignment_14()); 
            // InternalMyDsl.g:6106:2: ( rule__CompositeComponent__AssemblycontextAssignment_14 )
            // InternalMyDsl.g:6106:3: rule__CompositeComponent__AssemblycontextAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__AssemblycontextAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getAssemblycontextAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__14__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__15"
    // InternalMyDsl.g:6114:1: rule__CompositeComponent__Group__15 : rule__CompositeComponent__Group__15__Impl rule__CompositeComponent__Group__16 ;
    public final void rule__CompositeComponent__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6118:1: ( rule__CompositeComponent__Group__15__Impl rule__CompositeComponent__Group__16 )
            // InternalMyDsl.g:6119:2: rule__CompositeComponent__Group__15__Impl rule__CompositeComponent__Group__16
            {
            pushFollow(FOLLOW_12);
            rule__CompositeComponent__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__15"


    // $ANTLR start "rule__CompositeComponent__Group__15__Impl"
    // InternalMyDsl.g:6126:1: rule__CompositeComponent__Group__15__Impl : ( ( rule__CompositeComponent__Group_15__0 )* ) ;
    public final void rule__CompositeComponent__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6130:1: ( ( ( rule__CompositeComponent__Group_15__0 )* ) )
            // InternalMyDsl.g:6131:1: ( ( rule__CompositeComponent__Group_15__0 )* )
            {
            // InternalMyDsl.g:6131:1: ( ( rule__CompositeComponent__Group_15__0 )* )
            // InternalMyDsl.g:6132:2: ( rule__CompositeComponent__Group_15__0 )*
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_15()); 
            // InternalMyDsl.g:6133:2: ( rule__CompositeComponent__Group_15__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==28) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMyDsl.g:6133:3: rule__CompositeComponent__Group_15__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__CompositeComponent__Group_15__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getCompositeComponentAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__15__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__16"
    // InternalMyDsl.g:6141:1: rule__CompositeComponent__Group__16 : rule__CompositeComponent__Group__16__Impl rule__CompositeComponent__Group__17 ;
    public final void rule__CompositeComponent__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6145:1: ( rule__CompositeComponent__Group__16__Impl rule__CompositeComponent__Group__17 )
            // InternalMyDsl.g:6146:2: rule__CompositeComponent__Group__16__Impl rule__CompositeComponent__Group__17
            {
            pushFollow(FOLLOW_42);
            rule__CompositeComponent__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__16"


    // $ANTLR start "rule__CompositeComponent__Group__16__Impl"
    // InternalMyDsl.g:6153:1: rule__CompositeComponent__Group__16__Impl : ( '}' ) ;
    public final void rule__CompositeComponent__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6157:1: ( ( '}' ) )
            // InternalMyDsl.g:6158:1: ( '}' )
            {
            // InternalMyDsl.g:6158:1: ( '}' )
            // InternalMyDsl.g:6159:2: '}'
            {
             before(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_16()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__16__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__17"
    // InternalMyDsl.g:6168:1: rule__CompositeComponent__Group__17 : rule__CompositeComponent__Group__17__Impl rule__CompositeComponent__Group__18 ;
    public final void rule__CompositeComponent__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6172:1: ( rule__CompositeComponent__Group__17__Impl rule__CompositeComponent__Group__18 )
            // InternalMyDsl.g:6173:2: rule__CompositeComponent__Group__17__Impl rule__CompositeComponent__Group__18
            {
            pushFollow(FOLLOW_3);
            rule__CompositeComponent__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__17"


    // $ANTLR start "rule__CompositeComponent__Group__17__Impl"
    // InternalMyDsl.g:6180:1: rule__CompositeComponent__Group__17__Impl : ( 'delegationconnector' ) ;
    public final void rule__CompositeComponent__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6184:1: ( ( 'delegationconnector' ) )
            // InternalMyDsl.g:6185:1: ( 'delegationconnector' )
            {
            // InternalMyDsl.g:6185:1: ( 'delegationconnector' )
            // InternalMyDsl.g:6186:2: 'delegationconnector'
            {
             before(grammarAccess.getCompositeComponentAccess().getDelegationconnectorKeyword_17()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getDelegationconnectorKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__17__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__18"
    // InternalMyDsl.g:6195:1: rule__CompositeComponent__Group__18 : rule__CompositeComponent__Group__18__Impl rule__CompositeComponent__Group__19 ;
    public final void rule__CompositeComponent__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6199:1: ( rule__CompositeComponent__Group__18__Impl rule__CompositeComponent__Group__19 )
            // InternalMyDsl.g:6200:2: rule__CompositeComponent__Group__18__Impl rule__CompositeComponent__Group__19
            {
            pushFollow(FOLLOW_43);
            rule__CompositeComponent__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__18"


    // $ANTLR start "rule__CompositeComponent__Group__18__Impl"
    // InternalMyDsl.g:6207:1: rule__CompositeComponent__Group__18__Impl : ( '{' ) ;
    public final void rule__CompositeComponent__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6211:1: ( ( '{' ) )
            // InternalMyDsl.g:6212:1: ( '{' )
            {
            // InternalMyDsl.g:6212:1: ( '{' )
            // InternalMyDsl.g:6213:2: '{'
            {
             before(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_18()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__18__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__19"
    // InternalMyDsl.g:6222:1: rule__CompositeComponent__Group__19 : rule__CompositeComponent__Group__19__Impl rule__CompositeComponent__Group__20 ;
    public final void rule__CompositeComponent__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6226:1: ( rule__CompositeComponent__Group__19__Impl rule__CompositeComponent__Group__20 )
            // InternalMyDsl.g:6227:2: rule__CompositeComponent__Group__19__Impl rule__CompositeComponent__Group__20
            {
            pushFollow(FOLLOW_12);
            rule__CompositeComponent__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__19"


    // $ANTLR start "rule__CompositeComponent__Group__19__Impl"
    // InternalMyDsl.g:6234:1: rule__CompositeComponent__Group__19__Impl : ( ( rule__CompositeComponent__DelegationconnectorAssignment_19 ) ) ;
    public final void rule__CompositeComponent__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6238:1: ( ( ( rule__CompositeComponent__DelegationconnectorAssignment_19 ) ) )
            // InternalMyDsl.g:6239:1: ( ( rule__CompositeComponent__DelegationconnectorAssignment_19 ) )
            {
            // InternalMyDsl.g:6239:1: ( ( rule__CompositeComponent__DelegationconnectorAssignment_19 ) )
            // InternalMyDsl.g:6240:2: ( rule__CompositeComponent__DelegationconnectorAssignment_19 )
            {
             before(grammarAccess.getCompositeComponentAccess().getDelegationconnectorAssignment_19()); 
            // InternalMyDsl.g:6241:2: ( rule__CompositeComponent__DelegationconnectorAssignment_19 )
            // InternalMyDsl.g:6241:3: rule__CompositeComponent__DelegationconnectorAssignment_19
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__DelegationconnectorAssignment_19();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getDelegationconnectorAssignment_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__19__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__20"
    // InternalMyDsl.g:6249:1: rule__CompositeComponent__Group__20 : rule__CompositeComponent__Group__20__Impl rule__CompositeComponent__Group__21 ;
    public final void rule__CompositeComponent__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6253:1: ( rule__CompositeComponent__Group__20__Impl rule__CompositeComponent__Group__21 )
            // InternalMyDsl.g:6254:2: rule__CompositeComponent__Group__20__Impl rule__CompositeComponent__Group__21
            {
            pushFollow(FOLLOW_12);
            rule__CompositeComponent__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__20"


    // $ANTLR start "rule__CompositeComponent__Group__20__Impl"
    // InternalMyDsl.g:6261:1: rule__CompositeComponent__Group__20__Impl : ( ( rule__CompositeComponent__Group_20__0 )* ) ;
    public final void rule__CompositeComponent__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6265:1: ( ( ( rule__CompositeComponent__Group_20__0 )* ) )
            // InternalMyDsl.g:6266:1: ( ( rule__CompositeComponent__Group_20__0 )* )
            {
            // InternalMyDsl.g:6266:1: ( ( rule__CompositeComponent__Group_20__0 )* )
            // InternalMyDsl.g:6267:2: ( rule__CompositeComponent__Group_20__0 )*
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_20()); 
            // InternalMyDsl.g:6268:2: ( rule__CompositeComponent__Group_20__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==28) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMyDsl.g:6268:3: rule__CompositeComponent__Group_20__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__CompositeComponent__Group_20__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getCompositeComponentAccess().getGroup_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__20__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__21"
    // InternalMyDsl.g:6276:1: rule__CompositeComponent__Group__21 : rule__CompositeComponent__Group__21__Impl rule__CompositeComponent__Group__22 ;
    public final void rule__CompositeComponent__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6280:1: ( rule__CompositeComponent__Group__21__Impl rule__CompositeComponent__Group__22 )
            // InternalMyDsl.g:6281:2: rule__CompositeComponent__Group__21__Impl rule__CompositeComponent__Group__22
            {
            pushFollow(FOLLOW_19);
            rule__CompositeComponent__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__21"


    // $ANTLR start "rule__CompositeComponent__Group__21__Impl"
    // InternalMyDsl.g:6288:1: rule__CompositeComponent__Group__21__Impl : ( '}' ) ;
    public final void rule__CompositeComponent__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6292:1: ( ( '}' ) )
            // InternalMyDsl.g:6293:1: ( '}' )
            {
            // InternalMyDsl.g:6293:1: ( '}' )
            // InternalMyDsl.g:6294:2: '}'
            {
             before(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_21()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__21__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__22"
    // InternalMyDsl.g:6303:1: rule__CompositeComponent__Group__22 : rule__CompositeComponent__Group__22__Impl ;
    public final void rule__CompositeComponent__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6307:1: ( rule__CompositeComponent__Group__22__Impl )
            // InternalMyDsl.g:6308:2: rule__CompositeComponent__Group__22__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__22__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__22"


    // $ANTLR start "rule__CompositeComponent__Group__22__Impl"
    // InternalMyDsl.g:6314:1: rule__CompositeComponent__Group__22__Impl : ( '}' ) ;
    public final void rule__CompositeComponent__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6318:1: ( ( '}' ) )
            // InternalMyDsl.g:6319:1: ( '}' )
            {
            // InternalMyDsl.g:6319:1: ( '}' )
            // InternalMyDsl.g:6320:2: '}'
            {
             before(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_22()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__22__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_3__0"
    // InternalMyDsl.g:6330:1: rule__CompositeComponent__Group_3__0 : rule__CompositeComponent__Group_3__0__Impl rule__CompositeComponent__Group_3__1 ;
    public final void rule__CompositeComponent__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6334:1: ( rule__CompositeComponent__Group_3__0__Impl rule__CompositeComponent__Group_3__1 )
            // InternalMyDsl.g:6335:2: rule__CompositeComponent__Group_3__0__Impl rule__CompositeComponent__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__CompositeComponent__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__0"


    // $ANTLR start "rule__CompositeComponent__Group_3__0__Impl"
    // InternalMyDsl.g:6342:1: rule__CompositeComponent__Group_3__0__Impl : ( 'behaviourdescription' ) ;
    public final void rule__CompositeComponent__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6346:1: ( ( 'behaviourdescription' ) )
            // InternalMyDsl.g:6347:1: ( 'behaviourdescription' )
            {
            // InternalMyDsl.g:6347:1: ( 'behaviourdescription' )
            // InternalMyDsl.g:6348:2: 'behaviourdescription'
            {
             before(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionKeyword_3_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_3__1"
    // InternalMyDsl.g:6357:1: rule__CompositeComponent__Group_3__1 : rule__CompositeComponent__Group_3__1__Impl rule__CompositeComponent__Group_3__2 ;
    public final void rule__CompositeComponent__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6361:1: ( rule__CompositeComponent__Group_3__1__Impl rule__CompositeComponent__Group_3__2 )
            // InternalMyDsl.g:6362:2: rule__CompositeComponent__Group_3__1__Impl rule__CompositeComponent__Group_3__2
            {
            pushFollow(FOLLOW_37);
            rule__CompositeComponent__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__1"


    // $ANTLR start "rule__CompositeComponent__Group_3__1__Impl"
    // InternalMyDsl.g:6369:1: rule__CompositeComponent__Group_3__1__Impl : ( '{' ) ;
    public final void rule__CompositeComponent__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6373:1: ( ( '{' ) )
            // InternalMyDsl.g:6374:1: ( '{' )
            {
            // InternalMyDsl.g:6374:1: ( '{' )
            // InternalMyDsl.g:6375:2: '{'
            {
             before(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__1__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_3__2"
    // InternalMyDsl.g:6384:1: rule__CompositeComponent__Group_3__2 : rule__CompositeComponent__Group_3__2__Impl rule__CompositeComponent__Group_3__3 ;
    public final void rule__CompositeComponent__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6388:1: ( rule__CompositeComponent__Group_3__2__Impl rule__CompositeComponent__Group_3__3 )
            // InternalMyDsl.g:6389:2: rule__CompositeComponent__Group_3__2__Impl rule__CompositeComponent__Group_3__3
            {
            pushFollow(FOLLOW_12);
            rule__CompositeComponent__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__2"


    // $ANTLR start "rule__CompositeComponent__Group_3__2__Impl"
    // InternalMyDsl.g:6396:1: rule__CompositeComponent__Group_3__2__Impl : ( ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_2 ) ) ;
    public final void rule__CompositeComponent__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6400:1: ( ( ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_2 ) ) )
            // InternalMyDsl.g:6401:1: ( ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_2 ) )
            {
            // InternalMyDsl.g:6401:1: ( ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_2 ) )
            // InternalMyDsl.g:6402:2: ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_2 )
            {
             before(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionAssignment_3_2()); 
            // InternalMyDsl.g:6403:2: ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_2 )
            // InternalMyDsl.g:6403:3: rule__CompositeComponent__BehaviourdescriptionAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__BehaviourdescriptionAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__2__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_3__3"
    // InternalMyDsl.g:6411:1: rule__CompositeComponent__Group_3__3 : rule__CompositeComponent__Group_3__3__Impl rule__CompositeComponent__Group_3__4 ;
    public final void rule__CompositeComponent__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6415:1: ( rule__CompositeComponent__Group_3__3__Impl rule__CompositeComponent__Group_3__4 )
            // InternalMyDsl.g:6416:2: rule__CompositeComponent__Group_3__3__Impl rule__CompositeComponent__Group_3__4
            {
            pushFollow(FOLLOW_12);
            rule__CompositeComponent__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__3"


    // $ANTLR start "rule__CompositeComponent__Group_3__3__Impl"
    // InternalMyDsl.g:6423:1: rule__CompositeComponent__Group_3__3__Impl : ( ( rule__CompositeComponent__Group_3_3__0 )* ) ;
    public final void rule__CompositeComponent__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6427:1: ( ( ( rule__CompositeComponent__Group_3_3__0 )* ) )
            // InternalMyDsl.g:6428:1: ( ( rule__CompositeComponent__Group_3_3__0 )* )
            {
            // InternalMyDsl.g:6428:1: ( ( rule__CompositeComponent__Group_3_3__0 )* )
            // InternalMyDsl.g:6429:2: ( rule__CompositeComponent__Group_3_3__0 )*
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_3_3()); 
            // InternalMyDsl.g:6430:2: ( rule__CompositeComponent__Group_3_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==28) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMyDsl.g:6430:3: rule__CompositeComponent__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__CompositeComponent__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getCompositeComponentAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__3__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_3__4"
    // InternalMyDsl.g:6438:1: rule__CompositeComponent__Group_3__4 : rule__CompositeComponent__Group_3__4__Impl ;
    public final void rule__CompositeComponent__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6442:1: ( rule__CompositeComponent__Group_3__4__Impl )
            // InternalMyDsl.g:6443:2: rule__CompositeComponent__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__4"


    // $ANTLR start "rule__CompositeComponent__Group_3__4__Impl"
    // InternalMyDsl.g:6449:1: rule__CompositeComponent__Group_3__4__Impl : ( '}' ) ;
    public final void rule__CompositeComponent__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6453:1: ( ( '}' ) )
            // InternalMyDsl.g:6454:1: ( '}' )
            {
            // InternalMyDsl.g:6454:1: ( '}' )
            // InternalMyDsl.g:6455:2: '}'
            {
             before(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__4__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_3_3__0"
    // InternalMyDsl.g:6465:1: rule__CompositeComponent__Group_3_3__0 : rule__CompositeComponent__Group_3_3__0__Impl rule__CompositeComponent__Group_3_3__1 ;
    public final void rule__CompositeComponent__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6469:1: ( rule__CompositeComponent__Group_3_3__0__Impl rule__CompositeComponent__Group_3_3__1 )
            // InternalMyDsl.g:6470:2: rule__CompositeComponent__Group_3_3__0__Impl rule__CompositeComponent__Group_3_3__1
            {
            pushFollow(FOLLOW_37);
            rule__CompositeComponent__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3_3__0"


    // $ANTLR start "rule__CompositeComponent__Group_3_3__0__Impl"
    // InternalMyDsl.g:6477:1: rule__CompositeComponent__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__CompositeComponent__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6481:1: ( ( ',' ) )
            // InternalMyDsl.g:6482:1: ( ',' )
            {
            // InternalMyDsl.g:6482:1: ( ',' )
            // InternalMyDsl.g:6483:2: ','
            {
             before(grammarAccess.getCompositeComponentAccess().getCommaKeyword_3_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3_3__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_3_3__1"
    // InternalMyDsl.g:6492:1: rule__CompositeComponent__Group_3_3__1 : rule__CompositeComponent__Group_3_3__1__Impl ;
    public final void rule__CompositeComponent__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6496:1: ( rule__CompositeComponent__Group_3_3__1__Impl )
            // InternalMyDsl.g:6497:2: rule__CompositeComponent__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3_3__1"


    // $ANTLR start "rule__CompositeComponent__Group_3_3__1__Impl"
    // InternalMyDsl.g:6503:1: rule__CompositeComponent__Group_3_3__1__Impl : ( ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1 ) ) ;
    public final void rule__CompositeComponent__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6507:1: ( ( ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1 ) ) )
            // InternalMyDsl.g:6508:1: ( ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1 ) )
            {
            // InternalMyDsl.g:6508:1: ( ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1 ) )
            // InternalMyDsl.g:6509:2: ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionAssignment_3_3_1()); 
            // InternalMyDsl.g:6510:2: ( rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1 )
            // InternalMyDsl.g:6510:3: rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3_3__1__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_7__0"
    // InternalMyDsl.g:6519:1: rule__CompositeComponent__Group_7__0 : rule__CompositeComponent__Group_7__0__Impl rule__CompositeComponent__Group_7__1 ;
    public final void rule__CompositeComponent__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6523:1: ( rule__CompositeComponent__Group_7__0__Impl rule__CompositeComponent__Group_7__1 )
            // InternalMyDsl.g:6524:2: rule__CompositeComponent__Group_7__0__Impl rule__CompositeComponent__Group_7__1
            {
            pushFollow(FOLLOW_34);
            rule__CompositeComponent__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_7__0"


    // $ANTLR start "rule__CompositeComponent__Group_7__0__Impl"
    // InternalMyDsl.g:6531:1: rule__CompositeComponent__Group_7__0__Impl : ( ',' ) ;
    public final void rule__CompositeComponent__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6535:1: ( ( ',' ) )
            // InternalMyDsl.g:6536:1: ( ',' )
            {
            // InternalMyDsl.g:6536:1: ( ',' )
            // InternalMyDsl.g:6537:2: ','
            {
             before(grammarAccess.getCompositeComponentAccess().getCommaKeyword_7_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_7__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_7__1"
    // InternalMyDsl.g:6546:1: rule__CompositeComponent__Group_7__1 : rule__CompositeComponent__Group_7__1__Impl ;
    public final void rule__CompositeComponent__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6550:1: ( rule__CompositeComponent__Group_7__1__Impl )
            // InternalMyDsl.g:6551:2: rule__CompositeComponent__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_7__1"


    // $ANTLR start "rule__CompositeComponent__Group_7__1__Impl"
    // InternalMyDsl.g:6557:1: rule__CompositeComponent__Group_7__1__Impl : ( ( rule__CompositeComponent__ServiceAssignment_7_1 ) ) ;
    public final void rule__CompositeComponent__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6561:1: ( ( ( rule__CompositeComponent__ServiceAssignment_7_1 ) ) )
            // InternalMyDsl.g:6562:1: ( ( rule__CompositeComponent__ServiceAssignment_7_1 ) )
            {
            // InternalMyDsl.g:6562:1: ( ( rule__CompositeComponent__ServiceAssignment_7_1 ) )
            // InternalMyDsl.g:6563:2: ( rule__CompositeComponent__ServiceAssignment_7_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getServiceAssignment_7_1()); 
            // InternalMyDsl.g:6564:2: ( rule__CompositeComponent__ServiceAssignment_7_1 )
            // InternalMyDsl.g:6564:3: rule__CompositeComponent__ServiceAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__ServiceAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getServiceAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_7__1__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_9__0"
    // InternalMyDsl.g:6573:1: rule__CompositeComponent__Group_9__0 : rule__CompositeComponent__Group_9__0__Impl rule__CompositeComponent__Group_9__1 ;
    public final void rule__CompositeComponent__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6577:1: ( rule__CompositeComponent__Group_9__0__Impl rule__CompositeComponent__Group_9__1 )
            // InternalMyDsl.g:6578:2: rule__CompositeComponent__Group_9__0__Impl rule__CompositeComponent__Group_9__1
            {
            pushFollow(FOLLOW_3);
            rule__CompositeComponent__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9__0"


    // $ANTLR start "rule__CompositeComponent__Group_9__0__Impl"
    // InternalMyDsl.g:6585:1: rule__CompositeComponent__Group_9__0__Impl : ( 'requiredrole' ) ;
    public final void rule__CompositeComponent__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6589:1: ( ( 'requiredrole' ) )
            // InternalMyDsl.g:6590:1: ( 'requiredrole' )
            {
            // InternalMyDsl.g:6590:1: ( 'requiredrole' )
            // InternalMyDsl.g:6591:2: 'requiredrole'
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredroleKeyword_9_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getRequiredroleKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_9__1"
    // InternalMyDsl.g:6600:1: rule__CompositeComponent__Group_9__1 : rule__CompositeComponent__Group_9__1__Impl rule__CompositeComponent__Group_9__2 ;
    public final void rule__CompositeComponent__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6604:1: ( rule__CompositeComponent__Group_9__1__Impl rule__CompositeComponent__Group_9__2 )
            // InternalMyDsl.g:6605:2: rule__CompositeComponent__Group_9__1__Impl rule__CompositeComponent__Group_9__2
            {
            pushFollow(FOLLOW_38);
            rule__CompositeComponent__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9__1"


    // $ANTLR start "rule__CompositeComponent__Group_9__1__Impl"
    // InternalMyDsl.g:6612:1: rule__CompositeComponent__Group_9__1__Impl : ( '{' ) ;
    public final void rule__CompositeComponent__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6616:1: ( ( '{' ) )
            // InternalMyDsl.g:6617:1: ( '{' )
            {
            // InternalMyDsl.g:6617:1: ( '{' )
            // InternalMyDsl.g:6618:2: '{'
            {
             before(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9__1__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_9__2"
    // InternalMyDsl.g:6627:1: rule__CompositeComponent__Group_9__2 : rule__CompositeComponent__Group_9__2__Impl rule__CompositeComponent__Group_9__3 ;
    public final void rule__CompositeComponent__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6631:1: ( rule__CompositeComponent__Group_9__2__Impl rule__CompositeComponent__Group_9__3 )
            // InternalMyDsl.g:6632:2: rule__CompositeComponent__Group_9__2__Impl rule__CompositeComponent__Group_9__3
            {
            pushFollow(FOLLOW_12);
            rule__CompositeComponent__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9__2"


    // $ANTLR start "rule__CompositeComponent__Group_9__2__Impl"
    // InternalMyDsl.g:6639:1: rule__CompositeComponent__Group_9__2__Impl : ( ( rule__CompositeComponent__RequiredroleAssignment_9_2 ) ) ;
    public final void rule__CompositeComponent__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6643:1: ( ( ( rule__CompositeComponent__RequiredroleAssignment_9_2 ) ) )
            // InternalMyDsl.g:6644:1: ( ( rule__CompositeComponent__RequiredroleAssignment_9_2 ) )
            {
            // InternalMyDsl.g:6644:1: ( ( rule__CompositeComponent__RequiredroleAssignment_9_2 ) )
            // InternalMyDsl.g:6645:2: ( rule__CompositeComponent__RequiredroleAssignment_9_2 )
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredroleAssignment_9_2()); 
            // InternalMyDsl.g:6646:2: ( rule__CompositeComponent__RequiredroleAssignment_9_2 )
            // InternalMyDsl.g:6646:3: rule__CompositeComponent__RequiredroleAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__RequiredroleAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getRequiredroleAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9__2__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_9__3"
    // InternalMyDsl.g:6654:1: rule__CompositeComponent__Group_9__3 : rule__CompositeComponent__Group_9__3__Impl rule__CompositeComponent__Group_9__4 ;
    public final void rule__CompositeComponent__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6658:1: ( rule__CompositeComponent__Group_9__3__Impl rule__CompositeComponent__Group_9__4 )
            // InternalMyDsl.g:6659:2: rule__CompositeComponent__Group_9__3__Impl rule__CompositeComponent__Group_9__4
            {
            pushFollow(FOLLOW_12);
            rule__CompositeComponent__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9__3"


    // $ANTLR start "rule__CompositeComponent__Group_9__3__Impl"
    // InternalMyDsl.g:6666:1: rule__CompositeComponent__Group_9__3__Impl : ( ( rule__CompositeComponent__Group_9_3__0 )* ) ;
    public final void rule__CompositeComponent__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6670:1: ( ( ( rule__CompositeComponent__Group_9_3__0 )* ) )
            // InternalMyDsl.g:6671:1: ( ( rule__CompositeComponent__Group_9_3__0 )* )
            {
            // InternalMyDsl.g:6671:1: ( ( rule__CompositeComponent__Group_9_3__0 )* )
            // InternalMyDsl.g:6672:2: ( rule__CompositeComponent__Group_9_3__0 )*
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_9_3()); 
            // InternalMyDsl.g:6673:2: ( rule__CompositeComponent__Group_9_3__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==28) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMyDsl.g:6673:3: rule__CompositeComponent__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__CompositeComponent__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getCompositeComponentAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9__3__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_9__4"
    // InternalMyDsl.g:6681:1: rule__CompositeComponent__Group_9__4 : rule__CompositeComponent__Group_9__4__Impl ;
    public final void rule__CompositeComponent__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6685:1: ( rule__CompositeComponent__Group_9__4__Impl )
            // InternalMyDsl.g:6686:2: rule__CompositeComponent__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9__4"


    // $ANTLR start "rule__CompositeComponent__Group_9__4__Impl"
    // InternalMyDsl.g:6692:1: rule__CompositeComponent__Group_9__4__Impl : ( '}' ) ;
    public final void rule__CompositeComponent__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6696:1: ( ( '}' ) )
            // InternalMyDsl.g:6697:1: ( '}' )
            {
            // InternalMyDsl.g:6697:1: ( '}' )
            // InternalMyDsl.g:6698:2: '}'
            {
             before(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9__4__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_9_3__0"
    // InternalMyDsl.g:6708:1: rule__CompositeComponent__Group_9_3__0 : rule__CompositeComponent__Group_9_3__0__Impl rule__CompositeComponent__Group_9_3__1 ;
    public final void rule__CompositeComponent__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6712:1: ( rule__CompositeComponent__Group_9_3__0__Impl rule__CompositeComponent__Group_9_3__1 )
            // InternalMyDsl.g:6713:2: rule__CompositeComponent__Group_9_3__0__Impl rule__CompositeComponent__Group_9_3__1
            {
            pushFollow(FOLLOW_38);
            rule__CompositeComponent__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9_3__0"


    // $ANTLR start "rule__CompositeComponent__Group_9_3__0__Impl"
    // InternalMyDsl.g:6720:1: rule__CompositeComponent__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__CompositeComponent__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6724:1: ( ( ',' ) )
            // InternalMyDsl.g:6725:1: ( ',' )
            {
            // InternalMyDsl.g:6725:1: ( ',' )
            // InternalMyDsl.g:6726:2: ','
            {
             before(grammarAccess.getCompositeComponentAccess().getCommaKeyword_9_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9_3__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_9_3__1"
    // InternalMyDsl.g:6735:1: rule__CompositeComponent__Group_9_3__1 : rule__CompositeComponent__Group_9_3__1__Impl ;
    public final void rule__CompositeComponent__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6739:1: ( rule__CompositeComponent__Group_9_3__1__Impl )
            // InternalMyDsl.g:6740:2: rule__CompositeComponent__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9_3__1"


    // $ANTLR start "rule__CompositeComponent__Group_9_3__1__Impl"
    // InternalMyDsl.g:6746:1: rule__CompositeComponent__Group_9_3__1__Impl : ( ( rule__CompositeComponent__RequiredroleAssignment_9_3_1 ) ) ;
    public final void rule__CompositeComponent__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6750:1: ( ( ( rule__CompositeComponent__RequiredroleAssignment_9_3_1 ) ) )
            // InternalMyDsl.g:6751:1: ( ( rule__CompositeComponent__RequiredroleAssignment_9_3_1 ) )
            {
            // InternalMyDsl.g:6751:1: ( ( rule__CompositeComponent__RequiredroleAssignment_9_3_1 ) )
            // InternalMyDsl.g:6752:2: ( rule__CompositeComponent__RequiredroleAssignment_9_3_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredroleAssignment_9_3_1()); 
            // InternalMyDsl.g:6753:2: ( rule__CompositeComponent__RequiredroleAssignment_9_3_1 )
            // InternalMyDsl.g:6753:3: rule__CompositeComponent__RequiredroleAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__RequiredroleAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getRequiredroleAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9_3__1__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_15__0"
    // InternalMyDsl.g:6762:1: rule__CompositeComponent__Group_15__0 : rule__CompositeComponent__Group_15__0__Impl rule__CompositeComponent__Group_15__1 ;
    public final void rule__CompositeComponent__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6766:1: ( rule__CompositeComponent__Group_15__0__Impl rule__CompositeComponent__Group_15__1 )
            // InternalMyDsl.g:6767:2: rule__CompositeComponent__Group_15__0__Impl rule__CompositeComponent__Group_15__1
            {
            pushFollow(FOLLOW_11);
            rule__CompositeComponent__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_15__0"


    // $ANTLR start "rule__CompositeComponent__Group_15__0__Impl"
    // InternalMyDsl.g:6774:1: rule__CompositeComponent__Group_15__0__Impl : ( ',' ) ;
    public final void rule__CompositeComponent__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6778:1: ( ( ',' ) )
            // InternalMyDsl.g:6779:1: ( ',' )
            {
            // InternalMyDsl.g:6779:1: ( ',' )
            // InternalMyDsl.g:6780:2: ','
            {
             before(grammarAccess.getCompositeComponentAccess().getCommaKeyword_15_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getCommaKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_15__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_15__1"
    // InternalMyDsl.g:6789:1: rule__CompositeComponent__Group_15__1 : rule__CompositeComponent__Group_15__1__Impl ;
    public final void rule__CompositeComponent__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6793:1: ( rule__CompositeComponent__Group_15__1__Impl )
            // InternalMyDsl.g:6794:2: rule__CompositeComponent__Group_15__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_15__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_15__1"


    // $ANTLR start "rule__CompositeComponent__Group_15__1__Impl"
    // InternalMyDsl.g:6800:1: rule__CompositeComponent__Group_15__1__Impl : ( ( rule__CompositeComponent__AssemblycontextAssignment_15_1 ) ) ;
    public final void rule__CompositeComponent__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6804:1: ( ( ( rule__CompositeComponent__AssemblycontextAssignment_15_1 ) ) )
            // InternalMyDsl.g:6805:1: ( ( rule__CompositeComponent__AssemblycontextAssignment_15_1 ) )
            {
            // InternalMyDsl.g:6805:1: ( ( rule__CompositeComponent__AssemblycontextAssignment_15_1 ) )
            // InternalMyDsl.g:6806:2: ( rule__CompositeComponent__AssemblycontextAssignment_15_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getAssemblycontextAssignment_15_1()); 
            // InternalMyDsl.g:6807:2: ( rule__CompositeComponent__AssemblycontextAssignment_15_1 )
            // InternalMyDsl.g:6807:3: rule__CompositeComponent__AssemblycontextAssignment_15_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__AssemblycontextAssignment_15_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getAssemblycontextAssignment_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_15__1__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_20__0"
    // InternalMyDsl.g:6816:1: rule__CompositeComponent__Group_20__0 : rule__CompositeComponent__Group_20__0__Impl rule__CompositeComponent__Group_20__1 ;
    public final void rule__CompositeComponent__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6820:1: ( rule__CompositeComponent__Group_20__0__Impl rule__CompositeComponent__Group_20__1 )
            // InternalMyDsl.g:6821:2: rule__CompositeComponent__Group_20__0__Impl rule__CompositeComponent__Group_20__1
            {
            pushFollow(FOLLOW_43);
            rule__CompositeComponent__Group_20__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_20__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_20__0"


    // $ANTLR start "rule__CompositeComponent__Group_20__0__Impl"
    // InternalMyDsl.g:6828:1: rule__CompositeComponent__Group_20__0__Impl : ( ',' ) ;
    public final void rule__CompositeComponent__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6832:1: ( ( ',' ) )
            // InternalMyDsl.g:6833:1: ( ',' )
            {
            // InternalMyDsl.g:6833:1: ( ',' )
            // InternalMyDsl.g:6834:2: ','
            {
             before(grammarAccess.getCompositeComponentAccess().getCommaKeyword_20_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getCommaKeyword_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_20__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_20__1"
    // InternalMyDsl.g:6843:1: rule__CompositeComponent__Group_20__1 : rule__CompositeComponent__Group_20__1__Impl ;
    public final void rule__CompositeComponent__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6847:1: ( rule__CompositeComponent__Group_20__1__Impl )
            // InternalMyDsl.g:6848:2: rule__CompositeComponent__Group_20__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_20__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_20__1"


    // $ANTLR start "rule__CompositeComponent__Group_20__1__Impl"
    // InternalMyDsl.g:6854:1: rule__CompositeComponent__Group_20__1__Impl : ( ( rule__CompositeComponent__DelegationconnectorAssignment_20_1 ) ) ;
    public final void rule__CompositeComponent__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6858:1: ( ( ( rule__CompositeComponent__DelegationconnectorAssignment_20_1 ) ) )
            // InternalMyDsl.g:6859:1: ( ( rule__CompositeComponent__DelegationconnectorAssignment_20_1 ) )
            {
            // InternalMyDsl.g:6859:1: ( ( rule__CompositeComponent__DelegationconnectorAssignment_20_1 ) )
            // InternalMyDsl.g:6860:2: ( rule__CompositeComponent__DelegationconnectorAssignment_20_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getDelegationconnectorAssignment_20_1()); 
            // InternalMyDsl.g:6861:2: ( rule__CompositeComponent__DelegationconnectorAssignment_20_1 )
            // InternalMyDsl.g:6861:3: rule__CompositeComponent__DelegationconnectorAssignment_20_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__DelegationconnectorAssignment_20_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getDelegationconnectorAssignment_20_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_20__1__Impl"


    // $ANTLR start "rule__InternalAction__Group__0"
    // InternalMyDsl.g:6870:1: rule__InternalAction__Group__0 : rule__InternalAction__Group__0__Impl rule__InternalAction__Group__1 ;
    public final void rule__InternalAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6874:1: ( rule__InternalAction__Group__0__Impl rule__InternalAction__Group__1 )
            // InternalMyDsl.g:6875:2: rule__InternalAction__Group__0__Impl rule__InternalAction__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__InternalAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternalAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalAction__Group__0"


    // $ANTLR start "rule__InternalAction__Group__0__Impl"
    // InternalMyDsl.g:6882:1: rule__InternalAction__Group__0__Impl : ( () ) ;
    public final void rule__InternalAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6886:1: ( ( () ) )
            // InternalMyDsl.g:6887:1: ( () )
            {
            // InternalMyDsl.g:6887:1: ( () )
            // InternalMyDsl.g:6888:2: ()
            {
             before(grammarAccess.getInternalActionAccess().getInternalActionAction_0()); 
            // InternalMyDsl.g:6889:2: ()
            // InternalMyDsl.g:6889:3: 
            {
            }

             after(grammarAccess.getInternalActionAccess().getInternalActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalAction__Group__0__Impl"


    // $ANTLR start "rule__InternalAction__Group__1"
    // InternalMyDsl.g:6897:1: rule__InternalAction__Group__1 : rule__InternalAction__Group__1__Impl ;
    public final void rule__InternalAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6901:1: ( rule__InternalAction__Group__1__Impl )
            // InternalMyDsl.g:6902:2: rule__InternalAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InternalAction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalAction__Group__1"


    // $ANTLR start "rule__InternalAction__Group__1__Impl"
    // InternalMyDsl.g:6908:1: rule__InternalAction__Group__1__Impl : ( 'InternalAction' ) ;
    public final void rule__InternalAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6912:1: ( ( 'InternalAction' ) )
            // InternalMyDsl.g:6913:1: ( 'InternalAction' )
            {
            // InternalMyDsl.g:6913:1: ( 'InternalAction' )
            // InternalMyDsl.g:6914:2: 'InternalAction'
            {
             before(grammarAccess.getInternalActionAccess().getInternalActionKeyword_1()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getInternalActionAccess().getInternalActionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalAction__Group__1__Impl"


    // $ANTLR start "rule__ExternalCall__Group__0"
    // InternalMyDsl.g:6924:1: rule__ExternalCall__Group__0 : rule__ExternalCall__Group__0__Impl rule__ExternalCall__Group__1 ;
    public final void rule__ExternalCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6928:1: ( rule__ExternalCall__Group__0__Impl rule__ExternalCall__Group__1 )
            // InternalMyDsl.g:6929:2: rule__ExternalCall__Group__0__Impl rule__ExternalCall__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__ExternalCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalCall__Group__0"


    // $ANTLR start "rule__ExternalCall__Group__0__Impl"
    // InternalMyDsl.g:6936:1: rule__ExternalCall__Group__0__Impl : ( () ) ;
    public final void rule__ExternalCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6940:1: ( ( () ) )
            // InternalMyDsl.g:6941:1: ( () )
            {
            // InternalMyDsl.g:6941:1: ( () )
            // InternalMyDsl.g:6942:2: ()
            {
             before(grammarAccess.getExternalCallAccess().getExternalCallAction_0()); 
            // InternalMyDsl.g:6943:2: ()
            // InternalMyDsl.g:6943:3: 
            {
            }

             after(grammarAccess.getExternalCallAccess().getExternalCallAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalCall__Group__0__Impl"


    // $ANTLR start "rule__ExternalCall__Group__1"
    // InternalMyDsl.g:6951:1: rule__ExternalCall__Group__1 : rule__ExternalCall__Group__1__Impl ;
    public final void rule__ExternalCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6955:1: ( rule__ExternalCall__Group__1__Impl )
            // InternalMyDsl.g:6956:2: rule__ExternalCall__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalCall__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalCall__Group__1"


    // $ANTLR start "rule__ExternalCall__Group__1__Impl"
    // InternalMyDsl.g:6962:1: rule__ExternalCall__Group__1__Impl : ( 'ExternalCall' ) ;
    public final void rule__ExternalCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6966:1: ( ( 'ExternalCall' ) )
            // InternalMyDsl.g:6967:1: ( 'ExternalCall' )
            {
            // InternalMyDsl.g:6967:1: ( 'ExternalCall' )
            // InternalMyDsl.g:6968:2: 'ExternalCall'
            {
             before(grammarAccess.getExternalCallAccess().getExternalCallKeyword_1()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getExternalCallAccess().getExternalCallKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalCall__Group__1__Impl"


    // $ANTLR start "rule__Loop__Group__0"
    // InternalMyDsl.g:6978:1: rule__Loop__Group__0 : rule__Loop__Group__0__Impl rule__Loop__Group__1 ;
    public final void rule__Loop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6982:1: ( rule__Loop__Group__0__Impl rule__Loop__Group__1 )
            // InternalMyDsl.g:6983:2: rule__Loop__Group__0__Impl rule__Loop__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__Loop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__0"


    // $ANTLR start "rule__Loop__Group__0__Impl"
    // InternalMyDsl.g:6990:1: rule__Loop__Group__0__Impl : ( () ) ;
    public final void rule__Loop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6994:1: ( ( () ) )
            // InternalMyDsl.g:6995:1: ( () )
            {
            // InternalMyDsl.g:6995:1: ( () )
            // InternalMyDsl.g:6996:2: ()
            {
             before(grammarAccess.getLoopAccess().getLoopAction_0()); 
            // InternalMyDsl.g:6997:2: ()
            // InternalMyDsl.g:6997:3: 
            {
            }

             after(grammarAccess.getLoopAccess().getLoopAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__0__Impl"


    // $ANTLR start "rule__Loop__Group__1"
    // InternalMyDsl.g:7005:1: rule__Loop__Group__1 : rule__Loop__Group__1__Impl ;
    public final void rule__Loop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7009:1: ( rule__Loop__Group__1__Impl )
            // InternalMyDsl.g:7010:2: rule__Loop__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__1"


    // $ANTLR start "rule__Loop__Group__1__Impl"
    // InternalMyDsl.g:7016:1: rule__Loop__Group__1__Impl : ( 'Loop' ) ;
    public final void rule__Loop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7020:1: ( ( 'Loop' ) )
            // InternalMyDsl.g:7021:1: ( 'Loop' )
            {
            // InternalMyDsl.g:7021:1: ( 'Loop' )
            // InternalMyDsl.g:7022:2: 'Loop'
            {
             before(grammarAccess.getLoopAccess().getLoopKeyword_1()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLoopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__1__Impl"


    // $ANTLR start "rule__Branch__Group__0"
    // InternalMyDsl.g:7032:1: rule__Branch__Group__0 : rule__Branch__Group__0__Impl rule__Branch__Group__1 ;
    public final void rule__Branch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7036:1: ( rule__Branch__Group__0__Impl rule__Branch__Group__1 )
            // InternalMyDsl.g:7037:2: rule__Branch__Group__0__Impl rule__Branch__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__Branch__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Branch__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__0"


    // $ANTLR start "rule__Branch__Group__0__Impl"
    // InternalMyDsl.g:7044:1: rule__Branch__Group__0__Impl : ( () ) ;
    public final void rule__Branch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7048:1: ( ( () ) )
            // InternalMyDsl.g:7049:1: ( () )
            {
            // InternalMyDsl.g:7049:1: ( () )
            // InternalMyDsl.g:7050:2: ()
            {
             before(grammarAccess.getBranchAccess().getBranchAction_0()); 
            // InternalMyDsl.g:7051:2: ()
            // InternalMyDsl.g:7051:3: 
            {
            }

             after(grammarAccess.getBranchAccess().getBranchAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__0__Impl"


    // $ANTLR start "rule__Branch__Group__1"
    // InternalMyDsl.g:7059:1: rule__Branch__Group__1 : rule__Branch__Group__1__Impl ;
    public final void rule__Branch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7063:1: ( rule__Branch__Group__1__Impl )
            // InternalMyDsl.g:7064:2: rule__Branch__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Branch__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__1"


    // $ANTLR start "rule__Branch__Group__1__Impl"
    // InternalMyDsl.g:7070:1: rule__Branch__Group__1__Impl : ( 'Branch' ) ;
    public final void rule__Branch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7074:1: ( ( 'Branch' ) )
            // InternalMyDsl.g:7075:1: ( 'Branch' )
            {
            // InternalMyDsl.g:7075:1: ( 'Branch' )
            // InternalMyDsl.g:7076:2: 'Branch'
            {
             before(grammarAccess.getBranchAccess().getBranchKeyword_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getBranchAccess().getBranchKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__1__Impl"


    // $ANTLR start "rule__DelegationConnector__Group__0"
    // InternalMyDsl.g:7086:1: rule__DelegationConnector__Group__0 : rule__DelegationConnector__Group__0__Impl rule__DelegationConnector__Group__1 ;
    public final void rule__DelegationConnector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7090:1: ( rule__DelegationConnector__Group__0__Impl rule__DelegationConnector__Group__1 )
            // InternalMyDsl.g:7091:2: rule__DelegationConnector__Group__0__Impl rule__DelegationConnector__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__DelegationConnector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__0"


    // $ANTLR start "rule__DelegationConnector__Group__0__Impl"
    // InternalMyDsl.g:7098:1: rule__DelegationConnector__Group__0__Impl : ( 'DelegationConnector' ) ;
    public final void rule__DelegationConnector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7102:1: ( ( 'DelegationConnector' ) )
            // InternalMyDsl.g:7103:1: ( 'DelegationConnector' )
            {
            // InternalMyDsl.g:7103:1: ( 'DelegationConnector' )
            // InternalMyDsl.g:7104:2: 'DelegationConnector'
            {
             before(grammarAccess.getDelegationConnectorAccess().getDelegationConnectorKeyword_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getDelegationConnectorAccess().getDelegationConnectorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__0__Impl"


    // $ANTLR start "rule__DelegationConnector__Group__1"
    // InternalMyDsl.g:7113:1: rule__DelegationConnector__Group__1 : rule__DelegationConnector__Group__1__Impl rule__DelegationConnector__Group__2 ;
    public final void rule__DelegationConnector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7117:1: ( rule__DelegationConnector__Group__1__Impl rule__DelegationConnector__Group__2 )
            // InternalMyDsl.g:7118:2: rule__DelegationConnector__Group__1__Impl rule__DelegationConnector__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__DelegationConnector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__1"


    // $ANTLR start "rule__DelegationConnector__Group__1__Impl"
    // InternalMyDsl.g:7125:1: rule__DelegationConnector__Group__1__Impl : ( ( rule__DelegationConnector__NameAssignment_1 ) ) ;
    public final void rule__DelegationConnector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7129:1: ( ( ( rule__DelegationConnector__NameAssignment_1 ) ) )
            // InternalMyDsl.g:7130:1: ( ( rule__DelegationConnector__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:7130:1: ( ( rule__DelegationConnector__NameAssignment_1 ) )
            // InternalMyDsl.g:7131:2: ( rule__DelegationConnector__NameAssignment_1 )
            {
             before(grammarAccess.getDelegationConnectorAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:7132:2: ( rule__DelegationConnector__NameAssignment_1 )
            // InternalMyDsl.g:7132:3: rule__DelegationConnector__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DelegationConnector__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDelegationConnectorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__1__Impl"


    // $ANTLR start "rule__DelegationConnector__Group__2"
    // InternalMyDsl.g:7140:1: rule__DelegationConnector__Group__2 : rule__DelegationConnector__Group__2__Impl rule__DelegationConnector__Group__3 ;
    public final void rule__DelegationConnector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7144:1: ( rule__DelegationConnector__Group__2__Impl rule__DelegationConnector__Group__3 )
            // InternalMyDsl.g:7145:2: rule__DelegationConnector__Group__2__Impl rule__DelegationConnector__Group__3
            {
            pushFollow(FOLLOW_47);
            rule__DelegationConnector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__2"


    // $ANTLR start "rule__DelegationConnector__Group__2__Impl"
    // InternalMyDsl.g:7152:1: rule__DelegationConnector__Group__2__Impl : ( '{' ) ;
    public final void rule__DelegationConnector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7156:1: ( ( '{' ) )
            // InternalMyDsl.g:7157:1: ( '{' )
            {
            // InternalMyDsl.g:7157:1: ( '{' )
            // InternalMyDsl.g:7158:2: '{'
            {
             before(grammarAccess.getDelegationConnectorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDelegationConnectorAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__2__Impl"


    // $ANTLR start "rule__DelegationConnector__Group__3"
    // InternalMyDsl.g:7167:1: rule__DelegationConnector__Group__3 : rule__DelegationConnector__Group__3__Impl rule__DelegationConnector__Group__4 ;
    public final void rule__DelegationConnector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7171:1: ( rule__DelegationConnector__Group__3__Impl rule__DelegationConnector__Group__4 )
            // InternalMyDsl.g:7172:2: rule__DelegationConnector__Group__3__Impl rule__DelegationConnector__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__DelegationConnector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__3"


    // $ANTLR start "rule__DelegationConnector__Group__3__Impl"
    // InternalMyDsl.g:7179:1: rule__DelegationConnector__Group__3__Impl : ( 'role' ) ;
    public final void rule__DelegationConnector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7183:1: ( ( 'role' ) )
            // InternalMyDsl.g:7184:1: ( 'role' )
            {
            // InternalMyDsl.g:7184:1: ( 'role' )
            // InternalMyDsl.g:7185:2: 'role'
            {
             before(grammarAccess.getDelegationConnectorAccess().getRoleKeyword_3()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getDelegationConnectorAccess().getRoleKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__3__Impl"


    // $ANTLR start "rule__DelegationConnector__Group__4"
    // InternalMyDsl.g:7194:1: rule__DelegationConnector__Group__4 : rule__DelegationConnector__Group__4__Impl rule__DelegationConnector__Group__5 ;
    public final void rule__DelegationConnector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7198:1: ( rule__DelegationConnector__Group__4__Impl rule__DelegationConnector__Group__5 )
            // InternalMyDsl.g:7199:2: rule__DelegationConnector__Group__4__Impl rule__DelegationConnector__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__DelegationConnector__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__4"


    // $ANTLR start "rule__DelegationConnector__Group__4__Impl"
    // InternalMyDsl.g:7206:1: rule__DelegationConnector__Group__4__Impl : ( '(' ) ;
    public final void rule__DelegationConnector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7210:1: ( ( '(' ) )
            // InternalMyDsl.g:7211:1: ( '(' )
            {
            // InternalMyDsl.g:7211:1: ( '(' )
            // InternalMyDsl.g:7212:2: '('
            {
             before(grammarAccess.getDelegationConnectorAccess().getLeftParenthesisKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDelegationConnectorAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__4__Impl"


    // $ANTLR start "rule__DelegationConnector__Group__5"
    // InternalMyDsl.g:7221:1: rule__DelegationConnector__Group__5 : rule__DelegationConnector__Group__5__Impl rule__DelegationConnector__Group__6 ;
    public final void rule__DelegationConnector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7225:1: ( rule__DelegationConnector__Group__5__Impl rule__DelegationConnector__Group__6 )
            // InternalMyDsl.g:7226:2: rule__DelegationConnector__Group__5__Impl rule__DelegationConnector__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__DelegationConnector__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__5"


    // $ANTLR start "rule__DelegationConnector__Group__5__Impl"
    // InternalMyDsl.g:7233:1: rule__DelegationConnector__Group__5__Impl : ( ( rule__DelegationConnector__RoleAssignment_5 ) ) ;
    public final void rule__DelegationConnector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7237:1: ( ( ( rule__DelegationConnector__RoleAssignment_5 ) ) )
            // InternalMyDsl.g:7238:1: ( ( rule__DelegationConnector__RoleAssignment_5 ) )
            {
            // InternalMyDsl.g:7238:1: ( ( rule__DelegationConnector__RoleAssignment_5 ) )
            // InternalMyDsl.g:7239:2: ( rule__DelegationConnector__RoleAssignment_5 )
            {
             before(grammarAccess.getDelegationConnectorAccess().getRoleAssignment_5()); 
            // InternalMyDsl.g:7240:2: ( rule__DelegationConnector__RoleAssignment_5 )
            // InternalMyDsl.g:7240:3: rule__DelegationConnector__RoleAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DelegationConnector__RoleAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDelegationConnectorAccess().getRoleAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__5__Impl"


    // $ANTLR start "rule__DelegationConnector__Group__6"
    // InternalMyDsl.g:7248:1: rule__DelegationConnector__Group__6 : rule__DelegationConnector__Group__6__Impl rule__DelegationConnector__Group__7 ;
    public final void rule__DelegationConnector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7252:1: ( rule__DelegationConnector__Group__6__Impl rule__DelegationConnector__Group__7 )
            // InternalMyDsl.g:7253:2: rule__DelegationConnector__Group__6__Impl rule__DelegationConnector__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__DelegationConnector__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__6"


    // $ANTLR start "rule__DelegationConnector__Group__6__Impl"
    // InternalMyDsl.g:7260:1: rule__DelegationConnector__Group__6__Impl : ( ( rule__DelegationConnector__Group_6__0 )* ) ;
    public final void rule__DelegationConnector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7264:1: ( ( ( rule__DelegationConnector__Group_6__0 )* ) )
            // InternalMyDsl.g:7265:1: ( ( rule__DelegationConnector__Group_6__0 )* )
            {
            // InternalMyDsl.g:7265:1: ( ( rule__DelegationConnector__Group_6__0 )* )
            // InternalMyDsl.g:7266:2: ( rule__DelegationConnector__Group_6__0 )*
            {
             before(grammarAccess.getDelegationConnectorAccess().getGroup_6()); 
            // InternalMyDsl.g:7267:2: ( rule__DelegationConnector__Group_6__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==28) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalMyDsl.g:7267:3: rule__DelegationConnector__Group_6__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__DelegationConnector__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getDelegationConnectorAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__6__Impl"


    // $ANTLR start "rule__DelegationConnector__Group__7"
    // InternalMyDsl.g:7275:1: rule__DelegationConnector__Group__7 : rule__DelegationConnector__Group__7__Impl rule__DelegationConnector__Group__8 ;
    public final void rule__DelegationConnector__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7279:1: ( rule__DelegationConnector__Group__7__Impl rule__DelegationConnector__Group__8 )
            // InternalMyDsl.g:7280:2: rule__DelegationConnector__Group__7__Impl rule__DelegationConnector__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__DelegationConnector__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__7"


    // $ANTLR start "rule__DelegationConnector__Group__7__Impl"
    // InternalMyDsl.g:7287:1: rule__DelegationConnector__Group__7__Impl : ( ')' ) ;
    public final void rule__DelegationConnector__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7291:1: ( ( ')' ) )
            // InternalMyDsl.g:7292:1: ( ')' )
            {
            // InternalMyDsl.g:7292:1: ( ')' )
            // InternalMyDsl.g:7293:2: ')'
            {
             before(grammarAccess.getDelegationConnectorAccess().getRightParenthesisKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDelegationConnectorAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__7__Impl"


    // $ANTLR start "rule__DelegationConnector__Group__8"
    // InternalMyDsl.g:7302:1: rule__DelegationConnector__Group__8 : rule__DelegationConnector__Group__8__Impl ;
    public final void rule__DelegationConnector__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7306:1: ( rule__DelegationConnector__Group__8__Impl )
            // InternalMyDsl.g:7307:2: rule__DelegationConnector__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__8"


    // $ANTLR start "rule__DelegationConnector__Group__8__Impl"
    // InternalMyDsl.g:7313:1: rule__DelegationConnector__Group__8__Impl : ( '}' ) ;
    public final void rule__DelegationConnector__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7317:1: ( ( '}' ) )
            // InternalMyDsl.g:7318:1: ( '}' )
            {
            // InternalMyDsl.g:7318:1: ( '}' )
            // InternalMyDsl.g:7319:2: '}'
            {
             before(grammarAccess.getDelegationConnectorAccess().getRightCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDelegationConnectorAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__8__Impl"


    // $ANTLR start "rule__DelegationConnector__Group_6__0"
    // InternalMyDsl.g:7329:1: rule__DelegationConnector__Group_6__0 : rule__DelegationConnector__Group_6__0__Impl rule__DelegationConnector__Group_6__1 ;
    public final void rule__DelegationConnector__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7333:1: ( rule__DelegationConnector__Group_6__0__Impl rule__DelegationConnector__Group_6__1 )
            // InternalMyDsl.g:7334:2: rule__DelegationConnector__Group_6__0__Impl rule__DelegationConnector__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__DelegationConnector__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group_6__0"


    // $ANTLR start "rule__DelegationConnector__Group_6__0__Impl"
    // InternalMyDsl.g:7341:1: rule__DelegationConnector__Group_6__0__Impl : ( ',' ) ;
    public final void rule__DelegationConnector__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7345:1: ( ( ',' ) )
            // InternalMyDsl.g:7346:1: ( ',' )
            {
            // InternalMyDsl.g:7346:1: ( ',' )
            // InternalMyDsl.g:7347:2: ','
            {
             before(grammarAccess.getDelegationConnectorAccess().getCommaKeyword_6_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDelegationConnectorAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group_6__0__Impl"


    // $ANTLR start "rule__DelegationConnector__Group_6__1"
    // InternalMyDsl.g:7356:1: rule__DelegationConnector__Group_6__1 : rule__DelegationConnector__Group_6__1__Impl ;
    public final void rule__DelegationConnector__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7360:1: ( rule__DelegationConnector__Group_6__1__Impl )
            // InternalMyDsl.g:7361:2: rule__DelegationConnector__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group_6__1"


    // $ANTLR start "rule__DelegationConnector__Group_6__1__Impl"
    // InternalMyDsl.g:7367:1: rule__DelegationConnector__Group_6__1__Impl : ( ( rule__DelegationConnector__RoleAssignment_6_1 ) ) ;
    public final void rule__DelegationConnector__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7371:1: ( ( ( rule__DelegationConnector__RoleAssignment_6_1 ) ) )
            // InternalMyDsl.g:7372:1: ( ( rule__DelegationConnector__RoleAssignment_6_1 ) )
            {
            // InternalMyDsl.g:7372:1: ( ( rule__DelegationConnector__RoleAssignment_6_1 ) )
            // InternalMyDsl.g:7373:2: ( rule__DelegationConnector__RoleAssignment_6_1 )
            {
             before(grammarAccess.getDelegationConnectorAccess().getRoleAssignment_6_1()); 
            // InternalMyDsl.g:7374:2: ( rule__DelegationConnector__RoleAssignment_6_1 )
            // InternalMyDsl.g:7374:3: rule__DelegationConnector__RoleAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__DelegationConnector__RoleAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getDelegationConnectorAccess().getRoleAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group_6__1__Impl"


    // $ANTLR start "rule__Role_Impl__Group__0"
    // InternalMyDsl.g:7383:1: rule__Role_Impl__Group__0 : rule__Role_Impl__Group__0__Impl rule__Role_Impl__Group__1 ;
    public final void rule__Role_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7387:1: ( rule__Role_Impl__Group__0__Impl rule__Role_Impl__Group__1 )
            // InternalMyDsl.g:7388:2: rule__Role_Impl__Group__0__Impl rule__Role_Impl__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Role_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__Group__0"


    // $ANTLR start "rule__Role_Impl__Group__0__Impl"
    // InternalMyDsl.g:7395:1: rule__Role_Impl__Group__0__Impl : ( 'Role' ) ;
    public final void rule__Role_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7399:1: ( ( 'Role' ) )
            // InternalMyDsl.g:7400:1: ( 'Role' )
            {
            // InternalMyDsl.g:7400:1: ( 'Role' )
            // InternalMyDsl.g:7401:2: 'Role'
            {
             before(grammarAccess.getRole_ImplAccess().getRoleKeyword_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getRole_ImplAccess().getRoleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__Group__0__Impl"


    // $ANTLR start "rule__Role_Impl__Group__1"
    // InternalMyDsl.g:7410:1: rule__Role_Impl__Group__1 : rule__Role_Impl__Group__1__Impl rule__Role_Impl__Group__2 ;
    public final void rule__Role_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7414:1: ( rule__Role_Impl__Group__1__Impl rule__Role_Impl__Group__2 )
            // InternalMyDsl.g:7415:2: rule__Role_Impl__Group__1__Impl rule__Role_Impl__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Role_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__Group__1"


    // $ANTLR start "rule__Role_Impl__Group__1__Impl"
    // InternalMyDsl.g:7422:1: rule__Role_Impl__Group__1__Impl : ( ( rule__Role_Impl__NameAssignment_1 ) ) ;
    public final void rule__Role_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7426:1: ( ( ( rule__Role_Impl__NameAssignment_1 ) ) )
            // InternalMyDsl.g:7427:1: ( ( rule__Role_Impl__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:7427:1: ( ( rule__Role_Impl__NameAssignment_1 ) )
            // InternalMyDsl.g:7428:2: ( rule__Role_Impl__NameAssignment_1 )
            {
             before(grammarAccess.getRole_ImplAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:7429:2: ( rule__Role_Impl__NameAssignment_1 )
            // InternalMyDsl.g:7429:3: rule__Role_Impl__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Role_Impl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRole_ImplAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__Group__1__Impl"


    // $ANTLR start "rule__Role_Impl__Group__2"
    // InternalMyDsl.g:7437:1: rule__Role_Impl__Group__2 : rule__Role_Impl__Group__2__Impl rule__Role_Impl__Group__3 ;
    public final void rule__Role_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7441:1: ( rule__Role_Impl__Group__2__Impl rule__Role_Impl__Group__3 )
            // InternalMyDsl.g:7442:2: rule__Role_Impl__Group__2__Impl rule__Role_Impl__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Role_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__Group__2"


    // $ANTLR start "rule__Role_Impl__Group__2__Impl"
    // InternalMyDsl.g:7449:1: rule__Role_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__Role_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7453:1: ( ( '{' ) )
            // InternalMyDsl.g:7454:1: ( '{' )
            {
            // InternalMyDsl.g:7454:1: ( '{' )
            // InternalMyDsl.g:7455:2: '{'
            {
             before(grammarAccess.getRole_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRole_ImplAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__Group__2__Impl"


    // $ANTLR start "rule__Role_Impl__Group__3"
    // InternalMyDsl.g:7464:1: rule__Role_Impl__Group__3 : rule__Role_Impl__Group__3__Impl rule__Role_Impl__Group__4 ;
    public final void rule__Role_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7468:1: ( rule__Role_Impl__Group__3__Impl rule__Role_Impl__Group__4 )
            // InternalMyDsl.g:7469:2: rule__Role_Impl__Group__3__Impl rule__Role_Impl__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Role_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__Group__3"


    // $ANTLR start "rule__Role_Impl__Group__3__Impl"
    // InternalMyDsl.g:7476:1: rule__Role_Impl__Group__3__Impl : ( 'interface' ) ;
    public final void rule__Role_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7480:1: ( ( 'interface' ) )
            // InternalMyDsl.g:7481:1: ( 'interface' )
            {
            // InternalMyDsl.g:7481:1: ( 'interface' )
            // InternalMyDsl.g:7482:2: 'interface'
            {
             before(grammarAccess.getRole_ImplAccess().getInterfaceKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRole_ImplAccess().getInterfaceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__Group__3__Impl"


    // $ANTLR start "rule__Role_Impl__Group__4"
    // InternalMyDsl.g:7491:1: rule__Role_Impl__Group__4 : rule__Role_Impl__Group__4__Impl rule__Role_Impl__Group__5 ;
    public final void rule__Role_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7495:1: ( rule__Role_Impl__Group__4__Impl rule__Role_Impl__Group__5 )
            // InternalMyDsl.g:7496:2: rule__Role_Impl__Group__4__Impl rule__Role_Impl__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Role_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role_Impl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__Group__4"


    // $ANTLR start "rule__Role_Impl__Group__4__Impl"
    // InternalMyDsl.g:7503:1: rule__Role_Impl__Group__4__Impl : ( ( rule__Role_Impl__InterfaceAssignment_4 ) ) ;
    public final void rule__Role_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7507:1: ( ( ( rule__Role_Impl__InterfaceAssignment_4 ) ) )
            // InternalMyDsl.g:7508:1: ( ( rule__Role_Impl__InterfaceAssignment_4 ) )
            {
            // InternalMyDsl.g:7508:1: ( ( rule__Role_Impl__InterfaceAssignment_4 ) )
            // InternalMyDsl.g:7509:2: ( rule__Role_Impl__InterfaceAssignment_4 )
            {
             before(grammarAccess.getRole_ImplAccess().getInterfaceAssignment_4()); 
            // InternalMyDsl.g:7510:2: ( rule__Role_Impl__InterfaceAssignment_4 )
            // InternalMyDsl.g:7510:3: rule__Role_Impl__InterfaceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Role_Impl__InterfaceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRole_ImplAccess().getInterfaceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__Group__4__Impl"


    // $ANTLR start "rule__Role_Impl__Group__5"
    // InternalMyDsl.g:7518:1: rule__Role_Impl__Group__5 : rule__Role_Impl__Group__5__Impl ;
    public final void rule__Role_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7522:1: ( rule__Role_Impl__Group__5__Impl )
            // InternalMyDsl.g:7523:2: rule__Role_Impl__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role_Impl__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__Group__5"


    // $ANTLR start "rule__Role_Impl__Group__5__Impl"
    // InternalMyDsl.g:7529:1: rule__Role_Impl__Group__5__Impl : ( '}' ) ;
    public final void rule__Role_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7533:1: ( ( '}' ) )
            // InternalMyDsl.g:7534:1: ( '}' )
            {
            // InternalMyDsl.g:7534:1: ( '}' )
            // InternalMyDsl.g:7535:2: '}'
            {
             before(grammarAccess.getRole_ImplAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRole_ImplAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__Group__5__Impl"


    // $ANTLR start "rule__Container__Group__0"
    // InternalMyDsl.g:7545:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7549:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // InternalMyDsl.g:7550:2: rule__Container__Group__0__Impl rule__Container__Group__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalMyDsl.g:7557:1: rule__Container__Group__0__Impl : ( () ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7561:1: ( ( () ) )
            // InternalMyDsl.g:7562:1: ( () )
            {
            // InternalMyDsl.g:7562:1: ( () )
            // InternalMyDsl.g:7563:2: ()
            {
             before(grammarAccess.getContainerAccess().getContainerAction_0()); 
            // InternalMyDsl.g:7564:2: ()
            // InternalMyDsl.g:7564:3: 
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
    // InternalMyDsl.g:7572:1: rule__Container__Group__1 : rule__Container__Group__1__Impl rule__Container__Group__2 ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7576:1: ( rule__Container__Group__1__Impl rule__Container__Group__2 )
            // InternalMyDsl.g:7577:2: rule__Container__Group__1__Impl rule__Container__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:7584:1: rule__Container__Group__1__Impl : ( 'Container' ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7588:1: ( ( 'Container' ) )
            // InternalMyDsl.g:7589:1: ( 'Container' )
            {
            // InternalMyDsl.g:7589:1: ( 'Container' )
            // InternalMyDsl.g:7590:2: 'Container'
            {
             before(grammarAccess.getContainerAccess().getContainerKeyword_1()); 
            match(input,71,FOLLOW_2); 
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
    // InternalMyDsl.g:7599:1: rule__Container__Group__2 : rule__Container__Group__2__Impl ;
    public final void rule__Container__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7603:1: ( rule__Container__Group__2__Impl )
            // InternalMyDsl.g:7604:2: rule__Container__Group__2__Impl
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
    // InternalMyDsl.g:7610:1: rule__Container__Group__2__Impl : ( ( rule__Container__NameAssignment_2 ) ) ;
    public final void rule__Container__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7614:1: ( ( ( rule__Container__NameAssignment_2 ) ) )
            // InternalMyDsl.g:7615:1: ( ( rule__Container__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:7615:1: ( ( rule__Container__NameAssignment_2 ) )
            // InternalMyDsl.g:7616:2: ( rule__Container__NameAssignment_2 )
            {
             before(grammarAccess.getContainerAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:7617:2: ( rule__Container__NameAssignment_2 )
            // InternalMyDsl.g:7617:3: rule__Container__NameAssignment_2
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
    // InternalMyDsl.g:7626:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7630:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalMyDsl.g:7631:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:7638:1: rule__Link__Group__0__Impl : ( 'Link' ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7642:1: ( ( 'Link' ) )
            // InternalMyDsl.g:7643:1: ( 'Link' )
            {
            // InternalMyDsl.g:7643:1: ( 'Link' )
            // InternalMyDsl.g:7644:2: 'Link'
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_0()); 
            match(input,72,FOLLOW_2); 
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
    // InternalMyDsl.g:7653:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7657:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalMyDsl.g:7658:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:7665:1: rule__Link__Group__1__Impl : ( ( rule__Link__NameAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7669:1: ( ( ( rule__Link__NameAssignment_1 ) ) )
            // InternalMyDsl.g:7670:1: ( ( rule__Link__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:7670:1: ( ( rule__Link__NameAssignment_1 ) )
            // InternalMyDsl.g:7671:2: ( rule__Link__NameAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:7672:2: ( rule__Link__NameAssignment_1 )
            // InternalMyDsl.g:7672:3: rule__Link__NameAssignment_1
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
    // InternalMyDsl.g:7680:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7684:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalMyDsl.g:7685:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_49);
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
    // InternalMyDsl.g:7692:1: rule__Link__Group__2__Impl : ( '{' ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7696:1: ( ( '{' ) )
            // InternalMyDsl.g:7697:1: ( '{' )
            {
            // InternalMyDsl.g:7697:1: ( '{' )
            // InternalMyDsl.g:7698:2: '{'
            {
             before(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:7707:1: rule__Link__Group__3 : rule__Link__Group__3__Impl rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7711:1: ( rule__Link__Group__3__Impl rule__Link__Group__4 )
            // InternalMyDsl.g:7712:2: rule__Link__Group__3__Impl rule__Link__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:7719:1: rule__Link__Group__3__Impl : ( 'container' ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7723:1: ( ( 'container' ) )
            // InternalMyDsl.g:7724:1: ( 'container' )
            {
            // InternalMyDsl.g:7724:1: ( 'container' )
            // InternalMyDsl.g:7725:2: 'container'
            {
             before(grammarAccess.getLinkAccess().getContainerKeyword_3()); 
            match(input,73,FOLLOW_2); 
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
    // InternalMyDsl.g:7734:1: rule__Link__Group__4 : rule__Link__Group__4__Impl rule__Link__Group__5 ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7738:1: ( rule__Link__Group__4__Impl rule__Link__Group__5 )
            // InternalMyDsl.g:7739:2: rule__Link__Group__4__Impl rule__Link__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:7746:1: rule__Link__Group__4__Impl : ( '(' ) ;
    public final void rule__Link__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7750:1: ( ( '(' ) )
            // InternalMyDsl.g:7751:1: ( '(' )
            {
            // InternalMyDsl.g:7751:1: ( '(' )
            // InternalMyDsl.g:7752:2: '('
            {
             before(grammarAccess.getLinkAccess().getLeftParenthesisKeyword_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:7761:1: rule__Link__Group__5 : rule__Link__Group__5__Impl rule__Link__Group__6 ;
    public final void rule__Link__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7765:1: ( rule__Link__Group__5__Impl rule__Link__Group__6 )
            // InternalMyDsl.g:7766:2: rule__Link__Group__5__Impl rule__Link__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:7773:1: rule__Link__Group__5__Impl : ( ( rule__Link__ContainerAssignment_5 ) ) ;
    public final void rule__Link__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7777:1: ( ( ( rule__Link__ContainerAssignment_5 ) ) )
            // InternalMyDsl.g:7778:1: ( ( rule__Link__ContainerAssignment_5 ) )
            {
            // InternalMyDsl.g:7778:1: ( ( rule__Link__ContainerAssignment_5 ) )
            // InternalMyDsl.g:7779:2: ( rule__Link__ContainerAssignment_5 )
            {
             before(grammarAccess.getLinkAccess().getContainerAssignment_5()); 
            // InternalMyDsl.g:7780:2: ( rule__Link__ContainerAssignment_5 )
            // InternalMyDsl.g:7780:3: rule__Link__ContainerAssignment_5
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
    // InternalMyDsl.g:7788:1: rule__Link__Group__6 : rule__Link__Group__6__Impl rule__Link__Group__7 ;
    public final void rule__Link__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7792:1: ( rule__Link__Group__6__Impl rule__Link__Group__7 )
            // InternalMyDsl.g:7793:2: rule__Link__Group__6__Impl rule__Link__Group__7
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:7800:1: rule__Link__Group__6__Impl : ( ( rule__Link__Group_6__0 )* ) ;
    public final void rule__Link__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7804:1: ( ( ( rule__Link__Group_6__0 )* ) )
            // InternalMyDsl.g:7805:1: ( ( rule__Link__Group_6__0 )* )
            {
            // InternalMyDsl.g:7805:1: ( ( rule__Link__Group_6__0 )* )
            // InternalMyDsl.g:7806:2: ( rule__Link__Group_6__0 )*
            {
             before(grammarAccess.getLinkAccess().getGroup_6()); 
            // InternalMyDsl.g:7807:2: ( rule__Link__Group_6__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==28) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalMyDsl.g:7807:3: rule__Link__Group_6__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Link__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalMyDsl.g:7815:1: rule__Link__Group__7 : rule__Link__Group__7__Impl rule__Link__Group__8 ;
    public final void rule__Link__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7819:1: ( rule__Link__Group__7__Impl rule__Link__Group__8 )
            // InternalMyDsl.g:7820:2: rule__Link__Group__7__Impl rule__Link__Group__8
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:7827:1: rule__Link__Group__7__Impl : ( ')' ) ;
    public final void rule__Link__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7831:1: ( ( ')' ) )
            // InternalMyDsl.g:7832:1: ( ')' )
            {
            // InternalMyDsl.g:7832:1: ( ')' )
            // InternalMyDsl.g:7833:2: ')'
            {
             before(grammarAccess.getLinkAccess().getRightParenthesisKeyword_7()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:7842:1: rule__Link__Group__8 : rule__Link__Group__8__Impl ;
    public final void rule__Link__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7846:1: ( rule__Link__Group__8__Impl )
            // InternalMyDsl.g:7847:2: rule__Link__Group__8__Impl
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
    // InternalMyDsl.g:7853:1: rule__Link__Group__8__Impl : ( '}' ) ;
    public final void rule__Link__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7857:1: ( ( '}' ) )
            // InternalMyDsl.g:7858:1: ( '}' )
            {
            // InternalMyDsl.g:7858:1: ( '}' )
            // InternalMyDsl.g:7859:2: '}'
            {
             before(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:7869:1: rule__Link__Group_6__0 : rule__Link__Group_6__0__Impl rule__Link__Group_6__1 ;
    public final void rule__Link__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7873:1: ( rule__Link__Group_6__0__Impl rule__Link__Group_6__1 )
            // InternalMyDsl.g:7874:2: rule__Link__Group_6__0__Impl rule__Link__Group_6__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:7881:1: rule__Link__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Link__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7885:1: ( ( ',' ) )
            // InternalMyDsl.g:7886:1: ( ',' )
            {
            // InternalMyDsl.g:7886:1: ( ',' )
            // InternalMyDsl.g:7887:2: ','
            {
             before(grammarAccess.getLinkAccess().getCommaKeyword_6_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:7896:1: rule__Link__Group_6__1 : rule__Link__Group_6__1__Impl ;
    public final void rule__Link__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7900:1: ( rule__Link__Group_6__1__Impl )
            // InternalMyDsl.g:7901:2: rule__Link__Group_6__1__Impl
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
    // InternalMyDsl.g:7907:1: rule__Link__Group_6__1__Impl : ( ( rule__Link__ContainerAssignment_6_1 ) ) ;
    public final void rule__Link__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7911:1: ( ( ( rule__Link__ContainerAssignment_6_1 ) ) )
            // InternalMyDsl.g:7912:1: ( ( rule__Link__ContainerAssignment_6_1 ) )
            {
            // InternalMyDsl.g:7912:1: ( ( rule__Link__ContainerAssignment_6_1 ) )
            // InternalMyDsl.g:7913:2: ( rule__Link__ContainerAssignment_6_1 )
            {
             before(grammarAccess.getLinkAccess().getContainerAssignment_6_1()); 
            // InternalMyDsl.g:7914:2: ( rule__Link__ContainerAssignment_6_1 )
            // InternalMyDsl.g:7914:3: rule__Link__ContainerAssignment_6_1
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


    // $ANTLR start "rule__AllocationContext__Group__0"
    // InternalMyDsl.g:7923:1: rule__AllocationContext__Group__0 : rule__AllocationContext__Group__0__Impl rule__AllocationContext__Group__1 ;
    public final void rule__AllocationContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7927:1: ( rule__AllocationContext__Group__0__Impl rule__AllocationContext__Group__1 )
            // InternalMyDsl.g:7928:2: rule__AllocationContext__Group__0__Impl rule__AllocationContext__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AllocationContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__0"


    // $ANTLR start "rule__AllocationContext__Group__0__Impl"
    // InternalMyDsl.g:7935:1: rule__AllocationContext__Group__0__Impl : ( 'AllocationContext' ) ;
    public final void rule__AllocationContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7939:1: ( ( 'AllocationContext' ) )
            // InternalMyDsl.g:7940:1: ( 'AllocationContext' )
            {
            // InternalMyDsl.g:7940:1: ( 'AllocationContext' )
            // InternalMyDsl.g:7941:2: 'AllocationContext'
            {
             before(grammarAccess.getAllocationContextAccess().getAllocationContextKeyword_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getAllocationContextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__0__Impl"


    // $ANTLR start "rule__AllocationContext__Group__1"
    // InternalMyDsl.g:7950:1: rule__AllocationContext__Group__1 : rule__AllocationContext__Group__1__Impl rule__AllocationContext__Group__2 ;
    public final void rule__AllocationContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7954:1: ( rule__AllocationContext__Group__1__Impl rule__AllocationContext__Group__2 )
            // InternalMyDsl.g:7955:2: rule__AllocationContext__Group__1__Impl rule__AllocationContext__Group__2
            {
            pushFollow(FOLLOW_49);
            rule__AllocationContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__1"


    // $ANTLR start "rule__AllocationContext__Group__1__Impl"
    // InternalMyDsl.g:7962:1: rule__AllocationContext__Group__1__Impl : ( '{' ) ;
    public final void rule__AllocationContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7966:1: ( ( '{' ) )
            // InternalMyDsl.g:7967:1: ( '{' )
            {
            // InternalMyDsl.g:7967:1: ( '{' )
            // InternalMyDsl.g:7968:2: '{'
            {
             before(grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__1__Impl"


    // $ANTLR start "rule__AllocationContext__Group__2"
    // InternalMyDsl.g:7977:1: rule__AllocationContext__Group__2 : rule__AllocationContext__Group__2__Impl rule__AllocationContext__Group__3 ;
    public final void rule__AllocationContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7981:1: ( rule__AllocationContext__Group__2__Impl rule__AllocationContext__Group__3 )
            // InternalMyDsl.g:7982:2: rule__AllocationContext__Group__2__Impl rule__AllocationContext__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__AllocationContext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__2"


    // $ANTLR start "rule__AllocationContext__Group__2__Impl"
    // InternalMyDsl.g:7989:1: rule__AllocationContext__Group__2__Impl : ( 'container' ) ;
    public final void rule__AllocationContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7993:1: ( ( 'container' ) )
            // InternalMyDsl.g:7994:1: ( 'container' )
            {
            // InternalMyDsl.g:7994:1: ( 'container' )
            // InternalMyDsl.g:7995:2: 'container'
            {
             before(grammarAccess.getAllocationContextAccess().getContainerKeyword_2()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getContainerKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__2__Impl"


    // $ANTLR start "rule__AllocationContext__Group__3"
    // InternalMyDsl.g:8004:1: rule__AllocationContext__Group__3 : rule__AllocationContext__Group__3__Impl rule__AllocationContext__Group__4 ;
    public final void rule__AllocationContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8008:1: ( rule__AllocationContext__Group__3__Impl rule__AllocationContext__Group__4 )
            // InternalMyDsl.g:8009:2: rule__AllocationContext__Group__3__Impl rule__AllocationContext__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__AllocationContext__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__3"


    // $ANTLR start "rule__AllocationContext__Group__3__Impl"
    // InternalMyDsl.g:8016:1: rule__AllocationContext__Group__3__Impl : ( ( rule__AllocationContext__ContainerAssignment_3 ) ) ;
    public final void rule__AllocationContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8020:1: ( ( ( rule__AllocationContext__ContainerAssignment_3 ) ) )
            // InternalMyDsl.g:8021:1: ( ( rule__AllocationContext__ContainerAssignment_3 ) )
            {
            // InternalMyDsl.g:8021:1: ( ( rule__AllocationContext__ContainerAssignment_3 ) )
            // InternalMyDsl.g:8022:2: ( rule__AllocationContext__ContainerAssignment_3 )
            {
             before(grammarAccess.getAllocationContextAccess().getContainerAssignment_3()); 
            // InternalMyDsl.g:8023:2: ( rule__AllocationContext__ContainerAssignment_3 )
            // InternalMyDsl.g:8023:3: rule__AllocationContext__ContainerAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__ContainerAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAllocationContextAccess().getContainerAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__3__Impl"


    // $ANTLR start "rule__AllocationContext__Group__4"
    // InternalMyDsl.g:8031:1: rule__AllocationContext__Group__4 : rule__AllocationContext__Group__4__Impl rule__AllocationContext__Group__5 ;
    public final void rule__AllocationContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8035:1: ( rule__AllocationContext__Group__4__Impl rule__AllocationContext__Group__5 )
            // InternalMyDsl.g:8036:2: rule__AllocationContext__Group__4__Impl rule__AllocationContext__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__AllocationContext__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__4"


    // $ANTLR start "rule__AllocationContext__Group__4__Impl"
    // InternalMyDsl.g:8043:1: rule__AllocationContext__Group__4__Impl : ( 'assemblycontext' ) ;
    public final void rule__AllocationContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8047:1: ( ( 'assemblycontext' ) )
            // InternalMyDsl.g:8048:1: ( 'assemblycontext' )
            {
            // InternalMyDsl.g:8048:1: ( 'assemblycontext' )
            // InternalMyDsl.g:8049:2: 'assemblycontext'
            {
             before(grammarAccess.getAllocationContextAccess().getAssemblycontextKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getAssemblycontextKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__4__Impl"


    // $ANTLR start "rule__AllocationContext__Group__5"
    // InternalMyDsl.g:8058:1: rule__AllocationContext__Group__5 : rule__AllocationContext__Group__5__Impl rule__AllocationContext__Group__6 ;
    public final void rule__AllocationContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8062:1: ( rule__AllocationContext__Group__5__Impl rule__AllocationContext__Group__6 )
            // InternalMyDsl.g:8063:2: rule__AllocationContext__Group__5__Impl rule__AllocationContext__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__AllocationContext__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__5"


    // $ANTLR start "rule__AllocationContext__Group__5__Impl"
    // InternalMyDsl.g:8070:1: rule__AllocationContext__Group__5__Impl : ( ( rule__AllocationContext__AssemblycontextAssignment_5 ) ) ;
    public final void rule__AllocationContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8074:1: ( ( ( rule__AllocationContext__AssemblycontextAssignment_5 ) ) )
            // InternalMyDsl.g:8075:1: ( ( rule__AllocationContext__AssemblycontextAssignment_5 ) )
            {
            // InternalMyDsl.g:8075:1: ( ( rule__AllocationContext__AssemblycontextAssignment_5 ) )
            // InternalMyDsl.g:8076:2: ( rule__AllocationContext__AssemblycontextAssignment_5 )
            {
             before(grammarAccess.getAllocationContextAccess().getAssemblycontextAssignment_5()); 
            // InternalMyDsl.g:8077:2: ( rule__AllocationContext__AssemblycontextAssignment_5 )
            // InternalMyDsl.g:8077:3: rule__AllocationContext__AssemblycontextAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__AssemblycontextAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAllocationContextAccess().getAssemblycontextAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__5__Impl"


    // $ANTLR start "rule__AllocationContext__Group__6"
    // InternalMyDsl.g:8085:1: rule__AllocationContext__Group__6 : rule__AllocationContext__Group__6__Impl ;
    public final void rule__AllocationContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8089:1: ( rule__AllocationContext__Group__6__Impl )
            // InternalMyDsl.g:8090:2: rule__AllocationContext__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__6"


    // $ANTLR start "rule__AllocationContext__Group__6__Impl"
    // InternalMyDsl.g:8096:1: rule__AllocationContext__Group__6__Impl : ( '}' ) ;
    public final void rule__AllocationContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8100:1: ( ( '}' ) )
            // InternalMyDsl.g:8101:1: ( '}' )
            {
            // InternalMyDsl.g:8101:1: ( '}' )
            // InternalMyDsl.g:8102:2: '}'
            {
             before(grammarAccess.getAllocationContextAccess().getRightCurlyBracketKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__6__Impl"


    // $ANTLR start "rule__ComponentBasedSystem__InterfaceAssignment_4"
    // InternalMyDsl.g:8112:1: rule__ComponentBasedSystem__InterfaceAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__ComponentBasedSystem__InterfaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8116:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8117:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8117:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8118:3: ( ruleEString )
            {
             before(grammarAccess.getComponentBasedSystemAccess().getInterfaceInterfaceCrossReference_4_0()); 
            // InternalMyDsl.g:8119:3: ( ruleEString )
            // InternalMyDsl.g:8120:4: ruleEString
            {
             before(grammarAccess.getComponentBasedSystemAccess().getInterfaceInterfaceEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentBasedSystemAccess().getInterfaceInterfaceEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getComponentBasedSystemAccess().getInterfaceInterfaceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__InterfaceAssignment_4"


    // $ANTLR start "rule__ComponentBasedSystem__InterfaceAssignment_5_1"
    // InternalMyDsl.g:8131:1: rule__ComponentBasedSystem__InterfaceAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__ComponentBasedSystem__InterfaceAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8135:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8136:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8136:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8137:3: ( ruleEString )
            {
             before(grammarAccess.getComponentBasedSystemAccess().getInterfaceInterfaceCrossReference_5_1_0()); 
            // InternalMyDsl.g:8138:3: ( ruleEString )
            // InternalMyDsl.g:8139:4: ruleEString
            {
             before(grammarAccess.getComponentBasedSystemAccess().getInterfaceInterfaceEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentBasedSystemAccess().getInterfaceInterfaceEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getComponentBasedSystemAccess().getInterfaceInterfaceCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__InterfaceAssignment_5_1"


    // $ANTLR start "rule__ComponentBasedSystem__EnvironmentAssignment_8"
    // InternalMyDsl.g:8150:1: rule__ComponentBasedSystem__EnvironmentAssignment_8 : ( ( ruleEString ) ) ;
    public final void rule__ComponentBasedSystem__EnvironmentAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8154:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8155:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8155:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8156:3: ( ruleEString )
            {
             before(grammarAccess.getComponentBasedSystemAccess().getEnvironmentEnvironmentCrossReference_8_0()); 
            // InternalMyDsl.g:8157:3: ( ruleEString )
            // InternalMyDsl.g:8158:4: ruleEString
            {
             before(grammarAccess.getComponentBasedSystemAccess().getEnvironmentEnvironmentEStringParserRuleCall_8_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentBasedSystemAccess().getEnvironmentEnvironmentEStringParserRuleCall_8_0_1()); 

            }

             after(grammarAccess.getComponentBasedSystemAccess().getEnvironmentEnvironmentCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__EnvironmentAssignment_8"


    // $ANTLR start "rule__ComponentBasedSystem__RepositoryAssignment_9_1"
    // InternalMyDsl.g:8169:1: rule__ComponentBasedSystem__RepositoryAssignment_9_1 : ( ( ruleEString ) ) ;
    public final void rule__ComponentBasedSystem__RepositoryAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8173:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8174:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8174:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8175:3: ( ruleEString )
            {
             before(grammarAccess.getComponentBasedSystemAccess().getRepositoryRepositoryCrossReference_9_1_0()); 
            // InternalMyDsl.g:8176:3: ( ruleEString )
            // InternalMyDsl.g:8177:4: ruleEString
            {
             before(grammarAccess.getComponentBasedSystemAccess().getRepositoryRepositoryEStringParserRuleCall_9_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentBasedSystemAccess().getRepositoryRepositoryEStringParserRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getComponentBasedSystemAccess().getRepositoryRepositoryCrossReference_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__RepositoryAssignment_9_1"


    // $ANTLR start "rule__ComponentBasedSystem__AllocationAssignment_10_1"
    // InternalMyDsl.g:8188:1: rule__ComponentBasedSystem__AllocationAssignment_10_1 : ( ( ruleEString ) ) ;
    public final void rule__ComponentBasedSystem__AllocationAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8192:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8193:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8193:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8194:3: ( ruleEString )
            {
             before(grammarAccess.getComponentBasedSystemAccess().getAllocationAllocationCrossReference_10_1_0()); 
            // InternalMyDsl.g:8195:3: ( ruleEString )
            // InternalMyDsl.g:8196:4: ruleEString
            {
             before(grammarAccess.getComponentBasedSystemAccess().getAllocationAllocationEStringParserRuleCall_10_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentBasedSystemAccess().getAllocationAllocationEStringParserRuleCall_10_1_0_1()); 

            }

             after(grammarAccess.getComponentBasedSystemAccess().getAllocationAllocationCrossReference_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__AllocationAssignment_10_1"


    // $ANTLR start "rule__ComponentBasedSystem__AssemblycontextAssignment_11_2"
    // InternalMyDsl.g:8207:1: rule__ComponentBasedSystem__AssemblycontextAssignment_11_2 : ( ruleAssemblyContext ) ;
    public final void rule__ComponentBasedSystem__AssemblycontextAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8211:1: ( ( ruleAssemblyContext ) )
            // InternalMyDsl.g:8212:2: ( ruleAssemblyContext )
            {
            // InternalMyDsl.g:8212:2: ( ruleAssemblyContext )
            // InternalMyDsl.g:8213:3: ruleAssemblyContext
            {
             before(grammarAccess.getComponentBasedSystemAccess().getAssemblycontextAssemblyContextParserRuleCall_11_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAssemblyContext();

            state._fsp--;

             after(grammarAccess.getComponentBasedSystemAccess().getAssemblycontextAssemblyContextParserRuleCall_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__AssemblycontextAssignment_11_2"


    // $ANTLR start "rule__ComponentBasedSystem__AssemblycontextAssignment_11_3_1"
    // InternalMyDsl.g:8222:1: rule__ComponentBasedSystem__AssemblycontextAssignment_11_3_1 : ( ruleAssemblyContext ) ;
    public final void rule__ComponentBasedSystem__AssemblycontextAssignment_11_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8226:1: ( ( ruleAssemblyContext ) )
            // InternalMyDsl.g:8227:2: ( ruleAssemblyContext )
            {
            // InternalMyDsl.g:8227:2: ( ruleAssemblyContext )
            // InternalMyDsl.g:8228:3: ruleAssemblyContext
            {
             before(grammarAccess.getComponentBasedSystemAccess().getAssemblycontextAssemblyContextParserRuleCall_11_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssemblyContext();

            state._fsp--;

             after(grammarAccess.getComponentBasedSystemAccess().getAssemblycontextAssemblyContextParserRuleCall_11_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__AssemblycontextAssignment_11_3_1"


    // $ANTLR start "rule__ComponentBasedSystem__TypeAssignment_12_2"
    // InternalMyDsl.g:8237:1: rule__ComponentBasedSystem__TypeAssignment_12_2 : ( ruleType ) ;
    public final void rule__ComponentBasedSystem__TypeAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8241:1: ( ( ruleType ) )
            // InternalMyDsl.g:8242:2: ( ruleType )
            {
            // InternalMyDsl.g:8242:2: ( ruleType )
            // InternalMyDsl.g:8243:3: ruleType
            {
             before(grammarAccess.getComponentBasedSystemAccess().getTypeTypeParserRuleCall_12_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getComponentBasedSystemAccess().getTypeTypeParserRuleCall_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__TypeAssignment_12_2"


    // $ANTLR start "rule__ComponentBasedSystem__TypeAssignment_12_3_1"
    // InternalMyDsl.g:8252:1: rule__ComponentBasedSystem__TypeAssignment_12_3_1 : ( ruleType ) ;
    public final void rule__ComponentBasedSystem__TypeAssignment_12_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8256:1: ( ( ruleType ) )
            // InternalMyDsl.g:8257:2: ( ruleType )
            {
            // InternalMyDsl.g:8257:2: ( ruleType )
            // InternalMyDsl.g:8258:3: ruleType
            {
             before(grammarAccess.getComponentBasedSystemAccess().getTypeTypeParserRuleCall_12_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getComponentBasedSystemAccess().getTypeTypeParserRuleCall_12_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__TypeAssignment_12_3_1"


    // $ANTLR start "rule__ComponentBasedSystem__AssemblyconnectorAssignment_13_2"
    // InternalMyDsl.g:8267:1: rule__ComponentBasedSystem__AssemblyconnectorAssignment_13_2 : ( ruleAssemblyConnector ) ;
    public final void rule__ComponentBasedSystem__AssemblyconnectorAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8271:1: ( ( ruleAssemblyConnector ) )
            // InternalMyDsl.g:8272:2: ( ruleAssemblyConnector )
            {
            // InternalMyDsl.g:8272:2: ( ruleAssemblyConnector )
            // InternalMyDsl.g:8273:3: ruleAssemblyConnector
            {
             before(grammarAccess.getComponentBasedSystemAccess().getAssemblyconnectorAssemblyConnectorParserRuleCall_13_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAssemblyConnector();

            state._fsp--;

             after(grammarAccess.getComponentBasedSystemAccess().getAssemblyconnectorAssemblyConnectorParserRuleCall_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__AssemblyconnectorAssignment_13_2"


    // $ANTLR start "rule__ComponentBasedSystem__AssemblyconnectorAssignment_13_3_1"
    // InternalMyDsl.g:8282:1: rule__ComponentBasedSystem__AssemblyconnectorAssignment_13_3_1 : ( ruleAssemblyConnector ) ;
    public final void rule__ComponentBasedSystem__AssemblyconnectorAssignment_13_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8286:1: ( ( ruleAssemblyConnector ) )
            // InternalMyDsl.g:8287:2: ( ruleAssemblyConnector )
            {
            // InternalMyDsl.g:8287:2: ( ruleAssemblyConnector )
            // InternalMyDsl.g:8288:3: ruleAssemblyConnector
            {
             before(grammarAccess.getComponentBasedSystemAccess().getAssemblyconnectorAssemblyConnectorParserRuleCall_13_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssemblyConnector();

            state._fsp--;

             after(grammarAccess.getComponentBasedSystemAccess().getAssemblyconnectorAssemblyConnectorParserRuleCall_13_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentBasedSystem__AssemblyconnectorAssignment_13_3_1"


    // $ANTLR start "rule__Interface__NameAssignment_2"
    // InternalMyDsl.g:8297:1: rule__Interface__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Interface__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8301:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8302:2: ( ruleEString )
            {
            // InternalMyDsl.g:8302:2: ( ruleEString )
            // InternalMyDsl.g:8303:3: ruleEString
            {
             before(grammarAccess.getInterfaceAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__NameAssignment_2"


    // $ANTLR start "rule__Interface__SignatureAssignment_4_2"
    // InternalMyDsl.g:8312:1: rule__Interface__SignatureAssignment_4_2 : ( ruleSignature ) ;
    public final void rule__Interface__SignatureAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8316:1: ( ( ruleSignature ) )
            // InternalMyDsl.g:8317:2: ( ruleSignature )
            {
            // InternalMyDsl.g:8317:2: ( ruleSignature )
            // InternalMyDsl.g:8318:3: ruleSignature
            {
             before(grammarAccess.getInterfaceAccess().getSignatureSignatureParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSignature();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getSignatureSignatureParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__SignatureAssignment_4_2"


    // $ANTLR start "rule__Interface__SignatureAssignment_4_3_1"
    // InternalMyDsl.g:8327:1: rule__Interface__SignatureAssignment_4_3_1 : ( ruleSignature ) ;
    public final void rule__Interface__SignatureAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8331:1: ( ( ruleSignature ) )
            // InternalMyDsl.g:8332:2: ( ruleSignature )
            {
            // InternalMyDsl.g:8332:2: ( ruleSignature )
            // InternalMyDsl.g:8333:3: ruleSignature
            {
             before(grammarAccess.getInterfaceAccess().getSignatureSignatureParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSignature();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getSignatureSignatureParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__SignatureAssignment_4_3_1"


    // $ANTLR start "rule__AssemblyContext__NameAssignment_1"
    // InternalMyDsl.g:8342:1: rule__AssemblyContext__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__AssemblyContext__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8346:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8347:2: ( ruleEString )
            {
            // InternalMyDsl.g:8347:2: ( ruleEString )
            // InternalMyDsl.g:8348:3: ruleEString
            {
             before(grammarAccess.getAssemblyContextAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyContextAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__NameAssignment_1"


    // $ANTLR start "rule__AssemblyContext__ComponentAssignment_4"
    // InternalMyDsl.g:8357:1: rule__AssemblyContext__ComponentAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyContext__ComponentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8361:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8362:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8362:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8363:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyContextAccess().getComponentComponentCrossReference_4_0()); 
            // InternalMyDsl.g:8364:3: ( ruleEString )
            // InternalMyDsl.g:8365:4: ruleEString
            {
             before(grammarAccess.getAssemblyContextAccess().getComponentComponentEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyContextAccess().getComponentComponentEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAssemblyContextAccess().getComponentComponentCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__ComponentAssignment_4"


    // $ANTLR start "rule__Type_Impl__NameAssignment_2"
    // InternalMyDsl.g:8376:1: rule__Type_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Type_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8380:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8381:2: ( ruleEString )
            {
            // InternalMyDsl.g:8381:2: ( ruleEString )
            // InternalMyDsl.g:8382:3: ruleEString
            {
             before(grammarAccess.getType_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getType_ImplAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__NameAssignment_2"


    // $ANTLR start "rule__AssemblyConnector__NameAssignment_1"
    // InternalMyDsl.g:8391:1: rule__AssemblyConnector__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__AssemblyConnector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8395:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8396:2: ( ruleEString )
            {
            // InternalMyDsl.g:8396:2: ( ruleEString )
            // InternalMyDsl.g:8397:3: ruleEString
            {
             before(grammarAccess.getAssemblyConnectorAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyConnectorAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__NameAssignment_1"


    // $ANTLR start "rule__AssemblyConnector__ProvidedroleAssignment_4"
    // InternalMyDsl.g:8406:1: rule__AssemblyConnector__ProvidedroleAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyConnector__ProvidedroleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8410:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8411:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8411:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8412:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getProvidedroleProvidedRoleCrossReference_4_0()); 
            // InternalMyDsl.g:8413:3: ( ruleEString )
            // InternalMyDsl.g:8414:4: ruleEString
            {
             before(grammarAccess.getAssemblyConnectorAccess().getProvidedroleProvidedRoleEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyConnectorAccess().getProvidedroleProvidedRoleEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAssemblyConnectorAccess().getProvidedroleProvidedRoleCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__ProvidedroleAssignment_4"


    // $ANTLR start "rule__AssemblyConnector__RequiredroleAssignment_6"
    // InternalMyDsl.g:8425:1: rule__AssemblyConnector__RequiredroleAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyConnector__RequiredroleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8429:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8430:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8430:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8431:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getRequiredroleRequiredRoleCrossReference_6_0()); 
            // InternalMyDsl.g:8432:3: ( ruleEString )
            // InternalMyDsl.g:8433:4: ruleEString
            {
             before(grammarAccess.getAssemblyConnectorAccess().getRequiredroleRequiredRoleEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyConnectorAccess().getRequiredroleRequiredRoleEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getAssemblyConnectorAccess().getRequiredroleRequiredRoleCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__RequiredroleAssignment_6"


    // $ANTLR start "rule__Signature__NameAssignment_1"
    // InternalMyDsl.g:8444:1: rule__Signature__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Signature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8448:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8449:2: ( ruleEString )
            {
            // InternalMyDsl.g:8449:2: ( ruleEString )
            // InternalMyDsl.g:8450:3: ruleEString
            {
             before(grammarAccess.getSignatureAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__NameAssignment_1"


    // $ANTLR start "rule__Signature__ReturntypeAssignment_4"
    // InternalMyDsl.g:8459:1: rule__Signature__ReturntypeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Signature__ReturntypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8463:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8464:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8464:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8465:3: ( ruleEString )
            {
             before(grammarAccess.getSignatureAccess().getReturntypeReturnTypeCrossReference_4_0()); 
            // InternalMyDsl.g:8466:3: ( ruleEString )
            // InternalMyDsl.g:8467:4: ruleEString
            {
             before(grammarAccess.getSignatureAccess().getReturntypeReturnTypeEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getReturntypeReturnTypeEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getSignatureAccess().getReturntypeReturnTypeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__ReturntypeAssignment_4"


    // $ANTLR start "rule__Signature__ParameterAssignment_5_2"
    // InternalMyDsl.g:8478:1: rule__Signature__ParameterAssignment_5_2 : ( ruleParameter ) ;
    public final void rule__Signature__ParameterAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8482:1: ( ( ruleParameter ) )
            // InternalMyDsl.g:8483:2: ( ruleParameter )
            {
            // InternalMyDsl.g:8483:2: ( ruleParameter )
            // InternalMyDsl.g:8484:3: ruleParameter
            {
             before(grammarAccess.getSignatureAccess().getParameterParameterParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getParameterParameterParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__ParameterAssignment_5_2"


    // $ANTLR start "rule__Signature__ParameterAssignment_5_3_1"
    // InternalMyDsl.g:8493:1: rule__Signature__ParameterAssignment_5_3_1 : ( ruleParameter ) ;
    public final void rule__Signature__ParameterAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8497:1: ( ( ruleParameter ) )
            // InternalMyDsl.g:8498:2: ( ruleParameter )
            {
            // InternalMyDsl.g:8498:2: ( ruleParameter )
            // InternalMyDsl.g:8499:3: ruleParameter
            {
             before(grammarAccess.getSignatureAccess().getParameterParameterParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getParameterParameterParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__ParameterAssignment_5_3_1"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // InternalMyDsl.g:8508:1: rule__Parameter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8512:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8513:2: ( ruleEString )
            {
            // InternalMyDsl.g:8513:2: ( ruleEString )
            // InternalMyDsl.g:8514:3: ruleEString
            {
             before(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Parameter__ParametertypeAssignment_4"
    // InternalMyDsl.g:8523:1: rule__Parameter__ParametertypeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Parameter__ParametertypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8527:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8528:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8528:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8529:3: ( ruleEString )
            {
             before(grammarAccess.getParameterAccess().getParametertypeParameterTypeCrossReference_4_0()); 
            // InternalMyDsl.g:8530:3: ( ruleEString )
            // InternalMyDsl.g:8531:4: ruleEString
            {
             before(grammarAccess.getParameterAccess().getParametertypeParameterTypeEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getParametertypeParameterTypeEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getParametertypeParameterTypeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ParametertypeAssignment_4"


    // $ANTLR start "rule__ReturnType_Impl__NameAssignment_2"
    // InternalMyDsl.g:8542:1: rule__ReturnType_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ReturnType_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8546:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8547:2: ( ruleEString )
            {
            // InternalMyDsl.g:8547:2: ( ruleEString )
            // InternalMyDsl.g:8548:3: ruleEString
            {
             before(grammarAccess.getReturnType_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReturnType_ImplAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnType_Impl__NameAssignment_2"


    // $ANTLR start "rule__ParameterType_Impl__NameAssignment_2"
    // InternalMyDsl.g:8557:1: rule__ParameterType_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ParameterType_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8561:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8562:2: ( ruleEString )
            {
            // InternalMyDsl.g:8562:2: ( ruleEString )
            // InternalMyDsl.g:8563:3: ruleEString
            {
             before(grammarAccess.getParameterType_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterType_ImplAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterType_Impl__NameAssignment_2"


    // $ANTLR start "rule__Simple__NameAssignment_2"
    // InternalMyDsl.g:8572:1: rule__Simple__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Simple__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8576:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8577:2: ( ruleEString )
            {
            // InternalMyDsl.g:8577:2: ( ruleEString )
            // InternalMyDsl.g:8578:3: ruleEString
            {
             before(grammarAccess.getSimpleAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSimpleAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__NameAssignment_2"


    // $ANTLR start "rule__Simple__KindAssignment_4_1"
    // InternalMyDsl.g:8587:1: rule__Simple__KindAssignment_4_1 : ( rulesimpleTypes ) ;
    public final void rule__Simple__KindAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8591:1: ( ( rulesimpleTypes ) )
            // InternalMyDsl.g:8592:2: ( rulesimpleTypes )
            {
            // InternalMyDsl.g:8592:2: ( rulesimpleTypes )
            // InternalMyDsl.g:8593:3: rulesimpleTypes
            {
             before(grammarAccess.getSimpleAccess().getKindSimpleTypesEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            rulesimpleTypes();

            state._fsp--;

             after(grammarAccess.getSimpleAccess().getKindSimpleTypesEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__KindAssignment_4_1"


    // $ANTLR start "rule__Complex__NameAssignment_1"
    // InternalMyDsl.g:8602:1: rule__Complex__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Complex__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8606:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8607:2: ( ruleEString )
            {
            // InternalMyDsl.g:8607:2: ( ruleEString )
            // InternalMyDsl.g:8608:3: ruleEString
            {
             before(grammarAccess.getComplexAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComplexAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__NameAssignment_1"


    // $ANTLR start "rule__Complex__SimpleAssignment_5"
    // InternalMyDsl.g:8617:1: rule__Complex__SimpleAssignment_5 : ( ruleSimple ) ;
    public final void rule__Complex__SimpleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8621:1: ( ( ruleSimple ) )
            // InternalMyDsl.g:8622:2: ( ruleSimple )
            {
            // InternalMyDsl.g:8622:2: ( ruleSimple )
            // InternalMyDsl.g:8623:3: ruleSimple
            {
             before(grammarAccess.getComplexAccess().getSimpleSimpleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSimple();

            state._fsp--;

             after(grammarAccess.getComplexAccess().getSimpleSimpleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__SimpleAssignment_5"


    // $ANTLR start "rule__Complex__SimpleAssignment_6_1"
    // InternalMyDsl.g:8632:1: rule__Complex__SimpleAssignment_6_1 : ( ruleSimple ) ;
    public final void rule__Complex__SimpleAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8636:1: ( ( ruleSimple ) )
            // InternalMyDsl.g:8637:2: ( ruleSimple )
            {
            // InternalMyDsl.g:8637:2: ( ruleSimple )
            // InternalMyDsl.g:8638:3: ruleSimple
            {
             before(grammarAccess.getComplexAccess().getSimpleSimpleParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSimple();

            state._fsp--;

             after(grammarAccess.getComplexAccess().getSimpleSimpleParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__SimpleAssignment_6_1"


    // $ANTLR start "rule__Void__NameAssignment_2"
    // InternalMyDsl.g:8647:1: rule__Void__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Void__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8651:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8652:2: ( ruleEString )
            {
            // InternalMyDsl.g:8652:2: ( ruleEString )
            // InternalMyDsl.g:8653:3: ruleEString
            {
             before(grammarAccess.getVoidAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVoidAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Void__NameAssignment_2"


    // $ANTLR start "rule__Component_Impl__NameAssignment_1"
    // InternalMyDsl.g:8662:1: rule__Component_Impl__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Component_Impl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8666:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8667:2: ( ruleEString )
            {
            // InternalMyDsl.g:8667:2: ( ruleEString )
            // InternalMyDsl.g:8668:3: ruleEString
            {
             before(grammarAccess.getComponent_ImplAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__NameAssignment_1"


    // $ANTLR start "rule__Component_Impl__BehaviourdescriptionAssignment_3_2"
    // InternalMyDsl.g:8677:1: rule__Component_Impl__BehaviourdescriptionAssignment_3_2 : ( ruleBehaviourDescription ) ;
    public final void rule__Component_Impl__BehaviourdescriptionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8681:1: ( ( ruleBehaviourDescription ) )
            // InternalMyDsl.g:8682:2: ( ruleBehaviourDescription )
            {
            // InternalMyDsl.g:8682:2: ( ruleBehaviourDescription )
            // InternalMyDsl.g:8683:3: ruleBehaviourDescription
            {
             before(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionBehaviourDescriptionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviourDescription();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionBehaviourDescriptionParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__BehaviourdescriptionAssignment_3_2"


    // $ANTLR start "rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1"
    // InternalMyDsl.g:8692:1: rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1 : ( ruleBehaviourDescription ) ;
    public final void rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8696:1: ( ( ruleBehaviourDescription ) )
            // InternalMyDsl.g:8697:2: ( ruleBehaviourDescription )
            {
            // InternalMyDsl.g:8697:2: ( ruleBehaviourDescription )
            // InternalMyDsl.g:8698:3: ruleBehaviourDescription
            {
             before(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionBehaviourDescriptionParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviourDescription();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionBehaviourDescriptionParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__BehaviourdescriptionAssignment_3_3_1"


    // $ANTLR start "rule__Component_Impl__ServiceAssignment_6"
    // InternalMyDsl.g:8707:1: rule__Component_Impl__ServiceAssignment_6 : ( ruleService ) ;
    public final void rule__Component_Impl__ServiceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8711:1: ( ( ruleService ) )
            // InternalMyDsl.g:8712:2: ( ruleService )
            {
            // InternalMyDsl.g:8712:2: ( ruleService )
            // InternalMyDsl.g:8713:3: ruleService
            {
             before(grammarAccess.getComponent_ImplAccess().getServiceServiceParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getServiceServiceParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__ServiceAssignment_6"


    // $ANTLR start "rule__Component_Impl__ServiceAssignment_7_1"
    // InternalMyDsl.g:8722:1: rule__Component_Impl__ServiceAssignment_7_1 : ( ruleService ) ;
    public final void rule__Component_Impl__ServiceAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8726:1: ( ( ruleService ) )
            // InternalMyDsl.g:8727:2: ( ruleService )
            {
            // InternalMyDsl.g:8727:2: ( ruleService )
            // InternalMyDsl.g:8728:3: ruleService
            {
             before(grammarAccess.getComponent_ImplAccess().getServiceServiceParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getServiceServiceParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__ServiceAssignment_7_1"


    // $ANTLR start "rule__Component_Impl__RequiredroleAssignment_9_2"
    // InternalMyDsl.g:8737:1: rule__Component_Impl__RequiredroleAssignment_9_2 : ( ruleRequiredRole ) ;
    public final void rule__Component_Impl__RequiredroleAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8741:1: ( ( ruleRequiredRole ) )
            // InternalMyDsl.g:8742:2: ( ruleRequiredRole )
            {
            // InternalMyDsl.g:8742:2: ( ruleRequiredRole )
            // InternalMyDsl.g:8743:3: ruleRequiredRole
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredroleRequiredRoleParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRequiredRole();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getRequiredroleRequiredRoleParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__RequiredroleAssignment_9_2"


    // $ANTLR start "rule__Component_Impl__RequiredroleAssignment_9_3_1"
    // InternalMyDsl.g:8752:1: rule__Component_Impl__RequiredroleAssignment_9_3_1 : ( ruleRequiredRole ) ;
    public final void rule__Component_Impl__RequiredroleAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8756:1: ( ( ruleRequiredRole ) )
            // InternalMyDsl.g:8757:2: ( ruleRequiredRole )
            {
            // InternalMyDsl.g:8757:2: ( ruleRequiredRole )
            // InternalMyDsl.g:8758:3: ruleRequiredRole
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredroleRequiredRoleParserRuleCall_9_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRequiredRole();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getRequiredroleRequiredRoleParserRuleCall_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__RequiredroleAssignment_9_3_1"


    // $ANTLR start "rule__Component_Impl__ProvidedroleAssignment_11"
    // InternalMyDsl.g:8767:1: rule__Component_Impl__ProvidedroleAssignment_11 : ( ruleProvidedRole ) ;
    public final void rule__Component_Impl__ProvidedroleAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8771:1: ( ( ruleProvidedRole ) )
            // InternalMyDsl.g:8772:2: ( ruleProvidedRole )
            {
            // InternalMyDsl.g:8772:2: ( ruleProvidedRole )
            // InternalMyDsl.g:8773:3: ruleProvidedRole
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedroleProvidedRoleParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleProvidedRole();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getProvidedroleProvidedRoleParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__ProvidedroleAssignment_11"


    // $ANTLR start "rule__Service__CorrespondingSignaturesAssignment_4"
    // InternalMyDsl.g:8782:1: rule__Service__CorrespondingSignaturesAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Service__CorrespondingSignaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8786:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8787:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8787:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8788:3: ( ruleEString )
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignaturesSignatureCrossReference_4_0()); 
            // InternalMyDsl.g:8789:3: ( ruleEString )
            // InternalMyDsl.g:8790:4: ruleEString
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignaturesSignatureEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getCorrespondingSignaturesSignatureEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getServiceAccess().getCorrespondingSignaturesSignatureCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__CorrespondingSignaturesAssignment_4"


    // $ANTLR start "rule__Service__CorrespondingSignaturesAssignment_5_1"
    // InternalMyDsl.g:8801:1: rule__Service__CorrespondingSignaturesAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Service__CorrespondingSignaturesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8805:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8806:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8806:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8807:3: ( ruleEString )
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignaturesSignatureCrossReference_5_1_0()); 
            // InternalMyDsl.g:8808:3: ( ruleEString )
            // InternalMyDsl.g:8809:4: ruleEString
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignaturesSignatureEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getCorrespondingSignaturesSignatureEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getServiceAccess().getCorrespondingSignaturesSignatureCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__CorrespondingSignaturesAssignment_5_1"


    // $ANTLR start "rule__RequiredRole__NameAssignment_1"
    // InternalMyDsl.g:8820:1: rule__RequiredRole__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__RequiredRole__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8824:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8825:2: ( ruleEString )
            {
            // InternalMyDsl.g:8825:2: ( ruleEString )
            // InternalMyDsl.g:8826:3: ruleEString
            {
             before(grammarAccess.getRequiredRoleAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRequiredRoleAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__NameAssignment_1"


    // $ANTLR start "rule__RequiredRole__InterfaceAssignment_4"
    // InternalMyDsl.g:8835:1: rule__RequiredRole__InterfaceAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__RequiredRole__InterfaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8839:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8840:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8840:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8841:3: ( ruleEString )
            {
             before(grammarAccess.getRequiredRoleAccess().getInterfaceInterfaceCrossReference_4_0()); 
            // InternalMyDsl.g:8842:3: ( ruleEString )
            // InternalMyDsl.g:8843:4: ruleEString
            {
             before(grammarAccess.getRequiredRoleAccess().getInterfaceInterfaceEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRequiredRoleAccess().getInterfaceInterfaceEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRequiredRoleAccess().getInterfaceInterfaceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__InterfaceAssignment_4"


    // $ANTLR start "rule__ProvidedRole__NameAssignment_1"
    // InternalMyDsl.g:8854:1: rule__ProvidedRole__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ProvidedRole__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8858:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8859:2: ( ruleEString )
            {
            // InternalMyDsl.g:8859:2: ( ruleEString )
            // InternalMyDsl.g:8860:3: ruleEString
            {
             before(grammarAccess.getProvidedRoleAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProvidedRoleAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__NameAssignment_1"


    // $ANTLR start "rule__ProvidedRole__InterfaceAssignment_4"
    // InternalMyDsl.g:8869:1: rule__ProvidedRole__InterfaceAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__ProvidedRole__InterfaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8873:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8874:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8874:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8875:3: ( ruleEString )
            {
             before(grammarAccess.getProvidedRoleAccess().getInterfaceInterfaceCrossReference_4_0()); 
            // InternalMyDsl.g:8876:3: ( ruleEString )
            // InternalMyDsl.g:8877:4: ruleEString
            {
             before(grammarAccess.getProvidedRoleAccess().getInterfaceInterfaceEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProvidedRoleAccess().getInterfaceInterfaceEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getProvidedRoleAccess().getInterfaceInterfaceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__InterfaceAssignment_4"


    // $ANTLR start "rule__CompositeComponent__NameAssignment_1"
    // InternalMyDsl.g:8888:1: rule__CompositeComponent__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CompositeComponent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8892:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8893:2: ( ruleEString )
            {
            // InternalMyDsl.g:8893:2: ( ruleEString )
            // InternalMyDsl.g:8894:3: ruleEString
            {
             before(grammarAccess.getCompositeComponentAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__NameAssignment_1"


    // $ANTLR start "rule__CompositeComponent__BehaviourdescriptionAssignment_3_2"
    // InternalMyDsl.g:8903:1: rule__CompositeComponent__BehaviourdescriptionAssignment_3_2 : ( ruleBehaviourDescription ) ;
    public final void rule__CompositeComponent__BehaviourdescriptionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8907:1: ( ( ruleBehaviourDescription ) )
            // InternalMyDsl.g:8908:2: ( ruleBehaviourDescription )
            {
            // InternalMyDsl.g:8908:2: ( ruleBehaviourDescription )
            // InternalMyDsl.g:8909:3: ruleBehaviourDescription
            {
             before(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionBehaviourDescriptionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviourDescription();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionBehaviourDescriptionParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__BehaviourdescriptionAssignment_3_2"


    // $ANTLR start "rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1"
    // InternalMyDsl.g:8918:1: rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1 : ( ruleBehaviourDescription ) ;
    public final void rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8922:1: ( ( ruleBehaviourDescription ) )
            // InternalMyDsl.g:8923:2: ( ruleBehaviourDescription )
            {
            // InternalMyDsl.g:8923:2: ( ruleBehaviourDescription )
            // InternalMyDsl.g:8924:3: ruleBehaviourDescription
            {
             before(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionBehaviourDescriptionParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviourDescription();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionBehaviourDescriptionParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__BehaviourdescriptionAssignment_3_3_1"


    // $ANTLR start "rule__CompositeComponent__ServiceAssignment_6"
    // InternalMyDsl.g:8933:1: rule__CompositeComponent__ServiceAssignment_6 : ( ruleService ) ;
    public final void rule__CompositeComponent__ServiceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8937:1: ( ( ruleService ) )
            // InternalMyDsl.g:8938:2: ( ruleService )
            {
            // InternalMyDsl.g:8938:2: ( ruleService )
            // InternalMyDsl.g:8939:3: ruleService
            {
             before(grammarAccess.getCompositeComponentAccess().getServiceServiceParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getServiceServiceParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__ServiceAssignment_6"


    // $ANTLR start "rule__CompositeComponent__ServiceAssignment_7_1"
    // InternalMyDsl.g:8948:1: rule__CompositeComponent__ServiceAssignment_7_1 : ( ruleService ) ;
    public final void rule__CompositeComponent__ServiceAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8952:1: ( ( ruleService ) )
            // InternalMyDsl.g:8953:2: ( ruleService )
            {
            // InternalMyDsl.g:8953:2: ( ruleService )
            // InternalMyDsl.g:8954:3: ruleService
            {
             before(grammarAccess.getCompositeComponentAccess().getServiceServiceParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getServiceServiceParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__ServiceAssignment_7_1"


    // $ANTLR start "rule__CompositeComponent__RequiredroleAssignment_9_2"
    // InternalMyDsl.g:8963:1: rule__CompositeComponent__RequiredroleAssignment_9_2 : ( ruleRequiredRole ) ;
    public final void rule__CompositeComponent__RequiredroleAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8967:1: ( ( ruleRequiredRole ) )
            // InternalMyDsl.g:8968:2: ( ruleRequiredRole )
            {
            // InternalMyDsl.g:8968:2: ( ruleRequiredRole )
            // InternalMyDsl.g:8969:3: ruleRequiredRole
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredroleRequiredRoleParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRequiredRole();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getRequiredroleRequiredRoleParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__RequiredroleAssignment_9_2"


    // $ANTLR start "rule__CompositeComponent__RequiredroleAssignment_9_3_1"
    // InternalMyDsl.g:8978:1: rule__CompositeComponent__RequiredroleAssignment_9_3_1 : ( ruleRequiredRole ) ;
    public final void rule__CompositeComponent__RequiredroleAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8982:1: ( ( ruleRequiredRole ) )
            // InternalMyDsl.g:8983:2: ( ruleRequiredRole )
            {
            // InternalMyDsl.g:8983:2: ( ruleRequiredRole )
            // InternalMyDsl.g:8984:3: ruleRequiredRole
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredroleRequiredRoleParserRuleCall_9_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRequiredRole();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getRequiredroleRequiredRoleParserRuleCall_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__RequiredroleAssignment_9_3_1"


    // $ANTLR start "rule__CompositeComponent__ProvidedroleAssignment_11"
    // InternalMyDsl.g:8993:1: rule__CompositeComponent__ProvidedroleAssignment_11 : ( ruleProvidedRole ) ;
    public final void rule__CompositeComponent__ProvidedroleAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8997:1: ( ( ruleProvidedRole ) )
            // InternalMyDsl.g:8998:2: ( ruleProvidedRole )
            {
            // InternalMyDsl.g:8998:2: ( ruleProvidedRole )
            // InternalMyDsl.g:8999:3: ruleProvidedRole
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedroleProvidedRoleParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleProvidedRole();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getProvidedroleProvidedRoleParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__ProvidedroleAssignment_11"


    // $ANTLR start "rule__CompositeComponent__AssemblycontextAssignment_14"
    // InternalMyDsl.g:9008:1: rule__CompositeComponent__AssemblycontextAssignment_14 : ( ruleAssemblyContext ) ;
    public final void rule__CompositeComponent__AssemblycontextAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9012:1: ( ( ruleAssemblyContext ) )
            // InternalMyDsl.g:9013:2: ( ruleAssemblyContext )
            {
            // InternalMyDsl.g:9013:2: ( ruleAssemblyContext )
            // InternalMyDsl.g:9014:3: ruleAssemblyContext
            {
             before(grammarAccess.getCompositeComponentAccess().getAssemblycontextAssemblyContextParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleAssemblyContext();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getAssemblycontextAssemblyContextParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__AssemblycontextAssignment_14"


    // $ANTLR start "rule__CompositeComponent__AssemblycontextAssignment_15_1"
    // InternalMyDsl.g:9023:1: rule__CompositeComponent__AssemblycontextAssignment_15_1 : ( ruleAssemblyContext ) ;
    public final void rule__CompositeComponent__AssemblycontextAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9027:1: ( ( ruleAssemblyContext ) )
            // InternalMyDsl.g:9028:2: ( ruleAssemblyContext )
            {
            // InternalMyDsl.g:9028:2: ( ruleAssemblyContext )
            // InternalMyDsl.g:9029:3: ruleAssemblyContext
            {
             before(grammarAccess.getCompositeComponentAccess().getAssemblycontextAssemblyContextParserRuleCall_15_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssemblyContext();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getAssemblycontextAssemblyContextParserRuleCall_15_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__AssemblycontextAssignment_15_1"


    // $ANTLR start "rule__CompositeComponent__DelegationconnectorAssignment_19"
    // InternalMyDsl.g:9038:1: rule__CompositeComponent__DelegationconnectorAssignment_19 : ( ruleDelegationConnector ) ;
    public final void rule__CompositeComponent__DelegationconnectorAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9042:1: ( ( ruleDelegationConnector ) )
            // InternalMyDsl.g:9043:2: ( ruleDelegationConnector )
            {
            // InternalMyDsl.g:9043:2: ( ruleDelegationConnector )
            // InternalMyDsl.g:9044:3: ruleDelegationConnector
            {
             before(grammarAccess.getCompositeComponentAccess().getDelegationconnectorDelegationConnectorParserRuleCall_19_0()); 
            pushFollow(FOLLOW_2);
            ruleDelegationConnector();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getDelegationconnectorDelegationConnectorParserRuleCall_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__DelegationconnectorAssignment_19"


    // $ANTLR start "rule__CompositeComponent__DelegationconnectorAssignment_20_1"
    // InternalMyDsl.g:9053:1: rule__CompositeComponent__DelegationconnectorAssignment_20_1 : ( ruleDelegationConnector ) ;
    public final void rule__CompositeComponent__DelegationconnectorAssignment_20_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9057:1: ( ( ruleDelegationConnector ) )
            // InternalMyDsl.g:9058:2: ( ruleDelegationConnector )
            {
            // InternalMyDsl.g:9058:2: ( ruleDelegationConnector )
            // InternalMyDsl.g:9059:3: ruleDelegationConnector
            {
             before(grammarAccess.getCompositeComponentAccess().getDelegationconnectorDelegationConnectorParserRuleCall_20_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDelegationConnector();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getDelegationconnectorDelegationConnectorParserRuleCall_20_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__DelegationconnectorAssignment_20_1"


    // $ANTLR start "rule__DelegationConnector__NameAssignment_1"
    // InternalMyDsl.g:9068:1: rule__DelegationConnector__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__DelegationConnector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9072:1: ( ( ruleEString ) )
            // InternalMyDsl.g:9073:2: ( ruleEString )
            {
            // InternalMyDsl.g:9073:2: ( ruleEString )
            // InternalMyDsl.g:9074:3: ruleEString
            {
             before(grammarAccess.getDelegationConnectorAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDelegationConnectorAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__NameAssignment_1"


    // $ANTLR start "rule__DelegationConnector__RoleAssignment_5"
    // InternalMyDsl.g:9083:1: rule__DelegationConnector__RoleAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__DelegationConnector__RoleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9087:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9088:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9088:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9089:3: ( ruleEString )
            {
             before(grammarAccess.getDelegationConnectorAccess().getRoleRoleCrossReference_5_0()); 
            // InternalMyDsl.g:9090:3: ( ruleEString )
            // InternalMyDsl.g:9091:4: ruleEString
            {
             before(grammarAccess.getDelegationConnectorAccess().getRoleRoleEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDelegationConnectorAccess().getRoleRoleEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getDelegationConnectorAccess().getRoleRoleCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__RoleAssignment_5"


    // $ANTLR start "rule__DelegationConnector__RoleAssignment_6_1"
    // InternalMyDsl.g:9102:1: rule__DelegationConnector__RoleAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__DelegationConnector__RoleAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9106:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9107:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9107:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9108:3: ( ruleEString )
            {
             before(grammarAccess.getDelegationConnectorAccess().getRoleRoleCrossReference_6_1_0()); 
            // InternalMyDsl.g:9109:3: ( ruleEString )
            // InternalMyDsl.g:9110:4: ruleEString
            {
             before(grammarAccess.getDelegationConnectorAccess().getRoleRoleEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDelegationConnectorAccess().getRoleRoleEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getDelegationConnectorAccess().getRoleRoleCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__RoleAssignment_6_1"


    // $ANTLR start "rule__Role_Impl__NameAssignment_1"
    // InternalMyDsl.g:9121:1: rule__Role_Impl__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Role_Impl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9125:1: ( ( ruleEString ) )
            // InternalMyDsl.g:9126:2: ( ruleEString )
            {
            // InternalMyDsl.g:9126:2: ( ruleEString )
            // InternalMyDsl.g:9127:3: ruleEString
            {
             before(grammarAccess.getRole_ImplAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRole_ImplAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__NameAssignment_1"


    // $ANTLR start "rule__Role_Impl__InterfaceAssignment_4"
    // InternalMyDsl.g:9136:1: rule__Role_Impl__InterfaceAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Role_Impl__InterfaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9140:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9141:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9141:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9142:3: ( ruleEString )
            {
             before(grammarAccess.getRole_ImplAccess().getInterfaceInterfaceCrossReference_4_0()); 
            // InternalMyDsl.g:9143:3: ( ruleEString )
            // InternalMyDsl.g:9144:4: ruleEString
            {
             before(grammarAccess.getRole_ImplAccess().getInterfaceInterfaceEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRole_ImplAccess().getInterfaceInterfaceEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRole_ImplAccess().getInterfaceInterfaceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__InterfaceAssignment_4"


    // $ANTLR start "rule__Container__NameAssignment_2"
    // InternalMyDsl.g:9155:1: rule__Container__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Container__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9159:1: ( ( ruleEString ) )
            // InternalMyDsl.g:9160:2: ( ruleEString )
            {
            // InternalMyDsl.g:9160:2: ( ruleEString )
            // InternalMyDsl.g:9161:3: ruleEString
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
    // InternalMyDsl.g:9170:1: rule__Link__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Link__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9174:1: ( ( ruleEString ) )
            // InternalMyDsl.g:9175:2: ( ruleEString )
            {
            // InternalMyDsl.g:9175:2: ( ruleEString )
            // InternalMyDsl.g:9176:3: ruleEString
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
    // InternalMyDsl.g:9185:1: rule__Link__ContainerAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Link__ContainerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9189:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9190:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9190:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9191:3: ( ruleEString )
            {
             before(grammarAccess.getLinkAccess().getContainerContainerCrossReference_5_0()); 
            // InternalMyDsl.g:9192:3: ( ruleEString )
            // InternalMyDsl.g:9193:4: ruleEString
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
    // InternalMyDsl.g:9204:1: rule__Link__ContainerAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Link__ContainerAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9208:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9209:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9209:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9210:3: ( ruleEString )
            {
             before(grammarAccess.getLinkAccess().getContainerContainerCrossReference_6_1_0()); 
            // InternalMyDsl.g:9211:3: ( ruleEString )
            // InternalMyDsl.g:9212:4: ruleEString
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


    // $ANTLR start "rule__AllocationContext__ContainerAssignment_3"
    // InternalMyDsl.g:9223:1: rule__AllocationContext__ContainerAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__AllocationContext__ContainerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9227:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9228:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9228:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9229:3: ( ruleEString )
            {
             before(grammarAccess.getAllocationContextAccess().getContainerContainerCrossReference_3_0()); 
            // InternalMyDsl.g:9230:3: ( ruleEString )
            // InternalMyDsl.g:9231:4: ruleEString
            {
             before(grammarAccess.getAllocationContextAccess().getContainerContainerEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAllocationContextAccess().getContainerContainerEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAllocationContextAccess().getContainerContainerCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__ContainerAssignment_3"


    // $ANTLR start "rule__AllocationContext__AssemblycontextAssignment_5"
    // InternalMyDsl.g:9242:1: rule__AllocationContext__AssemblycontextAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__AllocationContext__AssemblycontextAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9246:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9247:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9247:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9248:3: ( ruleEString )
            {
             before(grammarAccess.getAllocationContextAccess().getAssemblycontextAssemblyContextCrossReference_5_0()); 
            // InternalMyDsl.g:9249:3: ( ruleEString )
            // InternalMyDsl.g:9250:4: ruleEString
            {
             before(grammarAccess.getAllocationContextAccess().getAssemblycontextAssemblyContextEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAllocationContextAccess().getAssemblycontextAssemblyContextEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getAllocationContextAccess().getAssemblycontextAssemblyContextCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__AssemblycontextAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000003E8000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x002B804000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000808000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000100008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0004000008000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000000001FF800L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0200000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});

}