package effectivejava.methods_common_to_all_objects.obey_the_general_contract_overriding_equals;

import java.util.concurrent.atomic.AtomicInteger;

// Trivial subclass of Point - doesn't add a value component - Page 39
public class CounterPoint extends Point {

    private static final AtomicInteger counter = new AtomicInteger();

    public CounterPoint(int x, int y) {
	super(x, y);
	counter.incrementAndGet();
    }

    public int numberCreated() {
	return counter.get();
    }
}
