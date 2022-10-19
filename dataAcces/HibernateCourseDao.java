package kodlama.io.dataAcces;

import kodlama.io.entities.Category;
import kodlama.io.entities.Course;

public class HibernateCourseDao implements CourseDao, ICategoryDoa {

	public void add(Category category){
		System.out.println("HIBERNATE İLE KATEGORY VERİTABNINA EKLENDİ" + category.getCategoryName());
		
	}
	
	public void add(Course course){
		System.out.println("HIBERNATE İLE KURS VERİTABNINA EKLENDİ" + course.getCourseName());
		
	}
}
