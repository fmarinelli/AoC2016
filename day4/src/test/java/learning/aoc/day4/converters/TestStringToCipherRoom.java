package learning.aoc.day4.converters;

import learning.aoc.day4.model.CipherRoom;
import org.junit.Assert;
import org.junit.Test;

public class TestStringToCipherRoom {

    @Test
    public void testDecode() {
        StringToCipherRoom converter = new StringToCipherRoom();

        CipherRoom cipherRoom = converter.convert("aaaaa-bbb-z-y-x-123[abxyz]");
        Assert.assertNotNull(cipherRoom);
        Assert.assertEquals("aaaaa-bbb-z-y-x", cipherRoom.getData());
        Assert.assertEquals(123, cipherRoom.getSecureId().intValue());
        Assert.assertEquals("abxyz", cipherRoom.getChecksum());

        cipherRoom = converter.convert("a-b-c-d-e-f-g-h-987[abcde]");
        Assert.assertNotNull(cipherRoom);
        Assert.assertEquals("a-b-c-d-e-f-g-h", cipherRoom.getData());
        Assert.assertEquals(987, cipherRoom.getSecureId().intValue());
        Assert.assertEquals("abcde", cipherRoom.getChecksum());

        cipherRoom = converter.convert("not-a-real-room-404[oarel]");
        Assert.assertNotNull(cipherRoom);
        Assert.assertEquals("not-a-real-room", cipherRoom.getData());
        Assert.assertEquals(404, cipherRoom.getSecureId().intValue());
        Assert.assertEquals("oarel", cipherRoom.getChecksum());

        cipherRoom = converter.convert("totally-real-room-200[decoy]");
        Assert.assertNotNull(cipherRoom);
        Assert.assertEquals("totally-real-room", cipherRoom.getData());
        Assert.assertEquals(200, cipherRoom.getSecureId().intValue());
        Assert.assertEquals("decoy", cipherRoom.getChecksum());
    }
}
