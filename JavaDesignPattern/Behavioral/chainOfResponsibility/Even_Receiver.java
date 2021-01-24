package chainOfResponsibility;

public class Even_Receiver extends Receiver {

	public Even_Receiver(String name) {
		super(name);
	}

	@Override
	public boolean resolve(int number) {
		if(number % 2 ==0) return true;
		else return false;
	}

	@Override
	public void done(int number) {
		System.out.println(number + " : " + name + "가 해결");
	}

}
