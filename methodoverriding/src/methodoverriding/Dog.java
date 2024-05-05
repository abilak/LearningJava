package methodoverriding;

public class Dog extends Animal{
	
	@Override // good practice to do this
	void speak() { // overriding method of the overriden method in Animal class
		System.out.println("The dog goes *bark*");
	}
}
