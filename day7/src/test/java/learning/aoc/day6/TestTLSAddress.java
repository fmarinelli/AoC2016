package learning.aoc.day6;

import learning.aoc.day7.IPv7Address;
import org.junit.Assert;
import org.junit.Test;

public class TestTLSAddress {

    @Test
    public void testTLS() {
        String address1 = "abba[mnop]qrst"; //supports TLS (abba outside square brackets).
        String address2 = "abcd[bddb]xyyx"; //does not support TLS (bddb is within square brackets, even though xyyx is outside square brackets).
        String address3 = "aaaa[qwer]tyui"; //does not support TLS (aaaa is invalid; the interior characters must be different).
        String address4 = "ioxxoj[asdfgh]zxcvbn"; //supports TLS (oxxo is outside square brackets,
        String address5 = "abcd[abddbx]xyyx"; //does not support TLS (bddb is within square brackets, even though xyyx is outside square brackets).
        String address6 = "tivudfusgnewzshs[mausfjbgxmyibin]yponuityptavbhekrlg[qeyafuevtlqemtfa]owtdxadrwwbxbrkl[obfcyxbifipwhduubu]mjocivgvrcbrllso";
        String address7 = "lkdzsmlnhsfwkmgftm[bpesperctavrfcn]wgzsbkjyyrbcjzghvlo[gixpfkuukvaoecc]zrvymealuxycdlse[cnmjogkfmapiwvkbk]vcgzczxskqenrst";

        Assert.assertTrue(new IPv7Address(address1).isTLS());
        Assert.assertFalse(new IPv7Address(address2).isTLS());
        Assert.assertFalse(new IPv7Address(address3).isTLS());
        Assert.assertTrue(new IPv7Address(address4).isTLS());
        Assert.assertFalse(new IPv7Address(address5).isTLS());
        Assert.assertFalse(new IPv7Address(address6).isTLS());
        Assert.assertFalse(new IPv7Address(address7).isTLS());
    }
}
