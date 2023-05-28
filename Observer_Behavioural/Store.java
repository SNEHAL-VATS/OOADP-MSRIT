package Observer_Behavioural;
import java.util.*;
public class Store extends Subject{
	float dis;
	String nm;
	ArrayList<Observer> arr;
	
	public Store(String n, float d) {
		arr=new ArrayList<Observer>();
		this.nm=n;
		this.dis=d;
	}
	
	@Override
	void register(Observer o) {
		arr.add(o);
		System.out.println("Added customer "+o+" to store "+nm);
	}
	
	@Override
	void Notify() {
		for(Observer o:arr) {
			o.update(dis);
		}
	}
	
	@Override
	void unregister(Observer o) {
		try {
			arr.remove(arr.indexOf(o));
			System.out.println("Customer removed");
			
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
	}
	
	void setDiscount(String festival, float d) {
		dis=d;
		System.out.println("New Discount Offer on "+festival);
		Notify();
	}
}
