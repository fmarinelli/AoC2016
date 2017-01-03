package learning.aoc.day2.second;

import learning.aoc.day2.rules.AggregateStrings;
import learning.aoc.day2.utils.KieUtils;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.util.toolbox.AggregationStrategies;
import org.kie.api.runtime.KieSession;

public class RealPadBathroomRB extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:start-second-half")
                .convertBodyTo(String.class)
                .log("Elaborate first.input: [${body}]")
                .setProperty("kieSession", method(KieUtils.class, "buildKieSessionSecondHalf()"))
                .split(simple("${body.split('\\n')}")).aggregationStrategy(AggregationStrategies.bean(AggregateStrings.class))
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
