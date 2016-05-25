package edu.kit.ipd.sdq.mdsdpc.mydsl.parser.antlr.internal;

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
import edu.kit.ipd.sdq.mdsdpc.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ComponentBasedSystem'", "'{'", "'interface'", "'('", "','", "')'", "'environment'", "'repository'", "'allocation'", "'assemblycontext'", "'}'", "'type'", "'assemblyconnector'", "'Interface'", "'signature'", "'AssemblyContext'", "'component'", "'Type'", "'AssemblyConnector'", "'providedrole'", "'requiredrole'", "'Signature'", "'returntype'", "'parameter'", "'Parameter'", "'parametertype'", "'ReturnType'", "'ParameterType'", "'Simple'", "'kind'", "'Complex'", "'simple'", "'Void'", "'Component'", "'behaviourdescription'", "'service'", "'BehaviourDescription'", "'Service'", "'correspondingSignatures'", "'RequiredRole'", "'ProvidedRole'", "'CompositeComponent'", "'delegationconnector'", "'InternalAction'", "'ExternalCall'", "'Loop'", "'Branch'", "'DelegationConnector'", "'role'", "'Role'", "'Container'", "'Link'", "'container'", "'AllocationContext'", "'int'", "'boolean'", "'char'", "'date'", "'double'", "'float'", "'list'", "'long'", "'map'", "'string'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ComponentBasedSystem";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleComponentBasedSystem"
    // InternalMyDsl.g:65:1: entryRuleComponentBasedSystem returns [EObject current=null] : iv_ruleComponentBasedSystem= ruleComponentBasedSystem EOF ;
    public final EObject entryRuleComponentBasedSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentBasedSystem = null;


        try {
            // InternalMyDsl.g:65:61: (iv_ruleComponentBasedSystem= ruleComponentBasedSystem EOF )
            // InternalMyDsl.g:66:2: iv_ruleComponentBasedSystem= ruleComponentBasedSystem EOF
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
    // InternalMyDsl.g:72:1: ruleComponentBasedSystem returns [EObject current=null] : (otherlv_0= 'ComponentBasedSystem' otherlv_1= '{' otherlv_2= 'interface' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'environment' ( ( ruleEString ) ) (otherlv_10= 'repository' ( ( ruleEString ) ) )? (otherlv_12= 'allocation' ( ( ruleEString ) ) )? (otherlv_14= 'assemblycontext' otherlv_15= '{' ( (lv_assemblycontext_16_0= ruleAssemblyContext ) ) (otherlv_17= ',' ( (lv_assemblycontext_18_0= ruleAssemblyContext ) ) )* otherlv_19= '}' )? (otherlv_20= 'type' otherlv_21= '{' ( (lv_type_22_0= ruleType ) ) (otherlv_23= ',' ( (lv_type_24_0= ruleType ) ) )* otherlv_25= '}' )? (otherlv_26= 'assemblyconnector' otherlv_27= '{' ( (lv_assemblyconnector_28_0= ruleAssemblyConnector ) ) (otherlv_29= ',' ( (lv_assemblyconnector_30_0= ruleAssemblyConnector ) ) )* otherlv_31= '}' )? otherlv_32= '}' ) ;
    public final EObject ruleComponentBasedSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
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
        EObject lv_assemblycontext_16_0 = null;

        EObject lv_assemblycontext_18_0 = null;

        EObject lv_type_22_0 = null;

        EObject lv_type_24_0 = null;

        EObject lv_assemblyconnector_28_0 = null;

        EObject lv_assemblyconnector_30_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( (otherlv_0= 'ComponentBasedSystem' otherlv_1= '{' otherlv_2= 'interface' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'environment' ( ( ruleEString ) ) (otherlv_10= 'repository' ( ( ruleEString ) ) )? (otherlv_12= 'allocation' ( ( ruleEString ) ) )? (otherlv_14= 'assemblycontext' otherlv_15= '{' ( (lv_assemblycontext_16_0= ruleAssemblyContext ) ) (otherlv_17= ',' ( (lv_assemblycontext_18_0= ruleAssemblyContext ) ) )* otherlv_19= '}' )? (otherlv_20= 'type' otherlv_21= '{' ( (lv_type_22_0= ruleType ) ) (otherlv_23= ',' ( (lv_type_24_0= ruleType ) ) )* otherlv_25= '}' )? (otherlv_26= 'assemblyconnector' otherlv_27= '{' ( (lv_assemblyconnector_28_0= ruleAssemblyConnector ) ) (otherlv_29= ',' ( (lv_assemblyconnector_30_0= ruleAssemblyConnector ) ) )* otherlv_31= '}' )? otherlv_32= '}' ) )
            // InternalMyDsl.g:79:2: (otherlv_0= 'ComponentBasedSystem' otherlv_1= '{' otherlv_2= 'interface' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'environment' ( ( ruleEString ) ) (otherlv_10= 'repository' ( ( ruleEString ) ) )? (otherlv_12= 'allocation' ( ( ruleEString ) ) )? (otherlv_14= 'assemblycontext' otherlv_15= '{' ( (lv_assemblycontext_16_0= ruleAssemblyContext ) ) (otherlv_17= ',' ( (lv_assemblycontext_18_0= ruleAssemblyContext ) ) )* otherlv_19= '}' )? (otherlv_20= 'type' otherlv_21= '{' ( (lv_type_22_0= ruleType ) ) (otherlv_23= ',' ( (lv_type_24_0= ruleType ) ) )* otherlv_25= '}' )? (otherlv_26= 'assemblyconnector' otherlv_27= '{' ( (lv_assemblyconnector_28_0= ruleAssemblyConnector ) ) (otherlv_29= ',' ( (lv_assemblyconnector_30_0= ruleAssemblyConnector ) ) )* otherlv_31= '}' )? otherlv_32= '}' )
            {
            // InternalMyDsl.g:79:2: (otherlv_0= 'ComponentBasedSystem' otherlv_1= '{' otherlv_2= 'interface' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'environment' ( ( ruleEString ) ) (otherlv_10= 'repository' ( ( ruleEString ) ) )? (otherlv_12= 'allocation' ( ( ruleEString ) ) )? (otherlv_14= 'assemblycontext' otherlv_15= '{' ( (lv_assemblycontext_16_0= ruleAssemblyContext ) ) (otherlv_17= ',' ( (lv_assemblycontext_18_0= ruleAssemblyContext ) ) )* otherlv_19= '}' )? (otherlv_20= 'type' otherlv_21= '{' ( (lv_type_22_0= ruleType ) ) (otherlv_23= ',' ( (lv_type_24_0= ruleType ) ) )* otherlv_25= '}' )? (otherlv_26= 'assemblyconnector' otherlv_27= '{' ( (lv_assemblyconnector_28_0= ruleAssemblyConnector ) ) (otherlv_29= ',' ( (lv_assemblyconnector_30_0= ruleAssemblyConnector ) ) )* otherlv_31= '}' )? otherlv_32= '}' )
            // InternalMyDsl.g:80:3: otherlv_0= 'ComponentBasedSystem' otherlv_1= '{' otherlv_2= 'interface' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'environment' ( ( ruleEString ) ) (otherlv_10= 'repository' ( ( ruleEString ) ) )? (otherlv_12= 'allocation' ( ( ruleEString ) ) )? (otherlv_14= 'assemblycontext' otherlv_15= '{' ( (lv_assemblycontext_16_0= ruleAssemblyContext ) ) (otherlv_17= ',' ( (lv_assemblycontext_18_0= ruleAssemblyContext ) ) )* otherlv_19= '}' )? (otherlv_20= 'type' otherlv_21= '{' ( (lv_type_22_0= ruleType ) ) (otherlv_23= ',' ( (lv_type_24_0= ruleType ) ) )* otherlv_25= '}' )? (otherlv_26= 'assemblyconnector' otherlv_27= '{' ( (lv_assemblyconnector_28_0= ruleAssemblyConnector ) ) (otherlv_29= ',' ( (lv_assemblyconnector_30_0= ruleAssemblyConnector ) ) )* otherlv_31= '}' )? otherlv_32= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentBasedSystemAccess().getComponentBasedSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentBasedSystemAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentBasedSystemAccess().getInterfaceKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentBasedSystemAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMyDsl.g:96:3: ( ( ruleEString ) )
            // InternalMyDsl.g:97:4: ( ruleEString )
            {
            // InternalMyDsl.g:97:4: ( ruleEString )
            // InternalMyDsl.g:98:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentBasedSystemRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getInterfaceInterfaceCrossReference_4_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:112:3: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:113:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_5, grammarAccess.getComponentBasedSystemAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalMyDsl.g:117:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:118:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:118:5: ( ruleEString )
            	    // InternalMyDsl.g:119:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getComponentBasedSystemRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getInterfaceInterfaceCrossReference_5_1_0());
            	    					
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
            		
            otherlv_8=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getComponentBasedSystemAccess().getEnvironmentKeyword_7());
            		
            // InternalMyDsl.g:142:3: ( ( ruleEString ) )
            // InternalMyDsl.g:143:4: ( ruleEString )
            {
            // InternalMyDsl.g:143:4: ( ruleEString )
            // InternalMyDsl.g:144:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentBasedSystemRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getEnvironmentEnvironmentCrossReference_8_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:158:3: (otherlv_10= 'repository' ( ( ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:159:4: otherlv_10= 'repository' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getComponentBasedSystemAccess().getRepositoryKeyword_9_0());
                    			
                    // InternalMyDsl.g:163:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:164:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:164:5: ( ruleEString )
                    // InternalMyDsl.g:165:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentBasedSystemRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getRepositoryRepositoryCrossReference_9_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:180:3: (otherlv_12= 'allocation' ( ( ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:181:4: otherlv_12= 'allocation' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_12, grammarAccess.getComponentBasedSystemAccess().getAllocationKeyword_10_0());
                    			
                    // InternalMyDsl.g:185:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:186:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:186:5: ( ruleEString )
                    // InternalMyDsl.g:187:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentBasedSystemRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getAllocationAllocationCrossReference_10_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:202:3: (otherlv_14= 'assemblycontext' otherlv_15= '{' ( (lv_assemblycontext_16_0= ruleAssemblyContext ) ) (otherlv_17= ',' ( (lv_assemblycontext_18_0= ruleAssemblyContext ) ) )* otherlv_19= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:203:4: otherlv_14= 'assemblycontext' otherlv_15= '{' ( (lv_assemblycontext_16_0= ruleAssemblyContext ) ) (otherlv_17= ',' ( (lv_assemblycontext_18_0= ruleAssemblyContext ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getComponentBasedSystemAccess().getAssemblycontextKeyword_11_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_15, grammarAccess.getComponentBasedSystemAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalMyDsl.g:211:4: ( (lv_assemblycontext_16_0= ruleAssemblyContext ) )
                    // InternalMyDsl.g:212:5: (lv_assemblycontext_16_0= ruleAssemblyContext )
                    {
                    // InternalMyDsl.g:212:5: (lv_assemblycontext_16_0= ruleAssemblyContext )
                    // InternalMyDsl.g:213:6: lv_assemblycontext_16_0= ruleAssemblyContext
                    {

                    						newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getAssemblycontextAssemblyContextParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_assemblycontext_16_0=ruleAssemblyContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentBasedSystemRule());
                    						}
                    						add(
                    							current,
                    							"assemblycontext",
                    							lv_assemblycontext_16_0,
                    							"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.AssemblyContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:230:4: (otherlv_17= ',' ( (lv_assemblycontext_18_0= ruleAssemblyContext ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:231:5: otherlv_17= ',' ( (lv_assemblycontext_18_0= ruleAssemblyContext ) )
                    	    {
                    	    otherlv_17=(Token)match(input,15,FOLLOW_12); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getComponentBasedSystemAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalMyDsl.g:235:5: ( (lv_assemblycontext_18_0= ruleAssemblyContext ) )
                    	    // InternalMyDsl.g:236:6: (lv_assemblycontext_18_0= ruleAssemblyContext )
                    	    {
                    	    // InternalMyDsl.g:236:6: (lv_assemblycontext_18_0= ruleAssemblyContext )
                    	    // InternalMyDsl.g:237:7: lv_assemblycontext_18_0= ruleAssemblyContext
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getAssemblycontextAssemblyContextParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_assemblycontext_18_0=ruleAssemblyContext();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentBasedSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"assemblycontext",
                    	    								lv_assemblycontext_18_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.AssemblyContext");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_19, grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:260:3: (otherlv_20= 'type' otherlv_21= '{' ( (lv_type_22_0= ruleType ) ) (otherlv_23= ',' ( (lv_type_24_0= ruleType ) ) )* otherlv_25= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:261:4: otherlv_20= 'type' otherlv_21= '{' ( (lv_type_22_0= ruleType ) ) (otherlv_23= ',' ( (lv_type_24_0= ruleType ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_20, grammarAccess.getComponentBasedSystemAccess().getTypeKeyword_12_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_21, grammarAccess.getComponentBasedSystemAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalMyDsl.g:269:4: ( (lv_type_22_0= ruleType ) )
                    // InternalMyDsl.g:270:5: (lv_type_22_0= ruleType )
                    {
                    // InternalMyDsl.g:270:5: (lv_type_22_0= ruleType )
                    // InternalMyDsl.g:271:6: lv_type_22_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getTypeTypeParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_type_22_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentBasedSystemRule());
                    						}
                    						add(
                    							current,
                    							"type",
                    							lv_type_22_0,
                    							"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:288:4: (otherlv_23= ',' ( (lv_type_24_0= ruleType ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMyDsl.g:289:5: otherlv_23= ',' ( (lv_type_24_0= ruleType ) )
                    	    {
                    	    otherlv_23=(Token)match(input,15,FOLLOW_15); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getComponentBasedSystemAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalMyDsl.g:293:5: ( (lv_type_24_0= ruleType ) )
                    	    // InternalMyDsl.g:294:6: (lv_type_24_0= ruleType )
                    	    {
                    	    // InternalMyDsl.g:294:6: (lv_type_24_0= ruleType )
                    	    // InternalMyDsl.g:295:7: lv_type_24_0= ruleType
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getTypeTypeParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_type_24_0=ruleType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentBasedSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"type",
                    	    								lv_type_24_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.Type");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_25, grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:318:3: (otherlv_26= 'assemblyconnector' otherlv_27= '{' ( (lv_assemblyconnector_28_0= ruleAssemblyConnector ) ) (otherlv_29= ',' ( (lv_assemblyconnector_30_0= ruleAssemblyConnector ) ) )* otherlv_31= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:319:4: otherlv_26= 'assemblyconnector' otherlv_27= '{' ( (lv_assemblyconnector_28_0= ruleAssemblyConnector ) ) (otherlv_29= ',' ( (lv_assemblyconnector_30_0= ruleAssemblyConnector ) ) )* otherlv_31= '}'
                    {
                    otherlv_26=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_26, grammarAccess.getComponentBasedSystemAccess().getAssemblyconnectorKeyword_13_0());
                    			
                    otherlv_27=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_27, grammarAccess.getComponentBasedSystemAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalMyDsl.g:327:4: ( (lv_assemblyconnector_28_0= ruleAssemblyConnector ) )
                    // InternalMyDsl.g:328:5: (lv_assemblyconnector_28_0= ruleAssemblyConnector )
                    {
                    // InternalMyDsl.g:328:5: (lv_assemblyconnector_28_0= ruleAssemblyConnector )
                    // InternalMyDsl.g:329:6: lv_assemblyconnector_28_0= ruleAssemblyConnector
                    {

                    						newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getAssemblyconnectorAssemblyConnectorParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_assemblyconnector_28_0=ruleAssemblyConnector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentBasedSystemRule());
                    						}
                    						add(
                    							current,
                    							"assemblyconnector",
                    							lv_assemblyconnector_28_0,
                    							"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.AssemblyConnector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:346:4: (otherlv_29= ',' ( (lv_assemblyconnector_30_0= ruleAssemblyConnector ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==15) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMyDsl.g:347:5: otherlv_29= ',' ( (lv_assemblyconnector_30_0= ruleAssemblyConnector ) )
                    	    {
                    	    otherlv_29=(Token)match(input,15,FOLLOW_17); 

                    	    					newLeafNode(otherlv_29, grammarAccess.getComponentBasedSystemAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalMyDsl.g:351:5: ( (lv_assemblyconnector_30_0= ruleAssemblyConnector ) )
                    	    // InternalMyDsl.g:352:6: (lv_assemblyconnector_30_0= ruleAssemblyConnector )
                    	    {
                    	    // InternalMyDsl.g:352:6: (lv_assemblyconnector_30_0= ruleAssemblyConnector )
                    	    // InternalMyDsl.g:353:7: lv_assemblyconnector_30_0= ruleAssemblyConnector
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getAssemblyconnectorAssemblyConnectorParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_assemblyconnector_30_0=ruleAssemblyConnector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentBasedSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"assemblyconnector",
                    	    								lv_assemblyconnector_30_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.AssemblyConnector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_31=(Token)match(input,21,FOLLOW_18); 

                    				newLeafNode(otherlv_31, grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            otherlv_32=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_32, grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_14());
            		

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
    // InternalMyDsl.g:384:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMyDsl.g:384:45: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:385:2: iv_ruleType= ruleType EOF
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
    // InternalMyDsl.g:391:1: ruleType returns [EObject current=null] : (this_Type_Impl_0= ruleType_Impl | this_Simple_1= ruleSimple | this_Complex_2= ruleComplex | this_ParameterType_Impl_3= ruleParameterType_Impl | this_Void_4= ruleVoid | this_ReturnType_Impl_5= ruleReturnType_Impl ) ;
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
            // InternalMyDsl.g:397:2: ( (this_Type_Impl_0= ruleType_Impl | this_Simple_1= ruleSimple | this_Complex_2= ruleComplex | this_ParameterType_Impl_3= ruleParameterType_Impl | this_Void_4= ruleVoid | this_ReturnType_Impl_5= ruleReturnType_Impl ) )
            // InternalMyDsl.g:398:2: (this_Type_Impl_0= ruleType_Impl | this_Simple_1= ruleSimple | this_Complex_2= ruleComplex | this_ParameterType_Impl_3= ruleParameterType_Impl | this_Void_4= ruleVoid | this_ReturnType_Impl_5= ruleReturnType_Impl )
            {
            // InternalMyDsl.g:398:2: (this_Type_Impl_0= ruleType_Impl | this_Simple_1= ruleSimple | this_Complex_2= ruleComplex | this_ParameterType_Impl_3= ruleParameterType_Impl | this_Void_4= ruleVoid | this_ReturnType_Impl_5= ruleReturnType_Impl )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt10=1;
                }
                break;
            case 39:
                {
                alt10=2;
                }
                break;
            case 41:
                {
                alt10=3;
                }
                break;
            case 38:
                {
                alt10=4;
                }
                break;
            case 43:
                {
                alt10=5;
                }
                break;
            case 37:
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
                    // InternalMyDsl.g:399:3: this_Type_Impl_0= ruleType_Impl
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
                    // InternalMyDsl.g:408:3: this_Simple_1= ruleSimple
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
                    // InternalMyDsl.g:417:3: this_Complex_2= ruleComplex
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
                    // InternalMyDsl.g:426:3: this_ParameterType_Impl_3= ruleParameterType_Impl
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
                    // InternalMyDsl.g:435:3: this_Void_4= ruleVoid
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
                    // InternalMyDsl.g:444:3: this_ReturnType_Impl_5= ruleReturnType_Impl
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
    // InternalMyDsl.g:456:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalMyDsl.g:456:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalMyDsl.g:457:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalMyDsl.g:463:1: ruleComponent returns [EObject current=null] : (this_Component_Impl_0= ruleComponent_Impl | this_CompositeComponent_1= ruleCompositeComponent ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Component_Impl_0 = null;

        EObject this_CompositeComponent_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:469:2: ( (this_Component_Impl_0= ruleComponent_Impl | this_CompositeComponent_1= ruleCompositeComponent ) )
            // InternalMyDsl.g:470:2: (this_Component_Impl_0= ruleComponent_Impl | this_CompositeComponent_1= ruleCompositeComponent )
            {
            // InternalMyDsl.g:470:2: (this_Component_Impl_0= ruleComponent_Impl | this_CompositeComponent_1= ruleCompositeComponent )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==44) ) {
                alt11=1;
            }
            else if ( (LA11_0==52) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:471:3: this_Component_Impl_0= ruleComponent_Impl
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
                    // InternalMyDsl.g:480:3: this_CompositeComponent_1= ruleCompositeComponent
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


    // $ANTLR start "entryRuleBehaviourDescription"
    // InternalMyDsl.g:492:1: entryRuleBehaviourDescription returns [EObject current=null] : iv_ruleBehaviourDescription= ruleBehaviourDescription EOF ;
    public final EObject entryRuleBehaviourDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviourDescription = null;


        try {
            // InternalMyDsl.g:492:61: (iv_ruleBehaviourDescription= ruleBehaviourDescription EOF )
            // InternalMyDsl.g:493:2: iv_ruleBehaviourDescription= ruleBehaviourDescription EOF
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
    // InternalMyDsl.g:499:1: ruleBehaviourDescription returns [EObject current=null] : (this_BehaviourDescription_Impl_0= ruleBehaviourDescription_Impl | this_InternalAction_1= ruleInternalAction | this_ExternalCall_2= ruleExternalCall | this_Loop_3= ruleLoop | this_Branch_4= ruleBranch ) ;
    public final EObject ruleBehaviourDescription() throws RecognitionException {
        EObject current = null;

        EObject this_BehaviourDescription_Impl_0 = null;

        EObject this_InternalAction_1 = null;

        EObject this_ExternalCall_2 = null;

        EObject this_Loop_3 = null;

        EObject this_Branch_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:505:2: ( (this_BehaviourDescription_Impl_0= ruleBehaviourDescription_Impl | this_InternalAction_1= ruleInternalAction | this_ExternalCall_2= ruleExternalCall | this_Loop_3= ruleLoop | this_Branch_4= ruleBranch ) )
            // InternalMyDsl.g:506:2: (this_BehaviourDescription_Impl_0= ruleBehaviourDescription_Impl | this_InternalAction_1= ruleInternalAction | this_ExternalCall_2= ruleExternalCall | this_Loop_3= ruleLoop | this_Branch_4= ruleBranch )
            {
            // InternalMyDsl.g:506:2: (this_BehaviourDescription_Impl_0= ruleBehaviourDescription_Impl | this_InternalAction_1= ruleInternalAction | this_ExternalCall_2= ruleExternalCall | this_Loop_3= ruleLoop | this_Branch_4= ruleBranch )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt12=1;
                }
                break;
            case 54:
                {
                alt12=2;
                }
                break;
            case 55:
                {
                alt12=3;
                }
                break;
            case 56:
                {
                alt12=4;
                }
                break;
            case 57:
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
                    // InternalMyDsl.g:507:3: this_BehaviourDescription_Impl_0= ruleBehaviourDescription_Impl
                    {

                    			newCompositeNode(grammarAccess.getBehaviourDescriptionAccess().getBehaviourDescription_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BehaviourDescription_Impl_0=ruleBehaviourDescription_Impl();

                    state._fsp--;


                    			current = this_BehaviourDescription_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:516:3: this_InternalAction_1= ruleInternalAction
                    {

                    			newCompositeNode(grammarAccess.getBehaviourDescriptionAccess().getInternalActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InternalAction_1=ruleInternalAction();

                    state._fsp--;


                    			current = this_InternalAction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:525:3: this_ExternalCall_2= ruleExternalCall
                    {

                    			newCompositeNode(grammarAccess.getBehaviourDescriptionAccess().getExternalCallParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalCall_2=ruleExternalCall();

                    state._fsp--;


                    			current = this_ExternalCall_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:534:3: this_Loop_3= ruleLoop
                    {

                    			newCompositeNode(grammarAccess.getBehaviourDescriptionAccess().getLoopParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Loop_3=ruleLoop();

                    state._fsp--;


                    			current = this_Loop_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:543:3: this_Branch_4= ruleBranch
                    {

                    			newCompositeNode(grammarAccess.getBehaviourDescriptionAccess().getBranchParserRuleCall_4());
                    		
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
    // $ANTLR end "ruleBehaviourDescription"


    // $ANTLR start "entryRuleInterface"
    // InternalMyDsl.g:555:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalMyDsl.g:555:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalMyDsl.g:556:2: iv_ruleInterface= ruleInterface EOF
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
    // InternalMyDsl.g:562:1: ruleInterface returns [EObject current=null] : ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signature' otherlv_5= '{' ( (lv_signature_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signature_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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
            // InternalMyDsl.g:568:2: ( ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signature' otherlv_5= '{' ( (lv_signature_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signature_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalMyDsl.g:569:2: ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signature' otherlv_5= '{' ( (lv_signature_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signature_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalMyDsl.g:569:2: ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signature' otherlv_5= '{' ( (lv_signature_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signature_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalMyDsl.g:570:3: () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signature' otherlv_5= '{' ( (lv_signature_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signature_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalMyDsl.g:570:3: ()
            // InternalMyDsl.g:571:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInterfaceAccess().getInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getInterfaceKeyword_1());
            		
            // InternalMyDsl.g:581:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:582:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:582:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:583:5: lv_name_2_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:604:3: (otherlv_4= 'signature' otherlv_5= '{' ( (lv_signature_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signature_8_0= ruleSignature ) ) )* otherlv_9= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:605:4: otherlv_4= 'signature' otherlv_5= '{' ( (lv_signature_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signature_8_0= ruleSignature ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getInterfaceAccess().getSignatureKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_20); 

                    				newLeafNode(otherlv_5, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:613:4: ( (lv_signature_6_0= ruleSignature ) )
                    // InternalMyDsl.g:614:5: (lv_signature_6_0= ruleSignature )
                    {
                    // InternalMyDsl.g:614:5: (lv_signature_6_0= ruleSignature )
                    // InternalMyDsl.g:615:6: lv_signature_6_0= ruleSignature
                    {

                    						newCompositeNode(grammarAccess.getInterfaceAccess().getSignatureSignatureParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_signature_6_0=ruleSignature();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"signature",
                    							lv_signature_6_0,
                    							"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.Signature");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:632:4: (otherlv_7= ',' ( (lv_signature_8_0= ruleSignature ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==15) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalMyDsl.g:633:5: otherlv_7= ',' ( (lv_signature_8_0= ruleSignature ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_20); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getInterfaceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:637:5: ( (lv_signature_8_0= ruleSignature ) )
                    	    // InternalMyDsl.g:638:6: (lv_signature_8_0= ruleSignature )
                    	    {
                    	    // InternalMyDsl.g:638:6: (lv_signature_8_0= ruleSignature )
                    	    // InternalMyDsl.g:639:7: lv_signature_8_0= ruleSignature
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterfaceAccess().getSignatureSignatureParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_signature_8_0=ruleSignature();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"signature",
                    	    								lv_signature_8_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.Signature");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,21,FOLLOW_18); 

                    				newLeafNode(otherlv_9, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,21,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAssemblyContext"
    // InternalMyDsl.g:670:1: entryRuleAssemblyContext returns [EObject current=null] : iv_ruleAssemblyContext= ruleAssemblyContext EOF ;
    public final EObject entryRuleAssemblyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyContext = null;


        try {
            // InternalMyDsl.g:670:56: (iv_ruleAssemblyContext= ruleAssemblyContext EOF )
            // InternalMyDsl.g:671:2: iv_ruleAssemblyContext= ruleAssemblyContext EOF
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
    // InternalMyDsl.g:677:1: ruleAssemblyContext returns [EObject current=null] : (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleAssemblyContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:683:2: ( (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:684:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:684:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalMyDsl.g:685:3: otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyContextAccess().getAssemblyContextKeyword_0());
            		
            // InternalMyDsl.g:689:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:690:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:690:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:691:5: lv_name_1_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getAssemblyContextAccess().getComponentKeyword_3());
            		
            // InternalMyDsl.g:716:3: ( ( ruleEString ) )
            // InternalMyDsl.g:717:4: ( ruleEString )
            {
            // InternalMyDsl.g:717:4: ( ruleEString )
            // InternalMyDsl.g:718:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyContextAccess().getComponentComponentCrossReference_4_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

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
    // InternalMyDsl.g:740:1: entryRuleType_Impl returns [EObject current=null] : iv_ruleType_Impl= ruleType_Impl EOF ;
    public final EObject entryRuleType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType_Impl = null;


        try {
            // InternalMyDsl.g:740:50: (iv_ruleType_Impl= ruleType_Impl EOF )
            // InternalMyDsl.g:741:2: iv_ruleType_Impl= ruleType_Impl EOF
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
    // InternalMyDsl.g:747:1: ruleType_Impl returns [EObject current=null] : ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:753:2: ( ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:754:2: ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:754:2: ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:755:3: () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:755:3: ()
            // InternalMyDsl.g:756:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getType_ImplAccess().getTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getType_ImplAccess().getTypeKeyword_1());
            		
            // InternalMyDsl.g:766:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:767:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:767:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:768:5: lv_name_2_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.EString");
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
    // InternalMyDsl.g:789:1: entryRuleAssemblyConnector returns [EObject current=null] : iv_ruleAssemblyConnector= ruleAssemblyConnector EOF ;
    public final EObject entryRuleAssemblyConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyConnector = null;


        try {
            // InternalMyDsl.g:789:58: (iv_ruleAssemblyConnector= ruleAssemblyConnector EOF )
            // InternalMyDsl.g:790:2: iv_ruleAssemblyConnector= ruleAssemblyConnector EOF
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
    // InternalMyDsl.g:796:1: ruleAssemblyConnector returns [EObject current=null] : (otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedrole' ( ( ruleEString ) ) otherlv_5= 'requiredrole' ( ( ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleAssemblyConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:802:2: ( (otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedrole' ( ( ruleEString ) ) otherlv_5= 'requiredrole' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalMyDsl.g:803:2: (otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedrole' ( ( ruleEString ) ) otherlv_5= 'requiredrole' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalMyDsl.g:803:2: (otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedrole' ( ( ruleEString ) ) otherlv_5= 'requiredrole' ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalMyDsl.g:804:3: otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedrole' ( ( ruleEString ) ) otherlv_5= 'requiredrole' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyConnectorAccess().getAssemblyConnectorKeyword_0());
            		
            // InternalMyDsl.g:808:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:809:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:809:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:810:5: lv_name_1_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyConnectorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getAssemblyConnectorAccess().getProvidedroleKeyword_3());
            		
            // InternalMyDsl.g:835:3: ( ( ruleEString ) )
            // InternalMyDsl.g:836:4: ( ruleEString )
            {
            // InternalMyDsl.g:836:4: ( ruleEString )
            // InternalMyDsl.g:837:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getProvidedroleProvidedRoleCrossReference_4_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getAssemblyConnectorAccess().getRequiredroleKeyword_5());
            		
            // InternalMyDsl.g:855:3: ( ( ruleEString ) )
            // InternalMyDsl.g:856:4: ( ruleEString )
            {
            // InternalMyDsl.g:856:4: ( ruleEString )
            // InternalMyDsl.g:857:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getRequiredroleRequiredRoleCrossReference_6_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAssemblyConnectorAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:879:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:879:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:880:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:886:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:892:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:893:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:893:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:894:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:902:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleSignature"
    // InternalMyDsl.g:913:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // InternalMyDsl.g:913:50: (iv_ruleSignature= ruleSignature EOF )
            // InternalMyDsl.g:914:2: iv_ruleSignature= ruleSignature EOF
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
    // InternalMyDsl.g:920:1: ruleSignature returns [EObject current=null] : (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returntype' ( ( ruleEString ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // InternalMyDsl.g:926:2: ( (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returntype' ( ( ruleEString ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalMyDsl.g:927:2: (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returntype' ( ( ruleEString ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:927:2: (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returntype' ( ( ruleEString ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalMyDsl.g:928:3: otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returntype' ( ( ruleEString ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSignatureAccess().getSignatureKeyword_0());
            		
            // InternalMyDsl.g:932:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:933:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:933:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:934:5: lv_name_1_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getSignatureAccess().getReturntypeKeyword_3());
            		
            // InternalMyDsl.g:959:3: ( ( ruleEString ) )
            // InternalMyDsl.g:960:4: ( ruleEString )
            {
            // InternalMyDsl.g:960:4: ( ruleEString )
            // InternalMyDsl.g:961:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSignatureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSignatureAccess().getReturntypeReturnTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_25);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:975:3: (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:976:4: otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getSignatureAccess().getParameterKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_26); 

                    				newLeafNode(otherlv_6, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyDsl.g:984:4: ( (lv_parameter_7_0= ruleParameter ) )
                    // InternalMyDsl.g:985:5: (lv_parameter_7_0= ruleParameter )
                    {
                    // InternalMyDsl.g:985:5: (lv_parameter_7_0= ruleParameter )
                    // InternalMyDsl.g:986:6: lv_parameter_7_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getSignatureAccess().getParameterParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_parameter_7_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSignatureRule());
                    						}
                    						add(
                    							current,
                    							"parameter",
                    							lv_parameter_7_0,
                    							"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1003:4: (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==15) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalMyDsl.g:1004:5: otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_26); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getSignatureAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:1008:5: ( (lv_parameter_9_0= ruleParameter ) )
                    	    // InternalMyDsl.g:1009:6: (lv_parameter_9_0= ruleParameter )
                    	    {
                    	    // InternalMyDsl.g:1009:6: (lv_parameter_9_0= ruleParameter )
                    	    // InternalMyDsl.g:1010:7: lv_parameter_9_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getSignatureAccess().getParameterParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_parameter_9_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSignatureRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameter",
                    	    								lv_parameter_9_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,21,FOLLOW_18); 

                    				newLeafNode(otherlv_10, grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,21,FOLLOW_2); 

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
    // InternalMyDsl.g:1041:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalMyDsl.g:1041:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalMyDsl.g:1042:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalMyDsl.g:1048:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parametertype' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1054:2: ( (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parametertype' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:1055:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parametertype' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:1055:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parametertype' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalMyDsl.g:1056:3: otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parametertype' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            // InternalMyDsl.g:1060:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:1061:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:1061:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:1062:5: lv_name_1_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getParametertypeKeyword_3());
            		
            // InternalMyDsl.g:1087:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1088:4: ( ruleEString )
            {
            // InternalMyDsl.g:1088:4: ( ruleEString )
            // InternalMyDsl.g:1089:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterAccess().getParametertypeParameterTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

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
    // InternalMyDsl.g:1111:1: entryRuleReturnType_Impl returns [EObject current=null] : iv_ruleReturnType_Impl= ruleReturnType_Impl EOF ;
    public final EObject entryRuleReturnType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnType_Impl = null;


        try {
            // InternalMyDsl.g:1111:56: (iv_ruleReturnType_Impl= ruleReturnType_Impl EOF )
            // InternalMyDsl.g:1112:2: iv_ruleReturnType_Impl= ruleReturnType_Impl EOF
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
    // InternalMyDsl.g:1118:1: ruleReturnType_Impl returns [EObject current=null] : ( () otherlv_1= 'ReturnType' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleReturnType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1124:2: ( ( () otherlv_1= 'ReturnType' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:1125:2: ( () otherlv_1= 'ReturnType' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:1125:2: ( () otherlv_1= 'ReturnType' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:1126:3: () otherlv_1= 'ReturnType' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:1126:3: ()
            // InternalMyDsl.g:1127:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReturnType_ImplAccess().getReturnTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getReturnType_ImplAccess().getReturnTypeKeyword_1());
            		
            // InternalMyDsl.g:1137:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:1138:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:1138:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:1139:5: lv_name_2_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.EString");
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
    // InternalMyDsl.g:1160:1: entryRuleParameterType_Impl returns [EObject current=null] : iv_ruleParameterType_Impl= ruleParameterType_Impl EOF ;
    public final EObject entryRuleParameterType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType_Impl = null;


        try {
            // InternalMyDsl.g:1160:59: (iv_ruleParameterType_Impl= ruleParameterType_Impl EOF )
            // InternalMyDsl.g:1161:2: iv_ruleParameterType_Impl= ruleParameterType_Impl EOF
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
    // InternalMyDsl.g:1167:1: ruleParameterType_Impl returns [EObject current=null] : ( () otherlv_1= 'ParameterType' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleParameterType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1173:2: ( ( () otherlv_1= 'ParameterType' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:1174:2: ( () otherlv_1= 'ParameterType' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:1174:2: ( () otherlv_1= 'ParameterType' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:1175:3: () otherlv_1= 'ParameterType' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:1175:3: ()
            // InternalMyDsl.g:1176:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterType_ImplAccess().getParameterTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterType_ImplAccess().getParameterTypeKeyword_1());
            		
            // InternalMyDsl.g:1186:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:1187:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:1187:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:1188:5: lv_name_2_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.EString");
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
    // InternalMyDsl.g:1209:1: entryRuleSimple returns [EObject current=null] : iv_ruleSimple= ruleSimple EOF ;
    public final EObject entryRuleSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimple = null;


        try {
            // InternalMyDsl.g:1209:47: (iv_ruleSimple= ruleSimple EOF )
            // InternalMyDsl.g:1210:2: iv_ruleSimple= ruleSimple EOF
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
    // InternalMyDsl.g:1216:1: ruleSimple returns [EObject current=null] : ( () otherlv_1= 'Simple' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) ) )? otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:1222:2: ( ( () otherlv_1= 'Simple' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) ) )? otherlv_6= '}' ) )
            // InternalMyDsl.g:1223:2: ( () otherlv_1= 'Simple' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) ) )? otherlv_6= '}' )
            {
            // InternalMyDsl.g:1223:2: ( () otherlv_1= 'Simple' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) ) )? otherlv_6= '}' )
            // InternalMyDsl.g:1224:3: () otherlv_1= 'Simple' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) ) )? otherlv_6= '}'
            {
            // InternalMyDsl.g:1224:3: ()
            // InternalMyDsl.g:1225:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleAccess().getSimpleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleAccess().getSimpleKeyword_1());
            		
            // InternalMyDsl.g:1235:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:1236:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:1236:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:1237:5: lv_name_2_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getSimpleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1258:3: (otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==40) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1259:4: otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) )
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_29); 

                    				newLeafNode(otherlv_4, grammarAccess.getSimpleAccess().getKindKeyword_4_0());
                    			
                    // InternalMyDsl.g:1263:4: ( (lv_kind_5_0= rulesimpleTypes ) )
                    // InternalMyDsl.g:1264:5: (lv_kind_5_0= rulesimpleTypes )
                    {
                    // InternalMyDsl.g:1264:5: (lv_kind_5_0= rulesimpleTypes )
                    // InternalMyDsl.g:1265:6: lv_kind_5_0= rulesimpleTypes
                    {

                    						newCompositeNode(grammarAccess.getSimpleAccess().getKindSimpleTypesEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_kind_5_0=rulesimpleTypes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_5_0,
                    							"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.simpleTypes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

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
    // InternalMyDsl.g:1291:1: entryRuleComplex returns [EObject current=null] : iv_ruleComplex= ruleComplex EOF ;
    public final EObject entryRuleComplex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplex = null;


        try {
            // InternalMyDsl.g:1291:48: (iv_ruleComplex= ruleComplex EOF )
            // InternalMyDsl.g:1292:2: iv_ruleComplex= ruleComplex EOF
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
    // InternalMyDsl.g:1298:1: ruleComplex returns [EObject current=null] : (otherlv_0= 'Complex' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'simple' otherlv_4= '{' ( (lv_simple_5_0= ruleSimple ) ) (otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) ) )* otherlv_8= '}' otherlv_9= '}' ) ;
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
            // InternalMyDsl.g:1304:2: ( (otherlv_0= 'Complex' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'simple' otherlv_4= '{' ( (lv_simple_5_0= ruleSimple ) ) (otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) ) )* otherlv_8= '}' otherlv_9= '}' ) )
            // InternalMyDsl.g:1305:2: (otherlv_0= 'Complex' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'simple' otherlv_4= '{' ( (lv_simple_5_0= ruleSimple ) ) (otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) ) )* otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalMyDsl.g:1305:2: (otherlv_0= 'Complex' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'simple' otherlv_4= '{' ( (lv_simple_5_0= ruleSimple ) ) (otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) ) )* otherlv_8= '}' otherlv_9= '}' )
            // InternalMyDsl.g:1306:3: otherlv_0= 'Complex' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'simple' otherlv_4= '{' ( (lv_simple_5_0= ruleSimple ) ) (otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) ) )* otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getComplexAccess().getComplexKeyword_0());
            		
            // InternalMyDsl.g:1310:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:1311:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:1311:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:1312:5: lv_name_1_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getComplexAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getComplexAccess().getSimpleKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_4, grammarAccess.getComplexAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyDsl.g:1341:3: ( (lv_simple_5_0= ruleSimple ) )
            // InternalMyDsl.g:1342:4: (lv_simple_5_0= ruleSimple )
            {
            // InternalMyDsl.g:1342:4: (lv_simple_5_0= ruleSimple )
            // InternalMyDsl.g:1343:5: lv_simple_5_0= ruleSimple
            {

            					newCompositeNode(grammarAccess.getComplexAccess().getSimpleSimpleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
            lv_simple_5_0=ruleSimple();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexRule());
            					}
            					add(
            						current,
            						"simple",
            						lv_simple_5_0,
            						"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.Simple");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1360:3: (otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==15) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:1361:4: otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_31); 

            	    				newLeafNode(otherlv_6, grammarAccess.getComplexAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalMyDsl.g:1365:4: ( (lv_simple_7_0= ruleSimple ) )
            	    // InternalMyDsl.g:1366:5: (lv_simple_7_0= ruleSimple )
            	    {
            	    // InternalMyDsl.g:1366:5: (lv_simple_7_0= ruleSimple )
            	    // InternalMyDsl.g:1367:6: lv_simple_7_0= ruleSimple
            	    {

            	    						newCompositeNode(grammarAccess.getComplexAccess().getSimpleSimpleParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_simple_7_0=ruleSimple();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComplexRule());
            	    						}
            	    						add(
            	    							current,
            	    							"simple",
            	    							lv_simple_7_0,
            	    							"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.Simple");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_8=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getComplexAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,21,FOLLOW_2); 

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
    // InternalMyDsl.g:1397:1: entryRuleVoid returns [EObject current=null] : iv_ruleVoid= ruleVoid EOF ;
    public final EObject entryRuleVoid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoid = null;


        try {
            // InternalMyDsl.g:1397:45: (iv_ruleVoid= ruleVoid EOF )
            // InternalMyDsl.g:1398:2: iv_ruleVoid= ruleVoid EOF
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
    // InternalMyDsl.g:1404:1: ruleVoid returns [EObject current=null] : ( () otherlv_1= 'Void' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleVoid() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1410:2: ( ( () otherlv_1= 'Void' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:1411:2: ( () otherlv_1= 'Void' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:1411:2: ( () otherlv_1= 'Void' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:1412:3: () otherlv_1= 'Void' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:1412:3: ()
            // InternalMyDsl.g:1413:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVoidAccess().getVoidAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getVoidAccess().getVoidKeyword_1());
            		
            // InternalMyDsl.g:1423:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:1424:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:1424:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:1425:5: lv_name_2_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.EString");
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


    // $ANTLR start "entryRuleComponent_Impl"
    // InternalMyDsl.g:1446:1: entryRuleComponent_Impl returns [EObject current=null] : iv_ruleComponent_Impl= ruleComponent_Impl EOF ;
    public final EObject entryRuleComponent_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent_Impl = null;


        try {
            // InternalMyDsl.g:1446:55: (iv_ruleComponent_Impl= ruleComponent_Impl EOF )
            // InternalMyDsl.g:1447:2: iv_ruleComponent_Impl= ruleComponent_Impl EOF
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
    // InternalMyDsl.g:1453:1: ruleComponent_Impl returns [EObject current=null] : (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= '}' ) ;
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
            // InternalMyDsl.g:1459:2: ( (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= '}' ) )
            // InternalMyDsl.g:1460:2: (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= '}' )
            {
            // InternalMyDsl.g:1460:2: (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= '}' )
            // InternalMyDsl.g:1461:3: otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getComponent_ImplAccess().getComponentKeyword_0());
            		
            // InternalMyDsl.g:1465:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:1466:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:1466:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:1467:5: lv_name_1_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1488:3: (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==45) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1489:4: otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_33); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalMyDsl.g:1497:4: ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) )
                    // InternalMyDsl.g:1498:5: (lv_behaviourdescription_5_0= ruleBehaviourDescription )
                    {
                    // InternalMyDsl.g:1498:5: (lv_behaviourdescription_5_0= ruleBehaviourDescription )
                    // InternalMyDsl.g:1499:6: lv_behaviourdescription_5_0= ruleBehaviourDescription
                    {

                    						newCompositeNode(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionBehaviourDescriptionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_behaviourdescription_5_0=ruleBehaviourDescription();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
                    						}
                    						add(
                    							current,
                    							"behaviourdescription",
                    							lv_behaviourdescription_5_0,
                    							"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.BehaviourDescription");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1516:4: (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==15) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalMyDsl.g:1517:5: otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_33); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getComponent_ImplAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMyDsl.g:1521:5: ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) )
                    	    // InternalMyDsl.g:1522:6: (lv_behaviourdescription_7_0= ruleBehaviourDescription )
                    	    {
                    	    // InternalMyDsl.g:1522:6: (lv_behaviourdescription_7_0= ruleBehaviourDescription )
                    	    // InternalMyDsl.g:1523:7: lv_behaviourdescription_7_0= ruleBehaviourDescription
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionBehaviourDescriptionParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_behaviourdescription_7_0=ruleBehaviourDescription();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"behaviourdescription",
                    	    								lv_behaviourdescription_7_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.BehaviourDescription");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,21,FOLLOW_34); 

                    				newLeafNode(otherlv_8, grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getComponent_ImplAccess().getServiceKeyword_4());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_10, grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:1554:3: ( (lv_service_11_0= ruleService ) )
            // InternalMyDsl.g:1555:4: (lv_service_11_0= ruleService )
            {
            // InternalMyDsl.g:1555:4: (lv_service_11_0= ruleService )
            // InternalMyDsl.g:1556:5: lv_service_11_0= ruleService
            {

            					newCompositeNode(grammarAccess.getComponent_ImplAccess().getServiceServiceParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_13);
            lv_service_11_0=ruleService();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
            					}
            					add(
            						current,
            						"service",
            						lv_service_11_0,
            						"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.Service");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1573:3: (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==15) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:1574:4: otherlv_12= ',' ( (lv_service_13_0= ruleService ) )
            	    {
            	    otherlv_12=(Token)match(input,15,FOLLOW_35); 

            	    				newLeafNode(otherlv_12, grammarAccess.getComponent_ImplAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalMyDsl.g:1578:4: ( (lv_service_13_0= ruleService ) )
            	    // InternalMyDsl.g:1579:5: (lv_service_13_0= ruleService )
            	    {
            	    // InternalMyDsl.g:1579:5: (lv_service_13_0= ruleService )
            	    // InternalMyDsl.g:1580:6: lv_service_13_0= ruleService
            	    {

            	    						newCompositeNode(grammarAccess.getComponent_ImplAccess().getServiceServiceParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_service_13_0=ruleService();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
            	    						}
            	    						add(
            	    							current,
            	    							"service",
            	    							lv_service_13_0,
            	    							"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.Service");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_14=(Token)match(input,21,FOLLOW_36); 

            			newLeafNode(otherlv_14, grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalMyDsl.g:1602:3: (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1603:4: otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getComponent_ImplAccess().getRequiredroleKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_37); 

                    				newLeafNode(otherlv_16, grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalMyDsl.g:1611:4: ( (lv_requiredrole_17_0= ruleRequiredRole ) )
                    // InternalMyDsl.g:1612:5: (lv_requiredrole_17_0= ruleRequiredRole )
                    {
                    // InternalMyDsl.g:1612:5: (lv_requiredrole_17_0= ruleRequiredRole )
                    // InternalMyDsl.g:1613:6: lv_requiredrole_17_0= ruleRequiredRole
                    {

                    						newCompositeNode(grammarAccess.getComponent_ImplAccess().getRequiredroleRequiredRoleParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_requiredrole_17_0=ruleRequiredRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
                    						}
                    						add(
                    							current,
                    							"requiredrole",
                    							lv_requiredrole_17_0,
                    							"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.RequiredRole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1630:4: (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==15) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalMyDsl.g:1631:5: otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FOLLOW_37); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getComponent_ImplAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalMyDsl.g:1635:5: ( (lv_requiredrole_19_0= ruleRequiredRole ) )
                    	    // InternalMyDsl.g:1636:6: (lv_requiredrole_19_0= ruleRequiredRole )
                    	    {
                    	    // InternalMyDsl.g:1636:6: (lv_requiredrole_19_0= ruleRequiredRole )
                    	    // InternalMyDsl.g:1637:7: lv_requiredrole_19_0= ruleRequiredRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponent_ImplAccess().getRequiredroleRequiredRoleParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_requiredrole_19_0=ruleRequiredRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"requiredrole",
                    	    								lv_requiredrole_19_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.RequiredRole");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,21,FOLLOW_22); 

                    				newLeafNode(otherlv_20, grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,30,FOLLOW_38); 

            			newLeafNode(otherlv_21, grammarAccess.getComponent_ImplAccess().getProvidedroleKeyword_10());
            		
            // InternalMyDsl.g:1664:3: ( (lv_providedrole_22_0= ruleProvidedRole ) )
            // InternalMyDsl.g:1665:4: (lv_providedrole_22_0= ruleProvidedRole )
            {
            // InternalMyDsl.g:1665:4: (lv_providedrole_22_0= ruleProvidedRole )
            // InternalMyDsl.g:1666:5: lv_providedrole_22_0= ruleProvidedRole
            {

            					newCompositeNode(grammarAccess.getComponent_ImplAccess().getProvidedroleProvidedRoleParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_18);
            lv_providedrole_22_0=ruleProvidedRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
            					}
            					set(
            						current,
            						"providedrole",
            						lv_providedrole_22_0,
            						"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.ProvidedRole");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_23=(Token)match(input,21,FOLLOW_2); 

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


    // $ANTLR start "entryRuleBehaviourDescription_Impl"
    // InternalMyDsl.g:1691:1: entryRuleBehaviourDescription_Impl returns [EObject current=null] : iv_ruleBehaviourDescription_Impl= ruleBehaviourDescription_Impl EOF ;
    public final EObject entryRuleBehaviourDescription_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviourDescription_Impl = null;


        try {
            // InternalMyDsl.g:1691:66: (iv_ruleBehaviourDescription_Impl= ruleBehaviourDescription_Impl EOF )
            // InternalMyDsl.g:1692:2: iv_ruleBehaviourDescription_Impl= ruleBehaviourDescription_Impl EOF
            {
             newCompositeNode(grammarAccess.getBehaviourDescription_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviourDescription_Impl=ruleBehaviourDescription_Impl();

            state._fsp--;

             current =iv_ruleBehaviourDescription_Impl; 
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
    // $ANTLR end "entryRuleBehaviourDescription_Impl"


    // $ANTLR start "ruleBehaviourDescription_Impl"
    // InternalMyDsl.g:1698:1: ruleBehaviourDescription_Impl returns [EObject current=null] : ( () otherlv_1= 'BehaviourDescription' ) ;
    public final EObject ruleBehaviourDescription_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1704:2: ( ( () otherlv_1= 'BehaviourDescription' ) )
            // InternalMyDsl.g:1705:2: ( () otherlv_1= 'BehaviourDescription' )
            {
            // InternalMyDsl.g:1705:2: ( () otherlv_1= 'BehaviourDescription' )
            // InternalMyDsl.g:1706:3: () otherlv_1= 'BehaviourDescription'
            {
            // InternalMyDsl.g:1706:3: ()
            // InternalMyDsl.g:1707:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBehaviourDescription_ImplAccess().getBehaviourDescriptionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBehaviourDescription_ImplAccess().getBehaviourDescriptionKeyword_1());
            		

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
    // $ANTLR end "ruleBehaviourDescription_Impl"


    // $ANTLR start "entryRuleService"
    // InternalMyDsl.g:1721:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalMyDsl.g:1721:48: (iv_ruleService= ruleService EOF )
            // InternalMyDsl.g:1722:2: iv_ruleService= ruleService EOF
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
    // InternalMyDsl.g:1728:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'correspondingSignatures' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' ) ;
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
            // InternalMyDsl.g:1734:2: ( (otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'correspondingSignatures' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' ) )
            // InternalMyDsl.g:1735:2: (otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'correspondingSignatures' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' )
            {
            // InternalMyDsl.g:1735:2: (otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'correspondingSignatures' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' )
            // InternalMyDsl.g:1736:3: otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'correspondingSignatures' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,49,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getCorrespondingSignaturesKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMyDsl.g:1752:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1753:4: ( ruleEString )
            {
            // InternalMyDsl.g:1753:4: ( ruleEString )
            // InternalMyDsl.g:1754:5: ruleEString
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

            // InternalMyDsl.g:1768:3: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==15) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:1769:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalMyDsl.g:1773:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:1774:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:1774:5: ( ruleEString )
            	    // InternalMyDsl.g:1775:6: ruleEString
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
            	    break loop25;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getServiceAccess().getRightParenthesisKeyword_6());
            		
            otherlv_8=(Token)match(input,21,FOLLOW_2); 

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


    // $ANTLR start "entryRuleRequiredRole"
    // InternalMyDsl.g:1802:1: entryRuleRequiredRole returns [EObject current=null] : iv_ruleRequiredRole= ruleRequiredRole EOF ;
    public final EObject entryRuleRequiredRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredRole = null;


        try {
            // InternalMyDsl.g:1802:53: (iv_ruleRequiredRole= ruleRequiredRole EOF )
            // InternalMyDsl.g:1803:2: iv_ruleRequiredRole= ruleRequiredRole EOF
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
    // InternalMyDsl.g:1809:1: ruleRequiredRole returns [EObject current=null] : (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleRequiredRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1815:2: ( (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:1816:2: (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:1816:2: (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalMyDsl.g:1817:3: otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRequiredRoleAccess().getRequiredRoleKeyword_0());
            		
            // InternalMyDsl.g:1821:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:1822:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:1822:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:1823:5: lv_name_1_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRequiredRoleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getRequiredRoleAccess().getInterfaceKeyword_3());
            		
            // InternalMyDsl.g:1848:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1849:4: ( ruleEString )
            {
            // InternalMyDsl.g:1849:4: ( ruleEString )
            // InternalMyDsl.g:1850:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequiredRoleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRequiredRoleAccess().getInterfaceInterfaceCrossReference_4_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

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


    // $ANTLR start "entryRuleProvidedRole"
    // InternalMyDsl.g:1872:1: entryRuleProvidedRole returns [EObject current=null] : iv_ruleProvidedRole= ruleProvidedRole EOF ;
    public final EObject entryRuleProvidedRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedRole = null;


        try {
            // InternalMyDsl.g:1872:53: (iv_ruleProvidedRole= ruleProvidedRole EOF )
            // InternalMyDsl.g:1873:2: iv_ruleProvidedRole= ruleProvidedRole EOF
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
    // InternalMyDsl.g:1879:1: ruleProvidedRole returns [EObject current=null] : (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleProvidedRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1885:2: ( (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:1886:2: (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:1886:2: (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalMyDsl.g:1887:3: otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getProvidedRoleAccess().getProvidedRoleKeyword_0());
            		
            // InternalMyDsl.g:1891:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:1892:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:1892:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:1893:5: lv_name_1_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getProvidedRoleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getProvidedRoleAccess().getInterfaceKeyword_3());
            		
            // InternalMyDsl.g:1918:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1919:4: ( ruleEString )
            {
            // InternalMyDsl.g:1919:4: ( ruleEString )
            // InternalMyDsl.g:1920:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProvidedRoleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProvidedRoleAccess().getInterfaceInterfaceCrossReference_4_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

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


    // $ANTLR start "entryRuleCompositeComponent"
    // InternalMyDsl.g:1942:1: entryRuleCompositeComponent returns [EObject current=null] : iv_ruleCompositeComponent= ruleCompositeComponent EOF ;
    public final EObject entryRuleCompositeComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeComponent = null;


        try {
            // InternalMyDsl.g:1942:59: (iv_ruleCompositeComponent= ruleCompositeComponent EOF )
            // InternalMyDsl.g:1943:2: iv_ruleCompositeComponent= ruleCompositeComponent EOF
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
    // InternalMyDsl.g:1949:1: ruleCompositeComponent returns [EObject current=null] : (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= 'assemblycontext' otherlv_24= '{' ( (lv_assemblycontext_25_0= ruleAssemblyContext ) ) (otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) ) )* otherlv_28= '}' otherlv_29= 'delegationconnector' otherlv_30= '{' ( (lv_delegationconnector_31_0= ruleDelegationConnector ) ) (otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) ) )* otherlv_34= '}' otherlv_35= '}' ) ;
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
            // InternalMyDsl.g:1955:2: ( (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= 'assemblycontext' otherlv_24= '{' ( (lv_assemblycontext_25_0= ruleAssemblyContext ) ) (otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) ) )* otherlv_28= '}' otherlv_29= 'delegationconnector' otherlv_30= '{' ( (lv_delegationconnector_31_0= ruleDelegationConnector ) ) (otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) ) )* otherlv_34= '}' otherlv_35= '}' ) )
            // InternalMyDsl.g:1956:2: (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= 'assemblycontext' otherlv_24= '{' ( (lv_assemblycontext_25_0= ruleAssemblyContext ) ) (otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) ) )* otherlv_28= '}' otherlv_29= 'delegationconnector' otherlv_30= '{' ( (lv_delegationconnector_31_0= ruleDelegationConnector ) ) (otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) ) )* otherlv_34= '}' otherlv_35= '}' )
            {
            // InternalMyDsl.g:1956:2: (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= 'assemblycontext' otherlv_24= '{' ( (lv_assemblycontext_25_0= ruleAssemblyContext ) ) (otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) ) )* otherlv_28= '}' otherlv_29= 'delegationconnector' otherlv_30= '{' ( (lv_delegationconnector_31_0= ruleDelegationConnector ) ) (otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) ) )* otherlv_34= '}' otherlv_35= '}' )
            // InternalMyDsl.g:1957:3: otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= 'assemblycontext' otherlv_24= '{' ( (lv_assemblycontext_25_0= ruleAssemblyContext ) ) (otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) ) )* otherlv_28= '}' otherlv_29= 'delegationconnector' otherlv_30= '{' ( (lv_delegationconnector_31_0= ruleDelegationConnector ) ) (otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) ) )* otherlv_34= '}' otherlv_35= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositeComponentAccess().getCompositeComponentKeyword_0());
            		
            // InternalMyDsl.g:1961:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:1962:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:1962:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:1963:5: lv_name_1_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1984:3: (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1985:4: otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_33); 

                    				newLeafNode(otherlv_4, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalMyDsl.g:1993:4: ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) )
                    // InternalMyDsl.g:1994:5: (lv_behaviourdescription_5_0= ruleBehaviourDescription )
                    {
                    // InternalMyDsl.g:1994:5: (lv_behaviourdescription_5_0= ruleBehaviourDescription )
                    // InternalMyDsl.g:1995:6: lv_behaviourdescription_5_0= ruleBehaviourDescription
                    {

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionBehaviourDescriptionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_behaviourdescription_5_0=ruleBehaviourDescription();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    						}
                    						add(
                    							current,
                    							"behaviourdescription",
                    							lv_behaviourdescription_5_0,
                    							"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.BehaviourDescription");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:2012:4: (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==15) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalMyDsl.g:2013:5: otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_33); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getCompositeComponentAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMyDsl.g:2017:5: ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) )
                    	    // InternalMyDsl.g:2018:6: (lv_behaviourdescription_7_0= ruleBehaviourDescription )
                    	    {
                    	    // InternalMyDsl.g:2018:6: (lv_behaviourdescription_7_0= ruleBehaviourDescription )
                    	    // InternalMyDsl.g:2019:7: lv_behaviourdescription_7_0= ruleBehaviourDescription
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionBehaviourDescriptionParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_behaviourdescription_7_0=ruleBehaviourDescription();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"behaviourdescription",
                    	    								lv_behaviourdescription_7_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.BehaviourDescription");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,21,FOLLOW_34); 

                    				newLeafNode(otherlv_8, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getCompositeComponentAccess().getServiceKeyword_4());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_10, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:2050:3: ( (lv_service_11_0= ruleService ) )
            // InternalMyDsl.g:2051:4: (lv_service_11_0= ruleService )
            {
            // InternalMyDsl.g:2051:4: (lv_service_11_0= ruleService )
            // InternalMyDsl.g:2052:5: lv_service_11_0= ruleService
            {

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getServiceServiceParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_13);
            lv_service_11_0=ruleService();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            					}
            					add(
            						current,
            						"service",
            						lv_service_11_0,
            						"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.Service");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2069:3: (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==15) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:2070:4: otherlv_12= ',' ( (lv_service_13_0= ruleService ) )
            	    {
            	    otherlv_12=(Token)match(input,15,FOLLOW_35); 

            	    				newLeafNode(otherlv_12, grammarAccess.getCompositeComponentAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalMyDsl.g:2074:4: ( (lv_service_13_0= ruleService ) )
            	    // InternalMyDsl.g:2075:5: (lv_service_13_0= ruleService )
            	    {
            	    // InternalMyDsl.g:2075:5: (lv_service_13_0= ruleService )
            	    // InternalMyDsl.g:2076:6: lv_service_13_0= ruleService
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getServiceServiceParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_service_13_0=ruleService();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"service",
            	    							lv_service_13_0,
            	    							"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.Service");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_14=(Token)match(input,21,FOLLOW_36); 

            			newLeafNode(otherlv_14, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalMyDsl.g:2098:3: (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:2099:4: otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getCompositeComponentAccess().getRequiredroleKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_37); 

                    				newLeafNode(otherlv_16, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalMyDsl.g:2107:4: ( (lv_requiredrole_17_0= ruleRequiredRole ) )
                    // InternalMyDsl.g:2108:5: (lv_requiredrole_17_0= ruleRequiredRole )
                    {
                    // InternalMyDsl.g:2108:5: (lv_requiredrole_17_0= ruleRequiredRole )
                    // InternalMyDsl.g:2109:6: lv_requiredrole_17_0= ruleRequiredRole
                    {

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiredroleRequiredRoleParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_requiredrole_17_0=ruleRequiredRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    						}
                    						add(
                    							current,
                    							"requiredrole",
                    							lv_requiredrole_17_0,
                    							"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.RequiredRole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:2126:4: (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==15) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalMyDsl.g:2127:5: otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FOLLOW_37); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getCompositeComponentAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalMyDsl.g:2131:5: ( (lv_requiredrole_19_0= ruleRequiredRole ) )
                    	    // InternalMyDsl.g:2132:6: (lv_requiredrole_19_0= ruleRequiredRole )
                    	    {
                    	    // InternalMyDsl.g:2132:6: (lv_requiredrole_19_0= ruleRequiredRole )
                    	    // InternalMyDsl.g:2133:7: lv_requiredrole_19_0= ruleRequiredRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiredroleRequiredRoleParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_requiredrole_19_0=ruleRequiredRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"requiredrole",
                    	    								lv_requiredrole_19_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.RequiredRole");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,21,FOLLOW_22); 

                    				newLeafNode(otherlv_20, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,30,FOLLOW_38); 

            			newLeafNode(otherlv_21, grammarAccess.getCompositeComponentAccess().getProvidedroleKeyword_10());
            		
            // InternalMyDsl.g:2160:3: ( (lv_providedrole_22_0= ruleProvidedRole ) )
            // InternalMyDsl.g:2161:4: (lv_providedrole_22_0= ruleProvidedRole )
            {
            // InternalMyDsl.g:2161:4: (lv_providedrole_22_0= ruleProvidedRole )
            // InternalMyDsl.g:2162:5: lv_providedrole_22_0= ruleProvidedRole
            {

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidedroleProvidedRoleParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_40);
            lv_providedrole_22_0=ruleProvidedRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            					}
            					set(
            						current,
            						"providedrole",
            						lv_providedrole_22_0,
            						"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.ProvidedRole");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_23=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_23, grammarAccess.getCompositeComponentAccess().getAssemblycontextKeyword_12());
            		
            otherlv_24=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_24, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalMyDsl.g:2187:3: ( (lv_assemblycontext_25_0= ruleAssemblyContext ) )
            // InternalMyDsl.g:2188:4: (lv_assemblycontext_25_0= ruleAssemblyContext )
            {
            // InternalMyDsl.g:2188:4: (lv_assemblycontext_25_0= ruleAssemblyContext )
            // InternalMyDsl.g:2189:5: lv_assemblycontext_25_0= ruleAssemblyContext
            {

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getAssemblycontextAssemblyContextParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_13);
            lv_assemblycontext_25_0=ruleAssemblyContext();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            					}
            					add(
            						current,
            						"assemblycontext",
            						lv_assemblycontext_25_0,
            						"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.AssemblyContext");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2206:3: (otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==15) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMyDsl.g:2207:4: otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) )
            	    {
            	    otherlv_26=(Token)match(input,15,FOLLOW_12); 

            	    				newLeafNode(otherlv_26, grammarAccess.getCompositeComponentAccess().getCommaKeyword_15_0());
            	    			
            	    // InternalMyDsl.g:2211:4: ( (lv_assemblycontext_27_0= ruleAssemblyContext ) )
            	    // InternalMyDsl.g:2212:5: (lv_assemblycontext_27_0= ruleAssemblyContext )
            	    {
            	    // InternalMyDsl.g:2212:5: (lv_assemblycontext_27_0= ruleAssemblyContext )
            	    // InternalMyDsl.g:2213:6: lv_assemblycontext_27_0= ruleAssemblyContext
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getAssemblycontextAssemblyContextParserRuleCall_15_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_assemblycontext_27_0=ruleAssemblyContext();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"assemblycontext",
            	    							lv_assemblycontext_27_0,
            	    							"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.AssemblyContext");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_28=(Token)match(input,21,FOLLOW_41); 

            			newLeafNode(otherlv_28, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_16());
            		
            otherlv_29=(Token)match(input,53,FOLLOW_3); 

            			newLeafNode(otherlv_29, grammarAccess.getCompositeComponentAccess().getDelegationconnectorKeyword_17());
            		
            otherlv_30=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_30, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_18());
            		
            // InternalMyDsl.g:2243:3: ( (lv_delegationconnector_31_0= ruleDelegationConnector ) )
            // InternalMyDsl.g:2244:4: (lv_delegationconnector_31_0= ruleDelegationConnector )
            {
            // InternalMyDsl.g:2244:4: (lv_delegationconnector_31_0= ruleDelegationConnector )
            // InternalMyDsl.g:2245:5: lv_delegationconnector_31_0= ruleDelegationConnector
            {

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getDelegationconnectorDelegationConnectorParserRuleCall_19_0());
            				
            pushFollow(FOLLOW_13);
            lv_delegationconnector_31_0=ruleDelegationConnector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            					}
            					add(
            						current,
            						"delegationconnector",
            						lv_delegationconnector_31_0,
            						"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.DelegationConnector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2262:3: (otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==15) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMyDsl.g:2263:4: otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) )
            	    {
            	    otherlv_32=(Token)match(input,15,FOLLOW_42); 

            	    				newLeafNode(otherlv_32, grammarAccess.getCompositeComponentAccess().getCommaKeyword_20_0());
            	    			
            	    // InternalMyDsl.g:2267:4: ( (lv_delegationconnector_33_0= ruleDelegationConnector ) )
            	    // InternalMyDsl.g:2268:5: (lv_delegationconnector_33_0= ruleDelegationConnector )
            	    {
            	    // InternalMyDsl.g:2268:5: (lv_delegationconnector_33_0= ruleDelegationConnector )
            	    // InternalMyDsl.g:2269:6: lv_delegationconnector_33_0= ruleDelegationConnector
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getDelegationconnectorDelegationConnectorParserRuleCall_20_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_delegationconnector_33_0=ruleDelegationConnector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"delegationconnector",
            	    							lv_delegationconnector_33_0,
            	    							"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.DelegationConnector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_34=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_34, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_21());
            		
            otherlv_35=(Token)match(input,21,FOLLOW_2); 

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


    // $ANTLR start "entryRuleInternalAction"
    // InternalMyDsl.g:2299:1: entryRuleInternalAction returns [EObject current=null] : iv_ruleInternalAction= ruleInternalAction EOF ;
    public final EObject entryRuleInternalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalAction = null;


        try {
            // InternalMyDsl.g:2299:55: (iv_ruleInternalAction= ruleInternalAction EOF )
            // InternalMyDsl.g:2300:2: iv_ruleInternalAction= ruleInternalAction EOF
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
    // InternalMyDsl.g:2306:1: ruleInternalAction returns [EObject current=null] : ( () otherlv_1= 'InternalAction' ) ;
    public final EObject ruleInternalAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2312:2: ( ( () otherlv_1= 'InternalAction' ) )
            // InternalMyDsl.g:2313:2: ( () otherlv_1= 'InternalAction' )
            {
            // InternalMyDsl.g:2313:2: ( () otherlv_1= 'InternalAction' )
            // InternalMyDsl.g:2314:3: () otherlv_1= 'InternalAction'
            {
            // InternalMyDsl.g:2314:3: ()
            // InternalMyDsl.g:2315:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInternalActionAccess().getInternalActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_2); 

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
    // InternalMyDsl.g:2329:1: entryRuleExternalCall returns [EObject current=null] : iv_ruleExternalCall= ruleExternalCall EOF ;
    public final EObject entryRuleExternalCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalCall = null;


        try {
            // InternalMyDsl.g:2329:53: (iv_ruleExternalCall= ruleExternalCall EOF )
            // InternalMyDsl.g:2330:2: iv_ruleExternalCall= ruleExternalCall EOF
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
    // InternalMyDsl.g:2336:1: ruleExternalCall returns [EObject current=null] : ( () otherlv_1= 'ExternalCall' ) ;
    public final EObject ruleExternalCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2342:2: ( ( () otherlv_1= 'ExternalCall' ) )
            // InternalMyDsl.g:2343:2: ( () otherlv_1= 'ExternalCall' )
            {
            // InternalMyDsl.g:2343:2: ( () otherlv_1= 'ExternalCall' )
            // InternalMyDsl.g:2344:3: () otherlv_1= 'ExternalCall'
            {
            // InternalMyDsl.g:2344:3: ()
            // InternalMyDsl.g:2345:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalCallAccess().getExternalCallAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_2); 

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
    // InternalMyDsl.g:2359:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalMyDsl.g:2359:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalMyDsl.g:2360:2: iv_ruleLoop= ruleLoop EOF
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
    // InternalMyDsl.g:2366:1: ruleLoop returns [EObject current=null] : ( () otherlv_1= 'Loop' ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2372:2: ( ( () otherlv_1= 'Loop' ) )
            // InternalMyDsl.g:2373:2: ( () otherlv_1= 'Loop' )
            {
            // InternalMyDsl.g:2373:2: ( () otherlv_1= 'Loop' )
            // InternalMyDsl.g:2374:3: () otherlv_1= 'Loop'
            {
            // InternalMyDsl.g:2374:3: ()
            // InternalMyDsl.g:2375:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoopAccess().getLoopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,56,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getLoopKeyword_1());
            		

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
    // InternalMyDsl.g:2389:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // InternalMyDsl.g:2389:47: (iv_ruleBranch= ruleBranch EOF )
            // InternalMyDsl.g:2390:2: iv_ruleBranch= ruleBranch EOF
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
    // InternalMyDsl.g:2396:1: ruleBranch returns [EObject current=null] : ( () otherlv_1= 'Branch' ) ;
    public final EObject ruleBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2402:2: ( ( () otherlv_1= 'Branch' ) )
            // InternalMyDsl.g:2403:2: ( () otherlv_1= 'Branch' )
            {
            // InternalMyDsl.g:2403:2: ( () otherlv_1= 'Branch' )
            // InternalMyDsl.g:2404:3: () otherlv_1= 'Branch'
            {
            // InternalMyDsl.g:2404:3: ()
            // InternalMyDsl.g:2405:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBranchAccess().getBranchAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,57,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBranchAccess().getBranchKeyword_1());
            		

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


    // $ANTLR start "entryRuleDelegationConnector"
    // InternalMyDsl.g:2419:1: entryRuleDelegationConnector returns [EObject current=null] : iv_ruleDelegationConnector= ruleDelegationConnector EOF ;
    public final EObject entryRuleDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelegationConnector = null;


        try {
            // InternalMyDsl.g:2419:60: (iv_ruleDelegationConnector= ruleDelegationConnector EOF )
            // InternalMyDsl.g:2420:2: iv_ruleDelegationConnector= ruleDelegationConnector EOF
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
    // InternalMyDsl.g:2426:1: ruleDelegationConnector returns [EObject current=null] : (otherlv_0= 'DelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) ;
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
            // InternalMyDsl.g:2432:2: ( (otherlv_0= 'DelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) )
            // InternalMyDsl.g:2433:2: (otherlv_0= 'DelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            {
            // InternalMyDsl.g:2433:2: (otherlv_0= 'DelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            // InternalMyDsl.g:2434:3: otherlv_0= 'DelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDelegationConnectorAccess().getDelegationConnectorKeyword_0());
            		
            // InternalMyDsl.g:2438:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:2439:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:2439:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:2440:5: lv_name_1_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_43); 

            			newLeafNode(otherlv_2, grammarAccess.getDelegationConnectorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,59,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getDelegationConnectorAccess().getRoleKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getDelegationConnectorAccess().getLeftParenthesisKeyword_4());
            		
            // InternalMyDsl.g:2469:3: ( ( ruleEString ) )
            // InternalMyDsl.g:2470:4: ( ruleEString )
            {
            // InternalMyDsl.g:2470:4: ( ruleEString )
            // InternalMyDsl.g:2471:5: ruleEString
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

            // InternalMyDsl.g:2485:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==15) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMyDsl.g:2486:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_6, grammarAccess.getDelegationConnectorAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalMyDsl.g:2490:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:2491:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:2491:5: ( ruleEString )
            	    // InternalMyDsl.g:2492:6: ruleEString
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
            	    break loop33;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getDelegationConnectorAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,21,FOLLOW_2); 

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
    // InternalMyDsl.g:2519:1: entryRuleRole_Impl returns [EObject current=null] : iv_ruleRole_Impl= ruleRole_Impl EOF ;
    public final EObject entryRuleRole_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole_Impl = null;


        try {
            // InternalMyDsl.g:2519:50: (iv_ruleRole_Impl= ruleRole_Impl EOF )
            // InternalMyDsl.g:2520:2: iv_ruleRole_Impl= ruleRole_Impl EOF
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
    // InternalMyDsl.g:2526:1: ruleRole_Impl returns [EObject current=null] : (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleRole_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2532:2: ( (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:2533:2: (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:2533:2: (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalMyDsl.g:2534:3: otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRole_ImplAccess().getRoleKeyword_0());
            		
            // InternalMyDsl.g:2538:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:2539:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:2539:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:2540:5: lv_name_1_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRole_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getRole_ImplAccess().getInterfaceKeyword_3());
            		
            // InternalMyDsl.g:2565:3: ( ( ruleEString ) )
            // InternalMyDsl.g:2566:4: ( ruleEString )
            {
            // InternalMyDsl.g:2566:4: ( ruleEString )
            // InternalMyDsl.g:2567:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRole_ImplRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRole_ImplAccess().getInterfaceInterfaceCrossReference_4_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

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


    // $ANTLR start "entryRuleContainer"
    // InternalMyDsl.g:2589:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalMyDsl.g:2589:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalMyDsl.g:2590:2: iv_ruleContainer= ruleContainer EOF
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
    // InternalMyDsl.g:2596:1: ruleContainer returns [EObject current=null] : ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2602:2: ( ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:2603:2: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:2603:2: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:2604:3: () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:2604:3: ()
            // InternalMyDsl.g:2605:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContainerAccess().getContainerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,61,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getContainerKeyword_1());
            		
            // InternalMyDsl.g:2615:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:2616:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:2616:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:2617:5: lv_name_2_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.EString");
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
    // InternalMyDsl.g:2638:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalMyDsl.g:2638:45: (iv_ruleLink= ruleLink EOF )
            // InternalMyDsl.g:2639:2: iv_ruleLink= ruleLink EOF
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
    // InternalMyDsl.g:2645:1: ruleLink returns [EObject current=null] : (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'container' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) ;
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
            // InternalMyDsl.g:2651:2: ( (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'container' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) )
            // InternalMyDsl.g:2652:2: (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'container' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            {
            // InternalMyDsl.g:2652:2: (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'container' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            // InternalMyDsl.g:2653:3: otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'container' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalMyDsl.g:2657:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:2658:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:2658:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:2659:5: lv_name_1_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,63,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getContainerKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getLeftParenthesisKeyword_4());
            		
            // InternalMyDsl.g:2688:3: ( ( ruleEString ) )
            // InternalMyDsl.g:2689:4: ( ruleEString )
            {
            // InternalMyDsl.g:2689:4: ( ruleEString )
            // InternalMyDsl.g:2690:5: ruleEString
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

            // InternalMyDsl.g:2704:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==15) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalMyDsl.g:2705:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalMyDsl.g:2709:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:2710:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:2710:5: ( ruleEString )
            	    // InternalMyDsl.g:2711:6: ruleEString
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
            	    break loop34;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,21,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAllocationContext"
    // InternalMyDsl.g:2738:1: entryRuleAllocationContext returns [EObject current=null] : iv_ruleAllocationContext= ruleAllocationContext EOF ;
    public final EObject entryRuleAllocationContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocationContext = null;


        try {
            // InternalMyDsl.g:2738:58: (iv_ruleAllocationContext= ruleAllocationContext EOF )
            // InternalMyDsl.g:2739:2: iv_ruleAllocationContext= ruleAllocationContext EOF
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
    // InternalMyDsl.g:2745:1: ruleAllocationContext returns [EObject current=null] : (otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'container' ( ( ruleEString ) ) otherlv_4= 'assemblycontext' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleAllocationContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2751:2: ( (otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'container' ( ( ruleEString ) ) otherlv_4= 'assemblycontext' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:2752:2: (otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'container' ( ( ruleEString ) ) otherlv_4= 'assemblycontext' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:2752:2: (otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'container' ( ( ruleEString ) ) otherlv_4= 'assemblycontext' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalMyDsl.g:2753:3: otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'container' ( ( ruleEString ) ) otherlv_4= 'assemblycontext' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAllocationContextAccess().getAllocationContextKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,63,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getAllocationContextAccess().getContainerKeyword_2());
            		
            // InternalMyDsl.g:2765:3: ( ( ruleEString ) )
            // InternalMyDsl.g:2766:4: ( ruleEString )
            {
            // InternalMyDsl.g:2766:4: ( ruleEString )
            // InternalMyDsl.g:2767:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getContainerContainerCrossReference_3_0());
            				
            pushFollow(FOLLOW_40);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getAllocationContextAccess().getAssemblycontextKeyword_4());
            		
            // InternalMyDsl.g:2785:3: ( ( ruleEString ) )
            // InternalMyDsl.g:2786:4: ( ruleEString )
            {
            // InternalMyDsl.g:2786:4: ( ruleEString )
            // InternalMyDsl.g:2787:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getAssemblycontextAssemblyContextCrossReference_5_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

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


    // $ANTLR start "rulesimpleTypes"
    // InternalMyDsl.g:2809:1: rulesimpleTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'list' ) | (enumLiteral_7= 'long' ) | (enumLiteral_8= 'map' ) | (enumLiteral_9= 'string' ) ) ;
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
            // InternalMyDsl.g:2815:2: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'list' ) | (enumLiteral_7= 'long' ) | (enumLiteral_8= 'map' ) | (enumLiteral_9= 'string' ) ) )
            // InternalMyDsl.g:2816:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'list' ) | (enumLiteral_7= 'long' ) | (enumLiteral_8= 'map' ) | (enumLiteral_9= 'string' ) )
            {
            // InternalMyDsl.g:2816:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'list' ) | (enumLiteral_7= 'long' ) | (enumLiteral_8= 'map' ) | (enumLiteral_9= 'string' ) )
            int alt35=10;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt35=1;
                }
                break;
            case 66:
                {
                alt35=2;
                }
                break;
            case 67:
                {
                alt35=3;
                }
                break;
            case 68:
                {
                alt35=4;
                }
                break;
            case 69:
                {
                alt35=5;
                }
                break;
            case 70:
                {
                alt35=6;
                }
                break;
            case 71:
                {
                alt35=7;
                }
                break;
            case 72:
                {
                alt35=8;
                }
                break;
            case 73:
                {
                alt35=9;
                }
                break;
            case 74:
                {
                alt35=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:2817:3: (enumLiteral_0= 'int' )
                    {
                    // InternalMyDsl.g:2817:3: (enumLiteral_0= 'int' )
                    // InternalMyDsl.g:2818:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getIntEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSimpleTypesAccess().getIntEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2825:3: (enumLiteral_1= 'boolean' )
                    {
                    // InternalMyDsl.g:2825:3: (enumLiteral_1= 'boolean' )
                    // InternalMyDsl.g:2826:4: enumLiteral_1= 'boolean'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getBooleanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSimpleTypesAccess().getBooleanEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2833:3: (enumLiteral_2= 'char' )
                    {
                    // InternalMyDsl.g:2833:3: (enumLiteral_2= 'char' )
                    // InternalMyDsl.g:2834:4: enumLiteral_2= 'char'
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getCharEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSimpleTypesAccess().getCharEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2841:3: (enumLiteral_3= 'date' )
                    {
                    // InternalMyDsl.g:2841:3: (enumLiteral_3= 'date' )
                    // InternalMyDsl.g:2842:4: enumLiteral_3= 'date'
                    {
                    enumLiteral_3=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getDateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSimpleTypesAccess().getDateEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:2849:3: (enumLiteral_4= 'double' )
                    {
                    // InternalMyDsl.g:2849:3: (enumLiteral_4= 'double' )
                    // InternalMyDsl.g:2850:4: enumLiteral_4= 'double'
                    {
                    enumLiteral_4=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getDoubleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSimpleTypesAccess().getDoubleEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:2857:3: (enumLiteral_5= 'float' )
                    {
                    // InternalMyDsl.g:2857:3: (enumLiteral_5= 'float' )
                    // InternalMyDsl.g:2858:4: enumLiteral_5= 'float'
                    {
                    enumLiteral_5=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getFloatEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSimpleTypesAccess().getFloatEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:2865:3: (enumLiteral_6= 'list' )
                    {
                    // InternalMyDsl.g:2865:3: (enumLiteral_6= 'list' )
                    // InternalMyDsl.g:2866:4: enumLiteral_6= 'list'
                    {
                    enumLiteral_6=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getListEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getSimpleTypesAccess().getListEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:2873:3: (enumLiteral_7= 'long' )
                    {
                    // InternalMyDsl.g:2873:3: (enumLiteral_7= 'long' )
                    // InternalMyDsl.g:2874:4: enumLiteral_7= 'long'
                    {
                    enumLiteral_7=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getLongEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getSimpleTypesAccess().getLongEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:2881:3: (enumLiteral_8= 'map' )
                    {
                    // InternalMyDsl.g:2881:3: (enumLiteral_8= 'map' )
                    // InternalMyDsl.g:2882:4: enumLiteral_8= 'map'
                    {
                    enumLiteral_8=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getMapEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getSimpleTypesAccess().getMapEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:2889:3: (enumLiteral_9= 'string' )
                    {
                    // InternalMyDsl.g:2889:3: (enumLiteral_9= 'string' )
                    // InternalMyDsl.g:2890:4: enumLiteral_9= 'string'
                    {
                    enumLiteral_9=(Token)match(input,74,FOLLOW_2); 

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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000FC0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000F80000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000AE010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400200000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x00000000000007FEL});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x03C0800000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x8000000000000000L});

}