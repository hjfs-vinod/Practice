package factoryDesignPattern;

public class Battery implements Mobile {
	private String part;

	Battery(String part) {
		this.part = part;
	}

	@Override
	public void partName() {
		System.out.println(part);
	}

}
