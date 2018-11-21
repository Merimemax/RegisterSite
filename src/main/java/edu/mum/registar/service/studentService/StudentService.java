package edu.mum.registar.service.studentService;

import edu.mum.registar.domain.Student;

import java.util.List;

public interface StudentService {

     Student findStudentByEmail(String email);

     List<Student> findAllStudent();

<<<<<<< HEAD
    Student findStudentById(String id);

    public List<Student> findAllStudentByFacultyId(String faculty_id);
=======
     List<Student> findAllStudentByFacultyId(String faculty_id);
>>>>>>> 8d592616d9d8dfdc36830c657985ca8ea3ad03cc

     void save(Student student);



}
