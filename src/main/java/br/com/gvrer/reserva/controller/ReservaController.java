package br.com.gvrer.reserva.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.gvrer.reserva.model.Reserva;
import br.com.gvrer.reserva.repository.ReservaRepository;


@Controller
public class ReservaController {
	@GetMapping("/reserva/cadastrar")
	public String cadastrar(Model model) {
		System.out.println("/reserva/reserva.html ");
		model.addAttribute("reserva", new Reserva());
		return "/reserva/reserva.html";
	}
	
	@PostMapping("/reserva/salvar")
	public String salvar(@ModelAttribute Reserva reserva, Model model) throws SQLException {		
		System.out.println("\n");
		System.out.println("Nome do Item: "+itemrestaurante.getNomeitem());
		System.out.println("Ingredientes: "+itemrestaurante.getIngredientes());
		System.out.println("Especialidade: "+itemrestaurante.getEspecialidadedoitem_nomeespecialidadedoitem());
		System.out.println("Origem: "+itemrestaurante.getOrigemitemrestaurante_origemrestauranteid());
		System.out.println("Descrição: "+itemrestaurante.getDescricao());
		System.out.println("Valor: "+itemrestaurante.getValor());
				System.out.println("\n");
				
		var irs = new ReservaRepository();
		irs.criar(reserva);
		return "/cardapio/menu.html";
	}
	
	
}
