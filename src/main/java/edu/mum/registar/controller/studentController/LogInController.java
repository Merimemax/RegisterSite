package edu.mum.registar.controller.studentController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogInController {

    @GetMapping(value = "/login")
    public String login(){
        return "student/login";
    }

}
