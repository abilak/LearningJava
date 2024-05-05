package perimeterOfTriangle;

public class Main {
	
	public static double distance(int[][] arr) { 
		int x_1 = arr[0][0];
		int y_1 = arr[0][1];
		
		int x_2 = arr[1][0]; 
		int y_2 = arr[1][1];
		
		return Math.sqrt(Math.pow((x_2-x_1),2)+Math.pow((y_2-y_1),2));
	}
	
	public static double perimeter(int[][] arr1) { 
		int[][] arr_1 = new int[2][2];
		int[][] arr_2 = new int[2][2];
		int[][] arr_3 = new int[2][2];
		
		arr_1[0][0] = arr1[0][0];
		arr_1[0][1] = arr1[0][1];
		arr_1[1][0] = arr1[1][0];
		arr_1[1][1] = arr1[1][1];
		
		arr_2[0][0] = arr1[0][0];
		arr_2[0][1] = arr1[0][1];
		arr_2[1][0] = arr1[2][0];
		arr_2[1][1] = arr1[2][1];
		
		arr_3[0][0] = arr1[1][0];
		arr_3[0][1] = arr1[1][1];
		arr_3[1][0] = arr1[2][0];
		arr_3[1][1] = arr1[2][1];
		
		double num = Math.round((distance(arr_1) + distance(arr_2) + distance(arr_3))*100);
				
		return num/100;
	}
	
	
	public static void main(String[] args) {
		int[][] arr = new int[3][2];
		arr[0][0] = 15;
		arr[0][1] = 7;
		arr[1][0] = 5;
		arr[1][1] = 22;
		arr[2][0] = 11;
		arr[2][1] = 1;
		System.out.println(perimeter(arr));

	}

}
