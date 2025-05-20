package br.com.gvrer.usuario.controller;

import java.sql.SQLException;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gvrer.usuario.model.Usuario;
import br.com.gvrer.usuario.repository.UsuarioRepository;
import br.com.gvrer.usuario.service.LoginDTO;

@RestController
@RequestMapping("/auth")
public class LoginController {

    

	@PostMapping("/usuario/login")
	public String login(@ModelAttribute LoginDTO loginDTO, Model model) {
	    UsuarioRepository usuarioRepository = new UsuarioRepository();
	    try {
	        Usuario usuario = usuarioRepository.findByNickname(loginDTO.getNickname());

	        if (usuario == null) {
	            model.addAttribute("erro", "Usuário não encontrado");
	            System.out.println("\n USUÁRIO NÃO LOCALIZADO. \n");
	            return "/usuario/login.html";
	        }

	        if (!usuario.getSenha().equals(loginDTO.getSenha())) {
	        	System.out.println("\n USUÁRIO OU SENHA NÃO EXISTE. \n");
	            model.addAttribute("erro", "Senha incorreta");
	            return "/usuario/login.html";
	        }

	        model.addAttribute("usuarioLogado", usuario.getNickname());
	        return "/principal/principal.html";

	    } catch (SQLException e) {
	        System.out.println("ERRO: "+e);
	        model.addAttribute("erro", "Erro interno no servidor");
	        return "/usuario/login.html";
	    }
	}}