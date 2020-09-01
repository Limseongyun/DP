package builder;


public class Person {

	private String name;
	private Integer height;
	private Integer age;
	private String gender;
	private Integer money; //optional
	
	
	
	
	
	
	public Person(String name, Integer height, Integer age, String gender, Integer money) {
		this.name = name;
		this.height = height;
		this.age = age;
		this.gender = gender;
		this.money = money;
	}






	static class Builder{
		private String name;
		private Integer height;
		private Integer age;
		private String gender;
		private Integer money; //optional
		
		
		public Builder() {}
		
		
		
//		public Builder(String name, Integer height, Integer age, String gender) {
//			super();
//			this.name = name;
//			this.height = height;
//			this.age = age;
//			this.gender = gender;
//		}



		public Builder name(String name) {
			this.name = name;
			return this; // 이렇게 하면 . 으로 체인을 이어갈 수 있다.
		}
		public Builder height(Integer height) {
			this.height = height;
			return this;
		}
		public Builder age(Integer age) {
			this.age = age;
			return this;
		}
		public Builder gender(String gender) {
			this.gender = gender;
			return this;
		}
		public Builder money(Integer money) {
			this.money = money;
			return this;
		}
		public Person build() {
			//필수 값들이 할당되지 않으면 예외 처리
//			if(name ==null
//			|| height == null
//			|| age == null
//			|| gender == null) {
//				throw new IllegalStateException("cannot crate person");
//			}
			return new Person(name,height,age,gender,money);
		}
		
	}
	
	
	
	
	///////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Person ref =new Person.Builder()
				.name("ss")
				.age(14)
				.height(12123)
				.gender("남").build();
		System.out.println(ref);
		
		
	}
}
