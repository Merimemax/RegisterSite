package edu.mum.registar.controller.studentController;

import edu.mum.registar.domain.Credential;
import edu.mum.registar.domain.Role;
import edu.mum.registar.domain.Semester;
import edu.mum.registar.domain.Student;
import edu.mum.registar.service.credentialService.CredentialService;
import edu.mum.registar.service.semesterService.SemesterService;
import edu.mum.registar.service.studentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
//@SessionAttributes("student")
public class HomeController {

    @Autowired
    StudentService studentService;

    @Autowired
    CredentialService credentialService;

    @Autowired
    SemesterService semesterService;

    @GetMapping(value = "/")
    public String studentHome() {
        return "student/index";
    }

    @GetMapping(value = "/signup")
    public String studentSignUp(@ModelAttribute("student") Student student, Model model) {
        model.addAttribute("semester", semesterService.getSemesters());
        return "student/singup";
    }

    @PostMapping(value = "/singup")
    public String registerStudent(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult, HttpServletRequest request,Model model, RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            return "student/singup";
        }

        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(request.getParameter("password"));
        Credential credential = new Credential();
        credential.setRole(Role.Student);
        credential.setUserName(student.getEmail());
        credential.setPassword(hashedPassword);

//        String[] lists = request.getParameterValues("semesterList");
//        List<Semester> semesterList = new ArrayList<>();
//        for (String s : lists) {
//            System.out.println("semester selected by the student " + s);
//            semesterList.add(semesterService.getOne(Long.parseLong(s)));
//        }
//        student.setSemesterList(semesterList);
//        System.out.println("chekcing drop down is saving " + student.getSemesterList().get(0).getSemesterName());
        credentialService.saveCredential(credential);
        studentService.save(student);

        redirectAttributes.addFlashAttribute("student", student);
//        model.addAttribute("student", student);

        return "redirect:/home";
    }

    @GetMapping(value = "/home")
    public String successfullySaved() {
        System.out.println("after saving called redirected method!");
        System.out.println("home is called");
        return "student/studentHome";
    }
}
