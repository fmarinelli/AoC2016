package learning.aoc.day3.first;

import learning.aoc.camel.CamelApp;
import org.apache.camel.builder.RouteBuilder;

public class App extends CamelApp {

    public static void main(String[] args) throws Exception {
        App app = new App();
        app.run(args);
    }

    @Override
    public RouteBuilder[] buildRoutes() {
        return new RouteBuilder[]{
                new TriangleRB()
        };
    }

    @Override
    public Object getInput() {
        return Thread.currentThread().getContextClassLoader().getResourceAsStream("first.input");
    }

    @Override
    public String getEndpoint() {
        return "direct:start-first-half";
    }

}
