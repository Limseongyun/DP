package command;

public class NoCommand implements Command {

	@Override
	public void execute() {
		System.out.println("명령 슬롯이 초기화 되어 있지 않습니다.");
	}

	@Override
	public void undo() {
		System.out.println("----nnn----");
	}

}
