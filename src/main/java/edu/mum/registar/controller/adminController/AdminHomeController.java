package edu.mum.registar.controller.adminController;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminHomeController {
    @GetMapping("/admin")
    public String displayHome() {


        return "redirect:/admin/block";
    }
    @GetMapping("/logins")
    public String login() {


        return "/admin/login";
    }
}