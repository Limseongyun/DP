package memento;

public class User {
	public static void main(String[] args) {
		new User().exe();
	}
	Information info;
	CareTaker careTaker;
	public void exe() {
		info = new Information("Data1", 10);
		careTaker = new CareTaker();
		careTaker.push(info.createMemento());
		info.setData1("Data2");
		info.setData2(20);
		System.out.println("현재 Data1 : " + info.getData1());
		System.out.println("현재 Data2 : " + info.getData2());
		
		info.restoreMemento(careTaker.pop());
		System.out.println("복구된 Data1 : "+ info.getData1());
		System.out.println("복구된 Data2 : "+ info.getData2());
	}
}
