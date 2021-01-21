package adapter;

public class TicketMachine {
	public static void main(String[] args) {
		TicketA ticketA = new TicketSystemA();
		ticketA.choice(1);
		ticketA.buy();
		ticketA.print();
		
		System.out.println("------------");
		try {
			TicketG ticketG = new TicketAdapter(new TicketSystemA());
			ticketG.choice(1);
			ticketG.buyOnOffline();
			ticketG.buyOnOnline();
			ticketG.print();
			ticketG.getMenu();
			System.out.println(ticketG.getMenu());
		} catch (Exception e) {
			System.out.println("지원 되지 않는 기능 ");
		}
	}
}
