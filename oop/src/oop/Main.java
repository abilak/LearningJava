package oop;

public class Main {
	public static void main(String[] args) { 
		// object = an instance of a class that  may contain attributes and methods
		// example: phone, desk, pc, coffee, mac
		// attributes = adjectives/characteristics
		// methods = verbs, what it can do(like we talked about already in the method project)
		
		// coffee cup
		// String color = "white";
		// double temp = 25.4;
		// String inside_color = "brown";
		// boolean empty = false;
		// attributes
		
		// coffee cup
		// spill
		// drink
		// methods
		
		Car myCar1 = new Car(); // creates new instance of car
		
		Car myCar2 = new Car();

		System.out.println(myCar1.model); // accessing attribute
		System.out.println(myCar1.make);
		System.out.println(myCar1.price);
		System.out.println(myCar1.year);
		System.out.println(myCar1.color);
		
		myCar1.drive(); // methods
		myCar1.brake();
		
		
		System.out.println("myCar2: ------------");
		
		System.out.println(myCar2.model); // accessing attribute
		System.out.println(myCar2.make);
		System.out.println(myCar2.price);
		System.out.println(myCar2.year);
		System.out.println(myCar2.color);
		
		myCar2.drive(); // methods
		myCar2.brake();
		
		
		
		
		
		
	}
}
