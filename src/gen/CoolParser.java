// Generated from D:/MyCompiler/src/main/grammar\Cool.g4 by ANTLR 4.8
package gen;

    import main.handler.Handler;
    import main.model.Variable;
    
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, PROGRAM=16, 
		MAIN=17, INTEGER_NAME=18, STRING_NAME=19, UNIT_NAME=20, VAR=21, PRINT=22, 
		LENGTH=23, RETURN=24, FUNCTION=25, FOR=26, WHILE=27, IF=28, ELSE=29, SYMB=30, 
		STRING=31, CHARACTER=32, INTEGER=33, WORD=34, WS=35;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_assigment = 2, RULE_typeVariable = 3, 
		RULE_typeFunction = 4, RULE_name = 5, RULE_value = 6, RULE_expression = 7, 
		RULE_relation = 8, RULE_statement = 9, RULE_ifStatement = 10, RULE_whileStatement = 11, 
		RULE_forStatement = 12, RULE_function = 13, RULE_functionCall = 14, RULE_parameters = 15, 
		RULE_parameter = 16, RULE_print = 17, RULE_length = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "assigment", "typeVariable", "typeFunction", 
			"name", "value", "expression", "relation", "statement", "ifStatement", 
			"whileStatement", "forStatement", "function", "functionCall", "parameters", 
			"parameter", "print", "length"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'()'", "'}'", "' = '", "';'", "'('", "')'", "'\"'", "'=='", 
			"'!='", "'<'", "'<='", "'>'", "'>='", "','", "'Program'", "'main'", "'Integer'", 
			"'String'", "'Unit'", "'var'", "'print'", "'length'", "'return'", "'function'", 
			"'for'", "'while'", "'if'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "PROGRAM", "MAIN", "INTEGER_NAME", "STRING_NAME", 
			"UNIT_NAME", "VAR", "PRINT", "LENGTH", "RETURN", "FUNCTION", "FOR", "WHILE", 
			"IF", "ELSE", "SYMB", "STRING", "CHARACTER", "INTEGER", "WORD", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Cool.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private Handler handler = new Handler();
	    
	public CoolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public NameContext name;
		public TerminalNode PROGRAM() { return getToken(CoolParser.PROGRAM, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(CoolParser.FUNCTION, 0); }
		public TerminalNode UNIT_NAME() { return getToken(CoolParser.UNIT_NAME, 0); }
		public TerminalNode MAIN() { return getToken(CoolParser.MAIN, 0); }
		public List<TerminalNode> WS() { return getTokens(CoolParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CoolParser.WS, i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<AssigmentContext> assigment() {
			return getRuleContexts(AssigmentContext.class);
		}
		public AssigmentContext assigment(int i) {
			return getRuleContext(AssigmentContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(PROGRAM);
			setState(39);
			((ProgramContext)_localctx).name = name();
			handler.createResultFile((((ProgramContext)_localctx).name!=null?_input.getText(((ProgramContext)_localctx).name.start,((ProgramContext)_localctx).name.stop):null));
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(41);
				match(WS);
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			match(T__0);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(48);
				match(WS);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(54);
					function();
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(60);
			match(FUNCTION);
			setState(61);
			match(UNIT_NAME);
			setState(62);
			match(MAIN);
			setState(63);
			match(T__1);
			setState(64);
			match(T__0);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(71);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(65);
						declaration();
						}
						break;
					case 2:
						{
						setState(66);
						assigment();
						}
						break;
					case 3:
						{
						setState(67);
						expression();
						}
						break;
					case 4:
						{
						setState(68);
						statement();
						}
						break;
					case 5:
						{
						setState(69);
						functionCall();
						}
						break;
					case 6:
						{
						setState(70);
						print();
						}
						break;
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(76);
				match(WS);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(T__2);
			setState(83);
			match(T__2);
			handler.closeFile();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public NameContext name;
		public ValueContext value;
		public ExpressionContext expression;
		public FunctionCallContext functionCall;
		public LengthContext length;
		public TerminalNode VAR() { return getToken(CoolParser.VAR, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(CoolParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CoolParser.WS, i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(86);
				match(WS);
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(VAR);
			setState(93);
			((DeclarationContext)_localctx).name = name();
			handler.addVariable(new Variable((((DeclarationContext)_localctx).name!=null?_input.getText(((DeclarationContext)_localctx).name.start,((DeclarationContext)_localctx).name.stop):null), handler.scope));
			setState(95);
			match(T__3);
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(96);
				((DeclarationContext)_localctx).value = value();
				setState(97);
				match(T__4);
				handler.getVariable((((DeclarationContext)_localctx).name!=null?_input.getText(((DeclarationContext)_localctx).name.start,((DeclarationContext)_localctx).name.stop):null)).setValue(((DeclarationContext)_localctx).value.val);
				                             handler.getVariable((((DeclarationContext)_localctx).name!=null?_input.getText(((DeclarationContext)_localctx).name.start,((DeclarationContext)_localctx).name.stop):null)).setType(((DeclarationContext)_localctx).value.type);
				}
				break;
			case 2:
				{
				setState(100);
				((DeclarationContext)_localctx).expression = expression();
				setState(101);
				match(T__4);
				handler.getVariable((((DeclarationContext)_localctx).name!=null?_input.getText(((DeclarationContext)_localctx).name.start,((DeclarationContext)_localctx).name.stop):null)).setValue(((DeclarationContext)_localctx).expression.val);
				                             handler.getVariable((((DeclarationContext)_localctx).name!=null?_input.getText(((DeclarationContext)_localctx).name.start,((DeclarationContext)_localctx).name.stop):null)).setType(((DeclarationContext)_localctx).expression.type);
				}
				break;
			case 3:
				{
				setState(104);
				((DeclarationContext)_localctx).functionCall = functionCall();
				handler.getVariable((((DeclarationContext)_localctx).name!=null?_input.getText(((DeclarationContext)_localctx).name.start,((DeclarationContext)_localctx).name.stop):null)).setValue(((DeclarationContext)_localctx).functionCall.val);
				                             handler.getVariable((((DeclarationContext)_localctx).name!=null?_input.getText(((DeclarationContext)_localctx).name.start,((DeclarationContext)_localctx).name.stop):null)).setType(((DeclarationContext)_localctx).functionCall.type);
				}
				break;
			case 4:
				{
				setState(107);
				((DeclarationContext)_localctx).length = length();
				setState(108);
				match(T__4);
				handler.getVariable((((DeclarationContext)_localctx).name!=null?_input.getText(((DeclarationContext)_localctx).name.start,((DeclarationContext)_localctx).name.stop):null)).setValue(((DeclarationContext)_localctx).length.val);
				                             handler.getVariable((((DeclarationContext)_localctx).name!=null?_input.getText(((DeclarationContext)_localctx).name.start,((DeclarationContext)_localctx).name.stop):null)).setType("Integer");
				}
				break;
			}
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(113);
					match(WS);
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			handler.writeDeclaration(handler.scope);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssigmentContext extends ParserRuleContext {
		public NameContext name;
		public TypeVariableContext typeVariable;
		public ValueContext value;
		public ExpressionContext expression;
		public FunctionCallContext functionCall;
		public LengthContext length;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(CoolParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CoolParser.WS, i);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public AssigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterAssigment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitAssigment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitAssigment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssigmentContext assigment() throws RecognitionException {
		AssigmentContext _localctx = new AssigmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assigment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(121);
				match(WS);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			((AssigmentContext)_localctx).name = name();
			setState(128);
			match(T__3);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(129);
				match(T__5);
				setState(130);
				((AssigmentContext)_localctx).typeVariable = typeVariable();
				setState(131);
				match(T__6);
				}
			}

			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(135);
				((AssigmentContext)_localctx).value = value();
				setState(136);
				match(T__4);
				handler.getVariable((((AssigmentContext)_localctx).name!=null?_input.getText(((AssigmentContext)_localctx).name.start,((AssigmentContext)_localctx).name.stop):null)).setValue(((AssigmentContext)_localctx).value.val);
				}
				break;
			case 2:
				{
				setState(139);
				((AssigmentContext)_localctx).expression = expression();
				setState(140);
				match(T__4);
				handler.getVariable((((AssigmentContext)_localctx).name!=null?_input.getText(((AssigmentContext)_localctx).name.start,((AssigmentContext)_localctx).name.stop):null)).setValue(((AssigmentContext)_localctx).expression.val);
				}
				break;
			case 3:
				{
				setState(143);
				((AssigmentContext)_localctx).functionCall = functionCall();
				handler.getVariable((((AssigmentContext)_localctx).name!=null?_input.getText(((AssigmentContext)_localctx).name.start,((AssigmentContext)_localctx).name.stop):null)).setValue(((AssigmentContext)_localctx).functionCall.val);
				}
				break;
			case 4:
				{
				setState(146);
				((AssigmentContext)_localctx).length = length();
				setState(147);
				match(T__4);
				handler.getVariable((((AssigmentContext)_localctx).name!=null?_input.getText(((AssigmentContext)_localctx).name.start,((AssigmentContext)_localctx).name.stop):null)).setValue(((AssigmentContext)_localctx).length.val);
				}
				break;
			}
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(152);
					match(WS);
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			handler.writeAssigment(handler.scope, (((AssigmentContext)_localctx).name!=null?_input.getText(((AssigmentContext)_localctx).name.start,((AssigmentContext)_localctx).name.stop):null), (((AssigmentContext)_localctx).typeVariable!=null?_input.getText(((AssigmentContext)_localctx).typeVariable.start,((AssigmentContext)_localctx).typeVariable.stop):null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeVariableContext extends ParserRuleContext {
		public TerminalNode INTEGER_NAME() { return getToken(CoolParser.INTEGER_NAME, 0); }
		public TerminalNode STRING_NAME() { return getToken(CoolParser.STRING_NAME, 0); }
		public TypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitTypeVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitTypeVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVariableContext typeVariable() throws RecognitionException {
		TypeVariableContext _localctx = new TypeVariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !(_la==INTEGER_NAME || _la==STRING_NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeFunctionContext extends ParserRuleContext {
		public TerminalNode INTEGER_NAME() { return getToken(CoolParser.INTEGER_NAME, 0); }
		public TerminalNode STRING_NAME() { return getToken(CoolParser.STRING_NAME, 0); }
		public TerminalNode UNIT_NAME() { return getToken(CoolParser.UNIT_NAME, 0); }
		public TypeFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterTypeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitTypeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitTypeFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeFunctionContext typeFunction() throws RecognitionException {
		TypeFunctionContext _localctx = new TypeFunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_NAME) | (1L << STRING_NAME) | (1L << UNIT_NAME))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CoolParser.STRING, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public String val;
		public String type;
		public Token STRING;
		public Token INTEGER;
		public Token CHARACTER;
		public TerminalNode STRING() { return getToken(CoolParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(CoolParser.INTEGER, 0); }
		public TerminalNode CHARACTER() { return getToken(CoolParser.CHARACTER, 0); }
		public List<TerminalNode> WS() { return getTokens(CoolParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CoolParser.WS, i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(166);
				match(T__7);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(167);
					match(WS);
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(173);
				((ValueContext)_localctx).STRING = match(STRING);
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(174);
					match(WS);
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(180);
				match(T__7);
				((ValueContext)_localctx).val =  "\"" + (((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null) + "\""; ((ValueContext)_localctx).type =  "String";
				}
				break;
			case 2:
				{
				setState(182);
				((ValueContext)_localctx).STRING = match(STRING);
				((ValueContext)_localctx).val =  (((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null); ((ValueContext)_localctx).type =  "String";
				}
				break;
			case 3:
				{
				setState(184);
				((ValueContext)_localctx).INTEGER = match(INTEGER);
				((ValueContext)_localctx).val =  (((ValueContext)_localctx).INTEGER!=null?((ValueContext)_localctx).INTEGER.getText():null); ((ValueContext)_localctx).type =  "Integer";
				}
				break;
			case 4:
				{
				setState(186);
				match(T__7);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(187);
					match(WS);
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(193);
				((ValueContext)_localctx).INTEGER = match(INTEGER);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(194);
					match(WS);
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(200);
				match(T__7);
				((ValueContext)_localctx).val =  "\"" + (((ValueContext)_localctx).INTEGER!=null?((ValueContext)_localctx).INTEGER.getText():null) + "\""; ((ValueContext)_localctx).type =  "String";
				}
				break;
			case 5:
				{
				setState(202);
				((ValueContext)_localctx).CHARACTER = match(CHARACTER);
				((ValueContext)_localctx).val =  (((ValueContext)_localctx).CHARACTER!=null?((ValueContext)_localctx).CHARACTER.getText():null); ((ValueContext)_localctx).type =  "Character";
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public String val;
		public String type;
		public ValueContext s1;
		public Token SYMB;
		public ValueContext s2;
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(CoolParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CoolParser.WS, i);
		}
		public List<TerminalNode> SYMB() { return getTokens(CoolParser.SYMB); }
		public TerminalNode SYMB(int i) {
			return getToken(CoolParser.SYMB, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(206);
				match(WS);
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212);
			((ExpressionContext)_localctx).s1 = value();
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(213);
					match(WS);
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			((ExpressionContext)_localctx).val =  (((ExpressionContext)_localctx).s1!=null?_input.getText(((ExpressionContext)_localctx).s1.start,((ExpressionContext)_localctx).s1.stop):null); ((ExpressionContext)_localctx).type =  ((ExpressionContext)_localctx).s1.type;
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYMB) {
				{
				{
				setState(220);
				((ExpressionContext)_localctx).SYMB = match(SYMB);
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(221);
						match(WS);
						}
						} 
					}
					setState(226);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(227);
						((ExpressionContext)_localctx).s2 = value();
						}
						} 
					}
					setState(232);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(233);
						match(WS);
						}
						} 
					}
					setState(238);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}

				                                        if ((((ExpressionContext)_localctx).s2!=null?_input.getText(((ExpressionContext)_localctx).s2.start,((ExpressionContext)_localctx).s2.stop):null)!=null) {
				                                            if (((ExpressionContext)_localctx).s1.type.equals("String")){
				                                                ((ExpressionContext)_localctx).val =  _localctx.val + handler.createStringExpression((((ExpressionContext)_localctx).SYMB!=null?((ExpressionContext)_localctx).SYMB.getText():null), _localctx.val, (((ExpressionContext)_localctx).s2!=null?_input.getText(((ExpressionContext)_localctx).s2.start,((ExpressionContext)_localctx).s2.stop):null));
				                                            } else if (((ExpressionContext)_localctx).s1.type.equals("Integer")) {
				                                                ((ExpressionContext)_localctx).val =  _localctx.val + handler.createIntExpression((((ExpressionContext)_localctx).SYMB!=null?((ExpressionContext)_localctx).SYMB.getText():null), (((ExpressionContext)_localctx).s2!=null?_input.getText(((ExpressionContext)_localctx).s2.start,((ExpressionContext)_localctx).s2.stop):null));
				                                            } else if (((ExpressionContext)_localctx).s1.type.equals("Character")) {
				                                                ((ExpressionContext)_localctx).val =  _localctx.val + handler.createCharExpression();
				                                            }
				                                        } else {
				                                            ((ExpressionContext)_localctx).val =  _localctx.val + " " + (((ExpressionContext)_localctx).SYMB!=null?((ExpressionContext)_localctx).SYMB.getText():null);
				                                        }
				                                      
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public String firstVal;
		public String secondVal;
		public String sign;
		public ValueContext value;
		public LengthContext length;
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(CoolParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CoolParser.WS, i);
		}
		public List<LengthContext> length() {
			return getRuleContexts(LengthContext.class);
		}
		public LengthContext length(int i) {
			return getRuleContext(LengthContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_relation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(245);
				match(WS);
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
			((RelationContext)_localctx).value = value();
			((RelationContext)_localctx).firstVal =  ((RelationContext)_localctx).value.val;
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(253);
					match(WS);
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) {
				{
				{
				setState(271);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(259);
					match(T__8);
					((RelationContext)_localctx).sign = "==";
					}
					break;
				case T__9:
					{
					setState(261);
					match(T__9);
					((RelationContext)_localctx).sign = "!=";
					}
					break;
				case T__10:
					{
					setState(263);
					match(T__10);
					((RelationContext)_localctx).sign = "<";
					}
					break;
				case T__11:
					{
					setState(265);
					match(T__11);
					((RelationContext)_localctx).sign = "<=";
					}
					break;
				case T__12:
					{
					setState(267);
					match(T__12);
					((RelationContext)_localctx).sign = ">";
					}
					break;
				case T__13:
					{
					setState(269);
					match(T__13);
					((RelationContext)_localctx).sign = ">=";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(273);
					match(WS);
					}
					}
					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(285);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LENGTH:
					{
					setState(279);
					((RelationContext)_localctx).length = length();
					((RelationContext)_localctx).secondVal =  ((RelationContext)_localctx).length.val;
					}
					break;
				case T__7:
				case STRING:
				case CHARACTER:
				case INTEGER:
					{
					setState(282);
					((RelationContext)_localctx).value = value();
					((RelationContext)_localctx).secondVal =  ((RelationContext)_localctx).value.val;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(287);
						match(WS);
						}
						} 
					}
					setState(292);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				ifStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				whileStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				forStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public RelationContext relation;
		public ExpressionContext expression;
		public TerminalNode IF() { return getToken(CoolParser.IF, 0); }
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<AssigmentContext> assigment() {
			return getRuleContexts(AssigmentContext.class);
		}
		public AssigmentContext assigment(int i) {
			return getRuleContext(AssigmentContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(CoolParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CoolParser.WS, i);
		}
		public List<TerminalNode> ELSE() { return getTokens(CoolParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(CoolParser.ELSE, i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(IF);
			setState(304);
			match(T__5);
			setState(305);
			((IfStatementContext)_localctx).relation = relation();
			handler.createIfHeader(((IfStatementContext)_localctx).relation.firstVal, ((IfStatementContext)_localctx).relation.secondVal, ((IfStatementContext)_localctx).relation.sign, handler.scope);
			setState(307);
			match(T__6);
			setState(308);
			match(T__0);
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(323);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(309);
						declaration();
						}
						break;
					case 2:
						{
						setState(310);
						assigment();
						}
						break;
					case 3:
						{
						setState(311);
						((IfStatementContext)_localctx).expression = expression();
						setState(315);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(312);
								match(WS);
								}
								} 
							}
							setState(317);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
						}
						handler.createRelationBody(((IfStatementContext)_localctx).expression.val, handler.scope);
						}
						break;
					case 4:
						{
						setState(320);
						functionCall();
						}
						break;
					case 5:
						{
						setState(321);
						statement();
						}
						break;
					case 6:
						{
						setState(322);
						print();
						}
						break;
					}
					} 
				}
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(328);
				match(WS);
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
			match(T__2);
			handler.closeRelation(handler.scope);
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE) {
				{
				{
				setState(336);
				match(ELSE);
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(337);
					match(WS);
					}
					}
					setState(342);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(343);
				match(T__0);
				handler.createElseHeader();
				setState(361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(359);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
						case 1:
							{
							setState(345);
							declaration();
							}
							break;
						case 2:
							{
							setState(346);
							assigment();
							}
							break;
						case 3:
							{
							setState(347);
							((IfStatementContext)_localctx).expression = expression();
							setState(351);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(348);
									match(WS);
									}
									} 
								}
								setState(353);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
							}
							handler.createRelationBody(((IfStatementContext)_localctx).expression.val + ";", handler.scope);
							}
							break;
						case 4:
							{
							setState(356);
							functionCall();
							}
							break;
						case 5:
							{
							setState(357);
							statement();
							}
							break;
						case 6:
							{
							setState(358);
							print();
							}
							break;
						}
						} 
					}
					setState(363);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(364);
					match(WS);
					}
					}
					setState(369);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(370);
				match(T__2);
				handler.closeRelation(handler.scope);
				}
				}
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(380);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(377);
					match(WS);
					}
					} 
				}
				setState(382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(386);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(383);
					match(WS);
					}
					} 
				}
				setState(388);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public RelationContext relation;
		public ExpressionContext expression;
		public TerminalNode WHILE() { return getToken(CoolParser.WHILE, 0); }
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(CoolParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CoolParser.WS, i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<AssigmentContext> assigment() {
			return getRuleContexts(AssigmentContext.class);
		}
		public AssigmentContext assigment(int i) {
			return getRuleContext(AssigmentContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whileStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(WHILE);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(390);
				match(WS);
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(396);
			match(T__5);
			setState(400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(397);
					match(WS);
					}
					} 
				}
				setState(402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(403);
			((WhileStatementContext)_localctx).relation = relation();
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(404);
				match(WS);
				}
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(410);
			match(T__6);
			handler.createWhileHeader(((WhileStatementContext)_localctx).relation.firstVal, ((WhileStatementContext)_localctx).relation.secondVal, ((WhileStatementContext)_localctx).relation.sign, handler.scope);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(412);
				match(WS);
				}
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(418);
			match(T__0);
			setState(447);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(445);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						setState(422);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(419);
								match(WS);
								}
								} 
							}
							setState(424);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
						}
						setState(425);
						declaration();
						}
						break;
					case 2:
						{
						setState(426);
						assigment();
						}
						break;
					case 3:
						{
						setState(427);
						((WhileStatementContext)_localctx).expression = expression();
						setState(431);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(428);
								match(WS);
								}
								} 
							}
							setState(433);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
						}
						handler.createRelationBody(((WhileStatementContext)_localctx).expression.val + ";", handler.scope);
						}
						break;
					case 4:
						{
						setState(436);
						functionCall();
						}
						break;
					case 5:
						{
						setState(437);
						statement();
						}
						break;
					case 6:
						{
						setState(438);
						print();
						setState(442);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(439);
								match(WS);
								}
								} 
							}
							setState(444);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
						}
						}
						break;
					}
					} 
				}
				setState(449);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(450);
				match(WS);
				}
				}
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(456);
			match(T__2);
			setState(460);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(457);
					match(WS);
					}
					} 
				}
				setState(462);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			handler.closeRelation(handler.scope);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public RelationContext relation;
		public ExpressionContext expression;
		public TerminalNode FOR() { return getToken(CoolParser.FOR, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(CoolParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CoolParser.WS, i);
		}
		public List<AssigmentContext> assigment() {
			return getRuleContexts(AssigmentContext.class);
		}
		public AssigmentContext assigment(int i) {
			return getRuleContext(AssigmentContext.class,i);
		}
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(FOR);
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(466);
				match(WS);
				}
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(472);
			match(T__5);
			setState(476);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(473);
					match(WS);
					}
					} 
				}
				setState(478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			handler.isDeclarationInFor = true;
			setState(480);
			declaration();
			setState(484);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(481);
					match(WS);
					}
					} 
				}
				setState(486);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(487);
			((ForStatementContext)_localctx).relation = relation();
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(488);
				match(WS);
				}
				}
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(494);
			match(T__4);
			setState(498);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(495);
					match(WS);
					}
					} 
				}
				setState(500);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			setState(501);
			((ForStatementContext)_localctx).expression = expression();
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(502);
				match(WS);
				}
				}
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(508);
			match(T__6);
			setState(509);
			match(T__0);
			handler.createForHeader(((ForStatementContext)_localctx).relation.firstVal, ((ForStatementContext)_localctx).relation.secondVal, ((ForStatementContext)_localctx).relation.sign, ((ForStatementContext)_localctx).expression.val, handler.scope);
			setState(538);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(536);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
					case 1:
						{
						setState(514);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(511);
								match(WS);
								}
								} 
							}
							setState(516);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
						}
						setState(517);
						declaration();
						}
						break;
					case 2:
						{
						setState(518);
						assigment();
						}
						break;
					case 3:
						{
						setState(519);
						((ForStatementContext)_localctx).expression = expression();
						handler.createRelationBody(((ForStatementContext)_localctx).expression.val + ";", handler.scope);
						setState(524);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(521);
								match(WS);
								}
								} 
							}
							setState(526);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
						}
						}
						break;
					case 4:
						{
						setState(527);
						functionCall();
						}
						break;
					case 5:
						{
						setState(528);
						statement();
						}
						break;
					case 6:
						{
						setState(529);
						print();
						setState(533);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(530);
								match(WS);
								}
								} 
							}
							setState(535);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
						}
						}
						break;
					}
					} 
				}
				setState(540);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(541);
				match(WS);
				}
				}
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(547);
			match(T__2);
			setState(551);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(548);
					match(WS);
					}
					} 
				}
				setState(553);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			handler.closeRelation(handler.scope);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public String val;
		public TypeFunctionContext typeFunction;
		public NameContext name;
		public ParametersContext parameters;
		public ExpressionContext expression;
		public TerminalNode FUNCTION() { return getToken(CoolParser.FUNCTION, 0); }
		public TypeFunctionContext typeFunction() {
			return getRuleContext(TypeFunctionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(CoolParser.RETURN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(CoolParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CoolParser.WS, i);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<AssigmentContext> assigment() {
			return getRuleContexts(AssigmentContext.class);
		}
		public AssigmentContext assigment(int i) {
			return getRuleContext(AssigmentContext.class,i);
		}
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(FUNCTION);
			setState(557);
			((FunctionContext)_localctx).typeFunction = typeFunction();
			setState(558);
			((FunctionContext)_localctx).name = name();
			handler.scope = (((FunctionContext)_localctx).name!=null?_input.getText(((FunctionContext)_localctx).name.start,((FunctionContext)_localctx).name.stop):null); handler.addFunction((((FunctionContext)_localctx).name!=null?_input.getText(((FunctionContext)_localctx).name.start,((FunctionContext)_localctx).name.stop):null), (((FunctionContext)_localctx).typeFunction!=null?_input.getText(((FunctionContext)_localctx).typeFunction.start,((FunctionContext)_localctx).typeFunction.stop):null));
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(560);
				match(WS);
				}
				}
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(566);
			match(T__5);
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_NAME) | (1L << STRING_NAME) | (1L << STRING))) != 0)) {
				{
				setState(567);
				((FunctionContext)_localctx).parameters = parameters();
				}
			}

			setState(570);
			match(T__6);
			handler.createFunctionHeader((((FunctionContext)_localctx).typeFunction!=null?_input.getText(((FunctionContext)_localctx).typeFunction.start,((FunctionContext)_localctx).typeFunction.stop):null), (((FunctionContext)_localctx).name!=null?_input.getText(((FunctionContext)_localctx).name.start,((FunctionContext)_localctx).name.stop):null), ((FunctionContext)_localctx).parameters.val);
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(572);
				match(WS);
				}
				}
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(578);
			match(T__0);
			setState(600);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(598);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						setState(579);
						declaration();
						}
						break;
					case 2:
						{
						setState(580);
						assigment();
						}
						break;
					case 3:
						{
						setState(581);
						((FunctionContext)_localctx).expression = expression();
						setState(585);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(582);
								match(WS);
								}
								} 
							}
							setState(587);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
						}
						handler.createRelationBody(((FunctionContext)_localctx).expression.val + ";", handler.scope);
						setState(592);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(589);
								match(WS);
								}
								} 
							}
							setState(594);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
						}
						}
						break;
					case 4:
						{
						setState(595);
						functionCall();
						}
						break;
					case 5:
						{
						setState(596);
						statement();
						}
						break;
					case 6:
						{
						setState(597);
						print();
						}
						break;
					}
					} 
				}
				setState(602);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(603);
				match(WS);
				}
				}
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(609);
				match(RETURN);
				setState(610);
				((FunctionContext)_localctx).expression = expression();
				handler.closeFunction(((FunctionContext)_localctx).expression.val);
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(612);
					match(WS);
					}
					}
					setState(617);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(618);
				match(T__4);
				}
				break;
			case 2:
				{
				setState(620);
				match(RETURN);
				handler.closeFunction("");
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(622);
					match(WS);
					}
					}
					setState(627);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(628);
				match(T__4);
				}
				break;
			}
			setState(631);
			match(T__2);
			handler.scope = "mainFunction";
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(633);
				match(WS);
				}
				}
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public String val;
		public String type;
		public NameContext name;
		public ParametersContext parameters;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(CoolParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CoolParser.WS, i);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(639);
				match(WS);
				}
				}
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(645);
			((FunctionCallContext)_localctx).name = name();
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(646);
				match(WS);
				}
				}
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(652);
			match(T__5);
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_NAME) | (1L << STRING_NAME) | (1L << STRING))) != 0)) {
				{
				setState(653);
				((FunctionCallContext)_localctx).parameters = parameters();
				}
			}

			setState(656);
			match(T__6);
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(657);
				match(WS);
				}
				}
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(663);
			match(T__4);
			handler.createFunctionCall((((FunctionCallContext)_localctx).name!=null?_input.getText(((FunctionCallContext)_localctx).name.start,((FunctionCallContext)_localctx).name.stop):null), ((FunctionCallContext)_localctx).parameters.val);
			                                                ((FunctionCallContext)_localctx).type =  handler.getTypeOfFunction((((FunctionCallContext)_localctx).name!=null?_input.getText(((FunctionCallContext)_localctx).name.start,((FunctionCallContext)_localctx).name.stop):null));
			                                                ((FunctionCallContext)_localctx).val = (((FunctionCallContext)_localctx).name!=null?_input.getText(((FunctionCallContext)_localctx).name.start,((FunctionCallContext)_localctx).name.stop):null) + "(" +  ((FunctionCallContext)_localctx).parameters.val + ")";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public String val;
		public ParameterContext firstParameter;
		public ParameterContext nextParameter;
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			((ParametersContext)_localctx).firstParameter = parameter();
			((ParametersContext)_localctx).val =  ((ParametersContext)_localctx).firstParameter.val;
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(668);
				match(T__14);
				setState(669);
				((ParametersContext)_localctx).nextParameter = parameter();
				((ParametersContext)_localctx).val =  _localctx.val + ", "+ ((ParametersContext)_localctx).nextParameter.val;
				}
				}
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public String val;
		public TypeVariableContext typeVariable;
		public NameContext name;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TypeVariableContext> typeVariable() {
			return getRuleContexts(TypeVariableContext.class);
		}
		public TypeVariableContext typeVariable(int i) {
			return getRuleContext(TypeVariableContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(CoolParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CoolParser.WS, i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTEGER_NAME || _la==STRING_NAME) {
				{
				{
				setState(677);
				((ParameterContext)_localctx).typeVariable = typeVariable();
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(678);
					match(WS);
					}
					}
					setState(683);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((ParameterContext)_localctx).val =  (((ParameterContext)_localctx).typeVariable!=null?_input.getText(((ParameterContext)_localctx).typeVariable.start,((ParameterContext)_localctx).typeVariable.stop):null) + " ";
				}
				}
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(691);
			((ParameterContext)_localctx).name = name();
			 if(_localctx.val ==null) {
			                                                                      ((ParameterContext)_localctx).val =  (((ParameterContext)_localctx).name!=null?_input.getText(((ParameterContext)_localctx).name.start,((ParameterContext)_localctx).name.stop):null);
			                                                                      } else ((ParameterContext)_localctx).val =  _localctx.val + (((ParameterContext)_localctx).name!=null?_input.getText(((ParameterContext)_localctx).name.start,((ParameterContext)_localctx).name.stop):null);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public ExpressionContext expression;
		public TerminalNode PRINT() { return getToken(CoolParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(CoolParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CoolParser.WS, i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_print);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			match(PRINT);
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(695);
				match(WS);
				}
				}
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(701);
			match(T__5);
			setState(705);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(702);
					match(WS);
					}
					} 
				}
				setState(707);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			}
			setState(708);
			((PrintContext)_localctx).expression = expression();
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(709);
				match(WS);
				}
				}
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(715);
			match(T__6);
			setState(716);
			match(T__4);
			handler.print(handler.scope, ((PrintContext)_localctx).expression.val);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LengthContext extends ParserRuleContext {
		public String val;
		public ExpressionContext expression;
		public TerminalNode LENGTH() { return getToken(CoolParser.LENGTH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(CoolParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CoolParser.WS, i);
		}
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_length);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(LENGTH);
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(720);
				match(WS);
				}
				}
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(726);
			match(T__5);
			setState(730);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(727);
					match(WS);
					}
					} 
				}
				setState(732);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
			setState(733);
			((LengthContext)_localctx).expression = expression();
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(734);
				match(WS);
				}
				}
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(740);
			match(T__6);
			((LengthContext)_localctx).val = ((LengthContext)_localctx).expression.val + ".length()";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u02ea\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\3\2"+
		"\7\2\64\n\2\f\2\16\2\67\13\2\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\7\2P\n\2\f"+
		"\2\16\2S\13\2\3\2\3\2\3\2\3\2\3\3\7\3Z\n\3\f\3\16\3]\13\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3r"+
		"\n\3\3\3\7\3u\n\3\f\3\16\3x\13\3\3\3\3\3\3\4\7\4}\n\4\f\4\16\4\u0080\13"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0088\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0099\n\4\3\4\7\4\u009c\n\4\f\4\16"+
		"\4\u009f\13\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\7\b\u00ab\n\b\f"+
		"\b\16\b\u00ae\13\b\3\b\3\b\7\b\u00b2\n\b\f\b\16\b\u00b5\13\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\7\b\u00bf\n\b\f\b\16\b\u00c2\13\b\3\b\3\b\7\b\u00c6"+
		"\n\b\f\b\16\b\u00c9\13\b\3\b\3\b\3\b\3\b\5\b\u00cf\n\b\3\t\7\t\u00d2\n"+
		"\t\f\t\16\t\u00d5\13\t\3\t\3\t\7\t\u00d9\n\t\f\t\16\t\u00dc\13\t\3\t\3"+
		"\t\3\t\7\t\u00e1\n\t\f\t\16\t\u00e4\13\t\3\t\7\t\u00e7\n\t\f\t\16\t\u00ea"+
		"\13\t\3\t\7\t\u00ed\n\t\f\t\16\t\u00f0\13\t\3\t\7\t\u00f3\n\t\f\t\16\t"+
		"\u00f6\13\t\3\n\7\n\u00f9\n\n\f\n\16\n\u00fc\13\n\3\n\3\n\3\n\7\n\u0101"+
		"\n\n\f\n\16\n\u0104\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u0112\n\n\3\n\7\n\u0115\n\n\f\n\16\n\u0118\13\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u0120\n\n\3\n\7\n\u0123\n\n\f\n\16\n\u0126\13\n\7\n\u0128"+
		"\n\n\f\n\16\n\u012b\13\n\3\13\3\13\3\13\5\13\u0130\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u013c\n\f\f\f\16\f\u013f\13\f\3\f\3\f\3"+
		"\f\3\f\3\f\7\f\u0146\n\f\f\f\16\f\u0149\13\f\3\f\7\f\u014c\n\f\f\f\16"+
		"\f\u014f\13\f\3\f\3\f\3\f\3\f\7\f\u0155\n\f\f\f\16\f\u0158\13\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\7\f\u0160\n\f\f\f\16\f\u0163\13\f\3\f\3\f\3\f\3\f\3"+
		"\f\7\f\u016a\n\f\f\f\16\f\u016d\13\f\3\f\7\f\u0170\n\f\f\f\16\f\u0173"+
		"\13\f\3\f\3\f\7\f\u0177\n\f\f\f\16\f\u017a\13\f\3\f\7\f\u017d\n\f\f\f"+
		"\16\f\u0180\13\f\3\f\7\f\u0183\n\f\f\f\16\f\u0186\13\f\3\r\3\r\7\r\u018a"+
		"\n\r\f\r\16\r\u018d\13\r\3\r\3\r\7\r\u0191\n\r\f\r\16\r\u0194\13\r\3\r"+
		"\3\r\7\r\u0198\n\r\f\r\16\r\u019b\13\r\3\r\3\r\3\r\7\r\u01a0\n\r\f\r\16"+
		"\r\u01a3\13\r\3\r\3\r\7\r\u01a7\n\r\f\r\16\r\u01aa\13\r\3\r\3\r\3\r\3"+
		"\r\7\r\u01b0\n\r\f\r\16\r\u01b3\13\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u01bb"+
		"\n\r\f\r\16\r\u01be\13\r\7\r\u01c0\n\r\f\r\16\r\u01c3\13\r\3\r\7\r\u01c6"+
		"\n\r\f\r\16\r\u01c9\13\r\3\r\3\r\7\r\u01cd\n\r\f\r\16\r\u01d0\13\r\3\r"+
		"\3\r\3\16\3\16\7\16\u01d6\n\16\f\16\16\16\u01d9\13\16\3\16\3\16\7\16\u01dd"+
		"\n\16\f\16\16\16\u01e0\13\16\3\16\3\16\3\16\7\16\u01e5\n\16\f\16\16\16"+
		"\u01e8\13\16\3\16\3\16\7\16\u01ec\n\16\f\16\16\16\u01ef\13\16\3\16\3\16"+
		"\7\16\u01f3\n\16\f\16\16\16\u01f6\13\16\3\16\3\16\7\16\u01fa\n\16\f\16"+
		"\16\16\u01fd\13\16\3\16\3\16\3\16\3\16\7\16\u0203\n\16\f\16\16\16\u0206"+
		"\13\16\3\16\3\16\3\16\3\16\3\16\7\16\u020d\n\16\f\16\16\16\u0210\13\16"+
		"\3\16\3\16\3\16\3\16\7\16\u0216\n\16\f\16\16\16\u0219\13\16\7\16\u021b"+
		"\n\16\f\16\16\16\u021e\13\16\3\16\7\16\u0221\n\16\f\16\16\16\u0224\13"+
		"\16\3\16\3\16\7\16\u0228\n\16\f\16\16\16\u022b\13\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\7\17\u0234\n\17\f\17\16\17\u0237\13\17\3\17\3\17\5"+
		"\17\u023b\n\17\3\17\3\17\3\17\7\17\u0240\n\17\f\17\16\17\u0243\13\17\3"+
		"\17\3\17\3\17\3\17\3\17\7\17\u024a\n\17\f\17\16\17\u024d\13\17\3\17\3"+
		"\17\7\17\u0251\n\17\f\17\16\17\u0254\13\17\3\17\3\17\3\17\7\17\u0259\n"+
		"\17\f\17\16\17\u025c\13\17\3\17\7\17\u025f\n\17\f\17\16\17\u0262\13\17"+
		"\3\17\3\17\3\17\3\17\7\17\u0268\n\17\f\17\16\17\u026b\13\17\3\17\3\17"+
		"\3\17\3\17\3\17\7\17\u0272\n\17\f\17\16\17\u0275\13\17\3\17\5\17\u0278"+
		"\n\17\3\17\3\17\3\17\7\17\u027d\n\17\f\17\16\17\u0280\13\17\3\20\7\20"+
		"\u0283\n\20\f\20\16\20\u0286\13\20\3\20\3\20\7\20\u028a\n\20\f\20\16\20"+
		"\u028d\13\20\3\20\3\20\5\20\u0291\n\20\3\20\3\20\7\20\u0295\n\20\f\20"+
		"\16\20\u0298\13\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u02a3"+
		"\n\21\f\21\16\21\u02a6\13\21\3\22\3\22\7\22\u02aa\n\22\f\22\16\22\u02ad"+
		"\13\22\3\22\3\22\7\22\u02b1\n\22\f\22\16\22\u02b4\13\22\3\22\3\22\3\22"+
		"\3\23\3\23\7\23\u02bb\n\23\f\23\16\23\u02be\13\23\3\23\3\23\7\23\u02c2"+
		"\n\23\f\23\16\23\u02c5\13\23\3\23\3\23\7\23\u02c9\n\23\f\23\16\23\u02cc"+
		"\13\23\3\23\3\23\3\23\3\23\3\24\3\24\7\24\u02d4\n\24\f\24\16\24\u02d7"+
		"\13\24\3\24\3\24\7\24\u02db\n\24\f\24\16\24\u02de\13\24\3\24\3\24\7\24"+
		"\u02e2\n\24\f\24\16\24\u02e5\13\24\3\24\3\24\3\24\3\24\2\2\25\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\4\3\2\24\25\3\2\24\26\2\u0357\2"+
		"(\3\2\2\2\4[\3\2\2\2\6~\3\2\2\2\b\u00a2\3\2\2\2\n\u00a4\3\2\2\2\f\u00a6"+
		"\3\2\2\2\16\u00ce\3\2\2\2\20\u00d3\3\2\2\2\22\u00fa\3\2\2\2\24\u012f\3"+
		"\2\2\2\26\u0131\3\2\2\2\30\u0187\3\2\2\2\32\u01d3\3\2\2\2\34\u022e\3\2"+
		"\2\2\36\u0284\3\2\2\2 \u029c\3\2\2\2\"\u02b2\3\2\2\2$\u02b8\3\2\2\2&\u02d1"+
		"\3\2\2\2()\7\22\2\2)*\5\f\7\2*.\b\2\1\2+-\7%\2\2,+\3\2\2\2-\60\3\2\2\2"+
		".,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\65\7\3\2\2\62\64\7%\2"+
		"\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66;\3\2\2\2"+
		"\67\65\3\2\2\28:\5\34\17\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3"+
		"\2\2\2=;\3\2\2\2>?\7\33\2\2?@\7\26\2\2@A\7\23\2\2AB\7\4\2\2BK\7\3\2\2"+
		"CJ\5\4\3\2DJ\5\6\4\2EJ\5\20\t\2FJ\5\24\13\2GJ\5\36\20\2HJ\5$\23\2IC\3"+
		"\2\2\2ID\3\2\2\2IE\3\2\2\2IF\3\2\2\2IG\3\2\2\2IH\3\2\2\2JM\3\2\2\2KI\3"+
		"\2\2\2KL\3\2\2\2LQ\3\2\2\2MK\3\2\2\2NP\7%\2\2ON\3\2\2\2PS\3\2\2\2QO\3"+
		"\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7\5\2\2UV\7\5\2\2VW\b\2\1\2W\3"+
		"\3\2\2\2XZ\7%\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2"+
		"][\3\2\2\2^_\7\27\2\2_`\5\f\7\2`a\b\3\1\2aq\7\6\2\2bc\5\16\b\2cd\7\7\2"+
		"\2de\b\3\1\2er\3\2\2\2fg\5\20\t\2gh\7\7\2\2hi\b\3\1\2ir\3\2\2\2jk\5\36"+
		"\20\2kl\b\3\1\2lr\3\2\2\2mn\5&\24\2no\7\7\2\2op\b\3\1\2pr\3\2\2\2qb\3"+
		"\2\2\2qf\3\2\2\2qj\3\2\2\2qm\3\2\2\2rv\3\2\2\2su\7%\2\2ts\3\2\2\2ux\3"+
		"\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\b\3\1\2z\5\3\2\2\2{}"+
		"\7%\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2"+
		"\2\2\u0080~\3\2\2\2\u0081\u0082\5\f\7\2\u0082\u0087\7\6\2\2\u0083\u0084"+
		"\7\b\2\2\u0084\u0085\5\b\5\2\u0085\u0086\7\t\2\2\u0086\u0088\3\2\2\2\u0087"+
		"\u0083\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0098\3\2\2\2\u0089\u008a\5\16"+
		"\b\2\u008a\u008b\7\7\2\2\u008b\u008c\b\4\1\2\u008c\u0099\3\2\2\2\u008d"+
		"\u008e\5\20\t\2\u008e\u008f\7\7\2\2\u008f\u0090\b\4\1\2\u0090\u0099\3"+
		"\2\2\2\u0091\u0092\5\36\20\2\u0092\u0093\b\4\1\2\u0093\u0099\3\2\2\2\u0094"+
		"\u0095\5&\24\2\u0095\u0096\7\7\2\2\u0096\u0097\b\4\1\2\u0097\u0099\3\2"+
		"\2\2\u0098\u0089\3\2\2\2\u0098\u008d\3\2\2\2\u0098\u0091\3\2\2\2\u0098"+
		"\u0094\3\2\2\2\u0099\u009d\3\2\2\2\u009a\u009c\7%\2\2\u009b\u009a\3\2"+
		"\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\b\4\1\2\u00a1\7\3\2\2\2"+
		"\u00a2\u00a3\t\2\2\2\u00a3\t\3\2\2\2\u00a4\u00a5\t\3\2\2\u00a5\13\3\2"+
		"\2\2\u00a6\u00a7\7!\2\2\u00a7\r\3\2\2\2\u00a8\u00ac\7\n\2\2\u00a9\u00ab"+
		"\7%\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b3\7!"+
		"\2\2\u00b0\u00b2\7%\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b6\u00b7\7\n\2\2\u00b7\u00cf\b\b\1\2\u00b8\u00b9\7!\2\2\u00b9"+
		"\u00cf\b\b\1\2\u00ba\u00bb\7#\2\2\u00bb\u00cf\b\b\1\2\u00bc\u00c0\7\n"+
		"\2\2\u00bd\u00bf\7%\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2"+
		"\2\2\u00c3\u00c7\7#\2\2\u00c4\u00c6\7%\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca\u00cb\7\n\2\2\u00cb\u00cf\b\b\1\2\u00cc\u00cd\7\""+
		"\2\2\u00cd\u00cf\b\b\1\2\u00ce\u00a8\3\2\2\2\u00ce\u00b8\3\2\2\2\u00ce"+
		"\u00ba\3\2\2\2\u00ce\u00bc\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\17\3\2\2"+
		"\2\u00d0\u00d2\7%\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6"+
		"\u00da\5\16\b\2\u00d7\u00d9\7%\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2"+
		"\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\u00f4\b\t\1\2\u00de\u00e2\7 \2\2\u00df\u00e1\7%\2"+
		"\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3\u00e8\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e7\5\16\b\2"+
		"\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e9\u00ee\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ed\7%\2\2\u00ec"+
		"\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f3\b\t\1\2\u00f2"+
		"\u00de\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\21\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f9\7%\2\2\u00f8\u00f7"+
		"\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\5\16\b\2\u00fe\u0102\b"+
		"\n\1\2\u00ff\u0101\7%\2\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0129\3\2\2\2\u0104\u0102\3\2"+
		"\2\2\u0105\u0106\7\13\2\2\u0106\u0112\b\n\1\2\u0107\u0108\7\f\2\2\u0108"+
		"\u0112\b\n\1\2\u0109\u010a\7\r\2\2\u010a\u0112\b\n\1\2\u010b\u010c\7\16"+
		"\2\2\u010c\u0112\b\n\1\2\u010d\u010e\7\17\2\2\u010e\u0112\b\n\1\2\u010f"+
		"\u0110\7\20\2\2\u0110\u0112\b\n\1\2\u0111\u0105\3\2\2\2\u0111\u0107\3"+
		"\2\2\2\u0111\u0109\3\2\2\2\u0111\u010b\3\2\2\2\u0111\u010d\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0112\u0116\3\2\2\2\u0113\u0115\7%\2\2\u0114\u0113\3\2"+
		"\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u011f\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\5&\24\2\u011a\u011b\b\n"+
		"\1\2\u011b\u0120\3\2\2\2\u011c\u011d\5\16\b\2\u011d\u011e\b\n\1\2\u011e"+
		"\u0120\3\2\2\2\u011f\u0119\3\2\2\2\u011f\u011c\3\2\2\2\u0120\u0124\3\2"+
		"\2\2\u0121\u0123\7%\2\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0127\u0111\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\23\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u0130\5\26\f"+
		"\2\u012d\u0130\5\30\r\2\u012e\u0130\5\32\16\2\u012f\u012c\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130\25\3\2\2\2\u0131\u0132\7\36\2"+
		"\2\u0132\u0133\7\b\2\2\u0133\u0134\5\22\n\2\u0134\u0135\b\f\1\2\u0135"+
		"\u0136\7\t\2\2\u0136\u0147\7\3\2\2\u0137\u0146\5\4\3\2\u0138\u0146\5\6"+
		"\4\2\u0139\u013d\5\20\t\2\u013a\u013c\7%\2\2\u013b\u013a\3\2\2\2\u013c"+
		"\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2"+
		"\2\2\u013f\u013d\3\2\2\2\u0140\u0141\b\f\1\2\u0141\u0146\3\2\2\2\u0142"+
		"\u0146\5\36\20\2\u0143\u0146\5\24\13\2\u0144\u0146\5$\23\2\u0145\u0137"+
		"\3\2\2\2\u0145\u0138\3\2\2\2\u0145\u0139\3\2\2\2\u0145\u0142\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2"+
		"\2\2\u0147\u0148\3\2\2\2\u0148\u014d\3\2\2\2\u0149\u0147\3\2\2\2\u014a"+
		"\u014c\7%\2\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2"+
		"\2\2\u014d\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150"+
		"\u0151\7\5\2\2\u0151\u0178\b\f\1\2\u0152\u0156\7\37\2\2\u0153\u0155\7"+
		"%\2\2\u0154\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015a\7\3"+
		"\2\2\u015a\u016b\b\f\1\2\u015b\u016a\5\4\3\2\u015c\u016a\5\6\4\2\u015d"+
		"\u0161\5\20\t\2\u015e\u0160\7%\2\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2"+
		"\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0164\u0165\b\f\1\2\u0165\u016a\3\2\2\2\u0166\u016a\5\36"+
		"\20\2\u0167\u016a\5\24\13\2\u0168\u016a\5$\23\2\u0169\u015b\3\2\2\2\u0169"+
		"\u015c\3\2\2\2\u0169\u015d\3\2\2\2\u0169\u0166\3\2\2\2\u0169\u0167\3\2"+
		"\2\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u0171\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0170\7%"+
		"\2\2\u016f\u016e\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0175\7\5"+
		"\2\2\u0175\u0177\b\f\1\2\u0176\u0152\3\2\2\2\u0177\u017a\3\2\2\2\u0178"+
		"\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017e\3\2\2\2\u017a\u0178\3\2"+
		"\2\2\u017b\u017d\7%\2\2\u017c\u017b\3\2\2\2\u017d\u0180\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0184\3\2\2\2\u0180\u017e\3\2"+
		"\2\2\u0181\u0183\7%\2\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2\2\2\u0184"+
		"\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\27\3\2\2\2\u0186\u0184\3\2\2"+
		"\2\u0187\u018b\7\35\2\2\u0188\u018a\7%\2\2\u0189\u0188\3\2\2\2\u018a\u018d"+
		"\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d"+
		"\u018b\3\2\2\2\u018e\u0192\7\b\2\2\u018f\u0191\7%\2\2\u0190\u018f\3\2"+
		"\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u0195\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0199\5\22\n\2\u0196\u0198\7"+
		"%\2\2\u0197\u0196\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019d\7\t"+
		"\2\2\u019d\u01a1\b\r\1\2\u019e\u01a0\7%\2\2\u019f\u019e\3\2\2\2\u01a0"+
		"\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2"+
		"\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01c1\7\3\2\2\u01a5\u01a7\7%\2\2\u01a6"+
		"\u01a5\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2"+
		"\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01c0\5\4\3\2\u01ac"+
		"\u01c0\5\6\4\2\u01ad\u01b1\5\20\t\2\u01ae\u01b0\7%\2\2\u01af\u01ae\3\2"+
		"\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2"+
		"\u01b4\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b5\b\r\1\2\u01b5\u01c0\3\2"+
		"\2\2\u01b6\u01c0\5\36\20\2\u01b7\u01c0\5\24\13\2\u01b8\u01bc\5$\23\2\u01b9"+
		"\u01bb\7%\2\2\u01ba\u01b9\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2"+
		"\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf"+
		"\u01a8\3\2\2\2\u01bf\u01ac\3\2\2\2\u01bf\u01ad\3\2\2\2\u01bf\u01b6\3\2"+
		"\2\2\u01bf\u01b7\3\2\2\2\u01bf\u01b8\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1"+
		"\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c7\3\2\2\2\u01c3\u01c1\3\2"+
		"\2\2\u01c4\u01c6\7%\2\2\u01c5\u01c4\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7"+
		"\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01c7\3\2"+
		"\2\2\u01ca\u01ce\7\5\2\2\u01cb\u01cd\7%\2\2\u01cc\u01cb\3\2\2\2\u01cd"+
		"\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1\3\2"+
		"\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d2\b\r\1\2\u01d2\31\3\2\2\2\u01d3\u01d7"+
		"\7\34\2\2\u01d4\u01d6\7%\2\2\u01d5\u01d4\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7"+
		"\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01da\3\2\2\2\u01d9\u01d7\3\2"+
		"\2\2\u01da\u01de\7\b\2\2\u01db\u01dd\7%\2\2\u01dc\u01db\3\2\2\2\u01dd"+
		"\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e1\3\2"+
		"\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e2\b\16\1\2\u01e2\u01e6\5\4\3\2\u01e3"+
		"\u01e5\7%\2\2\u01e4\u01e3\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3\2"+
		"\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9"+
		"\u01ed\5\22\n\2\u01ea\u01ec\7%\2\2\u01eb\u01ea\3\2\2\2\u01ec\u01ef\3\2"+
		"\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f0\3\2\2\2\u01ef"+
		"\u01ed\3\2\2\2\u01f0\u01f4\7\7\2\2\u01f1\u01f3\7%\2\2\u01f2\u01f1\3\2"+
		"\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5"+
		"\u01f7\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01fb\5\20\t\2\u01f8\u01fa\7"+
		"%\2\2\u01f9\u01f8\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u01ff\7\t"+
		"\2\2\u01ff\u0200\7\3\2\2\u0200\u021c\b\16\1\2\u0201\u0203\7%\2\2\u0202"+
		"\u0201\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2"+
		"\2\2\u0205\u0207\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u021b\5\4\3\2\u0208"+
		"\u021b\5\6\4\2\u0209\u020a\5\20\t\2\u020a\u020e\b\16\1\2\u020b\u020d\7"+
		"%\2\2\u020c\u020b\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020e"+
		"\u020f\3\2\2\2\u020f\u021b\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u021b\5\36"+
		"\20\2\u0212\u021b\5\24\13\2\u0213\u0217\5$\23\2\u0214\u0216\7%\2\2\u0215"+
		"\u0214\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2"+
		"\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u021a\u0204\3\2\2\2\u021a"+
		"\u0208\3\2\2\2\u021a\u0209\3\2\2\2\u021a\u0211\3\2\2\2\u021a\u0212\3\2"+
		"\2\2\u021a\u0213\3\2\2\2\u021b\u021e\3\2\2\2\u021c\u021a\3\2\2\2\u021c"+
		"\u021d\3\2\2\2\u021d\u0222\3\2\2\2\u021e\u021c\3\2\2\2\u021f\u0221\7%"+
		"\2\2\u0220\u021f\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0220\3\2\2\2\u0222"+
		"\u0223\3\2\2\2\u0223\u0225\3\2\2\2\u0224\u0222\3\2\2\2\u0225\u0229\7\5"+
		"\2\2\u0226\u0228\7%\2\2\u0227\u0226\3\2\2\2\u0228\u022b\3\2\2\2\u0229"+
		"\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022c\3\2\2\2\u022b\u0229\3\2"+
		"\2\2\u022c\u022d\b\16\1\2\u022d\33\3\2\2\2\u022e\u022f\7\33\2\2\u022f"+
		"\u0230\5\n\6\2\u0230\u0231\5\f\7\2\u0231\u0235\b\17\1\2\u0232\u0234\7"+
		"%\2\2\u0233\u0232\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0233\3\2\2\2\u0235"+
		"\u0236\3\2\2\2\u0236\u0238\3\2\2\2\u0237\u0235\3\2\2\2\u0238\u023a\7\b"+
		"\2\2\u0239\u023b\5 \21\2\u023a\u0239\3\2\2\2\u023a\u023b\3\2\2\2\u023b"+
		"\u023c\3\2\2\2\u023c\u023d\7\t\2\2\u023d\u0241\b\17\1\2\u023e\u0240\7"+
		"%\2\2\u023f\u023e\3\2\2\2\u0240\u0243\3\2\2\2\u0241\u023f\3\2\2\2\u0241"+
		"\u0242\3\2\2\2\u0242\u0244\3\2\2\2\u0243\u0241\3\2\2\2\u0244\u025a\7\3"+
		"\2\2\u0245\u0259\5\4\3\2\u0246\u0259\5\6\4\2\u0247\u024b\5\20\t\2\u0248"+
		"\u024a\7%\2\2\u0249\u0248\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u0249\3\2"+
		"\2\2\u024b\u024c\3\2\2\2\u024c\u024e\3\2\2\2\u024d\u024b\3\2\2\2\u024e"+
		"\u0252\b\17\1\2\u024f\u0251\7%\2\2\u0250\u024f\3\2\2\2\u0251\u0254\3\2"+
		"\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0259\3\2\2\2\u0254"+
		"\u0252\3\2\2\2\u0255\u0259\5\36\20\2\u0256\u0259\5\24\13\2\u0257\u0259"+
		"\5$\23\2\u0258\u0245\3\2\2\2\u0258\u0246\3\2\2\2\u0258\u0247\3\2\2\2\u0258"+
		"\u0255\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0257\3\2\2\2\u0259\u025c\3\2"+
		"\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u0260\3\2\2\2\u025c"+
		"\u025a\3\2\2\2\u025d\u025f\7%\2\2\u025e\u025d\3\2\2\2\u025f\u0262\3\2"+
		"\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0277\3\2\2\2\u0262"+
		"\u0260\3\2\2\2\u0263\u0264\7\32\2\2\u0264\u0265\5\20\t\2\u0265\u0269\b"+
		"\17\1\2\u0266\u0268\7%\2\2\u0267\u0266\3\2\2\2\u0268\u026b\3\2\2\2\u0269"+
		"\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026c\3\2\2\2\u026b\u0269\3\2"+
		"\2\2\u026c\u026d\7\7\2\2\u026d\u0278\3\2\2\2\u026e\u026f\7\32\2\2\u026f"+
		"\u0273\b\17\1\2\u0270\u0272\7%\2\2\u0271\u0270\3\2\2\2\u0272\u0275\3\2"+
		"\2\2\u0273\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0276\3\2\2\2\u0275"+
		"\u0273\3\2\2\2\u0276\u0278\7\7\2\2\u0277\u0263\3\2\2\2\u0277\u026e\3\2"+
		"\2\2\u0278\u0279\3\2\2\2\u0279\u027a\7\5\2\2\u027a\u027e\b\17\1\2\u027b"+
		"\u027d\7%\2\2\u027c\u027b\3\2\2\2\u027d\u0280\3\2\2\2\u027e\u027c\3\2"+
		"\2\2\u027e\u027f\3\2\2\2\u027f\35\3\2\2\2\u0280\u027e\3\2\2\2\u0281\u0283"+
		"\7%\2\2\u0282\u0281\3\2\2\2\u0283\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0284"+
		"\u0285\3\2\2\2\u0285\u0287\3\2\2\2\u0286\u0284\3\2\2\2\u0287\u028b\5\f"+
		"\7\2\u0288\u028a\7%\2\2\u0289\u0288\3\2\2\2\u028a\u028d\3\2\2\2\u028b"+
		"\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028e\3\2\2\2\u028d\u028b\3\2"+
		"\2\2\u028e\u0290\7\b\2\2\u028f\u0291\5 \21\2\u0290\u028f\3\2\2\2\u0290"+
		"\u0291\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0296\7\t\2\2\u0293\u0295\7%"+
		"\2\2\u0294\u0293\3\2\2\2\u0295\u0298\3\2\2\2\u0296\u0294\3\2\2\2\u0296"+
		"\u0297\3\2\2\2\u0297\u0299\3\2\2\2\u0298\u0296\3\2\2\2\u0299\u029a\7\7"+
		"\2\2\u029a\u029b\b\20\1\2\u029b\37\3\2\2\2\u029c\u029d\5\"\22\2\u029d"+
		"\u02a4\b\21\1\2\u029e\u029f\7\21\2\2\u029f\u02a0\5\"\22\2\u02a0\u02a1"+
		"\b\21\1\2\u02a1\u02a3\3\2\2\2\u02a2\u029e\3\2\2\2\u02a3\u02a6\3\2\2\2"+
		"\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5!\3\2\2\2\u02a6\u02a4\3"+
		"\2\2\2\u02a7\u02ab\5\b\5\2\u02a8\u02aa\7%\2\2\u02a9\u02a8\3\2\2\2\u02aa"+
		"\u02ad\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ae\3\2"+
		"\2\2\u02ad\u02ab\3\2\2\2\u02ae\u02af\b\22\1\2\u02af\u02b1\3\2\2\2\u02b0"+
		"\u02a7\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2\u02b3\3\2"+
		"\2\2\u02b3\u02b5\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b5\u02b6\5\f\7\2\u02b6"+
		"\u02b7\b\22\1\2\u02b7#\3\2\2\2\u02b8\u02bc\7\30\2\2\u02b9\u02bb\7%\2\2"+
		"\u02ba\u02b9\3\2\2\2\u02bb\u02be\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd"+
		"\3\2\2\2\u02bd\u02bf\3\2\2\2\u02be\u02bc\3\2\2\2\u02bf\u02c3\7\b\2\2\u02c0"+
		"\u02c2\7%\2\2\u02c1\u02c0\3\2\2\2\u02c2\u02c5\3\2\2\2\u02c3\u02c1\3\2"+
		"\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c6\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c6"+
		"\u02ca\5\20\t\2\u02c7\u02c9\7%\2\2\u02c8\u02c7\3\2\2\2\u02c9\u02cc\3\2"+
		"\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cd\3\2\2\2\u02cc"+
		"\u02ca\3\2\2\2\u02cd\u02ce\7\t\2\2\u02ce\u02cf\7\7\2\2\u02cf\u02d0\b\23"+
		"\1\2\u02d0%\3\2\2\2\u02d1\u02d5\7\31\2\2\u02d2\u02d4\7%\2\2\u02d3\u02d2"+
		"\3\2\2\2\u02d4\u02d7\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6"+
		"\u02d8\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d8\u02dc\7\b\2\2\u02d9\u02db\7%"+
		"\2\2\u02da\u02d9\3\2\2\2\u02db\u02de\3\2\2\2\u02dc\u02da\3\2\2\2\u02dc"+
		"\u02dd\3\2\2\2\u02dd\u02df\3\2\2\2\u02de\u02dc\3\2\2\2\u02df\u02e3\5\20"+
		"\t\2\u02e0\u02e2\7%\2\2\u02e1\u02e0\3\2\2\2\u02e2\u02e5\3\2\2\2\u02e3"+
		"\u02e1\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e6\3\2\2\2\u02e5\u02e3\3\2"+
		"\2\2\u02e6\u02e7\7\t\2\2\u02e7\u02e8\b\24\1\2\u02e8\'\3\2\2\2_.\65;IK"+
		"Q[qv~\u0087\u0098\u009d\u00ac\u00b3\u00c0\u00c7\u00ce\u00d3\u00da\u00e2"+
		"\u00e8\u00ee\u00f4\u00fa\u0102\u0111\u0116\u011f\u0124\u0129\u012f\u013d"+
		"\u0145\u0147\u014d\u0156\u0161\u0169\u016b\u0171\u0178\u017e\u0184\u018b"+
		"\u0192\u0199\u01a1\u01a8\u01b1\u01bc\u01bf\u01c1\u01c7\u01ce\u01d7\u01de"+
		"\u01e6\u01ed\u01f4\u01fb\u0204\u020e\u0217\u021a\u021c\u0222\u0229\u0235"+
		"\u023a\u0241\u024b\u0252\u0258\u025a\u0260\u0269\u0273\u0277\u027e\u0284"+
		"\u028b\u0290\u0296\u02a4\u02ab\u02b2\u02bc\u02c3\u02ca\u02d5\u02dc\u02e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}