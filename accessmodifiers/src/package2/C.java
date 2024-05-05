package package2;
import package1.*;
public class C {
	String defaultMessage = "This is the default"; // the "none" access modifier only works for 
	// anything inside the SAME package
	
	public String publicMessage = "This is public"; // available to everything in the project folder(packages, subclasses, etc.)
	
	protected String protectedMessage = "This is protected"; // only accessible if that class is a subclass
	

	
}
