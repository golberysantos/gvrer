package br.com.gvrer.segmento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SegmentoController {

	@GetMapping("/segmento/cadastrar")
	public String cadastrar(Model model) {
		System.out.println("olá ");
		// model.addAttribute("usuario", new Usuario());
		return "/segmento/segmento.html";
	}
}
