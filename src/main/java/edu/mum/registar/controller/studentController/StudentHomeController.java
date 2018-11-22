package edu.mum.registar.controller.studentController;

import edu.mum.registar.service.blockService.BlockService;
import edu.mum.registar.service.courseService.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/student")
public class StudentHomeController {

    @GetMapping()
    public String studentHome(Model model){

        return "student/studentHome";
    }
}
