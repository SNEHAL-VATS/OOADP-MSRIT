package Observer_Behavioural;

public class Main {
	public static void main(String args[]) {
		Store s=new Store("Store1",10);
		Customer c1=new Customer(s,"AA");
		Customer c2=new Customer(s,"BB");
		s.setDiscount("Holi",5);
		s.unregister(c2);
		s.setDiscount("Diwali", 10);
		Customer c3=new Customer(s,"CC");
		s.setDiscount("Navaratri", 15);
	}	
}
