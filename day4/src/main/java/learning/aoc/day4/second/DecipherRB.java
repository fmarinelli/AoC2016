package learning.aoc.day4.second;

import learning.aoc.day4.AggregateNorthpoleObjectStorage;
import learning.aoc.day4.model.CipherRoom;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.util.toolbox.AggregationStrategies;

public class DecipherRB extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:start-second-half")
                .convertBodyTo(String.class)
                .split(simple("${body.split('\n')}")).aggregationStrategy(AggregationStrategies.bean(new AggregateNorthpoleObjectStorage()))
                    .convertBodyTo(CipherRoom.class)
                .end()
                .log("Output ${body.decipher()}")
                .log("Output ${body.getSecureId()}");
    }
}
