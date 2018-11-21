package edu.mum.registar.controller.studentController;

import edu.mum.registar.domain.Student;
import edu.mum.registar.service.studentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class HomeController {

    @Autowired
    StudentService studentService;

    @GetMapping(value = "/")
    public String studentHome(){
        return "student/index";
    }

    @GetMapping(value = "/signup")
    public String studentSignUp(@ModelAttribute("student") Student student){
        return "student/singup";
    }

    @PostMapping(value = "/singup")
    public String registerStudent(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult, RedirectAttributes redirectAttributes){

        if(bindingResult.hasErrors()){
            return "student/singup";
        }

        studentService.save(student);

        redirectAttributes.addFlashAttribute("student", student);

        return "redirect:/student/home";
    }

    @GetMapping(value = "home")
    public String successfullySaved(){

        System.out.println("home is called");
        return "student/studetHome";
    }
}
