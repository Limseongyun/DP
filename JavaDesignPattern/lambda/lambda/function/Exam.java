package lambda.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class Exam {
	private static List<Student> list = Arrays.asList(new Student("lsy", 100, 100), new Student("dumlsy", 0, 0));
	public static void printString(Function<Student, String> function) {
		for(Student student : list) {
			System.out.println(function.apply(student)+" ");
		}
		System.out.println();
	}
	public static void printInt(ToIntFunction<Student> function) {
		for(Student student : list) {
			System.out.println(function.applyAsInt(student)+" ");
		}
		System.out.println();
	}
	public static double getAverage(ToDoubleFunction<Student> function) {
		int sum = 0;
		for(Student student : list) {
			sum += function.applyAsDouble(student);
		}
		double average = sum/list.size();
		return average;
	}
	
	public static void main(String[] args) {
		System.out.println("학생이름 ");
		printString(Student::getName);
		
		System.out.println("영어점수");
		printInt(Student::getEnglishScore);
		
		System.out.println("수학점수");
		printInt(Student::getMathScore);
		
		double englishAvg = getAverage(Student::getEnglishScore);
		double mathAvg = getAverage(Student::getMathScore);
		
		System.out.println("영어점수 평균 : "+ englishAvg);
		System.out.println("수학점수 평균 : "+ mathAvg);
	}
}
