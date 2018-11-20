package edu.mum.registar.controller.courseController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.mum.registar.domain.Course;
import edu.mum.registar.service.courseService.CourseService;

@Controller
public class CourseController {
	@Autowired 
	CourseService courseservice;
	
@GetMapping(value="/courseList")
public String course()
{

return "course/courseList";

}

@GetMapping(value="/showFormForAdd")
public String showForm(@ModelAttribute("Course") Course course,Model model)
{
model.addAttribute(course);
return "course/courseForm";

}

@PostMapping (value="/saveCourse")
public String saveCourse(@ModelAttribute("Course") Course course, RedirectAttributes redirect,Model model)
{
	courseservice.save(course);
	redirect.addFlashAttribute("course",course);
	System.out.println("saved");
	
	return "redirect:courseList";
	}




}
