package learning.aoc.antlr4;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Assert;
import org.junit.Test;

public class TestParser {

    @Test
    public void testManualParser() {
        String input = "value 5 goes to bot 2\n" +
                "bot 2 gives low to bot 1 and high to bot 0\n" +
                "value 3 goes to bot 1\n" +
                "bot 1 gives low to output 1 and high to bot 0\n" +
                "bot 0 gives low to output 22 and high to output 0\n" +
                "value 21 goes to bot 2";


        AoCDay10Lexer lexer = new AoCDay10Lexer(new ANTLRInputStream(input));
        AoCDay10Parser parser = new AoCDay10Parser(new CommonTokenStream(lexer));

        AoCDay10Parser.InstructionsContext instructions = parser.instructions();

        Assert.assertEquals(3, instructions.botgatherer().size());
        Assert.assertEquals(1, instructions.botBB().size());
        Assert.assertEquals(1, instructions.botOB().size());
        Assert.assertEquals(1, instructions.botOO().size());

        Assert.assertEquals("5", instructions.botgatherer(0).value.getText());
        Assert.assertEquals("2", instructions.botgatherer(0).bot.getText());
        Assert.assertEquals("3", instructions.botgatherer(1).value.getText());
        Assert.assertEquals("1", instructions.botgatherer(1).bot.getText());
        Assert.assertEquals("21", instructions.botgatherer(2).value.getText());
        Assert.assertEquals("2", instructions.botgatherer(2).bot.getText());

        Assert.assertEquals("2", instructions.botBB(0).bot.getText());
        Assert.assertEquals("1", instructions.botBB(0).botLow.getText());
        Assert.assertEquals("0", instructions.botBB(0).botHigh.getText());

        Assert.assertEquals("1", instructions.botOB(0).bot.getText());
        Assert.assertEquals("1", instructions.botOB(0).outputLow.getText());
        Assert.assertEquals("0", instructions.botOB(0).botHigh.getText());

        Assert.assertEquals("0", instructions.botOO(0).bot.getText());
        Assert.assertEquals("22", instructions.botOO(0).outputLow.getText());
        Assert.assertEquals("0", instructions.botOO(0).outputHigh.getText());
    }
}
