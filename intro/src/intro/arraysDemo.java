package intro;

public class arraysDemo {

	public static void main(String[] args) {
		String[] students = new String[4];
		students[0] = "Harun";
		students[1] = "Pelin";
		students[2] = "Yılmaz";
		students[3] = "Yamak";

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);

		}
		System.out.println("-------------------");     
		
		for (String student:students) {
			
			System.out.println(student);
		}
	}

}
