// Generated from AoC.g4 by ANTLR 4.5

package learning.aoc.antlr4;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AoCParser}.
 */
public interface AoCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AoCParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(AoCParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AoCParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(AoCParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AoCParser#rect}.
	 * @param ctx the parse tree
	 */
	void enterRect(AoCParser.RectContext ctx);
	/**
	 * Exit a parse tree produced by {@link AoCParser#rect}.
	 * @param ctx the parse tree
	 */
	void exitRect(AoCParser.RectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AoCParser#rotateCol}.
	 * @param ctx the parse tree
	 */
	void enterRotateCol(AoCParser.RotateColContext ctx);
	/**
	 * Exit a parse tree produced by {@link AoCParser#rotateCol}.
	 * @param ctx the parse tree
	 */
	void exitRotateCol(AoCParser.RotateColContext ctx);
	/**
	 * Enter a parse tree produced by {@link AoCParser#rotateRow}.
	 * @param ctx the parse tree
	 */
	void enterRotateRow(AoCParser.RotateRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link AoCParser#rotateRow}.
	 * @param ctx the parse tree
	 */
	void exitRotateRow(AoCParser.RotateRowContext ctx);
}