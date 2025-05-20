package br.com.gvrer.endereco.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.gvrer.endereco.model.Endereco;
import br.com.gvrer.endereco.repository.EnderecoRepository;

@Controller
public class EnderecoController {

    // Exibe o formulário
    @GetMapping("/endereco/cadastrar")
    public String cadastrar(Model model) {
        model.addAttribute("endereco", new Endereco());
        return "endereco/endereco.html"; // ou "endereco/endereco" se estiver usando Thymeleaf
       	
    }

    // Recebe os dados do formulário via POST
    @PostMapping("/endereco/salvar")
    public String salvar(@ModelAttribute Endereco endereco, Model model) throws SQLException {
        // Aqui você pode salvar no banco de dados, se tiver um repository
    	System.out.println("Endereço recebido: " + endereco.getComplemento());
        System.out.println("Endereço recebido: " + endereco.getReferencia());

        
        var endr = new EnderecoRepository();
        endr.criar(endereco);
        return "home/home.html";
		
        
    }
}
