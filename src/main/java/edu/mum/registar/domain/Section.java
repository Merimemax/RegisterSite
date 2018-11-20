package edu.mum.registar.domain;

import javax.persistence.*;

@Entity
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String sectionNo;

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

    public Faculty getProffessor() {
        return proffessor;
    }

    public void setProffessor(Faculty proffessor) {
        this.proffessor = proffessor;
    }
}
