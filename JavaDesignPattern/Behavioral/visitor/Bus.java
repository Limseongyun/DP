package visitor;

public class Bus implements Car {
	private int fuel;
	
	public Bus(final int fuel) {
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
