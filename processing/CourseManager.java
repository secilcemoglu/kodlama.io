package kodlama.io.processing;

import kodlama.io.dataAcces.CourseDao;
import kodlama.io.entities.Course;
import kodlama.io.Logging.Logger;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		if(course.getCourseName().equals(course.getCourseName())){
			throw new Exception("BU KURS ADI DAHA ÖNCE KULLANILMIŞ! ");
			
		}
		if(course.getCoursePrice()<10) {
			throw new Exception("KURS FİYATI 0'DAN KÜÇÜK OLAMAZ!");
		}

		courseDao.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
			
		}

}
}
