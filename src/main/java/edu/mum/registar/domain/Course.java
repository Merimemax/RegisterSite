package edu.mum.registar.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String courseCode;
    private String courseName;
    @OneToOne
    @JoinColumn(name="prerequiste_id")
    private Course prerequiste;
    private int credit;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Course getPrerequiste() {
        return prerequiste;
    }

    public void setPrerequiste(Course prerequiste) {
        this.prerequiste = prerequiste;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}
