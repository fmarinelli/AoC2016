package learning.aoc.day3.first;

import learning.aoc.day3.first.model.Triangle;
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
        kieSession = kieContainer.newKieSession("day1-first-half-ksession");
    }

    @After
    public void cleanup() {
        kieSession.dispose();
        kieContainer.dispose();
    }

    @Test
    public void testValid() {
        List valid = new ArrayList();
        List invalid = new ArrayList();

        kieSession.registerChannel("valid", valid::add);
        kieSession.registerChannel("invalid", invalid::add);
        kieSession.insert(new Triangle(10, 5, 6));
        kieSession.fireAllRules();

        Assert.assertEquals(0, invalid.size());
        Assert.assertEquals(1, valid.size());
        Assert.assertTrue(valid.get(0) instanceof Triangle);
    }

    @Test
    public void testInvalid() {
        List valid = new ArrayList();
        List invalid = new ArrayList();

        kieSession.registerChannel("valid", valid::add);
        kieSession.registerChannel("invalid", invalid::add);
        kieSession.insert(new Triangle(10, 5, 20));
        kieSession.fireAllRules();

        Assert.assertEquals(0, valid.size());
        Assert.assertEquals(1, invalid.size());
        Assert.assertTrue(invalid.get(0) instanceof Triangle);
    }

}
