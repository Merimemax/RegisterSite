package edu.mum.registar.controller.facultyController;

import edu.mum.registar.domain.Credential;
import edu.mum.registar.domain.Faculty;
import edu.mum.registar.service.facultyService.FacultyService;
import edu.mum.registar.service.studentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    StudentService studentService;

    @Autowired
    FacultyService facultyService;

    @GetMapping()
    public String login(@ModelAttribute("credentials") Credential credential) {
        return "faculty/login";
    }

    @PostMapping()
    public String verifyCredentials(@Valid @ModelAttribute("credentials") Credential credential, BindingResult br, RedirectAttributes redirectAttributes) {
        if (br.hasErrors()) {
            return "faculty/login";
        }

        String email = credential.getUserName();

        String faculty_id =  facultyService.findFacultyByEmail(email).getId().toString();

        redirectAttributes.addFlashAttribute("students", studentService.findAllStudentByFacultyId(faculty_id));
        return "redirect:/faculty/facultyHome";
    }


}
