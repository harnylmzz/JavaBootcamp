package Kodlama.io.entities;

public class Instructor {
	
	private int tc;
	private String name;
	private String lastName;
	
	
	public Instructor() {
		
	}


	public Instructor(int tc, String name, String lastName) {
		
		this.tc = tc;
		this.name = name;
		this.lastName = lastName;
	}


	public int getTc() {
		return tc;
	}


	public void setTc(int tc) {
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
