package learning.aoc.antlr4.day10;

import learning.aoc.antlr4.AoCDay10Lexer;
import learning.aoc.antlr4.AoCDay10Parser;
import learning.aoc.day10.first.listeners.MyAoCDay10BaseListener;
import learning.aoc.day10.first.model.BotFactory;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;

public class TestApp {

    @Test
    public void testApp() {
        AtomicInteger expectedCompares = new AtomicInteger(0);
        BotFactory botFactory = new BotFactory();

        botFactory.addCompareCallback((b, l, h) -> {
            if ((l == 2) && (h == 5)) {
                Assert.assertTrue(b.is(2));
                expectedCompares.incrementAndGet();
            }
        });

        String input = "value 5 goes to bot 2\n" +
                "bot 2 gives low to bot 1 and high to bot 0\n" +
                "value 3 goes to bot 1\n" +
                "bot 1 gives low to output 1 and high to bot 0\n" +
                "bot 0 gives low to output 2 and high to output 0\n" +
                "value 2 goes to bot 2";

        AoCDay10Lexer lexer = new AoCDay10Lexer(new ANTLRInputStream(input));
        AoCDay10Parser parser = new AoCDay10Parser(new CommonTokenStream(lexer));

        parser.addParseListener(new MyAoCDay10BaseListener(botFactory));

        parser.instructions().botgatherer().forEach(ctx -> {
            int bot = Integer.valueOf(ctx.bot.getText());
            int value = Integer.valueOf(ctx.value.getText());
            botFactory.give(bot, value);
        });

        Assert.assertTrue("Output bin 0 should contain 5", botFactory.getOutputBin(0).contains(5));
        Assert.assertTrue("Output bin 1 should contain 2", botFactory.getOutputBin(1).contains(2));
        Assert.assertTrue("Output bin 2 should contain 3", botFactory.getOutputBin(2).contains(3));

        Assert.assertEquals(1, expectedCompares.get());
    }

}
