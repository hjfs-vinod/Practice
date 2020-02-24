package factoryDesignPattern;

public class MobileFactory {
	
	private static MobileFactory mobileScreen;
	private static MobileFactory mobileProcessor;
	private static MobileFactory mobileBattery;
	private MobileFactory() {
	}

	public static Mobile getData(String part, String partName) {
		if (part.equalsIgnoreCase("screen")) {
			return new Screen(partName);
		} else if (part.equalsIgnoreCase("Processor")) {
			return new Screen(partName);
		} else if (part.equalsIgnoreCase("Battery")) {
			return new Screen(partName);
		}

		return null;
	}
}
