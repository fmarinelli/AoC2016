package learning.aoc.day9.second;

import learning.aoc.day9.HugeDecoder;
import org.junit.Assert;
import org.junit.Test;

public class TestApp {

    @Test
    public void testSimpleValue() throws Exception {
        String value = new HugeDecoder("(3x3)XYZ").decode();
        Assert.assertEquals("XYZXYZXYZ", value);
    }

    @Test
    public void testOneMoreStep() throws Exception {
        String value = new HugeDecoder("(6x3)(1x3)XYZ").decode();
        Assert.assertEquals("XXXXXXXXXYZ", value);
    }

    @Test
    public void testComplex() throws Exception {
        String value = new HugeDecoder("X(8x2)(3x3)ABCY").decode();
        Assert.assertEquals("XABCABCABCABCABCABCY", value);

        value = new HugeDecoder("(25x3)(3x3)ABC(2x3)XY(5x2)PQRSTX(18x9)(3x2)TWO(5x7)SEVEN").decode();
        Assert.assertEquals(445, value.length());

        value = new HugeDecoder("(27x12)(20x12)(13x14)(7x10)(1x12)A").decode();
        Assert.assertEquals(241920, value.length());

        value = new HugeDecoder("(27x12)(20x12)(13x14)(7x10)(1x12)AB").decode();
        Assert.assertEquals(241921, value.length());
    }

    @Test
    public void testComplexLength() throws Exception {
        long value = new HugeDecoder("X(8x2)(3x3)ABCY").decodedLength();
        Assert.assertEquals(20, value);

        value = new HugeDecoder("(25x3)(3x3)ABC(2x3)XY(5x2)PQRSTX(18x9)(3x2)TWO(5x7)SEVEN").decodedLength();
        Assert.assertEquals(445, value);

        value = new HugeDecoder("(27x12)(20x12)(13x14)(7x10)(1x12)A").decodedLength();
        Assert.assertEquals(241920, value);

        value = new HugeDecoder("(27x12)(20x12)(13x14)(7x10)(1x12)AB").decodedLength();
        Assert.assertEquals(241921, value);
    }

}
