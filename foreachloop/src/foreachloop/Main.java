package foreachloop;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// for-each loop = traversing technique to iterate through the elements of an array/collection
		// less steps, more readable
		// less flexible
		
		String[] animals = {"cat", "dog", "rat", "bird"};
		
		for(String i: animals) { // the colon represents "in". reads like: for every String Index in array animals. We write "String" because that is the data type our array is storing.
			System.out.println(i);
		}
		
		ArrayList<String> animals2 = new ArrayList<String>();
		
		animals2.add("cat");
		animals2.add("dog");
		animals2.add("rat");
		animals2.add("bird");
		
		for(String i: animals2) { // the colon represents "in". reads like: for every String Index in array animals. 
			System.out.println(i);
		}
		
		// nothing has changed
		
		// the for each loop is like(python code)
		
		/*
		 for word in animals2: 
		  print(word)
		 */
	}

}
