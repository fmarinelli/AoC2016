package learning.aoc.day1;

import learning.aoc.day1.model.Walker;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

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
    public void testR2R2R2() {
        Walker walker = new Walker();

        kieSession.setGlobal("walker", walker);
        kieSession.insert("R2");
        kieSession.fireAllRules();
        kieSession.insert("R2");
        kieSession.fireAllRules();
        kieSession.insert("R2");
        kieSession.fireAllRules();

        Assert.assertEquals(2, walker.getBlocksAway());
    }

    @Test
    public void testR2L3() {
        Walker walker = new Walker();

        kieSession.setGlobal("walker", walker);
        kieSession.insert("R2");
        kieSession.fireAllRules();
        kieSession.insert("L3");
        kieSession.fireAllRules();

        Assert.assertEquals(5, walker.getBlocksAway());
    }

    @Test
    public void testR5L5R5R3() {
        Walker walker = new Walker();

        kieSession.setGlobal("walker", walker);
        kieSession.insert("R5");
        kieSession.fireAllRules();
        kieSession.insert("L5");
        kieSession.fireAllRules();
        kieSession.insert("R5");
        kieSession.fireAllRules();
        kieSession.insert("R3");
        kieSession.fireAllRules();

        Assert.assertEquals(12, walker.getBlocksAway());
    }

}
