/*
 * generated by Xtext 2.13.0
 */
package de.fraunhofer.ipa.rossystem.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class RosSystemGrammarAccess extends AbstractGrammarElementFinder {
	
	public class RosSystemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.rossystem.RosSystem.RosSystem");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRosSystemAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cRosSystemKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cNameKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cNameAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_3_1_0 = (RuleCall)cNameAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cRosComponentsKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cRosComponentAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final CrossReference cRosComponentComponentInterfaceCrossReference_4_2_0 = (CrossReference)cRosComponentAssignment_4_2.eContents().get(0);
		private final RuleCall cRosComponentComponentInterfaceEStringParserRuleCall_4_2_0_1 = (RuleCall)cRosComponentComponentInterfaceCrossReference_4_2_0.eContents().get(1);
		private final Group cGroup_4_3 = (Group)cGroup_4.eContents().get(3);
		private final Keyword cCommaKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Assignment cRosComponentAssignment_4_3_1 = (Assignment)cGroup_4_3.eContents().get(1);
		private final CrossReference cRosComponentComponentInterfaceCrossReference_4_3_1_0 = (CrossReference)cRosComponentAssignment_4_3_1.eContents().get(0);
		private final RuleCall cRosComponentComponentInterfaceEStringParserRuleCall_4_3_1_0_1 = (RuleCall)cRosComponentComponentInterfaceCrossReference_4_3_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_4_4 = (Keyword)cGroup_4.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cTopicConnectionsKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cTopicConnectionsAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cTopicConnectionsTopicConnectionParserRuleCall_5_2_0 = (RuleCall)cTopicConnectionsAssignment_5_2.eContents().get(0);
		private final Group cGroup_5_3 = (Group)cGroup_5.eContents().get(3);
		private final Keyword cCommaKeyword_5_3_0 = (Keyword)cGroup_5_3.eContents().get(0);
		private final Assignment cTopicConnectionsAssignment_5_3_1 = (Assignment)cGroup_5_3.eContents().get(1);
		private final RuleCall cTopicConnectionsTopicConnectionParserRuleCall_5_3_1_0 = (RuleCall)cTopicConnectionsAssignment_5_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_4 = (Keyword)cGroup_5.eContents().get(4);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cServiceConnectionsKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cServiceConnectionsAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final RuleCall cServiceConnectionsServiceConnectionParserRuleCall_6_2_0 = (RuleCall)cServiceConnectionsAssignment_6_2.eContents().get(0);
		private final Group cGroup_6_3 = (Group)cGroup_6.eContents().get(3);
		private final Keyword cCommaKeyword_6_3_0 = (Keyword)cGroup_6_3.eContents().get(0);
		private final Assignment cServiceConnectionsAssignment_6_3_1 = (Assignment)cGroup_6_3.eContents().get(1);
		private final RuleCall cServiceConnectionsServiceConnectionParserRuleCall_6_3_1_0 = (RuleCall)cServiceConnectionsAssignment_6_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6_4 = (Keyword)cGroup_6.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//RosSystem:
		//	{RosSystem}
		//	'RosSystem'
		//	'{' ('Name' Name=EString)? ('RosComponents' '(' RosComponent+=[componentInterface::ComponentInterface|EString] (","
		//	RosComponent+=[componentInterface::ComponentInterface|EString])* ')')? ('TopicConnections' '{'
		//	TopicConnections+=TopicConnection ("," TopicConnections+=TopicConnection)* '}')? ('ServiceConnections' '{'
		//	ServiceConnections+=ServiceConnection ("," ServiceConnections+=ServiceConnection)* '}')?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{RosSystem} 'RosSystem' '{' ('Name' Name=EString)? ('RosComponents' '('
		//RosComponent+=[componentInterface::ComponentInterface|EString] (","
		//RosComponent+=[componentInterface::ComponentInterface|EString])* ')')? ('TopicConnections' '{'
		//TopicConnections+=TopicConnection ("," TopicConnections+=TopicConnection)* '}')? ('ServiceConnections' '{'
		//ServiceConnections+=ServiceConnection ("," ServiceConnections+=ServiceConnection)* '}')? '}'
		public Group getGroup() { return cGroup; }
		
		//{RosSystem}
		public Action getRosSystemAction_0() { return cRosSystemAction_0; }
		
		//'RosSystem'
		public Keyword getRosSystemKeyword_1() { return cRosSystemKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('Name' Name=EString)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'Name'
		public Keyword getNameKeyword_3_0() { return cNameKeyword_3_0; }
		
		//Name=EString
		public Assignment getNameAssignment_3_1() { return cNameAssignment_3_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_3_1_0() { return cNameEStringParserRuleCall_3_1_0; }
		
		//('RosComponents' '(' RosComponent+=[componentInterface::ComponentInterface|EString] (","
		//RosComponent+=[componentInterface::ComponentInterface|EString])* ')')?
		public Group getGroup_4() { return cGroup_4; }
		
		//'RosComponents'
		public Keyword getRosComponentsKeyword_4_0() { return cRosComponentsKeyword_4_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_4_1() { return cLeftParenthesisKeyword_4_1; }
		
		//RosComponent+=[componentInterface::ComponentInterface|EString]
		public Assignment getRosComponentAssignment_4_2() { return cRosComponentAssignment_4_2; }
		
		//[componentInterface::ComponentInterface|EString]
		public CrossReference getRosComponentComponentInterfaceCrossReference_4_2_0() { return cRosComponentComponentInterfaceCrossReference_4_2_0; }
		
		//EString
		public RuleCall getRosComponentComponentInterfaceEStringParserRuleCall_4_2_0_1() { return cRosComponentComponentInterfaceEStringParserRuleCall_4_2_0_1; }
		
		//("," RosComponent+=[componentInterface::ComponentInterface|EString])*
		public Group getGroup_4_3() { return cGroup_4_3; }
		
		//","
		public Keyword getCommaKeyword_4_3_0() { return cCommaKeyword_4_3_0; }
		
		//RosComponent+=[componentInterface::ComponentInterface|EString]
		public Assignment getRosComponentAssignment_4_3_1() { return cRosComponentAssignment_4_3_1; }
		
		//[componentInterface::ComponentInterface|EString]
		public CrossReference getRosComponentComponentInterfaceCrossReference_4_3_1_0() { return cRosComponentComponentInterfaceCrossReference_4_3_1_0; }
		
		//EString
		public RuleCall getRosComponentComponentInterfaceEStringParserRuleCall_4_3_1_0_1() { return cRosComponentComponentInterfaceEStringParserRuleCall_4_3_1_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4_4() { return cRightParenthesisKeyword_4_4; }
		
		//('TopicConnections' '{' TopicConnections+=TopicConnection ("," TopicConnections+=TopicConnection)* '}')?
		public Group getGroup_5() { return cGroup_5; }
		
		//'TopicConnections'
		public Keyword getTopicConnectionsKeyword_5_0() { return cTopicConnectionsKeyword_5_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5_1() { return cLeftCurlyBracketKeyword_5_1; }
		
		//TopicConnections+=TopicConnection
		public Assignment getTopicConnectionsAssignment_5_2() { return cTopicConnectionsAssignment_5_2; }
		
		//TopicConnection
		public RuleCall getTopicConnectionsTopicConnectionParserRuleCall_5_2_0() { return cTopicConnectionsTopicConnectionParserRuleCall_5_2_0; }
		
		//("," TopicConnections+=TopicConnection)*
		public Group getGroup_5_3() { return cGroup_5_3; }
		
		//","
		public Keyword getCommaKeyword_5_3_0() { return cCommaKeyword_5_3_0; }
		
		//TopicConnections+=TopicConnection
		public Assignment getTopicConnectionsAssignment_5_3_1() { return cTopicConnectionsAssignment_5_3_1; }
		
		//TopicConnection
		public RuleCall getTopicConnectionsTopicConnectionParserRuleCall_5_3_1_0() { return cTopicConnectionsTopicConnectionParserRuleCall_5_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5_4() { return cRightCurlyBracketKeyword_5_4; }
		
		//('ServiceConnections' '{' ServiceConnections+=ServiceConnection ("," ServiceConnections+=ServiceConnection)* '}')?
		public Group getGroup_6() { return cGroup_6; }
		
		//'ServiceConnections'
		public Keyword getServiceConnectionsKeyword_6_0() { return cServiceConnectionsKeyword_6_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_6_1() { return cLeftCurlyBracketKeyword_6_1; }
		
		//ServiceConnections+=ServiceConnection
		public Assignment getServiceConnectionsAssignment_6_2() { return cServiceConnectionsAssignment_6_2; }
		
		//ServiceConnection
		public RuleCall getServiceConnectionsServiceConnectionParserRuleCall_6_2_0() { return cServiceConnectionsServiceConnectionParserRuleCall_6_2_0; }
		
		//("," ServiceConnections+=ServiceConnection)*
		public Group getGroup_6_3() { return cGroup_6_3; }
		
		//","
		public Keyword getCommaKeyword_6_3_0() { return cCommaKeyword_6_3_0; }
		
		//ServiceConnections+=ServiceConnection
		public Assignment getServiceConnectionsAssignment_6_3_1() { return cServiceConnectionsAssignment_6_3_1; }
		
		//ServiceConnection
		public RuleCall getServiceConnectionsServiceConnectionParserRuleCall_6_3_1_0() { return cServiceConnectionsServiceConnectionParserRuleCall_6_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6_4() { return cRightCurlyBracketKeyword_6_4; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class TopicConnectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.rossystem.RosSystem.TopicConnection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTopicConnectionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFromTopicKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFromTopicAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cFromTopicRosPublisherCrossReference_3_0 = (CrossReference)cFromTopicAssignment_3.eContents().get(0);
		private final RuleCall cFromTopicRosPublisherEStringParserRuleCall_3_0_1 = (RuleCall)cFromTopicRosPublisherCrossReference_3_0.eContents().get(1);
		private final Keyword cToTopicKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cToTopicAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cToTopicRosSubscriberCrossReference_5_0 = (CrossReference)cToTopicAssignment_5.eContents().get(0);
		private final RuleCall cToTopicRosSubscriberEStringParserRuleCall_5_0_1 = (RuleCall)cToTopicRosSubscriberCrossReference_5_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//TopicConnection:
		//	'TopicConnection'
		//	'{'
		//	'FromTopic' FromTopic=[componentInterface::RosPublisher|EString]
		//	'ToTopic' ToTopic=[componentInterface::RosSubscriber|EString]
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'TopicConnection' '{' 'FromTopic' FromTopic=[componentInterface::RosPublisher|EString] 'ToTopic'
		//ToTopic=[componentInterface::RosSubscriber|EString] '}'
		public Group getGroup() { return cGroup; }
		
		//'TopicConnection'
		public Keyword getTopicConnectionKeyword_0() { return cTopicConnectionKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'FromTopic'
		public Keyword getFromTopicKeyword_2() { return cFromTopicKeyword_2; }
		
		//FromTopic=[componentInterface::RosPublisher|EString]
		public Assignment getFromTopicAssignment_3() { return cFromTopicAssignment_3; }
		
		//[componentInterface::RosPublisher|EString]
		public CrossReference getFromTopicRosPublisherCrossReference_3_0() { return cFromTopicRosPublisherCrossReference_3_0; }
		
		//EString
		public RuleCall getFromTopicRosPublisherEStringParserRuleCall_3_0_1() { return cFromTopicRosPublisherEStringParserRuleCall_3_0_1; }
		
		//'ToTopic'
		public Keyword getToTopicKeyword_4() { return cToTopicKeyword_4; }
		
		//ToTopic=[componentInterface::RosSubscriber|EString]
		public Assignment getToTopicAssignment_5() { return cToTopicAssignment_5; }
		
		//[componentInterface::RosSubscriber|EString]
		public CrossReference getToTopicRosSubscriberCrossReference_5_0() { return cToTopicRosSubscriberCrossReference_5_0; }
		
		//EString
		public RuleCall getToTopicRosSubscriberEStringParserRuleCall_5_0_1() { return cToTopicRosSubscriberEStringParserRuleCall_5_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class ServiceConnectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.rossystem.RosSystem.ServiceConnection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cServiceConnectionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFromSrvKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFromSrvAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cFromSrvRosServiceServerCrossReference_3_0 = (CrossReference)cFromSrvAssignment_3.eContents().get(0);
		private final RuleCall cFromSrvRosServiceServerEStringParserRuleCall_3_0_1 = (RuleCall)cFromSrvRosServiceServerCrossReference_3_0.eContents().get(1);
		private final Keyword cToSrvKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cToSrvAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cToSrvRosServiceClientCrossReference_5_0 = (CrossReference)cToSrvAssignment_5.eContents().get(0);
		private final RuleCall cToSrvRosServiceClientEStringParserRuleCall_5_0_1 = (RuleCall)cToSrvRosServiceClientCrossReference_5_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//ServiceConnection:
		//	'ServiceConnection'
		//	'{'
		//	'FromSrv' FromSrv=[componentInterface::RosServiceServer|EString]
		//	'ToSrv' ToSrv=[componentInterface::RosServiceClient|EString]
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'ServiceConnection' '{' 'FromSrv' FromSrv=[componentInterface::RosServiceServer|EString] 'ToSrv'
		//ToSrv=[componentInterface::RosServiceClient|EString] '}'
		public Group getGroup() { return cGroup; }
		
		//'ServiceConnection'
		public Keyword getServiceConnectionKeyword_0() { return cServiceConnectionKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'FromSrv'
		public Keyword getFromSrvKeyword_2() { return cFromSrvKeyword_2; }
		
		//FromSrv=[componentInterface::RosServiceServer|EString]
		public Assignment getFromSrvAssignment_3() { return cFromSrvAssignment_3; }
		
		//[componentInterface::RosServiceServer|EString]
		public CrossReference getFromSrvRosServiceServerCrossReference_3_0() { return cFromSrvRosServiceServerCrossReference_3_0; }
		
		//EString
		public RuleCall getFromSrvRosServiceServerEStringParserRuleCall_3_0_1() { return cFromSrvRosServiceServerEStringParserRuleCall_3_0_1; }
		
		//'ToSrv'
		public Keyword getToSrvKeyword_4() { return cToSrvKeyword_4; }
		
		//ToSrv=[componentInterface::RosServiceClient|EString]
		public Assignment getToSrvAssignment_5() { return cToSrvAssignment_5; }
		
		//[componentInterface::RosServiceClient|EString]
		public CrossReference getToSrvRosServiceClientCrossReference_5_0() { return cToSrvRosServiceClientCrossReference_5_0; }
		
		//EString
		public RuleCall getToSrvRosServiceClientEStringParserRuleCall_5_0_1() { return cToSrvRosServiceClientEStringParserRuleCall_5_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.rossystem.RosSystem.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	
	
	private final RosSystemElements pRosSystem;
	private final TopicConnectionElements pTopicConnection;
	private final ServiceConnectionElements pServiceConnection;
	private final EStringElements pEString;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public RosSystemGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pRosSystem = new RosSystemElements();
		this.pTopicConnection = new TopicConnectionElements();
		this.pServiceConnection = new ServiceConnectionElements();
		this.pEString = new EStringElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("de.fraunhofer.ipa.rossystem.RosSystem".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//RosSystem:
	//	{RosSystem}
	//	'RosSystem'
	//	'{' ('Name' Name=EString)? ('RosComponents' '(' RosComponent+=[componentInterface::ComponentInterface|EString] (","
	//	RosComponent+=[componentInterface::ComponentInterface|EString])* ')')? ('TopicConnections' '{'
	//	TopicConnections+=TopicConnection ("," TopicConnections+=TopicConnection)* '}')? ('ServiceConnections' '{'
	//	ServiceConnections+=ServiceConnection ("," ServiceConnections+=ServiceConnection)* '}')?
	//	'}';
	public RosSystemElements getRosSystemAccess() {
		return pRosSystem;
	}
	
	public ParserRule getRosSystemRule() {
		return getRosSystemAccess().getRule();
	}
	
	//TopicConnection:
	//	'TopicConnection'
	//	'{'
	//	'FromTopic' FromTopic=[componentInterface::RosPublisher|EString]
	//	'ToTopic' ToTopic=[componentInterface::RosSubscriber|EString]
	//	'}';
	public TopicConnectionElements getTopicConnectionAccess() {
		return pTopicConnection;
	}
	
	public ParserRule getTopicConnectionRule() {
		return getTopicConnectionAccess().getRule();
	}
	
	//ServiceConnection:
	//	'ServiceConnection'
	//	'{'
	//	'FromSrv' FromSrv=[componentInterface::RosServiceServer|EString]
	//	'ToSrv' ToSrv=[componentInterface::RosServiceClient|EString]
	//	'}';
	public ServiceConnectionElements getServiceConnectionAccess() {
		return pServiceConnection;
	}
	
	public ParserRule getServiceConnectionRule() {
		return getServiceConnectionAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}