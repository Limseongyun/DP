package chainOfResponsibility;

public class MainTest {
	public static void main(String[] args) {
		Receiver odd_receiver = new Odd_Receiver("홀수 리시버");
		Receiver even_reveiver = new Even_Receiver("짝수 리시버");
		
		odd_receiver.setNext(even_reveiver);
		for(int i = 1; i< 21; i++) {
			odd_receiver.support(i);
		}
	}
}
