package Template_Behavioural;

public abstract class StoreApp {
	abstract Item selectItem();
	abstract void doPayment(Item i);
	abstract void doDelivery();
	
	void purchaseItem() {
		Item i = selectItem();
		if(i!=null) {
			doPayment(i);
			doDelivery();
		}
	}

}
