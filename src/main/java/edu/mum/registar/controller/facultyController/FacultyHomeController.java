package edu.mum.registar.controller.facultyController;

import edu.mum.registar.domain.Student;
import edu.mum.registar.service.studentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/faculty")
public class FacultyHomeController {
    @Autowired
    StudentService studentService;

    @GetMapping("/home")
    public String success(){

        return"/faculty/home";
    }

    @GetMapping("/details")
    public String showDetails(@RequestParam("id") String id, Model model){
        System.out.println("id " + id);

       Student student =  studentService.findStudentById(Long.parseLong(id));

       model.addAttribute("student", student);
        return "/faculty/detail";
    }

//
//    @GetMapping("/student/{id}")
//    public Student getStudentById(@PathVariable("id") long id){
//        return studentService.getStudentById(id);
//    }

}


