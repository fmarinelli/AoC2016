package learning.aoc.day4.first;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AbstractListAggregationStrategy;

public class AggregateValidRooms extends AbstractListAggregationStrategy {

    @Override
    public Object getValue(Exchange exchange) {
        return exchange.getIn().getBody();
    }

/*
    public Exchange aggregate(Exchange oldExch, Exchange newExch) throws InvalidPayloadException {
        List messages;
        Object body = oldExch.getIn().getBody();
        if (body instanceof List) {
            messages = (List) body;
        } else {
            messages = new ArrayList();
            messages.add(oldExch.getIn().getBody());
        }
        messages.add(newExch.getIn().getBody());

        DefaultExchange exchange = new DefaultExchange(oldExch);
        exchange.getOut().setBody(messages);
        return exchange;
    }
*/
}
