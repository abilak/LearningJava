package overloadedmethods;

public class Main {
	
	public static void main(String[] args) { 
		// overloaded methods = methods with same name, but diff parameters
		// method name + parameters = method signature
		// parameters: how many, data types, and order of the values
		System.out.println(add(5,6));
		System.out.println(add(5,6,7));
		System.out.println(add(5,6,7,8));
		System.out.println(add(5.1,6.1));
		System.out.println(add(5.1,6.1,7.1));
		System.out.println(add(5.1,6.1,7.1,8.1));
		
		
	}
	
	static int add(int a, int b) { 
		System.out.println("This is overloaded method #1.");
		return a + b;
	}
	
	static int add(int a, int b, int c) { 
		System.out.println("This is overloaded method #2.");
		return a + b + c;
	}
	
	static int add(int a, int b, int c, int d) { 
		System.out.println("This is overloaded method #3.");
		return a + b + c + d;
	}
	
	static double add(double a, double b) { 
		System.out.println("This is overloaded method #4.");
		return a + b;
	}
	
	static double add(double a, double b, double c) { 
		System.out.println("This is overloaded method #5.");
		return a + b + c;
	}
	
	static double add(double a, double b, double c, double d) { 
		System.out.println("This is overloaded method #6.");
		return a + b + c + d;
	}


}
