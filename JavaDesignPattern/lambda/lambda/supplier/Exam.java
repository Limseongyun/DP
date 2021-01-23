package lambda.supplier;

import java.util.function.IntSupplier;

public class Exam {
	public static void main(String[] args) {
		IntSupplier intSupplier = () -> (int)(Math.random() * 6) + 1;
		
		int num = intSupplier.getAsInt();
		System.out.println(num);
	}
}
