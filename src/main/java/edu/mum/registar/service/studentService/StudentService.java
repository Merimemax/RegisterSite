package edu.mum.registar.service.studentService;

import edu.mum.registar.domain.Student;

import java.util.List;

public interface StudentService {

    public Student findStudentByEmail(String email);

<<<<<<< HEAD
=======
    public List<Student> findAllStudent();

    public List<Student> findAllStudentByFacultyId(String faculty_id);

>>>>>>> 16716e000d1db76c2b4d2f3c62b3dd466a3b4e3e

}
