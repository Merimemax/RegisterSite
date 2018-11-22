package edu.mum.registar.controller.courseController;

import java.util.List; 
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import edu.mum.registar.domain.Course;
import edu.mum.registar.service.courseService.CourseService;

@Controller
public class CourseController {
	@Autowired 
	CourseService courseservice;
	
	
	@ModelAttribute("courses")
	List<Course> addcourseList(Model model) {
		
	 return courseservice.getcourses();
	}

	@GetMapping(value="/courseList")
	public String course(Model model)
		{
	model.addAttribute("courses", courseservice.getcourses());
	return "course/courses";
		}

@GetMapping(value="/showFormForAdd")
public String showForm(@ModelAttribute("Course") Course course,Model model) 
{
	List <Course>courses=courseservice.getcourses();
	
	
model.addAttribute("courses",courses);
return "course/addCourse";

}

@PostMapping (value="/saveCourse")
public String saveCourse(@Valid @ModelAttribute("Course") Course course, BindingResult bindingResult, RedirectAttributes redirect,Model model)
{
	
	
	if (bindingResult.getErrorCount()==0 ||(bindingResult.getErrorCount()==1 && course.getId()!=0 && bindingResult.getFieldError().getField().equalsIgnoreCase("courseCode"))) {
		
		Course prerequisite=courseservice.getcoursesbyID(course.getPrerequiste().getId());
		System.out.print("hi"+ course.getId());
		course.setPrerequiste(prerequisite);
		
		courseservice.save(course);
		redirect.addFlashAttribute("courses",courseservice.getcourses());
		System.out.println("saved");
		
		return "redirect:courseList";
		
	}
	
	return "course/addCourse";
	}

@GetMapping(value="/showFormForUpdate")
public String updateform(@ModelAttribute("Course") Course cours,@RequestParam("id") long id ,Model model)throws NoCoursesFoundException
{
	 Course course=courseservice.getcoursesbyID(id);
	System.out.println(course);
	if (course==null) {
		throw new NoCoursesFoundException(" we can not find the course you are trying to edit ");
		}
	model.addAttribute("course",course);
	return "course/editCourse";
	}

@GetMapping(value="/delete")
public String delete(@RequestParam("id")long id,Model model)

{
	courseservice.deletecourse(id);
	return "redirect:/courseList";
}
@ExceptionHandler(NoCoursesFoundException.class)
public ModelAndView handleError(HttpServletRequest req,NoCoursesFoundException exception) {
ModelAndView mav = new ModelAndView();
mav.addObject("msg", exception.getMessage());

mav.addObject("url", req.getRequestURL());
mav.setViewName("course/NocourseFound");
return mav;
}


@PostMapping("/search")
public String searchCustomers(@RequestParam("theSearchName") String theSearchName,Model theModel) 

{
Course course = courseservice.geyCourseByCourseCode(theSearchName);
			System.out.println("hi");	
	if (course==null) {
		throw new NoCoursesFoundException(" You have provided aninvalid input to be searched ");
		}
	theModel.addAttribute("editcourses", course);

	return "course/courses";	
	
}
}
