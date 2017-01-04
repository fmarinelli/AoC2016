package learning.aoc.day3.utils;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class KieUtils {

    private static final KieServices ks = KieServices.Factory.get();
    private static final KieContainer kieContainer = ks.getKieClasspathContainer();

    public static KieSession buildKieSessionFirstHalf() {
        return kieContainer.newKieSession("day1-first-half-ksession");
    }

    public static KieSession buildKieSessionSecondHalf() {
        return kieContainer.newKieSession("day1-second-half-ksession");
    }

}
