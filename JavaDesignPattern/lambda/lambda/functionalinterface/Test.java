package lambda.functionalinterface;

import java.util.Random;

//lambda 식은 functional Interface 의 인터페이스를 생성합니다.
public class Test {
	public static void main(String[] args) {
		int firstNumber = 5;
		int secondNumber = 94;
		int result = ArithmeticCalculator.calculate(firstNumber, secondNumber, (a, b) -> a+b);
		System.out.println(result);
		System.out.println("=================================");
		ArithmeticOperator plusOperator = (a, b) -> a+b;
		ArithmeticOperator minusOperator = (a, b) -> a-b;
		ArithmeticOperator multiplyOperator = (a, b) -> a * b;
		ArithmeticOperator divideOperator = (a, b) -> {
			if(b == 0) b = 1;
			return a/b;
		};
		ArithmeticOperator spareOperator = (a, b) -> {
			if(b == 0) b = 1;
			return a % b;
		};
		int a = new Random().nextInt(10000);
		int b = new Random().nextInt(10000);
		int plus = plusOperator.operate(a, b);
		int minus = minusOperator.operate(a, b);
		int multiply = multiplyOperator.operate(a, b);
		int divide = divideOperator.operate(a, b);
		int spare = spareOperator.operate(a, b);
		
		System.out.println(plus);
		System.out.println(minus);
		System.out.println(multiply);
		System.out.println(divide);
		System.out.println(spare);
	}
}
@FunctionalInterface
interface ArithmeticOperator{
	public int operate(int a, int b);
}
class ArithmeticCalculator{
	public static int calculate(int a, int b, ArithmeticOperator operator) {
		return operator.operate(a, b);
	}
}
