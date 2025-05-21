package br.com.gvrer.categoriaitem.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.gvrer.categoriaitem.model.CategoriaItem;
import br.com.gvrer.itemrestaurante.model.Itemrestaurante;
import br.com.gvrer.itemrestaurante.repository.ItemrestauranteRepository;

@Controller
public class CategoriaItemController {
	@GetMapping("/categoriaitem/cadastrar")
	public String cadastrar(Model model) {		
		model.addAttribute("categoriaItem", new CategoriaItem());
		return "/cardapio/categoriaitem.html";
	}
	
	@PostMapping("/categoriaitem/salvar")
	public String salvar(@ModelAttribute CategoriaItem categoriaItem, Model model) throws SQLException {		
		System.out.println("\n");
		System.out.println("Nome do Item: "+categoriaItem.getNomecategoriaitem());

				System.out.println("\n");
				
		//var irs = new ItemrestauranteRepository();
		//irs.criar(itemrestaurante);
		return "/cardapio/menu.html";
	}
	
	
}
