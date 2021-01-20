package facade;

public class User {
	public static void main(String[] args) {
		MicrowaveFacade mic = new MicrowaveFacade();
		mic.cooler = new Cooler();
		mic.magnetron = new Magnetron();
		mic.timeCheck = new TimeChecker(4000, mic);
		mic.turntable = new Turntable();
		mic.asdf();
		mic.on();
	}
}
