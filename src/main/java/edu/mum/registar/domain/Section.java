package edu.mum.registar.domain;

import java.util.List;

import javax.persistence.*;

@Entity
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String sectionNo;
    private int capacity;
    
    @OneToMany( fetch = FetchType.LAZY)
    private List<Student> students;
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
    public int getCapacity() {
  		return capacity;
  	}


  	public void setCapacity(int capacity) {
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
