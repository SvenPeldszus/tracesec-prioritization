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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ALL'", "'NONE'", "'->'", "'<-'", "'<->'", "'default'", "'='", "'consider'", "'namespace'", "'{'", "'}'", "'include'", "'exclude'", "'type'", "'reference'", "'--'"
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
    public static final int RULE_INT=4;
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
    // InternalGraphConfiguration.g:212:1: ruleAttributeWeight : ( ( rule__AttributeWeight__ValueAssignment ) ) ;
    public final void ruleAttributeWeight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:216:2: ( ( ( rule__AttributeWeight__ValueAssignment ) ) )
            // InternalGraphConfiguration.g:217:2: ( ( rule__AttributeWeight__ValueAssignment ) )
            {
            // InternalGraphConfiguration.g:217:2: ( ( rule__AttributeWeight__ValueAssignment ) )
            // InternalGraphConfiguration.g:218:3: ( rule__AttributeWeight__ValueAssignment )
            {
             before(grammarAccess.getAttributeWeightAccess().getValueAssignment()); 
            // InternalGraphConfiguration.g:219:3: ( rule__AttributeWeight__ValueAssignment )
            // InternalGraphConfiguration.g:219:4: rule__AttributeWeight__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__AttributeWeight__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAttributeWeightAccess().getValueAssignment()); 

            }


            }

        }
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


    // $ANTLR start "ruleConsider"
    // InternalGraphConfiguration.g:228:1: ruleConsider : ( ( rule__Consider__Alternatives ) ) ;
    public final void ruleConsider() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:232:1: ( ( ( rule__Consider__Alternatives ) ) )
            // InternalGraphConfiguration.g:233:2: ( ( rule__Consider__Alternatives ) )
            {
            // InternalGraphConfiguration.g:233:2: ( ( rule__Consider__Alternatives ) )
            // InternalGraphConfiguration.g:234:3: ( rule__Consider__Alternatives )
            {
             before(grammarAccess.getConsiderAccess().getAlternatives()); 
            // InternalGraphConfiguration.g:235:3: ( rule__Consider__Alternatives )
            // InternalGraphConfiguration.g:235:4: rule__Consider__Alternatives
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
    // InternalGraphConfiguration.g:244:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:248:1: ( ( ( rule__Direction__Alternatives ) ) )
            // InternalGraphConfiguration.g:249:2: ( ( rule__Direction__Alternatives ) )
            {
            // InternalGraphConfiguration.g:249:2: ( ( rule__Direction__Alternatives ) )
            // InternalGraphConfiguration.g:250:3: ( rule__Direction__Alternatives )
            {
             before(grammarAccess.getDirectionAccess().getAlternatives()); 
            // InternalGraphConfiguration.g:251:3: ( rule__Direction__Alternatives )
            // InternalGraphConfiguration.g:251:4: rule__Direction__Alternatives
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
    // InternalGraphConfiguration.g:259:1: rule__Weight__Alternatives : ( ( ruleNumberWeight ) | ( ruleAttributeWeight ) );
    public final void rule__Weight__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:263:1: ( ( ruleNumberWeight ) | ( ruleAttributeWeight ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT) ) {
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
                    // InternalGraphConfiguration.g:264:2: ( ruleNumberWeight )
                    {
                    // InternalGraphConfiguration.g:264:2: ( ruleNumberWeight )
                    // InternalGraphConfiguration.g:265:3: ruleNumberWeight
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
                    // InternalGraphConfiguration.g:270:2: ( ruleAttributeWeight )
                    {
                    // InternalGraphConfiguration.g:270:2: ( ruleAttributeWeight )
                    // InternalGraphConfiguration.g:271:3: ruleAttributeWeight
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


    // $ANTLR start "rule__Consider__Alternatives"
    // InternalGraphConfiguration.g:280:1: rule__Consider__Alternatives : ( ( ( 'ALL' ) ) | ( ( 'NONE' ) ) );
    public final void rule__Consider__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:284:1: ( ( ( 'ALL' ) ) | ( ( 'NONE' ) ) )
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
                    // InternalGraphConfiguration.g:285:2: ( ( 'ALL' ) )
                    {
                    // InternalGraphConfiguration.g:285:2: ( ( 'ALL' ) )
                    // InternalGraphConfiguration.g:286:3: ( 'ALL' )
                    {
                     before(grammarAccess.getConsiderAccess().getALLEnumLiteralDeclaration_0()); 
                    // InternalGraphConfiguration.g:287:3: ( 'ALL' )
                    // InternalGraphConfiguration.g:287:4: 'ALL'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getConsiderAccess().getALLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphConfiguration.g:291:2: ( ( 'NONE' ) )
                    {
                    // InternalGraphConfiguration.g:291:2: ( ( 'NONE' ) )
                    // InternalGraphConfiguration.g:292:3: ( 'NONE' )
                    {
                     before(grammarAccess.getConsiderAccess().getNONEEnumLiteralDeclaration_1()); 
                    // InternalGraphConfiguration.g:293:3: ( 'NONE' )
                    // InternalGraphConfiguration.g:293:4: 'NONE'
                    {
                    match(input,12,FOLLOW_2); 

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
    // InternalGraphConfiguration.g:301:1: rule__Direction__Alternatives : ( ( ( '->' ) ) | ( ( '<-' ) ) | ( ( '<->' ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:305:1: ( ( ( '->' ) ) | ( ( '<-' ) ) | ( ( '<->' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGraphConfiguration.g:306:2: ( ( '->' ) )
                    {
                    // InternalGraphConfiguration.g:306:2: ( ( '->' ) )
                    // InternalGraphConfiguration.g:307:3: ( '->' )
                    {
                     before(grammarAccess.getDirectionAccess().getFWDEnumLiteralDeclaration_0()); 
                    // InternalGraphConfiguration.g:308:3: ( '->' )
                    // InternalGraphConfiguration.g:308:4: '->'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getFWDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphConfiguration.g:312:2: ( ( '<-' ) )
                    {
                    // InternalGraphConfiguration.g:312:2: ( ( '<-' ) )
                    // InternalGraphConfiguration.g:313:3: ( '<-' )
                    {
                     before(grammarAccess.getDirectionAccess().getBWDEnumLiteralDeclaration_1()); 
                    // InternalGraphConfiguration.g:314:3: ( '<-' )
                    // InternalGraphConfiguration.g:314:4: '<-'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getBWDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphConfiguration.g:318:2: ( ( '<->' ) )
                    {
                    // InternalGraphConfiguration.g:318:2: ( ( '<->' ) )
                    // InternalGraphConfiguration.g:319:3: ( '<->' )
                    {
                     before(grammarAccess.getDirectionAccess().getBIEnumLiteralDeclaration_2()); 
                    // InternalGraphConfiguration.g:320:3: ( '<->' )
                    // InternalGraphConfiguration.g:320:4: '<->'
                    {
                    match(input,15,FOLLOW_2); 

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
    // InternalGraphConfiguration.g:328:1: rule__Configuration__Group__0 : rule__Configuration__Group__0__Impl rule__Configuration__Group__1 ;
    public final void rule__Configuration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:332:1: ( rule__Configuration__Group__0__Impl rule__Configuration__Group__1 )
            // InternalGraphConfiguration.g:333:2: rule__Configuration__Group__0__Impl rule__Configuration__Group__1
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
    // InternalGraphConfiguration.g:340:1: rule__Configuration__Group__0__Impl : ( ( rule__Configuration__Group_0__0 )? ) ;
    public final void rule__Configuration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:344:1: ( ( ( rule__Configuration__Group_0__0 )? ) )
            // InternalGraphConfiguration.g:345:1: ( ( rule__Configuration__Group_0__0 )? )
            {
            // InternalGraphConfiguration.g:345:1: ( ( rule__Configuration__Group_0__0 )? )
            // InternalGraphConfiguration.g:346:2: ( rule__Configuration__Group_0__0 )?
            {
             before(grammarAccess.getConfigurationAccess().getGroup_0()); 
            // InternalGraphConfiguration.g:347:2: ( rule__Configuration__Group_0__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGraphConfiguration.g:347:3: rule__Configuration__Group_0__0
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
    // InternalGraphConfiguration.g:355:1: rule__Configuration__Group__1 : rule__Configuration__Group__1__Impl rule__Configuration__Group__2 ;
    public final void rule__Configuration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:359:1: ( rule__Configuration__Group__1__Impl rule__Configuration__Group__2 )
            // InternalGraphConfiguration.g:360:2: rule__Configuration__Group__1__Impl rule__Configuration__Group__2
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
    // InternalGraphConfiguration.g:367:1: rule__Configuration__Group__1__Impl : ( ( rule__Configuration__Group_1__0 )? ) ;
    public final void rule__Configuration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:371:1: ( ( ( rule__Configuration__Group_1__0 )? ) )
            // InternalGraphConfiguration.g:372:1: ( ( rule__Configuration__Group_1__0 )? )
            {
            // InternalGraphConfiguration.g:372:1: ( ( rule__Configuration__Group_1__0 )? )
            // InternalGraphConfiguration.g:373:2: ( rule__Configuration__Group_1__0 )?
            {
             before(grammarAccess.getConfigurationAccess().getGroup_1()); 
            // InternalGraphConfiguration.g:374:2: ( rule__Configuration__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGraphConfiguration.g:374:3: rule__Configuration__Group_1__0
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
    // InternalGraphConfiguration.g:382:1: rule__Configuration__Group__2 : rule__Configuration__Group__2__Impl ;
    public final void rule__Configuration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:386:1: ( rule__Configuration__Group__2__Impl )
            // InternalGraphConfiguration.g:387:2: rule__Configuration__Group__2__Impl
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
    // InternalGraphConfiguration.g:393:1: rule__Configuration__Group__2__Impl : ( ( ( rule__Configuration__NamespacesAssignment_2 ) ) ( ( rule__Configuration__NamespacesAssignment_2 )* ) ) ;
    public final void rule__Configuration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:397:1: ( ( ( ( rule__Configuration__NamespacesAssignment_2 ) ) ( ( rule__Configuration__NamespacesAssignment_2 )* ) ) )
            // InternalGraphConfiguration.g:398:1: ( ( ( rule__Configuration__NamespacesAssignment_2 ) ) ( ( rule__Configuration__NamespacesAssignment_2 )* ) )
            {
            // InternalGraphConfiguration.g:398:1: ( ( ( rule__Configuration__NamespacesAssignment_2 ) ) ( ( rule__Configuration__NamespacesAssignment_2 )* ) )
            // InternalGraphConfiguration.g:399:2: ( ( rule__Configuration__NamespacesAssignment_2 ) ) ( ( rule__Configuration__NamespacesAssignment_2 )* )
            {
            // InternalGraphConfiguration.g:399:2: ( ( rule__Configuration__NamespacesAssignment_2 ) )
            // InternalGraphConfiguration.g:400:3: ( rule__Configuration__NamespacesAssignment_2 )
            {
             before(grammarAccess.getConfigurationAccess().getNamespacesAssignment_2()); 
            // InternalGraphConfiguration.g:401:3: ( rule__Configuration__NamespacesAssignment_2 )
            // InternalGraphConfiguration.g:401:4: rule__Configuration__NamespacesAssignment_2
            {
            pushFollow(FOLLOW_4);
            rule__Configuration__NamespacesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getNamespacesAssignment_2()); 

            }

            // InternalGraphConfiguration.g:404:2: ( ( rule__Configuration__NamespacesAssignment_2 )* )
            // InternalGraphConfiguration.g:405:3: ( rule__Configuration__NamespacesAssignment_2 )*
            {
             before(grammarAccess.getConfigurationAccess().getNamespacesAssignment_2()); 
            // InternalGraphConfiguration.g:406:3: ( rule__Configuration__NamespacesAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGraphConfiguration.g:406:4: rule__Configuration__NamespacesAssignment_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Configuration__NamespacesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalGraphConfiguration.g:416:1: rule__Configuration__Group_0__0 : rule__Configuration__Group_0__0__Impl rule__Configuration__Group_0__1 ;
    public final void rule__Configuration__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:420:1: ( rule__Configuration__Group_0__0__Impl rule__Configuration__Group_0__1 )
            // InternalGraphConfiguration.g:421:2: rule__Configuration__Group_0__0__Impl rule__Configuration__Group_0__1
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
    // InternalGraphConfiguration.g:428:1: rule__Configuration__Group_0__0__Impl : ( 'default' ) ;
    public final void rule__Configuration__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:432:1: ( ( 'default' ) )
            // InternalGraphConfiguration.g:433:1: ( 'default' )
            {
            // InternalGraphConfiguration.g:433:1: ( 'default' )
            // InternalGraphConfiguration.g:434:2: 'default'
            {
             before(grammarAccess.getConfigurationAccess().getDefaultKeyword_0_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:443:1: rule__Configuration__Group_0__1 : rule__Configuration__Group_0__1__Impl rule__Configuration__Group_0__2 ;
    public final void rule__Configuration__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:447:1: ( rule__Configuration__Group_0__1__Impl rule__Configuration__Group_0__2 )
            // InternalGraphConfiguration.g:448:2: rule__Configuration__Group_0__1__Impl rule__Configuration__Group_0__2
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
    // InternalGraphConfiguration.g:455:1: rule__Configuration__Group_0__1__Impl : ( '=' ) ;
    public final void rule__Configuration__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:459:1: ( ( '=' ) )
            // InternalGraphConfiguration.g:460:1: ( '=' )
            {
            // InternalGraphConfiguration.g:460:1: ( '=' )
            // InternalGraphConfiguration.g:461:2: '='
            {
             before(grammarAccess.getConfigurationAccess().getEqualsSignKeyword_0_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:470:1: rule__Configuration__Group_0__2 : rule__Configuration__Group_0__2__Impl ;
    public final void rule__Configuration__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:474:1: ( rule__Configuration__Group_0__2__Impl )
            // InternalGraphConfiguration.g:475:2: rule__Configuration__Group_0__2__Impl
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
    // InternalGraphConfiguration.g:481:1: rule__Configuration__Group_0__2__Impl : ( ( rule__Configuration__DefaultAssignment_0_2 ) ) ;
    public final void rule__Configuration__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:485:1: ( ( ( rule__Configuration__DefaultAssignment_0_2 ) ) )
            // InternalGraphConfiguration.g:486:1: ( ( rule__Configuration__DefaultAssignment_0_2 ) )
            {
            // InternalGraphConfiguration.g:486:1: ( ( rule__Configuration__DefaultAssignment_0_2 ) )
            // InternalGraphConfiguration.g:487:2: ( rule__Configuration__DefaultAssignment_0_2 )
            {
             before(grammarAccess.getConfigurationAccess().getDefaultAssignment_0_2()); 
            // InternalGraphConfiguration.g:488:2: ( rule__Configuration__DefaultAssignment_0_2 )
            // InternalGraphConfiguration.g:488:3: rule__Configuration__DefaultAssignment_0_2
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
    // InternalGraphConfiguration.g:497:1: rule__Configuration__Group_1__0 : rule__Configuration__Group_1__0__Impl rule__Configuration__Group_1__1 ;
    public final void rule__Configuration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:501:1: ( rule__Configuration__Group_1__0__Impl rule__Configuration__Group_1__1 )
            // InternalGraphConfiguration.g:502:2: rule__Configuration__Group_1__0__Impl rule__Configuration__Group_1__1
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
    // InternalGraphConfiguration.g:509:1: rule__Configuration__Group_1__0__Impl : ( 'consider' ) ;
    public final void rule__Configuration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:513:1: ( ( 'consider' ) )
            // InternalGraphConfiguration.g:514:1: ( 'consider' )
            {
            // InternalGraphConfiguration.g:514:1: ( 'consider' )
            // InternalGraphConfiguration.g:515:2: 'consider'
            {
             before(grammarAccess.getConfigurationAccess().getConsiderKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:524:1: rule__Configuration__Group_1__1 : rule__Configuration__Group_1__1__Impl rule__Configuration__Group_1__2 ;
    public final void rule__Configuration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:528:1: ( rule__Configuration__Group_1__1__Impl rule__Configuration__Group_1__2 )
            // InternalGraphConfiguration.g:529:2: rule__Configuration__Group_1__1__Impl rule__Configuration__Group_1__2
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
    // InternalGraphConfiguration.g:536:1: rule__Configuration__Group_1__1__Impl : ( '=' ) ;
    public final void rule__Configuration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:540:1: ( ( '=' ) )
            // InternalGraphConfiguration.g:541:1: ( '=' )
            {
            // InternalGraphConfiguration.g:541:1: ( '=' )
            // InternalGraphConfiguration.g:542:2: '='
            {
             before(grammarAccess.getConfigurationAccess().getEqualsSignKeyword_1_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:551:1: rule__Configuration__Group_1__2 : rule__Configuration__Group_1__2__Impl ;
    public final void rule__Configuration__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:555:1: ( rule__Configuration__Group_1__2__Impl )
            // InternalGraphConfiguration.g:556:2: rule__Configuration__Group_1__2__Impl
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
    // InternalGraphConfiguration.g:562:1: rule__Configuration__Group_1__2__Impl : ( ( rule__Configuration__ConsiderAssignment_1_2 ) ) ;
    public final void rule__Configuration__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:566:1: ( ( ( rule__Configuration__ConsiderAssignment_1_2 ) ) )
            // InternalGraphConfiguration.g:567:1: ( ( rule__Configuration__ConsiderAssignment_1_2 ) )
            {
            // InternalGraphConfiguration.g:567:1: ( ( rule__Configuration__ConsiderAssignment_1_2 ) )
            // InternalGraphConfiguration.g:568:2: ( rule__Configuration__ConsiderAssignment_1_2 )
            {
             before(grammarAccess.getConfigurationAccess().getConsiderAssignment_1_2()); 
            // InternalGraphConfiguration.g:569:2: ( rule__Configuration__ConsiderAssignment_1_2 )
            // InternalGraphConfiguration.g:569:3: rule__Configuration__ConsiderAssignment_1_2
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
    // InternalGraphConfiguration.g:578:1: rule__Namespace__Group__0 : rule__Namespace__Group__0__Impl rule__Namespace__Group__1 ;
    public final void rule__Namespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:582:1: ( rule__Namespace__Group__0__Impl rule__Namespace__Group__1 )
            // InternalGraphConfiguration.g:583:2: rule__Namespace__Group__0__Impl rule__Namespace__Group__1
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
    // InternalGraphConfiguration.g:590:1: rule__Namespace__Group__0__Impl : ( 'namespace' ) ;
    public final void rule__Namespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:594:1: ( ( 'namespace' ) )
            // InternalGraphConfiguration.g:595:1: ( 'namespace' )
            {
            // InternalGraphConfiguration.g:595:1: ( 'namespace' )
            // InternalGraphConfiguration.g:596:2: 'namespace'
            {
             before(grammarAccess.getNamespaceAccess().getNamespaceKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:605:1: rule__Namespace__Group__1 : rule__Namespace__Group__1__Impl rule__Namespace__Group__2 ;
    public final void rule__Namespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:609:1: ( rule__Namespace__Group__1__Impl rule__Namespace__Group__2 )
            // InternalGraphConfiguration.g:610:2: rule__Namespace__Group__1__Impl rule__Namespace__Group__2
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
    // InternalGraphConfiguration.g:617:1: rule__Namespace__Group__1__Impl : ( ( rule__Namespace__PackageAssignment_1 ) ) ;
    public final void rule__Namespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:621:1: ( ( ( rule__Namespace__PackageAssignment_1 ) ) )
            // InternalGraphConfiguration.g:622:1: ( ( rule__Namespace__PackageAssignment_1 ) )
            {
            // InternalGraphConfiguration.g:622:1: ( ( rule__Namespace__PackageAssignment_1 ) )
            // InternalGraphConfiguration.g:623:2: ( rule__Namespace__PackageAssignment_1 )
            {
             before(grammarAccess.getNamespaceAccess().getPackageAssignment_1()); 
            // InternalGraphConfiguration.g:624:2: ( rule__Namespace__PackageAssignment_1 )
            // InternalGraphConfiguration.g:624:3: rule__Namespace__PackageAssignment_1
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
    // InternalGraphConfiguration.g:632:1: rule__Namespace__Group__2 : rule__Namespace__Group__2__Impl rule__Namespace__Group__3 ;
    public final void rule__Namespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:636:1: ( rule__Namespace__Group__2__Impl rule__Namespace__Group__3 )
            // InternalGraphConfiguration.g:637:2: rule__Namespace__Group__2__Impl rule__Namespace__Group__3
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
    // InternalGraphConfiguration.g:644:1: rule__Namespace__Group__2__Impl : ( '{' ) ;
    public final void rule__Namespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:648:1: ( ( '{' ) )
            // InternalGraphConfiguration.g:649:1: ( '{' )
            {
            // InternalGraphConfiguration.g:649:1: ( '{' )
            // InternalGraphConfiguration.g:650:2: '{'
            {
             before(grammarAccess.getNamespaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:659:1: rule__Namespace__Group__3 : rule__Namespace__Group__3__Impl rule__Namespace__Group__4 ;
    public final void rule__Namespace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:663:1: ( rule__Namespace__Group__3__Impl rule__Namespace__Group__4 )
            // InternalGraphConfiguration.g:664:2: rule__Namespace__Group__3__Impl rule__Namespace__Group__4
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
    // InternalGraphConfiguration.g:671:1: rule__Namespace__Group__3__Impl : ( ( rule__Namespace__Group_3__0 )? ) ;
    public final void rule__Namespace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:675:1: ( ( ( rule__Namespace__Group_3__0 )? ) )
            // InternalGraphConfiguration.g:676:1: ( ( rule__Namespace__Group_3__0 )? )
            {
            // InternalGraphConfiguration.g:676:1: ( ( rule__Namespace__Group_3__0 )? )
            // InternalGraphConfiguration.g:677:2: ( rule__Namespace__Group_3__0 )?
            {
             before(grammarAccess.getNamespaceAccess().getGroup_3()); 
            // InternalGraphConfiguration.g:678:2: ( rule__Namespace__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGraphConfiguration.g:678:3: rule__Namespace__Group_3__0
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
    // InternalGraphConfiguration.g:686:1: rule__Namespace__Group__4 : rule__Namespace__Group__4__Impl rule__Namespace__Group__5 ;
    public final void rule__Namespace__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:690:1: ( rule__Namespace__Group__4__Impl rule__Namespace__Group__5 )
            // InternalGraphConfiguration.g:691:2: rule__Namespace__Group__4__Impl rule__Namespace__Group__5
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
    // InternalGraphConfiguration.g:698:1: rule__Namespace__Group__4__Impl : ( ( rule__Namespace__Group_4__0 )? ) ;
    public final void rule__Namespace__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:702:1: ( ( ( rule__Namespace__Group_4__0 )? ) )
            // InternalGraphConfiguration.g:703:1: ( ( rule__Namespace__Group_4__0 )? )
            {
            // InternalGraphConfiguration.g:703:1: ( ( rule__Namespace__Group_4__0 )? )
            // InternalGraphConfiguration.g:704:2: ( rule__Namespace__Group_4__0 )?
            {
             before(grammarAccess.getNamespaceAccess().getGroup_4()); 
            // InternalGraphConfiguration.g:705:2: ( rule__Namespace__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGraphConfiguration.g:705:3: rule__Namespace__Group_4__0
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
    // InternalGraphConfiguration.g:713:1: rule__Namespace__Group__5 : rule__Namespace__Group__5__Impl rule__Namespace__Group__6 ;
    public final void rule__Namespace__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:717:1: ( rule__Namespace__Group__5__Impl rule__Namespace__Group__6 )
            // InternalGraphConfiguration.g:718:2: rule__Namespace__Group__5__Impl rule__Namespace__Group__6
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
    // InternalGraphConfiguration.g:725:1: rule__Namespace__Group__5__Impl : ( ( rule__Namespace__Group_5__0 )? ) ;
    public final void rule__Namespace__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:729:1: ( ( ( rule__Namespace__Group_5__0 )? ) )
            // InternalGraphConfiguration.g:730:1: ( ( rule__Namespace__Group_5__0 )? )
            {
            // InternalGraphConfiguration.g:730:1: ( ( rule__Namespace__Group_5__0 )? )
            // InternalGraphConfiguration.g:731:2: ( rule__Namespace__Group_5__0 )?
            {
             before(grammarAccess.getNamespaceAccess().getGroup_5()); 
            // InternalGraphConfiguration.g:732:2: ( rule__Namespace__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGraphConfiguration.g:732:3: rule__Namespace__Group_5__0
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
    // InternalGraphConfiguration.g:740:1: rule__Namespace__Group__6 : rule__Namespace__Group__6__Impl rule__Namespace__Group__7 ;
    public final void rule__Namespace__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:744:1: ( rule__Namespace__Group__6__Impl rule__Namespace__Group__7 )
            // InternalGraphConfiguration.g:745:2: rule__Namespace__Group__6__Impl rule__Namespace__Group__7
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
    // InternalGraphConfiguration.g:752:1: rule__Namespace__Group__6__Impl : ( ( rule__Namespace__Group_6__0 )? ) ;
    public final void rule__Namespace__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:756:1: ( ( ( rule__Namespace__Group_6__0 )? ) )
            // InternalGraphConfiguration.g:757:1: ( ( rule__Namespace__Group_6__0 )? )
            {
            // InternalGraphConfiguration.g:757:1: ( ( rule__Namespace__Group_6__0 )? )
            // InternalGraphConfiguration.g:758:2: ( rule__Namespace__Group_6__0 )?
            {
             before(grammarAccess.getNamespaceAccess().getGroup_6()); 
            // InternalGraphConfiguration.g:759:2: ( rule__Namespace__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGraphConfiguration.g:759:3: rule__Namespace__Group_6__0
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
    // InternalGraphConfiguration.g:767:1: rule__Namespace__Group__7 : rule__Namespace__Group__7__Impl ;
    public final void rule__Namespace__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:771:1: ( rule__Namespace__Group__7__Impl )
            // InternalGraphConfiguration.g:772:2: rule__Namespace__Group__7__Impl
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
    // InternalGraphConfiguration.g:778:1: rule__Namespace__Group__7__Impl : ( '}' ) ;
    public final void rule__Namespace__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:782:1: ( ( '}' ) )
            // InternalGraphConfiguration.g:783:1: ( '}' )
            {
            // InternalGraphConfiguration.g:783:1: ( '}' )
            // InternalGraphConfiguration.g:784:2: '}'
            {
             before(grammarAccess.getNamespaceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,21,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:794:1: rule__Namespace__Group_3__0 : rule__Namespace__Group_3__0__Impl rule__Namespace__Group_3__1 ;
    public final void rule__Namespace__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:798:1: ( rule__Namespace__Group_3__0__Impl rule__Namespace__Group_3__1 )
            // InternalGraphConfiguration.g:799:2: rule__Namespace__Group_3__0__Impl rule__Namespace__Group_3__1
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
    // InternalGraphConfiguration.g:806:1: rule__Namespace__Group_3__0__Impl : ( 'default' ) ;
    public final void rule__Namespace__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:810:1: ( ( 'default' ) )
            // InternalGraphConfiguration.g:811:1: ( 'default' )
            {
            // InternalGraphConfiguration.g:811:1: ( 'default' )
            // InternalGraphConfiguration.g:812:2: 'default'
            {
             before(grammarAccess.getNamespaceAccess().getDefaultKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:821:1: rule__Namespace__Group_3__1 : rule__Namespace__Group_3__1__Impl rule__Namespace__Group_3__2 ;
    public final void rule__Namespace__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:825:1: ( rule__Namespace__Group_3__1__Impl rule__Namespace__Group_3__2 )
            // InternalGraphConfiguration.g:826:2: rule__Namespace__Group_3__1__Impl rule__Namespace__Group_3__2
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
    // InternalGraphConfiguration.g:833:1: rule__Namespace__Group_3__1__Impl : ( '=' ) ;
    public final void rule__Namespace__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:837:1: ( ( '=' ) )
            // InternalGraphConfiguration.g:838:1: ( '=' )
            {
            // InternalGraphConfiguration.g:838:1: ( '=' )
            // InternalGraphConfiguration.g:839:2: '='
            {
             before(grammarAccess.getNamespaceAccess().getEqualsSignKeyword_3_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:848:1: rule__Namespace__Group_3__2 : rule__Namespace__Group_3__2__Impl ;
    public final void rule__Namespace__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:852:1: ( rule__Namespace__Group_3__2__Impl )
            // InternalGraphConfiguration.g:853:2: rule__Namespace__Group_3__2__Impl
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
    // InternalGraphConfiguration.g:859:1: rule__Namespace__Group_3__2__Impl : ( ( rule__Namespace__DefaultAssignment_3_2 ) ) ;
    public final void rule__Namespace__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:863:1: ( ( ( rule__Namespace__DefaultAssignment_3_2 ) ) )
            // InternalGraphConfiguration.g:864:1: ( ( rule__Namespace__DefaultAssignment_3_2 ) )
            {
            // InternalGraphConfiguration.g:864:1: ( ( rule__Namespace__DefaultAssignment_3_2 ) )
            // InternalGraphConfiguration.g:865:2: ( rule__Namespace__DefaultAssignment_3_2 )
            {
             before(grammarAccess.getNamespaceAccess().getDefaultAssignment_3_2()); 
            // InternalGraphConfiguration.g:866:2: ( rule__Namespace__DefaultAssignment_3_2 )
            // InternalGraphConfiguration.g:866:3: rule__Namespace__DefaultAssignment_3_2
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
    // InternalGraphConfiguration.g:875:1: rule__Namespace__Group_4__0 : rule__Namespace__Group_4__0__Impl rule__Namespace__Group_4__1 ;
    public final void rule__Namespace__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:879:1: ( rule__Namespace__Group_4__0__Impl rule__Namespace__Group_4__1 )
            // InternalGraphConfiguration.g:880:2: rule__Namespace__Group_4__0__Impl rule__Namespace__Group_4__1
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
    // InternalGraphConfiguration.g:887:1: rule__Namespace__Group_4__0__Impl : ( 'consider' ) ;
    public final void rule__Namespace__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:891:1: ( ( 'consider' ) )
            // InternalGraphConfiguration.g:892:1: ( 'consider' )
            {
            // InternalGraphConfiguration.g:892:1: ( 'consider' )
            // InternalGraphConfiguration.g:893:2: 'consider'
            {
             before(grammarAccess.getNamespaceAccess().getConsiderKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:902:1: rule__Namespace__Group_4__1 : rule__Namespace__Group_4__1__Impl rule__Namespace__Group_4__2 ;
    public final void rule__Namespace__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:906:1: ( rule__Namespace__Group_4__1__Impl rule__Namespace__Group_4__2 )
            // InternalGraphConfiguration.g:907:2: rule__Namespace__Group_4__1__Impl rule__Namespace__Group_4__2
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
    // InternalGraphConfiguration.g:914:1: rule__Namespace__Group_4__1__Impl : ( '=' ) ;
    public final void rule__Namespace__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:918:1: ( ( '=' ) )
            // InternalGraphConfiguration.g:919:1: ( '=' )
            {
            // InternalGraphConfiguration.g:919:1: ( '=' )
            // InternalGraphConfiguration.g:920:2: '='
            {
             before(grammarAccess.getNamespaceAccess().getEqualsSignKeyword_4_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:929:1: rule__Namespace__Group_4__2 : rule__Namespace__Group_4__2__Impl ;
    public final void rule__Namespace__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:933:1: ( rule__Namespace__Group_4__2__Impl )
            // InternalGraphConfiguration.g:934:2: rule__Namespace__Group_4__2__Impl
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
    // InternalGraphConfiguration.g:940:1: rule__Namespace__Group_4__2__Impl : ( ( rule__Namespace__ConsiderAssignment_4_2 ) ) ;
    public final void rule__Namespace__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:944:1: ( ( ( rule__Namespace__ConsiderAssignment_4_2 ) ) )
            // InternalGraphConfiguration.g:945:1: ( ( rule__Namespace__ConsiderAssignment_4_2 ) )
            {
            // InternalGraphConfiguration.g:945:1: ( ( rule__Namespace__ConsiderAssignment_4_2 ) )
            // InternalGraphConfiguration.g:946:2: ( rule__Namespace__ConsiderAssignment_4_2 )
            {
             before(grammarAccess.getNamespaceAccess().getConsiderAssignment_4_2()); 
            // InternalGraphConfiguration.g:947:2: ( rule__Namespace__ConsiderAssignment_4_2 )
            // InternalGraphConfiguration.g:947:3: rule__Namespace__ConsiderAssignment_4_2
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
    // InternalGraphConfiguration.g:956:1: rule__Namespace__Group_5__0 : rule__Namespace__Group_5__0__Impl rule__Namespace__Group_5__1 ;
    public final void rule__Namespace__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:960:1: ( rule__Namespace__Group_5__0__Impl rule__Namespace__Group_5__1 )
            // InternalGraphConfiguration.g:961:2: rule__Namespace__Group_5__0__Impl rule__Namespace__Group_5__1
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
    // InternalGraphConfiguration.g:968:1: rule__Namespace__Group_5__0__Impl : ( 'include' ) ;
    public final void rule__Namespace__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:972:1: ( ( 'include' ) )
            // InternalGraphConfiguration.g:973:1: ( 'include' )
            {
            // InternalGraphConfiguration.g:973:1: ( 'include' )
            // InternalGraphConfiguration.g:974:2: 'include'
            {
             before(grammarAccess.getNamespaceAccess().getIncludeKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:983:1: rule__Namespace__Group_5__1 : rule__Namespace__Group_5__1__Impl rule__Namespace__Group_5__2 ;
    public final void rule__Namespace__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:987:1: ( rule__Namespace__Group_5__1__Impl rule__Namespace__Group_5__2 )
            // InternalGraphConfiguration.g:988:2: rule__Namespace__Group_5__1__Impl rule__Namespace__Group_5__2
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
    // InternalGraphConfiguration.g:995:1: rule__Namespace__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Namespace__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:999:1: ( ( '{' ) )
            // InternalGraphConfiguration.g:1000:1: ( '{' )
            {
            // InternalGraphConfiguration.g:1000:1: ( '{' )
            // InternalGraphConfiguration.g:1001:2: '{'
            {
             before(grammarAccess.getNamespaceAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:1010:1: rule__Namespace__Group_5__2 : rule__Namespace__Group_5__2__Impl rule__Namespace__Group_5__3 ;
    public final void rule__Namespace__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1014:1: ( rule__Namespace__Group_5__2__Impl rule__Namespace__Group_5__3 )
            // InternalGraphConfiguration.g:1015:2: rule__Namespace__Group_5__2__Impl rule__Namespace__Group_5__3
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
    // InternalGraphConfiguration.g:1022:1: rule__Namespace__Group_5__2__Impl : ( ( rule__Namespace__IncludeAssignment_5_2 )* ) ;
    public final void rule__Namespace__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1026:1: ( ( ( rule__Namespace__IncludeAssignment_5_2 )* ) )
            // InternalGraphConfiguration.g:1027:1: ( ( rule__Namespace__IncludeAssignment_5_2 )* )
            {
            // InternalGraphConfiguration.g:1027:1: ( ( rule__Namespace__IncludeAssignment_5_2 )* )
            // InternalGraphConfiguration.g:1028:2: ( rule__Namespace__IncludeAssignment_5_2 )*
            {
             before(grammarAccess.getNamespaceAccess().getIncludeAssignment_5_2()); 
            // InternalGraphConfiguration.g:1029:2: ( rule__Namespace__IncludeAssignment_5_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGraphConfiguration.g:1029:3: rule__Namespace__IncludeAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Namespace__IncludeAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalGraphConfiguration.g:1037:1: rule__Namespace__Group_5__3 : rule__Namespace__Group_5__3__Impl ;
    public final void rule__Namespace__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1041:1: ( rule__Namespace__Group_5__3__Impl )
            // InternalGraphConfiguration.g:1042:2: rule__Namespace__Group_5__3__Impl
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
    // InternalGraphConfiguration.g:1048:1: rule__Namespace__Group_5__3__Impl : ( '}' ) ;
    public final void rule__Namespace__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1052:1: ( ( '}' ) )
            // InternalGraphConfiguration.g:1053:1: ( '}' )
            {
            // InternalGraphConfiguration.g:1053:1: ( '}' )
            // InternalGraphConfiguration.g:1054:2: '}'
            {
             before(grammarAccess.getNamespaceAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:1064:1: rule__Namespace__Group_6__0 : rule__Namespace__Group_6__0__Impl rule__Namespace__Group_6__1 ;
    public final void rule__Namespace__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1068:1: ( rule__Namespace__Group_6__0__Impl rule__Namespace__Group_6__1 )
            // InternalGraphConfiguration.g:1069:2: rule__Namespace__Group_6__0__Impl rule__Namespace__Group_6__1
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
    // InternalGraphConfiguration.g:1076:1: rule__Namespace__Group_6__0__Impl : ( 'exclude' ) ;
    public final void rule__Namespace__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1080:1: ( ( 'exclude' ) )
            // InternalGraphConfiguration.g:1081:1: ( 'exclude' )
            {
            // InternalGraphConfiguration.g:1081:1: ( 'exclude' )
            // InternalGraphConfiguration.g:1082:2: 'exclude'
            {
             before(grammarAccess.getNamespaceAccess().getExcludeKeyword_6_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:1091:1: rule__Namespace__Group_6__1 : rule__Namespace__Group_6__1__Impl rule__Namespace__Group_6__2 ;
    public final void rule__Namespace__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1095:1: ( rule__Namespace__Group_6__1__Impl rule__Namespace__Group_6__2 )
            // InternalGraphConfiguration.g:1096:2: rule__Namespace__Group_6__1__Impl rule__Namespace__Group_6__2
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
    // InternalGraphConfiguration.g:1103:1: rule__Namespace__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Namespace__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1107:1: ( ( '{' ) )
            // InternalGraphConfiguration.g:1108:1: ( '{' )
            {
            // InternalGraphConfiguration.g:1108:1: ( '{' )
            // InternalGraphConfiguration.g:1109:2: '{'
            {
             before(grammarAccess.getNamespaceAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:1118:1: rule__Namespace__Group_6__2 : rule__Namespace__Group_6__2__Impl rule__Namespace__Group_6__3 ;
    public final void rule__Namespace__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1122:1: ( rule__Namespace__Group_6__2__Impl rule__Namespace__Group_6__3 )
            // InternalGraphConfiguration.g:1123:2: rule__Namespace__Group_6__2__Impl rule__Namespace__Group_6__3
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
    // InternalGraphConfiguration.g:1130:1: rule__Namespace__Group_6__2__Impl : ( ( ( rule__Namespace__ExcludeAssignment_6_2 ) ) ( ( rule__Namespace__ExcludeAssignment_6_2 )* ) ) ;
    public final void rule__Namespace__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1134:1: ( ( ( ( rule__Namespace__ExcludeAssignment_6_2 ) ) ( ( rule__Namespace__ExcludeAssignment_6_2 )* ) ) )
            // InternalGraphConfiguration.g:1135:1: ( ( ( rule__Namespace__ExcludeAssignment_6_2 ) ) ( ( rule__Namespace__ExcludeAssignment_6_2 )* ) )
            {
            // InternalGraphConfiguration.g:1135:1: ( ( ( rule__Namespace__ExcludeAssignment_6_2 ) ) ( ( rule__Namespace__ExcludeAssignment_6_2 )* ) )
            // InternalGraphConfiguration.g:1136:2: ( ( rule__Namespace__ExcludeAssignment_6_2 ) ) ( ( rule__Namespace__ExcludeAssignment_6_2 )* )
            {
            // InternalGraphConfiguration.g:1136:2: ( ( rule__Namespace__ExcludeAssignment_6_2 ) )
            // InternalGraphConfiguration.g:1137:3: ( rule__Namespace__ExcludeAssignment_6_2 )
            {
             before(grammarAccess.getNamespaceAccess().getExcludeAssignment_6_2()); 
            // InternalGraphConfiguration.g:1138:3: ( rule__Namespace__ExcludeAssignment_6_2 )
            // InternalGraphConfiguration.g:1138:4: rule__Namespace__ExcludeAssignment_6_2
            {
            pushFollow(FOLLOW_15);
            rule__Namespace__ExcludeAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getExcludeAssignment_6_2()); 

            }

            // InternalGraphConfiguration.g:1141:2: ( ( rule__Namespace__ExcludeAssignment_6_2 )* )
            // InternalGraphConfiguration.g:1142:3: ( rule__Namespace__ExcludeAssignment_6_2 )*
            {
             before(grammarAccess.getNamespaceAccess().getExcludeAssignment_6_2()); 
            // InternalGraphConfiguration.g:1143:3: ( rule__Namespace__ExcludeAssignment_6_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGraphConfiguration.g:1143:4: rule__Namespace__ExcludeAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Namespace__ExcludeAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalGraphConfiguration.g:1152:1: rule__Namespace__Group_6__3 : rule__Namespace__Group_6__3__Impl ;
    public final void rule__Namespace__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1156:1: ( rule__Namespace__Group_6__3__Impl )
            // InternalGraphConfiguration.g:1157:2: rule__Namespace__Group_6__3__Impl
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
    // InternalGraphConfiguration.g:1163:1: rule__Namespace__Group_6__3__Impl : ( '}' ) ;
    public final void rule__Namespace__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1167:1: ( ( '}' ) )
            // InternalGraphConfiguration.g:1168:1: ( '}' )
            {
            // InternalGraphConfiguration.g:1168:1: ( '}' )
            // InternalGraphConfiguration.g:1169:2: '}'
            {
             before(grammarAccess.getNamespaceAccess().getRightCurlyBracketKeyword_6_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:1179:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1183:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalGraphConfiguration.g:1184:2: rule__Type__Group__0__Impl rule__Type__Group__1
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
    // InternalGraphConfiguration.g:1191:1: rule__Type__Group__0__Impl : ( 'type' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1195:1: ( ( 'type' ) )
            // InternalGraphConfiguration.g:1196:1: ( 'type' )
            {
            // InternalGraphConfiguration.g:1196:1: ( 'type' )
            // InternalGraphConfiguration.g:1197:2: 'type'
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:1206:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1210:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalGraphConfiguration.g:1211:2: rule__Type__Group__1__Impl rule__Type__Group__2
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
    // InternalGraphConfiguration.g:1218:1: rule__Type__Group__1__Impl : ( ( rule__Type__TypeAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1222:1: ( ( ( rule__Type__TypeAssignment_1 ) ) )
            // InternalGraphConfiguration.g:1223:1: ( ( rule__Type__TypeAssignment_1 ) )
            {
            // InternalGraphConfiguration.g:1223:1: ( ( rule__Type__TypeAssignment_1 ) )
            // InternalGraphConfiguration.g:1224:2: ( rule__Type__TypeAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getTypeAssignment_1()); 
            // InternalGraphConfiguration.g:1225:2: ( rule__Type__TypeAssignment_1 )
            // InternalGraphConfiguration.g:1225:3: rule__Type__TypeAssignment_1
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
    // InternalGraphConfiguration.g:1233:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1237:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // InternalGraphConfiguration.g:1238:2: rule__Type__Group__2__Impl rule__Type__Group__3
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
    // InternalGraphConfiguration.g:1245:1: rule__Type__Group__2__Impl : ( '{' ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1249:1: ( ( '{' ) )
            // InternalGraphConfiguration.g:1250:1: ( '{' )
            {
            // InternalGraphConfiguration.g:1250:1: ( '{' )
            // InternalGraphConfiguration.g:1251:2: '{'
            {
             before(grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:1260:1: rule__Type__Group__3 : rule__Type__Group__3__Impl rule__Type__Group__4 ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1264:1: ( rule__Type__Group__3__Impl rule__Type__Group__4 )
            // InternalGraphConfiguration.g:1265:2: rule__Type__Group__3__Impl rule__Type__Group__4
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
    // InternalGraphConfiguration.g:1272:1: rule__Type__Group__3__Impl : ( ( rule__Type__Group_3__0 )? ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1276:1: ( ( ( rule__Type__Group_3__0 )? ) )
            // InternalGraphConfiguration.g:1277:1: ( ( rule__Type__Group_3__0 )? )
            {
            // InternalGraphConfiguration.g:1277:1: ( ( rule__Type__Group_3__0 )? )
            // InternalGraphConfiguration.g:1278:2: ( rule__Type__Group_3__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_3()); 
            // InternalGraphConfiguration.g:1279:2: ( rule__Type__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGraphConfiguration.g:1279:3: rule__Type__Group_3__0
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
    // InternalGraphConfiguration.g:1287:1: rule__Type__Group__4 : rule__Type__Group__4__Impl rule__Type__Group__5 ;
    public final void rule__Type__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1291:1: ( rule__Type__Group__4__Impl rule__Type__Group__5 )
            // InternalGraphConfiguration.g:1292:2: rule__Type__Group__4__Impl rule__Type__Group__5
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
    // InternalGraphConfiguration.g:1299:1: rule__Type__Group__4__Impl : ( ( rule__Type__Group_4__0 )? ) ;
    public final void rule__Type__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1303:1: ( ( ( rule__Type__Group_4__0 )? ) )
            // InternalGraphConfiguration.g:1304:1: ( ( rule__Type__Group_4__0 )? )
            {
            // InternalGraphConfiguration.g:1304:1: ( ( rule__Type__Group_4__0 )? )
            // InternalGraphConfiguration.g:1305:2: ( rule__Type__Group_4__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_4()); 
            // InternalGraphConfiguration.g:1306:2: ( rule__Type__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==16) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGraphConfiguration.g:1306:3: rule__Type__Group_4__0
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
    // InternalGraphConfiguration.g:1314:1: rule__Type__Group__5 : rule__Type__Group__5__Impl rule__Type__Group__6 ;
    public final void rule__Type__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1318:1: ( rule__Type__Group__5__Impl rule__Type__Group__6 )
            // InternalGraphConfiguration.g:1319:2: rule__Type__Group__5__Impl rule__Type__Group__6
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
    // InternalGraphConfiguration.g:1326:1: rule__Type__Group__5__Impl : ( ( rule__Type__Group_5__0 )? ) ;
    public final void rule__Type__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1330:1: ( ( ( rule__Type__Group_5__0 )? ) )
            // InternalGraphConfiguration.g:1331:1: ( ( rule__Type__Group_5__0 )? )
            {
            // InternalGraphConfiguration.g:1331:1: ( ( rule__Type__Group_5__0 )? )
            // InternalGraphConfiguration.g:1332:2: ( rule__Type__Group_5__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_5()); 
            // InternalGraphConfiguration.g:1333:2: ( rule__Type__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGraphConfiguration.g:1333:3: rule__Type__Group_5__0
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
    // InternalGraphConfiguration.g:1341:1: rule__Type__Group__6 : rule__Type__Group__6__Impl rule__Type__Group__7 ;
    public final void rule__Type__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1345:1: ( rule__Type__Group__6__Impl rule__Type__Group__7 )
            // InternalGraphConfiguration.g:1346:2: rule__Type__Group__6__Impl rule__Type__Group__7
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
    // InternalGraphConfiguration.g:1353:1: rule__Type__Group__6__Impl : ( ( rule__Type__Group_6__0 )? ) ;
    public final void rule__Type__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1357:1: ( ( ( rule__Type__Group_6__0 )? ) )
            // InternalGraphConfiguration.g:1358:1: ( ( rule__Type__Group_6__0 )? )
            {
            // InternalGraphConfiguration.g:1358:1: ( ( rule__Type__Group_6__0 )? )
            // InternalGraphConfiguration.g:1359:2: ( rule__Type__Group_6__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_6()); 
            // InternalGraphConfiguration.g:1360:2: ( rule__Type__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGraphConfiguration.g:1360:3: rule__Type__Group_6__0
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
    // InternalGraphConfiguration.g:1368:1: rule__Type__Group__7 : rule__Type__Group__7__Impl ;
    public final void rule__Type__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1372:1: ( rule__Type__Group__7__Impl )
            // InternalGraphConfiguration.g:1373:2: rule__Type__Group__7__Impl
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
    // InternalGraphConfiguration.g:1379:1: rule__Type__Group__7__Impl : ( '}' ) ;
    public final void rule__Type__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1383:1: ( ( '}' ) )
            // InternalGraphConfiguration.g:1384:1: ( '}' )
            {
            // InternalGraphConfiguration.g:1384:1: ( '}' )
            // InternalGraphConfiguration.g:1385:2: '}'
            {
             before(grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,21,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:1395:1: rule__Type__Group_3__0 : rule__Type__Group_3__0__Impl rule__Type__Group_3__1 ;
    public final void rule__Type__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1399:1: ( rule__Type__Group_3__0__Impl rule__Type__Group_3__1 )
            // InternalGraphConfiguration.g:1400:2: rule__Type__Group_3__0__Impl rule__Type__Group_3__1
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
    // InternalGraphConfiguration.g:1407:1: rule__Type__Group_3__0__Impl : ( 'consider' ) ;
    public final void rule__Type__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1411:1: ( ( 'consider' ) )
            // InternalGraphConfiguration.g:1412:1: ( 'consider' )
            {
            // InternalGraphConfiguration.g:1412:1: ( 'consider' )
            // InternalGraphConfiguration.g:1413:2: 'consider'
            {
             before(grammarAccess.getTypeAccess().getConsiderKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:1422:1: rule__Type__Group_3__1 : rule__Type__Group_3__1__Impl rule__Type__Group_3__2 ;
    public final void rule__Type__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1426:1: ( rule__Type__Group_3__1__Impl rule__Type__Group_3__2 )
            // InternalGraphConfiguration.g:1427:2: rule__Type__Group_3__1__Impl rule__Type__Group_3__2
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
    // InternalGraphConfiguration.g:1434:1: rule__Type__Group_3__1__Impl : ( '=' ) ;
    public final void rule__Type__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1438:1: ( ( '=' ) )
            // InternalGraphConfiguration.g:1439:1: ( '=' )
            {
            // InternalGraphConfiguration.g:1439:1: ( '=' )
            // InternalGraphConfiguration.g:1440:2: '='
            {
             before(grammarAccess.getTypeAccess().getEqualsSignKeyword_3_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:1449:1: rule__Type__Group_3__2 : rule__Type__Group_3__2__Impl ;
    public final void rule__Type__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1453:1: ( rule__Type__Group_3__2__Impl )
            // InternalGraphConfiguration.g:1454:2: rule__Type__Group_3__2__Impl
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
    // InternalGraphConfiguration.g:1460:1: rule__Type__Group_3__2__Impl : ( ( rule__Type__ConsiderAssignment_3_2 ) ) ;
    public final void rule__Type__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1464:1: ( ( ( rule__Type__ConsiderAssignment_3_2 ) ) )
            // InternalGraphConfiguration.g:1465:1: ( ( rule__Type__ConsiderAssignment_3_2 ) )
            {
            // InternalGraphConfiguration.g:1465:1: ( ( rule__Type__ConsiderAssignment_3_2 ) )
            // InternalGraphConfiguration.g:1466:2: ( rule__Type__ConsiderAssignment_3_2 )
            {
             before(grammarAccess.getTypeAccess().getConsiderAssignment_3_2()); 
            // InternalGraphConfiguration.g:1467:2: ( rule__Type__ConsiderAssignment_3_2 )
            // InternalGraphConfiguration.g:1467:3: rule__Type__ConsiderAssignment_3_2
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
    // InternalGraphConfiguration.g:1476:1: rule__Type__Group_4__0 : rule__Type__Group_4__0__Impl rule__Type__Group_4__1 ;
    public final void rule__Type__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1480:1: ( rule__Type__Group_4__0__Impl rule__Type__Group_4__1 )
            // InternalGraphConfiguration.g:1481:2: rule__Type__Group_4__0__Impl rule__Type__Group_4__1
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
    // InternalGraphConfiguration.g:1488:1: rule__Type__Group_4__0__Impl : ( 'default' ) ;
    public final void rule__Type__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1492:1: ( ( 'default' ) )
            // InternalGraphConfiguration.g:1493:1: ( 'default' )
            {
            // InternalGraphConfiguration.g:1493:1: ( 'default' )
            // InternalGraphConfiguration.g:1494:2: 'default'
            {
             before(grammarAccess.getTypeAccess().getDefaultKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:1503:1: rule__Type__Group_4__1 : rule__Type__Group_4__1__Impl rule__Type__Group_4__2 ;
    public final void rule__Type__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1507:1: ( rule__Type__Group_4__1__Impl rule__Type__Group_4__2 )
            // InternalGraphConfiguration.g:1508:2: rule__Type__Group_4__1__Impl rule__Type__Group_4__2
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
    // InternalGraphConfiguration.g:1515:1: rule__Type__Group_4__1__Impl : ( '=' ) ;
    public final void rule__Type__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1519:1: ( ( '=' ) )
            // InternalGraphConfiguration.g:1520:1: ( '=' )
            {
            // InternalGraphConfiguration.g:1520:1: ( '=' )
            // InternalGraphConfiguration.g:1521:2: '='
            {
             before(grammarAccess.getTypeAccess().getEqualsSignKeyword_4_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:1530:1: rule__Type__Group_4__2 : rule__Type__Group_4__2__Impl ;
    public final void rule__Type__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1534:1: ( rule__Type__Group_4__2__Impl )
            // InternalGraphConfiguration.g:1535:2: rule__Type__Group_4__2__Impl
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
    // InternalGraphConfiguration.g:1541:1: rule__Type__Group_4__2__Impl : ( ( rule__Type__DefaultAssignment_4_2 ) ) ;
    public final void rule__Type__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1545:1: ( ( ( rule__Type__DefaultAssignment_4_2 ) ) )
            // InternalGraphConfiguration.g:1546:1: ( ( rule__Type__DefaultAssignment_4_2 ) )
            {
            // InternalGraphConfiguration.g:1546:1: ( ( rule__Type__DefaultAssignment_4_2 ) )
            // InternalGraphConfiguration.g:1547:2: ( rule__Type__DefaultAssignment_4_2 )
            {
             before(grammarAccess.getTypeAccess().getDefaultAssignment_4_2()); 
            // InternalGraphConfiguration.g:1548:2: ( rule__Type__DefaultAssignment_4_2 )
            // InternalGraphConfiguration.g:1548:3: rule__Type__DefaultAssignment_4_2
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
    // InternalGraphConfiguration.g:1557:1: rule__Type__Group_5__0 : rule__Type__Group_5__0__Impl rule__Type__Group_5__1 ;
    public final void rule__Type__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1561:1: ( rule__Type__Group_5__0__Impl rule__Type__Group_5__1 )
            // InternalGraphConfiguration.g:1562:2: rule__Type__Group_5__0__Impl rule__Type__Group_5__1
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
    // InternalGraphConfiguration.g:1569:1: rule__Type__Group_5__0__Impl : ( 'include' ) ;
    public final void rule__Type__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1573:1: ( ( 'include' ) )
            // InternalGraphConfiguration.g:1574:1: ( 'include' )
            {
            // InternalGraphConfiguration.g:1574:1: ( 'include' )
            // InternalGraphConfiguration.g:1575:2: 'include'
            {
             before(grammarAccess.getTypeAccess().getIncludeKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:1584:1: rule__Type__Group_5__1 : rule__Type__Group_5__1__Impl rule__Type__Group_5__2 ;
    public final void rule__Type__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1588:1: ( rule__Type__Group_5__1__Impl rule__Type__Group_5__2 )
            // InternalGraphConfiguration.g:1589:2: rule__Type__Group_5__1__Impl rule__Type__Group_5__2
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
    // InternalGraphConfiguration.g:1596:1: rule__Type__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Type__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1600:1: ( ( '{' ) )
            // InternalGraphConfiguration.g:1601:1: ( '{' )
            {
            // InternalGraphConfiguration.g:1601:1: ( '{' )
            // InternalGraphConfiguration.g:1602:2: '{'
            {
             before(grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:1611:1: rule__Type__Group_5__2 : rule__Type__Group_5__2__Impl rule__Type__Group_5__3 ;
    public final void rule__Type__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1615:1: ( rule__Type__Group_5__2__Impl rule__Type__Group_5__3 )
            // InternalGraphConfiguration.g:1616:2: rule__Type__Group_5__2__Impl rule__Type__Group_5__3
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
    // InternalGraphConfiguration.g:1623:1: rule__Type__Group_5__2__Impl : ( ( ( rule__Type__InlcudeAssignment_5_2 ) ) ( ( rule__Type__InlcudeAssignment_5_2 )* ) ) ;
    public final void rule__Type__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1627:1: ( ( ( ( rule__Type__InlcudeAssignment_5_2 ) ) ( ( rule__Type__InlcudeAssignment_5_2 )* ) ) )
            // InternalGraphConfiguration.g:1628:1: ( ( ( rule__Type__InlcudeAssignment_5_2 ) ) ( ( rule__Type__InlcudeAssignment_5_2 )* ) )
            {
            // InternalGraphConfiguration.g:1628:1: ( ( ( rule__Type__InlcudeAssignment_5_2 ) ) ( ( rule__Type__InlcudeAssignment_5_2 )* ) )
            // InternalGraphConfiguration.g:1629:2: ( ( rule__Type__InlcudeAssignment_5_2 ) ) ( ( rule__Type__InlcudeAssignment_5_2 )* )
            {
            // InternalGraphConfiguration.g:1629:2: ( ( rule__Type__InlcudeAssignment_5_2 ) )
            // InternalGraphConfiguration.g:1630:3: ( rule__Type__InlcudeAssignment_5_2 )
            {
             before(grammarAccess.getTypeAccess().getInlcudeAssignment_5_2()); 
            // InternalGraphConfiguration.g:1631:3: ( rule__Type__InlcudeAssignment_5_2 )
            // InternalGraphConfiguration.g:1631:4: rule__Type__InlcudeAssignment_5_2
            {
            pushFollow(FOLLOW_17);
            rule__Type__InlcudeAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getInlcudeAssignment_5_2()); 

            }

            // InternalGraphConfiguration.g:1634:2: ( ( rule__Type__InlcudeAssignment_5_2 )* )
            // InternalGraphConfiguration.g:1635:3: ( rule__Type__InlcudeAssignment_5_2 )*
            {
             before(grammarAccess.getTypeAccess().getInlcudeAssignment_5_2()); 
            // InternalGraphConfiguration.g:1636:3: ( rule__Type__InlcudeAssignment_5_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==25) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGraphConfiguration.g:1636:4: rule__Type__InlcudeAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Type__InlcudeAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalGraphConfiguration.g:1645:1: rule__Type__Group_5__3 : rule__Type__Group_5__3__Impl ;
    public final void rule__Type__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1649:1: ( rule__Type__Group_5__3__Impl )
            // InternalGraphConfiguration.g:1650:2: rule__Type__Group_5__3__Impl
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
    // InternalGraphConfiguration.g:1656:1: rule__Type__Group_5__3__Impl : ( '}' ) ;
    public final void rule__Type__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1660:1: ( ( '}' ) )
            // InternalGraphConfiguration.g:1661:1: ( '}' )
            {
            // InternalGraphConfiguration.g:1661:1: ( '}' )
            // InternalGraphConfiguration.g:1662:2: '}'
            {
             before(grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:1672:1: rule__Type__Group_6__0 : rule__Type__Group_6__0__Impl rule__Type__Group_6__1 ;
    public final void rule__Type__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1676:1: ( rule__Type__Group_6__0__Impl rule__Type__Group_6__1 )
            // InternalGraphConfiguration.g:1677:2: rule__Type__Group_6__0__Impl rule__Type__Group_6__1
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
    // InternalGraphConfiguration.g:1684:1: rule__Type__Group_6__0__Impl : ( 'exclude' ) ;
    public final void rule__Type__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1688:1: ( ( 'exclude' ) )
            // InternalGraphConfiguration.g:1689:1: ( 'exclude' )
            {
            // InternalGraphConfiguration.g:1689:1: ( 'exclude' )
            // InternalGraphConfiguration.g:1690:2: 'exclude'
            {
             before(grammarAccess.getTypeAccess().getExcludeKeyword_6_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:1699:1: rule__Type__Group_6__1 : rule__Type__Group_6__1__Impl rule__Type__Group_6__2 ;
    public final void rule__Type__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1703:1: ( rule__Type__Group_6__1__Impl rule__Type__Group_6__2 )
            // InternalGraphConfiguration.g:1704:2: rule__Type__Group_6__1__Impl rule__Type__Group_6__2
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
    // InternalGraphConfiguration.g:1711:1: rule__Type__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Type__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1715:1: ( ( '{' ) )
            // InternalGraphConfiguration.g:1716:1: ( '{' )
            {
            // InternalGraphConfiguration.g:1716:1: ( '{' )
            // InternalGraphConfiguration.g:1717:2: '{'
            {
             before(grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:1726:1: rule__Type__Group_6__2 : rule__Type__Group_6__2__Impl rule__Type__Group_6__3 ;
    public final void rule__Type__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1730:1: ( rule__Type__Group_6__2__Impl rule__Type__Group_6__3 )
            // InternalGraphConfiguration.g:1731:2: rule__Type__Group_6__2__Impl rule__Type__Group_6__3
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
    // InternalGraphConfiguration.g:1738:1: rule__Type__Group_6__2__Impl : ( ( ( rule__Type__ExcludeAssignment_6_2 ) ) ( ( rule__Type__ExcludeAssignment_6_2 )* ) ) ;
    public final void rule__Type__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1742:1: ( ( ( ( rule__Type__ExcludeAssignment_6_2 ) ) ( ( rule__Type__ExcludeAssignment_6_2 )* ) ) )
            // InternalGraphConfiguration.g:1743:1: ( ( ( rule__Type__ExcludeAssignment_6_2 ) ) ( ( rule__Type__ExcludeAssignment_6_2 )* ) )
            {
            // InternalGraphConfiguration.g:1743:1: ( ( ( rule__Type__ExcludeAssignment_6_2 ) ) ( ( rule__Type__ExcludeAssignment_6_2 )* ) )
            // InternalGraphConfiguration.g:1744:2: ( ( rule__Type__ExcludeAssignment_6_2 ) ) ( ( rule__Type__ExcludeAssignment_6_2 )* )
            {
            // InternalGraphConfiguration.g:1744:2: ( ( rule__Type__ExcludeAssignment_6_2 ) )
            // InternalGraphConfiguration.g:1745:3: ( rule__Type__ExcludeAssignment_6_2 )
            {
             before(grammarAccess.getTypeAccess().getExcludeAssignment_6_2()); 
            // InternalGraphConfiguration.g:1746:3: ( rule__Type__ExcludeAssignment_6_2 )
            // InternalGraphConfiguration.g:1746:4: rule__Type__ExcludeAssignment_6_2
            {
            pushFollow(FOLLOW_15);
            rule__Type__ExcludeAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getExcludeAssignment_6_2()); 

            }

            // InternalGraphConfiguration.g:1749:2: ( ( rule__Type__ExcludeAssignment_6_2 )* )
            // InternalGraphConfiguration.g:1750:3: ( rule__Type__ExcludeAssignment_6_2 )*
            {
             before(grammarAccess.getTypeAccess().getExcludeAssignment_6_2()); 
            // InternalGraphConfiguration.g:1751:3: ( rule__Type__ExcludeAssignment_6_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGraphConfiguration.g:1751:4: rule__Type__ExcludeAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Type__ExcludeAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalGraphConfiguration.g:1760:1: rule__Type__Group_6__3 : rule__Type__Group_6__3__Impl ;
    public final void rule__Type__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1764:1: ( rule__Type__Group_6__3__Impl )
            // InternalGraphConfiguration.g:1765:2: rule__Type__Group_6__3__Impl
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
    // InternalGraphConfiguration.g:1771:1: rule__Type__Group_6__3__Impl : ( '}' ) ;
    public final void rule__Type__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1775:1: ( ( '}' ) )
            // InternalGraphConfiguration.g:1776:1: ( '}' )
            {
            // InternalGraphConfiguration.g:1776:1: ( '}' )
            // InternalGraphConfiguration.g:1777:2: '}'
            {
             before(grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_6_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:1787:1: rule__Edge__Group__0 : rule__Edge__Group__0__Impl rule__Edge__Group__1 ;
    public final void rule__Edge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1791:1: ( rule__Edge__Group__0__Impl rule__Edge__Group__1 )
            // InternalGraphConfiguration.g:1792:2: rule__Edge__Group__0__Impl rule__Edge__Group__1
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
    // InternalGraphConfiguration.g:1799:1: rule__Edge__Group__0__Impl : ( 'reference' ) ;
    public final void rule__Edge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1803:1: ( ( 'reference' ) )
            // InternalGraphConfiguration.g:1804:1: ( 'reference' )
            {
            // InternalGraphConfiguration.g:1804:1: ( 'reference' )
            // InternalGraphConfiguration.g:1805:2: 'reference'
            {
             before(grammarAccess.getEdgeAccess().getReferenceKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:1814:1: rule__Edge__Group__1 : rule__Edge__Group__1__Impl rule__Edge__Group__2 ;
    public final void rule__Edge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1818:1: ( rule__Edge__Group__1__Impl rule__Edge__Group__2 )
            // InternalGraphConfiguration.g:1819:2: rule__Edge__Group__1__Impl rule__Edge__Group__2
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
    // InternalGraphConfiguration.g:1826:1: rule__Edge__Group__1__Impl : ( ( rule__Edge__ReferenceAssignment_1 ) ) ;
    public final void rule__Edge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1830:1: ( ( ( rule__Edge__ReferenceAssignment_1 ) ) )
            // InternalGraphConfiguration.g:1831:1: ( ( rule__Edge__ReferenceAssignment_1 ) )
            {
            // InternalGraphConfiguration.g:1831:1: ( ( rule__Edge__ReferenceAssignment_1 ) )
            // InternalGraphConfiguration.g:1832:2: ( rule__Edge__ReferenceAssignment_1 )
            {
             before(grammarAccess.getEdgeAccess().getReferenceAssignment_1()); 
            // InternalGraphConfiguration.g:1833:2: ( rule__Edge__ReferenceAssignment_1 )
            // InternalGraphConfiguration.g:1833:3: rule__Edge__ReferenceAssignment_1
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
    // InternalGraphConfiguration.g:1841:1: rule__Edge__Group__2 : rule__Edge__Group__2__Impl rule__Edge__Group__3 ;
    public final void rule__Edge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1845:1: ( rule__Edge__Group__2__Impl rule__Edge__Group__3 )
            // InternalGraphConfiguration.g:1846:2: rule__Edge__Group__2__Impl rule__Edge__Group__3
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
    // InternalGraphConfiguration.g:1853:1: rule__Edge__Group__2__Impl : ( ( rule__Edge__Group_2__0 )? ) ;
    public final void rule__Edge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1857:1: ( ( ( rule__Edge__Group_2__0 )? ) )
            // InternalGraphConfiguration.g:1858:1: ( ( rule__Edge__Group_2__0 )? )
            {
            // InternalGraphConfiguration.g:1858:1: ( ( rule__Edge__Group_2__0 )? )
            // InternalGraphConfiguration.g:1859:2: ( rule__Edge__Group_2__0 )?
            {
             before(grammarAccess.getEdgeAccess().getGroup_2()); 
            // InternalGraphConfiguration.g:1860:2: ( rule__Edge__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGraphConfiguration.g:1860:3: rule__Edge__Group_2__0
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
    // InternalGraphConfiguration.g:1868:1: rule__Edge__Group__3 : rule__Edge__Group__3__Impl rule__Edge__Group__4 ;
    public final void rule__Edge__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1872:1: ( rule__Edge__Group__3__Impl rule__Edge__Group__4 )
            // InternalGraphConfiguration.g:1873:2: rule__Edge__Group__3__Impl rule__Edge__Group__4
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
    // InternalGraphConfiguration.g:1880:1: rule__Edge__Group__3__Impl : ( ( rule__Edge__DirectionAssignment_3 ) ) ;
    public final void rule__Edge__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1884:1: ( ( ( rule__Edge__DirectionAssignment_3 ) ) )
            // InternalGraphConfiguration.g:1885:1: ( ( rule__Edge__DirectionAssignment_3 ) )
            {
            // InternalGraphConfiguration.g:1885:1: ( ( rule__Edge__DirectionAssignment_3 ) )
            // InternalGraphConfiguration.g:1886:2: ( rule__Edge__DirectionAssignment_3 )
            {
             before(grammarAccess.getEdgeAccess().getDirectionAssignment_3()); 
            // InternalGraphConfiguration.g:1887:2: ( rule__Edge__DirectionAssignment_3 )
            // InternalGraphConfiguration.g:1887:3: rule__Edge__DirectionAssignment_3
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
    // InternalGraphConfiguration.g:1895:1: rule__Edge__Group__4 : rule__Edge__Group__4__Impl ;
    public final void rule__Edge__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1899:1: ( rule__Edge__Group__4__Impl )
            // InternalGraphConfiguration.g:1900:2: rule__Edge__Group__4__Impl
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
    // InternalGraphConfiguration.g:1906:1: rule__Edge__Group__4__Impl : ( ( rule__Edge__WeightAssignment_4 ) ) ;
    public final void rule__Edge__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1910:1: ( ( ( rule__Edge__WeightAssignment_4 ) ) )
            // InternalGraphConfiguration.g:1911:1: ( ( rule__Edge__WeightAssignment_4 ) )
            {
            // InternalGraphConfiguration.g:1911:1: ( ( rule__Edge__WeightAssignment_4 ) )
            // InternalGraphConfiguration.g:1912:2: ( rule__Edge__WeightAssignment_4 )
            {
             before(grammarAccess.getEdgeAccess().getWeightAssignment_4()); 
            // InternalGraphConfiguration.g:1913:2: ( rule__Edge__WeightAssignment_4 )
            // InternalGraphConfiguration.g:1913:3: rule__Edge__WeightAssignment_4
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
    // InternalGraphConfiguration.g:1922:1: rule__Edge__Group_2__0 : rule__Edge__Group_2__0__Impl rule__Edge__Group_2__1 ;
    public final void rule__Edge__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1926:1: ( rule__Edge__Group_2__0__Impl rule__Edge__Group_2__1 )
            // InternalGraphConfiguration.g:1927:2: rule__Edge__Group_2__0__Impl rule__Edge__Group_2__1
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
    // InternalGraphConfiguration.g:1934:1: rule__Edge__Group_2__0__Impl : ( '--' ) ;
    public final void rule__Edge__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1938:1: ( ( '--' ) )
            // InternalGraphConfiguration.g:1939:1: ( '--' )
            {
            // InternalGraphConfiguration.g:1939:1: ( '--' )
            // InternalGraphConfiguration.g:1940:2: '--'
            {
             before(grammarAccess.getEdgeAccess().getHyphenMinusHyphenMinusKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:1949:1: rule__Edge__Group_2__1 : rule__Edge__Group_2__1__Impl rule__Edge__Group_2__2 ;
    public final void rule__Edge__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1953:1: ( rule__Edge__Group_2__1__Impl rule__Edge__Group_2__2 )
            // InternalGraphConfiguration.g:1954:2: rule__Edge__Group_2__1__Impl rule__Edge__Group_2__2
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
    // InternalGraphConfiguration.g:1961:1: rule__Edge__Group_2__1__Impl : ( ( rule__Edge__TypeAssignment_2_1 ) ) ;
    public final void rule__Edge__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1965:1: ( ( ( rule__Edge__TypeAssignment_2_1 ) ) )
            // InternalGraphConfiguration.g:1966:1: ( ( rule__Edge__TypeAssignment_2_1 ) )
            {
            // InternalGraphConfiguration.g:1966:1: ( ( rule__Edge__TypeAssignment_2_1 ) )
            // InternalGraphConfiguration.g:1967:2: ( rule__Edge__TypeAssignment_2_1 )
            {
             before(grammarAccess.getEdgeAccess().getTypeAssignment_2_1()); 
            // InternalGraphConfiguration.g:1968:2: ( rule__Edge__TypeAssignment_2_1 )
            // InternalGraphConfiguration.g:1968:3: rule__Edge__TypeAssignment_2_1
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
    // InternalGraphConfiguration.g:1976:1: rule__Edge__Group_2__2 : rule__Edge__Group_2__2__Impl ;
    public final void rule__Edge__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1980:1: ( rule__Edge__Group_2__2__Impl )
            // InternalGraphConfiguration.g:1981:2: rule__Edge__Group_2__2__Impl
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
    // InternalGraphConfiguration.g:1987:1: rule__Edge__Group_2__2__Impl : ( ( rule__Edge__Group_2_2__0 )? ) ;
    public final void rule__Edge__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:1991:1: ( ( ( rule__Edge__Group_2_2__0 )? ) )
            // InternalGraphConfiguration.g:1992:1: ( ( rule__Edge__Group_2_2__0 )? )
            {
            // InternalGraphConfiguration.g:1992:1: ( ( rule__Edge__Group_2_2__0 )? )
            // InternalGraphConfiguration.g:1993:2: ( rule__Edge__Group_2_2__0 )?
            {
             before(grammarAccess.getEdgeAccess().getGroup_2_2()); 
            // InternalGraphConfiguration.g:1994:2: ( rule__Edge__Group_2_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGraphConfiguration.g:1994:3: rule__Edge__Group_2_2__0
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
    // InternalGraphConfiguration.g:2003:1: rule__Edge__Group_2_2__0 : rule__Edge__Group_2_2__0__Impl rule__Edge__Group_2_2__1 ;
    public final void rule__Edge__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2007:1: ( rule__Edge__Group_2_2__0__Impl rule__Edge__Group_2_2__1 )
            // InternalGraphConfiguration.g:2008:2: rule__Edge__Group_2_2__0__Impl rule__Edge__Group_2_2__1
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
    // InternalGraphConfiguration.g:2015:1: rule__Edge__Group_2_2__0__Impl : ( '--' ) ;
    public final void rule__Edge__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2019:1: ( ( '--' ) )
            // InternalGraphConfiguration.g:2020:1: ( '--' )
            {
            // InternalGraphConfiguration.g:2020:1: ( '--' )
            // InternalGraphConfiguration.g:2021:2: '--'
            {
             before(grammarAccess.getEdgeAccess().getHyphenMinusHyphenMinusKeyword_2_2_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGraphConfiguration.g:2030:1: rule__Edge__Group_2_2__1 : rule__Edge__Group_2_2__1__Impl ;
    public final void rule__Edge__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2034:1: ( rule__Edge__Group_2_2__1__Impl )
            // InternalGraphConfiguration.g:2035:2: rule__Edge__Group_2_2__1__Impl
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
    // InternalGraphConfiguration.g:2041:1: rule__Edge__Group_2_2__1__Impl : ( ( rule__Edge__TargetAssignment_2_2_1 ) ) ;
    public final void rule__Edge__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2045:1: ( ( ( rule__Edge__TargetAssignment_2_2_1 ) ) )
            // InternalGraphConfiguration.g:2046:1: ( ( rule__Edge__TargetAssignment_2_2_1 ) )
            {
            // InternalGraphConfiguration.g:2046:1: ( ( rule__Edge__TargetAssignment_2_2_1 ) )
            // InternalGraphConfiguration.g:2047:2: ( rule__Edge__TargetAssignment_2_2_1 )
            {
             before(grammarAccess.getEdgeAccess().getTargetAssignment_2_2_1()); 
            // InternalGraphConfiguration.g:2048:2: ( rule__Edge__TargetAssignment_2_2_1 )
            // InternalGraphConfiguration.g:2048:3: rule__Edge__TargetAssignment_2_2_1
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


    // $ANTLR start "rule__Configuration__DefaultAssignment_0_2"
    // InternalGraphConfiguration.g:2057:1: rule__Configuration__DefaultAssignment_0_2 : ( RULE_INT ) ;
    public final void rule__Configuration__DefaultAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2061:1: ( ( RULE_INT ) )
            // InternalGraphConfiguration.g:2062:2: ( RULE_INT )
            {
            // InternalGraphConfiguration.g:2062:2: ( RULE_INT )
            // InternalGraphConfiguration.g:2063:3: RULE_INT
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
    // InternalGraphConfiguration.g:2072:1: rule__Configuration__ConsiderAssignment_1_2 : ( ruleConsider ) ;
    public final void rule__Configuration__ConsiderAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2076:1: ( ( ruleConsider ) )
            // InternalGraphConfiguration.g:2077:2: ( ruleConsider )
            {
            // InternalGraphConfiguration.g:2077:2: ( ruleConsider )
            // InternalGraphConfiguration.g:2078:3: ruleConsider
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
    // InternalGraphConfiguration.g:2087:1: rule__Configuration__NamespacesAssignment_2 : ( ruleNamespace ) ;
    public final void rule__Configuration__NamespacesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2091:1: ( ( ruleNamespace ) )
            // InternalGraphConfiguration.g:2092:2: ( ruleNamespace )
            {
            // InternalGraphConfiguration.g:2092:2: ( ruleNamespace )
            // InternalGraphConfiguration.g:2093:3: ruleNamespace
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
    // InternalGraphConfiguration.g:2102:1: rule__Namespace__PackageAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Namespace__PackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2106:1: ( ( RULE_STRING ) )
            // InternalGraphConfiguration.g:2107:2: ( RULE_STRING )
            {
            // InternalGraphConfiguration.g:2107:2: ( RULE_STRING )
            // InternalGraphConfiguration.g:2108:3: RULE_STRING
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
    // InternalGraphConfiguration.g:2117:1: rule__Namespace__DefaultAssignment_3_2 : ( RULE_INT ) ;
    public final void rule__Namespace__DefaultAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2121:1: ( ( RULE_INT ) )
            // InternalGraphConfiguration.g:2122:2: ( RULE_INT )
            {
            // InternalGraphConfiguration.g:2122:2: ( RULE_INT )
            // InternalGraphConfiguration.g:2123:3: RULE_INT
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
    // InternalGraphConfiguration.g:2132:1: rule__Namespace__ConsiderAssignment_4_2 : ( ruleConsider ) ;
    public final void rule__Namespace__ConsiderAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2136:1: ( ( ruleConsider ) )
            // InternalGraphConfiguration.g:2137:2: ( ruleConsider )
            {
            // InternalGraphConfiguration.g:2137:2: ( ruleConsider )
            // InternalGraphConfiguration.g:2138:3: ruleConsider
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
    // InternalGraphConfiguration.g:2147:1: rule__Namespace__IncludeAssignment_5_2 : ( ruleType ) ;
    public final void rule__Namespace__IncludeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2151:1: ( ( ruleType ) )
            // InternalGraphConfiguration.g:2152:2: ( ruleType )
            {
            // InternalGraphConfiguration.g:2152:2: ( ruleType )
            // InternalGraphConfiguration.g:2153:3: ruleType
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
    // InternalGraphConfiguration.g:2162:1: rule__Namespace__ExcludeAssignment_6_2 : ( ( RULE_ID ) ) ;
    public final void rule__Namespace__ExcludeAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2166:1: ( ( ( RULE_ID ) ) )
            // InternalGraphConfiguration.g:2167:2: ( ( RULE_ID ) )
            {
            // InternalGraphConfiguration.g:2167:2: ( ( RULE_ID ) )
            // InternalGraphConfiguration.g:2168:3: ( RULE_ID )
            {
             before(grammarAccess.getNamespaceAccess().getExcludeEClassCrossReference_6_2_0()); 
            // InternalGraphConfiguration.g:2169:3: ( RULE_ID )
            // InternalGraphConfiguration.g:2170:4: RULE_ID
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
    // InternalGraphConfiguration.g:2181:1: rule__Type__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Type__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2185:1: ( ( ( RULE_ID ) ) )
            // InternalGraphConfiguration.g:2186:2: ( ( RULE_ID ) )
            {
            // InternalGraphConfiguration.g:2186:2: ( ( RULE_ID ) )
            // InternalGraphConfiguration.g:2187:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeAccess().getTypeEClassCrossReference_1_0()); 
            // InternalGraphConfiguration.g:2188:3: ( RULE_ID )
            // InternalGraphConfiguration.g:2189:4: RULE_ID
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
    // InternalGraphConfiguration.g:2200:1: rule__Type__ConsiderAssignment_3_2 : ( ruleConsider ) ;
    public final void rule__Type__ConsiderAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2204:1: ( ( ruleConsider ) )
            // InternalGraphConfiguration.g:2205:2: ( ruleConsider )
            {
            // InternalGraphConfiguration.g:2205:2: ( ruleConsider )
            // InternalGraphConfiguration.g:2206:3: ruleConsider
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
    // InternalGraphConfiguration.g:2215:1: rule__Type__DefaultAssignment_4_2 : ( RULE_INT ) ;
    public final void rule__Type__DefaultAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2219:1: ( ( RULE_INT ) )
            // InternalGraphConfiguration.g:2220:2: ( RULE_INT )
            {
            // InternalGraphConfiguration.g:2220:2: ( RULE_INT )
            // InternalGraphConfiguration.g:2221:3: RULE_INT
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
    // InternalGraphConfiguration.g:2230:1: rule__Type__InlcudeAssignment_5_2 : ( ruleEdge ) ;
    public final void rule__Type__InlcudeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2234:1: ( ( ruleEdge ) )
            // InternalGraphConfiguration.g:2235:2: ( ruleEdge )
            {
            // InternalGraphConfiguration.g:2235:2: ( ruleEdge )
            // InternalGraphConfiguration.g:2236:3: ruleEdge
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
    // InternalGraphConfiguration.g:2245:1: rule__Type__ExcludeAssignment_6_2 : ( ( RULE_ID ) ) ;
    public final void rule__Type__ExcludeAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2249:1: ( ( ( RULE_ID ) ) )
            // InternalGraphConfiguration.g:2250:2: ( ( RULE_ID ) )
            {
            // InternalGraphConfiguration.g:2250:2: ( ( RULE_ID ) )
            // InternalGraphConfiguration.g:2251:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeAccess().getExcludeEReferenceCrossReference_6_2_0()); 
            // InternalGraphConfiguration.g:2252:3: ( RULE_ID )
            // InternalGraphConfiguration.g:2253:4: RULE_ID
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
    // InternalGraphConfiguration.g:2264:1: rule__Edge__ReferenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Edge__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2268:1: ( ( ( RULE_ID ) ) )
            // InternalGraphConfiguration.g:2269:2: ( ( RULE_ID ) )
            {
            // InternalGraphConfiguration.g:2269:2: ( ( RULE_ID ) )
            // InternalGraphConfiguration.g:2270:3: ( RULE_ID )
            {
             before(grammarAccess.getEdgeAccess().getReferenceEReferenceCrossReference_1_0()); 
            // InternalGraphConfiguration.g:2271:3: ( RULE_ID )
            // InternalGraphConfiguration.g:2272:4: RULE_ID
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
    // InternalGraphConfiguration.g:2283:1: rule__Edge__TypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Edge__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2287:1: ( ( ( RULE_ID ) ) )
            // InternalGraphConfiguration.g:2288:2: ( ( RULE_ID ) )
            {
            // InternalGraphConfiguration.g:2288:2: ( ( RULE_ID ) )
            // InternalGraphConfiguration.g:2289:3: ( RULE_ID )
            {
             before(grammarAccess.getEdgeAccess().getTypeEClassCrossReference_2_1_0()); 
            // InternalGraphConfiguration.g:2290:3: ( RULE_ID )
            // InternalGraphConfiguration.g:2291:4: RULE_ID
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
    // InternalGraphConfiguration.g:2302:1: rule__Edge__TargetAssignment_2_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Edge__TargetAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2306:1: ( ( ( RULE_ID ) ) )
            // InternalGraphConfiguration.g:2307:2: ( ( RULE_ID ) )
            {
            // InternalGraphConfiguration.g:2307:2: ( ( RULE_ID ) )
            // InternalGraphConfiguration.g:2308:3: ( RULE_ID )
            {
             before(grammarAccess.getEdgeAccess().getTargetEReferenceCrossReference_2_2_1_0()); 
            // InternalGraphConfiguration.g:2309:3: ( RULE_ID )
            // InternalGraphConfiguration.g:2310:4: RULE_ID
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
    // InternalGraphConfiguration.g:2321:1: rule__Edge__DirectionAssignment_3 : ( ruleDirection ) ;
    public final void rule__Edge__DirectionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2325:1: ( ( ruleDirection ) )
            // InternalGraphConfiguration.g:2326:2: ( ruleDirection )
            {
            // InternalGraphConfiguration.g:2326:2: ( ruleDirection )
            // InternalGraphConfiguration.g:2327:3: ruleDirection
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
    // InternalGraphConfiguration.g:2336:1: rule__Edge__WeightAssignment_4 : ( ruleWeight ) ;
    public final void rule__Edge__WeightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2340:1: ( ( ruleWeight ) )
            // InternalGraphConfiguration.g:2341:2: ( ruleWeight )
            {
            // InternalGraphConfiguration.g:2341:2: ( ruleWeight )
            // InternalGraphConfiguration.g:2342:3: ruleWeight
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
    // InternalGraphConfiguration.g:2351:1: rule__NumberWeight__ValueAssignment : ( RULE_INT ) ;
    public final void rule__NumberWeight__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2355:1: ( ( RULE_INT ) )
            // InternalGraphConfiguration.g:2356:2: ( RULE_INT )
            {
            // InternalGraphConfiguration.g:2356:2: ( RULE_INT )
            // InternalGraphConfiguration.g:2357:3: RULE_INT
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


    // $ANTLR start "rule__AttributeWeight__ValueAssignment"
    // InternalGraphConfiguration.g:2366:1: rule__AttributeWeight__ValueAssignment : ( ( RULE_ID ) ) ;
    public final void rule__AttributeWeight__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphConfiguration.g:2370:1: ( ( ( RULE_ID ) ) )
            // InternalGraphConfiguration.g:2371:2: ( ( RULE_ID ) )
            {
            // InternalGraphConfiguration.g:2371:2: ( ( RULE_ID ) )
            // InternalGraphConfiguration.g:2372:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeWeightAccess().getValueEAttributeCrossReference_0()); 
            // InternalGraphConfiguration.g:2373:3: ( RULE_ID )
            // InternalGraphConfiguration.g:2374:4: RULE_ID
            {
             before(grammarAccess.getAttributeWeightAccess().getValueEAttributeIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeWeightAccess().getValueEAttributeIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getAttributeWeightAccess().getValueEAttributeCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeWeight__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000E50000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000400E000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});

}