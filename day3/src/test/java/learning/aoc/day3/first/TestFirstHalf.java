package learning.aoc.day3.first;

import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.AdviceWithRouteBuilder;
import org.apache.camel.builder.Builder;
import org.apache.camel.builder.PredicateBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

public class TestFirstHalf extends CamelTestSupport {

    @Override
    protected RoutesBuilder createRouteBuilder() throws Exception {
        return new TriangleRB();
    }

    @Override
    public boolean isUseAdviceWith() {
        return true;
    }

    @Test
    public void playDay1FirstHalfOneInvalid() throws Exception {
        context.getRouteDefinitions().get(0).adviceWith(context, new AdviceWithRouteBuilder() {
            @Override
            public void configure() throws Exception {
                replaceFromWith("direct:start");
                weaveAddLast().to("mock:result");
            }
        });

        getMockEndpoint("mock:result").expectedMessageCount(1);
        getMockEndpoint("mock:result").allMessages()
                .predicate(PredicateBuilder.isEqualTo(body(), Builder.constant(0)));

        context.start();

        String input = "   10   20    5";

        template.sendBody("direct:start", input);

        assertMockEndpointsSatisfied();
    }

    @Test
    public void playDay1FirstHalfOneValid() throws Exception {
        context.getRouteDefinitions().get(0).adviceWith(context, new AdviceWithRouteBuilder() {
            @Override
            public void configure() throws Exception {
                replaceFromWith("direct:start");
                weaveAddLast().to("mock:result");
            }
        });

        getMockEndpoint("mock:result").expectedMessageCount(1);
        getMockEndpoint("mock:result").allMessages()
                .predicate(PredicateBuilder.isEqualTo(body(), Builder.constant(1)));

        context.start();

        String input = "   10    6    5";

        template.sendBody("direct:start", input);

        assertMockEndpointsSatisfied();
    }

}
