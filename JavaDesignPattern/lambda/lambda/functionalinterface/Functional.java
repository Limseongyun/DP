package lambda.functionalinterface;

import java.util.concurrent.locks.Condition;
//Functionalinterface 의 경우 : 메소드가 하나만 있음
@FunctionalInterface
public interface Functional {
	public boolean test(Condition condition);
}

//java.lang.Runnable 도 결과적으로 Functional Interface 
@FunctionalInterface
interface Runnable{
	public void run();
}
//구현해야 할 메소드가 하나 이상있는경우는 Functional Interface가 아님 
//@FunctionalInterface
interface NonFunctional{
	public void actionA();
	public void actoinB();
}
