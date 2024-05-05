package switches;

public class Main {

	public static void main(String[] args) {
		// switch = statement that allows a variable to be tested for equality against a list of values
		
		String day = "Pizza";
		
		switch(day) { 
			case "Sunday": System.out.println("It is " + day);
			break;
			case "Saturday": System.out.println("It is Saturday");
			break;
			case "Friday": System.out.println("It is Friday");
			break;
			case "Thursday": System.out.println("It is Thursday");
			break;
			case "Wednesday": System.out.println("It is Wednesday");
			break;
			case "Tuesday": System.out.println("It is Tuesday");
			break;
			case "Monday": System.out.println("It is Monday");
			break;
			default: System.out.println("That is not a day of the week"); // like an else statement
		}
	}

}
