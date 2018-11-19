package edu.mum.registar.repository;

import org.springframework.data.repository.CrudRepository;

import edu.mum.registar.domain.Course;


public interface CourseRepository extends CrudRepository<Course, Long> 
{
	
	

}
