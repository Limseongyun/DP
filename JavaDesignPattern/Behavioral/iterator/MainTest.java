package iterator;

import java.util.Iterator;

public class MainTest {
	public static void main(String[] args) {
		Goatherd goatherd = new Goatherd();
		Shepherd shepherd = new Shepherd();
		
		Iterator<Integer> goatIter = goatherd.createIterator();
		Iterator<Sheep> sheepIter = shepherd.createIterator();
		
		while(goatIter.hasNext()) {
			Goat goat =goatherd.GOATS.get(goatIter.next());
			goat.sound();
		}
		while(sheepIter.hasNext()) {
			Sheep sheep = sheepIter.next();
			sheep.sound();
		}
	}
}
