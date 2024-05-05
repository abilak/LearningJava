package abstraction;

public class Main {
	public static void main(String[] args) { 
		// abstract = abstract classes cannot be instantiated, but they can have a subclass
		// abstract methods are declared without an implementation
		
		Car car = new Car(); 
		
		// Vehicle vehicle = new Vehicle(); would give error if i uncommented this, because it is an abstract class
		
		// but you can also make abstract methods
		
		car.go();
	}
}
