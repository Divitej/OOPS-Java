package polymorphism;
class Animal{
	void sound() {
		System.out.println("No particular sound is mentioned");
	}	
}
class Dog extends Animal{
	void sound() {
		System.out.println("Barking...");
	}
	void parentSound() {
		super.sound();
	}
}

public class Overriding {

	public static void main(String[] args) {
		Dog obj1 = new Dog();
		obj1.sound();
		obj1.parentSound();
	}

}
