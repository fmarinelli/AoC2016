package learning.aoc.day6.first;

import learning.aoc.day6.RepeatingUtils;
import org.apache.camel.builder.RouteBuilder;

public class ReadInputRB extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:start-first-half")
                .convertBodyTo(String.class)
                .setBody().simple("${body.split('\n')}")
                .setBody().method(RepeatingUtils.class, "decode")
                .log("Output ${body}");
    }
}
