package command;

public class MusicPlayerOffCommand implements Command {
	private MusicPlayer musicPlayer;
	
	public MusicPlayerOffCommand(MusicPlayer music) {
		this.musicPlayer = music;
	}

	@Override
	public void execute() {
		musicPlayer.off();
	}

	@Override
	public void undo() {
		System.out.println("-----작업취소-----");
		musicPlayer.on();
	}

}
