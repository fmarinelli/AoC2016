package learning.aoc.antlr4;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Assert;
import org.junit.Test;

public class TestParser {

    @Test
    public void testManualParser() {
        AoCDay9Lexer lexer = new AoCDay9Lexer(new ANTLRInputStream("(6x6)AFPLBX(2x3)ZE"));
        AoCDay9Parser parser = new AoCDay9Parser(new CommonTokenStream(lexer));

        AoCDay9Parser.ValueContext value = parser.value();
        Assert.assertEquals("6", value.marker().len.getText());
        Assert.assertEquals("6", value.marker().copies.getText());

        Assert.assertEquals("A", parser.single().getText());
        Assert.assertEquals("F", parser.single().getText());
        Assert.assertEquals("P", parser.single().getText());

        value = parser.value();
        Assert.assertEquals("LBX", value.premarker().getText());
    }
}
