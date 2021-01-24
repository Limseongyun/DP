package memento;

public class Memento {
	private String Data1;
	private int Data2;
	public Memento(String data1, int data2) {
		super();
		Data1 = data1;
		Data2 = data2;
	}
	public String getData1() {
		return Data1;
	}
	public int getData2() {
		return Data2;
	}
	
}
