package Strategy_Behavioural;

class RegularCustomer extends Customer {

	RegularCustomer() {
		super();
		d = new Discount1(); 
		
	} 
	
	public void display() { 
		
		System.out.println("\nHello Regular Customer! Welcome Back..."); 
		super.display(); 
	}

}