package abstraction;

public abstract class Vehicle { // added the "abstract" keyword. cannot be instantiated, but child class can
	
	
	abstract void go();// forces us to implement this in one of the child classes
	
	// an abstract method does not have a body
}
