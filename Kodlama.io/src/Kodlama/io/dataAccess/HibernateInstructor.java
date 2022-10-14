package Kodlama.io.dataAccess;

import Kodlama.io.entities.Instructor;

public class HibernateInstructor implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		
		System.out.println("Eğitmen Hibernate ile veritabanına eklendi.");

		
		
	}

}
