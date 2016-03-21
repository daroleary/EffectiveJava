package effectivejava.creating_and_destroying_objects.eliminate_obsolete_object_references;

import java.util.Arrays;

public class Stack {

    private Object[] _elements;
    private int _size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
	_elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
	ensureCapacity();
	_elements[_size++] = e;
    }

    public Object pop() {
	if (_size == 0) {
	    throw new EmptyStackException();
	}
	return _elements[--_size]; // Object is still referenced but un-used
	// _elements[size] = null // this will remove the Object reference prior to the size being reduced, thereby preventing memory leak
    }

    /**
     * Ensures space for at least one more element, rougly doubling the capacity
     * each time the array needs to grow.
     */
    private void ensureCapacity() {
	if (_elements.length == _size) {
	    _elements = Arrays.copyOf(_elements, 2 * _size + 1);
	}
    }
}
