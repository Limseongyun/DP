package command;

public class RemoteControlTest {
//	public static void main(String[] args) {
//		SimpleRemoteControl remote = new SimpleRemoteControl();
//		Light light = new Light("s");
//		LightOnCommand lightOn = new LightOnCommand(light);
//		
//		remote.setCommand(lightOn);
//		remote.buttonPressed();
//	}
	public static void main(String[] args) {
		MultiRemoteControl remote = new MultiRemoteControl();
		
		//리시버 및 커맨드 객체 생성 
		Light livingLight = new Light("거실");
		LightOnCommand livingLightOn = new LightOnCommand(livingLight);
		LightOffCommand livingLightOff = new LightOffCommand(livingLight);
		
		Light kitchenLight = new Light("부엌");
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		MusicPlayer musicPlayer = new MusicPlayer();
		MusicPlayerOnCommand musicPlayerOnCommand = new MusicPlayerOnCommand(musicPlayer);
		MusicPlayerOffCommand musicPlayerOffCommand = new MusicPlayerOffCommand(musicPlayer);
		//인보커 객체의 커맨드 배열에 커맨드 저장
		remote.setCommand(0, livingLightOn, livingLightOff);
		remote.setCommand(1, kitchenLightOn, kitchenLightOff);
		remote.setCommand(2, musicPlayerOnCommand, musicPlayerOffCommand);
		
		//인보커 객체의 커맨드 객체의 execute() 메소드 호
		remote.onButtonPressed(0);
		remote.onButtonPressed(1);
		remote.onButtonPressed(2);
		
		remote.undoButtonPressed();
		
		remote.offButtonPressed(0);
		remote.offButtonPressed(1);
		
		remote.undoButtonPressed();
		
		remote.offButtonPressed(2);
		
		remote.onButtonPressed(4);
		remote.offButtonPressed(4);
		System.out.println("----------------");
		Command[] partyOn = {livingLightOn,kitchenLightOn,musicPlayerOnCommand};
		Command[] partyOff = {livingLightOff,kitchenLightOff,musicPlayerOffCommand};
		
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		
		remote.setCommand(0, partyOnMacro, partyOffMacro);
		
		remote.onButtonPressed(0);
		remote.undoButtonPressed();
		remote.offButtonPressed(0);
		
		
	}
}
