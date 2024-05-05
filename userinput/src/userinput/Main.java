package userinput;

import java.util.Scanner; // import the scanner class

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // create scanner object. 
		// get it? system.IN cuz it is taking input in and not giving it out(System.out).
		
		System.out.println("What is your name? ");
		
		String name = scanner.nextLine(); // takes input, like input() in python
		
		System.out.println("What is your age? ");
		
		int age = scanner.nextInt(); // only integer input like int(input()) in python
		
		scanner.nextLine(); // why do we need this? go to this video(timestap already set): https://youtu.be/xk4_1vDrzzo?t=2463
		// in short it clears the scanner
		System.out.println("What is your favorite food? ");
		
		String food = scanner.nextLine();
		
		System.out.println("Hello " + name);
		System.out.println("You are " + age + " years old.");
		System.out.println("Your favorite food is " + food + ". I like " + food + " as well!1!1!1!1!1!1!1!1!1");
	}

}
