package abstractFactory;

public class FactoryOfComputerFactory {

	public void createComputer(String type) {
		ComputerFac computerFac = null;
		switch (type) {
		case "LG":
			computerFac = new LGComputerFactory();
			break;
		case "Samsung":
			computerFac = new SamsungComputerFactory();
			break;

		default:
			System.out.println("이름이상함");
			break;
		}
		computerFac.createKeyboard();
		computerFac.createMouse();
	}
}
