// Generated from AoC.g4 by ANTLR 4.5

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
public class AoCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, X=6, INT=7, RECT=8, ROTATE=9, 
		WS=10, NL=11;
	public static final int
		RULE_instructions = 0, RULE_rect = 1, RULE_rotateCol = 2, RULE_rotateRow = 3;
	public static final String[] ruleNames = {
		"instructions", "rect", "rotateCol", "rotateRow"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'column'", "'x='", "'by'", "'row'", "'y='", "'x'", null, "'rect'", 
		"'rotate'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "X", "INT", "RECT", "ROTATE", "WS", 
		"NL"
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
	public String getGrammarFileName() { return "AoC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AoCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InstructionsContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(AoCParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AoCParser.NL, i);
		}
		public List<TerminalNode> EOF() { return getTokens(AoCParser.EOF); }
		public TerminalNode EOF(int i) {
			return getToken(AoCParser.EOF, i);
		}
		public List<RectContext> rect() {
			return getRuleContexts(RectContext.class);
		}
		public RectContext rect(int i) {
			return getRuleContext(RectContext.class,i);
		}
		public List<RotateRowContext> rotateRow() {
			return getRuleContexts(RotateRowContext.class);
		}
		public RotateRowContext rotateRow(int i) {
			return getRuleContext(RotateRowContext.class,i);
		}
		public List<RotateColContext> rotateCol() {
			return getRuleContexts(RotateColContext.class);
		}
		public RotateColContext rotateCol(int i) {
			return getRuleContext(RotateColContext.class,i);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AoCListener ) ((AoCListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AoCListener ) ((AoCListener)listener).exitInstructions(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_instructions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RECT || _la==ROTATE) {
				{
				{
				setState(11);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(8);
					rect();
					}
					break;
				case 2:
					{
					setState(9);
					rotateRow();
					}
					break;
				case 3:
					{
					setState(10);
					rotateCol();
					}
					break;
				}
				setState(13);
				_la = _input.LA(1);
				if ( !(_la==EOF || _la==NL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(19);
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

	public static class RectContext extends ParserRuleContext {
		public Token x;
		public Token y;
		public TerminalNode RECT() { return getToken(AoCParser.RECT, 0); }
		public TerminalNode WS() { return getToken(AoCParser.WS, 0); }
		public TerminalNode X() { return getToken(AoCParser.X, 0); }
		public List<TerminalNode> INT() { return getTokens(AoCParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(AoCParser.INT, i);
		}
		public RectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AoCListener ) ((AoCListener)listener).enterRect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AoCListener ) ((AoCListener)listener).exitRect(this);
		}
	}

	public final RectContext rect() throws RecognitionException {
		RectContext _localctx = new RectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_rect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(RECT);
			setState(21);
			match(WS);
			setState(22);
			((RectContext)_localctx).x = match(INT);
			setState(23);
			match(X);
			setState(24);
			((RectContext)_localctx).y = match(INT);
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

	public static class RotateColContext extends ParserRuleContext {
		public Token column;
		public Token value;
		public TerminalNode ROTATE() { return getToken(AoCParser.ROTATE, 0); }
		public List<TerminalNode> WS() { return getTokens(AoCParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AoCParser.WS, i);
		}
		public List<TerminalNode> INT() { return getTokens(AoCParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(AoCParser.INT, i);
		}
		public RotateColContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotateCol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AoCListener ) ((AoCListener)listener).enterRotateCol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AoCListener ) ((AoCListener)listener).exitRotateCol(this);
		}
	}

	public final RotateColContext rotateCol() throws RecognitionException {
		RotateColContext _localctx = new RotateColContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_rotateCol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(ROTATE);
			setState(27);
			match(WS);
			setState(28);
			match(T__0);
			setState(29);
			match(WS);
			setState(30);
			match(T__1);
			setState(31);
			((RotateColContext)_localctx).column = match(INT);
			setState(32);
			match(WS);
			setState(33);
			match(T__2);
			setState(34);
			match(WS);
			setState(35);
			((RotateColContext)_localctx).value = match(INT);
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

	public static class RotateRowContext extends ParserRuleContext {
		public Token row;
		public Token value;
		public TerminalNode ROTATE() { return getToken(AoCParser.ROTATE, 0); }
		public List<TerminalNode> WS() { return getTokens(AoCParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AoCParser.WS, i);
		}
		public List<TerminalNode> INT() { return getTokens(AoCParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(AoCParser.INT, i);
		}
		public RotateRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotateRow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AoCListener ) ((AoCListener)listener).enterRotateRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AoCListener ) ((AoCListener)listener).exitRotateRow(this);
		}
	}

	public final RotateRowContext rotateRow() throws RecognitionException {
		RotateRowContext _localctx = new RotateRowContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rotateRow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(ROTATE);
			setState(38);
			match(WS);
			setState(39);
			match(T__3);
			setState(40);
			match(WS);
			setState(41);
			match(T__4);
			setState(42);
			((RotateRowContext)_localctx).row = match(INT);
			setState(43);
			match(WS);
			setState(44);
			match(T__2);
			setState(45);
			match(WS);
			setState(46);
			((RotateRowContext)_localctx).value = match(INT);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\r\63\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\5\2\16\n\2\3\2\3\2\7\2\22\n\2\f\2\16"+
		"\2\25\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\2\2\6\2\4\6\b"+
		"\2\3\3\3\r\r\61\2\23\3\2\2\2\4\26\3\2\2\2\6\34\3\2\2\2\b\'\3\2\2\2\n\16"+
		"\5\4\3\2\13\16\5\b\5\2\f\16\5\6\4\2\r\n\3\2\2\2\r\13\3\2\2\2\r\f\3\2\2"+
		"\2\16\17\3\2\2\2\17\20\t\2\2\2\20\22\3\2\2\2\21\r\3\2\2\2\22\25\3\2\2"+
		"\2\23\21\3\2\2\2\23\24\3\2\2\2\24\3\3\2\2\2\25\23\3\2\2\2\26\27\7\n\2"+
		"\2\27\30\7\f\2\2\30\31\7\t\2\2\31\32\7\b\2\2\32\33\7\t\2\2\33\5\3\2\2"+
		"\2\34\35\7\13\2\2\35\36\7\f\2\2\36\37\7\3\2\2\37 \7\f\2\2 !\7\4\2\2!\""+
		"\7\t\2\2\"#\7\f\2\2#$\7\5\2\2$%\7\f\2\2%&\7\t\2\2&\7\3\2\2\2\'(\7\13\2"+
		"\2()\7\f\2\2)*\7\6\2\2*+\7\f\2\2+,\7\7\2\2,-\7\t\2\2-.\7\f\2\2./\7\5\2"+
		"\2/\60\7\f\2\2\60\61\7\t\2\2\61\t\3\2\2\2\4\r\23";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}