package ddexample;

import ddexample.resources.PersonResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;


public class DDExampleApplication extends Application<DDExampleConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DDExampleApplication().run(args);
    }

    @Override
    public String getName() {
        return "application-platform-poc";
    }

    @Override
    public void initialize(final Bootstrap<DDExampleConfiguration> bootstrap) {
    }

    @Override
    public void run(final DDExampleConfiguration configuration,
                    final Environment environment) {
        environment.jersey().register(new PersonResource());
    }

}
