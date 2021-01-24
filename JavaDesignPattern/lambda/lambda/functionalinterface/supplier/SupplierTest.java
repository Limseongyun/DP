package lambda.functionalinterface.supplier;

import java.util.function.Supplier;

public class SupplierTest {
	//Supplier를 활용하면 값을 그냥 전하는 것이 아니라 중간에 로직을 추가해서 전달할 수 있습니다.
	public static void main(String[] args) {
		Supplier<Integer> intSupplier = () ->{
			int num = (int) (Math.random() * 6) + 1;
			return num;
		};
		int num = intSupplier.get();
		System.out.println("눈의 수 "+ num);
	}
}
