package edu.mum.registar.controller.studentController;

import edu.mum.registar.domain.Course;
import edu.mum.registar.service.blockService.BlockService;
import edu.mum.registar.service.courseService.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/student")
public class StudentHomeController {

    @Autowired
    CourseService courseService;
    @GetMapping()
    public String studentHome(Model model){

        List<Course> courseList = new ArrayList<>();
        model.addAttribute("course", courseService.getcourses());

        return "student/studentHome";
    }
}
