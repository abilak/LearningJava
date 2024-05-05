package variable;

public class Main {
	public static void main(String[] args) { 
		int x; // declaration
		x = 123; // assignment
		
		int y = 123; // initialization
		
		System.out.println("My number is " + x + "."); // string concatenaton
		System.out.println(y);
		
		long z = 1290381038210830L; // could not be stored with an int
		System.out.println(z);
		
		float a = 3.14f; // float datatype; stores decimals 6-7 decimal place
		System.out.println(a);
		
		double b = 3.14159265358979323; // more accurate than float and you don't have to have the f at the end
		System.out.println(b);
		boolean c = false;
		System.out.println(c);
		
		char symbol = '@'; // only contains ONE character
		
		String name = "Aaditya"; // reference data type. stores text
		
		System.out.println(symbol);
		System.out.println("My name is " + name + '.');
		
		// how to swap 2 variables
		
		System.out.println("-------------------");
		System.out.println("HOW TO SWAP 2 VARIABLES: ");
		
		String d = "water";
		String f = "Kool-Aid";
		
		System.out.println("d: "+d);
		System.out.println("f: "+f);
		
		// but, what happens if we set x = y
		
		d=f;
		System.out.println("Set d equal to f: ");
		System.out.println("d: "+d);
		System.out.println("f: "+f);
		
		// that didn't work
		// to save time, if we were to assign f to d(f=d), it wouldn't have worked either. but wait!
		
		String d2 = "water";
		String d3 = "Kool-Aid";
		String temp;
		
		temp = d2; 
		
		d2=d3;
		
		d3 = temp;
		
		System.out.println("Set d equal to f: ");
		System.out.println("d: "+d2);
		System.out.println("f: "+d3);
		
		// it worked!1!1!1!1
	}
}

