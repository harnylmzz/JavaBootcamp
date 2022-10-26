package arrayListWithClass;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Customer> customers = new ArrayList<>();
		
		customers.add(new Customer (1, "Harun", "Yılmaz")); 
		customers.add(new Customer (2, "Derin", "Yüksek"));
		customers.add(new Customer (3, "Kucuk", "Gargamel"));
		
		for (Customer customer: customers) {
			
			System.out.println(customer.firstName);
		}
	}

}
