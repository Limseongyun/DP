package observer;

public class Lewin implements Crew {

	@Override
	public void update(String msg) {
		System.out.println("Lwin 메세지수신 "+msg);
	}

}
