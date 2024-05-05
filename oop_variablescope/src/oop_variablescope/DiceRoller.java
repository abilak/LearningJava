package oop_variablescope;

import java.util.Random;

public class DiceRoller {
	
	Random random; // declares random and number as global variables
	int number = 0; // can be accessdeinside method "roll" 
	// woould have given error
	// we could have also passed them as arguments to roll
	
	DiceRoller() { 
		random = new Random();
		roll();
	}
	
	void roll() { 
		number = random.nextInt(6) + 1;
		System.out.println(number);
	}

}
