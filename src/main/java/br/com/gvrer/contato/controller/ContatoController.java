package br.com.gvrer.contato.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.gvrer.contato.model.Contato;
import br.com.gvrer.contato.repository.ContatoRepository;


public class ContatoController {
	@GetMapping("/contato/cadastrar")
	public String cadastrar(Model model) {

		model.addAttribute("contato", new Contato());
		return "/juridica/cadastroContato.html";
	}
	
	@PostMapping("/contato/salvar")
	public String salvar(@ModelAttribute Contato contato, Model model) throws Exception {		
		System.out.println("\n");
		System.out.println("Contato: "+contato.getContato());
				System.out.println("\n");
				
		var irs = new ContatoRepository();
		irs.criar(contato);
		return "/home/home.html";
		
	}
	
		
}
