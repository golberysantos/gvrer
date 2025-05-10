package br.com.gvrer.juridica.controller;

import java.sql.SQLException;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.gvrer.juridica.model.Juridica;
import br.com.gvrer.pessoa.repository.PessoaRepository;
import br.com.gvrer.pessoa.service.PessoaDTO;

@Controller
public class JuridicaController {
	
	@GetMapping("/juridica/cadastrar")
	public String cadastrar(Model model) {
		model.addAttribute("pessoaDTO", new PessoaDTO());
		return "juridica/dadosjuridica.html";
	}
	
	@PostMapping("/juridica/salvar")
	public String salvar(@ModelAttribute PessoaDTO pessoaDTO, Model model) {
		System.out.println("Nome do Responsável: "+pessoaDTO.getRepresentante());		
		System.out.println("Razão Social: "+pessoaDTO.getRazaosocial());
		System.out.println("Nome Fantasia: "+pessoaDTO.getNomefantasia());
		System.out.println("CNPJ: "+pessoaDTO.getCnpj());
		
		var pdto = new PessoaRepository();
		
		try {
			pdto.criar(pessoaDTO);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "home/home.html";
	}
}