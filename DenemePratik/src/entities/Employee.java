package entities;

public class Employee {
	
	private String name;
	private String lastName; 
	private double wage;
	public Employee() {

	
	}
	public Employee(String name, String lastName, double wage) {
		this.name = name;
		this.lastName = lastName;
		this.wage = wage;
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
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	} 
	

}
