package java_oop;

public class Animal {
	
	String species;
	int age;
	String gender;
	int weightInLbs;
	
	public Animal(String species) {
		this.species = species;
	}
	
	public Animal(String species, int age, String gender, int weightInLbs) {
		this.species = species;
		this.age = age;
		this.gender = gender;
		this.weightInLbs = weightInLbs;
	}
	
	public void eat() {
		System.out.println(this.species + " is eating"); 
	}
	
	public void sleep() {
		System.out.println(this.species + " is sleeping");
	}
	
}
