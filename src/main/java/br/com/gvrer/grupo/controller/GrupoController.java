package br.com.gvrer.grupo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.gvrer.grupo.model.Grupo;
import br.com.gvrer.itemrestaurante.model.Itemrestaurante;

@Controller
public class GrupoController {
	@GetMapping("/grupo/cadastrar")
	public String cadastrar(Model model) {
		System.out.println("olá ");
		model.addAttribute("grupo", new Grupo());
		return "grupo/cadastrarGrupo.html";

	}
	
	@PostMapping("/grupo/salvar")
	public String salvar(@ModelAttribute Grupo grupo, Model model) {
		//model.addAttribute("grupo", grupo);
		System.out.println("Nome do Grupo: "+grupo.getNomegrupo());
		if (grupo.getNomegrupo() ==  "") {
			System.out.println("Está nulo");
		} else {
			System.out.println("Não está nulo");
		}
		//model.addAttribute("grupo", new Grupo());
		return "grupo/listagemdegrupos.html";

	}
}
