package org.tracesec.graph.dsl.ide.contentassist.antlr.internal;

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
import org.tracesec.graph.dsl.services.GraphConfigurationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGraphConfigurationParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'trg'", "'assoc'", "'ALL'", "'NONE'", "'->'", "'<-'", "'<->'", "'default'", "'='", "'consider'", "'namespace'", "'{'", "'}'", "'include'", "'exclude'", "'type'", "'reference'", "'--'", "'.'"
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

    	public void setGrammarAccess(GraphConfigurationGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleConfiguration"
    // InternalGraphConfiguration.g:53:1: entryRuleConfiguration : ruleConfiguration EOF ;
    public final void entryRuleConfiguration() throws RecognitionException {
        try {
            // InternalGraphConfiguration.g:54:1: ( ruleConfiguration EOF )
            // InternalGraphConfiguration.g:55:1: ruleConfiguration EOF
            {
             before(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_1);
            ruleConfiguration();

            state._fsp--;

             after(grammarAccess.getConfigurationRule()); 
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
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalGraphConfiguration.g:62:1: ruleConfiguration : ( ( rule__Configuration__Group__0 ) ) ;
    public final void ruleConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:66:2: ( ( ( rule__Configuration__Group__0 ) ) )
            // InternalGraphConfiguration.g:67:2: ( ( rule__Configuration__Group__0 ) )
            {
            // InternalGraphConfiguration.g:67:2: ( ( rule__Configuration__Group__0 ) )
            // InternalGraphConfiguration.g:68:3: ( rule__Configuration__Group__0 )
            {
             before(grammarAccess.getConfigurationAccess().getGroup()); 
            // InternalGraphConfiguration.g:69:3: ( rule__Configuration__Group__0 )
            // InternalGraphConfiguration.g:69:4: rule__Configuration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleNamespace"
    // InternalGraphConfiguration.g:78:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // InternalGraphConfiguration.g:79:1: ( ruleNamespace EOF )
            // InternalGraphConfiguration.g:80:1: ruleNamespace EOF
            {
             before(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_1);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getNamespaceRule()); 
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
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // InternalGraphConfiguration.g:87:1: ruleNamespace : ( ( rule__Namespace__Group__0 ) ) ;
    public final void ruleNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:91:2: ( ( ( rule__Namespace__Group__0 ) ) )
            // InternalGraphConfiguration.g:92:2: ( ( rule__Namespace__Group__0 ) )
            {
            // InternalGraphConfiguration.g:92:2: ( ( rule__Namespace__Group__0 ) )
            // InternalGraphConfiguration.g:93:3: ( rule__Namespace__Group__0 )
            {
             before(grammarAccess.getNamespaceAccess().getGroup()); 
            // InternalGraphConfiguration.g:94:3: ( rule__Namespace__Group__0 )
            // InternalGraphConfiguration.g:94:4: rule__Namespace__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleType"
    // InternalGraphConfiguration.g:103:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalGraphConfiguration.g:104:1: ( ruleType EOF )
            // InternalGraphConfiguration.g:105:1: ruleType EOF
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
    // InternalGraphConfiguration.g:112:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:116:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalGraphConfiguration.g:117:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalGraphConfiguration.g:117:2: ( ( rule__Type__Group__0 ) )
            // InternalGraphConfiguration.g:118:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalGraphConfiguration.g:119:3: ( rule__Type__Group__0 )
            // InternalGraphConfiguration.g:119:4: rule__Type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleEdge"
    // InternalGraphConfiguration.g:128:1: entryRuleEdge : ruleEdge EOF ;
    public final void entryRuleEdge() throws RecognitionException {
        try {
            // InternalGraphConfiguration.g:129:1: ( ruleEdge EOF )
            // InternalGraphConfiguration.g:130:1: ruleEdge EOF
            {
             before(grammarAccess.getEdgeRule()); 
            pushFollow(FOLLOW_1);
            ruleEdge();

            state._fsp--;

             after(grammarAccess.getEdgeRule()); 
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
    // $ANTLR end "entryRuleEdge"


    // $ANTLR start "ruleEdge"
    // InternalGraphConfiguration.g:137:1: ruleEdge : ( ( rule__Edge__Group__0 ) ) ;
    public final void ruleEdge() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:141:2: ( ( ( rule__Edge__Group__0 ) ) )
            // InternalGraphConfiguration.g:142:2: ( ( rule__Edge__Group__0 ) )
            {
            // InternalGraphConfiguration.g:142:2: ( ( rule__Edge__Group__0 ) )
            // InternalGraphConfiguration.g:143:3: ( rule__Edge__Group__0 )
            {
             before(grammarAccess.getEdgeAccess().getGroup()); 
            // InternalGraphConfiguration.g:144:3: ( rule__Edge__Group__0 )
            // InternalGraphConfiguration.g:144:4: rule__Edge__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Edge__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEdge"


    // $ANTLR start "entryRuleWeight"
    // InternalGraphConfiguration.g:153:1: entryRuleWeight : ruleWeight EOF ;
    public final void entryRuleWeight() throws RecognitionException {
        try {
            // InternalGraphConfiguration.g:154:1: ( ruleWeight EOF )
            // InternalGraphConfiguration.g:155:1: ruleWeight EOF
            {
             before(grammarAccess.getWeightRule()); 
            pushFollow(FOLLOW_1);
            ruleWeight();

            state._fsp--;

             after(grammarAccess.getWeightRule()); 
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
    // $ANTLR end "entryRuleWeight"


    // $ANTLR start "ruleWeight"
    // InternalGraphConfiguration.g:162:1: ruleWeight : ( ( rule__Weight__Alternatives ) ) ;
    public final void ruleWeight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:166:2: ( ( ( rule__Weight__Alternatives ) ) )
            // InternalGraphConfiguration.g:167:2: ( ( rule__Weight__Alternatives ) )
            {
            // InternalGraphConfiguration.g:167:2: ( ( rule__Weight__Alternatives ) )
            // InternalGraphConfiguration.g:168:3: ( rule__Weight__Alternatives )
            {
             before(grammarAccess.getWeightAccess().getAlternatives()); 
            // InternalGraphConfiguration.g:169:3: ( rule__Weight__Alternatives )
            // InternalGraphConfiguration.g:169:4: rule__Weight__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Weight__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWeightAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWeight"


    // $ANTLR start "entryRuleNumberWeight"
    // InternalGraphConfiguration.g:178:1: entryRuleNumberWeight : ruleNumberWeight EOF ;
    public final void entryRuleNumberWeight() throws RecognitionException {
        try {
            // InternalGraphConfiguration.g:179:1: ( ruleNumberWeight EOF )
            // InternalGraphConfiguration.g:180:1: ruleNumberWeight EOF
            {
             before(grammarAccess.getNumberWeightRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberWeight();

            state._fsp--;

             after(grammarAccess.getNumberWeightRule()); 
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
    // $ANTLR end "entryRuleNumberWeight"


    // $ANTLR start "ruleNumberWeight"
    // InternalGraphConfiguration.g:187:1: ruleNumberWeight : ( ( rule__NumberWeight__ValueAssignment ) ) ;
    public final void ruleNumberWeight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:191:2: ( ( ( rule__NumberWeight__ValueAssignment ) ) )
            // InternalGraphConfiguration.g:192:2: ( ( rule__NumberWeight__ValueAssignment ) )
            {
            // InternalGraphConfiguration.g:192:2: ( ( rule__NumberWeight__ValueAssignment ) )
            // InternalGraphConfiguration.g:193:3: ( rule__NumberWeight__ValueAssignment )
            {
             before(grammarAccess.getNumberWeightAccess().getValueAssignment()); 
            // InternalGraphConfiguration.g:194:3: ( rule__NumberWeight__ValueAssignment )
            // InternalGraphConfiguration.g:194:4: rule__NumberWeight__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumberWeight__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberWeightAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberWeight"


    // $ANTLR start "entryRuleAttributeWeight"
    // InternalGraphConfiguration.g:203:1: entryRuleAttributeWeight : ruleAttributeWeight EOF ;
    public final void entryRuleAttributeWeight() throws RecognitionException {
        try {
            // InternalGraphConfiguration.g:204:1: ( ruleAttributeWeight EOF )
            // InternalGraphConfiguration.g:205:1: ruleAttributeWeight EOF
            {
             before(grammarAccess.getAttributeWeightRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeWeight();

            state._fsp--;

             after(grammarAccess.getAttributeWeightRule()); 
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
    // $ANTLR end "entryRuleAttributeWeight"


    // $ANTLR start "ruleAttributeWeight"
    // InternalGraphConfiguration.g:212:1: ruleAttributeWeight : ( ( rule__AttributeWeight__Group__0 ) ) ;
    public final void ruleAttributeWeight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:216:2: ( ( ( rule__AttributeWeight__Group__0 ) ) )
            // InternalGraphConfiguration.g:217:2: ( ( rule__AttributeWeight__Group__0 ) )
            {
            // InternalGraphConfiguration.g:217:2: ( ( rule__AttributeWeight__Group__0 ) )
            // InternalGraphConfiguration.g:218:3: ( rule__AttributeWeight__Group__0 )
            {
             before(grammarAccess.getAttributeWeightAccess().getGroup()); 
            // InternalGraphConfiguration.g:219:3: ( rule__AttributeWeight__Group__0 )
            // InternalGraphConfiguration.g:219:4: rule__AttributeWeight__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeWeight__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeWeightAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeWeight"


    // $ANTLR start "ruleOwner"
    // InternalGraphConfiguration.g:228:1: ruleOwner : ( ( rule__Owner__Alternatives ) ) ;
    public final void ruleOwner() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:232:1: ( ( ( rule__Owner__Alternatives ) ) )
            // InternalGraphConfiguration.g:233:2: ( ( rule__Owner__Alternatives ) )
            {
            // InternalGraphConfiguration.g:233:2: ( ( rule__Owner__Alternatives ) )
            // InternalGraphConfiguration.g:234:3: ( rule__Owner__Alternatives )
            {
             before(grammarAccess.getOwnerAccess().getAlternatives()); 
            // InternalGraphConfiguration.g:235:3: ( rule__Owner__Alternatives )
            // InternalGraphConfiguration.g:235:4: rule__Owner__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Owner__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOwnerAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOwner"


    // $ANTLR start "ruleConsider"
    // InternalGraphConfiguration.g:244:1: ruleConsider : ( ( rule__Consider__Alternatives ) ) ;
    public final void ruleConsider() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:248:1: ( ( ( rule__Consider__Alternatives ) ) )
            // InternalGraphConfiguration.g:249:2: ( ( rule__Consider__Alternatives ) )
            {
            // InternalGraphConfiguration.g:249:2: ( ( rule__Consider__Alternatives ) )
            // InternalGraphConfiguration.g:250:3: ( rule__Consider__Alternatives )
            {
             before(grammarAccess.getConsiderAccess().getAlternatives()); 
            // InternalGraphConfiguration.g:251:3: ( rule__Consider__Alternatives )
            // InternalGraphConfiguration.g:251:4: rule__Consider__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Consider__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConsiderAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConsider"


    // $ANTLR start "ruleDirection"
    // InternalGraphConfiguration.g:260:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:264:1: ( ( ( rule__Direction__Alternatives ) ) )
            // InternalGraphConfiguration.g:265:2: ( ( rule__Direction__Alternatives ) )
            {
            // InternalGraphConfiguration.g:265:2: ( ( rule__Direction__Alternatives ) )
            // InternalGraphConfiguration.g:266:3: ( rule__Direction__Alternatives )
            {
             before(grammarAccess.getDirectionAccess().getAlternatives()); 
            // InternalGraphConfiguration.g:267:3: ( rule__Direction__Alternatives )
            // InternalGraphConfiguration.g:267:4: rule__Direction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Direction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDirectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirection"


    // $ANTLR start "rule__Weight__Alternatives"
    // InternalGraphConfiguration.g:275:1: rule__Weight__Alternatives : ( ( ruleNumberWeight ) | ( ruleAttributeWeight ) );
    public final void rule__Weight__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:279:1: ( ( ruleNumberWeight ) | ( ruleAttributeWeight ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID||(LA1_0>=11 && LA1_0<=12)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGraphConfiguration.g:280:2: ( ruleNumberWeight )
                    {
                    // InternalGraphConfiguration.g:280:2: ( ruleNumberWeight )
                    // InternalGraphConfiguration.g:281:3: ruleNumberWeight
                    {
                     before(grammarAccess.getWeightAccess().getNumberWeightParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberWeight();

                    state._fsp--;

                     after(grammarAccess.getWeightAccess().getNumberWeightParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphConfiguration.g:286:2: ( ruleAttributeWeight )
                    {
                    // InternalGraphConfiguration.g:286:2: ( ruleAttributeWeight )
                    // InternalGraphConfiguration.g:287:3: ruleAttributeWeight
                    {
                     before(grammarAccess.getWeightAccess().getAttributeWeightParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAttributeWeight();

                    state._fsp--;

                     after(grammarAccess.getWeightAccess().getAttributeWeightParserRuleCall_1()); 

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
    // $ANTLR end "rule__Weight__Alternatives"


    // $ANTLR start "rule__Owner__Alternatives"
    // InternalGraphConfiguration.g:296:1: rule__Owner__Alternatives : ( ( ( 'trg' ) ) | ( ( 'assoc' ) ) );
    public final void rule__Owner__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:300:1: ( ( ( 'trg' ) ) | ( ( 'assoc' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGraphConfiguration.g:301:2: ( ( 'trg' ) )
                    {
                    // InternalGraphConfiguration.g:301:2: ( ( 'trg' ) )
                    // InternalGraphConfiguration.g:302:3: ( 'trg' )
                    {
                     before(grammarAccess.getOwnerAccess().getTARGETEnumLiteralDeclaration_0()); 
                    // InternalGraphConfiguration.g:303:3: ( 'trg' )
                    // InternalGraphConfiguration.g:303:4: 'trg'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getOwnerAccess().getTARGETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphConfiguration.g:307:2: ( ( 'assoc' ) )
                    {
                    // InternalGraphConfiguration.g:307:2: ( ( 'assoc' ) )
                    // InternalGraphConfiguration.g:308:3: ( 'assoc' )
                    {
                     before(grammarAccess.getOwnerAccess().getASSOCIATIONEnumLiteralDeclaration_1()); 
                    // InternalGraphConfiguration.g:309:3: ( 'assoc' )
                    // InternalGraphConfiguration.g:309:4: 'assoc'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getOwnerAccess().getASSOCIATIONEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Owner__Alternatives"


    // $ANTLR start "rule__Consider__Alternatives"
    // InternalGraphConfiguration.g:317:1: rule__Consider__Alternatives : ( ( ( 'ALL' ) ) | ( ( 'NONE' ) ) );
    public final void rule__Consider__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:321:1: ( ( ( 'ALL' ) ) | ( ( 'NONE' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGraphConfiguration.g:322:2: ( ( 'ALL' ) )
                    {
                    // InternalGraphConfiguration.g:322:2: ( ( 'ALL' ) )
                    // InternalGraphConfiguration.g:323:3: ( 'ALL' )
                    {
                     before(grammarAccess.getConsiderAccess().getALLEnumLiteralDeclaration_0()); 
                    // InternalGraphConfiguration.g:324:3: ( 'ALL' )
                    // InternalGraphConfiguration.g:324:4: 'ALL'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getConsiderAccess().getALLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphConfiguration.g:328:2: ( ( 'NONE' ) )
                    {
                    // InternalGraphConfiguration.g:328:2: ( ( 'NONE' ) )
                    // InternalGraphConfiguration.g:329:3: ( 'NONE' )
                    {
                     before(grammarAccess.getConsiderAccess().getNONEEnumLiteralDeclaration_1()); 
                    // InternalGraphConfiguration.g:330:3: ( 'NONE' )
                    // InternalGraphConfiguration.g:330:4: 'NONE'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getConsiderAccess().getNONEEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Consider__Alternatives"


    // $ANTLR start "rule__Direction__Alternatives"
    // InternalGraphConfiguration.g:338:1: rule__Direction__Alternatives : ( ( ( '->' ) ) | ( ( '<-' ) ) | ( ( '<->' ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:342:1: ( ( ( '->' ) ) | ( ( '<-' ) ) | ( ( '<->' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGraphConfiguration.g:343:2: ( ( '->' ) )
                    {
                    // InternalGraphConfiguration.g:343:2: ( ( '->' ) )
                    // InternalGraphConfiguration.g:344:3: ( '->' )
                    {
                     before(grammarAccess.getDirectionAccess().getFWDEnumLiteralDeclaration_0()); 
                    // InternalGraphConfiguration.g:345:3: ( '->' )
                    // InternalGraphConfiguration.g:345:4: '->'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getFWDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphConfiguration.g:349:2: ( ( '<-' ) )
                    {
                    // InternalGraphConfiguration.g:349:2: ( ( '<-' ) )
                    // InternalGraphConfiguration.g:350:3: ( '<-' )
                    {
                     before(grammarAccess.getDirectionAccess().getBWDEnumLiteralDeclaration_1()); 
                    // InternalGraphConfiguration.g:351:3: ( '<-' )
                    // InternalGraphConfiguration.g:351:4: '<-'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getBWDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphConfiguration.g:355:2: ( ( '<->' ) )
                    {
                    // InternalGraphConfiguration.g:355:2: ( ( '<->' ) )
                    // InternalGraphConfiguration.g:356:3: ( '<->' )
                    {
                     before(grammarAccess.getDirectionAccess().getBIEnumLiteralDeclaration_2()); 
                    // InternalGraphConfiguration.g:357:3: ( '<->' )
                    // InternalGraphConfiguration.g:357:4: '<->'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getBIEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Direction__Alternatives"


    // $ANTLR start "rule__Configuration__Group__0"
    // InternalGraphConfiguration.g:365:1: rule__Configuration__Group__0 : rule__Configuration__Group__0__Impl rule__Configuration__Group__1 ;
    public final void rule__Configuration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:369:1: ( rule__Configuration__Group__0__Impl rule__Configuration__Group__1 )
            // InternalGraphConfiguration.g:370:2: rule__Configuration__Group__0__Impl rule__Configuration__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Configuration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__0"


    // $ANTLR start "rule__Configuration__Group__0__Impl"
    // InternalGraphConfiguration.g:377:1: rule__Configuration__Group__0__Impl : ( ( rule__Configuration__Group_0__0 )? ) ;
    public final void rule__Configuration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:381:1: ( ( ( rule__Configuration__Group_0__0 )? ) )
            // InternalGraphConfiguration.g:382:1: ( ( rule__Configuration__Group_0__0 )? )
            {
            // InternalGraphConfiguration.g:382:1: ( ( rule__Configuration__Group_0__0 )? )
            // InternalGraphConfiguration.g:383:2: ( rule__Configuration__Group_0__0 )?
            {
             before(grammarAccess.getConfigurationAccess().getGroup_0()); 
            // InternalGraphConfiguration.g:384:2: ( rule__Configuration__Group_0__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGraphConfiguration.g:384:3: rule__Configuration__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Configuration__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfigurationAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__0__Impl"


    // $ANTLR start "rule__Configuration__Group__1"
    // InternalGraphConfiguration.g:392:1: rule__Configuration__Group__1 : rule__Configuration__Group__1__Impl rule__Configuration__Group__2 ;
    public final void rule__Configuration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:396:1: ( rule__Configuration__Group__1__Impl rule__Configuration__Group__2 )
            // InternalGraphConfiguration.g:397:2: rule__Configuration__Group__1__Impl rule__Configuration__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Configuration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__1"


    // $ANTLR start "rule__Configuration__Group__1__Impl"
    // InternalGraphConfiguration.g:404:1: rule__Configuration__Group__1__Impl : ( ( rule__Configuration__Group_1__0 )? ) ;
    public final void rule__Configuration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:408:1: ( ( ( rule__Configuration__Group_1__0 )? ) )
            // InternalGraphConfiguration.g:409:1: ( ( rule__Configuration__Group_1__0 )? )
            {
            // InternalGraphConfiguration.g:409:1: ( ( rule__Configuration__Group_1__0 )? )
            // InternalGraphConfiguration.g:410:2: ( rule__Configuration__Group_1__0 )?
            {
             before(grammarAccess.getConfigurationAccess().getGroup_1()); 
            // InternalGraphConfiguration.g:411:2: ( rule__Configuration__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGraphConfiguration.g:411:3: rule__Configuration__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Configuration__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfigurationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__1__Impl"


    // $ANTLR start "rule__Configuration__Group__2"
    // InternalGraphConfiguration.g:419:1: rule__Configuration__Group__2 : rule__Configuration__Group__2__Impl ;
    public final void rule__Configuration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:423:1: ( rule__Configuration__Group__2__Impl )
            // InternalGraphConfiguration.g:424:2: rule__Configuration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__2"


    // $ANTLR start "rule__Configuration__Group__2__Impl"
    // InternalGraphConfiguration.g:430:1: rule__Configuration__Group__2__Impl : ( ( ( rule__Configuration__NamespacesAssignment_2 ) ) ( ( rule__Configuration__NamespacesAssignment_2 )* ) ) ;
    public final void rule__Configuration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:434:1: ( ( ( ( rule__Configuration__NamespacesAssignment_2 ) ) ( ( rule__Configuration__NamespacesAssignment_2 )* ) ) )
            // InternalGraphConfiguration.g:435:1: ( ( ( rule__Configuration__NamespacesAssignment_2 ) ) ( ( rule__Configuration__NamespacesAssignment_2 )* ) )
            {
            // InternalGraphConfiguration.g:435:1: ( ( ( rule__Configuration__NamespacesAssignment_2 ) ) ( ( rule__Configuration__NamespacesAssignment_2 )* ) )
            // InternalGraphConfiguration.g:436:2: ( ( rule__Configuration__NamespacesAssignment_2 ) ) ( ( rule__Configuration__NamespacesAssignment_2 )* )
            {
            // InternalGraphConfiguration.g:436:2: ( ( rule__Configuration__NamespacesAssignment_2 ) )
            // InternalGraphConfiguration.g:437:3: ( rule__Configuration__NamespacesAssignment_2 )
            {
             before(grammarAccess.getConfigurationAccess().getNamespacesAssignment_2()); 
            // InternalGraphConfiguration.g:438:3: ( rule__Configuration__NamespacesAssignment_2 )
            // InternalGraphConfiguration.g:438:4: rule__Configuration__NamespacesAssignment_2
            {
            pushFollow(FOLLOW_4);
            rule__Configuration__NamespacesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getNamespacesAssignment_2()); 

            }

            // InternalGraphConfiguration.g:441:2: ( ( rule__Configuration__NamespacesAssignment_2 )* )
            // InternalGraphConfiguration.g:442:3: ( rule__Configuration__NamespacesAssignment_2 )*
            {
             before(grammarAccess.getConfigurationAccess().getNamespacesAssignment_2()); 
            // InternalGraphConfiguration.g:443:3: ( rule__Configuration__NamespacesAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGraphConfiguration.g:443:4: rule__Configuration__NamespacesAssignment_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Configuration__NamespacesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getConfigurationAccess().getNamespacesAssignment_2()); 

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
    // $ANTLR end "rule__Configuration__Group__2__Impl"


    // $ANTLR start "rule__Configuration__Group_0__0"
    // InternalGraphConfiguration.g:453:1: rule__Configuration__Group_0__0 : rule__Configuration__Group_0__0__Impl rule__Configuration__Group_0__1 ;
    public final void rule__Configuration__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:457:1: ( rule__Configuration__Group_0__0__Impl rule__Configuration__Group_0__1 )
            // InternalGraphConfiguration.g:458:2: rule__Configuration__Group_0__0__Impl rule__Configuration__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__Configuration__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_0__0"


    // $ANTLR start "rule__Configuration__Group_0__0__Impl"
    // InternalGraphConfiguration.g:465:1: rule__Configuration__Group_0__0__Impl : ( 'default' ) ;
    public final void rule__Configuration__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:469:1: ( ( 'default' ) )
            // InternalGraphConfiguration.g:470:1: ( 'default' )
            {
            // InternalGraphConfiguration.g:470:1: ( 'default' )
            // InternalGraphConfiguration.g:471:2: 'default'
            {
             before(grammarAccess.getConfigurationAccess().getDefaultKeyword_0_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getDefaultKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_0__0__Impl"


    // $ANTLR start "rule__Configuration__Group_0__1"
    // InternalGraphConfiguration.g:480:1: rule__Configuration__Group_0__1 : rule__Configuration__Group_0__1__Impl rule__Configuration__Group_0__2 ;
    public final void rule__Configuration__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:484:1: ( rule__Configuration__Group_0__1__Impl rule__Configuration__Group_0__2 )
            // InternalGraphConfiguration.g:485:2: rule__Configuration__Group_0__1__Impl rule__Configuration__Group_0__2
            {
            pushFollow(FOLLOW_6);
            rule__Configuration__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_0__1"


    // $ANTLR start "rule__Configuration__Group_0__1__Impl"
    // InternalGraphConfiguration.g:492:1: rule__Configuration__Group_0__1__Impl : ( '=' ) ;
    public final void rule__Configuration__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:496:1: ( ( '=' ) )
            // InternalGraphConfiguration.g:497:1: ( '=' )
            {
            // InternalGraphConfiguration.g:497:1: ( '=' )
            // InternalGraphConfiguration.g:498:2: '='
            {
             before(grammarAccess.getConfigurationAccess().getEqualsSignKeyword_0_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getEqualsSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_0__1__Impl"


    // $ANTLR start "rule__Configuration__Group_0__2"
    // InternalGraphConfiguration.g:507:1: rule__Configuration__Group_0__2 : rule__Configuration__Group_0__2__Impl ;
    public final void rule__Configuration__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:511:1: ( rule__Configuration__Group_0__2__Impl )
            // InternalGraphConfiguration.g:512:2: rule__Configuration__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_0__2"


    // $ANTLR start "rule__Configuration__Group_0__2__Impl"
    // InternalGraphConfiguration.g:518:1: rule__Configuration__Group_0__2__Impl : ( ( rule__Configuration__DefaultAssignment_0_2 ) ) ;
    public final void rule__Configuration__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:522:1: ( ( ( rule__Configuration__DefaultAssignment_0_2 ) ) )
            // InternalGraphConfiguration.g:523:1: ( ( rule__Configuration__DefaultAssignment_0_2 ) )
            {
            // InternalGraphConfiguration.g:523:1: ( ( rule__Configuration__DefaultAssignment_0_2 ) )
            // InternalGraphConfiguration.g:524:2: ( rule__Configuration__DefaultAssignment_0_2 )
            {
             before(grammarAccess.getConfigurationAccess().getDefaultAssignment_0_2()); 
            // InternalGraphConfiguration.g:525:2: ( rule__Configuration__DefaultAssignment_0_2 )
            // InternalGraphConfiguration.g:525:3: rule__Configuration__DefaultAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__DefaultAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getDefaultAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_0__2__Impl"


    // $ANTLR start "rule__Configuration__Group_1__0"
    // InternalGraphConfiguration.g:534:1: rule__Configuration__Group_1__0 : rule__Configuration__Group_1__0__Impl rule__Configuration__Group_1__1 ;
    public final void rule__Configuration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:538:1: ( rule__Configuration__Group_1__0__Impl rule__Configuration__Group_1__1 )
            // InternalGraphConfiguration.g:539:2: rule__Configuration__Group_1__0__Impl rule__Configuration__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Configuration__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_1__0"


    // $ANTLR start "rule__Configuration__Group_1__0__Impl"
    // InternalGraphConfiguration.g:546:1: rule__Configuration__Group_1__0__Impl : ( 'consider' ) ;
    public final void rule__Configuration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:550:1: ( ( 'consider' ) )
            // InternalGraphConfiguration.g:551:1: ( 'consider' )
            {
            // InternalGraphConfiguration.g:551:1: ( 'consider' )
            // InternalGraphConfiguration.g:552:2: 'consider'
            {
             before(grammarAccess.getConfigurationAccess().getConsiderKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getConsiderKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_1__0__Impl"


    // $ANTLR start "rule__Configuration__Group_1__1"
    // InternalGraphConfiguration.g:561:1: rule__Configuration__Group_1__1 : rule__Configuration__Group_1__1__Impl rule__Configuration__Group_1__2 ;
    public final void rule__Configuration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:565:1: ( rule__Configuration__Group_1__1__Impl rule__Configuration__Group_1__2 )
            // InternalGraphConfiguration.g:566:2: rule__Configuration__Group_1__1__Impl rule__Configuration__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Configuration__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_1__1"


    // $ANTLR start "rule__Configuration__Group_1__1__Impl"
    // InternalGraphConfiguration.g:573:1: rule__Configuration__Group_1__1__Impl : ( '=' ) ;
    public final void rule__Configuration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:577:1: ( ( '=' ) )
            // InternalGraphConfiguration.g:578:1: ( '=' )
            {
            // InternalGraphConfiguration.g:578:1: ( '=' )
            // InternalGraphConfiguration.g:579:2: '='
            {
             before(grammarAccess.getConfigurationAccess().getEqualsSignKeyword_1_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getEqualsSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_1__1__Impl"


    // $ANTLR start "rule__Configuration__Group_1__2"
    // InternalGraphConfiguration.g:588:1: rule__Configuration__Group_1__2 : rule__Configuration__Group_1__2__Impl ;
    public final void rule__Configuration__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:592:1: ( rule__Configuration__Group_1__2__Impl )
            // InternalGraphConfiguration.g:593:2: rule__Configuration__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_1__2"


    // $ANTLR start "rule__Configuration__Group_1__2__Impl"
    // InternalGraphConfiguration.g:599:1: rule__Configuration__Group_1__2__Impl : ( ( rule__Configuration__ConsiderAssignment_1_2 ) ) ;
    public final void rule__Configuration__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:603:1: ( ( ( rule__Configuration__ConsiderAssignment_1_2 ) ) )
            // InternalGraphConfiguration.g:604:1: ( ( rule__Configuration__ConsiderAssignment_1_2 ) )
            {
            // InternalGraphConfiguration.g:604:1: ( ( rule__Configuration__ConsiderAssignment_1_2 ) )
            // InternalGraphConfiguration.g:605:2: ( rule__Configuration__ConsiderAssignment_1_2 )
            {
             before(grammarAccess.getConfigurationAccess().getConsiderAssignment_1_2()); 
            // InternalGraphConfiguration.g:606:2: ( rule__Configuration__ConsiderAssignment_1_2 )
            // InternalGraphConfiguration.g:606:3: rule__Configuration__ConsiderAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__ConsiderAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getConsiderAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_1__2__Impl"


    // $ANTLR start "rule__Namespace__Group__0"
    // InternalGraphConfiguration.g:615:1: rule__Namespace__Group__0 : rule__Namespace__Group__0__Impl rule__Namespace__Group__1 ;
    public final void rule__Namespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:619:1: ( rule__Namespace__Group__0__Impl rule__Namespace__Group__1 )
            // InternalGraphConfiguration.g:620:2: rule__Namespace__Group__0__Impl rule__Namespace__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Namespace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__0"


    // $ANTLR start "rule__Namespace__Group__0__Impl"
    // InternalGraphConfiguration.g:627:1: rule__Namespace__Group__0__Impl : ( 'namespace' ) ;
    public final void rule__Namespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:631:1: ( ( 'namespace' ) )
            // InternalGraphConfiguration.g:632:1: ( 'namespace' )
            {
            // InternalGraphConfiguration.g:632:1: ( 'namespace' )
            // InternalGraphConfiguration.g:633:2: 'namespace'
            {
             before(grammarAccess.getNamespaceAccess().getNamespaceKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getNamespaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__0__Impl"


    // $ANTLR start "rule__Namespace__Group__1"
    // InternalGraphConfiguration.g:642:1: rule__Namespace__Group__1 : rule__Namespace__Group__1__Impl rule__Namespace__Group__2 ;
    public final void rule__Namespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:646:1: ( rule__Namespace__Group__1__Impl rule__Namespace__Group__2 )
            // InternalGraphConfiguration.g:647:2: rule__Namespace__Group__1__Impl rule__Namespace__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Namespace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__1"


    // $ANTLR start "rule__Namespace__Group__1__Impl"
    // InternalGraphConfiguration.g:654:1: rule__Namespace__Group__1__Impl : ( ( rule__Namespace__PackageAssignment_1 ) ) ;
    public final void rule__Namespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:658:1: ( ( ( rule__Namespace__PackageAssignment_1 ) ) )
            // InternalGraphConfiguration.g:659:1: ( ( rule__Namespace__PackageAssignment_1 ) )
            {
            // InternalGraphConfiguration.g:659:1: ( ( rule__Namespace__PackageAssignment_1 ) )
            // InternalGraphConfiguration.g:660:2: ( rule__Namespace__PackageAssignment_1 )
            {
             before(grammarAccess.getNamespaceAccess().getPackageAssignment_1()); 
            // InternalGraphConfiguration.g:661:2: ( rule__Namespace__PackageAssignment_1 )
            // InternalGraphConfiguration.g:661:3: rule__Namespace__PackageAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__PackageAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getPackageAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__1__Impl"


    // $ANTLR start "rule__Namespace__Group__2"
    // InternalGraphConfiguration.g:669:1: rule__Namespace__Group__2 : rule__Namespace__Group__2__Impl rule__Namespace__Group__3 ;
    public final void rule__Namespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:673:1: ( rule__Namespace__Group__2__Impl rule__Namespace__Group__3 )
            // InternalGraphConfiguration.g:674:2: rule__Namespace__Group__2__Impl rule__Namespace__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Namespace__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__2"


    // $ANTLR start "rule__Namespace__Group__2__Impl"
    // InternalGraphConfiguration.g:681:1: rule__Namespace__Group__2__Impl : ( '{' ) ;
    public final void rule__Namespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:685:1: ( ( '{' ) )
            // InternalGraphConfiguration.g:686:1: ( '{' )
            {
            // InternalGraphConfiguration.g:686:1: ( '{' )
            // InternalGraphConfiguration.g:687:2: '{'
            {
             before(grammarAccess.getNamespaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__2__Impl"


    // $ANTLR start "rule__Namespace__Group__3"
    // InternalGraphConfiguration.g:696:1: rule__Namespace__Group__3 : rule__Namespace__Group__3__Impl rule__Namespace__Group__4 ;
    public final void rule__Namespace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:700:1: ( rule__Namespace__Group__3__Impl rule__Namespace__Group__4 )
            // InternalGraphConfiguration.g:701:2: rule__Namespace__Group__3__Impl rule__Namespace__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Namespace__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__3"


    // $ANTLR start "rule__Namespace__Group__3__Impl"
    // InternalGraphConfiguration.g:708:1: rule__Namespace__Group__3__Impl : ( ( rule__Namespace__Group_3__0 )? ) ;
    public final void rule__Namespace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:712:1: ( ( ( rule__Namespace__Group_3__0 )? ) )
            // InternalGraphConfiguration.g:713:1: ( ( rule__Namespace__Group_3__0 )? )
            {
            // InternalGraphConfiguration.g:713:1: ( ( rule__Namespace__Group_3__0 )? )
            // InternalGraphConfiguration.g:714:2: ( rule__Namespace__Group_3__0 )?
            {
             before(grammarAccess.getNamespaceAccess().getGroup_3()); 
            // InternalGraphConfiguration.g:715:2: ( rule__Namespace__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGraphConfiguration.g:715:3: rule__Namespace__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Namespace__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNamespaceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__3__Impl"


    // $ANTLR start "rule__Namespace__Group__4"
    // InternalGraphConfiguration.g:723:1: rule__Namespace__Group__4 : rule__Namespace__Group__4__Impl rule__Namespace__Group__5 ;
    public final void rule__Namespace__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:727:1: ( rule__Namespace__Group__4__Impl rule__Namespace__Group__5 )
            // InternalGraphConfiguration.g:728:2: rule__Namespace__Group__4__Impl rule__Namespace__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Namespace__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__4"


    // $ANTLR start "rule__Namespace__Group__4__Impl"
    // InternalGraphConfiguration.g:735:1: rule__Namespace__Group__4__Impl : ( ( rule__Namespace__Group_4__0 )? ) ;
    public final void rule__Namespace__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:739:1: ( ( ( rule__Namespace__Group_4__0 )? ) )
            // InternalGraphConfiguration.g:740:1: ( ( rule__Namespace__Group_4__0 )? )
            {
            // InternalGraphConfiguration.g:740:1: ( ( rule__Namespace__Group_4__0 )? )
            // InternalGraphConfiguration.g:741:2: ( rule__Namespace__Group_4__0 )?
            {
             before(grammarAccess.getNamespaceAccess().getGroup_4()); 
            // InternalGraphConfiguration.g:742:2: ( rule__Namespace__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGraphConfiguration.g:742:3: rule__Namespace__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Namespace__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNamespaceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__4__Impl"


    // $ANTLR start "rule__Namespace__Group__5"
    // InternalGraphConfiguration.g:750:1: rule__Namespace__Group__5 : rule__Namespace__Group__5__Impl rule__Namespace__Group__6 ;
    public final void rule__Namespace__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:754:1: ( rule__Namespace__Group__5__Impl rule__Namespace__Group__6 )
            // InternalGraphConfiguration.g:755:2: rule__Namespace__Group__5__Impl rule__Namespace__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Namespace__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__5"


    // $ANTLR start "rule__Namespace__Group__5__Impl"
    // InternalGraphConfiguration.g:762:1: rule__Namespace__Group__5__Impl : ( ( rule__Namespace__Group_5__0 )? ) ;
    public final void rule__Namespace__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:766:1: ( ( ( rule__Namespace__Group_5__0 )? ) )
            // InternalGraphConfiguration.g:767:1: ( ( rule__Namespace__Group_5__0 )? )
            {
            // InternalGraphConfiguration.g:767:1: ( ( rule__Namespace__Group_5__0 )? )
            // InternalGraphConfiguration.g:768:2: ( rule__Namespace__Group_5__0 )?
            {
             before(grammarAccess.getNamespaceAccess().getGroup_5()); 
            // InternalGraphConfiguration.g:769:2: ( rule__Namespace__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGraphConfiguration.g:769:3: rule__Namespace__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Namespace__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNamespaceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__5__Impl"


    // $ANTLR start "rule__Namespace__Group__6"
    // InternalGraphConfiguration.g:777:1: rule__Namespace__Group__6 : rule__Namespace__Group__6__Impl rule__Namespace__Group__7 ;
    public final void rule__Namespace__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:781:1: ( rule__Namespace__Group__6__Impl rule__Namespace__Group__7 )
            // InternalGraphConfiguration.g:782:2: rule__Namespace__Group__6__Impl rule__Namespace__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Namespace__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__6"


    // $ANTLR start "rule__Namespace__Group__6__Impl"
    // InternalGraphConfiguration.g:789:1: rule__Namespace__Group__6__Impl : ( ( rule__Namespace__Group_6__0 )? ) ;
    public final void rule__Namespace__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:793:1: ( ( ( rule__Namespace__Group_6__0 )? ) )
            // InternalGraphConfiguration.g:794:1: ( ( rule__Namespace__Group_6__0 )? )
            {
            // InternalGraphConfiguration.g:794:1: ( ( rule__Namespace__Group_6__0 )? )
            // InternalGraphConfiguration.g:795:2: ( rule__Namespace__Group_6__0 )?
            {
             before(grammarAccess.getNamespaceAccess().getGroup_6()); 
            // InternalGraphConfiguration.g:796:2: ( rule__Namespace__Group_6__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGraphConfiguration.g:796:3: rule__Namespace__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Namespace__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNamespaceAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__6__Impl"


    // $ANTLR start "rule__Namespace__Group__7"
    // InternalGraphConfiguration.g:804:1: rule__Namespace__Group__7 : rule__Namespace__Group__7__Impl ;
    public final void rule__Namespace__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:808:1: ( rule__Namespace__Group__7__Impl )
            // InternalGraphConfiguration.g:809:2: rule__Namespace__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__7"


    // $ANTLR start "rule__Namespace__Group__7__Impl"
    // InternalGraphConfiguration.g:815:1: rule__Namespace__Group__7__Impl : ( '}' ) ;
    public final void rule__Namespace__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:819:1: ( ( '}' ) )
            // InternalGraphConfiguration.g:820:1: ( '}' )
            {
            // InternalGraphConfiguration.g:820:1: ( '}' )
            // InternalGraphConfiguration.g:821:2: '}'
            {
             before(grammarAccess.getNamespaceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__7__Impl"


    // $ANTLR start "rule__Namespace__Group_3__0"
    // InternalGraphConfiguration.g:831:1: rule__Namespace__Group_3__0 : rule__Namespace__Group_3__0__Impl rule__Namespace__Group_3__1 ;
    public final void rule__Namespace__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:835:1: ( rule__Namespace__Group_3__0__Impl rule__Namespace__Group_3__1 )
            // InternalGraphConfiguration.g:836:2: rule__Namespace__Group_3__0__Impl rule__Namespace__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Namespace__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_3__0"


    // $ANTLR start "rule__Namespace__Group_3__0__Impl"
    // InternalGraphConfiguration.g:843:1: rule__Namespace__Group_3__0__Impl : ( 'default' ) ;
    public final void rule__Namespace__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:847:1: ( ( 'default' ) )
            // InternalGraphConfiguration.g:848:1: ( 'default' )
            {
            // InternalGraphConfiguration.g:848:1: ( 'default' )
            // InternalGraphConfiguration.g:849:2: 'default'
            {
             before(grammarAccess.getNamespaceAccess().getDefaultKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getDefaultKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_3__0__Impl"


    // $ANTLR start "rule__Namespace__Group_3__1"
    // InternalGraphConfiguration.g:858:1: rule__Namespace__Group_3__1 : rule__Namespace__Group_3__1__Impl rule__Namespace__Group_3__2 ;
    public final void rule__Namespace__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:862:1: ( rule__Namespace__Group_3__1__Impl rule__Namespace__Group_3__2 )
            // InternalGraphConfiguration.g:863:2: rule__Namespace__Group_3__1__Impl rule__Namespace__Group_3__2
            {
            pushFollow(FOLLOW_6);
            rule__Namespace__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_3__1"


    // $ANTLR start "rule__Namespace__Group_3__1__Impl"
    // InternalGraphConfiguration.g:870:1: rule__Namespace__Group_3__1__Impl : ( '=' ) ;
    public final void rule__Namespace__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:874:1: ( ( '=' ) )
            // InternalGraphConfiguration.g:875:1: ( '=' )
            {
            // InternalGraphConfiguration.g:875:1: ( '=' )
            // InternalGraphConfiguration.g:876:2: '='
            {
             before(grammarAccess.getNamespaceAccess().getEqualsSignKeyword_3_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getEqualsSignKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_3__1__Impl"


    // $ANTLR start "rule__Namespace__Group_3__2"
    // InternalGraphConfiguration.g:885:1: rule__Namespace__Group_3__2 : rule__Namespace__Group_3__2__Impl ;
    public final void rule__Namespace__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:889:1: ( rule__Namespace__Group_3__2__Impl )
            // InternalGraphConfiguration.g:890:2: rule__Namespace__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_3__2"


    // $ANTLR start "rule__Namespace__Group_3__2__Impl"
    // InternalGraphConfiguration.g:896:1: rule__Namespace__Group_3__2__Impl : ( ( rule__Namespace__DefaultAssignment_3_2 ) ) ;
    public final void rule__Namespace__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:900:1: ( ( ( rule__Namespace__DefaultAssignment_3_2 ) ) )
            // InternalGraphConfiguration.g:901:1: ( ( rule__Namespace__DefaultAssignment_3_2 ) )
            {
            // InternalGraphConfiguration.g:901:1: ( ( rule__Namespace__DefaultAssignment_3_2 ) )
            // InternalGraphConfiguration.g:902:2: ( rule__Namespace__DefaultAssignment_3_2 )
            {
             before(grammarAccess.getNamespaceAccess().getDefaultAssignment_3_2()); 
            // InternalGraphConfiguration.g:903:2: ( rule__Namespace__DefaultAssignment_3_2 )
            // InternalGraphConfiguration.g:903:3: rule__Namespace__DefaultAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__DefaultAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getDefaultAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_3__2__Impl"


    // $ANTLR start "rule__Namespace__Group_4__0"
    // InternalGraphConfiguration.g:912:1: rule__Namespace__Group_4__0 : rule__Namespace__Group_4__0__Impl rule__Namespace__Group_4__1 ;
    public final void rule__Namespace__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:916:1: ( rule__Namespace__Group_4__0__Impl rule__Namespace__Group_4__1 )
            // InternalGraphConfiguration.g:917:2: rule__Namespace__Group_4__0__Impl rule__Namespace__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Namespace__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_4__0"


    // $ANTLR start "rule__Namespace__Group_4__0__Impl"
    // InternalGraphConfiguration.g:924:1: rule__Namespace__Group_4__0__Impl : ( 'consider' ) ;
    public final void rule__Namespace__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:928:1: ( ( 'consider' ) )
            // InternalGraphConfiguration.g:929:1: ( 'consider' )
            {
            // InternalGraphConfiguration.g:929:1: ( 'consider' )
            // InternalGraphConfiguration.g:930:2: 'consider'
            {
             before(grammarAccess.getNamespaceAccess().getConsiderKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getConsiderKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_4__0__Impl"


    // $ANTLR start "rule__Namespace__Group_4__1"
    // InternalGraphConfiguration.g:939:1: rule__Namespace__Group_4__1 : rule__Namespace__Group_4__1__Impl rule__Namespace__Group_4__2 ;
    public final void rule__Namespace__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:943:1: ( rule__Namespace__Group_4__1__Impl rule__Namespace__Group_4__2 )
            // InternalGraphConfiguration.g:944:2: rule__Namespace__Group_4__1__Impl rule__Namespace__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__Namespace__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_4__1"


    // $ANTLR start "rule__Namespace__Group_4__1__Impl"
    // InternalGraphConfiguration.g:951:1: rule__Namespace__Group_4__1__Impl : ( '=' ) ;
    public final void rule__Namespace__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:955:1: ( ( '=' ) )
            // InternalGraphConfiguration.g:956:1: ( '=' )
            {
            // InternalGraphConfiguration.g:956:1: ( '=' )
            // InternalGraphConfiguration.g:957:2: '='
            {
             before(grammarAccess.getNamespaceAccess().getEqualsSignKeyword_4_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getEqualsSignKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_4__1__Impl"


    // $ANTLR start "rule__Namespace__Group_4__2"
    // InternalGraphConfiguration.g:966:1: rule__Namespace__Group_4__2 : rule__Namespace__Group_4__2__Impl ;
    public final void rule__Namespace__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:970:1: ( rule__Namespace__Group_4__2__Impl )
            // InternalGraphConfiguration.g:971:2: rule__Namespace__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_4__2"


    // $ANTLR start "rule__Namespace__Group_4__2__Impl"
    // InternalGraphConfiguration.g:977:1: rule__Namespace__Group_4__2__Impl : ( ( rule__Namespace__ConsiderAssignment_4_2 ) ) ;
    public final void rule__Namespace__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:981:1: ( ( ( rule__Namespace__ConsiderAssignment_4_2 ) ) )
            // InternalGraphConfiguration.g:982:1: ( ( rule__Namespace__ConsiderAssignment_4_2 ) )
            {
            // InternalGraphConfiguration.g:982:1: ( ( rule__Namespace__ConsiderAssignment_4_2 ) )
            // InternalGraphConfiguration.g:983:2: ( rule__Namespace__ConsiderAssignment_4_2 )
            {
             before(grammarAccess.getNamespaceAccess().getConsiderAssignment_4_2()); 
            // InternalGraphConfiguration.g:984:2: ( rule__Namespace__ConsiderAssignment_4_2 )
            // InternalGraphConfiguration.g:984:3: rule__Namespace__ConsiderAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__ConsiderAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getConsiderAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_4__2__Impl"


    // $ANTLR start "rule__Namespace__Group_5__0"
    // InternalGraphConfiguration.g:993:1: rule__Namespace__Group_5__0 : rule__Namespace__Group_5__0__Impl rule__Namespace__Group_5__1 ;
    public final void rule__Namespace__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:997:1: ( rule__Namespace__Group_5__0__Impl rule__Namespace__Group_5__1 )
            // InternalGraphConfiguration.g:998:2: rule__Namespace__Group_5__0__Impl rule__Namespace__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__Namespace__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_5__0"


    // $ANTLR start "rule__Namespace__Group_5__0__Impl"
    // InternalGraphConfiguration.g:1005:1: rule__Namespace__Group_5__0__Impl : ( 'include' ) ;
    public final void rule__Namespace__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1009:1: ( ( 'include' ) )
            // InternalGraphConfiguration.g:1010:1: ( 'include' )
            {
            // InternalGraphConfiguration.g:1010:1: ( 'include' )
            // InternalGraphConfiguration.g:1011:2: 'include'
            {
             before(grammarAccess.getNamespaceAccess().getIncludeKeyword_5_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getIncludeKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_5__0__Impl"


    // $ANTLR start "rule__Namespace__Group_5__1"
    // InternalGraphConfiguration.g:1020:1: rule__Namespace__Group_5__1 : rule__Namespace__Group_5__1__Impl rule__Namespace__Group_5__2 ;
    public final void rule__Namespace__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1024:1: ( rule__Namespace__Group_5__1__Impl rule__Namespace__Group_5__2 )
            // InternalGraphConfiguration.g:1025:2: rule__Namespace__Group_5__1__Impl rule__Namespace__Group_5__2
            {
            pushFollow(FOLLOW_11);
            rule__Namespace__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_5__1"


    // $ANTLR start "rule__Namespace__Group_5__1__Impl"
    // InternalGraphConfiguration.g:1032:1: rule__Namespace__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Namespace__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1036:1: ( ( '{' ) )
            // InternalGraphConfiguration.g:1037:1: ( '{' )
            {
            // InternalGraphConfiguration.g:1037:1: ( '{' )
            // InternalGraphConfiguration.g:1038:2: '{'
            {
             before(grammarAccess.getNamespaceAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_5__1__Impl"


    // $ANTLR start "rule__Namespace__Group_5__2"
    // InternalGraphConfiguration.g:1047:1: rule__Namespace__Group_5__2 : rule__Namespace__Group_5__2__Impl rule__Namespace__Group_5__3 ;
    public final void rule__Namespace__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1051:1: ( rule__Namespace__Group_5__2__Impl rule__Namespace__Group_5__3 )
            // InternalGraphConfiguration.g:1052:2: rule__Namespace__Group_5__2__Impl rule__Namespace__Group_5__3
            {
            pushFollow(FOLLOW_11);
            rule__Namespace__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_5__2"


    // $ANTLR start "rule__Namespace__Group_5__2__Impl"
    // InternalGraphConfiguration.g:1059:1: rule__Namespace__Group_5__2__Impl : ( ( rule__Namespace__IncludeAssignment_5_2 )* ) ;
    public final void rule__Namespace__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1063:1: ( ( ( rule__Namespace__IncludeAssignment_5_2 )* ) )
            // InternalGraphConfiguration.g:1064:1: ( ( rule__Namespace__IncludeAssignment_5_2 )* )
            {
            // InternalGraphConfiguration.g:1064:1: ( ( rule__Namespace__IncludeAssignment_5_2 )* )
            // InternalGraphConfiguration.g:1065:2: ( rule__Namespace__IncludeAssignment_5_2 )*
            {
             before(grammarAccess.getNamespaceAccess().getIncludeAssignment_5_2()); 
            // InternalGraphConfiguration.g:1066:2: ( rule__Namespace__IncludeAssignment_5_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGraphConfiguration.g:1066:3: rule__Namespace__IncludeAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Namespace__IncludeAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getNamespaceAccess().getIncludeAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_5__2__Impl"


    // $ANTLR start "rule__Namespace__Group_5__3"
    // InternalGraphConfiguration.g:1074:1: rule__Namespace__Group_5__3 : rule__Namespace__Group_5__3__Impl ;
    public final void rule__Namespace__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1078:1: ( rule__Namespace__Group_5__3__Impl )
            // InternalGraphConfiguration.g:1079:2: rule__Namespace__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_5__3"


    // $ANTLR start "rule__Namespace__Group_5__3__Impl"
    // InternalGraphConfiguration.g:1085:1: rule__Namespace__Group_5__3__Impl : ( '}' ) ;
    public final void rule__Namespace__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1089:1: ( ( '}' ) )
            // InternalGraphConfiguration.g:1090:1: ( '}' )
            {
            // InternalGraphConfiguration.g:1090:1: ( '}' )
            // InternalGraphConfiguration.g:1091:2: '}'
            {
             before(grammarAccess.getNamespaceAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getRightCurlyBracketKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_5__3__Impl"


    // $ANTLR start "rule__Namespace__Group_6__0"
    // InternalGraphConfiguration.g:1101:1: rule__Namespace__Group_6__0 : rule__Namespace__Group_6__0__Impl rule__Namespace__Group_6__1 ;
    public final void rule__Namespace__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1105:1: ( rule__Namespace__Group_6__0__Impl rule__Namespace__Group_6__1 )
            // InternalGraphConfiguration.g:1106:2: rule__Namespace__Group_6__0__Impl rule__Namespace__Group_6__1
            {
            pushFollow(FOLLOW_9);
            rule__Namespace__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_6__0"


    // $ANTLR start "rule__Namespace__Group_6__0__Impl"
    // InternalGraphConfiguration.g:1113:1: rule__Namespace__Group_6__0__Impl : ( 'exclude' ) ;
    public final void rule__Namespace__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1117:1: ( ( 'exclude' ) )
            // InternalGraphConfiguration.g:1118:1: ( 'exclude' )
            {
            // InternalGraphConfiguration.g:1118:1: ( 'exclude' )
            // InternalGraphConfiguration.g:1119:2: 'exclude'
            {
             before(grammarAccess.getNamespaceAccess().getExcludeKeyword_6_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getExcludeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_6__0__Impl"


    // $ANTLR start "rule__Namespace__Group_6__1"
    // InternalGraphConfiguration.g:1128:1: rule__Namespace__Group_6__1 : rule__Namespace__Group_6__1__Impl rule__Namespace__Group_6__2 ;
    public final void rule__Namespace__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1132:1: ( rule__Namespace__Group_6__1__Impl rule__Namespace__Group_6__2 )
            // InternalGraphConfiguration.g:1133:2: rule__Namespace__Group_6__1__Impl rule__Namespace__Group_6__2
            {
            pushFollow(FOLLOW_13);
            rule__Namespace__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_6__1"


    // $ANTLR start "rule__Namespace__Group_6__1__Impl"
    // InternalGraphConfiguration.g:1140:1: rule__Namespace__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Namespace__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1144:1: ( ( '{' ) )
            // InternalGraphConfiguration.g:1145:1: ( '{' )
            {
            // InternalGraphConfiguration.g:1145:1: ( '{' )
            // InternalGraphConfiguration.g:1146:2: '{'
            {
             before(grammarAccess.getNamespaceAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_6__1__Impl"


    // $ANTLR start "rule__Namespace__Group_6__2"
    // InternalGraphConfiguration.g:1155:1: rule__Namespace__Group_6__2 : rule__Namespace__Group_6__2__Impl rule__Namespace__Group_6__3 ;
    public final void rule__Namespace__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1159:1: ( rule__Namespace__Group_6__2__Impl rule__Namespace__Group_6__3 )
            // InternalGraphConfiguration.g:1160:2: rule__Namespace__Group_6__2__Impl rule__Namespace__Group_6__3
            {
            pushFollow(FOLLOW_14);
            rule__Namespace__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_6__2"


    // $ANTLR start "rule__Namespace__Group_6__2__Impl"
    // InternalGraphConfiguration.g:1167:1: rule__Namespace__Group_6__2__Impl : ( ( ( rule__Namespace__ExcludeAssignment_6_2 ) ) ( ( rule__Namespace__ExcludeAssignment_6_2 )* ) ) ;
    public final void rule__Namespace__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1171:1: ( ( ( ( rule__Namespace__ExcludeAssignment_6_2 ) ) ( ( rule__Namespace__ExcludeAssignment_6_2 )* ) ) )
            // InternalGraphConfiguration.g:1172:1: ( ( ( rule__Namespace__ExcludeAssignment_6_2 ) ) ( ( rule__Namespace__ExcludeAssignment_6_2 )* ) )
            {
            // InternalGraphConfiguration.g:1172:1: ( ( ( rule__Namespace__ExcludeAssignment_6_2 ) ) ( ( rule__Namespace__ExcludeAssignment_6_2 )* ) )
            // InternalGraphConfiguration.g:1173:2: ( ( rule__Namespace__ExcludeAssignment_6_2 ) ) ( ( rule__Namespace__ExcludeAssignment_6_2 )* )
            {
            // InternalGraphConfiguration.g:1173:2: ( ( rule__Namespace__ExcludeAssignment_6_2 ) )
            // InternalGraphConfiguration.g:1174:3: ( rule__Namespace__ExcludeAssignment_6_2 )
            {
             before(grammarAccess.getNamespaceAccess().getExcludeAssignment_6_2()); 
            // InternalGraphConfiguration.g:1175:3: ( rule__Namespace__ExcludeAssignment_6_2 )
            // InternalGraphConfiguration.g:1175:4: rule__Namespace__ExcludeAssignment_6_2
            {
            pushFollow(FOLLOW_15);
            rule__Namespace__ExcludeAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getExcludeAssignment_6_2()); 

            }

            // InternalGraphConfiguration.g:1178:2: ( ( rule__Namespace__ExcludeAssignment_6_2 )* )
            // InternalGraphConfiguration.g:1179:3: ( rule__Namespace__ExcludeAssignment_6_2 )*
            {
             before(grammarAccess.getNamespaceAccess().getExcludeAssignment_6_2()); 
            // InternalGraphConfiguration.g:1180:3: ( rule__Namespace__ExcludeAssignment_6_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGraphConfiguration.g:1180:4: rule__Namespace__ExcludeAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Namespace__ExcludeAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getNamespaceAccess().getExcludeAssignment_6_2()); 

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
    // $ANTLR end "rule__Namespace__Group_6__2__Impl"


    // $ANTLR start "rule__Namespace__Group_6__3"
    // InternalGraphConfiguration.g:1189:1: rule__Namespace__Group_6__3 : rule__Namespace__Group_6__3__Impl ;
    public final void rule__Namespace__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1193:1: ( rule__Namespace__Group_6__3__Impl )
            // InternalGraphConfiguration.g:1194:2: rule__Namespace__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_6__3"


    // $ANTLR start "rule__Namespace__Group_6__3__Impl"
    // InternalGraphConfiguration.g:1200:1: rule__Namespace__Group_6__3__Impl : ( '}' ) ;
    public final void rule__Namespace__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1204:1: ( ( '}' ) )
            // InternalGraphConfiguration.g:1205:1: ( '}' )
            {
            // InternalGraphConfiguration.g:1205:1: ( '}' )
            // InternalGraphConfiguration.g:1206:2: '}'
            {
             before(grammarAccess.getNamespaceAccess().getRightCurlyBracketKeyword_6_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getRightCurlyBracketKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_6__3__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // InternalGraphConfiguration.g:1216:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1220:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalGraphConfiguration.g:1221:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // InternalGraphConfiguration.g:1228:1: rule__Type__Group__0__Impl : ( 'type' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1232:1: ( ( 'type' ) )
            // InternalGraphConfiguration.g:1233:1: ( 'type' )
            {
            // InternalGraphConfiguration.g:1233:1: ( 'type' )
            // InternalGraphConfiguration.g:1234:2: 'type'
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // InternalGraphConfiguration.g:1243:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1247:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalGraphConfiguration.g:1248:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // InternalGraphConfiguration.g:1255:1: rule__Type__Group__1__Impl : ( ( rule__Type__TypeAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1259:1: ( ( ( rule__Type__TypeAssignment_1 ) ) )
            // InternalGraphConfiguration.g:1260:1: ( ( rule__Type__TypeAssignment_1 ) )
            {
            // InternalGraphConfiguration.g:1260:1: ( ( rule__Type__TypeAssignment_1 ) )
            // InternalGraphConfiguration.g:1261:2: ( rule__Type__TypeAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getTypeAssignment_1()); 
            // InternalGraphConfiguration.g:1262:2: ( rule__Type__TypeAssignment_1 )
            // InternalGraphConfiguration.g:1262:3: rule__Type__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__2"
    // InternalGraphConfiguration.g:1270:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1274:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // InternalGraphConfiguration.g:1275:2: rule__Type__Group__2__Impl rule__Type__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Type__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__2"


    // $ANTLR start "rule__Type__Group__2__Impl"
    // InternalGraphConfiguration.g:1282:1: rule__Type__Group__2__Impl : ( '{' ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1286:1: ( ( '{' ) )
            // InternalGraphConfiguration.g:1287:1: ( '{' )
            {
            // InternalGraphConfiguration.g:1287:1: ( '{' )
            // InternalGraphConfiguration.g:1288:2: '{'
            {
             before(grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__2__Impl"


    // $ANTLR start "rule__Type__Group__3"
    // InternalGraphConfiguration.g:1297:1: rule__Type__Group__3 : rule__Type__Group__3__Impl rule__Type__Group__4 ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1301:1: ( rule__Type__Group__3__Impl rule__Type__Group__4 )
            // InternalGraphConfiguration.g:1302:2: rule__Type__Group__3__Impl rule__Type__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Type__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__3"


    // $ANTLR start "rule__Type__Group__3__Impl"
    // InternalGraphConfiguration.g:1309:1: rule__Type__Group__3__Impl : ( ( rule__Type__Group_3__0 )? ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1313:1: ( ( ( rule__Type__Group_3__0 )? ) )
            // InternalGraphConfiguration.g:1314:1: ( ( rule__Type__Group_3__0 )? )
            {
            // InternalGraphConfiguration.g:1314:1: ( ( rule__Type__Group_3__0 )? )
            // InternalGraphConfiguration.g:1315:2: ( rule__Type__Group_3__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_3()); 
            // InternalGraphConfiguration.g:1316:2: ( rule__Type__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGraphConfiguration.g:1316:3: rule__Type__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__3__Impl"


    // $ANTLR start "rule__Type__Group__4"
    // InternalGraphConfiguration.g:1324:1: rule__Type__Group__4 : rule__Type__Group__4__Impl rule__Type__Group__5 ;
    public final void rule__Type__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1328:1: ( rule__Type__Group__4__Impl rule__Type__Group__5 )
            // InternalGraphConfiguration.g:1329:2: rule__Type__Group__4__Impl rule__Type__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Type__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__4"


    // $ANTLR start "rule__Type__Group__4__Impl"
    // InternalGraphConfiguration.g:1336:1: rule__Type__Group__4__Impl : ( ( rule__Type__Group_4__0 )? ) ;
    public final void rule__Type__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1340:1: ( ( ( rule__Type__Group_4__0 )? ) )
            // InternalGraphConfiguration.g:1341:1: ( ( rule__Type__Group_4__0 )? )
            {
            // InternalGraphConfiguration.g:1341:1: ( ( rule__Type__Group_4__0 )? )
            // InternalGraphConfiguration.g:1342:2: ( rule__Type__Group_4__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_4()); 
            // InternalGraphConfiguration.g:1343:2: ( rule__Type__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGraphConfiguration.g:1343:3: rule__Type__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__4__Impl"


    // $ANTLR start "rule__Type__Group__5"
    // InternalGraphConfiguration.g:1351:1: rule__Type__Group__5 : rule__Type__Group__5__Impl rule__Type__Group__6 ;
    public final void rule__Type__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1355:1: ( rule__Type__Group__5__Impl rule__Type__Group__6 )
            // InternalGraphConfiguration.g:1356:2: rule__Type__Group__5__Impl rule__Type__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Type__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__5"


    // $ANTLR start "rule__Type__Group__5__Impl"
    // InternalGraphConfiguration.g:1363:1: rule__Type__Group__5__Impl : ( ( rule__Type__Group_5__0 )? ) ;
    public final void rule__Type__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1367:1: ( ( ( rule__Type__Group_5__0 )? ) )
            // InternalGraphConfiguration.g:1368:1: ( ( rule__Type__Group_5__0 )? )
            {
            // InternalGraphConfiguration.g:1368:1: ( ( rule__Type__Group_5__0 )? )
            // InternalGraphConfiguration.g:1369:2: ( rule__Type__Group_5__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_5()); 
            // InternalGraphConfiguration.g:1370:2: ( rule__Type__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGraphConfiguration.g:1370:3: rule__Type__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__5__Impl"


    // $ANTLR start "rule__Type__Group__6"
    // InternalGraphConfiguration.g:1378:1: rule__Type__Group__6 : rule__Type__Group__6__Impl rule__Type__Group__7 ;
    public final void rule__Type__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1382:1: ( rule__Type__Group__6__Impl rule__Type__Group__7 )
            // InternalGraphConfiguration.g:1383:2: rule__Type__Group__6__Impl rule__Type__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Type__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__6"


    // $ANTLR start "rule__Type__Group__6__Impl"
    // InternalGraphConfiguration.g:1390:1: rule__Type__Group__6__Impl : ( ( rule__Type__Group_6__0 )? ) ;
    public final void rule__Type__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1394:1: ( ( ( rule__Type__Group_6__0 )? ) )
            // InternalGraphConfiguration.g:1395:1: ( ( rule__Type__Group_6__0 )? )
            {
            // InternalGraphConfiguration.g:1395:1: ( ( rule__Type__Group_6__0 )? )
            // InternalGraphConfiguration.g:1396:2: ( rule__Type__Group_6__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_6()); 
            // InternalGraphConfiguration.g:1397:2: ( rule__Type__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGraphConfiguration.g:1397:3: rule__Type__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__6__Impl"


    // $ANTLR start "rule__Type__Group__7"
    // InternalGraphConfiguration.g:1405:1: rule__Type__Group__7 : rule__Type__Group__7__Impl ;
    public final void rule__Type__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1409:1: ( rule__Type__Group__7__Impl )
            // InternalGraphConfiguration.g:1410:2: rule__Type__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__7"


    // $ANTLR start "rule__Type__Group__7__Impl"
    // InternalGraphConfiguration.g:1416:1: rule__Type__Group__7__Impl : ( '}' ) ;
    public final void rule__Type__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1420:1: ( ( '}' ) )
            // InternalGraphConfiguration.g:1421:1: ( '}' )
            {
            // InternalGraphConfiguration.g:1421:1: ( '}' )
            // InternalGraphConfiguration.g:1422:2: '}'
            {
             before(grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__7__Impl"


    // $ANTLR start "rule__Type__Group_3__0"
    // InternalGraphConfiguration.g:1432:1: rule__Type__Group_3__0 : rule__Type__Group_3__0__Impl rule__Type__Group_3__1 ;
    public final void rule__Type__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1436:1: ( rule__Type__Group_3__0__Impl rule__Type__Group_3__1 )
            // InternalGraphConfiguration.g:1437:2: rule__Type__Group_3__0__Impl rule__Type__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Type__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__0"


    // $ANTLR start "rule__Type__Group_3__0__Impl"
    // InternalGraphConfiguration.g:1444:1: rule__Type__Group_3__0__Impl : ( 'consider' ) ;
    public final void rule__Type__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1448:1: ( ( 'consider' ) )
            // InternalGraphConfiguration.g:1449:1: ( 'consider' )
            {
            // InternalGraphConfiguration.g:1449:1: ( 'consider' )
            // InternalGraphConfiguration.g:1450:2: 'consider'
            {
             before(grammarAccess.getTypeAccess().getConsiderKeyword_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getConsiderKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__0__Impl"


    // $ANTLR start "rule__Type__Group_3__1"
    // InternalGraphConfiguration.g:1459:1: rule__Type__Group_3__1 : rule__Type__Group_3__1__Impl rule__Type__Group_3__2 ;
    public final void rule__Type__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1463:1: ( rule__Type__Group_3__1__Impl rule__Type__Group_3__2 )
            // InternalGraphConfiguration.g:1464:2: rule__Type__Group_3__1__Impl rule__Type__Group_3__2
            {
            pushFollow(FOLLOW_7);
            rule__Type__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__1"


    // $ANTLR start "rule__Type__Group_3__1__Impl"
    // InternalGraphConfiguration.g:1471:1: rule__Type__Group_3__1__Impl : ( '=' ) ;
    public final void rule__Type__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1475:1: ( ( '=' ) )
            // InternalGraphConfiguration.g:1476:1: ( '=' )
            {
            // InternalGraphConfiguration.g:1476:1: ( '=' )
            // InternalGraphConfiguration.g:1477:2: '='
            {
             before(grammarAccess.getTypeAccess().getEqualsSignKeyword_3_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getEqualsSignKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__1__Impl"


    // $ANTLR start "rule__Type__Group_3__2"
    // InternalGraphConfiguration.g:1486:1: rule__Type__Group_3__2 : rule__Type__Group_3__2__Impl ;
    public final void rule__Type__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1490:1: ( rule__Type__Group_3__2__Impl )
            // InternalGraphConfiguration.g:1491:2: rule__Type__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__2"


    // $ANTLR start "rule__Type__Group_3__2__Impl"
    // InternalGraphConfiguration.g:1497:1: rule__Type__Group_3__2__Impl : ( ( rule__Type__ConsiderAssignment_3_2 ) ) ;
    public final void rule__Type__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1501:1: ( ( ( rule__Type__ConsiderAssignment_3_2 ) ) )
            // InternalGraphConfiguration.g:1502:1: ( ( rule__Type__ConsiderAssignment_3_2 ) )
            {
            // InternalGraphConfiguration.g:1502:1: ( ( rule__Type__ConsiderAssignment_3_2 ) )
            // InternalGraphConfiguration.g:1503:2: ( rule__Type__ConsiderAssignment_3_2 )
            {
             before(grammarAccess.getTypeAccess().getConsiderAssignment_3_2()); 
            // InternalGraphConfiguration.g:1504:2: ( rule__Type__ConsiderAssignment_3_2 )
            // InternalGraphConfiguration.g:1504:3: rule__Type__ConsiderAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Type__ConsiderAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getConsiderAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__2__Impl"


    // $ANTLR start "rule__Type__Group_4__0"
    // InternalGraphConfiguration.g:1513:1: rule__Type__Group_4__0 : rule__Type__Group_4__0__Impl rule__Type__Group_4__1 ;
    public final void rule__Type__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1517:1: ( rule__Type__Group_4__0__Impl rule__Type__Group_4__1 )
            // InternalGraphConfiguration.g:1518:2: rule__Type__Group_4__0__Impl rule__Type__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Type__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_4__0"


    // $ANTLR start "rule__Type__Group_4__0__Impl"
    // InternalGraphConfiguration.g:1525:1: rule__Type__Group_4__0__Impl : ( 'default' ) ;
    public final void rule__Type__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1529:1: ( ( 'default' ) )
            // InternalGraphConfiguration.g:1530:1: ( 'default' )
            {
            // InternalGraphConfiguration.g:1530:1: ( 'default' )
            // InternalGraphConfiguration.g:1531:2: 'default'
            {
             before(grammarAccess.getTypeAccess().getDefaultKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getDefaultKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_4__0__Impl"


    // $ANTLR start "rule__Type__Group_4__1"
    // InternalGraphConfiguration.g:1540:1: rule__Type__Group_4__1 : rule__Type__Group_4__1__Impl rule__Type__Group_4__2 ;
    public final void rule__Type__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1544:1: ( rule__Type__Group_4__1__Impl rule__Type__Group_4__2 )
            // InternalGraphConfiguration.g:1545:2: rule__Type__Group_4__1__Impl rule__Type__Group_4__2
            {
            pushFollow(FOLLOW_6);
            rule__Type__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_4__1"


    // $ANTLR start "rule__Type__Group_4__1__Impl"
    // InternalGraphConfiguration.g:1552:1: rule__Type__Group_4__1__Impl : ( '=' ) ;
    public final void rule__Type__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1556:1: ( ( '=' ) )
            // InternalGraphConfiguration.g:1557:1: ( '=' )
            {
            // InternalGraphConfiguration.g:1557:1: ( '=' )
            // InternalGraphConfiguration.g:1558:2: '='
            {
             before(grammarAccess.getTypeAccess().getEqualsSignKeyword_4_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getEqualsSignKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_4__1__Impl"


    // $ANTLR start "rule__Type__Group_4__2"
    // InternalGraphConfiguration.g:1567:1: rule__Type__Group_4__2 : rule__Type__Group_4__2__Impl ;
    public final void rule__Type__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1571:1: ( rule__Type__Group_4__2__Impl )
            // InternalGraphConfiguration.g:1572:2: rule__Type__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_4__2"


    // $ANTLR start "rule__Type__Group_4__2__Impl"
    // InternalGraphConfiguration.g:1578:1: rule__Type__Group_4__2__Impl : ( ( rule__Type__DefaultAssignment_4_2 ) ) ;
    public final void rule__Type__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1582:1: ( ( ( rule__Type__DefaultAssignment_4_2 ) ) )
            // InternalGraphConfiguration.g:1583:1: ( ( rule__Type__DefaultAssignment_4_2 ) )
            {
            // InternalGraphConfiguration.g:1583:1: ( ( rule__Type__DefaultAssignment_4_2 ) )
            // InternalGraphConfiguration.g:1584:2: ( rule__Type__DefaultAssignment_4_2 )
            {
             before(grammarAccess.getTypeAccess().getDefaultAssignment_4_2()); 
            // InternalGraphConfiguration.g:1585:2: ( rule__Type__DefaultAssignment_4_2 )
            // InternalGraphConfiguration.g:1585:3: rule__Type__DefaultAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Type__DefaultAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getDefaultAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_4__2__Impl"


    // $ANTLR start "rule__Type__Group_5__0"
    // InternalGraphConfiguration.g:1594:1: rule__Type__Group_5__0 : rule__Type__Group_5__0__Impl rule__Type__Group_5__1 ;
    public final void rule__Type__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1598:1: ( rule__Type__Group_5__0__Impl rule__Type__Group_5__1 )
            // InternalGraphConfiguration.g:1599:2: rule__Type__Group_5__0__Impl rule__Type__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__Type__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__0"


    // $ANTLR start "rule__Type__Group_5__0__Impl"
    // InternalGraphConfiguration.g:1606:1: rule__Type__Group_5__0__Impl : ( 'include' ) ;
    public final void rule__Type__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1610:1: ( ( 'include' ) )
            // InternalGraphConfiguration.g:1611:1: ( 'include' )
            {
            // InternalGraphConfiguration.g:1611:1: ( 'include' )
            // InternalGraphConfiguration.g:1612:2: 'include'
            {
             before(grammarAccess.getTypeAccess().getIncludeKeyword_5_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getIncludeKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__0__Impl"


    // $ANTLR start "rule__Type__Group_5__1"
    // InternalGraphConfiguration.g:1621:1: rule__Type__Group_5__1 : rule__Type__Group_5__1__Impl rule__Type__Group_5__2 ;
    public final void rule__Type__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1625:1: ( rule__Type__Group_5__1__Impl rule__Type__Group_5__2 )
            // InternalGraphConfiguration.g:1626:2: rule__Type__Group_5__1__Impl rule__Type__Group_5__2
            {
            pushFollow(FOLLOW_16);
            rule__Type__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__1"


    // $ANTLR start "rule__Type__Group_5__1__Impl"
    // InternalGraphConfiguration.g:1633:1: rule__Type__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Type__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1637:1: ( ( '{' ) )
            // InternalGraphConfiguration.g:1638:1: ( '{' )
            {
            // InternalGraphConfiguration.g:1638:1: ( '{' )
            // InternalGraphConfiguration.g:1639:2: '{'
            {
             before(grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__1__Impl"


    // $ANTLR start "rule__Type__Group_5__2"
    // InternalGraphConfiguration.g:1648:1: rule__Type__Group_5__2 : rule__Type__Group_5__2__Impl rule__Type__Group_5__3 ;
    public final void rule__Type__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1652:1: ( rule__Type__Group_5__2__Impl rule__Type__Group_5__3 )
            // InternalGraphConfiguration.g:1653:2: rule__Type__Group_5__2__Impl rule__Type__Group_5__3
            {
            pushFollow(FOLLOW_14);
            rule__Type__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__2"


    // $ANTLR start "rule__Type__Group_5__2__Impl"
    // InternalGraphConfiguration.g:1660:1: rule__Type__Group_5__2__Impl : ( ( ( rule__Type__InlcudeAssignment_5_2 ) ) ( ( rule__Type__InlcudeAssignment_5_2 )* ) ) ;
    public final void rule__Type__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1664:1: ( ( ( ( rule__Type__InlcudeAssignment_5_2 ) ) ( ( rule__Type__InlcudeAssignment_5_2 )* ) ) )
            // InternalGraphConfiguration.g:1665:1: ( ( ( rule__Type__InlcudeAssignment_5_2 ) ) ( ( rule__Type__InlcudeAssignment_5_2 )* ) )
            {
            // InternalGraphConfiguration.g:1665:1: ( ( ( rule__Type__InlcudeAssignment_5_2 ) ) ( ( rule__Type__InlcudeAssignment_5_2 )* ) )
            // InternalGraphConfiguration.g:1666:2: ( ( rule__Type__InlcudeAssignment_5_2 ) ) ( ( rule__Type__InlcudeAssignment_5_2 )* )
            {
            // InternalGraphConfiguration.g:1666:2: ( ( rule__Type__InlcudeAssignment_5_2 ) )
            // InternalGraphConfiguration.g:1667:3: ( rule__Type__InlcudeAssignment_5_2 )
            {
             before(grammarAccess.getTypeAccess().getInlcudeAssignment_5_2()); 
            // InternalGraphConfiguration.g:1668:3: ( rule__Type__InlcudeAssignment_5_2 )
            // InternalGraphConfiguration.g:1668:4: rule__Type__InlcudeAssignment_5_2
            {
            pushFollow(FOLLOW_17);
            rule__Type__InlcudeAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getInlcudeAssignment_5_2()); 

            }

            // InternalGraphConfiguration.g:1671:2: ( ( rule__Type__InlcudeAssignment_5_2 )* )
            // InternalGraphConfiguration.g:1672:3: ( rule__Type__InlcudeAssignment_5_2 )*
            {
             before(grammarAccess.getTypeAccess().getInlcudeAssignment_5_2()); 
            // InternalGraphConfiguration.g:1673:3: ( rule__Type__InlcudeAssignment_5_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==27) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGraphConfiguration.g:1673:4: rule__Type__InlcudeAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Type__InlcudeAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getTypeAccess().getInlcudeAssignment_5_2()); 

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
    // $ANTLR end "rule__Type__Group_5__2__Impl"


    // $ANTLR start "rule__Type__Group_5__3"
    // InternalGraphConfiguration.g:1682:1: rule__Type__Group_5__3 : rule__Type__Group_5__3__Impl ;
    public final void rule__Type__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1686:1: ( rule__Type__Group_5__3__Impl )
            // InternalGraphConfiguration.g:1687:2: rule__Type__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__3"


    // $ANTLR start "rule__Type__Group_5__3__Impl"
    // InternalGraphConfiguration.g:1693:1: rule__Type__Group_5__3__Impl : ( '}' ) ;
    public final void rule__Type__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1697:1: ( ( '}' ) )
            // InternalGraphConfiguration.g:1698:1: ( '}' )
            {
            // InternalGraphConfiguration.g:1698:1: ( '}' )
            // InternalGraphConfiguration.g:1699:2: '}'
            {
             before(grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__3__Impl"


    // $ANTLR start "rule__Type__Group_6__0"
    // InternalGraphConfiguration.g:1709:1: rule__Type__Group_6__0 : rule__Type__Group_6__0__Impl rule__Type__Group_6__1 ;
    public final void rule__Type__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1713:1: ( rule__Type__Group_6__0__Impl rule__Type__Group_6__1 )
            // InternalGraphConfiguration.g:1714:2: rule__Type__Group_6__0__Impl rule__Type__Group_6__1
            {
            pushFollow(FOLLOW_9);
            rule__Type__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_6__0"


    // $ANTLR start "rule__Type__Group_6__0__Impl"
    // InternalGraphConfiguration.g:1721:1: rule__Type__Group_6__0__Impl : ( 'exclude' ) ;
    public final void rule__Type__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1725:1: ( ( 'exclude' ) )
            // InternalGraphConfiguration.g:1726:1: ( 'exclude' )
            {
            // InternalGraphConfiguration.g:1726:1: ( 'exclude' )
            // InternalGraphConfiguration.g:1727:2: 'exclude'
            {
             before(grammarAccess.getTypeAccess().getExcludeKeyword_6_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getExcludeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_6__0__Impl"


    // $ANTLR start "rule__Type__Group_6__1"
    // InternalGraphConfiguration.g:1736:1: rule__Type__Group_6__1 : rule__Type__Group_6__1__Impl rule__Type__Group_6__2 ;
    public final void rule__Type__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1740:1: ( rule__Type__Group_6__1__Impl rule__Type__Group_6__2 )
            // InternalGraphConfiguration.g:1741:2: rule__Type__Group_6__1__Impl rule__Type__Group_6__2
            {
            pushFollow(FOLLOW_13);
            rule__Type__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_6__1"


    // $ANTLR start "rule__Type__Group_6__1__Impl"
    // InternalGraphConfiguration.g:1748:1: rule__Type__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Type__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1752:1: ( ( '{' ) )
            // InternalGraphConfiguration.g:1753:1: ( '{' )
            {
            // InternalGraphConfiguration.g:1753:1: ( '{' )
            // InternalGraphConfiguration.g:1754:2: '{'
            {
             before(grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_6__1__Impl"


    // $ANTLR start "rule__Type__Group_6__2"
    // InternalGraphConfiguration.g:1763:1: rule__Type__Group_6__2 : rule__Type__Group_6__2__Impl rule__Type__Group_6__3 ;
    public final void rule__Type__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1767:1: ( rule__Type__Group_6__2__Impl rule__Type__Group_6__3 )
            // InternalGraphConfiguration.g:1768:2: rule__Type__Group_6__2__Impl rule__Type__Group_6__3
            {
            pushFollow(FOLLOW_14);
            rule__Type__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_6__2"


    // $ANTLR start "rule__Type__Group_6__2__Impl"
    // InternalGraphConfiguration.g:1775:1: rule__Type__Group_6__2__Impl : ( ( ( rule__Type__ExcludeAssignment_6_2 ) ) ( ( rule__Type__ExcludeAssignment_6_2 )* ) ) ;
    public final void rule__Type__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1779:1: ( ( ( ( rule__Type__ExcludeAssignment_6_2 ) ) ( ( rule__Type__ExcludeAssignment_6_2 )* ) ) )
            // InternalGraphConfiguration.g:1780:1: ( ( ( rule__Type__ExcludeAssignment_6_2 ) ) ( ( rule__Type__ExcludeAssignment_6_2 )* ) )
            {
            // InternalGraphConfiguration.g:1780:1: ( ( ( rule__Type__ExcludeAssignment_6_2 ) ) ( ( rule__Type__ExcludeAssignment_6_2 )* ) )
            // InternalGraphConfiguration.g:1781:2: ( ( rule__Type__ExcludeAssignment_6_2 ) ) ( ( rule__Type__ExcludeAssignment_6_2 )* )
            {
            // InternalGraphConfiguration.g:1781:2: ( ( rule__Type__ExcludeAssignment_6_2 ) )
            // InternalGraphConfiguration.g:1782:3: ( rule__Type__ExcludeAssignment_6_2 )
            {
             before(grammarAccess.getTypeAccess().getExcludeAssignment_6_2()); 
            // InternalGraphConfiguration.g:1783:3: ( rule__Type__ExcludeAssignment_6_2 )
            // InternalGraphConfiguration.g:1783:4: rule__Type__ExcludeAssignment_6_2
            {
            pushFollow(FOLLOW_15);
            rule__Type__ExcludeAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getExcludeAssignment_6_2()); 

            }

            // InternalGraphConfiguration.g:1786:2: ( ( rule__Type__ExcludeAssignment_6_2 )* )
            // InternalGraphConfiguration.g:1787:3: ( rule__Type__ExcludeAssignment_6_2 )*
            {
             before(grammarAccess.getTypeAccess().getExcludeAssignment_6_2()); 
            // InternalGraphConfiguration.g:1788:3: ( rule__Type__ExcludeAssignment_6_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGraphConfiguration.g:1788:4: rule__Type__ExcludeAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Type__ExcludeAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getTypeAccess().getExcludeAssignment_6_2()); 

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
    // $ANTLR end "rule__Type__Group_6__2__Impl"


    // $ANTLR start "rule__Type__Group_6__3"
    // InternalGraphConfiguration.g:1797:1: rule__Type__Group_6__3 : rule__Type__Group_6__3__Impl ;
    public final void rule__Type__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1801:1: ( rule__Type__Group_6__3__Impl )
            // InternalGraphConfiguration.g:1802:2: rule__Type__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_6__3"


    // $ANTLR start "rule__Type__Group_6__3__Impl"
    // InternalGraphConfiguration.g:1808:1: rule__Type__Group_6__3__Impl : ( '}' ) ;
    public final void rule__Type__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1812:1: ( ( '}' ) )
            // InternalGraphConfiguration.g:1813:1: ( '}' )
            {
            // InternalGraphConfiguration.g:1813:1: ( '}' )
            // InternalGraphConfiguration.g:1814:2: '}'
            {
             before(grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_6_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_6__3__Impl"


    // $ANTLR start "rule__Edge__Group__0"
    // InternalGraphConfiguration.g:1824:1: rule__Edge__Group__0 : rule__Edge__Group__0__Impl rule__Edge__Group__1 ;
    public final void rule__Edge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1828:1: ( rule__Edge__Group__0__Impl rule__Edge__Group__1 )
            // InternalGraphConfiguration.g:1829:2: rule__Edge__Group__0__Impl rule__Edge__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Edge__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__0"


    // $ANTLR start "rule__Edge__Group__0__Impl"
    // InternalGraphConfiguration.g:1836:1: rule__Edge__Group__0__Impl : ( 'reference' ) ;
    public final void rule__Edge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1840:1: ( ( 'reference' ) )
            // InternalGraphConfiguration.g:1841:1: ( 'reference' )
            {
            // InternalGraphConfiguration.g:1841:1: ( 'reference' )
            // InternalGraphConfiguration.g:1842:2: 'reference'
            {
             before(grammarAccess.getEdgeAccess().getReferenceKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEdgeAccess().getReferenceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__0__Impl"


    // $ANTLR start "rule__Edge__Group__1"
    // InternalGraphConfiguration.g:1851:1: rule__Edge__Group__1 : rule__Edge__Group__1__Impl rule__Edge__Group__2 ;
    public final void rule__Edge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1855:1: ( rule__Edge__Group__1__Impl rule__Edge__Group__2 )
            // InternalGraphConfiguration.g:1856:2: rule__Edge__Group__1__Impl rule__Edge__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Edge__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__1"


    // $ANTLR start "rule__Edge__Group__1__Impl"
    // InternalGraphConfiguration.g:1863:1: rule__Edge__Group__1__Impl : ( ( rule__Edge__ReferenceAssignment_1 ) ) ;
    public final void rule__Edge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1867:1: ( ( ( rule__Edge__ReferenceAssignment_1 ) ) )
            // InternalGraphConfiguration.g:1868:1: ( ( rule__Edge__ReferenceAssignment_1 ) )
            {
            // InternalGraphConfiguration.g:1868:1: ( ( rule__Edge__ReferenceAssignment_1 ) )
            // InternalGraphConfiguration.g:1869:2: ( rule__Edge__ReferenceAssignment_1 )
            {
             before(grammarAccess.getEdgeAccess().getReferenceAssignment_1()); 
            // InternalGraphConfiguration.g:1870:2: ( rule__Edge__ReferenceAssignment_1 )
            // InternalGraphConfiguration.g:1870:3: rule__Edge__ReferenceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Edge__ReferenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getReferenceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__1__Impl"


    // $ANTLR start "rule__Edge__Group__2"
    // InternalGraphConfiguration.g:1878:1: rule__Edge__Group__2 : rule__Edge__Group__2__Impl rule__Edge__Group__3 ;
    public final void rule__Edge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1882:1: ( rule__Edge__Group__2__Impl rule__Edge__Group__3 )
            // InternalGraphConfiguration.g:1883:2: rule__Edge__Group__2__Impl rule__Edge__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Edge__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__2"


    // $ANTLR start "rule__Edge__Group__2__Impl"
    // InternalGraphConfiguration.g:1890:1: rule__Edge__Group__2__Impl : ( ( rule__Edge__Group_2__0 )? ) ;
    public final void rule__Edge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1894:1: ( ( ( rule__Edge__Group_2__0 )? ) )
            // InternalGraphConfiguration.g:1895:1: ( ( rule__Edge__Group_2__0 )? )
            {
            // InternalGraphConfiguration.g:1895:1: ( ( rule__Edge__Group_2__0 )? )
            // InternalGraphConfiguration.g:1896:2: ( rule__Edge__Group_2__0 )?
            {
             before(grammarAccess.getEdgeAccess().getGroup_2()); 
            // InternalGraphConfiguration.g:1897:2: ( rule__Edge__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGraphConfiguration.g:1897:3: rule__Edge__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Edge__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEdgeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__2__Impl"


    // $ANTLR start "rule__Edge__Group__3"
    // InternalGraphConfiguration.g:1905:1: rule__Edge__Group__3 : rule__Edge__Group__3__Impl rule__Edge__Group__4 ;
    public final void rule__Edge__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1909:1: ( rule__Edge__Group__3__Impl rule__Edge__Group__4 )
            // InternalGraphConfiguration.g:1910:2: rule__Edge__Group__3__Impl rule__Edge__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Edge__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__3"


    // $ANTLR start "rule__Edge__Group__3__Impl"
    // InternalGraphConfiguration.g:1917:1: rule__Edge__Group__3__Impl : ( ( rule__Edge__DirectionAssignment_3 ) ) ;
    public final void rule__Edge__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1921:1: ( ( ( rule__Edge__DirectionAssignment_3 ) ) )
            // InternalGraphConfiguration.g:1922:1: ( ( rule__Edge__DirectionAssignment_3 ) )
            {
            // InternalGraphConfiguration.g:1922:1: ( ( rule__Edge__DirectionAssignment_3 ) )
            // InternalGraphConfiguration.g:1923:2: ( rule__Edge__DirectionAssignment_3 )
            {
             before(grammarAccess.getEdgeAccess().getDirectionAssignment_3()); 
            // InternalGraphConfiguration.g:1924:2: ( rule__Edge__DirectionAssignment_3 )
            // InternalGraphConfiguration.g:1924:3: rule__Edge__DirectionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Edge__DirectionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getDirectionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__3__Impl"


    // $ANTLR start "rule__Edge__Group__4"
    // InternalGraphConfiguration.g:1932:1: rule__Edge__Group__4 : rule__Edge__Group__4__Impl ;
    public final void rule__Edge__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1936:1: ( rule__Edge__Group__4__Impl )
            // InternalGraphConfiguration.g:1937:2: rule__Edge__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Edge__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__4"


    // $ANTLR start "rule__Edge__Group__4__Impl"
    // InternalGraphConfiguration.g:1943:1: rule__Edge__Group__4__Impl : ( ( rule__Edge__WeightAssignment_4 ) ) ;
    public final void rule__Edge__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1947:1: ( ( ( rule__Edge__WeightAssignment_4 ) ) )
            // InternalGraphConfiguration.g:1948:1: ( ( rule__Edge__WeightAssignment_4 ) )
            {
            // InternalGraphConfiguration.g:1948:1: ( ( rule__Edge__WeightAssignment_4 ) )
            // InternalGraphConfiguration.g:1949:2: ( rule__Edge__WeightAssignment_4 )
            {
             before(grammarAccess.getEdgeAccess().getWeightAssignment_4()); 
            // InternalGraphConfiguration.g:1950:2: ( rule__Edge__WeightAssignment_4 )
            // InternalGraphConfiguration.g:1950:3: rule__Edge__WeightAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Edge__WeightAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getWeightAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__4__Impl"


    // $ANTLR start "rule__Edge__Group_2__0"
    // InternalGraphConfiguration.g:1959:1: rule__Edge__Group_2__0 : rule__Edge__Group_2__0__Impl rule__Edge__Group_2__1 ;
    public final void rule__Edge__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1963:1: ( rule__Edge__Group_2__0__Impl rule__Edge__Group_2__1 )
            // InternalGraphConfiguration.g:1964:2: rule__Edge__Group_2__0__Impl rule__Edge__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Edge__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group_2__0"


    // $ANTLR start "rule__Edge__Group_2__0__Impl"
    // InternalGraphConfiguration.g:1971:1: rule__Edge__Group_2__0__Impl : ( '--' ) ;
    public final void rule__Edge__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1975:1: ( ( '--' ) )
            // InternalGraphConfiguration.g:1976:1: ( '--' )
            {
            // InternalGraphConfiguration.g:1976:1: ( '--' )
            // InternalGraphConfiguration.g:1977:2: '--'
            {
             before(grammarAccess.getEdgeAccess().getHyphenMinusHyphenMinusKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEdgeAccess().getHyphenMinusHyphenMinusKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group_2__0__Impl"


    // $ANTLR start "rule__Edge__Group_2__1"
    // InternalGraphConfiguration.g:1986:1: rule__Edge__Group_2__1 : rule__Edge__Group_2__1__Impl rule__Edge__Group_2__2 ;
    public final void rule__Edge__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1990:1: ( rule__Edge__Group_2__1__Impl rule__Edge__Group_2__2 )
            // InternalGraphConfiguration.g:1991:2: rule__Edge__Group_2__1__Impl rule__Edge__Group_2__2
            {
            pushFollow(FOLLOW_20);
            rule__Edge__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group_2__1"


    // $ANTLR start "rule__Edge__Group_2__1__Impl"
    // InternalGraphConfiguration.g:1998:1: rule__Edge__Group_2__1__Impl : ( ( rule__Edge__TypeAssignment_2_1 ) ) ;
    public final void rule__Edge__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2002:1: ( ( ( rule__Edge__TypeAssignment_2_1 ) ) )
            // InternalGraphConfiguration.g:2003:1: ( ( rule__Edge__TypeAssignment_2_1 ) )
            {
            // InternalGraphConfiguration.g:2003:1: ( ( rule__Edge__TypeAssignment_2_1 ) )
            // InternalGraphConfiguration.g:2004:2: ( rule__Edge__TypeAssignment_2_1 )
            {
             before(grammarAccess.getEdgeAccess().getTypeAssignment_2_1()); 
            // InternalGraphConfiguration.g:2005:2: ( rule__Edge__TypeAssignment_2_1 )
            // InternalGraphConfiguration.g:2005:3: rule__Edge__TypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Edge__TypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group_2__1__Impl"


    // $ANTLR start "rule__Edge__Group_2__2"
    // InternalGraphConfiguration.g:2013:1: rule__Edge__Group_2__2 : rule__Edge__Group_2__2__Impl ;
    public final void rule__Edge__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2017:1: ( rule__Edge__Group_2__2__Impl )
            // InternalGraphConfiguration.g:2018:2: rule__Edge__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Edge__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group_2__2"


    // $ANTLR start "rule__Edge__Group_2__2__Impl"
    // InternalGraphConfiguration.g:2024:1: rule__Edge__Group_2__2__Impl : ( ( rule__Edge__Group_2_2__0 )? ) ;
    public final void rule__Edge__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2028:1: ( ( ( rule__Edge__Group_2_2__0 )? ) )
            // InternalGraphConfiguration.g:2029:1: ( ( rule__Edge__Group_2_2__0 )? )
            {
            // InternalGraphConfiguration.g:2029:1: ( ( rule__Edge__Group_2_2__0 )? )
            // InternalGraphConfiguration.g:2030:2: ( rule__Edge__Group_2_2__0 )?
            {
             before(grammarAccess.getEdgeAccess().getGroup_2_2()); 
            // InternalGraphConfiguration.g:2031:2: ( rule__Edge__Group_2_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGraphConfiguration.g:2031:3: rule__Edge__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Edge__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEdgeAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group_2__2__Impl"


    // $ANTLR start "rule__Edge__Group_2_2__0"
    // InternalGraphConfiguration.g:2040:1: rule__Edge__Group_2_2__0 : rule__Edge__Group_2_2__0__Impl rule__Edge__Group_2_2__1 ;
    public final void rule__Edge__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2044:1: ( rule__Edge__Group_2_2__0__Impl rule__Edge__Group_2_2__1 )
            // InternalGraphConfiguration.g:2045:2: rule__Edge__Group_2_2__0__Impl rule__Edge__Group_2_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Edge__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group_2_2__0"


    // $ANTLR start "rule__Edge__Group_2_2__0__Impl"
    // InternalGraphConfiguration.g:2052:1: rule__Edge__Group_2_2__0__Impl : ( '--' ) ;
    public final void rule__Edge__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2056:1: ( ( '--' ) )
            // InternalGraphConfiguration.g:2057:1: ( '--' )
            {
            // InternalGraphConfiguration.g:2057:1: ( '--' )
            // InternalGraphConfiguration.g:2058:2: '--'
            {
             before(grammarAccess.getEdgeAccess().getHyphenMinusHyphenMinusKeyword_2_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEdgeAccess().getHyphenMinusHyphenMinusKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group_2_2__0__Impl"


    // $ANTLR start "rule__Edge__Group_2_2__1"
    // InternalGraphConfiguration.g:2067:1: rule__Edge__Group_2_2__1 : rule__Edge__Group_2_2__1__Impl ;
    public final void rule__Edge__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2071:1: ( rule__Edge__Group_2_2__1__Impl )
            // InternalGraphConfiguration.g:2072:2: rule__Edge__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Edge__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group_2_2__1"


    // $ANTLR start "rule__Edge__Group_2_2__1__Impl"
    // InternalGraphConfiguration.g:2078:1: rule__Edge__Group_2_2__1__Impl : ( ( rule__Edge__TargetAssignment_2_2_1 ) ) ;
    public final void rule__Edge__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2082:1: ( ( ( rule__Edge__TargetAssignment_2_2_1 ) ) )
            // InternalGraphConfiguration.g:2083:1: ( ( rule__Edge__TargetAssignment_2_2_1 ) )
            {
            // InternalGraphConfiguration.g:2083:1: ( ( rule__Edge__TargetAssignment_2_2_1 ) )
            // InternalGraphConfiguration.g:2084:2: ( rule__Edge__TargetAssignment_2_2_1 )
            {
             before(grammarAccess.getEdgeAccess().getTargetAssignment_2_2_1()); 
            // InternalGraphConfiguration.g:2085:2: ( rule__Edge__TargetAssignment_2_2_1 )
            // InternalGraphConfiguration.g:2085:3: rule__Edge__TargetAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Edge__TargetAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getTargetAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group_2_2__1__Impl"


    // $ANTLR start "rule__AttributeWeight__Group__0"
    // InternalGraphConfiguration.g:2094:1: rule__AttributeWeight__Group__0 : rule__AttributeWeight__Group__0__Impl rule__AttributeWeight__Group__1 ;
    public final void rule__AttributeWeight__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2098:1: ( rule__AttributeWeight__Group__0__Impl rule__AttributeWeight__Group__1 )
            // InternalGraphConfiguration.g:2099:2: rule__AttributeWeight__Group__0__Impl rule__AttributeWeight__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__AttributeWeight__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeWeight__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeWeight__Group__0"


    // $ANTLR start "rule__AttributeWeight__Group__0__Impl"
    // InternalGraphConfiguration.g:2106:1: rule__AttributeWeight__Group__0__Impl : ( ( rule__AttributeWeight__Group_0__0 )? ) ;
    public final void rule__AttributeWeight__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2110:1: ( ( ( rule__AttributeWeight__Group_0__0 )? ) )
            // InternalGraphConfiguration.g:2111:1: ( ( rule__AttributeWeight__Group_0__0 )? )
            {
            // InternalGraphConfiguration.g:2111:1: ( ( rule__AttributeWeight__Group_0__0 )? )
            // InternalGraphConfiguration.g:2112:2: ( rule__AttributeWeight__Group_0__0 )?
            {
             before(grammarAccess.getAttributeWeightAccess().getGroup_0()); 
            // InternalGraphConfiguration.g:2113:2: ( rule__AttributeWeight__Group_0__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=11 && LA22_0<=12)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGraphConfiguration.g:2113:3: rule__AttributeWeight__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeWeight__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeWeightAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeWeight__Group__0__Impl"


    // $ANTLR start "rule__AttributeWeight__Group__1"
    // InternalGraphConfiguration.g:2121:1: rule__AttributeWeight__Group__1 : rule__AttributeWeight__Group__1__Impl ;
    public final void rule__AttributeWeight__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2125:1: ( rule__AttributeWeight__Group__1__Impl )
            // InternalGraphConfiguration.g:2126:2: rule__AttributeWeight__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeWeight__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeWeight__Group__1"


    // $ANTLR start "rule__AttributeWeight__Group__1__Impl"
    // InternalGraphConfiguration.g:2132:1: rule__AttributeWeight__Group__1__Impl : ( ( rule__AttributeWeight__ValueAssignment_1 ) ) ;
    public final void rule__AttributeWeight__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2136:1: ( ( ( rule__AttributeWeight__ValueAssignment_1 ) ) )
            // InternalGraphConfiguration.g:2137:1: ( ( rule__AttributeWeight__ValueAssignment_1 ) )
            {
            // InternalGraphConfiguration.g:2137:1: ( ( rule__AttributeWeight__ValueAssignment_1 ) )
            // InternalGraphConfiguration.g:2138:2: ( rule__AttributeWeight__ValueAssignment_1 )
            {
             before(grammarAccess.getAttributeWeightAccess().getValueAssignment_1()); 
            // InternalGraphConfiguration.g:2139:2: ( rule__AttributeWeight__ValueAssignment_1 )
            // InternalGraphConfiguration.g:2139:3: rule__AttributeWeight__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeWeight__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeWeightAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeWeight__Group__1__Impl"


    // $ANTLR start "rule__AttributeWeight__Group_0__0"
    // InternalGraphConfiguration.g:2148:1: rule__AttributeWeight__Group_0__0 : rule__AttributeWeight__Group_0__0__Impl rule__AttributeWeight__Group_0__1 ;
    public final void rule__AttributeWeight__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2152:1: ( rule__AttributeWeight__Group_0__0__Impl rule__AttributeWeight__Group_0__1 )
            // InternalGraphConfiguration.g:2153:2: rule__AttributeWeight__Group_0__0__Impl rule__AttributeWeight__Group_0__1
            {
            pushFollow(FOLLOW_21);
            rule__AttributeWeight__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeWeight__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeWeight__Group_0__0"


    // $ANTLR start "rule__AttributeWeight__Group_0__0__Impl"
    // InternalGraphConfiguration.g:2160:1: rule__AttributeWeight__Group_0__0__Impl : ( ( rule__AttributeWeight__OwnerAssignment_0_0 ) ) ;
    public final void rule__AttributeWeight__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2164:1: ( ( ( rule__AttributeWeight__OwnerAssignment_0_0 ) ) )
            // InternalGraphConfiguration.g:2165:1: ( ( rule__AttributeWeight__OwnerAssignment_0_0 ) )
            {
            // InternalGraphConfiguration.g:2165:1: ( ( rule__AttributeWeight__OwnerAssignment_0_0 ) )
            // InternalGraphConfiguration.g:2166:2: ( rule__AttributeWeight__OwnerAssignment_0_0 )
            {
             before(grammarAccess.getAttributeWeightAccess().getOwnerAssignment_0_0()); 
            // InternalGraphConfiguration.g:2167:2: ( rule__AttributeWeight__OwnerAssignment_0_0 )
            // InternalGraphConfiguration.g:2167:3: rule__AttributeWeight__OwnerAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeWeight__OwnerAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeWeightAccess().getOwnerAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeWeight__Group_0__0__Impl"


    // $ANTLR start "rule__AttributeWeight__Group_0__1"
    // InternalGraphConfiguration.g:2175:1: rule__AttributeWeight__Group_0__1 : rule__AttributeWeight__Group_0__1__Impl ;
    public final void rule__AttributeWeight__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2179:1: ( rule__AttributeWeight__Group_0__1__Impl )
            // InternalGraphConfiguration.g:2180:2: rule__AttributeWeight__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeWeight__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeWeight__Group_0__1"


    // $ANTLR start "rule__AttributeWeight__Group_0__1__Impl"
    // InternalGraphConfiguration.g:2186:1: rule__AttributeWeight__Group_0__1__Impl : ( '.' ) ;
    public final void rule__AttributeWeight__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2190:1: ( ( '.' ) )
            // InternalGraphConfiguration.g:2191:1: ( '.' )
            {
            // InternalGraphConfiguration.g:2191:1: ( '.' )
            // InternalGraphConfiguration.g:2192:2: '.'
            {
             before(grammarAccess.getAttributeWeightAccess().getFullStopKeyword_0_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAttributeWeightAccess().getFullStopKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeWeight__Group_0__1__Impl"


    // $ANTLR start "rule__Configuration__DefaultAssignment_0_2"
    // InternalGraphConfiguration.g:2202:1: rule__Configuration__DefaultAssignment_0_2 : ( RULE_INT ) ;
    public final void rule__Configuration__DefaultAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2206:1: ( ( RULE_INT ) )
            // InternalGraphConfiguration.g:2207:2: ( RULE_INT )
            {
            // InternalGraphConfiguration.g:2207:2: ( RULE_INT )
            // InternalGraphConfiguration.g:2208:3: RULE_INT
            {
             before(grammarAccess.getConfigurationAccess().getDefaultINTTerminalRuleCall_0_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getDefaultINTTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__DefaultAssignment_0_2"


    // $ANTLR start "rule__Configuration__ConsiderAssignment_1_2"
    // InternalGraphConfiguration.g:2217:1: rule__Configuration__ConsiderAssignment_1_2 : ( ruleConsider ) ;
    public final void rule__Configuration__ConsiderAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2221:1: ( ( ruleConsider ) )
            // InternalGraphConfiguration.g:2222:2: ( ruleConsider )
            {
            // InternalGraphConfiguration.g:2222:2: ( ruleConsider )
            // InternalGraphConfiguration.g:2223:3: ruleConsider
            {
             before(grammarAccess.getConfigurationAccess().getConsiderConsiderEnumRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConsider();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getConsiderConsiderEnumRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__ConsiderAssignment_1_2"


    // $ANTLR start "rule__Configuration__NamespacesAssignment_2"
    // InternalGraphConfiguration.g:2232:1: rule__Configuration__NamespacesAssignment_2 : ( ruleNamespace ) ;
    public final void rule__Configuration__NamespacesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2236:1: ( ( ruleNamespace ) )
            // InternalGraphConfiguration.g:2237:2: ( ruleNamespace )
            {
            // InternalGraphConfiguration.g:2237:2: ( ruleNamespace )
            // InternalGraphConfiguration.g:2238:3: ruleNamespace
            {
             before(grammarAccess.getConfigurationAccess().getNamespacesNamespaceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getNamespacesNamespaceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__NamespacesAssignment_2"


    // $ANTLR start "rule__Namespace__PackageAssignment_1"
    // InternalGraphConfiguration.g:2247:1: rule__Namespace__PackageAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Namespace__PackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2251:1: ( ( RULE_STRING ) )
            // InternalGraphConfiguration.g:2252:2: ( RULE_STRING )
            {
            // InternalGraphConfiguration.g:2252:2: ( RULE_STRING )
            // InternalGraphConfiguration.g:2253:3: RULE_STRING
            {
             before(grammarAccess.getNamespaceAccess().getPackageSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getPackageSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__PackageAssignment_1"


    // $ANTLR start "rule__Namespace__DefaultAssignment_3_2"
    // InternalGraphConfiguration.g:2262:1: rule__Namespace__DefaultAssignment_3_2 : ( RULE_INT ) ;
    public final void rule__Namespace__DefaultAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2266:1: ( ( RULE_INT ) )
            // InternalGraphConfiguration.g:2267:2: ( RULE_INT )
            {
            // InternalGraphConfiguration.g:2267:2: ( RULE_INT )
            // InternalGraphConfiguration.g:2268:3: RULE_INT
            {
             before(grammarAccess.getNamespaceAccess().getDefaultINTTerminalRuleCall_3_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getDefaultINTTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__DefaultAssignment_3_2"


    // $ANTLR start "rule__Namespace__ConsiderAssignment_4_2"
    // InternalGraphConfiguration.g:2277:1: rule__Namespace__ConsiderAssignment_4_2 : ( ruleConsider ) ;
    public final void rule__Namespace__ConsiderAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2281:1: ( ( ruleConsider ) )
            // InternalGraphConfiguration.g:2282:2: ( ruleConsider )
            {
            // InternalGraphConfiguration.g:2282:2: ( ruleConsider )
            // InternalGraphConfiguration.g:2283:3: ruleConsider
            {
             before(grammarAccess.getNamespaceAccess().getConsiderConsiderEnumRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConsider();

            state._fsp--;

             after(grammarAccess.getNamespaceAccess().getConsiderConsiderEnumRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__ConsiderAssignment_4_2"


    // $ANTLR start "rule__Namespace__IncludeAssignment_5_2"
    // InternalGraphConfiguration.g:2292:1: rule__Namespace__IncludeAssignment_5_2 : ( ruleType ) ;
    public final void rule__Namespace__IncludeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2296:1: ( ( ruleType ) )
            // InternalGraphConfiguration.g:2297:2: ( ruleType )
            {
            // InternalGraphConfiguration.g:2297:2: ( ruleType )
            // InternalGraphConfiguration.g:2298:3: ruleType
            {
             before(grammarAccess.getNamespaceAccess().getIncludeTypeParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getNamespaceAccess().getIncludeTypeParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__IncludeAssignment_5_2"


    // $ANTLR start "rule__Namespace__ExcludeAssignment_6_2"
    // InternalGraphConfiguration.g:2307:1: rule__Namespace__ExcludeAssignment_6_2 : ( ( RULE_ID ) ) ;
    public final void rule__Namespace__ExcludeAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2311:1: ( ( ( RULE_ID ) ) )
            // InternalGraphConfiguration.g:2312:2: ( ( RULE_ID ) )
            {
            // InternalGraphConfiguration.g:2312:2: ( ( RULE_ID ) )
            // InternalGraphConfiguration.g:2313:3: ( RULE_ID )
            {
             before(grammarAccess.getNamespaceAccess().getExcludeEClassCrossReference_6_2_0()); 
            // InternalGraphConfiguration.g:2314:3: ( RULE_ID )
            // InternalGraphConfiguration.g:2315:4: RULE_ID
            {
             before(grammarAccess.getNamespaceAccess().getExcludeEClassIDTerminalRuleCall_6_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getExcludeEClassIDTerminalRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getNamespaceAccess().getExcludeEClassCrossReference_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__ExcludeAssignment_6_2"


    // $ANTLR start "rule__Type__TypeAssignment_1"
    // InternalGraphConfiguration.g:2326:1: rule__Type__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Type__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2330:1: ( ( ( RULE_ID ) ) )
            // InternalGraphConfiguration.g:2331:2: ( ( RULE_ID ) )
            {
            // InternalGraphConfiguration.g:2331:2: ( ( RULE_ID ) )
            // InternalGraphConfiguration.g:2332:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeAccess().getTypeEClassCrossReference_1_0()); 
            // InternalGraphConfiguration.g:2333:3: ( RULE_ID )
            // InternalGraphConfiguration.g:2334:4: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getTypeEClassIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTypeEClassIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTypeAccess().getTypeEClassCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TypeAssignment_1"


    // $ANTLR start "rule__Type__ConsiderAssignment_3_2"
    // InternalGraphConfiguration.g:2345:1: rule__Type__ConsiderAssignment_3_2 : ( ruleConsider ) ;
    public final void rule__Type__ConsiderAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2349:1: ( ( ruleConsider ) )
            // InternalGraphConfiguration.g:2350:2: ( ruleConsider )
            {
            // InternalGraphConfiguration.g:2350:2: ( ruleConsider )
            // InternalGraphConfiguration.g:2351:3: ruleConsider
            {
             before(grammarAccess.getTypeAccess().getConsiderConsiderEnumRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConsider();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getConsiderConsiderEnumRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__ConsiderAssignment_3_2"


    // $ANTLR start "rule__Type__DefaultAssignment_4_2"
    // InternalGraphConfiguration.g:2360:1: rule__Type__DefaultAssignment_4_2 : ( RULE_INT ) ;
    public final void rule__Type__DefaultAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2364:1: ( ( RULE_INT ) )
            // InternalGraphConfiguration.g:2365:2: ( RULE_INT )
            {
            // InternalGraphConfiguration.g:2365:2: ( RULE_INT )
            // InternalGraphConfiguration.g:2366:3: RULE_INT
            {
             before(grammarAccess.getTypeAccess().getDefaultINTTerminalRuleCall_4_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getDefaultINTTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__DefaultAssignment_4_2"


    // $ANTLR start "rule__Type__InlcudeAssignment_5_2"
    // InternalGraphConfiguration.g:2375:1: rule__Type__InlcudeAssignment_5_2 : ( ruleEdge ) ;
    public final void rule__Type__InlcudeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2379:1: ( ( ruleEdge ) )
            // InternalGraphConfiguration.g:2380:2: ( ruleEdge )
            {
            // InternalGraphConfiguration.g:2380:2: ( ruleEdge )
            // InternalGraphConfiguration.g:2381:3: ruleEdge
            {
             before(grammarAccess.getTypeAccess().getInlcudeEdgeParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEdge();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getInlcudeEdgeParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__InlcudeAssignment_5_2"


    // $ANTLR start "rule__Type__ExcludeAssignment_6_2"
    // InternalGraphConfiguration.g:2390:1: rule__Type__ExcludeAssignment_6_2 : ( ( RULE_ID ) ) ;
    public final void rule__Type__ExcludeAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2394:1: ( ( ( RULE_ID ) ) )
            // InternalGraphConfiguration.g:2395:2: ( ( RULE_ID ) )
            {
            // InternalGraphConfiguration.g:2395:2: ( ( RULE_ID ) )
            // InternalGraphConfiguration.g:2396:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeAccess().getExcludeEReferenceCrossReference_6_2_0()); 
            // InternalGraphConfiguration.g:2397:3: ( RULE_ID )
            // InternalGraphConfiguration.g:2398:4: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getExcludeEReferenceIDTerminalRuleCall_6_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getExcludeEReferenceIDTerminalRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getTypeAccess().getExcludeEReferenceCrossReference_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__ExcludeAssignment_6_2"


    // $ANTLR start "rule__Edge__ReferenceAssignment_1"
    // InternalGraphConfiguration.g:2409:1: rule__Edge__ReferenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Edge__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2413:1: ( ( ( RULE_ID ) ) )
            // InternalGraphConfiguration.g:2414:2: ( ( RULE_ID ) )
            {
            // InternalGraphConfiguration.g:2414:2: ( ( RULE_ID ) )
            // InternalGraphConfiguration.g:2415:3: ( RULE_ID )
            {
             before(grammarAccess.getEdgeAccess().getReferenceEReferenceCrossReference_1_0()); 
            // InternalGraphConfiguration.g:2416:3: ( RULE_ID )
            // InternalGraphConfiguration.g:2417:4: RULE_ID
            {
             before(grammarAccess.getEdgeAccess().getReferenceEReferenceIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEdgeAccess().getReferenceEReferenceIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEdgeAccess().getReferenceEReferenceCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__ReferenceAssignment_1"


    // $ANTLR start "rule__Edge__TypeAssignment_2_1"
    // InternalGraphConfiguration.g:2428:1: rule__Edge__TypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Edge__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2432:1: ( ( ( RULE_ID ) ) )
            // InternalGraphConfiguration.g:2433:2: ( ( RULE_ID ) )
            {
            // InternalGraphConfiguration.g:2433:2: ( ( RULE_ID ) )
            // InternalGraphConfiguration.g:2434:3: ( RULE_ID )
            {
             before(grammarAccess.getEdgeAccess().getTypeEClassCrossReference_2_1_0()); 
            // InternalGraphConfiguration.g:2435:3: ( RULE_ID )
            // InternalGraphConfiguration.g:2436:4: RULE_ID
            {
             before(grammarAccess.getEdgeAccess().getTypeEClassIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEdgeAccess().getTypeEClassIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEdgeAccess().getTypeEClassCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__TypeAssignment_2_1"


    // $ANTLR start "rule__Edge__TargetAssignment_2_2_1"
    // InternalGraphConfiguration.g:2447:1: rule__Edge__TargetAssignment_2_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Edge__TargetAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2451:1: ( ( ( RULE_ID ) ) )
            // InternalGraphConfiguration.g:2452:2: ( ( RULE_ID ) )
            {
            // InternalGraphConfiguration.g:2452:2: ( ( RULE_ID ) )
            // InternalGraphConfiguration.g:2453:3: ( RULE_ID )
            {
             before(grammarAccess.getEdgeAccess().getTargetEReferenceCrossReference_2_2_1_0()); 
            // InternalGraphConfiguration.g:2454:3: ( RULE_ID )
            // InternalGraphConfiguration.g:2455:4: RULE_ID
            {
             before(grammarAccess.getEdgeAccess().getTargetEReferenceIDTerminalRuleCall_2_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEdgeAccess().getTargetEReferenceIDTerminalRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getEdgeAccess().getTargetEReferenceCrossReference_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__TargetAssignment_2_2_1"


    // $ANTLR start "rule__Edge__DirectionAssignment_3"
    // InternalGraphConfiguration.g:2466:1: rule__Edge__DirectionAssignment_3 : ( ruleDirection ) ;
    public final void rule__Edge__DirectionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2470:1: ( ( ruleDirection ) )
            // InternalGraphConfiguration.g:2471:2: ( ruleDirection )
            {
            // InternalGraphConfiguration.g:2471:2: ( ruleDirection )
            // InternalGraphConfiguration.g:2472:3: ruleDirection
            {
             before(grammarAccess.getEdgeAccess().getDirectionDirectionEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getEdgeAccess().getDirectionDirectionEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__DirectionAssignment_3"


    // $ANTLR start "rule__Edge__WeightAssignment_4"
    // InternalGraphConfiguration.g:2481:1: rule__Edge__WeightAssignment_4 : ( ruleWeight ) ;
    public final void rule__Edge__WeightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2485:1: ( ( ruleWeight ) )
            // InternalGraphConfiguration.g:2486:2: ( ruleWeight )
            {
            // InternalGraphConfiguration.g:2486:2: ( ruleWeight )
            // InternalGraphConfiguration.g:2487:3: ruleWeight
            {
             before(grammarAccess.getEdgeAccess().getWeightWeightParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleWeight();

            state._fsp--;

             after(grammarAccess.getEdgeAccess().getWeightWeightParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__WeightAssignment_4"


    // $ANTLR start "rule__NumberWeight__ValueAssignment"
    // InternalGraphConfiguration.g:2496:1: rule__NumberWeight__ValueAssignment : ( RULE_INT ) ;
    public final void rule__NumberWeight__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2500:1: ( ( RULE_INT ) )
            // InternalGraphConfiguration.g:2501:2: ( RULE_INT )
            {
            // InternalGraphConfiguration.g:2501:2: ( RULE_INT )
            // InternalGraphConfiguration.g:2502:3: RULE_INT
            {
             before(grammarAccess.getNumberWeightAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberWeightAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberWeight__ValueAssignment"


    // $ANTLR start "rule__AttributeWeight__OwnerAssignment_0_0"
    // InternalGraphConfiguration.g:2511:1: rule__AttributeWeight__OwnerAssignment_0_0 : ( ruleOwner ) ;
    public final void rule__AttributeWeight__OwnerAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2515:1: ( ( ruleOwner ) )
            // InternalGraphConfiguration.g:2516:2: ( ruleOwner )
            {
            // InternalGraphConfiguration.g:2516:2: ( ruleOwner )
            // InternalGraphConfiguration.g:2517:3: ruleOwner
            {
             before(grammarAccess.getAttributeWeightAccess().getOwnerOwnerEnumRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOwner();

            state._fsp--;

             after(grammarAccess.getAttributeWeightAccess().getOwnerOwnerEnumRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeWeight__OwnerAssignment_0_0"


    // $ANTLR start "rule__AttributeWeight__ValueAssignment_1"
    // InternalGraphConfiguration.g:2526:1: rule__AttributeWeight__ValueAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeWeight__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2530:1: ( ( ( RULE_ID ) ) )
            // InternalGraphConfiguration.g:2531:2: ( ( RULE_ID ) )
            {
            // InternalGraphConfiguration.g:2531:2: ( ( RULE_ID ) )
            // InternalGraphConfiguration.g:2532:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeWeightAccess().getValueEAttributeCrossReference_1_0()); 
            // InternalGraphConfiguration.g:2533:3: ( RULE_ID )
            // InternalGraphConfiguration.g:2534:4: RULE_ID
            {
             before(grammarAccess.getAttributeWeightAccess().getValueEAttributeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeWeightAccess().getValueEAttributeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAttributeWeightAccess().getValueEAttributeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeWeight__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000003940000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010038000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001850L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});

}