package learning.aoc.day6;

import learning.aoc.day7.IPv7Address;
import org.junit.Assert;
import org.junit.Test;

public class TestSSLAddress {

    @Test
    public void testSSL() {
        String expected1 = "aba[bab]xyz"; //supports SSL (aba outside square brackets with corresponding bab within square brackets).
        String expected2 = "xyx[xyx]xyx"; //does not support SSL (xyx, but no corresponding yxy).
        String expected3 = "aaa[kek]eke"; //supports SSL (eke in supernet with corresponding kek in hypernet; the aaa sequence is not related, because the interior character must be different).
        String expected4 = "zazbz[bzb]cdb"; //supports SSL (zaz has no corresponding aza, but zbz has a corresponding bzb, even though zaz and zbz overlap).
        String expected5 = "btrucplpxrokmcts[gytdxlzkfakenliallw]qhxznozsjsvhvnzhf";
        String expected6 = "nefefqadkmytguyp[ucqagcoyxinbrvbw]neksoxgtnnfojobtx[bxhdwvwfhybtbzkijj]poayieifsaocrboesfe[tnggfefcucifowqp]olmjwaqlaiwkkbtruw";
        String expected7 = "tivudfusgnewzshs[mausfjbgxmyibin]yponuityptavbhekrlg[qeyafuevtlqemtfa]owtdxadrwwbxbrkl[obfcyxbifipwhduubu]mjocivgvrcbrllso";
        String expected8 = "kajqeqlafxtmzirn[mkftybdukmghmyoclxd]plvjnikiozkikifpodt[cmufoktkndkhaeqbztz]drjixnnsdxqnrmn[cmzsnhlirtskunngcee]upgxlcjhmoethppx";
        String expected9 = "kajqeqern[mkeqexd]plvzkikifpodt"; //true qeq -> eqe
        String expected10 = "kajqeqern[mkqeqxd]plvzkikifpodt"; //true eqe -> qeq
        String expected11 = "kajqeqrn[mkqeqxd]plvzkikifpodt"; //false
        String expected12 = "kajqeqrn[mkqeqexd]plvzkikifpodt"; //true
        String expected13 = "kajeqern[mkqeqexd]plvzkikifpodt"; //true
        String expected14 = "kajxqxrn[mkqeqxqd]plvzkikifpodt"; //true

        Assert.assertTrue(new IPv7Address(expected1).isSSL());
        Assert.assertFalse(new IPv7Address(expected2).isSSL());
        Assert.assertTrue(new IPv7Address(expected3).isSSL());
        Assert.assertTrue(new IPv7Address(expected4).isSSL());
        Assert.assertFalse(new IPv7Address(expected5).isSSL());
        Assert.assertTrue(new IPv7Address(expected6).isSSL());
        Assert.assertFalse(new IPv7Address(expected7).isSSL());
        Assert.assertFalse(new IPv7Address(expected8).isSSL());
        Assert.assertTrue(new IPv7Address(expected9).isSSL());
        Assert.assertTrue(new IPv7Address(expected10).isSSL());
        Assert.assertFalse(new IPv7Address(expected11).isSSL());
        Assert.assertTrue(new IPv7Address(expected12).isSSL());
        Assert.assertTrue(new IPv7Address(expected13).isSSL());
        Assert.assertTrue(new IPv7Address(expected14).isSSL());
    }
}
