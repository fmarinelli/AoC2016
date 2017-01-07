package learning.aoc.day4.first;

import learning.aoc.day4.model.CipherRoom;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.util.toolbox.AggregationStrategies;

import java.util.concurrent.atomic.AtomicLong;

public class ValidateRoomRB extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        AtomicLong counter = new AtomicLong();
        AggregateValidRooms aggregateValidRooms = new AggregateValidRooms();
        from("direct:start-first-half")
                .convertBodyTo(String.class)
                .setProperty("valid_counter", constant(counter))
                .split(simple("${body.split('\n')}")).aggregationStrategy(AggregationStrategies.useLatest())
                    .process(exchange -> {
                        CipherRoom room = exchange.getIn().getMandatoryBody(CipherRoom.class);
                        if (room.validate()) {
                            counter.addAndGet(room.getSecureId());
                            System.out.println("room valid [" + counter.get() + "]");
                        }
                    })
                .end()
                .setBody().exchangeProperty("valid_counter")
                .log("Output ${body}");
    }
}
