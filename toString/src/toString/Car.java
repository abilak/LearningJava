package toString;

public class Car {
	String make = "Ford";
	String model = "Mustang";
	String color = "red";
	int year = 2021;
	
	public String toString() { 
		return make + ", " + model + ", " + color + ", " + year;
	} // overriding toString() method
}
