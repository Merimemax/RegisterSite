package edu.mum.registar.service.impl.facultyServiceImpl;

import edu.mum.registar.domain.Faculty;
import edu.mum.registar.repository.FacultyRepository;
import edu.mum.registar.service.facultyService.FacultyService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class facultyServiceImpl implements FacultyService {

@Autowired
    FacultyRepository facultyRepository;

    @Override
    public Faculty findFacultyByEmail(String email) {
        return facultyRepository.findFacultyByEmail(email);
    }

	@Override
	public List<Faculty> findAllfaculty() {
		
		return (List<Faculty>) facultyRepository.findAll();
	}

	@Override
	public Faculty findById(long id) {
		
		return facultyRepository.findById(id).get();
	}
}
