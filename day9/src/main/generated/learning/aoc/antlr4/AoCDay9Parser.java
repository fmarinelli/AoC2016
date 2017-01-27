// Generated from AoCDay9.g4 by ANTLR 4.5

package learning.aoc.antlr4;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AoCDay9Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAR=1, RPAR=2, X=3, INT=4, UNKNOWN=5;
	public static final int
		RULE_value = 0, RULE_marker = 1, RULE_premarker = 2, RULE_single = 3, 
		RULE_digits = 4;
	public static final String[] ruleNames = {
		"value", "marker", "premarker", "single", "digits"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'x'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LPAR", "RPAR", "X", "INT", "UNKNOWN"
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
	public String getGrammarFileName() { return "AoCDay9.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AoCDay9Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ValueContext extends ParserRuleContext {
		public PremarkerContext premarker() {
			return getRuleContext(PremarkerContext.class,0);
		}
		public MarkerContext marker() {
			return getRuleContext(MarkerContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AoCDay9Parser.EOF, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AoCDay9Listener ) ((AoCDay9Listener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AoCDay9Listener ) ((AoCDay9Listener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			premarker();
			setState(12);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(11);
				marker();
				}
			}

			setState(15);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(14);
				match(EOF);
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

	public static class MarkerContext extends ParserRuleContext {
		public DigitsContext len;
		public DigitsContext copies;
		public TerminalNode LPAR() { return getToken(AoCDay9Parser.LPAR, 0); }
		public TerminalNode X() { return getToken(AoCDay9Parser.X, 0); }
		public TerminalNode RPAR() { return getToken(AoCDay9Parser.RPAR, 0); }
		public List<DigitsContext> digits() {
			return getRuleContexts(DigitsContext.class);
		}
		public DigitsContext digits(int i) {
			return getRuleContext(DigitsContext.class,i);
		}
		public MarkerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_marker; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AoCDay9Listener ) ((AoCDay9Listener)listener).enterMarker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AoCDay9Listener ) ((AoCDay9Listener)listener).exitMarker(this);
		}
	}

	public final MarkerContext marker() throws RecognitionException {
		MarkerContext _localctx = new MarkerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_marker);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(LPAR);
			setState(18);
			((MarkerContext)_localctx).len = digits();
			setState(19);
			match(X);
			setState(20);
			((MarkerContext)_localctx).copies = digits();
			setState(21);
			match(RPAR);
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

	public static class PremarkerContext extends ParserRuleContext {
		public List<TerminalNode> LPAR() { return getTokens(AoCDay9Parser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(AoCDay9Parser.LPAR, i);
		}
		public PremarkerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_premarker; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AoCDay9Listener ) ((AoCDay9Listener)listener).enterPremarker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AoCDay9Listener ) ((AoCDay9Listener)listener).exitPremarker(this);
		}
	}

	public final PremarkerContext premarker() throws RecognitionException {
		PremarkerContext _localctx = new PremarkerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_premarker);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RPAR) | (1L << X) | (1L << INT) | (1L << UNKNOWN))) != 0)) {
				{
				{
				setState(23);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==LPAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(28);
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

	public static class SingleContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AoCDay9Parser.EOF, 0); }
		public SingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AoCDay9Listener ) ((AoCDay9Listener)listener).enterSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AoCDay9Listener ) ((AoCDay9Listener)listener).exitSingle(this);
		}
	}

	public final SingleContext single() throws RecognitionException {
		SingleContext _localctx = new SingleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_single);
		try {
			setState(31);
			switch (_input.LA(1)) {
			case LPAR:
			case RPAR:
			case X:
			case INT:
			case UNKNOWN:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				matchWildcard();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				match(EOF);
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

	public static class DigitsContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(AoCDay9Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(AoCDay9Parser.INT, i);
		}
		public DigitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AoCDay9Listener ) ((AoCDay9Listener)listener).enterDigits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AoCDay9Listener ) ((AoCDay9Listener)listener).exitDigits(this);
		}
	}

	public final DigitsContext digits() throws RecognitionException {
		DigitsContext _localctx = new DigitsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_digits);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(33);
				match(INT);
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT );
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\7)\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\5\2\17\n\2\3\2\5\2\22\n\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\7\4\33\n\4\f\4\16\4\36\13\4\3\5\3\5\5\5\"\n\5\3\6\6"+
		"\6%\n\6\r\6\16\6&\3\6\2\2\7\2\4\6\b\n\2\3\3\2\3\3(\2\f\3\2\2\2\4\23\3"+
		"\2\2\2\6\34\3\2\2\2\b!\3\2\2\2\n$\3\2\2\2\f\16\5\6\4\2\r\17\5\4\3\2\16"+
		"\r\3\2\2\2\16\17\3\2\2\2\17\21\3\2\2\2\20\22\7\2\2\3\21\20\3\2\2\2\21"+
		"\22\3\2\2\2\22\3\3\2\2\2\23\24\7\3\2\2\24\25\5\n\6\2\25\26\7\5\2\2\26"+
		"\27\5\n\6\2\27\30\7\4\2\2\30\5\3\2\2\2\31\33\n\2\2\2\32\31\3\2\2\2\33"+
		"\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\7\3\2\2\2\36\34\3\2\2\2\37"+
		"\"\13\2\2\2 \"\7\2\2\3!\37\3\2\2\2! \3\2\2\2\"\t\3\2\2\2#%\7\6\2\2$#\3"+
		"\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\13\3\2\2\2\7\16\21\34!&";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}