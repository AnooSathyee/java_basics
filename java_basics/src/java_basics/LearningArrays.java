package java_basics;

import java.util.Arrays;

public class LearningArrays {

	public static void main(String[] args) {

		int values[] = new int[10];
		values[0] = 10;
		values[9] = 100;
		System.out.println(Arrays.toString(values));
		double values1[] = new double[10];
		values1[0] = 10;
		values1[9] = 100;
		System.out.println(Arrays.toString(values1));

		String[] words = {"My", "name ", "is", "Anoo!"};
		System.out.println(Arrays.toString(words));

	}

}
