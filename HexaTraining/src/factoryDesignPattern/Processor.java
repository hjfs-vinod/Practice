package factoryDesignPattern;

public class Processor implements Mobile {
	private String part;

	Processor(String part) {
		this.part = part;
	}

	@Override
	public void partName() {
		System.out.println(part);

	}

}
