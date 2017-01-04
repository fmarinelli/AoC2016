package learning.aoc.day3.second.model;

import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.camel.dataformat.bindy.annotation.FixedLengthRecord;

import java.sql.SQLClientInfoException;
import java.util.concurrent.atomic.AtomicLong;

@FixedLengthRecord(ignoreTrailingChars = true)
public class TriangleWithId {

    public static final AtomicLong SEQ_ID_GENERATOR = new AtomicLong(0);

    private final long id;

    @DataField(pos = 0, length = 5, trim = true)
    private int a;

    @DataField(pos = 1, length = 5, trim = true)
    private int b;

    @DataField(pos = 2, length = 5, trim = true)
    private int c;

    public TriangleWithId() {
        id = SEQ_ID_GENERATOR.getAndIncrement();
    }

    public TriangleWithId(int a, int b, int c) {
        this();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public long getId() {
        return id;
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
        return "TriangleWithId{" +
                "id=" + id +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
