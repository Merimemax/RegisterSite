package edu.mum.registar.domain;

<<<<<<< HEAD
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
=======
import javax.persistence.*;
>>>>>>> 07ac10195377b7ac36736b6be11fc3b12f7abcf8
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD

public class Faculty {
//@Id
//@GeneratedValue(strategy = GenerationType.AUTO)
=======
@Entity
public class Faculty {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "faculty_id")
>>>>>>> 07ac10195377b7ac36736b6be11fc3b12f7abcf8
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String email;

    @ManyToMany
    private List<Course> courses;

    @OneToMany
    private List<Student> advicees;

    public Faculty() {
        courses = new ArrayList<>();
        advicees = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Student> getAdvicees() {
        return advicees;
    }

    public void setAdvicees(List<Student> advicees) {
        this.advicees = advicees;
    }
}
