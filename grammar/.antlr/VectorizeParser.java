// Generated from d:\Repos\vectorize\main\grammar\Vectorize.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VectorizeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		WS=39, INT=40, FLOAT=41, STRING=42, BOOL=43, ID=44, LINECMT=45;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_funcparam = 2, RULE_funccall = 3, 
		RULE_vardef = 4, RULE_type = 5, RULE_statement = 6, RULE_blockstmt = 7, 
		RULE_vardefstmt = 8, RULE_varassignstmt = 9, RULE_expressionstmt = 10, 
		RULE_forstmt = 11, RULE_ifstmt = 12, RULE_whilestmt = 13, RULE_returnstmt = 14, 
		RULE_expression = 15;
	public static final String[] ruleNames = {
		"program", "function", "funcparam", "funccall", "vardef", "type", "statement", 
		"blockstmt", "vardefstmt", "varassignstmt", "expressionstmt", "forstmt", 
		"ifstmt", "whilestmt", "returnstmt", "expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'fn'", "'('", "','", "')'", "'->'", "'['", "']'", "':'", "'let'", 
		"'='", "'int'", "'float'", "'bool'", "'string'", "';'", "'{'", "'}'", 
		"'for'", "'if'", "'else'", "'while'", "'return'", "'++'", "'--'", "'!'", 
		"'*'", "'/'", "'%'", "'+'", "'-'", "'<'", "'<='", "'>'", "'>='", "'=='", 
		"'!='", "'&&'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "WS", "INT", "FLOAT", "STRING", "BOOL", "ID", "LINECMT"
	};
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
	public String getGrammarFileName() { return "Vectorize.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VectorizeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				function();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
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
		public Token array;
		public TerminalNode ID() { return getToken(VectorizeParser.ID, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<FuncparamContext> funcparam() {
			return getRuleContexts(FuncparamContext.class);
		}
		public FuncparamContext funcparam(int i) {
			return getRuleContext(FuncparamContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__0);
			setState(38);
			match(ID);
			setState(39);
			match(T__1);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(40);
				funcparam();
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(41);
					match(T__2);
					setState(42);
					funcparam();
					}
					}
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(50);
			match(T__3);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(51);
				match(T__4);
				setState(52);
				type();
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(53);
					((FunctionContext)_localctx).array = match(T__5);
					setState(54);
					match(T__6);
					}
				}

				}
			}

			setState(59);
			statement();
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

	public static class FuncparamContext extends ParserRuleContext {
		public Token array;
		public TerminalNode ID() { return getToken(VectorizeParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FuncparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcparam; }
	}

	public final FuncparamContext funcparam() throws RecognitionException {
		FuncparamContext _localctx = new FuncparamContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcparam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(ID);
			setState(62);
			match(T__7);
			setState(63);
			type();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(64);
				((FuncparamContext)_localctx).array = match(T__5);
				setState(65);
				match(T__6);
				}
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

	public static class FunccallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VectorizeParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall; }
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funccall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(ID);
			setState(69);
			match(T__1);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__24) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				setState(70);
				expression(0);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(71);
					match(T__2);
					setState(72);
					expression(0);
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(80);
			match(T__3);
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

	public static class VardefContext extends ParserRuleContext {
		public Token array;
		public ExpressionContext size;
		public ExpressionContext initial;
		public TerminalNode ID() { return getToken(VectorizeParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public VardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef; }
	}

	public final VardefContext vardef() throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vardef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__8);
			setState(83);
			match(ID);
			setState(84);
			match(T__7);
			setState(85);
			type();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(86);
				((VardefContext)_localctx).array = match(T__5);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__24) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					setState(87);
					((VardefContext)_localctx).size = expression(0);
					}
				}

				setState(90);
				match(T__6);
				}
			}

			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(93);
				match(T__9);
				setState(94);
				((VardefContext)_localctx).initial = expression(0);
				}
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
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

	public static class StatementContext extends ParserRuleContext {
		public BlockstmtContext blockstmt() {
			return getRuleContext(BlockstmtContext.class,0);
		}
		public VardefstmtContext vardefstmt() {
			return getRuleContext(VardefstmtContext.class,0);
		}
		public VarassignstmtContext varassignstmt() {
			return getRuleContext(VarassignstmtContext.class,0);
		}
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public ForstmtContext forstmt() {
			return getRuleContext(ForstmtContext.class,0);
		}
		public WhilestmtContext whilestmt() {
			return getRuleContext(WhilestmtContext.class,0);
		}
		public ReturnstmtContext returnstmt() {
			return getRuleContext(ReturnstmtContext.class,0);
		}
		public ExpressionstmtContext expressionstmt() {
			return getRuleContext(ExpressionstmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				blockstmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				vardefstmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				varassignstmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				funccall();
				setState(103);
				match(T__14);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
				ifstmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				forstmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(107);
				whilestmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(108);
				returnstmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(109);
				expressionstmt();
				}
				break;
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

	public static class BlockstmtContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockstmt; }
	}

	public final BlockstmtContext blockstmt() throws RecognitionException {
		BlockstmtContext _localctx = new BlockstmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_blockstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__15);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__24) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(113);
				statement();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			match(T__16);
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

	public static class VardefstmtContext extends ParserRuleContext {
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public VardefstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardefstmt; }
	}

	public final VardefstmtContext vardefstmt() throws RecognitionException {
		VardefstmtContext _localctx = new VardefstmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_vardefstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			vardef();
			setState(122);
			match(T__14);
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

	public static class VarassignstmtContext extends ParserRuleContext {
		public ExpressionContext index;
		public ExpressionContext value;
		public TerminalNode ID() { return getToken(VectorizeParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public VarassignstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varassignstmt; }
	}

	public final VarassignstmtContext varassignstmt() throws RecognitionException {
		VarassignstmtContext _localctx = new VarassignstmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varassignstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(ID);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(125);
				match(T__5);
				setState(126);
				((VarassignstmtContext)_localctx).index = expression(0);
				setState(127);
				match(T__6);
				}
			}

			setState(131);
			match(T__9);
			setState(132);
			((VarassignstmtContext)_localctx).value = expression(0);
			setState(133);
			match(T__14);
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

	public static class ExpressionstmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionstmt; }
	}

	public final ExpressionstmtContext expressionstmt() throws RecognitionException {
		ExpressionstmtContext _localctx = new ExpressionstmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressionstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			expression(0);
			setState(136);
			match(T__14);
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

	public static class ForstmtContext extends ParserRuleContext {
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstmt; }
	}

	public final ForstmtContext forstmt() throws RecognitionException {
		ForstmtContext _localctx = new ForstmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__17);
			setState(139);
			match(T__1);
			setState(140);
			vardef();
			setState(141);
			match(T__14);
			setState(142);
			expression(0);
			setState(143);
			match(T__14);
			setState(144);
			expression(0);
			setState(145);
			match(T__3);
			setState(146);
			statement();
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

	public static class IfstmtContext extends ParserRuleContext {
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
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifstmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__18);
			setState(149);
			match(T__1);
			setState(150);
			expression(0);
			setState(151);
			match(T__3);
			setState(152);
			statement();
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(153);
					match(T__19);
					setState(154);
					match(T__18);
					setState(155);
					match(T__1);
					setState(156);
					expression(0);
					setState(157);
					match(T__3);
					setState(158);
					statement();
					}
					} 
				}
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(165);
				match(T__19);
				setState(166);
				statement();
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

	public static class WhilestmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__20);
			setState(170);
			match(T__1);
			setState(171);
			expression(0);
			setState(172);
			match(T__3);
			setState(173);
			statement();
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

	public static class ReturnstmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstmt; }
	}

	public final ReturnstmtContext returnstmt() throws RecognitionException {
		ReturnstmtContext _localctx = new ReturnstmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__21);
			setState(176);
			expression(0);
			setState(177);
			match(T__14);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralFloatContext extends ExpressionContext {
		public TerminalNode FLOAT() { return getToken(VectorizeParser.FLOAT, 0); }
		public LiteralFloatContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LogEqualContext extends ExpressionContext {
		public ExpressionContext lhs;
		public Token op;
		public ExpressionContext rhs;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LogEqualContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LiteralBoolContext extends ExpressionContext {
		public TerminalNode BOOL() { return getToken(VectorizeParser.BOOL, 0); }
		public LiteralBoolContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LiteralStringContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(VectorizeParser.STRING, 0); }
		public LiteralStringContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ParaContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParaContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LogOrContext extends ExpressionContext {
		public ExpressionContext lhs;
		public ExpressionContext rhs;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LogOrContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class VarContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(VectorizeParser.ID, 0); }
		public VarContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BinaryAddSubContext extends ExpressionContext {
		public ExpressionContext lhs;
		public Token op;
		public ExpressionContext rhs;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BinaryAddSubContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LogRelContext extends ExpressionContext {
		public ExpressionContext lhs;
		public Token op;
		public ExpressionContext rhs;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LogRelContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LiteralIntContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(VectorizeParser.INT, 0); }
		public LiteralIntContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BinaryMulDivModContext extends ExpressionContext {
		public ExpressionContext lhs;
		public Token op;
		public ExpressionContext rhs;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BinaryMulDivModContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LogAndContext extends ExpressionContext {
		public ExpressionContext lhs;
		public ExpressionContext rhs;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LogAndContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class FuncCallContext extends ExpressionContext {
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public FuncCallContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayAccessContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(VectorizeParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LogNotContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LogNotContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new ParaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(180);
				match(T__1);
				setState(181);
				expression(0);
				setState(182);
				match(T__3);
				}
				break;
			case 2:
				{
				_localctx = new ArrayAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				match(ID);
				setState(185);
				match(T__5);
				setState(186);
				expression(0);
				setState(187);
				match(T__6);
				}
				break;
			case 3:
				{
				_localctx = new LogNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(189);
				match(T__24);
				setState(190);
				expression(13);
				}
				break;
			case 4:
				{
				_localctx = new LiteralIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				match(INT);
				}
				break;
			case 5:
				{
				_localctx = new LiteralFloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				match(FLOAT);
				}
				break;
			case 6:
				{
				_localctx = new LiteralStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				match(STRING);
				}
				break;
			case 7:
				{
				_localctx = new LiteralBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				match(BOOL);
				}
				break;
			case 8:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				funccall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(219);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryMulDivModContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryMulDivModContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(199);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(200);
						((BinaryMulDivModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
							((BinaryMulDivModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(201);
						((BinaryMulDivModContext)_localctx).rhs = expression(13);
						}
						break;
					case 2:
						{
						_localctx = new BinaryAddSubContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryAddSubContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(202);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(203);
						((BinaryAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__28 || _la==T__29) ) {
							((BinaryAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(204);
						((BinaryAddSubContext)_localctx).rhs = expression(12);
						}
						break;
					case 3:
						{
						_localctx = new LogRelContext(new ExpressionContext(_parentctx, _parentState));
						((LogRelContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(205);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(206);
						((LogRelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
							((LogRelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(207);
						((LogRelContext)_localctx).rhs = expression(11);
						}
						break;
					case 4:
						{
						_localctx = new LogEqualContext(new ExpressionContext(_parentctx, _parentState));
						((LogEqualContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(208);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(209);
						((LogEqualContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__34 || _la==T__35) ) {
							((LogEqualContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(210);
						((LogEqualContext)_localctx).rhs = expression(10);
						}
						break;
					case 5:
						{
						_localctx = new LogAndContext(new ExpressionContext(_parentctx, _parentState));
						((LogAndContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(211);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(212);
						match(T__36);
						setState(213);
						((LogAndContext)_localctx).rhs = expression(9);
						}
						break;
					case 6:
						{
						_localctx = new LogOrContext(new ExpressionContext(_parentctx, _parentState));
						((LogOrContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(214);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(215);
						match(T__37);
						setState(216);
						((LogOrContext)_localctx).rhs = expression(8);
						}
						break;
					case 7:
						{
						_localctx = new UnaryContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(217);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(218);
						((UnaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__22 || _la==T__23) ) {
							((UnaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u00e3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6\2$\n"+
		"\2\r\2\16\2%\3\3\3\3\3\3\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\5\3\63"+
		"\n\3\3\3\3\3\3\3\3\3\3\3\5\3:\n\3\5\3<\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\5\4E\n\4\3\5\3\5\3\5\3\5\3\5\7\5L\n\5\f\5\16\5O\13\5\5\5Q\n\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6[\n\6\3\6\5\6^\n\6\3\6\3\6\5\6b\n\6\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bq\n\b\3\t\3\t\7\tu\n"+
		"\t\f\t\16\tx\13\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u0084"+
		"\n\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7"+
		"\16\u00a3\n\16\f\16\16\16\u00a6\13\16\3\16\3\16\5\16\u00aa\n\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c8"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00de\n\21\f\21\16\21\u00e1\13"+
		"\21\3\21\2\3 \22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\b\3\2\r\20"+
		"\3\2\34\36\3\2\37 \3\2!$\3\2%&\3\2\31\32\2\u00f8\2#\3\2\2\2\4\'\3\2\2"+
		"\2\6?\3\2\2\2\bF\3\2\2\2\nT\3\2\2\2\fc\3\2\2\2\16p\3\2\2\2\20r\3\2\2\2"+
		"\22{\3\2\2\2\24~\3\2\2\2\26\u0089\3\2\2\2\30\u008c\3\2\2\2\32\u0096\3"+
		"\2\2\2\34\u00ab\3\2\2\2\36\u00b1\3\2\2\2 \u00c7\3\2\2\2\"$\5\4\3\2#\""+
		"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\3\3\2\2\2\'(\7\3\2\2()\7.\2\2"+
		")\62\7\4\2\2*/\5\6\4\2+,\7\5\2\2,.\5\6\4\2-+\3\2\2\2.\61\3\2\2\2/-\3\2"+
		"\2\2/\60\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\62*\3\2\2\2\62\63\3\2\2\2\63"+
		"\64\3\2\2\2\64;\7\6\2\2\65\66\7\7\2\2\669\5\f\7\2\678\7\b\2\28:\7\t\2"+
		"\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;\65\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\5"+
		"\16\b\2>\5\3\2\2\2?@\7.\2\2@A\7\n\2\2AD\5\f\7\2BC\7\b\2\2CE\7\t\2\2DB"+
		"\3\2\2\2DE\3\2\2\2E\7\3\2\2\2FG\7.\2\2GP\7\4\2\2HM\5 \21\2IJ\7\5\2\2J"+
		"L\5 \21\2KI\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NQ\3\2\2\2OM\3\2\2\2"+
		"PH\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\6\2\2S\t\3\2\2\2TU\7\13\2\2UV\7.\2"+
		"\2VW\7\n\2\2W]\5\f\7\2XZ\7\b\2\2Y[\5 \21\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2"+
		"\2\2\\^\7\t\2\2]X\3\2\2\2]^\3\2\2\2^a\3\2\2\2_`\7\f\2\2`b\5 \21\2a_\3"+
		"\2\2\2ab\3\2\2\2b\13\3\2\2\2cd\t\2\2\2d\r\3\2\2\2eq\5\20\t\2fq\5\22\n"+
		"\2gq\5\24\13\2hi\5\b\5\2ij\7\21\2\2jq\3\2\2\2kq\5\32\16\2lq\5\30\r\2m"+
		"q\5\34\17\2nq\5\36\20\2oq\5\26\f\2pe\3\2\2\2pf\3\2\2\2pg\3\2\2\2ph\3\2"+
		"\2\2pk\3\2\2\2pl\3\2\2\2pm\3\2\2\2pn\3\2\2\2po\3\2\2\2q\17\3\2\2\2rv\7"+
		"\22\2\2su\5\16\b\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2x"+
		"v\3\2\2\2yz\7\23\2\2z\21\3\2\2\2{|\5\n\6\2|}\7\21\2\2}\23\3\2\2\2~\u0083"+
		"\7.\2\2\177\u0080\7\b\2\2\u0080\u0081\5 \21\2\u0081\u0082\7\t\2\2\u0082"+
		"\u0084\3\2\2\2\u0083\177\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2"+
		"\2\u0085\u0086\7\f\2\2\u0086\u0087\5 \21\2\u0087\u0088\7\21\2\2\u0088"+
		"\25\3\2\2\2\u0089\u008a\5 \21\2\u008a\u008b\7\21\2\2\u008b\27\3\2\2\2"+
		"\u008c\u008d\7\24\2\2\u008d\u008e\7\4\2\2\u008e\u008f\5\n\6\2\u008f\u0090"+
		"\7\21\2\2\u0090\u0091\5 \21\2\u0091\u0092\7\21\2\2\u0092\u0093\5 \21\2"+
		"\u0093\u0094\7\6\2\2\u0094\u0095\5\16\b\2\u0095\31\3\2\2\2\u0096\u0097"+
		"\7\25\2\2\u0097\u0098\7\4\2\2\u0098\u0099\5 \21\2\u0099\u009a\7\6\2\2"+
		"\u009a\u00a4\5\16\b\2\u009b\u009c\7\26\2\2\u009c\u009d\7\25\2\2\u009d"+
		"\u009e\7\4\2\2\u009e\u009f\5 \21\2\u009f\u00a0\7\6\2\2\u00a0\u00a1\5\16"+
		"\b\2\u00a1\u00a3\3\2\2\2\u00a2\u009b\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a9\3\2\2\2\u00a6\u00a4\3\2"+
		"\2\2\u00a7\u00a8\7\26\2\2\u00a8\u00aa\5\16\b\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\33\3\2\2\2\u00ab\u00ac\7\27\2\2\u00ac\u00ad\7\4\2"+
		"\2\u00ad\u00ae\5 \21\2\u00ae\u00af\7\6\2\2\u00af\u00b0\5\16\b\2\u00b0"+
		"\35\3\2\2\2\u00b1\u00b2\7\30\2\2\u00b2\u00b3\5 \21\2\u00b3\u00b4\7\21"+
		"\2\2\u00b4\37\3\2\2\2\u00b5\u00b6\b\21\1\2\u00b6\u00b7\7\4\2\2\u00b7\u00b8"+
		"\5 \21\2\u00b8\u00b9\7\6\2\2\u00b9\u00c8\3\2\2\2\u00ba\u00bb\7.\2\2\u00bb"+
		"\u00bc\7\b\2\2\u00bc\u00bd\5 \21\2\u00bd\u00be\7\t\2\2\u00be\u00c8\3\2"+
		"\2\2\u00bf\u00c0\7\33\2\2\u00c0\u00c8\5 \21\17\u00c1\u00c8\7*\2\2\u00c2"+
		"\u00c8\7+\2\2\u00c3\u00c8\7,\2\2\u00c4\u00c8\7-\2\2\u00c5\u00c8\7.\2\2"+
		"\u00c6\u00c8\5\b\5\2\u00c7\u00b5\3\2\2\2\u00c7\u00ba\3\2\2\2\u00c7\u00bf"+
		"\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c7"+
		"\u00c4\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00df\3\2"+
		"\2\2\u00c9\u00ca\f\16\2\2\u00ca\u00cb\t\3\2\2\u00cb\u00de\5 \21\17\u00cc"+
		"\u00cd\f\r\2\2\u00cd\u00ce\t\4\2\2\u00ce\u00de\5 \21\16\u00cf\u00d0\f"+
		"\f\2\2\u00d0\u00d1\t\5\2\2\u00d1\u00de\5 \21\r\u00d2\u00d3\f\13\2\2\u00d3"+
		"\u00d4\t\6\2\2\u00d4\u00de\5 \21\f\u00d5\u00d6\f\n\2\2\u00d6\u00d7\7\'"+
		"\2\2\u00d7\u00de\5 \21\13\u00d8\u00d9\f\t\2\2\u00d9\u00da\7(\2\2\u00da"+
		"\u00de\5 \21\n\u00db\u00dc\f\20\2\2\u00dc\u00de\t\7\2\2\u00dd\u00c9\3"+
		"\2\2\2\u00dd\u00cc\3\2\2\2\u00dd\u00cf\3\2\2\2\u00dd\u00d2\3\2\2\2\u00dd"+
		"\u00d5\3\2\2\2\u00dd\u00d8\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e1\3\2"+
		"\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0!\3\2\2\2\u00e1\u00df"+
		"\3\2\2\2\25%/\629;DMPZ]apv\u0083\u00a4\u00a9\u00c7\u00dd\u00df";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}