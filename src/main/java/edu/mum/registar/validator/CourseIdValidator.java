package edu.mum.registar.validator;

import java.util.List;

import javax.validation.ConstraintValidator; 
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;



import edu.mum.registar.domain.Course;
import edu.mum.registar.service.courseService.CourseService;

public class CourseIdValidator  implements ConstraintValidator<CourseCode,String> {

	@Autowired
	private CourseService courseService;

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context ) {
		List <Course> course = null;
		try {
			course = courseService.geyCourseByCourseCode(value);
		} catch (Exception e) {

		}
		return course == null ? true : false;
	}
			
		
	@Override
	public void initialize(CourseCode arg0) {
	}
		
	
	
	



	

		
	}
	
		
	