// Generated from AoCDay10.g4 by ANTLR 4.5

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
public class AoCDay10Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VALUE=1, BOT=2, OUTPUT=3, GOES=4, GIVES=5, AND=6, LOW=7, HIGH=8, TO=9, 
		INT=10, WS=11, NL=12;
	public static final int
		RULE_instructions = 0, RULE_botgatherer = 1, RULE_botBB = 2, RULE_botOB = 3, 
		RULE_botBO = 4, RULE_botOO = 5, RULE_digits = 6;
	public static final String[] ruleNames = {
		"instructions", "botgatherer", "botBB", "botOB", "botBO", "botOO", "digits"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'value'", "'bot'", "'output'", "'goes'", "'gives'", "'and'", "'low'", 
		"'high'", "'to'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VALUE", "BOT", "OUTPUT", "GOES", "GIVES", "AND", "LOW", "HIGH", 
		"TO", "INT", "WS", "NL"
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
	public String getGrammarFileName() { return "AoCDay10.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AoCDay10Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InstructionsContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AoCDay10Parser.EOF, 0); }
		public List<BotgathererContext> botgatherer() {
			return getRuleContexts(BotgathererContext.class);
		}
		public BotgathererContext botgatherer(int i) {
			return getRuleContext(BotgathererContext.class,i);
		}
		public List<BotBBContext> botBB() {
			return getRuleContexts(BotBBContext.class);
		}
		public BotBBContext botBB(int i) {
			return getRuleContext(BotBBContext.class,i);
		}
		public List<BotOBContext> botOB() {
			return getRuleContexts(BotOBContext.class);
		}
		public BotOBContext botOB(int i) {
			return getRuleContext(BotOBContext.class,i);
		}
		public List<BotBOContext> botBO() {
			return getRuleContexts(BotBOContext.class);
		}
		public BotBOContext botBO(int i) {
			return getRuleContext(BotBOContext.class,i);
		}
		public List<BotOOContext> botOO() {
			return getRuleContexts(BotOOContext.class);
		}
		public BotOOContext botOO(int i) {
			return getRuleContext(BotOOContext.class,i);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AoCDay10Listener ) ((AoCDay10Listener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AoCDay10Listener ) ((AoCDay10Listener)listener).exitInstructions(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_instructions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(19);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(14);
					botgatherer();
					}
					break;
				case 2:
					{
					setState(15);
					botBB();
					}
					break;
				case 3:
					{
					setState(16);
					botOB();
					}
					break;
				case 4:
					{
					setState(17);
					botBO();
					}
					break;
				case 5:
					{
					setState(18);
					botOO();
					}
					break;
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VALUE || _la==BOT );
			setState(23);
			match(EOF);
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

	public static class BotgathererContext extends ParserRuleContext {
		public DigitsContext value;
		public DigitsContext bot;
		public TerminalNode VALUE() { return getToken(AoCDay10Parser.VALUE, 0); }
		public TerminalNode GOES() { return getToken(AoCDay10Parser.GOES, 0); }
		public TerminalNode TO() { return getToken(AoCDay10Parser.TO, 0); }
		public TerminalNode BOT() { return getToken(AoCDay10Parser.BOT, 0); }
		public List<DigitsContext> digits() {
			return getRuleContexts(DigitsContext.class);
		}
		public DigitsContext digits(int i) {
			return getRuleContext(DigitsContext.class,i);
		}
		public BotgathererContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_botgatherer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AoCDay10Listener ) ((AoCDay10Listener)listener).enterBotgatherer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AoCDay10Listener ) ((AoCDay10Listener)listener).exitBotgatherer(this);
		}
	}

	public final BotgathererContext botgatherer() throws RecognitionException {
		BotgathererContext _localctx = new BotgathererContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_botgatherer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(VALUE);
			setState(26);
			((BotgathererContext)_localctx).value = digits();
			setState(27);
			match(GOES);
			setState(28);
			match(TO);
			setState(29);
			match(BOT);
			setState(30);
			((BotgathererContext)_localctx).bot = digits();
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

	public static class BotBBContext extends ParserRuleContext {
		public DigitsContext bot;
		public DigitsContext botLow;
		public DigitsContext botHigh;
		public List<TerminalNode> BOT() { return getTokens(AoCDay10Parser.BOT); }
		public TerminalNode BOT(int i) {
			return getToken(AoCDay10Parser.BOT, i);
		}
		public TerminalNode GIVES() { return getToken(AoCDay10Parser.GIVES, 0); }
		public TerminalNode LOW() { return getToken(AoCDay10Parser.LOW, 0); }
		public List<TerminalNode> TO() { return getTokens(AoCDay10Parser.TO); }
		public TerminalNode TO(int i) {
			return getToken(AoCDay10Parser.TO, i);
		}
		public TerminalNode AND() { return getToken(AoCDay10Parser.AND, 0); }
		public TerminalNode HIGH() { return getToken(AoCDay10Parser.HIGH, 0); }
		public List<DigitsContext> digits() {
			return getRuleContexts(DigitsContext.class);
		}
		public DigitsContext digits(int i) {
			return getRuleContext(DigitsContext.class,i);
		}
		public BotBBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_botBB; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AoCDay10Listener ) ((AoCDay10Listener)listener).enterBotBB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AoCDay10Listener ) ((AoCDay10Listener)listener).exitBotBB(this);
		}
	}

	public final BotBBContext botBB() throws RecognitionException {
		BotBBContext _localctx = new BotBBContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_botBB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(BOT);
			setState(33);
			((BotBBContext)_localctx).bot = digits();
			setState(34);
			match(GIVES);
			setState(35);
			match(LOW);
			setState(36);
			match(TO);
			setState(37);
			match(BOT);
			setState(38);
			((BotBBContext)_localctx).botLow = digits();
			setState(39);
			match(AND);
			setState(40);
			match(HIGH);
			setState(41);
			match(TO);
			setState(42);
			match(BOT);
			setState(43);
			((BotBBContext)_localctx).botHigh = digits();
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

	public static class BotOBContext extends ParserRuleContext {
		public DigitsContext bot;
		public DigitsContext outputLow;
		public DigitsContext botHigh;
		public List<TerminalNode> BOT() { return getTokens(AoCDay10Parser.BOT); }
		public TerminalNode BOT(int i) {
			return getToken(AoCDay10Parser.BOT, i);
		}
		public TerminalNode GIVES() { return getToken(AoCDay10Parser.GIVES, 0); }
		public TerminalNode LOW() { return getToken(AoCDay10Parser.LOW, 0); }
		public List<TerminalNode> TO() { return getTokens(AoCDay10Parser.TO); }
		public TerminalNode TO(int i) {
			return getToken(AoCDay10Parser.TO, i);
		}
		public TerminalNode OUTPUT() { return getToken(AoCDay10Parser.OUTPUT, 0); }
		public TerminalNode AND() { return getToken(AoCDay10Parser.AND, 0); }
		public TerminalNode HIGH() { return getToken(AoCDay10Parser.HIGH, 0); }
		public List<DigitsContext> digits() {
			return getRuleContexts(DigitsContext.class);
		}
		public DigitsContext digits(int i) {
			return getRuleContext(DigitsContext.class,i);
		}
		public BotOBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_botOB; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AoCDay10Listener ) ((AoCDay10Listener)listener).enterBotOB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AoCDay10Listener ) ((AoCDay10Listener)listener).exitBotOB(this);
		}
	}

	public final BotOBContext botOB() throws RecognitionException {
		BotOBContext _localctx = new BotOBContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_botOB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(BOT);
			setState(46);
			((BotOBContext)_localctx).bot = digits();
			setState(47);
			match(GIVES);
			setState(48);
			match(LOW);
			setState(49);
			match(TO);
			setState(50);
			match(OUTPUT);
			setState(51);
			((BotOBContext)_localctx).outputLow = digits();
			setState(52);
			match(AND);
			setState(53);
			match(HIGH);
			setState(54);
			match(TO);
			setState(55);
			match(BOT);
			setState(56);
			((BotOBContext)_localctx).botHigh = digits();
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

	public static class BotBOContext extends ParserRuleContext {
		public DigitsContext bot;
		public DigitsContext botLow;
		public DigitsContext outputHigh;
		public List<TerminalNode> BOT() { return getTokens(AoCDay10Parser.BOT); }
		public TerminalNode BOT(int i) {
			return getToken(AoCDay10Parser.BOT, i);
		}
		public TerminalNode GIVES() { return getToken(AoCDay10Parser.GIVES, 0); }
		public TerminalNode LOW() { return getToken(AoCDay10Parser.LOW, 0); }
		public List<TerminalNode> TO() { return getTokens(AoCDay10Parser.TO); }
		public TerminalNode TO(int i) {
			return getToken(AoCDay10Parser.TO, i);
		}
		public TerminalNode AND() { return getToken(AoCDay10Parser.AND, 0); }
		public TerminalNode HIGH() { return getToken(AoCDay10Parser.HIGH, 0); }
		public TerminalNode OUTPUT() { return getToken(AoCDay10Parser.OUTPUT, 0); }
		public List<DigitsContext> digits() {
			return getRuleContexts(DigitsContext.class);
		}
		public DigitsContext digits(int i) {
			return getRuleContext(DigitsContext.class,i);
		}
		public BotBOContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_botBO; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AoCDay10Listener ) ((AoCDay10Listener)listener).enterBotBO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AoCDay10Listener ) ((AoCDay10Listener)listener).exitBotBO(this);
		}
	}

	public final BotBOContext botBO() throws RecognitionException {
		BotBOContext _localctx = new BotBOContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_botBO);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(BOT);
			setState(59);
			((BotBOContext)_localctx).bot = digits();
			setState(60);
			match(GIVES);
			setState(61);
			match(LOW);
			setState(62);
			match(TO);
			setState(63);
			match(BOT);
			setState(64);
			((BotBOContext)_localctx).botLow = digits();
			setState(65);
			match(AND);
			setState(66);
			match(HIGH);
			setState(67);
			match(TO);
			setState(68);
			match(OUTPUT);
			setState(69);
			((BotBOContext)_localctx).outputHigh = digits();
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

	public static class BotOOContext extends ParserRuleContext {
		public DigitsContext bot;
		public DigitsContext outputLow;
		public DigitsContext outputHigh;
		public TerminalNode BOT() { return getToken(AoCDay10Parser.BOT, 0); }
		public TerminalNode GIVES() { return getToken(AoCDay10Parser.GIVES, 0); }
		public TerminalNode LOW() { return getToken(AoCDay10Parser.LOW, 0); }
		public List<TerminalNode> TO() { return getTokens(AoCDay10Parser.TO); }
		public TerminalNode TO(int i) {
			return getToken(AoCDay10Parser.TO, i);
		}
		public List<TerminalNode> OUTPUT() { return getTokens(AoCDay10Parser.OUTPUT); }
		public TerminalNode OUTPUT(int i) {
			return getToken(AoCDay10Parser.OUTPUT, i);
		}
		public TerminalNode AND() { return getToken(AoCDay10Parser.AND, 0); }
		public TerminalNode HIGH() { return getToken(AoCDay10Parser.HIGH, 0); }
		public List<DigitsContext> digits() {
			return getRuleContexts(DigitsContext.class);
		}
		public DigitsContext digits(int i) {
			return getRuleContext(DigitsContext.class,i);
		}
		public BotOOContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_botOO; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AoCDay10Listener ) ((AoCDay10Listener)listener).enterBotOO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AoCDay10Listener ) ((AoCDay10Listener)listener).exitBotOO(this);
		}
	}

	public final BotOOContext botOO() throws RecognitionException {
		BotOOContext _localctx = new BotOOContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_botOO);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(BOT);
			setState(72);
			((BotOOContext)_localctx).bot = digits();
			setState(73);
			match(GIVES);
			setState(74);
			match(LOW);
			setState(75);
			match(TO);
			setState(76);
			match(OUTPUT);
			setState(77);
			((BotOOContext)_localctx).outputLow = digits();
			setState(78);
			match(AND);
			setState(79);
			match(HIGH);
			setState(80);
			match(TO);
			setState(81);
			match(OUTPUT);
			setState(82);
			((BotOOContext)_localctx).outputHigh = digits();
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
		public List<TerminalNode> INT() { return getTokens(AoCDay10Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(AoCDay10Parser.INT, i);
		}
		public DigitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AoCDay10Listener ) ((AoCDay10Listener)listener).enterDigits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AoCDay10Listener ) ((AoCDay10Listener)listener).exitDigits(this);
		}
	}

	public final DigitsContext digits() throws RecognitionException {
		DigitsContext _localctx = new DigitsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_digits);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				match(INT);
				}
				}
				setState(87); 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16\\\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\6\2\26"+
		"\n\2\r\2\16\2\27\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\6\bX\n\b\r\b\16"+
		"\bY\3\b\2\2\t\2\4\6\b\n\f\16\2\2Z\2\25\3\2\2\2\4\33\3\2\2\2\6\"\3\2\2"+
		"\2\b/\3\2\2\2\n<\3\2\2\2\fI\3\2\2\2\16W\3\2\2\2\20\26\5\4\3\2\21\26\5"+
		"\6\4\2\22\26\5\b\5\2\23\26\5\n\6\2\24\26\5\f\7\2\25\20\3\2\2\2\25\21\3"+
		"\2\2\2\25\22\3\2\2\2\25\23\3\2\2\2\25\24\3\2\2\2\26\27\3\2\2\2\27\25\3"+
		"\2\2\2\27\30\3\2\2\2\30\31\3\2\2\2\31\32\7\2\2\3\32\3\3\2\2\2\33\34\7"+
		"\3\2\2\34\35\5\16\b\2\35\36\7\6\2\2\36\37\7\13\2\2\37 \7\4\2\2 !\5\16"+
		"\b\2!\5\3\2\2\2\"#\7\4\2\2#$\5\16\b\2$%\7\7\2\2%&\7\t\2\2&\'\7\13\2\2"+
		"\'(\7\4\2\2()\5\16\b\2)*\7\b\2\2*+\7\n\2\2+,\7\13\2\2,-\7\4\2\2-.\5\16"+
		"\b\2.\7\3\2\2\2/\60\7\4\2\2\60\61\5\16\b\2\61\62\7\7\2\2\62\63\7\t\2\2"+
		"\63\64\7\13\2\2\64\65\7\5\2\2\65\66\5\16\b\2\66\67\7\b\2\2\678\7\n\2\2"+
		"89\7\13\2\29:\7\4\2\2:;\5\16\b\2;\t\3\2\2\2<=\7\4\2\2=>\5\16\b\2>?\7\7"+
		"\2\2?@\7\t\2\2@A\7\13\2\2AB\7\4\2\2BC\5\16\b\2CD\7\b\2\2DE\7\n\2\2EF\7"+
		"\13\2\2FG\7\5\2\2GH\5\16\b\2H\13\3\2\2\2IJ\7\4\2\2JK\5\16\b\2KL\7\7\2"+
		"\2LM\7\t\2\2MN\7\13\2\2NO\7\5\2\2OP\5\16\b\2PQ\7\b\2\2QR\7\n\2\2RS\7\13"+
		"\2\2ST\7\5\2\2TU\5\16\b\2U\r\3\2\2\2VX\7\f\2\2WV\3\2\2\2XY\3\2\2\2YW\3"+
		"\2\2\2YZ\3\2\2\2Z\17\3\2\2\2\5\25\27Y";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}