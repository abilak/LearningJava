package toString;

public class Main {
	public static void main(String[] args) { 
		/* 
		 toString() = special method that all objects inherit
		 returns a string that "textually represents an object"
		 can be implicitly and explicitly 
		 */
		
		Car car = new Car();
		
		System.out.println(car.make);
		System.out.println(car.model);
		System.out.println(car.color);
		System.out.println(car.year);
		// lot of work tho
		
		System.out.println(car); // this gives the address to find it in your computer's memory(if you delete the overriden toString() method in Car class)
		// implicit
		
		System.out.println(car.toString()); // same thing. explicit
		
		// but we an override this to give a textual representation of the object!
		
		
	}
	
	
}
