package edu.mum.registar.domain;

public class Section {
    private Long id;
    private String sectionNo;
    private Course course;
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
