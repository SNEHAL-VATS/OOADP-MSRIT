package Bridge_Structural;
//BRIDGE Patterns allows Abstractions and Implementations to vary independently 
//It helps to eliminate the "Class Explosion" problem 



public class RegCust extends Customer {

	public RegCust(String s, int a) {
		super(s,a); 
	}
	
	public void display() { 
		
		System.out.println("\nHello Regular Customer! Welcome Back!"); 
		super.display(); 
	}

}
