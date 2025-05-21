package br.com.gvrer.tabreservarestaurante.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TabreservarestauranteController {
	@GetMapping({"/tabreservarestaurante"})
	public String tabreservarestaurante(Model model) {
		System.out.println("olá ");
		return "/principal/tabreservarestaurante.html";	
	}
	
}
