package lambda.functionalinterface.function;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		compose();
		andThen();
		identity();
	}
	
	private static void compose() {
		final Function<Integer, String> intToString = Object::toString;
		final Function<String, String> quote = s -> "'" + s + "'";
		
		final Function<Integer, String> quoteIntToString = quote.compose(intToString);
		System.out.println(quoteIntToString.apply(5));
		//인터페이스 A.compose(인터페이스B);
		//B	실행 -> A 실행
	}
	private static void andThen() {
		final Function<String, String> upperCase = String::toUpperCase;
		String result = upperCase.andThen(s -> s + "abc").apply("a");
		System.out.println(result);
		//인터페이스 A.andThen(인터페이스B);
		//A	실행 -> B 실행
	}
	private static void identity() {
		final Function<Integer, String> intToStr = Object::toString;
		System.out.println(intToStr.apply(10));
		
		final Function<Integer, Integer> identiry = Function.identity();
		System.out.println(identiry.apply(100));
	}
}

