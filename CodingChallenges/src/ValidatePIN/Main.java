package ValidatePIN;

public class Main {

	public static boolean validate(String str) { 
		
		int count = 0;

		if((str.length() != 4) & (str.length() != 6)) { 
			return false;
		}
		else { 
			for(int i = 0; i < str.length(); i++) { 
				if (str.charAt(i) == ' ' || Character.isLetter(str.charAt(i)) == true) { 
					count++;
				}
			}
		}
		
		if(count > 0) { 
			return false;
		}
		
		else { 
			return true;
		}
	}
	
	public static void main(String[] args) { 
		System.out.println(validate(""));
	}
}
