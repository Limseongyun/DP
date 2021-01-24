package lambda.functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String[] args) {
		tests();
		and_or_negate();
	}

	private static void and_or_negate() {
		Predicate<Integer> predicateA = a -> a % 2 == 0;
		Predicate<Integer> predicateB = b -> b % 3 == 0;
		boolean result;
		result = predicateA.and(predicateB).test(9);
		//인자로 받은 다른 Predicate 의 람다 수행 내용과 , 자기 자신의 람다 수행 내용을 &&연산합니다.
		System.out.println(" 9 는 2와 3의 배수 입니까?" + result);

		result = predicateA.or(predicateB).test(9);
		//인자로 받은 다른 Predicate 의 람다 수행 내용과 , 자기 자신의 람다 수행 내용을 || 연산합니다.
		System.out.println("9는 2또는3의 배수 입니까?" + result);

		result = predicateA.negate().test(9);
		//람다수행내용을 연산합니다.
		System.out.println("9는 홀수 입니까? " + result);
	}

	private static void tests() {
		Predicate<Integer> isZero = (i) -> i == 0;
		System.out.println(isZero.test(0));
	}
}
