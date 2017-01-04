package learning.aoc.day3.first;

import learning.aoc.day3.first.model.Triangle;
import learning.aoc.day3.rules.AggregateSumIntegers;
import learning.aoc.day3.utils.KieUtils;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.BindyType;
import org.apache.camel.util.toolbox.AggregationStrategies;
import org.kie.api.runtime.KieSession;

import java.util.concurrent.atomic.AtomicLong;

public class TriangleRB extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:start-first-half")
                .convertBodyTo(String.class)
                .unmarshal().bindy(BindyType.Fixed, Triangle.class)
                .setProperty("kieSession", method(KieUtils.class, "buildKieSessionFirstHalf()"))
                .split(body()).aggregationStrategy(AggregationStrategies.useLatest())
                    .process(exchange -> {
                        Triangle triangle = exchange.getIn().getMandatoryBody(Triangle.class);
                        KieSession kieSession = exchange.getProperty("kieSession", KieSession.class);
                        kieSession.insert(triangle);
                    })
                .end()
                .process(exchange -> {
                    AtomicLong valids = new AtomicLong(0);

                    KieSession kieSession = exchange.getProperty("kieSession", KieSession.class);
                    kieSession.registerChannel("valid", object -> valids.incrementAndGet());
                    kieSession.registerChannel("invalid", object -> System.out.println("Invalid triangle [" + object + "]"));
                    kieSession.fireAllRules();

                    exchange.getOut().setBody(valids.get());
                })
                .log("Message ${body}");
    }
}
