package arraymethods;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] arr = {10,20,15,22,35};
		
		Arrays.sort(arr); // sort it by ascending value first(we have to)
		
		System.out.println("Num 22 found at index " + Arrays.binarySearch(arr, 22));
		// uses the binary search operator to find the index of a number in an array
		// like .index(num) in python
		
		
		// what if there are multiple in the array tho? 
		
		int[] arr2 = {10,20,15,22,35, 22};
		
		Arrays.sort(arr2);
		
		System.out.println("Num 22 found at index " + Arrays.binarySearch(arr2, 22));
		
		
		// random(whether it picks 3 or 4)

		int[] goofy = Arrays.copyOf(arr, arr.length); // copies the array, the second paramter specifies the length
		// truncation or padding will be done if greater or lesser
		
		System.out.println(Arrays.toString(goofy));
	    
		int[] goofy2 = Arrays.copyOf(arr, arr.length + 2); // adds 2 zeroes at the end
		
		System.out.println(Arrays.toString(goofy2));
		
		int[] goofy3 = Arrays.copyOf(arr, arr.length - 2); // removes two elements from the end
		
		System.out.println(Arrays.toString(goofy3));
		
		
		System.out.println(Arrays.equals(goofy, arr)); // prints whether the two arrays are equal or not
		
		// prints true
		
		int[] arr3 = {10,20,15, 25, 35};
		Arrays.sort(arr3); // not necessary
		
		System.out.println(Arrays.mismatch(arr3, arr)); // prints the first element where the two arrays are different
		
		int[] setAllarr = new int[10]; 
		
		Arrays.setAll(setAllarr, (index)->(index*index));
		
		System.out.println(Arrays.toString(setAllarr)); // noice
		
		// next operator is the sort, we already saw it, but let's use a cooler version
		
		char[] alpha = {'a', 'b', 'c', 'e', 'd'};
		
		Arrays.sort(alpha);
		
		System.out.println(Arrays.toString(alpha)); // sorts by alphabetical order
		
		String[] alpha2 = {"pizza", "ring", "wedding", "paul", "aaditya"};
		
		Arrays.sort(alpha2);
		
		System.out.println(Arrays.toString(alpha2)); // sorts by alphabetical order
		
		// can automatically detect that
		
		// but there's more to the sort function
		
		String[] alpha3 = {"pizza", "ring", "wedding", "paul", "aaditya"};
		
		Arrays.sort(alpha3, 2, 5); // the first index is the starting index(plus 1) and the last number index(minus 1)
		
		System.out.println(Arrays.toString(alpha3));
		
	}

}
