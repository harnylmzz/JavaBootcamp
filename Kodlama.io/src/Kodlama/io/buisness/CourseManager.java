package Kodlama.io.buisness;

import java.util.List;

import Kodlama.io.core.logging.Logger;
import Kodlama.io.dataAccess.CourseDao;
import Kodlama.io.dataAccess.HibernateCourseDao;
import Kodlama.io.dataAccess.jdbcCourseDao;
import Kodlama.io.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private  Logger [] loggers;
	 

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {

		if (course.getPrice() < 150) {
			throw new Exception("HATA! Kurs fiyatı 150 TL'den az olamaz.");
		}
		
		courseDao.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
		
	}

}
