package singleton;

public class Singleton_Lazy_Initialization {

	private static Singleton_Lazy_Initialization uniqueInstance;
	
	private Singleton_Lazy_Initialization() {};
	
	//Lazy Initializaion
	public static synchronized Singleton_Lazy_Initialization getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton_Lazy_Initialization();
		}
		
		return uniqueInstance;
	}
	
	public static void main(String[] args) {
		Singleton_Lazy_Initialization sing_L1 = getInstance();
		System.out.println(sing_L1);
		Singleton_Lazy_Initialization sing_L2 = getInstance();
		System.out.println(sing_L2);
	}
	
}
