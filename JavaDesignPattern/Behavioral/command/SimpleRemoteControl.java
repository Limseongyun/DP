package command;

public class SimpleRemoteControl {

	Command slot;
	public SimpleRemoteControl() {}
	public void setCommand(Command command) {
		slot = command;
	}
	public void buttonPressed() {
		slot.execute();//excute를 실행하지만 Command 가 무엇을 하는지는 모른다.
	}
}
