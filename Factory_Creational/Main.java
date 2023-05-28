package Factory_Creational;

public class Main {
	public static void main(String args[]) {
		CustomerFactory cf=new CustomerFactory();
		Customer c1=cf.getCustomer("First time");
		Customer c2=cf.getCustomer("Senior Citizen");
		Customer c3=cf.getCustomer("Regular Customer");
		
		c1.getType();
		c2.getType();
		c3.getType();
	}

}
