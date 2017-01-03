package learning.aoc.day2;

import learning.aoc.day2.first.model.PadButton;
import org.junit.Assert;
import org.junit.Test;

public class TestPadButton {

    @Test
    public void testUp() {
        Assert.assertEquals(PadButton.TWO, PadButton.FIVE.up());
        Assert.assertEquals(PadButton.TWO, PadButton.FIVE.up().up());
        Assert.assertEquals(PadButton.TWO, PadButton.FIVE.up().up().up());
    }

    @Test
    public void testLeft() {
        Assert.assertEquals(PadButton.FOUR, PadButton.FIVE.left());
        Assert.assertEquals(PadButton.FOUR, PadButton.FIVE.left().left());
        Assert.assertEquals(PadButton.FOUR, PadButton.FIVE.left().left().left());
    }

    @Test
    public void testDown() {
        Assert.assertEquals(PadButton.EIGHT, PadButton.FIVE.down());
        Assert.assertEquals(PadButton.EIGHT, PadButton.FIVE.down().down());
        Assert.assertEquals(PadButton.EIGHT, PadButton.FIVE.down().down().down());
    }

    @Test
    public void testRight() {
        Assert.assertEquals(PadButton.SIX, PadButton.FIVE.right());
        Assert.assertEquals(PadButton.SIX, PadButton.FIVE.right().right());
        Assert.assertEquals(PadButton.SIX, PadButton.FIVE.right().right().right());
    }

    @Test
    public void testMix() {
        Assert.assertEquals(PadButton.SIX, PadButton.FIVE.right());
        Assert.assertEquals(PadButton.NINE, PadButton.FIVE.right().down());
        Assert.assertEquals(PadButton.EIGHT,  PadButton.FIVE.right().down().left());
        Assert.assertEquals(PadButton.SEVEN,  PadButton.FIVE.right().down().left().left());
        Assert.assertEquals(PadButton.FOUR,  PadButton.FIVE.right().down().left().left().up());
    }
}
