package chainOfResponsibility;

public class Odd_Receiver extends Receiver {

	public Odd_Receiver(String name) {
		super(name);
	}

	@Override
	public boolean resolve(int number) {
		if(number % 2 != 0) return true;
		else return false;
	}

	@Override
	public void done(int number) {
		System.out.println(number + " : " + name + "가 해결");
	}

}
