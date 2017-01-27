package learning.aoc.day9.first;

import learning.aoc.day9.Decoder;
import org.junit.Assert;
import org.junit.Test;

public class TestApp {

    @Test
    public void testSimpleValue() throws Exception {
        String value = new Decoder("(6x2)AFPLBX(2x3)ZE").decode();
        Assert.assertEquals("AFPLBXAFPLBXZEZEZE", value);
    }

    @Test
    public void testMultiDigitValue() throws Exception {
        String value = new Decoder("(13x2)AFPLBX(2x3)ZE").decode();
        Assert.assertEquals("AFPLBX(2x3)ZEAFPLBX(2x3)ZE", value);
    }

    @Test
    public void testAdvent() throws Exception {
        String value = new Decoder("ADVENT").decode();
        Assert.assertEquals("ADVENT", value);
        Assert.assertEquals(6, value.length());
    }

    @Test
    public void testAMarkerBC() throws Exception {
        String value = new Decoder("A(1x5)BC").decode();
        Assert.assertEquals("ABBBBBC", value);
        Assert.assertEquals(7, value.length());
    }

    @Test
    public void testMarkerYXZ() throws Exception {
        String value = new Decoder("(3x3)XYZ").decode();
        Assert.assertEquals("XYZXYZXYZ", value);
        Assert.assertEquals(9, value.length());
    }

    @Test
    public void testComplexValue() throws Exception {
        String value = new Decoder("A(2x2)BCD(2x2)EFG").decode();
        Assert.assertEquals("ABCBCDEFEFG", value);
        Assert.assertEquals(11, value.length());
    }

    @Test
    public void testMultiMarker() throws Exception {
        String value = new Decoder("(6x1)(1x3)A").decode();
        Assert.assertEquals("(1x3)A", value);
        Assert.assertEquals(6, value.length());
    }

    @Test
    public void testComplete() throws Exception {
        String value = new Decoder("X(8x2)(3x3)ABCY").decode();
        Assert.assertEquals("X(3x3)ABC(3x3)ABCY", value);
        Assert.assertEquals(18, value.length());
    }


    @Test
    public void testRealInput() {
        String expected = "" +
                "AFPLBX" +
                "AFPLBX" +
                "AFPLBX" +
                "AFPLBX" +
                "AFPLBX" +
                "AFPLBX" +
                "ZE" +
                "ZE" +
                "ZE" +
                "(4x7)ZGQO(2x4)NJ(1x8)M(24x11)(18x7)HMLOASMJNGZHMCEVEX" +
                "(4x7)ZGQO(2x4)NJ(1x8)M(24x11)(18x7)HMLOASMJNGZHMCEVEX" +
                "(4x7)ZGQO(2x4)NJ(1x8)M(24x11)(18x7)HMLOASMJNGZHMCEVEX" +
                "(4x7)ZGQO(2x4)NJ(1x8)M(24x11)(18x7)HMLOASMJNGZHMCEVEX" +
                "(4x7)ZGQO(2x4)NJ(1x8)M(24x11)(18x7)HMLOASMJNGZHMCEVEX" +
                "(4x7)ZGQO(2x4)NJ(1x8)M(24x11)(18x7)HMLOASMJNGZHMCEVEX" +
                "(4x7)ZGQO(2x4)NJ(1x8)M(24x11)(18x7)HMLOASMJNGZHMCEVEX" +
                "(4x7)ZGQO(2x4)NJ(1x8)M(24x11)(18x7)HMLOASMJNGZHMCEVEX" +
                "(4x7)ZGQO(2x4)NJ(1x8)M(24x11)(18x7)HMLOASMJNGZHMCEVEX" +
                "(4x7)ZGQO(2x4)NJ(1x8)M(24x11)(18x7)HMLOASMJNGZHMCEVEX" +
                "(4x7)ZGQO(2x4)NJ(1x8)M(24x11)(18x7)HMLOASMJNGZHMCEVEX" +
                "(4x7)ZGQO(2x4)NJ(1x8)M(24x11)(18x7)HMLOASMJNGZHMCEVEX" +
                "(4x7)ZGQO(2x4)NJ(1x8)M(24x11)(18x7)HMLOASMJNGZHMCEVEX" +
                "01234567890" +
                "01234567890";
        String input = "(6x6)AFPLBX(2x3)ZE(53x13)(4x7)ZGQO(2x4)NJ(1x8)M(24x11)(18x7)HMLOASMJNGZHMCEVEX(11x2)01234567890";
        String value = new Decoder(input).decode();
        Assert.assertEquals(expected, value);
    }
}
