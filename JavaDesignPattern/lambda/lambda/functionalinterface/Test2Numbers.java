package lambda.functionalinterface;

import java.util.Random;
import java.util.function.Function;
//별도의 인터페이스나 메소드 없이  java.util.function.Function 인터페이스를 직접사용
public class Test2Numbers {
	private int first;
	private int second;
	public Test2Numbers(int first, int second) {
		this.first = first;this.second = second;
	}
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public static void main(String[] args) {
		Function<Test2Numbers, Integer> plusOperator = n -> n.getFirst() + n.getSecond();
		Function<Test2Numbers, Integer> minusOperator = n -> n.getFirst() - n.getSecond();
		Function<Test2Numbers, Integer> multiplyOperator = n -> n.getFirst() * n.getSecond();
		Function<Test2Numbers, Integer> divideOperator = n -> {
			if(n.getSecond() == 0) {
				return 0;
			}
			return n.getFirst() / n.getSecond();
		};
		Function<Test2Numbers, Integer> spareOperator = n -> {
			if(n.getSecond() == 0) {
				return 0;
			}
			return n.getFirst() % n.getSecond();
		};
		Test2Numbers numbers = new Test2Numbers(new Random().nextInt(10000), new Random().nextInt(10000));
		int plus = plusOperator.apply(numbers);
		int minus = minusOperator.apply(numbers);
		int multiply = multiplyOperator.apply(numbers);
		int divide = divideOperator.apply(numbers);
		int spare = spareOperator.apply(numbers);
		System.out.println(plus);
		System.out.println(minus);
		System.out.println(multiply);
		System.out.println(divide);
		System.out.println(spare);
	}
}
