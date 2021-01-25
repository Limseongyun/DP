package observer;

public class Jay implements Crew{

	@Override
	public void update(String msg) {
		System.out.println("jay 메세지 수신> "+ msg);
	}

}
