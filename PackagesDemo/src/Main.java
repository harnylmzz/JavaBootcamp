import java.util.Scanner;
import Matematik.*;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Adiniz:");

		String isim = scanner.nextLine();

		System.out.println("Merhaba " + isim);

		Dortislem dortislem = new Dortislem();
		dortislem.topla(2, 3);
		Logartima logaritma = new Logartima();

	}

}
