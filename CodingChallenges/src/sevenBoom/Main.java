package sevenBoom;

public class Main {
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6, 97};
		
		System.out.println(sevenBoom(array));
	}
	
	public static String sevenBoom(int[] arr) {
		int count = 0;
		for(int x = 0; x < arr.length; x++) { 
			if((String.valueOf(arr[x])).contains("7")  == true) { 
				count++;
			}
			
		}
		
		if(count > 0) { 
			return "Boom!";
		}
		
		else { 
			return "there is no 7 in this array";
		}
		
	}
	
	
}
