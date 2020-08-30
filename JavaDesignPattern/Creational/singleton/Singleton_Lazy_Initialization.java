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
	
}
