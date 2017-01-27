package learning.aoc.day9.second;

import learning.aoc.day9.HugeDecoder;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EncryptedText implements EncryptedData {

    private final int copies;
    private final HugeDecoder decoder;

    public EncryptedText(int copies, HugeDecoder decoder) {
        this.copies = copies;
        this.decoder = decoder;
    }

    @Override
    public String decrypt() {
        String decoded = decoder.decode();
        return Stream.generate(() -> decoded).limit(copies).collect(Collectors.joining());
    }

    @Override
    public long decryptedLength() {
        return decoder.decodedLength() * copies;
    }
}
