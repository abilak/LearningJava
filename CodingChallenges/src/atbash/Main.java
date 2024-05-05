package atbash;

import java.util.Arrays;

public class Main {
	public static String atbash(String str) { 
		char[] str_char = str.toCharArray();
		char[] low_let = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o','p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y','z'};
		char[] upp_let = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O','P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y','Z'};
		
		for(int x = 0; x < str_char.length; x++) { 
			if(Character.isLowerCase(str_char[x]) == true) { 
				int index = Arrays.binarySearch(low_let, str_char[x]);
				str_char[x] = low_let[25-index];
			}
			
			else if(Character.isUpperCase(str_char[x]) == true) { 
				int index = Arrays.binarySearch(upp_let, str_char[x]);
				str_char[x] = upp_let[25-index];
			}
			
			else { 
				str_char[x] = str_char[x];
			}
		}
		String aString = "";
		
		for(int i = 0; i < str_char.length; i++) { 
			aString += str_char[i];
		}
		return aString;
	}
	
	
	public static void main(String[] args) { 
		System.out.println(atbash("Christmas is the 25th of December"));
	}
}
