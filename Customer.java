package packagetest.restaurant.customer;

public class Customer {

	public String customerName;
	private String customerMobile;
	public static int customerCount;
	public Customer(String customerName, String customerMobile) {
		super();
		this.customerName = customerName;
		this.customerMobile = customerMobile;
		customerCount++;
	}
	
	
	
}
