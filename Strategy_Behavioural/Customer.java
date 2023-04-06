package Strategy_Behavioural;
public abstract class Customer {
	
	static String name; 
	static int age;
	
	Discount d; 
	
	Customer(){
		
	}
	
	
	public void calculateDiscount(double mrptotal) { 
		d.calculateBillAmount(mrptotal); 
		//System.out.println(mrptotal); 
		//System.out.println("MRP Total recived");
	}
	
	public void display() { 
		System.out.println("Name is "+ name + " \nAge is " + age); 
	}

}



	
	