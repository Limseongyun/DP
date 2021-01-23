package lambda.methodRef;

import java.util.HashMap;
import java.util.function.Supplier;

public class LambdaFactory {
	public static final int A_TYPE = 0;
	public static final int B_TYPE = 1;
	public static final int C_TYPE = 2;
	public static final int D_TYPE = 3;
	
	public static HashMap<Integer, Supplier<IType>> mTypeFactoryMap;
	
	static {
		mTypeFactoryMap = new HashMap<Integer, Supplier<IType>>();
		mTypeFactoryMap.put(A_TYPE, IType.A::new);
		mTypeFactoryMap.put(A_TYPE, IType.B::new);
		mTypeFactoryMap.put(A_TYPE, IType.C::new);
		mTypeFactoryMap.put(A_TYPE, IType.D::new);
	}
	public IType getNewClass(int type) {
		int key = D_TYPE;
		if(mTypeFactoryMap.containsKey(type)) {
			key = type;
		}
		return mTypeFactoryMap.get(key).get();
		//여기서 중요한 점은 생성자 reference를 사용할 경우 객체의 생성이 delay된다는 점입니다. 즉 lazy initialize가 가능하게 됩니다. 
		//실제 객체는 constructor1.get(); 처럼 get()을 호출하는 순간이나,  constructor2.apply("새우깡"); 을 호출하는 순간에 생성됩니다. 

	}

}
