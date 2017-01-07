package learning.aoc.day4.second;

import learning.aoc.day4.model.CipherRoom;
import org.junit.Assert;
import org.junit.Test;

public class TestDecipherRoom {

    @Test
    public void testDecipher() {
        CipherRoom cipherRoom = new CipherRoom("qzmt-zixmtkozy-ivhz", 343, "");

        Assert.assertEquals("very encrypted name", cipherRoom.decipher());
    }

}
