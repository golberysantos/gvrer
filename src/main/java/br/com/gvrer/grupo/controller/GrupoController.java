package br.com.gvrer.grupo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GrupoController {
	@GetMapping("/grupo/cadastrar")
	public String grupo(Model model) {
		System.out.println("olá ");
		//model.addAttribute("grupo", new Grupo());
		return "/grupo/cadastrarGrupo.html";

	}
}
