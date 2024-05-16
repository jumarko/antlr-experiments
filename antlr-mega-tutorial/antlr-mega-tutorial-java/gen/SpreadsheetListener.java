// Generated from /Users/jumar/workspace/antlr/antlr-mega-tutorial/antlr-mega-tutorial-java/src/main/antlr4/Spreadsheet.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SpreadsheetParser}.
 */
public interface SpreadsheetListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code numericAtomExp}
	 * labeled alternative in {@link SpreadsheetParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumericAtomExp(SpreadsheetParser.NumericAtomExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericAtomExp}
	 * labeled alternative in {@link SpreadsheetParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumericAtomExp(SpreadsheetParser.NumericAtomExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powerExp}
	 * labeled alternative in {@link SpreadsheetParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExp(SpreadsheetParser.PowerExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powerExp}
	 * labeled alternative in {@link SpreadsheetParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExp(SpreadsheetParser.PowerExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivExp}
	 * labeled alternative in {@link SpreadsheetParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExp(SpreadsheetParser.MulDivExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivExp}
	 * labeled alternative in {@link SpreadsheetParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExp(SpreadsheetParser.MulDivExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisExp}
	 * labeled alternative in {@link SpreadsheetParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExp(SpreadsheetParser.ParenthesisExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisExp}
	 * labeled alternative in {@link SpreadsheetParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExp(SpreadsheetParser.ParenthesisExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtomExp}
	 * labeled alternative in {@link SpreadsheetParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdAtomExp(SpreadsheetParser.IdAtomExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtomExp}
	 * labeled alternative in {@link SpreadsheetParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdAtomExp(SpreadsheetParser.IdAtomExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExp}
	 * labeled alternative in {@link SpreadsheetParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExp(SpreadsheetParser.AddSubExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExp}
	 * labeled alternative in {@link SpreadsheetParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExp(SpreadsheetParser.AddSubExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionExp}
	 * labeled alternative in {@link SpreadsheetParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExp(SpreadsheetParser.FunctionExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionExp}
	 * labeled alternative in {@link SpreadsheetParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExp(SpreadsheetParser.FunctionExpContext ctx);
}