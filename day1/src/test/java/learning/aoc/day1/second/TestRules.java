package learning.aoc.day1.second;

import learning.aoc.day1.model.Position;
import learning.aoc.day1.model.Walker;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

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
    public void testR8R4R4R8() throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(1);
        Walker walker = new Walker();

        kieSession.setGlobal("walker", walker);
        kieSession.registerChannel("position", position -> {
            Assert.assertEquals(4, ((Position) position).getBlocksAway());
            latch.countDown();
        });
        kieSession.insert("R8");
        kieSession.fireAllRules();
        kieSession.insert("R4");
        kieSession.fireAllRules();
        kieSession.insert("R4");
        kieSession.fireAllRules();
        kieSession.insert("R8");
        kieSession.fireAllRules();

        latch.await(10, TimeUnit.SECONDS);
        Assert.assertEquals(0, latch.getCount());
    }

}
