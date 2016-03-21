package effectivejava.creating_and_destroying_objects.builder_when_many_constructor_parameters;

import com.google.common.base.Preconditions;

public class NutritionFacts {

    private final int _servingSize;
    private final int _servings;
    private final int _calories;
    private final int _fat;
    private final int _sodium;
    private final int _carbohydrate;

    public static class Builder implements IBuilder<NutritionFacts> {
	// Required parameters
	private final int _servingSize;
	private final int _servings;

	// Optional parameters - intialized to default values
	private int _calories = 0;
	private int _fat = 0;
	private int _sodium = 0;
	private int _carbohydrate = 0;

	public Builder(int servingSize, int servings) {
	    Preconditions.checkNotNull(servingSize);
	    Preconditions.checkNotNull(servings);

	    _servingSize = servingSize;
	    _servings = servings;
	}

	public Builder carbohydrate(int carbohydrate) {
	    _carbohydrate = carbohydrate;
	    return this;
	}

	public Builder sodium(int sodium) {
	    _sodium = sodium;
	    return this;
	}

	public Builder fat(int fat) {
	    _fat = fat;
	    return this;
	}

	public Builder calories(int calories) {
	    _calories = calories;
	    return this;
	}

	public NutritionFacts build() {
	    return new NutritionFacts(this);
	}
    }

    public NutritionFacts(Builder builder) {
	_servingSize = builder._servingSize;
	_servings = builder._servings;
	_calories = builder._calories;
	_fat = builder._fat;
	_sodium = builder._sodium;
	_carbohydrate = builder._carbohydrate;
    }

    @Override
    public String toString() {
	return "NutritionFacts{" +
	       "_servingSize=" + _servingSize +
	       ", _servings=" + _servings +
	       ", _calories=" + _calories +
	       ", _fat=" + _fat +
	       ", _sodium=" + _sodium +
	       ", _carbohydrate=" + _carbohydrate +
	       '}';
    }

    public static void main(String[] args) {
	NutritionFacts cocaCola = new Builder(240, 8)
		.calories(100)
		.sodium(35)
		.carbohydrate(27)
		.build();

	System.out.println(cocaCola);
    }
}
