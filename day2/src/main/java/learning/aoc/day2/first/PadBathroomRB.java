package learning.aoc.day2.first;

import learning.aoc.day2.rules.AggregateIntegers;
import learning.aoc.day2.utils.KieUtils;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.util.toolbox.AggregationStrategies;
import org.kie.api.runtime.KieSession;

public class PadBathroomRB extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:start-first-half")
                .convertBodyTo(String.class)
                .log("Elaborate first.input: [${body}]")
                .setProperty("kieSession", method(KieUtils.class, "buildKieSessionFirstHalf()"))
                .split(simple("${body.split('\\n')}")).aggregationStrategy(AggregationStrategies.bean(AggregateIntegers.class))
                    .process(exchange -> {
                        KieSession kieSession = exchange.getProperty("kieSession", KieSession.class);
                        kieSession.registerChannel("button", exchange.getOut()::setBody);
                        kieSession.insert(exchange.getIn().getBody(String.class));
                        kieSession.fireAllRules();
                    })
                .end()
                .log("Message ${body}");
    }
}
