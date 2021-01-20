package facade;

public class MicrowaveFacade {
	Cooler cooler;
	Magnetron magnetron;
	TimeChecker timeCheck;
	Turntable turntable;
	Switch[] switches;
	String food;
	boolean isActive = false;
	public MicrowaveFacade() {};
	public MicrowaveFacade(Cooler cooler, Magnetron magnetron, TimeChecker timehCheck, Turntable turntable) {
		super();
		this.cooler = cooler;
		this.magnetron = magnetron;
		this.timeCheck = timehCheck;
		this.turntable = turntable;
		switches = new Switch[] { cooler, magnetron, timehCheck, turntable };
	}
	public void asdf() {
		switches = new Switch[] { cooler, magnetron, timeCheck, turntable };
	}
	
	public void on() {
		for(Switch sw : switches) {
			sw.on();
		}
		isActive = true;
	}
	public void off() {
		for(Switch sw : switches) {
			sw.off();
		}
		isActive = false;
	}

}
