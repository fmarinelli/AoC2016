package learning.aoc.day2.second;

import org.apache.camel.main.Main;

import java.io.InputStream;

public class App {

    public static void main(String[] args) throws Exception {
        // create a Main instance
        Main main = new Main();

        // add routes
        main.addRouteBuilder(new RealPadBathroomRB());

        InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream("second.input");
        main.addMainListener(new AppListener(input));

        // run until you terminate the JVM
        System.out.println("Starting Camel. Use ctrl + c to terminate the JVM.\n");
        main.run(args);
    }

}
