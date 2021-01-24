package visitor;

public class Truck implements Car {
	private int fuel;
	
	public Truck(final int fuel) {
		this.fuel = fuel;
	}
	@Override
	public int drive() {
		return --fuel;
	}

	@Override
	public int getFuel() {
		return fuel;
	}
	@Override
	public String visit(ViewVisitor viewVisitor) {
		return viewVisitor.visit(this);
	}

}
