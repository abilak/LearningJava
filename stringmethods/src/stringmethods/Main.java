package stringmethods;

public class Main {

	public static void main(String[] args) {
		// string = reference data types
		// reference data types have noice methods
		
		String name = "MrPizzaFarmer";
		
		boolean result = name.equals("MrPizzaFarmer");
		
		System.out.println(result);
		
		boolean result2 = name.equals("MrPizzafarmer"); 
		System.out.println(result2);
		
		// case sensitive. we can get rid of this like so: 
		
		boolean result3 = name.equalsIgnoreCase("MrPizzafarmer"); // ignores lower case and upper case stuff
		System.out.println(result3);
		
		int length = name.length();
		
		System.out.println(length);
		
		char character = name.charAt(5);
		
		System.out.println(character); // printed out the character at that index
		
		int indexer = name.indexOf('a'); // gets the FIRST INDEX of the character(in this case it is a)
		
		boolean empty = name.isEmpty(); // finds if the String is empty or not
		
		System.out.println(indexer);
		
		System.out.println(empty);
		
		String upper_name = name.toUpperCase(); // makes the entire string uppercase
		
		System.out.println(upper_name);
		
		String lower_name = name.toLowerCase(); // makes the entire string lowercase
		
		System.out.println(lower_name);	
		
		String name2 = "     MrPizzaFarmer        ";
		
		String no_space_name = name2.trim(); // removes all empty space in name2
		
		System.out.println(no_space_name);
		
		String replaced_name = name.replace('a', 'q');
		
		System.out.println(replaced_name);
		
	}
	
}
