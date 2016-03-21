package effectivejava.creating_and_destroying_objects.avoid_creating_unnecessary_objects;

public class Sum {

    // Hideously slow program! Can you spot the object creation?
    public static void main(String[] args) {

	Long sum = 0L;
	for (long i = 0; i < Integer.MAX_VALUE; i++) {
	    sum += 1; // we're creating a new Long Object each time due to autoboxing
	}
	System.out.println(sum);
    }
}
