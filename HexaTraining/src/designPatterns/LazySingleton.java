package designPatterns;

public class LazySingleton {
	private static LazySingleton lazyton;

	private LazySingleton() {
	}

	public static LazySingleton getLazyton() {
		if (lazyton == null) {
			lazyton = new LazySingleton();
		}
		return lazyton;
	}

}
