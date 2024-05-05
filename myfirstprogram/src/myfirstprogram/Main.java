package myfirstprogram;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("I love pizza(peetsa).");
		System.out.println("It's realy good. Best with jalapenos , olives, and spinach.");
		
		System.out.println("Check out the difference between this: ");
		
		System.out.print("I love pizza(peetsa).");
		System.out.println("It's realy good. Best with jalapenos , olives, and spinach.");
		
		// the reason why the first version has 2 separate lines when the second version is all on one line
		// is because println adds a new line character(like enter) while the print doesn't do that
		// or...
		
		System.out.print("I love pizza(peetsa).\n");
		System.out.print("It's realy good. Best with jalapenos , olives, and spinach.\n");
		
		// wait, why did this work? like in python, you can add an escape sequence(things starting with a "/")
		// one of them is \n, which is like pressing enter
		// put it at the end like demonstrated and BAM! new line
		// those are a couple ways to print new lines in Java
		// a couple other escape sequences are \t: 
		
		System.out.print("\tI love pizza(peetsa).\n");
		
		// what if you want to literally display double quotes? 
		// well...
		System.out.println("I love pizza, or spelled like \"peetsa\".");
		
		// what if you want to display a backslash
		
		System.out.print("Displaying a backslash: \\");
		// use double backslashes
		
		// also this is called a comment. this is ignored by the compiler
		// multiline comment: 
		/* - start
		 Hello
		 This is
		 a
		 multiline comment
		 .
		 :)
		 end - */
		
		// trick - type "sysout" and then press ctrl+space bar
	}

}
