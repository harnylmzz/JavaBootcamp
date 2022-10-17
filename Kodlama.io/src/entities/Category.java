package Kodlama.io.entities;

public class Category {
	
	private int id;
	private String name;
	private double code; 
		
	
	public double getCode() {
		return code;
	}


	public void setCode(double code) {
		this.code = code;
	}


	public Category() {
	}


	public Category(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.code = code;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	
	

}
