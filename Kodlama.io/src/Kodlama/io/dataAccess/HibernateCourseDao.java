package Kodlama.io.dataAccess;

import Kodlama.io.entities.Course;

public class HibernateCourseDao implements CourseDao {
	
	public class jdbcCourseDao {
		
	}

	@Override
	public void add(Course course) {
		
		System.out.println("Kurs Hibernate ile veritabanına eklendi.");
	}
}
