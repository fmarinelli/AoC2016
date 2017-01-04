package learning.aoc.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.main.Main;
import org.apache.camel.main.MainListener;
import org.apache.camel.main.MainSupport;

import java.util.Arrays;

public abstract class CamelApp implements MainListener {

    public void run(String[] args) throws Exception {
        // create a Main instance
        Main main = new Main();

        // add routes
        Arrays.stream(buildRoutes()).forEach(main::addRouteBuilder);

        main.addMainListener(this);

        // run until you terminate the JVM
        System.out.println("Starting Camel. Use ctrl + c to terminate the JVM.\n");
        main.run(addOption(args, "-d", "10"));
    }

    public abstract RouteBuilder[] buildRoutes();

    // Listener
    @Override
    public void beforeStart(MainSupport main) {
    }

    @Override
    public void configure(CamelContext context) {
    }

    @Override
    public void afterStart(MainSupport main) {
    }

    @Override
    public void beforeStop(MainSupport main) {

    }

    @Override
    public void afterStop(MainSupport main) {

    }

    private static String[] addOption(String[] args, String option, String value) {
        if (Arrays.stream(args).noneMatch(s -> s.equalsIgnoreCase(option))) {
            String[] newargs = Arrays.copyOf(args, args.length + 2);
            newargs[args.length] = option;
            newargs[args.length + 1] = value;
            args = newargs;
        }
        return args;
    }

}
