package learning.aoc.day5;

import org.junit.Assert;
import org.junit.Test;

public class TestDigest {

    @Test
    public void testDigest() {
        String digest = MD5Utils.digest("abc", 3231929);

        Assert.assertTrue(digest.startsWith("00000"));
    }

    @Test
    public void testFindDigestFromZero() {
        int expected = 3231929;
        long digest = MD5Utils.findDigest("abc", 0);
        Assert.assertEquals(expected, digest);
    }

    @Test
    public void testFindDigestFromValue() {
        int expected = 3231929;
        long digest = MD5Utils.findDigest("abc", expected);
        Assert.assertEquals(expected, digest);
    }

    @Test
    public void testFindPassword() {
        String expected = "18f47a30";
        String password = MD5Utils.findPassword("abc");
        Assert.assertEquals(expected, String.valueOf(password));
    }

    @Test
    public void testFindPasswordWithPosition() {
        String expected = "05ace8e3";
        String password = MD5Utils.findPasswordWithHashPosition("abc");
        Assert.assertEquals(expected, String.valueOf(password));
    }


}
