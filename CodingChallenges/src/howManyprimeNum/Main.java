package howManyprimeNum;

public class Main {
	
	public static boolean isPrime(int num) {  
		for(int x = 2; x < num; x++) { 
			if(num % x == 0) { 
				return false;
			}
		}
		return true;
		
	}
	
	public static int primeNumbers(int limit) {
		int count = 0;
		if(limit <= 0) { 
			return 0;
		}
		for(int i = 2; i <= limit; i++) { 
			if(isPrime(i)) { 
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) { 
		System.out.println(primeNumbers(10));
	}
}
