package abstractFactory;

public class _F_ClientMain {
public static void main(String[] args) {
	//일반적인 팩토리 패턴
	//만약 키보드와 마우스 이외의 부품들도 있다고한다면 긴코드를 작해야한다
	//
	ComputerFactory computerFactory = new ComputerFactory();
	computerFactory.createComputer("Samsung");
	computerFactory.createComputer("LG");
}
}
