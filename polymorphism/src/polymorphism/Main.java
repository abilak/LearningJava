package polymorphism;

public class Main {
	// polymorphism = the ability of an object to identify as more than one data type
	public static void main(String[] args) { 
		Car car = new Car(); 
		Bicycle bike = new Bicycle(); 
		Boat boat = new Boat(); 
		
		// racers = {car, bicycle, boat}; gives an array, because an array can't store multipel data type
		
		Vehicle[] racers = {car, bike, boat}; // we can use Vehicle, as they are subclasses of Vehicle!
		
		for(Vehicle x : racers) { 
			x.go();
		}
	}
	
}
