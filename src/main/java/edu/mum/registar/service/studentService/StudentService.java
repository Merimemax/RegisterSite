package edu.mum.registar.service.studentService;

import edu.mum.registar.domain.Student;

import java.util.List;

public interface StudentService {

    public Student findStudentByEmail(String email);

    public List<Student> findAllStudent();

    Student findStudentById(String id);

    public List<Student> findAllStudentByFacultyId(String faculty_id);

    public void save(Student student);



}
