package effectivejava.classesandinterfaces.prefer_interfaces_to_abstract_classes;

import java.util.AbstractList;
import java.util.Collections;
import java.util.List;

// Concrete implementation built atop skeletal implementation - Page 95
public class IntArrays {

    static List<Integer> intArraysAsList(final int[] a) {
	if (a == null) {
	    throw new NullPointerException();
	}

	return new AbstractList<Integer>() {
	    @Override
	    public Integer get(int index) {
		return a[index]; // Autoboxing (Item 5)
	    }

	    @Override
	    public Integer set(int i, Integer val) {
		int oldVal = a[i]; // Auto-unboxing
		a[i] = val; // Autoboxing
		return oldVal;
	    }

	    @Override
	    public int size() {
		return a.length;
	    }
	};
    }

    public static void main(String[] args) {

	int[] a = new int[10];
	for (int i = 0; i < a.length; i++) {
	   a[i] = i;
	}

	List<Integer> list = intArraysAsList(a);

	Collections.shuffle(list);
	System.out.println(list);
    }
}
