package methods;

public class Main {
	// method = a block of code that is executed whenever it is called upon(OOP intro-ish)
	public static void main(String[] args) { 
		// example: 
		// the main method!
		// anything inside the set of the curly braces, is called upon
		// we can create our own methods
		// it is essentially like functions in python
		// we can create our own functions
		// and call upon them when needed
		
		String name = "option_f4";
		
		int age = 21;
		
		hello(name, age); // calls the method, with the arguments
		
		// return types
		
		int x = 3;
		int y = 4;
		
		int z = add(3,4);
		System.out.println(z);
	}
	// void means we are returning nothing, but if we are, then we don't use void
	static void hello(String aName, int anAge) {  // creates our own method 
		// parameters are a String, and int = aName, anAge
		System.out.println("Hello "+aName);
		System.out.println("You are " + anAge + " years old.");
	}
	
	static int add(int x, int y) { 
		return x+y; // we are returning something, so we can't put void
		// instead, since we are returning an integer, we write static int as we are returning an int
	}
	
}
