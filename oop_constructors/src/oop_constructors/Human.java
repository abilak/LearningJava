package oop_constructors;

public class Human {
	
	String name;
	int age;
	double weight;
	
	Human(String name, int age, double weight){
		this.name = name; // this is the keyword to do THIS SPECIFIC object we are creating
		// imagine replacing "this" with human
		// the name of "this" human is equal to the name that was passed as an argument
		this.age=age;
		this.weight=weight;
	}
	void eat(String food) { 
		System.out.println(this.name + " is eating " + food + ".");
	}
	
	void drink(String drinks) { 
		System.out.println(this.name + " is drinking " + drinks + ".");
	}
	
}
