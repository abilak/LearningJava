package encapsulation;

public class Main {
	public static void main(String[] args) { 
		// encapsulation = attributes of aclass will be hidden or private,
		// Can be accessed only through methods called (getters & setters)
		// you should make attributes private if you don't have a reason to make them public/protected
		
		Car car = new Car("Chevrolet", "Camaro", 2021); 
		
		// System.out.println(car.make); would get error, because "make" is private
		
		System.out.println(car.getMake()); // using a getter method to access a private variable
		
		System.out.println(car.getModel());
		
		System.out.println(car.getYear());
		
		// car.year = 2022; can't do this, again this is private
		
		car.setYear(2022);
		
		System.out.println(car.getMake()); // using a getter method to access a private variable
		
		System.out.println(car.getModel());
		
		System.out.println(car.getYear());
		
	}
}
