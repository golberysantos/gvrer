package br.com.gvrer.listarestaurante.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TipoSegmentoController {

	@GetMapping("/tiposegmento/cadastrar")
	public String cadastrar(Model model) {
		System.out.println("olá ");
		// model.addAttribute("usuario", new Usuario());
		return "/reserva/escolherculinaria.html";
	}
	
}