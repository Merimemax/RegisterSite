package edu.mum.registar.controller.studentController;

import edu.mum.registar.service.courseService.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/student")
public class StudentHomeController {

    CourseService courseService;
    @GetMapping()
    public String studentHome(){
        return "student/studentHome";
    }
}
