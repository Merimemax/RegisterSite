package edu.mum.registar.controller.facultyController;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/faculty")
public class FacultyLoginController {

    @GetMapping()
    public String login(){
        return "faculty/login";
    }



}
