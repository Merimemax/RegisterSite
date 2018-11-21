package edu.mum.registar.service.impl.facultyServiceImpl;

import edu.mum.registar.domain.Faculty;
import edu.mum.registar.repository.FacultyRepository;
import edu.mum.registar.service.facultyService.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class facultyServiceImpl implements FacultyService {

@Autowired
    FacultyRepository facultyRepository;

    @Override
    public Faculty findFacultyByEmail(String email) {
//        return facultyRepository.findFacultyByEmail(email);

        Faculty faculty = new Faculty();
        faculty.setFirstName("Tina");
        faculty.setLastName("Xing");
        faculty.setEmail("tina@mum.edu");
        return faculty;
    }


}
