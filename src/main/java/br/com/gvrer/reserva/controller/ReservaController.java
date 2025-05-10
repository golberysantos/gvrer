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
		System.out.println("Data: "+reserva.getDatareserva());
		System.out.println("Horário da reserva: "+reserva.getHorarioreserva());
		System.out.println("Mesa: "+reserva.getMesa_mesaid());
				System.out.println("\n");

		return "/cardapio/menu.html";
	}
	
	
}
