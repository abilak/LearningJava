package inheritance;

public class Main {
	public static void main(String[] args) { 
		// inheritacnes = the process acquires the methods and attributes of another
		
		Car car = new Car();
		car.go();
		
		Bicycle bike = new Bicycle();
		bike.stop();
		
		System.out.println(car.speed);
		System.out.println(bike.speed);
		
		System.out.println(car.doors);
		System.out.println(bike.pedals);
	}
}
