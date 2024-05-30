// Generated from Csv.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CsvParser}.
 */
public interface CsvListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CsvParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(CsvParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(CsvParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(CsvParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(CsvParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(CsvParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(CsvParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(CsvParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(CsvParser.FieldContext ctx);
}