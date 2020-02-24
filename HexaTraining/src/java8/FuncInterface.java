package java8;

@FunctionalInterface
public interface FuncInterface {
	abstract int calculate(int a);

	/*default void defMethod() {
		System.out.println("default method");
	}

	static void statMethod() {
		System.out.println("static method");
	}*/
}
