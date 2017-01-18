package learning.aoc.day8.second;

import learning.aoc.antlr4.AoCLexer;
import learning.aoc.antlr4.AoCParser;
import learning.aoc.day8.LEDMonitor;
import learning.aoc.day8.LEDMonitorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.InputStream;

public class App {

    public static void main(String[] args) throws Exception {
        InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream("second.input");

        AoCLexer lexer = new AoCLexer(new ANTLRInputStream(input));
        AoCParser parser = new AoCParser(new CommonTokenStream(lexer));

        LEDMonitor ledMonitor = new LEDMonitor();

        parser.addParseListener(new LEDMonitorListener(ledMonitor));

        parser.instructions();

        System.out.println(ledMonitor.print());
    }

}
