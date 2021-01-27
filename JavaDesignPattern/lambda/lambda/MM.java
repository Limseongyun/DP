package lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MM {
	public static void main(String[] args) {
		int test = asdf(1,22,(a, b)-> a+b);
		System.out.println(test);
	}
	
public static int asdf(int a, int b, BiFunction<Integer, Integer, Integer> lamda) {
		return lamda.apply(a, b);
	}
}
