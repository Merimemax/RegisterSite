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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Faculty getAdviser() {
        return adviser;
    }

    public void setAdviser(Faculty adviser) {
        this.adviser = adviser;
    }

    public List<Course> getEnrolledCourse() {
        return enrolledCourse;
    }

    public void setEnrolledCourse(List<Course> enrolledCourse) {
        this.enrolledCourse = enrolledCourse;
    }

    public List<Course> getWaiveredCourse() {
        return waiveredCourse;
    }

    public void setWaiveredCourse(List<Course> waiveredCourse) {
        this.waiveredCourse = waiveredCourse;
    }
}
