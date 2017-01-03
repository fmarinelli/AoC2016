package learning.aoc.day2.first;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.main.MainListener;
import org.apache.camel.main.MainSupport;

import java.io.InputStream;

public class AppListener implements MainListener {

    private InputStream inputStream;

    public AppListener(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public void beforeStart(MainSupport main) {

    }

    @Override
    public void configure(CamelContext context) {
    }

    @Override
    public void afterStart(MainSupport main) {
        try {
            ProducerTemplate camelTemplate = main.getCamelTemplate();
            camelTemplate.sendBody("direct:start-first-half", inputStream);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void beforeStop(MainSupport main) {

    }

    @Override
    public void afterStop(MainSupport main) {

    }
}
