package learning.aoc.day10.first;


import learning.aoc.antlr4.AoCDay10Lexer;
import learning.aoc.antlr4.AoCDay10Parser;
import learning.aoc.day10.first.listeners.MyAoCDay10BaseListener;
import learning.aoc.day10.first.model.BotFactory;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.InputStream;

public class App {

    public static void main(String[] args) throws Exception {
        BotFactory botFactory = new BotFactory();

        InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream("first.input");

        AoCDay10Lexer lexer = new AoCDay10Lexer(new ANTLRInputStream(input));
        AoCDay10Parser parser = new AoCDay10Parser(new CommonTokenStream(lexer));

        parser.addParseListener(new MyAoCDay10BaseListener(botFactory));

        botFactory.addCompareCallback((b, l, h) -> {
            if ((l == 17) && (h == 61)) {
                System.out.println("Bot comparing 17 and 61 is [" + b + "]");
            }
        });

        parser.instructions().botgatherer().forEach(ctx -> {
            int bot = Integer.valueOf(ctx.bot.getText());
            int value = Integer.valueOf(ctx.value.getText());
            botFactory.give(bot, value);
        });
    }

}
