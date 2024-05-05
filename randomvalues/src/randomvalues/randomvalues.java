package randomvalues;
import java.util.Random;

public class randomvalues {

	public static void main(String[] args) {
		Random random = new Random(); // like scanner
		
		int x = random.nextInt(6)+1; // like scanner. normally it is 0-5, so +1 = 1-6
		double y = random.nextDouble(); // random value between 0 and 1
		boolean z = random.nextBoolean(); 
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
