package recursion;

public class Recursion_Test {

	public static void main(String[] args) {
		System.out.println(Function(3));
	}
	public static long Function(long num) {
		if(num == 1) return 1;
		else return num + Function(num - 1);
	}
}
