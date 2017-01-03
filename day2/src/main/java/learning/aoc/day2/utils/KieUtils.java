package learning.aoc.day2.utils;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class KieUtils {

    private static final KieServices ks = KieServices.Factory.get();
    private static final KieContainer kieContainer = ks.getKieClasspathContainer();

    public static KieSession buildKieSessionFirstHalf() {
        KieSession kieSession = kieContainer.newKieSession("day1-first-half-ksession");
        return kieSession;
    }

    public static KieSession buildKieSessionSecondHalf() {
        KieSession kieSession = kieContainer.newKieSession("day1-second-half-ksession");
        return kieSession;
    }

}
