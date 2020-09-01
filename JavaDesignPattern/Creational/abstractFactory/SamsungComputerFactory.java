package abstractFactory;

public class SamsungComputerFactory implements ComputerFac {
	@Override
	public SamaungKeyboard createKeyboard() {
		return new SamaungKeyboard();
	}
	@Override
	public SamsungMouse createMouse() {
		return new SamsungMouse();
	}
}
