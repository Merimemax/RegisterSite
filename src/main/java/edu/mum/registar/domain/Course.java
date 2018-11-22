package edu.mum.registar.domain;

import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;
import edu.mum.registar.validator.CourseCode;

@Entity
public class Course {
	@Id
	
	@GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
	
	@CourseCode
    private String courseCode;
	@NotEmpty (message="courseName cant be null")
    private String courseName;
    @OneToOne
    @JoinColumn(name="prerequiste_id")
    private Course prerequiste;
    @NotNull (message="credit cant be null")
    private Integer credit;
    
    @Transient
    private MultipartFile productImage;

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

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }
}
