package edu.mum.registar.service.studentService;

import edu.mum.registar.domain.Student;

import java.util.List;

public interface StudentService {

    public Student findStudentByEmail(String email);

    public List<Student> findAllStudent();

    public List<Student> findAllStudentByFacultyId(String faculty_id);


}
