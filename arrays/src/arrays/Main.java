package arrays;

public class Main {

	public static void main(String[] args) {
		// array = stores multiples values in one variables, like a list in python
		
		String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"}; // the square brackets and curly braces make it an array
		
		// the data types must be consistent in an array, the String[] tells us it is only an array of strings, 
		//if i wanted an array of integers then i would type int[] cars = {1,2,3,4,5,6,7,8,9,10}
		
		cars[0] = "Mustang"; // changed the first element
		
		System.out.println(cars[1]);
		
		System.out.println("-------------------------");
		
		// there is another way to create an array
		
		String[] cars2 = new String[3]; // the String[3] tells us we can assign 3 strings to the array
		
		cars2[0] = "Camaro";
		cars2[1] = "Corvette";
		cars2[2] = "Tesla";
		
		for(int i = 0; i < cars2.length; i++) { 
			System.out.println(cars2[i]);
		}

	}

}
