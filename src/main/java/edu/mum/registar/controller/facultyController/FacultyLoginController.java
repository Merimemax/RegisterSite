package edu.mum.registar.controller.facultyController;

import edu.mum.registar.domain.Credential;
import edu.mum.registar.domain.Faculty;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/faculty")
public class FacultyLoginController {

    @GetMapping()
    public String login(@ModelAttribute ("credentials")Credential credential){
        return "faculty/login";
    }

    @PostMapping()
    public String submitLogInForm(@Valid @ModelAttribute ("credentials") Credential credential,BindingResult br, RedirectAttributes redirectAttributes) {
       if (br.hasErrors()) {
           return "faculty/login";
      }

       String email=credential.getUserName();
       String Password=credential.getPassword();
        redirectAttributes.addFlashAttribute(credential);
        return "redirect:/faculty/facultyHome";
    }
    @GetMapping("/facultyHome")
    public String success(){
        return"faculty/home";
    }

}
