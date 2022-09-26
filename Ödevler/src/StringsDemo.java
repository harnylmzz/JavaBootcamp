
public class StringsDemo {

	public static void main(String[] args) {

		String message = "   Bugün hava çok güzel.    ";
		System.out.println(message);
		System.out.println("Eleman sayısı:" + message.length());
		System.out.println("5. eleman hangisi?: " + message.charAt(4));
		System.out.println(message.concat(" Yaşasın!"));
		System.out.println(message.startsWith("B"));
		System.out.println(message.endsWith("."));
		char[] karakterler = new char[5];
		message.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(message.indexOf('a'));
		System.out.println(message.lastIndexOf('a'));
		System.out.println("----------------------------------");
		
		
		String newMessage = message.replace(" ", "-");
		System.out.println(newMessage);
		System.out.println(message.substring(2,5));
		for (String word : message.split(" ")) {
			System.out.println(word);
			
		}
		
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message.trim());

	}

}
