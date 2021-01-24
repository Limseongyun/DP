package lambda.functionalinterface;

public interface Ex2 {

}
//Interfae 의 구현체들이 Object 객체의 메서드들을 모두 갖고 있기 때문에 이 메서드들은 functionalInterface의대상이 되지 않는
//@FunctionalInterface
interface NotFunctional{
	boolean equals(Object obj);
}

//Obj객체의 메소드를 제외하고 하나의 추상 메소드만 선언되어 있는경우 Functional Interface 임
@FunctionalInterface
interface Functional2{
	public boolean equals(Object obj);
	public void execute();
}

//Object 객체의 clone 메소드는 public 메소드가 아니기 때문에 Functional Interface 의 대상이 됨
@FunctionalInterface
interface Functional3{
	Object clone();
}
//@FunctionalInterface
interface NotFunctional2{
	public Object clone();
	public void execute();
}