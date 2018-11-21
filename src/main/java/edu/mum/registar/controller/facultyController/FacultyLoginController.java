package edu.mum.registar.controller.facultyController;

import edu.mum.registar.domain.Credential;
import edu.mum.registar.domain.Student;
import edu.mum.registar.service.facultyService.FacultyService;
import edu.mum.registar.service.studentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/faculty")
public class FacultyLoginController {

    @Autowired
    StudentService studentService;

    @Autowired
    FacultyService facultyService;

    @GetMapping(value = "/login")
    public String login(@ModelAttribute("credentials") Credential credential) {
        return "faculty/login";
    }

    @PostMapping(value = "/login")
    public String verifyCredentials(@Valid @ModelAttribute("credentials") Credential credential, BindingResult br, Model model, RedirectAttributes redirectAttributes) {
        if (br.hasErrors()) {
            return "faculty/login";
        }

        String email = credential.getUserName();

        String faculty_id = facultyService.findFacultyByEmail(email).getId().toString();

        redirectAttributes.addFlashAttribute("students", studentService.findAllStudentByFacultyId(faculty_id));
        return "redirect:/faculty/facultyHome";

    }

    @GetMapping("/findStudentById/{id}")
    public String findStudentById(@PathVariable long id, Model model) {
        Student student = studentService.findStudentById(id);
        model.addAttribute("student", student);
        return "";

    }


}
