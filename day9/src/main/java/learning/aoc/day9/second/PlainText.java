package learning.aoc.day9.second;

public class PlainText implements EncryptedData {

    private final String text;

    public PlainText(String text) {
        this.text = text;
    }

    @Override
    public String decrypt() {
        return text;
    }

    @Override
    public long decryptedLength() {
        return text.length();
    }
}
