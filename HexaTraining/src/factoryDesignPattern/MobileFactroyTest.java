package factoryDesignPattern;

public class MobileFactroyTest {
	public static void main(String[] args) {
		Mobile instance1 = MobileFactory.getData("screen", "OLED");
		Mobile instance2 = MobileFactory.getData("screen", "OLED");
		Mobile instance3  = MobileFactory.getData("screen", "OLED");
		System.out.println(instance1);
		System.out.println(instance2);
		System.out.println(instance3);
		instance1.partName();
		instance2.partName();
		instance3.partName();
	}
}
