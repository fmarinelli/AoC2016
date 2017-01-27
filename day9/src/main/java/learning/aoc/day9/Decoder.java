package learning.aoc.day9;

import learning.aoc.antlr4.AoCDay9Lexer;
import learning.aoc.antlr4.AoCDay9Parser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.io.InputStream;

public class Decoder {

    private CharStream stream;

    public Decoder(String stream) {
        this.stream = new ANTLRInputStream(stream);
    }

    public Decoder(InputStream input) throws IOException {
        this.stream = new ANTLRInputStream(input);
    }

    public String decode() {
        return decode(stream);
    }

    protected String decode(CharStream stream) {
        AoCDay9Lexer lexer = new AoCDay9Lexer(stream);
        AoCDay9Parser parser = new AoCDay9Parser(new CommonTokenStream(lexer));
        return decode(parser);
    }

    protected String decode(AoCDay9Parser parser) {
        StringBuilder sb = new StringBuilder();
        while (!parser.isMatchedEOF()) {
            AoCDay9Parser.ValueContext valueContext = parser.value();
            sb.append(valueContext.premarker().getText());
            if (valueContext.marker() != null) {
                int len = Integer.valueOf(valueContext.marker().len.getText());
                int copies = Integer.valueOf(valueContext.marker().copies.getText());
                StringBuilder segment = new StringBuilder();
                for (; len > segment.length(); ) {
                    segment.append(parser.single().getText());
                }
                String value = segment.toString();
                for (; copies > 0; copies--) {
                    sb.append(value);
                }
            }
        }
        return sb.toString();
    }

}
