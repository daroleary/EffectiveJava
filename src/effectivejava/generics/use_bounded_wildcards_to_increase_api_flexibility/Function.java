// Generic Function interface - Page 122
package effectivejava.generics.use_bounded_wildcards_to_increase_api_flexibility;

interface Function<T> {
	T apply(T arg1, T arg2);
}