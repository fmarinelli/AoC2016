package learning.aoc.day1;

import learning.aoc.day1.model.Walker;
import org.junit.Assert;
import org.junit.Test;

public class TestWalker {

    @Test
    public void testR2R2R2() {
        Walker walker = new Walker();

        walker.right(2);
        walker.right(2);
        walker.right(2);

        Assert.assertEquals(2, walker.getBlocksAway());
    }

    @Test
    public void testR2L3() {
        Walker walker = new Walker();

        walker.right(2);
        walker.left(3);

        Assert.assertEquals(5, walker.getBlocksAway());
    }

    @Test
    public void testR5L5R5R3() {
        Walker walker = new Walker();

        walker.right(5);
        walker.left(5);
        walker.right(5);
        walker.right(3);

        Assert.assertEquals(12, walker.getBlocksAway());
    }
}
