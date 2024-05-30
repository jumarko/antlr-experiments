// Generated from Chat.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ChatLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, SAYS=9, 
		SHOUTS=10, LINKTEXT=11, WORD=12, WHITESPACE=13, NEWLINE=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "A", "S", 
		"Y", "H", "O", "U", "T", "LOWERCASE", "UPPERCASE", "SAYS", "SHOUTS", "LINKTEXT", 
		"WORD", "WHITESPACE", "NEWLINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'-'", "')'", "'('", "'['", "']'", "'/'", "'@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "SAYS", "SHOUTS", 
		"LINKTEXT", "WORD", "WHITESPACE", "NEWLINE"
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


	public ChatLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Chat.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return LINKTEXT_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean LINKTEXT_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return _input.LA(-1) == '[' || _input.LA(-1) == '(';
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20}\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\6\21Q\n\21\r\21"+
		"\16\21R\3\22\6\22V\n\22\r\22\16\22W\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\6\25h\n\25\r\25\16\25i\3\26\3\26\3"+
		"\26\6\26o\n\26\r\26\16\26p\3\27\3\27\3\30\5\30v\n\30\3\30\3\30\6\30z\n"+
		"\30\r\30\16\30{\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\2\25\2\27"+
		"\2\31\2\33\2\35\2\37\2!\2#\2%\13\'\f)\r+\16-\17/\20\3\2\r\4\2CCcc\4\2"+
		"UUuu\4\2[[{{\4\2JJjj\4\2QQqq\4\2WWww\4\2VVvv\3\2c|\3\2C\\\4\2++__\4\2"+
		"\13\13\"\"\2|\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7\65"+
		"\3\2\2\2\t\67\3\2\2\2\139\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21?\3\2\2\2\23"+
		"A\3\2\2\2\25C\3\2\2\2\27E\3\2\2\2\31G\3\2\2\2\33I\3\2\2\2\35K\3\2\2\2"+
		"\37M\3\2\2\2!P\3\2\2\2#U\3\2\2\2%Y\3\2\2\2\'^\3\2\2\2)e\3\2\2\2+n\3\2"+
		"\2\2-r\3\2\2\2/y\3\2\2\2\61\62\7<\2\2\62\4\3\2\2\2\63\64\7/\2\2\64\6\3"+
		"\2\2\2\65\66\7+\2\2\66\b\3\2\2\2\678\7*\2\28\n\3\2\2\29:\7]\2\2:\f\3\2"+
		"\2\2;<\7_\2\2<\16\3\2\2\2=>\7\61\2\2>\20\3\2\2\2?@\7B\2\2@\22\3\2\2\2"+
		"AB\t\2\2\2B\24\3\2\2\2CD\t\3\2\2D\26\3\2\2\2EF\t\4\2\2F\30\3\2\2\2GH\t"+
		"\5\2\2H\32\3\2\2\2IJ\t\6\2\2J\34\3\2\2\2KL\t\7\2\2L\36\3\2\2\2MN\t\b\2"+
		"\2N \3\2\2\2OQ\t\t\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\"\3\2"+
		"\2\2TV\t\n\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X$\3\2\2\2YZ\5\25"+
		"\13\2Z[\5\23\n\2[\\\5\27\f\2\\]\5\25\13\2]&\3\2\2\2^_\5\25\13\2_`\5\31"+
		"\r\2`a\5\33\16\2ab\5\35\17\2bc\5\37\20\2cd\5\25\13\2d(\3\2\2\2eg\6\25"+
		"\2\2fh\n\13\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j*\3\2\2\2ko\5"+
		"!\21\2lo\5#\22\2mo\7a\2\2nk\3\2\2\2nl\3\2\2\2nm\3\2\2\2op\3\2\2\2pn\3"+
		"\2\2\2pq\3\2\2\2q,\3\2\2\2rs\t\f\2\2s.\3\2\2\2tv\7\17\2\2ut\3\2\2\2uv"+
		"\3\2\2\2vw\3\2\2\2wz\7\f\2\2xz\7\17\2\2yu\3\2\2\2yx\3\2\2\2z{\3\2\2\2"+
		"{y\3\2\2\2{|\3\2\2\2|\60\3\2\2\2\13\2RWinpuy{\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}