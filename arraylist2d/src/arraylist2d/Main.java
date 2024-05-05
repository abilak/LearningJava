package arraylist2d;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// 2d array lists = lists of lists
		
		ArrayList<ArrayList<String>> grocerylist = new ArrayList(); // ArrayList<ArrayList<String>> means that we are storing ArrayLists in the ArrayList and those ArrayLists hold Strings
		
		ArrayList<String> bakerylist = new ArrayList();
		
		bakerylist.add("pasta");
		bakerylist.add("vegan garlic bread");
		bakerylist.add("vegan donuts");
		
		System.out.println(bakerylist.get(0));
		
		
		ArrayList<String> producelist = new ArrayList();
		
		producelist.add("tomatoes");
		producelist.add("zucchini");
		producelist.add("peppers");
		
		System.out.println(producelist);
		
		ArrayList<String> drinkslist = new ArrayList();
		
		drinkslist.add("soda");
		drinkslist.add("coffee");
		
		System.out.println(drinkslist);
		
		grocerylist.add(bakerylist);
		grocerylist.add(producelist);
		grocerylist.add(drinkslist);
		
		System.out.println(grocerylist);
		
		System.out.println(grocerylist.get(2));
		System.out.println(grocerylist.get(1).get(2)); // like [0][0] but with the get() method
	}

}
