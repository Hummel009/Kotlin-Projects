// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class RubyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HereDoc1=1, HereDoc2=2, HereDoc3=3, PercentString=4, ALIAS=5, BEGIN=6, 
		BEGIN_BLOCK=7, BREAK=8, CASE=9, CLASS=10, DEF=11, DEFINED=12, DO=13, ELSE=14, 
		ELSIF=15, END_BLOCK=16, END=17, ENSURE=18, FALSE=19, FOR=20, IF=21, IN=22, 
		MODULE=23, NEXT=24, NIL=25, NOT=26, RAISE=27, REDO=28, RESCUE=29, RETRY=30, 
		RETURN=31, SELF=32, SUPER=33, THEN=34, TRUE=35, UNDEF=36, UNLESS=37, UNTIL=38, 
		WHEN=39, WHILE=40, YIELD=41, Integer=42, Float=43, Regex=44, String=45, 
		DollarSpecial=46, CRLF=47, AND=48, OR=49, PLUS=50, MINUS=51, MOD=52, PLUS_ASSIGN=53, 
		MOD_ASSIGN=54, SHARP=55, AND_ASSIGN=56, BIT_AND_ASSIGN=57, ANDDOT=58, 
		BIT_AND=59, EXP_ASSIGN=60, EXP=61, MUL=62, MUL_ASSIGN=63, DOLLAR=64, AT=65, 
		RIGHT_PAREN=66, LEFT_PAREN=67, RIGHT_SBRACKET=68, LEFT_SBRACKET=69, RIGHT_RBRACKET=70, 
		LEFT_RBRACKET=71, DOT3=72, DOT2=73, DOT=74, DIV_ASSIGN=75, DIV=76, QUESTION=77, 
		NOT_EQUAL=78, SIGH=79, COLON=80, COLON2=81, SEMICOLON=82, COMMA=83, MINUS_ASSIGN=84, 
		OR_ASSIGN=85, BIT_OR_ASSIGN=86, BIT_OR=87, BIT_SHR_ASSIGN=88, GREATER_EQUAL=89, 
		BIT_SHR=90, GREATER=91, ASSIGN=92, ASSOC=93, EQUAL3=94, EQUAL=95, PATTERN_MATCH=96, 
		LESS_EQUAL=97, LESS=98, BIT_SHL_ASSIGN=99, BIT_SHL=100, BIT_NOT_ASSIGN=101, 
		BIT_NOT=102, BIT_XOR_ASSIGN=103, BIT_XOR=104, SL_COMMENT=105, ML_COMMENT=106, 
		WS=107, Identifier=108, ShellCommand=109, HereDocEnd1=110, HereDocEnd2=111, 
		AnyInHere=112, SL_COMMENT_IN_HEREDOC=113, ML_COMMENT_IN_HEREDOC=114, PercentStringLineEnd=115, 
		AnyInQuotedString1=116, AnyInQuotedString2=117;
	public static final int
		RULE_compilation_unit = 0, RULE_statement_list_terms = 1, RULE_statement_list_noterms = 2, 
		RULE_statement = 3, RULE_undef_statement = 4, RULE_alias_statement = 5, 
		RULE_function_name_or_symbol = 6, RULE_begin_block = 7, RULE_end_block = 8, 
		RULE_module_definition = 9, RULE_class_definition = 10, RULE_superclass = 11, 
		RULE_class_header = 12, RULE_function_definition = 13, RULE_function_definition_header = 14, 
		RULE_function_name = 15, RULE_function_definition_params = 16, RULE_function_definition_param = 17, 
		RULE_function_call_param = 18, RULE_expr = 19, RULE_expr_statement_suffix = 20, 
		RULE_primary = 21, RULE_func_call_parameters = 22, RULE_func_call_parameters_no_bracket = 23, 
		RULE_rescure_param = 24, RULE_case_body = 25, RULE_when_cond = 26, RULE_if_tail = 27, 
		RULE_else_tail = 28, RULE_dot_ref = 29, RULE_logicalOperator = 30, RULE_equalsOperator = 31, 
		RULE_compareOperator = 32, RULE_bitOperator = 33, RULE_mathOperator = 34, 
		RULE_assignOperator = 35, RULE_not = 36, RULE_block = 37, RULE_block_params = 38, 
		RULE_id_symbol = 39, RULE_symbol = 40, RULE_hash_asso = 41, RULE_variable_path = 42, 
		RULE_cpath = 43, RULE_literal = 44, RULE_identifier = 45, RULE_empty = 46, 
		RULE_globalVar = 47, RULE_classVar = 48, RULE_instanceVar = 49, RULE_idArg = 50, 
		RULE_do_keyword = 51, RULE_then_keyword = 52, RULE_string = 53, RULE_crlfs = 54, 
		RULE_terms = 55, RULE_term = 56;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilation_unit", "statement_list_terms", "statement_list_noterms", 
			"statement", "undef_statement", "alias_statement", "function_name_or_symbol", 
			"begin_block", "end_block", "module_definition", "class_definition", 
			"superclass", "class_header", "function_definition", "function_definition_header", 
			"function_name", "function_definition_params", "function_definition_param", 
			"function_call_param", "expr", "expr_statement_suffix", "primary", "func_call_parameters", 
			"func_call_parameters_no_bracket", "rescure_param", "case_body", "when_cond", 
			"if_tail", "else_tail", "dot_ref", "logicalOperator", "equalsOperator", 
			"compareOperator", "bitOperator", "mathOperator", "assignOperator", "not", 
			"block", "block_params", "id_symbol", "symbol", "hash_asso", "variable_path", 
			"cpath", "literal", "identifier", "empty", "globalVar", "classVar", "instanceVar", 
			"idArg", "do_keyword", "then_keyword", "string", "crlfs", "terms", "term"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'alias'", "'begin'", "'BEGIN'", "'break'", 
			"'case'", "'class'", "'def'", "'defined?'", "'do'", "'else'", "'elsif'", 
			"'END'", "'end'", "'ensure'", "'false'", "'for'", "'if'", "'in'", "'module'", 
			"'next'", "'nil'", "'not'", "'raise'", "'redo'", "'rescue'", "'retry'", 
			"'return'", "'self'", "'super'", "'then'", "'true'", "'undef'", "'unless'", 
			"'until'", "'when'", "'while'", "'yield'", null, null, null, null, null, 
			null, null, null, "'+'", "'-'", "'%'", "'+='", "'%='", "'#'", "'&&='", 
			"'&='", "'&.'", "'&'", "'**='", "'**'", "'*'", "'*='", "'$'", "'@'", 
			"'}'", "'{'", "']'", "'['", "')'", "'('", "'...'", "'..'", "'.'", "'/='", 
			"'/'", "'?'", "'!='", "'!'", "':'", "'::'", "';'", "','", "'-='", "'||='", 
			"'|='", "'|'", "'>>='", "'>='", "'>>'", "'>'", "'='", "'=>'", "'==='", 
			"'=='", "'=~'", "'<='", "'<'", "'<<='", "'<<'", "'~='", "'~'", "'^='", 
			"'^'"
		};
	}

	public String[] getLiteralNames() {
		return _LITERAL_NAMES;
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HereDoc1", "HereDoc2", "HereDoc3", "PercentString", "ALIAS", "BEGIN", 
			"BEGIN_BLOCK", "BREAK", "CASE", "CLASS", "DEF", "DEFINED", "DO", "ELSE", 
			"ELSIF", "END_BLOCK", "END", "ENSURE", "FALSE", "FOR", "IF", "IN", "MODULE", 
			"NEXT", "NIL", "NOT", "RAISE", "REDO", "RESCUE", "RETRY", "RETURN", "SELF", 
			"SUPER", "THEN", "TRUE", "UNDEF", "UNLESS", "UNTIL", "WHEN", "WHILE", 
			"YIELD", "Integer", "Float", "Regex", "String", "DollarSpecial", "CRLF", 
			"AND", "OR", "PLUS", "MINUS", "MOD", "PLUS_ASSIGN", "MOD_ASSIGN", "SHARP", 
			"AND_ASSIGN", "BIT_AND_ASSIGN", "ANDDOT", "BIT_AND", "EXP_ASSIGN", "EXP", 
			"MUL", "MUL_ASSIGN", "DOLLAR", "AT", "RIGHT_PAREN", "LEFT_PAREN", "RIGHT_SBRACKET", 
			"LEFT_SBRACKET", "RIGHT_RBRACKET", "LEFT_RBRACKET", "DOT3", "DOT2", "DOT", 
			"DIV_ASSIGN", "DIV", "QUESTION", "NOT_EQUAL", "SIGH", "COLON", "COLON2", 
			"SEMICOLON", "COMMA", "MINUS_ASSIGN", "OR_ASSIGN", "BIT_OR_ASSIGN", "BIT_OR", 
			"BIT_SHR_ASSIGN", "GREATER_EQUAL", "BIT_SHR", "GREATER", "ASSIGN", "ASSOC", 
			"EQUAL3", "EQUAL", "PATTERN_MATCH", "LESS_EQUAL", "LESS", "BIT_SHL_ASSIGN", 
			"BIT_SHL", "BIT_NOT_ASSIGN", "BIT_NOT", "BIT_XOR_ASSIGN", "BIT_XOR", 
			"SL_COMMENT", "ML_COMMENT", "WS", "Identifier", "ShellCommand", "HereDocEnd1", 
			"HereDocEnd2", "AnyInHere", "SL_COMMENT_IN_HEREDOC", "ML_COMMENT_IN_HEREDOC", 
			"PercentStringLineEnd", "AnyInQuotedString1", "AnyInQuotedString2"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RubyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Compilation_unitContext extends ParserRuleContext {
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public Compilation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterCompilation_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitCompilation_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitCompilation_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compilation_unitContext compilation_unit() throws RecognitionException {
		Compilation_unitContext _localctx = new Compilation_unitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilation_unit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			statement_list_terms(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Statement_list_termsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public Statement_list_termsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterStatement_list_terms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitStatement_list_terms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitStatement_list_terms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_list_termsContext statement_list_terms() throws RecognitionException {
		return statement_list_terms(0);
	}

	private Statement_list_termsContext statement_list_terms(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Statement_list_termsContext _localctx = new Statement_list_termsContext(_ctx, _parentState);
		Statement_list_termsContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_statement_list_terms, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALIAS:
			case BEGIN:
			case BEGIN_BLOCK:
			case BREAK:
			case CASE:
			case CLASS:
			case DEF:
			case DEFINED:
			case END_BLOCK:
			case ENSURE:
			case FALSE:
			case FOR:
			case IF:
			case MODULE:
			case NEXT:
			case NIL:
			case NOT:
			case RAISE:
			case REDO:
			case RESCUE:
			case RETRY:
			case RETURN:
			case SELF:
			case SUPER:
			case TRUE:
			case UNDEF:
			case UNLESS:
			case UNTIL:
			case WHEN:
			case WHILE:
			case YIELD:
			case Integer:
			case Float:
			case Regex:
			case String:
			case DollarSpecial:
			case AND:
			case OR:
			case PLUS:
			case MINUS:
			case MOD:
			case PLUS_ASSIGN:
			case MOD_ASSIGN:
			case AND_ASSIGN:
			case BIT_AND_ASSIGN:
			case BIT_AND:
			case EXP_ASSIGN:
			case EXP:
			case MUL:
			case MUL_ASSIGN:
			case DOLLAR:
			case AT:
			case LEFT_PAREN:
			case LEFT_SBRACKET:
			case LEFT_RBRACKET:
			case DIV_ASSIGN:
			case DIV:
			case NOT_EQUAL:
			case SIGH:
			case COLON:
			case COLON2:
			case MINUS_ASSIGN:
			case OR_ASSIGN:
			case BIT_OR_ASSIGN:
			case BIT_OR:
			case BIT_SHR_ASSIGN:
			case GREATER_EQUAL:
			case BIT_SHR:
			case GREATER:
			case EQUAL3:
			case EQUAL:
			case LESS_EQUAL:
			case LESS:
			case BIT_SHL_ASSIGN:
			case BIT_SHL:
			case BIT_NOT_ASSIGN:
			case BIT_NOT:
			case BIT_XOR_ASSIGN:
			case BIT_XOR:
			case Identifier:
			case ShellCommand:
				{
				setState(117);
				statement();
				setState(118);
				terms();
				}
				break;
			case CRLF:
			case SEMICOLON:
			case SL_COMMENT:
				{
				setState(120);
				terms();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Statement_list_termsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statement_list_terms);
					setState(123);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(124);
					statement();
					setState(125);
					terms();
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Statement_list_notermsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TermsContext> terms() {
			return getRuleContexts(TermsContext.class);
		}
		public TermsContext terms(int i) {
			return getRuleContext(TermsContext.class,i);
		}
		public Statement_list_notermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list_noterms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterStatement_list_noterms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitStatement_list_noterms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitStatement_list_noterms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_list_notermsContext statement_list_noterms() throws RecognitionException {
		Statement_list_notermsContext _localctx = new Statement_list_notermsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement_list_noterms);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(132);
					statement();
					setState(133);
					terms();
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(140);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Begin_blockContext begin_block() {
			return getRuleContext(Begin_blockContext.class,0);
		}
		public End_blockContext end_block() {
			return getRuleContext(End_blockContext.class,0);
		}
		public Alias_statementContext alias_statement() {
			return getRuleContext(Alias_statementContext.class,0);
		}
		public Undef_statementContext undef_statement() {
			return getRuleContext(Undef_statementContext.class,0);
		}
		public TerminalNode ENSURE() { return getToken(RubyParser.ENSURE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN_BLOCK:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				begin_block();
				}
				break;
			case END_BLOCK:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				end_block();
				}
				break;
			case ALIAS:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				alias_statement();
				}
				break;
			case UNDEF:
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				undef_statement();
				}
				break;
			case ENSURE:
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
				match(ENSURE);
				}
				break;
			case BEGIN:
			case BREAK:
			case CASE:
			case CLASS:
			case DEF:
			case DEFINED:
			case FALSE:
			case FOR:
			case IF:
			case MODULE:
			case NEXT:
			case NIL:
			case NOT:
			case RAISE:
			case REDO:
			case RESCUE:
			case RETRY:
			case RETURN:
			case SELF:
			case SUPER:
			case TRUE:
			case UNLESS:
			case UNTIL:
			case WHEN:
			case WHILE:
			case YIELD:
			case Integer:
			case Float:
			case Regex:
			case String:
			case DollarSpecial:
			case AND:
			case OR:
			case PLUS:
			case MINUS:
			case MOD:
			case PLUS_ASSIGN:
			case MOD_ASSIGN:
			case AND_ASSIGN:
			case BIT_AND_ASSIGN:
			case BIT_AND:
			case EXP_ASSIGN:
			case EXP:
			case MUL:
			case MUL_ASSIGN:
			case DOLLAR:
			case AT:
			case LEFT_PAREN:
			case LEFT_SBRACKET:
			case LEFT_RBRACKET:
			case DIV_ASSIGN:
			case DIV:
			case NOT_EQUAL:
			case SIGH:
			case COLON:
			case COLON2:
			case MINUS_ASSIGN:
			case OR_ASSIGN:
			case BIT_OR_ASSIGN:
			case BIT_OR:
			case BIT_SHR_ASSIGN:
			case GREATER_EQUAL:
			case BIT_SHR:
			case GREATER:
			case EQUAL3:
			case EQUAL:
			case LESS_EQUAL:
			case LESS:
			case BIT_SHL_ASSIGN:
			case BIT_SHL:
			case BIT_NOT_ASSIGN:
			case BIT_NOT:
			case BIT_XOR_ASSIGN:
			case BIT_XOR:
			case Identifier:
			case ShellCommand:
				enterOuterAlt(_localctx, 6);
				{
				setState(147);
				expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Undef_statementContext extends ParserRuleContext {
		public TerminalNode UNDEF() { return getToken(RubyParser.UNDEF, 0); }
		public List<Function_name_or_symbolContext> function_name_or_symbol() {
			return getRuleContexts(Function_name_or_symbolContext.class);
		}
		public Function_name_or_symbolContext function_name_or_symbol(int i) {
			return getRuleContext(Function_name_or_symbolContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RubyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RubyParser.COMMA, i);
		}
		public Undef_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_undef_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterUndef_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitUndef_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitUndef_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Undef_statementContext undef_statement() throws RecognitionException {
		Undef_statementContext _localctx = new Undef_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_undef_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(UNDEF);
			setState(151);
			function_name_or_symbol();
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(152);
					match(COMMA);
					setState(153);
					function_name_or_symbol();
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Alias_statementContext extends ParserRuleContext {
		public TerminalNode ALIAS() { return getToken(RubyParser.ALIAS, 0); }
		public List<Function_name_or_symbolContext> function_name_or_symbol() {
			return getRuleContexts(Function_name_or_symbolContext.class);
		}
		public Function_name_or_symbolContext function_name_or_symbol(int i) {
			return getRuleContext(Function_name_or_symbolContext.class,i);
		}
		public Alias_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterAlias_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitAlias_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitAlias_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alias_statementContext alias_statement() throws RecognitionException {
		Alias_statementContext _localctx = new Alias_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_alias_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(ALIAS);
			setState(160);
			function_name_or_symbol();
			setState(161);
			function_name_or_symbol();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_name_or_symbolContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public Function_name_or_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name_or_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterFunction_name_or_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitFunction_name_or_symbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitFunction_name_or_symbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_name_or_symbolContext function_name_or_symbol() throws RecognitionException {
		Function_name_or_symbolContext _localctx = new Function_name_or_symbolContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_name_or_symbol);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
			case FALSE:
			case NEXT:
			case NIL:
			case REDO:
			case RETRY:
			case SELF:
			case SUPER:
			case TRUE:
			case Integer:
			case Float:
			case String:
			case DollarSpecial:
			case AND:
			case OR:
			case PLUS:
			case MINUS:
			case MOD:
			case PLUS_ASSIGN:
			case MOD_ASSIGN:
			case AND_ASSIGN:
			case BIT_AND_ASSIGN:
			case BIT_AND:
			case EXP_ASSIGN:
			case EXP:
			case MUL:
			case MUL_ASSIGN:
			case DOLLAR:
			case AT:
			case LEFT_PAREN:
			case LEFT_SBRACKET:
			case DIV_ASSIGN:
			case DIV:
			case NOT_EQUAL:
			case MINUS_ASSIGN:
			case OR_ASSIGN:
			case BIT_OR_ASSIGN:
			case BIT_OR:
			case BIT_SHR_ASSIGN:
			case GREATER_EQUAL:
			case BIT_SHR:
			case GREATER:
			case EQUAL3:
			case EQUAL:
			case LESS_EQUAL:
			case LESS:
			case BIT_SHL_ASSIGN:
			case BIT_SHL:
			case BIT_NOT_ASSIGN:
			case BIT_XOR_ASSIGN:
			case BIT_XOR:
			case Identifier:
			case ShellCommand:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				function_name();
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				symbol();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Begin_blockContext extends ParserRuleContext {
		public TerminalNode BEGIN_BLOCK() { return getToken(RubyParser.BEGIN_BLOCK, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(RubyParser.LEFT_PAREN, 0); }
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(RubyParser.RIGHT_PAREN, 0); }
		public Begin_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterBegin_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitBegin_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitBegin_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_blockContext begin_block() throws RecognitionException {
		Begin_blockContext _localctx = new Begin_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_begin_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(BEGIN_BLOCK);
			setState(168);
			match(LEFT_PAREN);
			setState(169);
			statement_list_terms(0);
			setState(170);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class End_blockContext extends ParserRuleContext {
		public TerminalNode END_BLOCK() { return getToken(RubyParser.END_BLOCK, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(RubyParser.LEFT_PAREN, 0); }
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(RubyParser.RIGHT_PAREN, 0); }
		public End_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterEnd_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitEnd_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitEnd_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_blockContext end_block() throws RecognitionException {
		End_blockContext _localctx = new End_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_end_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(END_BLOCK);
			setState(173);
			match(LEFT_PAREN);
			setState(174);
			statement_list_terms(0);
			setState(175);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Module_definitionContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(RubyParser.MODULE, 0); }
		public CpathContext cpath() {
			return getRuleContext(CpathContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public Module_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterModule_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitModule_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitModule_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_definitionContext module_definition() throws RecognitionException {
		Module_definitionContext _localctx = new Module_definitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_module_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(MODULE);
			setState(178);
			cpath();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -324259190354927648L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 57169503836331L) != 0) {
				{
				setState(179);
				statement_list_terms(0);
				}
			}

			setState(182);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Class_definitionContext extends ParserRuleContext {
		public Class_headerContext class_header() {
			return getRuleContext(Class_headerContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public Class_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterClass_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitClass_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitClass_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_definitionContext class_definition() throws RecognitionException {
		Class_definitionContext _localctx = new Class_definitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_class_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			class_header();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -324259190354927648L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 57169503836331L) != 0) {
				{
				setState(185);
				statement_list_terms(0);
				}
			}

			setState(188);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SuperclassContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(RubyParser.LESS, 0); }
		public Id_symbolContext id_symbol() {
			return getRuleContext(Id_symbolContext.class,0);
		}
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public SuperclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterSuperclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitSuperclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitSuperclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_superclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(LESS);
			setState(191);
			id_symbol();
			setState(192);
			terms();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Class_headerContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(RubyParser.CLASS, 0); }
		public CpathContext cpath() {
			return getRuleContext(CpathContext.class,0);
		}
		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class,0);
		}
		public TerminalNode BIT_SHL() { return getToken(RubyParser.BIT_SHL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Class_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterClass_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitClass_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitClass_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_headerContext class_header() throws RecognitionException {
		Class_headerContext _localctx = new Class_headerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_class_header);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(CLASS);
				setState(195);
				cpath();
				setState(197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(196);
					superclass();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(CLASS);
				setState(200);
				match(BIT_SHL);
				setState(201);
				identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_definitionContext extends ParserRuleContext {
		public Function_definition_headerContext function_definition_header() {
			return getRuleContext(Function_definition_headerContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitFunction_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitFunction_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			function_definition_header();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -324259190354927648L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 57169503836331L) != 0) {
				{
				setState(205);
				statement_list_terms(0);
				}
			}

			setState(208);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_definition_headerContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(RubyParser.DEF, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public Function_definition_paramsContext function_definition_params() {
			return getRuleContext(Function_definition_paramsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Function_definition_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterFunction_definition_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitFunction_definition_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitFunction_definition_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definition_headerContext function_definition_header() throws RecognitionException {
		Function_definition_headerContext _localctx = new Function_definition_headerContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_definition_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(DEF);
			setState(211);
			function_name();
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(212);
				function_definition_params();
				}
				break;
			}
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -324399996563087552L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 54970480318635L) != 0) {
				{
				setState(215);
				expr(0);
				}
			}

			setState(218);
			terms();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_nameContext extends ParserRuleContext {
		public CpathContext cpath() {
			return getRuleContext(CpathContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(RubyParser.QUESTION, 0); }
		public TerminalNode SIGH() { return getToken(RubyParser.SIGH, 0); }
		public TerminalNode ASSIGN() { return getToken(RubyParser.ASSIGN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public AssignOperatorContext assignOperator() {
			return getRuleContext(AssignOperatorContext.class,0);
		}
		public MathOperatorContext mathOperator() {
			return getRuleContext(MathOperatorContext.class,0);
		}
		public TerminalNode AT() { return getToken(RubyParser.AT, 0); }
		public BitOperatorContext bitOperator() {
			return getRuleContext(BitOperatorContext.class,0);
		}
		public CompareOperatorContext compareOperator() {
			return getRuleContext(CompareOperatorContext.class,0);
		}
		public EqualsOperatorContext equalsOperator() {
			return getRuleContext(EqualsOperatorContext.class,0);
		}
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function_name);
		int _la;
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				cpath();
				setState(222);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(221);
					_la = _input.LA(1);
					if ( !((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 32773L) != 0) ) {
					_errHandler.recoverInline(this);
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
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				assignOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				mathOperator();
				setState(227);
				match(AT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(229);
				bitOperator();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(230);
				compareOperator();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(231);
				equalsOperator();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(232);
				logicalOperator();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_definition_paramsContext extends ParserRuleContext {
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyParser.RIGHT_RBRACKET, 0); }
		public List<Function_definition_paramContext> function_definition_param() {
			return getRuleContexts(Function_definition_paramContext.class);
		}
		public Function_definition_paramContext function_definition_param(int i) {
			return getRuleContext(Function_definition_paramContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RubyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RubyParser.COMMA, i);
		}
		public List<CrlfsContext> crlfs() {
			return getRuleContexts(CrlfsContext.class);
		}
		public CrlfsContext crlfs(int i) {
			return getRuleContext(CrlfsContext.class,i);
		}
		public Function_definition_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterFunction_definition_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitFunction_definition_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitFunction_definition_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definition_paramsContext function_definition_params() throws RecognitionException {
		Function_definition_paramsContext _localctx = new Function_definition_paramsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function_definition_params);
		int _la;
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(LEFT_RBRACKET);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & -324399996563087552L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 54970480318635L) != 0) {
					{
					setState(236);
					function_definition_param();
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(237);
						match(COMMA);
						setState(239);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==CRLF || _la==SL_COMMENT) {
							{
							setState(238);
							crlfs();
							}
						}

						setState(241);
						function_definition_param();
						}
						}
						setState(246);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(249);
				match(RIGHT_RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				function_definition_param();
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(251);
					match(COMMA);
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CRLF || _la==SL_COMMENT) {
						{
						setState(252);
						crlfs();
						}
					}

					setState(255);
					function_definition_param();
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_definition_paramContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode MUL() { return getToken(RubyParser.MUL, 0); }
		public TerminalNode EXP() { return getToken(RubyParser.EXP, 0); }
		public TerminalNode BIT_AND() { return getToken(RubyParser.BIT_AND, 0); }
		public Hash_assoContext hash_asso() {
			return getRuleContext(Hash_assoContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Function_definition_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterFunction_definition_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitFunction_definition_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitFunction_definition_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definition_paramContext function_definition_param() throws RecognitionException {
		Function_definition_paramContext _localctx = new Function_definition_paramContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function_definition_param);
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(MUL);
				setState(265);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				match(EXP);
				setState(267);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				match(BIT_AND);
				setState(269);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(270);
				hash_asso();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(271);
				identifier();
				setState(272);
				match(ASSIGN);
				setState(273);
				expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_call_paramContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Hash_assoContext hash_asso() {
			return getRuleContext(Hash_assoContext.class,0);
		}
		public Function_call_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterFunction_call_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitFunction_call_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitFunction_call_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_paramContext function_call_param() throws RecognitionException {
		Function_call_paramContext _localctx = new Function_call_paramContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function_call_param);
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				hash_asso();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprLogicalNotContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public TerminalNode BIT_NOT() { return getToken(RubyParser.BIT_NOT, 0); }
		public ExprLogicalNotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitExprLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprDotClassContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Dot_refContext dot_ref() {
			return getRuleContext(Dot_refContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(RubyParser.CLASS, 0); }
		public ExprDotClassContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprDotClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprDotClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitExprDotClass(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprCalcuationContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MathOperatorContext mathOperator() {
			return getRuleContext(MathOperatorContext.class,0);
		}
		public BitOperatorContext bitOperator() {
			return getRuleContext(BitOperatorContext.class,0);
		}
		public CrlfsContext crlfs() {
			return getRuleContext(CrlfsContext.class,0);
		}
		public ExprCalcuationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprCalcuation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprCalcuation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitExprCalcuation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprPrimaryContext extends ExprContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExprPrimaryContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitExprPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprCompareLogicalContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CompareOperatorContext compareOperator() {
			return getRuleContext(CompareOperatorContext.class,0);
		}
		public CrlfsContext crlfs() {
			return getRuleContext(CrlfsContext.class,0);
		}
		public ExprCompareLogicalContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprCompareLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprCompareLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitExprCompareLogical(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprBatchAssignContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(RubyParser.ASSIGN, 0); }
		public TerminalNode COMMA() { return getToken(RubyParser.COMMA, 0); }
		public TerminalNode MUL() { return getToken(RubyParser.MUL, 0); }
		public CrlfsContext crlfs() {
			return getRuleContext(CrlfsContext.class,0);
		}
		public ExprBatchAssignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprBatchAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprBatchAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitExprBatchAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprPatternMatch2Context extends ExprContext {
		public Token bop;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BIT_NOT() { return getToken(RubyParser.BIT_NOT, 0); }
		public ExprPatternMatch2Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprPatternMatch2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprPatternMatch2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitExprPatternMatch2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprPatternMatch3Context extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SIGH() { return getToken(RubyParser.SIGH, 0); }
		public TerminalNode BIT_NOT() { return getToken(RubyParser.BIT_NOT, 0); }
		public ExprPatternMatch3Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprPatternMatch3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprPatternMatch3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitExprPatternMatch3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprPrefixCalcContext extends ExprContext {
		public Token prefix;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(RubyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RubyParser.MINUS, 0); }
		public TerminalNode MUL() { return getToken(RubyParser.MUL, 0); }
		public TerminalNode MOD() { return getToken(RubyParser.MOD, 0); }
		public TerminalNode BIT_AND() { return getToken(RubyParser.BIT_AND, 0); }
		public ExprPrefixCalcContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprPrefixCalc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprPrefixCalc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitExprPrefixCalc(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprFunctionCall3Context extends ExprContext {
		public CpathContext cpath() {
			return getRuleContext(CpathContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(RubyParser.QUESTION, 0); }
		public TerminalNode SIGH() { return getToken(RubyParser.SIGH, 0); }
		public ExprFunctionCall3Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprFunctionCall3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprFunctionCall3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitExprFunctionCall3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprQuestionContext extends ExprContext {
		public Token postfix;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(RubyParser.QUESTION, 0); }
		public ExprQuestionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitExprQuestion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprFunctionCall2Context extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Dot_refContext dot_ref() {
			return getRuleContext(Dot_refContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Func_call_parameters_no_bracketContext func_call_parameters_no_bracket() {
			return getRuleContext(Func_call_parameters_no_bracketContext.class,0);
		}
		public Expr_statement_suffixContext expr_statement_suffix() {
			return getRuleContext(Expr_statement_suffixContext.class,0);
		}
		public ExprFunctionCall2Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprFunctionCall2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprFunctionCall2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitExprFunctionCall2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprFunctionCall1Context extends ExprContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Func_call_parameters_no_bracketContext func_call_parameters_no_bracket() {
			return getRuleContext(Func_call_parameters_no_bracketContext.class,0);
		}
		public Expr_statement_suffixContext expr_statement_suffix() {
			return getRuleContext(Expr_statement_suffixContext.class,0);
		}
		public ExprFunctionCall1Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprFunctionCall1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprFunctionCall1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitExprFunctionCall1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprEqualTestContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualsOperatorContext equalsOperator() {
			return getRuleContext(EqualsOperatorContext.class,0);
		}
		public CrlfsContext crlfs() {
			return getRuleContext(CrlfsContext.class,0);
		}
		public ExprEqualTestContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprEqualTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprEqualTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitExprEqualTest(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprRangeContext extends ExprContext {
		public Token bop;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DOT2() { return getToken(RubyParser.DOT2, 0); }
		public TerminalNode DOT3() { return getToken(RubyParser.DOT3, 0); }
		public ExprRangeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitExprRange(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprPatternMatch1Context extends ExprContext {
		public Token bop;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PATTERN_MATCH() { return getToken(RubyParser.PATTERN_MATCH, 0); }
		public ExprPatternMatch1Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprPatternMatch1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprPatternMatch1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitExprPatternMatch1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprBlockContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExprBlockContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitExprBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprLogicalJoinContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public CrlfsContext crlfs() {
			return getRuleContext(CrlfsContext.class,0);
		}
		public ExprLogicalJoinContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprLogicalJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprLogicalJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitExprLogicalJoin(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprArrayAccessContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LEFT_SBRACKET() { return getToken(RubyParser.LEFT_SBRACKET, 0); }
		public TerminalNode RIGHT_SBRACKET() { return getToken(RubyParser.RIGHT_SBRACKET, 0); }
		public ExprArrayAccessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitExprArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprConditionStatementContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode QUESTION() { return getToken(RubyParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(RubyParser.COLON, 0); }
		public ExprConditionStatementContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprConditionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprConditionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitExprConditionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprWitStatementSuffixContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_statement_suffixContext expr_statement_suffix() {
			return getRuleContext(Expr_statement_suffixContext.class,0);
		}
		public ExprWitStatementSuffixContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprWitStatementSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprWitStatementSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitExprWitStatementSuffix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprDefineTestContext extends ExprContext {
		public Token prefix;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DEFINED() { return getToken(RubyParser.DEFINED, 0); }
		public ExprDefineTestContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprDefineTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprDefineTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitExprDefineTest(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprListContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(RubyParser.COMMA, 0); }
		public CrlfsContext crlfs() {
			return getRuleContext(CrlfsContext.class,0);
		}
		public ExprListContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprDotRefContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Dot_refContext dot_ref() {
			return getRuleContext(Dot_refContext.class,0);
		}
		public CrlfsContext crlfs() {
			return getRuleContext(CrlfsContext.class,0);
		}
		public ExprDotRefContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprDotRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprDotRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitExprDotRef(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAssignContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AssignOperatorContext assignOperator() {
			return getRuleContext(AssignOperatorContext.class,0);
		}
		public CrlfsContext crlfs() {
			return getRuleContext(CrlfsContext.class,0);
		}
		public ExprAssignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitExprAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				_localctx = new ExprPrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(282);
				primary();
				}
				break;
			case 2:
				{
				_localctx = new ExprPrefixCalcContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(283);
				((ExprPrefixCalcContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 5196028070078709760L) != 0) ) {
					((ExprPrefixCalcContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(284);
				expr(21);
				}
				break;
			case 3:
				{
				_localctx = new ExprDefineTestContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(285);
				((ExprDefineTestContext)_localctx).prefix = match(DEFINED);
				setState(286);
				expr(19);
				}
				break;
			case 4:
				{
				_localctx = new ExprLogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(289);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
				case SIGH:
					{
					setState(287);
					not();
					}
					break;
				case BIT_NOT:
					{
					setState(288);
					match(BIT_NOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(291);
				expr(12);
				}
				break;
			case 5:
				{
				_localctx = new ExprFunctionCall1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(292);
				function_name();
				setState(293);
				func_call_parameters_no_bracket();
				setState(295);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(294);
					expr_statement_suffix();
					}
					break;
				}
				}
				break;
			case 6:
				{
				_localctx = new ExprFunctionCall3Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(297);
				cpath();
				setState(298);
				_la = _input.LA(1);
				if ( !(_la==QUESTION || _la==SIGH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(410);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(408);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new ExprListContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(302);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(303);
						match(COMMA);
						setState(305);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==CRLF || _la==SL_COMMENT) {
							{
							setState(304);
							crlfs();
							}
						}

						setState(307);
						expr(25);
						}
						break;
					case 2:
						{
						_localctx = new ExprDotRefContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(308);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(309);
						dot_ref();
						setState(311);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==CRLF || _la==SL_COMMENT) {
							{
							setState(310);
							crlfs();
							}
						}

						setState(313);
						expr(24);
						}
						break;
					case 3:
						{
						_localctx = new ExprBatchAssignContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(315);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(317);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(316);
							match(COMMA);
							}
						}

						setState(320);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==MUL) {
							{
							setState(319);
							match(MUL);
							}
						}

						setState(322);
						match(ASSIGN);
						setState(324);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==CRLF || _la==SL_COMMENT) {
							{
							setState(323);
							crlfs();
							}
						}

						setState(326);
						expr(18);
						}
						break;
					case 4:
						{
						_localctx = new ExprAssignContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(327);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(328);
						assignOperator();
						setState(330);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==CRLF || _la==SL_COMMENT) {
							{
							setState(329);
							crlfs();
							}
						}

						setState(332);
						expr(17);
						}
						break;
					case 5:
						{
						_localctx = new ExprPatternMatch1Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(334);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(335);
						((ExprPatternMatch1Context)_localctx).bop = match(PATTERN_MATCH);
						setState(336);
						expr(16);
						}
						break;
					case 6:
						{
						_localctx = new ExprPatternMatch2Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(337);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(338);
						((ExprPatternMatch2Context)_localctx).bop = match(BIT_NOT);
						setState(339);
						expr(15);
						}
						break;
					case 7:
						{
						_localctx = new ExprPatternMatch3Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(340);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(341);
						match(SIGH);
						setState(342);
						match(BIT_NOT);
						setState(343);
						expr(14);
						}
						break;
					case 8:
						{
						_localctx = new ExprCompareLogicalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(344);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						{
						setState(345);
						compareOperator();
						}
						setState(347);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==CRLF || _la==SL_COMMENT) {
							{
							setState(346);
							crlfs();
							}
						}

						setState(349);
						expr(12);
						}
						break;
					case 9:
						{
						_localctx = new ExprLogicalJoinContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(351);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						{
						setState(352);
						logicalOperator();
						}
						setState(354);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==CRLF || _la==SL_COMMENT) {
							{
							setState(353);
							crlfs();
							}
						}

						setState(356);
						expr(11);
						}
						break;
					case 10:
						{
						_localctx = new ExprEqualTestContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(358);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						{
						setState(359);
						equalsOperator();
						}
						setState(361);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==CRLF || _la==SL_COMMENT) {
							{
							setState(360);
							crlfs();
							}
						}

						setState(363);
						expr(10);
						}
						break;
					case 11:
						{
						_localctx = new ExprCalcuationContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(365);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(368);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case PLUS:
						case MINUS:
						case MOD:
						case EXP:
						case MUL:
						case DIV:
							{
							setState(366);
							mathOperator();
							}
							break;
						case BIT_AND:
						case BIT_OR:
						case BIT_SHR:
						case BIT_SHL:
						case BIT_XOR:
							{
							setState(367);
							bitOperator();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(371);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==CRLF || _la==SL_COMMENT) {
							{
							setState(370);
							crlfs();
							}
						}

						setState(373);
						expr(9);
						}
						break;
					case 12:
						{
						_localctx = new ExprConditionStatementContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(375);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(376);
						match(QUESTION);
						setState(377);
						expr(0);
						setState(378);
						match(COLON);
						setState(379);
						expr(8);
						}
						break;
					case 13:
						{
						_localctx = new ExprQuestionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(381);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(382);
						((ExprQuestionContext)_localctx).postfix = match(QUESTION);
						}
						break;
					case 14:
						{
						_localctx = new ExprArrayAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(383);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(384);
						match(LEFT_SBRACKET);
						setState(385);
						expr(0);
						setState(386);
						match(RIGHT_SBRACKET);
						}
						break;
					case 15:
						{
						_localctx = new ExprRangeContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(388);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(389);
						((ExprRangeContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DOT3 || _la==DOT2) ) {
							((ExprRangeContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(391);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
						case 1:
							{
							setState(390);
							expr(0);
							}
							break;
						}
						}
						break;
					case 16:
						{
						_localctx = new ExprBlockContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(393);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(394);
						block();
						}
						break;
					case 17:
						{
						_localctx = new ExprWitStatementSuffixContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(395);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(396);
						expr_statement_suffix();
						}
						break;
					case 18:
						{
						_localctx = new ExprDotClassContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(397);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(398);
						dot_ref();
						setState(399);
						match(CLASS);
						}
						break;
					case 19:
						{
						_localctx = new ExprFunctionCall2Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(401);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(402);
						dot_ref();
						setState(403);
						function_name();
						setState(404);
						func_call_parameters_no_bracket();
						setState(406);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
						case 1:
							{
							setState(405);
							expr_statement_suffix();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(412);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_statement_suffixContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(RubyParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CrlfsContext crlfs() {
			return getRuleContext(CrlfsContext.class,0);
		}
		public TerminalNode UNLESS() { return getToken(RubyParser.UNLESS, 0); }
		public TerminalNode WHILE() { return getToken(RubyParser.WHILE, 0); }
		public TerminalNode UNTIL() { return getToken(RubyParser.UNTIL, 0); }
		public TerminalNode RESCUE() { return getToken(RubyParser.RESCUE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode DO() { return getToken(RubyParser.DO, 0); }
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public Block_paramsContext block_params() {
			return getRuleContext(Block_paramsContext.class,0);
		}
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public Expr_statement_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_statement_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExpr_statement_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExpr_statement_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitExpr_statement_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_statement_suffixContext expr_statement_suffix() throws RecognitionException {
		Expr_statement_suffixContext _localctx = new Expr_statement_suffixContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr_statement_suffix);
		int _la;
		try {
			setState(446);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				match(IF);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(414);
					crlfs();
					}
				}

				setState(417);
				expr(0);
				}
				break;
			case UNLESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				match(UNLESS);
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(419);
					crlfs();
					}
				}

				setState(422);
				expr(0);
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(423);
				match(WHILE);
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(424);
					crlfs();
					}
				}

				setState(427);
				expr(0);
				}
				break;
			case UNTIL:
				enterOuterAlt(_localctx, 4);
				{
				setState(428);
				match(UNTIL);
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(429);
					crlfs();
					}
				}

				setState(432);
				expr(0);
				}
				break;
			case RESCUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(433);
				match(RESCUE);
				setState(434);
				statement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(435);
				match(DO);
				setState(437);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(436);
					block_params();
					}
					break;
				}
				setState(440);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(439);
					terms();
					}
					break;
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & -324259190354927648L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 57169503836331L) != 0) {
					{
					setState(442);
					statement_list_terms(0);
					}
				}

				setState(445);
				match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryVarPathContext extends PrimaryContext {
		public Variable_pathContext variable_path() {
			return getRuleContext(Variable_pathContext.class,0);
		}
		public PrimaryVarPathContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryVarPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryVarPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitPrimaryVarPath(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryStatementReturnContext extends PrimaryContext {
		public TerminalNode RETURN() { return getToken(RubyParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrimaryStatementReturnContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryStatementReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryStatementReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitPrimaryStatementReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryBlockModelDefContext extends PrimaryContext {
		public Module_definitionContext module_definition() {
			return getRuleContext(Module_definitionContext.class,0);
		}
		public PrimaryBlockModelDefContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryBlockModelDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryBlockModelDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitPrimaryBlockModelDef(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryFunctionCall0Context extends PrimaryContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Func_call_parametersContext func_call_parameters() {
			return getRuleContext(Func_call_parametersContext.class,0);
		}
		public PrimaryFunctionCall0Context(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryFunctionCall0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryFunctionCall0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitPrimaryFunctionCall0(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryListExprContext extends PrimaryContext {
		public TerminalNode LEFT_SBRACKET() { return getToken(RubyParser.LEFT_SBRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RIGHT_SBRACKET() { return getToken(RubyParser.RIGHT_SBRACKET, 0); }
		public List<CrlfsContext> crlfs() {
			return getRuleContexts(CrlfsContext.class);
		}
		public CrlfsContext crlfs(int i) {
			return getRuleContext(CrlfsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RubyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RubyParser.COMMA, i);
		}
		public PrimaryListExprContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryListExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryListExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitPrimaryListExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryBlockCase2Context extends PrimaryContext {
		public TerminalNode CASE() { return getToken(RubyParser.CASE, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public List<Case_bodyContext> case_body() {
			return getRuleContexts(Case_bodyContext.class);
		}
		public Case_bodyContext case_body(int i) {
			return getRuleContext(Case_bodyContext.class,i);
		}
		public PrimaryBlockCase2Context(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryBlockCase2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryBlockCase2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitPrimaryBlockCase2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryBlockCase1Context extends PrimaryContext {
		public TerminalNode CASE() { return getToken(RubyParser.CASE, 0); }
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public List<Case_bodyContext> case_body() {
			return getRuleContexts(Case_bodyContext.class);
		}
		public Case_bodyContext case_body(int i) {
			return getRuleContext(Case_bodyContext.class,i);
		}
		public PrimaryBlockCase1Context(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryBlockCase1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryBlockCase1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitPrimaryBlockCase1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryBlockIf2Context extends PrimaryContext {
		public TerminalNode IF() { return getToken(RubyParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Then_keywordContext> then_keyword() {
			return getRuleContexts(Then_keywordContext.class);
		}
		public Then_keywordContext then_keyword(int i) {
			return getRuleContext(Then_keywordContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public TerminalNode ELSIF() { return getToken(RubyParser.ELSIF, 0); }
		public TerminalNode ELSE() { return getToken(RubyParser.ELSE, 0); }
		public PrimaryBlockIf2Context(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryBlockIf2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryBlockIf2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitPrimaryBlockIf2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryBlockContext extends PrimaryContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public PrimaryBlockContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitPrimaryBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryBlockUntilContext extends PrimaryContext {
		public TerminalNode UNTIL() { return getToken(RubyParser.UNTIL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Do_keywordContext do_keyword() {
			return getRuleContext(Do_keywordContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public CrlfsContext crlfs() {
			return getRuleContext(CrlfsContext.class,0);
		}
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public PrimaryBlockUntilContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryBlockUntil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryBlockUntil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitPrimaryBlockUntil(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryBlockUnlessContext extends PrimaryContext {
		public TerminalNode UNLESS() { return getToken(RubyParser.UNLESS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Then_keywordContext then_keyword() {
			return getRuleContext(Then_keywordContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public CrlfsContext crlfs() {
			return getRuleContext(CrlfsContext.class,0);
		}
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public Else_tailContext else_tail() {
			return getRuleContext(Else_tailContext.class,0);
		}
		public PrimaryBlockUnlessContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryBlockUnless(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryBlockUnless(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitPrimaryBlockUnless(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryStatementBreakContext extends PrimaryContext {
		public TerminalNode BREAK() { return getToken(RubyParser.BREAK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrimaryStatementBreakContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryStatementBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryStatementBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitPrimaryStatementBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryBlockIfContext extends PrimaryContext {
		public TerminalNode IF() { return getToken(RubyParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Then_keywordContext then_keyword() {
			return getRuleContext(Then_keywordContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public CrlfsContext crlfs() {
			return getRuleContext(CrlfsContext.class,0);
		}
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public List<If_tailContext> if_tail() {
			return getRuleContexts(If_tailContext.class);
		}
		public If_tailContext if_tail(int i) {
			return getRuleContext(If_tailContext.class,i);
		}
		public PrimaryBlockIfContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryBlockIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryBlockIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitPrimaryBlockIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryBlockForContext extends PrimaryContext {
		public TerminalNode FOR() { return getToken(RubyParser.FOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IN() { return getToken(RubyParser.IN, 0); }
		public When_condContext when_cond() {
			return getRuleContext(When_condContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public CrlfsContext crlfs() {
			return getRuleContext(CrlfsContext.class,0);
		}
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public PrimaryBlockForContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryBlockFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryBlockFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitPrimaryBlockFor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryRangeContext extends PrimaryContext {
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyParser.LEFT_RBRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyParser.RIGHT_RBRACKET, 0); }
		public TerminalNode DOT2() { return getToken(RubyParser.DOT2, 0); }
		public TerminalNode DOT3() { return getToken(RubyParser.DOT3, 0); }
		public PrimaryRangeContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitPrimaryRange(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryStatementRaiseContext extends PrimaryContext {
		public TerminalNode RAISE() { return getToken(RubyParser.RAISE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrimaryStatementRaiseContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryStatementRaise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryStatementRaise(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitPrimaryStatementRaise(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryStatementRescueContext extends PrimaryContext {
		public TerminalNode RESCUE() { return getToken(RubyParser.RESCUE, 0); }
		public Rescure_paramContext rescure_param() {
			return getRuleContext(Rescure_paramContext.class,0);
		}
		public Else_tailContext else_tail() {
			return getRuleContext(Else_tailContext.class,0);
		}
		public PrimaryStatementRescueContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryStatementRescue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryStatementRescue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitPrimaryStatementRescue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryRegexContext extends PrimaryContext {
		public TerminalNode Regex() { return getToken(RubyParser.Regex, 0); }
		public PrimaryRegexContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryRegex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryRegex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitPrimaryRegex(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryStatementYieldContext extends PrimaryContext {
		public TerminalNode YIELD() { return getToken(RubyParser.YIELD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrimaryStatementYieldContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryStatementYield(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryStatementYield(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitPrimaryStatementYield(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryBlockFunctionDefContext extends PrimaryContext {
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public PrimaryBlockFunctionDefContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryBlockFunctionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryBlockFunctionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitPrimaryBlockFunctionDef(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryBracketContext extends PrimaryContext {
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyParser.LEFT_RBRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyParser.RIGHT_RBRACKET, 0); }
		public PrimaryBracketContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitPrimaryBracket(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryBlockClassDefContext extends PrimaryContext {
		public Class_definitionContext class_definition() {
			return getRuleContext(Class_definitionContext.class,0);
		}
		public PrimaryBlockClassDefContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryBlockClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryBlockClassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitPrimaryBlockClassDef(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryBeginBlockContext extends PrimaryContext {
		public TerminalNode BEGIN() { return getToken(RubyParser.BEGIN, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public PrimaryBeginBlockContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryBeginBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryBeginBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitPrimaryBeginBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryBlockWhenContext extends PrimaryContext {
		public TerminalNode WHEN() { return getToken(RubyParser.WHEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Then_keywordContext then_keyword() {
			return getRuleContext(Then_keywordContext.class,0);
		}
		public Statement_list_notermsContext statement_list_noterms() {
			return getRuleContext(Statement_list_notermsContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public PrimaryBlockWhenContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryBlockWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryBlockWhen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitPrimaryBlockWhen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryListHashContext extends PrimaryContext {
		public TerminalNode LEFT_PAREN() { return getToken(RubyParser.LEFT_PAREN, 0); }
		public List<Hash_assoContext> hash_asso() {
			return getRuleContexts(Hash_assoContext.class);
		}
		public Hash_assoContext hash_asso(int i) {
			return getRuleContext(Hash_assoContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(RubyParser.RIGHT_PAREN, 0); }
		public List<CrlfsContext> crlfs() {
			return getRuleContexts(CrlfsContext.class);
		}
		public CrlfsContext crlfs(int i) {
			return getRuleContext(CrlfsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RubyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RubyParser.COMMA, i);
		}
		public PrimaryListHashContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryListHash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryListHash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitPrimaryListHash(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryBlockWhileContext extends PrimaryContext {
		public TerminalNode WHILE() { return getToken(RubyParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Do_keywordContext do_keyword() {
			return getRuleContext(Do_keywordContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public CrlfsContext crlfs() {
			return getRuleContext(CrlfsContext.class,0);
		}
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public PrimaryBlockWhileContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryBlockWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryBlockWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitPrimaryBlockWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimarySymbolContext extends PrimaryContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public PrimarySymbolContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimarySymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimarySymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitPrimarySymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_primary);
		int _la;
		try {
			int _alt;
			setState(662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				_localctx = new PrimaryVarPathContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				variable_path(0);
				}
				break;
			case 2:
				_localctx = new PrimaryRegexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				match(Regex);
				}
				break;
			case 3:
				_localctx = new PrimarySymbolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(450);
				symbol();
				}
				break;
			case 4:
				_localctx = new PrimaryBracketContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(451);
				match(LEFT_RBRACKET);
				setState(452);
				expr(0);
				setState(453);
				match(RIGHT_RBRACKET);
				}
				break;
			case 5:
				_localctx = new PrimaryBlockContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(455);
				block();
				}
				break;
			case 6:
				_localctx = new PrimaryStatementBreakContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(456);
				match(BREAK);
				setState(458);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(457);
					expr(0);
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new PrimaryStatementReturnContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(460);
				match(RETURN);
				setState(462);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(461);
					expr(0);
					}
					break;
				}
				}
				break;
			case 8:
				_localctx = new PrimaryStatementRaiseContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(464);
				match(RAISE);
				setState(465);
				expr(0);
				}
				break;
			case 9:
				_localctx = new PrimaryStatementRescueContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(466);
				match(RESCUE);
				setState(468);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(467);
					rescure_param();
					}
					break;
				}
				setState(471);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(470);
					else_tail();
					}
					break;
				}
				}
				break;
			case 10:
				_localctx = new PrimaryStatementYieldContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(473);
				match(YIELD);
				setState(475);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(474);
					expr(0);
					}
					break;
				}
				}
				break;
			case 11:
				_localctx = new PrimaryBeginBlockContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(477);
				match(BEGIN);
				setState(478);
				terms();
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & -324259190354927648L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 57169503836331L) != 0) {
					{
					setState(479);
					statement_list_terms(0);
					}
				}

				setState(482);
				match(END);
				}
				break;
			case 12:
				_localctx = new PrimaryBlockIf2Context(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(484);
				match(IF);
				setState(485);
				expr(0);
				setState(486);
				then_keyword();
				setState(487);
				statement();
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSIF) {
					{
					setState(488);
					match(ELSIF);
					setState(489);
					expr(0);
					setState(490);
					then_keyword();
					setState(491);
					statement();
					}
				}

				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(495);
					match(ELSE);
					setState(496);
					expr(0);
					}
				}

				setState(499);
				match(END);
				}
				break;
			case 13:
				_localctx = new PrimaryBlockIfContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(501);
				match(IF);
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(502);
					crlfs();
					}
				}

				setState(505);
				expr(0);
				setState(506);
				then_keyword();
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & -324259190354927648L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 57169503836331L) != 0) {
					{
					setState(507);
					statement_list_terms(0);
					}
				}

				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSE || _la==ELSIF) {
					{
					{
					setState(510);
					if_tail();
					}
					}
					setState(515);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(516);
				match(END);
				}
				break;
			case 14:
				_localctx = new PrimaryBlockWhenContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(518);
				match(WHEN);
				setState(519);
				expr(0);
				setState(520);
				then_keyword();
				setState(521);
				statement_list_noterms();
				setState(522);
				match(END);
				}
				break;
			case 15:
				_localctx = new PrimaryBlockUnlessContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(524);
				match(UNLESS);
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(525);
					crlfs();
					}
				}

				setState(528);
				expr(0);
				setState(529);
				then_keyword();
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & -324259190354927648L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 57169503836331L) != 0) {
					{
					setState(530);
					statement_list_terms(0);
					}
				}

				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(533);
					else_tail();
					}
				}

				setState(536);
				match(END);
				}
				break;
			case 16:
				_localctx = new PrimaryBlockCase1Context(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(538);
				match(CASE);
				setState(540);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(539);
					statement_list_terms(0);
					}
					break;
				}
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSE || _la==WHEN) {
					{
					{
					setState(542);
					case_body();
					}
					}
					setState(547);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(548);
				match(END);
				}
				break;
			case 17:
				_localctx = new PrimaryBlockCase2Context(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(549);
				match(CASE);
				setState(550);
				terms();
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSE || _la==WHEN) {
					{
					{
					setState(551);
					case_body();
					}
					}
					setState(556);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(557);
				match(END);
				}
				break;
			case 18:
				_localctx = new PrimaryBlockWhileContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(559);
				match(WHILE);
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(560);
					crlfs();
					}
				}

				setState(563);
				expr(0);
				setState(564);
				do_keyword();
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & -324259190354927648L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 57169503836331L) != 0) {
					{
					setState(565);
					statement_list_terms(0);
					}
				}

				setState(568);
				match(END);
				}
				break;
			case 19:
				_localctx = new PrimaryBlockUntilContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(570);
				match(UNTIL);
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(571);
					crlfs();
					}
				}

				setState(574);
				expr(0);
				setState(575);
				do_keyword();
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & -324259190354927648L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 57169503836331L) != 0) {
					{
					setState(576);
					statement_list_terms(0);
					}
				}

				setState(579);
				match(END);
				}
				break;
			case 20:
				_localctx = new PrimaryBlockForContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(581);
				match(FOR);
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(582);
					crlfs();
					}
				}

				setState(585);
				expr(0);
				setState(586);
				match(IN);
				setState(587);
				when_cond();
				setState(589);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(588);
					terms();
					}
					break;
				}
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & -324259190354927648L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 57169503836331L) != 0) {
					{
					setState(591);
					statement_list_terms(0);
					}
				}

				setState(594);
				match(END);
				}
				break;
			case 21:
				_localctx = new PrimaryBlockClassDefContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(596);
				class_definition();
				}
				break;
			case 22:
				_localctx = new PrimaryBlockFunctionDefContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(597);
				function_definition();
				}
				break;
			case 23:
				_localctx = new PrimaryBlockModelDefContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(598);
				module_definition();
				}
				break;
			case 24:
				_localctx = new PrimaryFunctionCall0Context(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(599);
				function_name();
				setState(600);
				func_call_parameters();
				}
				break;
			case 25:
				_localctx = new PrimaryListHashContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(602);
				match(LEFT_PAREN);
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(603);
					crlfs();
					}
				}

				setState(606);
				hash_asso();
				setState(608);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(607);
					crlfs();
					}
					break;
				}
				setState(617);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(610);
						match(COMMA);
						setState(612);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==CRLF || _la==SL_COMMENT) {
							{
							setState(611);
							crlfs();
							}
						}

						setState(614);
						hash_asso();
						}
						} 
					}
					setState(619);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				}
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(620);
					match(COMMA);
					}
				}

				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(623);
					crlfs();
					}
				}

				setState(626);
				match(RIGHT_PAREN);
				}
				break;
			case 26:
				_localctx = new PrimaryListExprContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(628);
				match(LEFT_SBRACKET);
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(629);
					crlfs();
					}
				}

				setState(632);
				expr(0);
				setState(634);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(633);
					crlfs();
					}
					break;
				}
				setState(643);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(636);
						match(COMMA);
						setState(638);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==CRLF || _la==SL_COMMENT) {
							{
							setState(637);
							crlfs();
							}
						}

						setState(640);
						expr(0);
						}
						} 
					}
					setState(645);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				}
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(646);
					match(COMMA);
					}
				}

				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(649);
					crlfs();
					}
				}

				setState(652);
				match(RIGHT_SBRACKET);
				}
				break;
			case 27:
				_localctx = new PrimaryRangeContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(654);
				match(LEFT_RBRACKET);
				setState(655);
				expr(0);
				setState(656);
				_la = _input.LA(1);
				if ( !(_la==DOT3 || _la==DOT2) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & -324399996563087552L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 54970480318635L) != 0) {
					{
					setState(657);
					expr(0);
					}
				}

				setState(660);
				match(RIGHT_RBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Func_call_parametersContext extends ParserRuleContext {
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyParser.LEFT_RBRACKET, 0); }
		public List<Function_call_paramContext> function_call_param() {
			return getRuleContexts(Function_call_paramContext.class);
		}
		public Function_call_paramContext function_call_param(int i) {
			return getRuleContext(Function_call_paramContext.class,i);
		}
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyParser.RIGHT_RBRACKET, 0); }
		public List<CrlfsContext> crlfs() {
			return getRuleContexts(CrlfsContext.class);
		}
		public CrlfsContext crlfs(int i) {
			return getRuleContext(CrlfsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RubyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RubyParser.COMMA, i);
		}
		public Func_call_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterFunc_call_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitFunc_call_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitFunc_call_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_call_parametersContext func_call_parameters() throws RecognitionException {
		Func_call_parametersContext _localctx = new Func_call_parametersContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_func_call_parameters);
		int _la;
		try {
			setState(689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				match(LEFT_RBRACKET);
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(665);
					crlfs();
					}
				}

				setState(668);
				function_call_param();
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(669);
					match(COMMA);
					setState(671);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CRLF || _la==SL_COMMENT) {
						{
						setState(670);
						crlfs();
						}
					}

					setState(673);
					function_call_param();
					}
					}
					setState(678);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(679);
					crlfs();
					}
				}

				setState(682);
				match(RIGHT_RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
				match(LEFT_RBRACKET);
				setState(686);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(685);
					crlfs();
					}
				}

				setState(688);
				match(RIGHT_RBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Func_call_parameters_no_bracketContext extends ParserRuleContext {
		public List<Function_call_paramContext> function_call_param() {
			return getRuleContexts(Function_call_paramContext.class);
		}
		public Function_call_paramContext function_call_param(int i) {
			return getRuleContext(Function_call_paramContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RubyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RubyParser.COMMA, i);
		}
		public List<CrlfsContext> crlfs() {
			return getRuleContexts(CrlfsContext.class);
		}
		public CrlfsContext crlfs(int i) {
			return getRuleContext(CrlfsContext.class,i);
		}
		public Func_call_parameters_no_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call_parameters_no_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterFunc_call_parameters_no_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitFunc_call_parameters_no_bracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitFunc_call_parameters_no_bracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_call_parameters_no_bracketContext func_call_parameters_no_bracket() throws RecognitionException {
		Func_call_parameters_no_bracketContext _localctx = new Func_call_parameters_no_bracketContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_func_call_parameters_no_bracket);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			function_call_param();
			setState(699);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(692);
					match(COMMA);
					setState(694);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CRLF || _la==SL_COMMENT) {
						{
						setState(693);
						crlfs();
						}
					}

					setState(696);
					function_call_param();
					}
					} 
				}
				setState(701);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Rescure_paramContext extends ParserRuleContext {
		public Id_symbolContext id_symbol() {
			return getRuleContext(Id_symbolContext.class,0);
		}
		public Hash_assoContext hash_asso() {
			return getRuleContext(Hash_assoContext.class,0);
		}
		public TerminalNode ASSOC() { return getToken(RubyParser.ASSOC, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Rescure_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rescure_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterRescure_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitRescure_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitRescure_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rescure_paramContext rescure_param() throws RecognitionException {
		Rescure_paramContext _localctx = new Rescure_paramContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_rescure_param);
		try {
			setState(706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(702);
				id_symbol();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(703);
				hash_asso();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(704);
				match(ASSOC);
				setState(705);
				identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Case_bodyContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(RubyParser.WHEN, 0); }
		public List<When_condContext> when_cond() {
			return getRuleContexts(When_condContext.class);
		}
		public When_condContext when_cond(int i) {
			return getRuleContext(When_condContext.class,i);
		}
		public Then_keywordContext then_keyword() {
			return getRuleContext(Then_keywordContext.class,0);
		}
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(RubyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RubyParser.COMMA, i);
		}
		public Else_tailContext else_tail() {
			return getRuleContext(Else_tailContext.class,0);
		}
		public Case_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterCase_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitCase_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitCase_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_bodyContext case_body() throws RecognitionException {
		Case_bodyContext _localctx = new Case_bodyContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_case_body);
		int _la;
		try {
			setState(721);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(708);
				match(WHEN);
				setState(709);
				when_cond();
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(710);
					match(COMMA);
					setState(711);
					when_cond();
					}
					}
					setState(716);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(717);
				then_keyword();
				setState(718);
				statement_list_terms(0);
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(720);
				else_tail();
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

	@SuppressWarnings("CheckReturnValue")
	public static class When_condContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public When_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterWhen_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitWhen_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitWhen_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final When_condContext when_cond() throws RecognitionException {
		When_condContext _localctx = new When_condContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_when_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_tailContext extends ParserRuleContext {
		public TerminalNode ELSIF() { return getToken(RubyParser.ELSIF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Then_keywordContext then_keyword() {
			return getRuleContext(Then_keywordContext.class,0);
		}
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public CrlfsContext crlfs() {
			return getRuleContext(CrlfsContext.class,0);
		}
		public Else_tailContext else_tail() {
			return getRuleContext(Else_tailContext.class,0);
		}
		public If_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterIf_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitIf_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitIf_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_tailContext if_tail() throws RecognitionException {
		If_tailContext _localctx = new If_tailContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_if_tail);
		int _la;
		try {
			setState(734);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				match(ELSIF);
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(726);
					crlfs();
					}
				}

				setState(729);
				expr(0);
				setState(730);
				then_keyword();
				setState(731);
				statement_list_terms(0);
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(733);
				else_tail();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Else_tailContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(RubyParser.ELSE, 0); }
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public CrlfsContext crlfs() {
			return getRuleContext(CrlfsContext.class,0);
		}
		public Else_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterElse_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitElse_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitElse_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_tailContext else_tail() throws RecognitionException {
		Else_tailContext _localctx = new Else_tailContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_else_tail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			match(ELSE);
			setState(738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(737);
				crlfs();
				}
				break;
			}
			setState(740);
			statement_list_terms(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Dot_refContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(RubyParser.DOT, 0); }
		public TerminalNode ANDDOT() { return getToken(RubyParser.ANDDOT, 0); }
		public Dot_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterDot_ref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitDot_ref(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitDot_ref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dot_refContext dot_ref() throws RecognitionException {
		Dot_refContext _localctx = new Dot_refContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_dot_ref);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			_la = _input.LA(1);
			if ( !(_la==ANDDOT || _la==DOT) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(RubyParser.OR, 0); }
		public TerminalNode AND() { return getToken(RubyParser.AND, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitLogicalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class EqualsOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(RubyParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(RubyParser.NOT_EQUAL, 0); }
		public TerminalNode EQUAL3() { return getToken(RubyParser.EQUAL3, 0); }
		public EqualsOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalsOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterEqualsOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitEqualsOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitEqualsOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualsOperatorContext equalsOperator() throws RecognitionException {
		EqualsOperatorContext _localctx = new EqualsOperatorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_equalsOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			_la = _input.LA(1);
			if ( !((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 196609L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompareOperatorContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(RubyParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(RubyParser.GREATER, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(RubyParser.LESS_EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(RubyParser.GREATER_EQUAL, 0); }
		public CompareOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterCompareOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitCompareOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitCompareOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareOperatorContext compareOperator() throws RecognitionException {
		CompareOperatorContext _localctx = new CompareOperatorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_compareOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			_la = _input.LA(1);
			if ( !((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 773L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class BitOperatorContext extends ParserRuleContext {
		public TerminalNode BIT_SHL() { return getToken(RubyParser.BIT_SHL, 0); }
		public TerminalNode BIT_SHR() { return getToken(RubyParser.BIT_SHR, 0); }
		public TerminalNode BIT_AND() { return getToken(RubyParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(RubyParser.BIT_OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(RubyParser.BIT_XOR, 0); }
		public BitOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterBitOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitBitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitBitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitOperatorContext bitOperator() throws RecognitionException {
		BitOperatorContext _localctx = new BitOperatorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_bitOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			_la = _input.LA(1);
			if ( !((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 37385811263489L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class MathOperatorContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(RubyParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(RubyParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(RubyParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(RubyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RubyParser.MINUS, 0); }
		public TerminalNode EXP() { return getToken(RubyParser.EXP, 0); }
		public MathOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterMathOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitMathOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitMathOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathOperatorContext mathOperator() throws RecognitionException {
		MathOperatorContext _localctx = new MathOperatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_mathOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			_la = _input.LA(1);
			if ( !((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & 67115015L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS_ASSIGN() { return getToken(RubyParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(RubyParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(RubyParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(RubyParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(RubyParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(RubyParser.EXP_ASSIGN, 0); }
		public TerminalNode BIT_OR_ASSIGN() { return getToken(RubyParser.BIT_OR_ASSIGN, 0); }
		public TerminalNode BIT_AND_ASSIGN() { return getToken(RubyParser.BIT_AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(RubyParser.OR_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(RubyParser.AND_ASSIGN, 0); }
		public TerminalNode BIT_XOR_ASSIGN() { return getToken(RubyParser.BIT_XOR_ASSIGN, 0); }
		public TerminalNode BIT_NOT_ASSIGN() { return getToken(RubyParser.BIT_NOT_ASSIGN, 0); }
		public TerminalNode BIT_SHL_ASSIGN() { return getToken(RubyParser.BIT_SHL_ASSIGN, 0); }
		public TerminalNode BIT_SHR_ASSIGN() { return getToken(RubyParser.BIT_SHR_ASSIGN, 0); }
		public AssignOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterAssignOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitAssignOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitAssignOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignOperatorContext assignOperator() throws RecognitionException {
		AssignOperatorContext _localctx = new AssignOperatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_assignOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			_la = _input.LA(1);
			if ( !((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & 1477793024050331L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class NotContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(RubyParser.NOT, 0); }
		public TerminalNode SIGH() { return getToken(RubyParser.SIGH, 0); }
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_not);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			_la = _input.LA(1);
			if ( !(_la==NOT || _la==SIGH) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(RubyParser.LEFT_PAREN, 0); }
		public List<Statement_list_notermsContext> statement_list_noterms() {
			return getRuleContexts(Statement_list_notermsContext.class);
		}
		public Statement_list_notermsContext statement_list_noterms(int i) {
			return getRuleContext(Statement_list_notermsContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(RubyParser.RIGHT_PAREN, 0); }
		public List<CrlfsContext> crlfs() {
			return getRuleContexts(CrlfsContext.class);
		}
		public CrlfsContext crlfs(int i) {
			return getRuleContext(CrlfsContext.class,i);
		}
		public Block_paramsContext block_params() {
			return getRuleContext(Block_paramsContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(RubyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RubyParser.COMMA, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			match(LEFT_PAREN);
			setState(760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CRLF || _la==SL_COMMENT) {
				{
				setState(759);
				crlfs();
				}
			}

			setState(763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(762);
				block_params();
				}
				break;
			}
			setState(765);
			statement_list_noterms();
			setState(767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CRLF || _la==SL_COMMENT) {
				{
				setState(766);
				crlfs();
				}
			}

			setState(776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(769);
				match(COMMA);
				setState(770);
				statement_list_noterms();
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(771);
					crlfs();
					}
				}

				}
				}
				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(779);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Block_paramsContext extends ParserRuleContext {
		public List<TerminalNode> BIT_OR() { return getTokens(RubyParser.BIT_OR); }
		public TerminalNode BIT_OR(int i) {
			return getToken(RubyParser.BIT_OR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RubyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RubyParser.COMMA, i);
		}
		public Block_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterBlock_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitBlock_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitBlock_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_paramsContext block_params() throws RecognitionException {
		Block_paramsContext _localctx = new Block_paramsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_block_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			match(BIT_OR);
			setState(782);
			expr(0);
			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(783);
				match(COMMA);
				setState(784);
				expr(0);
				}
				}
				setState(789);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(790);
			match(BIT_OR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Id_symbolContext extends ParserRuleContext {
		public CpathContext cpath() {
			return getRuleContext(CpathContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RubyParser.COLON, 0); }
		public Id_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterId_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitId_symbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitId_symbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_symbolContext id_symbol() throws RecognitionException {
		Id_symbolContext _localctx = new Id_symbolContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_id_symbol);
		try {
			setState(795);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
			case NEXT:
			case NIL:
			case REDO:
			case RETRY:
			case SELF:
			case SUPER:
			case DollarSpecial:
			case DOLLAR:
			case AT:
			case LEFT_PAREN:
			case LEFT_SBRACKET:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(792);
				cpath();
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(793);
				match(COLON);
				setState(794);
				cpath();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SymbolContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(RubyParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(RubyParser.COLON, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_symbol);
		try {
			setState(804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(797);
				match(COLON);
				setState(798);
				identifier();
				setState(799);
				match(COLON);
				setState(800);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(802);
				match(COLON);
				setState(803);
				function_name();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Hash_assoContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASSOC() { return getToken(RubyParser.ASSOC, 0); }
		public TerminalNode COLON() { return getToken(RubyParser.COLON, 0); }
		public Hash_assoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hash_asso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterHash_asso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitHash_asso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitHash_asso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hash_assoContext hash_asso() throws RecognitionException {
		Hash_assoContext _localctx = new Hash_assoContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_hash_asso);
		try {
			setState(814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(806);
				expr(0);
				setState(807);
				match(ASSOC);
				setState(808);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(810);
				expr(0);
				setState(811);
				match(COLON);
				setState(812);
				expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_pathContext extends ParserRuleContext {
		public Variable_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_path; }
	 
		public Variable_pathContext() { }
		public void copyFrom(Variable_pathContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarPathLiteralContext extends Variable_pathContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public VarPathLiteralContext(Variable_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterVarPathLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitVarPathLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitVarPathLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarPathIdContext extends Variable_pathContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VarPathIdContext(Variable_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterVarPathId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitVarPathId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitVarPathId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarPathGlobalPrefixContext extends Variable_pathContext {
		public TerminalNode COLON2() { return getToken(RubyParser.COLON2, 0); }
		public Variable_pathContext variable_path() {
			return getRuleContext(Variable_pathContext.class,0);
		}
		public VarPathGlobalPrefixContext(Variable_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterVarPathGlobalPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitVarPathGlobalPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitVarPathGlobalPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarPathJoinContext extends Variable_pathContext {
		public Variable_pathContext variable_path() {
			return getRuleContext(Variable_pathContext.class,0);
		}
		public TerminalNode COLON2() { return getToken(RubyParser.COLON2, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public VarPathJoinContext(Variable_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterVarPathJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitVarPathJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitVarPathJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_pathContext variable_path() throws RecognitionException {
		return variable_path(0);
	}

	private Variable_pathContext variable_path(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Variable_pathContext _localctx = new Variable_pathContext(_ctx, _parentState);
		Variable_pathContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_variable_path, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				_localctx = new VarPathIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(817);
				identifier();
				}
				break;
			case 2:
				{
				_localctx = new VarPathLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(818);
				literal();
				}
				break;
			case 3:
				{
				_localctx = new VarPathGlobalPrefixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(819);
				match(COLON2);
				setState(820);
				variable_path(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(831);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VarPathJoinContext(new Variable_pathContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_variable_path);
					setState(823);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(824);
					match(COLON2);
					setState(827);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
					case 1:
						{
						setState(825);
						identifier();
						}
						break;
					case 2:
						{
						setState(826);
						literal();
						}
						break;
					}
					}
					} 
				}
				setState(833);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CpathContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COLON2() { return getTokens(RubyParser.COLON2); }
		public TerminalNode COLON2(int i) {
			return getToken(RubyParser.COLON2, i);
		}
		public List<TerminalNode> DOT() { return getTokens(RubyParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(RubyParser.DOT, i);
		}
		public CpathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterCpath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitCpath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitCpath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CpathContext cpath() throws RecognitionException {
		CpathContext _localctx = new CpathContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_cpath);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			identifier();
			setState(839);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(835);
					_la = _input.LA(1);
					if ( !(_la==DOT || _la==COLON2) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(836);
					identifier();
					}
					} 
				}
				setState(841);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode Float() { return getToken(RubyParser.Float, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode Integer() { return getToken(RubyParser.Integer, 0); }
		public TerminalNode TRUE() { return getToken(RubyParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(RubyParser.FALSE, 0); }
		public TerminalNode NIL() { return getToken(RubyParser.NIL, 0); }
		public TerminalNode DOT() { return getToken(RubyParser.DOT, 0); }
		public TerminalNode ShellCommand() { return getToken(RubyParser.ShellCommand, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_literal);
		int _la;
		try {
			setState(850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(842);
				match(Float);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(843);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(844);
				match(Integer);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(845);
				_la = _input.LA(1);
				if ( !(_la==FALSE || _la==TRUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(846);
				match(NIL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(847);
				match(Float);
				setState(848);
				match(DOT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(849);
				match(ShellCommand);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(RubyParser.Identifier, 0); }
		public GlobalVarContext globalVar() {
			return getRuleContext(GlobalVarContext.class,0);
		}
		public ClassVarContext classVar() {
			return getRuleContext(ClassVarContext.class,0);
		}
		public InstanceVarContext instanceVar() {
			return getRuleContext(InstanceVarContext.class,0);
		}
		public IdArgContext idArg() {
			return getRuleContext(IdArgContext.class,0);
		}
		public TerminalNode NEXT() { return getToken(RubyParser.NEXT, 0); }
		public TerminalNode REDO() { return getToken(RubyParser.REDO, 0); }
		public TerminalNode RETRY() { return getToken(RubyParser.RETRY, 0); }
		public TerminalNode BREAK() { return getToken(RubyParser.BREAK, 0); }
		public TerminalNode SELF() { return getToken(RubyParser.SELF, 0); }
		public TerminalNode SUPER() { return getToken(RubyParser.SUPER, 0); }
		public TerminalNode NIL() { return getToken(RubyParser.NIL, 0); }
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_identifier);
		try {
			setState(865);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(852);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(853);
				globalVar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(854);
				classVar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(855);
				instanceVar();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(856);
				idArg();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(857);
				match(NEXT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(858);
				match(REDO);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(859);
				match(RETRY);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(860);
				match(BREAK);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(861);
				match(SELF);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(862);
				match(SUPER);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(863);
				match(NIL);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(864);
				empty();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EmptyContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(RubyParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(RubyParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_SBRACKET() { return getToken(RubyParser.LEFT_SBRACKET, 0); }
		public TerminalNode RIGHT_SBRACKET() { return getToken(RubyParser.RIGHT_SBRACKET, 0); }
		public EmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyContext empty() throws RecognitionException {
		EmptyContext _localctx = new EmptyContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_empty);
		try {
			setState(871);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(867);
				match(LEFT_PAREN);
				setState(868);
				match(RIGHT_PAREN);
				}
				break;
			case LEFT_SBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(869);
				match(LEFT_SBRACKET);
				setState(870);
				match(RIGHT_SBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GlobalVarContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(RubyParser.DOLLAR, 0); }
		public TerminalNode Identifier() { return getToken(RubyParser.Identifier, 0); }
		public GlobalVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterGlobalVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitGlobalVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitGlobalVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalVarContext globalVar() throws RecognitionException {
		GlobalVarContext _localctx = new GlobalVarContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_globalVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
			match(DOLLAR);
			setState(874);
			match(Identifier);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassVarContext extends ParserRuleContext {
		public List<TerminalNode> AT() { return getTokens(RubyParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(RubyParser.AT, i);
		}
		public TerminalNode Identifier() { return getToken(RubyParser.Identifier, 0); }
		public ClassVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterClassVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitClassVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitClassVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassVarContext classVar() throws RecognitionException {
		ClassVarContext _localctx = new ClassVarContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_classVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			match(AT);
			setState(877);
			match(AT);
			setState(878);
			match(Identifier);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstanceVarContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(RubyParser.AT, 0); }
		public TerminalNode Identifier() { return getToken(RubyParser.Identifier, 0); }
		public InstanceVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterInstanceVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitInstanceVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitInstanceVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceVarContext instanceVar() throws RecognitionException {
		InstanceVarContext _localctx = new InstanceVarContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_instanceVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			match(AT);
			setState(881);
			match(Identifier);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdArgContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(RubyParser.DOLLAR, 0); }
		public TerminalNode Integer() { return getToken(RubyParser.Integer, 0); }
		public TerminalNode DollarSpecial() { return getToken(RubyParser.DollarSpecial, 0); }
		public IdArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterIdArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitIdArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitIdArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdArgContext idArg() throws RecognitionException {
		IdArgContext _localctx = new IdArgContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_idArg);
		try {
			setState(886);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(883);
				match(DOLLAR);
				setState(884);
				match(Integer);
				}
				break;
			case DollarSpecial:
				enterOuterAlt(_localctx, 2);
				{
				setState(885);
				match(DollarSpecial);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Do_keywordContext extends ParserRuleContext {
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public TerminalNode DO() { return getToken(RubyParser.DO, 0); }
		public TerminalNode COLON() { return getToken(RubyParser.COLON, 0); }
		public Do_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterDo_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitDo_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitDo_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_keywordContext do_keyword() throws RecognitionException {
		Do_keywordContext _localctx = new Do_keywordContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_do_keyword);
		int _la;
		try {
			setState(891);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DO:
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(888);
				_la = _input.LA(1);
				if ( !(_la==DO || _la==COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(889);
				terms();
				}
				break;
			case CRLF:
			case SEMICOLON:
			case SL_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(890);
				terms();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Then_keywordContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(RubyParser.THEN, 0); }
		public TerminalNode COLON() { return getToken(RubyParser.COLON, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public Then_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_then_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterThen_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitThen_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitThen_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Then_keywordContext then_keyword() throws RecognitionException {
		Then_keywordContext _localctx = new Then_keywordContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_then_keyword);
		int _la;
		try {
			setState(898);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THEN:
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(893);
				_la = _input.LA(1);
				if ( !(_la==THEN || _la==COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(895);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(894);
					terms();
					}
					break;
				}
				}
				break;
			case CRLF:
			case SEMICOLON:
			case SL_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(897);
				terms();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> String() { return getTokens(RubyParser.String); }
		public TerminalNode String(int i) {
			return getToken(RubyParser.String, i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_string);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(901); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(900);
					match(String);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(903); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class CrlfsContext extends ParserRuleContext {
		public List<TerminalNode> SL_COMMENT() { return getTokens(RubyParser.SL_COMMENT); }
		public TerminalNode SL_COMMENT(int i) {
			return getToken(RubyParser.SL_COMMENT, i);
		}
		public List<TerminalNode> CRLF() { return getTokens(RubyParser.CRLF); }
		public TerminalNode CRLF(int i) {
			return getToken(RubyParser.CRLF, i);
		}
		public CrlfsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crlfs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterCrlfs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitCrlfs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitCrlfs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrlfsContext crlfs() throws RecognitionException {
		CrlfsContext _localctx = new CrlfsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_crlfs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(906); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(905);
					_la = _input.LA(1);
					if ( !(_la==CRLF || _la==SL_COMMENT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(908); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermsContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitTerms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitTerms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermsContext terms() throws RecognitionException {
		TermsContext _localctx = new TermsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_terms);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(911); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(910);
					term();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(913); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(RubyParser.SEMICOLON, 0); }
		public TerminalNode CRLF() { return getToken(RubyParser.CRLF, 0); }
		public TerminalNode SL_COMMENT() { return getToken(RubyParser.SL_COMMENT, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyParserVisitor ) return ((RubyParserVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			_la = _input.LA(1);
			if ( !((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 288230410511450113L) != 0) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return statement_list_terms_sempred((Statement_list_termsContext)_localctx, predIndex);
		case 19:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 42:
			return variable_path_sempred((Variable_pathContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statement_list_terms_sempred(Statement_list_termsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 24);
		case 2:
			return precpred(_ctx, 23);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 10);
		case 10:
			return precpred(_ctx, 9);
		case 11:
			return precpred(_ctx, 8);
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 22);
		case 14:
			return precpred(_ctx, 20);
		case 15:
			return precpred(_ctx, 18);
		case 16:
			return precpred(_ctx, 6);
		case 17:
			return precpred(_ctx, 5);
		case 18:
			return precpred(_ctx, 4);
		case 19:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean variable_path_sempred(Variable_pathContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001u\u0396\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001z\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0080\b\u0001\n\u0001"+
		"\f\u0001\u0083\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"\u0088\b\u0002\n\u0002\f\u0002\u008b\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u0095\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004\u009b\b\u0004\n\u0004\f\u0004\u009e\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u00a6\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t\u00b5\b\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0003\n\u00bb\b\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u00c6"+
		"\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u00cb\b\f\u0001\r\u0001\r\u0003\r"+
		"\u00cf\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00d6\b\u000e\u0001\u000e\u0003\u000e\u00d9\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u00df\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00ea\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00f0\b\u0010\u0001\u0010\u0005\u0010\u00f3"+
		"\b\u0010\n\u0010\f\u0010\u00f6\t\u0010\u0003\u0010\u00f8\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00fe\b\u0010\u0001"+
		"\u0010\u0005\u0010\u0101\b\u0010\n\u0010\f\u0010\u0104\t\u0010\u0003\u0010"+
		"\u0106\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0114\b\u0011\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0118\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0122\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0128\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u012d\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u0132\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u0138\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u013e\b\u0013\u0001\u0013\u0003\u0013\u0141\b"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0145\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u014b\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u015c\b\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0163\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u016a\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0171"+
		"\b\u0013\u0001\u0013\u0003\u0013\u0174\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0188\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u0197\b\u0013\u0005\u0013\u0199\b\u0013\n\u0013"+
		"\f\u0013\u019c\t\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u01a0\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01a5\b\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u01aa\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u01af\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u01b6\b\u0014\u0001\u0014\u0003\u0014"+
		"\u01b9\b\u0014\u0001\u0014\u0003\u0014\u01bc\b\u0014\u0001\u0014\u0003"+
		"\u0014\u01bf\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u01cb\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01cf\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01d5\b\u0015"+
		"\u0001\u0015\u0003\u0015\u01d8\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u01dc\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01e1\b"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u01ee\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01f2\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01f8\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01fd\b\u0015\u0001\u0015"+
		"\u0005\u0015\u0200\b\u0015\n\u0015\f\u0015\u0203\t\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u020f\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u0214\b\u0015\u0001\u0015\u0003\u0015\u0217"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u021d"+
		"\b\u0015\u0001\u0015\u0005\u0015\u0220\b\u0015\n\u0015\f\u0015\u0223\t"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0229"+
		"\b\u0015\n\u0015\f\u0015\u022c\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u0232\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u0237\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u023d\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u0242\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u0248\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u024e\b\u0015\u0001\u0015\u0003\u0015\u0251\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u025d\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0261\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0265"+
		"\b\u0015\u0001\u0015\u0005\u0015\u0268\b\u0015\n\u0015\f\u0015\u026b\t"+
		"\u0015\u0001\u0015\u0003\u0015\u026e\b\u0015\u0001\u0015\u0003\u0015\u0271"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0277"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u027b\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u027f\b\u0015\u0001\u0015\u0005\u0015\u0282\b"+
		"\u0015\n\u0015\f\u0015\u0285\t\u0015\u0001\u0015\u0003\u0015\u0288\b\u0015"+
		"\u0001\u0015\u0003\u0015\u028b\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0293\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u0297\b\u0015\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u029b\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u02a0\b"+
		"\u0016\u0001\u0016\u0005\u0016\u02a3\b\u0016\n\u0016\f\u0016\u02a6\t\u0016"+
		"\u0001\u0016\u0003\u0016\u02a9\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u02af\b\u0016\u0001\u0016\u0003\u0016\u02b2\b"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u02b7\b\u0017\u0001"+
		"\u0017\u0005\u0017\u02ba\b\u0017\n\u0017\f\u0017\u02bd\t\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u02c3\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u02c9\b\u0019\n\u0019"+
		"\f\u0019\u02cc\t\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u02d2\b\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u02d8\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u02df\b\u001b\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u02e3\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0003%\u02f9\b%\u0001"+
		"%\u0003%\u02fc\b%\u0001%\u0001%\u0003%\u0300\b%\u0001%\u0001%\u0001%\u0003"+
		"%\u0305\b%\u0005%\u0307\b%\n%\f%\u030a\t%\u0001%\u0001%\u0001&\u0001&"+
		"\u0001&\u0001&\u0005&\u0312\b&\n&\f&\u0315\t&\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001\'\u0003\'\u031c\b\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0003(\u0325\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u032f\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u0336"+
		"\b*\u0001*\u0001*\u0001*\u0001*\u0003*\u033c\b*\u0005*\u033e\b*\n*\f*"+
		"\u0341\t*\u0001+\u0001+\u0001+\u0005+\u0346\b+\n+\f+\u0349\t+\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u0353\b,\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0003-\u0362\b-\u0001.\u0001.\u0001.\u0001.\u0003.\u0368\b.\u0001"+
		"/\u0001/\u0001/\u00010\u00010\u00010\u00010\u00011\u00011\u00011\u0001"+
		"2\u00012\u00012\u00032\u0377\b2\u00013\u00013\u00013\u00033\u037c\b3\u0001"+
		"4\u00014\u00034\u0380\b4\u00014\u00034\u0383\b4\u00015\u00045\u0386\b"+
		"5\u000b5\f5\u0387\u00016\u00046\u038b\b6\u000b6\f6\u038c\u00017\u0004"+
		"7\u0390\b7\u000b7\f7\u0391\u00018\u00018\u00018\u0000\u0003\u0002&T9\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp\u0000\u0012\u0003\u0000"+
		"MMOO\\\\\u0003\u000024;;>>\u0002\u0000MMOO\u0001\u0000HI\u0002\u0000:"+
		":JJ\u0001\u000001\u0002\u0000NN^_\u0003\u0000YY[[ab\u0005\u0000;;WWZZ"+
		"ddhh\u0003\u000024=>LL\n\u00005689<<??KKTVXXcceegg\u0002\u0000\u001a\u001a"+
		"OO\u0002\u0000JJQQ\u0002\u0000\u0013\u0013##\u0002\u0000\r\rPP\u0002\u0000"+
		"\"\"PP\u0002\u0000//ii\u0003\u0000//RRii\u042a\u0000r\u0001\u0000\u0000"+
		"\u0000\u0002y\u0001\u0000\u0000\u0000\u0004\u0089\u0001\u0000\u0000\u0000"+
		"\u0006\u0094\u0001\u0000\u0000\u0000\b\u0096\u0001\u0000\u0000\u0000\n"+
		"\u009f\u0001\u0000\u0000\u0000\f\u00a5\u0001\u0000\u0000\u0000\u000e\u00a7"+
		"\u0001\u0000\u0000\u0000\u0010\u00ac\u0001\u0000\u0000\u0000\u0012\u00b1"+
		"\u0001\u0000\u0000\u0000\u0014\u00b8\u0001\u0000\u0000\u0000\u0016\u00be"+
		"\u0001\u0000\u0000\u0000\u0018\u00ca\u0001\u0000\u0000\u0000\u001a\u00cc"+
		"\u0001\u0000\u0000\u0000\u001c\u00d2\u0001\u0000\u0000\u0000\u001e\u00e9"+
		"\u0001\u0000\u0000\u0000 \u0105\u0001\u0000\u0000\u0000\"\u0113\u0001"+
		"\u0000\u0000\u0000$\u0117\u0001\u0000\u0000\u0000&\u012c\u0001\u0000\u0000"+
		"\u0000(\u01be\u0001\u0000\u0000\u0000*\u0296\u0001\u0000\u0000\u0000,"+
		"\u02b1\u0001\u0000\u0000\u0000.\u02b3\u0001\u0000\u0000\u00000\u02c2\u0001"+
		"\u0000\u0000\u00002\u02d1\u0001\u0000\u0000\u00004\u02d3\u0001\u0000\u0000"+
		"\u00006\u02de\u0001\u0000\u0000\u00008\u02e0\u0001\u0000\u0000\u0000:"+
		"\u02e6\u0001\u0000\u0000\u0000<\u02e8\u0001\u0000\u0000\u0000>\u02ea\u0001"+
		"\u0000\u0000\u0000@\u02ec\u0001\u0000\u0000\u0000B\u02ee\u0001\u0000\u0000"+
		"\u0000D\u02f0\u0001\u0000\u0000\u0000F\u02f2\u0001\u0000\u0000\u0000H"+
		"\u02f4\u0001\u0000\u0000\u0000J\u02f6\u0001\u0000\u0000\u0000L\u030d\u0001"+
		"\u0000\u0000\u0000N\u031b\u0001\u0000\u0000\u0000P\u0324\u0001\u0000\u0000"+
		"\u0000R\u032e\u0001\u0000\u0000\u0000T\u0335\u0001\u0000\u0000\u0000V"+
		"\u0342\u0001\u0000\u0000\u0000X\u0352\u0001\u0000\u0000\u0000Z\u0361\u0001"+
		"\u0000\u0000\u0000\\\u0367\u0001\u0000\u0000\u0000^\u0369\u0001\u0000"+
		"\u0000\u0000`\u036c\u0001\u0000\u0000\u0000b\u0370\u0001\u0000\u0000\u0000"+
		"d\u0376\u0001\u0000\u0000\u0000f\u037b\u0001\u0000\u0000\u0000h\u0382"+
		"\u0001\u0000\u0000\u0000j\u0385\u0001\u0000\u0000\u0000l\u038a\u0001\u0000"+
		"\u0000\u0000n\u038f\u0001\u0000\u0000\u0000p\u0393\u0001\u0000\u0000\u0000"+
		"rs\u0003\u0002\u0001\u0000s\u0001\u0001\u0000\u0000\u0000tu\u0006\u0001"+
		"\uffff\uffff\u0000uv\u0003\u0006\u0003\u0000vw\u0003n7\u0000wz\u0001\u0000"+
		"\u0000\u0000xz\u0003n7\u0000yt\u0001\u0000\u0000\u0000yx\u0001\u0000\u0000"+
		"\u0000z\u0081\u0001\u0000\u0000\u0000{|\n\u0002\u0000\u0000|}\u0003\u0006"+
		"\u0003\u0000}~\u0003n7\u0000~\u0080\u0001\u0000\u0000\u0000\u007f{\u0001"+
		"\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0003\u0001"+
		"\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0085\u0003"+
		"\u0006\u0003\u0000\u0085\u0086\u0003n7\u0000\u0086\u0088\u0001\u0000\u0000"+
		"\u0000\u0087\u0084\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000"+
		"\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000"+
		"\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0003\u0006\u0003\u0000\u008d\u0005\u0001\u0000\u0000"+
		"\u0000\u008e\u0095\u0003\u000e\u0007\u0000\u008f\u0095\u0003\u0010\b\u0000"+
		"\u0090\u0095\u0003\n\u0005\u0000\u0091\u0095\u0003\b\u0004\u0000\u0092"+
		"\u0095\u0005\u0012\u0000\u0000\u0093\u0095\u0003&\u0013\u0000\u0094\u008e"+
		"\u0001\u0000\u0000\u0000\u0094\u008f\u0001\u0000\u0000\u0000\u0094\u0090"+
		"\u0001\u0000\u0000\u0000\u0094\u0091\u0001\u0000\u0000\u0000\u0094\u0092"+
		"\u0001\u0000\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0007"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0005$\u0000\u0000\u0097\u009c\u0003"+
		"\f\u0006\u0000\u0098\u0099\u0005S\u0000\u0000\u0099\u009b\u0003\f\u0006"+
		"\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000"+
		"\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\t\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0005\u0005\u0000\u0000\u00a0\u00a1\u0003\f\u0006\u0000\u00a1"+
		"\u00a2\u0003\f\u0006\u0000\u00a2\u000b\u0001\u0000\u0000\u0000\u00a3\u00a6"+
		"\u0003\u001e\u000f\u0000\u00a4\u00a6\u0003P(\u0000\u00a5\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\r\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0005\u0007\u0000\u0000\u00a8\u00a9\u0005C\u0000\u0000"+
		"\u00a9\u00aa\u0003\u0002\u0001\u0000\u00aa\u00ab\u0005B\u0000\u0000\u00ab"+
		"\u000f\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0010\u0000\u0000\u00ad"+
		"\u00ae\u0005C\u0000\u0000\u00ae\u00af\u0003\u0002\u0001\u0000\u00af\u00b0"+
		"\u0005B\u0000\u0000\u00b0\u0011\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005"+
		"\u0017\u0000\u0000\u00b2\u00b4\u0003V+\u0000\u00b3\u00b5\u0003\u0002\u0001"+
		"\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u0011\u0000"+
		"\u0000\u00b7\u0013\u0001\u0000\u0000\u0000\u00b8\u00ba\u0003\u0018\f\u0000"+
		"\u00b9\u00bb\u0003\u0002\u0001\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bd\u0005\u0011\u0000\u0000\u00bd\u0015\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0005b\u0000\u0000\u00bf\u00c0\u0003N\'\u0000\u00c0\u00c1"+
		"\u0003n7\u0000\u00c1\u0017\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\n"+
		"\u0000\u0000\u00c3\u00c5\u0003V+\u0000\u00c4\u00c6\u0003\u0016\u000b\u0000"+
		"\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c6\u00cb\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\n\u0000\u0000\u00c8"+
		"\u00c9\u0005d\u0000\u0000\u00c9\u00cb\u0003Z-\u0000\u00ca\u00c2\u0001"+
		"\u0000\u0000\u0000\u00ca\u00c7\u0001\u0000\u0000\u0000\u00cb\u0019\u0001"+
		"\u0000\u0000\u0000\u00cc\u00ce\u0003\u001c\u000e\u0000\u00cd\u00cf\u0003"+
		"\u0002\u0001\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005"+
		"\u0011\u0000\u0000\u00d1\u001b\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005"+
		"\u000b\u0000\u0000\u00d3\u00d5\u0003\u001e\u000f\u0000\u00d4\u00d6\u0003"+
		" \u0010\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7\u00d9\u0003&\u0013"+
		"\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00db\u0003n7\u0000\u00db"+
		"\u001d\u0001\u0000\u0000\u0000\u00dc\u00de\u0003V+\u0000\u00dd\u00df\u0007"+
		"\u0000\u0000\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00de\u00df\u0001"+
		"\u0000\u0000\u0000\u00df\u00ea\u0001\u0000\u0000\u0000\u00e0\u00ea\u0003"+
		"X,\u0000\u00e1\u00ea\u0003F#\u0000\u00e2\u00e3\u0003D\"\u0000\u00e3\u00e4"+
		"\u0005A\u0000\u0000\u00e4\u00ea\u0001\u0000\u0000\u0000\u00e5\u00ea\u0003"+
		"B!\u0000\u00e6\u00ea\u0003@ \u0000\u00e7\u00ea\u0003>\u001f\u0000\u00e8"+
		"\u00ea\u0003<\u001e\u0000\u00e9\u00dc\u0001\u0000\u0000\u0000\u00e9\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e9\u00e1\u0001\u0000\u0000\u0000\u00e9\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e9\u00e5\u0001\u0000\u0000\u0000\u00e9\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00e8"+
		"\u0001\u0000\u0000\u0000\u00ea\u001f\u0001\u0000\u0000\u0000\u00eb\u00f7"+
		"\u0005G\u0000\u0000\u00ec\u00f4\u0003\"\u0011\u0000\u00ed\u00ef\u0005"+
		"S\u0000\u0000\u00ee\u00f0\u0003l6\u0000\u00ef\u00ee\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f3\u0003\"\u0011\u0000\u00f2\u00ed\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f6\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7\u00ec\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000"+
		"\u00f9\u0106\u0005F\u0000\u0000\u00fa\u0102\u0003\"\u0011\u0000\u00fb"+
		"\u00fd\u0005S\u0000\u0000\u00fc\u00fe\u0003l6\u0000\u00fd\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001"+
		"\u0000\u0000\u0000\u00ff\u0101\u0003\"\u0011\u0000\u0100\u00fb\u0001\u0000"+
		"\u0000\u0000\u0101\u0104\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000"+
		"\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0106\u0001\u0000"+
		"\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0105\u00eb\u0001\u0000"+
		"\u0000\u0000\u0105\u00fa\u0001\u0000\u0000\u0000\u0106!\u0001\u0000\u0000"+
		"\u0000\u0107\u0114\u0003Z-\u0000\u0108\u0109\u0005>\u0000\u0000\u0109"+
		"\u0114\u0003Z-\u0000\u010a\u010b\u0005=\u0000\u0000\u010b\u0114\u0003"+
		"Z-\u0000\u010c\u010d\u0005;\u0000\u0000\u010d\u0114\u0003Z-\u0000\u010e"+
		"\u0114\u0003R)\u0000\u010f\u0110\u0003Z-\u0000\u0110\u0111\u0005\\\u0000"+
		"\u0000\u0111\u0112\u0003&\u0013\u0000\u0112\u0114\u0001\u0000\u0000\u0000"+
		"\u0113\u0107\u0001\u0000\u0000\u0000\u0113\u0108\u0001\u0000\u0000\u0000"+
		"\u0113\u010a\u0001\u0000\u0000\u0000\u0113\u010c\u0001\u0000\u0000\u0000"+
		"\u0113\u010e\u0001\u0000\u0000\u0000\u0113\u010f\u0001\u0000\u0000\u0000"+
		"\u0114#\u0001\u0000\u0000\u0000\u0115\u0118\u0003&\u0013\u0000\u0116\u0118"+
		"\u0003R)\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0116\u0001\u0000"+
		"\u0000\u0000\u0118%\u0001\u0000\u0000\u0000\u0119\u011a\u0006\u0013\uffff"+
		"\uffff\u0000\u011a\u012d\u0003*\u0015\u0000\u011b\u011c\u0007\u0001\u0000"+
		"\u0000\u011c\u012d\u0003&\u0013\u0015\u011d\u011e\u0005\f\u0000\u0000"+
		"\u011e\u012d\u0003&\u0013\u0013\u011f\u0122\u0003H$\u0000\u0120\u0122"+
		"\u0005f\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0120\u0001"+
		"\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u012d\u0003"+
		"&\u0013\f\u0124\u0125\u0003\u001e\u000f\u0000\u0125\u0127\u0003.\u0017"+
		"\u0000\u0126\u0128\u0003(\u0014\u0000\u0127\u0126\u0001\u0000\u0000\u0000"+
		"\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012d\u0001\u0000\u0000\u0000"+
		"\u0129\u012a\u0003V+\u0000\u012a\u012b\u0007\u0002\u0000\u0000\u012b\u012d"+
		"\u0001\u0000\u0000\u0000\u012c\u0119\u0001\u0000\u0000\u0000\u012c\u011b"+
		"\u0001\u0000\u0000\u0000\u012c\u011d\u0001\u0000\u0000\u0000\u012c\u0121"+
		"\u0001\u0000\u0000\u0000\u012c\u0124\u0001\u0000\u0000\u0000\u012c\u0129"+
		"\u0001\u0000\u0000\u0000\u012d\u019a\u0001\u0000\u0000\u0000\u012e\u012f"+
		"\n\u0018\u0000\u0000\u012f\u0131\u0005S\u0000\u0000\u0130\u0132\u0003"+
		"l6\u0000\u0131\u0130\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000"+
		"\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0199\u0003&\u0013\u0019"+
		"\u0134\u0135\n\u0017\u0000\u0000\u0135\u0137\u0003:\u001d\u0000\u0136"+
		"\u0138\u0003l6\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0137\u0138\u0001"+
		"\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013a\u0003"+
		"&\u0013\u0018\u013a\u0199\u0001\u0000\u0000\u0000\u013b\u013d\n\u0011"+
		"\u0000\u0000\u013c\u013e\u0005S\u0000\u0000\u013d\u013c\u0001\u0000\u0000"+
		"\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u0140\u0001\u0000\u0000"+
		"\u0000\u013f\u0141\u0005>\u0000\u0000\u0140\u013f\u0001\u0000\u0000\u0000"+
		"\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000"+
		"\u0142\u0144\u0005\\\u0000\u0000\u0143\u0145\u0003l6\u0000\u0144\u0143"+
		"\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0146"+
		"\u0001\u0000\u0000\u0000\u0146\u0199\u0003&\u0013\u0012\u0147\u0148\n"+
		"\u0010\u0000\u0000\u0148\u014a\u0003F#\u0000\u0149\u014b\u0003l6\u0000"+
		"\u014a\u0149\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000"+
		"\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014d\u0003&\u0013\u0011\u014d"+
		"\u0199\u0001\u0000\u0000\u0000\u014e\u014f\n\u000f\u0000\u0000\u014f\u0150"+
		"\u0005`\u0000\u0000\u0150\u0199\u0003&\u0013\u0010\u0151\u0152\n\u000e"+
		"\u0000\u0000\u0152\u0153\u0005f\u0000\u0000\u0153\u0199\u0003&\u0013\u000f"+
		"\u0154\u0155\n\r\u0000\u0000\u0155\u0156\u0005O\u0000\u0000\u0156\u0157"+
		"\u0005f\u0000\u0000\u0157\u0199\u0003&\u0013\u000e\u0158\u0159\n\u000b"+
		"\u0000\u0000\u0159\u015b\u0003@ \u0000\u015a\u015c\u0003l6\u0000\u015b"+
		"\u015a\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c"+
		"\u015d\u0001\u0000\u0000\u0000\u015d\u015e\u0003&\u0013\f\u015e\u0199"+
		"\u0001\u0000\u0000\u0000\u015f\u0160\n\n\u0000\u0000\u0160\u0162\u0003"+
		"<\u001e\u0000\u0161\u0163\u0003l6\u0000\u0162\u0161\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000"+
		"\u0000\u0164\u0165\u0003&\u0013\u000b\u0165\u0199\u0001\u0000\u0000\u0000"+
		"\u0166\u0167\n\t\u0000\u0000\u0167\u0169\u0003>\u001f\u0000\u0168\u016a"+
		"\u0003l6\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000"+
		"\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016c\u0003&\u0013"+
		"\n\u016c\u0199\u0001\u0000\u0000\u0000\u016d\u0170\n\b\u0000\u0000\u016e"+
		"\u0171\u0003D\"\u0000\u016f\u0171\u0003B!\u0000\u0170\u016e\u0001\u0000"+
		"\u0000\u0000\u0170\u016f\u0001\u0000\u0000\u0000\u0171\u0173\u0001\u0000"+
		"\u0000\u0000\u0172\u0174\u0003l6\u0000\u0173\u0172\u0001\u0000\u0000\u0000"+
		"\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000"+
		"\u0175\u0176\u0003&\u0013\t\u0176\u0199\u0001\u0000\u0000\u0000\u0177"+
		"\u0178\n\u0007\u0000\u0000\u0178\u0179\u0005M\u0000\u0000\u0179\u017a"+
		"\u0003&\u0013\u0000\u017a\u017b\u0005P\u0000\u0000\u017b\u017c\u0003&"+
		"\u0013\b\u017c\u0199\u0001\u0000\u0000\u0000\u017d\u017e\n\u0016\u0000"+
		"\u0000\u017e\u0199\u0005M\u0000\u0000\u017f\u0180\n\u0014\u0000\u0000"+
		"\u0180\u0181\u0005E\u0000\u0000\u0181\u0182\u0003&\u0013\u0000\u0182\u0183"+
		"\u0005D\u0000\u0000\u0183\u0199\u0001\u0000\u0000\u0000\u0184\u0185\n"+
		"\u0012\u0000\u0000\u0185\u0187\u0007\u0003\u0000\u0000\u0186\u0188\u0003"+
		"&\u0013\u0000\u0187\u0186\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000"+
		"\u0000\u0000\u0188\u0199\u0001\u0000\u0000\u0000\u0189\u018a\n\u0006\u0000"+
		"\u0000\u018a\u0199\u0003J%\u0000\u018b\u018c\n\u0005\u0000\u0000\u018c"+
		"\u0199\u0003(\u0014\u0000\u018d\u018e\n\u0004\u0000\u0000\u018e\u018f"+
		"\u0003:\u001d\u0000\u018f\u0190\u0005\n\u0000\u0000\u0190\u0199\u0001"+
		"\u0000\u0000\u0000\u0191\u0192\n\u0002\u0000\u0000\u0192\u0193\u0003:"+
		"\u001d\u0000\u0193\u0194\u0003\u001e\u000f\u0000\u0194\u0196\u0003.\u0017"+
		"\u0000\u0195\u0197\u0003(\u0014\u0000\u0196\u0195\u0001\u0000\u0000\u0000"+
		"\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0199\u0001\u0000\u0000\u0000"+
		"\u0198\u012e\u0001\u0000\u0000\u0000\u0198\u0134\u0001\u0000\u0000\u0000"+
		"\u0198\u013b\u0001\u0000\u0000\u0000\u0198\u0147\u0001\u0000\u0000\u0000"+
		"\u0198\u014e\u0001\u0000\u0000\u0000\u0198\u0151\u0001\u0000\u0000\u0000"+
		"\u0198\u0154\u0001\u0000\u0000\u0000\u0198\u0158\u0001\u0000\u0000\u0000"+
		"\u0198\u015f\u0001\u0000\u0000\u0000\u0198\u0166\u0001\u0000\u0000\u0000"+
		"\u0198\u016d\u0001\u0000\u0000\u0000\u0198\u0177\u0001\u0000\u0000\u0000"+
		"\u0198\u017d\u0001\u0000\u0000\u0000\u0198\u017f\u0001\u0000\u0000\u0000"+
		"\u0198\u0184\u0001\u0000\u0000\u0000\u0198\u0189\u0001\u0000\u0000\u0000"+
		"\u0198\u018b\u0001\u0000\u0000\u0000\u0198\u018d\u0001\u0000\u0000\u0000"+
		"\u0198\u0191\u0001\u0000\u0000\u0000\u0199\u019c\u0001\u0000\u0000\u0000"+
		"\u019a\u0198\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000"+
		"\u019b\'\u0001\u0000\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019d"+
		"\u019f\u0005\u0015\u0000\u0000\u019e\u01a0\u0003l6\u0000\u019f\u019e\u0001"+
		"\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001"+
		"\u0000\u0000\u0000\u01a1\u01bf\u0003&\u0013\u0000\u01a2\u01a4\u0005%\u0000"+
		"\u0000\u01a3\u01a5\u0003l6\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6"+
		"\u01bf\u0003&\u0013\u0000\u01a7\u01a9\u0005(\u0000\u0000\u01a8\u01aa\u0003"+
		"l6\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000"+
		"\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01bf\u0003&\u0013\u0000"+
		"\u01ac\u01ae\u0005&\u0000\u0000\u01ad\u01af\u0003l6\u0000\u01ae\u01ad"+
		"\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b0"+
		"\u0001\u0000\u0000\u0000\u01b0\u01bf\u0003&\u0013\u0000\u01b1\u01b2\u0005"+
		"\u001d\u0000\u0000\u01b2\u01bf\u0003\u0006\u0003\u0000\u01b3\u01b5\u0005"+
		"\r\u0000\u0000\u01b4\u01b6\u0003L&\u0000\u01b5\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b8\u0001\u0000\u0000"+
		"\u0000\u01b7\u01b9\u0003n7\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b9\u0001\u0000\u0000\u0000\u01b9\u01bb\u0001\u0000\u0000\u0000\u01ba"+
		"\u01bc\u0003\u0002\u0001\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bb"+
		"\u01bc\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd"+
		"\u01bf\u0005\u0011\u0000\u0000\u01be\u019d\u0001\u0000\u0000\u0000\u01be"+
		"\u01a2\u0001\u0000\u0000\u0000\u01be\u01a7\u0001\u0000\u0000\u0000\u01be"+
		"\u01ac\u0001\u0000\u0000\u0000\u01be\u01b1\u0001\u0000\u0000\u0000\u01be"+
		"\u01b3\u0001\u0000\u0000\u0000\u01bf)\u0001\u0000\u0000\u0000\u01c0\u0297"+
		"\u0003T*\u0000\u01c1\u0297\u0005,\u0000\u0000\u01c2\u0297\u0003P(\u0000"+
		"\u01c3\u01c4\u0005G\u0000\u0000\u01c4\u01c5\u0003&\u0013\u0000\u01c5\u01c6"+
		"\u0005F\u0000\u0000\u01c6\u0297\u0001\u0000\u0000\u0000\u01c7\u0297\u0003"+
		"J%\u0000\u01c8\u01ca\u0005\b\u0000\u0000\u01c9\u01cb\u0003&\u0013\u0000"+
		"\u01ca\u01c9\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000"+
		"\u01cb\u0297\u0001\u0000\u0000\u0000\u01cc\u01ce\u0005\u001f\u0000\u0000"+
		"\u01cd\u01cf\u0003&\u0013\u0000\u01ce\u01cd\u0001\u0000\u0000\u0000\u01ce"+
		"\u01cf\u0001\u0000\u0000\u0000\u01cf\u0297\u0001\u0000\u0000\u0000\u01d0"+
		"\u01d1\u0005\u001b\u0000\u0000\u01d1\u0297\u0003&\u0013\u0000\u01d2\u01d4"+
		"\u0005\u001d\u0000\u0000\u01d3\u01d5\u00030\u0018\u0000\u01d4\u01d3\u0001"+
		"\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d7\u0001"+
		"\u0000\u0000\u0000\u01d6\u01d8\u00038\u001c\u0000\u01d7\u01d6\u0001\u0000"+
		"\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u0297\u0001\u0000"+
		"\u0000\u0000\u01d9\u01db\u0005)\u0000\u0000\u01da\u01dc\u0003&\u0013\u0000"+
		"\u01db\u01da\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000"+
		"\u01dc\u0297\u0001\u0000\u0000\u0000\u01dd\u01de\u0005\u0006\u0000\u0000"+
		"\u01de\u01e0\u0003n7\u0000\u01df\u01e1\u0003\u0002\u0001\u0000\u01e0\u01df"+
		"\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e2"+
		"\u0001\u0000\u0000\u0000\u01e2\u01e3\u0005\u0011\u0000\u0000\u01e3\u0297"+
		"\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005\u0015\u0000\u0000\u01e5\u01e6"+
		"\u0003&\u0013\u0000\u01e6\u01e7\u0003h4\u0000\u01e7\u01ed\u0003\u0006"+
		"\u0003\u0000\u01e8\u01e9\u0005\u000f\u0000\u0000\u01e9\u01ea\u0003&\u0013"+
		"\u0000\u01ea\u01eb\u0003h4\u0000\u01eb\u01ec\u0003\u0006\u0003\u0000\u01ec"+
		"\u01ee\u0001\u0000\u0000\u0000\u01ed\u01e8\u0001\u0000\u0000\u0000\u01ed"+
		"\u01ee\u0001\u0000\u0000\u0000\u01ee\u01f1\u0001\u0000\u0000\u0000\u01ef"+
		"\u01f0\u0005\u000e\u0000\u0000\u01f0\u01f2\u0003&\u0013\u0000\u01f1\u01ef"+
		"\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u01f3"+
		"\u0001\u0000\u0000\u0000\u01f3\u01f4\u0005\u0011\u0000\u0000\u01f4\u0297"+
		"\u0001\u0000\u0000\u0000\u01f5\u01f7\u0005\u0015\u0000\u0000\u01f6\u01f8"+
		"\u0003l6\u0000\u01f7\u01f6\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000"+
		"\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9\u01fa\u0003&\u0013"+
		"\u0000\u01fa\u01fc\u0003h4\u0000\u01fb\u01fd\u0003\u0002\u0001\u0000\u01fc"+
		"\u01fb\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd"+
		"\u0201\u0001\u0000\u0000\u0000\u01fe\u0200\u00036\u001b\u0000\u01ff\u01fe"+
		"\u0001\u0000\u0000\u0000\u0200\u0203\u0001\u0000\u0000\u0000\u0201\u01ff"+
		"\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202\u0204"+
		"\u0001\u0000\u0000\u0000\u0203\u0201\u0001\u0000\u0000\u0000\u0204\u0205"+
		"\u0005\u0011\u0000\u0000\u0205\u0297\u0001\u0000\u0000\u0000\u0206\u0207"+
		"\u0005\'\u0000\u0000\u0207\u0208\u0003&\u0013\u0000\u0208\u0209\u0003"+
		"h4\u0000\u0209\u020a\u0003\u0004\u0002\u0000\u020a\u020b\u0005\u0011\u0000"+
		"\u0000\u020b\u0297\u0001\u0000\u0000\u0000\u020c\u020e\u0005%\u0000\u0000"+
		"\u020d\u020f\u0003l6\u0000\u020e\u020d\u0001\u0000\u0000\u0000\u020e\u020f"+
		"\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000\u0210\u0211"+
		"\u0003&\u0013\u0000\u0211\u0213\u0003h4\u0000\u0212\u0214\u0003\u0002"+
		"\u0001\u0000\u0213\u0212\u0001\u0000\u0000\u0000\u0213\u0214\u0001\u0000"+
		"\u0000\u0000\u0214\u0216\u0001\u0000\u0000\u0000\u0215\u0217\u00038\u001c"+
		"\u0000\u0216\u0215\u0001\u0000\u0000\u0000\u0216\u0217\u0001\u0000\u0000"+
		"\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u0219\u0005\u0011\u0000"+
		"\u0000\u0219\u0297\u0001\u0000\u0000\u0000\u021a\u021c\u0005\t\u0000\u0000"+
		"\u021b\u021d\u0003\u0002\u0001\u0000\u021c\u021b\u0001\u0000\u0000\u0000"+
		"\u021c\u021d\u0001\u0000\u0000\u0000\u021d\u0221\u0001\u0000\u0000\u0000"+
		"\u021e\u0220\u00032\u0019\u0000\u021f\u021e\u0001\u0000\u0000\u0000\u0220"+
		"\u0223\u0001\u0000\u0000\u0000\u0221\u021f\u0001\u0000\u0000\u0000\u0221"+
		"\u0222\u0001\u0000\u0000\u0000\u0222\u0224\u0001\u0000\u0000\u0000\u0223"+
		"\u0221\u0001\u0000\u0000\u0000\u0224\u0297\u0005\u0011\u0000\u0000\u0225"+
		"\u0226\u0005\t\u0000\u0000\u0226\u022a\u0003n7\u0000\u0227\u0229\u0003"+
		"2\u0019\u0000\u0228\u0227\u0001\u0000\u0000\u0000\u0229\u022c\u0001\u0000"+
		"\u0000\u0000\u022a\u0228\u0001\u0000\u0000\u0000\u022a\u022b\u0001\u0000"+
		"\u0000\u0000\u022b\u022d\u0001\u0000\u0000\u0000\u022c\u022a\u0001\u0000"+
		"\u0000\u0000\u022d\u022e\u0005\u0011\u0000\u0000\u022e\u0297\u0001\u0000"+
		"\u0000\u0000\u022f\u0231\u0005(\u0000\u0000\u0230\u0232\u0003l6\u0000"+
		"\u0231\u0230\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000"+
		"\u0232\u0233\u0001\u0000\u0000\u0000\u0233\u0234\u0003&\u0013\u0000\u0234"+
		"\u0236\u0003f3\u0000\u0235\u0237\u0003\u0002\u0001\u0000\u0236\u0235\u0001"+
		"\u0000\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237\u0238\u0001"+
		"\u0000\u0000\u0000\u0238\u0239\u0005\u0011\u0000\u0000\u0239\u0297\u0001"+
		"\u0000\u0000\u0000\u023a\u023c\u0005&\u0000\u0000\u023b\u023d\u0003l6"+
		"\u0000\u023c\u023b\u0001\u0000\u0000\u0000\u023c\u023d\u0001\u0000\u0000"+
		"\u0000\u023d\u023e\u0001\u0000\u0000\u0000\u023e\u023f\u0003&\u0013\u0000"+
		"\u023f\u0241\u0003f3\u0000\u0240\u0242\u0003\u0002\u0001\u0000\u0241\u0240"+
		"\u0001\u0000\u0000\u0000\u0241\u0242\u0001\u0000\u0000\u0000\u0242\u0243"+
		"\u0001\u0000\u0000\u0000\u0243\u0244\u0005\u0011\u0000\u0000\u0244\u0297"+
		"\u0001\u0000\u0000\u0000\u0245\u0247\u0005\u0014\u0000\u0000\u0246\u0248"+
		"\u0003l6\u0000\u0247\u0246\u0001\u0000\u0000\u0000\u0247\u0248\u0001\u0000"+
		"\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249\u024a\u0003&\u0013"+
		"\u0000\u024a\u024b\u0005\u0016\u0000\u0000\u024b\u024d\u00034\u001a\u0000"+
		"\u024c\u024e\u0003n7\u0000\u024d\u024c\u0001\u0000\u0000\u0000\u024d\u024e"+
		"\u0001\u0000\u0000\u0000\u024e\u0250\u0001\u0000\u0000\u0000\u024f\u0251"+
		"\u0003\u0002\u0001\u0000\u0250\u024f\u0001\u0000\u0000\u0000\u0250\u0251"+
		"\u0001\u0000\u0000\u0000\u0251\u0252\u0001\u0000\u0000\u0000\u0252\u0253"+
		"\u0005\u0011\u0000\u0000\u0253\u0297\u0001\u0000\u0000\u0000\u0254\u0297"+
		"\u0003\u0014\n\u0000\u0255\u0297\u0003\u001a\r\u0000\u0256\u0297\u0003"+
		"\u0012\t\u0000\u0257\u0258\u0003\u001e\u000f\u0000\u0258\u0259\u0003,"+
		"\u0016\u0000\u0259\u0297\u0001\u0000\u0000\u0000\u025a\u025c\u0005C\u0000"+
		"\u0000\u025b\u025d\u0003l6\u0000\u025c\u025b\u0001\u0000\u0000\u0000\u025c"+
		"\u025d\u0001\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000\u0000\u025e"+
		"\u0260\u0003R)\u0000\u025f\u0261\u0003l6\u0000\u0260\u025f\u0001\u0000"+
		"\u0000\u0000\u0260\u0261\u0001\u0000\u0000\u0000\u0261\u0269\u0001\u0000"+
		"\u0000\u0000\u0262\u0264\u0005S\u0000\u0000\u0263\u0265\u0003l6\u0000"+
		"\u0264\u0263\u0001\u0000\u0000\u0000\u0264\u0265\u0001\u0000\u0000\u0000"+
		"\u0265\u0266\u0001\u0000\u0000\u0000\u0266\u0268\u0003R)\u0000\u0267\u0262"+
		"\u0001\u0000\u0000\u0000\u0268\u026b\u0001\u0000\u0000\u0000\u0269\u0267"+
		"\u0001\u0000\u0000\u0000\u0269\u026a\u0001\u0000\u0000\u0000\u026a\u026d"+
		"\u0001\u0000\u0000\u0000\u026b\u0269\u0001\u0000\u0000\u0000\u026c\u026e"+
		"\u0005S\u0000\u0000\u026d\u026c\u0001\u0000\u0000\u0000\u026d\u026e\u0001"+
		"\u0000\u0000\u0000\u026e\u0270\u0001\u0000\u0000\u0000\u026f\u0271\u0003"+
		"l6\u0000\u0270\u026f\u0001\u0000\u0000\u0000\u0270\u0271\u0001\u0000\u0000"+
		"\u0000\u0271\u0272\u0001\u0000\u0000\u0000\u0272\u0273\u0005B\u0000\u0000"+
		"\u0273\u0297\u0001\u0000\u0000\u0000\u0274\u0276\u0005E\u0000\u0000\u0275"+
		"\u0277\u0003l6\u0000\u0276\u0275\u0001\u0000\u0000\u0000\u0276\u0277\u0001"+
		"\u0000\u0000\u0000\u0277\u0278\u0001\u0000\u0000\u0000\u0278\u027a\u0003"+
		"&\u0013\u0000\u0279\u027b\u0003l6\u0000\u027a\u0279\u0001\u0000\u0000"+
		"\u0000\u027a\u027b\u0001\u0000\u0000\u0000\u027b\u0283\u0001\u0000\u0000"+
		"\u0000\u027c\u027e\u0005S\u0000\u0000\u027d\u027f\u0003l6\u0000\u027e"+
		"\u027d\u0001\u0000\u0000\u0000\u027e\u027f\u0001\u0000\u0000\u0000\u027f"+
		"\u0280\u0001\u0000\u0000\u0000\u0280\u0282\u0003&\u0013\u0000\u0281\u027c"+
		"\u0001\u0000\u0000\u0000\u0282\u0285\u0001\u0000\u0000\u0000\u0283\u0281"+
		"\u0001\u0000\u0000\u0000\u0283\u0284\u0001\u0000\u0000\u0000\u0284\u0287"+
		"\u0001\u0000\u0000\u0000\u0285\u0283\u0001\u0000\u0000\u0000\u0286\u0288"+
		"\u0005S\u0000\u0000\u0287\u0286\u0001\u0000\u0000\u0000\u0287\u0288\u0001"+
		"\u0000\u0000\u0000\u0288\u028a\u0001\u0000\u0000\u0000\u0289\u028b\u0003"+
		"l6\u0000\u028a\u0289\u0001\u0000\u0000\u0000\u028a\u028b\u0001\u0000\u0000"+
		"\u0000\u028b\u028c\u0001\u0000\u0000\u0000\u028c\u028d\u0005D\u0000\u0000"+
		"\u028d\u0297\u0001\u0000\u0000\u0000\u028e\u028f\u0005G\u0000\u0000\u028f"+
		"\u0290\u0003&\u0013\u0000\u0290\u0292\u0007\u0003\u0000\u0000\u0291\u0293"+
		"\u0003&\u0013\u0000\u0292\u0291\u0001\u0000\u0000\u0000\u0292\u0293\u0001"+
		"\u0000\u0000\u0000\u0293\u0294\u0001\u0000\u0000\u0000\u0294\u0295\u0005"+
		"F\u0000\u0000\u0295\u0297\u0001\u0000\u0000\u0000\u0296\u01c0\u0001\u0000"+
		"\u0000\u0000\u0296\u01c1\u0001\u0000\u0000\u0000\u0296\u01c2\u0001\u0000"+
		"\u0000\u0000\u0296\u01c3\u0001\u0000\u0000\u0000\u0296\u01c7\u0001\u0000"+
		"\u0000\u0000\u0296\u01c8\u0001\u0000\u0000\u0000\u0296\u01cc\u0001\u0000"+
		"\u0000\u0000\u0296\u01d0\u0001\u0000\u0000\u0000\u0296\u01d2\u0001\u0000"+
		"\u0000\u0000\u0296\u01d9\u0001\u0000\u0000\u0000\u0296\u01dd\u0001\u0000"+
		"\u0000\u0000\u0296\u01e4\u0001\u0000\u0000\u0000\u0296\u01f5\u0001\u0000"+
		"\u0000\u0000\u0296\u0206\u0001\u0000\u0000\u0000\u0296\u020c\u0001\u0000"+
		"\u0000\u0000\u0296\u021a\u0001\u0000\u0000\u0000\u0296\u0225\u0001\u0000"+
		"\u0000\u0000\u0296\u022f\u0001\u0000\u0000\u0000\u0296\u023a\u0001\u0000"+
		"\u0000\u0000\u0296\u0245\u0001\u0000\u0000\u0000\u0296\u0254\u0001\u0000"+
		"\u0000\u0000\u0296\u0255\u0001\u0000\u0000\u0000\u0296\u0256\u0001\u0000"+
		"\u0000\u0000\u0296\u0257\u0001\u0000\u0000\u0000\u0296\u025a\u0001\u0000"+
		"\u0000\u0000\u0296\u0274\u0001\u0000\u0000\u0000\u0296\u028e\u0001\u0000"+
		"\u0000\u0000\u0297+\u0001\u0000\u0000\u0000\u0298\u029a\u0005G\u0000\u0000"+
		"\u0299\u029b\u0003l6\u0000\u029a\u0299\u0001\u0000\u0000\u0000\u029a\u029b"+
		"\u0001\u0000\u0000\u0000\u029b\u029c\u0001\u0000\u0000\u0000\u029c\u02a4"+
		"\u0003$\u0012\u0000\u029d\u029f\u0005S\u0000\u0000\u029e\u02a0\u0003l"+
		"6\u0000\u029f\u029e\u0001\u0000\u0000\u0000\u029f\u02a0\u0001\u0000\u0000"+
		"\u0000\u02a0\u02a1\u0001\u0000\u0000\u0000\u02a1\u02a3\u0003$\u0012\u0000"+
		"\u02a2\u029d\u0001\u0000\u0000\u0000\u02a3\u02a6\u0001\u0000\u0000\u0000"+
		"\u02a4\u02a2\u0001\u0000\u0000\u0000\u02a4\u02a5\u0001\u0000\u0000\u0000"+
		"\u02a5\u02a8\u0001\u0000\u0000\u0000\u02a6\u02a4\u0001\u0000\u0000\u0000"+
		"\u02a7\u02a9\u0003l6\u0000\u02a8\u02a7\u0001\u0000\u0000\u0000\u02a8\u02a9"+
		"\u0001\u0000\u0000\u0000\u02a9\u02aa\u0001\u0000\u0000\u0000\u02aa\u02ab"+
		"\u0005F\u0000\u0000\u02ab\u02b2\u0001\u0000\u0000\u0000\u02ac\u02ae\u0005"+
		"G\u0000\u0000\u02ad\u02af\u0003l6\u0000\u02ae\u02ad\u0001\u0000\u0000"+
		"\u0000\u02ae\u02af\u0001\u0000\u0000\u0000\u02af\u02b0\u0001\u0000\u0000"+
		"\u0000\u02b0\u02b2\u0005F\u0000\u0000\u02b1\u0298\u0001\u0000\u0000\u0000"+
		"\u02b1\u02ac\u0001\u0000\u0000\u0000\u02b2-\u0001\u0000\u0000\u0000\u02b3"+
		"\u02bb\u0003$\u0012\u0000\u02b4\u02b6\u0005S\u0000\u0000\u02b5\u02b7\u0003"+
		"l6\u0000\u02b6\u02b5\u0001\u0000\u0000\u0000\u02b6\u02b7\u0001\u0000\u0000"+
		"\u0000\u02b7\u02b8\u0001\u0000\u0000\u0000\u02b8\u02ba\u0003$\u0012\u0000"+
		"\u02b9\u02b4\u0001\u0000\u0000\u0000\u02ba\u02bd\u0001\u0000\u0000\u0000"+
		"\u02bb\u02b9\u0001\u0000\u0000\u0000\u02bb\u02bc\u0001\u0000\u0000\u0000"+
		"\u02bc/\u0001\u0000\u0000\u0000\u02bd\u02bb\u0001\u0000\u0000\u0000\u02be"+
		"\u02c3\u0003N\'\u0000\u02bf\u02c3\u0003R)\u0000\u02c0\u02c1\u0005]\u0000"+
		"\u0000\u02c1\u02c3\u0003Z-\u0000\u02c2\u02be\u0001\u0000\u0000\u0000\u02c2"+
		"\u02bf\u0001\u0000\u0000\u0000\u02c2\u02c0\u0001\u0000\u0000\u0000\u02c3"+
		"1\u0001\u0000\u0000\u0000\u02c4\u02c5\u0005\'\u0000\u0000\u02c5\u02ca"+
		"\u00034\u001a\u0000\u02c6\u02c7\u0005S\u0000\u0000\u02c7\u02c9\u00034"+
		"\u001a\u0000\u02c8\u02c6\u0001\u0000\u0000\u0000\u02c9\u02cc\u0001\u0000"+
		"\u0000\u0000\u02ca\u02c8\u0001\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000"+
		"\u0000\u0000\u02cb\u02cd\u0001\u0000\u0000\u0000\u02cc\u02ca\u0001\u0000"+
		"\u0000\u0000\u02cd\u02ce\u0003h4\u0000\u02ce\u02cf\u0003\u0002\u0001\u0000"+
		"\u02cf\u02d2\u0001\u0000\u0000\u0000\u02d0\u02d2\u00038\u001c\u0000\u02d1"+
		"\u02c4\u0001\u0000\u0000\u0000\u02d1\u02d0\u0001\u0000\u0000\u0000\u02d2"+
		"3\u0001\u0000\u0000\u0000\u02d3\u02d4\u0003&\u0013\u0000\u02d45\u0001"+
		"\u0000\u0000\u0000\u02d5\u02d7\u0005\u000f\u0000\u0000\u02d6\u02d8\u0003"+
		"l6\u0000\u02d7\u02d6\u0001\u0000\u0000\u0000\u02d7\u02d8\u0001\u0000\u0000"+
		"\u0000\u02d8\u02d9\u0001\u0000\u0000\u0000\u02d9\u02da\u0003&\u0013\u0000"+
		"\u02da\u02db\u0003h4\u0000\u02db\u02dc\u0003\u0002\u0001\u0000\u02dc\u02df"+
		"\u0001\u0000\u0000\u0000\u02dd\u02df\u00038\u001c\u0000\u02de\u02d5\u0001"+
		"\u0000\u0000\u0000\u02de\u02dd\u0001\u0000\u0000\u0000\u02df7\u0001\u0000"+
		"\u0000\u0000\u02e0\u02e2\u0005\u000e\u0000\u0000\u02e1\u02e3\u0003l6\u0000"+
		"\u02e2\u02e1\u0001\u0000\u0000\u0000\u02e2\u02e3\u0001\u0000\u0000\u0000"+
		"\u02e3\u02e4\u0001\u0000\u0000\u0000\u02e4\u02e5\u0003\u0002\u0001\u0000"+
		"\u02e59\u0001\u0000\u0000\u0000\u02e6\u02e7\u0007\u0004\u0000\u0000\u02e7"+
		";\u0001\u0000\u0000\u0000\u02e8\u02e9\u0007\u0005\u0000\u0000\u02e9=\u0001"+
		"\u0000\u0000\u0000\u02ea\u02eb\u0007\u0006\u0000\u0000\u02eb?\u0001\u0000"+
		"\u0000\u0000\u02ec\u02ed\u0007\u0007\u0000\u0000\u02edA\u0001\u0000\u0000"+
		"\u0000\u02ee\u02ef\u0007\b\u0000\u0000\u02efC\u0001\u0000\u0000\u0000"+
		"\u02f0\u02f1\u0007\t\u0000\u0000\u02f1E\u0001\u0000\u0000\u0000\u02f2"+
		"\u02f3\u0007\n\u0000\u0000\u02f3G\u0001\u0000\u0000\u0000\u02f4\u02f5"+
		"\u0007\u000b\u0000\u0000\u02f5I\u0001\u0000\u0000\u0000\u02f6\u02f8\u0005"+
		"C\u0000\u0000\u02f7\u02f9\u0003l6\u0000\u02f8\u02f7\u0001\u0000\u0000"+
		"\u0000\u02f8\u02f9\u0001\u0000\u0000\u0000\u02f9\u02fb\u0001\u0000\u0000"+
		"\u0000\u02fa\u02fc\u0003L&\u0000\u02fb\u02fa\u0001\u0000\u0000\u0000\u02fb"+
		"\u02fc\u0001\u0000\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fd"+
		"\u02ff\u0003\u0004\u0002\u0000\u02fe\u0300\u0003l6\u0000\u02ff\u02fe\u0001"+
		"\u0000\u0000\u0000\u02ff\u0300\u0001\u0000\u0000\u0000\u0300\u0308\u0001"+
		"\u0000\u0000\u0000\u0301\u0302\u0005S\u0000\u0000\u0302\u0304\u0003\u0004"+
		"\u0002\u0000\u0303\u0305\u0003l6\u0000\u0304\u0303\u0001\u0000\u0000\u0000"+
		"\u0304\u0305\u0001\u0000\u0000\u0000\u0305\u0307\u0001\u0000\u0000\u0000"+
		"\u0306\u0301\u0001\u0000\u0000\u0000\u0307\u030a\u0001\u0000\u0000\u0000"+
		"\u0308\u0306\u0001\u0000\u0000\u0000\u0308\u0309\u0001\u0000\u0000\u0000"+
		"\u0309\u030b\u0001\u0000\u0000\u0000\u030a\u0308\u0001\u0000\u0000\u0000"+
		"\u030b\u030c\u0005B\u0000\u0000\u030cK\u0001\u0000\u0000\u0000\u030d\u030e"+
		"\u0005W\u0000\u0000\u030e\u0313\u0003&\u0013\u0000\u030f\u0310\u0005S"+
		"\u0000\u0000\u0310\u0312\u0003&\u0013\u0000\u0311\u030f\u0001\u0000\u0000"+
		"\u0000\u0312\u0315\u0001\u0000\u0000\u0000\u0313\u0311\u0001\u0000\u0000"+
		"\u0000\u0313\u0314\u0001\u0000\u0000\u0000\u0314\u0316\u0001\u0000\u0000"+
		"\u0000\u0315\u0313\u0001\u0000\u0000\u0000\u0316\u0317\u0005W\u0000\u0000"+
		"\u0317M\u0001\u0000\u0000\u0000\u0318\u031c\u0003V+\u0000\u0319\u031a"+
		"\u0005P\u0000\u0000\u031a\u031c\u0003V+\u0000\u031b\u0318\u0001\u0000"+
		"\u0000\u0000\u031b\u0319\u0001\u0000\u0000\u0000\u031cO\u0001\u0000\u0000"+
		"\u0000\u031d\u031e\u0005P\u0000\u0000\u031e\u031f\u0003Z-\u0000\u031f"+
		"\u0320\u0005P\u0000\u0000\u0320\u0321\u0003j5\u0000\u0321\u0325\u0001"+
		"\u0000\u0000\u0000\u0322\u0323\u0005P\u0000\u0000\u0323\u0325\u0003\u001e"+
		"\u000f\u0000\u0324\u031d\u0001\u0000\u0000\u0000\u0324\u0322\u0001\u0000"+
		"\u0000\u0000\u0325Q\u0001\u0000\u0000\u0000\u0326\u0327\u0003&\u0013\u0000"+
		"\u0327\u0328\u0005]\u0000\u0000\u0328\u0329\u0003&\u0013\u0000\u0329\u032f"+
		"\u0001\u0000\u0000\u0000\u032a\u032b\u0003&\u0013\u0000\u032b\u032c\u0005"+
		"P\u0000\u0000\u032c\u032d\u0003&\u0013\u0000\u032d\u032f\u0001\u0000\u0000"+
		"\u0000\u032e\u0326\u0001\u0000\u0000\u0000\u032e\u032a\u0001\u0000\u0000"+
		"\u0000\u032fS\u0001\u0000\u0000\u0000\u0330\u0331\u0006*\uffff\uffff\u0000"+
		"\u0331\u0336\u0003Z-\u0000\u0332\u0336\u0003X,\u0000\u0333\u0334\u0005"+
		"Q\u0000\u0000\u0334\u0336\u0003T*\u0001\u0335\u0330\u0001\u0000\u0000"+
		"\u0000\u0335\u0332\u0001\u0000\u0000\u0000\u0335\u0333\u0001\u0000\u0000"+
		"\u0000\u0336\u033f\u0001\u0000\u0000\u0000\u0337\u0338\n\u0002\u0000\u0000"+
		"\u0338\u033b\u0005Q\u0000\u0000\u0339\u033c\u0003Z-\u0000\u033a\u033c"+
		"\u0003X,\u0000\u033b\u0339\u0001\u0000\u0000\u0000\u033b\u033a\u0001\u0000"+
		"\u0000\u0000\u033c\u033e\u0001\u0000\u0000\u0000\u033d\u0337\u0001\u0000"+
		"\u0000\u0000\u033e\u0341\u0001\u0000\u0000\u0000\u033f\u033d\u0001\u0000"+
		"\u0000\u0000\u033f\u0340\u0001\u0000\u0000\u0000\u0340U\u0001\u0000\u0000"+
		"\u0000\u0341\u033f\u0001\u0000\u0000\u0000\u0342\u0347\u0003Z-\u0000\u0343"+
		"\u0344\u0007\f\u0000\u0000\u0344\u0346\u0003Z-\u0000\u0345\u0343\u0001"+
		"\u0000\u0000\u0000\u0346\u0349\u0001\u0000\u0000\u0000\u0347\u0345\u0001"+
		"\u0000\u0000\u0000\u0347\u0348\u0001\u0000\u0000\u0000\u0348W\u0001\u0000"+
		"\u0000\u0000\u0349\u0347\u0001\u0000\u0000\u0000\u034a\u0353\u0005+\u0000"+
		"\u0000\u034b\u0353\u0003j5\u0000\u034c\u0353\u0005*\u0000\u0000\u034d"+
		"\u0353\u0007\r\u0000\u0000\u034e\u0353\u0005\u0019\u0000\u0000\u034f\u0350"+
		"\u0005+\u0000\u0000\u0350\u0353\u0005J\u0000\u0000\u0351\u0353\u0005m"+
		"\u0000\u0000\u0352\u034a\u0001\u0000\u0000\u0000\u0352\u034b\u0001\u0000"+
		"\u0000\u0000\u0352\u034c\u0001\u0000\u0000\u0000\u0352\u034d\u0001\u0000"+
		"\u0000\u0000\u0352\u034e\u0001\u0000\u0000\u0000\u0352\u034f\u0001\u0000"+
		"\u0000\u0000\u0352\u0351\u0001\u0000\u0000\u0000\u0353Y\u0001\u0000\u0000"+
		"\u0000\u0354\u0362\u0005l\u0000\u0000\u0355\u0362\u0003^/\u0000\u0356"+
		"\u0362\u0003`0\u0000\u0357\u0362\u0003b1\u0000\u0358\u0362\u0003d2\u0000"+
		"\u0359\u0362\u0005\u0018\u0000\u0000\u035a\u0362\u0005\u001c\u0000\u0000"+
		"\u035b\u0362\u0005\u001e\u0000\u0000\u035c\u0362\u0005\b\u0000\u0000\u035d"+
		"\u0362\u0005 \u0000\u0000\u035e\u0362\u0005!\u0000\u0000\u035f\u0362\u0005"+
		"\u0019\u0000\u0000\u0360\u0362\u0003\\.\u0000\u0361\u0354\u0001\u0000"+
		"\u0000\u0000\u0361\u0355\u0001\u0000\u0000\u0000\u0361\u0356\u0001\u0000"+
		"\u0000\u0000\u0361\u0357\u0001\u0000\u0000\u0000\u0361\u0358\u0001\u0000"+
		"\u0000\u0000\u0361\u0359\u0001\u0000\u0000\u0000\u0361\u035a\u0001\u0000"+
		"\u0000\u0000\u0361\u035b\u0001\u0000\u0000\u0000\u0361\u035c\u0001\u0000"+
		"\u0000\u0000\u0361\u035d\u0001\u0000\u0000\u0000\u0361\u035e\u0001\u0000"+
		"\u0000\u0000\u0361\u035f\u0001\u0000\u0000\u0000\u0361\u0360\u0001\u0000"+
		"\u0000\u0000\u0362[\u0001\u0000\u0000\u0000\u0363\u0364\u0005C\u0000\u0000"+
		"\u0364\u0368\u0005B\u0000\u0000\u0365\u0366\u0005E\u0000\u0000\u0366\u0368"+
		"\u0005D\u0000\u0000\u0367\u0363\u0001\u0000\u0000\u0000\u0367\u0365\u0001"+
		"\u0000\u0000\u0000\u0368]\u0001\u0000\u0000\u0000\u0369\u036a\u0005@\u0000"+
		"\u0000\u036a\u036b\u0005l\u0000\u0000\u036b_\u0001\u0000\u0000\u0000\u036c"+
		"\u036d\u0005A\u0000\u0000\u036d\u036e\u0005A\u0000\u0000\u036e\u036f\u0005"+
		"l\u0000\u0000\u036fa\u0001\u0000\u0000\u0000\u0370\u0371\u0005A\u0000"+
		"\u0000\u0371\u0372\u0005l\u0000\u0000\u0372c\u0001\u0000\u0000\u0000\u0373"+
		"\u0374\u0005@\u0000\u0000\u0374\u0377\u0005*\u0000\u0000\u0375\u0377\u0005"+
		".\u0000\u0000\u0376\u0373\u0001\u0000\u0000\u0000\u0376\u0375\u0001\u0000"+
		"\u0000\u0000\u0377e\u0001\u0000\u0000\u0000\u0378\u0379\u0007\u000e\u0000"+
		"\u0000\u0379\u037c\u0003n7\u0000\u037a\u037c\u0003n7\u0000\u037b\u0378"+
		"\u0001\u0000\u0000\u0000\u037b\u037a\u0001\u0000\u0000\u0000\u037cg\u0001"+
		"\u0000\u0000\u0000\u037d\u037f\u0007\u000f\u0000\u0000\u037e\u0380\u0003"+
		"n7\u0000\u037f\u037e\u0001\u0000\u0000\u0000\u037f\u0380\u0001\u0000\u0000"+
		"\u0000\u0380\u0383\u0001\u0000\u0000\u0000\u0381\u0383\u0003n7\u0000\u0382"+
		"\u037d\u0001\u0000\u0000\u0000\u0382\u0381\u0001\u0000\u0000\u0000\u0383"+
		"i\u0001\u0000\u0000\u0000\u0384\u0386\u0005-\u0000\u0000\u0385\u0384\u0001"+
		"\u0000\u0000\u0000\u0386\u0387\u0001\u0000\u0000\u0000\u0387\u0385\u0001"+
		"\u0000\u0000\u0000\u0387\u0388\u0001\u0000\u0000\u0000\u0388k\u0001\u0000"+
		"\u0000\u0000\u0389\u038b\u0007\u0010\u0000\u0000\u038a\u0389\u0001\u0000"+
		"\u0000\u0000\u038b\u038c\u0001\u0000\u0000\u0000\u038c\u038a\u0001\u0000"+
		"\u0000\u0000\u038c\u038d\u0001\u0000\u0000\u0000\u038dm\u0001\u0000\u0000"+
		"\u0000\u038e\u0390\u0003p8\u0000\u038f\u038e\u0001\u0000\u0000\u0000\u0390"+
		"\u0391\u0001\u0000\u0000\u0000\u0391\u038f\u0001\u0000\u0000\u0000\u0391"+
		"\u0392\u0001\u0000\u0000\u0000\u0392o\u0001\u0000\u0000\u0000\u0393\u0394"+
		"\u0007\u0011\u0000\u0000\u0394q\u0001\u0000\u0000\u0000|y\u0081\u0089"+
		"\u0094\u009c\u00a5\u00b4\u00ba\u00c5\u00ca\u00ce\u00d5\u00d8\u00de\u00e9"+
		"\u00ef\u00f4\u00f7\u00fd\u0102\u0105\u0113\u0117\u0121\u0127\u012c\u0131"+
		"\u0137\u013d\u0140\u0144\u014a\u015b\u0162\u0169\u0170\u0173\u0187\u0196"+
		"\u0198\u019a\u019f\u01a4\u01a9\u01ae\u01b5\u01b8\u01bb\u01be\u01ca\u01ce"+
		"\u01d4\u01d7\u01db\u01e0\u01ed\u01f1\u01f7\u01fc\u0201\u020e\u0213\u0216"+
		"\u021c\u0221\u022a\u0231\u0236\u023c\u0241\u0247\u024d\u0250\u025c\u0260"+
		"\u0264\u0269\u026d\u0270\u0276\u027a\u027e\u0283\u0287\u028a\u0292\u0296"+
		"\u029a\u029f\u02a4\u02a8\u02ae\u02b1\u02b6\u02bb\u02c2\u02ca\u02d1\u02d7"+
		"\u02de\u02e2\u02f8\u02fb\u02ff\u0304\u0308\u0313\u031b\u0324\u032e\u0335"+
		"\u033b\u033f\u0347\u0352\u0361\u0367\u0376\u037b\u037f\u0382\u0387\u038c"+
		"\u0391";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}