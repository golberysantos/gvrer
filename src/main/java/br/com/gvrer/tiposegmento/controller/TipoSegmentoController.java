package br.com.gvrer.tiposegmento.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.gvrer.itemrestaurante.model.Itemrestaurante;
import br.com.gvrer.itemrestaurante.repository.ItemrestauranteRepository;
import br.com.gvrer.tiposegmento.model.TipoSegmento;

@Controller
public class TipoSegmentoController {

	@GetMapping("/tiposegmento/cadastrar")
	public String cadastrar(Model model) {
		System.out.println("olá ");
		// model.addAttribute("usuario", new Usuario());
		return "/tiposegmento/tiposegmento.html";
	}
	
	@PostMapping("/tiposegmento/cadastrar")
	public String salvar(@ModelAttribute TipoSegmento tiposegmento, Model model) throws SQLException {		
		System.out.println("\n");
		
		return "/tiposegmento/tiposegmento.htmll";
}
}