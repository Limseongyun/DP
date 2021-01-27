package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streamtest {
	static List<String> names = Arrays.asList("jeong","pro","jdk","java");
	public static void main(String[] args) {
		names.stream();
		Double[] dArray = {3.1,3.2,3.3};
		Arrays.stream(dArray);
		
		Stream<Integer> str = Stream.of(1,2);
		
		Stream<String> a = names.stream().filter(x -> x.contains("o"));
		a.forEach(x -> System.out.println(x));
		
		List<String> names = Arrays.asList("jeong","pro","jdk","java");
		names.parallelStream()
			.map(x -> x.concat("s"))
			.forEach(System.out::println);
		
	}
}
