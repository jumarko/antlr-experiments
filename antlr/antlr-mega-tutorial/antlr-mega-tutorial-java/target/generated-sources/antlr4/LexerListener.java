// Generated from Lexer.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LexerParser}.
 */
public interface LexerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LexerParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(LexerParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(LexerParser.OperationContext ctx);
}