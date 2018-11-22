package edu.mum.registar.repository;




import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.registar.domain.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course,Long>
{
	
	Course findBycourseCode(String courseCode);
	
}
