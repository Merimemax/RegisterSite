package edu.mum.registar.controller.studentController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentHomeController {

    @GetMapping(value = "/")
    public String studentHome(){
        return "student/studentHome";
    }
}
