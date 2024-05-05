package consecutivenumbers;

import java.util.Arrays;

public class Main {

	public static boolean cons(int[] arr) { 
		Arrays.sort(arr);
		int count = 0;
		for(int x = 0; x < arr.length; x++) { 
			try { 
				if(arr[x] + 1 != arr[x+1]) { 
					count++;
				}
			}
			
			catch(Exception e) { 
				break;
			}
			
			finally { 
				;
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
		int[] array = {5, 3};
		System.out.println(cons(array));
	}
}
