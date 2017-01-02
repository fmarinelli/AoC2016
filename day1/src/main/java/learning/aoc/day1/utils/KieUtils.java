package learning.aoc.day1.utils;

import learning.aoc.day1.model.Walker;
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
        kieSession.setGlobal("walker", new Walker());
        return kieSession;
    }

    public static KieSession buildKieSessionSecondHalf(Exchange exchange) {
        CamelContext context = exchange.getContext();
        KieSession kieSession = kieContainer.newKieSession("day1-second-half-ksession");
        kieSession.setGlobal("walker", new Walker());
        kieSession.registerChannel("position", position -> {
            System.out.println("Position: " + position);
            context.createProducerTemplate().sendBody("direct:same-position", position);
        });
        return kieSession;
    }

}
