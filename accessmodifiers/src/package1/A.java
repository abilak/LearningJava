package package1;
import package2.*;
public class A {
	protected String protectedMessage = "This is protected";
	public static void main(String[] args) {
		
		C c = new C();
		
		// System.out.println(c.defaultMessage); can't access it, A is in a different package than C
		
		System.out.println(c.publicMessage); // this works
		
		// in C, it is public class C, the public makes it acailable to packages in the project folder 
		
		B b = new B();
		
		// System.out.println(b.privateMessage); would give error f not commented, it is private, only visible to THAT SPECIFIC CLASS
		
	}

}
