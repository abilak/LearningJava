package expressions;

public class Main {

	public static void main(String[] args) {
		
		int friends = 10; 
		
		friends = friends + 1;
		
		System.out.println(friends);
		
		int friends2 = 10;
		
		friends2 = friends2 - 1;
		
		System.out.println(friends2);
		
		int friends3 = 10;
		
		friends3 = friends3 * 2;
		
		System.out.println(friends3);
		
		int friends4 = 10;
		
		friends4 = friends4/2;
		
		System.out.println(friends4);
		
		int friends5 = 10;
		
		friends5 = friends5 % 3; // the % sign is the modulus operator, gives the remainder 
		
		System.out.println(friends5); // remainder of 10 divided by 3
		
		// shortcut to increment a variable by 1
		
		int friends6 = 10;
		
		friends6++;
		
		System.out.println(friends6); // increased friendsby 1, from 10 --> 11
		
		// shortcut to decrement a variable by 1
		
		int friends7 = 10;

		friends7--;
		
		System.out.println(friends7); // decreased friendsby 1, from 10 --> 9
		
		// NOTE: whendoing an integer divided by another integer, the decimal portain is truncated
		// EXAMPLE: 
		
		int friends8 = 10;
		
		System.out.println(friends8/4); // instead of 2.5, it just gives 2
		
		// typecast to double to get the decimal portion
		
	}

}
