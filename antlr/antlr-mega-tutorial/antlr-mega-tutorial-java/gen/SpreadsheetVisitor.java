// Generated from /Users/jumar/workspace/antlr/antlr-mega-tutorial/antlr-mega-tutorial-java/src/main/antlr4/Spreadsheet.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SpreadsheetParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SpreadsheetVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code numericAtomExp}
	 * labeled alternative in {@link SpreadsheetParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericAtomExp(SpreadsheetParser.NumericAtomExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powerExp}
	 * labeled alternative in {@link SpreadsheetParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExp(SpreadsheetParser.PowerExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivExp}
	 * labeled alternative in {@link SpreadsheetParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExp(SpreadsheetParser.MulDivExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesisExp}
	 * labeled alternative in {@link SpreadsheetParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExp(SpreadsheetParser.ParenthesisExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtomExp}
	 * labeled alternative in {@link SpreadsheetParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtomExp(SpreadsheetParser.IdAtomExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubExp}
	 * labeled alternative in {@link SpreadsheetParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExp(SpreadsheetParser.AddSubExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionExp}
	 * labeled alternative in {@link SpreadsheetParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExp(SpreadsheetParser.FunctionExpContext ctx);
}