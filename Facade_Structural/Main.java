package Facade_Structural;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the bill amount: ");
		double bill=sc.nextDouble();
		System.out.println("Do you have a gift card? Y/N.");
		String b=sc.next().toLowerCase();
		boolean g;
		if(b.equals("y")) {
			g=true;
		}
		else {
			g=false;
		}
		Facade fc=new Facade(g, bill);
		
		fc.totalBill();
		fc.display();
	}

}
