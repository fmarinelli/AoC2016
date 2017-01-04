package learning.aoc.day3.second;

import learning.aoc.camel.CamelApp;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.main.MainSupport;

import java.io.InputStream;

public class App extends CamelApp {

    public static void main(String[] args) throws Exception {
        App app = new App();
        app.run(args);
    }

    @Override
    public RouteBuilder[] buildRoutes() {
        return new RouteBuilder[]{
                new VerticalTrianglesRB()
        };
    }


    @Override
    public void afterStart(MainSupport main) {
        try {
            ProducerTemplate camelTemplate = main.getCamelTemplate();
            InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream("second.input");
            camelTemplate.sendBody("direct:start-second-half", input);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
