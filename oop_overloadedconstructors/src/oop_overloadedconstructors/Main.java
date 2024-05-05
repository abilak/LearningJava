package oop_overloadedconstructors;

public class Main {

	public static void main(String[] args) {
		// overloaded constructors = multiple constructors within a class with the same name
		// but have diff parameters
		// name + parameters = signature
		// sounds a lot like overloaded methods...
		
		Pizza pizza = new Pizza("thicc crust", "tomato", "mozzerella", "jalapenos"); 
		
		System.out.println("Here are the ingredients of your pizza: " + pizza.bread + ", " + 
		pizza.cheese + ", " + pizza.sauce + ", " + pizza.topping + '.');
		
		Pizza pizza2 = new Pizza("thicc crust", "tomato", "mozzerella"); 
		
		System.out.println("Here are the ingredients of your pizza: " + pizza2.bread + ", " + 
		pizza2.cheese + ", " + pizza2.sauce + ", " + pizza2.topping + '.');
	
		
	}

}
