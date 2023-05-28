package Facade_Structural;
import java.util.*;

public class ProcessSales {
	Scanner sc=new Scanner(System.in);
	boolean giftcard;
	int qty;
	double bill;
	
	ProcessSales(boolean g, int q, double b){
		this.giftcard=g;
		this.qty=q;
		this.bill=b;
	}
	
	void processSale() {
		double giftval, amt_to_pay;
		if(!giftcard) {
			System.out.println("You do not have a gift card");
			System.out.println("Therefore pay"+bill);
		}
		else {
			System.out.println("Enter gift card value");
			giftval=sc.nextDouble();
			if(qty>1) {
				System.out.println("Too many items. Can only purchase one item with gift card. The total items bought is " + qty+" and the bill to pay is "+bill);
			}
			else if(qty<1) {
				System.out.println("No items have been purchased. Gift Card not applicable");
				
			}
			else if(giftval>bill) {
				amt_to_pay=giftval-bill;
				System.out.println("The total bill has nullified as gift card value exceeds bill.\nNeed to pay 0 amount and left gift points are "+amt_to_pay);
			}
			else if(giftval<bill) {
				amt_to_pay=bill-giftval;
				System.out.println("The total bill is now Rs."+amt_to_pay+" and the gift card is now empty.");
			}
		}
		
	}

}
