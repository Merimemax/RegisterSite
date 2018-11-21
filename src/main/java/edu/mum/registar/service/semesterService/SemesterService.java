package edu.mum.registar.service.semesterService;

import java.util.List;

import edu.mum.registar.domain.Semester;

public interface SemesterService {
	List<Semester> getSemesters();
	Semester getOne(long id);

}
