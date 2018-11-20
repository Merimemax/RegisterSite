package edu.mum.registar.controller.adminController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/admin")
public class HomeController {
	@GetMapping
	public String displayHome() {
		
		return "/admin/layout";
	}
	
	@GetMapping("/admin/section")
	public String displaySection() {
		
		return "/admin/section";
	}
	
	
}
