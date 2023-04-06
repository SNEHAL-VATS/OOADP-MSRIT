package Bridge_Structural;

public class Discount1 implements DiscountCalculator{
	public void calculateBillAmount(double mrptotal) {
		double billamount; double discount; 
		
		discount = 0.22; //The discount rate to be applied for DiscountType1 
			
		billamount = mrptotal - discount * mrptotal;
		System.out.println("\nYour MRP Amount is "+ mrptotal);
		System.out.println("After discount, Your Bill Amount is "+ billamount);
	}
	
	
}