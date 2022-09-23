package intro;

public class swichDemo {

	public static void main(String[] args) {

		char grade = 'G';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel: Geçtiniz");
			break;

		case 'B':
			System.out.println("Çok iyi: Geçtiniz");
			break;

		case 'C':
			System.out.println("İyi: Geçtiniz");
			break;

		case 'D':
			System.out.println("Daha çok çalış: Geçtiniz");
			break;

		case 'F':
			System.out.println("Maalesef: Kaldınız");
			break;

		default:
			System.out.println("Geçersiz not girdiniz. Lütfen tekrar deneyiniz.");

		}
	}

}
