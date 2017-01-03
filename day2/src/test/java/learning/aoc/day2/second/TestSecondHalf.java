package learning.aoc.day2.second;

import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.AdviceWithRouteBuilder;
import org.apache.camel.builder.Builder;
import org.apache.camel.builder.PredicateBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

public class TestSecondHalf extends CamelTestSupport {

    @Override
    protected RoutesBuilder createRouteBuilder() throws Exception {
        return new RealPadBathroomRB();
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
                replaceFromWith("direct:start");
                weaveAddLast().to("mock:result");
            }
        });

        getMockEndpoint("mock:result").expectedMessageCount(1);
        getMockEndpoint("mock:result").allMessages()
                .predicate(PredicateBuilder.isEqualTo(body(), Builder.constant("5DB3")));

        context.start();

        String input = "ULL\n" +
                "RRDDD\n" +
                "LURDL\n" +
                "UUUUD";

        template.sendBody("direct:start", input);

        assertMockEndpointsSatisfied();
    }
}
