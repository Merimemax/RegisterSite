package edu.mum.registar.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message="Section Name should Not be Empty")
    private String sectionNo;
    @NotNull(message="capacity should not be empty")
    private Integer capacity;
    
    @OneToMany( fetch = FetchType.LAZY)
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }
    @OneToOne
    private Course course;

    @OneToOne
    private Faculty proffessor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Integer getCapacity() {
  		return capacity;
  	}


  	public void setCapacity(Integer capacity) {
  		this.capacity = capacity;
  	}

    public String getSectionNo() {
        return sectionNo;
    }

    public void setSectionNo(String sectionNo) {
        this.sectionNo = sectionNo;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Faculty getProffessor() {
        return proffessor;
    }

    public void setProffessor(Faculty proffessor) {
        this.proffessor = proffessor;
    }
}
