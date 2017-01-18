package learning.aoc.day8.first;

import learning.aoc.antlr4.AoCLexer;
import learning.aoc.antlr4.AoCParser;
import learning.aoc.day8.LEDMonitor;
import learning.aoc.day8.LEDMonitorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.InputStream;

public class App {

    public static void main(String[] args) throws Exception {
        LEDMonitor ledMonitor = new LEDMonitor();
        InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream("first.input");

        AoCLexer lexer = new AoCLexer(new ANTLRInputStream(input));
        AoCParser parser = new AoCParser(new CommonTokenStream(lexer));
        parser.addParseListener(new LEDMonitorListener(ledMonitor));

        parser.instructions();

        System.out.println("Led lit on monitor: [" + ledMonitor.getPixelsLit() + "]");
    }

}
