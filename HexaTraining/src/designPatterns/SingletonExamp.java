package designPatterns;
//design paterns
public class SingletonExamp {
	// single to n(one obj to per jvm)
	// private static final variable
	private static final SingletonExamp instance = new SingletonExamp();

	// private constructor
	private SingletonExamp() {
	}

	// have accessor to acess instance
	public static SingletonExamp getInstance() {
		return instance;
	}
    public void test() {
    	System.out.println("test");
    }
}
