package entities;

public class Customer {
	
	private String tc;
	private String name;
	private String lastName;
	public Customer() {
	}
	public Customer(String tc, String name, String lastName) {
		
		this.tc = tc;
		this.name = name;
		this.lastName = lastName;
		
		
		
	}
	public String getTc() {
		return tc;
	}
	public void setTc(String tc) {
		this.tc = tc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	

}
