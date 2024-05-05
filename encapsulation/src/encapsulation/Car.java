package encapsulation;

public class Car {
	private String make; 
	private String model;
	private int year; 
	
	Car(String make, String model, int year) { 
		this.setMake(make);
		this.setModel(model); 
		this.setYear(year); 
	}
	
	// how can we retrieve the value of that private variable
	
	// well, that method is called a GETTER
	
	public String getMake() { 
		return make;
	} // a getter method. this is to GET a method, since it is private
	
	public String getModel() { 
		return model; 
	}
	
	public int getYear() { 
		return year;
	}
	
	public void setMake(String make) { 
		this.make = make;
	}// this is a setter method. to set a variable to a new value
	
	public void setModel(String model) { 
		this.model = model;
	}
	
	public void setYear(int year) { 
		this.year = year;
	}
}
