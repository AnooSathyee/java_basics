package java_basics;

public class LearningMethods {

	public static void main(String[] args) {

		System.out.println(MyUtils.printSomeJunk("It is an argument!"));
		MyUtils.printSomeJunk(100);
		MyUtils.sum2Numbers(10, 23);
		int num = MyUtils.add10(99);
		System.out.println("The number is >>> " + num);
	}

}
