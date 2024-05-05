package whileloops;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) { 
		// while loop = executes a block of code for as long as the condition is true
		
		Scanner scanner = new Scanner(System.in);
		
		String name = ""; 
		
		while (name.isBlank() || name.equals("no") || name.equals("nah")) { 
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		}
		
		System.out.println("Hello "+name);
		
		// there is a variation of the while loop: the do loop
		
		/*
		 do{ 
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		}while (name.isBlank() || name.equals("no") || name.equals("nah")) 
		
		all this does is that it makes sure that we run the code at least once
		 */
	}
}
