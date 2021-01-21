package lambda.ex2;

public class Ramda2 {
	public static void exec(Compare com) {
		int k=10;
		int m=20;
		int value = com.compareTo(k, m);
		System.out.println(value);
	}
	public static void main(String[] args) {
		exec((a,b)->{
			return a+b;
		});
	}
}
