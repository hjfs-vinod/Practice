package designPatterns;

// early initialization
public class EIstaticBlockInitalization {
	private static EIstaticBlockInitalization instance;

	private EIstaticBlockInitalization() {}

	static {
		try {
			instance = new EIstaticBlockInitalization();
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public static EIstaticBlockInitalization getInstance() {
		return instance;
	}

}
