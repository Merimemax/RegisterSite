package edu.mum.registar.service.impl.studentServiceImpl;

import edu.mum.registar.domain.Student;
import edu.mum.registar.repository.StudentRepository;
import edu.mum.registar.service.studentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student findStudentByEmail(String email) {
        return studentRepository.findStudentByEmail(email);
    }

    @Override
    public List<Student> findAllStudent() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public List<Student> findAllStudentByFacultyId(String faculty_id) {
        return (List<Student>) studentRepository.findStudentsByFacultyId(faculty_id);
    }
}
