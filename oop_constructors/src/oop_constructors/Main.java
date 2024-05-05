package oop_constructors;

public class Main {
	public static void main(String[] args) { 
		// constructor = special method that is called when object is instantiated
		
		Human human1 = new Human("MrPizzaFarmer", 13, 92.6);
		
		Human human2 = new Human("option_f4",12, 86.3);
		
		System.out.println(human1.name);
		System.out.println(human2.name);
		
		human1.eat("peetsa");
		human1.drink("Coke");
		
		
		human2.eat("cake");
		human2.drink("Sprite");
	}
	
}
