package Kodlama.io.dataAccess;

import Kodlama.io.entities.Instructor;

public class JdbcInstructor implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		
		System.out.println("Eğitmen JDBC ile veritabanına eklendi.");

		
	}

}
