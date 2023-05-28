package Facade_Structural;

public class Facade {
	ItemPurchased i;
	ProcessSales p;
	
	public Facade(boolean g, double bill){
		i=new ItemPurchased();
		i.details();
		int n=i.getType();
		System.out.println("Number of items purchased is "+n);
		System.out.println("Gift card : "+g);
		p=new ProcessSales(g,n,bill);
	}
	

	void display() {
		i.cart();
	}
	void totalBill() {
		p.processSale();
	}

}
