package lambda.functionalinterface.consumer;

import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
		andThen();
		accept();
		
	}

	private static void andThen() {
		final Consumer<String> consumer1 = (i) -> System.out.println("consumer 1"+ i);
		final Consumer<String> consumer2 = (i) -> System.out.println("consumer 2" + i);
		final Consumer<String> consumer3 = (i) -> System.out.println("consumer 3"+ i);
		consumer1.andThen(consumer2).andThen(consumer3).andThen(consumer1).accept("is Consume!!");
	}
	private static void accept() {
		final Consumer<String> greetings = value -> System.out.println("Hello"+ value);
		greetings.accept("World");
	}
}
