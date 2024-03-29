package java_oop;

public class Human {

	String name;
	int age;
	double heightInInches;
	String eyeColor;

	public Human() {

	}	

	public Human(String name, int age, double heightInInches, String eyeColor) {
		this.name = name;
		this.age = age;
		this.heightInInches = heightInInches;
		this.eyeColor = eyeColor;
	}

	public void speak() {
		System.out.println("Hello My name is >>> " + name);
		System.out.println("I am " + heightInInches + " inches tall!");
		System.out.println("I am " + age + " years old.");
		System.out.println("My eye color is >>> " + eyeColor);
	}

	public void eat() {
		System.out.println(this.name + " is eating ...");
	}

	public void walk() {
		System.out.println(this.name + " is walking....");
	}

	public void work() {
		System.out.println(this.name + " is working...");
	}
}
