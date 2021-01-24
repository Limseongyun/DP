package state;

public class Off implements PowerState {

	@Override
	public void powerPush() {
		System.out.println("power push");
	}

}
