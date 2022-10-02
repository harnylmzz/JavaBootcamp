
public class Product {
	public Product(int id, String name, String description, double price, int stockAmount) {
		System.out.println("Yapıcı blok çalıştı");
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;

	}

	public Product() {

	}

	// attribute | field
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;

	// this = "içinde bulunduğum class" demek

	// getter
	public int get_id() {
		return id;
	}

	// setter
	public void set_id(int id) {
		this.id = id;
	}

	public String get_name() {
		return name;
	}

	public void set_name(String name) {
		this.name = name;
	}

	public String get_description() {
		return description;
	}

	public void set_description(String description) {
		this.description = description;
	}

	public double get_price() {
		return price;
	}

	public void set_price(double price) {
		this.price = price;
	}

	public int get_stockAmount() {
		return stockAmount;
	}

	public void set_stockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

}
