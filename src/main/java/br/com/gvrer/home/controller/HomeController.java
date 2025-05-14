package br.com.gvrer.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping({"/home","/"})
	public String home(Model model) {		
		//model.addAttribute("usuario", new Usuario());
		return "/home/home.html";	
	}
	
}
