package java_oop;

public class Earth {

	public static void main(String[] args) {
		
		Human human1 = new Human("Anu",40, 65.5,"brown");
		human1.speak();
		System.out.println("===========================");
		Human human2 = new Human("Vaish", 16, 67, "brown");
		human2.speak();
		System.out.println("===========================");
		Human human3 = new Human("Anya", 11, 56, "brown");
		human3.speak();
	}

}
