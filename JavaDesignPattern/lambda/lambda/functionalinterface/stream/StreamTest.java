package lambda.functionalinterface.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamTest {

	static List<Persons> roster = new ArrayList<Persons>();

	static {
		roster.add(new Persons(5, "5살"));
		roster.add(new Persons(10, "10살"));
		roster.add(new Persons(15, "15살"));
		roster.add(new Persons(20, "20살"));
		roster.add(new Persons(25, "25살"));
		roster.add(new Persons(30, "30살"));
	}

	public static void main(String[] args) {
		printPersonWithInRange(roster, 10, 20);

		roster.stream().filter(p -> p.getAge() >= 10 && p.getAge() < 20).forEach(p -> p.printPerson());
		
		roster.stream().map(p -> p.getAge() >= 10 && p.getAge() < 20).forEach(System.out::println);
	}

	public static void printPersonWithInRange(List<Persons> roster, int low, int high) {
		for (Persons p : roster) {
			if (low <= p.getAge() && p.getAge() < high) {
				p.printPerson();
			}
		}
	}

}

class Persons {
	public Persons(int age, String name) {
		this.age = age;
		this.name = name;
	}

	int age;
	String name;

	public void printPerson() {
		System.out.println(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}