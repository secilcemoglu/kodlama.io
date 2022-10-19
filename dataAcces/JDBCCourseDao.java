package kodlama.io.dataAcces;

import kodlama.io.entities.Category;
import kodlama.io.entities.Course;

public class JDBCCourseDao implements ICategoryDoa, CourseDao {

	public void add(Category category) {
		System.out.println("JDBC İLE KATEGORY VERİTABNINA EKLENDİ" + category.getCategoryName());
		
	}
	public void add(Course course) {
		System.out.println("JDBC İLE KURS VERİTABANINA EKLENDİ " + course.getCourseName());
		
	}
}
