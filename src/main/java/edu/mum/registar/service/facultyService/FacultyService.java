package edu.mum.registar.service.facultyService;

import java.util.List;

import edu.mum.registar.domain.Faculty;

public interface FacultyService {

public Faculty findFacultyByEmail(String email);
public List<Faculty> findAllfaculty();
public Faculty findById(long id);

}
