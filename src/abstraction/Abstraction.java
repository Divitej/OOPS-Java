package abstraction;

abstract class Bike{
	abstract void mileage();
	abstract void highestSpeed();
	void note() {
		System.out.println("Drive Safe!!!");
	}
}
class Honda extends Bike{

	@Override
	void mileage() {
		System.out.println("My Mileage is 50KMPL");
	}

	@Override
	void highestSpeed() {
		System.out.println("My Highesh Speed is 80KMPH");
		
	}
	
}
class RoyalEnfield extends Bike{

	@Override
	void mileage() {
		System.out.println("My Mileage is 35KMPL");
	}

	@Override
	void highestSpeed() {
		System.out.println("My Highesh Speed is 120KMPH");
		
	}
	
}
public class Abstraction {

	public static void main(String[] args) {
		Bike obj1 = new Honda();
		Bike obj2 = new RoyalEnfield();
		obj1.mileage();
		obj1.highestSpeed();
		obj2.mileage();
		obj2.highestSpeed();
		obj1.note();
		obj2.note();

	}

}
