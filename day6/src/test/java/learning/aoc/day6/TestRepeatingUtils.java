package learning.aoc.day6;

import org.junit.Assert;
import org.junit.Test;

public class TestRepeatingUtils {

    @Test
    public void testEaster() {
        String message ="eedadn\n" +
                "drvtee\n" +
                "eandsr\n" +
                "raavrd\n" +
                "atevrs\n" +
                "tsrnev\n" +
                "sdttsa\n" +
                "rasrtv\n" +
                "nssdts\n" +
                "ntnada\n" +
                "svetve\n" +
                "tesnvt\n" +
                "vntsnd\n" +
                "vrdear\n" +
                "dvrsen\n" +
                "enarar\n";
        String expected = "easter";

        String[] lines = message.split("\n");
        String decoded = RepeatingUtils.decode(lines);

        Assert.assertEquals(expected, decoded);
    }

    @Test
    public void testInverseDecode() {
        String message ="eedadn\n" +
                "drvtee\n" +
                "eandsr\n" +
                "raavrd\n" +
                "atevrs\n" +
                "tsrnev\n" +
                "sdttsa\n" +
                "rasrtv\n" +
                "nssdts\n" +
                "ntnada\n" +
                "svetve\n" +
                "tesnvt\n" +
                "vntsnd\n" +
                "vrdear\n" +
                "dvrsen\n" +
                "enarar\n";
        String expected = "advent";

        String[] lines = message.split("\n");
        String decoded = RepeatingUtils.inverseDecode(lines);

        Assert.assertEquals(expected, decoded);
    }
}
