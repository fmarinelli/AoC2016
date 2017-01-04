package learning.aoc.day3.second;

import learning.aoc.day3.second.model.TriangleWithId;
import learning.aoc.day3.utils.KieUtils;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.BindyType;
import org.apache.camel.util.toolbox.AggregationStrategies;
import org.kie.api.runtime.KieSession;

import java.util.concurrent.atomic.AtomicLong;

public class VerticalTrianglesRB extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:start-second-half")
                .convertBodyTo(String.class)
                .convertBodyTo(String.class)
                .unmarshal().bindy(BindyType.Fixed, TriangleWithId.class)
                .setProperty("kieSession").method(KieUtils.class, "buildKieSessionSecondHalf")
                .split(body()).aggregationStrategy(AggregationStrategies.useLatest())
                    .process(exchange -> {
                        TriangleWithId triangle = exchange.getIn().getMandatoryBody(TriangleWithId.class);
                        KieSession kieSession = exchange.getProperty("kieSession", KieSession.class);
                        kieSession.insert(triangle);
                    })
                .end()
                .process(exchange -> {
                    AtomicLong valids = new AtomicLong();
                    KieSession kieSession = exchange.getProperty("kieSession", KieSession.class);
                    kieSession.registerChannel("valid", object -> valids.incrementAndGet());
                    kieSession.fireAllRules();
                    exchange.getOut().setBody(valids.get());
                })
                .log("Message ${body}");
    }
}
