package learning.aoc.day9.first;

import learning.aoc.antlr4.AoCDay9Lexer;
import learning.aoc.antlr4.AoCDay9Parser;
import learning.aoc.day9.Decoder;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.InputStream;

public class App {

    public static void main(String[] args) throws Exception {
        InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream("first.input");

        String value = new Decoder(input).decode();

        System.out.println(value);
        System.out.println("Decompressed length is: [" + value.length() + "]");
    }

}
