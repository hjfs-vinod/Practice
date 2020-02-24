package designPatterns;

public class SingletonTest {
	public static void main(String[] args) {
		SingletonExamp singleton = SingletonExamp.getInstance();
		
		//test
		SingletonExamp singleton2 = SingletonExamp.getInstance();
		System.out.println(singleton);
		
		//singleton=null;---------------------------->> test
		singleton.test();
		System.out.println(singleton2);
		singleton2.test();
	}
}
