package Adaptor_Structural;
import java.util.*;
public class TaxAdapterDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Calctax ct=new MyMauritiustax();
		String nm;
		int qty;
		float amt;
		char ch='y';
		System.out.println("Enter the details of the items");
		while(ch=='y' || ch=='Y') {
			System.out.println("\nEnter the id/name : ");
			nm=sc.nextLine();
			System.out.println("\nEnter the quantity : ");
			qty=sc.nextInt();
			System.out.println("\nEnter the amount : ");
			amt=sc.nextFloat();
			System.out.println("\n");
			Item i=new Item(nm,qty,amt,ct);
			//Item i1 = new Item("cycle",2,100,ct);
			i.printPrice();		
			i.setTax(new SwedenTax());
			i.printPrice();
			System.out.println("Enter y/Y to continue entering details, else press any key to quit\n");
			ch=sc.next().charAt(0);
		}
		System.out.println("\n******************************PROGRAM END******************************");
		
	}
}