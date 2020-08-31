package factoryMethod;



public class _RobotFactory {

	public _Robot createRobot(String name) {
		
		switch (name) {
		case "super":
			return new SuperRobot();
			
		case "power":
			
			return new PowerRobot();

		default:
			System.out.println("이름이 이상함");
			return null;
		}
		
		
	}
	
	
	/////////////////////////////////
	public static void main(String[] args) {
		//팩토리를 만들어서
		_RobotFactory factory = new _RobotFactory();
		//new 없이 객체를 반환 받는다
		_Robot robot1 = factory.createRobot("super");
		_Robot robot2 = factory.createRobot("power");
		
		System.out.println("robot1 >>"+robot1.getName());
		System.out.println("robot2 >>"+robot2.getName());
	}
}
