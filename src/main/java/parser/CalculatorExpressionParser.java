// Generated from /home/thomas/Desktop/calc/src/main/resources/CalculatorExpression.g4 by ANTLR 4.9.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, INT=5, DECIMAL=6, SCIENTIFIC=7, IMAGINARY=8, 
		PLUS=9, MINUS=10, MULT=11, DIV=12, WS=13;
	public static final int
		RULE_expression = 0, RULE_parenthesed_expression = 1, RULE_term = 2, RULE_factor = 3, 
		RULE_value = 4, RULE_scientific_number = 5, RULE_number = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression", "parenthesed_expression", "term", "factor", "value", "scientific_number", 
			"number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'e'", "'E'", null, null, null, null, "'+'", "'-'", 
			"'\u00D7'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "INT", "DECIMAL", "SCIENTIFIC", "IMAGINARY", 
			"PLUS", "MINUS", "MULT", "DIV", "WS"
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
	public String getGrammarFileName() { return "CalculatorExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculatorExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExpressionListener ) ((CalculatorExpressionListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExpressionListener ) ((CalculatorExpressionListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExpressionVisitor ) return ((CalculatorExpressionVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			term(0);
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

	public static class Parenthesed_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Parenthesed_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesed_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExpressionListener ) ((CalculatorExpressionListener)listener).enterParenthesed_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExpressionListener ) ((CalculatorExpressionListener)listener).exitParenthesed_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExpressionVisitor ) return ((CalculatorExpressionVisitor<? extends T>)visitor).visitParenthesed_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parenthesed_expressionContext parenthesed_expression() throws RecognitionException {
		Parenthesed_expressionContext _localctx = new Parenthesed_expressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_parenthesed_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(T__0);
			setState(17);
			expression();
			setState(18);
			match(T__1);
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(CalculatorExpressionParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CalculatorExpressionParser.MINUS, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExpressionListener ) ((CalculatorExpressionListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExpressionListener ) ((CalculatorExpressionListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExpressionVisitor ) return ((CalculatorExpressionVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(21);
			factor(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(31);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(29);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(23);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(24);
						match(PLUS);
						setState(25);
						factor(0);
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(26);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(27);
						match(MINUS);
						setState(28);
						factor(0);
						}
						break;
					}
					} 
				}
				setState(33);
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

	public static class FactorContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode MULT() { return getToken(CalculatorExpressionParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(CalculatorExpressionParser.DIV, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExpressionListener ) ((CalculatorExpressionListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExpressionListener ) ((CalculatorExpressionListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExpressionVisitor ) return ((CalculatorExpressionVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		return factor(0);
	}

	private FactorContext factor(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FactorContext _localctx = new FactorContext(_ctx, _parentState);
		FactorContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_factor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(35);
			value();
			}
			_ctx.stop = _input.LT(-1);
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(43);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new FactorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(37);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(38);
						match(MULT);
						setState(39);
						value();
						}
						break;
					case 2:
						{
						_localctx = new FactorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(40);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(41);
						match(DIV);
						setState(42);
						value();
						}
						break;
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class ValueContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Parenthesed_expressionContext parenthesed_expression() {
			return getRuleContext(Parenthesed_expressionContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExpressionListener ) ((CalculatorExpressionListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExpressionListener ) ((CalculatorExpressionListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExpressionVisitor ) return ((CalculatorExpressionVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DECIMAL:
			case IMAGINARY:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				number();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				parenthesed_expression();
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

	public static class Scientific_numberContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(CalculatorExpressionParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CalculatorExpressionParser.INT, i);
		}
		public TerminalNode DECIMAL() { return getToken(CalculatorExpressionParser.DECIMAL, 0); }
		public TerminalNode PLUS() { return getToken(CalculatorExpressionParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CalculatorExpressionParser.MINUS, 0); }
		public Scientific_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scientific_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExpressionListener ) ((CalculatorExpressionListener)listener).enterScientific_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExpressionListener ) ((CalculatorExpressionListener)listener).exitScientific_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExpressionVisitor ) return ((CalculatorExpressionVisitor<? extends T>)visitor).visitScientific_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scientific_numberContext scientific_number() throws RecognitionException {
		Scientific_numberContext _localctx = new Scientific_numberContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_scientific_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(53);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(54);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(57);
			match(INT);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CalculatorExpressionParser.INT, 0); }
		public TerminalNode DECIMAL() { return getToken(CalculatorExpressionParser.DECIMAL, 0); }
		public TerminalNode IMAGINARY() { return getToken(CalculatorExpressionParser.IMAGINARY, 0); }
		public Scientific_numberContext scientific_number() {
			return getRuleContext(Scientific_numberContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CalculatorExpressionParser.MINUS, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExpressionListener ) ((CalculatorExpressionListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExpressionListener ) ((CalculatorExpressionListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExpressionVisitor ) return ((CalculatorExpressionVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(59);
				match(MINUS);
				}
			}

			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(62);
				match(INT);
				}
				break;
			case 2:
				{
				setState(63);
				match(DECIMAL);
				}
				break;
			case 3:
				{
				setState(64);
				match(IMAGINARY);
				}
				break;
			case 4:
				{
				setState(65);
				scientific_number();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return term_sempred((TermContext)_localctx, predIndex);
		case 3:
			return factor_sempred((FactorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean factor_sempred(FactorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17G\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4 \n\4\f\4\16\4#\13\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\7\5.\n\5\f\5\16\5\61\13\5\3\6\3\6\5\6\65\n\6\3"+
		"\7\3\7\3\7\5\7:\n\7\3\7\3\7\3\b\5\b?\n\b\3\b\3\b\3\b\3\b\5\bE\n\b\3\b"+
		"\2\4\6\b\t\2\4\6\b\n\f\16\2\5\3\2\7\b\3\2\5\6\3\2\13\f\2I\2\20\3\2\2\2"+
		"\4\22\3\2\2\2\6\26\3\2\2\2\b$\3\2\2\2\n\64\3\2\2\2\f\66\3\2\2\2\16>\3"+
		"\2\2\2\20\21\5\6\4\2\21\3\3\2\2\2\22\23\7\3\2\2\23\24\5\2\2\2\24\25\7"+
		"\4\2\2\25\5\3\2\2\2\26\27\b\4\1\2\27\30\5\b\5\2\30!\3\2\2\2\31\32\f\4"+
		"\2\2\32\33\7\13\2\2\33 \5\b\5\2\34\35\f\3\2\2\35\36\7\f\2\2\36 \5\b\5"+
		"\2\37\31\3\2\2\2\37\34\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\7\3"+
		"\2\2\2#!\3\2\2\2$%\b\5\1\2%&\5\n\6\2&/\3\2\2\2\'(\f\4\2\2()\7\r\2\2)."+
		"\5\n\6\2*+\f\3\2\2+,\7\16\2\2,.\5\n\6\2-\'\3\2\2\2-*\3\2\2\2.\61\3\2\2"+
		"\2/-\3\2\2\2/\60\3\2\2\2\60\t\3\2\2\2\61/\3\2\2\2\62\65\5\16\b\2\63\65"+
		"\5\4\3\2\64\62\3\2\2\2\64\63\3\2\2\2\65\13\3\2\2\2\66\67\t\2\2\2\679\t"+
		"\3\2\28:\t\4\2\298\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\7\2\2<\r\3\2\2\2=?"+
		"\7\f\2\2>=\3\2\2\2>?\3\2\2\2?D\3\2\2\2@E\7\7\2\2AE\7\b\2\2BE\7\n\2\2C"+
		"E\5\f\7\2D@\3\2\2\2DA\3\2\2\2DB\3\2\2\2DC\3\2\2\2E\17\3\2\2\2\n\37!-/"+
		"\649>D";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}