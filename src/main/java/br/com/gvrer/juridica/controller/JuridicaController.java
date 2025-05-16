package br.com.gvrer.juridica.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.gvrer.juridica.model.Juridica;
import br.com.gvrer.juridica.repository.JuridicaRepository;
import br.com.gvrer.juridica.service.JuridicaDTO;

@Controller
public class JuridicaController {
	
	@GetMapping("/juridica/cadastrar")
	public String cadastrar(Model model) {
		model.addAttribute("juridicaDTO", new Juridica());
		return "juridica/dadosjuridica.html";
	}
	
	@PostMapping("/juridica/salvar")
	public String salvar(@ModelAttribute JuridicaDTO juridicaDTO, Model model) throws Exception {
		System.out.println("Nome do Responsável: "+juridicaDTO.getRepresentante());		
		System.out.println("Razão Social: "+juridicaDTO.getRazaosocial());
		System.out.println("Nome Fantasia: "+juridicaDTO.getNomefantasia());
		System.out.println("CNPJ: "+juridicaDTO.getCnpj());

		var pdto = new JuridicaRepository();
		
		try {
			pdto.cadastrar(juridicaDTO);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "home/home.html";
		
	}
}