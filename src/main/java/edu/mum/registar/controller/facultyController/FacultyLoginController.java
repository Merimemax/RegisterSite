package edu.mum.registar.controller.facultyController;

import edu.mum.registar.domain.Credential;
import edu.mum.registar.domain.Faculty;
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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/faculty")
@SessionAttributes("students")
public class FacultyLoginController {

    @Autowired
    StudentService studentService;

    @Autowired
    FacultyService facultyService;

    @GetMapping(value = "/")
    public String login(@ModelAttribute("credentials") Credential credential) {
        return "faculty/login";
    }

    @PostMapping(value = "/")
    public String verifyCredentials(@Valid @ModelAttribute("credentials") Credential credential, BindingResult br, Model model, RedirectAttributes redirectAttributes) {
        if (br.hasErrors()) {
            return "faculty/login";
        }

        String email = credential.getUserName();
//        Faculty faculty = facultyService.findFacultyByEmail(email);

//        System.out.println("faculty id is " + faculty.getFirstName());
//        redirectAttributes.addFlashAttribute("students", studentService.findAllStudentByFacultyId());

        //        redirectAttributes.addFlashAttribute("students", FacultyLoginController.getStudents());
//        model.addAttribute("students", FacultyLoginController.getStudents() );
        return "redirect:/faculty/home";

    }

//    @GetMapping("/findStudentById/{id}")
//    public String findStudentById(@PathVariable long id, Model model) {
//        Student student = studentService.findStudentById(id);
//        model.addAttribute("student", student);
//        return "";
//
//    }

    public static List<Student> getStudents() {
        List<Student> studentList = new ArrayList<>();

        Student merih = new Student();
        merih.setId(Long.valueOf(1));
        merih.setFirstName("melat");
        merih.setLastName("hadgu");
        merih.setEntryDate(LocalDate.of(2015, 12, 31));
        merih.setRegistrationNumber(1234);


        Student melat = new Student();
        melat.setId(Long.valueOf(2));
        melat.setFirstName("melat");
        melat.setLastName("hadgu");
        melat.setEntryDate(LocalDate.of(2015, 12, 31));
        melat.setRegistrationNumber(1234);


        studentList.add(merih);
        studentList.add(melat);
        return studentList;

    }


}
