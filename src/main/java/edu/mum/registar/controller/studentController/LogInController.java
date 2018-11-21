package edu.mum.registar.controller.studentController;

import edu.mum.registar.domain.Credential;
import edu.mum.registar.domain.Student;
import edu.mum.registar.service.studentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
public class LogInController {

    @Autowired
    StudentService studentService;



    @GetMapping(value = "/login")
    public String login(@ModelAttribute("credentials") Credential credential){
        return "student/login";
    }

    @PostMapping(value = "/login")
    public String verify(@Valid @ModelAttribute("credentials") Credential credential, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            return "student/login";
        }

        System.out.println("input email: " + credential.getUserName());

        Student student = studentService.findStudentByEmail(credential.getUserName());

        List<Student> studentList = studentService.findAllStudent();

        System.out.println("student name " + studentList);

        model.addAttribute("student", student);

        return "redirect:/student";
    }

}
