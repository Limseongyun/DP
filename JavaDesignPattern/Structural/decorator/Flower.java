package decorator;

public class Flower extends TreeDecorator {
	public Flower(ChristmasTree christmasTree) {
		super(christmasTree);
	}
	
	private String addFlowers() {
		return "with Flowers";
	}
	
	@Override
	public String decorate() {
		return super.decorate() + addFlowers();
	}
}
