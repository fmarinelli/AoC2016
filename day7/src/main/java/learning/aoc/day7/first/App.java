package learning.aoc.day7.first;

import learning.aoc.camel.CamelApp;
import org.apache.camel.builder.RouteBuilder;

public class App extends CamelApp {

    public static void main(String[] args) throws Exception {
        App app = new App();
        app.run(args);
    }

    @Override
    public Object getInput() {
        return Thread.currentThread().getContextClassLoader().getResourceAsStream("first.input");
    }

    @Override
    public String getEndpoint() {
        return "direct:start-first-half";
    }

    @Override
    public RouteBuilder[] buildRoutes() {
        return new RouteBuilder[]{
                new CheckTLSRB()
        };
    }
}
