package edu.mum.registar.controller.adminController;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.mum.registar.domain.Block;
import edu.mum.registar.domain.Course;
import edu.mum.registar.domain.Faculty;
import edu.mum.registar.domain.Section;
import edu.mum.registar.domain.Semester;
import edu.mum.registar.domain.Student;
import edu.mum.registar.service.blockService.BlockService;
import edu.mum.registar.service.courseService.CourseService;
import edu.mum.registar.service.facultyService.FacultyService;
import edu.mum.registar.service.sectionService.SectionService;
import edu.mum.registar.service.semesterService.SemesterService;
import edu.mum.registar.service.studentService.StudentService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private SemesterService semesterService;
	@Autowired
	private BlockService blockService;
	@Autowired
	private SectionService sectionService;
	@Autowired
	private CourseService courseService;
	@Autowired
	private FacultyService facultyService;
	
	@GetMapping("/block")
	public String displaySection(Model model) {
		List<Semester> sems=semesterService.getSemesters();
	
		model.addAttribute("semesters", sems);
		return "/admin/blocks";
	}
	
	@GetMapping("/getBlocks/{semid}")
	public @ResponseBody List<Block> getBlocks(@PathVariable("semid") long id) {
		Semester semester=semesterService.getOne(id);
		System.out.println("semstername" + semester.getSemesterName());
		return semester.getBlockList();
		
	}
	
	@GetMapping("/section")
	public String getSections(@RequestParam("blockid") long id,Model model) {
		Block block=blockService.getOne(id);
		List<Section> sections=block.getSections();
		model.addAttribute("sections",sections );
		model.addAttribute("blockid",id);
		return "/admin/sections";
		
	}
	
	@GetMapping("/section/{sectionid}")
	public String getSectionStudents(@PathVariable("sectionid") long id,Model model) {
		Section section=sectionService.getOne(id);
		List<Student> students=section.getStudents();
		System.out.println(students.size());
		model.addAttribute("students",students );
		return "/admin/students";
		
	}
	@GetMapping("/section/add/{blockid}")
	public String addSectionToBlock(@ModelAttribute("newSection") Section section,@PathVariable("blockid") long id,Model model) {
		model.addAttribute("blockid",id);
		model.addAttribute("courses", courseService.getcourses());
		model.addAttribute("professors", facultyService.findAllfaculty());
		return "/admin/addSection";
		
	}
	
	@PostMapping("/section/add/{blockid}")
	public String saveSectionToBlock(@Valid @ModelAttribute("newSection") Section section,BindingResult result,
			@PathVariable("blockid") long id,Model model,RedirectAttributes redirectAttribute) {
		if(result.hasErrors()) {
			model.addAttribute("blockid",id);
			model.addAttribute("courses", courseService.getcourses());
			model.addAttribute("professors", facultyService.findAllfaculty());
			return "/admin/addSection";
		}
		Block block=blockService.getOne(id);
		
		Course course=courseService.getcoursesbyID(section.getCourse().getId());
		Faculty faculty=facultyService.findById(section.getProffessor().getId());
		
		section.setCourse(course);
		section.setProffessor(faculty);
		sectionService.save(section);
		block.addSection(section);
		blockService.save(block);

		redirectAttribute.addAttribute("blockid",id);

		return "redirect:/admin/section";
		
	}
	
	
	@GetMapping("/section/edit/{blockid}")
	public String editSection(@ModelAttribute("newSection") Section section,@PathVariable("blockid") long blockid,
			@RequestParam("sectionid") long id,Model model) {
		Section sec=sectionService.getOne(id);
		model.addAttribute("sec", sec);
		model.addAttribute("blockid",blockid);
		model.addAttribute("courses", courseService.getcourses());
		model.addAttribute("professors", facultyService.findAllfaculty());
		return "/admin/editSection";
		
	}
	
	
}