package superkeyword;

public class Hero extends Person{
	String power;
	
	Hero(String name, int age, String power) { 
		super(name ,age); // the super keyword takes the name and age attributes in the "Person" class
		this.power = power;
	}
	
	public String toString() { 
		return super.toString() + this.power;
 	}
}
