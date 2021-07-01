package java_basics;

public class MyUtils {
	
	public static String printSomeJunk(String argument) {
		System.out.println("SomeJunk " + argument);
		return argument;
	}
	
	public static void printSomeJunk(int argument) {
		System.out.println("SomeJunk " + argument);
	}
	
	public static void sum2Numbers(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public static int add10(int someArgs) {
		int result = someArgs + 10;
		return result;
	}
}
