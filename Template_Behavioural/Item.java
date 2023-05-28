package Template_Behavioural;

public class Item {
	String name;
	float price;
	int id;
	
	public Item(int i,String n, float p) {
		this.name=n;
		this.price=p;
		this.id=i;
	}
	int getID() {
		return id;
	}

}
