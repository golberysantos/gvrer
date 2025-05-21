package br.com.gvrer.grupo.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.gvrer.grupo.model.Grupo;
import br.com.gvrer.grupo.repository.GrupoRepository;

@Controller
public class GrupoController {
	@GetMapping("/grupo/cadastrar")
	public String cadastrar(Model model) {
		System.out.println("olá ");
		model.addAttribute("grupo", new Grupo());
		return "grupo/cadastrarGrupo.html";

	}
	
	@PostMapping("/grupo/salvar")
	public String salvar(@ModelAttribute Grupo grupo, Model model) throws SQLException {		
		System.out.println("\n");
		System.out.println("Nome do Grupo: "+grupo.getNomegrupo());
		System.out.println("Orçamento Total: "+grupo.getOrcamanetototal());
		System.out.println("Descrição do Grupo: "+grupo.getDescricao());
				System.out.println("\n");
				
		var gvs = new GrupoRepository();
		gvs.criar(grupo);
		return "/grupo/listagemdegrupos.html";
	}
}
