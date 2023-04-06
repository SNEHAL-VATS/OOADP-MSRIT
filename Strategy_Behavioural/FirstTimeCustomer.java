package Strategy_Behavioural;


public class FirstTimeCustomer extends Customer {
	
		
	 FirstTimeCustomer() {
			super();
			d = new Discount2(); 
			
		} 
		
		public void display() { 
			
			System.out.println("\nHello Welcome to Decathlon!Congratulations for visiting our store for first time"); 
			super.display(); 
		}

	}
