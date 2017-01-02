package learning.aoc.day1.second;

import learning.aoc.day1.utils.KieUtils;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.util.toolbox.AggregationStrategies;
import org.kie.api.runtime.KieSession;

public class SamePositionRB extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:same-position")
                .log("Same position: [${body}]")
                .log("BlocksAway ${body.getBlocksAway()}");
    }
}
