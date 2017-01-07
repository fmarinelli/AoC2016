package learning.aoc.day5;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;

public class MD5Utils {

    public static String digest(String seed, long from) {
        byte[] md5 = DigestUtils.md5(seed + from);
        return String.valueOf(Hex.encodeHex(md5));
    }

    public static long findDigest(String seed, long from) {
        byte[] md5;
        long i = 0;
        do {
            md5 = DigestUtils.md5(seed + (from + i));
            i += 1;
        } while (!(md5[0] == 0 && md5[1] == 0 && (md5[2] & 0xf0) == 0));
        return from + i - 1;
    }

    public static String findPassword(String seed) {
        char[] password = new char[8];
        long digest = 0;
        for (int i = 0; i < 8; i++) {
            digest = MD5Utils.findDigest(seed, digest);
            password[i] = MD5Utils.digest(seed, digest).charAt(5);
            digest += 1;
        }
        return String.valueOf(password);
    }

    public static String findPasswordWithHashPosition(String seed) {
        char[] password = new char[]{'-', '-', '-', '-', '-', '-', '-', '-'};
        long digest = 0;
        for (int i = 0; i < 8; ) {
            digest = MD5Utils.findDigest(seed, digest);
            int pos = MD5Utils.digest(seed, digest).charAt(5) - '0';
            if ((pos >= 0 && pos < 8) && (password[pos] == '-')) {
                password[pos] = MD5Utils.digest(seed, digest).charAt(6);
                i += 1;
            }
            digest += 1;
        }
        return String.valueOf(password);
    }
}
