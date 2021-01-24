package visitor;

public class CarViewVisitor implements ViewVisitor {
	private static final String BUS_STATUS = "현재 버스의 기름 상태 : ";
	private static final String TRUCK_STATUS = "현재 트럭의 기름 상태 : ";
	

	@Override
	public String visit(Bus bus) {
		return BUS_STATUS + bus.getFuel();
	}

	@Override
	public String visit(Truck truck) {
		return TRUCK_STATUS + truck.getFuel();
	}

}
