package br.com.gvrer.itinerario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.gvrer.itinerario.model.Itinerario;

@Controller
public class ItinerarioController {	

		@GetMapping("/itinerario/cadastrar")
		public String cadastrar(Model model) {
			
			model.addAttribute("itinerario", new Itinerario());
			return "/itinerario/listaItinerario.html";	
		}
		
		@PostMapping("/itinerario/salvar")
		public String salvar( @ModelAttribute Itinerario itinerario,   Model model) {
		
			System.out.println("DADOS: "+ itinerario.getNomeitinerario());
			
			return "/itinerario/itinerario.html";	
		}
	
}
