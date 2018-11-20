package edu.mum.registar.service.studentService;

import edu.mum.registar.domain.Student;

public interface StudentService {

    public Student findStudentByEmail(String email);
}
