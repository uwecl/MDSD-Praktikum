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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ComponentBasedSystem'", "'{'", "'interface'", "'('", "','", "')'", "'environment'", "'assemblycontext'", "'}'", "'type'", "'assemblyconnector'", "'AssemblyContext'", "'component'", "'Type'", "'AssemblyConnector'", "'providedrole'", "'requiredrole'", "'Signature'", "'returntype'", "'parameter'", "'Parameter'", "'parametertype'", "'ReturnType'", "'ParameterType'", "'Simple'", "'kind'", "'Complex'", "'simple'", "'Void'", "'Component'", "'behaviourdescription'", "'service'", "'BehaviourDescription'", "'Service'", "'correspondingSignatures'", "'RequiredRole'", "'ProvidedRole'", "'CompositeComponent'", "'delegationconnector'", "'InternalAction'", "'ExternalCall'", "'Loop'", "'Branch'", "'DelegationConnector'", "'role'", "'Role'", "'Container'", "'Link'", "'container'", "'int'", "'boolean'", "'char'", "'date'", "'double'", "'float'", "'list'", "'long'", "'map'", "'string'"
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
    public static final int RULE_STRING=4;
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
    // InternalMyDsl.g:72:1: ruleComponentBasedSystem returns [EObject current=null] : (otherlv_0= 'ComponentBasedSystem' otherlv_1= '{' otherlv_2= 'interface' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'environment' ( ( ruleEString ) ) (otherlv_10= 'assemblycontext' otherlv_11= '{' ( (lv_assemblycontext_12_0= ruleAssemblyContext ) ) (otherlv_13= ',' ( (lv_assemblycontext_14_0= ruleAssemblyContext ) ) )* otherlv_15= '}' )? (otherlv_16= 'type' otherlv_17= '{' ( (lv_type_18_0= ruleType ) ) (otherlv_19= ',' ( (lv_type_20_0= ruleType ) ) )* otherlv_21= '}' )? (otherlv_22= 'assemblyconnector' otherlv_23= '{' ( (lv_assemblyconnector_24_0= ruleAssemblyConnector ) ) (otherlv_25= ',' ( (lv_assemblyconnector_26_0= ruleAssemblyConnector ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) ;
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
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        EObject lv_assemblycontext_12_0 = null;

        EObject lv_assemblycontext_14_0 = null;

        EObject lv_type_18_0 = null;

        EObject lv_type_20_0 = null;

        EObject lv_assemblyconnector_24_0 = null;

        EObject lv_assemblyconnector_26_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( (otherlv_0= 'ComponentBasedSystem' otherlv_1= '{' otherlv_2= 'interface' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'environment' ( ( ruleEString ) ) (otherlv_10= 'assemblycontext' otherlv_11= '{' ( (lv_assemblycontext_12_0= ruleAssemblyContext ) ) (otherlv_13= ',' ( (lv_assemblycontext_14_0= ruleAssemblyContext ) ) )* otherlv_15= '}' )? (otherlv_16= 'type' otherlv_17= '{' ( (lv_type_18_0= ruleType ) ) (otherlv_19= ',' ( (lv_type_20_0= ruleType ) ) )* otherlv_21= '}' )? (otherlv_22= 'assemblyconnector' otherlv_23= '{' ( (lv_assemblyconnector_24_0= ruleAssemblyConnector ) ) (otherlv_25= ',' ( (lv_assemblyconnector_26_0= ruleAssemblyConnector ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) )
            // InternalMyDsl.g:79:2: (otherlv_0= 'ComponentBasedSystem' otherlv_1= '{' otherlv_2= 'interface' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'environment' ( ( ruleEString ) ) (otherlv_10= 'assemblycontext' otherlv_11= '{' ( (lv_assemblycontext_12_0= ruleAssemblyContext ) ) (otherlv_13= ',' ( (lv_assemblycontext_14_0= ruleAssemblyContext ) ) )* otherlv_15= '}' )? (otherlv_16= 'type' otherlv_17= '{' ( (lv_type_18_0= ruleType ) ) (otherlv_19= ',' ( (lv_type_20_0= ruleType ) ) )* otherlv_21= '}' )? (otherlv_22= 'assemblyconnector' otherlv_23= '{' ( (lv_assemblyconnector_24_0= ruleAssemblyConnector ) ) (otherlv_25= ',' ( (lv_assemblyconnector_26_0= ruleAssemblyConnector ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            {
            // InternalMyDsl.g:79:2: (otherlv_0= 'ComponentBasedSystem' otherlv_1= '{' otherlv_2= 'interface' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'environment' ( ( ruleEString ) ) (otherlv_10= 'assemblycontext' otherlv_11= '{' ( (lv_assemblycontext_12_0= ruleAssemblyContext ) ) (otherlv_13= ',' ( (lv_assemblycontext_14_0= ruleAssemblyContext ) ) )* otherlv_15= '}' )? (otherlv_16= 'type' otherlv_17= '{' ( (lv_type_18_0= ruleType ) ) (otherlv_19= ',' ( (lv_type_20_0= ruleType ) ) )* otherlv_21= '}' )? (otherlv_22= 'assemblyconnector' otherlv_23= '{' ( (lv_assemblyconnector_24_0= ruleAssemblyConnector ) ) (otherlv_25= ',' ( (lv_assemblyconnector_26_0= ruleAssemblyConnector ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            // InternalMyDsl.g:80:3: otherlv_0= 'ComponentBasedSystem' otherlv_1= '{' otherlv_2= 'interface' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'environment' ( ( ruleEString ) ) (otherlv_10= 'assemblycontext' otherlv_11= '{' ( (lv_assemblycontext_12_0= ruleAssemblyContext ) ) (otherlv_13= ',' ( (lv_assemblycontext_14_0= ruleAssemblyContext ) ) )* otherlv_15= '}' )? (otherlv_16= 'type' otherlv_17= '{' ( (lv_type_18_0= ruleType ) ) (otherlv_19= ',' ( (lv_type_20_0= ruleType ) ) )* otherlv_21= '}' )? (otherlv_22= 'assemblyconnector' otherlv_23= '{' ( (lv_assemblyconnector_24_0= ruleAssemblyConnector ) ) (otherlv_25= ',' ( (lv_assemblyconnector_26_0= ruleAssemblyConnector ) ) )* otherlv_27= '}' )? otherlv_28= '}'
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

            // InternalMyDsl.g:158:3: (otherlv_10= 'assemblycontext' otherlv_11= '{' ( (lv_assemblycontext_12_0= ruleAssemblyContext ) ) (otherlv_13= ',' ( (lv_assemblycontext_14_0= ruleAssemblyContext ) ) )* otherlv_15= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:159:4: otherlv_10= 'assemblycontext' otherlv_11= '{' ( (lv_assemblycontext_12_0= ruleAssemblyContext ) ) (otherlv_13= ',' ( (lv_assemblycontext_14_0= ruleAssemblyContext ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getComponentBasedSystemAccess().getAssemblycontextKeyword_9_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getComponentBasedSystemAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalMyDsl.g:167:4: ( (lv_assemblycontext_12_0= ruleAssemblyContext ) )
                    // InternalMyDsl.g:168:5: (lv_assemblycontext_12_0= ruleAssemblyContext )
                    {
                    // InternalMyDsl.g:168:5: (lv_assemblycontext_12_0= ruleAssemblyContext )
                    // InternalMyDsl.g:169:6: lv_assemblycontext_12_0= ruleAssemblyContext
                    {

                    						newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getAssemblycontextAssemblyContextParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_assemblycontext_12_0=ruleAssemblyContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentBasedSystemRule());
                    						}
                    						add(
                    							current,
                    							"assemblycontext",
                    							lv_assemblycontext_12_0,
                    							"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.AssemblyContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:186:4: (otherlv_13= ',' ( (lv_assemblycontext_14_0= ruleAssemblyContext ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMyDsl.g:187:5: otherlv_13= ',' ( (lv_assemblycontext_14_0= ruleAssemblyContext ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_10); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getComponentBasedSystemAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalMyDsl.g:191:5: ( (lv_assemblycontext_14_0= ruleAssemblyContext ) )
                    	    // InternalMyDsl.g:192:6: (lv_assemblycontext_14_0= ruleAssemblyContext )
                    	    {
                    	    // InternalMyDsl.g:192:6: (lv_assemblycontext_14_0= ruleAssemblyContext )
                    	    // InternalMyDsl.g:193:7: lv_assemblycontext_14_0= ruleAssemblyContext
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getAssemblycontextAssemblyContextParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_assemblycontext_14_0=ruleAssemblyContext();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentBasedSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"assemblycontext",
                    	    								lv_assemblycontext_14_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.AssemblyContext");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_15, grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:216:3: (otherlv_16= 'type' otherlv_17= '{' ( (lv_type_18_0= ruleType ) ) (otherlv_19= ',' ( (lv_type_20_0= ruleType ) ) )* otherlv_21= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:217:4: otherlv_16= 'type' otherlv_17= '{' ( (lv_type_18_0= ruleType ) ) (otherlv_19= ',' ( (lv_type_20_0= ruleType ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getComponentBasedSystemAccess().getTypeKeyword_10_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_17, grammarAccess.getComponentBasedSystemAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalMyDsl.g:225:4: ( (lv_type_18_0= ruleType ) )
                    // InternalMyDsl.g:226:5: (lv_type_18_0= ruleType )
                    {
                    // InternalMyDsl.g:226:5: (lv_type_18_0= ruleType )
                    // InternalMyDsl.g:227:6: lv_type_18_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getTypeTypeParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_type_18_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentBasedSystemRule());
                    						}
                    						add(
                    							current,
                    							"type",
                    							lv_type_18_0,
                    							"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:244:4: (otherlv_19= ',' ( (lv_type_20_0= ruleType ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:245:5: otherlv_19= ',' ( (lv_type_20_0= ruleType ) )
                    	    {
                    	    otherlv_19=(Token)match(input,15,FOLLOW_13); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getComponentBasedSystemAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalMyDsl.g:249:5: ( (lv_type_20_0= ruleType ) )
                    	    // InternalMyDsl.g:250:6: (lv_type_20_0= ruleType )
                    	    {
                    	    // InternalMyDsl.g:250:6: (lv_type_20_0= ruleType )
                    	    // InternalMyDsl.g:251:7: lv_type_20_0= ruleType
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getTypeTypeParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_type_20_0=ruleType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentBasedSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"type",
                    	    								lv_type_20_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.Type");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_21, grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:274:3: (otherlv_22= 'assemblyconnector' otherlv_23= '{' ( (lv_assemblyconnector_24_0= ruleAssemblyConnector ) ) (otherlv_25= ',' ( (lv_assemblyconnector_26_0= ruleAssemblyConnector ) ) )* otherlv_27= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:275:4: otherlv_22= 'assemblyconnector' otherlv_23= '{' ( (lv_assemblyconnector_24_0= ruleAssemblyConnector ) ) (otherlv_25= ',' ( (lv_assemblyconnector_26_0= ruleAssemblyConnector ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getComponentBasedSystemAccess().getAssemblyconnectorKeyword_11_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_23, grammarAccess.getComponentBasedSystemAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalMyDsl.g:283:4: ( (lv_assemblyconnector_24_0= ruleAssemblyConnector ) )
                    // InternalMyDsl.g:284:5: (lv_assemblyconnector_24_0= ruleAssemblyConnector )
                    {
                    // InternalMyDsl.g:284:5: (lv_assemblyconnector_24_0= ruleAssemblyConnector )
                    // InternalMyDsl.g:285:6: lv_assemblyconnector_24_0= ruleAssemblyConnector
                    {

                    						newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getAssemblyconnectorAssemblyConnectorParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_assemblyconnector_24_0=ruleAssemblyConnector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentBasedSystemRule());
                    						}
                    						add(
                    							current,
                    							"assemblyconnector",
                    							lv_assemblyconnector_24_0,
                    							"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.AssemblyConnector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:302:4: (otherlv_25= ',' ( (lv_assemblyconnector_26_0= ruleAssemblyConnector ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMyDsl.g:303:5: otherlv_25= ',' ( (lv_assemblyconnector_26_0= ruleAssemblyConnector ) )
                    	    {
                    	    otherlv_25=(Token)match(input,15,FOLLOW_15); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getComponentBasedSystemAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalMyDsl.g:307:5: ( (lv_assemblyconnector_26_0= ruleAssemblyConnector ) )
                    	    // InternalMyDsl.g:308:6: (lv_assemblyconnector_26_0= ruleAssemblyConnector )
                    	    {
                    	    // InternalMyDsl.g:308:6: (lv_assemblyconnector_26_0= ruleAssemblyConnector )
                    	    // InternalMyDsl.g:309:7: lv_assemblyconnector_26_0= ruleAssemblyConnector
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getAssemblyconnectorAssemblyConnectorParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_assemblyconnector_26_0=ruleAssemblyConnector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentBasedSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"assemblyconnector",
                    	    								lv_assemblyconnector_26_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.AssemblyConnector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,19,FOLLOW_16); 

                    				newLeafNode(otherlv_27, grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            otherlv_28=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_12());
            		

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
    // InternalMyDsl.g:340:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMyDsl.g:340:45: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:341:2: iv_ruleType= ruleType EOF
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
    // InternalMyDsl.g:347:1: ruleType returns [EObject current=null] : (this_Type_Impl_0= ruleType_Impl | this_Simple_1= ruleSimple | this_Complex_2= ruleComplex | this_ParameterType_Impl_3= ruleParameterType_Impl | this_Void_4= ruleVoid | this_ReturnType_Impl_5= ruleReturnType_Impl ) ;
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
            // InternalMyDsl.g:353:2: ( (this_Type_Impl_0= ruleType_Impl | this_Simple_1= ruleSimple | this_Complex_2= ruleComplex | this_ParameterType_Impl_3= ruleParameterType_Impl | this_Void_4= ruleVoid | this_ReturnType_Impl_5= ruleReturnType_Impl ) )
            // InternalMyDsl.g:354:2: (this_Type_Impl_0= ruleType_Impl | this_Simple_1= ruleSimple | this_Complex_2= ruleComplex | this_ParameterType_Impl_3= ruleParameterType_Impl | this_Void_4= ruleVoid | this_ReturnType_Impl_5= ruleReturnType_Impl )
            {
            // InternalMyDsl.g:354:2: (this_Type_Impl_0= ruleType_Impl | this_Simple_1= ruleSimple | this_Complex_2= ruleComplex | this_ParameterType_Impl_3= ruleParameterType_Impl | this_Void_4= ruleVoid | this_ReturnType_Impl_5= ruleReturnType_Impl )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt8=1;
                }
                break;
            case 35:
                {
                alt8=2;
                }
                break;
            case 37:
                {
                alt8=3;
                }
                break;
            case 34:
                {
                alt8=4;
                }
                break;
            case 39:
                {
                alt8=5;
                }
                break;
            case 33:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:355:3: this_Type_Impl_0= ruleType_Impl
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
                    // InternalMyDsl.g:364:3: this_Simple_1= ruleSimple
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
                    // InternalMyDsl.g:373:3: this_Complex_2= ruleComplex
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
                    // InternalMyDsl.g:382:3: this_ParameterType_Impl_3= ruleParameterType_Impl
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
                    // InternalMyDsl.g:391:3: this_Void_4= ruleVoid
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
                    // InternalMyDsl.g:400:3: this_ReturnType_Impl_5= ruleReturnType_Impl
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


    // $ANTLR start "entryRuleBehaviourDescription"
    // InternalMyDsl.g:412:1: entryRuleBehaviourDescription returns [EObject current=null] : iv_ruleBehaviourDescription= ruleBehaviourDescription EOF ;
    public final EObject entryRuleBehaviourDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviourDescription = null;


        try {
            // InternalMyDsl.g:412:61: (iv_ruleBehaviourDescription= ruleBehaviourDescription EOF )
            // InternalMyDsl.g:413:2: iv_ruleBehaviourDescription= ruleBehaviourDescription EOF
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
    // InternalMyDsl.g:419:1: ruleBehaviourDescription returns [EObject current=null] : (this_BehaviourDescription_Impl_0= ruleBehaviourDescription_Impl | this_InternalAction_1= ruleInternalAction | this_ExternalCall_2= ruleExternalCall | this_Loop_3= ruleLoop | this_Branch_4= ruleBranch ) ;
    public final EObject ruleBehaviourDescription() throws RecognitionException {
        EObject current = null;

        EObject this_BehaviourDescription_Impl_0 = null;

        EObject this_InternalAction_1 = null;

        EObject this_ExternalCall_2 = null;

        EObject this_Loop_3 = null;

        EObject this_Branch_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:425:2: ( (this_BehaviourDescription_Impl_0= ruleBehaviourDescription_Impl | this_InternalAction_1= ruleInternalAction | this_ExternalCall_2= ruleExternalCall | this_Loop_3= ruleLoop | this_Branch_4= ruleBranch ) )
            // InternalMyDsl.g:426:2: (this_BehaviourDescription_Impl_0= ruleBehaviourDescription_Impl | this_InternalAction_1= ruleInternalAction | this_ExternalCall_2= ruleExternalCall | this_Loop_3= ruleLoop | this_Branch_4= ruleBranch )
            {
            // InternalMyDsl.g:426:2: (this_BehaviourDescription_Impl_0= ruleBehaviourDescription_Impl | this_InternalAction_1= ruleInternalAction | this_ExternalCall_2= ruleExternalCall | this_Loop_3= ruleLoop | this_Branch_4= ruleBranch )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt9=1;
                }
                break;
            case 50:
                {
                alt9=2;
                }
                break;
            case 51:
                {
                alt9=3;
                }
                break;
            case 52:
                {
                alt9=4;
                }
                break;
            case 53:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:427:3: this_BehaviourDescription_Impl_0= ruleBehaviourDescription_Impl
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
                    // InternalMyDsl.g:436:3: this_InternalAction_1= ruleInternalAction
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
                    // InternalMyDsl.g:445:3: this_ExternalCall_2= ruleExternalCall
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
                    // InternalMyDsl.g:454:3: this_Loop_3= ruleLoop
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
                    // InternalMyDsl.g:463:3: this_Branch_4= ruleBranch
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


    // $ANTLR start "entryRuleAssemblyContext"
    // InternalMyDsl.g:475:1: entryRuleAssemblyContext returns [EObject current=null] : iv_ruleAssemblyContext= ruleAssemblyContext EOF ;
    public final EObject entryRuleAssemblyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyContext = null;


        try {
            // InternalMyDsl.g:475:56: (iv_ruleAssemblyContext= ruleAssemblyContext EOF )
            // InternalMyDsl.g:476:2: iv_ruleAssemblyContext= ruleAssemblyContext EOF
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
    // InternalMyDsl.g:482:1: ruleAssemblyContext returns [EObject current=null] : (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleAssemblyContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:488:2: ( (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:489:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:489:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalMyDsl.g:490:3: otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyContextAccess().getAssemblyContextKeyword_0());
            		
            // InternalMyDsl.g:494:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:495:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:495:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:496:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getAssemblyContextAccess().getComponentKeyword_3());
            		
            // InternalMyDsl.g:521:3: ( ( ruleEString ) )
            // InternalMyDsl.g:522:4: ( ruleEString )
            {
            // InternalMyDsl.g:522:4: ( ruleEString )
            // InternalMyDsl.g:523:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyContextAccess().getComponentComponentCrossReference_4_0());
            				
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:545:1: entryRuleType_Impl returns [EObject current=null] : iv_ruleType_Impl= ruleType_Impl EOF ;
    public final EObject entryRuleType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType_Impl = null;


        try {
            // InternalMyDsl.g:545:50: (iv_ruleType_Impl= ruleType_Impl EOF )
            // InternalMyDsl.g:546:2: iv_ruleType_Impl= ruleType_Impl EOF
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
    // InternalMyDsl.g:552:1: ruleType_Impl returns [EObject current=null] : ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:558:2: ( ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:559:2: ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:559:2: ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:560:3: () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:560:3: ()
            // InternalMyDsl.g:561:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getType_ImplAccess().getTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getType_ImplAccess().getTypeKeyword_1());
            		
            // InternalMyDsl.g:571:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:572:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:572:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:573:5: lv_name_2_0= ruleEString
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
    // InternalMyDsl.g:594:1: entryRuleAssemblyConnector returns [EObject current=null] : iv_ruleAssemblyConnector= ruleAssemblyConnector EOF ;
    public final EObject entryRuleAssemblyConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyConnector = null;


        try {
            // InternalMyDsl.g:594:58: (iv_ruleAssemblyConnector= ruleAssemblyConnector EOF )
            // InternalMyDsl.g:595:2: iv_ruleAssemblyConnector= ruleAssemblyConnector EOF
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
    // InternalMyDsl.g:601:1: ruleAssemblyConnector returns [EObject current=null] : (otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedrole' ( ( ruleEString ) ) otherlv_5= 'requiredrole' ( ( ruleEString ) ) otherlv_7= '}' ) ;
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
            // InternalMyDsl.g:607:2: ( (otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedrole' ( ( ruleEString ) ) otherlv_5= 'requiredrole' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalMyDsl.g:608:2: (otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedrole' ( ( ruleEString ) ) otherlv_5= 'requiredrole' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalMyDsl.g:608:2: (otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedrole' ( ( ruleEString ) ) otherlv_5= 'requiredrole' ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalMyDsl.g:609:3: otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedrole' ( ( ruleEString ) ) otherlv_5= 'requiredrole' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyConnectorAccess().getAssemblyConnectorKeyword_0());
            		
            // InternalMyDsl.g:613:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:614:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:614:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:615:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyConnectorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getAssemblyConnectorAccess().getProvidedroleKeyword_3());
            		
            // InternalMyDsl.g:640:3: ( ( ruleEString ) )
            // InternalMyDsl.g:641:4: ( ruleEString )
            {
            // InternalMyDsl.g:641:4: ( ruleEString )
            // InternalMyDsl.g:642:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getProvidedroleProvidedRoleCrossReference_4_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getAssemblyConnectorAccess().getRequiredroleKeyword_5());
            		
            // InternalMyDsl.g:660:3: ( ( ruleEString ) )
            // InternalMyDsl.g:661:4: ( ruleEString )
            {
            // InternalMyDsl.g:661:4: ( ruleEString )
            // InternalMyDsl.g:662:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getRequiredroleRequiredRoleCrossReference_6_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

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
    // InternalMyDsl.g:684:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:684:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:685:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:691:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:697:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:698:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:698:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:699:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:707:3: this_ID_1= RULE_ID
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
    // InternalMyDsl.g:718:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // InternalMyDsl.g:718:50: (iv_ruleSignature= ruleSignature EOF )
            // InternalMyDsl.g:719:2: iv_ruleSignature= ruleSignature EOF
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
    // InternalMyDsl.g:725:1: ruleSignature returns [EObject current=null] : (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returntype' ( ( ruleEString ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // InternalMyDsl.g:731:2: ( (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returntype' ( ( ruleEString ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalMyDsl.g:732:2: (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returntype' ( ( ruleEString ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:732:2: (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returntype' ( ( ruleEString ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalMyDsl.g:733:3: otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returntype' ( ( ruleEString ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSignatureAccess().getSignatureKeyword_0());
            		
            // InternalMyDsl.g:737:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:738:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:738:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:739:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getSignatureAccess().getReturntypeKeyword_3());
            		
            // InternalMyDsl.g:764:3: ( ( ruleEString ) )
            // InternalMyDsl.g:765:4: ( ruleEString )
            {
            // InternalMyDsl.g:765:4: ( ruleEString )
            // InternalMyDsl.g:766:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSignatureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSignatureAccess().getReturntypeReturnTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:780:3: (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:781:4: otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getSignatureAccess().getParameterKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_22); 

                    				newLeafNode(otherlv_6, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyDsl.g:789:4: ( (lv_parameter_7_0= ruleParameter ) )
                    // InternalMyDsl.g:790:5: (lv_parameter_7_0= ruleParameter )
                    {
                    // InternalMyDsl.g:790:5: (lv_parameter_7_0= ruleParameter )
                    // InternalMyDsl.g:791:6: lv_parameter_7_0= ruleParameter
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
                    							"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:808:4: (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==15) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMyDsl.g:809:5: otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_22); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getSignatureAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:813:5: ( (lv_parameter_9_0= ruleParameter ) )
                    	    // InternalMyDsl.g:814:6: (lv_parameter_9_0= ruleParameter )
                    	    {
                    	    // InternalMyDsl.g:814:6: (lv_parameter_9_0= ruleParameter )
                    	    // InternalMyDsl.g:815:7: lv_parameter_9_0= ruleParameter
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
                    	    								"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,19,FOLLOW_16); 

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
    // InternalMyDsl.g:846:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalMyDsl.g:846:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalMyDsl.g:847:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalMyDsl.g:853:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parametertype' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:859:2: ( (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parametertype' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:860:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parametertype' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:860:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parametertype' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalMyDsl.g:861:3: otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parametertype' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            // InternalMyDsl.g:865:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:866:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:866:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:867:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getParametertypeKeyword_3());
            		
            // InternalMyDsl.g:892:3: ( ( ruleEString ) )
            // InternalMyDsl.g:893:4: ( ruleEString )
            {
            // InternalMyDsl.g:893:4: ( ruleEString )
            // InternalMyDsl.g:894:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterAccess().getParametertypeParameterTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:916:1: entryRuleReturnType_Impl returns [EObject current=null] : iv_ruleReturnType_Impl= ruleReturnType_Impl EOF ;
    public final EObject entryRuleReturnType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnType_Impl = null;


        try {
            // InternalMyDsl.g:916:56: (iv_ruleReturnType_Impl= ruleReturnType_Impl EOF )
            // InternalMyDsl.g:917:2: iv_ruleReturnType_Impl= ruleReturnType_Impl EOF
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
    // InternalMyDsl.g:923:1: ruleReturnType_Impl returns [EObject current=null] : ( () otherlv_1= 'ReturnType' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleReturnType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:929:2: ( ( () otherlv_1= 'ReturnType' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:930:2: ( () otherlv_1= 'ReturnType' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:930:2: ( () otherlv_1= 'ReturnType' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:931:3: () otherlv_1= 'ReturnType' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:931:3: ()
            // InternalMyDsl.g:932:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReturnType_ImplAccess().getReturnTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getReturnType_ImplAccess().getReturnTypeKeyword_1());
            		
            // InternalMyDsl.g:942:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:943:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:943:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:944:5: lv_name_2_0= ruleEString
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
    // InternalMyDsl.g:965:1: entryRuleParameterType_Impl returns [EObject current=null] : iv_ruleParameterType_Impl= ruleParameterType_Impl EOF ;
    public final EObject entryRuleParameterType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType_Impl = null;


        try {
            // InternalMyDsl.g:965:59: (iv_ruleParameterType_Impl= ruleParameterType_Impl EOF )
            // InternalMyDsl.g:966:2: iv_ruleParameterType_Impl= ruleParameterType_Impl EOF
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
    // InternalMyDsl.g:972:1: ruleParameterType_Impl returns [EObject current=null] : ( () otherlv_1= 'ParameterType' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleParameterType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:978:2: ( ( () otherlv_1= 'ParameterType' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:979:2: ( () otherlv_1= 'ParameterType' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:979:2: ( () otherlv_1= 'ParameterType' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:980:3: () otherlv_1= 'ParameterType' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:980:3: ()
            // InternalMyDsl.g:981:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterType_ImplAccess().getParameterTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterType_ImplAccess().getParameterTypeKeyword_1());
            		
            // InternalMyDsl.g:991:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:992:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:992:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:993:5: lv_name_2_0= ruleEString
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
    // InternalMyDsl.g:1014:1: entryRuleSimple returns [EObject current=null] : iv_ruleSimple= ruleSimple EOF ;
    public final EObject entryRuleSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimple = null;


        try {
            // InternalMyDsl.g:1014:47: (iv_ruleSimple= ruleSimple EOF )
            // InternalMyDsl.g:1015:2: iv_ruleSimple= ruleSimple EOF
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
    // InternalMyDsl.g:1021:1: ruleSimple returns [EObject current=null] : ( () otherlv_1= 'Simple' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) ) )? otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:1027:2: ( ( () otherlv_1= 'Simple' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) ) )? otherlv_6= '}' ) )
            // InternalMyDsl.g:1028:2: ( () otherlv_1= 'Simple' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) ) )? otherlv_6= '}' )
            {
            // InternalMyDsl.g:1028:2: ( () otherlv_1= 'Simple' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) ) )? otherlv_6= '}' )
            // InternalMyDsl.g:1029:3: () otherlv_1= 'Simple' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) ) )? otherlv_6= '}'
            {
            // InternalMyDsl.g:1029:3: ()
            // InternalMyDsl.g:1030:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleAccess().getSimpleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleAccess().getSimpleKeyword_1());
            		
            // InternalMyDsl.g:1040:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:1041:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:1041:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:1042:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getSimpleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1063:3: (otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==36) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1064:4: otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_25); 

                    				newLeafNode(otherlv_4, grammarAccess.getSimpleAccess().getKindKeyword_4_0());
                    			
                    // InternalMyDsl.g:1068:4: ( (lv_kind_5_0= rulesimpleTypes ) )
                    // InternalMyDsl.g:1069:5: (lv_kind_5_0= rulesimpleTypes )
                    {
                    // InternalMyDsl.g:1069:5: (lv_kind_5_0= rulesimpleTypes )
                    // InternalMyDsl.g:1070:6: lv_kind_5_0= rulesimpleTypes
                    {

                    						newCompositeNode(grammarAccess.getSimpleAccess().getKindSimpleTypesEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:1096:1: entryRuleComplex returns [EObject current=null] : iv_ruleComplex= ruleComplex EOF ;
    public final EObject entryRuleComplex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplex = null;


        try {
            // InternalMyDsl.g:1096:48: (iv_ruleComplex= ruleComplex EOF )
            // InternalMyDsl.g:1097:2: iv_ruleComplex= ruleComplex EOF
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
    // InternalMyDsl.g:1103:1: ruleComplex returns [EObject current=null] : (otherlv_0= 'Complex' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'simple' otherlv_4= '{' ( (lv_simple_5_0= ruleSimple ) ) (otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) ) )* otherlv_8= '}' otherlv_9= '}' ) ;
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
            // InternalMyDsl.g:1109:2: ( (otherlv_0= 'Complex' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'simple' otherlv_4= '{' ( (lv_simple_5_0= ruleSimple ) ) (otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) ) )* otherlv_8= '}' otherlv_9= '}' ) )
            // InternalMyDsl.g:1110:2: (otherlv_0= 'Complex' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'simple' otherlv_4= '{' ( (lv_simple_5_0= ruleSimple ) ) (otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) ) )* otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalMyDsl.g:1110:2: (otherlv_0= 'Complex' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'simple' otherlv_4= '{' ( (lv_simple_5_0= ruleSimple ) ) (otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) ) )* otherlv_8= '}' otherlv_9= '}' )
            // InternalMyDsl.g:1111:3: otherlv_0= 'Complex' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'simple' otherlv_4= '{' ( (lv_simple_5_0= ruleSimple ) ) (otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) ) )* otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getComplexAccess().getComplexKeyword_0());
            		
            // InternalMyDsl.g:1115:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:1116:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:1116:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:1117:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getComplexAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getComplexAccess().getSimpleKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getComplexAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyDsl.g:1146:3: ( (lv_simple_5_0= ruleSimple ) )
            // InternalMyDsl.g:1147:4: (lv_simple_5_0= ruleSimple )
            {
            // InternalMyDsl.g:1147:4: (lv_simple_5_0= ruleSimple )
            // InternalMyDsl.g:1148:5: lv_simple_5_0= ruleSimple
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
            						"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.Simple");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1165:3: (otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1166:4: otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_27); 

            	    				newLeafNode(otherlv_6, grammarAccess.getComplexAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalMyDsl.g:1170:4: ( (lv_simple_7_0= ruleSimple ) )
            	    // InternalMyDsl.g:1171:5: (lv_simple_7_0= ruleSimple )
            	    {
            	    // InternalMyDsl.g:1171:5: (lv_simple_7_0= ruleSimple )
            	    // InternalMyDsl.g:1172:6: lv_simple_7_0= ruleSimple
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
            	    							"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.Simple");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_8=(Token)match(input,19,FOLLOW_16); 

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
    // InternalMyDsl.g:1202:1: entryRuleVoid returns [EObject current=null] : iv_ruleVoid= ruleVoid EOF ;
    public final EObject entryRuleVoid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoid = null;


        try {
            // InternalMyDsl.g:1202:45: (iv_ruleVoid= ruleVoid EOF )
            // InternalMyDsl.g:1203:2: iv_ruleVoid= ruleVoid EOF
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
    // InternalMyDsl.g:1209:1: ruleVoid returns [EObject current=null] : ( () otherlv_1= 'Void' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleVoid() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1215:2: ( ( () otherlv_1= 'Void' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:1216:2: ( () otherlv_1= 'Void' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:1216:2: ( () otherlv_1= 'Void' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:1217:3: () otherlv_1= 'Void' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:1217:3: ()
            // InternalMyDsl.g:1218:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVoidAccess().getVoidAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getVoidAccess().getVoidKeyword_1());
            		
            // InternalMyDsl.g:1228:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:1229:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:1229:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:1230:5: lv_name_2_0= ruleEString
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
    // InternalMyDsl.g:1251:1: entryRuleComponent_Impl returns [EObject current=null] : iv_ruleComponent_Impl= ruleComponent_Impl EOF ;
    public final EObject entryRuleComponent_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent_Impl = null;


        try {
            // InternalMyDsl.g:1251:55: (iv_ruleComponent_Impl= ruleComponent_Impl EOF )
            // InternalMyDsl.g:1252:2: iv_ruleComponent_Impl= ruleComponent_Impl EOF
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
    // InternalMyDsl.g:1258:1: ruleComponent_Impl returns [EObject current=null] : (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= '}' ) ;
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
            // InternalMyDsl.g:1264:2: ( (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= '}' ) )
            // InternalMyDsl.g:1265:2: (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= '}' )
            {
            // InternalMyDsl.g:1265:2: (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= '}' )
            // InternalMyDsl.g:1266:3: otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getComponent_ImplAccess().getComponentKeyword_0());
            		
            // InternalMyDsl.g:1270:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:1271:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:1271:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:1272:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1293:3: (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==41) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1294:4: otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_29); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalMyDsl.g:1302:4: ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) )
                    // InternalMyDsl.g:1303:5: (lv_behaviourdescription_5_0= ruleBehaviourDescription )
                    {
                    // InternalMyDsl.g:1303:5: (lv_behaviourdescription_5_0= ruleBehaviourDescription )
                    // InternalMyDsl.g:1304:6: lv_behaviourdescription_5_0= ruleBehaviourDescription
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
                    							"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.BehaviourDescription");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1321:4: (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==15) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalMyDsl.g:1322:5: otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_29); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getComponent_ImplAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMyDsl.g:1326:5: ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) )
                    	    // InternalMyDsl.g:1327:6: (lv_behaviourdescription_7_0= ruleBehaviourDescription )
                    	    {
                    	    // InternalMyDsl.g:1327:6: (lv_behaviourdescription_7_0= ruleBehaviourDescription )
                    	    // InternalMyDsl.g:1328:7: lv_behaviourdescription_7_0= ruleBehaviourDescription
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
                    	    								"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.BehaviourDescription");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,19,FOLLOW_30); 

                    				newLeafNode(otherlv_8, grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getComponent_ImplAccess().getServiceKeyword_4());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_10, grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:1359:3: ( (lv_service_11_0= ruleService ) )
            // InternalMyDsl.g:1360:4: (lv_service_11_0= ruleService )
            {
            // InternalMyDsl.g:1360:4: (lv_service_11_0= ruleService )
            // InternalMyDsl.g:1361:5: lv_service_11_0= ruleService
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
            						"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.Service");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1378:3: (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==15) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:1379:4: otherlv_12= ',' ( (lv_service_13_0= ruleService ) )
            	    {
            	    otherlv_12=(Token)match(input,15,FOLLOW_31); 

            	    				newLeafNode(otherlv_12, grammarAccess.getComponent_ImplAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalMyDsl.g:1383:4: ( (lv_service_13_0= ruleService ) )
            	    // InternalMyDsl.g:1384:5: (lv_service_13_0= ruleService )
            	    {
            	    // InternalMyDsl.g:1384:5: (lv_service_13_0= ruleService )
            	    // InternalMyDsl.g:1385:6: lv_service_13_0= ruleService
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
            	    							"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.Service");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_14=(Token)match(input,19,FOLLOW_32); 

            			newLeafNode(otherlv_14, grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalMyDsl.g:1407:3: (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1408:4: otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getComponent_ImplAccess().getRequiredroleKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_33); 

                    				newLeafNode(otherlv_16, grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalMyDsl.g:1416:4: ( (lv_requiredrole_17_0= ruleRequiredRole ) )
                    // InternalMyDsl.g:1417:5: (lv_requiredrole_17_0= ruleRequiredRole )
                    {
                    // InternalMyDsl.g:1417:5: (lv_requiredrole_17_0= ruleRequiredRole )
                    // InternalMyDsl.g:1418:6: lv_requiredrole_17_0= ruleRequiredRole
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
                    							"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.RequiredRole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1435:4: (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==15) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalMyDsl.g:1436:5: otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FOLLOW_33); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getComponent_ImplAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalMyDsl.g:1440:5: ( (lv_requiredrole_19_0= ruleRequiredRole ) )
                    	    // InternalMyDsl.g:1441:6: (lv_requiredrole_19_0= ruleRequiredRole )
                    	    {
                    	    // InternalMyDsl.g:1441:6: (lv_requiredrole_19_0= ruleRequiredRole )
                    	    // InternalMyDsl.g:1442:7: lv_requiredrole_19_0= ruleRequiredRole
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
                    	    								"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.RequiredRole");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,19,FOLLOW_18); 

                    				newLeafNode(otherlv_20, grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,26,FOLLOW_34); 

            			newLeafNode(otherlv_21, grammarAccess.getComponent_ImplAccess().getProvidedroleKeyword_10());
            		
            // InternalMyDsl.g:1469:3: ( (lv_providedrole_22_0= ruleProvidedRole ) )
            // InternalMyDsl.g:1470:4: (lv_providedrole_22_0= ruleProvidedRole )
            {
            // InternalMyDsl.g:1470:4: (lv_providedrole_22_0= ruleProvidedRole )
            // InternalMyDsl.g:1471:5: lv_providedrole_22_0= ruleProvidedRole
            {

            					newCompositeNode(grammarAccess.getComponent_ImplAccess().getProvidedroleProvidedRoleParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_16);
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


    // $ANTLR start "entryRuleBehaviourDescription_Impl"
    // InternalMyDsl.g:1496:1: entryRuleBehaviourDescription_Impl returns [EObject current=null] : iv_ruleBehaviourDescription_Impl= ruleBehaviourDescription_Impl EOF ;
    public final EObject entryRuleBehaviourDescription_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviourDescription_Impl = null;


        try {
            // InternalMyDsl.g:1496:66: (iv_ruleBehaviourDescription_Impl= ruleBehaviourDescription_Impl EOF )
            // InternalMyDsl.g:1497:2: iv_ruleBehaviourDescription_Impl= ruleBehaviourDescription_Impl EOF
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
    // InternalMyDsl.g:1503:1: ruleBehaviourDescription_Impl returns [EObject current=null] : ( () otherlv_1= 'BehaviourDescription' ) ;
    public final EObject ruleBehaviourDescription_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1509:2: ( ( () otherlv_1= 'BehaviourDescription' ) )
            // InternalMyDsl.g:1510:2: ( () otherlv_1= 'BehaviourDescription' )
            {
            // InternalMyDsl.g:1510:2: ( () otherlv_1= 'BehaviourDescription' )
            // InternalMyDsl.g:1511:3: () otherlv_1= 'BehaviourDescription'
            {
            // InternalMyDsl.g:1511:3: ()
            // InternalMyDsl.g:1512:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBehaviourDescription_ImplAccess().getBehaviourDescriptionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_2); 

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
    // InternalMyDsl.g:1526:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalMyDsl.g:1526:48: (iv_ruleService= ruleService EOF )
            // InternalMyDsl.g:1527:2: iv_ruleService= ruleService EOF
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
    // InternalMyDsl.g:1533:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'correspondingSignatures' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' ) ;
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
            // InternalMyDsl.g:1539:2: ( (otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'correspondingSignatures' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' ) )
            // InternalMyDsl.g:1540:2: (otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'correspondingSignatures' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' )
            {
            // InternalMyDsl.g:1540:2: (otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'correspondingSignatures' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' )
            // InternalMyDsl.g:1541:3: otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'correspondingSignatures' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,45,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getCorrespondingSignaturesKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMyDsl.g:1557:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1558:4: ( ruleEString )
            {
            // InternalMyDsl.g:1558:4: ( ruleEString )
            // InternalMyDsl.g:1559:5: ruleEString
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

            // InternalMyDsl.g:1573:3: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==15) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:1574:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalMyDsl.g:1578:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:1579:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:1579:5: ( ruleEString )
            	    // InternalMyDsl.g:1580:6: ruleEString
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
            	    break loop20;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_16); 

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


    // $ANTLR start "entryRuleRequiredRole"
    // InternalMyDsl.g:1607:1: entryRuleRequiredRole returns [EObject current=null] : iv_ruleRequiredRole= ruleRequiredRole EOF ;
    public final EObject entryRuleRequiredRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredRole = null;


        try {
            // InternalMyDsl.g:1607:53: (iv_ruleRequiredRole= ruleRequiredRole EOF )
            // InternalMyDsl.g:1608:2: iv_ruleRequiredRole= ruleRequiredRole EOF
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
    // InternalMyDsl.g:1614:1: ruleRequiredRole returns [EObject current=null] : (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleRequiredRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1620:2: ( (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:1621:2: (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:1621:2: (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalMyDsl.g:1622:3: otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRequiredRoleAccess().getRequiredRoleKeyword_0());
            		
            // InternalMyDsl.g:1626:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:1627:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:1627:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:1628:5: lv_name_1_0= ruleEString
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
            		
            // InternalMyDsl.g:1653:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1654:4: ( ruleEString )
            {
            // InternalMyDsl.g:1654:4: ( ruleEString )
            // InternalMyDsl.g:1655:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequiredRoleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRequiredRoleAccess().getInterfaceInterfaceCrossReference_4_0());
            				
            pushFollow(FOLLOW_16);
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


    // $ANTLR start "entryRuleProvidedRole"
    // InternalMyDsl.g:1677:1: entryRuleProvidedRole returns [EObject current=null] : iv_ruleProvidedRole= ruleProvidedRole EOF ;
    public final EObject entryRuleProvidedRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedRole = null;


        try {
            // InternalMyDsl.g:1677:53: (iv_ruleProvidedRole= ruleProvidedRole EOF )
            // InternalMyDsl.g:1678:2: iv_ruleProvidedRole= ruleProvidedRole EOF
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
    // InternalMyDsl.g:1684:1: ruleProvidedRole returns [EObject current=null] : (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleProvidedRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1690:2: ( (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:1691:2: (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:1691:2: (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalMyDsl.g:1692:3: otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getProvidedRoleAccess().getProvidedRoleKeyword_0());
            		
            // InternalMyDsl.g:1696:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:1697:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:1697:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:1698:5: lv_name_1_0= ruleEString
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
            		
            // InternalMyDsl.g:1723:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1724:4: ( ruleEString )
            {
            // InternalMyDsl.g:1724:4: ( ruleEString )
            // InternalMyDsl.g:1725:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProvidedRoleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProvidedRoleAccess().getInterfaceInterfaceCrossReference_4_0());
            				
            pushFollow(FOLLOW_16);
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


    // $ANTLR start "entryRuleCompositeComponent"
    // InternalMyDsl.g:1747:1: entryRuleCompositeComponent returns [EObject current=null] : iv_ruleCompositeComponent= ruleCompositeComponent EOF ;
    public final EObject entryRuleCompositeComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeComponent = null;


        try {
            // InternalMyDsl.g:1747:59: (iv_ruleCompositeComponent= ruleCompositeComponent EOF )
            // InternalMyDsl.g:1748:2: iv_ruleCompositeComponent= ruleCompositeComponent EOF
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
    // InternalMyDsl.g:1754:1: ruleCompositeComponent returns [EObject current=null] : (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= 'assemblycontext' otherlv_24= '{' ( (lv_assemblycontext_25_0= ruleAssemblyContext ) ) (otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) ) )* otherlv_28= '}' otherlv_29= 'delegationconnector' otherlv_30= '{' ( (lv_delegationconnector_31_0= ruleDelegationConnector ) ) (otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) ) )* otherlv_34= '}' otherlv_35= '}' ) ;
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
            // InternalMyDsl.g:1760:2: ( (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= 'assemblycontext' otherlv_24= '{' ( (lv_assemblycontext_25_0= ruleAssemblyContext ) ) (otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) ) )* otherlv_28= '}' otherlv_29= 'delegationconnector' otherlv_30= '{' ( (lv_delegationconnector_31_0= ruleDelegationConnector ) ) (otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) ) )* otherlv_34= '}' otherlv_35= '}' ) )
            // InternalMyDsl.g:1761:2: (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= 'assemblycontext' otherlv_24= '{' ( (lv_assemblycontext_25_0= ruleAssemblyContext ) ) (otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) ) )* otherlv_28= '}' otherlv_29= 'delegationconnector' otherlv_30= '{' ( (lv_delegationconnector_31_0= ruleDelegationConnector ) ) (otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) ) )* otherlv_34= '}' otherlv_35= '}' )
            {
            // InternalMyDsl.g:1761:2: (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= 'assemblycontext' otherlv_24= '{' ( (lv_assemblycontext_25_0= ruleAssemblyContext ) ) (otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) ) )* otherlv_28= '}' otherlv_29= 'delegationconnector' otherlv_30= '{' ( (lv_delegationconnector_31_0= ruleDelegationConnector ) ) (otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) ) )* otherlv_34= '}' otherlv_35= '}' )
            // InternalMyDsl.g:1762:3: otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= 'assemblycontext' otherlv_24= '{' ( (lv_assemblycontext_25_0= ruleAssemblyContext ) ) (otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) ) )* otherlv_28= '}' otherlv_29= 'delegationconnector' otherlv_30= '{' ( (lv_delegationconnector_31_0= ruleDelegationConnector ) ) (otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) ) )* otherlv_34= '}' otherlv_35= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositeComponentAccess().getCompositeComponentKeyword_0());
            		
            // InternalMyDsl.g:1766:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:1767:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:1767:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:1768:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1789:3: (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==41) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1790:4: otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_29); 

                    				newLeafNode(otherlv_4, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalMyDsl.g:1798:4: ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) )
                    // InternalMyDsl.g:1799:5: (lv_behaviourdescription_5_0= ruleBehaviourDescription )
                    {
                    // InternalMyDsl.g:1799:5: (lv_behaviourdescription_5_0= ruleBehaviourDescription )
                    // InternalMyDsl.g:1800:6: lv_behaviourdescription_5_0= ruleBehaviourDescription
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
                    							"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.BehaviourDescription");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1817:4: (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==15) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalMyDsl.g:1818:5: otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_29); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getCompositeComponentAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMyDsl.g:1822:5: ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) )
                    	    // InternalMyDsl.g:1823:6: (lv_behaviourdescription_7_0= ruleBehaviourDescription )
                    	    {
                    	    // InternalMyDsl.g:1823:6: (lv_behaviourdescription_7_0= ruleBehaviourDescription )
                    	    // InternalMyDsl.g:1824:7: lv_behaviourdescription_7_0= ruleBehaviourDescription
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
                    	    								"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.BehaviourDescription");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,19,FOLLOW_30); 

                    				newLeafNode(otherlv_8, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getCompositeComponentAccess().getServiceKeyword_4());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_10, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:1855:3: ( (lv_service_11_0= ruleService ) )
            // InternalMyDsl.g:1856:4: (lv_service_11_0= ruleService )
            {
            // InternalMyDsl.g:1856:4: (lv_service_11_0= ruleService )
            // InternalMyDsl.g:1857:5: lv_service_11_0= ruleService
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
            						"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.Service");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1874:3: (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==15) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:1875:4: otherlv_12= ',' ( (lv_service_13_0= ruleService ) )
            	    {
            	    otherlv_12=(Token)match(input,15,FOLLOW_31); 

            	    				newLeafNode(otherlv_12, grammarAccess.getCompositeComponentAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalMyDsl.g:1879:4: ( (lv_service_13_0= ruleService ) )
            	    // InternalMyDsl.g:1880:5: (lv_service_13_0= ruleService )
            	    {
            	    // InternalMyDsl.g:1880:5: (lv_service_13_0= ruleService )
            	    // InternalMyDsl.g:1881:6: lv_service_13_0= ruleService
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
            	    							"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.Service");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_14=(Token)match(input,19,FOLLOW_32); 

            			newLeafNode(otherlv_14, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalMyDsl.g:1903:3: (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==27) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1904:4: otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getCompositeComponentAccess().getRequiredroleKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_33); 

                    				newLeafNode(otherlv_16, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalMyDsl.g:1912:4: ( (lv_requiredrole_17_0= ruleRequiredRole ) )
                    // InternalMyDsl.g:1913:5: (lv_requiredrole_17_0= ruleRequiredRole )
                    {
                    // InternalMyDsl.g:1913:5: (lv_requiredrole_17_0= ruleRequiredRole )
                    // InternalMyDsl.g:1914:6: lv_requiredrole_17_0= ruleRequiredRole
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
                    							"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.RequiredRole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1931:4: (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==15) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalMyDsl.g:1932:5: otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FOLLOW_33); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getCompositeComponentAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalMyDsl.g:1936:5: ( (lv_requiredrole_19_0= ruleRequiredRole ) )
                    	    // InternalMyDsl.g:1937:6: (lv_requiredrole_19_0= ruleRequiredRole )
                    	    {
                    	    // InternalMyDsl.g:1937:6: (lv_requiredrole_19_0= ruleRequiredRole )
                    	    // InternalMyDsl.g:1938:7: lv_requiredrole_19_0= ruleRequiredRole
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
                    	    								"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.RequiredRole");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,19,FOLLOW_18); 

                    				newLeafNode(otherlv_20, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,26,FOLLOW_34); 

            			newLeafNode(otherlv_21, grammarAccess.getCompositeComponentAccess().getProvidedroleKeyword_10());
            		
            // InternalMyDsl.g:1965:3: ( (lv_providedrole_22_0= ruleProvidedRole ) )
            // InternalMyDsl.g:1966:4: (lv_providedrole_22_0= ruleProvidedRole )
            {
            // InternalMyDsl.g:1966:4: (lv_providedrole_22_0= ruleProvidedRole )
            // InternalMyDsl.g:1967:5: lv_providedrole_22_0= ruleProvidedRole
            {

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidedroleProvidedRoleParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_36);
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

            otherlv_23=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_23, grammarAccess.getCompositeComponentAccess().getAssemblycontextKeyword_12());
            		
            otherlv_24=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_24, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalMyDsl.g:1992:3: ( (lv_assemblycontext_25_0= ruleAssemblyContext ) )
            // InternalMyDsl.g:1993:4: (lv_assemblycontext_25_0= ruleAssemblyContext )
            {
            // InternalMyDsl.g:1993:4: (lv_assemblycontext_25_0= ruleAssemblyContext )
            // InternalMyDsl.g:1994:5: lv_assemblycontext_25_0= ruleAssemblyContext
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
            						"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.AssemblyContext");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2011:3: (otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==15) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyDsl.g:2012:4: otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) )
            	    {
            	    otherlv_26=(Token)match(input,15,FOLLOW_10); 

            	    				newLeafNode(otherlv_26, grammarAccess.getCompositeComponentAccess().getCommaKeyword_15_0());
            	    			
            	    // InternalMyDsl.g:2016:4: ( (lv_assemblycontext_27_0= ruleAssemblyContext ) )
            	    // InternalMyDsl.g:2017:5: (lv_assemblycontext_27_0= ruleAssemblyContext )
            	    {
            	    // InternalMyDsl.g:2017:5: (lv_assemblycontext_27_0= ruleAssemblyContext )
            	    // InternalMyDsl.g:2018:6: lv_assemblycontext_27_0= ruleAssemblyContext
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
            	    							"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.AssemblyContext");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_28=(Token)match(input,19,FOLLOW_37); 

            			newLeafNode(otherlv_28, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_16());
            		
            otherlv_29=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_29, grammarAccess.getCompositeComponentAccess().getDelegationconnectorKeyword_17());
            		
            otherlv_30=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_30, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_18());
            		
            // InternalMyDsl.g:2048:3: ( (lv_delegationconnector_31_0= ruleDelegationConnector ) )
            // InternalMyDsl.g:2049:4: (lv_delegationconnector_31_0= ruleDelegationConnector )
            {
            // InternalMyDsl.g:2049:4: (lv_delegationconnector_31_0= ruleDelegationConnector )
            // InternalMyDsl.g:2050:5: lv_delegationconnector_31_0= ruleDelegationConnector
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
            						"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.DelegationConnector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2067:3: (otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==15) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMyDsl.g:2068:4: otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) )
            	    {
            	    otherlv_32=(Token)match(input,15,FOLLOW_38); 

            	    				newLeafNode(otherlv_32, grammarAccess.getCompositeComponentAccess().getCommaKeyword_20_0());
            	    			
            	    // InternalMyDsl.g:2072:4: ( (lv_delegationconnector_33_0= ruleDelegationConnector ) )
            	    // InternalMyDsl.g:2073:5: (lv_delegationconnector_33_0= ruleDelegationConnector )
            	    {
            	    // InternalMyDsl.g:2073:5: (lv_delegationconnector_33_0= ruleDelegationConnector )
            	    // InternalMyDsl.g:2074:6: lv_delegationconnector_33_0= ruleDelegationConnector
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
            	    							"edu.kit.ipd.sdq.mdsdpc.mydsl.MyDsl.DelegationConnector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_34=(Token)match(input,19,FOLLOW_16); 

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


    // $ANTLR start "entryRuleInternalAction"
    // InternalMyDsl.g:2104:1: entryRuleInternalAction returns [EObject current=null] : iv_ruleInternalAction= ruleInternalAction EOF ;
    public final EObject entryRuleInternalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalAction = null;


        try {
            // InternalMyDsl.g:2104:55: (iv_ruleInternalAction= ruleInternalAction EOF )
            // InternalMyDsl.g:2105:2: iv_ruleInternalAction= ruleInternalAction EOF
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
    // InternalMyDsl.g:2111:1: ruleInternalAction returns [EObject current=null] : ( () otherlv_1= 'InternalAction' ) ;
    public final EObject ruleInternalAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2117:2: ( ( () otherlv_1= 'InternalAction' ) )
            // InternalMyDsl.g:2118:2: ( () otherlv_1= 'InternalAction' )
            {
            // InternalMyDsl.g:2118:2: ( () otherlv_1= 'InternalAction' )
            // InternalMyDsl.g:2119:3: () otherlv_1= 'InternalAction'
            {
            // InternalMyDsl.g:2119:3: ()
            // InternalMyDsl.g:2120:4: 
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
    // InternalMyDsl.g:2134:1: entryRuleExternalCall returns [EObject current=null] : iv_ruleExternalCall= ruleExternalCall EOF ;
    public final EObject entryRuleExternalCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalCall = null;


        try {
            // InternalMyDsl.g:2134:53: (iv_ruleExternalCall= ruleExternalCall EOF )
            // InternalMyDsl.g:2135:2: iv_ruleExternalCall= ruleExternalCall EOF
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
    // InternalMyDsl.g:2141:1: ruleExternalCall returns [EObject current=null] : ( () otherlv_1= 'ExternalCall' ) ;
    public final EObject ruleExternalCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2147:2: ( ( () otherlv_1= 'ExternalCall' ) )
            // InternalMyDsl.g:2148:2: ( () otherlv_1= 'ExternalCall' )
            {
            // InternalMyDsl.g:2148:2: ( () otherlv_1= 'ExternalCall' )
            // InternalMyDsl.g:2149:3: () otherlv_1= 'ExternalCall'
            {
            // InternalMyDsl.g:2149:3: ()
            // InternalMyDsl.g:2150:4: 
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
    // InternalMyDsl.g:2164:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalMyDsl.g:2164:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalMyDsl.g:2165:2: iv_ruleLoop= ruleLoop EOF
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
    // InternalMyDsl.g:2171:1: ruleLoop returns [EObject current=null] : ( () otherlv_1= 'Loop' ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2177:2: ( ( () otherlv_1= 'Loop' ) )
            // InternalMyDsl.g:2178:2: ( () otherlv_1= 'Loop' )
            {
            // InternalMyDsl.g:2178:2: ( () otherlv_1= 'Loop' )
            // InternalMyDsl.g:2179:3: () otherlv_1= 'Loop'
            {
            // InternalMyDsl.g:2179:3: ()
            // InternalMyDsl.g:2180:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoopAccess().getLoopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_2); 

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
    // InternalMyDsl.g:2194:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // InternalMyDsl.g:2194:47: (iv_ruleBranch= ruleBranch EOF )
            // InternalMyDsl.g:2195:2: iv_ruleBranch= ruleBranch EOF
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
    // InternalMyDsl.g:2201:1: ruleBranch returns [EObject current=null] : ( () otherlv_1= 'Branch' ) ;
    public final EObject ruleBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2207:2: ( ( () otherlv_1= 'Branch' ) )
            // InternalMyDsl.g:2208:2: ( () otherlv_1= 'Branch' )
            {
            // InternalMyDsl.g:2208:2: ( () otherlv_1= 'Branch' )
            // InternalMyDsl.g:2209:3: () otherlv_1= 'Branch'
            {
            // InternalMyDsl.g:2209:3: ()
            // InternalMyDsl.g:2210:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBranchAccess().getBranchAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,53,FOLLOW_2); 

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
    // InternalMyDsl.g:2224:1: entryRuleDelegationConnector returns [EObject current=null] : iv_ruleDelegationConnector= ruleDelegationConnector EOF ;
    public final EObject entryRuleDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelegationConnector = null;


        try {
            // InternalMyDsl.g:2224:60: (iv_ruleDelegationConnector= ruleDelegationConnector EOF )
            // InternalMyDsl.g:2225:2: iv_ruleDelegationConnector= ruleDelegationConnector EOF
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
    // InternalMyDsl.g:2231:1: ruleDelegationConnector returns [EObject current=null] : (otherlv_0= 'DelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) ;
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
            // InternalMyDsl.g:2237:2: ( (otherlv_0= 'DelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) )
            // InternalMyDsl.g:2238:2: (otherlv_0= 'DelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            {
            // InternalMyDsl.g:2238:2: (otherlv_0= 'DelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            // InternalMyDsl.g:2239:3: otherlv_0= 'DelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDelegationConnectorAccess().getDelegationConnectorKeyword_0());
            		
            // InternalMyDsl.g:2243:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:2244:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:2244:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:2245:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getDelegationConnectorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,55,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getDelegationConnectorAccess().getRoleKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getDelegationConnectorAccess().getLeftParenthesisKeyword_4());
            		
            // InternalMyDsl.g:2274:3: ( ( ruleEString ) )
            // InternalMyDsl.g:2275:4: ( ruleEString )
            {
            // InternalMyDsl.g:2275:4: ( ruleEString )
            // InternalMyDsl.g:2276:5: ruleEString
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

            // InternalMyDsl.g:2290:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==15) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:2291:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_6, grammarAccess.getDelegationConnectorAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalMyDsl.g:2295:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:2296:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:2296:5: ( ruleEString )
            	    // InternalMyDsl.g:2297:6: ruleEString
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
            	    break loop28;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_16); 

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
    // InternalMyDsl.g:2324:1: entryRuleRole_Impl returns [EObject current=null] : iv_ruleRole_Impl= ruleRole_Impl EOF ;
    public final EObject entryRuleRole_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole_Impl = null;


        try {
            // InternalMyDsl.g:2324:50: (iv_ruleRole_Impl= ruleRole_Impl EOF )
            // InternalMyDsl.g:2325:2: iv_ruleRole_Impl= ruleRole_Impl EOF
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
    // InternalMyDsl.g:2331:1: ruleRole_Impl returns [EObject current=null] : (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleRole_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2337:2: ( (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:2338:2: (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:2338:2: (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalMyDsl.g:2339:3: otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRole_ImplAccess().getRoleKeyword_0());
            		
            // InternalMyDsl.g:2343:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:2344:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:2344:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:2345:5: lv_name_1_0= ruleEString
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
            		
            // InternalMyDsl.g:2370:3: ( ( ruleEString ) )
            // InternalMyDsl.g:2371:4: ( ruleEString )
            {
            // InternalMyDsl.g:2371:4: ( ruleEString )
            // InternalMyDsl.g:2372:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRole_ImplRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRole_ImplAccess().getInterfaceInterfaceCrossReference_4_0());
            				
            pushFollow(FOLLOW_16);
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


    // $ANTLR start "entryRuleContainer"
    // InternalMyDsl.g:2394:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalMyDsl.g:2394:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalMyDsl.g:2395:2: iv_ruleContainer= ruleContainer EOF
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
    // InternalMyDsl.g:2401:1: ruleContainer returns [EObject current=null] : ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2407:2: ( ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:2408:2: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:2408:2: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:2409:3: () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:2409:3: ()
            // InternalMyDsl.g:2410:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContainerAccess().getContainerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,57,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getContainerKeyword_1());
            		
            // InternalMyDsl.g:2420:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:2421:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:2421:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:2422:5: lv_name_2_0= ruleEString
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
    // InternalMyDsl.g:2443:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalMyDsl.g:2443:45: (iv_ruleLink= ruleLink EOF )
            // InternalMyDsl.g:2444:2: iv_ruleLink= ruleLink EOF
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
    // InternalMyDsl.g:2450:1: ruleLink returns [EObject current=null] : (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'container' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) ;
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
            // InternalMyDsl.g:2456:2: ( (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'container' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) )
            // InternalMyDsl.g:2457:2: (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'container' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            {
            // InternalMyDsl.g:2457:2: (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'container' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            // InternalMyDsl.g:2458:3: otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'container' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalMyDsl.g:2462:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:2463:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:2463:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:2464:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,59,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getContainerKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getLeftParenthesisKeyword_4());
            		
            // InternalMyDsl.g:2493:3: ( ( ruleEString ) )
            // InternalMyDsl.g:2494:4: ( ruleEString )
            {
            // InternalMyDsl.g:2494:4: ( ruleEString )
            // InternalMyDsl.g:2495:5: ruleEString
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

            // InternalMyDsl.g:2509:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==15) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMyDsl.g:2510:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalMyDsl.g:2514:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:2515:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:2515:5: ( ruleEString )
            	    // InternalMyDsl.g:2516:6: ruleEString
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
            	    break loop29;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_16); 

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
    // InternalMyDsl.g:2543:1: rulesimpleTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'list' ) | (enumLiteral_7= 'long' ) | (enumLiteral_8= 'map' ) | (enumLiteral_9= 'string' ) ) ;
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
            // InternalMyDsl.g:2549:2: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'list' ) | (enumLiteral_7= 'long' ) | (enumLiteral_8= 'map' ) | (enumLiteral_9= 'string' ) ) )
            // InternalMyDsl.g:2550:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'list' ) | (enumLiteral_7= 'long' ) | (enumLiteral_8= 'map' ) | (enumLiteral_9= 'string' ) )
            {
            // InternalMyDsl.g:2550:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'list' ) | (enumLiteral_7= 'long' ) | (enumLiteral_8= 'map' ) | (enumLiteral_9= 'string' ) )
            int alt30=10;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt30=1;
                }
                break;
            case 61:
                {
                alt30=2;
                }
                break;
            case 62:
                {
                alt30=3;
                }
                break;
            case 63:
                {
                alt30=4;
                }
                break;
            case 64:
                {
                alt30=5;
                }
                break;
            case 65:
                {
                alt30=6;
                }
                break;
            case 66:
                {
                alt30=7;
                }
                break;
            case 67:
                {
                alt30=8;
                }
                break;
            case 68:
                {
                alt30=9;
                }
                break;
            case 69:
                {
                alt30=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:2551:3: (enumLiteral_0= 'int' )
                    {
                    // InternalMyDsl.g:2551:3: (enumLiteral_0= 'int' )
                    // InternalMyDsl.g:2552:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getIntEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSimpleTypesAccess().getIntEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2559:3: (enumLiteral_1= 'boolean' )
                    {
                    // InternalMyDsl.g:2559:3: (enumLiteral_1= 'boolean' )
                    // InternalMyDsl.g:2560:4: enumLiteral_1= 'boolean'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getBooleanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSimpleTypesAccess().getBooleanEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2567:3: (enumLiteral_2= 'char' )
                    {
                    // InternalMyDsl.g:2567:3: (enumLiteral_2= 'char' )
                    // InternalMyDsl.g:2568:4: enumLiteral_2= 'char'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getCharEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSimpleTypesAccess().getCharEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2575:3: (enumLiteral_3= 'date' )
                    {
                    // InternalMyDsl.g:2575:3: (enumLiteral_3= 'date' )
                    // InternalMyDsl.g:2576:4: enumLiteral_3= 'date'
                    {
                    enumLiteral_3=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getDateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSimpleTypesAccess().getDateEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:2583:3: (enumLiteral_4= 'double' )
                    {
                    // InternalMyDsl.g:2583:3: (enumLiteral_4= 'double' )
                    // InternalMyDsl.g:2584:4: enumLiteral_4= 'double'
                    {
                    enumLiteral_4=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getDoubleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSimpleTypesAccess().getDoubleEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:2591:3: (enumLiteral_5= 'float' )
                    {
                    // InternalMyDsl.g:2591:3: (enumLiteral_5= 'float' )
                    // InternalMyDsl.g:2592:4: enumLiteral_5= 'float'
                    {
                    enumLiteral_5=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getFloatEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSimpleTypesAccess().getFloatEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:2599:3: (enumLiteral_6= 'list' )
                    {
                    // InternalMyDsl.g:2599:3: (enumLiteral_6= 'list' )
                    // InternalMyDsl.g:2600:4: enumLiteral_6= 'list'
                    {
                    enumLiteral_6=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getListEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getSimpleTypesAccess().getListEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:2607:3: (enumLiteral_7= 'long' )
                    {
                    // InternalMyDsl.g:2607:3: (enumLiteral_7= 'long' )
                    // InternalMyDsl.g:2608:4: enumLiteral_7= 'long'
                    {
                    enumLiteral_7=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getLongEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getSimpleTypesAccess().getLongEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:2615:3: (enumLiteral_8= 'map' )
                    {
                    // InternalMyDsl.g:2615:3: (enumLiteral_8= 'map' )
                    // InternalMyDsl.g:2616:4: enumLiteral_8= 'map'
                    {
                    enumLiteral_8=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getMapEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getSimpleTypesAccess().getMapEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:2623:3: (enumLiteral_9= 'string' )
                    {
                    // InternalMyDsl.g:2623:3: (enumLiteral_9= 'string' )
                    // InternalMyDsl.g:2624:4: enumLiteral_9= 'string'
                    {
                    enumLiteral_9=(Token)match(input,69,FOLLOW_2); 

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
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000AE01000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0xF000000000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x003C080000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0800000000000000L});

}