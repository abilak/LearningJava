package isFactorial;

public class Main {
	
	public static int factorial(int x) { 
		int factorial = 1; 
		for(int i = 1; i < (x+1); i++) { 
			factorial = factorial * i;
		}
		return factorial; 
	}
	
	public static boolean isFactorial(int p) { 
		int count = 1; 
		int new_count = 0;
		while(count <= p) { 
			if(factorial(count) == p) { 
				new_count++;
				break;
			}
			count++;
		}
		if(new_count > 0) { 
			return true;
		}
		else { 
			return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(isFactorial(90));
	}

}
