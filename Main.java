package kodlamaIo;

import kodlama.io.entities.Category;
import kodlama.io.entities.Course;
import kodlama.io.processing.CategoryManager;
import kodlama.io.processing.CourseManager;
import kodlama.io.Logging.DatabaseLogger;
import kodlama.io.Logging.FileLogger;
import kodlama.io.Logging.Logger;
import kodlama.io.Logging.MailLogger;
import kodlama.io.dataAcces.HibernateCourseDao;
import kodlama.io.dataAcces.JDBCCourseDao;

public class Main {
	public static void main() throws Exception {
		Course course1 = new Course(1,"JAVA 202201",2000);
		Category category1 = new Category(1,"JAVA KURSU");
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
	
	CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
	CategoryManager categoryManager = new CategoryManager (new JDBCCourseDao(), loggers);
	
	courseManager.add(course1);
	categoryManager.add(category1);
	}

}
