package printf;

public class Main {

	public static void main(String[] args) {
		// printf = option method to control, format, and display text to consol window
		// 						two arguments = format string(String to display to console window) + 
		// (object/variable/value)
		// 						%[flags][precision][width][conversion-character]
		
		System.out.printf("This is a format string %d \n", 123); // the percent sign displays the number in 
		// that string. the "/d" displays a decimal number
		
		// or
		
		System.out.printf("This is %d a format string \n", 123); 
		
		// conversion-char corrresponds to the data type
		// d  = decimal numbers(integers)
		// b = boolean
		// c = character
		// s = String
		// f = double/float
		
		boolean myBoolean = true; 
		
		char myChar = '@';
		
		String myString = "option_f4";
		
		int myInt = 9522;
		
		double myDouble = 1000.78;
		
		double myDouble2 = -1000.78;
		
		System.out.printf("This is a %b format string \n", myBoolean); 
		System.out.printf("This is a %c format string \n", myChar); 
		System.out.printf("This is a %s format string \n", myString); 
		System.out.printf("This is a %d format string \n", myInt);
		System.out.printf("This is a %f format string \n", myDouble);
		
		// width
		// minimum number of characters to be written aws output
		 System.out.printf("This is a %10s format string \n", myString); // reserves 10 spaces for  the string(right justified)
		 // to make it left justified, add a negative sign
		 System.out.printf("This is a %-10s format string \n", myString); // the spaces come after
		 
		 // precisions
		 // for floats and doubles
		 // sets number of decimal points(digits of precision)
		 
		 System.out.printf("You this much money: %.2f \n",myDouble); // limits to 2 digits
		 
		 // flags
		 // add an effect to output 
		 // - : left justify
		 // + : outputs a plus or minus sign for a numeric value
		 // 0 : numeric values are zero padded
		 // , : comma grouping separator if num > 1000. so 10000 would be 10,000
		 
		 System.out.printf("You this much money: %-20f \n",myDouble); // left justify
		 System.out.printf("You this much money: %20f \n",myDouble); // right justify
		 System.out.printf("You this much money: %+f \n",myDouble); // puts a plus sign
		 System.out.printf("You this much money: %+f \n",myDouble2); // puts a neg sign depending on sign of var
		 System.out.printf("You this much money: %020f \n",myDouble2); // pad numbers with zeroes
		 System.out.printf("You this much money: %,f \n",myDouble);
		 
	}

}
