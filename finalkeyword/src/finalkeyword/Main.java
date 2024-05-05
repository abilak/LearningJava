package finalkeyword;

public class Main {
	public static void main(String[] args) { 
		// final keyword = cannot be changed or updated
		
		final double PI = 3.141592653589793; // common practice to maker var uppercase if it is final
		
		// pi = 4; would give error
		
		System.out.printf("%.2f",PI);
	}
}
