package effectivejava.methods_common_to_all_objects.obey_the_general_contract_overriding_equals;

// Simple immutable two-dimensional integer point class - Page 37
public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
	this.x = x;
	this.y = y;
    }

    @Override
    public boolean equals(Object o) {
	if (!(o instanceof Point)) {
	    return false;
	}

	Point p = (Point) o;
	return p.x == x && p.y == y;
    }

    // Broken - violates Liskov substitution principle - Page 39-40
    // @Override public boolean equals(Object o) {
    // if (o == null || o.getClass() != getClass())   // using getClass() instead of instanceof, since a A.equals(B) == false even if all fields are equivalent
    // return false;
    // Point p = (Point) o;
    // return p.x == x && p.y == y;
    // }

    // See Item 9
    @Override
    public int hashCode() {
	return 31 * x + y;
    }
}
