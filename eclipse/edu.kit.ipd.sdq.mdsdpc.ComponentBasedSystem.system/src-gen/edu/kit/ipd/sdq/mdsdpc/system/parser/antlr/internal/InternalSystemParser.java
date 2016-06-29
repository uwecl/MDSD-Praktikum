package edu.kit.ipd.sdq.mdsdpc.system.parser.antlr.internal;

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
import edu.kit.ipd.sdq.mdsdpc.system.services.SystemGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSystemParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ComponentBasedSystem'", "'{'", "'providedrole'", "'('", "','", "')'", "'requiredrole'", "'assemblycontext'", "'}'", "'type'", "'assemblyconnector'", "'allocation'", "'repository'", "'environment'", "'AssemblyContext'", "'component'", "'Type'", "'AssemblyConnector'", "'providedAssemblyContext'", "'requiredAssemblyContext'", "'Allocation'", "'allocationcontext'", "'Repository'", "'interface'", "'Environment'", "'container'", "'link'", "'ProvidedRole'", "'RequiredRole'", "'Component'", "'behaviourdescription'", "'service'", "'BehaviourDescription'", "'descriptionelement'", "'Service'", "'correspondingSignatures'", "'CompositeComponent'", "'delegationconnector'", "'DescriptionElement'", "'InternalAction'", "'ExternalCall'", "'Loop'", "'Branch'", "'Signature'", "'returntype'", "'parameter'", "'Parameter'", "'parametertype'", "'ReturnType'", "'ParameterType'", "'Simple'", "'kind'", "'Complex'", "'simple'", "'Void'", "'DelegationConnector'", "'role'", "'Role'", "'Interface'", "'signature'", "'AllocationContext'", "'Container'", "'Link'", "'int'", "'boolean'", "'char'", "'date'", "'double'", "'float'", "'list'", "'long'", "'map'", "'string'"
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
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
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


        public InternalSystemParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSystemParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSystemParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSystem.g"; }



     	private SystemGrammarAccess grammarAccess;

        public InternalSystemParser(TokenStream input, SystemGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ComponentBasedSystem";
       	}

       	@Override
       	protected SystemGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleComponentBasedSystem"
    // InternalSystem.g:65:1: entryRuleComponentBasedSystem returns [EObject current=null] : iv_ruleComponentBasedSystem= ruleComponentBasedSystem EOF ;
    public final EObject entryRuleComponentBasedSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentBasedSystem = null;


        try {
            // InternalSystem.g:65:61: (iv_ruleComponentBasedSystem= ruleComponentBasedSystem EOF )
            // InternalSystem.g:66:2: iv_ruleComponentBasedSystem= ruleComponentBasedSystem EOF
            {
             newCompositeNode(grammarAccess.getComponentBasedSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentBasedSystem=ruleComponentBasedSystem();

            state._fsp--;

             current =iv_ruleComponentBasedSystem; 
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
    // $ANTLR end "entryRuleComponentBasedSystem"


    // $ANTLR start "ruleComponentBasedSystem"
    // InternalSystem.g:72:1: ruleComponentBasedSystem returns [EObject current=null] : (otherlv_0= 'ComponentBasedSystem' otherlv_1= '{' otherlv_2= 'providedrole' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' (otherlv_8= 'requiredrole' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'assemblycontext' otherlv_15= '{' ( (lv_assemblycontext_16_0= ruleAssemblyContext ) ) (otherlv_17= ',' ( (lv_assemblycontext_18_0= ruleAssemblyContext ) ) )* otherlv_19= '}' )? (otherlv_20= 'type' otherlv_21= '{' ( (lv_type_22_0= ruleType ) ) (otherlv_23= ',' ( (lv_type_24_0= ruleType ) ) )* otherlv_25= '}' )? (otherlv_26= 'assemblyconnector' otherlv_27= '{' ( (lv_assemblyconnector_28_0= ruleAssemblyConnector ) ) (otherlv_29= ',' ( (lv_assemblyconnector_30_0= ruleAssemblyConnector ) ) )* otherlv_31= '}' )? otherlv_32= 'allocation' ( (lv_allocation_33_0= ruleAllocation ) ) otherlv_34= 'repository' ( (lv_repository_35_0= ruleRepository ) ) otherlv_36= 'environment' ( (lv_environment_37_0= ruleEnvironment ) ) otherlv_38= '}' ) ;
    public final EObject ruleComponentBasedSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        EObject lv_assemblycontext_16_0 = null;

        EObject lv_assemblycontext_18_0 = null;

        EObject lv_type_22_0 = null;

        EObject lv_type_24_0 = null;

        EObject lv_assemblyconnector_28_0 = null;

        EObject lv_assemblyconnector_30_0 = null;

        EObject lv_allocation_33_0 = null;

        EObject lv_repository_35_0 = null;

        EObject lv_environment_37_0 = null;



        	enterRule();

        try {
            // InternalSystem.g:78:2: ( (otherlv_0= 'ComponentBasedSystem' otherlv_1= '{' otherlv_2= 'providedrole' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' (otherlv_8= 'requiredrole' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'assemblycontext' otherlv_15= '{' ( (lv_assemblycontext_16_0= ruleAssemblyContext ) ) (otherlv_17= ',' ( (lv_assemblycontext_18_0= ruleAssemblyContext ) ) )* otherlv_19= '}' )? (otherlv_20= 'type' otherlv_21= '{' ( (lv_type_22_0= ruleType ) ) (otherlv_23= ',' ( (lv_type_24_0= ruleType ) ) )* otherlv_25= '}' )? (otherlv_26= 'assemblyconnector' otherlv_27= '{' ( (lv_assemblyconnector_28_0= ruleAssemblyConnector ) ) (otherlv_29= ',' ( (lv_assemblyconnector_30_0= ruleAssemblyConnector ) ) )* otherlv_31= '}' )? otherlv_32= 'allocation' ( (lv_allocation_33_0= ruleAllocation ) ) otherlv_34= 'repository' ( (lv_repository_35_0= ruleRepository ) ) otherlv_36= 'environment' ( (lv_environment_37_0= ruleEnvironment ) ) otherlv_38= '}' ) )
            // InternalSystem.g:79:2: (otherlv_0= 'ComponentBasedSystem' otherlv_1= '{' otherlv_2= 'providedrole' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' (otherlv_8= 'requiredrole' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'assemblycontext' otherlv_15= '{' ( (lv_assemblycontext_16_0= ruleAssemblyContext ) ) (otherlv_17= ',' ( (lv_assemblycontext_18_0= ruleAssemblyContext ) ) )* otherlv_19= '}' )? (otherlv_20= 'type' otherlv_21= '{' ( (lv_type_22_0= ruleType ) ) (otherlv_23= ',' ( (lv_type_24_0= ruleType ) ) )* otherlv_25= '}' )? (otherlv_26= 'assemblyconnector' otherlv_27= '{' ( (lv_assemblyconnector_28_0= ruleAssemblyConnector ) ) (otherlv_29= ',' ( (lv_assemblyconnector_30_0= ruleAssemblyConnector ) ) )* otherlv_31= '}' )? otherlv_32= 'allocation' ( (lv_allocation_33_0= ruleAllocation ) ) otherlv_34= 'repository' ( (lv_repository_35_0= ruleRepository ) ) otherlv_36= 'environment' ( (lv_environment_37_0= ruleEnvironment ) ) otherlv_38= '}' )
            {
            // InternalSystem.g:79:2: (otherlv_0= 'ComponentBasedSystem' otherlv_1= '{' otherlv_2= 'providedrole' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' (otherlv_8= 'requiredrole' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'assemblycontext' otherlv_15= '{' ( (lv_assemblycontext_16_0= ruleAssemblyContext ) ) (otherlv_17= ',' ( (lv_assemblycontext_18_0= ruleAssemblyContext ) ) )* otherlv_19= '}' )? (otherlv_20= 'type' otherlv_21= '{' ( (lv_type_22_0= ruleType ) ) (otherlv_23= ',' ( (lv_type_24_0= ruleType ) ) )* otherlv_25= '}' )? (otherlv_26= 'assemblyconnector' otherlv_27= '{' ( (lv_assemblyconnector_28_0= ruleAssemblyConnector ) ) (otherlv_29= ',' ( (lv_assemblyconnector_30_0= ruleAssemblyConnector ) ) )* otherlv_31= '}' )? otherlv_32= 'allocation' ( (lv_allocation_33_0= ruleAllocation ) ) otherlv_34= 'repository' ( (lv_repository_35_0= ruleRepository ) ) otherlv_36= 'environment' ( (lv_environment_37_0= ruleEnvironment ) ) otherlv_38= '}' )
            // InternalSystem.g:80:3: otherlv_0= 'ComponentBasedSystem' otherlv_1= '{' otherlv_2= 'providedrole' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' (otherlv_8= 'requiredrole' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'assemblycontext' otherlv_15= '{' ( (lv_assemblycontext_16_0= ruleAssemblyContext ) ) (otherlv_17= ',' ( (lv_assemblycontext_18_0= ruleAssemblyContext ) ) )* otherlv_19= '}' )? (otherlv_20= 'type' otherlv_21= '{' ( (lv_type_22_0= ruleType ) ) (otherlv_23= ',' ( (lv_type_24_0= ruleType ) ) )* otherlv_25= '}' )? (otherlv_26= 'assemblyconnector' otherlv_27= '{' ( (lv_assemblyconnector_28_0= ruleAssemblyConnector ) ) (otherlv_29= ',' ( (lv_assemblyconnector_30_0= ruleAssemblyConnector ) ) )* otherlv_31= '}' )? otherlv_32= 'allocation' ( (lv_allocation_33_0= ruleAllocation ) ) otherlv_34= 'repository' ( (lv_repository_35_0= ruleRepository ) ) otherlv_36= 'environment' ( (lv_environment_37_0= ruleEnvironment ) ) otherlv_38= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentBasedSystemAccess().getComponentBasedSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentBasedSystemAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentBasedSystemAccess().getProvidedroleKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentBasedSystemAccess().getLeftParenthesisKeyword_3());
            		
            // InternalSystem.g:96:3: ( ( ruleEString ) )
            // InternalSystem.g:97:4: ( ruleEString )
            {
            // InternalSystem.g:97:4: ( ruleEString )
            // InternalSystem.g:98:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentBasedSystemRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getProvidedroleProvidedRoleCrossReference_4_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSystem.g:112:3: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSystem.g:113:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_5, grammarAccess.getComponentBasedSystemAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalSystem.g:117:4: ( ( ruleEString ) )
            	    // InternalSystem.g:118:5: ( ruleEString )
            	    {
            	    // InternalSystem.g:118:5: ( ruleEString )
            	    // InternalSystem.g:119:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getComponentBasedSystemRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getProvidedroleProvidedRoleCrossReference_5_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getComponentBasedSystemAccess().getRightParenthesisKeyword_6());
            		
            // InternalSystem.g:138:3: (otherlv_8= 'requiredrole' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSystem.g:139:4: otherlv_8= 'requiredrole' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getComponentBasedSystemAccess().getRequiredroleKeyword_7_0());
                    			
                    otherlv_9=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getComponentBasedSystemAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalSystem.g:147:4: ( ( ruleEString ) )
                    // InternalSystem.g:148:5: ( ruleEString )
                    {
                    // InternalSystem.g:148:5: ( ruleEString )
                    // InternalSystem.g:149:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentBasedSystemRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getRequiredroleRequiredRoleCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSystem.g:163:4: (otherlv_11= ',' ( ( ruleEString ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalSystem.g:164:5: otherlv_11= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getComponentBasedSystemAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalSystem.g:168:5: ( ( ruleEString ) )
                    	    // InternalSystem.g:169:6: ( ruleEString )
                    	    {
                    	    // InternalSystem.g:169:6: ( ruleEString )
                    	    // InternalSystem.g:170:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getComponentBasedSystemRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getRequiredroleRequiredRoleCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_13, grammarAccess.getComponentBasedSystemAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalSystem.g:190:3: (otherlv_14= 'assemblycontext' otherlv_15= '{' ( (lv_assemblycontext_16_0= ruleAssemblyContext ) ) (otherlv_17= ',' ( (lv_assemblycontext_18_0= ruleAssemblyContext ) ) )* otherlv_19= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSystem.g:191:4: otherlv_14= 'assemblycontext' otherlv_15= '{' ( (lv_assemblycontext_16_0= ruleAssemblyContext ) ) (otherlv_17= ',' ( (lv_assemblycontext_18_0= ruleAssemblyContext ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getComponentBasedSystemAccess().getAssemblycontextKeyword_8_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getComponentBasedSystemAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalSystem.g:199:4: ( (lv_assemblycontext_16_0= ruleAssemblyContext ) )
                    // InternalSystem.g:200:5: (lv_assemblycontext_16_0= ruleAssemblyContext )
                    {
                    // InternalSystem.g:200:5: (lv_assemblycontext_16_0= ruleAssemblyContext )
                    // InternalSystem.g:201:6: lv_assemblycontext_16_0= ruleAssemblyContext
                    {

                    						newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getAssemblycontextAssemblyContextParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_assemblycontext_16_0=ruleAssemblyContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentBasedSystemRule());
                    						}
                    						add(
                    							current,
                    							"assemblycontext",
                    							lv_assemblycontext_16_0,
                    							"edu.kit.ipd.sdq.mdsdpc.system.System.AssemblyContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSystem.g:218:4: (otherlv_17= ',' ( (lv_assemblycontext_18_0= ruleAssemblyContext ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSystem.g:219:5: otherlv_17= ',' ( (lv_assemblycontext_18_0= ruleAssemblyContext ) )
                    	    {
                    	    otherlv_17=(Token)match(input,15,FOLLOW_10); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getComponentBasedSystemAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalSystem.g:223:5: ( (lv_assemblycontext_18_0= ruleAssemblyContext ) )
                    	    // InternalSystem.g:224:6: (lv_assemblycontext_18_0= ruleAssemblyContext )
                    	    {
                    	    // InternalSystem.g:224:6: (lv_assemblycontext_18_0= ruleAssemblyContext )
                    	    // InternalSystem.g:225:7: lv_assemblycontext_18_0= ruleAssemblyContext
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getAssemblycontextAssemblyContextParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_assemblycontext_18_0=ruleAssemblyContext();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentBasedSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"assemblycontext",
                    	    								lv_assemblycontext_18_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.system.System.AssemblyContext");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_19, grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalSystem.g:248:3: (otherlv_20= 'type' otherlv_21= '{' ( (lv_type_22_0= ruleType ) ) (otherlv_23= ',' ( (lv_type_24_0= ruleType ) ) )* otherlv_25= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSystem.g:249:4: otherlv_20= 'type' otherlv_21= '{' ( (lv_type_22_0= ruleType ) ) (otherlv_23= ',' ( (lv_type_24_0= ruleType ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_20, grammarAccess.getComponentBasedSystemAccess().getTypeKeyword_9_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_21, grammarAccess.getComponentBasedSystemAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalSystem.g:257:4: ( (lv_type_22_0= ruleType ) )
                    // InternalSystem.g:258:5: (lv_type_22_0= ruleType )
                    {
                    // InternalSystem.g:258:5: (lv_type_22_0= ruleType )
                    // InternalSystem.g:259:6: lv_type_22_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getTypeTypeParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_type_22_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentBasedSystemRule());
                    						}
                    						add(
                    							current,
                    							"type",
                    							lv_type_22_0,
                    							"edu.kit.ipd.sdq.mdsdpc.system.System.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSystem.g:276:4: (otherlv_23= ',' ( (lv_type_24_0= ruleType ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSystem.g:277:5: otherlv_23= ',' ( (lv_type_24_0= ruleType ) )
                    	    {
                    	    otherlv_23=(Token)match(input,15,FOLLOW_13); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getComponentBasedSystemAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalSystem.g:281:5: ( (lv_type_24_0= ruleType ) )
                    	    // InternalSystem.g:282:6: (lv_type_24_0= ruleType )
                    	    {
                    	    // InternalSystem.g:282:6: (lv_type_24_0= ruleType )
                    	    // InternalSystem.g:283:7: lv_type_24_0= ruleType
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getTypeTypeParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_type_24_0=ruleType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentBasedSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"type",
                    	    								lv_type_24_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.system.System.Type");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_25, grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalSystem.g:306:3: (otherlv_26= 'assemblyconnector' otherlv_27= '{' ( (lv_assemblyconnector_28_0= ruleAssemblyConnector ) ) (otherlv_29= ',' ( (lv_assemblyconnector_30_0= ruleAssemblyConnector ) ) )* otherlv_31= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSystem.g:307:4: otherlv_26= 'assemblyconnector' otherlv_27= '{' ( (lv_assemblyconnector_28_0= ruleAssemblyConnector ) ) (otherlv_29= ',' ( (lv_assemblyconnector_30_0= ruleAssemblyConnector ) ) )* otherlv_31= '}'
                    {
                    otherlv_26=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_26, grammarAccess.getComponentBasedSystemAccess().getAssemblyconnectorKeyword_10_0());
                    			
                    otherlv_27=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_27, grammarAccess.getComponentBasedSystemAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalSystem.g:315:4: ( (lv_assemblyconnector_28_0= ruleAssemblyConnector ) )
                    // InternalSystem.g:316:5: (lv_assemblyconnector_28_0= ruleAssemblyConnector )
                    {
                    // InternalSystem.g:316:5: (lv_assemblyconnector_28_0= ruleAssemblyConnector )
                    // InternalSystem.g:317:6: lv_assemblyconnector_28_0= ruleAssemblyConnector
                    {

                    						newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getAssemblyconnectorAssemblyConnectorParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_assemblyconnector_28_0=ruleAssemblyConnector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentBasedSystemRule());
                    						}
                    						add(
                    							current,
                    							"assemblyconnector",
                    							lv_assemblyconnector_28_0,
                    							"edu.kit.ipd.sdq.mdsdpc.system.System.AssemblyConnector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSystem.g:334:4: (otherlv_29= ',' ( (lv_assemblyconnector_30_0= ruleAssemblyConnector ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==15) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSystem.g:335:5: otherlv_29= ',' ( (lv_assemblyconnector_30_0= ruleAssemblyConnector ) )
                    	    {
                    	    otherlv_29=(Token)match(input,15,FOLLOW_15); 

                    	    					newLeafNode(otherlv_29, grammarAccess.getComponentBasedSystemAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalSystem.g:339:5: ( (lv_assemblyconnector_30_0= ruleAssemblyConnector ) )
                    	    // InternalSystem.g:340:6: (lv_assemblyconnector_30_0= ruleAssemblyConnector )
                    	    {
                    	    // InternalSystem.g:340:6: (lv_assemblyconnector_30_0= ruleAssemblyConnector )
                    	    // InternalSystem.g:341:7: lv_assemblyconnector_30_0= ruleAssemblyConnector
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getAssemblyconnectorAssemblyConnectorParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_assemblyconnector_30_0=ruleAssemblyConnector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentBasedSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"assemblyconnector",
                    	    								lv_assemblyconnector_30_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.system.System.AssemblyConnector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_31=(Token)match(input,19,FOLLOW_16); 

                    				newLeafNode(otherlv_31, grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_32=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_32, grammarAccess.getComponentBasedSystemAccess().getAllocationKeyword_11());
            		
            // InternalSystem.g:368:3: ( (lv_allocation_33_0= ruleAllocation ) )
            // InternalSystem.g:369:4: (lv_allocation_33_0= ruleAllocation )
            {
            // InternalSystem.g:369:4: (lv_allocation_33_0= ruleAllocation )
            // InternalSystem.g:370:5: lv_allocation_33_0= ruleAllocation
            {

            					newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getAllocationAllocationParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_18);
            lv_allocation_33_0=ruleAllocation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentBasedSystemRule());
            					}
            					set(
            						current,
            						"allocation",
            						lv_allocation_33_0,
            						"edu.kit.ipd.sdq.mdsdpc.system.System.Allocation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_34=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_34, grammarAccess.getComponentBasedSystemAccess().getRepositoryKeyword_13());
            		
            // InternalSystem.g:391:3: ( (lv_repository_35_0= ruleRepository ) )
            // InternalSystem.g:392:4: (lv_repository_35_0= ruleRepository )
            {
            // InternalSystem.g:392:4: (lv_repository_35_0= ruleRepository )
            // InternalSystem.g:393:5: lv_repository_35_0= ruleRepository
            {

            					newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getRepositoryRepositoryParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_20);
            lv_repository_35_0=ruleRepository();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentBasedSystemRule());
            					}
            					set(
            						current,
            						"repository",
            						lv_repository_35_0,
            						"edu.kit.ipd.sdq.mdsdpc.system.System.Repository");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_36=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_36, grammarAccess.getComponentBasedSystemAccess().getEnvironmentKeyword_15());
            		
            // InternalSystem.g:414:3: ( (lv_environment_37_0= ruleEnvironment ) )
            // InternalSystem.g:415:4: (lv_environment_37_0= ruleEnvironment )
            {
            // InternalSystem.g:415:4: (lv_environment_37_0= ruleEnvironment )
            // InternalSystem.g:416:5: lv_environment_37_0= ruleEnvironment
            {

            					newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getEnvironmentEnvironmentParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_22);
            lv_environment_37_0=ruleEnvironment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentBasedSystemRule());
            					}
            					set(
            						current,
            						"environment",
            						lv_environment_37_0,
            						"edu.kit.ipd.sdq.mdsdpc.system.System.Environment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_38=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_38, grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_17());
            		

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
    // $ANTLR end "ruleComponentBasedSystem"


    // $ANTLR start "entryRuleType"
    // InternalSystem.g:441:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSystem.g:441:45: (iv_ruleType= ruleType EOF )
            // InternalSystem.g:442:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSystem.g:448:1: ruleType returns [EObject current=null] : (this_Type_Impl_0= ruleType_Impl | this_Simple_1= ruleSimple | this_Complex_2= ruleComplex | this_ParameterType_Impl_3= ruleParameterType_Impl | this_Void_4= ruleVoid | this_ReturnType_Impl_5= ruleReturnType_Impl ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Type_Impl_0 = null;

        EObject this_Simple_1 = null;

        EObject this_Complex_2 = null;

        EObject this_ParameterType_Impl_3 = null;

        EObject this_Void_4 = null;

        EObject this_ReturnType_Impl_5 = null;



        	enterRule();

        try {
            // InternalSystem.g:454:2: ( (this_Type_Impl_0= ruleType_Impl | this_Simple_1= ruleSimple | this_Complex_2= ruleComplex | this_ParameterType_Impl_3= ruleParameterType_Impl | this_Void_4= ruleVoid | this_ReturnType_Impl_5= ruleReturnType_Impl ) )
            // InternalSystem.g:455:2: (this_Type_Impl_0= ruleType_Impl | this_Simple_1= ruleSimple | this_Complex_2= ruleComplex | this_ParameterType_Impl_3= ruleParameterType_Impl | this_Void_4= ruleVoid | this_ReturnType_Impl_5= ruleReturnType_Impl )
            {
            // InternalSystem.g:455:2: (this_Type_Impl_0= ruleType_Impl | this_Simple_1= ruleSimple | this_Complex_2= ruleComplex | this_ParameterType_Impl_3= ruleParameterType_Impl | this_Void_4= ruleVoid | this_ReturnType_Impl_5= ruleReturnType_Impl )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt10=1;
                }
                break;
            case 61:
                {
                alt10=2;
                }
                break;
            case 63:
                {
                alt10=3;
                }
                break;
            case 60:
                {
                alt10=4;
                }
                break;
            case 65:
                {
                alt10=5;
                }
                break;
            case 59:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSystem.g:456:3: this_Type_Impl_0= ruleType_Impl
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getType_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_Impl_0=ruleType_Impl();

                    state._fsp--;


                    			current = this_Type_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSystem.g:465:3: this_Simple_1= ruleSimple
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getSimpleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Simple_1=ruleSimple();

                    state._fsp--;


                    			current = this_Simple_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSystem.g:474:3: this_Complex_2= ruleComplex
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getComplexParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Complex_2=ruleComplex();

                    state._fsp--;


                    			current = this_Complex_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSystem.g:483:3: this_ParameterType_Impl_3= ruleParameterType_Impl
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getParameterType_ImplParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterType_Impl_3=ruleParameterType_Impl();

                    state._fsp--;


                    			current = this_ParameterType_Impl_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSystem.g:492:3: this_Void_4= ruleVoid
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getVoidParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Void_4=ruleVoid();

                    state._fsp--;


                    			current = this_Void_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSystem.g:501:3: this_ReturnType_Impl_5= ruleReturnType_Impl
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getReturnType_ImplParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReturnType_Impl_5=ruleReturnType_Impl();

                    state._fsp--;


                    			current = this_ReturnType_Impl_5;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleComponent"
    // InternalSystem.g:513:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalSystem.g:513:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalSystem.g:514:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalSystem.g:520:1: ruleComponent returns [EObject current=null] : (this_Component_Impl_0= ruleComponent_Impl | this_CompositeComponent_1= ruleCompositeComponent ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Component_Impl_0 = null;

        EObject this_CompositeComponent_1 = null;



        	enterRule();

        try {
            // InternalSystem.g:526:2: ( (this_Component_Impl_0= ruleComponent_Impl | this_CompositeComponent_1= ruleCompositeComponent ) )
            // InternalSystem.g:527:2: (this_Component_Impl_0= ruleComponent_Impl | this_CompositeComponent_1= ruleCompositeComponent )
            {
            // InternalSystem.g:527:2: (this_Component_Impl_0= ruleComponent_Impl | this_CompositeComponent_1= ruleCompositeComponent )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==40) ) {
                alt11=1;
            }
            else if ( (LA11_0==47) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSystem.g:528:3: this_Component_Impl_0= ruleComponent_Impl
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getComponent_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Component_Impl_0=ruleComponent_Impl();

                    state._fsp--;


                    			current = this_Component_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSystem.g:537:3: this_CompositeComponent_1= ruleCompositeComponent
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getCompositeComponentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeComponent_1=ruleCompositeComponent();

                    state._fsp--;


                    			current = this_CompositeComponent_1;
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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleDescriptionElement"
    // InternalSystem.g:549:1: entryRuleDescriptionElement returns [EObject current=null] : iv_ruleDescriptionElement= ruleDescriptionElement EOF ;
    public final EObject entryRuleDescriptionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescriptionElement = null;


        try {
            // InternalSystem.g:549:59: (iv_ruleDescriptionElement= ruleDescriptionElement EOF )
            // InternalSystem.g:550:2: iv_ruleDescriptionElement= ruleDescriptionElement EOF
            {
             newCompositeNode(grammarAccess.getDescriptionElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescriptionElement=ruleDescriptionElement();

            state._fsp--;

             current =iv_ruleDescriptionElement; 
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
    // $ANTLR end "entryRuleDescriptionElement"


    // $ANTLR start "ruleDescriptionElement"
    // InternalSystem.g:556:1: ruleDescriptionElement returns [EObject current=null] : (this_DescriptionElement_Impl_0= ruleDescriptionElement_Impl | this_InternalAction_1= ruleInternalAction | this_ExternalCall_2= ruleExternalCall | this_Loop_3= ruleLoop | this_Branch_4= ruleBranch ) ;
    public final EObject ruleDescriptionElement() throws RecognitionException {
        EObject current = null;

        EObject this_DescriptionElement_Impl_0 = null;

        EObject this_InternalAction_1 = null;

        EObject this_ExternalCall_2 = null;

        EObject this_Loop_3 = null;

        EObject this_Branch_4 = null;



        	enterRule();

        try {
            // InternalSystem.g:562:2: ( (this_DescriptionElement_Impl_0= ruleDescriptionElement_Impl | this_InternalAction_1= ruleInternalAction | this_ExternalCall_2= ruleExternalCall | this_Loop_3= ruleLoop | this_Branch_4= ruleBranch ) )
            // InternalSystem.g:563:2: (this_DescriptionElement_Impl_0= ruleDescriptionElement_Impl | this_InternalAction_1= ruleInternalAction | this_ExternalCall_2= ruleExternalCall | this_Loop_3= ruleLoop | this_Branch_4= ruleBranch )
            {
            // InternalSystem.g:563:2: (this_DescriptionElement_Impl_0= ruleDescriptionElement_Impl | this_InternalAction_1= ruleInternalAction | this_ExternalCall_2= ruleExternalCall | this_Loop_3= ruleLoop | this_Branch_4= ruleBranch )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt12=1;
                }
                break;
            case 50:
                {
                alt12=2;
                }
                break;
            case 51:
                {
                alt12=3;
                }
                break;
            case 52:
                {
                alt12=4;
                }
                break;
            case 53:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalSystem.g:564:3: this_DescriptionElement_Impl_0= ruleDescriptionElement_Impl
                    {

                    			newCompositeNode(grammarAccess.getDescriptionElementAccess().getDescriptionElement_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DescriptionElement_Impl_0=ruleDescriptionElement_Impl();

                    state._fsp--;


                    			current = this_DescriptionElement_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSystem.g:573:3: this_InternalAction_1= ruleInternalAction
                    {

                    			newCompositeNode(grammarAccess.getDescriptionElementAccess().getInternalActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InternalAction_1=ruleInternalAction();

                    state._fsp--;


                    			current = this_InternalAction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSystem.g:582:3: this_ExternalCall_2= ruleExternalCall
                    {

                    			newCompositeNode(grammarAccess.getDescriptionElementAccess().getExternalCallParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalCall_2=ruleExternalCall();

                    state._fsp--;


                    			current = this_ExternalCall_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSystem.g:591:3: this_Loop_3= ruleLoop
                    {

                    			newCompositeNode(grammarAccess.getDescriptionElementAccess().getLoopParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Loop_3=ruleLoop();

                    state._fsp--;


                    			current = this_Loop_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSystem.g:600:3: this_Branch_4= ruleBranch
                    {

                    			newCompositeNode(grammarAccess.getDescriptionElementAccess().getBranchParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Branch_4=ruleBranch();

                    state._fsp--;


                    			current = this_Branch_4;
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
    // $ANTLR end "ruleDescriptionElement"


    // $ANTLR start "entryRuleAssemblyContext"
    // InternalSystem.g:612:1: entryRuleAssemblyContext returns [EObject current=null] : iv_ruleAssemblyContext= ruleAssemblyContext EOF ;
    public final EObject entryRuleAssemblyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyContext = null;


        try {
            // InternalSystem.g:612:56: (iv_ruleAssemblyContext= ruleAssemblyContext EOF )
            // InternalSystem.g:613:2: iv_ruleAssemblyContext= ruleAssemblyContext EOF
            {
             newCompositeNode(grammarAccess.getAssemblyContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssemblyContext=ruleAssemblyContext();

            state._fsp--;

             current =iv_ruleAssemblyContext; 
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
    // $ANTLR end "entryRuleAssemblyContext"


    // $ANTLR start "ruleAssemblyContext"
    // InternalSystem.g:619:1: ruleAssemblyContext returns [EObject current=null] : (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleAssemblyContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSystem.g:625:2: ( (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalSystem.g:626:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalSystem.g:626:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalSystem.g:627:3: otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyContextAccess().getAssemblyContextKeyword_0());
            		
            // InternalSystem.g:631:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSystem.g:632:4: (lv_name_1_0= ruleEString )
            {
            // InternalSystem.g:632:4: (lv_name_1_0= ruleEString )
            // InternalSystem.g:633:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssemblyContextAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssemblyContextRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.kit.ipd.sdq.mdsdpc.system.System.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getAssemblyContextAccess().getComponentKeyword_3());
            		
            // InternalSystem.g:658:3: ( ( ruleEString ) )
            // InternalSystem.g:659:4: ( ruleEString )
            {
            // InternalSystem.g:659:4: ( ruleEString )
            // InternalSystem.g:660:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyContextAccess().getComponentComponentCrossReference_4_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleAssemblyContext"


    // $ANTLR start "entryRuleType_Impl"
    // InternalSystem.g:682:1: entryRuleType_Impl returns [EObject current=null] : iv_ruleType_Impl= ruleType_Impl EOF ;
    public final EObject entryRuleType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType_Impl = null;


        try {
            // InternalSystem.g:682:50: (iv_ruleType_Impl= ruleType_Impl EOF )
            // InternalSystem.g:683:2: iv_ruleType_Impl= ruleType_Impl EOF
            {
             newCompositeNode(grammarAccess.getType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType_Impl=ruleType_Impl();

            state._fsp--;

             current =iv_ruleType_Impl; 
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
    // $ANTLR end "entryRuleType_Impl"


    // $ANTLR start "ruleType_Impl"
    // InternalSystem.g:689:1: ruleType_Impl returns [EObject current=null] : ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSystem.g:695:2: ( ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalSystem.g:696:2: ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalSystem.g:696:2: ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) )
            // InternalSystem.g:697:3: () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalSystem.g:697:3: ()
            // InternalSystem.g:698:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getType_ImplAccess().getTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getType_ImplAccess().getTypeKeyword_1());
            		
            // InternalSystem.g:708:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSystem.g:709:4: (lv_name_2_0= ruleEString )
            {
            // InternalSystem.g:709:4: (lv_name_2_0= ruleEString )
            // InternalSystem.g:710:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getType_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getType_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"edu.kit.ipd.sdq.mdsdpc.system.System.EString");
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
    // $ANTLR end "ruleType_Impl"


    // $ANTLR start "entryRuleAssemblyConnector"
    // InternalSystem.g:731:1: entryRuleAssemblyConnector returns [EObject current=null] : iv_ruleAssemblyConnector= ruleAssemblyConnector EOF ;
    public final EObject entryRuleAssemblyConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyConnector = null;


        try {
            // InternalSystem.g:731:58: (iv_ruleAssemblyConnector= ruleAssemblyConnector EOF )
            // InternalSystem.g:732:2: iv_ruleAssemblyConnector= ruleAssemblyConnector EOF
            {
             newCompositeNode(grammarAccess.getAssemblyConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssemblyConnector=ruleAssemblyConnector();

            state._fsp--;

             current =iv_ruleAssemblyConnector; 
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
    // $ANTLR end "entryRuleAssemblyConnector"


    // $ANTLR start "ruleAssemblyConnector"
    // InternalSystem.g:738:1: ruleAssemblyConnector returns [EObject current=null] : (otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedrole' ( ( ruleEString ) ) otherlv_5= 'requiredrole' ( ( ruleEString ) ) otherlv_7= 'providedAssemblyContext' ( ( ruleEString ) ) otherlv_9= 'requiredAssemblyContext' ( ( ruleEString ) ) otherlv_11= '}' ) ;
    public final EObject ruleAssemblyConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSystem.g:744:2: ( (otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedrole' ( ( ruleEString ) ) otherlv_5= 'requiredrole' ( ( ruleEString ) ) otherlv_7= 'providedAssemblyContext' ( ( ruleEString ) ) otherlv_9= 'requiredAssemblyContext' ( ( ruleEString ) ) otherlv_11= '}' ) )
            // InternalSystem.g:745:2: (otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedrole' ( ( ruleEString ) ) otherlv_5= 'requiredrole' ( ( ruleEString ) ) otherlv_7= 'providedAssemblyContext' ( ( ruleEString ) ) otherlv_9= 'requiredAssemblyContext' ( ( ruleEString ) ) otherlv_11= '}' )
            {
            // InternalSystem.g:745:2: (otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedrole' ( ( ruleEString ) ) otherlv_5= 'requiredrole' ( ( ruleEString ) ) otherlv_7= 'providedAssemblyContext' ( ( ruleEString ) ) otherlv_9= 'requiredAssemblyContext' ( ( ruleEString ) ) otherlv_11= '}' )
            // InternalSystem.g:746:3: otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedrole' ( ( ruleEString ) ) otherlv_5= 'requiredrole' ( ( ruleEString ) ) otherlv_7= 'providedAssemblyContext' ( ( ruleEString ) ) otherlv_9= 'requiredAssemblyContext' ( ( ruleEString ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyConnectorAccess().getAssemblyConnectorKeyword_0());
            		
            // InternalSystem.g:750:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSystem.g:751:4: (lv_name_1_0= ruleEString )
            {
            // InternalSystem.g:751:4: (lv_name_1_0= ruleEString )
            // InternalSystem.g:752:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssemblyConnectorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.kit.ipd.sdq.mdsdpc.system.System.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyConnectorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getAssemblyConnectorAccess().getProvidedroleKeyword_3());
            		
            // InternalSystem.g:777:3: ( ( ruleEString ) )
            // InternalSystem.g:778:4: ( ruleEString )
            {
            // InternalSystem.g:778:4: ( ruleEString )
            // InternalSystem.g:779:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getProvidedroleProvidedRoleCrossReference_4_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getAssemblyConnectorAccess().getRequiredroleKeyword_5());
            		
            // InternalSystem.g:797:3: ( ( ruleEString ) )
            // InternalSystem.g:798:4: ( ruleEString )
            {
            // InternalSystem.g:798:4: ( ruleEString )
            // InternalSystem.g:799:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getRequiredroleRequiredRoleCrossReference_6_0());
            				
            pushFollow(FOLLOW_25);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getAssemblyConnectorAccess().getProvidedAssemblyContextKeyword_7());
            		
            // InternalSystem.g:817:3: ( ( ruleEString ) )
            // InternalSystem.g:818:4: ( ruleEString )
            {
            // InternalSystem.g:818:4: ( ruleEString )
            // InternalSystem.g:819:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getProvidedAssemblyContextAssemblyContextCrossReference_8_0());
            				
            pushFollow(FOLLOW_26);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getAssemblyConnectorAccess().getRequiredAssemblyContextKeyword_9());
            		
            // InternalSystem.g:837:3: ( ( ruleEString ) )
            // InternalSystem.g:838:4: ( ruleEString )
            {
            // InternalSystem.g:838:4: ( ruleEString )
            // InternalSystem.g:839:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getRequiredAssemblyContextAssemblyContextCrossReference_10_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getAssemblyConnectorAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleAssemblyConnector"


    // $ANTLR start "entryRuleAllocation"
    // InternalSystem.g:861:1: entryRuleAllocation returns [EObject current=null] : iv_ruleAllocation= ruleAllocation EOF ;
    public final EObject entryRuleAllocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocation = null;


        try {
            // InternalSystem.g:861:51: (iv_ruleAllocation= ruleAllocation EOF )
            // InternalSystem.g:862:2: iv_ruleAllocation= ruleAllocation EOF
            {
             newCompositeNode(grammarAccess.getAllocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllocation=ruleAllocation();

            state._fsp--;

             current =iv_ruleAllocation; 
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
    // $ANTLR end "entryRuleAllocation"


    // $ANTLR start "ruleAllocation"
    // InternalSystem.g:868:1: ruleAllocation returns [EObject current=null] : (otherlv_0= 'Allocation' otherlv_1= '{' otherlv_2= 'allocationcontext' otherlv_3= '{' ( (lv_allocationcontext_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationcontext_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleAllocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_allocationcontext_4_0 = null;

        EObject lv_allocationcontext_6_0 = null;



        	enterRule();

        try {
            // InternalSystem.g:874:2: ( (otherlv_0= 'Allocation' otherlv_1= '{' otherlv_2= 'allocationcontext' otherlv_3= '{' ( (lv_allocationcontext_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationcontext_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalSystem.g:875:2: (otherlv_0= 'Allocation' otherlv_1= '{' otherlv_2= 'allocationcontext' otherlv_3= '{' ( (lv_allocationcontext_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationcontext_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalSystem.g:875:2: (otherlv_0= 'Allocation' otherlv_1= '{' otherlv_2= 'allocationcontext' otherlv_3= '{' ( (lv_allocationcontext_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationcontext_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalSystem.g:876:3: otherlv_0= 'Allocation' otherlv_1= '{' otherlv_2= 'allocationcontext' otherlv_3= '{' ( (lv_allocationcontext_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationcontext_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAllocationAccess().getAllocationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getAllocationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAllocationAccess().getAllocationcontextKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getAllocationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSystem.g:892:3: ( (lv_allocationcontext_4_0= ruleAllocationContext ) )
            // InternalSystem.g:893:4: (lv_allocationcontext_4_0= ruleAllocationContext )
            {
            // InternalSystem.g:893:4: (lv_allocationcontext_4_0= ruleAllocationContext )
            // InternalSystem.g:894:5: lv_allocationcontext_4_0= ruleAllocationContext
            {

            					newCompositeNode(grammarAccess.getAllocationAccess().getAllocationcontextAllocationContextParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_allocationcontext_4_0=ruleAllocationContext();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAllocationRule());
            					}
            					add(
            						current,
            						"allocationcontext",
            						lv_allocationcontext_4_0,
            						"edu.kit.ipd.sdq.mdsdpc.system.System.AllocationContext");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSystem.g:911:3: (otherlv_5= ',' ( (lv_allocationcontext_6_0= ruleAllocationContext ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSystem.g:912:4: otherlv_5= ',' ( (lv_allocationcontext_6_0= ruleAllocationContext ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_28); 

            	    				newLeafNode(otherlv_5, grammarAccess.getAllocationAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalSystem.g:916:4: ( (lv_allocationcontext_6_0= ruleAllocationContext ) )
            	    // InternalSystem.g:917:5: (lv_allocationcontext_6_0= ruleAllocationContext )
            	    {
            	    // InternalSystem.g:917:5: (lv_allocationcontext_6_0= ruleAllocationContext )
            	    // InternalSystem.g:918:6: lv_allocationcontext_6_0= ruleAllocationContext
            	    {

            	    						newCompositeNode(grammarAccess.getAllocationAccess().getAllocationcontextAllocationContextParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_allocationcontext_6_0=ruleAllocationContext();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAllocationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"allocationcontext",
            	    							lv_allocationcontext_6_0,
            	    							"edu.kit.ipd.sdq.mdsdpc.system.System.AllocationContext");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_22); 

            			newLeafNode(otherlv_7, grammarAccess.getAllocationAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAllocationAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleAllocation"


    // $ANTLR start "entryRuleRepository"
    // InternalSystem.g:948:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // InternalSystem.g:948:51: (iv_ruleRepository= ruleRepository EOF )
            // InternalSystem.g:949:2: iv_ruleRepository= ruleRepository EOF
            {
             newCompositeNode(grammarAccess.getRepositoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepository=ruleRepository();

            state._fsp--;

             current =iv_ruleRepository; 
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
    // $ANTLR end "entryRuleRepository"


    // $ANTLR start "ruleRepository"
    // InternalSystem.g:955:1: ruleRepository returns [EObject current=null] : ( () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'interface' otherlv_4= '{' ( (lv_interface_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interface_7_0= ruleInterface ) ) )* otherlv_8= '}' )? (otherlv_9= 'component' otherlv_10= '{' ( (lv_component_11_0= ruleComponent ) ) (otherlv_12= ',' ( (lv_component_13_0= ruleComponent ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_interface_5_0 = null;

        EObject lv_interface_7_0 = null;

        EObject lv_component_11_0 = null;

        EObject lv_component_13_0 = null;



        	enterRule();

        try {
            // InternalSystem.g:961:2: ( ( () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'interface' otherlv_4= '{' ( (lv_interface_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interface_7_0= ruleInterface ) ) )* otherlv_8= '}' )? (otherlv_9= 'component' otherlv_10= '{' ( (lv_component_11_0= ruleComponent ) ) (otherlv_12= ',' ( (lv_component_13_0= ruleComponent ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalSystem.g:962:2: ( () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'interface' otherlv_4= '{' ( (lv_interface_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interface_7_0= ruleInterface ) ) )* otherlv_8= '}' )? (otherlv_9= 'component' otherlv_10= '{' ( (lv_component_11_0= ruleComponent ) ) (otherlv_12= ',' ( (lv_component_13_0= ruleComponent ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalSystem.g:962:2: ( () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'interface' otherlv_4= '{' ( (lv_interface_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interface_7_0= ruleInterface ) ) )* otherlv_8= '}' )? (otherlv_9= 'component' otherlv_10= '{' ( (lv_component_11_0= ruleComponent ) ) (otherlv_12= ',' ( (lv_component_13_0= ruleComponent ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalSystem.g:963:3: () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'interface' otherlv_4= '{' ( (lv_interface_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interface_7_0= ruleInterface ) ) )* otherlv_8= '}' )? (otherlv_9= 'component' otherlv_10= '{' ( (lv_component_11_0= ruleComponent ) ) (otherlv_12= ',' ( (lv_component_13_0= ruleComponent ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalSystem.g:963:3: ()
            // InternalSystem.g:964:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRepositoryAccess().getRepositoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRepositoryAccess().getRepositoryKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSystem.g:978:3: (otherlv_3= 'interface' otherlv_4= '{' ( (lv_interface_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interface_7_0= ruleInterface ) ) )* otherlv_8= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSystem.g:979:4: otherlv_3= 'interface' otherlv_4= '{' ( (lv_interface_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interface_7_0= ruleInterface ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRepositoryAccess().getInterfaceKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_30); 

                    				newLeafNode(otherlv_4, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSystem.g:987:4: ( (lv_interface_5_0= ruleInterface ) )
                    // InternalSystem.g:988:5: (lv_interface_5_0= ruleInterface )
                    {
                    // InternalSystem.g:988:5: (lv_interface_5_0= ruleInterface )
                    // InternalSystem.g:989:6: lv_interface_5_0= ruleInterface
                    {

                    						newCompositeNode(grammarAccess.getRepositoryAccess().getInterfaceInterfaceParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_interface_5_0=ruleInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    						}
                    						add(
                    							current,
                    							"interface",
                    							lv_interface_5_0,
                    							"edu.kit.ipd.sdq.mdsdpc.system.System.Interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSystem.g:1006:4: (otherlv_6= ',' ( (lv_interface_7_0= ruleInterface ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==15) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalSystem.g:1007:5: otherlv_6= ',' ( (lv_interface_7_0= ruleInterface ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_30); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRepositoryAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSystem.g:1011:5: ( (lv_interface_7_0= ruleInterface ) )
                    	    // InternalSystem.g:1012:6: (lv_interface_7_0= ruleInterface )
                    	    {
                    	    // InternalSystem.g:1012:6: (lv_interface_7_0= ruleInterface )
                    	    // InternalSystem.g:1013:7: lv_interface_7_0= ruleInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepositoryAccess().getInterfaceInterfaceParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_interface_7_0=ruleInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interface",
                    	    								lv_interface_7_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.system.System.Interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,19,FOLLOW_31); 

                    				newLeafNode(otherlv_8, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalSystem.g:1036:3: (otherlv_9= 'component' otherlv_10= '{' ( (lv_component_11_0= ruleComponent ) ) (otherlv_12= ',' ( (lv_component_13_0= ruleComponent ) ) )* otherlv_14= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSystem.g:1037:4: otherlv_9= 'component' otherlv_10= '{' ( (lv_component_11_0= ruleComponent ) ) (otherlv_12= ',' ( (lv_component_13_0= ruleComponent ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getRepositoryAccess().getComponentKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_32); 

                    				newLeafNode(otherlv_10, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSystem.g:1045:4: ( (lv_component_11_0= ruleComponent ) )
                    // InternalSystem.g:1046:5: (lv_component_11_0= ruleComponent )
                    {
                    // InternalSystem.g:1046:5: (lv_component_11_0= ruleComponent )
                    // InternalSystem.g:1047:6: lv_component_11_0= ruleComponent
                    {

                    						newCompositeNode(grammarAccess.getRepositoryAccess().getComponentComponentParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_component_11_0=ruleComponent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    						}
                    						add(
                    							current,
                    							"component",
                    							lv_component_11_0,
                    							"edu.kit.ipd.sdq.mdsdpc.system.System.Component");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSystem.g:1064:4: (otherlv_12= ',' ( (lv_component_13_0= ruleComponent ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==15) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalSystem.g:1065:5: otherlv_12= ',' ( (lv_component_13_0= ruleComponent ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FOLLOW_32); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getRepositoryAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSystem.g:1069:5: ( (lv_component_13_0= ruleComponent ) )
                    	    // InternalSystem.g:1070:6: (lv_component_13_0= ruleComponent )
                    	    {
                    	    // InternalSystem.g:1070:6: (lv_component_13_0= ruleComponent )
                    	    // InternalSystem.g:1071:7: lv_component_13_0= ruleComponent
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepositoryAccess().getComponentComponentParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_component_13_0=ruleComponent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"component",
                    	    								lv_component_13_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.system.System.Component");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,19,FOLLOW_22); 

                    				newLeafNode(otherlv_14, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRepository"


    // $ANTLR start "entryRuleEnvironment"
    // InternalSystem.g:1102:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalSystem.g:1102:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalSystem.g:1103:2: iv_ruleEnvironment= ruleEnvironment EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironment=ruleEnvironment();

            state._fsp--;

             current =iv_ruleEnvironment; 
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
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // InternalSystem.g:1109:1: ruleEnvironment returns [EObject current=null] : ( () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'container' otherlv_4= '{' ( (lv_container_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_container_7_0= ruleContainer ) ) )* otherlv_8= '}' )? (otherlv_9= 'link' otherlv_10= '{' ( (lv_link_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_link_13_0= ruleLink ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_container_5_0 = null;

        EObject lv_container_7_0 = null;

        EObject lv_link_11_0 = null;

        EObject lv_link_13_0 = null;



        	enterRule();

        try {
            // InternalSystem.g:1115:2: ( ( () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'container' otherlv_4= '{' ( (lv_container_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_container_7_0= ruleContainer ) ) )* otherlv_8= '}' )? (otherlv_9= 'link' otherlv_10= '{' ( (lv_link_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_link_13_0= ruleLink ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalSystem.g:1116:2: ( () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'container' otherlv_4= '{' ( (lv_container_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_container_7_0= ruleContainer ) ) )* otherlv_8= '}' )? (otherlv_9= 'link' otherlv_10= '{' ( (lv_link_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_link_13_0= ruleLink ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalSystem.g:1116:2: ( () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'container' otherlv_4= '{' ( (lv_container_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_container_7_0= ruleContainer ) ) )* otherlv_8= '}' )? (otherlv_9= 'link' otherlv_10= '{' ( (lv_link_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_link_13_0= ruleLink ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalSystem.g:1117:3: () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'container' otherlv_4= '{' ( (lv_container_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_container_7_0= ruleContainer ) ) )* otherlv_8= '}' )? (otherlv_9= 'link' otherlv_10= '{' ( (lv_link_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_link_13_0= ruleLink ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalSystem.g:1117:3: ()
            // InternalSystem.g:1118:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentAccess().getEnvironmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSystem.g:1132:3: (otherlv_3= 'container' otherlv_4= '{' ( (lv_container_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_container_7_0= ruleContainer ) ) )* otherlv_8= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSystem.g:1133:4: otherlv_3= 'container' otherlv_4= '{' ( (lv_container_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_container_7_0= ruleContainer ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getContainerKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_34); 

                    				newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSystem.g:1141:4: ( (lv_container_5_0= ruleContainer ) )
                    // InternalSystem.g:1142:5: (lv_container_5_0= ruleContainer )
                    {
                    // InternalSystem.g:1142:5: (lv_container_5_0= ruleContainer )
                    // InternalSystem.g:1143:6: lv_container_5_0= ruleContainer
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentAccess().getContainerContainerParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_container_5_0=ruleContainer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    						}
                    						add(
                    							current,
                    							"container",
                    							lv_container_5_0,
                    							"edu.kit.ipd.sdq.mdsdpc.system.System.Container");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSystem.g:1160:4: (otherlv_6= ',' ( (lv_container_7_0= ruleContainer ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==15) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalSystem.g:1161:5: otherlv_6= ',' ( (lv_container_7_0= ruleContainer ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_34); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getEnvironmentAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSystem.g:1165:5: ( (lv_container_7_0= ruleContainer ) )
                    	    // InternalSystem.g:1166:6: (lv_container_7_0= ruleContainer )
                    	    {
                    	    // InternalSystem.g:1166:6: (lv_container_7_0= ruleContainer )
                    	    // InternalSystem.g:1167:7: lv_container_7_0= ruleContainer
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnvironmentAccess().getContainerContainerParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_container_7_0=ruleContainer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"container",
                    	    								lv_container_7_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.system.System.Container");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,19,FOLLOW_35); 

                    				newLeafNode(otherlv_8, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalSystem.g:1190:3: (otherlv_9= 'link' otherlv_10= '{' ( (lv_link_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_link_13_0= ruleLink ) ) )* otherlv_14= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSystem.g:1191:4: otherlv_9= 'link' otherlv_10= '{' ( (lv_link_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_link_13_0= ruleLink ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getEnvironmentAccess().getLinkKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_36); 

                    				newLeafNode(otherlv_10, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSystem.g:1199:4: ( (lv_link_11_0= ruleLink ) )
                    // InternalSystem.g:1200:5: (lv_link_11_0= ruleLink )
                    {
                    // InternalSystem.g:1200:5: (lv_link_11_0= ruleLink )
                    // InternalSystem.g:1201:6: lv_link_11_0= ruleLink
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentAccess().getLinkLinkParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_link_11_0=ruleLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    						}
                    						add(
                    							current,
                    							"link",
                    							lv_link_11_0,
                    							"edu.kit.ipd.sdq.mdsdpc.system.System.Link");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSystem.g:1218:4: (otherlv_12= ',' ( (lv_link_13_0= ruleLink ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==15) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalSystem.g:1219:5: otherlv_12= ',' ( (lv_link_13_0= ruleLink ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FOLLOW_36); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getEnvironmentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSystem.g:1223:5: ( (lv_link_13_0= ruleLink ) )
                    	    // InternalSystem.g:1224:6: (lv_link_13_0= ruleLink )
                    	    {
                    	    // InternalSystem.g:1224:6: (lv_link_13_0= ruleLink )
                    	    // InternalSystem.g:1225:7: lv_link_13_0= ruleLink
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnvironmentAccess().getLinkLinkParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_link_13_0=ruleLink();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"link",
                    	    								lv_link_13_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.system.System.Link");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,19,FOLLOW_22); 

                    				newLeafNode(otherlv_14, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleProvidedRole"
    // InternalSystem.g:1256:1: entryRuleProvidedRole returns [EObject current=null] : iv_ruleProvidedRole= ruleProvidedRole EOF ;
    public final EObject entryRuleProvidedRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedRole = null;


        try {
            // InternalSystem.g:1256:53: (iv_ruleProvidedRole= ruleProvidedRole EOF )
            // InternalSystem.g:1257:2: iv_ruleProvidedRole= ruleProvidedRole EOF
            {
             newCompositeNode(grammarAccess.getProvidedRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProvidedRole=ruleProvidedRole();

            state._fsp--;

             current =iv_ruleProvidedRole; 
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
    // $ANTLR end "entryRuleProvidedRole"


    // $ANTLR start "ruleProvidedRole"
    // InternalSystem.g:1263:1: ruleProvidedRole returns [EObject current=null] : (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleProvidedRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSystem.g:1269:2: ( (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalSystem.g:1270:2: (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalSystem.g:1270:2: (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalSystem.g:1271:3: otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getProvidedRoleAccess().getProvidedRoleKeyword_0());
            		
            // InternalSystem.g:1275:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSystem.g:1276:4: (lv_name_1_0= ruleEString )
            {
            // InternalSystem.g:1276:4: (lv_name_1_0= ruleEString )
            // InternalSystem.g:1277:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProvidedRoleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProvidedRoleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.kit.ipd.sdq.mdsdpc.system.System.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getProvidedRoleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,34,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getProvidedRoleAccess().getInterfaceKeyword_3());
            		
            // InternalSystem.g:1302:3: ( ( ruleEString ) )
            // InternalSystem.g:1303:4: ( ruleEString )
            {
            // InternalSystem.g:1303:4: ( ruleEString )
            // InternalSystem.g:1304:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProvidedRoleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProvidedRoleAccess().getInterfaceInterfaceCrossReference_4_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProvidedRoleAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleProvidedRole"


    // $ANTLR start "entryRuleRequiredRole"
    // InternalSystem.g:1326:1: entryRuleRequiredRole returns [EObject current=null] : iv_ruleRequiredRole= ruleRequiredRole EOF ;
    public final EObject entryRuleRequiredRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredRole = null;


        try {
            // InternalSystem.g:1326:53: (iv_ruleRequiredRole= ruleRequiredRole EOF )
            // InternalSystem.g:1327:2: iv_ruleRequiredRole= ruleRequiredRole EOF
            {
             newCompositeNode(grammarAccess.getRequiredRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequiredRole=ruleRequiredRole();

            state._fsp--;

             current =iv_ruleRequiredRole; 
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
    // $ANTLR end "entryRuleRequiredRole"


    // $ANTLR start "ruleRequiredRole"
    // InternalSystem.g:1333:1: ruleRequiredRole returns [EObject current=null] : (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleRequiredRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSystem.g:1339:2: ( (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalSystem.g:1340:2: (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalSystem.g:1340:2: (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalSystem.g:1341:3: otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRequiredRoleAccess().getRequiredRoleKeyword_0());
            		
            // InternalSystem.g:1345:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSystem.g:1346:4: (lv_name_1_0= ruleEString )
            {
            // InternalSystem.g:1346:4: (lv_name_1_0= ruleEString )
            // InternalSystem.g:1347:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequiredRoleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequiredRoleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.kit.ipd.sdq.mdsdpc.system.System.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getRequiredRoleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,34,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getRequiredRoleAccess().getInterfaceKeyword_3());
            		
            // InternalSystem.g:1372:3: ( ( ruleEString ) )
            // InternalSystem.g:1373:4: ( ruleEString )
            {
            // InternalSystem.g:1373:4: ( ruleEString )
            // InternalSystem.g:1374:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequiredRoleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRequiredRoleAccess().getInterfaceInterfaceCrossReference_4_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRequiredRoleAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRequiredRole"


    // $ANTLR start "entryRuleEString"
    // InternalSystem.g:1396:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSystem.g:1396:47: (iv_ruleEString= ruleEString EOF )
            // InternalSystem.g:1397:2: iv_ruleEString= ruleEString EOF
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
    // InternalSystem.g:1403:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSystem.g:1409:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSystem.g:1410:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSystem.g:1410:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalSystem.g:1411:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSystem.g:1419:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleComponent_Impl"
    // InternalSystem.g:1430:1: entryRuleComponent_Impl returns [EObject current=null] : iv_ruleComponent_Impl= ruleComponent_Impl EOF ;
    public final EObject entryRuleComponent_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent_Impl = null;


        try {
            // InternalSystem.g:1430:55: (iv_ruleComponent_Impl= ruleComponent_Impl EOF )
            // InternalSystem.g:1431:2: iv_ruleComponent_Impl= ruleComponent_Impl EOF
            {
             newCompositeNode(grammarAccess.getComponent_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent_Impl=ruleComponent_Impl();

            state._fsp--;

             current =iv_ruleComponent_Impl; 
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
    // $ANTLR end "entryRuleComponent_Impl"


    // $ANTLR start "ruleComponent_Impl"
    // InternalSystem.g:1437:1: ruleComponent_Impl returns [EObject current=null] : (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= '}' ) ;
    public final EObject ruleComponent_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_behaviourdescription_5_0 = null;

        EObject lv_behaviourdescription_7_0 = null;

        EObject lv_service_11_0 = null;

        EObject lv_service_13_0 = null;

        EObject lv_requiredrole_17_0 = null;

        EObject lv_requiredrole_19_0 = null;

        EObject lv_providedrole_22_0 = null;



        	enterRule();

        try {
            // InternalSystem.g:1443:2: ( (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= '}' ) )
            // InternalSystem.g:1444:2: (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= '}' )
            {
            // InternalSystem.g:1444:2: (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= '}' )
            // InternalSystem.g:1445:3: otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getComponent_ImplAccess().getComponentKeyword_0());
            		
            // InternalSystem.g:1449:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSystem.g:1450:4: (lv_name_1_0= ruleEString )
            {
            // InternalSystem.g:1450:4: (lv_name_1_0= ruleEString )
            // InternalSystem.g:1451:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComponent_ImplAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.kit.ipd.sdq.mdsdpc.system.System.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSystem.g:1472:3: (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSystem.g:1473:4: otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_39); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSystem.g:1481:4: ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) )
                    // InternalSystem.g:1482:5: (lv_behaviourdescription_5_0= ruleBehaviourDescription )
                    {
                    // InternalSystem.g:1482:5: (lv_behaviourdescription_5_0= ruleBehaviourDescription )
                    // InternalSystem.g:1483:6: lv_behaviourdescription_5_0= ruleBehaviourDescription
                    {

                    						newCompositeNode(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionBehaviourDescriptionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_behaviourdescription_5_0=ruleBehaviourDescription();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
                    						}
                    						add(
                    							current,
                    							"behaviourdescription",
                    							lv_behaviourdescription_5_0,
                    							"edu.kit.ipd.sdq.mdsdpc.system.System.BehaviourDescription");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSystem.g:1500:4: (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==15) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalSystem.g:1501:5: otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_39); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getComponent_ImplAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSystem.g:1505:5: ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) )
                    	    // InternalSystem.g:1506:6: (lv_behaviourdescription_7_0= ruleBehaviourDescription )
                    	    {
                    	    // InternalSystem.g:1506:6: (lv_behaviourdescription_7_0= ruleBehaviourDescription )
                    	    // InternalSystem.g:1507:7: lv_behaviourdescription_7_0= ruleBehaviourDescription
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionBehaviourDescriptionParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_behaviourdescription_7_0=ruleBehaviourDescription();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"behaviourdescription",
                    	    								lv_behaviourdescription_7_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.system.System.BehaviourDescription");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,19,FOLLOW_40); 

                    				newLeafNode(otherlv_8, grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getComponent_ImplAccess().getServiceKeyword_4());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_10, grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalSystem.g:1538:3: ( (lv_service_11_0= ruleService ) )
            // InternalSystem.g:1539:4: (lv_service_11_0= ruleService )
            {
            // InternalSystem.g:1539:4: (lv_service_11_0= ruleService )
            // InternalSystem.g:1540:5: lv_service_11_0= ruleService
            {

            					newCompositeNode(grammarAccess.getComponent_ImplAccess().getServiceServiceParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
            lv_service_11_0=ruleService();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
            					}
            					add(
            						current,
            						"service",
            						lv_service_11_0,
            						"edu.kit.ipd.sdq.mdsdpc.system.System.Service");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSystem.g:1557:3: (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==15) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSystem.g:1558:4: otherlv_12= ',' ( (lv_service_13_0= ruleService ) )
            	    {
            	    otherlv_12=(Token)match(input,15,FOLLOW_41); 

            	    				newLeafNode(otherlv_12, grammarAccess.getComponent_ImplAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalSystem.g:1562:4: ( (lv_service_13_0= ruleService ) )
            	    // InternalSystem.g:1563:5: (lv_service_13_0= ruleService )
            	    {
            	    // InternalSystem.g:1563:5: (lv_service_13_0= ruleService )
            	    // InternalSystem.g:1564:6: lv_service_13_0= ruleService
            	    {

            	    						newCompositeNode(grammarAccess.getComponent_ImplAccess().getServiceServiceParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_service_13_0=ruleService();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
            	    						}
            	    						add(
            	    							current,
            	    							"service",
            	    							lv_service_13_0,
            	    							"edu.kit.ipd.sdq.mdsdpc.system.System.Service");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_14=(Token)match(input,19,FOLLOW_42); 

            			newLeafNode(otherlv_14, grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalSystem.g:1586:3: (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==17) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSystem.g:1587:4: otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getComponent_ImplAccess().getRequiredroleKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_43); 

                    				newLeafNode(otherlv_16, grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalSystem.g:1595:4: ( (lv_requiredrole_17_0= ruleRequiredRole ) )
                    // InternalSystem.g:1596:5: (lv_requiredrole_17_0= ruleRequiredRole )
                    {
                    // InternalSystem.g:1596:5: (lv_requiredrole_17_0= ruleRequiredRole )
                    // InternalSystem.g:1597:6: lv_requiredrole_17_0= ruleRequiredRole
                    {

                    						newCompositeNode(grammarAccess.getComponent_ImplAccess().getRequiredroleRequiredRoleParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_requiredrole_17_0=ruleRequiredRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
                    						}
                    						add(
                    							current,
                    							"requiredrole",
                    							lv_requiredrole_17_0,
                    							"edu.kit.ipd.sdq.mdsdpc.system.System.RequiredRole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSystem.g:1614:4: (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==15) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalSystem.g:1615:5: otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FOLLOW_43); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getComponent_ImplAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalSystem.g:1619:5: ( (lv_requiredrole_19_0= ruleRequiredRole ) )
                    	    // InternalSystem.g:1620:6: (lv_requiredrole_19_0= ruleRequiredRole )
                    	    {
                    	    // InternalSystem.g:1620:6: (lv_requiredrole_19_0= ruleRequiredRole )
                    	    // InternalSystem.g:1621:7: lv_requiredrole_19_0= ruleRequiredRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponent_ImplAccess().getRequiredroleRequiredRoleParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_requiredrole_19_0=ruleRequiredRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"requiredrole",
                    	    								lv_requiredrole_19_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.system.System.RequiredRole");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_20, grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,13,FOLLOW_44); 

            			newLeafNode(otherlv_21, grammarAccess.getComponent_ImplAccess().getProvidedroleKeyword_10());
            		
            // InternalSystem.g:1648:3: ( (lv_providedrole_22_0= ruleProvidedRole ) )
            // InternalSystem.g:1649:4: (lv_providedrole_22_0= ruleProvidedRole )
            {
            // InternalSystem.g:1649:4: (lv_providedrole_22_0= ruleProvidedRole )
            // InternalSystem.g:1650:5: lv_providedrole_22_0= ruleProvidedRole
            {

            					newCompositeNode(grammarAccess.getComponent_ImplAccess().getProvidedroleProvidedRoleParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_22);
            lv_providedrole_22_0=ruleProvidedRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
            					}
            					set(
            						current,
            						"providedrole",
            						lv_providedrole_22_0,
            						"edu.kit.ipd.sdq.mdsdpc.system.System.ProvidedRole");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_23=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleComponent_Impl"


    // $ANTLR start "entryRuleBehaviourDescription"
    // InternalSystem.g:1675:1: entryRuleBehaviourDescription returns [EObject current=null] : iv_ruleBehaviourDescription= ruleBehaviourDescription EOF ;
    public final EObject entryRuleBehaviourDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviourDescription = null;


        try {
            // InternalSystem.g:1675:61: (iv_ruleBehaviourDescription= ruleBehaviourDescription EOF )
            // InternalSystem.g:1676:2: iv_ruleBehaviourDescription= ruleBehaviourDescription EOF
            {
             newCompositeNode(grammarAccess.getBehaviourDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviourDescription=ruleBehaviourDescription();

            state._fsp--;

             current =iv_ruleBehaviourDescription; 
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
    // $ANTLR end "entryRuleBehaviourDescription"


    // $ANTLR start "ruleBehaviourDescription"
    // InternalSystem.g:1682:1: ruleBehaviourDescription returns [EObject current=null] : ( () otherlv_1= 'BehaviourDescription' otherlv_2= '{' (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleBehaviourDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_descriptionelement_5_0 = null;

        EObject lv_descriptionelement_7_0 = null;



        	enterRule();

        try {
            // InternalSystem.g:1688:2: ( ( () otherlv_1= 'BehaviourDescription' otherlv_2= '{' (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalSystem.g:1689:2: ( () otherlv_1= 'BehaviourDescription' otherlv_2= '{' (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalSystem.g:1689:2: ( () otherlv_1= 'BehaviourDescription' otherlv_2= '{' (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalSystem.g:1690:3: () otherlv_1= 'BehaviourDescription' otherlv_2= '{' (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalSystem.g:1690:3: ()
            // InternalSystem.g:1691:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBehaviourDescriptionAccess().getBehaviourDescriptionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBehaviourDescriptionAccess().getBehaviourDescriptionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getBehaviourDescriptionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSystem.g:1705:3: (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==44) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSystem.g:1706:4: otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getBehaviourDescriptionAccess().getDescriptionelementKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_46); 

                    				newLeafNode(otherlv_4, grammarAccess.getBehaviourDescriptionAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSystem.g:1714:4: ( (lv_descriptionelement_5_0= ruleDescriptionElement ) )
                    // InternalSystem.g:1715:5: (lv_descriptionelement_5_0= ruleDescriptionElement )
                    {
                    // InternalSystem.g:1715:5: (lv_descriptionelement_5_0= ruleDescriptionElement )
                    // InternalSystem.g:1716:6: lv_descriptionelement_5_0= ruleDescriptionElement
                    {

                    						newCompositeNode(grammarAccess.getBehaviourDescriptionAccess().getDescriptionelementDescriptionElementParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_descriptionelement_5_0=ruleDescriptionElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehaviourDescriptionRule());
                    						}
                    						add(
                    							current,
                    							"descriptionelement",
                    							lv_descriptionelement_5_0,
                    							"edu.kit.ipd.sdq.mdsdpc.system.System.DescriptionElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSystem.g:1733:4: (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==15) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalSystem.g:1734:5: otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_46); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getBehaviourDescriptionAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSystem.g:1738:5: ( (lv_descriptionelement_7_0= ruleDescriptionElement ) )
                    	    // InternalSystem.g:1739:6: (lv_descriptionelement_7_0= ruleDescriptionElement )
                    	    {
                    	    // InternalSystem.g:1739:6: (lv_descriptionelement_7_0= ruleDescriptionElement )
                    	    // InternalSystem.g:1740:7: lv_descriptionelement_7_0= ruleDescriptionElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviourDescriptionAccess().getDescriptionelementDescriptionElementParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_descriptionelement_7_0=ruleDescriptionElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBehaviourDescriptionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"descriptionelement",
                    	    								lv_descriptionelement_7_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.system.System.DescriptionElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,19,FOLLOW_22); 

                    				newLeafNode(otherlv_8, grammarAccess.getBehaviourDescriptionAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getBehaviourDescriptionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleBehaviourDescription"


    // $ANTLR start "entryRuleService"
    // InternalSystem.g:1771:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalSystem.g:1771:48: (iv_ruleService= ruleService EOF )
            // InternalSystem.g:1772:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalSystem.g:1778:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'correspondingSignatures' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalSystem.g:1784:2: ( (otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'correspondingSignatures' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' ) )
            // InternalSystem.g:1785:2: (otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'correspondingSignatures' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' )
            {
            // InternalSystem.g:1785:2: (otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'correspondingSignatures' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' )
            // InternalSystem.g:1786:3: otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'correspondingSignatures' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,46,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getCorrespondingSignaturesKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getLeftParenthesisKeyword_3());
            		
            // InternalSystem.g:1802:3: ( ( ruleEString ) )
            // InternalSystem.g:1803:4: ( ruleEString )
            {
            // InternalSystem.g:1803:4: ( ruleEString )
            // InternalSystem.g:1804:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceAccess().getCorrespondingSignaturesSignatureCrossReference_4_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSystem.g:1818:3: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==15) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSystem.g:1819:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalSystem.g:1823:4: ( ( ruleEString ) )
            	    // InternalSystem.g:1824:5: ( ruleEString )
            	    {
            	    // InternalSystem.g:1824:5: ( ruleEString )
            	    // InternalSystem.g:1825:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getServiceRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getServiceAccess().getCorrespondingSignaturesSignatureCrossReference_5_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_22); 

            			newLeafNode(otherlv_7, grammarAccess.getServiceAccess().getRightParenthesisKeyword_6());
            		
            otherlv_8=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleCompositeComponent"
    // InternalSystem.g:1852:1: entryRuleCompositeComponent returns [EObject current=null] : iv_ruleCompositeComponent= ruleCompositeComponent EOF ;
    public final EObject entryRuleCompositeComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeComponent = null;


        try {
            // InternalSystem.g:1852:59: (iv_ruleCompositeComponent= ruleCompositeComponent EOF )
            // InternalSystem.g:1853:2: iv_ruleCompositeComponent= ruleCompositeComponent EOF
            {
             newCompositeNode(grammarAccess.getCompositeComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeComponent=ruleCompositeComponent();

            state._fsp--;

             current =iv_ruleCompositeComponent; 
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
    // $ANTLR end "entryRuleCompositeComponent"


    // $ANTLR start "ruleCompositeComponent"
    // InternalSystem.g:1859:1: ruleCompositeComponent returns [EObject current=null] : (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= 'assemblycontext' otherlv_24= '{' ( (lv_assemblycontext_25_0= ruleAssemblyContext ) ) (otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) ) )* otherlv_28= '}' otherlv_29= 'delegationconnector' otherlv_30= '{' ( (lv_delegationconnector_31_0= ruleDelegationConnector ) ) (otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) ) )* otherlv_34= '}' otherlv_35= '}' ) ;
    public final EObject ruleCompositeComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_behaviourdescription_5_0 = null;

        EObject lv_behaviourdescription_7_0 = null;

        EObject lv_service_11_0 = null;

        EObject lv_service_13_0 = null;

        EObject lv_requiredrole_17_0 = null;

        EObject lv_requiredrole_19_0 = null;

        EObject lv_providedrole_22_0 = null;

        EObject lv_assemblycontext_25_0 = null;

        EObject lv_assemblycontext_27_0 = null;

        EObject lv_delegationconnector_31_0 = null;

        EObject lv_delegationconnector_33_0 = null;



        	enterRule();

        try {
            // InternalSystem.g:1865:2: ( (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= 'assemblycontext' otherlv_24= '{' ( (lv_assemblycontext_25_0= ruleAssemblyContext ) ) (otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) ) )* otherlv_28= '}' otherlv_29= 'delegationconnector' otherlv_30= '{' ( (lv_delegationconnector_31_0= ruleDelegationConnector ) ) (otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) ) )* otherlv_34= '}' otherlv_35= '}' ) )
            // InternalSystem.g:1866:2: (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= 'assemblycontext' otherlv_24= '{' ( (lv_assemblycontext_25_0= ruleAssemblyContext ) ) (otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) ) )* otherlv_28= '}' otherlv_29= 'delegationconnector' otherlv_30= '{' ( (lv_delegationconnector_31_0= ruleDelegationConnector ) ) (otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) ) )* otherlv_34= '}' otherlv_35= '}' )
            {
            // InternalSystem.g:1866:2: (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= 'assemblycontext' otherlv_24= '{' ( (lv_assemblycontext_25_0= ruleAssemblyContext ) ) (otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) ) )* otherlv_28= '}' otherlv_29= 'delegationconnector' otherlv_30= '{' ( (lv_delegationconnector_31_0= ruleDelegationConnector ) ) (otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) ) )* otherlv_34= '}' otherlv_35= '}' )
            // InternalSystem.g:1867:3: otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= 'assemblycontext' otherlv_24= '{' ( (lv_assemblycontext_25_0= ruleAssemblyContext ) ) (otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) ) )* otherlv_28= '}' otherlv_29= 'delegationconnector' otherlv_30= '{' ( (lv_delegationconnector_31_0= ruleDelegationConnector ) ) (otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) ) )* otherlv_34= '}' otherlv_35= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositeComponentAccess().getCompositeComponentKeyword_0());
            		
            // InternalSystem.g:1871:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSystem.g:1872:4: (lv_name_1_0= ruleEString )
            {
            // InternalSystem.g:1872:4: (lv_name_1_0= ruleEString )
            // InternalSystem.g:1873:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.kit.ipd.sdq.mdsdpc.system.System.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSystem.g:1894:3: (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==41) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSystem.g:1895:4: otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_39); 

                    				newLeafNode(otherlv_4, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSystem.g:1903:4: ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) )
                    // InternalSystem.g:1904:5: (lv_behaviourdescription_5_0= ruleBehaviourDescription )
                    {
                    // InternalSystem.g:1904:5: (lv_behaviourdescription_5_0= ruleBehaviourDescription )
                    // InternalSystem.g:1905:6: lv_behaviourdescription_5_0= ruleBehaviourDescription
                    {

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionBehaviourDescriptionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_behaviourdescription_5_0=ruleBehaviourDescription();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    						}
                    						add(
                    							current,
                    							"behaviourdescription",
                    							lv_behaviourdescription_5_0,
                    							"edu.kit.ipd.sdq.mdsdpc.system.System.BehaviourDescription");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSystem.g:1922:4: (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==15) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalSystem.g:1923:5: otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_39); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getCompositeComponentAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSystem.g:1927:5: ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) )
                    	    // InternalSystem.g:1928:6: (lv_behaviourdescription_7_0= ruleBehaviourDescription )
                    	    {
                    	    // InternalSystem.g:1928:6: (lv_behaviourdescription_7_0= ruleBehaviourDescription )
                    	    // InternalSystem.g:1929:7: lv_behaviourdescription_7_0= ruleBehaviourDescription
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionBehaviourDescriptionParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_behaviourdescription_7_0=ruleBehaviourDescription();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"behaviourdescription",
                    	    								lv_behaviourdescription_7_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.system.System.BehaviourDescription");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,19,FOLLOW_40); 

                    				newLeafNode(otherlv_8, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getCompositeComponentAccess().getServiceKeyword_4());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_10, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalSystem.g:1960:3: ( (lv_service_11_0= ruleService ) )
            // InternalSystem.g:1961:4: (lv_service_11_0= ruleService )
            {
            // InternalSystem.g:1961:4: (lv_service_11_0= ruleService )
            // InternalSystem.g:1962:5: lv_service_11_0= ruleService
            {

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getServiceServiceParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
            lv_service_11_0=ruleService();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            					}
            					add(
            						current,
            						"service",
            						lv_service_11_0,
            						"edu.kit.ipd.sdq.mdsdpc.system.System.Service");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSystem.g:1979:3: (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==15) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSystem.g:1980:4: otherlv_12= ',' ( (lv_service_13_0= ruleService ) )
            	    {
            	    otherlv_12=(Token)match(input,15,FOLLOW_41); 

            	    				newLeafNode(otherlv_12, grammarAccess.getCompositeComponentAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalSystem.g:1984:4: ( (lv_service_13_0= ruleService ) )
            	    // InternalSystem.g:1985:5: (lv_service_13_0= ruleService )
            	    {
            	    // InternalSystem.g:1985:5: (lv_service_13_0= ruleService )
            	    // InternalSystem.g:1986:6: lv_service_13_0= ruleService
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getServiceServiceParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_service_13_0=ruleService();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"service",
            	    							lv_service_13_0,
            	    							"edu.kit.ipd.sdq.mdsdpc.system.System.Service");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_14=(Token)match(input,19,FOLLOW_42); 

            			newLeafNode(otherlv_14, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalSystem.g:2008:3: (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==17) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSystem.g:2009:4: otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getCompositeComponentAccess().getRequiredroleKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_43); 

                    				newLeafNode(otherlv_16, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalSystem.g:2017:4: ( (lv_requiredrole_17_0= ruleRequiredRole ) )
                    // InternalSystem.g:2018:5: (lv_requiredrole_17_0= ruleRequiredRole )
                    {
                    // InternalSystem.g:2018:5: (lv_requiredrole_17_0= ruleRequiredRole )
                    // InternalSystem.g:2019:6: lv_requiredrole_17_0= ruleRequiredRole
                    {

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiredroleRequiredRoleParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_requiredrole_17_0=ruleRequiredRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    						}
                    						add(
                    							current,
                    							"requiredrole",
                    							lv_requiredrole_17_0,
                    							"edu.kit.ipd.sdq.mdsdpc.system.System.RequiredRole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSystem.g:2036:4: (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==15) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalSystem.g:2037:5: otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FOLLOW_43); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getCompositeComponentAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalSystem.g:2041:5: ( (lv_requiredrole_19_0= ruleRequiredRole ) )
                    	    // InternalSystem.g:2042:6: (lv_requiredrole_19_0= ruleRequiredRole )
                    	    {
                    	    // InternalSystem.g:2042:6: (lv_requiredrole_19_0= ruleRequiredRole )
                    	    // InternalSystem.g:2043:7: lv_requiredrole_19_0= ruleRequiredRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiredroleRequiredRoleParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_requiredrole_19_0=ruleRequiredRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"requiredrole",
                    	    								lv_requiredrole_19_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.system.System.RequiredRole");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_20, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,13,FOLLOW_44); 

            			newLeafNode(otherlv_21, grammarAccess.getCompositeComponentAccess().getProvidedroleKeyword_10());
            		
            // InternalSystem.g:2070:3: ( (lv_providedrole_22_0= ruleProvidedRole ) )
            // InternalSystem.g:2071:4: (lv_providedrole_22_0= ruleProvidedRole )
            {
            // InternalSystem.g:2071:4: (lv_providedrole_22_0= ruleProvidedRole )
            // InternalSystem.g:2072:5: lv_providedrole_22_0= ruleProvidedRole
            {

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidedroleProvidedRoleParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_48);
            lv_providedrole_22_0=ruleProvidedRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            					}
            					set(
            						current,
            						"providedrole",
            						lv_providedrole_22_0,
            						"edu.kit.ipd.sdq.mdsdpc.system.System.ProvidedRole");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_23=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_23, grammarAccess.getCompositeComponentAccess().getAssemblycontextKeyword_12());
            		
            otherlv_24=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_24, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalSystem.g:2097:3: ( (lv_assemblycontext_25_0= ruleAssemblyContext ) )
            // InternalSystem.g:2098:4: (lv_assemblycontext_25_0= ruleAssemblyContext )
            {
            // InternalSystem.g:2098:4: (lv_assemblycontext_25_0= ruleAssemblyContext )
            // InternalSystem.g:2099:5: lv_assemblycontext_25_0= ruleAssemblyContext
            {

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getAssemblycontextAssemblyContextParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_11);
            lv_assemblycontext_25_0=ruleAssemblyContext();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            					}
            					add(
            						current,
            						"assemblycontext",
            						lv_assemblycontext_25_0,
            						"edu.kit.ipd.sdq.mdsdpc.system.System.AssemblyContext");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSystem.g:2116:3: (otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==15) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalSystem.g:2117:4: otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) )
            	    {
            	    otherlv_26=(Token)match(input,15,FOLLOW_10); 

            	    				newLeafNode(otherlv_26, grammarAccess.getCompositeComponentAccess().getCommaKeyword_15_0());
            	    			
            	    // InternalSystem.g:2121:4: ( (lv_assemblycontext_27_0= ruleAssemblyContext ) )
            	    // InternalSystem.g:2122:5: (lv_assemblycontext_27_0= ruleAssemblyContext )
            	    {
            	    // InternalSystem.g:2122:5: (lv_assemblycontext_27_0= ruleAssemblyContext )
            	    // InternalSystem.g:2123:6: lv_assemblycontext_27_0= ruleAssemblyContext
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getAssemblycontextAssemblyContextParserRuleCall_15_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_assemblycontext_27_0=ruleAssemblyContext();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"assemblycontext",
            	    							lv_assemblycontext_27_0,
            	    							"edu.kit.ipd.sdq.mdsdpc.system.System.AssemblyContext");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_28=(Token)match(input,19,FOLLOW_49); 

            			newLeafNode(otherlv_28, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_16());
            		
            otherlv_29=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_29, grammarAccess.getCompositeComponentAccess().getDelegationconnectorKeyword_17());
            		
            otherlv_30=(Token)match(input,12,FOLLOW_50); 

            			newLeafNode(otherlv_30, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_18());
            		
            // InternalSystem.g:2153:3: ( (lv_delegationconnector_31_0= ruleDelegationConnector ) )
            // InternalSystem.g:2154:4: (lv_delegationconnector_31_0= ruleDelegationConnector )
            {
            // InternalSystem.g:2154:4: (lv_delegationconnector_31_0= ruleDelegationConnector )
            // InternalSystem.g:2155:5: lv_delegationconnector_31_0= ruleDelegationConnector
            {

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getDelegationconnectorDelegationConnectorParserRuleCall_19_0());
            				
            pushFollow(FOLLOW_11);
            lv_delegationconnector_31_0=ruleDelegationConnector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            					}
            					add(
            						current,
            						"delegationconnector",
            						lv_delegationconnector_31_0,
            						"edu.kit.ipd.sdq.mdsdpc.system.System.DelegationConnector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSystem.g:2172:3: (otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==15) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalSystem.g:2173:4: otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) )
            	    {
            	    otherlv_32=(Token)match(input,15,FOLLOW_50); 

            	    				newLeafNode(otherlv_32, grammarAccess.getCompositeComponentAccess().getCommaKeyword_20_0());
            	    			
            	    // InternalSystem.g:2177:4: ( (lv_delegationconnector_33_0= ruleDelegationConnector ) )
            	    // InternalSystem.g:2178:5: (lv_delegationconnector_33_0= ruleDelegationConnector )
            	    {
            	    // InternalSystem.g:2178:5: (lv_delegationconnector_33_0= ruleDelegationConnector )
            	    // InternalSystem.g:2179:6: lv_delegationconnector_33_0= ruleDelegationConnector
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getDelegationconnectorDelegationConnectorParserRuleCall_20_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_delegationconnector_33_0=ruleDelegationConnector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"delegationconnector",
            	    							lv_delegationconnector_33_0,
            	    							"edu.kit.ipd.sdq.mdsdpc.system.System.DelegationConnector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_34=(Token)match(input,19,FOLLOW_22); 

            			newLeafNode(otherlv_34, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_21());
            		
            otherlv_35=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_35, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_22());
            		

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
    // $ANTLR end "ruleCompositeComponent"


    // $ANTLR start "entryRuleDescriptionElement_Impl"
    // InternalSystem.g:2209:1: entryRuleDescriptionElement_Impl returns [EObject current=null] : iv_ruleDescriptionElement_Impl= ruleDescriptionElement_Impl EOF ;
    public final EObject entryRuleDescriptionElement_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescriptionElement_Impl = null;


        try {
            // InternalSystem.g:2209:64: (iv_ruleDescriptionElement_Impl= ruleDescriptionElement_Impl EOF )
            // InternalSystem.g:2210:2: iv_ruleDescriptionElement_Impl= ruleDescriptionElement_Impl EOF
            {
             newCompositeNode(grammarAccess.getDescriptionElement_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescriptionElement_Impl=ruleDescriptionElement_Impl();

            state._fsp--;

             current =iv_ruleDescriptionElement_Impl; 
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
    // $ANTLR end "entryRuleDescriptionElement_Impl"


    // $ANTLR start "ruleDescriptionElement_Impl"
    // InternalSystem.g:2216:1: ruleDescriptionElement_Impl returns [EObject current=null] : ( () otherlv_1= 'DescriptionElement' ) ;
    public final EObject ruleDescriptionElement_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSystem.g:2222:2: ( ( () otherlv_1= 'DescriptionElement' ) )
            // InternalSystem.g:2223:2: ( () otherlv_1= 'DescriptionElement' )
            {
            // InternalSystem.g:2223:2: ( () otherlv_1= 'DescriptionElement' )
            // InternalSystem.g:2224:3: () otherlv_1= 'DescriptionElement'
            {
            // InternalSystem.g:2224:3: ()
            // InternalSystem.g:2225:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDescriptionElement_ImplAccess().getDescriptionElementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDescriptionElement_ImplAccess().getDescriptionElementKeyword_1());
            		

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
    // $ANTLR end "ruleDescriptionElement_Impl"


    // $ANTLR start "entryRuleInternalAction"
    // InternalSystem.g:2239:1: entryRuleInternalAction returns [EObject current=null] : iv_ruleInternalAction= ruleInternalAction EOF ;
    public final EObject entryRuleInternalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalAction = null;


        try {
            // InternalSystem.g:2239:55: (iv_ruleInternalAction= ruleInternalAction EOF )
            // InternalSystem.g:2240:2: iv_ruleInternalAction= ruleInternalAction EOF
            {
             newCompositeNode(grammarAccess.getInternalActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInternalAction=ruleInternalAction();

            state._fsp--;

             current =iv_ruleInternalAction; 
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
    // $ANTLR end "entryRuleInternalAction"


    // $ANTLR start "ruleInternalAction"
    // InternalSystem.g:2246:1: ruleInternalAction returns [EObject current=null] : ( () otherlv_1= 'InternalAction' ) ;
    public final EObject ruleInternalAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSystem.g:2252:2: ( ( () otherlv_1= 'InternalAction' ) )
            // InternalSystem.g:2253:2: ( () otherlv_1= 'InternalAction' )
            {
            // InternalSystem.g:2253:2: ( () otherlv_1= 'InternalAction' )
            // InternalSystem.g:2254:3: () otherlv_1= 'InternalAction'
            {
            // InternalSystem.g:2254:3: ()
            // InternalSystem.g:2255:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInternalActionAccess().getInternalActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInternalActionAccess().getInternalActionKeyword_1());
            		

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
    // $ANTLR end "ruleInternalAction"


    // $ANTLR start "entryRuleExternalCall"
    // InternalSystem.g:2269:1: entryRuleExternalCall returns [EObject current=null] : iv_ruleExternalCall= ruleExternalCall EOF ;
    public final EObject entryRuleExternalCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalCall = null;


        try {
            // InternalSystem.g:2269:53: (iv_ruleExternalCall= ruleExternalCall EOF )
            // InternalSystem.g:2270:2: iv_ruleExternalCall= ruleExternalCall EOF
            {
             newCompositeNode(grammarAccess.getExternalCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalCall=ruleExternalCall();

            state._fsp--;

             current =iv_ruleExternalCall; 
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
    // $ANTLR end "entryRuleExternalCall"


    // $ANTLR start "ruleExternalCall"
    // InternalSystem.g:2276:1: ruleExternalCall returns [EObject current=null] : ( () otherlv_1= 'ExternalCall' ) ;
    public final EObject ruleExternalCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSystem.g:2282:2: ( ( () otherlv_1= 'ExternalCall' ) )
            // InternalSystem.g:2283:2: ( () otherlv_1= 'ExternalCall' )
            {
            // InternalSystem.g:2283:2: ( () otherlv_1= 'ExternalCall' )
            // InternalSystem.g:2284:3: () otherlv_1= 'ExternalCall'
            {
            // InternalSystem.g:2284:3: ()
            // InternalSystem.g:2285:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalCallAccess().getExternalCallAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalCallAccess().getExternalCallKeyword_1());
            		

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
    // $ANTLR end "ruleExternalCall"


    // $ANTLR start "entryRuleLoop"
    // InternalSystem.g:2299:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalSystem.g:2299:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalSystem.g:2300:2: iv_ruleLoop= ruleLoop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoop=ruleLoop();

            state._fsp--;

             current =iv_ruleLoop; 
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
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalSystem.g:2306:1: ruleLoop returns [EObject current=null] : ( () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_descriptionelement_5_0 = null;

        EObject lv_descriptionelement_7_0 = null;



        	enterRule();

        try {
            // InternalSystem.g:2312:2: ( ( () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalSystem.g:2313:2: ( () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalSystem.g:2313:2: ( () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalSystem.g:2314:3: () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalSystem.g:2314:3: ()
            // InternalSystem.g:2315:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoopAccess().getLoopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getLoopKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSystem.g:2329:3: (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==44) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSystem.g:2330:4: otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getLoopAccess().getDescriptionelementKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_46); 

                    				newLeafNode(otherlv_4, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSystem.g:2338:4: ( (lv_descriptionelement_5_0= ruleDescriptionElement ) )
                    // InternalSystem.g:2339:5: (lv_descriptionelement_5_0= ruleDescriptionElement )
                    {
                    // InternalSystem.g:2339:5: (lv_descriptionelement_5_0= ruleDescriptionElement )
                    // InternalSystem.g:2340:6: lv_descriptionelement_5_0= ruleDescriptionElement
                    {

                    						newCompositeNode(grammarAccess.getLoopAccess().getDescriptionelementDescriptionElementParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_descriptionelement_5_0=ruleDescriptionElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoopRule());
                    						}
                    						add(
                    							current,
                    							"descriptionelement",
                    							lv_descriptionelement_5_0,
                    							"edu.kit.ipd.sdq.mdsdpc.system.System.DescriptionElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSystem.g:2357:4: (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==15) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalSystem.g:2358:5: otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_46); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getLoopAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSystem.g:2362:5: ( (lv_descriptionelement_7_0= ruleDescriptionElement ) )
                    	    // InternalSystem.g:2363:6: (lv_descriptionelement_7_0= ruleDescriptionElement )
                    	    {
                    	    // InternalSystem.g:2363:6: (lv_descriptionelement_7_0= ruleDescriptionElement )
                    	    // InternalSystem.g:2364:7: lv_descriptionelement_7_0= ruleDescriptionElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getLoopAccess().getDescriptionelementDescriptionElementParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_descriptionelement_7_0=ruleDescriptionElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLoopRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"descriptionelement",
                    	    								lv_descriptionelement_7_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.system.System.DescriptionElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,19,FOLLOW_22); 

                    				newLeafNode(otherlv_8, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleBranch"
    // InternalSystem.g:2395:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // InternalSystem.g:2395:47: (iv_ruleBranch= ruleBranch EOF )
            // InternalSystem.g:2396:2: iv_ruleBranch= ruleBranch EOF
            {
             newCompositeNode(grammarAccess.getBranchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBranch=ruleBranch();

            state._fsp--;

             current =iv_ruleBranch; 
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
    // $ANTLR end "entryRuleBranch"


    // $ANTLR start "ruleBranch"
    // InternalSystem.g:2402:1: ruleBranch returns [EObject current=null] : ( () otherlv_1= 'Branch' otherlv_2= '{' (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_descriptionelement_5_0 = null;

        EObject lv_descriptionelement_7_0 = null;



        	enterRule();

        try {
            // InternalSystem.g:2408:2: ( ( () otherlv_1= 'Branch' otherlv_2= '{' (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalSystem.g:2409:2: ( () otherlv_1= 'Branch' otherlv_2= '{' (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalSystem.g:2409:2: ( () otherlv_1= 'Branch' otherlv_2= '{' (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalSystem.g:2410:3: () otherlv_1= 'Branch' otherlv_2= '{' (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalSystem.g:2410:3: ()
            // InternalSystem.g:2411:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBranchAccess().getBranchAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,53,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBranchAccess().getBranchKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getBranchAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSystem.g:2425:3: (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==44) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSystem.g:2426:4: otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getBranchAccess().getDescriptionelementKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_46); 

                    				newLeafNode(otherlv_4, grammarAccess.getBranchAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSystem.g:2434:4: ( (lv_descriptionelement_5_0= ruleDescriptionElement ) )
                    // InternalSystem.g:2435:5: (lv_descriptionelement_5_0= ruleDescriptionElement )
                    {
                    // InternalSystem.g:2435:5: (lv_descriptionelement_5_0= ruleDescriptionElement )
                    // InternalSystem.g:2436:6: lv_descriptionelement_5_0= ruleDescriptionElement
                    {

                    						newCompositeNode(grammarAccess.getBranchAccess().getDescriptionelementDescriptionElementParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_descriptionelement_5_0=ruleDescriptionElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBranchRule());
                    						}
                    						add(
                    							current,
                    							"descriptionelement",
                    							lv_descriptionelement_5_0,
                    							"edu.kit.ipd.sdq.mdsdpc.system.System.DescriptionElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSystem.g:2453:4: (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==15) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalSystem.g:2454:5: otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_46); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getBranchAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSystem.g:2458:5: ( (lv_descriptionelement_7_0= ruleDescriptionElement ) )
                    	    // InternalSystem.g:2459:6: (lv_descriptionelement_7_0= ruleDescriptionElement )
                    	    {
                    	    // InternalSystem.g:2459:6: (lv_descriptionelement_7_0= ruleDescriptionElement )
                    	    // InternalSystem.g:2460:7: lv_descriptionelement_7_0= ruleDescriptionElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getBranchAccess().getDescriptionelementDescriptionElementParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_descriptionelement_7_0=ruleDescriptionElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBranchRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"descriptionelement",
                    	    								lv_descriptionelement_7_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.system.System.DescriptionElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,19,FOLLOW_22); 

                    				newLeafNode(otherlv_8, grammarAccess.getBranchAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getBranchAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleBranch"


    // $ANTLR start "entryRuleSignature"
    // InternalSystem.g:2491:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // InternalSystem.g:2491:50: (iv_ruleSignature= ruleSignature EOF )
            // InternalSystem.g:2492:2: iv_ruleSignature= ruleSignature EOF
            {
             newCompositeNode(grammarAccess.getSignatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignature=ruleSignature();

            state._fsp--;

             current =iv_ruleSignature; 
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
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // InternalSystem.g:2498:1: ruleSignature returns [EObject current=null] : (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returntype' ( ( ruleEString ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleSignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameter_7_0 = null;

        EObject lv_parameter_9_0 = null;



        	enterRule();

        try {
            // InternalSystem.g:2504:2: ( (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returntype' ( ( ruleEString ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalSystem.g:2505:2: (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returntype' ( ( ruleEString ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalSystem.g:2505:2: (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returntype' ( ( ruleEString ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalSystem.g:2506:3: otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returntype' ( ( ruleEString ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSignatureAccess().getSignatureKeyword_0());
            		
            // InternalSystem.g:2510:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSystem.g:2511:4: (lv_name_1_0= ruleEString )
            {
            // InternalSystem.g:2511:4: (lv_name_1_0= ruleEString )
            // InternalSystem.g:2512:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSignatureAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSignatureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.kit.ipd.sdq.mdsdpc.system.System.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_51); 

            			newLeafNode(otherlv_2, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,55,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getSignatureAccess().getReturntypeKeyword_3());
            		
            // InternalSystem.g:2537:3: ( ( ruleEString ) )
            // InternalSystem.g:2538:4: ( ruleEString )
            {
            // InternalSystem.g:2538:4: ( ruleEString )
            // InternalSystem.g:2539:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSignatureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSignatureAccess().getReturntypeReturnTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_52);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSystem.g:2553:3: (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==56) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSystem.g:2554:4: otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,56,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getSignatureAccess().getParameterKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_53); 

                    				newLeafNode(otherlv_6, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSystem.g:2562:4: ( (lv_parameter_7_0= ruleParameter ) )
                    // InternalSystem.g:2563:5: (lv_parameter_7_0= ruleParameter )
                    {
                    // InternalSystem.g:2563:5: (lv_parameter_7_0= ruleParameter )
                    // InternalSystem.g:2564:6: lv_parameter_7_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getSignatureAccess().getParameterParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_parameter_7_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSignatureRule());
                    						}
                    						add(
                    							current,
                    							"parameter",
                    							lv_parameter_7_0,
                    							"edu.kit.ipd.sdq.mdsdpc.system.System.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSystem.g:2581:4: (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==15) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalSystem.g:2582:5: otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_53); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getSignatureAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSystem.g:2586:5: ( (lv_parameter_9_0= ruleParameter ) )
                    	    // InternalSystem.g:2587:6: (lv_parameter_9_0= ruleParameter )
                    	    {
                    	    // InternalSystem.g:2587:6: (lv_parameter_9_0= ruleParameter )
                    	    // InternalSystem.g:2588:7: lv_parameter_9_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getSignatureAccess().getParameterParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_parameter_9_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSignatureRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameter",
                    	    								lv_parameter_9_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.system.System.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,19,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleParameter"
    // InternalSystem.g:2619:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalSystem.g:2619:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalSystem.g:2620:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalSystem.g:2626:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parametertype' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSystem.g:2632:2: ( (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parametertype' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalSystem.g:2633:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parametertype' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalSystem.g:2633:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parametertype' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalSystem.g:2634:3: otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parametertype' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            // InternalSystem.g:2638:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSystem.g:2639:4: (lv_name_1_0= ruleEString )
            {
            // InternalSystem.g:2639:4: (lv_name_1_0= ruleEString )
            // InternalSystem.g:2640:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.kit.ipd.sdq.mdsdpc.system.System.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_54); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,58,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getParametertypeKeyword_3());
            		
            // InternalSystem.g:2665:3: ( ( ruleEString ) )
            // InternalSystem.g:2666:4: ( ruleEString )
            {
            // InternalSystem.g:2666:4: ( ruleEString )
            // InternalSystem.g:2667:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterAccess().getParametertypeParameterTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleReturnType_Impl"
    // InternalSystem.g:2689:1: entryRuleReturnType_Impl returns [EObject current=null] : iv_ruleReturnType_Impl= ruleReturnType_Impl EOF ;
    public final EObject entryRuleReturnType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnType_Impl = null;


        try {
            // InternalSystem.g:2689:56: (iv_ruleReturnType_Impl= ruleReturnType_Impl EOF )
            // InternalSystem.g:2690:2: iv_ruleReturnType_Impl= ruleReturnType_Impl EOF
            {
             newCompositeNode(grammarAccess.getReturnType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReturnType_Impl=ruleReturnType_Impl();

            state._fsp--;

             current =iv_ruleReturnType_Impl; 
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
    // $ANTLR end "entryRuleReturnType_Impl"


    // $ANTLR start "ruleReturnType_Impl"
    // InternalSystem.g:2696:1: ruleReturnType_Impl returns [EObject current=null] : ( () otherlv_1= 'ReturnType' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleReturnType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSystem.g:2702:2: ( ( () otherlv_1= 'ReturnType' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalSystem.g:2703:2: ( () otherlv_1= 'ReturnType' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalSystem.g:2703:2: ( () otherlv_1= 'ReturnType' ( (lv_name_2_0= ruleEString ) ) )
            // InternalSystem.g:2704:3: () otherlv_1= 'ReturnType' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalSystem.g:2704:3: ()
            // InternalSystem.g:2705:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReturnType_ImplAccess().getReturnTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,59,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getReturnType_ImplAccess().getReturnTypeKeyword_1());
            		
            // InternalSystem.g:2715:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSystem.g:2716:4: (lv_name_2_0= ruleEString )
            {
            // InternalSystem.g:2716:4: (lv_name_2_0= ruleEString )
            // InternalSystem.g:2717:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReturnType_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReturnType_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"edu.kit.ipd.sdq.mdsdpc.system.System.EString");
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
    // $ANTLR end "ruleReturnType_Impl"


    // $ANTLR start "entryRuleParameterType_Impl"
    // InternalSystem.g:2738:1: entryRuleParameterType_Impl returns [EObject current=null] : iv_ruleParameterType_Impl= ruleParameterType_Impl EOF ;
    public final EObject entryRuleParameterType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType_Impl = null;


        try {
            // InternalSystem.g:2738:59: (iv_ruleParameterType_Impl= ruleParameterType_Impl EOF )
            // InternalSystem.g:2739:2: iv_ruleParameterType_Impl= ruleParameterType_Impl EOF
            {
             newCompositeNode(grammarAccess.getParameterType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterType_Impl=ruleParameterType_Impl();

            state._fsp--;

             current =iv_ruleParameterType_Impl; 
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
    // $ANTLR end "entryRuleParameterType_Impl"


    // $ANTLR start "ruleParameterType_Impl"
    // InternalSystem.g:2745:1: ruleParameterType_Impl returns [EObject current=null] : ( () otherlv_1= 'ParameterType' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleParameterType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSystem.g:2751:2: ( ( () otherlv_1= 'ParameterType' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalSystem.g:2752:2: ( () otherlv_1= 'ParameterType' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalSystem.g:2752:2: ( () otherlv_1= 'ParameterType' ( (lv_name_2_0= ruleEString ) ) )
            // InternalSystem.g:2753:3: () otherlv_1= 'ParameterType' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalSystem.g:2753:3: ()
            // InternalSystem.g:2754:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterType_ImplAccess().getParameterTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterType_ImplAccess().getParameterTypeKeyword_1());
            		
            // InternalSystem.g:2764:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSystem.g:2765:4: (lv_name_2_0= ruleEString )
            {
            // InternalSystem.g:2765:4: (lv_name_2_0= ruleEString )
            // InternalSystem.g:2766:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterType_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterType_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"edu.kit.ipd.sdq.mdsdpc.system.System.EString");
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
    // $ANTLR end "ruleParameterType_Impl"


    // $ANTLR start "entryRuleSimple"
    // InternalSystem.g:2787:1: entryRuleSimple returns [EObject current=null] : iv_ruleSimple= ruleSimple EOF ;
    public final EObject entryRuleSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimple = null;


        try {
            // InternalSystem.g:2787:47: (iv_ruleSimple= ruleSimple EOF )
            // InternalSystem.g:2788:2: iv_ruleSimple= ruleSimple EOF
            {
             newCompositeNode(grammarAccess.getSimpleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimple=ruleSimple();

            state._fsp--;

             current =iv_ruleSimple; 
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
    // $ANTLR end "entryRuleSimple"


    // $ANTLR start "ruleSimple"
    // InternalSystem.g:2794:1: ruleSimple returns [EObject current=null] : ( () otherlv_1= 'Simple' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleSimple() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_kind_5_0 = null;



        	enterRule();

        try {
            // InternalSystem.g:2800:2: ( ( () otherlv_1= 'Simple' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) ) )? otherlv_6= '}' ) )
            // InternalSystem.g:2801:2: ( () otherlv_1= 'Simple' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) ) )? otherlv_6= '}' )
            {
            // InternalSystem.g:2801:2: ( () otherlv_1= 'Simple' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) ) )? otherlv_6= '}' )
            // InternalSystem.g:2802:3: () otherlv_1= 'Simple' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) ) )? otherlv_6= '}'
            {
            // InternalSystem.g:2802:3: ()
            // InternalSystem.g:2803:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleAccess().getSimpleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,61,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleAccess().getSimpleKeyword_1());
            		
            // InternalSystem.g:2813:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSystem.g:2814:4: (lv_name_2_0= ruleEString )
            {
            // InternalSystem.g:2814:4: (lv_name_2_0= ruleEString )
            // InternalSystem.g:2815:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSimpleAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"edu.kit.ipd.sdq.mdsdpc.system.System.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_55); 

            			newLeafNode(otherlv_3, grammarAccess.getSimpleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSystem.g:2836:3: (otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==62) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSystem.g:2837:4: otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) )
                    {
                    otherlv_4=(Token)match(input,62,FOLLOW_56); 

                    				newLeafNode(otherlv_4, grammarAccess.getSimpleAccess().getKindKeyword_4_0());
                    			
                    // InternalSystem.g:2841:4: ( (lv_kind_5_0= rulesimpleTypes ) )
                    // InternalSystem.g:2842:5: (lv_kind_5_0= rulesimpleTypes )
                    {
                    // InternalSystem.g:2842:5: (lv_kind_5_0= rulesimpleTypes )
                    // InternalSystem.g:2843:6: lv_kind_5_0= rulesimpleTypes
                    {

                    						newCompositeNode(grammarAccess.getSimpleAccess().getKindSimpleTypesEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_kind_5_0=rulesimpleTypes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_5_0,
                    							"edu.kit.ipd.sdq.mdsdpc.system.System.simpleTypes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSimpleAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleSimple"


    // $ANTLR start "entryRuleComplex"
    // InternalSystem.g:2869:1: entryRuleComplex returns [EObject current=null] : iv_ruleComplex= ruleComplex EOF ;
    public final EObject entryRuleComplex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplex = null;


        try {
            // InternalSystem.g:2869:48: (iv_ruleComplex= ruleComplex EOF )
            // InternalSystem.g:2870:2: iv_ruleComplex= ruleComplex EOF
            {
             newCompositeNode(grammarAccess.getComplexRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplex=ruleComplex();

            state._fsp--;

             current =iv_ruleComplex; 
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
    // $ANTLR end "entryRuleComplex"


    // $ANTLR start "ruleComplex"
    // InternalSystem.g:2876:1: ruleComplex returns [EObject current=null] : (otherlv_0= 'Complex' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'simple' otherlv_4= '{' ( (lv_simple_5_0= ruleSimple ) ) (otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) ) )* otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleComplex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_simple_5_0 = null;

        EObject lv_simple_7_0 = null;



        	enterRule();

        try {
            // InternalSystem.g:2882:2: ( (otherlv_0= 'Complex' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'simple' otherlv_4= '{' ( (lv_simple_5_0= ruleSimple ) ) (otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) ) )* otherlv_8= '}' otherlv_9= '}' ) )
            // InternalSystem.g:2883:2: (otherlv_0= 'Complex' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'simple' otherlv_4= '{' ( (lv_simple_5_0= ruleSimple ) ) (otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) ) )* otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalSystem.g:2883:2: (otherlv_0= 'Complex' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'simple' otherlv_4= '{' ( (lv_simple_5_0= ruleSimple ) ) (otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) ) )* otherlv_8= '}' otherlv_9= '}' )
            // InternalSystem.g:2884:3: otherlv_0= 'Complex' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'simple' otherlv_4= '{' ( (lv_simple_5_0= ruleSimple ) ) (otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) ) )* otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getComplexAccess().getComplexKeyword_0());
            		
            // InternalSystem.g:2888:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSystem.g:2889:4: (lv_name_1_0= ruleEString )
            {
            // InternalSystem.g:2889:4: (lv_name_1_0= ruleEString )
            // InternalSystem.g:2890:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComplexAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.kit.ipd.sdq.mdsdpc.system.System.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_57); 

            			newLeafNode(otherlv_2, grammarAccess.getComplexAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,64,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getComplexAccess().getSimpleKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_58); 

            			newLeafNode(otherlv_4, grammarAccess.getComplexAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSystem.g:2919:3: ( (lv_simple_5_0= ruleSimple ) )
            // InternalSystem.g:2920:4: (lv_simple_5_0= ruleSimple )
            {
            // InternalSystem.g:2920:4: (lv_simple_5_0= ruleSimple )
            // InternalSystem.g:2921:5: lv_simple_5_0= ruleSimple
            {

            					newCompositeNode(grammarAccess.getComplexAccess().getSimpleSimpleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_simple_5_0=ruleSimple();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexRule());
            					}
            					add(
            						current,
            						"simple",
            						lv_simple_5_0,
            						"edu.kit.ipd.sdq.mdsdpc.system.System.Simple");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSystem.g:2938:3: (otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==15) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalSystem.g:2939:4: otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_58); 

            	    				newLeafNode(otherlv_6, grammarAccess.getComplexAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalSystem.g:2943:4: ( (lv_simple_7_0= ruleSimple ) )
            	    // InternalSystem.g:2944:5: (lv_simple_7_0= ruleSimple )
            	    {
            	    // InternalSystem.g:2944:5: (lv_simple_7_0= ruleSimple )
            	    // InternalSystem.g:2945:6: lv_simple_7_0= ruleSimple
            	    {

            	    						newCompositeNode(grammarAccess.getComplexAccess().getSimpleSimpleParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_simple_7_0=ruleSimple();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComplexRule());
            	    						}
            	    						add(
            	    							current,
            	    							"simple",
            	    							lv_simple_7_0,
            	    							"edu.kit.ipd.sdq.mdsdpc.system.System.Simple");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_8=(Token)match(input,19,FOLLOW_22); 

            			newLeafNode(otherlv_8, grammarAccess.getComplexAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getComplexAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleComplex"


    // $ANTLR start "entryRuleVoid"
    // InternalSystem.g:2975:1: entryRuleVoid returns [EObject current=null] : iv_ruleVoid= ruleVoid EOF ;
    public final EObject entryRuleVoid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoid = null;


        try {
            // InternalSystem.g:2975:45: (iv_ruleVoid= ruleVoid EOF )
            // InternalSystem.g:2976:2: iv_ruleVoid= ruleVoid EOF
            {
             newCompositeNode(grammarAccess.getVoidRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVoid=ruleVoid();

            state._fsp--;

             current =iv_ruleVoid; 
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
    // $ANTLR end "entryRuleVoid"


    // $ANTLR start "ruleVoid"
    // InternalSystem.g:2982:1: ruleVoid returns [EObject current=null] : ( () otherlv_1= 'Void' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleVoid() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSystem.g:2988:2: ( ( () otherlv_1= 'Void' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalSystem.g:2989:2: ( () otherlv_1= 'Void' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalSystem.g:2989:2: ( () otherlv_1= 'Void' ( (lv_name_2_0= ruleEString ) ) )
            // InternalSystem.g:2990:3: () otherlv_1= 'Void' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalSystem.g:2990:3: ()
            // InternalSystem.g:2991:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVoidAccess().getVoidAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getVoidAccess().getVoidKeyword_1());
            		
            // InternalSystem.g:3001:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSystem.g:3002:4: (lv_name_2_0= ruleEString )
            {
            // InternalSystem.g:3002:4: (lv_name_2_0= ruleEString )
            // InternalSystem.g:3003:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVoidAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVoidRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"edu.kit.ipd.sdq.mdsdpc.system.System.EString");
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
    // $ANTLR end "ruleVoid"


    // $ANTLR start "entryRuleDelegationConnector"
    // InternalSystem.g:3024:1: entryRuleDelegationConnector returns [EObject current=null] : iv_ruleDelegationConnector= ruleDelegationConnector EOF ;
    public final EObject entryRuleDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelegationConnector = null;


        try {
            // InternalSystem.g:3024:60: (iv_ruleDelegationConnector= ruleDelegationConnector EOF )
            // InternalSystem.g:3025:2: iv_ruleDelegationConnector= ruleDelegationConnector EOF
            {
             newCompositeNode(grammarAccess.getDelegationConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelegationConnector=ruleDelegationConnector();

            state._fsp--;

             current =iv_ruleDelegationConnector; 
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
    // $ANTLR end "entryRuleDelegationConnector"


    // $ANTLR start "ruleDelegationConnector"
    // InternalSystem.g:3031:1: ruleDelegationConnector returns [EObject current=null] : (otherlv_0= 'DelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) ;
    public final EObject ruleDelegationConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSystem.g:3037:2: ( (otherlv_0= 'DelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) )
            // InternalSystem.g:3038:2: (otherlv_0= 'DelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            {
            // InternalSystem.g:3038:2: (otherlv_0= 'DelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            // InternalSystem.g:3039:3: otherlv_0= 'DelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDelegationConnectorAccess().getDelegationConnectorKeyword_0());
            		
            // InternalSystem.g:3043:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSystem.g:3044:4: (lv_name_1_0= ruleEString )
            {
            // InternalSystem.g:3044:4: (lv_name_1_0= ruleEString )
            // InternalSystem.g:3045:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDelegationConnectorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDelegationConnectorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.kit.ipd.sdq.mdsdpc.system.System.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_59); 

            			newLeafNode(otherlv_2, grammarAccess.getDelegationConnectorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,67,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getDelegationConnectorAccess().getRoleKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getDelegationConnectorAccess().getLeftParenthesisKeyword_4());
            		
            // InternalSystem.g:3074:3: ( ( ruleEString ) )
            // InternalSystem.g:3075:4: ( ruleEString )
            {
            // InternalSystem.g:3075:4: ( ruleEString )
            // InternalSystem.g:3076:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDelegationConnectorAccess().getRoleRoleCrossReference_5_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSystem.g:3090:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==15) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalSystem.g:3091:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_6, grammarAccess.getDelegationConnectorAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalSystem.g:3095:4: ( ( ruleEString ) )
            	    // InternalSystem.g:3096:5: ( ruleEString )
            	    {
            	    // InternalSystem.g:3096:5: ( ruleEString )
            	    // InternalSystem.g:3097:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDelegationConnectorRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getDelegationConnectorAccess().getRoleRoleCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_22); 

            			newLeafNode(otherlv_8, grammarAccess.getDelegationConnectorAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getDelegationConnectorAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleDelegationConnector"


    // $ANTLR start "entryRuleRole_Impl"
    // InternalSystem.g:3124:1: entryRuleRole_Impl returns [EObject current=null] : iv_ruleRole_Impl= ruleRole_Impl EOF ;
    public final EObject entryRuleRole_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole_Impl = null;


        try {
            // InternalSystem.g:3124:50: (iv_ruleRole_Impl= ruleRole_Impl EOF )
            // InternalSystem.g:3125:2: iv_ruleRole_Impl= ruleRole_Impl EOF
            {
             newCompositeNode(grammarAccess.getRole_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole_Impl=ruleRole_Impl();

            state._fsp--;

             current =iv_ruleRole_Impl; 
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
    // $ANTLR end "entryRuleRole_Impl"


    // $ANTLR start "ruleRole_Impl"
    // InternalSystem.g:3131:1: ruleRole_Impl returns [EObject current=null] : (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleRole_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSystem.g:3137:2: ( (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalSystem.g:3138:2: (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalSystem.g:3138:2: (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalSystem.g:3139:3: otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRole_ImplAccess().getRoleKeyword_0());
            		
            // InternalSystem.g:3143:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSystem.g:3144:4: (lv_name_1_0= ruleEString )
            {
            // InternalSystem.g:3144:4: (lv_name_1_0= ruleEString )
            // InternalSystem.g:3145:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRole_ImplAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRole_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.kit.ipd.sdq.mdsdpc.system.System.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getRole_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,34,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getRole_ImplAccess().getInterfaceKeyword_3());
            		
            // InternalSystem.g:3170:3: ( ( ruleEString ) )
            // InternalSystem.g:3171:4: ( ruleEString )
            {
            // InternalSystem.g:3171:4: ( ruleEString )
            // InternalSystem.g:3172:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRole_ImplRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRole_ImplAccess().getInterfaceInterfaceCrossReference_4_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRole_ImplAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRole_Impl"


    // $ANTLR start "entryRuleInterface"
    // InternalSystem.g:3194:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalSystem.g:3194:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalSystem.g:3195:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalSystem.g:3201:1: ruleInterface returns [EObject current=null] : ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signature' otherlv_5= '{' ( (lv_signature_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signature_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_signature_6_0 = null;

        EObject lv_signature_8_0 = null;



        	enterRule();

        try {
            // InternalSystem.g:3207:2: ( ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signature' otherlv_5= '{' ( (lv_signature_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signature_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalSystem.g:3208:2: ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signature' otherlv_5= '{' ( (lv_signature_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signature_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalSystem.g:3208:2: ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signature' otherlv_5= '{' ( (lv_signature_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signature_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalSystem.g:3209:3: () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signature' otherlv_5= '{' ( (lv_signature_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signature_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalSystem.g:3209:3: ()
            // InternalSystem.g:3210:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInterfaceAccess().getInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,69,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getInterfaceKeyword_1());
            		
            // InternalSystem.g:3220:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSystem.g:3221:4: (lv_name_2_0= ruleEString )
            {
            // InternalSystem.g:3221:4: (lv_name_2_0= ruleEString )
            // InternalSystem.g:3222:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInterfaceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInterfaceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"edu.kit.ipd.sdq.mdsdpc.system.System.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_60); 

            			newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSystem.g:3243:3: (otherlv_4= 'signature' otherlv_5= '{' ( (lv_signature_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signature_8_0= ruleSignature ) ) )* otherlv_9= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==70) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSystem.g:3244:4: otherlv_4= 'signature' otherlv_5= '{' ( (lv_signature_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signature_8_0= ruleSignature ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,70,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getInterfaceAccess().getSignatureKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_61); 

                    				newLeafNode(otherlv_5, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSystem.g:3252:4: ( (lv_signature_6_0= ruleSignature ) )
                    // InternalSystem.g:3253:5: (lv_signature_6_0= ruleSignature )
                    {
                    // InternalSystem.g:3253:5: (lv_signature_6_0= ruleSignature )
                    // InternalSystem.g:3254:6: lv_signature_6_0= ruleSignature
                    {

                    						newCompositeNode(grammarAccess.getInterfaceAccess().getSignatureSignatureParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_signature_6_0=ruleSignature();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"signature",
                    							lv_signature_6_0,
                    							"edu.kit.ipd.sdq.mdsdpc.system.System.Signature");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSystem.g:3271:4: (otherlv_7= ',' ( (lv_signature_8_0= ruleSignature ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==15) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalSystem.g:3272:5: otherlv_7= ',' ( (lv_signature_8_0= ruleSignature ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_61); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getInterfaceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSystem.g:3276:5: ( (lv_signature_8_0= ruleSignature ) )
                    	    // InternalSystem.g:3277:6: (lv_signature_8_0= ruleSignature )
                    	    {
                    	    // InternalSystem.g:3277:6: (lv_signature_8_0= ruleSignature )
                    	    // InternalSystem.g:3278:7: lv_signature_8_0= ruleSignature
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterfaceAccess().getSignatureSignatureParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_signature_8_0=ruleSignature();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"signature",
                    	    								lv_signature_8_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.system.System.Signature");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,19,FOLLOW_22); 

                    				newLeafNode(otherlv_9, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleAllocationContext"
    // InternalSystem.g:3309:1: entryRuleAllocationContext returns [EObject current=null] : iv_ruleAllocationContext= ruleAllocationContext EOF ;
    public final EObject entryRuleAllocationContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocationContext = null;


        try {
            // InternalSystem.g:3309:58: (iv_ruleAllocationContext= ruleAllocationContext EOF )
            // InternalSystem.g:3310:2: iv_ruleAllocationContext= ruleAllocationContext EOF
            {
             newCompositeNode(grammarAccess.getAllocationContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllocationContext=ruleAllocationContext();

            state._fsp--;

             current =iv_ruleAllocationContext; 
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
    // $ANTLR end "entryRuleAllocationContext"


    // $ANTLR start "ruleAllocationContext"
    // InternalSystem.g:3316:1: ruleAllocationContext returns [EObject current=null] : (otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'container' ( ( ruleEString ) ) otherlv_4= 'assemblycontext' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleAllocationContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSystem.g:3322:2: ( (otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'container' ( ( ruleEString ) ) otherlv_4= 'assemblycontext' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalSystem.g:3323:2: (otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'container' ( ( ruleEString ) ) otherlv_4= 'assemblycontext' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalSystem.g:3323:2: (otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'container' ( ( ruleEString ) ) otherlv_4= 'assemblycontext' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalSystem.g:3324:3: otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'container' ( ( ruleEString ) ) otherlv_4= 'assemblycontext' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAllocationContextAccess().getAllocationContextKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_62); 

            			newLeafNode(otherlv_1, grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getAllocationContextAccess().getContainerKeyword_2());
            		
            // InternalSystem.g:3336:3: ( ( ruleEString ) )
            // InternalSystem.g:3337:4: ( ruleEString )
            {
            // InternalSystem.g:3337:4: ( ruleEString )
            // InternalSystem.g:3338:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getContainerContainerCrossReference_3_0());
            				
            pushFollow(FOLLOW_48);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getAllocationContextAccess().getAssemblycontextKeyword_4());
            		
            // InternalSystem.g:3356:3: ( ( ruleEString ) )
            // InternalSystem.g:3357:4: ( ruleEString )
            {
            // InternalSystem.g:3357:4: ( ruleEString )
            // InternalSystem.g:3358:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getAssemblycontextAssemblyContextCrossReference_5_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAllocationContextAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleAllocationContext"


    // $ANTLR start "entryRuleContainer"
    // InternalSystem.g:3380:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalSystem.g:3380:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalSystem.g:3381:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalSystem.g:3387:1: ruleContainer returns [EObject current=null] : ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSystem.g:3393:2: ( ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalSystem.g:3394:2: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalSystem.g:3394:2: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) )
            // InternalSystem.g:3395:3: () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalSystem.g:3395:3: ()
            // InternalSystem.g:3396:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContainerAccess().getContainerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,72,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getContainerKeyword_1());
            		
            // InternalSystem.g:3406:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSystem.g:3407:4: (lv_name_2_0= ruleEString )
            {
            // InternalSystem.g:3407:4: (lv_name_2_0= ruleEString )
            // InternalSystem.g:3408:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"edu.kit.ipd.sdq.mdsdpc.system.System.EString");
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
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleLink"
    // InternalSystem.g:3429:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalSystem.g:3429:45: (iv_ruleLink= ruleLink EOF )
            // InternalSystem.g:3430:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalSystem.g:3436:1: ruleLink returns [EObject current=null] : (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'container' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSystem.g:3442:2: ( (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'container' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) )
            // InternalSystem.g:3443:2: (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'container' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            {
            // InternalSystem.g:3443:2: (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'container' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            // InternalSystem.g:3444:3: otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'container' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalSystem.g:3448:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSystem.g:3449:4: (lv_name_1_0= ruleEString )
            {
            // InternalSystem.g:3449:4: (lv_name_1_0= ruleEString )
            // InternalSystem.g:3450:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLinkAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinkRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.kit.ipd.sdq.mdsdpc.system.System.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_62); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getContainerKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getLeftParenthesisKeyword_4());
            		
            // InternalSystem.g:3479:3: ( ( ruleEString ) )
            // InternalSystem.g:3480:4: ( ruleEString )
            {
            // InternalSystem.g:3480:4: ( ruleEString )
            // InternalSystem.g:3481:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLinkAccess().getContainerContainerCrossReference_5_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSystem.g:3495:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==15) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalSystem.g:3496:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalSystem.g:3500:4: ( ( ruleEString ) )
            	    // InternalSystem.g:3501:5: ( ruleEString )
            	    {
            	    // InternalSystem.g:3501:5: ( ruleEString )
            	    // InternalSystem.g:3502:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLinkRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getLinkAccess().getContainerContainerCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_22); 

            			newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleLink"


    // $ANTLR start "rulesimpleTypes"
    // InternalSystem.g:3529:1: rulesimpleTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'list' ) | (enumLiteral_7= 'long' ) | (enumLiteral_8= 'map' ) | (enumLiteral_9= 'string' ) ) ;
    public final Enumerator rulesimpleTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;


        	enterRule();

        try {
            // InternalSystem.g:3535:2: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'list' ) | (enumLiteral_7= 'long' ) | (enumLiteral_8= 'map' ) | (enumLiteral_9= 'string' ) ) )
            // InternalSystem.g:3536:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'list' ) | (enumLiteral_7= 'long' ) | (enumLiteral_8= 'map' ) | (enumLiteral_9= 'string' ) )
            {
            // InternalSystem.g:3536:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'list' ) | (enumLiteral_7= 'long' ) | (enumLiteral_8= 'map' ) | (enumLiteral_9= 'string' ) )
            int alt50=10;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt50=1;
                }
                break;
            case 75:
                {
                alt50=2;
                }
                break;
            case 76:
                {
                alt50=3;
                }
                break;
            case 77:
                {
                alt50=4;
                }
                break;
            case 78:
                {
                alt50=5;
                }
                break;
            case 79:
                {
                alt50=6;
                }
                break;
            case 80:
                {
                alt50=7;
                }
                break;
            case 81:
                {
                alt50=8;
                }
                break;
            case 82:
                {
                alt50=9;
                }
                break;
            case 83:
                {
                alt50=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalSystem.g:3537:3: (enumLiteral_0= 'int' )
                    {
                    // InternalSystem.g:3537:3: (enumLiteral_0= 'int' )
                    // InternalSystem.g:3538:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getIntEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSimpleTypesAccess().getIntEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSystem.g:3545:3: (enumLiteral_1= 'boolean' )
                    {
                    // InternalSystem.g:3545:3: (enumLiteral_1= 'boolean' )
                    // InternalSystem.g:3546:4: enumLiteral_1= 'boolean'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getBooleanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSimpleTypesAccess().getBooleanEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSystem.g:3553:3: (enumLiteral_2= 'char' )
                    {
                    // InternalSystem.g:3553:3: (enumLiteral_2= 'char' )
                    // InternalSystem.g:3554:4: enumLiteral_2= 'char'
                    {
                    enumLiteral_2=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getCharEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSimpleTypesAccess().getCharEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSystem.g:3561:3: (enumLiteral_3= 'date' )
                    {
                    // InternalSystem.g:3561:3: (enumLiteral_3= 'date' )
                    // InternalSystem.g:3562:4: enumLiteral_3= 'date'
                    {
                    enumLiteral_3=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getDateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSimpleTypesAccess().getDateEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSystem.g:3569:3: (enumLiteral_4= 'double' )
                    {
                    // InternalSystem.g:3569:3: (enumLiteral_4= 'double' )
                    // InternalSystem.g:3570:4: enumLiteral_4= 'double'
                    {
                    enumLiteral_4=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getDoubleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSimpleTypesAccess().getDoubleEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSystem.g:3577:3: (enumLiteral_5= 'float' )
                    {
                    // InternalSystem.g:3577:3: (enumLiteral_5= 'float' )
                    // InternalSystem.g:3578:4: enumLiteral_5= 'float'
                    {
                    enumLiteral_5=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getFloatEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSimpleTypesAccess().getFloatEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSystem.g:3585:3: (enumLiteral_6= 'list' )
                    {
                    // InternalSystem.g:3585:3: (enumLiteral_6= 'list' )
                    // InternalSystem.g:3586:4: enumLiteral_6= 'list'
                    {
                    enumLiteral_6=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getListEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getSimpleTypesAccess().getListEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSystem.g:3593:3: (enumLiteral_7= 'long' )
                    {
                    // InternalSystem.g:3593:3: (enumLiteral_7= 'long' )
                    // InternalSystem.g:3594:4: enumLiteral_7= 'long'
                    {
                    enumLiteral_7=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getLongEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getSimpleTypesAccess().getLongEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalSystem.g:3601:3: (enumLiteral_8= 'map' )
                    {
                    // InternalSystem.g:3601:3: (enumLiteral_8= 'map' )
                    // InternalSystem.g:3602:4: enumLiteral_8= 'map'
                    {
                    enumLiteral_8=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getMapEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getSimpleTypesAccess().getMapEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalSystem.g:3609:3: (enumLiteral_9= 'string' )
                    {
                    // InternalSystem.g:3609:3: (enumLiteral_9= 'string' )
                    // InternalSystem.g:3610:4: enumLiteral_9= 'string'
                    {
                    enumLiteral_9=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getStringEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getSimpleTypesAccess().getStringEnumLiteralDeclaration_9());
                    			

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
    // $ANTLR end "rulesimpleTypes"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000760000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000740000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0xB800000008000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000404080000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000810000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000003000080000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002000080000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000100000080000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x003E000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0100000000080000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x4000000000080000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x00000000000FFC00L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000001000000000L});

}