package learning.aoc.day4;

import learning.aoc.day4.model.CipherRoom;

public class AggregateNorthpoleObjectStorage {

    public CipherRoom aggregate(CipherRoom a, CipherRoom b) {
        if (a.decipher().startsWith("northpole object storage")) {
            return a;
        }
        if (b.decipher().startsWith("northpole object storage")) {
            return b;
        }
        return null;
    }
}
