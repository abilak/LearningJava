package interfaces;

public class Main {
	public static void main(String[] args) { 
		// interface = a template than can be applied to a class. 
		// similar to iheritance, but specifies what a class has/must do. 
		// classes can apply more than one interface, interitance is limited to 1 super class
		
		Rabbit rabbit = new Rabbit(); 
		
		rabbit.flee();
		
		Hawk hawk = new Hawk(); 
		
		hawk.hunt();
		
		Fish fish = new Fish();
		
		fish.hunt(); 
		fish.flee(); 
	}
}
