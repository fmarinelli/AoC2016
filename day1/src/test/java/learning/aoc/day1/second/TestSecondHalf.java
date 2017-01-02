package learning.aoc.day1.second;

import learning.aoc.day1.model.Position;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.AdviceWithRouteBuilder;
import org.apache.camel.builder.Builder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

import static org.apache.camel.builder.Builder.constant;
import static org.apache.camel.builder.PredicateBuilder.isEqualTo;
import static org.apache.camel.builder.PredicateBuilder.isInstanceOf;

public class TestSecondHalf extends CamelTestSupport {

    @Override
    protected RoutesBuilder createRouteBuilder() throws Exception {
        return new WalkerRB();
    }

    @Override
    public boolean isUseAdviceWith() {
        return true;
    }

    @Test
    public void playDay1SecondHalf() throws Exception {
        context.getRouteDefinitions().get(0).adviceWith(context, new AdviceWithRouteBuilder() {
            @Override
            public void configure() throws Exception {
                replaceFromWith("direct:test");
                weaveAddLast().to("mock:result");
                mockEndpointsAndSkip("direct:same-position");
            }
        });

        getMockEndpoint("mock:direct:same-position")
                .expectedMessageCount(1);

        getMockEndpoint("mock:direct:same-position").allMessages()
                .predicate(isInstanceOf(body(), Position.class))
                .predicate(isEqualTo(Builder.simple("${body.getBlocksAway()}"), constant(152L)));

        getMockEndpoint("mock:result").expectedMessageCount(1);
        getMockEndpoint("mock:result").allMessages()
                .predicate(isEqualTo(body(), constant(353L)));

        context.start();

        String moves = "L4, R2, R4, L5, L3, L1, R4, R5, R1, R3, L3, L2, L2, R5, R1, L1, L2, R2, R2, L5, R5, R5, L2, R1, " +
                "R2, L2, L4, L1, R5, R2, R1, R1, L2, L3, R2, L5, L186, L5, L3, R3, L5, R4, R2, L5, R1, R4, L1, L3, R3, " +
                "R1, L1, R4, R2, L1, L4, R5, L1, R50, L4, R3, R78, R4, R2, L4, R3, L4, R4, L1, R5, L4, R1, L2, R3, L2, " +
                "R5, R5, L4, L1, L2, R185, L5, R2, R1, L3, R4, L5, R2, R4, L3, R4, L2, L5, R1, R2, L2, L1, L2, R2, L2, " +
                "R1, L5, L3, L4, L3, L4, L2, L5, L5, R2, L3, L4, R4, R4, R5, L4, L2, R4, L5, R3, R1, L1, R3, L2, R2, R1, " +
                "R5, L4, R5, L3, R2, R3, R1, R4, L4, R1, R3, L5, L1, L3, R2, R1, R4, L4, R3, L3, R3, R2, L3, L3, R4, L2, " +
                "R4, L3, L4, R5, R1, L1, R5, R3, R1, R3, R4, L1, R4, R3, R1, L5, L5, L4, R4, R3, L2, R1, R5, L3, R4, R5, " +
                "L4, L5, R2";

        template.sendBody("direct:test", moves);

        assertMockEndpointsSatisfied();
    }

}
