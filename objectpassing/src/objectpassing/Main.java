package objectpassing;

public class Main {

	public static void main(String[] args) {
		
		Garage garage = new Garage();
		
		Car car = new Car("BMW");
		
		Car car2 = new Car("Bugatti");
		
		garage.park(car);
		garage.park(car2);
		
	}

}
