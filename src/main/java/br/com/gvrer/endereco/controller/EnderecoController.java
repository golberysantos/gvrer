package br.com.gvrer.endereco.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.gvrer.endereco.model.Endereco;
import br.com.gvrer.itemrestaurante.model.Itemrestaurante;
import br.com.gvrer.itemrestaurante.repository.ItemrestauranteRepository;

@Controller
public class EnderecoController {
	@GetMapping("/endereco/cadastrar")
	public String cadastrar(Model model) {
		System.out.println("/endereco/endereco.html");
		model.addAttribute("endereco", new Endereco());
		return "/endereco/endereco.html";
	}

	}
	
	

