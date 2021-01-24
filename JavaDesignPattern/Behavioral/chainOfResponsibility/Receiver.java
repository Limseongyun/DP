package chainOfResponsibility;

public abstract class Receiver {
	public String name;//리시버 이름 
	private Receiver next = null;// 다음 수신 객체 
	
	public Receiver(String name) {
		this.name = name;
	}
	
	public Receiver setNext(Receiver next) {//다음에 수신할 객체 지정
		this.next = next;
		return next;
	}
	
	public final void support(int number) {//처리 
		if(resolve(number)) {
			done(number);
		}else if(next != null) {
			next.support(number);
		}else {
			System.out.println("어떤 객체도 처리하지 못함");
		}
	}
	
	public abstract boolean resolve(int number);
	public abstract void done(int number);
}
