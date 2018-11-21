package edu.mum.registar.controller.studentController;

import edu.mum.registar.domain.Semester;
import edu.mum.registar.service.semesterService.SemesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class CourseSelectionController {

    @Autowired
    SemesterService semesterService;

    @GetMapping("/courses")
    public List<Semester> getBlocks() {
        return semesterService.getSemesters();
    }
}
