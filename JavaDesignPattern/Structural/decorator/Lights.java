package decorator;

public class Lights extends TreeDecorator {
	public Lights(ChristmasTree christmasTree) {
		super(christmasTree);
	}
	@Override
	public String decorate() {
		return super.decorate() + addLights();
	}
	private String addLights() {
		return "with Light";
	}

}
