package edu.mum.registar.domain;

import java.time.LocalDate;
import java.util.List;

public class Faculty {

    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String email;
    private List<Course> courses;
    private List<Student> advicees;
}
