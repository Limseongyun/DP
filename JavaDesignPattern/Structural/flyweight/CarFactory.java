package flyweight;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
	Map<String, Car> pool;
	public CarFactory() {
		pool = new HashMap<String, Car>();
	}
	
	public Car getCar(String key) {
		Car car = pool.get(key);
		if(car == null) {
			car = new Car(key);
			pool.put(key, car);
			System.out.println("새로 생성 : " + key);
		} else {
			System.out.println("재사용 : "+ key);
		}
		return car;
	}
}
