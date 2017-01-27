// Generated from AoCDay9.g4 by ANTLR 4.5

package learning.aoc.antlr4;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AoCDay9Parser}.
 */
public interface AoCDay9Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AoCDay9Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(AoCDay9Parser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AoCDay9Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(AoCDay9Parser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AoCDay9Parser#marker}.
	 * @param ctx the parse tree
	 */
	void enterMarker(AoCDay9Parser.MarkerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AoCDay9Parser#marker}.
	 * @param ctx the parse tree
	 */
	void exitMarker(AoCDay9Parser.MarkerContext ctx);
	/**
	 * Enter a parse tree produced by {@link AoCDay9Parser#premarker}.
	 * @param ctx the parse tree
	 */
	void enterPremarker(AoCDay9Parser.PremarkerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AoCDay9Parser#premarker}.
	 * @param ctx the parse tree
	 */
	void exitPremarker(AoCDay9Parser.PremarkerContext ctx);
	/**
	 * Enter a parse tree produced by {@link AoCDay9Parser#single}.
	 * @param ctx the parse tree
	 */
	void enterSingle(AoCDay9Parser.SingleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AoCDay9Parser#single}.
	 * @param ctx the parse tree
	 */
	void exitSingle(AoCDay9Parser.SingleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AoCDay9Parser#digits}.
	 * @param ctx the parse tree
	 */
	void enterDigits(AoCDay9Parser.DigitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AoCDay9Parser#digits}.
	 * @param ctx the parse tree
	 */
	void exitDigits(AoCDay9Parser.DigitsContext ctx);
}