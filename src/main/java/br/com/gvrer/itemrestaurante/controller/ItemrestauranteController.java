package br.com.gvrer.itemrestaurante.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.gvrer.itemrestaurante.model.Itemrestaurante;

@Controller
public class ItemrestauranteController {
	@GetMapping("/itemrestaurante/cadastrar")
	public String cadastrar(Model model) {
		System.out.println("/cardapio/itemrestaurante.html ");
		model.addAttribute("itemrestaurante", new Itemrestaurante());
		return "/cardapio/itemrestaurante.html";
	}
	
	@PostMapping("/itemrestaurante/salvar")
	public String salvar(@ModelAttribute Itemrestaurante itemrestaurante, Model model) {		
		System.out.println("Nome do Item: "+itemrestaurante.getNomeitem());
				
		return "/cardapio/menu.html";
	}
	
	
}
