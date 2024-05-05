package ifstatements;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// if statement = performs a block of code if it's condition evaluates to be true
		
		int age;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		
		age = scanner.nextInt();
		
		
		// the order is important, if an if statement evaluates to true, it skips all the other statements
		// greatest to least will go around that
		if (age >= 75) {
			System.out.println("BOOMER");
		}
		
		else if (age >= 20) { 
			System.out.println("You are an adult.");
		}
		
		else if (age >= 13 && age <= 19) { 
			System.out.println("You are a teenager.");
		}
		
		
		else if (age < 13) {
			System.out.println("You are young.");	
		}
		
		scanner.close();

	}

}
