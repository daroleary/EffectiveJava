package effectivejava.methods_common_to_all_objects.obey_the_general_contract_overriding_equals.composition;

import com.google.common.base.Preconditions;

// Adds a value component without violating the equals contract - Page 40
public class ColorPoint {
    private final Point _point;
    private final Color _color;

    public ColorPoint(int x, int y, Color color) {
	Preconditions.checkNotNull(color);

	_point = new Point(x, y);
	_color = color;
    }

    /**
     * Returns the point-view of this color point.
     */
    public Point asPoint() {
	return _point;
    }

    @Override
    public boolean equals(Object o) {
	if (!(o instanceof ColorPoint)) {
	    return false;
	}

	ColorPoint cp = (ColorPoint) o;
	return cp._point.equals(_point)
	       && cp._color == _color;
    }

    @Override
    public int hashCode() {
	int result = _point != null ? _point.hashCode() : 0;
	result = 31 * result + (_color != null ? _color.hashCode() : 0);
	return result;
    }
}
