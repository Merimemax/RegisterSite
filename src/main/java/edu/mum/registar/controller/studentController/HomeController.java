package edu.mum.registar.controller.studentController;

import edu.mum.registar.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String studentHome(Model model){
       Student student = (Student) model.asMap().get("student");
        return "student/index";
    }
}
