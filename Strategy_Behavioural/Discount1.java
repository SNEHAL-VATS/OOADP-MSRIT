package Strategy_Behavioural;

class Discount1 implements Discount {

	double billamount; double discount; 
	
	Discount1(){
	discount = 0.22; 
	}
	
	public void calculateBillAmount(double mrptotal) {
			
			billamount = mrptotal - discount * mrptotal;
			System.out.println("\nYour MRP Amount is "+ mrptotal);
			System.out.println("After discount, Your Bill Amount is "+ billamount);
	}
	
	
}