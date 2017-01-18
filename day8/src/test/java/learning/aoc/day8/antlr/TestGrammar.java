package learning.aoc.day8.antlr;

import learning.aoc.antlr4.AoCBaseListener;
import learning.aoc.antlr4.AoCLexer;
import learning.aoc.antlr4.AoCParser;
import org.antlr.v4.runtime.*;
import org.junit.Assert;
import org.junit.Test;

public class TestGrammar {

    @Test
    public void testGrammar() throws Exception {
        String expected = "rect 1x1\n" +
                "rotate row y=0 by 20\n" +
                "rotate column x=0 by 20\n";

        AoCLexer l = new AoCLexer(new ANTLRInputStream(expected));
        AoCParser p = new AoCParser(new CommonTokenStream(l));

        p.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                throw new IllegalStateException("failed to parse at line " + line + " due to " + msg, e);
            }
        });

        p.addParseListener(new AoCBaseListener() {
            @Override
            public void exitRect(AoCParser.RectContext ctx) {
                Assert.assertEquals("1", ctx.x.getText());
                Assert.assertEquals("1", ctx.y.getText());
            }

            @Override
            public void exitRotateRow(AoCParser.RotateRowContext ctx) {
                Assert.assertEquals("0", ctx.row.getText());
                Assert.assertEquals("20", ctx.value.getText());
            }

            @Override
            public void exitRotateCol(AoCParser.RotateColContext ctx) {
                Assert.assertEquals("0", ctx.column.getText());
                Assert.assertEquals("20", ctx.value.getText());
            }
        });

        p.instructions();
    }
}
