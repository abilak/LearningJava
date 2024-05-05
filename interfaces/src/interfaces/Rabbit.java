package interfaces;

public class Rabbit implements Prey{// kind of like inheritance, but with implements, instead of extends

	@Override
	public void flee() {
		System.out.println("The rabbit is fleeing.");
	} 
	
}
