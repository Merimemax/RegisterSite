package edu.mum.registar.service.impl.courseServiceImpl;

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

}
