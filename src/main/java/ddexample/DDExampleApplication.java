package ddexample;

import ddexample.resources.PersonResource;
import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class DDExampleApplication extends Application<DDExampleConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DDExampleApplication().run(args);
    }

    @Override
    public String getName() {
        return "DDExample";
    }

    @Override
    public void initialize(final Bootstrap<DDExampleConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DDExampleConfiguration configuration,
                    final Environment environment) {
        environment.jersey().register(new PersonResource());
    }

}
