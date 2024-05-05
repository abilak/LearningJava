package numberedcards;

import java.util.Arrays;

public class Main {
	public static int largest_num(int[] arr) { 
		Arrays.sort(arr);
		return Integer.valueOf(Integer.toString(arr[arr.length - 2]) + Integer.toString(arr[arr.length - 1]));
	}
	
	public static boolean winRound(int[] arr1, int[] arr2) { 
		if(largest_num(arr1) > largest_num(arr2)) { 
			return true; 
		}
		else { 
			return false;
		}
	}
	
	
	public static void main(String[] args) { 
		System.out.println(winRound(new int[] {6, 5, 5, 8, 5}, new int[] {6, 2, 5, 2, 5}));
	}
}
