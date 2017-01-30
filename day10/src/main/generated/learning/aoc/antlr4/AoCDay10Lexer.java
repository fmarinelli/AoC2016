// Generated from AoCDay10.g4 by ANTLR 4.5

package learning.aoc.antlr4;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AoCDay10Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VALUE=1, BOT=2, OUTPUT=3, GOES=4, GIVES=5, AND=6, LOW=7, HIGH=8, TO=9, 
		INT=10, WS=11, NL=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"VALUE", "BOT", "OUTPUT", "GOES", "GIVES", "AND", "LOW", "HIGH", "TO", 
		"INT", "WS", "NL"
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


	public AoCDay10Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AoCDay10.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16W\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f"+
		"\6\fK\n\f\r\f\16\fL\3\f\3\f\3\r\5\rR\n\r\3\r\3\r\3\r\3\r\2\2\16\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\3\4\2\13\13\""+
		"\"X\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3"+
		"\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2"+
		"\2\2\31\3\2\2\2\3\33\3\2\2\2\5!\3\2\2\2\7%\3\2\2\2\t,\3\2\2\2\13\61\3"+
		"\2\2\2\r\67\3\2\2\2\17;\3\2\2\2\21?\3\2\2\2\23D\3\2\2\2\25G\3\2\2\2\27"+
		"J\3\2\2\2\31Q\3\2\2\2\33\34\7x\2\2\34\35\7c\2\2\35\36\7n\2\2\36\37\7w"+
		"\2\2\37 \7g\2\2 \4\3\2\2\2!\"\7d\2\2\"#\7q\2\2#$\7v\2\2$\6\3\2\2\2%&\7"+
		"q\2\2&\'\7w\2\2\'(\7v\2\2()\7r\2\2)*\7w\2\2*+\7v\2\2+\b\3\2\2\2,-\7i\2"+
		"\2-.\7q\2\2./\7g\2\2/\60\7u\2\2\60\n\3\2\2\2\61\62\7i\2\2\62\63\7k\2\2"+
		"\63\64\7x\2\2\64\65\7g\2\2\65\66\7u\2\2\66\f\3\2\2\2\678\7c\2\289\7p\2"+
		"\29:\7f\2\2:\16\3\2\2\2;<\7n\2\2<=\7q\2\2=>\7y\2\2>\20\3\2\2\2?@\7j\2"+
		"\2@A\7k\2\2AB\7i\2\2BC\7j\2\2C\22\3\2\2\2DE\7v\2\2EF\7q\2\2F\24\3\2\2"+
		"\2GH\4\62;\2H\26\3\2\2\2IK\t\2\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2"+
		"\2\2MN\3\2\2\2NO\b\f\2\2O\30\3\2\2\2PR\7\17\2\2QP\3\2\2\2QR\3\2\2\2RS"+
		"\3\2\2\2ST\7\f\2\2TU\3\2\2\2UV\b\r\2\2V\32\3\2\2\2\5\2LQ\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}