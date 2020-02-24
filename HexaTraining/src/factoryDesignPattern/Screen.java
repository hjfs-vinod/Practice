package factoryDesignPattern;

public class Screen implements Mobile {
	private String part;

	Screen(String part) {
		this.part = part;
	}

	@Override
	public void partName() {
		System.out.println(part);
	}

}
