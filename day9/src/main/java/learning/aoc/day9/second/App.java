package learning.aoc.day9.second;

import learning.aoc.day9.HugeDecoder;

import java.io.InputStream;

public class App {

    public static void main(String[] args) throws Exception {
        InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream("second.input");
        long value = new HugeDecoder(input).decodedLength();
        System.out.println("Decompressed length is: [" + value + "]");
    }

}
