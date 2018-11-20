package edu.mum.registar.controller.adminController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/admin")
	public String displayHome() {
		
		return "/admin/layout";
	}

}
