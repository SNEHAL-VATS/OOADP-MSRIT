package Template_Behavioural;
import java.util.*;
public class MenuItems implements Menu{
	ArrayList<Item> arr = new ArrayList<Item>();
	public MenuItems() {
		arr.add(new Item(1,"Item 1", 1000));
		arr.add(new Item(2,"Item 2", 1500));
		arr.add(new Item(3,"Item 3", 4500));
		arr.add(new Item(4,"Item 4", 2000));
		arr.add(new Item(5,"Item 5", 500));
	}
	
	@Override
	public void displayMenu() {
		System.out.println("List of items are as follows :-");
		for(Item i:arr) {
			System.out.println("ID : "+i.id+"\tName : "+i.name+"\tPrice : "+i.price);
		}
	}

}
