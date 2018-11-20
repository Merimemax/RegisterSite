package edu.mum.registar.controller.courseController;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import edu.mum.registar.domain.Course;
import edu.mum.registar.service.courseService.CourseService;

@Controller
public class CourseController {
	@Autowired 
	CourseService courseservice;
	
@GetMapping(value="/courseList")
public String course(Model model)
{
	List <Course>courses=courseservice.getcourses();
	model.addAttribute("courses",courses);

	return "course/courseList";

}

@GetMapping(value="/showFormForAdd")
public String showForm(@ModelAttribute("Course") Course course,Model model)
{
model.addAttribute(course);
return "course/courseForm";

}

@PostMapping (value="/saveCourse")
public String saveCourse(@Valid @ModelAttribute("Course") Course course, BindingResult result, RedirectAttributes redirect,Model model)
{
	if (result!=null)
	{
		return "course/courseForm";
	}
	courseservice.save(course);
	redirect.addFlashAttribute("courses",course);
	System.out.println("saved");
	
	return "redirect:courseList";
	}

@GetMapping(value="/showFormForUpdate")
public String updateform(@ModelAttribute("Course") Course cours,@RequestParam("id") long id ,Model model)
{
	Course course=courseservice.getcoursesbyID(id);
	model.addAttribute("course",course);
	return "course/courseupdate";
	}

@GetMapping(value="/delete")
public String delete(@RequestParam("id")long id,Model model)

{
	courseservice.deletecourse(id);
	return "redirect:/courseList";
}

}
