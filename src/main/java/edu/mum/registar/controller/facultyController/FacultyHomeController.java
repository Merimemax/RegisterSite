package edu.mum.registar.controller.facultyController;

import edu.mum.registar.service.studentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/faculty")
public class FacultyHomeController {
    @Autowired
    StudentService studentService;

    @GetMapping("/facultyHome")
    public String success(){
        return"faculty/home";
    }


//
//    @GetMapping("/student/{id}")
//    public Student getStudentById(@PathVariable("id") long id){
//        return studentService.getStudentById(id);
//    }

}


