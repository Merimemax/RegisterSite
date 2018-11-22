package edu.mum.registar.controller.studentController;

import edu.mum.registar.domain.Semester;
import edu.mum.registar.service.semesterService.SemesterService;
import edu.mum.registar.service.studentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/student")
@Controller
public class CourseSelectionController {

    @Autowired
    SemesterService semesterService;

    @Autowired
    StudentService studentService;

    @GetMapping("/courses")
    public @ResponseBody
    List<Semester> getBlocks() {
        return semesterService.getSemesters();
    }


    @GetMapping("/selectCourse")
    public String selectCourse(Model model) {
        List<Semester> semesterList = semesterService.getSemesters();

        semesterList.forEach(s -> System.out.println(s.getBlockList()));
        model.addAttribute("semester", semesterService.getSemesters());
        return "student/courseOption";
    }

}
