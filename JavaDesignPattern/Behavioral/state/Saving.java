package state;

public class Saving implements PowerState {

	@Override
	public void powerPush() {
		System.out.println("power saving");
	}

}
