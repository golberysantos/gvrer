package br.com.gvrer.tipopermissaodogrupo.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.gvrer.itemrestaurante.model.Itemrestaurante;
import br.com.gvrer.itemrestaurante.repository.ItemrestauranteRepository;
import br.com.gvrer.tipopermissaodogrupo.model.TipoPermissaoDoGrupo;

@Controller
public class TipoPermissaoDoGrupoController {
	@GetMapping("/tipopermissaodogrupo/cadastrar")
	public String cadastrar(Model model) {
	    model.addAttribute("tipopermissaodogrupo", new TipoPermissaoDoGrupo());
	    return "/grupo/telaconfiguracaodogrupo.html";
	}
	@PostMapping("/tipopermissaodogrupo/salvar")
	public String salvar(@ModelAttribute Itemrestaurante itemrestaurante, Model model) throws SQLException {		
		System.out.println("\n");
		System.out.println("Nome do Item: "+itemrestaurante.getNomeitem());
		System.out.println("Ingredientes: "+itemrestaurante.getIngredientes());
		System.out.println("Especialidade: "+itemrestaurante.getEspecialidadedoitem_nomeespecialidadedoitem());
		System.out.println("Origem: "+itemrestaurante.getOrigemitemrestaurante_origemrestauranteid());
		System.out.println("Descrição: "+itemrestaurante.getDescricao());
		System.out.println("Valor: "+itemrestaurante.getValor());
				System.out.println("\n");
				
		var irs = new ItemrestauranteRepository();
		irs.criar(itemrestaurante);
		return "/cardapio/menu.html";
	}
	
	
}
