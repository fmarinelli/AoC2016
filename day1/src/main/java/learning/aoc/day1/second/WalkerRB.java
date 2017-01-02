package learning.aoc.day1.second;

import learning.aoc.day1.utils.KieUtils;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.util.toolbox.AggregationStrategies;
import org.kie.api.runtime.KieSession;

public class WalkerRB extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:start-second-half")
                .convertBodyTo(String.class)
                .log("Elaborate second.input: [${body}]")
                .setProperty("kieSession", method(KieUtils.class, "buildKieSessionSecondHalf(${exchange})"))
                .split(simple("${body}")).streaming().aggregationStrategy(AggregationStrategies.useLatest())
                    .transform(simple("${body.trim()}"))
                    .process(exchange -> {
                        KieSession kieSession = exchange.getProperty("kieSession", KieSession.class);
                        kieSession.insert(exchange.getIn().getBody(String.class));
                        kieSession.fireAllRules();
                    })
                .end()
                .setBody().exchangeProperty("kieSession")
                .setBody().simple("${body.getGlobal('walker')}")
                .setBody().simple("${body.getBlocksAway()}")
                .process(exchange -> {
                    KieSession kieSession = exchange.getProperty("kieSession", KieSession.class);
                    kieSession.dispose();
                });
    }
}
