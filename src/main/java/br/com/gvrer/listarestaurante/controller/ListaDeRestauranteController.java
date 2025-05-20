package br.com.gvrer.listarestaurante.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListaDeRestauranteController {

	@GetMapping("/listaderestaurante")
	public String cadastrar(Model model) {
		System.out.println("olá ");
		// model.addAttribute("usuario", new Usuario());
		return "/reserva/listaderestaurante.html";
	}
	
}