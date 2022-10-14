import Kodlama.io.buisness.CategoryManager;
import Kodlama.io.buisness.CourseManager;
import Kodlama.io.buisness.InstructorManager;
import Kodlama.io.core.logging.DatabaseLogger;
import Kodlama.io.core.logging.FileLogger;
import Kodlama.io.core.logging.Logger;
import Kodlama.io.core.logging.MailLoger;
import Kodlama.io.dataAccess.HibernateCourseDao;
import Kodlama.io.dataAccess.HibernateInstructor;
import Kodlama.io.dataAccess.JdbcCategoryDao;
import Kodlama.io.dataAccess.JdbcInstructor;
import Kodlama.io.dataAccess.jdbcCourseDao;
import Kodlama.io.entities.Category;
import Kodlama.io.entities.Course;
import Kodlama.io.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		Course course1 = new Course(1, "Java2022", 1250);
		
		
		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLoger()  }; 
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course1); 
	}
	
	
	Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ"); {
	Logger[] loggers1 = { new DatabaseLogger(), new FileLogger(), new MailLoger()  };
	
	InstructorManager instructorManager = new InstructorManager(new JdbcInstructor(), loggers1);

	
	try {
		
		instructorManager.add(instructor1);
	}catch (Exception e) {
		
		e.printStackTrace();
	}
	
	Category category = new Category(1, "Programlama", 2); {
		
		Logger[] loggers2 = { new DatabaseLogger(), new FileLogger(), new MailLoger()  };
		
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers2);
		
		try {
			
			categoryManager.add(category);

		}catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	} 
	}
	
	
		
		
	}


	
	
	
	
	
	
	
	
	
	





