package singleton;
// ㄴㄴㄴㄴ 이건 아님
public class Singleton {

	public String name;
	
	
	
	private static Singleton singleton;
	
	public Singleton getSingleton() {
		if(singleton == null) {
			Singleton singleton = new Singleton();
			return singleton;
		}
		return singleton;
		
	}
	
	public static void main(String[] args) {
		Singleton a = new Singleton().getSingleton();
		
		System.out.println(a);
		Singleton b = new Singleton().getSingleton();
		System.out.println(b);
	}
}
