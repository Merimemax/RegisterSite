package edu.mum.registar.service.courseService;

import java.util.List;
import java.util.Optional;

import edu.mum.registar.domain.Course;

public interface CourseService {

	void save(Course course);

	public List<Course> getcourses() ;

	public Course getcoursesbyID(long id);

	void deletecourse(long id);

	public Course geyCourseByCourseCode(String value);
	

	
	

}
