package lambda.ex1;

public class Person {
	public void hi(Say line) {
		int number = line.something(3, 4);
		System.out.println("Number is "+ number);
	}

	public static void main(String[] args) {
		Person p = new Person();
		p.hi(new Say() {
			
			@Override
			public int something(int a, int b) {
				System.out.println("asdfasdf");
				System.out.println("nice to meet you");
				System.out.println("parameter is "+ a + b);
				return 7;
			}
		});
		
		Person p2 = new Person();
		p2.hi((a,b) ->{
			System.out.println("this is lambda");
			System.out.println("Thank you lambda");
			System.out.println("param is"+a+b);
			return 7;
		});
	}
}
