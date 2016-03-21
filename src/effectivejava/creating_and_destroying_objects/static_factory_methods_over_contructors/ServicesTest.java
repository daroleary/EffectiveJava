package effectivejava.creating_and_destroying_objects.static_factory_methods_over_contructors;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ServicesTest {

    @Test
    public void newInstance_noArguments_returnsDefaultServiceProvider() {

	String compProviderName = "comp";
	String armedProviderName = "armed";

	// Provider would execute this line
	Services.registerDefaultProvider(DEFAULT_PROVIDER);
	Services.registerProvider(compProviderName, COMP_PROVIDER);
	Services.registerProvider(armedProviderName, ARMED_PROVIDER);

	// Clients would execute this line
	Service defaultService = Services.newInstance();
	Service compService = Services.newInstance(compProviderName);
	Service armedService = Services.newInstance(armedProviderName);
	assertEquals("Default service", defaultService.toString());
	assertEquals("Complementary service", compService.toString());
	assertEquals("Armed service", armedService.toString());
    }

    private static Provider DEFAULT_PROVIDER = () -> new Service() {
	@Override
	public String toString() {
	    return "Default service";
	}
    };

    private static Provider COMP_PROVIDER = () -> new Service() {
	@Override
	public String toString() {
	    return "Complementary service";
	}
    };

    private static Provider ARMED_PROVIDER = () -> new Service() {
	@Override
	public String toString() {
	    return "Armed service";
	}
    };
}
