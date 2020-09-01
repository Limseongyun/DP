package abstractFactory;

public class KeyboardFactory {

	public Keyboard createKeyboard(String type) {
		Keyboard keyboard = null;
		switch (type) {
		case "LG":
			keyboard = new LGKeyboard();
			return keyboard;
		case "Samsung":
			keyboard = new SamaungKeyboard();
			return keyboard;
		default:
			System.out.println("이름 이상함");
			break;
		}
		return keyboard;
	}
}
