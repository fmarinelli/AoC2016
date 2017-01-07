package learning.aoc.day6.second;

import learning.aoc.day6.RepeatingUtils;
import org.apache.camel.builder.RouteBuilder;

public class InverseDecodeRB extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:start-second-half")
                .convertBodyTo(String.class)
                .setBody().simple("${body.split('\n')}")
                .setBody().method(RepeatingUtils.class, "inverseDecode")
                .log("Output ${body}");
    }
}
