package edu.mum.registar.controller.studentController;

import edu.mum.registar.domain.Block;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class CourseSelectionController {

    @GetMapping("/courses")
    public List<Block> getBlocks(){
        return new ArrayList<>();
    }
}
