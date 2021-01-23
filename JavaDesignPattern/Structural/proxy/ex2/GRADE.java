package proxy.ex2;

public enum GRADE {
	Staff, Manager, VicePresident
}
interface Employee{
	String getName();
	GRADE getGrade();
	String getInformation(Employee viewer);
}
class NotAuthorizedException extends RuntimeException{
	private static final long serialVersionUID = -123123123123L;
}