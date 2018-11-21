package edu.mum.registar.service.impl.semesterServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.registar.domain.Semester;
import edu.mum.registar.repository.SemesterRepository;
import edu.mum.registar.service.semesterService.SemesterService;
@Service
public class SemesterServiceImpl implements SemesterService {

	@Autowired
	private SemesterRepository semesterRepository;
	@Override
	public List<Semester> getSemesters() {
				
		return (List<Semester>) semesterRepository.findAll();
	}
	@Override
	public Semester getOne(long id) {
		
		return semesterRepository.findById(id).get();
	}

}
