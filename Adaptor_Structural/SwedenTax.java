package Adaptor_Structural;

public class SwedenTax implements Calctax {
	@Override
	public float taxAmount(String id, int qty, float price) {
		// TODO Auto-generated method stub
		return qty*price*0.18f;
	}

}