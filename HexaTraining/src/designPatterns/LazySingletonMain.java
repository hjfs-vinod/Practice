package designPatterns;

public class LazySingletonMain {
	public static void main(String[] args) {
		LazySingleton instance1 = LazySingleton.getLazyton();
		LazySingleton instance2 = LazySingleton.getLazyton();
		System.out.println(instance1);
		System.out.println(instance2);

	}
}
