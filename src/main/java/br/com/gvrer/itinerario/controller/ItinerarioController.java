package br.com.gvrer.itinerario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.gvrer.usuario.model.Usuario;

@Controller
public class ItinerarioController {

	@GetMapping("/itinerario/lista")
	public String itinerario(Model model) {
		System.out.println("olá ");
		//model.addAttribute("itinerario", new Itinerario());
		return "/itinerario/listaItinerario.html";

	}
	

}
