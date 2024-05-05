package logicaloperators;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 && = and (ACSL Bool algebra) both must be true 1 && 1 = 1
		 || = or just one value must be true
		 ! = not true --> false, false --> true if age != 19, print([insert text here])
		 */
		
		
		// EXAMPLE OF AND OPERATOR: 
		
		int temp = 19;
		
		if (temp > 30) { 
			System.out.println("It is hot outside");
		}
		
		else if (temp >= 20 && temp <= 30) { // both must be true, it's like a coumpound inequality 20 <= temp <= 30
			System.out.println("It is warm outside");
		}
		
		else { 
			System.out.println("It is cold outside");
		}
		
		// --------------------------
		// EXAMPLE OF OR LOGICAL OPERATOR
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("You are playing a game. Press lowercase q or uppercase Q to quit.");
		
		String response = scanner.next();
		
		if (response.equals("q") || response.equals("Q")) { // .equals is the comparison for String idk why
			System.out.println("You are quit the game");
		}
		
		else { 
			System.out.println("You are playing the game");
		}
		
		// ----------------------
		// EXAMPLE OF NOT LOGICAL OPERATOR
		
		System.out.println("You are playing a game. Press lowercase q or uppercase Q to quit.");
		
		String response2 = scanner.next();
		
		if (!response.equals("q") && !response.equals("Q")) { // .equals is the comparison for String idk why
			System.out.println("You are playing the game");
		}
		
		else { 
			System.out.println("You quit the game");
		
		}
	}
}
