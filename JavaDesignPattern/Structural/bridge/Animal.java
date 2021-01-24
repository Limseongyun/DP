package bridge;

public abstract class Animal {
	private Hunting_Handler hunting;
	
	public Animal(Hunting_Handler hunting) {
		this.hunting = hunting;
	}
	
	public void find_Quarry() {
		hunting.Find_Quarry();
	}
	
	public void detected_Quarry() {
		hunting.Detected_Quarry();
	}
	
	public void attack() {
		hunting.attack();
	}
	
	public void hunt() {
		find_Quarry();
		detected_Quarry();
		attack();
	}
}
