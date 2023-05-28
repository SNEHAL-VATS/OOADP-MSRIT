package Facade_Structural;
import java.util.*;
public class ItemPurchased {
	Scanner sc=new Scanner(System.in);
	HashMap <String,Integer> item;
	int type;
	
	ItemPurchased(){
		item=new HashMap<String,Integer>();
	}
	
	void details() {
		System.out.println("How many types of items have you bought?");
		type=sc.nextInt();
		for(int i=0;i<type;i++) {
			System.out.println("Enter the name of the item"+(i+1));
			String n=sc.next();
			System.out.println("Enter quantity");
			int q=sc.nextInt();
			item.put(n, q);}
		}
	
	int getType() {
		return this.type;
	}
	
	void cart() {
		System.out.println("\nItems purhased are\n");
		System.out.println(List.of(item));
	}
}
