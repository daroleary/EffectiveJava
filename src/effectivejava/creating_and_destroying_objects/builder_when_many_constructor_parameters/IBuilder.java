package effectivejava.creating_and_destroying_objects.builder_when_many_constructor_parameters;

// Abstract Factory
// client could pass the builder to a method to enable the method to create one or more objects for the client
public interface IBuilder<T extends NutritionFacts> {
    public T build();
}
