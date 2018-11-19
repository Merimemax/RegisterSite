package edu.mum.registar.controller.studentController;

import edu.mum.registar.domain.Credential;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class LogInController {

    @GetMapping(value = "/login")
    public String login(@ModelAttribute("credentials") Credential credential){
        return "student/login";
    }

    @PostMapping(value = "/login")
    public String verify(@Valid @ModelAttribute("credentials") Credential credential, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            return "student/login";
        }

        redirectAttributes.addFlashAttribute(credential);

        return "redirect:/";
    }

}
