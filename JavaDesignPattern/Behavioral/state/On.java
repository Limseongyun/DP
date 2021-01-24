package state;

public class On implements PowerState {
	@Override
	public void powerPush() {
		System.out.println("power On");
	}
}
