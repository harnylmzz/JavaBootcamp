
public class GetterAndSetterAgain {
	public static void main(String[] args) {
		
		Product product = new Product();
		
		
		product.setId(1);
		product.setName("Laptop");
		product.setDescription("Asus Laptop");
		product.setStockAmount(4);
		product.setColour("Gri");
		product.setPrice(78.250);
		product.setCode("789456");
		
		System.out.println(product.getCode());
		
	}

}
