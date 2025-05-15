package br.com.gvrer.principal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PrincipalController {
	@GetMapping({"/principal"})
	public String principal(Model model) {
		System.out.println("olá ");
		return "/principal/principal.html";	
	}
	
}
