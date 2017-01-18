package learning.aoc.day8;

import org.junit.Assert;
import org.junit.Test;

public class TestLEDMonitor {

    @Test
    public void testLEDMonitor() {
        LEDMonitor ledMonitor = new LEDMonitor(7, 3);

        System.out.println(ledMonitor.toString());
        //rect 3x2:
        String expectedLED = "" +
                "###....\n" +
                "###....\n" +
                ".......";
        ledMonitor.rect(3, 2);
        Assert.assertEquals(6, ledMonitor.getPixelsLit());
        Assert.assertEquals(expectedLED, ledMonitor.print());

        //rotate column x=1 by 1
        expectedLED = "" +
                "#.#....\n" +
                "###....\n" +
                ".#.....";
        ledMonitor.rotateByColumn(1, 1);
        Assert.assertEquals(6, ledMonitor.getPixelsLit());
        Assert.assertEquals(expectedLED, ledMonitor.print());

        //rotate row y=0 by 4
        expectedLED = "" +
                "....#.#\n" +
                "###....\n" +
                ".#.....";
        ledMonitor.rotateByRow(0, 4);
        Assert.assertEquals(6, ledMonitor.getPixelsLit());
        Assert.assertEquals(expectedLED, ledMonitor.print());

        //rotate column x=1 by 1
        expectedLED = "" +
                ".#..#.#\n" +
                "#.#....\n" +
                ".#.....";
        ledMonitor.rotateByColumn(1, 1);
        Assert.assertEquals(6, ledMonitor.getPixelsLit());
        Assert.assertEquals(expectedLED, ledMonitor.print());

        //rect 3x2
        expectedLED = "" +
                "###.#.#\n" +
                "###....\n" +
                ".#.....";
        ledMonitor.rect(3, 2);
        Assert.assertEquals(9, ledMonitor.getPixelsLit());
        Assert.assertEquals(expectedLED, ledMonitor.print());

        //rotate column x=1 by 1
        expectedLED = "" +
                "###.#.#\n" +
                "###....\n" +
                ".#.....";
        ledMonitor.rotateByColumn(1, 1);
        Assert.assertEquals(9, ledMonitor.getPixelsLit());
        Assert.assertEquals(expectedLED, ledMonitor.print());

        //rotate row y=0 by 4
        expectedLED = "" +
                ".#.####\n" +
                "###....\n" +
                ".#.....";
        ledMonitor.rotateByRow(0, 4);
        Assert.assertEquals(9, ledMonitor.getPixelsLit());
        Assert.assertEquals(expectedLED, ledMonitor.print());

        //rotate column x=1 by 1
        expectedLED = "" +
                ".#.####\n" +
                "###....\n" +
                ".#.....";
        ledMonitor.rotateByColumn(1, 1);
        Assert.assertEquals(9, ledMonitor.getPixelsLit());
        Assert.assertEquals(expectedLED, ledMonitor.print());
    }
}
