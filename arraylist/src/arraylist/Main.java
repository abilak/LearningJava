package arraylist;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// ArrayList = resizable array. so think of arrays as like tuples
		// Elements can be added and removed after compilation phase
		// stores reference data types(wrapper classes comin into play)
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("cheeseburger");
		food.add("french fries");
		
		for(int i = 0; i < food.size(); i++) { 
			System.out.println(food.get(i));
		}
		
		// methods
		
		food.set(1, "cake"); // replaces value at index, like in a list list[1] = "cake"
		
		System.out.println("------------------------");
		
		for(int i = 0; i < food.size(); i++) { 
			System.out.println(food.get(i));
		}
		
		System.out.println("------------------------");
		
		food.remove(2); // .pop(index) function in python. removes it from the ArrayList
		
		for(int x = 0; x < food.size(); x++) { 
			System.out.println(food.get(x));
		}
		
		food.clear(); // clears the list like in python
		
		System.out.println("------------------------");
		
		for(int i = 0; i < food.size(); i++) { 
			System.out.println(food.get(i));
		}

	}

}
