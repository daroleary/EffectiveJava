package effectivejava.methods_common_to_all_objects.consider_implementing_comparable;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class WordList {
	public static void main(String[] args) {
		Set<String> s = new TreeSet<String>();
		Collections.addAll(s, args);
		System.out.println(s);
	}
}
