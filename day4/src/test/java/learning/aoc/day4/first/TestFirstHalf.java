package learning.aoc.day4.first;

import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.AdviceWithRouteBuilder;
import org.apache.camel.builder.Builder;
import org.apache.camel.builder.PredicateBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

public class TestFirstHalf extends CamelTestSupport {

    @Override
    protected RoutesBuilder createRouteBuilder() throws Exception {
        return new ValidateRoomRB();
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
                .predicate(PredicateBuilder.isEqualTo(body(), Builder.constant(1514)));

        context.start();

        String input = "aaaaa-bbb-z-y-x-123[abxyz]\n" +
                "a-b-c-d-e-f-g-h-987[abcde]\n" +
                "not-a-real-room-404[oarel]\n" +
                "totally-real-room-200[decoy]";

        template.sendBody("direct:start", input);

        assertMockEndpointsSatisfied();
    }


}
