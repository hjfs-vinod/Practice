package designPatterns;

public class ThreadSafeSingletonMain {
	public static void main(String[] args) {
		ThreadSafeSingleton threadsafe1 = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton threadsafe2 = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton threadsafe3 = ThreadSafeSingleton.getInstance();
		System.out.println(threadsafe1);
		System.out.println(threadsafe2);
		System.out.println(threadsafe3);
	}
}
