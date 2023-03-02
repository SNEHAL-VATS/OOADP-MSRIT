package Adaptor_Structural;

public class MyMauritiustax implements Calctax {
	NewMauritiusTax m=new NewMauritiusTax();
	float tax_amount;
	@Override
	public float taxAmount(String id, int qty, float price) {

		tax_amount=m.calcTax(qty, price);
		return tax_amount;
	}

}