package Bridge_Structural;

public class SenCust extends Customer{

	public SenCust(String s, int a) {
		super(s,a); 
	}
	
	public void display() { 
		
		System.out.println("\nHello Senior Citizen Customer! Welcome BackS"); 
		super.display(); 
	}

}