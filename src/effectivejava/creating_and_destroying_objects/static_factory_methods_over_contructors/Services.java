package effectivejava.creating_and_destroying_objects.static_factory_methods_over_contructors;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Services {

    private Services() {
	// prevents instantiation (Item 4)
    }

    // Maps service names to services
    private static final Map<String, Provider> _providers = new ConcurrentHashMap<>();
    private static final String DEFAULT_PROVIDER_NAME = "<def>";

    // Provider registration API
    public static void registerDefaultProvider(Provider p) {
	registerProvider(DEFAULT_PROVIDER_NAME, p);
    }

    public static void registerProvider(String name, Provider provider) {
	_providers.put(name, provider);
    }

    // Service access API
    public static Service newInstance() {
	return newInstance(DEFAULT_PROVIDER_NAME);
    }

    public static Service newInstance(String name) {
	Provider provider = _providers.get(name);
	if (provider == null) {
	    throw new IllegalArgumentException("No provider registered with name: " + name);
	}
	return provider.newService();
    }
}
