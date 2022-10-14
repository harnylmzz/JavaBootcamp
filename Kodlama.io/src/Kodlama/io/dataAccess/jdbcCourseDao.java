package Kodlama.io.dataAccess;

import Kodlama.io.entities.Course;

public class jdbcCourseDao implements CourseDao {
	
	public void add (Course course) {
		
		System.out.println("Kurs JDBC ile veritabanına eklendi.");
	}

}
