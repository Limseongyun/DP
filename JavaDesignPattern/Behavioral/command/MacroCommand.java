package command;

public class MacroCommand implements Command{
	Command[] commands;

	
	public MacroCommand(Command[] commands) {
		this.commands = commands;
	}
	@Override
	public void execute() {
		for(Command e : commands) {
			e.execute();
		}
		
	}

	@Override
	public void undo() {
		for(Command e : commands) {
			e.undo();
		}
	}

}
