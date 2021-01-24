package bridge;

public class MainTest {
	public static void main(String[] args) {
		Animal tiger = new Tiger(new Hunting_Method2());
		Animal bird = new Bird(new Hunting_Method1());
		tiger.hunt();
		System.out.println("--------------------");
		bird.hunt();
	}
}
