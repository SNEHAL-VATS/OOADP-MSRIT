package Template_Behavioural;
import java.util.*;
public class OfflineOrder extends StoreApp {
	Scanner sc=new Scanner(System.in);
	MenuItems menu;
	public OfflineOrder() {
		menu=new MenuItems();
	}
	
	@Override
	Item selectItem() {
		for (Item i: menu.arr) {
			System.out.println("ID : "+i.id+"\tName : "+i.name+"\tPrice : "+i.price);
			System.out.println("Do you want to buy this item? y/n");
			String c=sc.nextLine().toLowerCase();
			if(c.equals("y")) {
				return i;
			}
		}
		System.out.println("No more items to show");
		return null;
	}
	
	@Override
	void doPayment(Item i) {
		System.out.println("\nSelected Item :-");
		System.out.println("ID : "+i.id+"\tName : "+i.name+"\tPrice : "+i.price);
		System.out.println("\n Payment Modes :\n1.Cash\n2.Card");
		int ch;
		do {
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			if(ch==1) {
				cash();
		}
			else if(ch==2) {
				card();
			}
			else {
				System.out.println("\nInvalid output please try again");
			}
		}while(ch!=1 && ch!=2);
		
	}
	
	@Override
	void doDelivery() {
		System.out.println("Your order will be delivered");
	}
	 
	private void cash() {
		System.out.println("Thanks for payment by cash");
	}
	private void card() {
		System.out.println("Thanks for payment by card+");
	}

}
