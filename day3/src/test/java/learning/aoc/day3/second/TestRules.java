package learning.aoc.day3.second;

import learning.aoc.day3.first.model.Triangle;
import learning.aoc.day3.second.model.TriangleWithId;
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
        TriangleWithId.SEQ_ID_GENERATOR.set(0);
    }

    @After
    public void cleanup() {
        kieSession.dispose();
        kieContainer.dispose();
    }

    @Test
    public void testValid() {
        List valid = new ArrayList();

        kieSession.registerChannel("valid", valid::add);

        kieSession.insert(new TriangleWithId(101, 301, 601));
        kieSession.insert(new TriangleWithId(102, 302, 701));
        kieSession.insert(new TriangleWithId(103, 303, 702));
        kieSession.insert(new TriangleWithId(201, 401, 703));
        kieSession.fireAllRules();

        Assert.assertEquals(3, valid.size());
        Assert.assertTrue(valid.get(0) instanceof String);
    }

}
