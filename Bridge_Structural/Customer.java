package Bridge_Structural;

public abstract class Customer {
	 String name; 
	 int age;
	 DiscountCalculator dc;
	 public Customer(String s, int a) {
		 this.name=s;
		 this.age=a;
	 }
	 Customer(){}

	public void DiscountType (DiscountCalculator d) { 
		dc = d; 
	}
	
	public void Discount(double mrptotal) { 
		dc.calculateBillAmount(mrptotal); 
	}
	
	public void display() { 
		System.out.println("Name is "+ name + " \nAge is " + age); 
	}

}