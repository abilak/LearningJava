package methodoverriding;

public class Main {
	public static void main(String[] args) { 
		//  method overriding = Declaring a method in a sub class, 
		//  so that the child class can have its own implementation/variation of the method
		
		Dog dog = new Dog(); 
		
		dog.speak(); // overriding method
		
		Animal animal = new Animal(); 
		
		animal.speak(); // overriden method
	}
}
