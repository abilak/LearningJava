package wrapperclass;

public class Main {

	public static void main(String[] args) {
		// wrapper class allows us to use primitive data types(int, byte, short, char, etc.) as reference
		// data types(String, etc.)
		
		// primitive      // wrapper
		// -----          // -------
		// boolean        Boolean
		// int            Integer
		// char           Character
		// double		  Double
		// wrapper class has the first letter capitalized and the entire data type is spelled out
		
		// autoboxing = directly assign some primitive data types to reference data tpyes automatically
		//  unboxing = opposite of autoboxing
		
		Boolean a = true; // autoboxing
		Character b = '@'; // autoboxing
		Integer c = 123; // autoboxing
		Double d = 3.14; // autoboxing
		String e = "MrPizzaFarmer"; // not autoboxing :D
		
		// boolean wrapper class
		
		if(a == true){  // unboxing
			System.out.println("This is true");
		}
		
		if(b == '@') {  // unboxing
			System.out.println("This is true");
		}
		
		
		
	}

}
