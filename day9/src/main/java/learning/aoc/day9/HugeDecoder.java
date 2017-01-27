package learning.aoc.day9;

import learning.aoc.antlr4.AoCDay9Lexer;
import learning.aoc.antlr4.AoCDay9Parser;
import learning.aoc.day9.second.EncryptedData;
import learning.aoc.day9.second.EncryptedText;
import learning.aoc.day9.second.PlainText;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.Interval;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HugeDecoder {

    private List<EncryptedData> encryptedDatas = new ArrayList<>();

    public HugeDecoder(CharStream stream) {
        AoCDay9Lexer lexer = new AoCDay9Lexer(stream);
        AoCDay9Parser parser = new AoCDay9Parser(new CommonTokenStream(lexer));
        while (!parser.isMatchedEOF()) {
            AoCDay9Parser.ValueContext context = parser.value();
            if (!(context.premarker() == null || context.premarker().getText().isEmpty())) {
                encryptedDatas.add(new PlainText(context.premarker().getText()));
            }
            if (context.marker() != null) {
                int len = Integer.valueOf(context.marker().len.getText());
                int copies = Integer.valueOf(context.marker().copies.getText());
                String value = capture(parser, len);
                encryptedDatas.add(new EncryptedText(copies, new HugeDecoder(value)));
            }
        }
    }

    public HugeDecoder(String stream) {
        this(new ANTLRInputStream(stream));
    }

    public HugeDecoder(InputStream input) throws IOException {
        this(new ANTLRInputStream(input));
    }

    public String decode() {
        return encryptedDatas.stream().map(EncryptedData::decrypt).collect(Collectors.joining());
    }

    public long decodedLength() {
        return encryptedDatas.stream().map(EncryptedData::decryptedLength).reduce(0L, (a, b) -> a + b);
    }

    private String capture(AoCDay9Parser parser, int len) {
        return Stream
                .generate(() -> {
                    AoCDay9Parser.SingleContext single = parser.single();
                    String s = parser.isMatchedEOF() ? null : single.getText();
                    return s;
                })
                .limit(len)
                .filter(Objects::nonNull)
                .collect(Collectors.joining());
    }
}
