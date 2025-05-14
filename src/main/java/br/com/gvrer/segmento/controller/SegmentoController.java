package br.com.gvrer.segmento.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.gvrer.segmento.model.Segmento;
import br.com.gvrer.tiposegmento.model.TipoSegmento;

@Controller
public class SegmentoController {

	@GetMapping("/segmento/cadastrar")
	public String cadastrar(Model model) {
		System.out.println("olá ");
		// model.addAttribute("usuario", new Usuario());
		return "/segmento/segmento.html";
	}

	@PostMapping("/tiposegmento/cadastrar")
	public String salvar(@ModelAttribute Segmento segmento, Model model) throws SQLException {		
		System.out.println("\n");
		
		return "/segmento/segmento.htmll";
}
}
