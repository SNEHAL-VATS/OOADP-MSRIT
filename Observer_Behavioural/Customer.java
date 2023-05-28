package Observer_Behavioural;

public class Customer extends Observer{
	Subject store;
	float discount;
	String name;
	public Customer(Subject s, String n) {
		this.name=n;
		store=s;
		store.register(this);
		
	}
	
	@Override
	public void update(float d) {
		this.discount=d;
		System.out.println(name+" has received discount of "+discount+"%");
	}
	
	public String toString() {
		return name;
	}
	

}
