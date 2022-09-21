package intro;

public class Main {

	public static void main(String[] args) {
		
        System.out.println("Hello World!");
        
        String ortaMetin = "İlginizi çekebilir :)";
        String altMetin = "Vade süresi";		
        
        System.out.println(ortaMetin);
        System.out.println(altMetin);
        
        int vade = 12; 
        
        double dolarDun = 18.25;
        double dolarBugun = 18.35;
        
        boolean dolarDustuMu = false;
        
        String okYonu = "";
        
        if (dolarBugun<dolarDun) {
        	okYonu = "down.svg";
			System.out.println(okYonu);
		} 
        else if (dolarBugun>dolarDun) {
        	
        	
        	okYonu = "up.svg";
			System.out.println(okYonu);
		}
        else {
        	okYonu = "equal.svg";
			System.out.println(okYonu);       	
        }
        
        //array
        
        String [] krediler = {"Hızlı kredi", "Maaşını Halkbank'tan Alankar", "Emekliler", "Emekli Olmak İsteyenler"};
      
        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        
	}
	}
}
