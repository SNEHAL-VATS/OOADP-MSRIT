package Factory_Creational;

public class CustomerFactory {
	Customer getCustomer(String t) throws IllegalArgumentException{
		if(t.equalsIgnoreCase("First time"))
			return new FirstTimeCustomer();
		else if(t.equalsIgnoreCase("Regular Customer"))
			return new RegularCustomer();
		else if(t.equalsIgnoreCase("Senior Citizen"))
			return new SeniorCitizen();
		else
			throw new IllegalArgumentException("Unknown Customer Type: "+t);
	}

}
