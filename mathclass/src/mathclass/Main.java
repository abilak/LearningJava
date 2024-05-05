package mathclass;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double x = 3.14;
		double y = -10;
		double z = Math.max(x, y); // Math.min for minimum
		
		System.out.println(z);
		
		double z2 = Math.abs(y);
		
		System.out.println(z2); // absolute value of number -10 --> 10
		
		double z3 = Math.sqrt(z2); // square root
		System.out.println(z3);
		
		double z4 = Math.round(x); // rounds 3.6 --> 4, 3.5 --> 4, 3.4 --> 3
		System.out.println(z4);
		
		double zz5 = Math.floor(x); // floor function 3.4 --> 3, 8.9999 --> 8
		System.out.println(zz5);
		
		double z6 = Math.ceil(x); // ceiling function 8.01 --> 9, 8.999 --> 9
		System.out.println(z6);
		
		System.out.println("----------------------------------------------------");
		System.out.println("Hypotenuse Program: ");
		
		double a;
		double b;
		double c;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("First leg(side a): ");
		a = scanner.nextDouble(); // accepting doubles(if confused go back to the userinput project)
		
		System.out.println("First leg(side b): ");
		b = scanner.nextDouble();
		
		c = Math.sqrt((a*a) + (b*b));
		
		System.out.println("The hypotenuse of the triangle you entered, with sides " + a + " and " + b + ", is " + c+".");
		
		scanner.close();
		
		
	}

}
