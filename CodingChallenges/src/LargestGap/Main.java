package LargestGap;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {
	public static int largestGap(int[] arr) { 
		Arrays.sort(arr);
		ArrayList<Integer> diffs = new ArrayList<Integer>();
		for(int x = 0; x < arr.length; x++) { 
			try { 
				diffs.add(Math.abs(arr[x]-arr[x+1]));
			}
			
			catch(Exception e) { 
				break;
			}
			
			finally { 
				;
			}
		}
		
		int[] new_array = new int[diffs.size()];
		
		for(int x = 0; x < diffs.size(); x++) { 	
			new_array[x] = diffs.get(x);
		}
		
		Arrays.sort(new_array);
		
		
		return new_array[new_array.length - 1]; 
	}
	
	public static void main(String[] args) {
		System.out.println(largestGap(new int[] {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5}));
	}

}
