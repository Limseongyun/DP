package decorator;

public class DecoratorDemo {
	public static void main(String[] args) {
		ChristmasTree tree = new DefaultChristmasTree();
		System.out.println(tree.decorate());
		
		ChristmasTree treeWithLights = new Lights(new DefaultChristmasTree());
		System.out.println(treeWithLights.decorate());
		
		ChristmasTree treeWithLightsAndFlowers = new Flower(new Lights(new DefaultChristmasTree()));
		System.out.println(treeWithLightsAndFlowers.decorate());
	}
}
