package nestedloops;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		
		// nested looops = loop inside a loop inside a loop inside a ...
		
		int rows; 
		int columns; 
		String symbol = "";
		
		System.out.println("Enter num of rows: ");
		rows = scanner.nextInt();
		System.out.println("Enter num of columns: ");
		columns = scanner.nextInt();
		
		System.out.println("Enter symbol: ");
		symbol = scanner.next();
		
		for(int i = 1; i<=rows; i++) { 
			System.out.println();
			for (int x = 1; x<=columns; x++) { 
				System.out.print(symbol);		
			}
			
		}
		
		scanner.close();
	}

}
