package learning.aoc.day3.first.model;

import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.camel.dataformat.bindy.annotation.FixedLengthRecord;

@FixedLengthRecord(ignoreTrailingChars = true)
public class Triangle {

    @DataField(pos = 0, length = 5, trim = true)
    private int a;

    @DataField(pos = 1, length = 5, trim = true)
    private int b;

    @DataField(pos = 2, length = 5, trim = true)
    private int c;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
