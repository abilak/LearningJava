package exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) { 
		// exceptions = a n event that occurs during the execution of a program that,
		// disrupts the normal flow of instructions 
		Scanner scanner = new Scanner(System.in);
		try { 

			System.out.println("Enter a whole nubmer to divide: ");
			
			int x = scanner.nextInt();
			
			System.out.println("Enter a whole nubmer to divide by: ");
			int y = scanner.nextInt();
			
			int z = x/y; 
			
			System.out.println("result: " + z);
		} // this is the "DANGEROUS" code. so just try this
		
		catch(ArithmeticException e) { 
			System.out.println("You can't divide by 0!");
		} // if you run into an arithmetic exception, then tell them u cant div by 0
		
		catch(InputMismatchException e) { 
			System.out.println("PLZ ENTER A WHOLE NUMBER!");
		}
		
		finally { 
			scanner.close();
		} // this will always happen no matter what whether an exception HAPPENS or NOT
		
	}
	
}
