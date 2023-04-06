package Bridge_Structural;

public class Main {

	public static void main(String[] args) {
		
    double mrptotal = 8000.50; 
		
        RegCust rc = new RegCust("Snehal", 21); 
		SenCust sc = new SenCust("Roshan",69); 
		
		//Here, the DiscountType can be varied between customers - meaning the discount type is not tied to a customer
		//setDiscountType method lets the cutomer's discount type to be varied 
		
		Discount1 d1 = new Discount1(); 
		rc.display(); 		
		Discount2 d2 = new Discount2(); 
		rc.DiscountType(d2); //Regular Customer is given discount type 2 
		 //oDC.setDiscountType(odtype1); //Regular Customer can be given discount type 1 if uncommented  
		
		rc.Discount(mrptotal);	
		

		sc.display(); 
		sc.DiscountType(d1); //Regular Customer is given discount type 2 
		sc.Discount(mrptotal);
		 
	}

}