package org.tracesec.graph.dsl.parser.antlr.internal;

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
import org.tracesec.graph.dsl.services.GraphConfigurationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGraphConfigurationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'default'", "'='", "'consider'", "'namespace'", "'{'", "'include'", "'}'", "'exclude'", "'type'", "'reference'", "'--'", "'.'", "'trg'", "'assoc'", "'ALL'", "'NONE'", "'->'", "'<-'", "'<->'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGraphConfigurationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGraphConfigurationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGraphConfigurationParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGraphConfiguration.g"; }



     	private GraphConfigurationGrammarAccess grammarAccess;

        public InternalGraphConfigurationParser(TokenStream input, GraphConfigurationGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Configuration";
       	}

       	@Override
       	protected GraphConfigurationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleConfiguration"
    // InternalGraphConfiguration.g:65:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalGraphConfiguration.g:65:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalGraphConfiguration.g:66:2: iv_ruleConfiguration= ruleConfiguration EOF
            {
             newCompositeNode(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfiguration=ruleConfiguration();

            state._fsp--;

             current =iv_ruleConfiguration; 
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
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalGraphConfiguration.g:72:1: ruleConfiguration returns [EObject current=null] : ( (otherlv_0= 'default' otherlv_1= '=' ( (lv_default_2_0= RULE_INT ) ) )? (otherlv_3= 'consider' otherlv_4= '=' ( (lv_consider_5_0= ruleConsider ) ) )? ( (lv_namespaces_6_0= ruleNamespace ) )+ ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_default_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Enumerator lv_consider_5_0 = null;

        EObject lv_namespaces_6_0 = null;



        	enterRule();

        try {
            // InternalGraphConfiguration.g:78:2: ( ( (otherlv_0= 'default' otherlv_1= '=' ( (lv_default_2_0= RULE_INT ) ) )? (otherlv_3= 'consider' otherlv_4= '=' ( (lv_consider_5_0= ruleConsider ) ) )? ( (lv_namespaces_6_0= ruleNamespace ) )+ ) )
            // InternalGraphConfiguration.g:79:2: ( (otherlv_0= 'default' otherlv_1= '=' ( (lv_default_2_0= RULE_INT ) ) )? (otherlv_3= 'consider' otherlv_4= '=' ( (lv_consider_5_0= ruleConsider ) ) )? ( (lv_namespaces_6_0= ruleNamespace ) )+ )
            {
            // InternalGraphConfiguration.g:79:2: ( (otherlv_0= 'default' otherlv_1= '=' ( (lv_default_2_0= RULE_INT ) ) )? (otherlv_3= 'consider' otherlv_4= '=' ( (lv_consider_5_0= ruleConsider ) ) )? ( (lv_namespaces_6_0= ruleNamespace ) )+ )
            // InternalGraphConfiguration.g:80:3: (otherlv_0= 'default' otherlv_1= '=' ( (lv_default_2_0= RULE_INT ) ) )? (otherlv_3= 'consider' otherlv_4= '=' ( (lv_consider_5_0= ruleConsider ) ) )? ( (lv_namespaces_6_0= ruleNamespace ) )+
            {
            // InternalGraphConfiguration.g:80:3: (otherlv_0= 'default' otherlv_1= '=' ( (lv_default_2_0= RULE_INT ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGraphConfiguration.g:81:4: otherlv_0= 'default' otherlv_1= '=' ( (lv_default_2_0= RULE_INT ) )
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getConfigurationAccess().getDefaultKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getConfigurationAccess().getEqualsSignKeyword_0_1());
                    			
                    // InternalGraphConfiguration.g:89:4: ( (lv_default_2_0= RULE_INT ) )
                    // InternalGraphConfiguration.g:90:5: (lv_default_2_0= RULE_INT )
                    {
                    // InternalGraphConfiguration.g:90:5: (lv_default_2_0= RULE_INT )
                    // InternalGraphConfiguration.g:91:6: lv_default_2_0= RULE_INT
                    {
                    lv_default_2_0=(Token)match(input,RULE_INT,FOLLOW_5); 

                    						newLeafNode(lv_default_2_0, grammarAccess.getConfigurationAccess().getDefaultINTTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConfigurationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"default",
                    							lv_default_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGraphConfiguration.g:108:3: (otherlv_3= 'consider' otherlv_4= '=' ( (lv_consider_5_0= ruleConsider ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGraphConfiguration.g:109:4: otherlv_3= 'consider' otherlv_4= '=' ( (lv_consider_5_0= ruleConsider ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getConfigurationAccess().getConsiderKeyword_1_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getConfigurationAccess().getEqualsSignKeyword_1_1());
                    			
                    // InternalGraphConfiguration.g:117:4: ( (lv_consider_5_0= ruleConsider ) )
                    // InternalGraphConfiguration.g:118:5: (lv_consider_5_0= ruleConsider )
                    {
                    // InternalGraphConfiguration.g:118:5: (lv_consider_5_0= ruleConsider )
                    // InternalGraphConfiguration.g:119:6: lv_consider_5_0= ruleConsider
                    {

                    						newCompositeNode(grammarAccess.getConfigurationAccess().getConsiderConsiderEnumRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_consider_5_0=ruleConsider();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConfigurationRule());
                    						}
                    						set(
                    							current,
                    							"consider",
                    							lv_consider_5_0,
                    							"org.tracesec.graph.dsl.GraphConfiguration.Consider");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGraphConfiguration.g:137:3: ( (lv_namespaces_6_0= ruleNamespace ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGraphConfiguration.g:138:4: (lv_namespaces_6_0= ruleNamespace )
            	    {
            	    // InternalGraphConfiguration.g:138:4: (lv_namespaces_6_0= ruleNamespace )
            	    // InternalGraphConfiguration.g:139:5: lv_namespaces_6_0= ruleNamespace
            	    {

            	    					newCompositeNode(grammarAccess.getConfigurationAccess().getNamespacesNamespaceParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_namespaces_6_0=ruleNamespace();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"namespaces",
            	    						lv_namespaces_6_0,
            	    						"org.tracesec.graph.dsl.GraphConfiguration.Namespace");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleNamespace"
    // InternalGraphConfiguration.g:160:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalGraphConfiguration.g:160:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalGraphConfiguration.g:161:2: iv_ruleNamespace= ruleNamespace EOF
            {
             newCompositeNode(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;

             current =iv_ruleNamespace; 
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
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // InternalGraphConfiguration.g:167:1: ruleNamespace returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_package_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'default' otherlv_4= '=' ( (lv_default_5_0= RULE_INT ) ) )? (otherlv_6= 'consider' otherlv_7= '=' ( (lv_consider_8_0= ruleConsider ) ) )? (otherlv_9= 'include' otherlv_10= '{' ( (lv_include_11_0= ruleType ) )* otherlv_12= '}' )? (otherlv_13= 'exclude' otherlv_14= '{' ( (otherlv_15= RULE_ID ) )+ otherlv_16= '}' )? otherlv_17= '}' ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_package_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_default_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Enumerator lv_consider_8_0 = null;

        EObject lv_include_11_0 = null;



        	enterRule();

        try {
            // InternalGraphConfiguration.g:173:2: ( (otherlv_0= 'namespace' ( (lv_package_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'default' otherlv_4= '=' ( (lv_default_5_0= RULE_INT ) ) )? (otherlv_6= 'consider' otherlv_7= '=' ( (lv_consider_8_0= ruleConsider ) ) )? (otherlv_9= 'include' otherlv_10= '{' ( (lv_include_11_0= ruleType ) )* otherlv_12= '}' )? (otherlv_13= 'exclude' otherlv_14= '{' ( (otherlv_15= RULE_ID ) )+ otherlv_16= '}' )? otherlv_17= '}' ) )
            // InternalGraphConfiguration.g:174:2: (otherlv_0= 'namespace' ( (lv_package_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'default' otherlv_4= '=' ( (lv_default_5_0= RULE_INT ) ) )? (otherlv_6= 'consider' otherlv_7= '=' ( (lv_consider_8_0= ruleConsider ) ) )? (otherlv_9= 'include' otherlv_10= '{' ( (lv_include_11_0= ruleType ) )* otherlv_12= '}' )? (otherlv_13= 'exclude' otherlv_14= '{' ( (otherlv_15= RULE_ID ) )+ otherlv_16= '}' )? otherlv_17= '}' )
            {
            // InternalGraphConfiguration.g:174:2: (otherlv_0= 'namespace' ( (lv_package_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'default' otherlv_4= '=' ( (lv_default_5_0= RULE_INT ) ) )? (otherlv_6= 'consider' otherlv_7= '=' ( (lv_consider_8_0= ruleConsider ) ) )? (otherlv_9= 'include' otherlv_10= '{' ( (lv_include_11_0= ruleType ) )* otherlv_12= '}' )? (otherlv_13= 'exclude' otherlv_14= '{' ( (otherlv_15= RULE_ID ) )+ otherlv_16= '}' )? otherlv_17= '}' )
            // InternalGraphConfiguration.g:175:3: otherlv_0= 'namespace' ( (lv_package_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'default' otherlv_4= '=' ( (lv_default_5_0= RULE_INT ) ) )? (otherlv_6= 'consider' otherlv_7= '=' ( (lv_consider_8_0= ruleConsider ) ) )? (otherlv_9= 'include' otherlv_10= '{' ( (lv_include_11_0= ruleType ) )* otherlv_12= '}' )? (otherlv_13= 'exclude' otherlv_14= '{' ( (otherlv_15= RULE_ID ) )+ otherlv_16= '}' )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getNamespaceAccess().getNamespaceKeyword_0());
            		
            // InternalGraphConfiguration.g:179:3: ( (lv_package_1_0= RULE_STRING ) )
            // InternalGraphConfiguration.g:180:4: (lv_package_1_0= RULE_STRING )
            {
            // InternalGraphConfiguration.g:180:4: (lv_package_1_0= RULE_STRING )
            // InternalGraphConfiguration.g:181:5: lv_package_1_0= RULE_STRING
            {
            lv_package_1_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_package_1_0, grammarAccess.getNamespaceAccess().getPackageSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNamespaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"package",
            						lv_package_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getNamespaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGraphConfiguration.g:201:3: (otherlv_3= 'default' otherlv_4= '=' ( (lv_default_5_0= RULE_INT ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGraphConfiguration.g:202:4: otherlv_3= 'default' otherlv_4= '=' ( (lv_default_5_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getNamespaceAccess().getDefaultKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getNamespaceAccess().getEqualsSignKeyword_3_1());
                    			
                    // InternalGraphConfiguration.g:210:4: ( (lv_default_5_0= RULE_INT ) )
                    // InternalGraphConfiguration.g:211:5: (lv_default_5_0= RULE_INT )
                    {
                    // InternalGraphConfiguration.g:211:5: (lv_default_5_0= RULE_INT )
                    // InternalGraphConfiguration.g:212:6: lv_default_5_0= RULE_INT
                    {
                    lv_default_5_0=(Token)match(input,RULE_INT,FOLLOW_11); 

                    						newLeafNode(lv_default_5_0, grammarAccess.getNamespaceAccess().getDefaultINTTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamespaceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"default",
                    							lv_default_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGraphConfiguration.g:229:3: (otherlv_6= 'consider' otherlv_7= '=' ( (lv_consider_8_0= ruleConsider ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGraphConfiguration.g:230:4: otherlv_6= 'consider' otherlv_7= '=' ( (lv_consider_8_0= ruleConsider ) )
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getNamespaceAccess().getConsiderKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getNamespaceAccess().getEqualsSignKeyword_4_1());
                    			
                    // InternalGraphConfiguration.g:238:4: ( (lv_consider_8_0= ruleConsider ) )
                    // InternalGraphConfiguration.g:239:5: (lv_consider_8_0= ruleConsider )
                    {
                    // InternalGraphConfiguration.g:239:5: (lv_consider_8_0= ruleConsider )
                    // InternalGraphConfiguration.g:240:6: lv_consider_8_0= ruleConsider
                    {

                    						newCompositeNode(grammarAccess.getNamespaceAccess().getConsiderConsiderEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_consider_8_0=ruleConsider();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNamespaceRule());
                    						}
                    						set(
                    							current,
                    							"consider",
                    							lv_consider_8_0,
                    							"org.tracesec.graph.dsl.GraphConfiguration.Consider");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGraphConfiguration.g:258:3: (otherlv_9= 'include' otherlv_10= '{' ( (lv_include_11_0= ruleType ) )* otherlv_12= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGraphConfiguration.g:259:4: otherlv_9= 'include' otherlv_10= '{' ( (lv_include_11_0= ruleType ) )* otherlv_12= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getNamespaceAccess().getIncludeKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_10, grammarAccess.getNamespaceAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalGraphConfiguration.g:267:4: ( (lv_include_11_0= ruleType ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==19) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalGraphConfiguration.g:268:5: (lv_include_11_0= ruleType )
                    	    {
                    	    // InternalGraphConfiguration.g:268:5: (lv_include_11_0= ruleType )
                    	    // InternalGraphConfiguration.g:269:6: lv_include_11_0= ruleType
                    	    {

                    	    						newCompositeNode(grammarAccess.getNamespaceAccess().getIncludeTypeParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_include_11_0=ruleType();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getNamespaceRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"include",
                    	    							lv_include_11_0,
                    	    							"org.tracesec.graph.dsl.GraphConfiguration.Type");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_12, grammarAccess.getNamespaceAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            // InternalGraphConfiguration.g:291:3: (otherlv_13= 'exclude' otherlv_14= '{' ( (otherlv_15= RULE_ID ) )+ otherlv_16= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGraphConfiguration.g:292:4: otherlv_13= 'exclude' otherlv_14= '{' ( (otherlv_15= RULE_ID ) )+ otherlv_16= '}'
                    {
                    otherlv_13=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_13, grammarAccess.getNamespaceAccess().getExcludeKeyword_6_0());
                    			
                    otherlv_14=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_14, grammarAccess.getNamespaceAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalGraphConfiguration.g:300:4: ( (otherlv_15= RULE_ID ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalGraphConfiguration.g:301:5: (otherlv_15= RULE_ID )
                    	    {
                    	    // InternalGraphConfiguration.g:301:5: (otherlv_15= RULE_ID )
                    	    // InternalGraphConfiguration.g:302:6: otherlv_15= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getNamespaceRule());
                    	    						}
                    	    					
                    	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_16); 

                    	    						newLeafNode(otherlv_15, grammarAccess.getNamespaceAccess().getExcludeEClassCrossReference_6_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    otherlv_16=(Token)match(input,17,FOLLOW_17); 

                    				newLeafNode(otherlv_16, grammarAccess.getNamespaceAccess().getRightCurlyBracketKeyword_6_3());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getNamespaceAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleType"
    // InternalGraphConfiguration.g:326:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalGraphConfiguration.g:326:45: (iv_ruleType= ruleType EOF )
            // InternalGraphConfiguration.g:327:2: iv_ruleType= ruleType EOF
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
    // InternalGraphConfiguration.g:333:1: ruleType returns [EObject current=null] : (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'consider' otherlv_4= '=' ( (lv_consider_5_0= ruleConsider ) ) )? (otherlv_6= 'default' otherlv_7= '=' ( (lv_default_8_0= RULE_INT ) ) )? (otherlv_9= 'include' otherlv_10= '{' ( (lv_inlcude_11_0= ruleEdge ) )+ otherlv_12= '}' )? (otherlv_13= 'exclude' otherlv_14= '{' ( (otherlv_15= RULE_ID ) )+ otherlv_16= '}' )? otherlv_17= '}' ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_default_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Enumerator lv_consider_5_0 = null;

        EObject lv_inlcude_11_0 = null;



        	enterRule();

        try {
            // InternalGraphConfiguration.g:339:2: ( (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'consider' otherlv_4= '=' ( (lv_consider_5_0= ruleConsider ) ) )? (otherlv_6= 'default' otherlv_7= '=' ( (lv_default_8_0= RULE_INT ) ) )? (otherlv_9= 'include' otherlv_10= '{' ( (lv_inlcude_11_0= ruleEdge ) )+ otherlv_12= '}' )? (otherlv_13= 'exclude' otherlv_14= '{' ( (otherlv_15= RULE_ID ) )+ otherlv_16= '}' )? otherlv_17= '}' ) )
            // InternalGraphConfiguration.g:340:2: (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'consider' otherlv_4= '=' ( (lv_consider_5_0= ruleConsider ) ) )? (otherlv_6= 'default' otherlv_7= '=' ( (lv_default_8_0= RULE_INT ) ) )? (otherlv_9= 'include' otherlv_10= '{' ( (lv_inlcude_11_0= ruleEdge ) )+ otherlv_12= '}' )? (otherlv_13= 'exclude' otherlv_14= '{' ( (otherlv_15= RULE_ID ) )+ otherlv_16= '}' )? otherlv_17= '}' )
            {
            // InternalGraphConfiguration.g:340:2: (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'consider' otherlv_4= '=' ( (lv_consider_5_0= ruleConsider ) ) )? (otherlv_6= 'default' otherlv_7= '=' ( (lv_default_8_0= RULE_INT ) ) )? (otherlv_9= 'include' otherlv_10= '{' ( (lv_inlcude_11_0= ruleEdge ) )+ otherlv_12= '}' )? (otherlv_13= 'exclude' otherlv_14= '{' ( (otherlv_15= RULE_ID ) )+ otherlv_16= '}' )? otherlv_17= '}' )
            // InternalGraphConfiguration.g:341:3: otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'consider' otherlv_4= '=' ( (lv_consider_5_0= ruleConsider ) ) )? (otherlv_6= 'default' otherlv_7= '=' ( (lv_default_8_0= RULE_INT ) ) )? (otherlv_9= 'include' otherlv_10= '{' ( (lv_inlcude_11_0= ruleEdge ) )+ otherlv_12= '}' )? (otherlv_13= 'exclude' otherlv_14= '{' ( (otherlv_15= RULE_ID ) )+ otherlv_16= '}' )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
            		
            // InternalGraphConfiguration.g:345:3: ( (otherlv_1= RULE_ID ) )
            // InternalGraphConfiguration.g:346:4: (otherlv_1= RULE_ID )
            {
            // InternalGraphConfiguration.g:346:4: (otherlv_1= RULE_ID )
            // InternalGraphConfiguration.g:347:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getTypeEClassCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGraphConfiguration.g:362:3: (otherlv_3= 'consider' otherlv_4= '=' ( (lv_consider_5_0= ruleConsider ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGraphConfiguration.g:363:4: otherlv_3= 'consider' otherlv_4= '=' ( (lv_consider_5_0= ruleConsider ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getConsiderKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getEqualsSignKeyword_3_1());
                    			
                    // InternalGraphConfiguration.g:371:4: ( (lv_consider_5_0= ruleConsider ) )
                    // InternalGraphConfiguration.g:372:5: (lv_consider_5_0= ruleConsider )
                    {
                    // InternalGraphConfiguration.g:372:5: (lv_consider_5_0= ruleConsider )
                    // InternalGraphConfiguration.g:373:6: lv_consider_5_0= ruleConsider
                    {

                    						newCompositeNode(grammarAccess.getTypeAccess().getConsiderConsiderEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_consider_5_0=ruleConsider();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypeRule());
                    						}
                    						set(
                    							current,
                    							"consider",
                    							lv_consider_5_0,
                    							"org.tracesec.graph.dsl.GraphConfiguration.Consider");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGraphConfiguration.g:391:3: (otherlv_6= 'default' otherlv_7= '=' ( (lv_default_8_0= RULE_INT ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==11) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGraphConfiguration.g:392:4: otherlv_6= 'default' otherlv_7= '=' ( (lv_default_8_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getTypeAccess().getDefaultKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getEqualsSignKeyword_4_1());
                    			
                    // InternalGraphConfiguration.g:400:4: ( (lv_default_8_0= RULE_INT ) )
                    // InternalGraphConfiguration.g:401:5: (lv_default_8_0= RULE_INT )
                    {
                    // InternalGraphConfiguration.g:401:5: (lv_default_8_0= RULE_INT )
                    // InternalGraphConfiguration.g:402:6: lv_default_8_0= RULE_INT
                    {
                    lv_default_8_0=(Token)match(input,RULE_INT,FOLLOW_12); 

                    						newLeafNode(lv_default_8_0, grammarAccess.getTypeAccess().getDefaultINTTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"default",
                    							lv_default_8_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGraphConfiguration.g:419:3: (otherlv_9= 'include' otherlv_10= '{' ( (lv_inlcude_11_0= ruleEdge ) )+ otherlv_12= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGraphConfiguration.g:420:4: otherlv_9= 'include' otherlv_10= '{' ( (lv_inlcude_11_0= ruleEdge ) )+ otherlv_12= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getTypeAccess().getIncludeKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,15,FOLLOW_19); 

                    				newLeafNode(otherlv_10, grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalGraphConfiguration.g:428:4: ( (lv_inlcude_11_0= ruleEdge ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==20) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalGraphConfiguration.g:429:5: (lv_inlcude_11_0= ruleEdge )
                    	    {
                    	    // InternalGraphConfiguration.g:429:5: (lv_inlcude_11_0= ruleEdge )
                    	    // InternalGraphConfiguration.g:430:6: lv_inlcude_11_0= ruleEdge
                    	    {

                    	    						newCompositeNode(grammarAccess.getTypeAccess().getInlcudeEdgeParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_20);
                    	    lv_inlcude_11_0=ruleEdge();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTypeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"inlcude",
                    	    							lv_inlcude_11_0,
                    	    							"org.tracesec.graph.dsl.GraphConfiguration.Edge");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    otherlv_12=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_12, grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            // InternalGraphConfiguration.g:452:3: (otherlv_13= 'exclude' otherlv_14= '{' ( (otherlv_15= RULE_ID ) )+ otherlv_16= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGraphConfiguration.g:453:4: otherlv_13= 'exclude' otherlv_14= '{' ( (otherlv_15= RULE_ID ) )+ otherlv_16= '}'
                    {
                    otherlv_13=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_13, grammarAccess.getTypeAccess().getExcludeKeyword_6_0());
                    			
                    otherlv_14=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_14, grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalGraphConfiguration.g:461:4: ( (otherlv_15= RULE_ID ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_ID) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalGraphConfiguration.g:462:5: (otherlv_15= RULE_ID )
                    	    {
                    	    // InternalGraphConfiguration.g:462:5: (otherlv_15= RULE_ID )
                    	    // InternalGraphConfiguration.g:463:6: otherlv_15= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getTypeRule());
                    	    						}
                    	    					
                    	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_16); 

                    	    						newLeafNode(otherlv_15, grammarAccess.getTypeAccess().getExcludeEReferenceCrossReference_6_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    otherlv_16=(Token)match(input,17,FOLLOW_17); 

                    				newLeafNode(otherlv_16, grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_6_3());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleEdge"
    // InternalGraphConfiguration.g:487:1: entryRuleEdge returns [EObject current=null] : iv_ruleEdge= ruleEdge EOF ;
    public final EObject entryRuleEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdge = null;


        try {
            // InternalGraphConfiguration.g:487:45: (iv_ruleEdge= ruleEdge EOF )
            // InternalGraphConfiguration.g:488:2: iv_ruleEdge= ruleEdge EOF
            {
             newCompositeNode(grammarAccess.getEdgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEdge=ruleEdge();

            state._fsp--;

             current =iv_ruleEdge; 
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
    // $ANTLR end "entryRuleEdge"


    // $ANTLR start "ruleEdge"
    // InternalGraphConfiguration.g:494:1: ruleEdge returns [EObject current=null] : (otherlv_0= 'reference' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '--' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '--' ( (otherlv_5= RULE_ID ) ) )? )? ( (lv_direction_6_0= ruleDirection ) ) ( (lv_weight_7_0= ruleWeight ) ) ) ;
    public final EObject ruleEdge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Enumerator lv_direction_6_0 = null;

        EObject lv_weight_7_0 = null;



        	enterRule();

        try {
            // InternalGraphConfiguration.g:500:2: ( (otherlv_0= 'reference' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '--' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '--' ( (otherlv_5= RULE_ID ) ) )? )? ( (lv_direction_6_0= ruleDirection ) ) ( (lv_weight_7_0= ruleWeight ) ) ) )
            // InternalGraphConfiguration.g:501:2: (otherlv_0= 'reference' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '--' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '--' ( (otherlv_5= RULE_ID ) ) )? )? ( (lv_direction_6_0= ruleDirection ) ) ( (lv_weight_7_0= ruleWeight ) ) )
            {
            // InternalGraphConfiguration.g:501:2: (otherlv_0= 'reference' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '--' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '--' ( (otherlv_5= RULE_ID ) ) )? )? ( (lv_direction_6_0= ruleDirection ) ) ( (lv_weight_7_0= ruleWeight ) ) )
            // InternalGraphConfiguration.g:502:3: otherlv_0= 'reference' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '--' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '--' ( (otherlv_5= RULE_ID ) ) )? )? ( (lv_direction_6_0= ruleDirection ) ) ( (lv_weight_7_0= ruleWeight ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getEdgeAccess().getReferenceKeyword_0());
            		
            // InternalGraphConfiguration.g:506:3: ( (otherlv_1= RULE_ID ) )
            // InternalGraphConfiguration.g:507:4: (otherlv_1= RULE_ID )
            {
            // InternalGraphConfiguration.g:507:4: (otherlv_1= RULE_ID )
            // InternalGraphConfiguration.g:508:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEdgeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_1, grammarAccess.getEdgeAccess().getReferenceEReferenceCrossReference_1_0());
            				

            }


            }

            // InternalGraphConfiguration.g:519:3: (otherlv_2= '--' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '--' ( (otherlv_5= RULE_ID ) ) )? )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGraphConfiguration.g:520:4: otherlv_2= '--' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '--' ( (otherlv_5= RULE_ID ) ) )?
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getEdgeAccess().getHyphenMinusHyphenMinusKeyword_2_0());
                    			
                    // InternalGraphConfiguration.g:524:4: ( (otherlv_3= RULE_ID ) )
                    // InternalGraphConfiguration.g:525:5: (otherlv_3= RULE_ID )
                    {
                    // InternalGraphConfiguration.g:525:5: (otherlv_3= RULE_ID )
                    // InternalGraphConfiguration.g:526:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEdgeRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_21); 

                    						newLeafNode(otherlv_3, grammarAccess.getEdgeAccess().getTypeEClassCrossReference_2_1_0());
                    					

                    }


                    }

                    // InternalGraphConfiguration.g:537:4: (otherlv_4= '--' ( (otherlv_5= RULE_ID ) ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==21) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalGraphConfiguration.g:538:5: otherlv_4= '--' ( (otherlv_5= RULE_ID ) )
                            {
                            otherlv_4=(Token)match(input,21,FOLLOW_15); 

                            					newLeafNode(otherlv_4, grammarAccess.getEdgeAccess().getHyphenMinusHyphenMinusKeyword_2_2_0());
                            				
                            // InternalGraphConfiguration.g:542:5: ( (otherlv_5= RULE_ID ) )
                            // InternalGraphConfiguration.g:543:6: (otherlv_5= RULE_ID )
                            {
                            // InternalGraphConfiguration.g:543:6: (otherlv_5= RULE_ID )
                            // InternalGraphConfiguration.g:544:7: otherlv_5= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEdgeRule());
                            							}
                            						
                            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_21); 

                            							newLeafNode(otherlv_5, grammarAccess.getEdgeAccess().getTargetEReferenceCrossReference_2_2_1_0());
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalGraphConfiguration.g:557:3: ( (lv_direction_6_0= ruleDirection ) )
            // InternalGraphConfiguration.g:558:4: (lv_direction_6_0= ruleDirection )
            {
            // InternalGraphConfiguration.g:558:4: (lv_direction_6_0= ruleDirection )
            // InternalGraphConfiguration.g:559:5: lv_direction_6_0= ruleDirection
            {

            					newCompositeNode(grammarAccess.getEdgeAccess().getDirectionDirectionEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_direction_6_0=ruleDirection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEdgeRule());
            					}
            					set(
            						current,
            						"direction",
            						lv_direction_6_0,
            						"org.tracesec.graph.dsl.GraphConfiguration.Direction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGraphConfiguration.g:576:3: ( (lv_weight_7_0= ruleWeight ) )
            // InternalGraphConfiguration.g:577:4: (lv_weight_7_0= ruleWeight )
            {
            // InternalGraphConfiguration.g:577:4: (lv_weight_7_0= ruleWeight )
            // InternalGraphConfiguration.g:578:5: lv_weight_7_0= ruleWeight
            {

            					newCompositeNode(grammarAccess.getEdgeAccess().getWeightWeightParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_weight_7_0=ruleWeight();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEdgeRule());
            					}
            					set(
            						current,
            						"weight",
            						lv_weight_7_0,
            						"org.tracesec.graph.dsl.GraphConfiguration.Weight");
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
    // $ANTLR end "ruleEdge"


    // $ANTLR start "entryRuleWeight"
    // InternalGraphConfiguration.g:599:1: entryRuleWeight returns [EObject current=null] : iv_ruleWeight= ruleWeight EOF ;
    public final EObject entryRuleWeight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWeight = null;


        try {
            // InternalGraphConfiguration.g:599:47: (iv_ruleWeight= ruleWeight EOF )
            // InternalGraphConfiguration.g:600:2: iv_ruleWeight= ruleWeight EOF
            {
             newCompositeNode(grammarAccess.getWeightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWeight=ruleWeight();

            state._fsp--;

             current =iv_ruleWeight; 
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
    // $ANTLR end "entryRuleWeight"


    // $ANTLR start "ruleWeight"
    // InternalGraphConfiguration.g:606:1: ruleWeight returns [EObject current=null] : (this_NumberWeight_0= ruleNumberWeight | this_AttributeWeight_1= ruleAttributeWeight ) ;
    public final EObject ruleWeight() throws RecognitionException {
        EObject current = null;

        EObject this_NumberWeight_0 = null;

        EObject this_AttributeWeight_1 = null;



        	enterRule();

        try {
            // InternalGraphConfiguration.g:612:2: ( (this_NumberWeight_0= ruleNumberWeight | this_AttributeWeight_1= ruleAttributeWeight ) )
            // InternalGraphConfiguration.g:613:2: (this_NumberWeight_0= ruleNumberWeight | this_AttributeWeight_1= ruleAttributeWeight )
            {
            // InternalGraphConfiguration.g:613:2: (this_NumberWeight_0= ruleNumberWeight | this_AttributeWeight_1= ruleAttributeWeight )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID||(LA18_0>=23 && LA18_0<=24)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalGraphConfiguration.g:614:3: this_NumberWeight_0= ruleNumberWeight
                    {

                    			newCompositeNode(grammarAccess.getWeightAccess().getNumberWeightParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberWeight_0=ruleNumberWeight();

                    state._fsp--;


                    			current = this_NumberWeight_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGraphConfiguration.g:623:3: this_AttributeWeight_1= ruleAttributeWeight
                    {

                    			newCompositeNode(grammarAccess.getWeightAccess().getAttributeWeightParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AttributeWeight_1=ruleAttributeWeight();

                    state._fsp--;


                    			current = this_AttributeWeight_1;
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
    // $ANTLR end "ruleWeight"


    // $ANTLR start "entryRuleNumberWeight"
    // InternalGraphConfiguration.g:635:1: entryRuleNumberWeight returns [EObject current=null] : iv_ruleNumberWeight= ruleNumberWeight EOF ;
    public final EObject entryRuleNumberWeight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberWeight = null;


        try {
            // InternalGraphConfiguration.g:635:53: (iv_ruleNumberWeight= ruleNumberWeight EOF )
            // InternalGraphConfiguration.g:636:2: iv_ruleNumberWeight= ruleNumberWeight EOF
            {
             newCompositeNode(grammarAccess.getNumberWeightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberWeight=ruleNumberWeight();

            state._fsp--;

             current =iv_ruleNumberWeight; 
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
    // $ANTLR end "entryRuleNumberWeight"


    // $ANTLR start "ruleNumberWeight"
    // InternalGraphConfiguration.g:642:1: ruleNumberWeight returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumberWeight() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalGraphConfiguration.g:648:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalGraphConfiguration.g:649:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalGraphConfiguration.g:649:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalGraphConfiguration.g:650:3: (lv_value_0_0= RULE_INT )
            {
            // InternalGraphConfiguration.g:650:3: (lv_value_0_0= RULE_INT )
            // InternalGraphConfiguration.g:651:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNumberWeightAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumberWeightRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleNumberWeight"


    // $ANTLR start "entryRuleAttributeWeight"
    // InternalGraphConfiguration.g:670:1: entryRuleAttributeWeight returns [EObject current=null] : iv_ruleAttributeWeight= ruleAttributeWeight EOF ;
    public final EObject entryRuleAttributeWeight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeWeight = null;


        try {
            // InternalGraphConfiguration.g:670:56: (iv_ruleAttributeWeight= ruleAttributeWeight EOF )
            // InternalGraphConfiguration.g:671:2: iv_ruleAttributeWeight= ruleAttributeWeight EOF
            {
             newCompositeNode(grammarAccess.getAttributeWeightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeWeight=ruleAttributeWeight();

            state._fsp--;

             current =iv_ruleAttributeWeight; 
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
    // $ANTLR end "entryRuleAttributeWeight"


    // $ANTLR start "ruleAttributeWeight"
    // InternalGraphConfiguration.g:677:1: ruleAttributeWeight returns [EObject current=null] : ( ( ( (lv_owner_0_0= ruleOwner ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleAttributeWeight() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_owner_0_0 = null;



        	enterRule();

        try {
            // InternalGraphConfiguration.g:683:2: ( ( ( ( (lv_owner_0_0= ruleOwner ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) ) ) )
            // InternalGraphConfiguration.g:684:2: ( ( ( (lv_owner_0_0= ruleOwner ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalGraphConfiguration.g:684:2: ( ( ( (lv_owner_0_0= ruleOwner ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) ) )
            // InternalGraphConfiguration.g:685:3: ( ( (lv_owner_0_0= ruleOwner ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) )
            {
            // InternalGraphConfiguration.g:685:3: ( ( (lv_owner_0_0= ruleOwner ) ) otherlv_1= '.' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=23 && LA19_0<=24)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGraphConfiguration.g:686:4: ( (lv_owner_0_0= ruleOwner ) ) otherlv_1= '.'
                    {
                    // InternalGraphConfiguration.g:686:4: ( (lv_owner_0_0= ruleOwner ) )
                    // InternalGraphConfiguration.g:687:5: (lv_owner_0_0= ruleOwner )
                    {
                    // InternalGraphConfiguration.g:687:5: (lv_owner_0_0= ruleOwner )
                    // InternalGraphConfiguration.g:688:6: lv_owner_0_0= ruleOwner
                    {

                    						newCompositeNode(grammarAccess.getAttributeWeightAccess().getOwnerOwnerEnumRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_owner_0_0=ruleOwner();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeWeightRule());
                    						}
                    						set(
                    							current,
                    							"owner",
                    							lv_owner_0_0,
                    							"org.tracesec.graph.dsl.GraphConfiguration.Owner");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,22,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getAttributeWeightAccess().getFullStopKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalGraphConfiguration.g:710:3: ( (otherlv_2= RULE_ID ) )
            // InternalGraphConfiguration.g:711:4: (otherlv_2= RULE_ID )
            {
            // InternalGraphConfiguration.g:711:4: (otherlv_2= RULE_ID )
            // InternalGraphConfiguration.g:712:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeWeightRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getAttributeWeightAccess().getValueEAttributeCrossReference_1_0());
            				

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
    // $ANTLR end "ruleAttributeWeight"


    // $ANTLR start "ruleOwner"
    // InternalGraphConfiguration.g:727:1: ruleOwner returns [Enumerator current=null] : ( (enumLiteral_0= 'trg' ) | (enumLiteral_1= 'assoc' ) ) ;
    public final Enumerator ruleOwner() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalGraphConfiguration.g:733:2: ( ( (enumLiteral_0= 'trg' ) | (enumLiteral_1= 'assoc' ) ) )
            // InternalGraphConfiguration.g:734:2: ( (enumLiteral_0= 'trg' ) | (enumLiteral_1= 'assoc' ) )
            {
            // InternalGraphConfiguration.g:734:2: ( (enumLiteral_0= 'trg' ) | (enumLiteral_1= 'assoc' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            else if ( (LA20_0==24) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalGraphConfiguration.g:735:3: (enumLiteral_0= 'trg' )
                    {
                    // InternalGraphConfiguration.g:735:3: (enumLiteral_0= 'trg' )
                    // InternalGraphConfiguration.g:736:4: enumLiteral_0= 'trg'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getOwnerAccess().getTARGETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOwnerAccess().getTARGETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphConfiguration.g:743:3: (enumLiteral_1= 'assoc' )
                    {
                    // InternalGraphConfiguration.g:743:3: (enumLiteral_1= 'assoc' )
                    // InternalGraphConfiguration.g:744:4: enumLiteral_1= 'assoc'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getOwnerAccess().getASSOCIATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOwnerAccess().getASSOCIATIONEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleOwner"


    // $ANTLR start "ruleConsider"
    // InternalGraphConfiguration.g:754:1: ruleConsider returns [Enumerator current=null] : ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'NONE' ) ) ;
    public final Enumerator ruleConsider() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalGraphConfiguration.g:760:2: ( ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'NONE' ) ) )
            // InternalGraphConfiguration.g:761:2: ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'NONE' ) )
            {
            // InternalGraphConfiguration.g:761:2: ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'NONE' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            else if ( (LA21_0==26) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalGraphConfiguration.g:762:3: (enumLiteral_0= 'ALL' )
                    {
                    // InternalGraphConfiguration.g:762:3: (enumLiteral_0= 'ALL' )
                    // InternalGraphConfiguration.g:763:4: enumLiteral_0= 'ALL'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getConsiderAccess().getALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getConsiderAccess().getALLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphConfiguration.g:770:3: (enumLiteral_1= 'NONE' )
                    {
                    // InternalGraphConfiguration.g:770:3: (enumLiteral_1= 'NONE' )
                    // InternalGraphConfiguration.g:771:4: enumLiteral_1= 'NONE'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getConsiderAccess().getNONEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getConsiderAccess().getNONEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleConsider"


    // $ANTLR start "ruleDirection"
    // InternalGraphConfiguration.g:781:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= '->' ) | (enumLiteral_1= '<-' ) | (enumLiteral_2= '<->' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGraphConfiguration.g:787:2: ( ( (enumLiteral_0= '->' ) | (enumLiteral_1= '<-' ) | (enumLiteral_2= '<->' ) ) )
            // InternalGraphConfiguration.g:788:2: ( (enumLiteral_0= '->' ) | (enumLiteral_1= '<-' ) | (enumLiteral_2= '<->' ) )
            {
            // InternalGraphConfiguration.g:788:2: ( (enumLiteral_0= '->' ) | (enumLiteral_1= '<-' ) | (enumLiteral_2= '<->' ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt22=1;
                }
                break;
            case 28:
                {
                alt22=2;
                }
                break;
            case 29:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalGraphConfiguration.g:789:3: (enumLiteral_0= '->' )
                    {
                    // InternalGraphConfiguration.g:789:3: (enumLiteral_0= '->' )
                    // InternalGraphConfiguration.g:790:4: enumLiteral_0= '->'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getFWDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getFWDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphConfiguration.g:797:3: (enumLiteral_1= '<-' )
                    {
                    // InternalGraphConfiguration.g:797:3: (enumLiteral_1= '<-' )
                    // InternalGraphConfiguration.g:798:4: enumLiteral_1= '<-'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getBWDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getBWDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphConfiguration.g:805:3: (enumLiteral_2= '<->' )
                    {
                    // InternalGraphConfiguration.g:805:3: (enumLiteral_2= '<->' )
                    // InternalGraphConfiguration.g:806:4: enumLiteral_2= '<->'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getBIEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDirectionAccess().getBIEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleDirection"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000072800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000072000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000070800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000038200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001800050L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400000L});

}