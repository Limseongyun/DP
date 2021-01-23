package lambda.methodRef;

public class Factory {
	public static final int A_TYPE = 0;
	public static final int B_TYPE = 1;
	public static final int C_TYPE = 2;
	public static final int D_TYPE = 3;
	
	public IType getNewClass(int type) {
		switch (type) {
		case A_TYPE:
			return new IType.A();
		case B_TYPE:
			return new IType.B();
		case C_TYPE:
			return new IType.C();
		case D_TYPE:
			return new IType.D();

		default:
			return new IType.D();
		}
	}
	

}
interface IType{
	class A implements IType{}
	class B implements IType{}
	class C implements IType{}
	class D implements IType{}
}