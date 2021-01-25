package observer;

public class Tiber implements Crew {

	@Override
	public void update(String msg) {
		System.out.println("티버 수신 "+ msg);
	}

}
