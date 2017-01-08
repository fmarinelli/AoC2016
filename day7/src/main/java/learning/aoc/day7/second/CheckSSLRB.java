package learning.aoc.day7.second;

import learning.aoc.day7.IPv7Address;
import learning.aoc.rules.AggregateSumIntegers;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.util.toolbox.AggregationStrategies;

public class CheckSSLRB extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:start-second-half")
                .convertBodyTo(String.class)
                .split(simple("${body.split('\n')}")).aggregationStrategy(AggregationStrategies.bean(AggregateSumIntegers.class))
                    .process(exchange -> {
                        if (exchange.getIn().getMandatoryBody(IPv7Address.class).isSSL()) {
                            exchange.getOut().setBody(1);
                        } else {
                            exchange.getOut().setBody(0);
                        }
                    })
                .end()
                .log("Output ${body}");
    }
}
