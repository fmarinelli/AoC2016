package learning.aoc.day4.first;

import learning.aoc.day4.model.CipherRoom;
import org.junit.Assert;
import org.junit.Test;

public class TestCipherRoom {

    @Test
    public void testValidate() {
        CipherRoom cipherRoom = new CipherRoom("aaaaa-bbb-z-y-x", 123, "abxyz");
        Assert.assertTrue(cipherRoom.validate());
        cipherRoom = new CipherRoom("a-b-c-d-e-f-g-h", 987, "abcde");
        Assert.assertTrue(cipherRoom.validate());
        cipherRoom = new CipherRoom("not-a-real-room", 404, "oarel");
        Assert.assertTrue(cipherRoom.validate());
        cipherRoom = new CipherRoom("totally-real-room", 200, "decoy");
        Assert.assertFalse(cipherRoom.validate());
    }
}
