package canPartition;

public class Main {
	public static int prodofarray(int[] array) { 
		int count2 = 1;
		for(int p : array) { 
			count2 = count2 * p;
		}
		return count2;
	}
	
	public static int[] removeelfromarr(int[] arr, int index) { 

		int[] new_arr = new int[arr.length-1];
		for(int i = 0; i < arr.length; i++) {
			if ((i != index) & (i < index)) { 
				new_arr[i] = arr[i];
			}
			else if((i != index) & (i > index)) { 
				new_arr[i-1] = arr[i];
			}
			else { 
				;
			}
		}
		
		return new_arr;
	}
	
	public static int prodArray(int[] arr) { 
		int count = 1;
		for(int x : arr) { 
			count = count * x;
		}
		return count; 
	}
	
	public static boolean canPartition(int[] array) { 
		int count = 0; 
		
		
		for(int p = 0; p < array.length; p++) { 
			if(prodArray(removeelfromarr(array, p)) == array[p]) { 
				count++;
			}
		}
		
		if(count > 0) { 
			return true;
		}
		else { 
			return false;
		}
	}
	
	public static void main(String[] args) { 
		System.out.println(canPartition(new int[]{-1, -20, 5, -1, -2, 2}));;
		
	
	}
}
