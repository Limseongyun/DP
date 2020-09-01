package abstractFactory;

public class MouseFactory {

	public Mouse createMouse(String type) {
		Mouse mouse =null;
		switch (type) {
		case "LG":
			mouse = new LGMouse();
			break;
		case "Samsung":
			mouse = new SamsungMouse();
			break;

		default:
			System.out.println("이름 이상함");
			
		}
		return mouse;
	}
}
