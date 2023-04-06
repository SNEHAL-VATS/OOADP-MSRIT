package Strategy_Behavioural;


public class Main {

	public static void main(String[] args) {
		
		double mrptotal = 8000.50; 
		RegularCustomer oRC = new RegularCustomer(); 
		oRC.calculateDiscount(mrptotal);	
		oRC.display();			
		FirstTimeCustomer oFTC = new FirstTimeCustomer(); 
		oFTC.calculateDiscount(mrptotal);	
		oFTC.display(); 
	}

}