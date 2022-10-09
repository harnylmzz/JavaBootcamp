
public class CustomerManager {
	
	private ICreditManager _creCreditManager;

	public CustomerManager(Customer customer, ICreditManager creditManager) {
		
	this._creCreditManager = creditManager;
	 		
	}
	
	
	
	public void Save() {

		System.out.println("Müşteri kaydedildi: ");
	}

	public void Delete() {

		System.out.println("Müşteri silindi: ");

	}
	
	public void GiveCredit() {
		
		_creCreditManager.Calculate();
		System.out.println("Kredi verildi");
		

	}	
	
}
