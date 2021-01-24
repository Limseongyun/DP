package visitor;

public class BusTest {
	public static void main(String[] args) {
		Bus bus = new Bus(10);
		
		bus.drive();
		
		System.out.println(bus.getFuel());
		System.out.println(bus.visit(new CarViewVisitor()));;
	}
}
