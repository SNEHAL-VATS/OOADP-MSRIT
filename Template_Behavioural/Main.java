package Template_Behavioural;
import java.util.*;
public class Main {
	public static void main(String args[]) {
		int ch;
		System.out.println("Welcome to Template Shopping App");
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("1.Online Purchase\n2.Offline Purchase\n3.Exit.");
			ch=Integer.parseInt(sc.next());
			if (ch==1) {
				OnlineOrder oi = new OnlineOrder();
				oi.purchaseItem();}
			else if(ch==2) {
				OfflineOrder of = new OfflineOrder();
				of.purchaseItem();
			}
			else if(ch==3) {
				System.out.println("Exiting");
				break;
			}
			else {
				System.out.println("Invalid Input. Please try again.");
			}
			}
		System.out.println("\n\nThank you for shopping with us!");
		
	}

}
