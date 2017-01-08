package learning.aoc.day7.first;

import learning.aoc.day7.IPv7Address;
import learning.aoc.rules.AggregateSumIntegers;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.util.toolbox.AggregationStrategies;

import java.util.concurrent.atomic.AtomicLong;

public class CheckTLSRB extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:start-first-half")
                .convertBodyTo(String.class)
                .split(simple("${body.split('\n')}")).aggregationStrategy(AggregationStrategies.bean(AggregateSumIntegers.class))
                    .process(exchange -> {
                        if (exchange.getIn().getMandatoryBody(IPv7Address.class).isTLS()) {
                            exchange.getOut().setBody(1);
                        } else {
                            exchange.getOut().setBody(0);
                        }
                    })
                .end()
                .log("Output ${body}");
    }
}
