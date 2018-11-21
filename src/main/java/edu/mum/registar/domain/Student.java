package edu.mum.registar.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity

@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int registrationNumber;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth = LocalDate.of(1990, 5, 23);
    private LocalDate entryDate = LocalDate.now();
    private String email;

    @ManyToOne
    @JoinColumn(name = "faculty_id")
    private Faculty adviser;

    @ManyToMany
    private List<Course> enrolledCourse;

    @ManyToMany
    private List<Course> waiveredCourse;


    public Student() {
        enrolledCourse = new ArrayList<>();
        waiveredCourse = new ArrayList<>();
    }


    public void enrolleCourse(Course course) {
        enrolledCourse.add(course);
    }

    public void waiveCourse(Course course) {
        enrolledCourse.add(course);
    }

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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", registrationNumber=" + registrationNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", entryDate=" + entryDate +
                ", email='" + email + '\'' +
                ", adviser=" + adviser +
                ", enrolledCourse=" + enrolledCourse +
                ", waiveredCourse=" + waiveredCourse +
                '}';
    }
}
