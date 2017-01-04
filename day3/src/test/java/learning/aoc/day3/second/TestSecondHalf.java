package learning.aoc.day3.second;

import learning.aoc.day3.second.model.TriangleWithId;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.AdviceWithRouteBuilder;
import org.apache.camel.builder.Builder;
import org.apache.camel.builder.PredicateBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Before;
import org.junit.Test;

public class TestSecondHalf extends CamelTestSupport {

    @Override
    protected RoutesBuilder createRouteBuilder() throws Exception {
        return new VerticalTrianglesRB();
    }

    @Override
    public boolean isUseAdviceWith() {
        return true;
    }

    @Before
    public void setup() {
        TriangleWithId.SEQ_ID_GENERATOR.set(0);
    }

    @Test
    public void playDay1SecondHalf() throws Exception {
        context.getRouteDefinitions().get(0).adviceWith(context, new AdviceWithRouteBuilder() {
            @Override
            public void configure() throws Exception {
                replaceFromWith("direct:start");
                weaveAddLast().to("mock:result");
            }
        });

        getMockEndpoint("mock:result").expectedMessageCount(1);
        getMockEndpoint("mock:result").allMessages()
                .predicate(PredicateBuilder.isEqualTo(body(), Builder.constant("5")));

        context.start();

        String input =
                "  688  835  659\n" +
                "  425  104  167\n" +
                "  720  466  647\n" +
                "  262  893  400\n" +
                "  262  893  400\n" +
                "  388  919  466";

        template.sendBody("direct:start", input);

        assertMockEndpointsSatisfied();
    }
}
