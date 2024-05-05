package arrays2d;

public class Main {
	// 2D array = array of arrays
	
	public static void main(String[] args) { 
		String[][] cars = new String[3][3]; // 2d array
		
		cars[0][0] = "Camaro";
		cars[0][1] = "Corvette";
		cars[0][2] = "Silverado";
		
		cars[1][0] = "Mustang";
		cars[1][1] = "Ranger";
		cars[1][2] = "F-150";
		
		cars[2][0] = "Ferrari";
		cars[2][1] = "Lambo";
		cars[2][2] = "Tesla";
		
		for(int i = 0; i < cars.length; i++) { 
			for(int x = 0; x < cars.length; x++) { 
				System.out.print(cars[i][x] + " ");
			}
			System.out.println();
		}
		
		System.out.println("----------------");
		
		// or... we dont have to allocate the space immediately
		
		String[][] cars2 = {{"Camaro", "Corvette", "Silverado"}, {"Mustang", "Ranger", "F-150"}, 
				{"Ferrari", "Lambo", "Tesla"}};
		
		for(int a = 0; a < cars2.length; a++) { 
			for(int b = 0; b < cars2.length; b++) { 
				System.out.print(cars2[a][b] + " ");
			}
			System.out.println();
		}
		
		
	}
	
	
}
