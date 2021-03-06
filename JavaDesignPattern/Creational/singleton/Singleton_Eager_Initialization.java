package singleton;

public class Singleton_Eager_Initialization {
//Eager initialization 이른초기화
	private static Singleton_Eager_Initialization uniqueInstance = new Singleton_Eager_Initialization();
	
	private Singleton_Eager_Initialization() {};
	
	public static Singleton_Eager_Initialization getInstance() {
		return uniqueInstance;
	}
	
	public static void main(String[] args) {
		Singleton_Eager_Initialization ref = getInstance();
		System.out.println(ref);
		Singleton_Eager_Initialization ref2 = getInstance();
		System.out.println(ref2);
	}
}
