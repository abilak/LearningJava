package oop;

public class Car {
	
	
	// attributes
	String make = "Chevrolet";
	String model = "Corvette";
	int year = 2020;
	String color = "blue";
	double price = 50000.00;
	
	// just setting variables
	
	// methods
	
	// we don't need static
	
	void drive() { // void cuz we don't have a return statement
		System.out.println("You drive the car.");
	}
	
	void brake() { 
		System.out.println("You step on the brakes. ");
	}
}
