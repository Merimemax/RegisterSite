package edu.mum.registar.controller.adminController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.mum.registar.domain.Block;
import edu.mum.registar.domain.Semester;
import edu.mum.registar.service.semesterService.SemesterService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private SemesterService semesterService;
	
	@GetMapping("/section")
	public String displaySection(Model model) {
		List<Semester> sems=semesterService.getSemesters();
	
		model.addAttribute("semesters", sems);
		return "/admin/blocks";
	}
	
	@GetMapping("/getBlocks/{semid}")
	public @ResponseBody List<Block> getBlocks(@PathVariable("semid") long id) {
		Semester semester=semesterService.getOne(id);
		return semester.getBlockList();
		
	}
	
}
