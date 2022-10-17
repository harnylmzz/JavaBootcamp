import Kodlama.io.buisness.CategoryManager;
import Kodlama.io.buisness.CourseManager;
import Kodlama.io.buisness.InstructorManager;
import Kodlama.io.core.logging.DatabaseLogger;
import Kodlama.io.core.logging.FileLogger;
import Kodlama.io.core.logging.Logger;
import Kodlama.io.core.logging.MailLoger;
import Kodlama.io.dataAccess.HibernateCourseDao;
import Kodlama.io.dataAccess.HibernateInstructor;
import Kodlama.io.dataAccess.InstructorDao;
import Kodlama.io.dataAccess.JdbcCategoryDao;
import Kodlama.io.dataAccess.JdbcInstructor;
import Kodlama.io.dataAccess.jdbcCourseDao;
import Kodlama.io.entities.Category;
import Kodlama.io.entities.Course;
import Kodlama.io.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		/* entities create field */
		Course course1 = new Course(1, "Java2022", 1250);
		Instructor instructor1 = new Instructor(15, "Engin", "Demiroğ");
		Category category1 = new Category(3, "Yazılım", 2022);

		/* Logger create field */
		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLoger() };

		/* manager create and add field */
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course1);

		InstructorManager instructorManager = new InstructorManager(new HibernateInstructor(), loggers);
		instructorManager.add(instructor1);

		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
		categoryManager.add(category1);
	}

}
