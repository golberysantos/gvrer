package br.com.gvrer.endereco.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.gvrer.endereco.dto.EnderecoDTO;
import br.com.gvrer.endereco.model.Endereco;
import br.com.gvrer.endereco.repository.EnderecoRepository;

@Controller
public class EnderecoController {

    // Exibe o formulário
    @GetMapping("/endereco/cadastrar")
    public String cadastrar(Model model) {
        model.addAttribute("enderecodto", new EnderecoDTO());
        return "endereco/endereco.html"; // ou "endereco/endereco" se estiver usando Thymeleaf
       	
    }

    // Recebe os dados do formulário via POST
    @PostMapping("/endereco/salvar")
    public String salvar(@ModelAttribute EnderecoDTO enderecodto, Model model) throws SQLException {
        // Aqui você pode salvar no banco de dados, se tiver um repository
    	System.out.println("Endereço recebido: " + enderecodto.getNomepais());
    	System.out.println("Endereço recebido: " + enderecodto.getNomeestado());
    	System.out.println("Endereço recebido: " + enderecodto.getNomecidade());
    	System.out.println("Endereço recebido: " + enderecodto.getNomebairro());
    	System.out.println("Endereço recebido: " + enderecodto.getCep());
    	System.out.println("Endereço recebido: " + enderecodto.getComplemento());
        System.out.println("Endereço recebido: " + enderecodto.getReferencia());

        
        var endr = new EnderecoRepository();
        endr.criar(enderecodto);
        return "home/home.html";
		
        
    }
}
