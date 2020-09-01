package abstractFactory;

public class LGComputerFactory implements ComputerFac {
	@Override
	public LGKeyboard createKeyboard() {
		return new LGKeyboard();
	}
	@Override
	public LGMouse createMouse() {
		return new LGMouse();
	}
}
