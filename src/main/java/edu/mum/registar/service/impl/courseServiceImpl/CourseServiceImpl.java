package edu.mum.registar.service.impl.courseServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.registar.domain.Course;
import edu.mum.registar.repository.CourseRepository;
import edu.mum.registar.service.courseService.CourseService;
@Service
public class CourseServiceImpl implements CourseService{
	@Autowired 
	CourseRepository courserepository;


	@Override
	public void save(Course course) {
		
		courserepository.save(course);
	}

	@Override
	public List<Course> getcourses() {
		// TODO Auto-generated method stub
		return (List<Course>) courserepository.findAll();
	}

	@Override
	public Course getcoursesbyID(long id) {

		return courserepository.findById(id).orElse(null);
		
	}

	@Override
	public void deletecourse(long id) {
		
		courserepository.deleteById(id);
	}



	
	


	

}
