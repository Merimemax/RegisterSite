package edu.mum.registar.controller.facultyController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/faculty")
public class FacultyHomeController {

    @GetMapping("/facultyHome")
    public String success(){
        return"faculty/home";
    }
}


