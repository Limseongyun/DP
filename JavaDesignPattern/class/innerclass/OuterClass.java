package innerclass;

public class OuterClass {
	private String outerval ="im outer";
	private static String staticouterval ="im static outerval";
	private InstanceInner instanceinner = new InstanceInner();
	
	
	
	//private String innervalFromouter = instanceinnerval;//외부에서 내부 못보지만
	
	
	private class InstanceInner{
		private String InstanceInnerval ="im instance inner";
		private String outvalFrominnerinstance =outerval;//내부에서 외부 볼수 있다
	}
	protected static class StaticInner{
		private String staticinner ="im static inner";
		//private String outvalFromstaticinner =outerval;//이너스태틱클래스에서는 바로 외부 클래스의 멤버를 접근하지못한다
		private static String outvalFromstaticinner =staticouterval;//하지만 외부 클래스의 스태틱은 접근가능하다
	}
	
	void method1() {
		class LocalInner{}
	}
	
	
	
	///////////////////////////////////
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		System.out.println(outer.outerval);
		InstanceInner instanceinner= outer.instanceinner;
		System.out.println(instanceinner.InstanceInnerval);
	
		//InstanceInner instanceinner1 = new InstanceInner();//외부 클래스르 생성하고 만들어야한다
		
		//내부 생성하려면 외부생성하고 그다음에 내부를 new 를 통해 생성해야한다
		InstanceInner instanceinner2 = outer.new InstanceInner();
		System.out.println(instanceinner2.InstanceInnerval);
		
		
		StaticInner staticinner =new StaticInner();
		
	}

}
