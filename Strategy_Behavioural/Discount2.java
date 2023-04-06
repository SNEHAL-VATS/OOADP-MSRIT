package Strategy_Behavioural;


class Discount2 implements Discount {

	double billamount; double discount; int offamount = 0; 
	
	Discount2(){
		discount = 0.20; 
		}
	
	public void calculateBillAmount(double mrptotal) {
		
if(mrptotal > 6000) offamount = 250; 
			billamount = mrptotal - discount * mrptotal - offamount;
			
			System.out.println("\nYour MRP Amount is "+ mrptotal);
			System.out.println("Store Level Flat Discount for the day Rs." + offamount+ " is applied for you"); 
			System.out.println("After discount, Your Bill Amount is "+ billamount);
	}
	
}