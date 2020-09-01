package abstractFactory;

public class _AF_ClientMain {

	public static void main(String[] args) {
		//추상팩토리패턴
		//만약 여러 부품이 있다면
		//해당 군집의 부품들을 한번에 생성한다
		//지금은 키보드와 마우스 뿐이지만
		//여러 부품이 있을경우
		//해당하는 군집의 부품객체들이 생성된다
		FactoryOfComputerFactory factoryOfComputerFactory = new FactoryOfComputerFactory();
		factoryOfComputerFactory.createComputer("LG");
	}
}
