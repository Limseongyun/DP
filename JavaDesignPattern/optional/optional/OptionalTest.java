package optional;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class OptionalTest {
	
	public String test1(String a) {
		System.out.println("test1");
		return a;
	}
	public static void main(String[] args) {
		Optional<String> optional = Optional.empty();
		System.out.println(optional);
		System.out.println(optional.isPresent());
		System.out.println(optional.orElse("null"));
		
	}
}
