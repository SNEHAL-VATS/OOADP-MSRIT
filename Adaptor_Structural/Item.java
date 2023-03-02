package Adaptor_Structural;

public class Item {
	String name;
	int qty;
	float price;
	float billAmount;
	Calctax obj;
	
	public Item(String name,int qty,float price, Calctax obj) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.price=price;
		this.qty=qty;
		this.obj=obj;
	}
	
	void setTax(Calctax obj) {
		this.obj=obj;
	}
	
	void setQuantity(int qty) {
		this.qty=qty;
	}

	public void printPrice() {
		System.out.println("\nName: "+this.name);
		System.out.println("\nQuantity: "+this.qty);
		System.out.println("\nPrice: "+this.price);
		float tax=obj.taxAmount(this.name, this.qty, this.price);
		float billAmount=(qty*price)+tax;
		System.out.println("\nTax Amount: "+tax);
		System.out.println("\nBill Amount: "+billAmount);		
	}
}