package reverseOdd;

public class Main {
	
	public static String revString(String str) { 
		char[] arr = str.toCharArray();
		char[] new_arr = new char[str.length()];
		for(int x = 0; x < arr.length; x++) { 
			new_arr[str.length() - x - 1] = arr[x];
		}
		
		String day = "";
		
		for(char i : new_arr) { 
			day = day + i;
		}
		
		return day; 
	}
	
	public static String reverseOdd(String str) { 
		String rev_str = "";
		String[] word_arr = str.split(" ");
		for(String x : word_arr) { 
			if(x.length() % 2 == 1) { 
				rev_str = rev_str + revString(x) + " ";
			}
			
			else { 
				rev_str = rev_str + x + " ";
			}
		}
		return rev_str;
		
	}
	public static void main(String[] args) {
		System.out.println(reverseOdd("Odd odd odd odd odd odd odd odd odd odd odd"));
	}

}
