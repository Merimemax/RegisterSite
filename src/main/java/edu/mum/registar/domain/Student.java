package edu.mum.registar.domain;

import java.time.LocalDate;
import java.util.List;

public class Student {

    private Long id;
    private int registrationNumber;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private LocalDate entryDate;
    private String email;
    private Faculty adviser;
    private List<Course> enrolledCourse;
    private List<Course> waiveredCourse;


}
