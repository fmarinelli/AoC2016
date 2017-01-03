package learning.aoc.day2.second;

import learning.aoc.day2.first.model.PadButton;
import learning.aoc.day2.second.model.RealPadButton;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.ArrayList;
import java.util.List;

public class TestRules {

    private KieSession kieSession;
    private KieContainer kieContainer;

    @Before
    public void setup() {
        KieServices ks = KieServices.Factory.get();
        kieContainer = ks.getKieClasspathContainer();
        kieSession = kieContainer.newKieSession("day1-second-half-ksession");
    }

    @After
    public void cleanup() {
        kieSession.dispose();
        kieContainer.dispose();
    }

    @Test
    public void testULL() {
        List buttons = new ArrayList();

        kieSession.registerChannel("button", buttons::add);
        kieSession.insert("ULL");
        kieSession.fireAllRules();

        Assert.assertEquals(1, buttons.size());
        Assert.assertTrue(buttons.get(0) instanceof String);
        Assert.assertEquals("5", buttons.get(0));
    }

    @Test
    public void testRRDDD() {
        List buttons = new ArrayList();

        kieSession.registerChannel("button", buttons::add);
        kieSession.insert(RealPadButton.FIVE);
        kieSession.insert("RRDDD");
        kieSession.fireAllRules();

        Assert.assertEquals(1, buttons.size());
        Assert.assertTrue(buttons.get(0) instanceof String);
        Assert.assertEquals("D", buttons.get(0));
    }

    @Test
    public void testLURDL() {
        List buttons = new ArrayList();

        kieSession.registerChannel("button", buttons::add);
        kieSession.insert(RealPadButton.D);
        kieSession.insert("LURDL");
        kieSession.fireAllRules();

        Assert.assertEquals(1, buttons.size());
        Assert.assertTrue(buttons.get(0) instanceof String);
        Assert.assertEquals("B", buttons.get(0));
    }

    @Test
    public void testUUUUD() {
        List buttons = new ArrayList();

        kieSession.registerChannel("button", buttons::add);
        kieSession.insert(RealPadButton.B);
        kieSession.insert("UUUUD");
        kieSession.fireAllRules();

        Assert.assertEquals(1, buttons.size());
        Assert.assertTrue(buttons.get(0) instanceof String);
        Assert.assertEquals("3", buttons.get(0));
    }

}
