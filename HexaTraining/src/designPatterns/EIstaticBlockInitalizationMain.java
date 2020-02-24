package designPatterns;

public class EIstaticBlockInitalizationMain {
	public static void main(String[] args) {
		EIstaticBlockInitalization elsbi= EIstaticBlockInitalization.getInstance();
		EIstaticBlockInitalization elsbi1= EIstaticBlockInitalization.getInstance();
		System.out.println(elsbi);
		System.out.println(elsbi1);
	}
}
