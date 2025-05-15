package br.com.gvrer.juridica.controller;

import java.sql.SQLException;

import org.hibernate.internal.build.AllowSysOut;
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
	public String salvar(@ModelAttribute Juridica juridica, Model model) throws Exception {
		System.out.println("Nome do Responsável: "+juridica.getRepresentante());		
		System.out.println("Razão Social: "+juridica.getRazaosocial());
		System.out.println("Nome Fantasia: "+juridica.getNomefantasia());
		System.out.println("CNPJ: "+juridica.getCnpj());
		
		var pdto = new JuridicaRepository();
		
		try {
			pdto.cadastrar(juridica);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "home/home.html";
		
	}
}