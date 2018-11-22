package edu.mum.registar.service.studentService;

import edu.mum.registar.domain.Student;

import java.util.List;

public interface StudentService {

    Student findStudentByEmail(String email);

    List<Student> findAllStudent();


    Student findStudentById(long id);

    List<Student> findAllStudentByFacultyId(long faculty_id);


    void save(Student student);

//
//    Student findStudentById(long id);
}
