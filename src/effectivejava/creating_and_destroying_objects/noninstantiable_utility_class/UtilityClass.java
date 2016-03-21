package effectivejava.creating_and_destroying_objects.noninstantiable_utility_class;

public class UtilityClass {
    // Suppress default constructor for noninstantiability
    private UtilityClass() {
	throw new AssertionError();
    }
}
