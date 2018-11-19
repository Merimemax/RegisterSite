package edu.mum.registar.controller.facultyController;

import edu.mum.registar.domain.Faculty;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FacultyHomeController {


    @PostMapping("/faculty")
    public String submitLogInForm(@ModelAttribute Faculty faculty, RedirectAttributes redirectAttributes) {
//        if (br.hasErrors()) {
//            return "faculty/login";
//        }
        redirectAttributes.addFlashAttribute(faculty);
        return "redirect:/facultyHome";
    }
    @GetMapping("/facultyHome")
        public String success(){
            return"faculty/home";
        }}


