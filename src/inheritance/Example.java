package inheritance;
class GrandFather{
	void display() {
		System.out.println("I am Grand Father");
	}
}
class Father extends GrandFather{
	void show() {
		System.out.println("I am Father");
	}
	
}
class Son extends Father{
	void see() {
		System.out.println("I am Child");
	}
}
public class Example {

	public static void main(String[] args) {
		Son obj = new Son();
		obj.see();
		obj.show();
		obj.display();

	}

}
